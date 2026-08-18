package org.telegram.ui.iv;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichDocumentCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost, DownloadController.FileDownloadProgressListener {
    private boolean attached;
    private boolean blockRtl;
    private TLRPC.Document boundDocument;
    private final int buttonSize;
    private int buttonState;
    private int buttonX;
    private final int buttonY;
    private final RichCaptionController caption;
    private final int currentAccount;
    private Delegate delegate;
    private boolean hasPreview;
    private int mediaX;
    private MessageObject messageObject;
    private final int observerTag;
    private boolean pressed;
    private final Paint previewBackgroundPaint;
    private final ImageReceiver previewImage;
    private final RadialProgress2 radialProgress;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;
    private StaticLayout sizeLayout;
    private final TextPaint sizePaint;
    private final TextPaint textPaint;
    private StaticLayout titleLayout;

    public interface Delegate {
        MessageObject getFileRefParentObject();

        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onCancelUpload(BlockRow blockRow);

        void onCaptionChanged(BlockRow blockRow);

        void onCaptionEnter(BlockRow blockRow);

        void onCaptionLockedInsert(CharSequence charSequence);

        boolean onCaptionSelectAll(BlockRow blockRow);

        void onCaptionSpansChanged(BlockRow blockRow);

        void onCaptionWillChange(BlockRow blockRow, int i, int i2);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    public RichDocumentCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectionPaint = new Paint(1);
        this.previewBackgroundPaint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.sizePaint = new TextPaint(1);
        int iDp = AndroidUtilities.dp(10.0f);
        this.buttonY = iDp;
        int iDp2 = AndroidUtilities.dp(44.0f);
        this.buttonSize = iDp2;
        this.buttonX = AndroidUtilities.dp(16.0f);
        this.mediaX = AndroidUtilities.dp(16.0f);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.observerTag = DownloadController.getInstance(i).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
        this.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i2 = this.buttonX;
        radialProgress2.setProgressRect(i2, iDp, i2 + iDp2, iDp2 + iDp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.previewImage = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new RichCaptionController.Host() {
            @Override
            public BlockRow currentRow() {
                return RichDocumentCell.this.currentRow;
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
                if (RichDocumentCell.this.delegate == null) {
                    return null;
                }
                return RichDocumentCell.this.delegate.getSelectionHelper();
            }

            @Override
            public TextSelectionHelper.ArticleSelectableView cell() {
                return RichDocumentCell.this;
            }

            @Override
            public void onCaptionWillChange(int i3, int i4) {
                if (RichDocumentCell.this.delegate != null) {
                    RichDocumentCell.this.delegate.onCaptionWillChange(RichDocumentCell.this.currentRow, i3, i4);
                }
            }

            @Override
            public void onCaptionChanged() {
                if (RichDocumentCell.this.delegate != null) {
                    RichDocumentCell.this.delegate.onCaptionChanged(RichDocumentCell.this.currentRow);
                }
            }

            @Override
            public void onCaptionSpansChanged() {
                if (RichDocumentCell.this.delegate != null) {
                    RichDocumentCell.this.delegate.onCaptionSpansChanged(RichDocumentCell.this.currentRow);
                }
            }

            @Override
            public void onCaptionEnter() {
                if (RichDocumentCell.this.delegate != null) {
                    RichDocumentCell.this.delegate.onCaptionEnter(RichDocumentCell.this.currentRow);
                }
            }

            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                if (RichDocumentCell.this.delegate != null) {
                    RichDocumentCell.this.delegate.onRequestWindowFocusable(richEditText, z);
                }
            }

            @Override
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (RichDocumentCell.this.delegate != null) {
                    RichDocumentCell.this.delegate.onCaptionLockedInsert(charSequence);
                }
            }

            @Override
            public boolean onCaptionSelectAll() {
                return RichDocumentCell.this.delegate != null && RichDocumentCell.this.delegate.onCaptionSelectAll(RichDocumentCell.this.currentRow);
            }
        });
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors();
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.blockRtl = RichBlockChrome.rtl();
        bindBlockInset(blockRow);
        this.caption.bind();
        TLRPC.Document document = document();
        if (this.boundDocument != document) {
            this.boundDocument = document;
            this.messageObject = document == null ? null : buildMessageObject(document);
        }
        bindPreview(document);
        rebuildLayouts();
        if (this.attached) {
            updateButtonState(false);
        }
        requestLayout();
        invalidate();
    }

    private TLRPC.Document document() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (mediaUploadState = blockRow.media) == null) {
            return null;
        }
        return mediaUploadState.document;
    }

    private boolean isUploading() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        return (blockRow == null || (mediaUploadState = blockRow.media) == null || !mediaUploadState.isPending()) ? false : true;
    }

    private MessageObject buildMessageObject(TLRPC.Document document) {
        MediaUploadState mediaUploadState;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = -Long.valueOf(document.id).hashCode();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        peer.user_id = clientUserId;
        tL_peerUser.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = document;
        tL_message.flags |= 768;
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && (mediaUploadState = blockRow.media) != null && !TextUtils.isEmpty(mediaUploadState.localPath)) {
            tL_message.attachPath = this.currentRow.media.localPath;
        }
        return new MessageObject(this.currentAccount, tL_message, false, true);
    }

    private void rebuildLayouts() {
        int i;
        float f;
        MediaUploadState mediaUploadState;
        TLRPC.Document document = document();
        if (document == null) {
            return;
        }
        if (this.hasPreview) {
            i = this.mediaX;
            f = 97.0f;
        } else {
            i = this.buttonX;
            f = 54.0f;
        }
        int iMax = Math.max(AndroidUtilities.dp(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - (i + AndroidUtilities.dp(f))) - AndroidUtilities.dp(16.0f)) - (this.blockRtl ? blockInset() : 0));
        this.textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.sizePaint.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(document);
        if (TextUtils.isEmpty(documentFileName) && (mediaUploadState = this.currentRow.media) != null && !TextUtils.isEmpty(mediaUploadState.localPath)) {
            documentFileName = new File(this.currentRow.media.localPath).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(documentFileName, this.textPaint, iMax, TextUtils.TruncateAt.END);
        TextPaint textPaint = this.textPaint;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.titleLayout = new StaticLayout(charSequenceEllipsize, textPaint, iMax, alignment, 1.0f, 0.0f, false);
        long length = document.size;
        if (length <= 0) {
            MediaUploadState mediaUploadState2 = this.currentRow.media;
            length = (mediaUploadState2 == null || TextUtils.isEmpty(mediaUploadState2.localPath)) ? 0L : new File(this.currentRow.media.localPath).length();
        }
        this.sizeLayout = new StaticLayout(AndroidUtilities.formatFileSize(length), this.sizePaint, iMax, alignment, 1.0f, 0.0f, false);
    }

    @Override
    protected void onBlockInsetChanged(int i) {
        int iDp = AndroidUtilities.dp(16.0f);
        if (this.blockRtl) {
            i = 0;
        }
        int iDp2 = iDp + i;
        this.mediaX = iDp2;
        if (this.hasPreview) {
            iDp2 += AndroidUtilities.dp(21.0f);
        }
        this.buttonX = iDp2;
        int iDp3 = this.hasPreview ? AndroidUtilities.dp(31.0f) : this.buttonY;
        RadialProgress2 radialProgress2 = this.radialProgress;
        int i2 = this.buttonX;
        int i3 = this.buttonSize;
        radialProgress2.setProgressRect(i2, iDp3, i2 + i3, i3 + iDp3);
        requestLayout();
    }

    private void bindPreview(TLRPC.Document document) {
        String str;
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        String str2 = (blockRow == null || (mediaUploadState = blockRow.media) == null) ? null : mediaUploadState.localPath;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z = isUploading() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean zIsDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        this.hasPreview = z || zIsDocumentHasThumb;
        int iDp = AndroidUtilities.dp(16.0f) + (this.blockRtl ? 0 : blockInset());
        this.mediaX = iDp;
        if (this.hasPreview) {
            iDp += AndroidUtilities.dp(21.0f);
        }
        this.buttonX = iDp;
        int iDp2 = this.hasPreview ? AndroidUtilities.dp(31.0f) : this.buttonY;
        RadialProgress2 radialProgress2 = this.radialProgress;
        int i = this.buttonX;
        int i2 = this.buttonSize;
        radialProgress2.setProgressRect(i, iDp2, i + i2, i2 + iDp2);
        if (z) {
            this.previewImage.setImageCoords(this.mediaX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.previewImage.setImage(ImageLocation.getForPath(str2), "86_86", null, null, document, 1);
            return;
        }
        if (zIsDocumentHasThumb) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            Delegate delegate = this.delegate;
            MessageObject fileRefParentObject = delegate == null ? null : delegate.getFileRefParentObject();
            this.previewImage.setImageCoords(this.mediaX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            ImageReceiver imageReceiver = this.previewImage;
            ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
            Drawable drawableCreateStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
            if (fileRefParentObject == null) {
                fileRefParentObject = this.messageObject;
            }
            imageReceiver.setImage(forDocument, "86_86", drawableCreateStripedBitmap, null, fileRefParentObject, 1);
            return;
        }
        this.previewImage.clearImage();
    }

    public void refreshUploadState() {
        bindPreview(document());
        rebuildLayouts();
        updateButtonState(false);
        requestLayout();
        invalidate();
    }

    private File localFile() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && (mediaUploadState = blockRow.media) != null && !TextUtils.isEmpty(mediaUploadState.localPath)) {
            File file = new File(this.currentRow.media.localPath);
            if (file.exists()) {
                return file;
            }
        }
        if (document() == null) {
            return null;
        }
        File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(document(), false);
        return (pathToAttach == null || !pathToAttach.exists()) ? FileLoader.getInstance(this.currentAccount).getPathToAttach(document(), true) : pathToAttach;
    }

    public void updateButtonState(boolean z) {
        if (this.hasPreview) {
            this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
            this.radialProgress.setProgressColor(Theme.getColor(Theme.key_chat_mediaProgress, this.resourcesProvider));
        } else {
            this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
            this.radialProgress.setProgressColor(Theme.getColor(Theme.key_chat_inFileProgress, this.resourcesProvider));
        }
        if (isUploading()) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.radialProgress.setProgress(this.currentRow.media.progress, z);
            this.radialProgress.setIcon(3, false, z);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(document());
        File fileLocalFile = localFile();
        if (fileLocalFile != null && fileLocalFile.exists()) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.buttonState = 0;
            this.radialProgress.setIcon(this.hasPreview ? 4 : 5, false, z);
        } else {
            if (TextUtils.isEmpty(attachFileName)) {
                return;
            }
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                this.buttonState = 2;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, z);
                this.radialProgress.setIcon(3, true, z);
                return;
            }
            this.buttonState = 1;
            this.radialProgress.setProgress(0.0f, z);
            this.radialProgress.setIcon(2, false, z);
        }
    }

    private void pressButton() {
        MessageObject messageObject;
        if (isUploading()) {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onCancelUpload(this.currentRow);
            }
        } else {
            int i = this.buttonState;
            if (i == 0) {
                Activity activityFindActivity = findActivity(getContext());
                if (activityFindActivity != null && (messageObject = this.messageObject) != null) {
                    AndroidUtilities.openForView(messageObject, activityFindActivity, this.resourcesProvider, false);
                }
            } else if (i == 1 && document() != null) {
                Delegate delegate2 = this.delegate;
                MessageObject fileRefParentObject = delegate2 == null ? null : delegate2.getFileRefParentObject();
                FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
                TLRPC.Document document = document();
                if (fileRefParentObject == null) {
                    fileRefParentObject = this.messageObject;
                }
                fileLoader.loadFile(document, fileRefParentObject, 1, 1);
                this.buttonState = 2;
                this.radialProgress.setIcon(3, true, true);
            } else if (this.buttonState == 2 && document() != null) {
                FileLoader.getInstance(this.currentAccount).cancelLoadFile(document());
                this.buttonState = 1;
                this.radialProgress.setIcon(2, false, true);
            }
        }
        invalidate();
    }

    private static Activity findActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, AndroidUtilities.dp(this.hasPreview ? 106.0f : 66.0f) + this.caption.measure(this.blockRtl ? 0 : blockInset(), this.blockRtl ? blockInset() : 0, size));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.caption.layout(this.blockRtl ? 0 : blockInset(), this.blockRtl ? blockInset() : 0, i3 - i, AndroidUtilities.dp(this.hasPreview ? 106.0f : 66.0f));
        rebuildLayouts();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        float f;
        if (document() == null) {
            return;
        }
        if (this.hasPreview && !this.previewImage.draw(canvas)) {
            this.previewBackgroundPaint.setColor(Theme.getColor(Theme.key_chat_inFileBackground, this.resourcesProvider));
            canvas.drawRoundRect(this.mediaX, AndroidUtilities.dp(10.0f), this.mediaX + AndroidUtilities.dp(86.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.previewBackgroundPaint);
        }
        this.radialProgress.draw(canvas);
        if (this.hasPreview) {
            i = this.mediaX;
            f = 97.0f;
        } else {
            i = this.buttonX;
            f = 54.0f;
        }
        int iDp = i + AndroidUtilities.dp(f);
        this.textPaint.setColor(Theme.getColor(Theme.key_chat_inFileNameText, this.resourcesProvider));
        int iDp2 = AndroidUtilities.dp(12.0f);
        if (this.titleLayout != null) {
            canvas.save();
            canvas.translate(iDp, iDp2);
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        this.sizePaint.setColor(Theme.getColor(Theme.key_chat_inTimeText, this.resourcesProvider));
        StaticLayout staticLayout = this.titleLayout;
        int height = iDp2 + (staticLayout == null ? 0 : staticLayout.getHeight()) + AndroidUtilities.dp(2.0f);
        if (this.sizeLayout != null) {
            canvas.save();
            canvas.translate(iDp, height);
            this.sizeLayout.draw(canvas);
            canvas.restore();
        }
        if (isCellSelected()) {
            canvas.drawRoundRect((this.blockRtl ? 0 : blockInset()) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), (getWidth() - (this.blockRtl ? blockInset() : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.hasPreview ? 104.0f : 64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.selectionPaint);
        }
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        return this.delegate != null && (getParent() instanceof RecyclerView) && (selectionHelper = this.delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) > selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getX() < this.mediaX || motionEvent.getX() > getWidth() - AndroidUtilities.dp(12.0f) || motionEvent.getY() < AndroidUtilities.dp(10.0f)) {
            z = false;
        } else {
            if (motionEvent.getY() <= AndroidUtilities.dp(this.hasPreview ? 96.0f : 54.0f)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (motionEvent.getActionMasked() == 0 && z) {
            this.pressed = true;
            return true;
        }
        if (motionEvent.getActionMasked() != 1 || !this.pressed) {
            if (motionEvent.getActionMasked() == 3) {
                this.pressed = false;
            }
            return this.pressed || super.onTouchEvent(motionEvent);
        }
        this.pressed = false;
        if (z) {
            playSoundEffect(0);
            pressButton();
        }
        return true;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.radialProgress.setParent(this);
        this.previewImage.onAttachedToWindow();
        updateButtonState(false);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        this.previewImage.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public int getObserverTag() {
        return this.observerTag;
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        updateButtonState(true);
    }

    @Override
    public void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(true);
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2), true);
    }

    @Override
    public void updateColors() {
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        RichCaptionController richCaptionController = this.caption;
        if (richCaptionController != null) {
            richCaptionController.applyColors();
        }
    }

    @Override
    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public RichEditText getCaptionEditText() {
        return this.caption.editText;
    }

    @Override
    public void persistCaption() {
        this.caption.persist();
    }

    @Override
    public boolean isPressOnCaption(int i, int i2) {
        return this.caption.isPressOnCaption(i, i2);
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        this.caption.fillTextLayoutBlocks(arrayList);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.caption.drawSelection(canvas);
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public RichDocumentCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichDocumentCell richDocumentCell = new RichDocumentCell(context, i, resourcesProvider);
            richDocumentCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richDocumentCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichDocumentCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}

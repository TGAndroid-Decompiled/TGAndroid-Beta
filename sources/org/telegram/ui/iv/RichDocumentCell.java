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
import org.telegram.messenger.LocaleController;
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
import org.telegram.ui.PhotoViewer;

public final class RichDocumentCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost, DownloadController.FileDownloadProgressListener {
    public boolean attached;
    public boolean blockRtl;
    public TLRPC.Document boundDocument;
    public final int buttonSize;
    public int buttonState;
    public int buttonX;
    public final int buttonY;
    public final RichCaptionController caption;
    public final int currentAccount;
    public RichEditorListView.AnonymousClass8 delegate;
    public boolean hasPreview;
    public int mediaX;
    public MessageObject messageObject;
    public final int observerTag;
    public boolean pressed;
    public final Paint previewBackgroundPaint;
    public final ImageReceiver previewImage;
    public final RadialProgress2 radialProgress;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint selectionPaint;
    public StaticLayout sizeLayout;
    public final TextPaint sizePaint;
    public final TextPaint textPaint;
    public StaticLayout titleLayout;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            MessageObject messageObject;
            MediaUploadState mediaUploadState;
            RichDocumentCell richDocumentCell = (RichDocumentCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            RichEditorListView.AnonymousClass8 anonymousClass8 = (RichEditorListView.AnonymousClass8) uItem.object2;
            richDocumentCell.currentRow = blockRow;
            richDocumentCell.delegate = anonymousClass8;
            richDocumentCell.blockRtl = LocaleController.isRTL;
            richDocumentCell.bindBlockInset(blockRow);
            richDocumentCell.caption.bind();
            TLRPC.Document document = richDocumentCell.document();
            if (richDocumentCell.boundDocument != document) {
                richDocumentCell.boundDocument = document;
                if (document == null) {
                    messageObject = null;
                } else {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    tL_message.id = -Long.valueOf(document.id).hashCode();
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    int i = richDocumentCell.currentAccount;
                    long clientUserId = UserConfig.getInstance(i).getClientUserId();
                    peer.user_id = clientUserId;
                    tL_peerUser.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = document;
                    tL_message.flags |= 768;
                    BlockRow blockRow2 = richDocumentCell.currentRow;
                    if (blockRow2 != null && (mediaUploadState = blockRow2.media) != null && !TextUtils.isEmpty(mediaUploadState.localPath)) {
                        tL_message.attachPath = richDocumentCell.currentRow.media.localPath;
                    }
                    messageObject = new MessageObject(i, tL_message, false, true);
                }
                richDocumentCell.messageObject = messageObject;
            }
            richDocumentCell.bindPreview(document);
            richDocumentCell.rebuildLayouts();
            if (richDocumentCell.attached) {
                richDocumentCell.updateButtonState(false);
            }
            richDocumentCell.requestLayout();
            richDocumentCell.invalidate();
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichDocumentCell richDocumentCell = new RichDocumentCell(context, i, resourcesProvider);
            richDocumentCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richDocumentCell;
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
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
        RadialProgress2 radialProgress2 = new RadialProgress2(resourcesProvider, this);
        this.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i2 = this.buttonX;
        radialProgress2.setProgressRect(i2, iDp, i2 + iDp2, iDp2 + iDp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.previewImage = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new PhotoViewer.AnonymousClass24(this, 10));
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors$1();
    }

    public final void bindPreview(TLRPC.Document document) {
        MediaUploadState mediaUploadState;
        String str;
        MediaUploadState mediaUploadState2;
        BlockRow blockRow = this.currentRow;
        String str2 = (blockRow == null || (mediaUploadState2 = blockRow.media) == null) ? null : mediaUploadState2.localPath;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        BlockRow blockRow2 = this.currentRow;
        boolean z = blockRow2 != null && (mediaUploadState = blockRow2.media) != null && mediaUploadState.isPending() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean zIsDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        this.hasPreview = z || zIsDocumentHasThumb;
        int iDp = AndroidUtilities.dp(16.0f) + (this.blockRtl ? 0 : this.blockInset);
        this.mediaX = iDp;
        if (this.hasPreview) {
            iDp += AndroidUtilities.dp(21.0f);
        }
        this.buttonX = iDp;
        int iDp2 = this.hasPreview ? AndroidUtilities.dp(31.0f) : this.buttonY;
        int i = this.buttonX;
        int i2 = this.buttonSize;
        this.radialProgress.setProgressRect(i, iDp2, i + i2, i2 + iDp2);
        ImageReceiver imageReceiver = this.previewImage;
        if (z) {
            imageReceiver.setImageCoords(this.mediaX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.previewImage.setImage(ImageLocation.getForPath(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!zIsDocumentHasThumb) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
        RichEditorListView.AnonymousClass8 anonymousClass8 = this.delegate;
        MessageObject messageObject = anonymousClass8 == null ? null : RichEditorListView.this.fileRefParentObject;
        imageReceiver.setImageCoords(this.mediaX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
        ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
        Drawable drawableCreateStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
        if (messageObject == null) {
            messageObject = this.messageObject;
        }
        this.previewImage.setImage(forDocument, "86_86", drawableCreateStripedBitmap, null, messageObject, 1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.caption.drawSelection(canvas);
    }

    public final TLRPC.Document document() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (mediaUploadState = blockRow.media) == null) {
            return null;
        }
        return mediaUploadState.document;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.caption.fillTextLayoutBlocks(arrayList);
    }

    @Override
    public RichEditText getCaptionEditText() {
        return this.caption.editText;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.observerTag;
    }

    @Override
    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public final boolean isPressOnCaption(int i, int i2) {
        return this.caption.isPressOnCaption(i, i2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.radialProgress.setParent(this);
        this.previewImage.onAttachedToWindow();
        updateButtonState(false);
    }

    @Override
    public final void onBlockInsetChanged(int i) {
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
        int i2 = this.buttonX;
        int i3 = this.buttonSize;
        this.radialProgress.setProgressRect(i2, iDp3, i2 + i3, i3 + iDp3);
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        this.previewImage.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        if (document() == null) {
            return;
        }
        boolean z = this.hasPreview;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z && !this.previewImage.draw(canvas)) {
            Paint paint = this.previewBackgroundPaint;
            paint.setColor(Theme.getColor(Theme.key_chat_inFileBackground, resourcesProvider));
            canvas.drawRoundRect(this.mediaX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.mediaX, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.radialProgress.draw(canvas);
        if (this.hasPreview) {
            i = this.mediaX;
            f = 97.0f;
        } else {
            i = this.buttonX;
            f = 54.0f;
        }
        int iDp = AndroidUtilities.dp(f) + i;
        this.textPaint.setColor(Theme.getColor(Theme.key_chat_inFileNameText, resourcesProvider));
        int iDp2 = AndroidUtilities.dp(12.0f);
        if (this.titleLayout != null) {
            canvas.save();
            canvas.translate(iDp, iDp2);
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        this.sizePaint.setColor(Theme.getColor(Theme.key_chat_inTimeText, resourcesProvider));
        StaticLayout staticLayout = this.titleLayout;
        int iDp3 = AndroidUtilities.dp(2.0f) + iDp2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.sizeLayout != null) {
            canvas.save();
            canvas.translate(iDp, iDp3);
            this.sizeLayout.draw(canvas);
            canvas.restore();
        }
        if (this.delegate == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null || !textSelectionHelper.isInSelectionMode()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int childAdapterPosition = RecyclerView.getChildAdapterPosition(this);
        if (childAdapterPosition <= textSelectionHelper.startViewPosition || childAdapterPosition > textSelectionHelper.endViewPosition) {
            return;
        }
        canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.blockRtl ? 0 : this.blockInset), AndroidUtilities.dp(2.0f), (getWidth() - (this.blockRtl ? this.blockInset : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.hasPreview ? 104.0f : 64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.selectionPaint);
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState(true);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.blockRtl;
        this.caption.layout(z2 ? 0 : this.blockInset, z2 ? this.blockInset : 0, i3 - i, AndroidUtilities.dp(this.hasPreview ? 106.0f : 66.0f));
        rebuildLayouts();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.blockRtl;
        setMeasuredDimension(size, AndroidUtilities.dp(this.hasPreview ? 106.0f : 66.0f) + this.caption.measure(z ? 0 : this.blockInset, z ? this.blockInset : 0, size));
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2), true);
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MessageObject messageObject;
        MediaUploadState mediaUploadState;
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
        if (motionEvent.getActionMasked() == 1 && this.pressed) {
            this.pressed = false;
            if (z) {
                playSoundEffect(0);
                BlockRow blockRow = this.currentRow;
                if (blockRow == null || (mediaUploadState = blockRow.media) == null || !mediaUploadState.isPending()) {
                    int i = this.buttonState;
                    Activity activity = null;
                    if (i == 0) {
                        Context context = getContext();
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                if (!(context instanceof Activity)) {
                                    break;
                                }
                                activity = (Activity) context;
                                break;
                            }
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                        if (activity != null && (messageObject = this.messageObject) != null) {
                            AndroidUtilities.openForView(messageObject, activity, this.resourcesProvider, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.radialProgress;
                        int i2 = this.currentAccount;
                        if (i == 1 && document() != null) {
                            RichEditorListView.AnonymousClass8 anonymousClass8 = this.delegate;
                            MessageObject messageObject2 = anonymousClass8 != null ? RichEditorListView.this.fileRefParentObject : null;
                            FileLoader fileLoader = FileLoader.getInstance(i2);
                            TLRPC.Document document = document();
                            if (messageObject2 == null) {
                                messageObject2 = this.messageObject;
                            }
                            fileLoader.loadFile(document, messageObject2, 1, 1);
                            this.buttonState = 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (this.buttonState == 2 && document() != null) {
                            FileLoader.getInstance(i2).cancelLoadFile(document());
                            this.buttonState = 1;
                            radialProgress2.setIcon(2, false, true);
                        }
                    }
                } else {
                    RichEditorListView.AnonymousClass8 anonymousClass9 = this.delegate;
                    if (anonymousClass9 != null) {
                        BlockRow blockRow2 = this.currentRow;
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        RichMediaUploader richMediaUploader = (RichMediaUploader) richEditorListView.uploaders.remove(blockRow2.media);
                        if (richMediaUploader != null) {
                            richMediaUploader.cancel();
                        }
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                            richEditorHistory.commit();
                        }
                        richEditorListView.rows.remove(blockRow2);
                        richEditorListView.adapter.update(true);
                        RichEditorHistory richEditorHistory2 = richEditorListView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.record();
                        }
                        richEditorListView.delegate.onContentChanged();
                    }
                }
                invalidate();
                return true;
            }
        } else {
            if (motionEvent.getActionMasked() == 3) {
                this.pressed = false;
            }
            if (!this.pressed && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void persistCaption() {
        this.caption.persist();
    }

    public final void rebuildLayouts() {
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
        int iMax = Math.max(AndroidUtilities.dp(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - (AndroidUtilities.dp(f) + i)) - AndroidUtilities.dp(16.0f)) - (this.blockRtl ? this.blockInset : 0));
        TextPaint textPaint = this.textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = this.sizePaint;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(document);
        if (TextUtils.isEmpty(documentFileName) && (mediaUploadState = this.currentRow.media) != null && !TextUtils.isEmpty(mediaUploadState.localPath)) {
            documentFileName = new File(this.currentRow.media.localPath).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(documentFileName, textPaint, iMax, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.titleLayout = new StaticLayout(charSequenceEllipsize, textPaint, iMax, alignment, 1.0f, 0.0f, false);
        long length = document.size;
        if (length <= 0) {
            MediaUploadState mediaUploadState2 = this.currentRow.media;
            length = (mediaUploadState2 == null || TextUtils.isEmpty(mediaUploadState2.localPath)) ? 0L : new File(this.currentRow.media.localPath).length();
        }
        this.sizeLayout = new StaticLayout(AndroidUtilities.formatFileSize(length), textPaint2, iMax, alignment, 1.0f, 0.0f, false);
    }

    public final void updateButtonState(boolean z) {
        File pathToAttach;
        MediaUploadState mediaUploadState;
        MediaUploadState mediaUploadState2;
        boolean z2 = this.hasPreview;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (z2) {
            int i = Theme.key_chat_mediaLoaderPhoto;
            int i2 = Theme.key_chat_mediaLoaderPhotoSelected;
            int i3 = Theme.key_chat_mediaLoaderPhotoIcon;
            int i4 = Theme.key_chat_mediaLoaderPhotoIconSelected;
            radialProgress2.circleColorKey = i;
            radialProgress2.circlePressedColorKey = i2;
            radialProgress2.iconColorKey = i3;
            radialProgress2.iconPressedColorKey = i4;
            radialProgress2.progressColor = Theme.getColor(Theme.key_chat_mediaProgress, resourcesProvider);
        } else {
            int i5 = Theme.key_chat_inLoader;
            int i6 = Theme.key_chat_inLoaderSelected;
            int i7 = Theme.key_chat_inMediaIcon;
            int i8 = Theme.key_chat_inMediaIconSelected;
            radialProgress2.circleColorKey = i5;
            radialProgress2.circlePressedColorKey = i6;
            radialProgress2.iconColorKey = i7;
            radialProgress2.iconPressedColorKey = i8;
            radialProgress2.progressColor = Theme.getColor(Theme.key_chat_inFileProgress, resourcesProvider);
        }
        BlockRow blockRow = this.currentRow;
        int i9 = this.currentAccount;
        if (blockRow != null && (mediaUploadState2 = blockRow.media) != null && mediaUploadState2.isPending()) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            radialProgress2.setProgress(this.currentRow.media.progress, z);
            radialProgress2.setIcon(3, false, z);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(document());
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 != null && (mediaUploadState = blockRow2.media) != null && !TextUtils.isEmpty(mediaUploadState.localPath)) {
            pathToAttach = new File(this.currentRow.media.localPath);
            if (!pathToAttach.exists()) {
                if (document() == null) {
                    pathToAttach = null;
                } else {
                    pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document(), false);
                    if (pathToAttach != null) {
                        pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document(), true);
                    } else {
                        pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document(), true);
                    }
                }
            }
        } else if (document() == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document(), false);
            if (pathToAttach != null || !pathToAttach.exists()) {
                pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document(), true);
            }
        }
        if (pathToAttach != null && pathToAttach.exists()) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            this.buttonState = 0;
            radialProgress2.setIcon(this.hasPreview ? 4 : 5, false, z);
        } else {
            if (TextUtils.isEmpty(attachFileName)) {
                return;
            }
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                this.buttonState = 1;
                radialProgress2.setProgress(0.0f, z);
                radialProgress2.setIcon(2, false, z);
            } else {
                this.buttonState = 2;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, z);
                radialProgress2.setIcon(3, true, z);
            }
        }
    }

    @Override
    public final void updateColors$1() {
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        RichCaptionController richCaptionController = this.caption;
        if (richCaptionController != null) {
            richCaptionController.applyColors();
        }
    }
}

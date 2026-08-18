package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichAudioCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    private boolean attached;
    private final TextPaint audioTimePaint;
    private boolean blockRtl;
    private TLRPC.Document boundDocument;
    private boolean buttonPressed;
    private int buttonState;
    private int buttonX;
    private final int buttonY;
    private final RichCaptionController caption;
    private final int currentAccount;
    private Delegate delegate;
    private StaticLayout durationLayout;
    private String lastTimeString;
    private MessageObject messageObject;
    private final int observerTag;
    private final RadialProgress2 radialProgress;
    private final Theme.ResourcesProvider resourcesProvider;
    private final SeekBar seekBar;
    private int seekBarWidth;
    private int seekBarX;
    private int seekBarY;
    private final Paint selectionPaint;
    private final int size;
    private StaticLayout titleLayout;

    public interface Delegate {
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

    public RichAudioCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectionPaint = new Paint(1);
        this.audioTimePaint = new TextPaint(1);
        this.buttonX = AndroidUtilities.dp(16.0f);
        int iDp = AndroidUtilities.dp(10.0f);
        this.buttonY = iDp;
        int iDp2 = AndroidUtilities.dp(44.0f);
        this.size = iDp2;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        this.observerTag = DownloadController.getInstance(i).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
        this.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i2 = this.buttonX;
        radialProgress2.setProgressRect(i2, iDp, i2 + iDp2, iDp2 + iDp);
        SeekBar seekBar = new SeekBar(this);
        this.seekBar = seekBar;
        seekBar.setDelegate(new SeekBar.SeekBarDelegate() {
            @Override
            public boolean isSeekBarDragAllowed() {
                return SeekBar.SeekBarDelegate.CC.$default$isSeekBarDragAllowed(this);
            }

            @Override
            public void onSeekBarPressed() {
                SeekBar.SeekBarDelegate.CC.$default$onSeekBarPressed(this);
            }

            @Override
            public void onSeekBarReleased() {
                SeekBar.SeekBarDelegate.CC.$default$onSeekBarReleased(this);
            }

            @Override
            public boolean reverseWaveform() {
                return SeekBar.SeekBarDelegate.CC.$default$reverseWaveform(this);
            }

            @Override
            public void onSeekBarDrag(float f) {
                if (RichAudioCell.this.messageObject == null) {
                    return;
                }
                RichAudioCell.this.messageObject.audioProgress = f;
                MediaController.getInstance().seekToProgress(RichAudioCell.this.messageObject, f);
            }

            @Override
            public void onSeekBarContinuousDrag(float f) {
                if (RichAudioCell.this.messageObject == null) {
                    return;
                }
                RichAudioCell.this.messageObject.audioProgress = f;
            }
        });
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new RichCaptionController.Host() {
            @Override
            public BlockRow currentRow() {
                return RichAudioCell.this.currentRow;
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
                if (RichAudioCell.this.delegate != null) {
                    return RichAudioCell.this.delegate.getSelectionHelper();
                }
                return null;
            }

            @Override
            public TextSelectionHelper.ArticleSelectableView cell() {
                return RichAudioCell.this;
            }

            @Override
            public void onCaptionWillChange(int i3, int i4) {
                if (RichAudioCell.this.delegate != null) {
                    RichAudioCell.this.delegate.onCaptionWillChange(RichAudioCell.this.currentRow, i3, i4);
                }
            }

            @Override
            public void onCaptionChanged() {
                if (RichAudioCell.this.delegate != null) {
                    RichAudioCell.this.delegate.onCaptionChanged(RichAudioCell.this.currentRow);
                }
            }

            @Override
            public void onCaptionSpansChanged() {
                if (RichAudioCell.this.delegate != null) {
                    RichAudioCell.this.delegate.onCaptionSpansChanged(RichAudioCell.this.currentRow);
                }
            }

            @Override
            public void onCaptionEnter() {
                if (RichAudioCell.this.delegate != null) {
                    RichAudioCell.this.delegate.onCaptionEnter(RichAudioCell.this.currentRow);
                }
            }

            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                if (RichAudioCell.this.delegate != null) {
                    RichAudioCell.this.delegate.onRequestWindowFocusable(richEditText, z);
                }
            }

            @Override
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (RichAudioCell.this.delegate != null) {
                    RichAudioCell.this.delegate.onCaptionLockedInsert(charSequence);
                }
            }

            @Override
            public boolean onCaptionSelectAll() {
                return RichAudioCell.this.delegate != null && RichAudioCell.this.delegate.onCaptionSelectAll(RichAudioCell.this.currentRow);
            }
        });
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors();
    }

    @Override
    protected void onBlockInsetChanged(int i) {
        int iDp = AndroidUtilities.dp(16.0f);
        if (this.blockRtl) {
            i = 0;
        }
        int i2 = iDp + i;
        this.buttonX = i2;
        RadialProgress2 radialProgress2 = this.radialProgress;
        int i3 = this.buttonY;
        int i4 = this.size;
        radialProgress2.setProgressRect(i2, i3, i2 + i4, i4 + i3);
        requestLayout();
        invalidate();
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        if (blockRow != null && blockRow.media == null) {
            blockRow.media = new MediaUploadState();
        }
        this.blockRtl = RichBlockChrome.rtl();
        bindBlockInset(blockRow);
        this.caption.bind();
        rebuildFromRow();
        requestLayout();
        invalidate();
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

    private void rebuildFromRow() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.boundDocument) {
            this.boundDocument = displayDocument;
            this.messageObject = null;
            this.lastTimeString = null;
            this.durationLayout = null;
        }
        if (isReady() && this.messageObject == null && displayDocument != null) {
            this.messageObject = buildMessageObject(displayDocument);
        }
        layoutInner();
        if (this.attached) {
            updateButtonState(false);
        }
    }

    private boolean isReady() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        return (blockRow == null || (mediaUploadState = blockRow.media) == null || !mediaUploadState.isReady()) ? false : true;
    }

    private boolean isUploading() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        return (blockRow == null || (mediaUploadState = blockRow.media) == null || !mediaUploadState.isPending()) ? false : true;
    }

    private TLRPC.Document getDisplayDocument() {
        MediaUploadState mediaUploadState;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (mediaUploadState = blockRow.media) == null) {
            return null;
        }
        TLRPC.Document document = mediaUploadState.document;
        return document != null ? document : mediaUploadState.audioDisplayDocument;
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

    private void layoutInner() {
        SpannableStringBuilder spannableStringBuilder;
        this.seekBarX = this.buttonX + AndroidUtilities.dp(50.0f) + this.size;
        this.seekBarWidth = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.seekBarX) - AndroidUtilities.dp(16.0f)) - (this.blockRtl ? blockInset() : 0));
        String strAudioAuthor = audioAuthor();
        String strAudioTitle = audioTitle();
        if (!TextUtils.isEmpty(strAudioTitle) || !TextUtils.isEmpty(strAudioAuthor)) {
            if (!TextUtils.isEmpty(strAudioTitle) && !TextUtils.isEmpty(strAudioAuthor)) {
                spannableStringBuilder = new SpannableStringBuilder(String.format("%s - %s", strAudioAuthor, strAudioTitle));
            } else if (!TextUtils.isEmpty(strAudioTitle)) {
                spannableStringBuilder = new SpannableStringBuilder(strAudioTitle);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(strAudioAuthor);
            }
            if (!TextUtils.isEmpty(strAudioAuthor)) {
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, strAudioAuthor.length(), 18);
            }
            this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, this.audioTimePaint, this.seekBarWidth, TextUtils.TruncateAt.END), this.audioTimePaint, this.seekBarWidth + AndroidUtilities.dp(50.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.seekBarY = this.buttonY + ((this.size - AndroidUtilities.dp(30.0f)) / 2) + AndroidUtilities.dp(11.0f);
        } else {
            this.titleLayout = null;
            this.seekBarY = this.buttonY + ((this.size - AndroidUtilities.dp(30.0f)) / 2);
        }
        this.seekBar.setSize(this.seekBarWidth, AndroidUtilities.dp(30.0f));
    }

    private String audioAuthor() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            return messageObject.getMusicAuthor(false);
        }
        if (attribute() != null) {
            return attribute().performer;
        }
        return null;
    }

    private String audioTitle() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            return messageObject.getMusicTitle(false);
        }
        if (attribute() != null) {
            return attribute().title;
        }
        return null;
    }

    private TLRPC.TL_documentAttributeAudio attribute() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i = 0; i < displayDocument.attributes.size(); i++) {
            if (displayDocument.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i);
            }
        }
        return null;
    }

    private int audioDuration() {
        if (this.messageObject != null && MediaController.getInstance().isPlayingMessage(this.messageObject)) {
            return this.messageObject.audioProgressSec;
        }
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudioAttribute = attribute();
        if (tL_documentAttributeAudioAttribute != null) {
            return (int) tL_documentAttributeAudioAttribute.duration;
        }
        return 0;
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
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.caption.measure(this.blockRtl ? 0 : blockInset(), this.blockRtl ? blockInset() : 0, size));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.caption.layout(this.blockRtl ? 0 : blockInset(), this.blockRtl ? blockInset() : 0, i3 - i, AndroidUtilities.dp(66.0f));
        layoutInner();
    }

    private int getIconForCurrentState() {
        if (isUploading()) {
            return 3;
        }
        int i = this.buttonState;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return i == 3 ? 3 : 0;
    }

    public void updateButtonState(boolean z) {
        MediaUploadState mediaUploadState;
        this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
        this.radialProgress.setProgressColor(Theme.getColor(Theme.key_chat_inFileProgress, this.resourcesProvider));
        if (isUploading()) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.radialProgress.setProgress(this.currentRow.media.progress, z);
            this.radialProgress.setIcon(3, false, z);
            updatePlayingMessageProgress();
            return;
        }
        TLRPC.Document document = isReady() ? this.currentRow.media.document : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        BlockRow blockRow = this.currentRow;
        boolean z2 = (blockRow == null || (mediaUploadState = blockRow.media) == null || TextUtils.isEmpty(mediaUploadState.localPath) || !new File(this.currentRow.media.localPath).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(this.currentAccount).getPathToAttach(document, true);
        boolean z3 = z2 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            this.radialProgress.setIcon(4, false, false);
            return;
        }
        if (z3) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.buttonState = (!MediaController.getInstance().isPlayingMessage(this.messageObject) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            this.radialProgress.setIcon(getIconForCurrentState(), false, z);
        } else {
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                this.buttonState = 2;
                this.radialProgress.setProgress(0.0f, z);
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                this.buttonState = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                this.radialProgress.setProgress(fileProgress != null ? fileProgress.floatValue() : 0.0f, z);
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
            }
        }
        updatePlayingMessageProgress();
    }

    private void didPressedButton(boolean z) {
        if (isUploading()) {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onCancelUpload(this.currentRow);
                return;
            }
            return;
        }
        if (this.messageObject == null) {
            return;
        }
        TLRPC.Document document = isReady() ? this.currentRow.media.document : null;
        int i = this.buttonState;
        if (i == 0) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            arrayList.add(this.messageObject);
            if (MediaController.getInstance().setPlaylist(arrayList, this.messageObject, 0L, false, null)) {
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
                return;
            }
            return;
        }
        if (i == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.messageObject)) {
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
                return;
            }
            return;
        }
        if (i == 2) {
            this.radialProgress.setProgress(0.0f, false);
            FileLoader.getInstance(this.currentAccount).loadFile(document, this.messageObject, 1, 1);
            this.buttonState = 3;
            this.radialProgress.setIcon(getIconForCurrentState(), true, z);
            invalidate();
            return;
        }
        if (i == 3) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(document);
            this.buttonState = 2;
            this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            invalidate();
        }
    }

    public void updatePlayingMessageProgress() {
        int iAudioDuration;
        if (!isUploading() && this.messageObject != null && !this.seekBar.isDragging()) {
            this.seekBar.setProgress(this.messageObject.audioProgress);
        }
        if (isUploading()) {
            iAudioDuration = attribute() != null ? (int) attribute().duration : 0;
        } else {
            iAudioDuration = audioDuration();
        }
        String shortDuration = AndroidUtilities.formatShortDuration(iAudioDuration);
        String str = this.lastTimeString;
        if (str == null || !str.equals(shortDuration)) {
            this.lastTimeString = shortDuration;
            this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.durationLayout = new StaticLayout(shortDuration, this.audioTimePaint, (int) Math.ceil(this.audioTimePaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.radialProgress.setParent(this);
        this.seekBar.setParent(this);
        updateButtonState(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            updateButtonState(true);
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                return;
            }
            MessageObject messageObject2 = this.messageObject;
            messageObject2.audioProgress = playingMessageObject.audioProgress;
            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
            updatePlayingMessageProgress();
        }
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
        this.radialProgress.setProgress(Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2), true);
        if (this.buttonState != 3) {
            updateButtonState(true);
        }
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition > selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (getDisplayDocument() == null) {
            return;
        }
        this.radialProgress.draw(canvas);
        SeekBar seekBar = this.seekBar;
        int color = Theme.getColor(Theme.key_chat_inAudioSeekbar, this.resourcesProvider);
        int color2 = Theme.getColor(Theme.key_chat_inAudioCacheSeekbar, this.resourcesProvider);
        int i = Theme.key_chat_inAudioSeekbarFill;
        seekBar.setColors(color, color2, Theme.getColor(i, this.resourcesProvider), Theme.getColor(i, this.resourcesProvider), Theme.getColor(Theme.key_chat_inAudioSeekbarSelected, this.resourcesProvider));
        if (!isUploading()) {
            canvas.save();
            canvas.translate(this.seekBarX, this.seekBarY);
            this.seekBar.draw(canvas);
            canvas.restore();
        }
        this.audioTimePaint.setColor(Theme.getColor(Theme.key_chat_inTimeText, this.resourcesProvider));
        if (this.durationLayout != null) {
            canvas.save();
            canvas.translate(this.buttonX + AndroidUtilities.dp(54.0f), this.seekBarY + AndroidUtilities.dp(6.0f));
            this.durationLayout.draw(canvas);
            canvas.restore();
        }
        if (this.titleLayout != null) {
            this.audioTimePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas.save();
            canvas.translate(this.buttonX + AndroidUtilities.dp(54.0f), this.seekBarY - AndroidUtilities.dp(16.0f));
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        if (isCellSelected()) {
            canvas.drawRoundRect((this.blockRtl ? 0 : blockInset()) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), (getWidth() - (this.blockRtl ? blockInset() : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.selectionPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!isUploading() && this.seekBar.onTouch(actionMasked, x - this.seekBarX, y - this.seekBarY)) {
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (actionMasked == 0) {
            int i = this.buttonX;
            if (x >= i) {
                int i2 = this.size;
                if (x <= i + i2) {
                    int i3 = this.buttonY;
                    if (y >= i3 && y <= i3 + i2) {
                        this.buttonPressed = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.buttonPressed) {
                this.buttonPressed = false;
                playSoundEffect(0);
                didPressedButton(true);
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.buttonPressed = false;
        }
        return this.buttonPressed || super.onTouchEvent(motionEvent);
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
        public RichAudioCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichAudioCell richAudioCell = new RichAudioCell(context, i, resourcesProvider);
            richAudioCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richAudioCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichAudioCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}

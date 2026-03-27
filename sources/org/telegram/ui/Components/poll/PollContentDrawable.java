package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.Text;

public class PollContentDrawable extends Drawable implements DownloadController.FileDownloadProgressListener, SeekBar.SeekBarDelegate {
    private final int TAG;
    private final BoolAnimator animatorIsPlaying;
    private String attachFileName;
    private String attachPath;
    private CharSequence authorInfo;
    private Text authorInfoText;
    private final int currentAccount;
    private CharSequence fileInfo;
    private Text fileInfoText;
    private CharSequence fileName;
    private Text fileNameText;
    private boolean hasMedia;
    public final ImageReceiver imageReceiver;
    private final boolean isExplanation;
    private boolean isFile;
    private boolean isLocation;
    private boolean isMusic;
    private boolean isVideo;
    private int lastIcon;
    int lastTime;
    private ClipRoundedDrawable locationLoadingThumb;
    private SvgHelper.SvgDrawable locationSvgThumb;
    private TLRPC.MessageMedia media;
    private int mediaHeight;
    private int mediaWidth;
    private MessageObject messageObject;
    private double musicDuration;
    private final ViewGroup parent;
    private final RadialProgress2 radialProgress;
    private Drawable redLocationIcon;
    private final SeekBar seekBar;
    private float seekBarX;
    private float seekBarY;
    private int videoDuration;
    private Text videoDurationText;
    private final Paint durationBackgroundPaint = new Paint(1);
    private int lastFileNameWidth = 0;
    private int alpha = 255;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public boolean isSeekBarDragAllowed() {
        return SeekBar.SeekBarDelegate.CC.$default$isSeekBarDragAllowed(this);
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    public void onSuccessDownload(String str) {
    }

    @Override
    public boolean reverseWaveform() {
        return SeekBar.SeekBarDelegate.CC.$default$reverseWaveform(this);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public PollContentDrawable(int i, ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.currentAccount = i;
        this.isExplanation = z;
        this.radialProgress = new RadialProgress2(viewGroup, resourcesProvider);
        this.parent = viewGroup;
        SeekBar seekBar = new SeekBar(viewGroup);
        this.seekBar = seekBar;
        seekBar.setDelegate(this);
        this.animatorIsPlaying = new BoolAnimator(viewGroup, AnimatorUtils.DECELERATE_INTERPOLATOR, 180L);
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    public boolean seekBarOnTouch(int i, float f, float f2) {
        return this.seekBar.onTouch(i, f - this.seekBarX, f2 - this.seekBarY);
    }

    public void attach() {
        this.imageReceiver.onAttachedToWindow();
        this.radialProgress.onAttachedToWindow();
    }

    public void detach() {
        this.imageReceiver.onDetachedFromWindow();
        this.radialProgress.onDetachedFromWindow();
    }

    public void setMedia(MessageObject messageObject, TLRPC.MessageMedia messageMedia, Object obj, int i, String str, boolean z) {
        String str2 = this.attachFileName;
        this.mediaWidth = 0;
        this.mediaHeight = 0;
        this.messageObject = messageObject;
        this.media = messageMedia;
        this.isFile = false;
        this.isMusic = false;
        this.isVideo = false;
        this.isLocation = false;
        this.musicDuration = 0.0d;
        this.videoDuration = 0;
        this.attachPath = str;
        this.attachFileName = null;
        boolean mediaImpl = setMediaImpl(messageMedia, obj, i, str);
        this.hasMedia = mediaImpl;
        if (!mediaImpl) {
            this.imageReceiver.clearImage();
        }
        if (!TextUtils.equals(str2, this.attachFileName)) {
            if (!TextUtils.isEmpty(str2)) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            }
            if (!TextUtils.isEmpty(this.attachFileName)) {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(this.attachFileName, this);
            }
        }
        if (!this.isMusic) {
            this.radialProgress.setImageOverlay(null, null, null);
        }
        updatePlayingMessageProgress(z);
    }

    public TLRPC.MessageMedia getMedia() {
        return this.media;
    }

    public boolean isHasMedia() {
        return this.hasMedia;
    }

    private boolean setMediaImpl(org.telegram.tgnet.TLRPC.MessageMedia r23, java.lang.Object r24, int r25, java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.poll.PollContentDrawable.setMediaImpl(org.telegram.tgnet.TLRPC$MessageMedia, java.lang.Object, int, java.lang.String):boolean");
    }

    public int getHeightForWidth(int i) {
        if (this.isMusic) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.isFile) {
            return AndroidUtilities.dp(56.0f);
        }
        if (this.mediaWidth == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round(this.mediaHeight * (i / r0)), this.isExplanation ? (i * 4) / 5 : (i * 5) / 4);
    }

    public void checkColors(boolean z) {
        Text text = this.fileNameText;
        if (text != null) {
            text.setColor(Theme.getColor(z ? Theme.key_chat_outFileNameText : Theme.key_chat_inFileNameText));
        }
        this.durationBackgroundPaint.setColor(1711276032);
        Text text2 = this.videoDurationText;
        if (text2 != null) {
            text2.setColor(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.locationSvgThumb;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z ? Theme.key_chat_outLocationIcon : Theme.key_chat_inLocationIcon);
        }
        if (!this.isMusic && !this.isFile) {
            this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
            return;
        }
        if (z) {
            SeekBar seekBar = this.seekBar;
            int themedColor = getThemedColor(Theme.key_chat_outAudioSeekbar);
            int themedColor2 = getThemedColor(Theme.key_chat_outAudioCacheSeekbar);
            int i = Theme.key_chat_outAudioSeekbarFill;
            seekBar.setColors(themedColor, themedColor2, getThemedColor(i), getThemedColor(i), getThemedColor(Theme.key_chat_outAudioSeekbarSelected));
            this.radialProgress.setColorKeys(Theme.key_chat_outLoader, Theme.key_chat_outLoaderSelected, Theme.key_chat_outMediaIcon, Theme.key_chat_outMediaIconSelected);
            return;
        }
        this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
        SeekBar seekBar2 = this.seekBar;
        int themedColor3 = getThemedColor(Theme.key_chat_inAudioSeekbar);
        int themedColor4 = getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
        int i2 = Theme.key_chat_inAudioSeekbarFill;
        seekBar2.setColors(themedColor3, themedColor4, getThemedColor(i2), getThemedColor(i2), getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
    }

    public void setColors(int i, int i2, int i3, int i4) {
        Text text = this.authorInfoText;
        if (text != null) {
            text.setColor(i2);
        }
        Text text2 = this.fileInfoText;
        if (text2 != null) {
            text2.setColor(i3);
        }
    }

    private void checkFileTexts(boolean z) {
        int iWidth = getBounds().width() - AndroidUtilities.dp(this.isExplanation ? 64.0f : 72.0f);
        if (this.lastFileNameWidth != iWidth || z) {
            this.lastFileNameWidth = iWidth;
            CharSequence charSequence = this.fileName;
            if (charSequence != null) {
                if (this.fileNameText == null) {
                    this.fileNameText = new Text(charSequence, 15.0f, AndroidUtilities.bold());
                }
                Text text = this.fileNameText;
                text.setText(TextUtils.ellipsize(this.fileName, text.paint, iWidth, TextUtils.TruncateAt.MIDDLE));
            }
            CharSequence charSequence2 = this.authorInfo;
            if (charSequence2 != null) {
                if (this.authorInfoText == null) {
                    this.authorInfoText = new Text(charSequence2, 14.0f);
                }
                Text text2 = this.authorInfoText;
                text2.setText(TextUtils.ellipsize(this.authorInfo, text2.paint, iWidth, TextUtils.TruncateAt.END));
            }
            CharSequence charSequence3 = this.fileInfo;
            if (charSequence3 != null) {
                if (this.fileInfoText == null) {
                    this.fileInfoText = new Text(charSequence3, 12.0f);
                }
                Text text3 = this.fileInfoText;
                text3.setText(TextUtils.ellipsize(this.fileInfo, text3.paint, iWidth, TextUtils.TruncateAt.END));
            }
            if (this.isVideo && this.videoDurationText == null) {
                this.videoDurationText = new Text(AndroidUtilities.formatLongDuration(this.videoDuration), 12.0f);
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.alpha == 0 || bounds.isEmpty()) {
            return;
        }
        checkFileTexts(false);
        if (this.isFile || this.isMusic) {
            int iDp = bounds.left + (this.isExplanation ? 0 : AndroidUtilities.dp(8.0f));
            int iDp2 = bounds.top + (this.isExplanation ? 0 : AndroidUtilities.dp(3.0f));
            int iDp3 = this.isMusic ? 0 : AndroidUtilities.dp(3.0f);
            Text text = this.fileNameText;
            if (text != null) {
                text.draw(canvas, AndroidUtilities.dp(56.0f) + iDp, iDp2 + iDp3 + AndroidUtilities.dp(15.0f));
            }
            if (this.isMusic) {
                float floatValue = this.animatorIsPlaying.getFloatValue();
                if (this.authorInfoText != null && floatValue < 1.0f) {
                    canvas.save();
                    float f = 1.0f - floatValue;
                    int i = iDp2 + iDp3;
                    canvas.scale(f, f, AndroidUtilities.dp(56.0f) + iDp, i + AndroidUtilities.dp(35.0f));
                    this.authorInfoText.setAlpha((int) (f * 255.0f));
                    this.authorInfoText.draw(canvas, AndroidUtilities.dp(56.0f) + iDp, i + AndroidUtilities.dp(35.0f));
                    canvas.restore();
                }
                if (floatValue > 0.0f) {
                    this.seekBar.setAlpha(floatValue);
                    this.seekBar.setSize(bounds.right - (AndroidUtilities.dp(56.0f) + iDp), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float fDp = AndroidUtilities.dp(45.0f) + iDp;
                    this.seekBarX = fDp;
                    float fDp2 = iDp2 + iDp3 + AndroidUtilities.dp(21.0f);
                    this.seekBarY = fDp2;
                    canvas.translate(fDp, fDp2);
                    this.seekBar.draw(canvas);
                    canvas.restore();
                }
            }
            Text text2 = this.fileInfoText;
            if (text2 != null) {
                text2.draw(canvas, AndroidUtilities.dp(56.0f) + iDp, iDp3 + iDp2 + AndroidUtilities.dp((this.isMusic ? 20 : 2) + 34));
            }
            this.radialProgress.setProgressRect(AndroidUtilities.dp(2.0f) + iDp, AndroidUtilities.dp(5.0f) + iDp2, iDp + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(44.0f), iDp2 + AndroidUtilities.dp(5.0f) + AndroidUtilities.dp(44.0f));
        } else {
            this.imageReceiver.setAlpha(this.alpha / 255.0f);
            this.imageReceiver.setImageCoords(bounds);
            this.imageReceiver.draw(canvas);
            if (this.isLocation && (drawable = this.redLocationIcon) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.redLocationIcon.getIntrinsicHeight() * 0.8f);
                int imageX = (int) (this.imageReceiver.getImageX() + ((this.imageReceiver.getImageWidth() - intrinsicWidth) / 2.0f));
                int imageY = (int) ((this.imageReceiver.getImageY() + ((this.imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight)) - (AndroidUtilities.dp(16.0f) * (1.0f - CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(this.imageReceiver.getCurrentAlpha()))));
                this.redLocationIcon.setAlpha((int) (Math.min(1.0f, this.imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f * this.imageReceiver.getAlpha()));
                this.redLocationIcon.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                this.redLocationIcon.draw(canvas);
            }
            this.radialProgress.setProgressRect(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), bounds.centerX() + AndroidUtilities.dp(22.0f), bounds.centerY() + AndroidUtilities.dp(22.0f));
            if (this.isVideo && this.videoDurationText != null) {
                canvas.drawRoundRect(bounds.left + AndroidUtilities.dp(6.0f), bounds.top + AndroidUtilities.dp(6.0f), bounds.left + this.videoDurationText.getCurrentWidth() + AndroidUtilities.dp(18.0f), bounds.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.durationBackgroundPaint);
                this.videoDurationText.draw(canvas, bounds.left + AndroidUtilities.dp(12.0f), bounds.top + AndroidUtilities.dp(15.0f));
            }
        }
        if (this.isLocation) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isSending()) {
            if (ImageLoader.getInstance().getFileProgressSizes(this.attachPath) == null) {
                this.radialProgress.setProgress(1.0f, true);
                setIcon(6);
            }
        } else if (!TextUtils.isEmpty(this.attachFileName) && FileLoader.getInstance(this.currentAccount).isLoadingFile(this.attachFileName)) {
            setIcon(3);
        } else {
            setIcon(getDefaultIcon());
        }
        this.radialProgress.draw(canvas);
    }

    public boolean isMusic() {
        return this.isMusic;
    }

    @Override
    public int getAlpha() {
        return this.alpha;
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    private int getDefaultIcon() {
        if (this.isMusic && this.animatorIsPlaying.getValue()) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.isVideo || this.isMusic) {
            return 0;
        }
        return this.isFile ? 5 : 4;
    }

    private void setIcon(int i) {
        if (this.lastIcon != i) {
            this.lastIcon = i;
            this.radialProgress.setIcon(i, true, true);
        }
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        setIcon(fMin < 1.0f ? 3 : getDefaultIcon());
        this.parent.invalidate();
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        setIcon(fMin < 1.0f ? 3 : getDefaultIcon());
        this.parent.invalidate();
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    public boolean isPlaying() {
        return this.animatorIsPlaying.getValue();
    }

    public void updatePlayingMessageProgress() {
        updatePlayingMessageProgress(true);
    }

    private void updatePlayingMessageProgress(boolean z) {
        int i;
        if (!this.isMusic || this.messageObject == null) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        boolean zIsCurrentPlayingMessageMusic = isCurrentPlayingMessageMusic();
        this.animatorIsPlaying.setValue(zIsCurrentPlayingMessageMusic, z);
        if (playingMessageObject == null || !zIsCurrentPlayingMessageMusic) {
            i = 0;
        } else {
            i = playingMessageObject.audioProgressSec;
            if (!this.seekBar.isDragging()) {
                this.seekBar.setProgress(playingMessageObject.audioProgress);
                this.seekBar.setBufferedProgress(playingMessageObject.bufferedProgress);
            }
            this.seekBar.updateTimestamps(playingMessageObject, null);
        }
        if (this.lastTime != i) {
            this.lastTime = i;
            this.fileInfo = AndroidUtilities.formatShortDuration(i, (int) this.musicDuration);
            checkFileTexts(true);
            this.parent.invalidate();
        }
    }

    private boolean isCurrentPlayingMessageMusic() {
        return this.isMusic && MediaController.getInstance().isPlayingMessage(this.messageObject) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.isExplanation;
    }

    private int getCurrentPlayingProgress() {
        if (isCurrentPlayingMessageMusic()) {
            return MediaController.getInstance().getPlayingMessageObject().audioProgressSec;
        }
        return 0;
    }

    public boolean isDraggingSeekBar() {
        return this.seekBar.isDragging();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i);
    }

    @Override
    public void onSeekBarDrag(float f) {
        if (isCurrentPlayingMessageMusic()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f);
            updatePlayingMessageProgress();
        }
    }

    @Override
    public void onSeekBarContinuousDrag(float f) {
        if (isCurrentPlayingMessageMusic()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f);
            updatePlayingMessageProgress();
        }
    }

    @Override
    public void onSeekBarPressed() {
        this.parent.requestDisallowInterceptTouchEvent(true);
    }

    @Override
    public void onSeekBarReleased() {
        this.parent.requestDisallowInterceptTouchEvent(false);
    }
}

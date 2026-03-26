package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.Locale;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.Text;

public class PollContentDrawable extends Drawable implements DownloadController.FileDownloadProgressListener, SeekBar.SeekBarDelegate {
    private final int TAG;
    private final BoolAnimator animatorIsPlaying;
    private String attachFileName;
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
    private boolean isMusic;
    private boolean isVideo;
    private int lastIcon;
    int lastTime;
    private TLRPC.MessageMedia media;
    private int mediaHeight;
    private int mediaWidth;
    private MessageObject messageObject;
    private double musicDuration;
    private final ViewGroup parent;
    private RadialProgress2 radialProgress;
    private final SeekBar seekBar;
    private float seekBarX;
    private float seekBarY;
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
        this.messageObject = messageObject;
        this.media = messageMedia;
        this.isFile = false;
        this.isMusic = false;
        this.isVideo = false;
        this.musicDuration = 0.0d;
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
        updatePlayingMessageProgress(z);
    }

    public TLRPC.MessageMedia getMedia() {
        return this.media;
    }

    public boolean isHasMedia() {
        return this.hasMedia;
    }

    private boolean setMediaImpl(TLRPC.MessageMedia messageMedia, Object obj, int i, String str) {
        TLRPC.Document document;
        double d;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, i, false, closestPhotoSizeWithSize, true);
                if (closestPhotoSizeWithSize2 == null) {
                    return false;
                }
                int i2 = closestPhotoSizeWithSize2.w;
                this.mediaWidth = i2;
                int i3 = closestPhotoSizeWithSize2.h;
                this.mediaHeight = i3;
                String str2 = String.format(Locale.US, "%d_%d", Integer.valueOf((int) (i2 / AndroidUtilities.density)), Integer.valueOf((int) (i3 / AndroidUtilities.density)));
                String str3 = str2 + "_b";
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), str2, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), str3, null, closestPhotoSizeWithSize2.size, null, obj, 1);
                return true;
            }
            if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                TLRPC.GeoPoint geoPoint = messageMedia.geo;
                if (geoPoint != null) {
                    this.mediaWidth = i;
                    int i4 = (i * 9) / 16;
                    this.mediaHeight = i4;
                    float f = AndroidUtilities.density;
                    this.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i / f), (int) (i4 / f), 15, Math.min(2, (int) Math.ceil(f)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, obj, 0);
                    return true;
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) == null) {
                    return false;
                }
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isMusicDocument(document)) {
                    this.isMusic = true;
                    this.fileName = MessageObject.getMusicTitle(document, true);
                    this.authorInfo = MessageObject.getMusicAuthor(document, true);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i5);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i5++;
                    }
                    if (MessageObject.isDocumentHasThumb(document)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                        this.radialProgress.setImageOverlay(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.messageObject);
                    } else {
                        String artworkUrl = MessageObject.getArtworkUrl(document, true);
                        if (!TextUtils.isEmpty(artworkUrl)) {
                            this.radialProgress.setImageOverlay(artworkUrl);
                        } else {
                            this.radialProgress.setImageOverlay(null, null, null);
                        }
                    }
                    this.musicDuration = d;
                    this.fileInfo = AndroidUtilities.formatShortDuration(getCurrentPlayingProgress(), (int) this.musicDuration);
                    checkFileTexts(true);
                } else if (MessageObject.isVideoDocument(document)) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i, false, closestPhotoSizeWithSize4, true);
                    if (closestPhotoSizeWithSize5 != null) {
                        int i6 = closestPhotoSizeWithSize5.w;
                        this.mediaWidth = i6;
                        int i7 = closestPhotoSizeWithSize5.h;
                        this.mediaHeight = i7;
                        String str4 = String.format(Locale.US, "%d_%d", Integer.valueOf((int) (i6 / AndroidUtilities.density)), Integer.valueOf((int) (i7 / AndroidUtilities.density)));
                        this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize5, document), str4, ImageLocation.getForObject(closestPhotoSizeWithSize4, document), str4 + "_b", null, closestPhotoSizeWithSize5.size, null, obj, 1);
                    }
                } else {
                    this.isFile = true;
                    this.fileName = FileLoader.getDocumentFileName(document);
                    String str5 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                    this.fileInfo = str5;
                    this.authorInfo = str5;
                    checkFileTexts(true);
                }
                return true;
            }
        }
        return false;
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
        return Math.min(Math.round(this.mediaHeight * (i / r0)), (i * 4) / 3);
    }

    public void checkColors(boolean z) {
        Text text = this.fileNameText;
        if (text != null) {
            text.setColor(Theme.getColor(z ? Theme.key_chat_outFileNameText : Theme.key_chat_inFileNameText));
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
            if (this.fileNameText == null) {
                this.fileNameText = new Text(this.fileName, 15.0f, AndroidUtilities.bold());
            }
            if (this.authorInfoText == null) {
                this.authorInfoText = new Text(this.authorInfo, 14.0f);
            }
            if (this.fileInfoText == null) {
                this.fileInfoText = new Text(this.fileInfo, 12.0f);
            }
            Text text = this.fileNameText;
            float f = iWidth;
            text.setText(TextUtils.ellipsize(this.fileName, text.paint, f, TextUtils.TruncateAt.MIDDLE));
            Text text2 = this.authorInfoText;
            CharSequence charSequence = this.authorInfo;
            TextPaint textPaint = text2.paint;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            text2.setText(TextUtils.ellipsize(charSequence, textPaint, f, truncateAt));
            Text text3 = this.fileInfoText;
            text3.setText(TextUtils.ellipsize(this.fileInfo, text3.paint, f, truncateAt));
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.alpha == 0 || bounds.isEmpty()) {
            return;
        }
        if (this.isFile || this.isMusic) {
            int iDp = bounds.left + (this.isExplanation ? 0 : AndroidUtilities.dp(8.0f));
            int iDp2 = bounds.top + (this.isExplanation ? 0 : AndroidUtilities.dp(3.0f));
            int iDp3 = !this.isMusic ? AndroidUtilities.dp(3.0f) : 0;
            checkFileTexts(false);
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
                    canvas.scale(f, f, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(35.0f) + i);
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
            this.radialProgress.setProgressRect(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), bounds.centerX() + AndroidUtilities.dp(22.0f), bounds.centerY() + AndroidUtilities.dp(22.0f));
        }
        if (!TextUtils.isEmpty(this.attachFileName) && FileLoader.getInstance(this.currentAccount).isLoadingFile(this.attachFileName)) {
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

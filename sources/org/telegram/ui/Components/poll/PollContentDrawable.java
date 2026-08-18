package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.Locale;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
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
    private int fileButtonX;
    private int fileButtonY;
    private CharSequence fileInfo;
    private Text fileInfoText;
    private CharSequence fileName;
    private Text fileNameText;
    private FileState fileState;
    private boolean hasMedia;
    public final ImageReceiver imageReceiver;
    private final boolean isExplanation;
    private boolean isFile;
    private boolean isLocation;
    private boolean isMusic;
    private boolean isVideo;
    private int lastIcon;
    private int lastIconMini;
    int lastTime;
    private ClipRoundedDrawable locationLoadingThumb;
    private SvgHelper.SvgDrawable locationSvgThumb;
    private TLRPC.MessageMedia media;
    private int mediaHeight;
    private int mediaWidth;
    private MessageObject messageObject;
    private boolean miniButtonPressed;
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

    public boolean miniButtonOnTouch(int i, float f, float f2) {
        if (!this.isMusic || this.lastIconMini == 4) {
            return false;
        }
        if (i == 0) {
            int iDp = AndroidUtilities.dp(36.0f);
            int iDp2 = AndroidUtilities.dp(27.0f);
            int i2 = this.fileButtonX + iDp2;
            if (f >= i2 && f <= i2 + iDp) {
                int i3 = this.fileButtonY + iDp2;
                if (f2 >= i3 && f2 <= i3 + iDp) {
                    this.miniButtonPressed = true;
                    return true;
                }
            }
        }
        boolean z = this.miniButtonPressed;
        if (z) {
            if (i == 1) {
                FileState fileState = this.fileState;
                if (fileState != null) {
                    if (fileState.isLoading()) {
                        this.fileState.downloadCancel();
                    } else if (!this.fileState.isExists()) {
                        this.fileState.downloadStart();
                    }
                    checkFileState();
                }
                this.miniButtonPressed = false;
                return true;
            }
            if (i == 3) {
                this.miniButtonPressed = false;
                return true;
            }
        }
        return z;
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
        this.fileState = null;
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
            setIconMini(4, false);
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
        int i2;
        double d;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true, closestPhotoSizeWithSize, true);
                if (closestPhotoSizeWithSize2 == null) {
                    return false;
                }
                int i3 = closestPhotoSizeWithSize2.w;
                this.mediaWidth = i3;
                int i4 = closestPhotoSizeWithSize2.h;
                this.mediaHeight = i4;
                String str2 = String.format(Locale.US, "%d_%d", Integer.valueOf((int) (i3 / AndroidUtilities.density)), Integer.valueOf((int) (i4 / AndroidUtilities.density)));
                String str3 = str2 + "_b";
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), str2, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), str3, null, closestPhotoSizeWithSize2.size, null, obj, 1);
                return true;
            }
            if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                if (messageMedia.geo != null) {
                    if (this.locationSvgThumb == null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, Theme.key_chat_outLocationIcon, (Theme.isCurrentThemeDark() ? 3 : 6) * 0.12f);
                        this.locationSvgThumb = svgThumb;
                        svgThumb.setAspectCenter(true);
                        this.locationLoadingThumb = new ClipRoundedDrawable(this.locationSvgThumb);
                    }
                    if (this.redLocationIcon == null) {
                        this.redLocationIcon = this.parent.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.isLocation = true;
                    this.mediaWidth = i;
                    int i5 = (i * 9) / 16;
                    this.mediaHeight = i5;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f = AndroidUtilities.density;
                    this.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i / f), (int) (i5 / f), 15, Math.min(2, (int) Math.ceil(f)))), (String) null, (ImageLocation) null, (String) null, this.locationLoadingThumb, obj, 0);
                    return true;
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) == null) {
                    return false;
                }
                this.fileState = new FileState(this.currentAccount, this.messageObject, document, str);
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isMusicDocument(document)) {
                    this.isMusic = true;
                    this.fileName = MessageObject.getMusicTitle(document, true);
                    this.authorInfo = MessageObject.getMusicAuthor(document, true);
                    int i6 = 0;
                    while (true) {
                        if (i6 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i6);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i6++;
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
                } else if (MessageObject.isVideoDocument(document)) {
                    this.videoDuration = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                    this.isVideo = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                    float f2 = i;
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f2 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                    ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                    int i7 = (int) (f2 / AndroidUtilities.density);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i8 = closestPhotoSizeWithSize4.w;
                        this.mediaWidth = i8;
                        int i9 = closestPhotoSizeWithSize4.h;
                        this.mediaHeight = i9;
                        if (i8 != 0) {
                            i2 = (i9 * i7) / i8;
                        } else {
                            i2 = i7;
                        }
                    } else if (closestPhotoSizeWithSize5 != null) {
                        int i10 = closestPhotoSizeWithSize5.w;
                        this.mediaWidth = i10;
                        int i11 = closestPhotoSizeWithSize5.h;
                        this.mediaHeight = i11;
                        if (i10 != 0) {
                            i2 = (i11 * i7) / i10;
                        } else {
                            i2 = i7;
                        }
                    } else {
                        i2 = i7;
                    }
                    String str4 = i7 + "_" + i2;
                    this.imageReceiver.setImage(null, str4, forDocument, str4, forDocument2, str4, null, 0L, null, obj, 0);
                } else {
                    this.isFile = true;
                    this.fileName = FileLoader.getDocumentFileName(document);
                    String str5 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                    this.fileInfo = str5;
                    this.authorInfo = str5;
                }
                checkFileTexts(true);
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
        int i2 = this.mediaWidth;
        if (i2 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round(this.mediaHeight * (i / i2)), this.isExplanation ? (i * 4) / 5 : (i * 5) / 4);
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
            RadialProgress2 radialProgress2 = this.radialProgress;
            int iDp4 = AndroidUtilities.dp(2.0f) + iDp;
            this.fileButtonX = iDp4;
            int iDp5 = AndroidUtilities.dp(5.0f) + iDp2;
            this.fileButtonY = iDp5;
            radialProgress2.setProgressRect(iDp4, iDp5, iDp + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(44.0f), iDp2 + AndroidUtilities.dp(5.0f) + AndroidUtilities.dp(44.0f));
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
                if (this.isMusic) {
                    setIconMini(6, true);
                } else {
                    setIcon(6, true);
                }
            }
        } else {
            FileState fileState = this.fileState;
            if (fileState != null && fileState.isLoading()) {
                if (this.isMusic) {
                    setIconMini(3, true);
                } else {
                    setIcon(3, true);
                }
            } else if (this.isMusic) {
                FileState fileState2 = this.fileState;
                setIconMini((fileState2 == null || !fileState2.isExists()) ? 2 : 4, true);
            } else {
                setIcon(getDefaultIcon(), true);
            }
        }
        if (this.isMusic) {
            setIcon(getDefaultIcon(), true);
        }
        this.radialProgress.draw(canvas);
    }

    public boolean isFile() {
        return this.isFile;
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
        if (!this.isFile) {
            return 4;
        }
        FileState fileState = this.fileState;
        return (fileState == null || !fileState.isExists()) ? 2 : 5;
    }

    private void setIcon(int i, boolean z) {
        if (this.lastIcon != i) {
            this.lastIcon = i;
            this.radialProgress.setIcon(i, true, z);
        }
    }

    private void setIconMini(int i, boolean z) {
        if (this.lastIconMini != i) {
            this.lastIconMini = i;
            this.radialProgress.setMiniIcon(i, true, z);
        }
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        checkFileState();
    }

    @Override
    public void onSuccessDownload(String str) {
        checkFileState();
    }

    public void checkFileState() {
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        this.parent.invalidate();
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        if (this.isMusic) {
            setIconMini(fMin >= 1.0f ? 4 : 3, true);
        } else {
            setIcon(fMin >= 1.0f ? getDefaultIcon() : 3, true);
        }
        this.parent.invalidate();
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        if (this.isMusic) {
            setIconMini(fMin >= 1.0f ? 4 : 3, true);
        } else {
            setIcon(fMin >= 1.0f ? getDefaultIcon() : 3, true);
        }
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
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * ((double) f));
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

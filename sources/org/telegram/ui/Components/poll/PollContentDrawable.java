package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
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
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.Text;

public final class PollContentDrawable extends Drawable implements DownloadController.FileDownloadProgressListener, SeekBar.SeekBarDelegate {
    public final int TAG;
    public final BoolAnimator animatorIsPlaying;
    public String attachFileName;
    public String attachPath;
    public String authorInfo;
    public Text authorInfoText;
    public final int currentAccount;
    public int fileButtonX;
    public int fileButtonY;
    public String fileInfo;
    public Text fileInfoText;
    public String fileName;
    public Text fileNameText;
    public FileState fileState;
    public boolean hasMedia;
    public final ImageReceiver imageReceiver;
    public final boolean isExplanation;
    public boolean isFile;
    public boolean isLocation;
    public boolean isMusic;
    public boolean isVideo;
    public int lastIcon;
    public int lastIconMini;
    public int lastTime;
    public ClipRoundedDrawable locationLoadingThumb;
    public SvgHelper.SvgDrawable locationSvgThumb;
    public TLRPC.MessageMedia media;
    public int mediaHeight;
    public int mediaWidth;
    public MessageObject messageObject;
    public boolean miniButtonPressed;
    public double musicDuration;
    public final ChatMessageCell parent;
    public final RadialProgress2 radialProgress;
    public Drawable redLocationIcon;
    public final SeekBar seekBar;
    public float seekBarX;
    public float seekBarY;
    public int videoDuration;
    public Text videoDurationText;
    public final Paint durationBackgroundPaint = new Paint(1);
    public int lastFileNameWidth = 0;
    public int alpha = 255;

    public PollContentDrawable(int i, ChatMessageCell chatMessageCell, Theme.ResourcesProvider resourcesProvider, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(chatMessageCell);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.currentAccount = i;
        this.isExplanation = z;
        this.radialProgress = new RadialProgress2(resourcesProvider, chatMessageCell);
        this.parent = chatMessageCell;
        SeekBar seekBar = new SeekBar(chatMessageCell);
        this.seekBar = seekBar;
        seekBar.delegate = this;
        this.animatorIsPlaying = new BoolAnimator(180L, chatMessageCell, AnimatorUtils.DECELERATE_INTERPOLATOR);
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
    }

    public final void attach() {
        this.imageReceiver.onAttachedToWindow();
        this.radialProgress.overlayImageView.onAttachedToWindow();
    }

    public final void checkColors(boolean z) {
        Text text = this.fileNameText;
        if (text != null) {
            text.paint.setColor(Theme.getColor(null, z ? Theme.key_chat_outFileNameText : Theme.key_chat_inFileNameText, false));
        }
        this.durationBackgroundPaint.setColor(1711276032);
        Text text2 = this.videoDurationText;
        if (text2 != null) {
            text2.paint.setColor(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.locationSvgThumb;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z ? Theme.key_chat_outLocationIcon : Theme.key_chat_inLocationIcon);
        }
        boolean z2 = this.isMusic;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (!z2 && !this.isFile) {
            int i = Theme.key_chat_mediaLoaderPhoto;
            int i2 = Theme.key_chat_mediaLoaderPhotoSelected;
            int i3 = Theme.key_chat_mediaLoaderPhotoIcon;
            int i4 = Theme.key_chat_mediaLoaderPhotoIconSelected;
            radialProgress2.circleColorKey = i;
            radialProgress2.circlePressedColorKey = i2;
            radialProgress2.iconColorKey = i3;
            radialProgress2.iconPressedColorKey = i4;
            return;
        }
        SeekBar seekBar = this.seekBar;
        if (z) {
            int color = Theme.getColor(null, Theme.key_chat_outAudioSeekbar, false);
            int color2 = Theme.getColor(null, Theme.key_chat_outAudioCacheSeekbar, false);
            int i5 = Theme.key_chat_outAudioSeekbarFill;
            seekBar.setColors(color, color2, Theme.getColor(null, i5, false), Theme.getColor(null, i5, false), Theme.getColor(null, Theme.key_chat_outAudioSeekbarSelected, false));
            int i6 = Theme.key_chat_outLoader;
            int i7 = Theme.key_chat_outLoaderSelected;
            int i8 = Theme.key_chat_outMediaIcon;
            int i9 = Theme.key_chat_outMediaIconSelected;
            radialProgress2.circleColorKey = i6;
            radialProgress2.circlePressedColorKey = i7;
            radialProgress2.iconColorKey = i8;
            radialProgress2.iconPressedColorKey = i9;
            return;
        }
        int i10 = Theme.key_chat_inLoader;
        int i11 = Theme.key_chat_inLoaderSelected;
        int i12 = Theme.key_chat_inMediaIcon;
        int i13 = Theme.key_chat_inMediaIconSelected;
        radialProgress2.circleColorKey = i10;
        radialProgress2.circlePressedColorKey = i11;
        radialProgress2.iconColorKey = i12;
        radialProgress2.iconPressedColorKey = i13;
        int color3 = Theme.getColor(null, Theme.key_chat_inAudioSeekbar, false);
        int color4 = Theme.getColor(null, Theme.key_chat_inAudioCacheSeekbar, false);
        int i14 = Theme.key_chat_inAudioSeekbarFill;
        seekBar.setColors(color3, color4, Theme.getColor(null, i14, false), Theme.getColor(null, i14, false), Theme.getColor(null, Theme.key_chat_inAudioSeekbarSelected, false));
    }

    public final void checkFileTexts(boolean z) {
        int iWidth = getBounds().width() - AndroidUtilities.dp(this.isExplanation ? 64.0f : 72.0f);
        if (this.lastFileNameWidth != iWidth || z) {
            this.lastFileNameWidth = iWidth;
            String str = this.fileName;
            if (str != null) {
                if (this.fileNameText == null) {
                    this.fileNameText = new Text(str, 15.0f, AndroidUtilities.bold());
                }
                Text text = this.fileNameText;
                text.setText(TextUtils.ellipsize(this.fileName, text.paint, iWidth, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.authorInfo;
            if (str2 != null) {
                if (this.authorInfoText == null) {
                    this.authorInfoText = new Text(str2, 14.0f, null);
                }
                Text text2 = this.authorInfoText;
                text2.setText(TextUtils.ellipsize(this.authorInfo, text2.paint, iWidth, TextUtils.TruncateAt.END));
            }
            String str3 = this.fileInfo;
            if (str3 != null) {
                if (this.fileInfoText == null) {
                    this.fileInfoText = new Text(str3, 12.0f, null);
                }
                Text text3 = this.fileInfoText;
                text3.setText(TextUtils.ellipsize(this.fileInfo, text3.paint, iWidth, TextUtils.TruncateAt.END));
            }
            if (this.isVideo && this.videoDurationText == null) {
                this.videoDurationText = new Text(AndroidUtilities.formatLongDuration(this.videoDuration), 12.0f, null);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.alpha == 0 || bounds.isEmpty()) {
            return;
        }
        checkFileTexts(false);
        boolean z = this.isFile;
        int i = 2;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (z || this.isMusic) {
            int i2 = bounds.left;
            boolean z2 = this.isExplanation;
            int iDp = i2 + (z2 ? 0 : AndroidUtilities.dp(8.0f));
            int iDp2 = bounds.top + (z2 ? 0 : AndroidUtilities.dp(3.0f));
            int iDp3 = this.isMusic ? 0 : AndroidUtilities.dp(3.0f);
            Text text = this.fileNameText;
            if (text != null) {
                text.draw(canvas, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(15.0f) + iDp2 + iDp3, 1.0f);
            }
            if (this.isMusic) {
                float f = this.animatorIsPlaying.floatValue;
                if (this.authorInfoText != null && f < 1.0f) {
                    canvas.save();
                    float f2 = 1.0f - f;
                    int i3 = iDp2 + iDp3;
                    canvas.scale(f2, f2, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(35.0f) + i3);
                    this.authorInfoText.paint.setAlpha((int) (f2 * 255.0f));
                    this.authorInfoText.draw(canvas, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(35.0f) + i3, 1.0f);
                    canvas.restore();
                }
                if (f > 0.0f) {
                    SeekBar seekBar = this.seekBar;
                    seekBar.alpha = f;
                    seekBar.setSize(OKLCH.m$1(56.0f, iDp, bounds.right), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float fDp = AndroidUtilities.dp(45.0f) + iDp;
                    this.seekBarX = fDp;
                    float fDp2 = AndroidUtilities.dp(21.0f) + iDp2 + iDp3;
                    this.seekBarY = fDp2;
                    canvas.translate(fDp, fDp2);
                    seekBar.draw(canvas);
                    canvas.restore();
                }
            }
            Text text2 = this.fileInfoText;
            if (text2 != null) {
                text2.draw(canvas, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp((this.isMusic ? 20 : 2) + 34) + iDp3 + iDp2, 1.0f);
            }
            int iDp4 = AndroidUtilities.dp(2.0f) + iDp;
            this.fileButtonX = iDp4;
            int iDp5 = AndroidUtilities.dp(5.0f) + iDp2;
            this.fileButtonY = iDp5;
            radialProgress2.setProgressRect(iDp4, iDp5, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + iDp, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + iDp2);
        } else {
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setAlpha(this.alpha / 255.0f);
            imageReceiver.setImageCoords(bounds);
            imageReceiver.draw(canvas);
            if (this.isLocation && (drawable = this.redLocationIcon) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.redLocationIcon.getIntrinsicHeight() * 0.8f);
                int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                this.redLocationIcon.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                this.redLocationIcon.setBounds(iM, imageHeight, intrinsicWidth + iM, intrinsicHeight + imageHeight);
                this.redLocationIcon.draw(canvas);
            }
            radialProgress2.setProgressRect(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
            if (this.isVideo && this.videoDurationText != null) {
                canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.videoDurationText.width + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.durationBackgroundPaint);
                this.videoDurationText.draw(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top, 1.0f);
            }
        }
        if (this.isLocation) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isSending()) {
            FileState fileState = this.fileState;
            if (fileState == null || !fileState.isLoading) {
                if (this.isMusic) {
                    if (fileState != null && fileState.isExists) {
                        i = 4;
                    }
                    setIconMini(i, true);
                } else {
                    setIcon$1(getDefaultIcon());
                }
            } else if (this.isMusic) {
                setIconMini(3, true);
            } else {
                setIcon$1(3);
            }
        } else if (ImageLoader.getInstance().getFileProgressSizes(this.attachPath) == null) {
            radialProgress2.setProgress(1.0f, true);
            if (this.isMusic) {
                setIconMini(6, true);
            } else {
                setIcon$1(6);
            }
        }
        if (this.isMusic) {
            setIcon$1(getDefaultIcon());
        }
        radialProgress2.draw(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    public final int getDefaultIcon() {
        boolean z = this.isMusic;
        if (z && this.animatorIsPlaying.value) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.isVideo || z) {
            return 0;
        }
        if (!this.isFile) {
            return 4;
        }
        FileState fileState = this.fileState;
        return (fileState == null || !fileState.isExists) ? 2 : 5;
    }

    public final int getHeightForWidth(int i) {
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
        return Math.min(Math.round((i / i2) * this.mediaHeight), this.isExplanation ? (i * 4) / 5 : (i * 5) / 4);
    }

    @Override
    public final int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final boolean isCurrentPlayingMessageMusic() {
        return this.isMusic && MediaController.getInstance().isPlayingMessage(this.messageObject) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.isExplanation;
    }

    public final boolean miniButtonOnTouch(float f, float f2, int i) {
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
                    boolean z2 = fileState.isLoading;
                    TLRPC.Document document = fileState.document;
                    int i4 = fileState.currentAccount;
                    if (z2) {
                        FileLoader.getInstance(i4).cancelLoadFile(document);
                        fileState.checkState();
                    } else if (!fileState.isExists) {
                        FileLoader.getInstance(i4).loadFile(document, fileState.messageObject, 2, 0);
                        fileState.checkState();
                    }
                    FileState fileState2 = this.fileState;
                    if (fileState2 != null) {
                        fileState2.checkState();
                    }
                    this.parent.invalidate();
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

    @Override
    public final void onFailedDownload(String str, boolean z) {
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        this.parent.invalidate();
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        if (this.isMusic) {
            setIconMini(fMin >= 1.0f ? 4 : 3, true);
        } else {
            setIcon$1(fMin >= 1.0f ? getDefaultIcon() : 3);
        }
        this.parent.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.radialProgress.setProgress(fMin, true);
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        if (this.isMusic) {
            setIconMini(fMin >= 1.0f ? 4 : 3, true);
        } else {
            setIcon$1(fMin >= 1.0f ? getDefaultIcon() : 3);
        }
        this.parent.invalidate();
    }

    @Override
    public final void onSeekBarContinuousDrag(float f) {
        if (isCurrentPlayingMessageMusic()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * ((double) f));
            updatePlayingMessageProgress(true);
        }
    }

    @Override
    public final void onSeekBarDrag(float f) {
        if (isCurrentPlayingMessageMusic()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f);
            updatePlayingMessageProgress(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        FileState fileState = this.fileState;
        if (fileState != null) {
            fileState.checkState();
        }
        this.parent.invalidate();
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setIcon$1(int i) {
        if (this.lastIcon != i) {
            this.lastIcon = i;
            this.radialProgress.setIcon(i, true, true);
        }
    }

    public final void setIconMini(int i, boolean z) {
        if (this.lastIconMini != i) {
            this.lastIconMini = i;
            this.radialProgress.setMiniIcon(i, true, z);
        }
    }

    public final void setMedia(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, int i, String str, boolean z) {
        int i2;
        boolean z2;
        TLRPC.Document document;
        boolean z3;
        int i3;
        double d;
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
        ImageReceiver imageReceiver = this.imageReceiver;
        int i4 = this.currentAccount;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            i2 = i4;
            radialProgress2 = radialProgress2;
            z2 = false;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true, closestPhotoSizeWithSize, true);
            if (closestPhotoSizeWithSize2 != null) {
                int i5 = closestPhotoSizeWithSize2.w;
                this.mediaWidth = i5;
                int i6 = closestPhotoSizeWithSize2.h;
                this.mediaHeight = i6;
                Locale locale = Locale.US;
                float f = AndroidUtilities.density;
                String str3 = ((int) (i5 / f)) + "_" + ((int) (i6 / f));
                String strConcat = str3.concat("_b");
                this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), str3, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), strConcat, null, closestPhotoSizeWithSize2.size, null, messageObject2, 1);
                i2 = i4;
                radialProgress2 = radialProgress2;
                z2 = true;
            }
            i2 = i4;
            radialProgress2 = radialProgress2;
            z2 = false;
        } else {
            if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                i2 = i4;
                radialProgress2 = radialProgress2;
                if (messageMedia.geo != null) {
                    if (this.locationSvgThumb == null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, Theme.key_chat_outLocationIcon, (Theme.currentTheme.isDark() ? 3 : 6) * 0.12f);
                        this.locationSvgThumb = svgThumb;
                        svgThumb.setAspectCenter(true);
                        this.locationLoadingThumb = new ClipRoundedDrawable(this.locationSvgThumb);
                    }
                    if (this.redLocationIcon == null) {
                        this.redLocationIcon = this.parent.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.isLocation = true;
                    this.mediaWidth = i;
                    int i7 = (i * 9) / 16;
                    this.mediaHeight = i7;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f2 = AndroidUtilities.density;
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i / f2), (int) (i7 / f2), 15, Math.min(2, (int) Math.ceil(f2)))), (String) null, (ImageLocation) null, (String) null, this.locationLoadingThumb, messageObject2, 0);
                } else {
                    z2 = false;
                }
            } else {
                if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                    this.fileState = new FileState(i4, messageObject, document, str);
                    this.attachFileName = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    if (MessageObject.isMusicDocument(document)) {
                        this.isMusic = true;
                        this.fileName = MessageObject.getMusicTitle(document, true);
                        this.authorInfo = MessageObject.getMusicAuthor(document, true);
                        int i8 = 0;
                        while (true) {
                            if (i8 >= document.attributes.size()) {
                                d = 0.0d;
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i8);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                d = documentAttribute.duration;
                                break;
                            }
                            i8++;
                        }
                        if (MessageObject.isDocumentHasThumb(document)) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                            radialProgress2.setImageOverlay(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.messageObject);
                        } else {
                            String artworkUrl = MessageObject.getArtworkUrl(document, true);
                            if (TextUtils.isEmpty(artworkUrl)) {
                                radialProgress2.setImageOverlay(null, null, null);
                            } else {
                                radialProgress2.setImageOverlay(artworkUrl);
                            }
                        }
                        this.musicDuration = d;
                        this.fileInfo = AndroidUtilities.formatShortDuration(isCurrentPlayingMessageMusic() ? MediaController.getInstance().getPlayingMessageObject().audioProgressSec : 0, (int) this.musicDuration);
                        i2 = i4;
                        z3 = true;
                    } else if (MessageObject.isVideoDocument(document)) {
                        this.videoDuration = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                        this.isVideo = true;
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        float f3 = i;
                        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f3 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                        int i9 = (int) (f3 / AndroidUtilities.density);
                        if (closestPhotoSizeWithSize4 != null) {
                            int i10 = closestPhotoSizeWithSize4.w;
                            this.mediaWidth = i10;
                            int i11 = closestPhotoSizeWithSize4.h;
                            this.mediaHeight = i11;
                            if (i10 != 0) {
                                i3 = (i11 * i9) / i10;
                            } else {
                                i3 = i9;
                            }
                        } else if (closestPhotoSizeWithSize5 != null) {
                            int i12 = closestPhotoSizeWithSize5.w;
                            this.mediaWidth = i12;
                            int i13 = closestPhotoSizeWithSize5.h;
                            this.mediaHeight = i13;
                            if (i12 != 0) {
                                i3 = (i13 * i9) / i12;
                            } else {
                                i3 = i9;
                            }
                        } else {
                            i3 = i9;
                        }
                        String strM = DiffUtil.m(i9, i3, "_");
                        z3 = true;
                        i2 = i4;
                        imageReceiver.setImage(null, strM, forDocument, strM, forDocument2, strM, null, 0L, null, messageObject2, 0);
                    } else {
                        i2 = i4;
                        z3 = true;
                        this.isFile = true;
                        this.fileName = FileLoader.getDocumentFileName(document);
                        String str4 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                        this.fileInfo = str4;
                        this.authorInfo = str4;
                    }
                    checkFileTexts(z3);
                }
                i2 = i4;
                radialProgress2 = radialProgress2;
                z2 = false;
            }
            z2 = true;
        }
        this.hasMedia = z2;
        if (!z2) {
            imageReceiver.clearImage();
        }
        if (!TextUtils.equals(str2, this.attachFileName)) {
            if (!TextUtils.isEmpty(str2)) {
                DownloadController.getInstance(i2).removeLoadingFileObserver(this);
            }
            if (!TextUtils.isEmpty(this.attachFileName)) {
                DownloadController.getInstance(i2).addLoadingFileObserver(this.attachFileName, this);
            }
        }
        if (!this.isMusic) {
            radialProgress2.setImageOverlay(null, null, null);
            setIconMini(4, false);
        }
        updatePlayingMessageProgress(z);
    }

    public final void updatePlayingMessageProgress(boolean z) {
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
            SeekBar seekBar = this.seekBar;
            if (!seekBar.pressed) {
                seekBar.setProgress(playingMessageObject.audioProgress);
                seekBar.bufferedProgress = playingMessageObject.bufferedProgress;
            }
            seekBar.updateTimestamps(playingMessageObject);
        }
        if (this.lastTime != i) {
            this.lastTime = i;
            this.fileInfo = AndroidUtilities.formatShortDuration(i, (int) this.musicDuration);
            checkFileTexts(true);
            this.parent.invalidate();
        }
    }
}

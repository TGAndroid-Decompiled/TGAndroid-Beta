package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMediaPreview;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Stars.StarsIntroActivity;
public class GroupMedia {
    private final AnimatedFloat animatedHidden;
    public boolean attached;
    private Bitmap blurBitmap;
    private int blurBitmapHeight;
    private int blurBitmapMessageId;
    private Paint blurBitmapPaint;
    private int blurBitmapState;
    private int blurBitmapWidth;
    private final ButtonBounce bounce;
    private Text buttonText;
    private long buttonTextPrice;
    public final ChatMessageCell cell;
    public int height;
    public boolean hidden;
    private GroupedMessages layout;
    private LoadingDrawable loadingDrawable;
    public int maxWidth;
    private int overrideWidth;
    private boolean pressButton;
    private MediaHolder pressHolder;
    private Text priceText;
    private long priceTextPrice;
    SpoilerEffect2 spoilerEffect;
    public int width;
    public int x;
    public int y;
    public final ArrayList<MediaHolder> holders = new ArrayList<>();
    private Path clipPath = new Path();
    private Path clipPath2 = new Path();
    private RectF clipRect = new RectF();

    public GroupMedia(ChatMessageCell chatMessageCell) {
        this.cell = chatMessageCell;
        this.spoilerEffect = SpoilerEffect2.getInstance(chatMessageCell);
        this.animatedHidden = new AnimatedFloat(chatMessageCell, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.bounce = new ButtonBounce(chatMessageCell);
    }

    public void setOverrideWidth(int i) {
        this.overrideWidth = i;
    }

    public void setMessageObject(MessageObject messageObject, boolean z, boolean z2) {
        TLRPC$Message tLRPC$Message;
        MessageObject.GroupedMessagePosition position;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPaidMedia) {
            TLRPC$TL_messageMediaPaidMedia tLRPC$TL_messageMediaPaidMedia = (TLRPC$TL_messageMediaPaidMedia) tLRPC$MessageMedia;
            if (this.layout == null) {
                this.layout = new GroupedMessages();
            }
            this.layout.medias.clear();
            this.layout.medias.addAll(tLRPC$TL_messageMediaPaidMedia.extended_media);
            this.layout.calculate();
            int i = this.overrideWidth;
            if (i > 0) {
                this.maxWidth = i;
            } else {
                if (AndroidUtilities.isTablet()) {
                    this.maxWidth = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                } else {
                    this.maxWidth = Math.min(this.cell.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((this.cell.checkNeedDrawShareButton(messageObject) ? 10 : 0) + 64);
                }
                if (this.cell.needDrawAvatar()) {
                    this.maxWidth -= AndroidUtilities.dp(52.0f);
                }
            }
            int i2 = 0;
            while (true) {
                if (i2 >= tLRPC$TL_messageMediaPaidMedia.extended_media.size()) {
                    break;
                }
                TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia = tLRPC$TL_messageMediaPaidMedia.extended_media.get(i2);
                MediaHolder mediaHolder = i2 >= this.holders.size() ? null : this.holders.get(i2);
                if (mediaHolder == null) {
                    MediaHolder mediaHolder2 = new MediaHolder(this.cell, messageObject, tLRPC$MessageExtendedMedia, tLRPC$TL_messageMediaPaidMedia.extended_media.size() != 1, (int) ((position.pw / 1000.0f) * this.maxWidth), (int) (this.layout.getPosition(tLRPC$MessageExtendedMedia).ph * this.layout.maxSizeHeight));
                    String str = tLRPC$MessageExtendedMedia.attachPath;
                    if (str != null) {
                        mediaHolder2.attachPath = str;
                    } else if (tLRPC$TL_messageMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
                        mediaHolder2.attachPath = tLRPC$Message2 != null ? tLRPC$Message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(mediaHolder2.attachPath)) {
                        DownloadController.getInstance(this.cell.currentAccount).addLoadingFileObserver(mediaHolder2.attachPath, messageObject, mediaHolder2);
                        if (messageObject.isSending()) {
                            mediaHolder2.radialProgress.setProgress(tLRPC$MessageExtendedMedia.uploadProgress, false);
                        }
                    }
                    if (this.cell.isCellAttachedToWindow()) {
                        mediaHolder2.attach();
                    }
                    this.holders.add(mediaHolder2);
                } else {
                    mediaHolder.updateMedia(tLRPC$MessageExtendedMedia, messageObject);
                }
                i2++;
            }
            int size = tLRPC$TL_messageMediaPaidMedia.extended_media.size();
            while (size < this.holders.size()) {
                MediaHolder mediaHolder3 = size >= this.holders.size() ? null : this.holders.get(size);
                if (mediaHolder3 != null) {
                    mediaHolder3.detach();
                    this.holders.remove(size);
                    size--;
                }
                size++;
            }
            updateHolders(messageObject);
            GroupedMessages groupedMessages = this.layout;
            this.width = (int) ((groupedMessages.width / 1000.0f) * this.maxWidth);
            this.height = (int) (groupedMessages.height * groupedMessages.maxSizeHeight);
            if (this.hidden) {
                long j = tLRPC$TL_messageMediaPaidMedia.stars_amount;
                this.buttonTextPrice = j;
                Text text = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f), 14.0f, AndroidUtilities.bold());
                this.buttonText = text;
                if (text.getCurrentWidth() > this.width - AndroidUtilities.dp(30.0f)) {
                    long j2 = tLRPC$TL_messageMediaPaidMedia.stars_amount;
                    this.buttonTextPrice = j2;
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) j2), 0.7f), 14.0f, AndroidUtilities.bold());
                }
            }
            if (this.priceText == null || this.priceTextPrice != tLRPC$TL_messageMediaPaidMedia.stars_amount) {
                long j3 = tLRPC$TL_messageMediaPaidMedia.stars_amount;
                this.priceTextPrice = j3;
                this.priceText = new Text(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j3), 0.9f), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public void updateHolders(org.telegram.messenger.MessageObject r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.GroupMedia.updateHolders(org.telegram.messenger.MessageObject):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            MediaHolder holderAt = getHolderAt(x, y);
            this.pressHolder = holderAt;
            this.pressButton = (holderAt == null || holderAt.radialProgress.getIcon() == 4 || !this.pressHolder.radialProgress.getProgressRect().contains(x, y)) ? false : true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            MediaHolder holderAt2 = getHolderAt(x, y);
            boolean z = (holderAt2 == null || holderAt2.radialProgress.getIcon() == 4 || !holderAt2.radialProgress.getProgressRect().contains(x, y)) ? false : true;
            MediaHolder mediaHolder = this.pressHolder;
            if (mediaHolder != null && mediaHolder == holderAt2 && this.cell.getDelegate() != null && motionEvent.getAction() == 1) {
                MessageObject messageObject = this.cell.getMessageObject();
                if (this.pressButton && z && holderAt2.radialProgress.getIcon() == 3 && messageObject != null) {
                    if (messageObject.isSending()) {
                        SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                    }
                } else {
                    ChatMessageCell.ChatMessageCellDelegate delegate = this.cell.getDelegate();
                    ChatMessageCell chatMessageCell = this.cell;
                    MediaHolder mediaHolder2 = this.pressHolder;
                    delegate.didPressGroupImage(chatMessageCell, mediaHolder2.imageReceiver, mediaHolder2.media, motionEvent.getX(), motionEvent.getY());
                }
            }
            this.pressButton = false;
            this.pressHolder = null;
        }
        this.bounce.setPressed(this.pressHolder != null);
        return this.pressHolder != null;
    }

    public MediaHolder getHolderAt(float f, float f2) {
        for (int i = 0; i < this.holders.size(); i++) {
            if (this.holders.get(i).imageReceiver.isInsideImage(f, f2)) {
                return this.holders.get(i);
            }
        }
        return null;
    }

    public ImageReceiver getPhotoImage(int i) {
        GroupedMessages groupedMessages = this.layout;
        if (groupedMessages != null && i >= 0 && i < groupedMessages.medias.size()) {
            TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia = this.layout.medias.get(i);
            for (int i2 = 0; i2 < this.holders.size(); i2++) {
                if (this.holders.get(i2).media == tLRPC$MessageExtendedMedia) {
                    return this.holders.get(i2).imageReceiver;
                }
            }
        }
        return null;
    }

    public boolean allVisible() {
        Iterator<MediaHolder> it = this.holders.iterator();
        while (it.hasNext()) {
            if (!it.next().imageReceiver.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public void draw(Canvas canvas) {
        if (this.layout == null) {
            return;
        }
        float f = this.animatedHidden.set(this.hidden);
        drawImages(canvas, true);
        if (this.buttonText != null && f > 0.0f) {
            float scale = this.bounce.getScale(0.05f);
            float dp = AndroidUtilities.dp(28.0f) + this.buttonText.getCurrentWidth();
            float dp2 = AndroidUtilities.dp(32.0f);
            RectF rectF = this.clipRect;
            int i = this.x;
            int i2 = this.width;
            int i3 = this.y;
            int i4 = this.height;
            rectF.set(i + ((i2 - dp) / 2.0f), i3 + ((i4 - dp2) / 2.0f), i + ((i2 + dp) / 2.0f), i3 + ((i4 + dp2) / 2.0f));
            this.clipPath.rewind();
            float f2 = dp2 / 2.0f;
            this.clipPath.addRoundRect(this.clipRect, f2, f2, Path.Direction.CW);
            canvas.save();
            canvas.scale(scale, scale, this.x + (this.width / 2.0f), this.y + (this.height / 2.0f));
            canvas.save();
            canvas.clipPath(this.clipPath);
            drawBlurred(canvas, f);
            canvas.drawColor(Theme.multAlpha(805306368, f));
            this.buttonText.draw(canvas, ((this.x + (this.width / 2.0f)) - (dp / 2.0f)) + AndroidUtilities.dp(14.0f), (this.height / 2.0f) + this.y, -1, f);
            canvas.restore();
            if (isLoading()) {
                LoadingDrawable loadingDrawable = this.loadingDrawable;
                if (loadingDrawable == null) {
                    LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                    this.loadingDrawable = loadingDrawable2;
                    loadingDrawable2.setCallback(this.cell);
                    this.loadingDrawable.setColors(Theme.multAlpha(-1, 0.1f), Theme.multAlpha(-1, 0.3f), Theme.multAlpha(-1, 0.35f), Theme.multAlpha(-1, 0.8f));
                    this.loadingDrawable.setAppearByGradient(true);
                    this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (loadingDrawable.isDisappeared() || this.loadingDrawable.isDisappearing()) {
                    this.loadingDrawable.reset();
                    this.loadingDrawable.resetDisappear();
                }
            } else {
                LoadingDrawable loadingDrawable3 = this.loadingDrawable;
                if (loadingDrawable3 != null && !loadingDrawable3.isDisappearing() && !this.loadingDrawable.isDisappeared()) {
                    this.loadingDrawable.disappear();
                }
            }
            LoadingDrawable loadingDrawable4 = this.loadingDrawable;
            if (loadingDrawable4 != null) {
                loadingDrawable4.setBounds(this.clipRect);
                this.loadingDrawable.setRadiiDp(f2);
                this.loadingDrawable.setAlpha((int) (255.0f * f));
                this.loadingDrawable.draw(canvas);
            }
            canvas.restore();
        }
        if (this.priceText == null || f >= 1.0f || !allVisible()) {
            return;
        }
        float timeAlpha = (1.0f - f) * this.cell.getTimeAlpha();
        float dp3 = AndroidUtilities.dp(11.32f) + this.priceText.getCurrentWidth();
        float dp4 = AndroidUtilities.dp(17.0f);
        float dp5 = AndroidUtilities.dp(5.0f);
        RectF rectF2 = this.clipRect;
        int i5 = this.x;
        int i6 = this.width;
        int i7 = this.y;
        rectF2.set(((i5 + i6) - dp3) - dp5, i7 + dp5, (i5 + i6) - dp5, i7 + dp5 + dp4);
        this.clipPath.rewind();
        float f3 = dp4 / 2.0f;
        this.clipPath.addRoundRect(this.clipRect, f3, f3, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.clipPath);
        canvas.drawColor(Theme.multAlpha(1073741824, timeAlpha));
        this.priceText.draw(canvas, (((this.x + this.width) - dp3) - dp5) + AndroidUtilities.dp(5.66f), this.y + dp5 + f3, -1, timeAlpha);
        canvas.restore();
    }

    public boolean isLoading() {
        return this.cell.getDelegate() != null && this.cell.getDelegate().isProgressLoading(this.cell, 5);
    }

    public void drawBlurRect(Canvas canvas, RectF rectF, float f, float f2) {
        canvas.save();
        this.clipPath.rewind();
        this.clipPath.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        canvas.drawColor(1073741824);
        canvas.restore();
    }

    public void checkBlurBitmap() {
        int i;
        int i2;
        int id = this.cell.getMessageObject() != null ? this.cell.getMessageObject().getId() : 0;
        int i3 = this.width;
        int i4 = this.height;
        int max = (int) Math.max(1.0f, i3 > i4 ? 100.0f : (i3 / i4) * 100.0f);
        int i5 = this.height;
        int i6 = this.width;
        int max2 = (int) Math.max(1.0f, i5 <= i6 ? 100.0f * (i5 / i6) : 100.0f);
        int i7 = 0;
        for (int i8 = 0; i8 < this.holders.size(); i8++) {
            MediaHolder mediaHolder = this.holders.get(i8);
            if (mediaHolder.imageReceiver.hasImageSet() && mediaHolder.imageReceiver.getBitmap() != null) {
                i7 |= 1 << i8;
            }
        }
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null && this.blurBitmapMessageId == id && this.blurBitmapState == i7 && this.blurBitmapWidth == max && this.blurBitmapHeight == max2) {
            return;
        }
        this.blurBitmapState = i7;
        this.blurBitmapMessageId = id;
        this.blurBitmapWidth = max;
        this.blurBitmapHeight = max2;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.blurBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.blurBitmap);
        float f = max;
        int i9 = this.width;
        canvas.scale(f / i9, f / i9);
        for (int i10 = 0; i10 < this.holders.size(); i10++) {
            MediaHolder mediaHolder2 = this.holders.get(i10);
            mediaHolder2.imageReceiver.setImageCoords(mediaHolder2.l, mediaHolder2.t, mediaHolder2.r - i, mediaHolder2.b - i2);
            mediaHolder2.imageReceiver.draw(canvas);
        }
        Utilities.stackBlurBitmap(this.blurBitmap, 12);
        if (this.blurBitmapPaint == null) {
            this.blurBitmapPaint = new Paint(3);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.5f);
            this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }
    }

    public void drawBlurred(Canvas canvas, float f) {
        if (this.layout == null) {
            return;
        }
        checkBlurBitmap();
        if (this.blurBitmap != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            canvas.scale(this.width / this.blurBitmap.getWidth(), this.width / this.blurBitmap.getWidth());
            this.blurBitmapPaint.setAlpha((int) (f * 255.0f));
            canvas.drawBitmap(this.blurBitmap, 0.0f, 0.0f, this.blurBitmapPaint);
            canvas.restore();
        }
    }

    public void drawImages(Canvas canvas, boolean z) {
        float f = this.animatedHidden.set(this.hidden);
        MessageObject messageObject = this.cell.getMessageObject();
        this.clipPath2.rewind();
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MIN_VALUE;
        int i = 0;
        while (i < this.holders.size()) {
            MediaHolder mediaHolder = this.holders.get(i);
            ImageReceiver imageReceiver = mediaHolder.imageReceiver;
            int i2 = this.x;
            int i3 = mediaHolder.l;
            int i4 = this.y;
            int i5 = mediaHolder.t;
            imageReceiver.setImageCoords(i2 + i3, i4 + i5, mediaHolder.r - i3, mediaHolder.b - i5);
            mediaHolder.imageReceiver.draw(canvas);
            if (mediaHolder.imageReceiver.getAnimation() != null) {
                mediaHolder.setTime(Math.round(((float) mediaHolder.imageReceiver.getAnimation().currentTime) / 1000.0f));
            }
            if (f > 0.0f) {
                f2 = Math.min(this.x + mediaHolder.l, f2);
                f3 = Math.min(this.y + mediaHolder.t, f3);
                f4 = Math.max(this.x + mediaHolder.r, f4);
                f5 = Math.max(this.y + mediaHolder.b, f5);
                RectF rectF = AndroidUtilities.rectTmp;
                int i6 = this.x;
                int i7 = this.y;
                rectF.set(mediaHolder.l + i6, mediaHolder.t + i7, i6 + mediaHolder.r, i7 + mediaHolder.b);
                this.clipPath2.addRoundRect(rectF, mediaHolder.radii, Path.Direction.CW);
            }
            mediaHolder.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
            float f6 = f2;
            mediaHolder.radialProgress.setProgressRect(mediaHolder.imageReceiver.getImageX() + ((mediaHolder.imageReceiver.getImageWidth() / 2.0f) - mediaHolder.radialProgress.getRadius()), mediaHolder.imageReceiver.getImageY() + ((mediaHolder.imageReceiver.getImageHeight() / 2.0f) - mediaHolder.radialProgress.getRadius()), mediaHolder.imageReceiver.getImageX() + (mediaHolder.imageReceiver.getImageWidth() / 2.0f) + mediaHolder.radialProgress.getRadius(), mediaHolder.imageReceiver.getImageY() + (mediaHolder.imageReceiver.getImageHeight() / 2.0f) + mediaHolder.radialProgress.getRadius());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(mediaHolder.attachPath);
                boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i);
                if (fileProgressSizes == null && isSendingPaidMessage) {
                    mediaHolder.radialProgress.setProgress(1.0f, true);
                    mediaHolder.setIcon(mediaHolder.album ? 6 : mediaHolder.getDefaultIcon());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(mediaHolder.filename)) {
                mediaHolder.setIcon(3);
            } else {
                mediaHolder.setIcon(mediaHolder.getDefaultIcon());
            }
            canvas.saveLayerAlpha(mediaHolder.radialProgress.getProgressRect(), (int) ((1.0f - f) * 255.0f), 31);
            mediaHolder.radialProgress.draw(canvas);
            canvas.restore();
            i++;
            f2 = f6;
        }
        if (f > 0.0f && z) {
            canvas.save();
            canvas.clipPath(this.clipPath2);
            canvas.translate(f2, f3);
            int i8 = (int) (f4 - f2);
            int i9 = (int) (f5 - f3);
            canvas.saveLayerAlpha(0.0f, 0.0f, i8, i9, (int) (255.0f * f), 31);
            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
            ChatMessageCell chatMessageCell = this.cell;
            spoilerEffect2.draw(canvas, chatMessageCell, i8, i9, 1.0f, chatMessageCell.drawingToBitmap);
            canvas.restore();
            canvas.restore();
            this.cell.invalidate();
        }
        for (int i10 = 0; i10 < this.holders.size(); i10++) {
            MediaHolder mediaHolder2 = this.holders.get(i10);
            if (mediaHolder2.durationText != null) {
                float dp = AndroidUtilities.dp(11.4f) + mediaHolder2.durationText.getCurrentWidth();
                float dp2 = AndroidUtilities.dp(17.0f);
                float dp3 = AndroidUtilities.dp(5.0f);
                RectF rectF2 = this.clipRect;
                int i11 = this.x;
                int i12 = mediaHolder2.l;
                int i13 = this.y;
                int i14 = mediaHolder2.t;
                rectF2.set(i11 + i12 + dp3, i13 + i14 + dp3, i11 + i12 + dp3 + dp, i13 + i14 + dp3 + dp2);
                if (this.priceText == null || this.clipRect.right <= ((this.x + this.width) - (AndroidUtilities.dp(11.32f) + this.priceText.getCurrentWidth())) - dp3 || this.clipRect.top > this.y + dp3) {
                    this.clipPath.rewind();
                    float f7 = dp2 / 2.0f;
                    this.clipPath.addRoundRect(this.clipRect, f7, f7, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(this.clipPath);
                    drawBlurred(canvas, f);
                    canvas.drawColor(Theme.multAlpha(1073741824, 1.0f));
                    mediaHolder2.durationText.draw(canvas, this.x + mediaHolder2.l + dp3 + AndroidUtilities.dp(5.66f), this.y + mediaHolder2.t + dp3 + f7, -1, 1.0f);
                    canvas.restore();
                }
            }
        }
    }

    public static class MediaHolder implements DownloadController.FileDownloadProgressListener {
        private final int TAG;
        public boolean album;
        public String attachPath;
        public boolean attached;
        public boolean autoplay;
        public int b;
        public final ChatMessageCell cell;
        private int duration;
        private Text durationText;
        private int durationValue;
        public String filename;
        private final int h;
        public boolean hidden;
        public int icon;
        public final ImageReceiver imageReceiver;
        public int l;
        public TLRPC$MessageExtendedMedia media;
        public int r;
        public final RadialProgress2 radialProgress;
        public int t;
        public boolean video;
        private final int w;
        public final float[] radii = new float[8];
        public final RectF clipRect = new RectF();
        public final Path clipPath = new Path();

        @Override
        public void onFailedDownload(String str, boolean z) {
        }

        @Override
        public void onSuccessDownload(String str) {
        }

        public void setIcon(int i) {
            if (i != this.icon) {
                RadialProgress2 radialProgress2 = this.radialProgress;
                this.icon = i;
                radialProgress2.setIcon(i, true, true);
            }
        }

        public void setTime(int i) {
            int max;
            if (this.video || this.durationValue == (max = Math.max(0, this.duration - i))) {
                return;
            }
            this.durationValue = max;
            this.durationText = new Text(AndroidUtilities.formatLongDuration(max), 12.0f);
        }

        public MediaHolder(ChatMessageCell chatMessageCell, MessageObject messageObject, TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia, boolean z, int i, int i2) {
            this.icon = 4;
            this.duration = 0;
            this.durationValue = 0;
            this.cell = chatMessageCell;
            this.album = z;
            this.video = false;
            if (tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMedia) {
                TLRPC$MessageMedia tLRPC$MessageMedia = ((TLRPC$TL_messageExtendedMedia) tLRPC$MessageExtendedMedia).media;
                this.video = ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) && MessageObject.isVideoDocument(tLRPC$MessageMedia.document)) ? false : false;
                this.duration = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(tLRPC$MessageMedia.document)));
            } else if (tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMediaPreview) {
                TLRPC$TL_messageExtendedMediaPreview tLRPC$TL_messageExtendedMediaPreview = (TLRPC$TL_messageExtendedMediaPreview) tLRPC$MessageExtendedMedia;
                this.video = (4 & tLRPC$TL_messageExtendedMediaPreview.flags) != 0;
                this.duration = tLRPC$TL_messageExtendedMediaPreview.video_duration;
            }
            if (this.video) {
                int i3 = this.duration;
                this.durationValue = i3;
                this.durationText = new Text(AndroidUtilities.formatLongDuration(i3), 12.0f);
            }
            ImageReceiver imageReceiver = new ImageReceiver(chatMessageCell);
            this.imageReceiver = imageReceiver;
            imageReceiver.setColorFilter(null);
            this.w = i;
            this.h = i2;
            this.TAG = DownloadController.getInstance(chatMessageCell.currentAccount).generateObserverTag();
            updateMedia(tLRPC$MessageExtendedMedia, messageObject);
            RadialProgress2 radialProgress2 = new RadialProgress2(chatMessageCell, chatMessageCell.getResourcesProvider());
            this.radialProgress = radialProgress2;
            int defaultIcon = getDefaultIcon();
            this.icon = defaultIcon;
            radialProgress2.setIcon(defaultIcon, false, false);
        }

        public void updateMedia(TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia, MessageObject messageObject) {
            TLRPC$Document tLRPC$Document;
            if (this.media == tLRPC$MessageExtendedMedia) {
                return;
            }
            this.media = tLRPC$MessageExtendedMedia;
            this.autoplay = false;
            String str = this.w + "_" + this.h;
            if (tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMediaPreview) {
                this.hidden = true;
                this.filename = null;
                this.imageReceiver.setImage(ImageLocation.getForObject(((TLRPC$TL_messageExtendedMediaPreview) tLRPC$MessageExtendedMedia).thumb, messageObject.messageOwner), str + "_b2", null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                this.imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else if (tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMedia) {
                boolean z = messageObject.isRepostPreview;
                this.hidden = z;
                if (z) {
                    str = str + "_b3";
                }
                String str2 = str;
                this.imageReceiver.setColorFilter(null);
                TLRPC$MessageMedia tLRPC$MessageMedia = ((TLRPC$TL_messageExtendedMedia) tLRPC$MessageExtendedMedia).media;
                this.filename = MessageObject.getFileName(tLRPC$MessageMedia);
                if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) {
                    TLRPC$TL_messageMediaPhoto tLRPC$TL_messageMediaPhoto = (TLRPC$TL_messageMediaPhoto) tLRPC$MessageMedia;
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$TL_messageMediaPhoto.photo), str2, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messageMediaPhoto.photo.sizes, Math.min(this.w, this.h) / 100, false, closestPhotoSizeWithSize, false), tLRPC$TL_messageMediaPhoto.photo), str2, 0L, null, messageObject, 0);
                } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
                    TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = (TLRPC$TL_messageMediaDocument) tLRPC$MessageMedia;
                    this.autoplay = !this.hidden && !this.album && this.video && SharedConfig.isAutoplayVideo();
                    if (!this.album && this.video && (tLRPC$Document = tLRPC$TL_messageMediaDocument.document) != null) {
                        TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messageMediaDocument.document.thumbs, Math.min(this.w, this.h), false, closestPhotoSizeWithSize2, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$TL_messageMediaDocument.document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$TL_messageMediaDocument.document);
                        ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tLRPC$TL_messageMediaDocument.document);
                        ImageReceiver imageReceiver = this.imageReceiver;
                        ImageLocation imageLocation = this.autoplay ? forDocument : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(this.autoplay ? "_g" : "");
                        imageReceiver.setImage(imageLocation, sb.toString(), forDocument2, str2, forDocument3, str2, null, 0L, null, messageObject, 0);
                        return;
                    }
                    TLRPC$Document tLRPC$Document2 = tLRPC$TL_messageMediaDocument.document;
                    if (tLRPC$Document2 != null) {
                        TLRPC$PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tLRPC$TL_messageMediaDocument.document), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messageMediaDocument.document.thumbs, Math.min(this.w, this.h), false, closestPhotoSizeWithSize4, false), tLRPC$TL_messageMediaDocument.document), str2, 0L, null, messageObject, 0);
                    }
                }
            }
        }

        public void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            this.imageReceiver.onAttachedToWindow();
        }

        public void detach() {
            if (this.attached) {
                this.attached = false;
                this.imageReceiver.onDetachedFromWindow();
            }
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            float min = j2 == 0 ? 0.0f : Math.min(1.0f, ((float) j) / ((float) j2));
            RadialProgress2 radialProgress2 = this.radialProgress;
            this.media.downloadProgress = min;
            radialProgress2.setProgress(min, true);
            setIcon(min < 1.0f ? 3 : getDefaultIcon());
            this.cell.invalidate();
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
            int defaultIcon;
            float min = j2 == 0 ? 0.0f : Math.min(1.0f, ((float) j) / ((float) j2));
            RadialProgress2 radialProgress2 = this.radialProgress;
            this.media.uploadProgress = min;
            radialProgress2.setProgress(min, true);
            if (min < 1.0f) {
                defaultIcon = 3;
            } else {
                defaultIcon = this.album ? 6 : getDefaultIcon();
            }
            setIcon(defaultIcon);
            this.cell.invalidate();
        }

        public int getDefaultIcon() {
            return (!this.video || this.autoplay) ? 4 : 0;
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }
    }

    public void onAttachedToWindow() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.cell);
        }
        for (int i = 0; i < this.holders.size(); i++) {
            this.holders.get(i).attach();
        }
    }

    public void onDetachedFromWindow() {
        if (this.attached) {
            this.attached = false;
            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
            if (spoilerEffect2 != null) {
                spoilerEffect2.attach(this.cell);
            }
            for (int i = 0; i < this.holders.size(); i++) {
                this.holders.get(i).detach();
            }
        }
    }

    public static class GroupedMessages {
        public boolean hasSibling;
        float height;
        int maxX;
        int maxY;
        int width;
        public ArrayList<TLRPC$MessageExtendedMedia> medias = new ArrayList<>();
        public ArrayList<MessageObject.GroupedMessagePosition> posArray = new ArrayList<>();
        public HashMap<TLRPC$MessageExtendedMedia, MessageObject.GroupedMessagePosition> positions = new HashMap<>();
        public int maxSizeWidth = 800;
        public float maxSizeHeight = 814.0f;
        public final TransitionParams transitionParams = new TransitionParams();

        public static class TransitionParams {
            public float captionEnterProgress = 1.0f;
        }

        public MessageObject.GroupedMessagePosition getPosition(TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia) {
            if (tLRPC$MessageExtendedMedia == null) {
                return null;
            }
            return this.positions.get(tLRPC$MessageExtendedMedia);
        }

        public static class MessageGroupedLayoutAttempt {
            public float[] heights;
            public int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                this.lineCounts = new int[]{i, i2};
                this.heights = new float[]{f, f2};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                this.lineCounts = new int[]{i, i2, i3};
                this.heights = new float[]{f, f2, f3};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                this.lineCounts = new int[]{i, i2, i3, i4};
                this.heights = new float[]{f, f2, f3, f4};
            }
        }

        private float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return this.maxSizeWidth / f;
        }

        public void calculate() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.GroupMedia.GroupedMessages.calculate():void");
        }

        public int getWidth() {
            int[] iArr = new int[10];
            Arrays.fill(iArr, 0);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = this.posArray.get(i);
                int i2 = groupedMessagePosition.pw;
                for (int i3 = groupedMessagePosition.minY; i3 <= groupedMessagePosition.maxY; i3++) {
                    iArr[i3] = iArr[i3] + i2;
                }
            }
            int i4 = iArr[0];
            for (int i5 = 1; i5 < 10; i5++) {
                int i6 = iArr[i5];
                if (i4 < i6) {
                    i4 = i6;
                }
            }
            return i4;
        }

        public float getHeight() {
            float[] fArr = new float[10];
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = this.posArray.get(i);
                float f = groupedMessagePosition.ph;
                for (int i2 = groupedMessagePosition.minX; i2 <= groupedMessagePosition.maxX; i2++) {
                    fArr[i2] = fArr[i2] + f;
                }
            }
            float f2 = fArr[0];
            for (int i3 = 1; i3 < 10; i3++) {
                float f3 = fArr[i3];
                if (f2 < f3) {
                    f2 = f3;
                }
            }
            return f2;
        }

        private float getLeft(MessageObject.GroupedMessagePosition groupedMessagePosition, int i, int i2, int i3) {
            int i4 = (i2 - i) + 1;
            float[] fArr = new float[i4];
            float f = 0.0f;
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.posArray.get(i5);
                if (groupedMessagePosition2 != groupedMessagePosition && groupedMessagePosition2.maxX < i3) {
                    int min = Math.min((int) groupedMessagePosition2.maxY, i2) - i;
                    for (int max = Math.max(groupedMessagePosition2.minY - i, 0); max <= min; max++) {
                        fArr[max] = fArr[max] + groupedMessagePosition2.pw;
                    }
                }
            }
            for (int i6 = 0; i6 < i4; i6++) {
                float f2 = fArr[i6];
                if (f < f2) {
                    f = f2;
                }
            }
            return f;
        }

        private float getTop(MessageObject.GroupedMessagePosition groupedMessagePosition, int i) {
            int i2 = this.maxX + 1;
            float[] fArr = new float[i2];
            float f = 0.0f;
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.posArray.get(i3);
                if (groupedMessagePosition2 != groupedMessagePosition && groupedMessagePosition2.maxY < i) {
                    for (int i4 = groupedMessagePosition2.minX; i4 <= groupedMessagePosition2.maxX; i4++) {
                        fArr[i4] = fArr[i4] + groupedMessagePosition2.ph;
                    }
                }
            }
            for (int i5 = 0; i5 < i2; i5++) {
                float f2 = fArr[i5];
                if (f < f2) {
                    f = f2;
                }
            }
            return f;
        }
    }
}

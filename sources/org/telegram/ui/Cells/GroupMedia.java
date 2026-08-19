package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
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
    public final ArrayList holders = new ArrayList();
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
        TLRPC.Message message;
        MessageObject messageObject2;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (this.layout == null) {
                this.layout = new GroupedMessages();
            }
            this.layout.medias.clear();
            this.layout.medias.addAll(tL_messageMediaPaidMedia.extended_media);
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
                if (i2 >= tL_messageMediaPaidMedia.extended_media.size()) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                MediaHolder mediaHolder = i2 >= this.holders.size() ? null : (MediaHolder) this.holders.get(i2);
                if (mediaHolder == null) {
                    MessageObject.GroupedMessagePosition position = this.layout.getPosition(messageExtendedMedia);
                    messageObject2 = messageObject;
                    MediaHolder mediaHolder2 = new MediaHolder(this.cell, messageObject2, messageExtendedMedia, tL_messageMediaPaidMedia.extended_media.size() != 1, (int) ((position.pw / 1000.0f) * this.maxWidth), (int) (position.ph * this.layout.maxSizeHeight));
                    String str = messageExtendedMedia.attachPath;
                    if (str != null) {
                        mediaHolder2.attachPath = str;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        mediaHolder2.attachPath = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(mediaHolder2.attachPath)) {
                        DownloadController.getInstance(this.cell.currentAccount).addLoadingFileObserver(mediaHolder2.attachPath, messageObject2, mediaHolder2);
                        if (messageObject2.isSending()) {
                            mediaHolder2.radialProgress.setProgress(messageExtendedMedia.uploadProgress, false);
                        }
                    }
                    if (this.cell.isCellAttachedToWindow()) {
                        mediaHolder2.attach();
                    }
                    this.holders.add(mediaHolder2);
                } else {
                    messageObject2 = messageObject;
                    mediaHolder.updateMedia(messageExtendedMedia, messageObject2);
                }
                i2++;
                messageObject = messageObject2;
            }
            MessageObject messageObject3 = messageObject;
            int size = tL_messageMediaPaidMedia.extended_media.size();
            while (size < this.holders.size()) {
                MediaHolder mediaHolder3 = size >= this.holders.size() ? null : (MediaHolder) this.holders.get(size);
                if (mediaHolder3 != null) {
                    mediaHolder3.detach();
                    this.holders.remove(size);
                    size--;
                }
                size++;
            }
            updateHolders(messageObject3);
            GroupedMessages groupedMessages = this.layout;
            this.width = (int) ((groupedMessages.width / 1000.0f) * this.maxWidth);
            this.height = (int) (groupedMessages.height * groupedMessages.maxSizeHeight);
            if (this.hidden) {
                long j = tL_messageMediaPaidMedia.stars_amount;
                this.buttonTextPrice = j;
                Text text = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f), 14.0f, AndroidUtilities.bold());
                this.buttonText = text;
                if (text.getCurrentWidth() > this.width - AndroidUtilities.dp(30.0f)) {
                    long j2 = tL_messageMediaPaidMedia.stars_amount;
                    this.buttonTextPrice = j2;
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) j2), 0.7f), 14.0f, AndroidUtilities.bold());
                }
            }
            if (this.priceText == null || this.priceTextPrice != tL_messageMediaPaidMedia.stars_amount) {
                long j3 = tL_messageMediaPaidMedia.stars_amount;
                this.priceTextPrice = j3;
                this.priceText = new Text(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j3), 0.9f), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public void updateHolders(MessageObject messageObject) {
        boolean z;
        float f;
        boolean z2;
        ChatMessageCell chatMessageCell = this.cell;
        boolean z3 = chatMessageCell.namesOffset > 0 || (chatMessageCell.captionAbove && !TextUtils.isEmpty(messageObject.caption));
        if (this.cell.captionAbove || TextUtils.isEmpty(messageObject.caption)) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (!chatMessageCell2.reactionsLayoutInBubble.isEmpty || chatMessageCell2.hasCommentLayout()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i = this.overrideWidth;
        float f2 = 1000.0f;
        if (i > 0) {
            f = 1000.0f / this.layout.width;
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
            f = 1.0f;
        }
        GroupedMessages groupedMessages = this.layout;
        this.width = (int) ((groupedMessages.width / 1000.0f) * f * this.maxWidth);
        this.height = (int) (groupedMessages.height * groupedMessages.maxSizeHeight);
        this.hidden = false;
        int iDp = AndroidUtilities.dp(1.0f);
        int iDp2 = AndroidUtilities.dp(4.0f);
        int i2 = SharedConfig.bubbleRadius;
        int iDp3 = AndroidUtilities.dp(i2 - (i2 > 2 ? 2 : 0));
        int iMin = Math.min(AndroidUtilities.dp(3.0f), iDp3);
        int i3 = 0;
        while (i3 < this.holders.size()) {
            MediaHolder mediaHolder = (MediaHolder) this.holders.get(i3);
            MessageObject.GroupedMessagePosition position = this.layout.getPosition(mediaHolder.media);
            if (position == null) {
                z2 = z3;
            } else {
                float f3 = (position.left / f2) * f;
                float f4 = this.maxWidth;
                int i4 = (int) (f3 * f4);
                float f5 = position.top;
                float f6 = this.layout.maxSizeHeight;
                int i5 = (int) (f5 * f6);
                z2 = z3;
                int i6 = (int) ((position.pw / 1000.0f) * f * f4);
                int i7 = (int) (position.ph * f6);
                int i8 = position.flags;
                if ((i8 & 1) == 0) {
                    i4 += iDp;
                    i6 -= iDp;
                }
                if ((i8 & 4) == 0) {
                    i5 += iDp;
                    i7 -= iDp;
                }
                if ((i8 & 2) == 0) {
                    i6 -= iDp;
                }
                if ((i8 & 8) == 0) {
                    i7 -= iDp;
                }
                mediaHolder.l = i4;
                mediaHolder.t = i5;
                mediaHolder.r = i4 + i6;
                mediaHolder.b = i5 + i7;
                mediaHolder.imageReceiver.setImageCoords(i4, i5, i6, i7);
                int i9 = position.flags;
                int i10 = i9 & 4;
                int i11 = (i10 == 0 || (i9 & 1) == 0 || z2) ? iDp2 : iDp3;
                int i12 = (i10 == 0 || (i9 & 2) == 0 || z2) ? iDp2 : iDp3;
                int i13 = i9 & 8;
                int i14 = (i13 == 0 || (i9 & 1) == 0 || z) ? iDp2 : iDp3;
                int i15 = (i13 == 0 || (i9 & 2) == 0 || z) ? iDp2 : iDp3;
                if (!z) {
                    if (messageObject.isOutOwner()) {
                        i15 = iDp2;
                    } else {
                        i14 = iDp2;
                    }
                }
                if (!z2 && this.cell.pinnedTop) {
                    if (messageObject.isOutOwner()) {
                        i12 = iMin;
                    } else {
                        i11 = iMin;
                    }
                }
                mediaHolder.imageReceiver.setRoundRadius(i11, i12, i15, i14);
                float[] fArr = mediaHolder.radii;
                float f7 = i11;
                fArr[1] = f7;
                fArr[0] = f7;
                float f8 = i12;
                fArr[3] = f8;
                fArr[2] = f8;
                float f9 = i15;
                fArr[5] = f9;
                fArr[4] = f9;
                float f10 = i14;
                fArr[7] = f10;
                fArr[6] = f10;
                if (messageObject != null && messageObject.isSending()) {
                    mediaHolder.setIcon(3);
                }
                this.hidden = this.hidden || mediaHolder.hidden;
            }
            i3++;
            z3 = z2;
            f2 = 1000.0f;
        }
        if (this.hidden) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                long j = tL_messageMediaPaidMedia.stars_amount;
                this.buttonTextPrice = j;
                Text text = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f), 14.0f, AndroidUtilities.bold());
                this.buttonText = text;
                if (text.getCurrentWidth() > this.width - AndroidUtilities.dp(30.0f)) {
                    long j2 = tL_messageMediaPaidMedia.stars_amount;
                    this.buttonTextPrice = j2;
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) j2), 0.7f), 14.0f, AndroidUtilities.bold());
                }
            }
        }
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
            if (((MediaHolder) this.holders.get(i)).imageReceiver.isInsideImage(f, f2)) {
                return (MediaHolder) this.holders.get(i);
            }
        }
        return null;
    }

    public ImageReceiver getPhotoImage(int i) {
        GroupedMessages groupedMessages = this.layout;
        if (groupedMessages != null && i >= 0 && i < groupedMessages.medias.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) this.layout.medias.get(i);
            for (int i2 = 0; i2 < this.holders.size(); i2++) {
                if (((MediaHolder) this.holders.get(i2)).media == messageExtendedMedia) {
                    return ((MediaHolder) this.holders.get(i2)).imageReceiver;
                }
            }
        }
        return null;
    }

    public boolean allVisible() {
        ArrayList arrayList = this.holders;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((MediaHolder) obj).imageReceiver.getVisible()) {
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
            float fDp = AndroidUtilities.dp(28.0f) + this.buttonText.getCurrentWidth();
            float fDp2 = AndroidUtilities.dp(32.0f);
            RectF rectF = this.clipRect;
            float f2 = this.x;
            float f3 = this.width;
            float f4 = this.y;
            float f5 = this.height;
            rectF.set(((f3 - fDp) / 2.0f) + f2, ((f5 - fDp2) / 2.0f) + f4, f2 + ((f3 + fDp) / 2.0f), f4 + ((f5 + fDp2) / 2.0f));
            this.clipPath.rewind();
            float f6 = fDp2 / 2.0f;
            this.clipPath.addRoundRect(this.clipRect, f6, f6, Path.Direction.CW);
            canvas.save();
            canvas.scale(scale, scale, this.x + (this.width / 2.0f), this.y + (this.height / 2.0f));
            canvas.save();
            canvas.clipPath(this.clipPath);
            drawBlurred(canvas, f);
            canvas.drawColor(Theme.multAlpha(1342177280, f));
            this.buttonText.draw(canvas, AndroidUtilities.dp(14.0f) + ((this.x + (this.width / 2.0f)) - (fDp / 2.0f)), this.y + (this.height / 2.0f), -1, f);
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
                this.loadingDrawable.setRadiiDp(f6);
                this.loadingDrawable.setAlpha((int) (255.0f * f));
                this.loadingDrawable.draw(canvas);
            }
            canvas.restore();
        }
        if (this.priceText == null || f >= 1.0f || !allVisible()) {
            return;
        }
        float timeAlpha = (1.0f - f) * this.cell.getTimeAlpha();
        float fDp3 = AndroidUtilities.dp(11.32f) + this.priceText.getCurrentWidth();
        float fDp4 = AndroidUtilities.dp(17.0f);
        float fDp5 = AndroidUtilities.dp(5.0f);
        RectF rectF2 = this.clipRect;
        float f7 = this.x + this.width;
        float f8 = this.y + fDp5;
        rectF2.set((f7 - fDp3) - fDp5, f8, f7 - fDp5, f8 + fDp4);
        this.clipPath.rewind();
        float f9 = fDp4 / 2.0f;
        this.clipPath.addRoundRect(this.clipRect, f9, f9, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.clipPath);
        canvas.drawColor(Theme.multAlpha(1073741824, timeAlpha));
        this.priceText.draw(canvas, (((this.x + this.width) - fDp3) - fDp5) + AndroidUtilities.dp(5.66f), this.y + fDp5 + f9, -1, timeAlpha);
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
        int id = this.cell.getMessageObject() != null ? this.cell.getMessageObject().getId() : 0;
        int i = this.width;
        int i2 = this.height;
        int iMax = (int) Math.max(1.0f, i > i2 ? 100.0f : (i / i2) * 100.0f);
        int i3 = this.height;
        int i4 = this.width;
        int iMax2 = (int) Math.max(1.0f, i3 <= i4 ? 100.0f * (i3 / i4) : 100.0f);
        int i5 = 0;
        for (int i6 = 0; i6 < this.holders.size(); i6++) {
            MediaHolder mediaHolder = (MediaHolder) this.holders.get(i6);
            if (mediaHolder.imageReceiver.hasImageSet() && mediaHolder.imageReceiver.getBitmap() != null) {
                i5 |= 1 << i6;
            }
        }
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null && this.blurBitmapMessageId == id && this.blurBitmapState == i5 && this.blurBitmapWidth == iMax && this.blurBitmapHeight == iMax2) {
            return;
        }
        this.blurBitmapState = i5;
        this.blurBitmapMessageId = id;
        this.blurBitmapWidth = iMax;
        this.blurBitmapHeight = iMax2;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.blurBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.blurBitmap);
        float f = iMax / this.width;
        canvas.scale(f, f);
        for (int i7 = 0; i7 < this.holders.size(); i7++) {
            MediaHolder mediaHolder2 = (MediaHolder) this.holders.get(i7);
            ImageReceiver imageReceiver = mediaHolder2.imageReceiver;
            int i8 = mediaHolder2.l;
            int i9 = mediaHolder2.t;
            imageReceiver.setImageCoords(i8, i9, mediaHolder2.r - i8, mediaHolder2.b - i9);
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
        Canvas canvas2 = canvas;
        float f = this.animatedHidden.set(this.hidden);
        MessageObject messageObject = this.cell.getMessageObject();
        this.clipPath2.rewind();
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax = Float.MIN_VALUE;
        float fMax2 = Float.MIN_VALUE;
        int i = 0;
        while (i < this.holders.size()) {
            MediaHolder mediaHolder = (MediaHolder) this.holders.get(i);
            ImageReceiver imageReceiver = mediaHolder.imageReceiver;
            int i2 = this.x;
            int i3 = mediaHolder.l;
            int i4 = this.y;
            int i5 = mediaHolder.t;
            imageReceiver.setImageCoords(i2 + i3, i4 + i5, mediaHolder.r - i3, mediaHolder.b - i5);
            mediaHolder.imageReceiver.draw(canvas2);
            if (mediaHolder.imageReceiver.getAnimation() != null) {
                mediaHolder.setTime(Math.round(mediaHolder.imageReceiver.getAnimation().currentTime / 1000.0f));
            }
            if (f > 0.0f) {
                fMin2 = Math.min(this.x + mediaHolder.l, fMin2);
                fMin = Math.min(this.y + mediaHolder.t, fMin);
                fMax2 = Math.max(this.x + mediaHolder.r, fMax2);
                fMax = Math.max(this.y + mediaHolder.b, fMax);
                RectF rectF = AndroidUtilities.rectTmp;
                int i6 = this.x;
                float f2 = mediaHolder.l + i6;
                int i7 = this.y;
                rectF.set(f2, mediaHolder.t + i7, i6 + mediaHolder.r, i7 + mediaHolder.b);
                this.clipPath2.addRoundRect(rectF, mediaHolder.radii, Path.Direction.CW);
            }
            mediaHolder.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
            float f3 = fMin;
            mediaHolder.radialProgress.setProgressRect(mediaHolder.imageReceiver.getImageX() + ((mediaHolder.imageReceiver.getImageWidth() / 2.0f) - mediaHolder.radialProgress.getRadius()), mediaHolder.imageReceiver.getImageY() + ((mediaHolder.imageReceiver.getImageHeight() / 2.0f) - mediaHolder.radialProgress.getRadius()), mediaHolder.imageReceiver.getImageX() + (mediaHolder.imageReceiver.getImageWidth() / 2.0f) + mediaHolder.radialProgress.getRadius(), mediaHolder.imageReceiver.getImageY() + (mediaHolder.imageReceiver.getImageHeight() / 2.0f) + mediaHolder.radialProgress.getRadius());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(mediaHolder.attachPath);
                boolean zIsSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i);
                if (fileProgressSizes == null && zIsSendingPaidMessage) {
                    mediaHolder.radialProgress.setProgress(1.0f, true);
                    mediaHolder.setIcon(mediaHolder.album ? 6 : mediaHolder.getDefaultIcon());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(mediaHolder.filename)) {
                mediaHolder.setIcon(3);
            } else {
                mediaHolder.setIcon(mediaHolder.getDefaultIcon());
            }
            canvas2.saveLayerAlpha(mediaHolder.radialProgress.getProgressRect(), (int) ((1.0f - f) * 255.0f), 31);
            mediaHolder.radialProgress.draw(canvas2);
            canvas2.restore();
            i++;
            fMin = f3;
        }
        if (f > 0.0f && z) {
            canvas2.save();
            canvas2.clipPath(this.clipPath2);
            canvas2.translate(fMin2, fMin);
            int i8 = (int) (fMax2 - fMin2);
            int i9 = (int) (fMax - fMin);
            canvas.saveLayerAlpha(0.0f, 0.0f, i8, i9, (int) (f * 255.0f), 31);
            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
            ChatMessageCell chatMessageCell = this.cell;
            canvas2 = canvas;
            spoilerEffect2.draw(canvas2, chatMessageCell, i8, i9, 1.0f, chatMessageCell.drawingToBitmap);
            canvas2.restore();
            canvas2.restore();
            this.cell.invalidate();
        }
        int i10 = 0;
        while (i10 < this.holders.size()) {
            MediaHolder mediaHolder2 = (MediaHolder) this.holders.get(i10);
            if (mediaHolder2.durationText != null) {
                float fDp = AndroidUtilities.dp(11.4f) + mediaHolder2.durationText.getCurrentWidth();
                float fDp2 = AndroidUtilities.dp(17.0f);
                float fDp3 = AndroidUtilities.dp(5.0f);
                RectF rectF2 = this.clipRect;
                float f4 = this.x + mediaHolder2.l + fDp3;
                float f5 = this.y + mediaHolder2.t + fDp3;
                rectF2.set(f4, f5, fDp + f4, f5 + fDp2);
                if (this.priceText == null || this.clipRect.right <= ((this.x + this.width) - (AndroidUtilities.dp(11.32f) + this.priceText.getCurrentWidth())) - fDp3 || this.clipRect.top > this.y + fDp3) {
                    this.clipPath.rewind();
                    float f6 = fDp2 / 2.0f;
                    this.clipPath.addRoundRect(this.clipRect, f6, f6, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(this.clipPath);
                    drawBlurred(canvas2, f);
                    canvas2.drawColor(Theme.multAlpha(1073741824, 1.0f));
                    mediaHolder2.durationText.draw(canvas2, this.x + mediaHolder2.l + fDp3 + AndroidUtilities.dp(5.66f), f6 + this.y + mediaHolder2.t + fDp3, -1, 1.0f);
                    canvas.restore();
                }
            }
            i10++;
            canvas2 = canvas;
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
        public TLRPC.MessageExtendedMedia media;
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
            int iMax;
            if (this.video || this.durationValue == (iMax = Math.max(0, this.duration - i))) {
                return;
            }
            this.durationValue = iMax;
            this.durationText = new Text(AndroidUtilities.formatLongDuration(iMax), 12.0f);
        }

        public MediaHolder(ChatMessageCell chatMessageCell, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z, int i, int i2) {
            this.icon = 4;
            this.duration = 0;
            this.durationValue = 0;
            this.cell = chatMessageCell;
            this.album = z;
            this.video = false;
            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.video = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document);
                this.duration = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
            } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                this.video = (4 & tL_messageExtendedMediaPreview.flags) != 0;
                this.duration = tL_messageExtendedMediaPreview.video_duration;
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
            updateMedia(messageExtendedMedia, messageObject);
            RadialProgress2 radialProgress2 = new RadialProgress2(chatMessageCell, chatMessageCell.getResourcesProvider());
            this.radialProgress = radialProgress2;
            int defaultIcon = getDefaultIcon();
            this.icon = defaultIcon;
            radialProgress2.setIcon(defaultIcon, false, false);
        }

        public void updateMedia(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
            TLRPC.Document document;
            if (this.media == messageExtendedMedia) {
                return;
            }
            this.media = messageExtendedMedia;
            this.autoplay = false;
            String str = this.w + "_" + this.h;
            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                this.hidden = true;
                this.filename = null;
                this.imageReceiver.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), str + "_b2", null, null, messageObject, 0);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.4f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
                this.imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            }
            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                boolean z = messageObject.isRepostPreview;
                this.hidden = z;
                if (z) {
                    str = str + "_b3";
                }
                this.imageReceiver.setColorFilter(null);
                TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                this.filename = MessageObject.getFileName(messageMedia);
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                    this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), str, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(this.w, this.h) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), str, 0L, null, messageObject, 0);
                    return;
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                    this.autoplay = !this.hidden && !this.album && this.video && SharedConfig.isAutoplayVideo();
                    if (!this.album && this.video && (document = tL_messageMediaDocument.document) != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(this.w, this.h), false, closestPhotoSizeWithSize2, false);
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document);
                        ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                        ImageLocation imageLocation = forDocument;
                        ImageReceiver imageReceiver = this.imageReceiver;
                        if (!this.autoplay) {
                            imageLocation = null;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(this.autoplay ? "_g" : "");
                        imageReceiver.setImage(imageLocation, sb.toString(), forDocument2, str, forDocument3, str, null, 0L, null, messageObject, 0);
                        return;
                    }
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document), str, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(this.w, this.h), false, closestPhotoSizeWithSize4, false), tL_messageMediaDocument.document), str, 0L, null, messageObject, 0);
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
            float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
            RadialProgress2 radialProgress2 = this.radialProgress;
            this.media.downloadProgress = fMin;
            radialProgress2.setProgress(fMin, true);
            setIcon(fMin < 1.0f ? 3 : getDefaultIcon());
            this.cell.invalidate();
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
            int defaultIcon;
            float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
            RadialProgress2 radialProgress2 = this.radialProgress;
            this.media.uploadProgress = fMin;
            radialProgress2.setProgress(fMin, true);
            if (fMin < 1.0f) {
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
            ((MediaHolder) this.holders.get(i)).attach();
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
                ((MediaHolder) this.holders.get(i)).detach();
            }
        }
    }

    public static class GroupedMessages {
        public boolean hasSibling;
        float height;
        int maxX;
        int maxY;
        int width;
        public ArrayList medias = new ArrayList();
        public ArrayList posArray = new ArrayList();
        public HashMap positions = new HashMap();
        public int maxSizeWidth = 800;
        public float maxSizeHeight = 814.0f;
        public final TransitionParams transitionParams = new TransitionParams();

        public static class TransitionParams {
            public float captionEnterProgress = 1.0f;
        }

        public MessageObject.GroupedMessagePosition getPosition(TLRPC.MessageExtendedMedia messageExtendedMedia) {
            if (messageExtendedMedia == null) {
                return null;
            }
            return (MessageObject.GroupedMessagePosition) this.positions.get(messageExtendedMedia);
        }

        private static class MessageGroupedLayoutAttempt {
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
            float f;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            MessageObject.GroupedMessagePosition groupedMessagePosition;
            MessageObject.GroupedMessagePosition groupedMessagePosition2;
            int i9;
            int i10;
            int i11;
            float f2;
            float f3;
            float f4;
            TLRPC.Document document;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            int i12 = 3;
            this.posArray.clear();
            this.positions.clear();
            this.maxX = 0;
            int size = this.medias.size();
            if (size == 0) {
                this.width = 0;
                this.height = 0.0f;
                this.maxY = 0;
                return;
            }
            this.maxSizeWidth = 800;
            StringBuilder sb = new StringBuilder();
            this.hasSibling = false;
            int i13 = 0;
            float f5 = 1.0f;
            boolean z = false;
            while (i13 < size) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) this.medias.get(i13);
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = new MessageObject.GroupedMessagePosition();
                groupedMessagePosition3.last = i13 == size + (-1);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                    groupedMessagePosition3.photoWidth = tL_messageExtendedMediaPreview.w;
                    groupedMessagePosition3.photoHeight = tL_messageExtendedMediaPreview.h;
                    f4 = 1.2f;
                } else {
                    f4 = 1.2f;
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                            if (photo == null) {
                                closestPhotoSizeWithSize = null;
                            } else {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                            }
                        } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) == null) {
                            closestPhotoSizeWithSize = null;
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize());
                        }
                        groupedMessagePosition3.photoWidth = closestPhotoSizeWithSize == null ? 100 : closestPhotoSizeWithSize.w;
                        groupedMessagePosition3.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                    } else {
                        groupedMessagePosition3.photoWidth = 100;
                        groupedMessagePosition3.photoHeight = 100;
                    }
                }
                if (groupedMessagePosition3.photoWidth <= 0 || groupedMessagePosition3.photoHeight <= 0) {
                    groupedMessagePosition3.photoWidth = 50;
                    groupedMessagePosition3.photoHeight = 50;
                }
                float f6 = groupedMessagePosition3.photoWidth / groupedMessagePosition3.photoHeight;
                groupedMessagePosition3.aspectRatio = f6;
                if (f6 > f4) {
                    sb.append("w");
                } else if (f6 < 0.8f) {
                    sb.append("n");
                } else {
                    sb.append("q");
                }
                float f7 = groupedMessagePosition3.aspectRatio;
                f5 += f7;
                if (f7 > 2.0f) {
                    z = true;
                }
                this.positions.put(messageExtendedMedia, groupedMessagePosition3);
                this.posArray.add(groupedMessagePosition3);
                i13++;
            }
            int iDp = AndroidUtilities.dp(120.0f);
            float fDp = AndroidUtilities.dp(120.0f);
            Point point = AndroidUtilities.displaySize;
            int iMin = (int) (fDp / (Math.min(point.x, point.y) / this.maxSizeWidth));
            float fDp2 = AndroidUtilities.dp(40.0f);
            Point point2 = AndroidUtilities.displaySize;
            float fMin = Math.min(point2.x, point2.y);
            float f8 = this.maxSizeWidth;
            int i14 = (int) (fDp2 / (fMin / f8));
            float f9 = f8 / this.maxSizeHeight;
            float f10 = f5 / size;
            float fDp3 = AndroidUtilities.dp(100.0f) / this.maxSizeHeight;
            if (size == 1) {
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                float f11 = groupedMessagePosition4.aspectRatio;
                if (f11 >= 1.0f) {
                    f2 = this.maxSizeWidth;
                    f3 = ((f2 / f11) / f2) * this.maxSizeHeight;
                } else {
                    float f12 = this.maxSizeHeight;
                    f2 = ((f11 * f12) / f12) * this.maxSizeWidth;
                    f3 = f12;
                }
                groupedMessagePosition4.set(0, 0, 0, 0, (int) f2, f3 / this.maxSizeHeight, 15);
            } else {
                if (z || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i15 = 0; i15 < size; i15++) {
                        if (f10 > 1.1f) {
                            fArr[i15] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) this.posArray.get(i15)).aspectRatio);
                        } else {
                            fArr[i15] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) this.posArray.get(i15)).aspectRatio);
                        }
                        fArr[i15] = Math.max(0.66667f, Math.min(1.7f, fArr[i15]));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = 1; i16 < size2; i16++) {
                        int i17 = size2 - i16;
                        if (i16 <= 3 && i17 <= 3) {
                            arrayList.add(new MessageGroupedLayoutAttempt(i16, i17, multiHeight(fArr, 0, i16), multiHeight(fArr, i16, size2)));
                        }
                    }
                    int i18 = 1;
                    while (i18 < size2 - 1) {
                        int i19 = 1;
                        while (true) {
                            int i20 = size2 - i18;
                            if (i19 < i20) {
                                int i21 = i20 - i19;
                                if (i18 > 3) {
                                    i4 = i18;
                                    i5 = i19;
                                } else if (i19 > (f10 < 0.85f ? 4 : 3) || i21 > 3) {
                                    i4 = i18;
                                    i5 = i19;
                                } else {
                                    int i22 = i18 + i19;
                                    i4 = i18;
                                    i5 = i19;
                                    arrayList.add(new MessageGroupedLayoutAttempt(i4, i5, i21, multiHeight(fArr, 0, i18), multiHeight(fArr, i18, i22), multiHeight(fArr, i22, size2)));
                                }
                                i19 = i5 + 1;
                                i18 = i4;
                            }
                        }
                        i18++;
                    }
                    int i23 = 1;
                    while (i23 < size2 - 2) {
                        int i24 = 1;
                        while (true) {
                            int i25 = size2 - i23;
                            if (i24 < i25) {
                                int i26 = 1;
                                while (true) {
                                    int i27 = i25 - i24;
                                    if (i26 < i27) {
                                        int i28 = i27 - i26;
                                        if (i23 > i12 || i24 > i12 || i26 > i12 || i28 > i12) {
                                            i = i23;
                                            i2 = i24;
                                            i3 = i26;
                                        } else {
                                            int i29 = i23 + i24;
                                            int i30 = i29 + i26;
                                            i = i23;
                                            i2 = i24;
                                            i3 = i26;
                                            arrayList.add(new MessageGroupedLayoutAttempt(i, i2, i3, i28, multiHeight(fArr, 0, i23), multiHeight(fArr, i23, i29), multiHeight(fArr, i29, i30), multiHeight(fArr, i30, size2)));
                                        }
                                        i26 = i3 + 1;
                                        i23 = i;
                                        i24 = i2;
                                        i12 = 3;
                                    }
                                }
                                i24++;
                                i12 = 3;
                            }
                        }
                        i23++;
                        i12 = 3;
                    }
                    float f13 = (this.maxSizeWidth / 3) * 4;
                    int i31 = 0;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f14 = 0.0f;
                    while (i31 < arrayList.size()) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList.get(i31);
                        int i32 = 0;
                        float f15 = Float.MAX_VALUE;
                        float f16 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            if (i32 >= fArr2.length) {
                                break;
                            }
                            float f17 = fArr2[i32];
                            f16 += f17;
                            if (f17 < f15) {
                                f15 = f17;
                            }
                            i32++;
                        }
                        float fAbs = Math.abs(f16 - f13);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            int i33 = iArr[0];
                            int i34 = iArr[1];
                            if (i33 <= i34) {
                                f = f13;
                                if (iArr.length <= 2 || i34 <= iArr[2]) {
                                    if (iArr.length > 3 && iArr[2] > iArr[3]) {
                                    }
                                }
                                fAbs *= 1.2f;
                            } else {
                                f = f13;
                            }
                            fAbs *= 1.2f;
                        } else {
                            f = f13;
                        }
                        if (f15 < iMin) {
                            fAbs *= 1.5f;
                        }
                        if (messageGroupedLayoutAttempt == null || fAbs < f14) {
                            f14 = fAbs;
                            messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                        }
                        i31++;
                        f13 = f;
                    }
                    if (messageGroupedLayoutAttempt == null) {
                        return;
                    }
                    int i35 = 0;
                    int i36 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i36 >= iArr2.length) {
                            break;
                        }
                        int i37 = iArr2[i36];
                        float f18 = messageGroupedLayoutAttempt.heights[i36];
                        int i38 = this.maxSizeWidth;
                        int i39 = i37 - 1;
                        this.maxX = Math.max(this.maxX, i39);
                        int i40 = 0;
                        MessageObject.GroupedMessagePosition groupedMessagePosition5 = null;
                        while (i40 < i37) {
                            int i41 = (int) (fArr[i35] * f18);
                            i38 -= i41;
                            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) this.posArray.get(i35);
                            int i42 = i36 == 0 ? 4 : 0;
                            if (i36 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i42 |= 8;
                            }
                            if (i40 == 0) {
                                i42 |= 1;
                            }
                            if (i40 == i39) {
                                i42 |= 2;
                                groupedMessagePosition5 = groupedMessagePosition6;
                            }
                            int i43 = i40;
                            groupedMessagePosition6.set(i43, i40, i36, i36, i41, Math.max(fDp3, f18 / this.maxSizeHeight), i42);
                            i35++;
                            i40 = i43 + 1;
                        }
                        groupedMessagePosition5.pw += i38;
                        groupedMessagePosition5.spanSize += i38;
                        i36++;
                    }
                } else if (size == 2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                    String string = sb.toString();
                    if (string.equals("ww") && f10 > ((double) f9) * 1.4d) {
                        float f19 = groupedMessagePosition7.aspectRatio;
                        float f20 = groupedMessagePosition8.aspectRatio;
                        if (f19 - f20 < 0.2d) {
                            float f21 = this.maxSizeWidth;
                            float fRound = Math.round(Math.min(f21 / f19, Math.min(f21 / f20, this.maxSizeHeight / 2.0f))) / this.maxSizeHeight;
                            groupedMessagePosition7.set(0, 0, 0, 0, this.maxSizeWidth, fRound, 7);
                            groupedMessagePosition8.set(0, 0, 1, 1, this.maxSizeWidth, fRound, 11);
                        } else if (!string.equals("ww")) {
                            int i44 = this.maxSizeWidth / 2;
                            float f22 = i44;
                            float fRound2 = Math.round(Math.min(f22 / groupedMessagePosition7.aspectRatio, Math.min(f22 / groupedMessagePosition8.aspectRatio, this.maxSizeHeight))) / this.maxSizeHeight;
                            groupedMessagePosition7.set(0, 0, 0, 0, i44, fRound2, 13);
                            groupedMessagePosition8.set(1, 1, 0, 0, i44, fRound2, 14);
                            this.maxX = 1;
                        } else {
                            int i45 = this.maxSizeWidth / 2;
                            float f23 = i45;
                            float fRound3 = Math.round(Math.min(f23 / groupedMessagePosition7.aspectRatio, Math.min(f23 / groupedMessagePosition8.aspectRatio, this.maxSizeHeight))) / this.maxSizeHeight;
                            groupedMessagePosition7.set(0, 0, 0, 0, i45, fRound3, 13);
                            groupedMessagePosition8.set(1, 1, 0, 0, i45, fRound3, 14);
                            this.maxX = 1;
                        }
                    } else if (!string.equals("ww") || string.equals("qq")) {
                        int i46 = this.maxSizeWidth / 2;
                        float f24 = i46;
                        float fRound4 = Math.round(Math.min(f24 / groupedMessagePosition7.aspectRatio, Math.min(f24 / groupedMessagePosition8.aspectRatio, this.maxSizeHeight))) / this.maxSizeHeight;
                        groupedMessagePosition7.set(0, 0, 0, 0, i46, fRound4, 13);
                        groupedMessagePosition8.set(1, 1, 0, 0, i46, fRound4, 14);
                        this.maxX = 1;
                    } else {
                        float f25 = this.maxSizeWidth;
                        float f26 = groupedMessagePosition7.aspectRatio;
                        int iMax = (int) Math.max(0.4f * f25, Math.round((f25 / f26) / ((1.0f / f26) + (1.0f / groupedMessagePosition8.aspectRatio))));
                        int i47 = this.maxSizeWidth - iMax;
                        if (i47 < iMin) {
                            iMax -= iMin - i47;
                        } else {
                            iMin = i47;
                        }
                        float fMin2 = Math.min(this.maxSizeHeight, Math.round(Math.min(iMin / groupedMessagePosition7.aspectRatio, iMax / groupedMessagePosition8.aspectRatio))) / this.maxSizeHeight;
                        groupedMessagePosition7.set(0, 0, 0, 0, iMin, fMin2, 13);
                        groupedMessagePosition8.set(1, 1, 0, 0, iMax, fMin2, 14);
                        this.maxX = 1;
                    }
                    size = size;
                } else if (size == 3) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                    MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) this.posArray.get(2);
                    if (sb.charAt(0) == 'n') {
                        float f27 = this.maxSizeHeight * 0.5f;
                        float f28 = groupedMessagePosition10.aspectRatio;
                        float fMin3 = Math.min(f27, Math.round((this.maxSizeWidth * f28) / (groupedMessagePosition11.aspectRatio + f28)));
                        float f29 = this.maxSizeHeight - fMin3;
                        int iMax2 = (int) Math.max(iMin, Math.min(this.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition11.aspectRatio * fMin3, groupedMessagePosition10.aspectRatio * f29))));
                        int iRound = Math.round(Math.min((this.maxSizeHeight * groupedMessagePosition9.aspectRatio) + i14, this.maxSizeWidth - iMax2));
                        groupedMessagePosition9.set(0, 0, 0, 1, iRound, 1.0f, 13);
                        groupedMessagePosition10.set(1, 1, 0, 0, iMax2, f29 / this.maxSizeHeight, 6);
                        groupedMessagePosition11.set(1, 1, 1, 1, iMax2, fMin3 / this.maxSizeHeight, 10);
                        int i48 = this.maxSizeWidth;
                        groupedMessagePosition11.spanSize = i48;
                        float f30 = this.maxSizeHeight;
                        groupedMessagePosition9.siblingHeights = new float[]{fMin3 / f30, f29 / f30};
                        groupedMessagePosition10.spanSize = i48 - iRound;
                        groupedMessagePosition11.leftSpanOffset = iRound;
                        this.hasSibling = true;
                        this.maxX = 1;
                    } else {
                        float fRound5 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition9.aspectRatio, this.maxSizeHeight * 0.66f)) / this.maxSizeHeight;
                        groupedMessagePosition9.set(0, 1, 0, 0, this.maxSizeWidth, fRound5, 7);
                        int i49 = this.maxSizeWidth / 2;
                        float f31 = i49;
                        float fMin4 = Math.min(this.maxSizeHeight - fRound5, Math.round(Math.min(f31 / groupedMessagePosition10.aspectRatio, f31 / groupedMessagePosition11.aspectRatio))) / this.maxSizeHeight;
                        float f32 = fMin4 < fDp3 ? fDp3 : fMin4;
                        groupedMessagePosition10.set(0, 0, 1, 1, i49, f32, 9);
                        groupedMessagePosition11.set(1, 1, 1, 1, i49, f32, 10);
                        this.maxX = 1;
                    }
                } else {
                    MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                    MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) this.posArray.get(2);
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) this.posArray.get(3);
                    if (sb.charAt(0) == 'w') {
                        float fRound6 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition12.aspectRatio, this.maxSizeHeight * 0.66f)) / this.maxSizeHeight;
                        groupedMessagePosition12.set(0, 2, 0, 0, this.maxSizeWidth, fRound6, 7);
                        float fRound7 = Math.round(this.maxSizeWidth / ((groupedMessagePosition13.aspectRatio + groupedMessagePosition14.aspectRatio) + groupedMessagePosition15.aspectRatio));
                        float f33 = iMin;
                        int iMax3 = (int) Math.max(f33, Math.min(this.maxSizeWidth * 0.4f, groupedMessagePosition13.aspectRatio * fRound7));
                        int iMax4 = (int) Math.max(Math.max(f33, this.maxSizeWidth * 0.33f), groupedMessagePosition15.aspectRatio * fRound7);
                        int iDp2 = (this.maxSizeWidth - iMax3) - iMax4;
                        if (iDp2 < AndroidUtilities.dp(58.0f)) {
                            int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                            iDp2 = AndroidUtilities.dp(58.0f);
                            int i50 = iDp3 / 2;
                            iMax3 -= i50;
                            iMax4 -= iDp3 - i50;
                        }
                        int i51 = iMax4;
                        float fMin5 = Math.min(this.maxSizeHeight - fRound6, fRound7) / this.maxSizeHeight;
                        float f34 = fMin5 < fDp3 ? fDp3 : fMin5;
                        groupedMessagePosition13.set(0, 0, 1, 1, iMax3, f34, 9);
                        groupedMessagePosition14.set(1, 1, 1, 1, iDp2, f34, 8);
                        groupedMessagePosition15.set(2, 2, 1, 1, i51, f34, 10);
                        this.maxX = 2;
                    } else {
                        int iMax5 = Math.max(iMin, Math.round(this.maxSizeHeight / (((1.0f / groupedMessagePosition13.aspectRatio) + (1.0f / groupedMessagePosition14.aspectRatio)) + (1.0f / groupedMessagePosition15.aspectRatio))));
                        float f35 = iDp;
                        float f36 = iMax5;
                        float fMin6 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition13.aspectRatio) / this.maxSizeHeight);
                        float fMin7 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition14.aspectRatio) / this.maxSizeHeight);
                        float f37 = (1.0f - fMin6) - fMin7;
                        int iRound2 = Math.round(Math.min((this.maxSizeHeight * groupedMessagePosition12.aspectRatio) + i14, this.maxSizeWidth - iMax5));
                        groupedMessagePosition12.set(0, 0, 0, 2, iRound2, fMin6 + fMin7 + f37, 13);
                        groupedMessagePosition13.set(1, 1, 0, 0, iMax5, fMin6, 6);
                        groupedMessagePosition14.set(1, 1, 1, 1, iMax5, fMin7, 2);
                        groupedMessagePosition14.spanSize = this.maxSizeWidth;
                        groupedMessagePosition15.set(1, 1, 2, 2, iMax5, f37, 10);
                        int i52 = this.maxSizeWidth;
                        groupedMessagePosition15.spanSize = i52;
                        groupedMessagePosition13.spanSize = i52 - iRound2;
                        groupedMessagePosition14.leftSpanOffset = iRound2;
                        groupedMessagePosition15.leftSpanOffset = iRound2;
                        groupedMessagePosition12.siblingHeights = new float[]{fMin6, fMin7, f37};
                        this.hasSibling = true;
                        this.maxX = 1;
                    }
                }
                for (i6 = 0; i6 < size; i6++) {
                    groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) this.posArray.get(i6);
                    if (groupedMessagePosition2.maxX != this.maxX || (groupedMessagePosition2.flags & 2) != 0) {
                        groupedMessagePosition2.spanSize += 200;
                    }
                    if ((groupedMessagePosition2.flags & 1) != 0) {
                        groupedMessagePosition2.edge = true;
                    }
                    if (groupedMessagePosition2.edge) {
                        i11 = groupedMessagePosition2.spanSize;
                        if (i11 != 1000) {
                            groupedMessagePosition2.spanSize = i11 + 108;
                        }
                        groupedMessagePosition2.pw += 108;
                    } else if ((groupedMessagePosition2.flags & 2) != 0) {
                        i9 = groupedMessagePosition2.spanSize;
                        if (i9 != 1000) {
                            groupedMessagePosition2.spanSize = i9 - 108;
                        } else {
                            i10 = groupedMessagePosition2.leftSpanOffset;
                            if (i10 != 0) {
                                groupedMessagePosition2.leftSpanOffset = i10 + 108;
                            }
                        }
                    }
                }
                for (i7 = 0; i7 < size; i7++) {
                    groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i7);
                    if (groupedMessagePosition.minX == 0) {
                        groupedMessagePosition.spanSize += 200;
                    }
                    if ((groupedMessagePosition.flags & 2) != 0) {
                        groupedMessagePosition.edge = true;
                    }
                    this.maxX = Math.max(this.maxX, (int) groupedMessagePosition.maxX);
                    this.maxY = Math.max(this.maxY, (int) groupedMessagePosition.maxY);
                    groupedMessagePosition.left = getLeft(groupedMessagePosition, groupedMessagePosition.minY, groupedMessagePosition.maxY, groupedMessagePosition.minX);
                }
                for (i8 = 0; i8 < size; i8++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) this.posArray.get(i8);
                    groupedMessagePosition16.top = getTop(groupedMessagePosition16, groupedMessagePosition16.minY);
                }
                this.width = getWidth();
                this.height = getHeight();
            }
            while (i6 < size) {
                groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) this.posArray.get(i6);
                if (groupedMessagePosition2.maxX != this.maxX) {
                    groupedMessagePosition2.spanSize += 200;
                } else {
                    groupedMessagePosition2.spanSize += 200;
                }
                if ((groupedMessagePosition2.flags & 1) != 0) {
                    groupedMessagePosition2.edge = true;
                }
                if (groupedMessagePosition2.edge) {
                    i11 = groupedMessagePosition2.spanSize;
                    if (i11 != 1000) {
                        groupedMessagePosition2.spanSize = i11 + 108;
                    }
                    groupedMessagePosition2.pw += 108;
                } else if ((groupedMessagePosition2.flags & 2) != 0) {
                    i9 = groupedMessagePosition2.spanSize;
                    if (i9 != 1000) {
                        groupedMessagePosition2.spanSize = i9 - 108;
                    } else {
                        i10 = groupedMessagePosition2.leftSpanOffset;
                        if (i10 != 0) {
                            groupedMessagePosition2.leftSpanOffset = i10 + 108;
                        }
                    }
                }
            }
            while (i7 < size) {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i7);
                if (groupedMessagePosition.minX == 0) {
                    groupedMessagePosition.spanSize += 200;
                }
                if ((groupedMessagePosition.flags & 2) != 0) {
                    groupedMessagePosition.edge = true;
                }
                this.maxX = Math.max(this.maxX, (int) groupedMessagePosition.maxX);
                this.maxY = Math.max(this.maxY, (int) groupedMessagePosition.maxY);
                groupedMessagePosition.left = getLeft(groupedMessagePosition, groupedMessagePosition.minY, groupedMessagePosition.maxY, groupedMessagePosition.minX);
            }
            while (i8 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) this.posArray.get(i8);
                groupedMessagePosition17.top = getTop(groupedMessagePosition17, groupedMessagePosition17.minY);
            }
            this.width = getWidth();
            this.height = getHeight();
        }

        public int getWidth() {
            int[] iArr = new int[10];
            Arrays.fill(iArr, 0);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i);
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
                MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i);
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
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) this.posArray.get(i5);
                if (groupedMessagePosition2 != groupedMessagePosition && groupedMessagePosition2.maxX < i3) {
                    int iMin = Math.min((int) groupedMessagePosition2.maxY, i2) - i;
                    for (int iMax = Math.max(groupedMessagePosition2.minY - i, 0); iMax <= iMin; iMax++) {
                        fArr[iMax] = fArr[iMax] + groupedMessagePosition2.pw;
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
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) this.posArray.get(i3);
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

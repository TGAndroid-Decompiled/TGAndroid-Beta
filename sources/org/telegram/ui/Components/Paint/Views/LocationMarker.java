package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.recorder.HintView2;

public class LocationMarker extends View {
    public final AnimatedFloat animatedVideo;
    public boolean attachedToWindow;
    public final RectF bounds;
    public final float density;
    public TLRPC.Document flagAnimatedDocument;
    public final ImageReceiver flagAnimatedImageReceiver;
    public TLRPC.Document flagDocument;
    public final ImageReceiver flagImageReceiver;
    public boolean forceEmoji;
    public float h;
    public boolean hasFlag;
    public final Drawable icon;
    public boolean isVideo;
    public StaticLayout layout;
    public float layoutLeft;
    public float layoutWidth;
    public int maxWidth;
    public final Paint outlinePaint;
    public final RectF padding;
    public final int padx;
    public final int pady;
    public boolean relayout;
    public String text;
    public final TextPaint textPaint;
    public float textScale;
    public float w;

    public LocationMarker(Context context, float f) {
        super(context);
        this.text = "";
        this.padding = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.outlinePaint = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.flagImageReceiver = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.flagAnimatedImageReceiver = imageReceiver2;
        this.textScale = 1.0f;
        this.bounds = new RectF();
        new Path();
        this.animatedVideo = new AnimatedFloat(350L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.density = f;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i = (int) (3.0f * f);
        this.padx = i;
        int i2 = (int) (1.0f * f);
        this.pady = i2;
        setPadding(i, i2, i, i2);
        this.icon = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public static TLRPC.Document findDocument(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.packs != null && tL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tL_messages_stickerSet.packs.size(); i++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i);
                String str2 = tL_stickerPack.emoticon;
                if (str2 != null && str != null) {
                    ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str2);
                    for (int i2 = 0; i2 < emojis.size(); i2++) {
                        if (TextUtils.equals(emojis.get(i2).code, str)) {
                            if (!tL_stickerPack.documents.isEmpty()) {
                                long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                                    if (tL_messages_stickerSet.documents.get(i3).id == jLongValue) {
                                        return tL_messages_stickerSet.documents.get(i3);
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static TextCell.AnonymousClass2 getEmojiThumb(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new TextCell.AnonymousClass2(emojiBigDrawable, 3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        drawInternal(canvas);
    }

    public final void drawInternal(Canvas canvas) {
        setupLayout();
        if (this.layout == null) {
            return;
        }
        RectF rectF = this.bounds;
        int i = this.padx;
        float f = i;
        int i2 = this.pady;
        float f2 = i2;
        rectF.set(f, f2, this.w + f, this.h + f2);
        float f3 = this.h * 0.2f;
        canvas.drawRoundRect(rectF, f3, f3, this.outlinePaint);
        boolean z = this.hasFlag;
        RectF rectF2 = this.padding;
        float f4 = this.density;
        if (z) {
            float f5 = this.animatedVideo.set(this.isVideo);
            if (f5 > 0.0f) {
                ImageReceiver imageReceiver = this.flagAnimatedImageReceiver;
                float f6 = f4 * 21.33f;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f4) + f, ImageReceiver$$ExternalSyntheticOutline0.m(this.h, f6, 2.0f, f2), f6, f6);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(f5);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (f5 < 1.0f) {
                ImageReceiver imageReceiver2 = this.flagImageReceiver;
                float f7 = f4 * 21.33f;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f4) + f, ImageReceiver$$ExternalSyntheticOutline0.m(this.h, f7, 2.0f, f2), f7, f7);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - f5);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.forceEmoji) {
            float f8 = rectF2.left;
            float f9 = this.h;
            float f10 = f4 * 21.33f;
            Drawable drawable = this.icon;
            drawable.setBounds(((int) (f8 * f4)) + i, ((int) ((f9 - f10) / 2.0f)) + i2, i + ((int) ((f8 + 21.33f) * f4)), i2 + ((int) ((f10 + f9) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.hasFlag || this.forceEmoji) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f4) + f, (this.h / 2.0f) + f2);
        float f11 = this.textScale;
        canvas.scale(f11, f11);
        canvas.translate(-this.layoutLeft, (-this.layout.getHeight()) / 2.0f);
        this.layout.draw(canvas);
        canvas.restore();
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.isVideo || (document = this.flagAnimatedDocument) == null) ? this.flagDocument : document;
    }

    public int getHeightInternal() {
        int iRound = Math.round(this.h);
        int i = this.pady;
        return iRound + i + i;
    }

    public float getRadius() {
        return this.h * 0.2f;
    }

    public String getText() {
        return this.text;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int iRound = Math.round(this.w);
        int i = this.padx;
        return iRound + i + i;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.isVideo) {
            this.flagAnimatedImageReceiver.onAttachedToWindow();
        } else {
            this.flagImageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        this.flagImageReceiver.onDetachedFromWindow();
        this.flagAnimatedImageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setupLayout();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public final void setCodeEmoji(int i, final String str) {
        boolean z;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.flagAnimatedImageReceiver;
        ImageReceiver imageReceiver2 = this.flagImageReceiver;
        if (zIsEmpty) {
            this.hasFlag = false;
            this.flagDocument = null;
            this.flagAnimatedDocument = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
            z = true;
        } else {
            this.hasFlag = true;
            this.flagDocument = null;
            this.flagAnimatedDocument = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i2 = 0;
            MediaDataController.getInstance(i).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final LocationMarker f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i2) {
                        case 0:
                            LocationMarker locationMarker = this.f$0;
                            locationMarker.getClass();
                            String str2 = str;
                            TLRPC.Document documentFindDocument = LocationMarker.findDocument(str2, (TLRPC.TL_messages_stickerSet) obj);
                            locationMarker.flagDocument = documentFindDocument;
                            locationMarker.flagImageReceiver.setImage(ImageLocation.getForDocument(documentFindDocument), "80_80", LocationMarker.getEmojiThumb(str2), null, null, 0);
                            locationMarker.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(locationMarker.flagAnimatedDocument), "80_80", ImageLocation.getForDocument(locationMarker.flagDocument), "80_80", null, null, LocationMarker.getEmojiThumb(str2), 0L, null, null, 0);
                            break;
                        default:
                            LocationMarker locationMarker2 = this.f$0;
                            locationMarker2.getClass();
                            String str3 = str;
                            TLRPC.Document documentFindDocument2 = LocationMarker.findDocument(str3, (TLRPC.TL_messages_stickerSet) obj);
                            locationMarker2.flagAnimatedDocument = documentFindDocument2;
                            if (documentFindDocument2 != null) {
                                locationMarker2.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(documentFindDocument2), "80_80", ImageLocation.getForDocument(locationMarker2.flagDocument), "80_80", null, null, LocationMarker.getEmojiThumb(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i3 = 1;
            MediaDataController.getInstance(i).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final LocationMarker f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i3) {
                        case 0:
                            LocationMarker locationMarker = this.f$0;
                            locationMarker.getClass();
                            String str2 = str;
                            TLRPC.Document documentFindDocument = LocationMarker.findDocument(str2, (TLRPC.TL_messages_stickerSet) obj);
                            locationMarker.flagDocument = documentFindDocument;
                            locationMarker.flagImageReceiver.setImage(ImageLocation.getForDocument(documentFindDocument), "80_80", LocationMarker.getEmojiThumb(str2), null, null, 0);
                            locationMarker.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(locationMarker.flagAnimatedDocument), "80_80", ImageLocation.getForDocument(locationMarker.flagDocument), "80_80", null, null, LocationMarker.getEmojiThumb(str2), 0L, null, null, 0);
                            break;
                        default:
                            LocationMarker locationMarker2 = this.f$0;
                            locationMarker2.getClass();
                            String str3 = str;
                            TLRPC.Document documentFindDocument2 = LocationMarker.findDocument(str3, (TLRPC.TL_messages_stickerSet) obj);
                            locationMarker2.flagAnimatedDocument = documentFindDocument2;
                            if (documentFindDocument2 != null) {
                                locationMarker2.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(documentFindDocument2), "80_80", ImageLocation.getForDocument(locationMarker2.flagDocument), "80_80", null, null, LocationMarker.getEmojiThumb(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.flagDocument), "80_80", getEmojiThumb(str), null, null, 0);
            z = true;
            imageReceiver.setImage(ImageLocation.getForDocument(this.flagAnimatedDocument), "80_80", ImageLocation.getForDocument(this.flagDocument), "80_80", null, null, getEmojiThumb(str), 0L, null, null, 0);
        }
        this.relayout = z;
        requestLayout();
    }

    public void setIsVideo(boolean z) {
        if (this.isVideo != z && this.attachedToWindow) {
            ImageReceiver imageReceiver = this.flagAnimatedImageReceiver;
            ImageReceiver imageReceiver2 = this.flagImageReceiver;
            if (z) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.isVideo = z;
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        this.relayout = true;
    }

    public void setText(String str) {
        this.text = str;
        this.relayout = true;
        requestLayout();
    }

    public final void setType(int i, int i2) {
        Drawable drawable = this.icon;
        TextPaint textPaint = this.textPaint;
        Paint paint = this.outlinePaint;
        if (i == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i2);
            int i3 = AndroidUtilities.computePerceivedBrightness(i2) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i3);
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void setupLayout() {
        float f;
        if (this.relayout) {
            TextPaint textPaint = this.textPaint;
            float fMeasureText = textPaint.measureText(this.text);
            int i = this.maxWidth;
            int i2 = this.padx;
            float f2 = (i - i2) - i2;
            RectF rectF = this.padding;
            float f3 = 2.25f;
            float f4 = rectF.left + ((this.hasFlag || this.forceEmoji) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f5 = this.density;
            float f6 = f2 - (f4 * f5);
            float fMin = Math.min(1.0f, f6 / fMeasureText);
            this.textScale = fMin;
            if (fMin < 0.4f) {
                f = 1.0f;
                String str = this.text;
                this.layout = new StaticLayout(str, textPaint, HintView2.cutInFancyHalf(str, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f = 1.0f;
                this.layout = new StaticLayout(this.text, textPaint, (int) Math.ceil(fMeasureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.layoutWidth = 0.0f;
            this.layoutLeft = Float.MAX_VALUE;
            for (int i3 = 0; i3 < this.layout.getLineCount(); i3++) {
                this.layoutWidth = Math.max(this.layoutWidth, this.layout.getLineWidth(i3));
                this.layoutLeft = Math.min(this.layoutLeft, this.layout.getLineLeft(i3));
            }
            if (this.layout.getLineCount() > 2) {
                this.textScale = 0.3f;
            } else {
                this.textScale = Math.min(f, f6 / this.layoutWidth);
            }
            float f7 = rectF.left;
            if (!this.hasFlag && !this.forceEmoji) {
                f3 = 0.0f;
            }
            this.w = (this.layoutWidth * this.textScale) + ((f7 + f3 + 21.33f + 3.25f + rectF.right) * f5);
            this.h = Math.max(f5 * 21.33f, this.layout.getHeight() * this.textScale) + ((rectF.top + rectF.bottom) * f5);
            this.relayout = false;
        }
    }
}

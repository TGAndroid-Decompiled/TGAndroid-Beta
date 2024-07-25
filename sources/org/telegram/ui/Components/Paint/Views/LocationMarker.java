package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.recorder.HintView2;
public class LocationMarker extends View {
    private AnimatedFloat animatedVideo;
    private boolean attachedToWindow;
    private final RectF bounds;
    public final float density;
    private TLRPC$Document flagAnimatedDocument;
    private final ImageReceiver flagAnimatedImageReceiver;
    private TLRPC$Document flagDocument;
    private final ImageReceiver flagImageReceiver;
    private boolean forceEmoji;
    private float h;
    private boolean hasFlag;
    private final Drawable icon;
    private boolean isVideo;
    private StaticLayout layout;
    private float layoutLeft;
    private float layoutWidth;
    private int maxWidth;
    public final Paint outlinePaint;
    private final RectF padding;
    public final int padx;
    public final int pady;
    private boolean relayout;
    private String text;
    private final TextPaint textPaint;
    private float textScale;
    private float w;

    public int getTypesCount() {
        return 4;
    }

    public LocationMarker(Context context, int i, float f, int i2) {
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
        this.animatedVideo = new AnimatedFloat(this, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.density = f;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i3 = (int) (3.0f * f);
        this.padx = i3;
        int i4 = (int) (1.0f * f);
        this.pady = i4;
        setPadding(i3, i4, i3, i4);
        this.icon = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        this.relayout = true;
    }

    public void forceEmoji() {
        this.forceEmoji = true;
        this.relayout = true;
        requestLayout();
    }

    private Drawable getEmojiThumb(String str) {
        final Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new Drawable(this) {
            @Override
            public void draw(Canvas canvas) {
                canvas.save();
                if (emojiBigDrawable.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, emojiBigDrawable.getBounds().centerX(), emojiBigDrawable.getBounds().centerY());
                }
                emojiBigDrawable.draw(canvas);
                canvas.restore();
            }

            @Override
            public void setAlpha(int i) {
                emojiBigDrawable.setAlpha(i);
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
                emojiBigDrawable.setColorFilter(colorFilter);
            }

            @Override
            public void setBounds(Rect rect) {
                emojiBigDrawable.setBounds(rect);
            }

            @Override
            public void setBounds(int i, int i2, int i3, int i4) {
                emojiBigDrawable.setBounds(i, i2, i3, i4);
            }

            @Override
            public int getOpacity() {
                return emojiBigDrawable.getOpacity();
            }
        };
    }

    public void setCodeEmoji(int i, final String str) {
        if (TextUtils.isEmpty(str)) {
            this.hasFlag = false;
            this.flagDocument = null;
            this.flagAnimatedDocument = null;
            this.flagImageReceiver.clearImage();
            this.flagAnimatedImageReceiver.clearImage();
        } else {
            this.hasFlag = true;
            this.flagDocument = null;
            this.flagAnimatedDocument = null;
            TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i).getStickerSet(tLRPC$TL_inputStickerSetShortName, 0, false, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    LocationMarker.this.lambda$setCodeEmoji$0(str, (TLRPC$TL_messages_stickerSet) obj);
                }
            });
            TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName2 = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i).getStickerSet(tLRPC$TL_inputStickerSetShortName2, 0, false, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    LocationMarker.this.lambda$setCodeEmoji$1(str, (TLRPC$TL_messages_stickerSet) obj);
                }
            });
            this.flagImageReceiver.setImage(ImageLocation.getForDocument(this.flagDocument), "80_80", getEmojiThumb(str), null, null, 0);
            this.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(this.flagAnimatedDocument), "80_80", ImageLocation.getForDocument(this.flagDocument), "80_80", null, null, getEmojiThumb(str), 0L, null, null, 0);
        }
        this.relayout = true;
        requestLayout();
    }

    public void lambda$setCodeEmoji$0(String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$Document findDocument = findDocument(tLRPC$TL_messages_stickerSet, str);
        this.flagDocument = findDocument;
        this.flagImageReceiver.setImage(ImageLocation.getForDocument(findDocument), "80_80", getEmojiThumb(str), null, null, 0);
        this.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(this.flagAnimatedDocument), "80_80", ImageLocation.getForDocument(this.flagDocument), "80_80", null, null, getEmojiThumb(str), 0L, null, null, 0);
    }

    public void lambda$setCodeEmoji$1(String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$Document findDocument = findDocument(tLRPC$TL_messages_stickerSet, str);
        this.flagAnimatedDocument = findDocument;
        if (findDocument == null) {
            return;
        }
        this.flagAnimatedImageReceiver.setImage(ImageLocation.getForDocument(findDocument), "80_80", ImageLocation.getForDocument(this.flagDocument), "80_80", null, null, getEmojiThumb(str), 0L, null, null, 0);
    }

    private TLRPC$Document findDocument(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, String str) {
        if (tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.packs != null && tLRPC$TL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tLRPC$TL_messages_stickerSet.packs.size(); i++) {
                TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i);
                if (containsEmoji(tLRPC$TL_stickerPack.emoticon, str) && !tLRPC$TL_stickerPack.documents.isEmpty()) {
                    long longValue = tLRPC$TL_stickerPack.documents.get(0).longValue();
                    for (int i2 = 0; i2 < tLRPC$TL_messages_stickerSet.documents.size(); i2++) {
                        if (tLRPC$TL_messages_stickerSet.documents.get(i2).id == longValue) {
                            return tLRPC$TL_messages_stickerSet.documents.get(i2);
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private boolean containsEmoji(String str, String str2) {
        if (str != null && str2 != null) {
            ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
            for (int i = 0; i < parseEmojis.size(); i++) {
                if (TextUtils.equals(parseEmojis.get(i).code, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public TLRPC$Document getCodeEmojiDocument() {
        TLRPC$Document tLRPC$Document;
        return (!this.isVideo || (tLRPC$Document = this.flagAnimatedDocument) == null) ? this.flagDocument : tLRPC$Document;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        attachInternal();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        detachInternal();
    }

    public void attachInternal() {
        this.attachedToWindow = true;
        if (this.isVideo) {
            this.flagAnimatedImageReceiver.onAttachedToWindow();
        } else {
            this.flagImageReceiver.onAttachedToWindow();
        }
    }

    public void detachInternal() {
        this.attachedToWindow = false;
        this.flagImageReceiver.onDetachedFromWindow();
        this.flagAnimatedImageReceiver.onDetachedFromWindow();
    }

    public void setText(String str) {
        this.text = str;
        this.relayout = true;
        requestLayout();
    }

    public String getText() {
        return this.text;
    }

    public void setType(int i, int i2) {
        if (i == 0) {
            this.outlinePaint.setColor(i2);
            int i3 = AndroidUtilities.computePerceivedBrightness(i2) < 0.721f ? -1 : -16777216;
            this.textPaint.setColor(i3);
            this.icon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            this.outlinePaint.setColor(-16777216);
            this.textPaint.setColor(-1);
            this.icon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 2) {
            this.outlinePaint.setColor(1275068416);
            this.textPaint.setColor(-1);
            this.icon.setColorFilter(null);
        } else {
            this.outlinePaint.setColor(-1);
            this.textPaint.setColor(-16777216);
            this.icon.setColorFilter(null);
        }
        invalidate();
    }

    public void setIsVideo(boolean z) {
        if (this.isVideo != z && this.attachedToWindow) {
            if (z) {
                this.flagImageReceiver.onDetachedFromWindow();
                this.flagAnimatedImageReceiver.onAttachedToWindow();
            } else {
                this.flagImageReceiver.onAttachedToWindow();
                this.flagAnimatedImageReceiver.onDetachedFromWindow();
            }
        }
        this.isVideo = z;
        invalidate();
    }

    public void setupLayout() {
        if (this.relayout) {
            float measureText = this.textPaint.measureText(this.text);
            int i = this.maxWidth;
            int i2 = this.padx;
            float f = (i - i2) - i2;
            RectF rectF = this.padding;
            float f2 = 2.25f;
            float f3 = f - (((((rectF.left + ((this.hasFlag || this.forceEmoji) ? 2.25f : 0.0f)) + 21.33f) + 3.25f) + rectF.right) * this.density);
            float min = Math.min(1.0f, f3 / measureText);
            this.textScale = min;
            if (min < 0.4f) {
                String str = this.text;
                TextPaint textPaint = this.textPaint;
                this.layout = new StaticLayout(str, textPaint, HintView2.cutInFancyHalf(str, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                this.layout = new StaticLayout(this.text, this.textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                this.textScale = Math.min(1.0f, f3 / this.layoutWidth);
            }
            RectF rectF2 = this.padding;
            float f4 = rectF2.left;
            if (!this.hasFlag && !this.forceEmoji) {
                f2 = 0.0f;
            }
            float f5 = f4 + f2 + 21.33f + 3.25f + rectF2.right;
            float f6 = this.density;
            this.w = (f5 * f6) + (this.layoutWidth * this.textScale);
            this.h = ((rectF2.top + rectF2.bottom) * f6) + Math.max(f6 * 21.33f, this.layout.getHeight() * this.textScale);
            this.relayout = false;
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setupLayout();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public int getWidthInternal() {
        return this.padx + Math.round(this.w) + this.padx;
    }

    public int getHeightInternal() {
        return this.pady + Math.round(this.h) + this.pady;
    }

    public float getRadius() {
        return this.h * 0.2f;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        drawInternal(canvas);
    }

    public void drawInternal(Canvas canvas) {
        setupLayout();
        if (this.layout == null) {
            return;
        }
        RectF rectF = this.bounds;
        int i = this.padx;
        int i2 = this.pady;
        rectF.set(i, i2, i + this.w, i2 + this.h);
        RectF rectF2 = this.bounds;
        float f = this.h;
        canvas.drawRoundRect(rectF2, f * 0.2f, f * 0.2f, this.outlinePaint);
        float f2 = 0.0f;
        if (this.hasFlag) {
            float f3 = this.animatedVideo.set(this.isVideo);
            if (f3 > 0.0f) {
                ImageReceiver imageReceiver = this.flagAnimatedImageReceiver;
                float f4 = this.density;
                imageReceiver.setImageCoords(this.padx + ((this.padding.left + 2.25f) * f4), this.pady + ((this.h - (f4 * 21.33f)) / 2.0f), f4 * 21.33f, f4 * 21.33f);
                canvas.save();
                canvas.scale(1.2f, 1.2f, this.flagAnimatedImageReceiver.getCenterX(), this.flagAnimatedImageReceiver.getCenterY());
                this.flagAnimatedImageReceiver.setAlpha(f3);
                this.flagAnimatedImageReceiver.draw(canvas);
                canvas.restore();
            }
            if (f3 < 1.0f) {
                ImageReceiver imageReceiver2 = this.flagImageReceiver;
                float f5 = this.density;
                imageReceiver2.setImageCoords(this.padx + ((this.padding.left + 2.25f) * f5), this.pady + ((this.h - (f5 * 21.33f)) / 2.0f), f5 * 21.33f, f5 * 21.33f);
                canvas.save();
                canvas.scale(1.2f, 1.2f, this.flagImageReceiver.getCenterX(), this.flagImageReceiver.getCenterY());
                this.flagImageReceiver.setAlpha(1.0f - f3);
                this.flagImageReceiver.draw(canvas);
                canvas.restore();
            }
        } else if (!this.forceEmoji) {
            Drawable drawable = this.icon;
            int i3 = this.padx;
            float f6 = this.padding.left;
            float f7 = this.density;
            int i4 = this.pady;
            float f8 = this.h;
            drawable.setBounds(((int) (f6 * f7)) + i3, ((int) ((f8 - (f7 * 21.33f)) / 2.0f)) + i4, i3 + ((int) ((f6 + 21.33f) * f7)), i4 + ((int) ((f8 + (f7 * 21.33f)) / 2.0f)));
            this.icon.draw(canvas);
        }
        canvas.save();
        canvas.translate(this.padx + ((this.padding.left + ((this.hasFlag || this.forceEmoji) ? 2.25f : 2.25f) + 21.33f + 3.25f) * this.density), this.pady + (this.h / 2.0f));
        float f9 = this.textScale;
        canvas.scale(f9, f9);
        canvas.translate(-this.layoutLeft, (-this.layout.getHeight()) / 2.0f);
        this.layout.draw(canvas);
        canvas.restore();
    }

    public void getEmojiBounds(RectF rectF) {
        int i = this.padx;
        float f = this.padding.left;
        float f2 = this.density;
        int i2 = this.pady;
        float f3 = this.h;
        rectF.set(i + ((f + 2.25f) * f2), i2 + ((f3 - (f2 * 21.33f)) / 2.0f), i + ((f + 2.25f + 21.33f) * f2), i2 + ((f3 + (f2 * 21.33f)) / 2.0f));
    }
}

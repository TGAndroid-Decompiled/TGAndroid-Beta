package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;

public class LinkPreview extends View {
    private boolean animated;
    public int backgroundColor;
    private final RectF bounds;
    private final AnimatedFloat captionAbove;
    private int currentAccount;
    public final float density;
    private StaticLayout descriptionLayout;
    private float descriptionLayoutLeft;
    private float descriptionLayoutWidth;
    private final TextPaint descriptionPaint;
    private float h;
    private boolean hasDescription;
    private boolean hasPhoto;
    private boolean hasSiteName;
    private boolean hasTitle;
    private final AnimatedFloat height;
    private final Drawable icon;
    private StaticLayout layout;
    private float layoutLeft;
    private final TextPaint layoutPaint;
    private float layoutWidth;
    public int maxWidth;
    private boolean messageAbove;
    private Text messageText;
    private final Paint outlinePaint;
    private final RectF padding;
    public final int padx;
    public final int pady;
    private final Path path;
    private final Path path2;
    private final AnimatedFloat photoAlphaProgress;
    private float photoHeight;
    private final ImageReceiver photoImage;
    private final AnimatedFloat photoSmallProgress;
    private float previewHeight;
    private final AnimatedFloat previewHeightProgress;
    private Paint previewPaint;
    private final AnimatedFloat previewProgress;
    private final RectF rect;
    private final RectF rect1;
    private final RectF rect2;
    private boolean relayout;
    private Text siteNameText;
    private boolean smallPhoto;
    private float textScale;
    private Text titleText;
    public int type;
    private float w;
    private WebPagePreview webpage;
    private final AnimatedFloat width;

    public static String fromUrl(String str) {
        return str;
    }

    public LinkPreview(Context context, float f) {
        super(context);
        this.relayout = true;
        this.textScale = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.layoutPaint = textPaint;
        this.padding = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.outlinePaint = new Paint(1);
        this.previewPaint = new Paint(1);
        this.descriptionPaint = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.photoImage = imageReceiver;
        this.bounds = new RectF();
        this.rect = new RectF();
        this.path = new Path();
        this.path2 = new Path();
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.captionAbove = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.photoAlphaProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.photoSmallProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.previewProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.previewHeightProgress = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.width = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.height = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.density = f;
        imageReceiver.setInvalidateAll(true);
        this.padx = (int) (f * 3.0f);
        this.pady = (int) (f * 1.0f);
        this.icon = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        this.relayout = true;
    }

    private void setupLayout() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Views.LinkPreview.setupLayout():void");
    }

    public boolean withPreview() {
        WebPagePreview webPagePreview = this.webpage;
        return (webPagePreview == null || webPagePreview.webpage == null) ? false : true;
    }

    public void setType(int i, int i2) {
        if (this.type == 1) {
            return;
        }
        if (i == 0) {
            this.backgroundColor = i2;
            int i3 = AndroidUtilities.computePerceivedBrightness(i2) < 0.721f ? -1 : -16777216;
            this.layoutPaint.setColor(i3);
            this.icon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            this.backgroundColor = -16777216;
            this.layoutPaint.setColor(-1);
            this.icon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 2) {
            this.backgroundColor = 1275068416;
            this.layoutPaint.setColor(-1);
            this.icon.setColorFilter(null);
        } else {
            this.backgroundColor = -1;
            this.layoutPaint.setColor(-13397548);
            this.icon.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public void set(int i, WebPagePreview webPagePreview) {
        set(i, webPagePreview, false);
    }

    public void set(int i, WebPagePreview webPagePreview, boolean z) {
        this.currentAccount = i;
        if (this.webpage != webPagePreview || z) {
            this.webpage = webPagePreview;
            this.relayout = true;
            this.animated = z;
            requestLayout();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        drawInternal(canvas);
    }

    public float getRadius() {
        float f;
        float f2;
        if (withPreview()) {
            f = 16.66f;
            f2 = this.density;
        } else {
            f = 0.2f;
            f2 = this.h;
        }
        return f2 * f;
    }

    public void drawInternal(Canvas canvas) {
        Text text;
        Text text2;
        setupLayout();
        float f = this.width.set(this.w);
        float f2 = this.height.set(this.h);
        float f3 = this.previewProgress.set(withPreview());
        float lerp = AndroidUtilities.lerp(0.2f * f2, this.density * 16.66f, f3);
        RectF rectF = this.bounds;
        int i = this.padx;
        int i2 = this.pady;
        rectF.set(i, i2, i + f, i2 + f2);
        this.outlinePaint.setColor(ColorUtils.blendARGB(this.backgroundColor, -14670807, f3));
        this.path2.rewind();
        this.path2.addRoundRect(this.bounds, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(this.path2, this.outlinePaint);
        if (f3 > 0.0f) {
            canvas.save();
            canvas.clipPath(this.path2);
            canvas.translate(this.padx, this.pady);
            float f4 = this.captionAbove.set(this.messageAbove);
            float f5 = this.density;
            float f6 = (7.33f * f5) + 0.0f;
            Text text3 = this.messageText;
            if (text3 != null && f4 > 0.0f) {
                text3.draw(canvas, f5 * 10.0f, (f6 + (text3.getHeight() / 2.0f)) - ((this.messageText.getHeight() + (this.density * 15.0f)) * (1.0f - f4)), -15033089, f3);
                f6 += (this.messageText.getHeight() + (this.density * 7.0f)) * f4;
            }
            float f7 = f6;
            float f8 = this.previewHeightProgress.set(this.previewHeight);
            this.previewPaint.setAlpha(25);
            RectF rectF2 = this.rect;
            float f9 = this.density;
            float f10 = f7 + f8;
            rectF2.set(f9 * 10.0f, f7, f - (f9 * 10.0f), f10);
            this.path.rewind();
            Path path = this.path;
            RectF rectF3 = this.rect;
            float f11 = this.density;
            path.addRoundRect(rectF3, f11 * 5.0f, f11 * 5.0f, Path.Direction.CW);
            canvas.drawPath(this.path, this.previewPaint);
            canvas.save();
            canvas.clipPath(this.path);
            this.previewPaint.setAlpha(255);
            float f12 = this.density;
            canvas.drawRect(f12 * 10.0f, f7, f12 * 13.0f, f10, this.previewPaint);
            canvas.restore();
            float f13 = this.density;
            float f14 = f7 + (5.66f * f13);
            if (this.hasSiteName && (text2 = this.siteNameText) != null) {
                text2.draw(canvas, f13 * 20.0f, f14 + (text2.getHeight() / 2.0f), this.previewPaint.getColor(), f3);
                f14 += this.siteNameText.getHeight() + (this.density * 2.66f);
            }
            if (this.hasTitle && (text = this.titleText) != null) {
                text.draw(canvas, this.density * 20.0f, f14 + (text.getHeight() / 2.0f), -1, f3);
                f14 += this.titleText.getHeight() + (this.density * 2.66f);
            }
            if (this.hasDescription && this.descriptionLayout != null) {
                canvas.save();
                canvas.translate((this.density * 20.0f) - this.descriptionLayoutLeft, f14);
                this.descriptionPaint.setColor(-1);
                this.descriptionPaint.setAlpha((int) (f3 * 255.0f));
                this.descriptionLayout.draw(canvas);
                canvas.restore();
                f14 += this.descriptionLayout.getHeight() + (this.density * 2.66f);
            }
            float f15 = this.photoAlphaProgress.set(this.hasPhoto);
            if (f15 > 0.0f) {
                float f16 = this.photoSmallProgress.set(this.smallPhoto);
                RectF rectF4 = this.rect1;
                float f17 = this.density;
                rectF4.set(f17 * 20.0f, (f17 * 2.66f) + f14, f - (20.0f * f17), (f17 * 2.66f) + f14 + this.photoHeight);
                RectF rectF5 = this.rect2;
                float f18 = this.density;
                rectF5.set(((f - (f18 * 10.0f)) - (f18 * 6.0f)) - (f18 * 48.0f), f7 + (f18 * 6.0f), (f - (f18 * 10.0f)) - (f18 * 6.0f), f7 + (6.0f * f18) + (f18 * 48.0f));
                AndroidUtilities.lerp(this.rect1, this.rect2, f16, this.rect);
                ImageReceiver imageReceiver = this.photoImage;
                RectF rectF6 = this.rect;
                imageReceiver.setImageCoords(rectF6.left, rectF6.top, rectF6.width(), this.rect.height());
                this.photoImage.setAlpha(f15 * f3);
                this.photoImage.draw(canvas);
                f14 += (1.0f - f16) * ((this.density * 2.66f) + this.photoHeight);
            }
            float f19 = this.density;
            float f20 = f14 + (7.0f * f19) + (5.0f * f19);
            Text text4 = this.messageText;
            if (text4 != null && 1.0f - f4 > 0.0f) {
                text4.draw(canvas, f19 * 10.0f, f20 + (text4.getHeight() / 2.0f) + ((this.messageText.getHeight() + (this.density * 15.0f)) * f4), -15033089, f3);
                this.messageText.getHeight();
            }
            canvas.restore();
        }
        if (f3 < 1.0f) {
            Drawable drawable = this.icon;
            int i3 = this.padx;
            float f21 = this.padding.left;
            float f22 = this.density;
            int i4 = this.pady;
            drawable.setBounds(((int) (f21 * f22)) + i3, ((int) ((f2 - (f22 * 30.0f)) / 2.0f)) + i4, i3 + ((int) ((f21 + 30.0f) * f22)), i4 + ((int) (((f22 * 30.0f) + f2) / 2.0f)));
            int i5 = (int) ((1.0f - f3) * 255.0f);
            this.icon.setAlpha(i5);
            this.icon.draw(canvas);
            if (this.layout != null) {
                canvas.save();
                canvas.translate(this.padx + ((this.padding.left + 30.0f + 3.25f) * this.density), this.pady + (f2 / 2.0f));
                float f23 = this.textScale;
                canvas.scale(f23, f23);
                canvas.translate(-this.layoutLeft, (-this.layout.getHeight()) / 2.0f);
                this.layoutPaint.setAlpha(i5);
                this.layout.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setupLayout();
        setMeasuredDimension(this.padx + Math.round(this.w) + this.padx, this.pady + Math.round(this.h) + this.pady);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.photoImage.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.photoImage.onDetachedFromWindow();
    }

    public static class WebPagePreview extends TLObject {
        public boolean captionAbove = true;
        public int flags;
        public boolean largePhoto;
        public String name;
        public String url;
        public TLRPC$WebPage webpage;

        public static WebPagePreview TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (-625858389 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in WebPagePreview", Integer.valueOf(i)));
                }
                return null;
            }
            WebPagePreview webPagePreview = new WebPagePreview();
            webPagePreview.readParams(abstractSerializedData, z);
            return webPagePreview;
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-625858389);
            this.flags = this.webpage != null ? this.flags | 1 : this.flags & (-2);
            int i = !TextUtils.isEmpty(this.name) ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            int i2 = this.largePhoto ? i | 8 : i & (-9);
            this.flags = i2;
            int i3 = this.captionAbove ? i2 | 16 : i2 & (-17);
            this.flags = i3;
            abstractSerializedData.writeInt32(i3);
            abstractSerializedData.writeString(this.url);
            if ((this.flags & 1) != 0) {
                this.webpage.serializeToStream(abstractSerializedData);
            }
            if ((this.flags & 2) != 0) {
                abstractSerializedData.writeString(this.name);
            }
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            this.flags = readInt32;
            this.largePhoto = (readInt32 & 8) != 0;
            this.captionAbove = (readInt32 & 16) != 0;
            this.url = abstractSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.webpage = TLRPC$WebPage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.name = abstractSerializedData.readString(z);
            }
        }
    }
}

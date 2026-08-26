package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RectOld;

public final class LinkView extends EntityView {
    public int currentColor;
    public int currentType;
    public boolean hasColor;
    public LinkPreview.WebPagePreview link;
    public final LinkPreview marker;

    public LinkView(Context context, PointF pointF, int i, LinkPreview.WebPagePreview webPagePreview, float f, int i2) {
        super(context, pointF);
        LinkPreview linkPreview = new LinkPreview(context, f);
        this.marker = linkPreview;
        linkPreview.setMaxWidth(i2);
        this.link = webPagePreview;
        linkPreview.set(i, webPagePreview, false);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
        this.currentType = 3;
        linkPreview.setType(3, this.currentColor);
        addView(linkPreview, LayoutHelper.createFrame(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        updatePosition();
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new TextViewSelectionView(this, getContext());
    }

    public int getColor() {
        return this.currentColor;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i = this.currentType + 1;
        return i == 4 ? !this.hasColor ? 1 : 0 : i;
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fM$1 = OKLCH.m$1(fDp, 2.0f, getPositionX(), scaleX);
        return new RectOld(fM$1, OKLCH.m$1(fDp2, 2.0f, getPositionY(), scaleX), ((fDp * scaleX) + fM$1) - fM$1, fDp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.marker.pady;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.marker.padx;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.marker.padx;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.marker.pady;
    }

    public int getType() {
        return this.currentType;
    }

    public final boolean hasColor() {
        return this.hasColor;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updatePosition();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePosition();
    }

    public void setColor(int i) {
        this.hasColor = true;
        this.currentColor = i;
    }

    public void setMaxWidth(int i) {
        this.marker.setMaxWidth(i);
    }

    public void setType(int i) {
        LinkPreview linkPreview = this.marker;
        this.currentType = i;
        linkPreview.setType(i, this.currentColor);
    }

    public final class TextViewSelectionView extends EntityView.SelectionView {
        public final int $r8$classId = 0;
        public final Paint clearPaint;
        public final Path path;

        public TextViewSelectionView(LinkView linkView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    int saveCount = canvas.getSaveCount();
                    float showAlpha = getShowAlpha();
                    if (showAlpha > 0.0f) {
                        if (showAlpha < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                        }
                        float fDp = AndroidUtilities.dp(2.0f);
                        float fDpf2 = AndroidUtilities.dpf2(5.66f);
                        float fDp2 = fDp + fDpf2 + AndroidUtilities.dp(15.0f);
                        float f = fDp2 * 2.0f;
                        float measuredWidth = getMeasuredWidth() - f;
                        float measuredHeight = getMeasuredHeight() - f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f2 = fDp2 + measuredWidth;
                        float f3 = fDp2 + measuredHeight;
                        rectF.set(fDp2, fDp2, f2, f3);
                        float fDp3 = AndroidUtilities.dp(12.0f);
                        float fMin = Math.min(fDp3, measuredWidth / 2.0f);
                        float f4 = measuredHeight / 2.0f;
                        float fMin2 = Math.min(fDp3, f4);
                        Path path = this.path;
                        path.rewind();
                        float f5 = fMin * 2.0f;
                        float f6 = fDp2 + f5;
                        float f7 = 2.0f * fMin2;
                        float f8 = fDp2 + f7;
                        rectF.set(fDp2, fDp2, f6, f8);
                        path.arcTo(rectF, 180.0f, 90.0f);
                        float f9 = f2 - f5;
                        rectF.set(f9, fDp2, f2, f8);
                        path.arcTo(rectF, 270.0f, 90.0f);
                        Paint paint = this.paint;
                        canvas.drawPath(path, paint);
                        path.rewind();
                        float f10 = f3 - f7;
                        rectF.set(fDp2, f10, f6, f3);
                        path.arcTo(rectF, 180.0f, -90.0f);
                        rectF.set(f9, f10, f2, f3);
                        path.arcTo(rectF, 90.0f, -90.0f);
                        canvas.drawPath(path, paint);
                        float f11 = fDp2 + f4;
                        Paint paint2 = this.dotStrokePaint;
                        canvas.drawCircle(fDp2, f11, fDpf2, paint2);
                        float fDp4 = (fDpf2 - AndroidUtilities.dp(1.0f)) + 1.0f;
                        Paint paint3 = this.dotPaint;
                        canvas.drawCircle(fDp2, f11, fDp4, paint3);
                        canvas.drawCircle(f2, f11, fDpf2, paint2);
                        canvas.drawCircle(f2, f11, (fDpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        float f12 = fDp2 + fMin2;
                        float f13 = f3 - fMin2;
                        canvas.drawLine(fDp2, f12, fDp2, f13, paint);
                        canvas.drawLine(f2, f12, f2, f13, paint);
                        float fDp5 = (AndroidUtilities.dp(1.0f) + fDpf2) - 1.0f;
                        Paint paint4 = this.clearPaint;
                        canvas.drawCircle(f2, f11, fDp5, paint4);
                        canvas.drawCircle(fDp2, f11, (fDpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, paint4);
                        canvas.restoreToCount(saveCount);
                        break;
                    }
                    break;
                case 1:
                    super.onDraw(canvas);
                    int saveCount2 = canvas.getSaveCount();
                    float showAlpha2 = getShowAlpha();
                    if (showAlpha2 > 0.0f) {
                        if (showAlpha2 < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                        }
                        float fDp6 = AndroidUtilities.dp(2.0f);
                        float fDpf3 = AndroidUtilities.dpf2(5.66f);
                        float fDp7 = fDp6 + fDpf3 + AndroidUtilities.dp(15.0f);
                        float f14 = fDp7 * 2.0f;
                        float measuredWidth2 = getMeasuredWidth() - f14;
                        float measuredHeight2 = getMeasuredHeight() - f14;
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f15 = fDp7 + measuredWidth2;
                        float f16 = fDp7 + measuredHeight2;
                        rectF2.set(fDp7, fDp7, f15, f16);
                        float fDp8 = AndroidUtilities.dp(12.0f);
                        float fMin3 = Math.min(fDp8, measuredWidth2 / 2.0f);
                        float f17 = measuredHeight2 / 2.0f;
                        float fMin4 = Math.min(fDp8, f17);
                        Path path2 = this.path;
                        path2.rewind();
                        float f18 = fMin3 * 2.0f;
                        float f19 = fDp7 + f18;
                        float f20 = 2.0f * fMin4;
                        float f21 = fDp7 + f20;
                        rectF2.set(fDp7, fDp7, f19, f21);
                        path2.arcTo(rectF2, 180.0f, 90.0f);
                        float f22 = f15 - f18;
                        rectF2.set(f22, fDp7, f15, f21);
                        path2.arcTo(rectF2, 270.0f, 90.0f);
                        Paint paint5 = this.paint;
                        canvas.drawPath(path2, paint5);
                        path2.rewind();
                        float f23 = f16 - f20;
                        rectF2.set(fDp7, f23, f19, f16);
                        path2.arcTo(rectF2, 180.0f, -90.0f);
                        rectF2.set(f22, f23, f15, f16);
                        path2.arcTo(rectF2, 90.0f, -90.0f);
                        canvas.drawPath(path2, paint5);
                        float f24 = fDp7 + f17;
                        Paint paint6 = this.dotStrokePaint;
                        canvas.drawCircle(fDp7, f24, fDpf3, paint6);
                        float fDp9 = (fDpf3 - AndroidUtilities.dp(1.0f)) + 1.0f;
                        Paint paint7 = this.dotPaint;
                        canvas.drawCircle(fDp7, f24, fDp9, paint7);
                        canvas.drawCircle(f15, f24, fDpf3, paint6);
                        canvas.drawCircle(f15, f24, (fDpf3 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        float f25 = fDp7 + fMin4;
                        float f26 = f16 - fMin4;
                        canvas.drawLine(fDp7, f25, fDp7, f26, paint5);
                        canvas.drawLine(f15, f25, f15, f26, paint5);
                        float fDp10 = (AndroidUtilities.dp(1.0f) + fDpf3) - 1.0f;
                        Paint paint8 = this.clearPaint;
                        canvas.drawCircle(f15, f24, fDp10, paint8);
                        canvas.drawCircle(fDp7, f24, (fDpf3 + AndroidUtilities.dp(1.0f)) - 1.0f, paint8);
                        canvas.restoreToCount(saveCount2);
                        break;
                    }
                    break;
                case 2:
                    super.onDraw(canvas);
                    int saveCount3 = canvas.getSaveCount();
                    float showAlpha3 = getShowAlpha();
                    if (showAlpha3 > 0.0f) {
                        if (showAlpha3 < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                        }
                        float fDp11 = AndroidUtilities.dp(2.0f);
                        float fDpf4 = AndroidUtilities.dpf2(5.66f);
                        float fDp12 = fDp11 + fDpf4 + AndroidUtilities.dp(15.0f);
                        float f27 = fDp12 * 2.0f;
                        float measuredWidth3 = getMeasuredWidth() - f27;
                        float measuredHeight3 = getMeasuredHeight() - f27;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float f28 = fDp12 + measuredWidth3;
                        float f29 = fDp12 + measuredHeight3;
                        rectF3.set(fDp12, fDp12, f28, f29);
                        float fDp13 = AndroidUtilities.dp(12.0f);
                        float fMin5 = Math.min(fDp13, measuredWidth3 / 2.0f);
                        float f30 = measuredHeight3 / 2.0f;
                        float fMin6 = Math.min(fDp13, f30);
                        Path path3 = this.path;
                        path3.rewind();
                        float f31 = fMin5 * 2.0f;
                        float f32 = fDp12 + f31;
                        float f33 = 2.0f * fMin6;
                        float f34 = fDp12 + f33;
                        rectF3.set(fDp12, fDp12, f32, f34);
                        path3.arcTo(rectF3, 180.0f, 90.0f);
                        float f35 = f28 - f31;
                        rectF3.set(f35, fDp12, f28, f34);
                        path3.arcTo(rectF3, 270.0f, 90.0f);
                        Paint paint9 = this.paint;
                        canvas.drawPath(path3, paint9);
                        path3.rewind();
                        float f36 = f29 - f33;
                        rectF3.set(fDp12, f36, f32, f29);
                        path3.arcTo(rectF3, 180.0f, -90.0f);
                        rectF3.set(f35, f36, f28, f29);
                        path3.arcTo(rectF3, 90.0f, -90.0f);
                        canvas.drawPath(path3, paint9);
                        float f37 = fDp12 + f30;
                        Paint paint10 = this.dotStrokePaint;
                        canvas.drawCircle(fDp12, f37, fDpf4, paint10);
                        float fDp14 = (fDpf4 - AndroidUtilities.dp(1.0f)) + 1.0f;
                        Paint paint11 = this.dotPaint;
                        canvas.drawCircle(fDp12, f37, fDp14, paint11);
                        canvas.drawCircle(f28, f37, fDpf4, paint10);
                        canvas.drawCircle(f28, f37, (fDpf4 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        float f38 = fDp12 + fMin6;
                        float f39 = f29 - fMin6;
                        canvas.drawLine(fDp12, f38, fDp12, f39, paint9);
                        canvas.drawLine(f28, f38, f28, f39, paint9);
                        float fDp15 = (AndroidUtilities.dp(1.0f) + fDpf4) - 1.0f;
                        Paint paint12 = this.clearPaint;
                        canvas.drawCircle(f28, f37, fDp15, paint12);
                        canvas.drawCircle(fDp12, f37, (fDpf4 + AndroidUtilities.dp(1.0f)) - 1.0f, paint12);
                        canvas.restoreToCount(saveCount3);
                        break;
                    }
                    break;
                case 3:
                    super.onDraw(canvas);
                    int saveCount4 = canvas.getSaveCount();
                    float showAlpha4 = getShowAlpha();
                    if (showAlpha4 > 0.0f) {
                        if (showAlpha4 < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha4 * 255.0f), 31);
                        }
                        float fDp16 = AndroidUtilities.dp(2.0f);
                        float fDpf5 = AndroidUtilities.dpf2(5.66f);
                        float fDp17 = fDp16 + fDpf5 + AndroidUtilities.dp(15.0f);
                        float f40 = fDp17 * 2.0f;
                        float measuredWidth4 = getMeasuredWidth() - f40;
                        float measuredHeight4 = getMeasuredHeight() - f40;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        float f41 = fDp17 + measuredWidth4;
                        float f42 = fDp17 + measuredHeight4;
                        rectF4.set(fDp17, fDp17, f41, f42);
                        float fDp18 = AndroidUtilities.dp(12.0f);
                        float fMin7 = Math.min(fDp18, measuredWidth4 / 2.0f);
                        float f43 = measuredHeight4 / 2.0f;
                        float fMin8 = Math.min(fDp18, f43);
                        Path path4 = this.path;
                        path4.rewind();
                        float f44 = fMin7 * 2.0f;
                        float f45 = fDp17 + f44;
                        float f46 = 2.0f * fMin8;
                        float f47 = fDp17 + f46;
                        rectF4.set(fDp17, fDp17, f45, f47);
                        path4.arcTo(rectF4, 180.0f, 90.0f);
                        float f48 = f41 - f44;
                        rectF4.set(f48, fDp17, f41, f47);
                        path4.arcTo(rectF4, 270.0f, 90.0f);
                        Paint paint13 = this.paint;
                        canvas.drawPath(path4, paint13);
                        path4.rewind();
                        float f49 = f42 - f46;
                        rectF4.set(fDp17, f49, f45, f42);
                        path4.arcTo(rectF4, 180.0f, -90.0f);
                        rectF4.set(f48, f49, f41, f42);
                        path4.arcTo(rectF4, 90.0f, -90.0f);
                        canvas.drawPath(path4, paint13);
                        float f50 = fDp17 + f43;
                        Paint paint14 = this.dotStrokePaint;
                        canvas.drawCircle(fDp17, f50, fDpf5, paint14);
                        float fDp19 = (fDpf5 - AndroidUtilities.dp(1.0f)) + 1.0f;
                        Paint paint15 = this.dotPaint;
                        canvas.drawCircle(fDp17, f50, fDp19, paint15);
                        canvas.drawCircle(f41, f50, fDpf5, paint14);
                        canvas.drawCircle(f41, f50, (fDpf5 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        float f51 = fDp17 + fMin8;
                        float f52 = f42 - fMin8;
                        canvas.drawLine(fDp17, f51, fDp17, f52, paint13);
                        canvas.drawLine(f41, f51, f41, f52, paint13);
                        float fDp20 = (AndroidUtilities.dp(1.0f) + fDpf5) - 1.0f;
                        Paint paint16 = this.clearPaint;
                        canvas.drawCircle(f41, f50, fDp20, paint16);
                        canvas.drawCircle(fDp17, f50, (fDpf5 + AndroidUtilities.dp(1.0f)) - 1.0f, paint16);
                        canvas.restoreToCount(saveCount4);
                        break;
                    }
                    break;
                case 4:
                    super.onDraw(canvas);
                    int saveCount5 = canvas.getSaveCount();
                    float showAlpha5 = getShowAlpha();
                    if (showAlpha5 > 0.0f) {
                        if (showAlpha5 < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha5 * 255.0f), 31);
                        }
                        float fDp21 = AndroidUtilities.dp(2.0f);
                        float fDpf6 = AndroidUtilities.dpf2(5.66f);
                        float fDp22 = fDp21 + fDpf6 + AndroidUtilities.dp(15.0f);
                        float f53 = fDp22 * 2.0f;
                        float measuredWidth5 = getMeasuredWidth() - f53;
                        float measuredHeight5 = getMeasuredHeight() - f53;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        float f54 = fDp22 + measuredWidth5;
                        float f55 = fDp22 + measuredHeight5;
                        rectF5.set(fDp22, fDp22, f54, f55);
                        float fDp23 = AndroidUtilities.dp(12.0f);
                        float fMin9 = Math.min(fDp23, measuredWidth5 / 2.0f);
                        float f56 = measuredHeight5 / 2.0f;
                        float fMin10 = Math.min(fDp23, f56);
                        Path path5 = this.path;
                        path5.rewind();
                        float f57 = fMin9 * 2.0f;
                        float f58 = fDp22 + f57;
                        float f59 = 2.0f * fMin10;
                        float f60 = fDp22 + f59;
                        rectF5.set(fDp22, fDp22, f58, f60);
                        path5.arcTo(rectF5, 180.0f, 90.0f);
                        float f61 = f54 - f57;
                        rectF5.set(f61, fDp22, f54, f60);
                        path5.arcTo(rectF5, 270.0f, 90.0f);
                        Paint paint17 = this.paint;
                        canvas.drawPath(path5, paint17);
                        path5.rewind();
                        float f62 = f55 - f59;
                        rectF5.set(fDp22, f62, f58, f55);
                        path5.arcTo(rectF5, 180.0f, -90.0f);
                        rectF5.set(f61, f62, f54, f55);
                        path5.arcTo(rectF5, 90.0f, -90.0f);
                        canvas.drawPath(path5, paint17);
                        float f63 = fDp22 + f56;
                        Paint paint18 = this.dotStrokePaint;
                        canvas.drawCircle(fDp22, f63, fDpf6, paint18);
                        float fDp24 = (fDpf6 - AndroidUtilities.dp(1.0f)) + 1.0f;
                        Paint paint19 = this.dotPaint;
                        canvas.drawCircle(fDp22, f63, fDp24, paint19);
                        canvas.drawCircle(f54, f63, fDpf6, paint18);
                        canvas.drawCircle(f54, f63, (fDpf6 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        float f64 = fDp22 + fMin10;
                        float f65 = f55 - fMin10;
                        canvas.drawLine(fDp22, f64, fDp22, f65, paint17);
                        canvas.drawLine(f54, f64, f54, f65, paint17);
                        float fDp25 = (AndroidUtilities.dp(1.0f) + fDpf6) - 1.0f;
                        Paint paint20 = this.clearPaint;
                        canvas.drawCircle(f54, f63, fDp25, paint20);
                        canvas.drawCircle(fDp22, f63, (fDpf6 + AndroidUtilities.dp(1.0f)) - 1.0f, paint20);
                        canvas.restoreToCount(saveCount5);
                        break;
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    int saveCount6 = canvas.getSaveCount();
                    float showAlpha6 = getShowAlpha();
                    if (showAlpha6 > 0.0f) {
                        if (showAlpha6 < 1.0f) {
                            int i = (int) (showAlpha6 * 255.0f);
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i, 31);
                        } else {
                            canvas2 = canvas;
                        }
                        float fDp26 = AndroidUtilities.dp(2.0f);
                        float fDpf7 = AndroidUtilities.dpf2(5.66f);
                        float fDp27 = fDp26 + fDpf7 + AndroidUtilities.dp(15.0f);
                        float f66 = fDp27 * 2.0f;
                        float measuredWidth6 = getMeasuredWidth() - f66;
                        float measuredHeight6 = getMeasuredHeight() - f66;
                        RectF rectF6 = AndroidUtilities.rectTmp;
                        float f67 = fDp27 + measuredWidth6;
                        float f68 = fDp27 + measuredHeight6;
                        rectF6.set(fDp27, fDp27, f67, f68);
                        float fDp28 = AndroidUtilities.dp(12.0f);
                        float fMin11 = Math.min(fDp28, measuredWidth6 / 2.0f);
                        float f69 = measuredHeight6 / 2.0f;
                        float fMin12 = Math.min(fDp28, f69);
                        Path path6 = this.path;
                        path6.rewind();
                        float f70 = fMin11 * 2.0f;
                        float f71 = fDp27 + f70;
                        float f72 = 2.0f * fMin12;
                        float f73 = fDp27 + f72;
                        rectF6.set(fDp27, fDp27, f71, f73);
                        path6.arcTo(rectF6, 180.0f, 90.0f);
                        float f74 = f67 - f70;
                        rectF6.set(f74, fDp27, f67, f73);
                        path6.arcTo(rectF6, 270.0f, 90.0f);
                        Paint paint21 = this.paint;
                        canvas2.drawPath(path6, paint21);
                        path6.rewind();
                        float f75 = f68 - f72;
                        rectF6.set(fDp27, f75, f71, f68);
                        path6.arcTo(rectF6, 180.0f, -90.0f);
                        rectF6.set(f74, f75, f67, f68);
                        path6.arcTo(rectF6, 90.0f, -90.0f);
                        canvas2.drawPath(path6, paint21);
                        float f76 = fDp27 + f69;
                        Paint paint22 = this.dotStrokePaint;
                        canvas2.drawCircle(fDp27, f76, fDpf7, paint22);
                        float fDp29 = (fDpf7 - AndroidUtilities.dp(1.0f)) + 1.0f;
                        Paint paint23 = this.dotPaint;
                        canvas2.drawCircle(fDp27, f76, fDp29, paint23);
                        canvas2.drawCircle(f67, f76, fDpf7, paint22);
                        canvas2.drawCircle(f67, f76, (fDpf7 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        float f77 = fDp27 + fMin12;
                        float f78 = f68 - fMin12;
                        canvas.drawLine(fDp27, f77, fDp27, f78, paint21);
                        canvas.drawLine(f67, f77, f67, f78, paint21);
                        float fDp30 = (AndroidUtilities.dp(1.0f) + fDpf7) - 1.0f;
                        Paint paint24 = this.clearPaint;
                        canvas.drawCircle(f67, f76, fDp30, paint24);
                        canvas.drawCircle(fDp27, f76, (fDpf7 + AndroidUtilities.dp(1.0f)) - 1.0f, paint24);
                        canvas.restoreToCount(saveCount6);
                        break;
                    }
                    break;
            }
        }

        @Override
        public final int pointInsideHandle(float f, float f2) {
            switch (this.$r8$classId) {
                case 0:
                    float fDp = AndroidUtilities.dp(1.0f);
                    float fDp2 = AndroidUtilities.dp(19.5f);
                    float f3 = fDp + fDp2;
                    float f4 = f3 * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f4;
                    float fM = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f4, 2.0f, f3);
                    if (f > f3 - fDp2 && f2 > fM - fDp2 && f < f3 + fDp2 && f2 < fM + fDp2) {
                        return 1;
                    }
                    float f5 = f3 + measuredWidth;
                    return (f <= f5 - fDp2 || f2 <= fM - fDp2 || f >= f5 + fDp2 || f2 >= fM + fDp2) ? 0 : 2;
                case 1:
                    float fDp3 = AndroidUtilities.dp(1.0f);
                    float fDp4 = AndroidUtilities.dp(19.5f);
                    float f6 = fDp3 + fDp4;
                    float f7 = f6 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f7;
                    float fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f7, 2.0f, f6);
                    if (f > f6 - fDp4 && f2 > fM2 - fDp4 && f < f6 + fDp4 && f2 < fM2 + fDp4) {
                        return 1;
                    }
                    float f8 = f6 + measuredWidth2;
                    return (f <= f8 - fDp4 || f2 <= fM2 - fDp4 || f >= f8 + fDp4 || f2 >= fM2 + fDp4) ? 0 : 2;
                case 2:
                    float fDp5 = AndroidUtilities.dp(1.0f);
                    float fDp6 = AndroidUtilities.dp(19.5f);
                    float f9 = fDp5 + fDp6;
                    float f10 = f9 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f10;
                    float measuredHeight = getMeasuredHeight() - f10;
                    float f11 = (measuredHeight / 2.0f) + f9;
                    if (f > f9 - fDp6 && f2 > f11 - fDp6 && f < f9 + fDp6 && f2 < f11 + fDp6) {
                        return 1;
                    }
                    float f12 = f9 + measuredWidth3;
                    if (f <= f12 - fDp6 || f2 <= f11 - fDp6 || f >= f12 + fDp6 || f2 >= f11 + fDp6) {
                        return (f <= f9 || f >= measuredWidth3 || f2 <= f9 || f2 >= measuredHeight) ? 0 : 3;
                    }
                    return 2;
                case 3:
                    float fDp7 = AndroidUtilities.dp(1.0f);
                    float fDp8 = AndroidUtilities.dp(19.5f);
                    float f13 = fDp7 + fDp8;
                    float f14 = f13 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f14;
                    float measuredHeight2 = getMeasuredHeight() - f14;
                    float f15 = (measuredHeight2 / 2.0f) + f13;
                    if (f > f13 - fDp8 && f2 > f15 - fDp8 && f < f13 + fDp8 && f2 < f15 + fDp8) {
                        return 1;
                    }
                    float f16 = f13 + measuredWidth4;
                    if (f <= f16 - fDp8 || f2 <= f15 - fDp8 || f >= f16 + fDp8 || f2 >= f15 + fDp8) {
                        return (f <= f13 || f >= measuredWidth4 || f2 <= f13 || f2 >= measuredHeight2) ? 0 : 3;
                    }
                    return 2;
                case 4:
                    float fDp9 = AndroidUtilities.dp(1.0f);
                    float fDp10 = AndroidUtilities.dp(19.5f);
                    float f17 = fDp9 + fDp10;
                    float f18 = f17 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f18;
                    float fM3 = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f18, 2.0f, f17);
                    if (f > f17 - fDp10 && f2 > fM3 - fDp10 && f < f17 + fDp10 && f2 < fM3 + fDp10) {
                        return 1;
                    }
                    float f19 = f17 + measuredWidth5;
                    return (f <= f19 - fDp10 || f2 <= fM3 - fDp10 || f >= f19 + fDp10 || f2 >= fM3 + fDp10) ? 0 : 2;
                default:
                    float fDp11 = AndroidUtilities.dp(1.0f);
                    float fDp12 = AndroidUtilities.dp(19.5f);
                    float f20 = fDp11 + fDp12;
                    float f21 = f20 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f21;
                    float fM4 = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f21, 2.0f, f20);
                    if (f > f20 - fDp12 && f2 > fM4 - fDp12 && f < f20 + fDp12 && f2 < fM4 + fDp12) {
                        return 1;
                    }
                    float f22 = f20 + measuredWidth6;
                    return (f <= f22 - fDp12 || f2 <= fM4 - fDp12 || f >= f22 + fDp12 || f2 >= fM4 + fDp12) ? 0 : 2;
            }
        }

        public TextViewSelectionView(LocationView locationView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public TextViewSelectionView(MessageEntityView messageEntityView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public TextViewSelectionView(PhotoView photoView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public TextViewSelectionView(TextPaintView textPaintView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public TextViewSelectionView(WeatherView weatherView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }
}

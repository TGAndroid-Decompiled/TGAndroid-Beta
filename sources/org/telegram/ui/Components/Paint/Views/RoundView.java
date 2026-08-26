package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.Size;

public final class RoundView extends EntityView {
    public float a;
    public final int anchor;
    public final Size baseSize;
    public final Path clipPath;
    public boolean draw;
    public final Rect dst;
    public final AnimatedFloat mirrorT;
    public boolean mirrored;
    public boolean shown;
    public final AnimatedFloat shownT;
    public final Rect src;
    public final TextureView textureView;
    public final Bitmap thumbBitmap;

    public RoundView(Context context, PointF pointF, Size size, String str) {
        super(context, pointF);
        this.anchor = -1;
        this.mirrored = false;
        Rect rect = new Rect();
        this.src = rect;
        this.dst = new Rect();
        this.a = 1.0f;
        this.clipPath = new Path();
        this.draw = true;
        this.shown = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.shownT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.baseSize = size;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        this.thumbBitmap = bitmapDecodeFile;
        if (bitmapDecodeFile != null) {
            this.a = bitmapDecodeFile.getWidth() / bitmapDecodeFile.getHeight();
            rect.set(0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        addView(textureView, LayoutHelper.createFrame(-1.0f, -1));
        this.mirrorT = new AnimatedFloat(this, 0L, 500L, cubicBezierInterpolator);
        updatePosition();
        setWillNotDraw(false);
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new RoundViewSelectionView(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect;
        Rect rect2;
        Bitmap bitmap;
        if (!this.draw) {
            return false;
        }
        if (view != this.textureView) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float f = this.mirrorT.set(this.mirrored);
        canvas.scale(1.0f - (f * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, f, 4.0f * f, 0.25f));
        float f2 = this.shownT.set(this.shown);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float fMin = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Path path = this.clipPath;
        Rect rect3 = this.src;
        Rect rect4 = this.dst;
        Bitmap bitmap2 = this.thumbBitmap;
        if (f2 < 1.0f) {
            rect = rect3;
            rect2 = rect4;
            bitmap = bitmap2;
            canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
            path.rewind();
            path.addCircle(width, height, fMin, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect2.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
            }
            super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            rect = rect3;
            rect2 = rect4;
            bitmap = bitmap2;
        }
        canvas.save();
        path.rewind();
        path.addCircle(width, height, fMin * f2, Path.Direction.CW);
        canvas.clipPath(path);
        if (bitmap != null) {
            rect2.set(0, 0, view.getWidth(), view.getHeight());
            canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
        }
        boolean zDrawChild = ((getParent() instanceof EntitiesContainerView) && ((EntitiesContainerView) getParent()).drawForThumb) ? true : super.drawChild(canvas, view, j);
        canvas.restore();
        canvas.restore();
        return zDrawChild;
    }

    public int getAnchor() {
        return this.anchor;
    }

    public Size getBaseSize() {
        return this.baseSize;
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

    public final boolean isMirrored() {
        return this.mirrored;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.textureView;
        if (textureView != null) {
            int measuredHeight = ((i4 - i2) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i3 - i) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Size size = this.baseSize;
        int i3 = (int) size.width;
        int i4 = (int) size.height;
        TextureView textureView = this.textureView;
        if (textureView != null) {
            float f = this.a;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f >= 1.0f ? (int) (f * i4) : i3, 1073741824);
            float f2 = this.a;
            textureView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f2 >= 1.0f ? i4 : (int) (i3 / f2), 1073741824));
        }
        setMeasuredDimension(i3, i4);
    }

    public void setDraw(boolean z) {
        if (this.draw != z) {
            this.draw = z;
            invalidate();
        }
    }

    @Override
    public final void updatePosition() {
        Size size = this.baseSize;
        float f = size.width / 2.0f;
        float f2 = size.height / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public final class RoundViewSelectionView extends EntityView.SelectionView {
        public final int $r8$classId = 1;
        public final RectF arcRect;

        public RoundViewSelectionView(ReactionWidgetEntityView reactionWidgetEntityView, Context context) {
            super(context);
            this.arcRect = new RectF();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    int saveCount = canvas.getSaveCount();
                    float showAlpha = getShowAlpha();
                    if (showAlpha > 0.0f) {
                        if (showAlpha < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                        }
                        float fDp = AndroidUtilities.dp(1.0f);
                        float fDpf2 = AndroidUtilities.dpf2(5.66f);
                        float fDp2 = fDp + fDpf2 + AndroidUtilities.dp(15.0f);
                        float measuredWidth = (getMeasuredWidth() / 2.0f) - fDp2;
                        RectF rectF = this.arcRect;
                        float f = (2.0f * measuredWidth) + fDp2;
                        rectF.set(fDp2, fDp2, f, f);
                        Paint paint = this.paint;
                        canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                        canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                        float f2 = measuredWidth + fDp2;
                        Paint paint2 = this.dotStrokePaint;
                        canvas.drawCircle(fDp2, f2, fDpf2, paint2);
                        float fDp3 = fDpf2 - AndroidUtilities.dp(1.0f);
                        Paint paint3 = this.dotPaint;
                        canvas.drawCircle(fDp2, f2, fDp3, paint3);
                        canvas.drawCircle(f, f2, fDpf2, paint2);
                        canvas.drawCircle(f, f2, fDpf2 - AndroidUtilities.dp(1.0f), paint3);
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
                        float fDp4 = AndroidUtilities.dp(1.0f);
                        float fDpf3 = AndroidUtilities.dpf2(5.66f);
                        float fDp5 = fDp4 + fDpf3 + AndroidUtilities.dp(15.0f);
                        float measuredWidth2 = (getMeasuredWidth() / 2) - fDp5;
                        RectF rectF2 = this.arcRect;
                        float f3 = (2.0f * measuredWidth2) + fDp5;
                        rectF2.set(fDp5, fDp5, f3, f3);
                        Paint paint4 = this.paint;
                        canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                        canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                        float f4 = measuredWidth2 + fDp5;
                        Paint paint5 = this.dotStrokePaint;
                        canvas.drawCircle(fDp5, f4, fDpf3, paint5);
                        float fDp6 = fDpf3 - AndroidUtilities.dp(1.0f);
                        Paint paint6 = this.dotPaint;
                        canvas.drawCircle(fDp5, f4, fDp6, paint6);
                        canvas.drawCircle(f3, f4, fDpf3, paint5);
                        canvas.drawCircle(f3, f4, fDpf3 - AndroidUtilities.dp(1.0f), paint6);
                        canvas.restoreToCount(saveCount2);
                        break;
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    int saveCount3 = canvas.getSaveCount();
                    float showAlpha3 = getShowAlpha();
                    if (showAlpha3 > 0.0f) {
                        if (showAlpha3 < 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                        }
                        float fDp7 = AndroidUtilities.dp(1.0f);
                        float fDpf4 = AndroidUtilities.dpf2(5.66f);
                        float fDp8 = fDp7 + fDpf4 + AndroidUtilities.dp(15.0f);
                        float measuredWidth3 = (getMeasuredWidth() / 2) - fDp8;
                        RectF rectF3 = this.arcRect;
                        float f5 = (2.0f * measuredWidth3) + fDp8;
                        rectF3.set(fDp8, fDp8, f5, f5);
                        Paint paint7 = this.paint;
                        canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                        canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                        float f6 = measuredWidth3 + fDp8;
                        Paint paint8 = this.dotStrokePaint;
                        canvas.drawCircle(fDp8, f6, fDpf4, paint8);
                        float fDp9 = fDpf4 - AndroidUtilities.dp(1.0f);
                        Paint paint9 = this.dotPaint;
                        canvas.drawCircle(fDp8, f6, fDp9, paint9);
                        canvas.drawCircle(f5, f6, fDpf4, paint8);
                        canvas.drawCircle(f5, f6, fDpf4 - AndroidUtilities.dp(1.0f), paint9);
                        canvas.restoreToCount(saveCount3);
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
                    float fM = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f4, 2.0f, f3);
                    if (f > f3 - fDp2 && f2 > fM - fDp2 && f < f3 + fDp2 && f2 < fM + fDp2) {
                        return 1;
                    }
                    if (f > ((getMeasuredWidth() - f4) + f3) - fDp2 && f2 > fM - fDp2 && f < (getMeasuredWidth() - f4) + f3 + fDp2 && f2 < fM + fDp2) {
                        return 2;
                    }
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    return Math.pow((double) (f2 - measuredWidth), 2.0d) + Math.pow((double) (f - measuredWidth), 2.0d) < Math.pow((double) measuredWidth, 2.0d) ? 3 : 0;
                case 1:
                    float fDp3 = AndroidUtilities.dp(1.0f);
                    float fDp4 = AndroidUtilities.dp(19.5f);
                    float f5 = fDp3 + fDp4;
                    float f6 = f5 * 2.0f;
                    float fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f6, 2.0f, f5);
                    if (f > f5 - fDp4 && f2 > fM2 - fDp4 && f < f5 + fDp4 && f2 < fM2 + fDp4) {
                        return 1;
                    }
                    if (f > ((getMeasuredWidth() - f6) + f5) - fDp4 && f2 > fM2 - fDp4 && f < (getMeasuredWidth() - f6) + f5 + fDp4 && f2 < fM2 + fDp4) {
                        return 2;
                    }
                    float measuredWidth2 = getMeasuredWidth() / 2.0f;
                    return Math.pow((double) (f2 - measuredWidth2), 2.0d) + Math.pow((double) (f - measuredWidth2), 2.0d) < Math.pow((double) measuredWidth2, 2.0d) ? 3 : 0;
                default:
                    float fDp5 = AndroidUtilities.dp(1.0f);
                    float fDp6 = AndroidUtilities.dp(19.5f);
                    float f7 = fDp5 + fDp6;
                    float f8 = f7 * 2.0f;
                    float fM3 = ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredHeight(), f8, 2.0f, f7);
                    if (f > f7 - fDp6 && f2 > fM3 - fDp6 && f < f7 + fDp6 && f2 < fM3 + fDp6) {
                        return 1;
                    }
                    if (f > ((getMeasuredWidth() - f8) + f7) - fDp6 && f2 > fM3 - fDp6 && f < (getMeasuredWidth() - f8) + f7 + fDp6 && f2 < fM3 + fDp6) {
                        return 2;
                    }
                    float measuredWidth3 = getMeasuredWidth() / 2.0f;
                    return Math.pow((double) (f2 - measuredWidth3), 2.0d) + Math.pow((double) (f - measuredWidth3), 2.0d) < Math.pow((double) measuredWidth3, 2.0d) ? 3 : 0;
            }
        }

        public RoundViewSelectionView(RoundView roundView, Context context) {
            super(context);
            this.arcRect = new RectF();
        }

        public RoundViewSelectionView(StickerView stickerView, Context context) {
            super(context);
            this.arcRect = new RectF();
        }
    }
}

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
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.Size;

public class RoundView extends EntityView {
    private float a;
    private int anchor;
    private Size baseSize;
    private final Paint clipPaint;
    private final Path clipPath;
    private boolean draw;
    public final Rect dst;
    private final AnimatedFloat mirrorT;
    private boolean mirrored;
    private boolean shown;
    private AnimatedFloat shownT;
    public final Rect src;
    public TextureView textureView;
    private FrameLayout.LayoutParams textureViewParams;
    public Bitmap thumbBitmap;

    @Override
    public boolean trashCenter() {
        return true;
    }

    public RoundView(Context context, PointF pointF, float f, float f2, Size size, String str) {
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
        Paint paint = new Paint(1);
        this.clipPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(f);
        setScale(f2);
        this.baseSize = size;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        this.thumbBitmap = bitmapDecodeFile;
        if (bitmapDecodeFile != null) {
            this.a = bitmapDecodeFile.getWidth() / this.thumbBitmap.getHeight();
            rect.set(0, 0, this.thumbBitmap.getWidth(), this.thumbBitmap.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -1.0f);
        this.textureViewParams = layoutParamsCreateFrame;
        addView(textureView, layoutParamsCreateFrame);
        this.mirrorT = new AnimatedFloat(this, 0L, 500L, cubicBezierInterpolator);
        updatePosition();
        setWillNotDraw(false);
    }

    public void resizeTextureView(int i, int i2) {
        float f = i / i2;
        if (Math.abs(this.a - f) >= 1.0E-4f) {
            this.a = f;
            requestLayout();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
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

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.textureView;
        if (textureView != null) {
            int measuredHeight = ((i4 - i2) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i3 - i) - this.textureView.getMeasuredWidth()) / 2;
            TextureView textureView2 = this.textureView;
            textureView2.layout(measuredWidth, measuredHeight, textureView2.getMeasuredWidth() + measuredWidth, this.textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    public void setDraw(boolean z) {
        if (this.draw != z) {
            this.draw = z;
            invalidate();
        }
    }

    public void setShown(boolean z, boolean z2) {
        if (this.shown != z) {
            this.shown = z;
            if (!z2) {
                this.shownT.set(z, true);
            }
            invalidate();
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.draw) {
            return false;
        }
        if (view == this.textureView) {
            canvas.save();
            float f = this.mirrorT.set(this.mirrored);
            canvas.scale(1.0f - (f * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, 4.0f * f * (1.0f - f) * 0.25f);
            float f2 = this.shownT.set(this.shown);
            float x = view.getX() + (view.getWidth() / 2.0f);
            float y = view.getY() + (view.getHeight() / 2.0f);
            float fMin = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            if (f2 < 1.0f) {
                canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
                this.clipPath.rewind();
                this.clipPath.addCircle(x, y, fMin, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                if (this.thumbBitmap != null) {
                    this.dst.set(0, 0, view.getWidth(), view.getHeight());
                    canvas.drawBitmap(this.thumbBitmap, this.src, this.dst, (Paint) null);
                }
                super.drawChild(canvas, view, j);
                canvas.restore();
            }
            canvas.save();
            this.clipPath.rewind();
            this.clipPath.addCircle(x, y, fMin * f2, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            if (this.thumbBitmap != null) {
                this.dst.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(this.thumbBitmap, this.src, this.dst, (Paint) null);
            }
            boolean zDrawChild = ((getParent() instanceof EntitiesContainerView) && ((EntitiesContainerView) getParent()).drawForThumb) ? true : super.drawChild(canvas, view, j);
            canvas.restore();
            canvas.restore();
            return zDrawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public int getAnchor() {
        return this.anchor;
    }

    public void mirror(boolean z) {
        boolean z2 = !this.mirrored;
        this.mirrored = z2;
        if (!z) {
            this.mirrorT.set(z2, true);
        }
        invalidate();
    }

    public boolean isMirrored() {
        return this.mirrored;
    }

    @Override
    public void updatePosition() {
        Size size = this.baseSize;
        float f = size.width / 2.0f;
        float f2 = size.height / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        updateSelectionView();
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float measuredWidth = (getMeasuredWidth() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float measuredHeight = (getMeasuredHeight() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float positionX = (getPositionX() - (measuredWidth / 2.0f)) * scaleX;
        return new RectOld(positionX, (getPositionY() - (measuredHeight / 2.0f)) * scaleX, ((measuredWidth * scaleX) + positionX) - positionX, measuredHeight * scaleX);
    }

    @Override
    protected EntityView.SelectionView createSelectionView() {
        return new RoundViewSelectionView(getContext());
    }

    public Size getBaseSize() {
        return this.baseSize;
    }

    public class RoundViewSelectionView extends EntityView.SelectionView {
        private final RectF arcRect;

        public RoundViewSelectionView(Context context) {
            super(context);
            this.arcRect = new RectF();
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float fDp = AndroidUtilities.dp(1.0f);
            float fDp2 = AndroidUtilities.dp(19.5f);
            float f3 = fDp + fDp2;
            float f4 = f3 * 2.0f;
            float measuredHeight = ((getMeasuredHeight() - f4) / 2.0f) + f3;
            if (f > f3 - fDp2 && f2 > measuredHeight - fDp2 && f < f3 + fDp2 && f2 < measuredHeight + fDp2) {
                return 1;
            }
            if (f > ((getMeasuredWidth() - f4) + f3) - fDp2 && f2 > measuredHeight - fDp2 && f < f3 + (getMeasuredWidth() - f4) + fDp2 && f2 < measuredHeight + fDp2) {
                return 2;
            }
            float measuredWidth = getMeasuredWidth() / 2.0f;
            return Math.pow((double) (f - measuredWidth), 2.0d) + Math.pow((double) (f2 - measuredWidth), 2.0d) < Math.pow((double) measuredWidth, 2.0d) ? 3 : 0;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int saveCount = canvas.getSaveCount();
            float showAlpha = getShowAlpha();
            if (showAlpha <= 0.0f) {
                return;
            }
            if (showAlpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
            }
            float fDp = AndroidUtilities.dp(1.0f);
            float fDpf2 = AndroidUtilities.dpf2(5.66f);
            float fDp2 = fDp + fDpf2 + AndroidUtilities.dp(15.0f);
            float measuredWidth = (getMeasuredWidth() / 2.0f) - fDp2;
            float f = fDp2 + (2.0f * measuredWidth);
            this.arcRect.set(fDp2, fDp2, f, f);
            canvas.drawArc(this.arcRect, 0.0f, 180.0f, false, this.paint);
            canvas.drawArc(this.arcRect, 180.0f, 180.0f, false, this.paint);
            float f2 = measuredWidth + fDp2;
            canvas.drawCircle(fDp2, f2, fDpf2, this.dotStrokePaint);
            canvas.drawCircle(fDp2, f2, fDpf2 - AndroidUtilities.dp(1.0f), this.dotPaint);
            canvas.drawCircle(f, f2, fDpf2, this.dotStrokePaint);
            canvas.drawCircle(f, f2, fDpf2 - AndroidUtilities.dp(1.0f), this.dotPaint);
            canvas.restoreToCount(saveCount);
        }
    }
}

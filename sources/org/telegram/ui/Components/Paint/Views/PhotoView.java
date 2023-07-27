package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Rect;
import org.telegram.ui.Components.Size;
public class PhotoView extends EntityView {
    private int anchor;
    private Size baseSize;
    public final ImageReceiver centerImage;
    private FrameLayoutDrawer containerView;
    private final AnimatedFloat mirrorT;
    private boolean mirrored;
    private String path;

    public class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            PhotoView.this.stickerDraw(canvas);
        }
    }

    public PhotoView(Context context, Point point, float f, float f2, Size size, String str, int i, int i2) {
        super(context, point);
        this.anchor = -1;
        this.mirrored = false;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.centerImage = imageReceiver;
        setRotation(f);
        setScale(f2);
        this.path = str;
        this.baseSize = size;
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(context);
        this.containerView = frameLayoutDrawer;
        addView(frameLayoutDrawer, LayoutHelper.createFrame(-1, -1.0f));
        this.mirrorT = new AnimatedFloat(this.containerView, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.containerView);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
        imageReceiver.setOrientation(i, i2, true);
        android.graphics.Point point2 = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point2.x, point2.y) * 0.8f) / AndroidUtilities.density);
        ImageLocation forPath = ImageLocation.getForPath(str);
        imageReceiver.setImage(forPath, round + "_" + round, null, null, null, 1);
        updatePosition();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.centerImage.onDetachedFromWindow();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.centerImage.onAttachedToWindow();
    }

    public int getAnchor() {
        return this.anchor;
    }

    public void mirror() {
        mirror(false);
    }

    public void mirror(boolean z) {
        boolean z2 = !this.mirrored;
        this.mirrored = z2;
        if (!z) {
            this.mirrorT.set(z2, true);
        }
        this.containerView.invalidate();
    }

    public boolean isMirrored() {
        return this.mirrored;
    }

    @Override
    public void updatePosition() {
        Size size = this.baseSize;
        setX(getPositionX() - (size.width / 2.0f));
        setY(getPositionY() - (size.height / 2.0f));
        updateSelectionView();
    }

    protected void stickerDraw(Canvas canvas) {
        if (this.containerView == null) {
            return;
        }
        canvas.save();
        float f = this.mirrorT.set(this.mirrored);
        canvas.scale(1.0f - (f * 2.0f), 1.0f, this.baseSize.width / 2.0f, 0.0f);
        canvas.skew(0.0f, 4.0f * f * (1.0f - f) * 0.25f);
        ImageReceiver imageReceiver = this.centerImage;
        Size size = this.baseSize;
        imageReceiver.setImageCoords(0.0f, 0.0f, (int) size.width, (int) size.height);
        this.centerImage.draw(canvas);
        canvas.restore();
    }

    public long getDuration() {
        RLottieDrawable lottieAnimation = this.centerImage.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.getDuration();
        }
        AnimatedFileDrawable animation = this.centerImage.getAnimation();
        if (animation != null) {
            return animation.getDurationMs();
        }
        return 0L;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) this.baseSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.baseSize.height, 1073741824));
    }

    @Override
    protected Rect getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Rect();
        }
        float scaleX = viewGroup.getScaleX();
        float measuredWidth = (getMeasuredWidth() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float measuredHeight = (getMeasuredHeight() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float positionX = (getPositionX() - (measuredWidth / 2.0f)) * scaleX;
        return new Rect(positionX, (getPositionY() - (measuredHeight / 2.0f)) * scaleX, ((measuredWidth * scaleX) + positionX) - positionX, measuredHeight * scaleX);
    }

    @Override
    protected EntityView.SelectionView createSelectionView() {
        return new PhotoViewSelectionView(this, getContext());
    }

    public String getPath() {
        return this.path;
    }

    public Size getBaseSize() {
        return this.baseSize;
    }

    public class PhotoViewSelectionView extends EntityView.SelectionView {
        private final Paint clearPaint;
        private Path path;

        public PhotoViewSelectionView(PhotoView photoView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float dp = AndroidUtilities.dp(19.5f);
            float dp2 = AndroidUtilities.dp(1.0f) + dp;
            float f3 = dp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f3;
            float measuredHeight = getMeasuredHeight() - f3;
            float f4 = (measuredHeight / 2.0f) + dp2;
            if (f <= dp2 - dp || f2 <= f4 - dp || f >= dp2 + dp || f2 >= f4 + dp) {
                float f5 = dp2 + measuredWidth;
                if (f <= f5 - dp || f2 <= f4 - dp || f >= f5 + dp || f2 >= f4 + dp) {
                    return (f <= dp2 || f >= measuredWidth || f2 <= dp2 || f2 >= measuredHeight) ? 0 : 3;
                }
                return 2;
            }
            return 1;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float dpf2 = AndroidUtilities.dpf2(5.66f);
            float dp = AndroidUtilities.dp(2.0f) + dpf2 + AndroidUtilities.dp(15.0f);
            float f = dp * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = dp + measuredWidth;
            float f3 = dp + measuredHeight;
            rectF.set(dp, dp, f2, f3);
            float dp2 = AndroidUtilities.dp(12.0f);
            float min = Math.min(dp2, measuredWidth / 2.0f);
            float f4 = measuredHeight / 2.0f;
            float min2 = Math.min(dp2, f4);
            this.path.rewind();
            float f5 = min * 2.0f;
            float f6 = dp + f5;
            float f7 = 2.0f * min2;
            float f8 = dp + f7;
            rectF.set(dp, dp, f6, f8);
            this.path.arcTo(rectF, 180.0f, 90.0f);
            float f9 = f2 - f5;
            rectF.set(f9, dp, f2, f8);
            this.path.arcTo(rectF, 270.0f, 90.0f);
            canvas.drawPath(this.path, this.paint);
            this.path.rewind();
            float f10 = f3 - f7;
            rectF.set(dp, f10, f6, f3);
            this.path.arcTo(rectF, 180.0f, -90.0f);
            rectF.set(f9, f10, f2, f3);
            this.path.arcTo(rectF, 90.0f, -90.0f);
            canvas.drawPath(this.path, this.paint);
            float f11 = dp + f4;
            canvas.drawCircle(dp, f11, dpf2, this.dotStrokePaint);
            canvas.drawCircle(dp, f11, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas.drawCircle(f2, f11, dpf2, this.dotStrokePaint);
            canvas.drawCircle(f2, f11, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            float f12 = dp + min2;
            float f13 = f3 - min2;
            canvas.drawLine(dp, f12, dp, f13, this.paint);
            canvas.drawLine(f2, f12, f2, f13, this.paint);
            canvas.drawCircle(f2, f11, (AndroidUtilities.dp(1.0f) + dpf2) - 1.0f, this.clearPaint);
            canvas.drawCircle(dp, f11, (dpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, this.clearPaint);
            canvas.restore();
        }
    }
}

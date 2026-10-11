package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.is;
public final class g2 extends FrameLayout {
    public final org.telegram.ui.Components.g6 f35007a;
    public final Paint f35008b;
    public final Path f35009c;
    public float d;
    public final j2 f35010e;

    public g2(j2 j2Var, Context context) {
        super(context);
        this.f35010e = j2Var;
        this.f35007a = new org.telegram.ui.Components.g6(this, 250L, is.h);
        Paint paint = new Paint(1);
        this.f35008b = paint;
        this.f35009c = new Path();
        setWillNotDraw(false);
        paint.setColor(j2Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int themedColor;
        int i10;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f7;
        j2 j2Var = this.f35010e;
        Integer num = j2Var.f35138f;
        if (num != null) {
            themedColor = num.intValue();
        } else {
            themedColor = j2Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5);
        }
        Paint paint = this.f35008b;
        paint.setColor(themedColor);
        View[] viewPages = j2Var.f35135b.getViewPages();
        float f10 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float clamp = Utilities.clamp(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = view instanceof h2;
                if (z10) {
                    i2 i2Var = (i2) ((h2) view);
                    f7 = Math.max(0.0f, i2Var.getHeight() - i2Var.f35110a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * clamp) + f11;
                if (view.getVisibility() == 0 && z10) {
                    h2 h2Var = (h2) view;
                }
            }
        }
        if (this.d <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        }
        float d = this.f35007a.d(f10, false);
        this.d = Math.max(AndroidUtilities.statusBarHeight, this.d) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) j2Var).backgroundPaddingLeft;
        float f12 = this.d;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) j2Var).backgroundPaddingLeft;
        rectF.set(i10, f12, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (j2Var.topBulletinContainer != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) j2Var).containerView;
            float y3 = viewGroup.getY() + this.d;
            i12 = ((org.telegram.ui.ActionBar.e3) j2Var).backgroundPaddingTop;
            j2Var.topBulletinContainer.setTranslationY(Math.max(y3 + i12, j2Var.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - j2Var.topBulletinContainer.getBottom());
        }
        canvas.save();
        Path path = this.f35009c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f35010e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        j2 j2Var = this.f35010e;
        FrameLayout frameLayout = j2Var.f35137e;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = j2Var.f35137e.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        j2Var.f35135b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), 1073741824));
        setMeasuredDimension(size, size2);
    }
}

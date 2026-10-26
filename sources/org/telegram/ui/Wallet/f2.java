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
import org.telegram.ui.Components.ds;
public final class f2 extends FrameLayout {
    public final org.telegram.ui.Components.h6 f36549a;
    public final Paint f36550b;
    public final Path f36551c;
    public float d;
    public final i2 e;

    public f2(i2 i2Var, Context context) {
        super(context);
        this.e = i2Var;
        this.f36549a = new org.telegram.ui.Components.h6(this, 250L, ds.h);
        Paint paint = new Paint(1);
        this.f36550b = paint;
        this.f36551c = new Path();
        setWillNotDraw(false);
        paint.setColor(i2Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int themedColor;
        int i10;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f7;
        i2 i2Var = this.e;
        Integer num = i2Var.f36669f;
        if (num != null) {
            themedColor = num.intValue();
        } else {
            themedColor = i2Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5);
        }
        Paint paint = this.f36550b;
        paint.setColor(themedColor);
        View[] viewPages = i2Var.f36667b.getViewPages();
        float f10 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float clamp = Utilities.clamp(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = view instanceof g2;
                if (z10) {
                    h2 h2Var = (h2) ((g2) view);
                    f7 = Math.max(0.0f, h2Var.getHeight() - h2Var.f36627a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * clamp) + f11;
                if (view.getVisibility() == 0 && z10) {
                    g2 g2Var = (g2) view;
                }
            }
        }
        if (this.d <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        }
        float d = this.f36549a.d(f10, false);
        this.d = Math.max(AndroidUtilities.statusBarHeight, this.d) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.k3) i2Var).backgroundPaddingLeft;
        float f12 = this.d;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.k3) i2Var).backgroundPaddingLeft;
        rectF.set(i10, f12, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (i2Var.topBulletinContainer != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) i2Var).containerView;
            float y3 = viewGroup.getY() + this.d;
            i12 = ((org.telegram.ui.ActionBar.k3) i2Var).backgroundPaddingTop;
            i2Var.topBulletinContainer.setTranslationY(Math.max(y3 + i12, i2Var.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - i2Var.topBulletinContainer.getBottom());
        }
        canvas.save();
        Path path = this.f36551c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        i2 i2Var = this.e;
        FrameLayout frameLayout = i2Var.e;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = i2Var.e.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        i2Var.f36667b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), 1073741824));
        setMeasuredDimension(size, size2);
    }
}

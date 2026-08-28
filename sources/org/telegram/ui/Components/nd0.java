package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nd0 extends FrameLayout {
    public final RectF f31080a;
    public boolean f31081b;
    public final Context f31082c;
    public final wd0 d;

    public nd0(wd0 wd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = wd0Var;
        this.f31082c = activity2;
        this.f31080a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        float f10;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        wd0 wd0Var = this.d;
        Paint paint = wd0Var.v;
        int i19 = wd0Var.f34213w;
        i9 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
        int i20 = i19 - i9;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
        int i21 = i10 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
        if (i11 + i20 < dp2) {
            i18 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
            f10 = 1.0f - Math.min(1.0f, ((dp2 - i20) - i18) / dp2);
        } else {
            f10 = 1.0f;
        }
        int i22 = AndroidUtilities.statusBarHeight;
        int i23 = i20 + i22;
        int i24 = i21 - i22;
        drawable = ((org.telegram.ui.ActionBar.f3) wd0Var).shadowDrawable;
        drawable.setBounds(0, i23, getMeasuredWidth(), i24);
        drawable2 = ((org.telegram.ui.ActionBar.f3) wd0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
            i14 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i16 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
            i17 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
            int i25 = i17 + i23;
            RectF rectF = this.f31080a;
            rectF.set(i14, i15 + i23, measuredWidth - i16, AndroidUtilities.dp(24.0f) + i25);
            float f11 = dp2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int themedColor = wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5);
        paint.setColor(Color.argb((int) (wd0Var.f34208e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i12 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        float f12 = i12;
        int measuredWidth2 = getMeasuredWidth();
        i13 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        canvas.drawRect(f12, 0.0f, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wd0 wd0Var = this.d;
            if (wd0Var.f34213w != 0 && motionEvent.getY() < wd0Var.f34213w && wd0Var.f34208e.getAlpha() == 0.0f) {
                wd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wd0 wd0Var = this.d;
        wd0Var.f34212s = true;
        super.onLayout(z10, i9, i10, i11, i12);
        wd0Var.f34212s = false;
        wd0Var.G(false);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        this.f31081b = true;
        wd0 wd0Var = this.d;
        od0 od0Var = wd0Var.f34207c;
        i11 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        setPadding(i11, i14, i12, 0);
        this.f31081b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i9);
        ((FrameLayout.LayoutParams) wd0Var.f34209f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f31081b = true;
        int dp = AndroidUtilities.dp(80.0f);
        td0 td0Var = wd0Var.f34206b;
        int i15 = td0Var.f32686a.A;
        for (int i16 = 0; i16 < i15; i16++) {
            ViewGroup a2 = td0Var.a(this.f31082c, i16);
            a2.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i13 = paddingTop - dp;
        } else {
            i13 = paddingTop / 5;
        }
        if (od0Var.getPaddingTop() != i13) {
            od0Var.getPaddingTop();
            od0Var.setPadding(0, i13, 0, 0);
        }
        this.f31081b = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31081b) {
            return;
        }
        super.requestLayout();
    }
}

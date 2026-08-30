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
public final class je0 extends FrameLayout {
    public final RectF f25965a;
    public boolean f25966b;
    public final Context f25967c;
    public final se0 d;

    public je0(se0 se0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = se0Var;
        this.f25967c = activity2;
        this.f25965a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        float f10;
        Drawable drawable;
        Drawable drawable2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        se0 se0Var = this.d;
        Paint paint = se0Var.v;
        int i20 = se0Var.f28698w;
        i10 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingTop;
            f10 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f10 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.g3) se0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.g3) se0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(se0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
            i15 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f25965a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f11 = dp2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int themedColor = se0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5);
        paint.setColor(Color.argb((int) (se0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingLeft;
        float f12 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingLeft;
        canvas.drawRect(f12, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            se0 se0Var = this.d;
            if (se0Var.f28698w != 0 && motionEvent.getY() < se0Var.f28698w && se0Var.e.getAlpha() == 0.0f) {
                se0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        se0 se0Var = this.d;
        se0Var.f28697s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        se0Var.f28697s = false;
        se0Var.G(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f25966b = true;
        se0 se0Var = this.d;
        ke0 ke0Var = se0Var.f28693c;
        i12 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.g3) se0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f25966b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) se0Var.f28694f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f25966b = true;
        int dp = AndroidUtilities.dp(80.0f);
        pe0 pe0Var = se0Var.f28692b;
        int i16 = pe0Var.f27830a.B;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = pe0Var.a(this.f25967c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (ke0Var.getPaddingTop() != i14) {
            ke0Var.getPaddingTop();
            ke0Var.setPadding(0, i14, 0, 0);
        }
        this.f25966b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
        if (this.f25966b) {
            return;
        }
        super.requestLayout();
    }
}

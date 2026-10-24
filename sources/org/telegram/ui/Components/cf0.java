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
public final class cf0 extends FrameLayout {
    public final RectF f25299a;
    public boolean f25300b;
    public final Context f25301c;
    public final lf0 d;

    public cf0(lf0 lf0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = lf0Var;
        this.f25301c = activity2;
        this.f25299a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        float f7;
        Drawable drawable;
        Drawable drawable2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        lf0 lf0Var = this.d;
        Paint paint = lf0Var.v;
        int i20 = lf0Var.f28331w;
        i10 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingTop;
            f7 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f7 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.h3) lf0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.h3) lf0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f7 != 1.0f) {
            paint.setColor(lf0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
            i15 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f25299a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f10 = dp2 * f7;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        int themedColor = lf0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        paint.setColor(Color.argb((int) (lf0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingLeft;
        float f11 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingLeft;
        canvas.drawRect(f11, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            lf0 lf0Var = this.d;
            if (lf0Var.f28331w != 0 && motionEvent.getY() < lf0Var.f28331w && lf0Var.e.getAlpha() == 0.0f) {
                lf0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lf0 lf0Var = this.d;
        lf0Var.f28330s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        lf0Var.f28330s = false;
        lf0Var.N(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f25300b = true;
        lf0 lf0Var = this.d;
        df0 df0Var = lf0Var.f28326c;
        i12 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) lf0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f25300b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) lf0Var.f28327f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f25300b = true;
        int dp = AndroidUtilities.dp(80.0f);
        if0 if0Var = lf0Var.f28325b;
        int i16 = if0Var.f27420a.E;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = if0Var.a(this.f25301c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (df0Var.getPaddingTop() != i14) {
            df0Var.getPaddingTop();
            df0Var.setPadding(0, i14, 0, 0);
        }
        this.f25300b = false;
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
        if (this.f25300b) {
            return;
        }
        super.requestLayout();
    }
}

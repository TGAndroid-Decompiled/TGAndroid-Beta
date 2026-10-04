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
public final class se0 extends FrameLayout {
    public final RectF f30700a;
    public boolean f30701b;
    public final Context f30702c;
    public final bf0 d;

    public se0(bf0 bf0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = bf0Var;
        this.f30702c = activity2;
        this.f30700a = new RectF();
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
        bf0 bf0Var = this.d;
        Paint paint = bf0Var.v;
        int i20 = bf0Var.f24940w;
        i10 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingTop;
            f7 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f7 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.f3) bf0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.f3) bf0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f7 != 1.0f) {
            paint.setColor(bf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20890h5));
            i15 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f30700a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f10 = dp2 * f7;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        int themedColor = bf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20890h5);
        paint.setColor(Color.argb((int) (bf0Var.f24935e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingLeft;
        float f11 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingLeft;
        canvas.drawRect(f11, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bf0 bf0Var = this.d;
            if (bf0Var.f24940w != 0 && motionEvent.getY() < bf0Var.f24940w && bf0Var.f24935e.getAlpha() == 0.0f) {
                bf0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bf0 bf0Var = this.d;
        bf0Var.f24939s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        bf0Var.f24939s = false;
        bf0Var.F(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f30701b = true;
        bf0 bf0Var = this.d;
        te0 te0Var = bf0Var.f24934c;
        i12 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) bf0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f30701b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) bf0Var.f24936f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f30701b = true;
        int dp = AndroidUtilities.dp(80.0f);
        ye0 ye0Var = bf0Var.f24933b;
        int i16 = ye0Var.f33140a.E;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = ye0Var.a(this.f30702c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (te0Var.getPaddingTop() != i14) {
            te0Var.getPaddingTop();
            te0Var.setPadding(0, i14, 0, 0);
        }
        this.f30701b = false;
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
        if (this.f30701b) {
            return;
        }
        super.requestLayout();
    }
}

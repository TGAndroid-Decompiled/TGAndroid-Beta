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
public final class ke0 extends FrameLayout {
    public final RectF f26266a;
    public boolean f26267b;
    public final Context f26268c;
    public final te0 d;

    public ke0(te0 te0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = te0Var;
        this.f26268c = activity2;
        this.f26266a = new RectF();
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
        te0 te0Var = this.d;
        Paint paint = te0Var.v;
        int i20 = te0Var.f28980w;
        i10 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingTop;
            f10 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f10 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.g3) te0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.g3) te0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(te0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
            i15 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f26266a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f11 = dp2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int themedColor = te0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5);
        paint.setColor(Color.argb((int) (te0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingLeft;
        float f12 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingLeft;
        canvas.drawRect(f12, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            te0 te0Var = this.d;
            if (te0Var.f28980w != 0 && motionEvent.getY() < te0Var.f28980w && te0Var.e.getAlpha() == 0.0f) {
                te0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        te0 te0Var = this.d;
        te0Var.f28979s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        te0Var.f28979s = false;
        te0Var.G(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f26267b = true;
        te0 te0Var = this.d;
        le0 le0Var = te0Var.f28975c;
        i12 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.g3) te0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f26267b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) te0Var.f28976f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f26267b = true;
        int dp = AndroidUtilities.dp(80.0f);
        qe0 qe0Var = te0Var.f28974b;
        int i16 = qe0Var.f28150a.B;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = qe0Var.a(this.f26268c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (le0Var.getPaddingTop() != i14) {
            le0Var.getPaddingTop();
            le0Var.setPadding(0, i14, 0, 0);
        }
        this.f26267b = false;
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
        if (this.f26267b) {
            return;
        }
        super.requestLayout();
    }
}

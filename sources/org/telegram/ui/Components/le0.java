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
public final class le0 extends FrameLayout {
    public final RectF f28701a;
    public boolean f28702b;
    public final Context f28703c;
    public final ue0 d;

    public le0(ue0 ue0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = ue0Var;
        this.f28703c = activity2;
        this.f28701a = new RectF();
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
        ue0 ue0Var = this.d;
        Paint paint = ue0Var.v;
        int i20 = ue0Var.f31669w;
        i10 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingTop;
            f10 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f10 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.h3) ue0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.h3) ue0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
            i15 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f28701a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f11 = dp2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int themedColor = ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5);
        paint.setColor(Color.argb((int) (ue0Var.f31664e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingLeft;
        float f12 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingLeft;
        canvas.drawRect(f12, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ue0 ue0Var = this.d;
            if (ue0Var.f31669w != 0 && motionEvent.getY() < ue0Var.f31669w && ue0Var.f31664e.getAlpha() == 0.0f) {
                ue0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        ue0 ue0Var = this.d;
        ue0Var.f31668s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        ue0Var.f31668s = false;
        ue0Var.G(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f28702b = true;
        ue0 ue0Var = this.d;
        me0 me0Var = ue0Var.f31663c;
        i12 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) ue0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f28702b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) ue0Var.f31665f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f28702b = true;
        int dp = AndroidUtilities.dp(80.0f);
        re0 re0Var = ue0Var.f31662b;
        int i16 = re0Var.f30692a.B;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = re0Var.a(this.f28703c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (me0Var.getPaddingTop() != i14) {
            me0Var.getPaddingTop();
            me0Var.setPadding(0, i14, 0, 0);
        }
        this.f28702b = false;
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
        if (this.f28702b) {
            return;
        }
        super.requestLayout();
    }
}

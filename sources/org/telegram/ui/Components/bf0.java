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
public final class bf0 extends FrameLayout {
    public final RectF f26820a;
    public boolean f26821b;
    public final Context f26822c;
    public final kf0 d;

    public bf0(kf0 kf0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = kf0Var;
        this.f26822c = activity2;
        this.f26820a = new RectF();
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
        kf0 kf0Var = this.d;
        Paint paint = kf0Var.v;
        int i20 = kf0Var.f29950w;
        i10 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingTop;
            f7 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f7 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.k3) kf0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.k3) kf0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f7 != 1.0f) {
            paint.setColor(kf0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
            i15 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f26820a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f10 = dp2 * f7;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        int themedColor = kf0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
        paint.setColor(Color.argb((int) (kf0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingLeft;
        float f11 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingLeft;
        canvas.drawRect(f11, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            kf0 kf0Var = this.d;
            if (kf0Var.f29950w != 0 && motionEvent.getY() < kf0Var.f29950w && kf0Var.e.getAlpha() == 0.0f) {
                kf0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kf0 kf0Var = this.d;
        kf0Var.f29949s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        kf0Var.f29949s = false;
        kf0Var.N(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f26821b = true;
        kf0 kf0Var = this.d;
        cf0 cf0Var = kf0Var.f29945c;
        i12 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.k3) kf0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f26821b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) kf0Var.f29946f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f26821b = true;
        int dp = AndroidUtilities.dp(80.0f);
        hf0 hf0Var = kf0Var.f29944b;
        int i16 = hf0Var.f28986a.E;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = hf0Var.a(this.f26822c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (cf0Var.getPaddingTop() != i14) {
            cf0Var.getPaddingTop();
            cf0Var.setPadding(0, i14, 0, 0);
        }
        this.f26821b = false;
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
        if (this.f26821b) {
            return;
        }
        super.requestLayout();
    }
}

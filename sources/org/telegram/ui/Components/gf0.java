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
public final class gf0 extends FrameLayout {
    public final RectF f24954a;
    public boolean f24955b;
    public final Context f24956c;
    public final pf0 d;

    public gf0(pf0 pf0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = pf0Var;
        this.f24956c = activity2;
        this.f24954a = new RectF();
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
        pf0 pf0Var = this.d;
        Paint paint = pf0Var.v;
        int i20 = pf0Var.f27993w;
        i10 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingTop;
            f7 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f7 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.e3) pf0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.e3) pf0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f7 != 1.0f) {
            paint.setColor(pf0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
            i15 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingTop;
            int i26 = i18 + i24;
            RectF rectF = this.f24954a;
            rectF.set(i15, i16 + i24, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i26);
            float f10 = dp2 * f7;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        int themedColor = pf0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5);
        paint.setColor(Color.argb((int) (pf0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingLeft;
        float f11 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingLeft;
        canvas.drawRect(f11, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            pf0 pf0Var = this.d;
            if (pf0Var.f27993w != 0 && motionEvent.getY() < pf0Var.f27993w && pf0Var.e.getAlpha() == 0.0f) {
                pf0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        pf0 pf0Var = this.d;
        pf0Var.f27992s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        pf0Var.f27992s = false;
        pf0Var.I(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        this.f24955b = true;
        pf0 pf0Var = this.d;
        hf0 hf0Var = pf0Var.f27988c;
        i12 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.e3) pf0Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.f24955b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) pf0Var.f27989f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f24955b = true;
        int dp = AndroidUtilities.dp(80.0f);
        mf0 mf0Var = pf0Var.f27987b;
        int i16 = mf0Var.f27099a.E;
        for (int i17 = 0; i17 < i16; i17++) {
            ViewGroup a2 = mf0Var.a(this.f24956c, i17);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        if (dp < paddingTop) {
            i14 = paddingTop - dp;
        } else {
            i14 = paddingTop / 5;
        }
        if (hf0Var.getPaddingTop() != i14) {
            hf0Var.getPaddingTop();
            hf0Var.setPadding(0, i14, 0, 0);
        }
        this.f24955b = false;
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
        if (this.f24955b) {
            return;
        }
        super.requestLayout();
    }
}

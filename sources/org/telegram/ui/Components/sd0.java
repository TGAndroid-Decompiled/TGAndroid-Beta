package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class sd0 extends FrameLayout {

    public final RectF f32403a;

    public boolean f32404b;

    public final Context f32405c;
    public final be0 d;

    public sd0(be0 be0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = be0Var;
        this.f32405c = activity2;
        this.f32403a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        be0 be0Var = this.d;
        Paint paint = be0Var.v;
        int i10 = be0Var.f27081w - ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingTop;
        int iDp = ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingTop + AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        float fDp = AndroidUtilities.dp(12.0f);
        float fMin = ((float) (((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingTop + i10)) < fDp ? 1.0f - Math.min(1.0f, ((fDp - i10) - ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingTop) / fDp) : 1.0f;
        int i11 = AndroidUtilities.statusBarHeight;
        int i12 = i10 + i11;
        ((org.telegram.ui.ActionBar.e3) be0Var).shadowDrawable.setBounds(0, i12, getMeasuredWidth(), iDp - i11);
        ((org.telegram.ui.ActionBar.e3) be0Var).shadowDrawable.draw(canvas);
        if (fMin != 1.0f) {
            paint.setColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            float f10 = ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingLeft;
            float f11 = ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingTop + i12;
            float measuredWidth = getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingLeft;
            float fDp2 = AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingTop + i12;
            RectF rectF = this.f32403a;
            rectF.set(f10, f11, measuredWidth, fDp2);
            float f12 = fDp * fMin;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int themedColor = be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5);
        paint.setColor(Color.argb((int) (be0Var.f27076e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        canvas.drawRect(((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            be0 be0Var = this.d;
            if (be0Var.f27081w != 0 && motionEvent.getY() < be0Var.f27081w && be0Var.f27076e.getAlpha() == 0.0f) {
                be0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        be0 be0Var = this.d;
        be0Var.f27080s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        be0Var.f27080s = false;
        be0Var.H(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        this.f32404b = true;
        be0 be0Var = this.d;
        td0 td0Var = be0Var.f27075c;
        setPadding(((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) be0Var).backgroundPaddingLeft, 0);
        this.f32404b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) be0Var.f27077f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f32404b = true;
        int iDp = AndroidUtilities.dp(80.0f);
        yd0 yd0Var = be0Var.f27074b;
        int i12 = yd0Var.f34884a.A;
        for (int i13 = 0; i13 < i12; i13++) {
            ViewGroup viewGroupA = yd0Var.a(this.f32405c, i13);
            viewGroupA.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            iDp += viewGroupA.getMeasuredHeight();
        }
        int i14 = iDp < paddingTop ? paddingTop - iDp : paddingTop / 5;
        if (td0Var.getPaddingTop() != i14) {
            td0Var.getPaddingTop();
            td0Var.setPadding(0, i14, 0, 0);
        }
        this.f32404b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f32404b) {
            return;
        }
        super.requestLayout();
    }
}

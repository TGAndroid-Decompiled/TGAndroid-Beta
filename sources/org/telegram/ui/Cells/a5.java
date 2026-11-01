package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.a30;
import org.telegram.ui.Components.p80;
public final class a5 extends FrameLayout {
    public final int f21675a;

    public a5(Context context, int i10) {
        super(context);
        this.f21675a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f21675a) {
            case 26:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f21675a) {
            case 18:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f21675a) {
            case 4:
                return super.drawChild(canvas, view, j10);
            case 8:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f21675a) {
            case 3:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f21675a) {
            case 10:
                int intrinsicHeight = org.telegram.ui.ActionBar.t6.f21018i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.t6.f21018i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.t6.f21018i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21035j2);
                return;
            case 23:
                canvas.drawLine(0.0f, org.telegram.messenger.i0.L(40.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(40.0f), org.telegram.ui.ActionBar.t6.f21053k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f21675a) {
            case 24:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        switch (this.f21675a) {
            case 9:
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    if (((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17) {
                        f7 = getHeight() / 2.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    setPivotY(f7);
                    setScaleX(min);
                    setScaleY(min);
                    return;
                }
                return;
            case 25:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                            i15 = org.telegram.messenger.m5.C(8.0f, getChildAt(i16).getMeasuredHeight(), i15);
                            i14 = 0;
                        }
                        getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                        i14 = org.telegram.messenger.m5.C(16.0f, getChildAt(i16).getMeasuredWidth(), i14);
                    }
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f21675a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(60.0f)), View.MeasureSpec.getMode(i11)));
                return;
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 26:
            default:
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), 1073741824));
                return;
            case 9:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
                return;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(325.0f)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 14:
                super.onMeasure(i10, i11);
                return;
            case 15:
                super.onMeasure(i10, i11);
                return;
            case 16:
                super.onMeasure(i10, i11);
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(300.0f), View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(32.0f)), Integer.MIN_VALUE), i11);
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), a30.B(48.0f, 1, 1073741824));
                return;
            case 25:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > View.MeasureSpec.getSize(i10)) {
                            i14 = org.telegram.messenger.m5.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.m5.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                        i12 = getChildAt(i15).getMeasuredHeight() + i14;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i12);
                return;
            case 27:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 28:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
                measureChildren(makeMeasureSpec, i11);
                int i16 = 0;
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    i16 = Math.max(i16, getChildAt(i17).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                return;
            case 29:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f21675a) {
            case 5:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21675a) {
            case 19:
                super.setTranslationY(f7);
                setPadding(0, 0, (int) f7, 0);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public a5(Context context, int i10, String str, CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f21675a = 13;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i10);
        addView(imageView, w7.b6.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.a7.H(p80Var, i12, p6Var);
        p80Var.setText(str);
        linearLayout.addView(p80Var, w7.b6.t(-1, -2, 55, 0, 0, 0, 2));
        p80 p80Var2 = new p80(context, null);
        p80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i12, p6Var);
        p80Var2.setText(charSequence);
        linearLayout.addView(p80Var2, w7.b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private final void a(boolean z10, int i10, int i11, int i12, int i13) {
    }
}

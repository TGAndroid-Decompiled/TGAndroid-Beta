package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class gy extends FrameLayout {
    public org.telegram.ui.Components.e9 f37580a;
    public org.telegram.ui.Components.e9 f37581b;
    public Drawable f37582c;
    public Drawable d;
    public final Drawable e;
    public Paint f37583f;
    public RectF h;
    public final ViewGroup[] f37584n;
    public final hy f37585r;

    public gy(hy hyVar, Context context) {
        super(context);
        this.f37585r = hyVar;
        this.f37583f = new Paint(1);
        this.h = new RectF();
        this.f37584n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        addView(f7, w7.b6.e(-2, -2, 17));
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
        s0Var.setCustomText(org.telegram.messenger.dd.L0(2131742894, null));
        f7.addView(s0Var, w7.b6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232855);
        f7.addView(linearLayout, w7.b6.t(-2, -2, 17, 10, 0, 10, 0));
        hyVar.d = new ImageView(context);
        int i11 = hyVar.f37890x;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f37584n[i10] = (ViewGroup) hyVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f37584n[i10], w7.b6.o(-1, -2));
                i10++;
            }
            linearLayout.addView(hyVar.d, w7.b6.r(218, 160, 17));
            hyVar.d.setImageResource(2131231003);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f37584n[i10] = (ViewGroup) hyVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f37584n[i10], w7.b6.o(160, -2));
                i10++;
            }
            linearLayout.addView(hyVar.d, w7.b6.r(160, 160, 17));
            hyVar.d.setImageResource(2131231031);
        }
        a();
        this.e = org.telegram.ui.ActionBar.t6.Y0(context, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gy.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e9 e9Var = this.f37580a;
        if (e9Var != null) {
            e9Var.dispose();
            this.f37580a = null;
        }
        org.telegram.ui.Components.e9 e9Var2 = this.f37581b;
        if (e9Var2 != null) {
            e9Var2.dispose();
            this.f37581b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gy.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}

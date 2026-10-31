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
public final class hy extends FrameLayout {
    public org.telegram.ui.Components.e9 f38047a;
    public org.telegram.ui.Components.e9 f38048b;
    public Drawable f38049c;
    public Drawable d;
    public final Drawable e;
    public Paint f38050f;
    public RectF h;
    public final ViewGroup[] f38051n;
    public final iy f38052r;

    public hy(iy iyVar, Context context) {
        super(context);
        this.f38052r = iyVar;
        this.f38050f = new Paint(1);
        this.h = new RectF();
        this.f38051n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        addView(f7, w7.b6.e(-2, -2, 17));
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
        s0Var.setCustomText(org.telegram.messenger.cd.L0(2131742894, null));
        f7.addView(s0Var, w7.b6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232855);
        f7.addView(linearLayout, w7.b6.t(-2, -2, 17, 10, 0, 10, 0));
        iyVar.d = new ImageView(context);
        int i11 = iyVar.f38372x;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f38051n[i10] = (ViewGroup) iyVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f38051n[i10], w7.b6.o(-1, -2));
                i10++;
            }
            linearLayout.addView(iyVar.d, w7.b6.r(218, 160, 17));
            iyVar.d.setImageResource(2131231003);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f38051n[i10] = (ViewGroup) iyVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f38051n[i10], w7.b6.o(160, -2));
                i10++;
            }
            linearLayout.addView(iyVar.d, w7.b6.r(160, 160, 17));
            iyVar.d.setImageResource(2131231031);
        }
        a();
        this.e = org.telegram.ui.ActionBar.t6.Y0(context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hy.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e9 e9Var = this.f38047a;
        if (e9Var != null) {
            e9Var.dispose();
            this.f38047a = null;
        }
        org.telegram.ui.Components.e9 e9Var2 = this.f38048b;
        if (e9Var2 != null) {
            e9Var2.dispose();
            this.f38048b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hy.onDraw(android.graphics.Canvas):void");
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

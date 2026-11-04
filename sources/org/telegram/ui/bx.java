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
public final class bx extends FrameLayout {
    public org.telegram.ui.Components.h9 f44158a;
    public org.telegram.ui.Components.h9 f44159b;
    public Drawable f44160c;
    public Drawable d;
    public final Drawable f44161e;
    public Paint f44162f;
    public RectF h;
    public final ViewGroup[] f44163n;
    public final cx f44164r;

    public bx(cx cxVar, Context context) {
        super(context);
        this.f44164r = cxVar;
        this.f44162f = new Paint(1);
        this.h = new RectF();
        this.f44163n = new ViewGroup[2];
        int i3 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, b8.mf.e(-2, -2, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        t0Var.setCustomText(org.telegram.messenger.bd.M0(2131742879, null));
        f10.addView(t0Var, b8.mf.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232855);
        f10.addView(linearLayout, b8.mf.t(-2, -2, 17, 10, 0, 10, 0));
        cxVar.d = new ImageView(context);
        int i10 = cxVar.f44464x;
        if (i10 == 0) {
            while (i3 < 2) {
                this.f44163n[i3] = (ViewGroup) cxVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f44163n[i3], b8.mf.o(-1, -2));
                i3++;
            }
            linearLayout.addView(cxVar.d, b8.mf.r(218, 160, 17));
            cxVar.d.setImageResource(2131231003);
        } else if (i10 == 1) {
            while (i3 < 2) {
                this.f44163n[i3] = (ViewGroup) cxVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f44163n[i3], b8.mf.o(160, -2));
                i3++;
            }
            linearLayout.addView(cxVar.d, b8.mf.r(160, 160, 17));
            cxVar.d.setImageResource(2131231031);
        }
        a();
        this.f44161e = org.telegram.ui.ActionBar.k6.Y0(context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.h9 h9Var = this.f44158a;
        if (h9Var != null) {
            h9Var.dispose();
            this.f44158a = null;
        }
        org.telegram.ui.Components.h9 h9Var2 = this.f44159b;
        if (h9Var2 != null) {
            h9Var2.dispose();
            this.f44159b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}

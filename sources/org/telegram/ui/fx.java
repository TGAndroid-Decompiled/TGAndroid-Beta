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
public final class fx extends FrameLayout {
    public org.telegram.ui.Components.g9 f47211a;
    public org.telegram.ui.Components.g9 f47212b;
    public Drawable f47213c;
    public Drawable d;
    public final Drawable f47214e;
    public Paint f47215f;
    public RectF h;
    public final ViewGroup[] f47216n;
    public final gx f47217r;

    public fx(gx gxVar, Context context) {
        super(context);
        this.f47217r = gxVar;
        this.f47215f = new Paint(1);
        this.h = new RectF();
        this.f47216n = new ViewGroup[2];
        int i7 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ja.e(-2, -2, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        t0Var.setCustomText(org.telegram.messenger.hd.M0(2131742869, null));
        f10.addView(t0Var, c8.ja.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232858);
        f10.addView(linearLayout, c8.ja.t(-2, -2, 17, 10, 0, 10, 0));
        gxVar.d = new ImageView(context);
        int i10 = gxVar.f47545x;
        if (i10 == 0) {
            while (i7 < 2) {
                this.f47216n[i7] = (ViewGroup) gxVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f47216n[i7], c8.ja.o(-1, -2));
                i7++;
            }
            linearLayout.addView(gxVar.d, c8.ja.r(218, 160, 17));
            gxVar.d.setImageResource(2131231003);
        } else if (i10 == 1) {
            while (i7 < 2) {
                this.f47216n[i7] = (ViewGroup) gxVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f47216n[i7], c8.ja.o(160, -2));
                i7++;
            }
            linearLayout.addView(gxVar.d, c8.ja.r(160, 160, 17));
            gxVar.d.setImageResource(2131231031);
        }
        a();
        this.f47214e = org.telegram.ui.ActionBar.j6.Y0(context, 2131231230, org.telegram.ui.ActionBar.j6.f28813b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g9 g9Var = this.f47211a;
        if (g9Var != null) {
            g9Var.dispose();
            this.f47211a = null;
        }
        org.telegram.ui.Components.g9 g9Var2 = this.f47212b;
        if (g9Var2 != null) {
            g9Var2.dispose();
            this.f47212b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}

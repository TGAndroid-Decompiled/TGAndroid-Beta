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
    public org.telegram.ui.Components.j9 f45799a;
    public org.telegram.ui.Components.j9 f45800b;
    public Drawable f45801c;
    public Drawable d;
    public final Drawable f45802e;
    public Paint f45803f;
    public RectF h;
    public final ViewGroup[] f45804n;
    public final gx f45805r;

    public fx(gx gxVar, Context context) {
        super(context);
        this.f45805r = gxVar;
        this.f45803f = new Paint(1);
        this.h = new RectF();
        this.f45804n = new ViewGroup[2];
        int i7 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        t0Var.setCustomText(org.telegram.messenger.id.M0(2131742869, null));
        f10.addView(t0Var, c8.ha.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232857);
        f10.addView(linearLayout, c8.ha.t(-2, -2, 17, 10, 0, 10, 0));
        gxVar.d = new ImageView(context);
        int i10 = gxVar.f46090x;
        if (i10 == 0) {
            while (i7 < 2) {
                this.f45804n[i7] = (ViewGroup) gxVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f45804n[i7], c8.ha.o(-1, -2));
                i7++;
            }
            linearLayout.addView(gxVar.d, c8.ha.r(218, 160, 17));
            gxVar.d.setImageResource(2131231003);
        } else if (i10 == 1) {
            while (i7 < 2) {
                this.f45804n[i7] = (ViewGroup) gxVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f45804n[i7], c8.ha.o(160, -2));
                i7++;
            }
            linearLayout.addView(gxVar.d, c8.ha.r(160, 160, 17));
            gxVar.d.setImageResource(2131231031);
        }
        a();
        this.f45802e = org.telegram.ui.ActionBar.l6.Y0(context, 2131231230, org.telegram.ui.ActionBar.l6.f27829b7);
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
        org.telegram.ui.Components.j9 j9Var = this.f45799a;
        if (j9Var != null) {
            j9Var.dispose();
            this.f45799a = null;
        }
        org.telegram.ui.Components.j9 j9Var2 = this.f45800b;
        if (j9Var2 != null) {
            j9Var2.dispose();
            this.f45800b = null;
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
    public final void dispatchSetPressed(boolean z9) {
    }
}

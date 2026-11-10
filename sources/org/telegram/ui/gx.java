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
public final class gx extends FrameLayout {
    public org.telegram.ui.Components.i9 f46166a;
    public org.telegram.ui.Components.i9 f46167b;
    public Drawable f46168c;
    public Drawable d;
    public final Drawable f46169e;
    public Paint f46170f;
    public RectF h;
    public final ViewGroup[] f46171n;
    public final hx f46172r;

    public gx(hx hxVar, Context context) {
        super(context);
        this.f46172r = hxVar;
        this.f46170f = new Paint(1);
        this.h = new RectF();
        this.f46171n = new ViewGroup[2];
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
        hxVar.d = new ImageView(context);
        int i10 = hxVar.f46445x;
        if (i10 == 0) {
            while (i7 < 2) {
                this.f46171n[i7] = (ViewGroup) hxVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f46171n[i7], c8.ha.o(-1, -2));
                i7++;
            }
            linearLayout.addView(hxVar.d, c8.ha.r(218, 160, 17));
            hxVar.d.setImageResource(2131231003);
        } else if (i10 == 1) {
            while (i7 < 2) {
                this.f46171n[i7] = (ViewGroup) hxVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f46171n[i7], c8.ha.o(160, -2));
                i7++;
            }
            linearLayout.addView(hxVar.d, c8.ha.r(160, 160, 17));
            hxVar.d.setImageResource(2131231031);
        }
        a();
        this.f46169e = org.telegram.ui.ActionBar.m6.Y0(context, 2131231230, org.telegram.ui.ActionBar.m6.f27854b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i9 i9Var = this.f46166a;
        if (i9Var != null) {
            i9Var.dispose();
            this.f46166a = null;
        }
        org.telegram.ui.Components.i9 i9Var2 = this.f46167b;
        if (i9Var2 != null) {
            i9Var2.dispose();
            this.f46167b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx.onDraw(android.graphics.Canvas):void");
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

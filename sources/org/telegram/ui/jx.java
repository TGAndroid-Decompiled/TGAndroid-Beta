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
public final class jx extends FrameLayout {
    public org.telegram.ui.Components.o9 f49110a;
    public org.telegram.ui.Components.o9 f49111b;
    public Drawable f49112c;
    public Drawable d;
    public final Drawable f49113e;
    public Paint f49114f;
    public RectF h;
    public final ViewGroup[] f49115n;
    public final kx f49116r;

    public jx(kx kxVar, Context context) {
        super(context);
        this.f49116r = kxVar;
        this.f49114f = new Paint(1);
        this.h = new RectF();
        this.f49115n = new ViewGroup[2];
        int i7 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, c8.ma.e(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(org.telegram.messenger.gd.N0(2131742605, null));
        g10.addView(v0Var, c8.ma.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232862);
        g10.addView(linearLayout, c8.ma.t(-2, -2, 17, 10, 0, 10, 0));
        kxVar.d = new ImageView(context);
        int i10 = kxVar.f49402x;
        if (i10 == 0) {
            while (i7 < 2) {
                this.f49115n[i7] = (ViewGroup) kxVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f49115n[i7], c8.ma.o(-1, -2));
                i7++;
            }
            linearLayout.addView(kxVar.d, c8.ma.r(218, 160, 17));
            kxVar.d.setImageResource(2131231003);
        } else if (i10 == 1) {
            while (i7 < 2) {
                this.f49115n[i7] = (ViewGroup) kxVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f49115n[i7], c8.ma.o(160, -2));
                i7++;
            }
            linearLayout.addView(kxVar.d, c8.ma.r(160, 160, 17));
            kxVar.d.setImageResource(2131231031);
        }
        a();
        this.f49113e = org.telegram.ui.ActionBar.m6.Y0(context, 2131231230, org.telegram.ui.ActionBar.m6.f29342b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o9 o9Var = this.f49110a;
        if (o9Var != null) {
            o9Var.dispose();
            this.f49110a = null;
        }
        org.telegram.ui.Components.o9 o9Var2 = this.f49111b;
        if (o9Var2 != null) {
            o9Var2.dispose();
            this.f49111b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx.onDraw(android.graphics.Canvas):void");
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

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
public final class ix extends FrameLayout {
    public org.telegram.ui.Components.n9 f48934a;
    public org.telegram.ui.Components.n9 f48935b;
    public Drawable f48936c;
    public Drawable d;
    public final Drawable f48937e;
    public Paint f48938f;
    public RectF h;
    public final ViewGroup[] f48939n;
    public final jx f48940r;

    public ix(jx jxVar, Context context) {
        super(context);
        this.f48940r = jxVar;
        this.f48938f = new Paint(1);
        this.h = new RectF();
        this.f48939n = new ViewGroup[2];
        int i7 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, c8.na.e(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(org.telegram.messenger.gd.N0(2131742598, null));
        g10.addView(v0Var, c8.na.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232865);
        g10.addView(linearLayout, c8.na.t(-2, -2, 17, 10, 0, 10, 0));
        jxVar.d = new ImageView(context);
        int i10 = jxVar.f49228x;
        if (i10 == 0) {
            while (i7 < 2) {
                this.f48939n[i7] = (ViewGroup) jxVar.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.f48939n[i7], c8.na.o(-1, -2));
                i7++;
            }
            linearLayout.addView(jxVar.d, c8.na.r(218, 160, 17));
            jxVar.d.setImageResource(2131231005);
        } else if (i10 == 1) {
            while (i7 < 2) {
                this.f48939n[i7] = (ViewGroup) jxVar.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.f48939n[i7], c8.na.o(160, -2));
                i7++;
            }
            linearLayout.addView(jxVar.d, c8.na.r(160, 160, 17));
            jxVar.d.setImageResource(2131231033);
        }
        a();
        this.f48937e = org.telegram.ui.ActionBar.n6.Y0(context, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.f48934a;
        if (n9Var != null) {
            n9Var.dispose();
            this.f48934a = null;
        }
        org.telegram.ui.Components.n9 n9Var2 = this.f48935b;
        if (n9Var2 != null) {
            n9Var2.dispose();
            this.f48935b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix.onDraw(android.graphics.Canvas):void");
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

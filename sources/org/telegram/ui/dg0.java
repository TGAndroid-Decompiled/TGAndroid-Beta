package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class dg0 extends FrameLayout {
    public final int f36764a;

    public dg0(Context context, int i10) {
        super(context);
        this.f36764a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36764a) {
            case 2:
                super.dispatchDraw(canvas);
                return;
            case 15:
                org.telegram.ui.ActionBar.t6.f21017i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.t6.f21017i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.t6.f21017i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f36764a) {
            case 17:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36764a) {
            case 17:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f36764a) {
            case 4:
                int intrinsicHeight = org.telegram.ui.ActionBar.t6.f21017i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.t6.f21017i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.t6.f21017i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21034j2);
                return;
            case 14:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36764a) {
            case 11:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f36764a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight());
                return;
            case 8:
                super.onMeasure(i10, org.telegram.messenger.z20.B(36.0f, View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, i11);
                return;
            case 11:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                int childCount = getChildCount();
                int i13 = 0;
                if (childCount > 0) {
                    i12 = getChildAt(0).getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > size) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                int measuredWidth = getMeasuredWidth();
                if (getChildCount() != 0) {
                    i13 = org.telegram.messenger.i0.L(16.0f) + i12 + i15;
                }
                setMeasuredDimension(measuredWidth, i13);
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(500.0f), 1073741824));
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), 1073741824));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(12.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f36764a) {
            case 17:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public dg0(org.telegram.ui.Components.e30 e30Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f36764a = 7;
        boolean z10 = org.telegram.messenger.cd.X;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.y(this, mutate, i11, e30Var.I0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.b6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.m5.m(textView, i11, e30Var.I0, 1, 14.0f);
        addView(textView, w7.b6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(getContext(), null);
        p80Var.setText(charSequence);
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.Dj, e30Var.I0);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, e30Var.I0);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        addView(p80Var, w7.b6.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }

    public dg0(g01 g01Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f36764a = 6;
        boolean z10 = org.telegram.messenger.cd.X;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.y(this, mutate, i11, g01Var.I0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.b6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.m5.m(textView, i11, g01Var.I0, 1, 14.0f);
        addView(textView, w7.b6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(getContext(), null);
        p80Var.setText(charSequence);
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.Dj, g01Var.I0);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, g01Var.I0);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(p80Var, w7.b6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    public dg0(int i10, Context context, String str) {
        super(context);
        this.f36764a = 1;
        setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f));
        ImageView e = org.telegram.messenger.z20.e(context, i10);
        e.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.t(e, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(e, w7.b6.d(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView.setText(str);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    public dg0(Context context, ph.r2 r2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f36764a = 19;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        addView(f7, w7.b6.e(-1, -2, 23));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setImageDrawable(new org.telegram.ui.Components.bi0(2131624317, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
        f7.addView(g9Var, w7.b6.r(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131750020, null));
        f7.addView(textView, w7.b6.t(-2, -2, 17, 32, 12, 32, 9));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.A6, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setText(org.telegram.messenger.cd.L0(2131750021, null));
        p80Var.setMaxWidth(org.telegram.messenger.i0.L(200.0f));
        f7.addView(p80Var, w7.b6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, p6Var);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)), 6, 6);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i10);
        textView2.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(textView2, a02, null, L, p6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.cd.L0(2131750022, null));
        textView2.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), 0);
        w7.e6.a(textView2);
        f7.addView(textView2, w7.b6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(r2Var);
    }

    public dg0(Context context) {
        super(context);
        this.f36764a = 5;
        setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f));
    }
}

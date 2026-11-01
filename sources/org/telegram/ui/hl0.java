package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class hl0 extends FrameLayout implements org.telegram.messenger.z5 {
    public final TextView f37829a;
    public final TextView f37830b;
    public final org.telegram.ui.Components.g9 f37831c;
    public final org.telegram.ui.Components.gi0 d;
    public int e;
    public org.telegram.messenger.qw f37832f;
    public final int h;
    public final jl0 f37833n;

    public hl0(jl0 jl0Var, Activity activity) {
        super(activity);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f37833n = jl0Var;
        i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
        this.h = org.telegram.messenger.b6.q(i10).k();
        this.d = new org.telegram.ui.Components.gi0(this);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        this.f37831c = g9Var;
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(g9Var, w7.b6.d(48, 48.0f, i11 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f37829a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z10 = org.telegram.messenger.dd.X;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i18 = i13 | 48;
        if (z10) {
            i14 = 21;
        } else {
            i14 = 81;
        }
        float f7 = i14;
        if (z10) {
            i15 = 81;
        } else {
            i15 = 21;
        }
        addView(textView, w7.b6.d(-2, -2.0f, i18, f7, 10.0f, i15, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f37830b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.dd.X) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.dd.X;
        int i19 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i17 = 21;
        } else {
            i17 = 81;
        }
        addView(textView2, w7.b6.d(-2, -2.0f, i19, i17, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void D(boolean z10) {
        a(false);
    }

    @Override
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        String r10 = org.telegram.messenger.b8.r(null, this.f37832f);
        org.telegram.messenger.b8.G(org.telegram.messenger.e20.f15506s0);
        boolean exists = org.telegram.messenger.b8.I(this.f37832f).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        org.telegram.ui.Components.gi0 gi0Var = this.d;
        if (isEmpty) {
            gi0Var.d(null, false, false);
            return;
        }
        org.telegram.messenger.qw qwVar = this.f37832f;
        String str = qwVar.f17825c;
        float f7 = 0.0f;
        jl0 jl0Var = this.f37833n;
        if (str != null) {
            if (qwVar.d != null) {
                i13 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                org.telegram.messenger.b6.q(i13).v(this);
                gi0Var.d(null, false, z10);
                this.e = -1;
                return;
            }
            i12 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
            org.telegram.messenger.b6.q(i12).a(this.f37832f.f17825c, null, this);
            this.e = 1;
            Float w9 = org.telegram.messenger.ic.D().w(this.f37832f.f17825c);
            gi0Var.d(getResources().getDrawable(2131231005), true, z10);
            if (w9 != null) {
                f7 = w9.floatValue();
            }
            gi0Var.e(false, f7);
            invalidate();
        } else if (exists) {
            i11 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
            org.telegram.messenger.b6.q(i11).v(this);
            this.e = -1;
            gi0Var.d(null, false, z10);
            invalidate();
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            this.e = 1;
            Float w10 = org.telegram.messenger.ic.D().w(r10);
            gi0Var.d(getResources().getDrawable(2131231005), true, z10);
            if (w10 != null) {
                f7 = w10.floatValue();
            }
            gi0Var.e(z10, f7);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.f37831c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void i(long j10, long j11) {
        this.d.e(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.e != 1) {
            a(false);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37829a.invalidate();
    }

    @Override
    public final void o(long j10, long j11) {
        this.d.e(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (org.telegram.messenger.dd.X) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(20.0f);
        }
        float f7 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.dd.X) {
            i10 = org.telegram.messenger.i0.L(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        org.telegram.ui.Components.g9 g9Var = this.f37831c;
        int measuredWidth = ((g9Var.getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f)) / 2) + g9Var.getLeft();
        int measuredHeight = ((g9Var.getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f)) / 2) + g9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(24.0f) + measuredWidth, org.telegram.messenger.i0.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.a30.B(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.f37830b.setText(charSequence);
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class fk0 extends FrameLayout implements org.telegram.messenger.y5 {
    public final TextView f47752a;
    public final TextView f47753b;
    public final org.telegram.ui.Components.q9 f47754c;
    public final org.telegram.ui.Components.sh0 d;
    public int f47755e;
    public org.telegram.messenger.zv f47756f;
    public final int h;
    public final hk0 f47757n;

    public fk0(hk0 hk0Var, Activity activity) {
        super(activity);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f47757n = hk0Var;
        i7 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
        this.h = org.telegram.messenger.a6.q(i7).k();
        this.d = new org.telegram.ui.Components.sh0(this);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        this.f47754c = q9Var;
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(q9Var, c8.ma.d(48, 48.0f, i10 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f47752a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.messenger.o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z10 = org.telegram.messenger.hd.f24444a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 81;
        }
        float f10 = i13;
        if (z10) {
            i14 = 81;
        } else {
            i14 = 21;
        }
        addView(textView, c8.ma.d(-2, -2.0f, i17, f10, 10.0f, i14, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f47753b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29792z6, null);
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.hd.f24444a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.hd.f24444a0;
        int i18 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i16 = 21;
        } else {
            i16 = 81;
        }
        addView(textView2, c8.ma.d(-2, -2.0f, i18, i16, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void C(boolean z10) {
        a(false);
    }

    @Override
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        String r10 = org.telegram.messenger.w7.r(null, this.f47756f);
        org.telegram.messenger.w7.G(org.telegram.messenger.k10.f24968t0);
        boolean exists = org.telegram.messenger.w7.I(this.f47756f).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        org.telegram.ui.Components.sh0 sh0Var = this.d;
        if (isEmpty) {
            sh0Var.d(null, false, false);
            return;
        }
        org.telegram.messenger.zv zvVar = this.f47756f;
        String str = zvVar.f28385c;
        float f10 = 0.0f;
        hk0 hk0Var = this.f47757n;
        if (str != null) {
            if (zvVar.d != null) {
                i12 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                org.telegram.messenger.a6.q(i12).v(this);
                sh0Var.d(null, false, z10);
                this.f47755e = -1;
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
            org.telegram.messenger.a6.q(i11).a(this.f47756f.f28385c, null, this);
            this.f47755e = 1;
            Float w10 = org.telegram.messenger.fc.D().w(this.f47756f.f28385c);
            sh0Var.d(getResources().getDrawable(2131231005), true, z10);
            if (w10 != null) {
                f10 = w10.floatValue();
            }
            sh0Var.e(false, f10);
            invalidate();
        } else if (exists) {
            i10 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
            org.telegram.messenger.a6.q(i10).v(this);
            this.f47755e = -1;
            sh0Var.d(null, false, z10);
            invalidate();
        } else {
            i7 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
            org.telegram.messenger.a6.q(i7).a(r10, null, this);
            this.f47755e = 1;
            Float w11 = org.telegram.messenger.fc.D().w(r10);
            sh0Var.d(getResources().getDrawable(2131231005), true, z10);
            if (w11 != null) {
                f10 = w11.floatValue();
            }
            sh0Var.e(z10, f10);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.f47754c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void i(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f47755e != 1) {
            a(false);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f47752a.invalidate();
    }

    @Override
    public final void o(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (org.telegram.messenger.hd.f24444a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        org.telegram.ui.Components.q9 q9Var = this.f47754c;
        int measuredWidth = ((q9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f)) / 2) + q9Var.getLeft();
        int measuredHeight = ((q9Var.getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2) + q9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.o10.C(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.f47753b.setText(charSequence);
    }
}

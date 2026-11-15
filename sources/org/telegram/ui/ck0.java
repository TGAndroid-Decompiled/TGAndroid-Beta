package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ck0 extends FrameLayout implements org.telegram.messenger.x5 {
    public final TextView f46168a;
    public final TextView f46169b;
    public final org.telegram.ui.Components.i9 f46170c;
    public final org.telegram.ui.Components.gh0 d;
    public int f46171e;
    public org.telegram.messenger.cw f46172f;
    public final int h;
    public final ek0 f46173n;

    public ck0(ek0 ek0Var, Activity activity) {
        super(activity);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f46173n = ek0Var;
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
        this.h = org.telegram.messenger.z5.q(i7).k();
        this.d = new org.telegram.ui.Components.gh0(this);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(activity);
        this.f46170c = i9Var;
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(i9Var, c8.ja.d(48, 48.0f, i10 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f46168a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z10 = org.telegram.messenger.hd.f24104a0;
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
        addView(textView, c8.ja.d(-2, -2.0f, i17, f10, 10.0f, i14, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f46169b = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, null);
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.hd.f24104a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.hd.f24104a0;
        int i18 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i16 = 21;
        } else {
            i16 = 81;
        }
        addView(textView2, c8.ja.d(-2, -2.0f, i18, i16, 35.0f, z11 ? 81 : 21, 0.0f));
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
        String r10 = org.telegram.messenger.w7.r(null, this.f46172f);
        org.telegram.messenger.w7.G(org.telegram.messenger.m10.f24940t0);
        boolean exists = org.telegram.messenger.w7.I(this.f46172f).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        org.telegram.ui.Components.gh0 gh0Var = this.d;
        if (isEmpty) {
            gh0Var.d(null, false, false);
            return;
        }
        org.telegram.messenger.cw cwVar = this.f46172f;
        String str = cwVar.f22960c;
        float f10 = 0.0f;
        ek0 ek0Var = this.f46173n;
        if (str != null) {
            if (cwVar.d != null) {
                i12 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                org.telegram.messenger.z5.q(i12).v(this);
                gh0Var.d(null, false, z10);
                this.f46171e = -1;
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.z5.q(i11).a(this.f46172f.f22960c, null, this);
            this.f46171e = 1;
            Float w10 = org.telegram.messenger.fc.D().w(this.f46172f.f22960c);
            gh0Var.d(getResources().getDrawable(2131231005), true, z10);
            if (w10 != null) {
                f10 = w10.floatValue();
            }
            gh0Var.e(false, f10);
            invalidate();
        } else if (exists) {
            i10 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.z5.q(i10).v(this);
            this.f46171e = -1;
            gh0Var.d(null, false, z10);
            invalidate();
        } else {
            i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            this.f46171e = 1;
            Float w11 = org.telegram.messenger.fc.D().w(r10);
            gh0Var.d(getResources().getDrawable(2131231005), true, z10);
            if (w11 != null) {
                f10 = w11.floatValue();
            }
            gh0Var.e(z10, f10);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.f46170c) {
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
        if (this.f46171e != 1) {
            a(false);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46168a.invalidate();
    }

    @Override
    public final void o(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (org.telegram.messenger.hd.f24104a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        org.telegram.ui.Components.i9 i9Var = this.f46170c;
        int measuredWidth = ((i9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f)) / 2) + i9Var.getLeft();
        int measuredHeight = ((i9Var.getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2) + i9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.i20.B(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.f46169b.setText(charSequence);
    }
}

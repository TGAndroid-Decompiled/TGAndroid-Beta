package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class mz extends View {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public StaticLayout N;
    public CharSequence O;
    public t5 P;
    public StaticLayout Q;
    public t5 R;
    public StaticLayout S;
    public t5 T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator f37572a;
    public boolean f37573a0;
    public lz f37574b;
    public float f37575b0;
    public int f37576c;
    public int f37577c0;
    public int d;
    public int f37578d0;
    public int f37579e;
    public int f37580e0;
    public final RectF f37581f;
    public float f37582f0;
    public float f37583g0;
    public CharSequence h;
    public float f37584h0;
    public float f37585i0;
    public float f37586j0;
    public float f37587k0;
    public float f37588l0;
    public boolean m0;
    public boolean f37589n;
    public final oz f37590n0;
    public t5 f37591r;
    public StaticLayout f37592s;
    public int f37593w;
    public boolean f37594x;
    public float f37595y;

    public mz(oz ozVar, Context context) {
        super(context);
        this.f37590n0 = ozVar;
        this.f37581f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.f37594x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f37573a0 = false;
        this.f37572a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new gz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new di.ic(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f37574b.f37261a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        int i10;
        int i11;
        this.m0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f37574b.f37266g) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        this.f37591r = x5.update(i7, this, this.f37591r, this.f37592s);
        if (this.f37574b.f37266g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.P = x5.update(i10, this, this.P, this.Q);
        if (this.f37574b.f37266g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.R = x5.update(i11, this, this.R, this.S);
        if (!this.f37574b.f37266g) {
            i12 = 0;
        }
        this.T = x5.update(i12, this, this.T, this.U);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.f37594x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.f37573a0 = false;
        ValueAnimator valueAnimator = this.f37572a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f37572a.removeAllUpdateListeners();
            this.f37572a.cancel();
            this.f37572a = null;
        }
        invalidate();
        x5.release(this, this.f37591r);
        x5.release(this, this.P);
        x5.release(this, this.R);
        x5.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lz lzVar = this.f37574b;
        if (lzVar != null && (i10 = this.f37590n0.M) != -1 && lzVar.f37261a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.gd.N0(2131754815, null)));
        if (this.f37574b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f37574b.f37262b);
            lz lzVar2 = this.f37574b;
            if (lzVar2 != null) {
                i7 = lzVar2.d;
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.gd.G(i7, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.f37574b.a(false) + this.f37590n0.O, View.MeasureSpec.getSize(i10));
    }
}

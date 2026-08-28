package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tz extends View {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public StaticLayout G;
    public StaticLayout H;
    public StaticLayout I;
    public CharSequence J;
    public p5 K;
    public StaticLayout L;
    public p5 M;
    public StaticLayout N;
    public p5 O;
    public StaticLayout P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public ValueAnimator f32839a;
    public float f32840a0;
    public sz f32841b;
    public float f32842b0;
    public int f32843c;
    public float f32844c0;
    public int d;
    public float f32845d0;
    public int f32846e;
    public float f32847e0;
    public final RectF f32848f;
    public float f32849f0;
    public float f32850g0;
    public CharSequence h;
    public boolean f32851h0;
    public final vz f32852i0;
    public boolean f32853n;
    public p5 f32854r;
    public StaticLayout f32855s;
    public int v;
    public boolean f32856w;
    public float f32857x;
    public float f32858y;

    public tz(vz vzVar, Context context) {
        super(context);
        this.f32852i0 = vzVar;
        this.f32848f = new RectF();
        this.E = -1;
    }

    public final void a() {
        this.f32856w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        this.f32839a = null;
        invalidate();
    }

    public final void b(float f10, int i9) {
        if (i9 == 6) {
            this.f32858y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f10));
        ofFloat.addUpdateListener(new nz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new gh.fb(this, i9, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f32841b.f32572a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i9;
        int i10;
        int i11;
        this.f32851h0 = true;
        super.onAttachedToWindow();
        int i12 = 26;
        if (this.f32841b.f32577g) {
            i9 = 26;
        } else {
            i9 = 0;
        }
        this.f32854r = t5.update(i9, this, this.f32854r, this.f32855s);
        if (this.f32841b.f32577g) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        this.K = t5.update(i10, this, this.K, this.L);
        if (this.f32841b.f32577g) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        this.M = t5.update(i11, this, this.M, this.N);
        if (!this.f32841b.f32577g) {
            i12 = 0;
        }
        this.O = t5.update(i12, this, this.O, this.P);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f32851h0 = false;
        super.onDetachedFromWindow();
        this.f32856w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        ValueAnimator valueAnimator = this.f32839a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32839a.removeAllUpdateListeners();
            this.f32839a.cancel();
            this.f32839a = null;
        }
        invalidate();
        t5.release(this, this.f32854r);
        t5.release(this, this.K);
        t5.release(this, this.M);
        t5.release(this, this.O);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i9;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        sz szVar = this.f32841b;
        if (szVar != null && (i10 = this.f32852i0.H) != -1 && szVar.f32572a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f32841b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32841b.f32573b);
            sz szVar2 = this.f32841b;
            if (szVar2 != null) {
                i9 = szVar2.d;
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                sb2.append("\n");
                sb2.append(LocaleController.formatPluralString("AccDescrUnreadCount", i9, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f32841b.a(false) + this.f32852i0.J, View.MeasureSpec.getSize(i10));
    }
}

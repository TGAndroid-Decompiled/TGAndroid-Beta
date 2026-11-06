package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class mx extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f47869a;
    public final FrameLayout[] f47870b;
    public final org.telegram.ui.Components.l9[] f47871c;
    public final FrameLayout[] d;
    public final FrameLayout[] f47872e;
    public final float[] f47873f;
    public final int[] h;
    public org.telegram.messenger.c20 f47874n;
    public org.telegram.ui.Components.r31 f47875r;
    public int f47876s;
    public ValueAnimator f47877w;
    public int f47878x;
    public static final int[] f47868y = {2131624297, 2131624295, 2131624296};
    public static final int[] D = {2131743986, 2131743987, 2131743983};

    public mx(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = 3;
        this.f47870b = new FrameLayout[3];
        this.f47871c = new org.telegram.ui.Components.l9[3];
        this.d = new FrameLayout[3];
        this.f47872e = new FrameLayout[3];
        this.f47873f = new float[3];
        this.h = new int[3];
        int i10 = -1;
        this.f47876s = -1;
        this.f47869a = f6Var;
        ?? r52 = 0;
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        setClipChildren(false);
        int i11 = 0;
        while (i11 < i7) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r52);
            c8.ka.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new ai.v(this, i11, 23));
            addView(frameLayout, c8.ha.p(r52, i10, 1.0f, 119));
            this.f47870b[i11] = frameLayout;
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setImageDrawable(new org.telegram.ui.Components.zg0(f47868y[i11], org.telegram.messenger.g0.L(160.0f), org.telegram.messenger.g0.L(160.0f)));
            frameLayout.addView(l9Var, c8.ha.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.f47871c[i11] = l9Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b10 = c8.na.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28258z6, true, null);
            int[] iArr = D;
            b10.setText(org.telegram.messenger.hd.M0(iArr[i11], null));
            b10.setSingleLine();
            b10.setPadding(org.telegram.messenger.g0.L(10.0f), r52, org.telegram.messenger.g0.L(10.0f), r52);
            frameLayout2.addView(b10, c8.ha.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(10.0f), r52, org.telegram.messenger.g0.L(10.0f), r52);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, d02, N, null, f6Var);
            frameLayout2.addView(frameLayout3, c8.ha.e(-2, 26, 17));
            TextView b11 = c8.na.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f27903g6, true, null);
            b11.setText(org.telegram.messenger.hd.M0(iArr[i11], null));
            b11.setSingleLine();
            frameLayout3.addView(b11, c8.ha.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, c8.ha.e(-2, 26, 49));
            this.d[i11] = frameLayout2;
            this.f47872e[i11] = frameLayout3;
            i11++;
            i7 = 3;
            i10 = -1;
            r52 = 0;
        }
        boolean z9 = r52;
        b(z9 ? 1 : 0, z9);
    }

    public final void a() {
        for (int i7 = 0; i7 < 3; i7++) {
            int i10 = org.telegram.ui.ActionBar.k6.C6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f47869a;
            int f10 = i0.a.f(this.f47873f[i7], org.telegram.ui.ActionBar.k6.w0(i10, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var));
            int[] iArr = this.h;
            if (f10 != iArr[i7]) {
                iArr[i7] = f10;
                org.telegram.ui.Components.l9[] l9VarArr = this.f47871c;
                l9VarArr[i7].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                l9VarArr[i7].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C6));
    }

    public final void b(int i7, boolean z9) {
        float f10;
        if (this.f47876s != i7) {
            this.f47876s = i7;
            ValueAnimator valueAnimator = this.f47877w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f47877w = null;
            }
            int i10 = 0;
            while (true) {
                float f11 = 1.0f;
                if (i10 >= 3) {
                    break;
                }
                if (i10 != i7) {
                    f11 = 0.0f;
                }
                FrameLayout[] frameLayoutArr = this.f47872e;
                if (z9) {
                    org.telegram.messenger.camera.q.l(frameLayoutArr[i10].animate().scaleX(f11).scaleY(f11).alpha(f11), org.telegram.ui.Components.xq.h, 320L);
                } else {
                    frameLayoutArr[i10].animate().cancel();
                    frameLayoutArr[i10].setScaleX(f11);
                    frameLayoutArr[i10].setScaleY(f11);
                    frameLayoutArr[i10].setAlpha(f11);
                }
                i10++;
            }
            float[] fArr = this.f47873f;
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f47877w = ofFloat;
                ofFloat.addUpdateListener(new fi.e4(this, (float[]) fArr.clone(), i7, 2));
                this.f47877w.addListener(new va(this, 28));
                this.f47877w.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f47877w.setDuration(320L);
                this.f47877w.start();
            } else {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == i7) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr[i11] = f10;
                }
                a();
            }
            org.telegram.ui.Components.zg0 B = this.f47871c[i7].getImageReceiver().B();
            if (B != null) {
                if (B.t() > 0.8f) {
                    B.T(false, 0.0f);
                }
                B.H(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), Math.min(org.telegram.messenger.g0.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - org.telegram.messenger.g0.L(8.0f)) / 0.61f)));
        if (max != this.f47878x) {
            this.f47878x = max;
            for (int i11 = 0; i11 < 3; i11++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f47871c[i11].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i11].getLayoutParams()).topMargin = org.telegram.messenger.g0.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(66.0f) + max, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.f47877w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

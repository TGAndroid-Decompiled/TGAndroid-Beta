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
public final class oy extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f40286a;
    public final FrameLayout[] f40287b;
    public final org.telegram.ui.Components.g9[] f40288c;
    public final FrameLayout[] d;
    public final FrameLayout[] e;
    public final float[] f40289f;
    public final int[] h;
    public org.telegram.messenger.r20 f40290n;
    public org.telegram.ui.Components.b51 f40291r;
    public int f40292s;
    public ValueAnimator f40293w;
    public int f40294x;
    public static final int[] f40285y = {2131624295, 2131624293, 2131624294};
    public static final int[] D = {2131744010, 2131744011, 2131744007};

    public oy(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = 3;
        this.f40287b = new FrameLayout[3];
        this.f40288c = new org.telegram.ui.Components.g9[3];
        this.d = new FrameLayout[3];
        this.e = new FrameLayout[3];
        this.f40289f = new float[3];
        this.h = new int[3];
        int i11 = -1;
        this.f40292s = -1;
        this.f40286a = p6Var;
        ?? r52 = 0;
        setOrientation(0);
        setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        setClipChildren(false);
        int i12 = 0;
        while (i12 < i10) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r52);
            w7.e6.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new bh.f(this, i12, 18));
            addView(frameLayout, w7.b6.p(r52, i11, 1.0f, 119));
            this.f40287b[i12] = frameLayout;
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9Var.setImageDrawable(new org.telegram.ui.Components.ci0(f40285y[i12], org.telegram.messenger.i0.L(160.0f), org.telegram.messenger.i0.L(160.0f)));
            frameLayout.addView(g9Var, w7.b6.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.f40288c[i12] = g9Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b10 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.f21331z6, true, null);
            int[] iArr = D;
            b10.setText(org.telegram.messenger.dd.L0(iArr[i12], null));
            b10.setSingleLine();
            b10.setPadding(org.telegram.messenger.i0.L(10.0f), r52, org.telegram.messenger.i0.L(10.0f), r52);
            frameLayout2.addView(b10, w7.b6.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(org.telegram.messenger.i0.L(10.0f), r52, org.telegram.messenger.i0.L(10.0f), r52);
            int L = org.telegram.messenger.i0.L(13.0f);
            int i13 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(frameLayout3, d02, N, null, p6Var);
            frameLayout2.addView(frameLayout3, w7.b6.e(-2, 26, 17));
            TextView b11 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.f20986g6, true, null);
            b11.setText(org.telegram.messenger.dd.L0(iArr[i12], null));
            b11.setSingleLine();
            frameLayout3.addView(b11, w7.b6.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, w7.b6.e(-2, 26, 49));
            this.d[i12] = frameLayout2;
            this.e[i12] = frameLayout3;
            i12++;
            i10 = 3;
            i11 = -1;
            r52 = 0;
        }
        boolean z10 = r52;
        b(z10 ? 1 : 0, z10);
    }

    public final void a() {
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = org.telegram.ui.ActionBar.t6.C6;
            org.telegram.ui.ActionBar.p6 p6Var = this.f40286a;
            int f7 = i0.b.f(this.f40289f[i10], org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
            int[] iArr = this.h;
            if (f7 != iArr[i10]) {
                iArr[i10] = f7;
                org.telegram.ui.Components.g9[] g9VarArr = this.f40288c;
                g9VarArr[i10].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                g9VarArr[i10].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.C6));
    }

    public final void b(int i10, boolean z10) {
        float f7;
        if (this.f40292s != i10) {
            this.f40292s = i10;
            ValueAnimator valueAnimator = this.f40293w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f40293w = null;
            }
            int i11 = 0;
            while (true) {
                float f10 = 1.0f;
                if (i11 >= 3) {
                    break;
                }
                if (i11 != i10) {
                    f10 = 0.0f;
                }
                FrameLayout[] frameLayoutArr = this.e;
                if (z10) {
                    org.telegram.messenger.a30.m(frameLayoutArr[i11].animate().scaleX(f10).scaleY(f10).alpha(f10), org.telegram.ui.Components.gr.h, 320L);
                } else {
                    frameLayoutArr[i11].animate().cancel();
                    frameLayoutArr[i11].setScaleX(f10);
                    frameLayoutArr[i11].setScaleY(f10);
                    frameLayoutArr[i11].setAlpha(f10);
                }
                i11++;
            }
            float[] fArr = this.f40289f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40293w = ofFloat;
                ofFloat.addUpdateListener(new jg.p(this, (float[]) fArr.clone(), i10, 2));
                this.f40293w.addListener(new org.telegram.ui.Components.voip.i2(this, 9));
                this.f40293w.setInterpolator(org.telegram.ui.Components.gr.h);
                this.f40293w.setDuration(320L);
                this.f40293w.start();
            } else {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == i10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    fArr[i12] = f7;
                }
                a();
            }
            org.telegram.ui.Components.ci0 B = this.f40288c[i10].getImageReceiver().B();
            if (B != null) {
                if (B.t() > 0.8f) {
                    B.T(false, 0.0f);
                }
                B.H(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int max = Math.max(org.telegram.messenger.i0.L(48.0f), Math.min(org.telegram.messenger.i0.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - org.telegram.messenger.i0.L(8.0f)) / 0.61f)));
        if (max != this.f40294x) {
            this.f40294x = max;
            for (int i12 = 0; i12 < 3; i12++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40288c[i12].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i12].getLayoutParams()).topMargin = org.telegram.messenger.i0.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(66.0f) + max, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.f40293w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}

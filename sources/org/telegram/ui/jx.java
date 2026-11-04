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
public final class jx extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f46699a;
    public final FrameLayout[] f46700b;
    public final org.telegram.ui.Components.k9[] f46701c;
    public final FrameLayout[] d;
    public final FrameLayout[] f46702e;
    public final float[] f46703f;
    public final int[] h;
    public org.telegram.messenger.u10 f46704n;
    public org.telegram.ui.Components.r31 f46705r;
    public int f46706s;
    public ValueAnimator f46707w;
    public int f46708x;
    public static final int[] f46698y = {2131624297, 2131624295, 2131624296};
    public static final int[] E = {2131743995, 2131743996, 2131743992};

    public jx(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = 3;
        this.f46700b = new FrameLayout[3];
        this.f46701c = new org.telegram.ui.Components.k9[3];
        this.d = new FrameLayout[3];
        this.f46702e = new FrameLayout[3];
        this.f46703f = new float[3];
        this.h = new int[3];
        int i10 = -1;
        this.f46706s = -1;
        this.f46699a = e6Var;
        ?? r5 = 0;
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        setClipChildren(false);
        int i11 = 0;
        while (i11 < i3) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r5);
            b8.pf.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new bi.q(this, i11, 23));
            addView(frameLayout, b8.mf.p(r5, i10, 1.0f, 119));
            this.f46700b[i11] = frameLayout;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setImageDrawable(new org.telegram.ui.Components.ch0(f46698y[i11], org.telegram.messenger.g0.L(160.0f), org.telegram.messenger.g0.L(160.0f)));
            frameLayout.addView(k9Var, b8.mf.d(160, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.f46701c[i11] = k9Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b10 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28290z6, true, null);
            int[] iArr = E;
            b10.setText(org.telegram.messenger.bd.M0(iArr[i11], null));
            b10.setSingleLine();
            b10.setPadding(org.telegram.messenger.g0.L(10.0f), r5, org.telegram.messenger.g0.L(10.0f), r5);
            frameLayout2.addView(b10, b8.mf.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(10.0f), r5, org.telegram.messenger.g0.L(10.0f), r5);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, d02, N, null, e6Var);
            frameLayout2.addView(frameLayout3, b8.mf.e(-2, 26, 17));
            TextView b11 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f27937g6, true, null);
            b11.setText(org.telegram.messenger.bd.M0(iArr[i11], null));
            b11.setSingleLine();
            frameLayout3.addView(b11, b8.mf.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, b8.mf.e(-2, 26, 49));
            this.d[i11] = frameLayout2;
            this.f46702e[i11] = frameLayout3;
            i11++;
            i3 = 3;
            i10 = -1;
            r5 = 0;
        }
        boolean z10 = r5;
        b(z10 ? 1 : 0, z10);
    }

    public final void a() {
        for (int i3 = 0; i3 < 3; i3++) {
            int i10 = org.telegram.ui.ActionBar.k6.C6;
            org.telegram.ui.ActionBar.e6 e6Var = this.f46699a;
            int f10 = i0.a.f(this.f46703f[i3], org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
            int[] iArr = this.h;
            if (f10 != iArr[i3]) {
                iArr[i3] = f10;
                org.telegram.ui.Components.k9[] k9VarArr = this.f46701c;
                k9VarArr[i3].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                k9VarArr[i3].invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C6));
    }

    public final void b(int i3, boolean z10) {
        float f10;
        if (this.f46706s != i3) {
            this.f46706s = i3;
            ValueAnimator valueAnimator = this.f46707w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f46707w = null;
            }
            int i10 = 0;
            while (true) {
                float f11 = 1.0f;
                if (i10 >= 3) {
                    break;
                }
                if (i10 != i3) {
                    f11 = 0.0f;
                }
                FrameLayout[] frameLayoutArr = this.f46702e;
                if (z10) {
                    org.telegram.messenger.camera.q.l(frameLayoutArr[i10].animate().scaleX(f11).scaleY(f11).alpha(f11), org.telegram.ui.Components.xq.h, 320L);
                } else {
                    frameLayoutArr[i10].animate().cancel();
                    frameLayoutArr[i10].setScaleX(f11);
                    frameLayoutArr[i10].setScaleY(f11);
                    frameLayoutArr[i10].setAlpha(f11);
                }
                i10++;
            }
            float[] fArr = this.f46703f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f46707w = ofFloat;
                ofFloat.addUpdateListener(new gi.b4(this, (float[]) fArr.clone(), i3, 2));
                this.f46707w.addListener(new org.telegram.ui.Cells.w9(this, 28));
                this.f46707w.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f46707w.setDuration(320L);
                this.f46707w.start();
            } else {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == i3) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr[i11] = f10;
                }
                a();
            }
            org.telegram.ui.Components.ch0 B = this.f46701c[i3].getImageReceiver().B();
            if (B != null) {
                if (B.t() > 0.8f) {
                    B.T(false, 0.0f);
                }
                B.H(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), Math.min(org.telegram.messenger.g0.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - org.telegram.messenger.g0.L(8.0f)) / 0.61f)));
        if (max != this.f46708x) {
            this.f46708x = max;
            for (int i11 = 0; i11 < 3; i11++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f46701c[i11].getLayoutParams();
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
            ValueAnimator valueAnimator = this.f46707w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

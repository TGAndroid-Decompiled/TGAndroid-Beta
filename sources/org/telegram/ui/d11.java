package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d11 extends View {
    public boolean D;
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public c11 J;
    public org.telegram.messenger.e6 K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public final r30 U;
    public final t11 V;
    public boolean f44871a;
    public boolean f44872b;
    public int f44873c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.q5 f44874e;
    public final org.telegram.messenger.ic[] f44875f;
    public ImageReceiver h;
    public final ImageReceiver f44876n;
    public ImageReceiver f44877r;
    public boolean f44878s;
    public TL_stars.TL_starGiftUnique f44879w;
    public Integer f44880x;
    public ch.o0 f44881y;

    public d11(t11 t11Var, Context context) {
        super(context);
        this.V = t11Var;
        this.f44871a = false;
        this.f44872b = false;
        this.f44875f = new org.telegram.messenger.ic[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f44876n = imageReceiver;
        this.T = 1.0f;
        this.U = new r30(this, 1);
        imageReceiver.f21237y = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.E0(7);
            if (this.H) {
                this.h.P();
            }
            this.h.R0 = true;
        }
    }

    public final void b() {
        Paint paint;
        c11 c11Var = this.J;
        if (c11Var == null) {
            Context context = getContext();
            int i7 = ug.z0.L;
            this.J = new c11(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824);
            this.J.measure(makeMeasureSpec, makeMeasureSpec);
            c11 c11Var2 = this.J;
            c11Var2.layout(0, 0, c11Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
            return;
        }
        c11Var.h = false;
        c11Var.f56895n = -1;
        if (c11Var.f56890a == 2 && (paint = c11Var.f56900y) != null) {
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false));
        }
    }

    public final void c(TLRPC.Document document, w01 w01Var) {
        String str;
        this.d = document;
        a(w01Var);
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, null);
        if (this.V.W == 6) {
            ImageReceiver imageReceiver = this.h;
            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
            if (!org.telegram.messenger.sc.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.r0(b10, str, null, null, f10, document.size, null, document, 0);
        } else {
            this.h.r0(org.telegram.messenger.hc.b(document), "100_100_firstframe", null, null, f10, 0L, "tgs", document, 0);
        }
        this.Q = true;
        this.f44874e = null;
    }

    public final void d(boolean z9, boolean z10) {
        float f10;
        if (this.L != z9) {
            this.L = z9;
            if (!z10) {
                float f11 = 0.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.R = f10;
                if (z9) {
                    f11 = 1.0f;
                }
                this.S = f11;
            }
        }
    }

    public final void e(boolean z9, boolean z10) {
        if (!this.L && z9 && z10 && this.V.W != 14) {
            this.M = true;
            this.S = 1.0f;
            this.R = 1.0f;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.6f, 0.7f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new a11(this, 2));
            this.I.addListener(new b11(this, 2));
            this.I.setInterpolator(new LinearInterpolator());
            this.I.setDuration(200L);
            this.I.start();
            return;
        }
        this.M = false;
        d(z9, z10);
    }

    public final void f() {
        if (this.L && this.V.W != 14) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            this.N = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new a11(this, 1));
            this.I.addListener(new b11(this, 1));
            org.telegram.messenger.camera.q.i(5.0f, this.I);
            this.I.setDuration(350L);
            this.I.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.T;
    }

    @Override
    public final void invalidate() {
        if (ch.e0.f6235b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H) {
            return;
        }
        this.H = true;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.h5) {
            ((org.telegram.ui.Components.h5) drawable).b(this.U);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.H0((View) getParent());
            this.h.P();
        }
        this.f44876n.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.H) {
            return;
        }
        this.H = false;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.h5) {
            ((org.telegram.ui.Components.h5) drawable).o(this.U);
            di.z2 z2Var = ((org.telegram.ui.Components.h5) this.E).f34176k;
            if (z2Var != null) {
                z2Var.g0(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
            this.h.g0(false);
        }
        this.f44876n.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        org.telegram.ui.Components.q5 q5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.f44871a) {
            str2 = org.telegram.messenger.id.M0(2131746288, null);
        } else {
            ch.o0 o0Var = this.f44881y;
            if (o0Var != null && (str = o0Var.f6359f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (q5Var = this.f44874e) != null && (document = q5Var.document) == null) {
                    document = org.telegram.ui.Components.h5.e(this.V.V, q5Var.getDocumentId());
                }
                if (document != null) {
                    str2 = org.telegram.messenger.ij.V(document, null, null);
                }
            }
        }
        if (str2 != null) {
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setSelected(this.L);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824));
    }

    public void setAnimatedScale(float f10) {
        this.T = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            boolean z9 = this.H;
            r30 r30Var = this.U;
            if (z9 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.h5)) {
                ((org.telegram.ui.Components.h5) drawable2).o(r30Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.h5)) {
                ((org.telegram.ui.Components.h5) drawable).b(r30Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.K = null;
        } else {
            this.K = org.telegram.messenger.i6.g(str);
        }
    }

    @Override
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (!z9) {
                float f10 = this.N;
                if (f10 != 0.0f && this.V.W != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.I = ofFloat;
                    ofFloat.addUpdateListener(new a11(this, 0));
                    this.I.addListener(new b11(this, 0));
                    org.telegram.messenger.camera.q.i(5.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.f6235b) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}

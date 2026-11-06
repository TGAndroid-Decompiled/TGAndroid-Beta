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
public final class a11 extends View {
    public boolean D;
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public z01 J;
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
    public final o30 U;
    public final q11 V;
    public boolean f43530a;
    public boolean f43531b;
    public int f43532c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.r5 f43533e;
    public final org.telegram.messenger.ic[] f43534f;
    public ImageReceiver h;
    public final ImageReceiver f43535n;
    public ImageReceiver f43536r;
    public boolean f43537s;
    public TL_stars.TL_starGiftUnique f43538w;
    public Integer f43539x;
    public ch.o0 f43540y;

    public a11(q11 q11Var, Context context) {
        super(context);
        this.V = q11Var;
        this.f43530a = false;
        this.f43531b = false;
        this.f43534f = new org.telegram.messenger.ic[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f43535n = imageReceiver;
        this.T = 1.0f;
        this.U = new o30(this, 1);
        imageReceiver.f21229y = true;
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
        z01 z01Var = this.J;
        if (z01Var == null) {
            Context context = getContext();
            int i7 = ug.z0.L;
            this.J = new z01(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824);
            this.J.measure(makeMeasureSpec, makeMeasureSpec);
            z01 z01Var2 = this.J;
            z01Var2.layout(0, 0, z01Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
            return;
        }
        z01Var.h = false;
        z01Var.f56795n = -1;
        if (z01Var.f56790a == 2 && (paint = z01Var.f56800y) != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27792a7, false));
        }
    }

    public final void c(TLRPC.Document document, t01 t01Var) {
        String str;
        this.d = document;
        a(t01Var);
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f28013m6, 0.2f, null);
        if (this.V.W == 6) {
            ImageReceiver imageReceiver = this.h;
            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
            if (!org.telegram.messenger.rc.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.r0(b10, str, null, null, f10, document.size, null, document, 0);
        } else {
            this.h.r0(org.telegram.messenger.hc.b(document), "100_100_firstframe", null, null, f10, 0L, "tgs", document, 0);
        }
        this.Q = true;
        this.f43533e = null;
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
            ofFloat.addUpdateListener(new x01(this, 2));
            this.I.addListener(new y01(this, 2));
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
            ofFloat.addUpdateListener(new x01(this, 1));
            this.I.addListener(new y01(this, 1));
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
        if (ch.e0.f6232b || getParent() == null) {
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
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).b(this.U);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.H0((View) getParent());
            this.h.P();
        }
        this.f43535n.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.H) {
            return;
        }
        this.H = false;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).o(this.U);
            di.z2 z2Var = ((org.telegram.ui.Components.i5) this.E).f34450k;
            if (z2Var != null) {
                z2Var.g0(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
            this.h.g0(false);
        }
        this.f43535n.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        org.telegram.ui.Components.r5 r5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.f43530a) {
            str2 = org.telegram.messenger.hd.M0(2131746287, null);
        } else {
            ch.o0 o0Var = this.f43540y;
            if (o0Var != null && (str = o0Var.f6356f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (r5Var = this.f43533e) != null && (document = r5Var.document) == null) {
                    document = org.telegram.ui.Components.i5.e(this.V.V, r5Var.getDocumentId());
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
            o30 o30Var = this.U;
            if (z9 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.i5)) {
                ((org.telegram.ui.Components.i5) drawable2).o(o30Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.i5)) {
                ((org.telegram.ui.Components.i5) drawable).b(o30Var);
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
                    ofFloat.addUpdateListener(new x01(this, 0));
                    this.I.addListener(new y01(this, 0));
                    org.telegram.messenger.camera.q.i(5.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.f6232b) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}

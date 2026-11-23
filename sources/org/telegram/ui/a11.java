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
    public boolean E;
    public Drawable F;
    public Rect G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public z01 K;
    public org.telegram.messenger.f6 L;
    public boolean M;
    public boolean N;
    public float O;
    public float P;
    public int Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public final q30 V;
    public final q11 W;
    public boolean f45546a;
    public boolean f45547b;
    public int f45548c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.x5 f45549e;
    public final org.telegram.messenger.gc[] f45550f;
    public ImageReceiver h;
    public final ImageReceiver f45551n;
    public ImageReceiver f45552r;
    public boolean f45553s;
    public TL_stars.TL_starGiftUnique f45554w;
    public Integer f45555x;
    public ch.p0 f45556y;

    public a11(q11 q11Var, Context context) {
        super(context);
        this.W = q11Var;
        this.f45546a = false;
        this.f45547b = false;
        this.f45550f = new org.telegram.messenger.gc[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f45551n = imageReceiver;
        this.U = 1.0f;
        this.V = new q30(this, 1);
        imageReceiver.f22772y = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.F0(7);
            if (this.I) {
                this.h.Q();
            }
            this.h.S0 = true;
        }
    }

    public final void b() {
        Paint paint;
        z01 z01Var = this.K;
        if (z01Var == null) {
            Context context = getContext();
            int i7 = ug.b1.M;
            this.K = new z01(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824);
            this.K.measure(makeMeasureSpec, makeMeasureSpec);
            z01 z01Var2 = this.K;
            z01Var2.layout(0, 0, z01Var2.getMeasuredWidth(), this.K.getMeasuredHeight());
            return;
        }
        z01Var.h = false;
        z01Var.f58745n = -1;
        if (z01Var.f58740a == 2 && (paint = z01Var.f58750y) != null) {
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false));
        }
    }

    public final void c(TLRPC.Document document, t01 t01Var) {
        String str;
        this.d = document;
        a(t01Var);
        org.telegram.messenger.kz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29616m6, 0.2f, null);
        if (this.W.f51226a0 == 6) {
            ImageReceiver imageReceiver = this.h;
            org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document);
            if (!org.telegram.messenger.pc.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.s0(b10, str, null, null, f10, document.size, null, document, 0);
        } else {
            this.h.s0(org.telegram.messenger.fc.b(document), "100_100_firstframe", null, null, f10, 0L, "tgs", document, 0);
        }
        this.R = true;
        this.f45549e = null;
    }

    public final void d(boolean z10, boolean z11) {
        float f10;
        if (this.M != z10) {
            this.M = z10;
            if (!z11) {
                float f11 = 0.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.S = f10;
                if (z10) {
                    f11 = 1.0f;
                }
                this.T = f11;
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (!this.M && z10 && z11 && this.W.f51226a0 != 14) {
            this.N = true;
            this.T = 1.0f;
            this.S = 1.0f;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O, 1.6f, 0.7f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new x01(this, 2));
            this.J.addListener(new y01(this, 2));
            this.J.setInterpolator(new LinearInterpolator());
            this.J.setDuration(200L);
            this.J.start();
            return;
        }
        this.N = false;
        d(z10, z11);
    }

    public final void f() {
        if (this.M && this.W.f51226a0 != 14) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            this.O = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new x01(this, 1));
            this.J.addListener(new y01(this, 1));
            org.telegram.ui.Cells.c0.q(5.0f, this.J);
            this.J.setDuration(350L);
            this.J.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.U;
    }

    @Override
    public final void invalidate() {
        if (ch.f0.f5346b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I) {
            return;
        }
        this.I = true;
        Drawable drawable = this.F;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).b(this.V);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.I0((View) getParent());
            this.h.Q();
        }
        this.f45551n.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.I) {
            return;
        }
        this.I = false;
        Drawable drawable = this.F;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).o(this.V);
            fi.s2 s2Var = ((org.telegram.ui.Components.o5) this.F).f38028k;
            if (s2Var != null) {
                s2Var.h0(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.S();
            this.h.h0(false);
        }
        this.f45551n.S();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        org.telegram.ui.Components.x5 x5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.f45546a) {
            str2 = org.telegram.messenger.gd.N0(2131746092, null);
        } else {
            ch.p0 p0Var = this.f45556y;
            if (p0Var != null && (str = p0Var.f5470f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (x5Var = this.f45549e) != null && (document = x5Var.document) == null) {
                    document = org.telegram.ui.Components.o5.e(this.W.W, x5Var.getDocumentId());
                }
                if (document != null) {
                    str2 = org.telegram.messenger.fj.V(document, null, null);
                }
            }
        }
        if (str2 != null) {
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setSelected(this.M);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824));
    }

    public void setAnimatedScale(float f10) {
        this.U = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            boolean z10 = this.I;
            q30 q30Var = this.V;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.o5)) {
                ((org.telegram.ui.Components.o5) drawable2).o(q30Var);
            }
            this.F = drawable;
            if (this.I && (drawable instanceof org.telegram.ui.Components.o5)) {
                ((org.telegram.ui.Components.o5) drawable).b(q30Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.L = null;
        } else {
            this.L = org.telegram.messenger.j6.g(str);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.J) != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            if (!z10) {
                float f10 = this.O;
                if (f10 != 0.0f && this.W.f51226a0 != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.J = ofFloat;
                    ofFloat.addUpdateListener(new x01(this, 0));
                    this.J.addListener(new y01(this, 0));
                    org.telegram.ui.Cells.c0.q(5.0f, this.J);
                    this.J.setDuration(350L);
                    this.J.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.f5346b) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}

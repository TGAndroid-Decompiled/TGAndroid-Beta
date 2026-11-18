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
public final class b11 extends View {
    public boolean E;
    public Drawable F;
    public Rect G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public a11 K;
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
    public final r30 V;
    public final r11 W;
    public boolean f45721a;
    public boolean f45722b;
    public int f45723c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.x5 f45724e;
    public final org.telegram.messenger.gc[] f45725f;
    public ImageReceiver h;
    public final ImageReceiver f45726n;
    public ImageReceiver f45727r;
    public boolean f45728s;
    public TL_stars.TL_starGiftUnique f45729w;
    public Integer f45730x;
    public ch.p0 f45731y;

    public b11(r11 r11Var, Context context) {
        super(context);
        this.W = r11Var;
        this.f45721a = false;
        this.f45722b = false;
        this.f45725f = new org.telegram.messenger.gc[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f45726n = imageReceiver;
        this.U = 1.0f;
        this.V = new r30(this, 1);
        imageReceiver.f22677y = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.E0(7);
            if (this.I) {
                this.h.P();
            }
            this.h.S0 = true;
        }
    }

    public final void b() {
        Paint paint;
        a11 a11Var = this.K;
        if (a11Var == null) {
            Context context = getContext();
            int i7 = ug.c1.M;
            this.K = new a11(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824);
            this.K.measure(makeMeasureSpec, makeMeasureSpec);
            a11 a11Var2 = this.K;
            a11Var2.layout(0, 0, a11Var2.getMeasuredWidth(), this.K.getMeasuredHeight());
            return;
        }
        a11Var.h = false;
        a11Var.f58630n = -1;
        if (a11Var.f58625a == 2 && (paint = a11Var.f58635y) != null) {
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29339a7, false));
        }
    }

    public final void c(TLRPC.Document document, u01 u01Var) {
        String str;
        this.d = document;
        a(u01Var);
        org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29561m6, 0.2f, null);
        if (this.W.f51417a0 == 6) {
            ImageReceiver imageReceiver = this.h;
            org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document);
            if (!org.telegram.messenger.pc.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.r0(b10, str, null, null, f10, document.size, null, document, 0);
        } else {
            this.h.r0(org.telegram.messenger.fc.b(document), "100_100_firstframe", null, null, f10, 0L, "tgs", document, 0);
        }
        this.R = true;
        this.f45724e = null;
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
        if (!this.M && z10 && z11 && this.W.f51417a0 != 14) {
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
            ofFloat.addUpdateListener(new y01(this, 2));
            this.J.addListener(new z01(this, 2));
            this.J.setInterpolator(new LinearInterpolator());
            this.J.setDuration(200L);
            this.J.start();
            return;
        }
        this.N = false;
        d(z10, z11);
    }

    public final void f() {
        if (this.M && this.W.f51417a0 != 14) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            this.O = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new y01(this, 1));
            this.J.addListener(new z01(this, 1));
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
        if (ch.f0.f5354b || getParent() == null) {
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
            imageReceiver.H0((View) getParent());
            this.h.P();
        }
        this.f45726n.P();
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
            fi.s2 s2Var = ((org.telegram.ui.Components.o5) this.F).f37976k;
            if (s2Var != null) {
                s2Var.g0(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
            this.h.g0(false);
        }
        this.f45726n.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        org.telegram.ui.Components.x5 x5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.f45721a) {
            str2 = org.telegram.messenger.gd.M0(2131746093, null);
        } else {
            ch.p0 p0Var = this.f45731y;
            if (p0Var != null && (str = p0Var.f5478f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (x5Var = this.f45724e) != null && (document = x5Var.document) == null) {
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
            r30 r30Var = this.V;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.o5)) {
                ((org.telegram.ui.Components.o5) drawable2).o(r30Var);
            }
            this.F = drawable;
            if (this.I && (drawable instanceof org.telegram.ui.Components.o5)) {
                ((org.telegram.ui.Components.o5) drawable).b(r30Var);
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
                if (f10 != 0.0f && this.W.f51417a0 != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.J = ofFloat;
                    ofFloat.addUpdateListener(new y01(this, 0));
                    this.J.addListener(new z01(this, 0));
                    org.telegram.ui.Cells.c0.q(5.0f, this.J);
                    this.J.setDuration(350L);
                    this.J.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.f5354b) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public class bg0 extends Dialog implements org.telegram.messenger.is {
    public boolean A0;
    public org.telegram.ui.Cells.q1 B0;
    public org.telegram.ui.Components.oy0 C0;
    public Paint D0;
    public float E;
    public final pf0 F;
    public final wf0 G;
    public final pf0 H;
    public long I;
    public org.telegram.ui.Components.e5 J;
    public final xf0 K;
    public final hi.w L;
    public final org.telegram.ui.Components.w90 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.q1 Q;
    public int R;
    public org.telegram.ui.Components.xe S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.kd V;
    public org.telegram.ui.Components.jg W;
    public rf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f45706a;
    public final qf0 f45707a0;
    public final org.telegram.ui.ActionBar.e6 f45708b;
    public boolean f45709b0;
    public final int f45710c;
    public float f45711c0;
    public i0.c d;
    public FrameLayout f45712d0;
    public Bitmap f45713e;
    public sf0 f45714e0;
    public BitmapShader f45715f;
    public boolean f45716f0;
    public boolean f45717g0;
    public Paint h;
    public boolean f45718h0;
    public final xh.e f45719i0;
    public final ui.b f45720j0;
    public final dh.c f45721k0;
    public RectF f45722l0;
    public ab.q m0;
    public Matrix f45723n;
    public androidx.activity.n f45724n0;
    public final int[] f45725o0;
    public boolean f45726p0;
    public boolean f45727q0;
    public boolean f45728r;
    public final int[] f45729r0;
    public boolean f45730s;
    public final float[] f45731s0;
    public boolean f45732t0;
    public boolean f45733u0;
    public org.telegram.ui.Cells.q1 f45734v0;
    public boolean f45735w;
    public float f45736w0;
    public boolean f45737x;
    public float f45738x0;
    public boolean f45739y;
    public final Rect f45740y0;
    public ValueAnimator f45741z0;

    public bg0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 2131755352);
        int i7 = org.telegram.messenger.m10.f24940t0;
        this.f45710c = i7;
        this.d = i0.c.f15573e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f45725o0 = new int[2];
        this.f45729r0 = new int[2];
        this.f45731s0 = new float[4];
        this.f45733u0 = false;
        this.f45740y0 = new Rect();
        this.f45706a = context;
        this.f45708b = e6Var;
        org.telegram.messenger.g0.S(getWindow());
        pf0 pf0Var = new pf0(this, context, 1);
        this.F = pf0Var;
        this.f45719i0 = xh.e.d(1, pf0Var, pf0Var);
        pf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bg0 f49560b;

            {
                this.f49560b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f49560b.onBackPressed();
                        return;
                    default:
                        this.f49560b.onBackPressed();
                        return;
                }
            }
        });
        pf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                bg0 bg0Var = bg0.this;
                if (!bg0Var.f45732t0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(bg0Var.S);
                    org.telegram.messenger.g0.i3(new lf0(bg0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ui.b bVar = new ui.b();
        this.f45720j0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f45721k0 = cVar;
        cVar.h = new jh.k(pf0Var);
        cVar.f8098i = pf0Var;
        wf0 wf0Var = new wf0(this, context, e6Var);
        this.G = wf0Var;
        wf0Var.setClipToPadding(false);
        pf0Var.addView(wf0Var, c8.ja.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(pf0Var, fVar);
        xf0 xf0Var = new xf0(this, context, e6Var);
        this.K = xf0Var;
        xf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bg0 f49560b;

            {
                this.f49560b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f49560b.onBackPressed();
                        return;
                    default:
                        this.f49560b.onBackPressed();
                        return;
                }
            }
        });
        xf0Var.setOnItemClickListener(new h(this, 17));
        xf0Var.setOnScrollListener(new g3(this, 19));
        xf0Var.setItemAnimator(new pi.k(null, xf0Var, e6Var));
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(this, 1);
        this.M = w90Var;
        w90Var.O = new bi.y1(this, 14);
        xf0Var.setLayoutManager(w90Var);
        xf0Var.i(new fi.k(13));
        hi.w wVar = new hi.w(this, context, e6Var, 1);
        this.L = wVar;
        xf0Var.setAdapter(wVar);
        xf0Var.setVerticalScrollBarEnabled(false);
        xf0Var.setOverScrollMode(2);
        wf0Var.addView(xf0Var, c8.ja.c(-2.0f, -1));
        pf0 pf0Var2 = new pf0(this, context, 0);
        this.H = pf0Var2;
        pf0Var.addView(pf0Var2, c8.ja.c(-1.0f, -1));
        this.f45707a0 = new qf0(this, pf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.e2 e2Var) {
        ch.x xVar;
        if (this.f45714e0 == null && e2Var != null) {
            int i7 = this.f45710c;
            org.telegram.messenger.np.s1(i7).E0();
            FrameLayout frameLayout = new FrameLayout(this.f45706a);
            this.f45712d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f45712d0.setClipToPadding(false);
            this.f45712d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? mi0Var = new org.telegram.ui.Components.mi0(5, this.f45710c, getContext(), null, this.f45708b);
            this.f45714e0 = mi0Var;
            mi0Var.setClipChildren(false);
            this.f45714e0.setClipToPadding(false);
            this.f45714e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f45714e0.setDelegate(new uf0(this, e2Var));
            this.f45714e0.setTop(false);
            this.f45714e0.setClipChildren(false);
            this.f45714e0.setClipToPadding(false);
            this.f45714e0.setVisibility(0);
            this.f45714e0.setHint(org.telegram.messenger.hd.M0(2131754443, null));
            this.f45714e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f45714e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.G.addView(this.f45712d0, c8.ja.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f45712d0.addView(this.f45714e0, c8.ja.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f45714e0.setScaleY(0.4f);
            this.f45714e0.setScaleX(0.4f);
            this.f45714e0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.np.s1(i7).f25309i8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                u();
            } else {
                org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25584u3);
            }
            sf0 sf0Var = this.f45714e0;
            if (sf0Var != null && !sf0Var.f37275h1) {
                sf0Var.f37275h1 = true;
                sf0Var.f37277i1 = true;
                ch.b0 b0Var = sf0Var.f37300y0;
                if (b0Var != null && (xVar = b0Var.f5021m) != null && !xVar.M1) {
                    xVar.M1 = true;
                    xVar.N1 = true;
                    l01 l01Var = xVar.f49385i0;
                    if (l01Var != null) {
                        l01Var.invalidate();
                    }
                    b01 b01Var = xVar.f49387j0;
                    if (b01Var != null) {
                        b01Var.invalidate();
                    }
                }
            }
            new hi.p3(this.F, false, new r3(this, 13));
        }
    }

    public final void d(int[] iArr) {
        androidx.activity.n nVar = this.f45724n0;
        if (nVar != null) {
            int[] iArr2 = (int[]) nVar.f1797c;
            ji.e eVar = (ji.e) nVar.d;
            if (!nVar.f1796b || (!eVar.f17480f3 && eVar.isAttachedToWindow() && !eVar.f17497l0.isEmpty())) {
                int[] iArr3 = eVar.f17484g3;
                RectF rectF = eVar.f17497l0;
                eVar.getLocationOnScreen(iArr3);
                iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
                iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
                nVar.f1796b = true;
            }
            int i7 = iArr2[0];
            int[] iArr4 = this.f45725o0;
            iArr4[0] = i7;
            iArr4[1] = iArr2[1];
            iArr[0] = org.telegram.messenger.g0.L(22.0f) + ((i7 - this.W.l()) - org.telegram.messenger.g0.L(6.0f));
            iArr[1] = org.telegram.messenger.g0.L(22.0f) + (iArr4[1] - this.W.getHeight());
            return;
        }
        this.W.getLocationOnScreen(iArr);
        iArr[0] = org.telegram.messenger.i20.D(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 == org.telegram.messenger.ns.f25584u3 && (messages_availableeffects = org.telegram.messenger.np.s1(this.f45710c).f25309i8) != null && !messages_availableeffects.effects.isEmpty()) {
            u();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f45733u0) {
            return;
        }
        this.f45733u0 = true;
        rf0 rf0Var = this.X;
        if (rf0Var != null) {
            rf0Var.invalidate();
        }
        org.telegram.ui.Components.jg jgVar = this.W;
        if (jgVar != null) {
            jgVar.invalidate();
        }
        e(new kf0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.ns.f(this.f45710c).n(this, org.telegram.messenger.ns.f25584u3);
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        sf0 sf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f45741z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.g1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f10 = 0.0f;
        if (!z10 && (sf0Var = this.f45714e0) != null && this.f45716f0) {
            sf0Var.e();
            if (this.f45714e0.getReactionsWindow() != null && this.f45714e0.getReactionsWindow().f5011a != null) {
                this.f45714e0.getReactionsWindow().f5011a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f45714e0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f45735w = true;
        this.f45730s = !z10;
        this.K.invalidate();
        this.f45737x = true;
        this.f45739y = true;
        float f11 = this.E;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f45741z0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(10, this, z11));
        this.f45741z0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f45741z0.setInterpolator(org.telegram.ui.Components.er.h);
        this.f45741z0.setDuration(350L);
        this.f45741z0.start();
    }

    public final void f(org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.bj l10 = l(gjVar);
        if (l10 != null) {
            l10.a();
            ArrayList arrayList = l10.d;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                g((org.telegram.messenger.gj) obj);
            }
            return;
        }
        g(gjVar);
    }

    public final void g(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Cells.q1 q1Var;
        xf0 xf0Var = this.K;
        if (xf0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < xf0Var.getChildCount()) {
                View childAt = xf0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == gjVar) {
                        break;
                    }
                }
                i10++;
            } else {
                q1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == gjVar) {
                i11 = (arrayList.size() - 1) - i7;
            }
            i7++;
        }
        if (q1Var2 == null) {
            xf0Var.getAdapter().g(i11);
            return;
        }
        gjVar.M1 = true;
        q1Var2.x3(gjVar, q1Var2.getCurrentMessagesGroup(), q1Var2.I2(), q1Var2.J2(), q1Var2.A2(), false);
        xf0Var.getAdapter().g(i11);
    }

    public final void h(boolean z10) {
        this.f45728r = z10;
        dismiss();
    }

    public final void i() {
        if (this.f45733u0) {
            return;
        }
        this.f45733u0 = true;
        xh.e.f(false);
        xh.e eVar = this.f45719i0;
        if (eVar != null) {
            eVar.b(this.F);
        }
        super.dismiss();
        org.telegram.messenger.ns.f(this.f45710c).n(this, org.telegram.messenger.ns.f25584u3);
    }

    @Override
    public final boolean isShowing() {
        return !this.f45733u0;
    }

    public final void j(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (this.C0 != null && this.D0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.C0.f38103c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f16 = L / 2.0f;
            float f17 = f14 - f16;
            float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
            rectF.set(f17, f15 - L2, f14 + f16, f15 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.D0);
            this.C0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        org.telegram.messenger.gj messageObject;
        if (!this.f45727q0 && this.f45714e0 != null) {
            if (this.f45722l0 != null) {
                this.f45727q0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.q1 q1Var = this.Q;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f23819k;
                if ((message.flags2 & 4) != 0) {
                    this.f45727q0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final org.telegram.messenger.bj l(org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.P.f(gjVar.c1());
        if (bjVar != null && (bjVar.d.size() <= 1 || bjVar.d(gjVar) == null)) {
            return null;
        }
        return bjVar;
    }

    public final void n(boolean z10) {
        org.telegram.ui.Components.w90 w90Var;
        int i7;
        xf0 xf0Var = this.K;
        if (xf0Var != null && xf0Var.getAdapter() != null && (w90Var = this.M) != null) {
            int b10 = xf0Var.getAdapter().b();
            if (z10) {
                if (b10 > 10) {
                    i7 = b10 % 10;
                } else {
                    i7 = 0;
                }
            } else {
                i7 = b10 - 1;
            }
            w90Var.i1(i7, org.telegram.messenger.g0.L(12.0f), z10);
            this.A0 = z10;
        }
    }

    public final void o(boolean z10, float f10) {
        androidx.activity.n nVar = this.f45724n0;
        if (nVar != null) {
            ji.e eVar = (ji.e) nVar.d;
            eVar.f17480f3 = z10;
            eVar.invalidate();
            return;
        }
        org.telegram.ui.Components.jg jgVar = this.W;
        if (jgVar != null) {
            if (z10) {
                f10 = 0.0f;
            }
            jgVar.setAlpha(f10);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f45709b0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f45709b0 = false;
            return;
        }
        sf0 sf0Var = this.f45714e0;
        if (sf0Var != null && sf0Var.getReactionsWindow() != null) {
            if (!this.f45714e0.getReactionsWindow().C) {
                this.f45714e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f45727q0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pf0 pf0Var = this.F;
        setContentView(pf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        pf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(pf0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(long j3) {
        int i7;
        org.telegram.messenger.gj gjVar;
        TLRPC.TL_availableEffect Z0;
        this.I = j3;
        boolean i10 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i10 && arrayList.size() >= 10) {
            i7 = arrayList.size() % 10;
        } else {
            i7 = 0;
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
        } else {
            gjVar = null;
        }
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23819k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f45714e0 != null && (Z0 = org.telegram.messenger.np.s1(this.f45710c).Z0(j3)) != null) {
            this.f45714e0.setSelectedReactionAnimated(ch.p0.e(Z0));
        }
    }

    public final void q(org.telegram.ui.Components.m60 m60Var) {
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f45708b;
        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
        m60Var.Q(this.f45721k0, c8.g0.k(e6Var), false);
        ViewGroup viewGroup = m60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, c8.ja.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.bj bjVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i12 >= size) {
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i12);
            if (gjVar.z2()) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) hVar.f(gjVar.d1());
                if (bjVar2 == null) {
                    bjVar2 = new org.telegram.messenger.bj();
                    bjVar2.f22718n = false;
                    long c12 = gjVar.c1();
                    bjVar2.f22707a = c12;
                    hVar.k(bjVar2, c12);
                }
                ArrayList arrayList3 = bjVar2.d;
                if (bjVar2.d(gjVar) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            if (((org.telegram.messenger.gj) arrayList3.get(i13)).e1() == gjVar.e1()) {
                                break;
                            }
                            i13++;
                        } else {
                            arrayList3.add(gjVar);
                            break;
                        }
                    }
                }
            } else if (gjVar.d1() != 0) {
                gjVar.f23819k.grouped_id = 0L;
                gjVar.f23791e = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((org.telegram.messenger.bj) hVar.n(i14)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList4.size()) {
            int i16 = this.O;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList4.get(i15);
            if (getContext() == null) {
                i7 = i15;
                i10 = 0;
            } else {
                if (this.B0 == null) {
                    this.B0 = new org.telegram.ui.Cells.q1(getContext(), this.f45710c, true, null, this.f45708b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.B0;
                q1Var2.f30975f6 = false;
                q1Var2.f31001h6 = false;
                q1Var2.f31014i6 = false;
                q1Var2.f31026j6 = false;
                q1Var2.f31040k6 = false;
                org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) hVar.f(gjVar2.c1());
                fi.u2 u2Var = q1Var2.U0;
                u2Var.f22289p0 = true;
                ImageReceiver imageReceiver = q1Var2.A7;
                imageReceiver.f22289p0 = true;
                ImageReceiver imageReceiver2 = q1Var2.T7;
                imageReceiver2.f22289p0 = true;
                ImageReceiver imageReceiver3 = q1Var2.F7;
                imageReceiver3.f22289p0 = true;
                if (bjVar3 != null) {
                    ArrayList arrayList5 = bjVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != bjVar3.f22711f.size()) {
                            bjVar3.a();
                        }
                        q1Var2.f31007hd = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList5.get(i17);
                            org.telegram.messenger.yi d = bjVar3.d(gjVar3);
                            if (d != null && (d.f27755l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                bjVar = bjVar3;
                                q1Var3.w3(gjVar3, bjVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.f30923b7;
                            } else {
                                org.telegram.messenger.bj bjVar4 = bjVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                bjVar = bjVar4;
                            }
                            i17++;
                            org.telegram.messenger.bj bjVar5 = bjVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            bjVar3 = bjVar5;
                        }
                        i7 = i15;
                    }
                }
                i7 = i15;
                q1Var2.w3(gjVar2, bjVar3, false, false, false, false);
                u2Var.f22289p0 = false;
                imageReceiver.f22289p0 = false;
                imageReceiver2.f22289p0 = false;
                imageReceiver3.f22289p0 = false;
                q1Var2.Q3();
                i10 = q1Var2.f30923b7;
            }
            this.O = Math.max(i16, i10);
            i15 = i7 + 1;
        }
        xf0 xf0Var = this.K;
        xf0Var.getAdapter().f();
        int b10 = xf0Var.getAdapter().b();
        if (b10 > 10) {
            i11 = b10 % 10;
        }
        this.M.i1(i11, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.jg s(org.telegram.ui.Components.jg jgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = jgVar;
        rf0 rf0Var = new rf0(this, getContext(), jgVar.d, this.f45708b, jgVar, z10);
        this.X = rf0Var;
        rf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.jg jgVar2 = this.W;
        rf0 rf0Var2 = this.X;
        rf0Var2.H = jgVar2.H;
        rf0Var2.f35984q0 = jgVar2.f35984q0;
        rf0Var2.f35973f0.t(jgVar2.f35973f0.f34840i, false, true);
        rf0Var2.f35974g0 = jgVar2.f35974g0;
        rf0Var2.setEmoji(jgVar2.f35980n.f34181f[0]);
        rf0Var2.i(jgVar2.f35993x, jgVar2.f35992w, true);
        rf0Var2.S.e(true, jgVar2.S.f39900c);
        rf0Var2.F.e(true, jgVar2.F.f39900c);
        int i7 = jgVar2.L;
        int i10 = jgVar2.M;
        rf0Var2.L = i7;
        rf0Var2.M = i10;
        float f10 = jgVar2.P;
        float f11 = jgVar2.Q;
        rf0Var2.P = f10;
        rf0Var2.Q = f11;
        this.X.S.e(true, jgVar.S.f39900c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(jgVar.getWidth(), jgVar.getHeight()));
        org.telegram.ui.Components.jg jgVar3 = this.W;
        jgVar.getHeight();
        this.Y = jgVar3.m();
        d(this.f45729r0);
        return this.X;
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        xh.e.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        o(true, alpha);
        org.telegram.ui.Components.ok0.d(new org.telegram.messenger.s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                bg0 bg0Var = bg0.this;
                bg0Var.o(false, alpha);
                bg0Var.f45713e = (Bitmap) obj;
                Paint paint = new Paint(1);
                bg0Var.h = paint;
                Bitmap bitmap = bg0Var.f45713e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bg0Var.f45715f = bitmapShader;
                paint.setShader(bitmapShader);
                bg0Var.f45723n = new Matrix();
                ui.b bVar = bg0Var.f45720j0;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, bg0Var.F);
                ViewGroup viewGroup = bg0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        pf0 pf0Var = this.H;
        if (pf0Var != null) {
            pf0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.oy0 oy0Var = null;
        if (i7 > 0) {
            oy0Var = new org.telegram.ui.Components.oy0(di.lb.a1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.C0 = oy0Var;
        if (this.D0 == null) {
            Paint paint = new Paint(1);
            this.D0 = paint;
            paint.setColor(1073741824);
        }
        this.K.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                if (gjVar != null && (message = gjVar.f23819k) != null && (messageMedia = message.media) != null) {
                    if (i7 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageMedia.spoiler = z10;
                }
                i10++;
            } else {
                this.L.f();
                return;
            }
        }
    }

    public final void u() {
        if (this.f45716f0) {
            return;
        }
        this.f45717g0 = false;
        this.f45716f0 = true;
        this.f45714e0.p(null, null, true);
        this.f45714e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
        this.f45714e0.r(false);
    }

    public void m(long j3) {
    }
}

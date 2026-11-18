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
public class eg0 extends Dialog implements org.telegram.messenger.fs {
    public boolean A0;
    public org.telegram.ui.Cells.q1 B0;
    public org.telegram.ui.Components.vy0 C0;
    public Paint D0;
    public float E;
    public final sf0 F;
    public final zf0 G;
    public final sf0 H;
    public long I;
    public org.telegram.ui.Components.m5 J;
    public final ag0 K;
    public final hi.x L;
    public final org.telegram.ui.Components.ga0 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.q1 Q;
    public int R;
    public org.telegram.ui.Components.gf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ud V;
    public org.telegram.ui.Components.sg W;
    public uf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f47223a;
    public final tf0 f47224a0;
    public final org.telegram.ui.ActionBar.i6 f47225b;
    public boolean f47226b0;
    public final int f47227c;
    public float f47228c0;
    public i0.b d;
    public FrameLayout f47229d0;
    public Bitmap f47230e;
    public vf0 f47231e0;
    public BitmapShader f47232f;
    public boolean f47233f0;
    public boolean f47234g0;
    public Paint h;
    public boolean f47235h0;
    public final xh.e f47236i0;
    public final ui.b f47237j0;
    public final dh.c f47238k0;
    public RectF f47239l0;
    public ab.q m0;
    public Matrix f47240n;
    public androidx.activity.n f47241n0;
    public final int[] f47242o0;
    public boolean f47243p0;
    public boolean f47244q0;
    public boolean f47245r;
    public final int[] f47246r0;
    public boolean f47247s;
    public final float[] f47248s0;
    public boolean f47249t0;
    public boolean f47250u0;
    public org.telegram.ui.Cells.q1 f47251v0;
    public boolean f47252w;
    public float f47253w0;
    public boolean f47254x;
    public float f47255x0;
    public boolean f47256y;
    public final Rect f47257y0;
    public ValueAnimator f47258z0;

    public eg0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 2131755352);
        int i7 = org.telegram.messenger.j10.f24773t0;
        this.f47227c = i7;
        this.d = i0.b.f15891e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f47242o0 = new int[2];
        this.f47246r0 = new int[2];
        this.f47248s0 = new float[4];
        this.f47250u0 = false;
        this.f47257y0 = new Rect();
        this.f47223a = context;
        this.f47225b = i6Var;
        org.telegram.messenger.g0.S(getWindow());
        sf0 sf0Var = new sf0(this, context, 1);
        this.F = sf0Var;
        this.f47236i0 = xh.e.d(1, sf0Var, sf0Var);
        sf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f51263b;

            {
                this.f51263b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51263b.onBackPressed();
                        return;
                    default:
                        this.f51263b.onBackPressed();
                        return;
                }
            }
        });
        sf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                eg0 eg0Var = eg0.this;
                if (!eg0Var.f47249t0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(eg0Var.S);
                    org.telegram.messenger.g0.h3(new of0(eg0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ui.b bVar = new ui.b();
        this.f47237j0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f47238k0 = cVar;
        cVar.h = new jh.k(sf0Var);
        cVar.f8380i = sf0Var;
        zf0 zf0Var = new zf0(this, context, i6Var);
        this.G = zf0Var;
        zf0Var.setClipToPadding(false);
        sf0Var.addView(zf0Var, c8.ma.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(sf0Var, fVar);
        ag0 ag0Var = new ag0(this, context, i6Var);
        this.K = ag0Var;
        ag0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f51263b;

            {
                this.f51263b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51263b.onBackPressed();
                        return;
                    default:
                        this.f51263b.onBackPressed();
                        return;
                }
            }
        });
        ag0Var.setOnItemClickListener(new h(this, 17));
        ag0Var.setOnScrollListener(new g3(this, 19));
        ag0Var.setItemAnimator(new pi.k(null, ag0Var, i6Var));
        org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(this, 1);
        this.M = ga0Var;
        ga0Var.O = new bi.s2(this, 14);
        ag0Var.setLayoutManager(ga0Var);
        ag0Var.i(new fi.k(13));
        hi.x xVar = new hi.x(this, context, i6Var, 1);
        this.L = xVar;
        ag0Var.setAdapter(xVar);
        ag0Var.setVerticalScrollBarEnabled(false);
        ag0Var.setOverScrollMode(2);
        zf0Var.addView(ag0Var, c8.ma.c(-2.0f, -1));
        sf0 sf0Var2 = new sf0(this, context, 0);
        this.H = sf0Var2;
        sf0Var.addView(sf0Var2, c8.ma.c(-1.0f, -1));
        this.f47224a0 = new tf0(this, sf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.h2 h2Var) {
        ch.x xVar;
        if (this.f47231e0 == null && h2Var != null) {
            int i7 = this.f47227c;
            org.telegram.messenger.mp.u1(i7).G0();
            FrameLayout frameLayout = new FrameLayout(this.f47223a);
            this.f47229d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f47229d0.setClipToPadding(false);
            this.f47229d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? vi0Var = new org.telegram.ui.Components.vi0(5, this.f47227c, getContext(), null, this.f47225b);
            this.f47231e0 = vi0Var;
            vi0Var.setClipChildren(false);
            this.f47231e0.setClipToPadding(false);
            this.f47231e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f47231e0.setDelegate(new xf0(this, h2Var));
            this.f47231e0.setTop(false);
            this.f47231e0.setClipChildren(false);
            this.f47231e0.setClipToPadding(false);
            this.f47231e0.setVisibility(0);
            this.f47231e0.setHint(org.telegram.messenger.gd.M0(2131754441, null));
            this.f47231e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f47231e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.G.addView(this.f47229d0, c8.ma.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f47229d0.addView(this.f47231e0, c8.ma.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f47231e0.setScaleY(0.4f);
            this.f47231e0.setScaleX(0.4f);
            this.f47231e0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.mp.u1(i7).f25719n8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                u();
            } else {
                org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25216w3);
            }
            vf0 vf0Var = this.f47231e0;
            if (vf0Var != null && !vf0Var.f40658h1) {
                vf0Var.f40658h1 = true;
                vf0Var.f40660i1 = true;
                ch.b0 b0Var = vf0Var.f40683y0;
                if (b0Var != null && (xVar = b0Var.f5307m) != null && !xVar.M1) {
                    xVar.M1 = true;
                    xVar.N1 = true;
                    p01 p01Var = xVar.f51438i0;
                    if (p01Var != null) {
                        p01Var.invalidate();
                    }
                    f01 f01Var = xVar.f51440j0;
                    if (f01Var != null) {
                        f01Var.invalidate();
                    }
                }
            }
            new hi.p3(this.F, false, new r3(this, 14));
        }
    }

    public final void d(int[] iArr) {
        androidx.activity.n nVar = this.f47241n0;
        if (nVar != null) {
            int[] iArr2 = (int[]) nVar.f1788c;
            ji.e eVar = (ji.e) nVar.d;
            if (!nVar.f1787b || (!eVar.f17898o3 && eVar.isAttachedToWindow() && !eVar.f17885l0.isEmpty())) {
                int[] iArr3 = eVar.f17902p3;
                RectF rectF = eVar.f17885l0;
                eVar.getLocationOnScreen(iArr3);
                iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
                iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
                nVar.f1787b = true;
            }
            int i7 = iArr2[0];
            int[] iArr4 = this.f47242o0;
            iArr4[0] = i7;
            iArr4[1] = iArr2[1];
            iArr[0] = org.telegram.messenger.g0.L(22.0f) + ((i7 - this.W.l()) - org.telegram.messenger.g0.L(6.0f));
            iArr[1] = org.telegram.messenger.g0.L(22.0f) + (iArr4[1] - this.W.getHeight());
            return;
        }
        this.W.getLocationOnScreen(iArr);
        iArr[0] = org.telegram.ui.Cells.c0.i(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 == org.telegram.messenger.ks.f25216w3 && (messages_availableeffects = org.telegram.messenger.mp.u1(this.f47227c).f25719n8) != null && !messages_availableeffects.effects.isEmpty()) {
            u();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f47250u0) {
            return;
        }
        this.f47250u0 = true;
        uf0 uf0Var = this.X;
        if (uf0Var != null) {
            uf0Var.invalidate();
        }
        org.telegram.ui.Components.sg sgVar = this.W;
        if (sgVar != null) {
            sgVar.invalidate();
        }
        e(new nf0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.ks.f(this.f47227c).n(this, org.telegram.messenger.ks.f25216w3);
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        vf0 vf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f47258z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.h1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f10 = 0.0f;
        if (!z10 && (vf0Var = this.f47231e0) != null && this.f47233f0) {
            vf0Var.e();
            if (this.f47231e0.getReactionsWindow() != null && this.f47231e0.getReactionsWindow().f5297a != null) {
                this.f47231e0.getReactionsWindow().f5297a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f47231e0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f47252w = true;
        this.f47247s = !z10;
        this.K.invalidate();
        this.f47254x = true;
        this.f47256y = true;
        float f11 = this.E;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f47258z0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(10, this, z11));
        this.f47258z0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f47258z0.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f47258z0.setDuration(350L);
        this.f47258z0.start();
    }

    public final void f(org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.aj l10 = l(fjVar);
        if (l10 != null) {
            l10.a();
            ArrayList arrayList = l10.d;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                g((org.telegram.messenger.fj) obj);
            }
            return;
        }
        g(fjVar);
    }

    public final void g(org.telegram.messenger.fj fjVar) {
        org.telegram.ui.Cells.q1 q1Var;
        ag0 ag0Var = this.K;
        if (ag0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < ag0Var.getChildCount()) {
                View childAt = ag0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == fjVar) {
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
            if (arrayList.get(i7) == fjVar) {
                i11 = (arrayList.size() - 1) - i7;
            }
            i7++;
        }
        if (q1Var2 == null) {
            ag0Var.getAdapter().g(i11);
            return;
        }
        fjVar.M1 = true;
        q1Var2.y3(fjVar, q1Var2.getCurrentMessagesGroup(), q1Var2.K2(), q1Var2.L2(), q1Var2.C2(), false);
        ag0Var.getAdapter().g(i11);
    }

    public final void h(boolean z10) {
        this.f47245r = z10;
        dismiss();
    }

    public final void i() {
        if (this.f47250u0) {
            return;
        }
        this.f47250u0 = true;
        xh.e.f(false);
        xh.e eVar = this.f47236i0;
        if (eVar != null) {
            eVar.b(this.F);
        }
        super.dismiss();
        org.telegram.messenger.ks.f(this.f47227c).n(this, org.telegram.messenger.ks.f25216w3);
    }

    @Override
    public final boolean isShowing() {
        return !this.f47250u0;
    }

    public final void j(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (this.C0 != null && this.D0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.C0.f41482c;
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
        org.telegram.messenger.fj messageObject;
        if (!this.f47244q0 && this.f47231e0 != null) {
            if (this.f47239l0 != null) {
                this.f47244q0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.q1 q1Var = this.Q;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f23968k;
                if ((message.flags2 & 4) != 0) {
                    this.f47244q0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final org.telegram.messenger.aj l(org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.P.f(fjVar.c1());
        if (ajVar != null && (ajVar.d.size() <= 1 || ajVar.d(fjVar) == null)) {
            return null;
        }
        return ajVar;
    }

    public final void n(boolean z10) {
        org.telegram.ui.Components.ga0 ga0Var;
        int i7;
        ag0 ag0Var = this.K;
        if (ag0Var != null && ag0Var.getAdapter() != null && (ga0Var = this.M) != null) {
            int b10 = ag0Var.getAdapter().b();
            if (z10) {
                if (b10 > 10) {
                    i7 = b10 % 10;
                } else {
                    i7 = 0;
                }
            } else {
                i7 = b10 - 1;
            }
            ga0Var.i1(i7, org.telegram.messenger.g0.L(12.0f), z10);
            this.A0 = z10;
        }
    }

    public final void o(boolean z10, float f10) {
        androidx.activity.n nVar = this.f47241n0;
        if (nVar != null) {
            ji.e eVar = (ji.e) nVar.d;
            eVar.f17898o3 = z10;
            eVar.invalidate();
            return;
        }
        org.telegram.ui.Components.sg sgVar = this.W;
        if (sgVar != null) {
            if (z10) {
                f10 = 0.0f;
            }
            sgVar.setAlpha(f10);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f47226b0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f47226b0 = false;
            return;
        }
        vf0 vf0Var = this.f47231e0;
        if (vf0Var != null && vf0Var.getReactionsWindow() != null) {
            if (!this.f47231e0.getReactionsWindow().C) {
                this.f47231e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f47244q0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        sf0 sf0Var = this.F;
        setContentView(sf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        sf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(sf0Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    public final void p(long j3) {
        int i7;
        org.telegram.messenger.fj fjVar;
        TLRPC.TL_availableEffect b12;
        this.I = j3;
        boolean i10 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i10 && arrayList.size() >= 10) {
            i7 = arrayList.size() % 10;
        } else {
            i7 = 0;
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
        } else {
            fjVar = null;
        }
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f23968k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f47231e0 != null && (b12 = org.telegram.messenger.mp.u1(this.f47227c).b1(j3)) != null) {
            this.f47231e0.setSelectedReactionAnimated(ch.p0.e(b12));
        }
    }

    public final void q(org.telegram.ui.Components.y60 y60Var) {
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f47225b;
        y60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        y60Var.R(this.f47238k0, c8.i0.l(i6Var), false);
        ViewGroup viewGroup = y60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, c8.ma.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.aj ajVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i12 >= size) {
                break;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i12);
            if (fjVar.z2()) {
                org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) hVar.f(fjVar.d1());
                if (ajVar2 == null) {
                    ajVar2 = new org.telegram.messenger.aj();
                    ajVar2.f22909n = false;
                    long c12 = fjVar.c1();
                    ajVar2.f22898a = c12;
                    hVar.k(ajVar2, c12);
                }
                ArrayList arrayList3 = ajVar2.d;
                if (ajVar2.d(fjVar) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            if (((org.telegram.messenger.fj) arrayList3.get(i13)).e1() == fjVar.e1()) {
                                break;
                            }
                            i13++;
                        } else {
                            arrayList3.add(fjVar);
                            break;
                        }
                    }
                }
            } else if (fjVar.d1() != 0) {
                fjVar.f23968k.grouped_id = 0L;
                fjVar.f23940e = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((org.telegram.messenger.aj) hVar.n(i14)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList4.size()) {
            int i16 = this.O;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList4.get(i15);
            if (getContext() == null) {
                i7 = i15;
                i10 = 0;
            } else {
                if (this.B0 == null) {
                    this.B0 = new org.telegram.ui.Cells.q1(getContext(), this.f47227c, true, null, this.f47225b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.B0;
                q1Var2.f31347f6 = false;
                q1Var2.f31373h6 = false;
                q1Var2.f31386i6 = false;
                q1Var2.f31398j6 = false;
                q1Var2.f31412k6 = false;
                org.telegram.messenger.aj ajVar3 = (org.telegram.messenger.aj) hVar.f(fjVar2.c1());
                fi.s2 s2Var = q1Var2.U0;
                s2Var.f22655p0 = true;
                ImageReceiver imageReceiver = q1Var2.A7;
                imageReceiver.f22655p0 = true;
                ImageReceiver imageReceiver2 = q1Var2.T7;
                imageReceiver2.f22655p0 = true;
                ImageReceiver imageReceiver3 = q1Var2.F7;
                imageReceiver3.f22655p0 = true;
                if (ajVar3 != null) {
                    ArrayList arrayList5 = ajVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != ajVar3.f22902f.size()) {
                            ajVar3.a();
                        }
                        q1Var2.f31379hd = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList5.get(i17);
                            org.telegram.messenger.xi d = ajVar3.d(fjVar3);
                            if (d != null && (d.f27891l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                ajVar = ajVar3;
                                q1Var3.x3(fjVar3, ajVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.f31295b7;
                            } else {
                                org.telegram.messenger.aj ajVar4 = ajVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                ajVar = ajVar4;
                            }
                            i17++;
                            org.telegram.messenger.aj ajVar5 = ajVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            ajVar3 = ajVar5;
                        }
                        i7 = i15;
                    }
                }
                i7 = i15;
                q1Var2.x3(fjVar2, ajVar3, false, false, false, false);
                s2Var.f22655p0 = false;
                imageReceiver.f22655p0 = false;
                imageReceiver2.f22655p0 = false;
                imageReceiver3.f22655p0 = false;
                q1Var2.R3();
                i10 = q1Var2.f31295b7;
            }
            this.O = Math.max(i16, i10);
            i15 = i7 + 1;
        }
        ag0 ag0Var = this.K;
        ag0Var.getAdapter().f();
        int b10 = ag0Var.getAdapter().b();
        if (b10 > 10) {
            i11 = b10 % 10;
        }
        this.M.i1(i11, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.sg s(org.telegram.ui.Components.sg sgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = sgVar;
        uf0 uf0Var = new uf0(this, getContext(), sgVar.d, this.f47225b, sgVar, z10);
        this.X = uf0Var;
        uf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.sg sgVar2 = this.W;
        uf0 uf0Var2 = this.X;
        uf0Var2.H = sgVar2.H;
        uf0Var2.f39643s0 = sgVar2.f39643s0;
        uf0Var2.f39628f0.t(sgVar2.f39628f0.f37384i, false, true);
        uf0Var2.f39629g0 = sgVar2.f39629g0;
        uf0Var2.setEmoji(sgVar2.f39635n.f37361f[0]);
        uf0Var2.i(sgVar2.f39649x, sgVar2.f39647w, true);
        uf0Var2.S.e(true, sgVar2.S.f33892c);
        uf0Var2.F.e(true, sgVar2.F.f33892c);
        int i7 = sgVar2.L;
        int i10 = sgVar2.M;
        uf0Var2.L = i7;
        uf0Var2.M = i10;
        float f10 = sgVar2.P;
        float f11 = sgVar2.Q;
        uf0Var2.P = f10;
        uf0Var2.Q = f11;
        this.X.S.e(true, sgVar.S.f33892c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(sgVar.getWidth(), sgVar.getHeight()));
        org.telegram.ui.Components.sg sgVar3 = this.W;
        sgVar.getHeight();
        this.Y = sgVar3.m();
        d(this.f47246r0);
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
        org.telegram.ui.Components.wk0.d(new org.telegram.messenger.q10() {
            @Override
            public final void a(Object obj, Object obj2) {
                eg0 eg0Var = eg0.this;
                eg0Var.o(false, alpha);
                eg0Var.f47230e = (Bitmap) obj;
                Paint paint = new Paint(1);
                eg0Var.h = paint;
                Bitmap bitmap = eg0Var.f47230e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                eg0Var.f47232f = bitmapShader;
                paint.setShader(bitmapShader);
                eg0Var.f47240n = new Matrix();
                ui.b bVar = eg0Var.f47237j0;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, eg0Var.F);
                ViewGroup viewGroup = eg0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        sf0 sf0Var = this.H;
        if (sf0Var != null) {
            sf0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.vy0 vy0Var = null;
        if (i7 > 0) {
            vy0Var = new org.telegram.ui.Components.vy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.C0 = vy0Var;
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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                if (fjVar != null && (message = fjVar.f23968k) != null && (messageMedia = message.media) != null) {
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
        if (this.f47233f0) {
            return;
        }
        this.f47234g0 = false;
        this.f47233f0 = true;
        this.f47231e0.p(null, null, true);
        this.f47231e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).start();
        this.f47231e0.r(false);
    }

    public void m(long j3) {
    }
}

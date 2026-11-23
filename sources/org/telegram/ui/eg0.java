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
public class eg0 extends Dialog implements org.telegram.messenger.gs {
    public boolean A0;
    public org.telegram.ui.Cells.r1 B0;
    public org.telegram.ui.Components.xy0 C0;
    public Paint D0;
    public float E;
    public final sf0 F;
    public final zf0 G;
    public final sf0 H;
    public long I;
    public org.telegram.ui.Components.n5 J;
    public final ag0 K;
    public final hi.w L;
    public final org.telegram.ui.Components.ia0 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.r1 Q;
    public int R;
    public org.telegram.ui.Components.gf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ud V;
    public org.telegram.ui.Components.ug W;
    public uf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f47232a;
    public final tf0 f47233a0;
    public final org.telegram.ui.ActionBar.h6 f47234b;
    public boolean f47235b0;
    public final int f47236c;
    public float f47237c0;
    public i0.b d;
    public FrameLayout f47238d0;
    public Bitmap f47239e;
    public vf0 f47240e0;
    public BitmapShader f47241f;
    public boolean f47242f0;
    public boolean f47243g0;
    public Paint h;
    public boolean f47244h0;
    public final xh.e f47245i0;
    public final ui.b f47246j0;
    public final dh.c f47247k0;
    public RectF f47248l0;
    public ab.q m0;
    public Matrix f47249n;
    public androidx.activity.n f47250n0;
    public final int[] f47251o0;
    public boolean f47252p0;
    public boolean f47253q0;
    public boolean f47254r;
    public final int[] f47255r0;
    public boolean f47256s;
    public final float[] f47257s0;
    public boolean f47258t0;
    public boolean f47259u0;
    public org.telegram.ui.Cells.r1 f47260v0;
    public boolean f47261w;
    public float f47262w0;
    public boolean f47263x;
    public float f47264x0;
    public boolean f47265y;
    public final Rect f47266y0;
    public ValueAnimator f47267z0;

    public eg0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 2131755352);
        int i7 = org.telegram.messenger.k10.f24932t0;
        this.f47236c = i7;
        this.d = i0.b.f15882e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f47251o0 = new int[2];
        this.f47255r0 = new int[2];
        this.f47257s0 = new float[4];
        this.f47259u0 = false;
        this.f47266y0 = new Rect();
        this.f47232a = context;
        this.f47234b = h6Var;
        org.telegram.messenger.g0.S(getWindow());
        sf0 sf0Var = new sf0(this, context, 1);
        this.F = sf0Var;
        this.f47245i0 = xh.e.d(1, sf0Var, sf0Var);
        sf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f51211b;

            {
                this.f51211b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51211b.onBackPressed();
                        return;
                    default:
                        this.f51211b.onBackPressed();
                        return;
                }
            }
        });
        sf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                eg0 eg0Var = eg0.this;
                if (!eg0Var.f47258t0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(eg0Var.S);
                    org.telegram.messenger.g0.h3(new of0(eg0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ui.b bVar = new ui.b();
        this.f47246j0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f47247k0 = cVar;
        cVar.h = new jh.k(sf0Var);
        cVar.f8372i = sf0Var;
        zf0 zf0Var = new zf0(this, context, h6Var);
        this.G = zf0Var;
        zf0Var.setClipToPadding(false);
        sf0Var.addView(zf0Var, c8.na.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.a0.i(sf0Var, fVar);
        ag0 ag0Var = new ag0(this, context, h6Var);
        this.K = ag0Var;
        ag0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f51211b;

            {
                this.f51211b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51211b.onBackPressed();
                        return;
                    default:
                        this.f51211b.onBackPressed();
                        return;
                }
            }
        });
        ag0Var.setOnItemClickListener(new h(this, 17));
        ag0Var.setOnScrollListener(new g3(this, 19));
        ag0Var.setItemAnimator(new pi.k(null, ag0Var, h6Var));
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(this, 1);
        this.M = ia0Var;
        ia0Var.O = new bi.y2(this, 14);
        ag0Var.setLayoutManager(ia0Var);
        ag0Var.i(new fi.k(13));
        hi.w wVar = new hi.w(this, context, h6Var, 1);
        this.L = wVar;
        ag0Var.setAdapter(wVar);
        ag0Var.setVerticalScrollBarEnabled(false);
        ag0Var.setOverScrollMode(2);
        zf0Var.addView(ag0Var, c8.na.c(-2.0f, -1));
        sf0 sf0Var2 = new sf0(this, context, 0);
        this.H = sf0Var2;
        sf0Var.addView(sf0Var2, c8.na.c(-1.0f, -1));
        this.f47233a0 = new tf0(this, sf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        ch.x xVar;
        if (this.f47240e0 == null && g2Var != null) {
            int i7 = this.f47236c;
            org.telegram.messenger.np.u1(i7).G0();
            FrameLayout frameLayout = new FrameLayout(this.f47232a);
            this.f47238d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f47238d0.setClipToPadding(false);
            this.f47238d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? xi0Var = new org.telegram.ui.Components.xi0(5, this.f47236c, getContext(), null, this.f47234b);
            this.f47240e0 = xi0Var;
            xi0Var.setClipChildren(false);
            this.f47240e0.setClipToPadding(false);
            this.f47240e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f47240e0.setDelegate(new xf0(this, g2Var));
            this.f47240e0.setTop(false);
            this.f47240e0.setClipChildren(false);
            this.f47240e0.setClipToPadding(false);
            this.f47240e0.setVisibility(0);
            this.f47240e0.setHint(org.telegram.messenger.hd.N0(2131754440, null));
            this.f47240e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f47240e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.G.addView(this.f47238d0, c8.na.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f47238d0.addView(this.f47240e0, c8.na.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f47240e0.setScaleY(0.4f);
            this.f47240e0.setScaleX(0.4f);
            this.f47240e0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.np.u1(i7).f25880n8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                u();
            } else {
                org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25372w3);
            }
            vf0 vf0Var = this.f47240e0;
            if (vf0Var != null && !vf0Var.f42076h1) {
                vf0Var.f42076h1 = true;
                vf0Var.f42078i1 = true;
                ch.b0 b0Var = vf0Var.f42101y0;
                if (b0Var != null && (xVar = b0Var.f5299m) != null && !xVar.M1) {
                    xVar.M1 = true;
                    xVar.N1 = true;
                    p01 p01Var = xVar.f51422i0;
                    if (p01Var != null) {
                        p01Var.invalidate();
                    }
                    f01 f01Var = xVar.f51424j0;
                    if (f01Var != null) {
                        f01Var.invalidate();
                    }
                }
            }
            new hi.o3(this.F, false, new r3(this, 14));
        }
    }

    public final void d(int[] iArr) {
        androidx.activity.n nVar = this.f47250n0;
        if (nVar != null) {
            int[] iArr2 = (int[]) nVar.f1759c;
            ji.e eVar = (ji.e) nVar.d;
            if (!nVar.f1758b || (!eVar.f17895q3 && eVar.isAttachedToWindow() && !eVar.f17874l0.isEmpty())) {
                int[] iArr3 = eVar.f17900r3;
                RectF rectF = eVar.f17874l0;
                eVar.getLocationOnScreen(iArr3);
                iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
                iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
                nVar.f1758b = true;
            }
            int i7 = iArr2[0];
            int[] iArr4 = this.f47251o0;
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
        if (i7 == org.telegram.messenger.ls.f25372w3 && (messages_availableeffects = org.telegram.messenger.np.u1(this.f47236c).f25880n8) != null && !messages_availableeffects.effects.isEmpty()) {
            u();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f47259u0) {
            return;
        }
        this.f47259u0 = true;
        uf0 uf0Var = this.X;
        if (uf0Var != null) {
            uf0Var.invalidate();
        }
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            ugVar.invalidate();
        }
        e(new nf0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.ls.f(this.f47236c).n(this, org.telegram.messenger.ls.f25372w3);
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        vf0 vf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f47267z0;
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
        if (!z10 && (vf0Var = this.f47240e0) != null && this.f47242f0) {
            vf0Var.e();
            if (this.f47240e0.getReactionsWindow() != null && this.f47240e0.getReactionsWindow().f5289a != null) {
                this.f47240e0.getReactionsWindow().f5289a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f47240e0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f47261w = true;
        this.f47256s = !z10;
        this.K.invalidate();
        this.f47263x = true;
        this.f47265y = true;
        float f11 = this.E;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f47267z0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(10, this, z11));
        this.f47267z0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f47267z0.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f47267z0.setDuration(350L);
        this.f47267z0.start();
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
        org.telegram.ui.Cells.r1 r1Var;
        ag0 ag0Var = this.K;
        if (ag0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < ag0Var.getChildCount()) {
                View childAt = ag0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject() == gjVar) {
                        break;
                    }
                }
                i10++;
            } else {
                r1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.r1 r1Var2 = r1Var;
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
        if (r1Var2 == null) {
            ag0Var.getAdapter().g(i11);
            return;
        }
        gjVar.M1 = true;
        r1Var2.y3(gjVar, r1Var2.getCurrentMessagesGroup(), r1Var2.K2(), r1Var2.L2(), r1Var2.C2(), false);
        ag0Var.getAdapter().g(i11);
    }

    public final void h(boolean z10) {
        this.f47254r = z10;
        dismiss();
    }

    public final void i() {
        if (this.f47259u0) {
            return;
        }
        this.f47259u0 = true;
        xh.e.f(false);
        xh.e eVar = this.f47245i0;
        if (eVar != null) {
            eVar.b(this.F);
        }
        super.dismiss();
        org.telegram.messenger.ls.f(this.f47236c).n(this, org.telegram.messenger.ls.f25372w3);
    }

    @Override
    public final boolean isShowing() {
        return !this.f47259u0;
    }

    public final void j(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (this.C0 != null && this.D0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.C0.f42224c;
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
        if (!this.f47253q0 && this.f47240e0 != null) {
            if (this.f47248l0 != null) {
                this.f47253q0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.r1 r1Var = this.Q;
            if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f24177k;
                if ((message.flags2 & 4) != 0) {
                    this.f47253q0 = true;
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
        org.telegram.ui.Components.ia0 ia0Var;
        int i7;
        ag0 ag0Var = this.K;
        if (ag0Var != null && ag0Var.getAdapter() != null && (ia0Var = this.M) != null) {
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
            ia0Var.i1(i7, org.telegram.messenger.g0.L(12.0f), z10);
            this.A0 = z10;
        }
    }

    public final void o(boolean z10, float f10) {
        androidx.activity.n nVar = this.f47250n0;
        if (nVar != null) {
            ji.e eVar = (ji.e) nVar.d;
            eVar.f17895q3 = z10;
            eVar.invalidate();
            return;
        }
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            if (z10) {
                f10 = 0.0f;
            }
            ugVar.setAlpha(f10);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f47235b0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f47235b0 = false;
            return;
        }
        vf0 vf0Var = this.f47240e0;
        if (vf0Var != null && vf0Var.getReactionsWindow() != null) {
            if (!this.f47240e0.getReactionsWindow().C) {
                this.f47240e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f47253q0 = true;
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
        org.telegram.messenger.g0.n3(sf0Var, !org.telegram.ui.ActionBar.m6.I.q());
    }

    public final void p(long j3) {
        int i7;
        org.telegram.messenger.gj gjVar;
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
            gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
        } else {
            gjVar = null;
        }
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f24177k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f47240e0 != null && (b12 = org.telegram.messenger.np.u1(this.f47236c).b1(j3)) != null) {
            this.f47240e0.setSelectedReactionAnimated(ch.p0.e(b12));
        }
    }

    public final void q(org.telegram.ui.Components.a70 a70Var) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f47234b;
        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        a70Var.R(this.f47247k0, c8.j0.l(h6Var), false);
        ViewGroup viewGroup = a70Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, c8.na.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.r1 r1Var;
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
                    bjVar2.f23085n = false;
                    long c12 = gjVar.c1();
                    bjVar2.f23074a = c12;
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
                gjVar.f24177k.grouped_id = 0L;
                gjVar.f24149e = 0L;
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
                    this.B0 = new org.telegram.ui.Cells.r1(getContext(), this.f47236c, true, null, this.f47234b);
                }
                org.telegram.ui.Cells.r1 r1Var2 = this.B0;
                r1Var2.f31394f6 = false;
                r1Var2.f31420h6 = false;
                r1Var2.f31433i6 = false;
                r1Var2.f31445j6 = false;
                r1Var2.f31459k6 = false;
                org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) hVar.f(gjVar2.c1());
                fi.s2 s2Var = r1Var2.U0;
                s2Var.f22647p0 = true;
                ImageReceiver imageReceiver = r1Var2.A7;
                imageReceiver.f22647p0 = true;
                ImageReceiver imageReceiver2 = r1Var2.T7;
                imageReceiver2.f22647p0 = true;
                ImageReceiver imageReceiver3 = r1Var2.F7;
                imageReceiver3.f22647p0 = true;
                if (bjVar3 != null) {
                    ArrayList arrayList5 = bjVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != bjVar3.f23078f.size()) {
                            bjVar3.a();
                        }
                        r1Var2.f31426hd = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList5.get(i17);
                            org.telegram.messenger.yi d = bjVar3.d(gjVar3);
                            if (d != null && (d.f28065l & 4) != 0) {
                                org.telegram.ui.Cells.r1 r1Var3 = r1Var2;
                                arrayList2 = arrayList5;
                                bjVar = bjVar3;
                                r1Var3.x3(gjVar3, bjVar, false, false, false, false);
                                r1Var = r1Var3;
                                i10 += r1Var.f31342b7;
                            } else {
                                org.telegram.messenger.bj bjVar4 = bjVar3;
                                r1Var = r1Var2;
                                arrayList2 = arrayList5;
                                bjVar = bjVar4;
                            }
                            i17++;
                            org.telegram.messenger.bj bjVar5 = bjVar;
                            arrayList5 = arrayList2;
                            r1Var2 = r1Var;
                            bjVar3 = bjVar5;
                        }
                        i7 = i15;
                    }
                }
                i7 = i15;
                r1Var2.x3(gjVar2, bjVar3, false, false, false, false);
                s2Var.f22647p0 = false;
                imageReceiver.f22647p0 = false;
                imageReceiver2.f22647p0 = false;
                imageReceiver3.f22647p0 = false;
                r1Var2.R3();
                i10 = r1Var2.f31342b7;
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

    public final org.telegram.ui.Components.ug s(org.telegram.ui.Components.ug ugVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = ugVar;
        uf0 uf0Var = new uf0(this, getContext(), ugVar.d, this.f47234b, ugVar, z10);
        this.X = uf0Var;
        uf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.ug ugVar2 = this.W;
        uf0 uf0Var2 = this.X;
        uf0Var2.H = ugVar2.H;
        uf0Var2.f40336s0 = ugVar2.f40336s0;
        uf0Var2.f40321f0.t(ugVar2.f40321f0.f37758i, false, true);
        uf0Var2.f40322g0 = ugVar2.f40322g0;
        uf0Var2.setEmoji(ugVar2.f40328n.f37733f[0]);
        uf0Var2.i(ugVar2.f40342x, ugVar2.f40340w, true);
        uf0Var2.S.e(true, ugVar2.S.f34349c);
        uf0Var2.F.e(true, ugVar2.F.f34349c);
        int i7 = ugVar2.L;
        int i10 = ugVar2.M;
        uf0Var2.L = i7;
        uf0Var2.M = i10;
        float f10 = ugVar2.P;
        float f11 = ugVar2.Q;
        uf0Var2.P = f10;
        uf0Var2.Q = f11;
        this.X.S.e(true, ugVar.S.f34349c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(ugVar.getWidth(), ugVar.getHeight()));
        org.telegram.ui.Components.ug ugVar3 = this.W;
        ugVar.getHeight();
        this.Y = ugVar3.m();
        d(this.f47255r0);
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
        org.telegram.ui.Components.yk0.d(new org.telegram.messenger.r10() {
            @Override
            public final void a(Object obj, Object obj2) {
                eg0 eg0Var = eg0.this;
                eg0Var.o(false, alpha);
                eg0Var.f47239e = (Bitmap) obj;
                Paint paint = new Paint(1);
                eg0Var.h = paint;
                Bitmap bitmap = eg0Var.f47239e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                eg0Var.f47241f = bitmapShader;
                paint.setShader(bitmapShader);
                eg0Var.f47249n = new Matrix();
                ui.b bVar = eg0Var.f47246j0;
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
        org.telegram.ui.Components.xy0 xy0Var = null;
        if (i7 > 0) {
            xy0Var = new org.telegram.ui.Components.xy0(di.pb.b1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.C0 = xy0Var;
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
                if (gjVar != null && (message = gjVar.f24177k) != null && (messageMedia = message.media) != null) {
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
        if (this.f47242f0) {
            return;
        }
        this.f47243g0 = false;
        this.f47242f0 = true;
        this.f47240e0.p(null, null, true);
        this.f47240e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
        this.f47240e0.r(false);
    }

    public void m(long j3) {
    }
}

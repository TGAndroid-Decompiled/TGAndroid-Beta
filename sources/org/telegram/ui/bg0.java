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
public class bg0 extends Dialog implements org.telegram.messenger.ls {
    public float D;
    public final pf0 E;
    public final wf0 F;
    public final pf0 G;
    public long H;
    public org.telegram.ui.Components.g5 I;
    public final xf0 J;
    public final fi.w K;
    public final org.telegram.ui.Components.u90 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.q1 P;
    public int Q;
    public org.telegram.ui.Components.xe R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.ld U;
    public org.telegram.ui.Components.dg V;
    public rf0 W;
    public int X;
    public ViewGroup Y;
    public final qf0 Z;
    public final Context f44315a;
    public boolean f44316a0;
    public final org.telegram.ui.ActionBar.f6 f44317b;
    public float f44318b0;
    public final int f44319c;
    public FrameLayout f44320c0;
    public i0.b d;
    public sf0 f44321d0;
    public Bitmap f44322e;
    public boolean f44323e0;
    public BitmapShader f44324f;
    public boolean f44325f0;
    public boolean f44326g0;
    public Paint h;
    public final xh.e f44327h0;
    public final ri.b f44328i0;
    public final dh.c f44329j0;
    public RectF f44330k0;
    public boolean f44331l0;
    public boolean m0;
    public Matrix f44332n;
    public final int[] f44333n0;
    public boolean f44334o0;
    public boolean f44335p0;
    public org.telegram.ui.Cells.q1 f44336q0;
    public boolean f44337r;
    public float f44338r0;
    public boolean f44339s;
    public float f44340s0;
    public final Rect f44341t0;
    public ValueAnimator f44342u0;
    public boolean f44343v0;
    public boolean f44344w;
    public org.telegram.ui.Cells.q1 f44345w0;
    public boolean f44346x;
    public org.telegram.ui.Components.my0 f44347x0;
    public boolean f44348y;
    public Paint f44349y0;

    public bg0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 2131755352);
        int i7 = org.telegram.messenger.p10.f24467s0;
        this.f44319c = i7;
        this.d = i0.b.f15116e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f44333n0 = new int[2];
        this.f44335p0 = false;
        this.f44341t0 = new Rect();
        this.f44315a = context;
        this.f44317b = f6Var;
        org.telegram.messenger.g0.S(getWindow());
        pf0 pf0Var = new pf0(this, context, 1);
        this.E = pf0Var;
        this.f44327h0 = xh.e.d(1, pf0Var, pf0Var);
        pf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bg0 f48041b;

            {
                this.f48041b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48041b.onBackPressed();
                        return;
                    default:
                        this.f48041b.onBackPressed();
                        return;
                }
            }
        });
        pf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                bg0 bg0Var = bg0.this;
                if (!bg0Var.f44334o0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(bg0Var.R);
                    org.telegram.messenger.g0.i3(new lf0(bg0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ri.b bVar = new ri.b();
        this.f44328i0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f44329j0 = cVar;
        cVar.h = new jh.k(pf0Var);
        cVar.f8708i = pf0Var;
        wf0 wf0Var = new wf0(this, context, f6Var);
        this.F = wf0Var;
        wf0Var.setClipToPadding(false);
        pf0Var.addView(wf0Var, c8.ha.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f54097a;
        r0.a0.i(pf0Var, fVar);
        xf0 xf0Var = new xf0(this, context, f6Var);
        this.J = xf0Var;
        xf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bg0 f48041b;

            {
                this.f48041b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48041b.onBackPressed();
                        return;
                    default:
                        this.f48041b.onBackPressed();
                        return;
                }
            }
        });
        xf0Var.setOnItemClickListener(new h(this, 17));
        xf0Var.setOnScrollListener(new g3(this, 19));
        xf0Var.setItemAnimator(new mi.l(null, xf0Var, f6Var));
        org.telegram.ui.Components.u90 u90Var = new org.telegram.ui.Components.u90(this, 1);
        this.L = u90Var;
        u90Var.O = new ai.l(this, 11);
        xf0Var.setLayoutManager(u90Var);
        xf0Var.i(new di.k(13));
        fi.w wVar = new fi.w(this, context, f6Var, 1);
        this.K = wVar;
        xf0Var.setAdapter(wVar);
        xf0Var.setVerticalScrollBarEnabled(false);
        xf0Var.setOverScrollMode(2);
        wf0Var.addView(xf0Var, c8.ha.c(-2.0f, -1));
        pf0 pf0Var2 = new pf0(this, context, 0);
        this.G = pf0Var2;
        pf0Var.addView(pf0Var2, c8.ha.c(-1.0f, -1));
        this.Z = new qf0(this, pf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        ch.w wVar;
        if (this.f44321d0 == null && f2Var != null) {
            int i7 = this.f44319c;
            org.telegram.messenger.qp.s1(i7).E0();
            FrameLayout frameLayout = new FrameLayout(this.f44315a);
            this.f44320c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f44320c0.setClipToPadding(false);
            this.f44320c0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? ii0Var = new org.telegram.ui.Components.ii0(5, this.f44319c, getContext(), null, this.f44317b);
            this.f44321d0 = ii0Var;
            ii0Var.setClipChildren(false);
            this.f44321d0.setClipToPadding(false);
            this.f44321d0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f44321d0.setDelegate(new uf0(this, f2Var));
            this.f44321d0.setTop(false);
            this.f44321d0.setClipChildren(false);
            this.f44321d0.setClipToPadding(false);
            this.f44321d0.setVisibility(0);
            this.f44321d0.setHint(org.telegram.messenger.hd.M0(2131754443, null));
            this.f44321d0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f44321d0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.F.addView(this.f44320c0, c8.ha.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f44320c0.addView(this.f44321d0, c8.ha.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f44321d0.setScaleY(0.4f);
            this.f44321d0.setScaleX(0.4f);
            this.f44321d0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.qp.s1(i7).f24795h8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                s();
            } else {
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25078u3);
            }
            sf0 sf0Var = this.f44321d0;
            if (sf0Var != null && !sf0Var.f34653g1) {
                sf0Var.f34653g1 = true;
                sf0Var.f34655h1 = true;
                ch.b0 b0Var = sf0Var.f34678x0;
                if (b0Var != null && (wVar = b0Var.f6193m) != null && !wVar.L1) {
                    wVar.L1 = true;
                    wVar.M1 = true;
                    o01 o01Var = wVar.f49034h0;
                    if (o01Var != null) {
                        o01Var.invalidate();
                    }
                    e01 e01Var = wVar.f49036i0;
                    if (e01Var != null) {
                        e01Var.invalidate();
                    }
                }
            }
            new fi.q3(this.E, false, new r3(this, 13));
        }
    }

    public final void d(Runnable runnable, boolean z9) {
        boolean z10;
        sf0 sf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f44342u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z9 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.ActionBar.g1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        float f10 = 0.0f;
        if (!z9 && (sf0Var = this.f44321d0) != null && this.f44323e0) {
            sf0Var.e();
            if (this.f44321d0.getReactionsWindow() != null && this.f44321d0.getReactionsWindow().f6183a != null) {
                this.f44321d0.getReactionsWindow().f6183a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f44321d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f44344w = true;
        this.f44339s = !z9;
        this.J.invalidate();
        this.f44346x = true;
        this.f44348y = true;
        float f11 = this.D;
        if (z9) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f44342u0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(10, this, z10));
        this.f44342u0.addListener(new org.telegram.ui.ActionBar.f(this, z9, z10, runnable));
        this.f44342u0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f44342u0.setDuration(350L);
        this.f44342u0.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 == org.telegram.messenger.qs.f25078u3 && (messages_availableeffects = org.telegram.messenger.qp.s1(this.f44319c).f24795h8) != null && !messages_availableeffects.effects.isEmpty()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f44335p0) {
            return;
        }
        this.f44335p0 = true;
        rf0 rf0Var = this.W;
        if (rf0Var != null) {
            rf0Var.invalidate();
        }
        org.telegram.ui.Components.dg dgVar = this.V;
        if (dgVar != null) {
            dgVar.invalidate();
        }
        d(new kf0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.qs.f(this.f44319c).n(this, org.telegram.messenger.qs.f25078u3);
    }

    public final void e(org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.dj k10 = k(ijVar);
        if (k10 != null) {
            k10.a();
            ArrayList arrayList = k10.d;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f((org.telegram.messenger.ij) obj);
            }
            return;
        }
        f(ijVar);
    }

    public final void f(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Cells.q1 q1Var;
        xf0 xf0Var = this.J;
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
                    if (q1Var.getMessageObject() == ijVar) {
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
            ArrayList arrayList = this.M;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == ijVar) {
                i11 = (arrayList.size() - 1) - i7;
            }
            i7++;
        }
        if (q1Var2 == null) {
            xf0Var.getAdapter().g(i11);
            return;
        }
        ijVar.K1 = true;
        q1Var2.v3(ijVar, q1Var2.getCurrentMessagesGroup(), q1Var2.H2(), q1Var2.I2(), q1Var2.z2(), false);
        xf0Var.getAdapter().g(i11);
    }

    public final void g(boolean z9) {
        this.f44337r = z9;
        dismiss();
    }

    public final void h() {
        if (this.f44335p0) {
            return;
        }
        this.f44335p0 = true;
        xh.e.f(false);
        xh.e eVar = this.f44327h0;
        if (eVar != null) {
            eVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.qs.f(this.f44319c).n(this, org.telegram.messenger.qs.f25078u3);
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f44347x0 != null && this.f44349y0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.f44347x0.f36125c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f16 = L / 2.0f;
            float f17 = f14 - f16;
            float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
            rectF.set(f17, f15 - L2, f14 + f16, f15 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.f44349y0);
            this.f44347x0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f44335p0;
    }

    public final long j() {
        org.telegram.messenger.ij messageObject;
        if (!this.m0 && this.f44321d0 != null) {
            if (this.f44330k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f23244k;
                if ((message.flags2 & 4) != 0) {
                    this.m0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final org.telegram.messenger.dj k(org.telegram.messenger.ij ijVar) {
        if (ijVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.O.f(ijVar.d1());
        if (djVar != null && (djVar.d.size() <= 1 || djVar.d(ijVar) == null)) {
            return null;
        }
        return djVar;
    }

    public final void m(boolean z9) {
        org.telegram.ui.Components.u90 u90Var;
        int i7;
        xf0 xf0Var = this.J;
        if (xf0Var != null && xf0Var.getAdapter() != null && (u90Var = this.L) != null) {
            int b10 = xf0Var.getAdapter().b();
            if (z9) {
                if (b10 > 10) {
                    i7 = b10 % 10;
                } else {
                    i7 = 0;
                }
            } else {
                i7 = b10 - 1;
            }
            u90Var.i1(i7, org.telegram.messenger.g0.L(12.0f), z9);
            this.f44343v0 = z9;
        }
    }

    public final void n(long j3) {
        int i7;
        org.telegram.messenger.ij ijVar;
        TLRPC.TL_availableEffect Z0;
        this.H = j3;
        boolean i10 = this.O.i();
        ArrayList arrayList = this.M;
        if (!i10 && arrayList.size() >= 10) {
            i7 = arrayList.size() % 10;
        } else {
            i7 = 0;
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
        } else {
            ijVar = null;
        }
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23244k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f44321d0 != null && (Z0 = org.telegram.messenger.qp.s1(this.f44319c).Z0(j3)) != null) {
            this.f44321d0.setSelectedReactionAnimated(ch.o0.e(Z0));
        }
    }

    public final void o(org.telegram.ui.Components.k60 k60Var) {
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f44317b;
        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
        k60Var.Q(this.f44329j0, c8.g0.k(f6Var), false);
        ViewGroup viewGroup = k60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, c8.ha.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f44316a0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f44316a0 = false;
            return;
        }
        sf0 sf0Var = this.f44321d0;
        if (sf0Var != null && sf0Var.getReactionsWindow() != null) {
            if (!this.f44321d0.getReactionsWindow().C) {
                this.f44321d0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.m0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pf0 pf0Var = this.E;
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
        org.telegram.messenger.g0.o3(pf0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.dj djVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
            if (i12 >= size) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i12);
            if (ijVar.A2()) {
                org.telegram.messenger.dj djVar2 = (org.telegram.messenger.dj) hVar.f(ijVar.e1());
                if (djVar2 == null) {
                    djVar2 = new org.telegram.messenger.dj();
                    djVar2.f22020n = false;
                    long d12 = ijVar.d1();
                    djVar2.f22009a = d12;
                    hVar.k(djVar2, d12);
                }
                ArrayList arrayList3 = djVar2.d;
                if (djVar2.d(ijVar) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            if (((org.telegram.messenger.ij) arrayList3.get(i13)).f1() == ijVar.f1()) {
                                break;
                            }
                            i13++;
                        } else {
                            arrayList3.add(ijVar);
                            break;
                        }
                    }
                }
            } else if (ijVar.e1() != 0) {
                ijVar.f23244k.grouped_id = 0L;
                ijVar.f23216e = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((org.telegram.messenger.dj) hVar.n(i14)).a();
        }
        ArrayList arrayList4 = this.M;
        arrayList4.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList4.size()) {
            int i16 = this.N;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList4.get(i15);
            if (getContext() == null) {
                i7 = i15;
                i10 = 0;
            } else {
                if (this.f44345w0 == null) {
                    this.f44345w0 = new org.telegram.ui.Cells.q1(getContext(), this.f44319c, true, null, this.f44317b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.f44345w0;
                q1Var2.f29825e6 = false;
                q1Var2.f29851g6 = false;
                q1Var2.f29865h6 = false;
                q1Var2.f29877i6 = false;
                q1Var2.f29888j6 = false;
                org.telegram.messenger.dj djVar3 = (org.telegram.messenger.dj) hVar.f(ijVar2.d1());
                di.z2 z2Var = q1Var2.T0;
                z2Var.f21205o0 = true;
                ImageReceiver imageReceiver = q1Var2.f30090z7;
                imageReceiver.f21205o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.S7;
                imageReceiver2.f21205o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.E7;
                imageReceiver3.f21205o0 = true;
                if (djVar3 != null) {
                    ArrayList arrayList5 = djVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != djVar3.f22013f.size()) {
                            djVar3.a();
                        }
                        q1Var2.Sc = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList5.get(i17);
                            org.telegram.messenger.aj d = djVar3.d(ijVar3);
                            if (d != null && (d.f21451l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                djVar = djVar3;
                                q1Var3.u3(ijVar3, djVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.f29773a7;
                            } else {
                                org.telegram.messenger.dj djVar4 = djVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                djVar = djVar4;
                            }
                            i17++;
                            org.telegram.messenger.dj djVar5 = djVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            djVar3 = djVar5;
                        }
                        i7 = i15;
                    }
                }
                i7 = i15;
                q1Var2.u3(ijVar2, djVar3, false, false, false, false);
                z2Var.f21205o0 = false;
                imageReceiver.f21205o0 = false;
                imageReceiver2.f21205o0 = false;
                imageReceiver3.f21205o0 = false;
                q1Var2.O3();
                i10 = q1Var2.f29773a7;
            }
            this.N = Math.max(i16, i10);
            i15 = i7 + 1;
        }
        xf0 xf0Var = this.J;
        xf0Var.getAdapter().f();
        int b10 = xf0Var.getAdapter().b();
        if (b10 > 10) {
            i11 = b10 % 10;
        }
        this.L.i1(i11, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.dg q(org.telegram.ui.Components.dg dgVar, boolean z9, View.OnClickListener onClickListener) {
        this.V = dgVar;
        int[] iArr = this.f44333n0;
        dgVar.getLocationOnScreen(iArr);
        rf0 rf0Var = new rf0(this, getContext(), dgVar.f32878b, this.f44317b, dgVar, z9);
        this.W = rf0Var;
        rf0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.dg dgVar2 = this.V;
        rf0 rf0Var2 = this.W;
        rf0Var2.E = dgVar2.E;
        rf0Var2.f32888h0 = dgVar2.f32888h0;
        rf0Var2.f32881c0.t(dgVar2.f32881c0.f34514i, false, true);
        rf0Var2.f32882d0 = dgVar2.f32882d0;
        rf0Var2.setEmoji(dgVar2.f32885f.f33825f[0]);
        rf0Var2.i(dgVar2.f32895s, dgVar2.f32894r, true);
        rf0Var2.P.e(true, dgVar2.P.f39855c);
        rf0Var2.f32898y.e(true, dgVar2.f32898y.f39855c);
        int i7 = dgVar2.I;
        int i10 = dgVar2.J;
        rf0Var2.I = i7;
        rf0Var2.J = i10;
        float f10 = dgVar2.M;
        float f11 = dgVar2.N;
        rf0Var2.M = f10;
        rf0Var2.N = f11;
        this.W.P.e(true, dgVar.P.f39855c);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(dgVar.getWidth(), dgVar.getHeight()));
        org.telegram.ui.Components.dg dgVar3 = this.V;
        dgVar.getHeight();
        this.X = dgVar3.m();
        int i11 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.dg dgVar4 = this.V;
        dgVar.getHeight();
        iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - dgVar4.m(), i11);
        return this.W;
    }

    public final void r(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z9;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.my0 my0Var = null;
        if (i7 > 0) {
            my0Var = new org.telegram.ui.Components.my0(bi.dd.a1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f44347x0 = my0Var;
        if (this.f44349y0 == null) {
            Paint paint = new Paint(1);
            this.f44349y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                if (ijVar != null && (message = ijVar.f23244k) != null && (messageMedia = message.media) != null) {
                    if (i7 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    messageMedia.spoiler = z9;
                }
                i10++;
            } else {
                this.K.f();
                return;
            }
        }
    }

    public final void s() {
        if (this.f44323e0) {
            return;
        }
        this.f44325f0 = false;
        this.f44323e0 = true;
        this.f44321d0.p(null, null, true);
        this.f44321d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
        this.f44321d0.r(false);
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        xh.e.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.dg dgVar = this.V;
        if (dgVar != null) {
            dgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.jk0.d(new org.telegram.messenger.v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                bg0 bg0Var = bg0.this;
                ri.b bVar = bg0Var.f44328i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.dg dgVar2 = bg0Var.V;
                if (dgVar2 != null) {
                    dgVar2.setAlpha(alpha);
                }
                bg0Var.f44322e = bitmap;
                Paint paint = new Paint(1);
                bg0Var.h = paint;
                Bitmap bitmap3 = bg0Var.f44322e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                bg0Var.f44324f = bitmapShader;
                paint.setShader(bitmapShader);
                bg0Var.f44332n = new Matrix();
                bVar.a(bitmap2);
                ih.d.c(bVar, bg0Var.E);
                ViewGroup viewGroup = bg0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        pf0 pf0Var = this.G;
        if (pf0Var != null) {
            pf0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j3) {
    }
}

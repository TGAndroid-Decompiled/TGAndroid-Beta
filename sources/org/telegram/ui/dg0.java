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
public class dg0 extends Dialog implements org.telegram.messenger.ls {
    public float D;
    public final rf0 E;
    public final yf0 F;
    public final rf0 G;
    public long H;
    public org.telegram.ui.Components.g5 I;
    public final zf0 J;
    public final fi.w K;
    public final org.telegram.ui.Components.v90 L;
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
    public tf0 W;
    public int X;
    public ViewGroup Y;
    public final sf0 Z;
    public final Context f44947a;
    public boolean f44948a0;
    public final org.telegram.ui.ActionBar.g6 f44949b;
    public float f44950b0;
    public final int f44951c;
    public FrameLayout f44952c0;
    public i0.b d;
    public uf0 f44953d0;
    public Bitmap f44954e;
    public boolean f44955e0;
    public BitmapShader f44956f;
    public boolean f44957f0;
    public boolean f44958g0;
    public Paint h;
    public final xh.e f44959h0;
    public final ri.b f44960i0;
    public final dh.c f44961j0;
    public RectF f44962k0;
    public boolean f44963l0;
    public boolean m0;
    public Matrix f44964n;
    public final int[] f44965n0;
    public boolean f44966o0;
    public boolean f44967p0;
    public org.telegram.ui.Cells.q1 f44968q0;
    public boolean f44969r;
    public float f44970r0;
    public boolean f44971s;
    public float f44972s0;
    public final Rect f44973t0;
    public ValueAnimator f44974u0;
    public boolean f44975v0;
    public boolean f44976w;
    public org.telegram.ui.Cells.q1 f44977w0;
    public boolean f44978x;
    public org.telegram.ui.Components.ny0 f44979x0;
    public boolean f44980y;
    public Paint f44981y0;

    public dg0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 2131755352);
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f44951c = i7;
        this.d = i0.b.f15119e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f44965n0 = new int[2];
        this.f44967p0 = false;
        this.f44973t0 = new Rect();
        this.f44947a = context;
        this.f44949b = g6Var;
        org.telegram.messenger.g0.S(getWindow());
        rf0 rf0Var = new rf0(this, context, 1);
        this.E = rf0Var;
        this.f44959h0 = xh.e.d(1, rf0Var, rf0Var);
        rf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dg0 f48712b;

            {
                this.f48712b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48712b.onBackPressed();
                        return;
                    default:
                        this.f48712b.onBackPressed();
                        return;
                }
            }
        });
        rf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                dg0 dg0Var = dg0.this;
                if (!dg0Var.f44966o0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(dg0Var.R);
                    org.telegram.messenger.g0.i3(new nf0(dg0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ri.b bVar = new ri.b();
        this.f44960i0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f44961j0 = cVar;
        cVar.h = new jh.k(rf0Var);
        cVar.f8706i = rf0Var;
        yf0 yf0Var = new yf0(this, context, g6Var);
        this.F = yf0Var;
        yf0Var.setClipToPadding(false);
        rf0Var.addView(yf0Var, c8.ha.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(rf0Var, fVar);
        zf0 zf0Var = new zf0(this, context, g6Var);
        this.J = zf0Var;
        zf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dg0 f48712b;

            {
                this.f48712b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48712b.onBackPressed();
                        return;
                    default:
                        this.f48712b.onBackPressed();
                        return;
                }
            }
        });
        zf0Var.setOnItemClickListener(new h(this, 17));
        zf0Var.setOnScrollListener(new g3(this, 19));
        zf0Var.setItemAnimator(new mi.l(null, zf0Var, g6Var));
        org.telegram.ui.Components.v90 v90Var = new org.telegram.ui.Components.v90(this, 1);
        this.L = v90Var;
        v90Var.O = new ai.l(this, 11);
        zf0Var.setLayoutManager(v90Var);
        zf0Var.i(new di.k(13));
        fi.w wVar = new fi.w(this, context, g6Var, 1);
        this.K = wVar;
        zf0Var.setAdapter(wVar);
        zf0Var.setVerticalScrollBarEnabled(false);
        zf0Var.setOverScrollMode(2);
        yf0Var.addView(zf0Var, c8.ha.c(-2.0f, -1));
        rf0 rf0Var2 = new rf0(this, context, 0);
        this.G = rf0Var2;
        rf0Var.addView(rf0Var2, c8.ha.c(-1.0f, -1));
        this.Z = new sf0(this, rf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        ch.w wVar;
        if (this.f44953d0 == null && f2Var != null) {
            int i7 = this.f44951c;
            org.telegram.messenger.qp.s1(i7).E0();
            FrameLayout frameLayout = new FrameLayout(this.f44947a);
            this.f44952c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f44952c0.setClipToPadding(false);
            this.f44952c0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? ji0Var = new org.telegram.ui.Components.ji0(5, this.f44951c, getContext(), null, this.f44949b);
            this.f44953d0 = ji0Var;
            ji0Var.setClipChildren(false);
            this.f44953d0.setClipToPadding(false);
            this.f44953d0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f44953d0.setDelegate(new wf0(this, f2Var));
            this.f44953d0.setTop(false);
            this.f44953d0.setClipChildren(false);
            this.f44953d0.setClipToPadding(false);
            this.f44953d0.setVisibility(0);
            this.f44953d0.setHint(org.telegram.messenger.id.M0(2131754443, null));
            this.f44953d0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f44953d0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.F.addView(this.f44952c0, c8.ha.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f44952c0.addView(this.f44953d0, c8.ha.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f44953d0.setScaleY(0.4f);
            this.f44953d0.setScaleX(0.4f);
            this.f44953d0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.qp.s1(i7).f24802h8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                s();
            } else {
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25087u3);
            }
            uf0 uf0Var = this.f44953d0;
            if (uf0Var != null && !uf0Var.f35043g1) {
                uf0Var.f35043g1 = true;
                uf0Var.f35045h1 = true;
                ch.b0 b0Var = uf0Var.f35068x0;
                if (b0Var != null && (wVar = b0Var.f6191m) != null && !wVar.L1) {
                    wVar.L1 = true;
                    wVar.M1 = true;
                    q01 q01Var = wVar.f49680h0;
                    if (q01Var != null) {
                        q01Var.invalidate();
                    }
                    g01 g01Var = wVar.f49682i0;
                    if (g01Var != null) {
                        g01Var.invalidate();
                    }
                }
            }
            new fi.q3(this.E, false, new r3(this, 13));
        }
    }

    public final void d(Runnable runnable, boolean z9) {
        boolean z10;
        uf0 uf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f44974u0;
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
        if (!z9 && (uf0Var = this.f44953d0) != null && this.f44955e0) {
            uf0Var.e();
            if (this.f44953d0.getReactionsWindow() != null && this.f44953d0.getReactionsWindow().f6181a != null) {
                this.f44953d0.getReactionsWindow().f6181a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f44953d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f44976w = true;
        this.f44971s = !z9;
        this.J.invalidate();
        this.f44978x = true;
        this.f44980y = true;
        float f11 = this.D;
        if (z9) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f44974u0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(10, this, z10));
        this.f44974u0.addListener(new org.telegram.ui.ActionBar.f(this, z9, z10, runnable));
        this.f44974u0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f44974u0.setDuration(350L);
        this.f44974u0.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 == org.telegram.messenger.qs.f25087u3 && (messages_availableeffects = org.telegram.messenger.qp.s1(this.f44951c).f24802h8) != null && !messages_availableeffects.effects.isEmpty()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f44967p0) {
            return;
        }
        this.f44967p0 = true;
        tf0 tf0Var = this.W;
        if (tf0Var != null) {
            tf0Var.invalidate();
        }
        org.telegram.ui.Components.dg dgVar = this.V;
        if (dgVar != null) {
            dgVar.invalidate();
        }
        d(new mf0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.qs.f(this.f44951c).n(this, org.telegram.messenger.qs.f25087u3);
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
        zf0 zf0Var = this.J;
        if (zf0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < zf0Var.getChildCount()) {
                View childAt = zf0Var.getChildAt(i10);
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
            zf0Var.getAdapter().g(i11);
            return;
        }
        ijVar.K1 = true;
        q1Var2.w3(ijVar, q1Var2.getCurrentMessagesGroup(), q1Var2.H2(), q1Var2.I2(), q1Var2.z2(), false);
        zf0Var.getAdapter().g(i11);
    }

    public final void g(boolean z9) {
        this.f44969r = z9;
        dismiss();
    }

    public final void h() {
        if (this.f44967p0) {
            return;
        }
        this.f44967p0 = true;
        xh.e.f(false);
        xh.e eVar = this.f44959h0;
        if (eVar != null) {
            eVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.qs.f(this.f44951c).n(this, org.telegram.messenger.qs.f25087u3);
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f44979x0 != null && this.f44981y0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.f44979x0.f36541c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f16 = L / 2.0f;
            float f17 = f14 - f16;
            float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
            rectF.set(f17, f15 - L2, f14 + f16, f15 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.f44981y0);
            this.f44979x0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f44967p0;
    }

    public final long j() {
        org.telegram.messenger.ij messageObject;
        if (!this.m0 && this.f44953d0 != null) {
            if (this.f44962k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f23262k;
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
        if (ijVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.O.f(ijVar.c1());
        if (djVar != null && (djVar.d.size() <= 1 || djVar.d(ijVar) == null)) {
            return null;
        }
        return djVar;
    }

    public final void m(boolean z9) {
        org.telegram.ui.Components.v90 v90Var;
        int i7;
        zf0 zf0Var = this.J;
        if (zf0Var != null && zf0Var.getAdapter() != null && (v90Var = this.L) != null) {
            int b10 = zf0Var.getAdapter().b();
            if (z9) {
                if (b10 > 10) {
                    i7 = b10 % 10;
                } else {
                    i7 = 0;
                }
            } else {
                i7 = b10 - 1;
            }
            v90Var.i1(i7, org.telegram.messenger.g0.L(12.0f), z9);
            this.f44975v0 = z9;
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
            TLRPC.Message message = ijVar.f23262k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f44953d0 != null && (Z0 = org.telegram.messenger.qp.s1(this.f44951c).Z0(j3)) != null) {
            this.f44953d0.setSelectedReactionAnimated(ch.o0.e(Z0));
        }
    }

    public final void o(org.telegram.ui.Components.l60 l60Var) {
        int i7 = org.telegram.ui.ActionBar.l6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f44949b;
        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
        l60Var.Q(this.f44961j0, c8.g0.k(g6Var), false);
        ViewGroup viewGroup = l60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, c8.ha.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f44948a0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f44948a0 = false;
            return;
        }
        uf0 uf0Var = this.f44953d0;
        if (uf0Var != null && uf0Var.getReactionsWindow() != null) {
            if (!this.f44953d0.getReactionsWindow().C) {
                this.f44953d0.getReactionsWindow().d();
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
        rf0 rf0Var = this.E;
        setContentView(rf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        rf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(rf0Var, !org.telegram.ui.ActionBar.l6.I.q());
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
            if (ijVar.z2()) {
                org.telegram.messenger.dj djVar2 = (org.telegram.messenger.dj) hVar.f(ijVar.d1());
                if (djVar2 == null) {
                    djVar2 = new org.telegram.messenger.dj();
                    djVar2.f22045n = false;
                    long c12 = ijVar.c1();
                    djVar2.f22034a = c12;
                    hVar.k(djVar2, c12);
                }
                ArrayList arrayList3 = djVar2.d;
                if (djVar2.d(ijVar) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            if (((org.telegram.messenger.ij) arrayList3.get(i13)).e1() == ijVar.e1()) {
                                break;
                            }
                            i13++;
                        } else {
                            arrayList3.add(ijVar);
                            break;
                        }
                    }
                }
            } else if (ijVar.d1() != 0) {
                ijVar.f23262k.grouped_id = 0L;
                ijVar.f23234e = 0L;
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
                if (this.f44977w0 == null) {
                    this.f44977w0 = new org.telegram.ui.Cells.q1(getContext(), this.f44951c, true, null, this.f44949b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.f44977w0;
                q1Var2.f29832e6 = false;
                q1Var2.f29858g6 = false;
                q1Var2.f29872h6 = false;
                q1Var2.f29885i6 = false;
                q1Var2.f29896j6 = false;
                org.telegram.messenger.dj djVar3 = (org.telegram.messenger.dj) hVar.f(ijVar2.c1());
                di.z2 z2Var = q1Var2.T0;
                z2Var.f21208o0 = true;
                ImageReceiver imageReceiver = q1Var2.f30098z7;
                imageReceiver.f21208o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.S7;
                imageReceiver2.f21208o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.E7;
                imageReceiver3.f21208o0 = true;
                if (djVar3 != null) {
                    ArrayList arrayList5 = djVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != djVar3.f22038f.size()) {
                            djVar3.a();
                        }
                        q1Var2.Tc = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList5.get(i17);
                            org.telegram.messenger.aj d = djVar3.d(ijVar3);
                            if (d != null && (d.f21450l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                djVar = djVar3;
                                q1Var3.v3(ijVar3, djVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.f29780a7;
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
                q1Var2.v3(ijVar2, djVar3, false, false, false, false);
                z2Var.f21208o0 = false;
                imageReceiver.f21208o0 = false;
                imageReceiver2.f21208o0 = false;
                imageReceiver3.f21208o0 = false;
                q1Var2.P3();
                i10 = q1Var2.f29780a7;
            }
            this.N = Math.max(i16, i10);
            i15 = i7 + 1;
        }
        zf0 zf0Var = this.J;
        zf0Var.getAdapter().f();
        int b10 = zf0Var.getAdapter().b();
        if (b10 > 10) {
            i11 = b10 % 10;
        }
        this.L.i1(i11, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.dg q(org.telegram.ui.Components.dg dgVar, boolean z9, View.OnClickListener onClickListener) {
        this.V = dgVar;
        int[] iArr = this.f44965n0;
        dgVar.getLocationOnScreen(iArr);
        tf0 tf0Var = new tf0(this, getContext(), dgVar.f32956b, this.f44949b, dgVar, z9);
        this.W = tf0Var;
        tf0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.dg dgVar2 = this.V;
        tf0 tf0Var2 = this.W;
        tf0Var2.E = dgVar2.E;
        tf0Var2.f32966h0 = dgVar2.f32966h0;
        tf0Var2.f32959c0.t(dgVar2.f32959c0.f34593i, false, true);
        tf0Var2.f32960d0 = dgVar2.f32960d0;
        tf0Var2.setEmoji(dgVar2.f32963f.f33866f[0]);
        tf0Var2.i(dgVar2.f32973s, dgVar2.f32972r, true);
        tf0Var2.P.e(true, dgVar2.P.f39910c);
        tf0Var2.f32976y.e(true, dgVar2.f32976y.f39910c);
        int i7 = dgVar2.I;
        int i10 = dgVar2.J;
        tf0Var2.I = i7;
        tf0Var2.J = i10;
        float f10 = dgVar2.M;
        float f11 = dgVar2.N;
        tf0Var2.M = f10;
        tf0Var2.N = f11;
        this.W.P.e(true, dgVar.P.f39910c);
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
        org.telegram.ui.Components.ny0 ny0Var = null;
        if (i7 > 0) {
            ny0Var = new org.telegram.ui.Components.ny0(bi.dd.a1(false, org.telegram.messenger.id.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f44979x0 = ny0Var;
        if (this.f44981y0 == null) {
            Paint paint = new Paint(1);
            this.f44981y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                if (ijVar != null && (message = ijVar.f23262k) != null && (messageMedia = message.media) != null) {
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
        if (this.f44955e0) {
            return;
        }
        this.f44957f0 = false;
        this.f44955e0 = true;
        this.f44953d0.p(null, null, true);
        this.f44953d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
        this.f44953d0.r(false);
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
        org.telegram.ui.Components.kk0.d(new org.telegram.messenger.v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                dg0 dg0Var = dg0.this;
                ri.b bVar = dg0Var.f44960i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.dg dgVar2 = dg0Var.V;
                if (dgVar2 != null) {
                    dgVar2.setAlpha(alpha);
                }
                dg0Var.f44954e = bitmap;
                Paint paint = new Paint(1);
                dg0Var.h = paint;
                Bitmap bitmap3 = dg0Var.f44954e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                dg0Var.f44956f = bitmapShader;
                paint.setShader(bitmapShader);
                dg0Var.f44964n = new Matrix();
                bVar.a(bitmap2);
                ih.d.c(bVar, dg0Var.E);
                ViewGroup viewGroup = dg0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        rf0 rf0Var = this.G;
        if (rf0Var != null) {
            rf0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j3) {
    }
}

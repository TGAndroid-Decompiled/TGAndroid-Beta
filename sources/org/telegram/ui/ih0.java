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
public class ih0 extends Dialog implements org.telegram.messenger.vs {
    public float D;
    public final wg0 E;
    public final dh0 F;
    public final wg0 G;
    public long H;
    public org.telegram.ui.Components.d5 I;
    public final eh0 J;
    public final vg0 K;
    public final jg.g1 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.q1 P;
    public int Q;
    public org.telegram.ui.Components.se R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.fd U;
    public org.telegram.ui.Components.zf V;
    public yg0 W;
    public int X;
    public ViewGroup Y;
    public final xg0 Z;
    public final Context f38058a;
    public boolean f38059a0;
    public final org.telegram.ui.ActionBar.p6 f38060b;
    public float f38061b0;
    public final int f38062c;
    public FrameLayout f38063c0;
    public i0.c d;
    public zg0 f38064d0;
    public Bitmap e;
    public boolean f38065e0;
    public BitmapShader f38066f;
    public boolean f38067f0;
    public boolean f38068g0;
    public Paint h;
    public final nh.h f38069h0;
    public final hi.b f38070i0;
    public final tg.b f38071j0;
    public RectF f38072k0;
    public boolean f38073l0;
    public boolean m0;
    public Matrix f38074n;
    public final int[] f38075n0;
    public boolean f38076o0;
    public boolean f38077p0;
    public org.telegram.ui.Cells.q1 f38078q0;
    public boolean f38079r;
    public float f38080r0;
    public boolean f38081s;
    public float f38082s0;
    public final Rect f38083t0;
    public ValueAnimator f38084u0;
    public boolean f38085v0;
    public boolean f38086w;
    public org.telegram.ui.Cells.q1 f38087w0;
    public boolean f38088x;
    public org.telegram.ui.Components.rz0 f38089x0;
    public boolean f38090y;
    public Paint f38091y0;

    public ih0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 2131755352);
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.f38062c = i10;
        this.d = i0.c.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f38075n0 = new int[2];
        this.f38077p0 = false;
        this.f38083t0 = new Rect();
        this.f38058a = context;
        this.f38060b = p6Var;
        org.telegram.messenger.i0.S(getWindow());
        wg0 wg0Var = new wg0(this, context, 1);
        this.E = wg0Var;
        this.f38069h0 = nh.h.d(1, wg0Var, wg0Var);
        wg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ih0 f41643b;

            {
                this.f41643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41643b.onBackPressed();
                        return;
                    default:
                        this.f41643b.onBackPressed();
                        return;
                }
            }
        });
        wg0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                ih0 ih0Var = ih0.this;
                if (!ih0Var.f38076o0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.i0.v1(ih0Var.R);
                    org.telegram.messenger.i0.h3(new rg0(ih0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        hi.b bVar = new hi.b();
        this.f38070i0 = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.f38071j0 = bVar2;
        bVar2.h = new zg.h(wg0Var);
        bVar2.f48713i = wg0Var;
        dh0 dh0Var = new dh0(this, context, p6Var);
        this.F = dh0Var;
        dh0Var.setClipToPadding(false);
        wg0Var.addView(dh0Var, w7.b6.e(-1, -1, 119));
        e eVar = new e(this, 25);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(wg0Var, eVar);
        eh0 eh0Var = new eh0(this, context, p6Var);
        this.J = eh0Var;
        eh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ih0 f41643b;

            {
                this.f41643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41643b.onBackPressed();
                        return;
                    default:
                        this.f41643b.onBackPressed();
                        return;
                }
            }
        });
        eh0Var.setOnItemClickListener(new g(this, 17));
        eh0Var.setOnScrollListener(new h3(this, 19));
        eh0Var.setItemAnimator(new ci.o(null, eh0Var, p6Var));
        jg.g1 g1Var = new jg.g1(this, 2);
        this.L = g1Var;
        g1Var.O = new jg.h1(this, 7);
        eh0Var.setLayoutManager(g1Var);
        eh0Var.i(new dh.g(10));
        vg0 vg0Var = new vg0(this, context, p6Var, 0);
        this.K = vg0Var;
        eh0Var.setAdapter(vg0Var);
        eh0Var.setVerticalScrollBarEnabled(false);
        eh0Var.setOverScrollMode(2);
        dh0Var.addView(eh0Var, w7.b6.c(-2.0f, -1));
        wg0 wg0Var2 = new wg0(this, context, 0);
        this.G = wg0Var2;
        wg0Var.addView(wg0Var2, w7.b6.c(-1.0f, -1));
        this.Z = new xg0(this, wg0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        sg.w wVar;
        if (this.f38064d0 == null && k2Var != null) {
            int i10 = this.f38062c;
            org.telegram.messenger.wp.r1(i10).E0();
            FrameLayout frameLayout = new FrameLayout(this.f38058a);
            this.f38063c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f38063c0.setClipToPadding(false);
            this.f38063c0.setPadding(0, 0, 0, org.telegram.messenger.i0.L(24.0f));
            ?? nj0Var = new org.telegram.ui.Components.nj0(5, this.f38062c, getContext(), null, this.f38060b);
            this.f38064d0 = nj0Var;
            nj0Var.setClipChildren(false);
            this.f38064d0.setClipToPadding(false);
            this.f38064d0.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(22.0f));
            this.f38064d0.setDelegate(new bh0(this, k2Var));
            this.f38064d0.setTop(false);
            this.f38064d0.setClipChildren(false);
            this.f38064d0.setClipToPadding(false);
            this.f38064d0.setVisibility(0);
            this.f38064d0.setHint(org.telegram.messenger.dd.L0(2131754443, null));
            this.f38064d0.setBubbleOffset(org.telegram.messenger.i0.L(-25.0f));
            this.f38064d0.setMiniBubblesOffset(org.telegram.messenger.i0.L(2.0f));
            this.F.addView(this.f38063c0, w7.b6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38063c0.addView(this.f38064d0, w7.b6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38064d0.setScaleY(0.4f);
            this.f38064d0.setScaleX(0.4f);
            this.f38064d0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.wp.r1(i10).f19157i8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                s();
            } else {
                org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14797u3);
            }
            zg0 zg0Var = this.f38064d0;
            if (zg0Var != null && !zg0Var.f28875g1) {
                zg0Var.f28875g1 = true;
                zg0Var.f28877h1 = true;
                sg.b0 b0Var = zg0Var.f28900x0;
                if (b0Var != null && (wVar = b0Var.f48295m) != null && !wVar.L1) {
                    wVar.L1 = true;
                    wVar.M1 = true;
                    e21 e21Var = wVar.f37305h0;
                    if (e21Var != null) {
                        e21Var.invalidate();
                    }
                    t11 t11Var = wVar.f37307i0;
                    if (t11Var != null) {
                        t11Var.invalidate();
                    }
                }
            }
            new vh.r2(this.E, false, new s3(this, 12));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        zg0 zg0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f38084u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.k1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        float f7 = 0.0f;
        if (!z10 && (zg0Var = this.f38064d0) != null && this.f38065e0) {
            zg0Var.e();
            if (this.f38064d0.getReactionsWindow() != null && this.f38064d0.getReactionsWindow().f48286a != null) {
                this.f38064d0.getReactionsWindow().f48286a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f38064d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.i0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f38086w = true;
        this.f38081s = !z10;
        this.J.invalidate();
        this.f38088x = true;
        this.f38090y = true;
        float f10 = this.D;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38084u0 = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(8, this, z11));
        this.f38084u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f38084u0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f38084u0.setDuration(350L);
        this.f38084u0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i10 == org.telegram.messenger.at.f14797u3 && (messages_availableeffects = org.telegram.messenger.wp.r1(this.f38062c).f19157i8) != null && !messages_availableeffects.effects.isEmpty()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f38077p0) {
            return;
        }
        this.f38077p0 = true;
        yg0 yg0Var = this.W;
        if (yg0Var != null) {
            yg0Var.invalidate();
        }
        org.telegram.ui.Components.zf zfVar = this.V;
        if (zfVar != null) {
            zfVar.invalidate();
        }
        d(new qg0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.at.f(this.f38062c).n(this, org.telegram.messenger.at.f14797u3);
    }

    public final void e(org.telegram.messenger.kj kjVar) {
        org.telegram.messenger.fj k10 = k(kjVar);
        if (k10 != null) {
            k10.a();
            ArrayList arrayList = k10.d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f((org.telegram.messenger.kj) obj);
            }
            return;
        }
        f(kjVar);
    }

    public final void f(org.telegram.messenger.kj kjVar) {
        org.telegram.ui.Cells.q1 q1Var;
        eh0 eh0Var = this.J;
        if (eh0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < eh0Var.getChildCount()) {
                View childAt = eh0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == kjVar) {
                        break;
                    }
                }
                i11++;
            } else {
                q1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == kjVar) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (q1Var2 == null) {
            eh0Var.getAdapter().g(i12);
            return;
        }
        kjVar.K1 = true;
        q1Var2.s3(kjVar, q1Var2.getCurrentMessagesGroup(), q1Var2.E2(), q1Var2.F2(), q1Var2.x2(), false);
        eh0Var.getAdapter().g(i12);
    }

    public final void g(boolean z10) {
        this.f38079r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f38077p0) {
            return;
        }
        this.f38077p0 = true;
        nh.h.f(false);
        nh.h hVar = this.f38069h0;
        if (hVar != null) {
            hVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.at.f(this.f38062c).n(this, org.telegram.messenger.at.f14797u3);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f38089x0 != null && this.f38091y0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float L = org.telegram.messenger.i0.L(28.0f) + this.f38089x0.f30126c;
            RectF rectF = org.telegram.messenger.i0.P;
            float f15 = L / 2.0f;
            float f16 = f13 - f15;
            float L2 = org.telegram.messenger.i0.L(32.0f) / 2.0f;
            rectF.set(f16, f14 - L2, f13 + f15, f14 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.f38091y0);
            this.f38089x0.c(f16 + org.telegram.messenger.i0.L(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f38077p0;
    }

    public final long j() {
        org.telegram.messenger.kj messageObject;
        if (!this.m0 && this.f38064d0 != null) {
            if (this.f38072k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f16690k;
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

    public final org.telegram.messenger.fj k(org.telegram.messenger.kj kjVar) {
        if (kjVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.O.f(kjVar.d1());
        if (fjVar != null && (fjVar.d.size() <= 1 || fjVar.d(kjVar) == null)) {
            return null;
        }
        return fjVar;
    }

    public final void m(boolean z10) {
        jg.g1 g1Var;
        int i10;
        eh0 eh0Var = this.J;
        if (eh0Var != null && eh0Var.getAdapter() != null && (g1Var = this.L) != null) {
            int b10 = eh0Var.getAdapter().b();
            if (z10) {
                if (b10 > 10) {
                    i10 = b10 % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = b10 - 1;
            }
            g1Var.i1(i10, org.telegram.messenger.i0.L(12.0f), z10);
            this.f38085v0 = z10;
        }
    }

    public final void n(long j10) {
        int i10;
        org.telegram.messenger.kj kjVar;
        TLRPC.TL_availableEffect Y0;
        this.H = j10;
        boolean i11 = this.O.i();
        ArrayList arrayList = this.M;
        if (!i11 && arrayList.size() >= 10) {
            i10 = arrayList.size() % 10;
        } else {
            i10 = 0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
        } else {
            kjVar = null;
        }
        if (kjVar != null) {
            TLRPC.Message message = kjVar.f16690k;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.f38064d0 != null && (Y0 = org.telegram.messenger.wp.r1(this.f38062c).Y0(j10)) != null) {
            this.f38064d0.setSelectedReactionAnimated(sg.o0.e(Y0));
        }
    }

    public final void o(org.telegram.ui.Components.z60 z60Var) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f38060b;
        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        z60Var.R(this.f38071j0, w7.b9.k(p6Var), false);
        ViewGroup viewGroup = z60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.b6.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f38059a0) {
            org.telegram.messenger.i0.v1(getCurrentFocus());
            this.f38059a0 = false;
            return;
        }
        zg0 zg0Var = this.f38064d0;
        if (zg0Var != null && zg0Var.getReactionsWindow() != null) {
            if (!this.f38064d0.getReactionsWindow().C) {
                this.f38064d0.getReactionsWindow().d();
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
        wg0 wg0Var = this.E;
        setContentView(wg0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        wg0Var.setSystemUiVisibility(256);
        org.telegram.messenger.i0.n3(wg0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.fj fjVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
            if (i13 >= size) {
                break;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i13);
            if (kjVar.z2()) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) hVar.f(kjVar.e1());
                if (fjVar2 == null) {
                    fjVar2 = new org.telegram.messenger.fj();
                    fjVar2.f15745n = false;
                    long d12 = kjVar.d1();
                    fjVar2.f15735a = d12;
                    hVar.k(fjVar2, d12);
                }
                ArrayList arrayList3 = fjVar2.d;
                if (fjVar2.d(kjVar) == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            if (((org.telegram.messenger.kj) arrayList3.get(i14)).f1() == kjVar.f1()) {
                                break;
                            }
                            i14++;
                        } else {
                            arrayList3.add(kjVar);
                            break;
                        }
                    }
                }
            } else if (kjVar.e1() != 0) {
                kjVar.f16690k.grouped_id = 0L;
                kjVar.e = 0L;
            }
            i13++;
        }
        for (int i15 = 0; i15 < hVar.m(); i15++) {
            ((org.telegram.messenger.fj) hVar.n(i15)).a();
        }
        ArrayList arrayList4 = this.M;
        arrayList4.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList4.size()) {
            int i17 = this.N;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList4.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f38087w0 == null) {
                    this.f38087w0 = new org.telegram.ui.Cells.q1(getContext(), this.f38062c, true, null, this.f38060b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.f38087w0;
                q1Var2.f22533d6 = false;
                q1Var2.f22559f6 = false;
                q1Var2.f22571g6 = false;
                q1Var2.f22582h6 = false;
                q1Var2.f22594i6 = false;
                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) hVar.f(kjVar2.d1());
                ag.c2 c2Var = q1Var2.T0;
                c2Var.f14397o0 = true;
                ImageReceiver imageReceiver = q1Var2.f22795y7;
                imageReceiver.f14397o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.R7;
                imageReceiver2.f14397o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.D7;
                imageReceiver3.f14397o0 = true;
                if (fjVar3 != null) {
                    ArrayList arrayList5 = fjVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != fjVar3.f15738f.size()) {
                            fjVar3.a();
                        }
                        q1Var2.Rc = 0;
                        int i18 = 0;
                        i11 = 0;
                        while (i18 < arrayList5.size()) {
                            org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) arrayList5.get(i18);
                            org.telegram.messenger.cj d = fjVar3.d(kjVar3);
                            if (d != null && (d.f15166l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                fjVar = fjVar3;
                                q1Var3.r3(kjVar3, fjVar, false, false, false, false);
                                q1Var = q1Var3;
                                i11 += q1Var.Z6;
                            } else {
                                org.telegram.messenger.fj fjVar4 = fjVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                fjVar = fjVar4;
                            }
                            i18++;
                            org.telegram.messenger.fj fjVar5 = fjVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            fjVar3 = fjVar5;
                        }
                        i10 = i16;
                    }
                }
                i10 = i16;
                q1Var2.r3(kjVar2, fjVar3, false, false, false, false);
                c2Var.f14397o0 = false;
                imageReceiver.f14397o0 = false;
                imageReceiver2.f14397o0 = false;
                imageReceiver3.f14397o0 = false;
                q1Var2.L3();
                i11 = q1Var2.Z6;
            }
            this.N = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        eh0 eh0Var = this.J;
        eh0Var.getAdapter().f();
        int b10 = eh0Var.getAdapter().b();
        if (b10 > 10) {
            i12 = b10 % 10;
        }
        this.L.i1(i12, org.telegram.messenger.i0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.zf q(org.telegram.ui.Components.zf zfVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = zfVar;
        int[] iArr = this.f38075n0;
        zfVar.getLocationOnScreen(iArr);
        yg0 yg0Var = new yg0(this, getContext(), zfVar.f33127b, this.f38060b, zfVar, z10);
        this.W = yg0Var;
        yg0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.zf zfVar2 = this.V;
        yg0 yg0Var2 = this.W;
        yg0Var2.E = zfVar2.E;
        yg0Var2.f33136h0 = zfVar2.f33136h0;
        yg0Var2.f33130c0.t(zfVar2.f33130c0.f25749i, false, true);
        yg0Var2.f33131d0 = zfVar2.f33131d0;
        yg0Var2.setEmoji(zfVar2.f33133f.f25372f[0]);
        yg0Var2.i(zfVar2.f33143s, zfVar2.f33142r, true);
        yg0Var2.P.e(true, zfVar2.P.f30530c);
        yg0Var2.f33146y.e(true, zfVar2.f33146y.f30530c);
        int i10 = zfVar2.I;
        int i11 = zfVar2.J;
        yg0Var2.I = i10;
        yg0Var2.J = i11;
        float f7 = zfVar2.M;
        float f10 = zfVar2.N;
        yg0Var2.M = f7;
        yg0Var2.N = f10;
        this.W.P.e(true, zfVar.P.f30530c);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(zfVar.getWidth(), zfVar.getHeight()));
        org.telegram.ui.Components.zf zfVar3 = this.V;
        zfVar.getHeight();
        this.X = zfVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.zf zfVar4 = this.V;
        zfVar.getHeight();
        iArr[0] = org.telegram.messenger.a30.D(6.0f, width - zfVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.rz0 rz0Var = null;
        if (i10 > 0) {
            rz0Var = new org.telegram.ui.Components.rz0(rh.h8.a1(false, org.telegram.messenger.dd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.f38089x0 = rz0Var;
        if (this.f38091y0 == null) {
            Paint paint = new Paint(1);
            this.f38091y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i11 < arrayList.size()) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i11);
                if (kjVar != null && (message = kjVar.f16690k) != null && (messageMedia = message.media) != null) {
                    if (i10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageMedia.spoiler = z10;
                }
                i11++;
            } else {
                this.K.f();
                return;
            }
        }
    }

    public final void s() {
        if (this.f38065e0) {
            return;
        }
        this.f38067f0 = false;
        this.f38065e0 = true;
        this.f38064d0.p(null, null, true);
        this.f38064d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        this.f38064d0.r(false);
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        nh.h.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.zf zfVar = this.V;
        if (zfVar != null) {
            zfVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.ol0.d(new org.telegram.messenger.k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                ih0 ih0Var = ih0.this;
                hi.b bVar = ih0Var.f38070i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.zf zfVar2 = ih0Var.V;
                if (zfVar2 != null) {
                    zfVar2.setAlpha(alpha);
                }
                ih0Var.e = bitmap;
                Paint paint = new Paint(1);
                ih0Var.h = paint;
                Bitmap bitmap3 = ih0Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                ih0Var.f38066f = bitmapShader;
                paint.setShader(bitmapShader);
                ih0Var.f38074n = new Matrix();
                bVar.a(bitmap2);
                yg.d.c(bVar, ih0Var.E);
                ViewGroup viewGroup = ih0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        wg0 wg0Var = this.G;
        if (wg0Var != null) {
            wg0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j10) {
    }
}

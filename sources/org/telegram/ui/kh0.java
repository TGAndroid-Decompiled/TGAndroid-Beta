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
public class kh0 extends Dialog implements org.telegram.messenger.us {
    public float D;
    public final yg0 E;
    public final fh0 F;
    public final yg0 G;
    public long H;
    public org.telegram.ui.Components.d5 I;
    public final gh0 J;
    public final xg0 K;
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
    public ah0 W;
    public int X;
    public ViewGroup Y;
    public final zg0 Z;
    public final Context f38828a;
    public boolean f38829a0;
    public final org.telegram.ui.ActionBar.p6 f38830b;
    public float f38831b0;
    public final int f38832c;
    public FrameLayout f38833c0;
    public i0.c d;
    public bh0 f38834d0;
    public Bitmap e;
    public boolean f38835e0;
    public BitmapShader f38836f;
    public boolean f38837f0;
    public boolean f38838g0;
    public Paint h;
    public final nh.h f38839h0;
    public final hi.b f38840i0;
    public final tg.b f38841j0;
    public RectF f38842k0;
    public boolean f38843l0;
    public boolean m0;
    public Matrix f38844n;
    public final int[] f38845n0;
    public boolean f38846o0;
    public boolean f38847p0;
    public org.telegram.ui.Cells.q1 f38848q0;
    public boolean f38849r;
    public float f38850r0;
    public boolean f38851s;
    public float f38852s0;
    public final Rect f38853t0;
    public ValueAnimator f38854u0;
    public boolean f38855v0;
    public boolean f38856w;
    public org.telegram.ui.Cells.q1 f38857w0;
    public boolean f38858x;
    public org.telegram.ui.Components.qz0 f38859x0;
    public boolean f38860y;
    public Paint f38861y0;

    public kh0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 2131755352);
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.f38832c = i10;
        this.d = i0.c.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f38845n0 = new int[2];
        this.f38847p0 = false;
        this.f38853t0 = new Rect();
        this.f38828a = context;
        this.f38830b = p6Var;
        org.telegram.messenger.i0.S(getWindow());
        yg0 yg0Var = new yg0(this, context, 1);
        this.E = yg0Var;
        this.f38839h0 = nh.h.d(1, yg0Var, yg0Var);
        yg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final kh0 f42729b;

            {
                this.f42729b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42729b.onBackPressed();
                        return;
                    default:
                        this.f42729b.onBackPressed();
                        return;
                }
            }
        });
        yg0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                kh0 kh0Var = kh0.this;
                if (!kh0Var.f38846o0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.i0.v1(kh0Var.R);
                    org.telegram.messenger.i0.h3(new tg0(kh0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        hi.b bVar = new hi.b();
        this.f38840i0 = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.f38841j0 = bVar2;
        bVar2.f48700f = new zg.h(yg0Var);
        bVar2.f48701g = yg0Var;
        fh0 fh0Var = new fh0(this, context, p6Var);
        this.F = fh0Var;
        fh0Var.setClipToPadding(false);
        yg0Var.addView(fh0Var, w7.b6.e(-1, -1, 119));
        e eVar = new e(this, 24);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(yg0Var, eVar);
        gh0 gh0Var = new gh0(this, context, p6Var);
        this.J = gh0Var;
        gh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final kh0 f42729b;

            {
                this.f42729b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42729b.onBackPressed();
                        return;
                    default:
                        this.f42729b.onBackPressed();
                        return;
                }
            }
        });
        gh0Var.setOnItemClickListener(new g(this, 17));
        gh0Var.setOnScrollListener(new h3(this, 19));
        gh0Var.setItemAnimator(new ci.o(null, gh0Var, p6Var));
        jg.g1 g1Var = new jg.g1(this, 2);
        this.L = g1Var;
        g1Var.O = new jg.h1(this, 7);
        gh0Var.setLayoutManager(g1Var);
        gh0Var.i(new dh.g(10));
        xg0 xg0Var = new xg0(this, context, p6Var, 0);
        this.K = xg0Var;
        gh0Var.setAdapter(xg0Var);
        gh0Var.setVerticalScrollBarEnabled(false);
        gh0Var.setOverScrollMode(2);
        fh0Var.addView(gh0Var, w7.b6.c(-2.0f, -1));
        yg0 yg0Var2 = new yg0(this, context, 0);
        this.G = yg0Var2;
        yg0Var.addView(yg0Var2, w7.b6.c(-1.0f, -1));
        this.Z = new zg0(this, yg0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        sg.w wVar;
        if (this.f38834d0 == null && k2Var != null) {
            int i10 = this.f38832c;
            org.telegram.messenger.vp.r1(i10).E0();
            FrameLayout frameLayout = new FrameLayout(this.f38828a);
            this.f38833c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f38833c0.setClipToPadding(false);
            this.f38833c0.setPadding(0, 0, 0, org.telegram.messenger.i0.L(24.0f));
            ?? mj0Var = new org.telegram.ui.Components.mj0(5, this.f38832c, getContext(), null, this.f38830b);
            this.f38834d0 = mj0Var;
            mj0Var.setClipChildren(false);
            this.f38834d0.setClipToPadding(false);
            this.f38834d0.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(22.0f));
            this.f38834d0.setDelegate(new dh0(this, k2Var));
            this.f38834d0.setTop(false);
            this.f38834d0.setClipChildren(false);
            this.f38834d0.setClipToPadding(false);
            this.f38834d0.setVisibility(0);
            this.f38834d0.setHint(org.telegram.messenger.cd.L0(2131754443, null));
            this.f38834d0.setBubbleOffset(org.telegram.messenger.i0.L(-25.0f));
            this.f38834d0.setMiniBubblesOffset(org.telegram.messenger.i0.L(2.0f));
            this.F.addView(this.f38833c0, w7.b6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38833c0.addView(this.f38834d0, w7.b6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38834d0.setScaleY(0.4f);
            this.f38834d0.setScaleX(0.4f);
            this.f38834d0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.vp.r1(i10).f18814i8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                s();
            } else {
                org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19701u3);
            }
            bh0 bh0Var = this.f38834d0;
            if (bh0Var != null && !bh0Var.f28514g1) {
                bh0Var.f28514g1 = true;
                bh0Var.f28516h1 = true;
                sg.b0 b0Var = bh0Var.f28539x0;
                if (b0Var != null && (wVar = b0Var.f48284m) != null && !wVar.L1) {
                    wVar.L1 = true;
                    wVar.M1 = true;
                    g21 g21Var = wVar.f38129h0;
                    if (g21Var != null) {
                        g21Var.invalidate();
                    }
                    v11 v11Var = wVar.f38131i0;
                    if (v11Var != null) {
                        v11Var.invalidate();
                    }
                }
            }
            new vh.r2(this.E, false, new s3(this, 12));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        bh0 bh0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f38854u0;
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
        if (!z10 && (bh0Var = this.f38834d0) != null && this.f38835e0) {
            bh0Var.e();
            if (this.f38834d0.getReactionsWindow() != null && this.f38834d0.getReactionsWindow().f48275a != null) {
                this.f38834d0.getReactionsWindow().f48275a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f38834d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.i0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f38856w = true;
        this.f38851s = !z10;
        this.J.invalidate();
        this.f38858x = true;
        this.f38860y = true;
        float f10 = this.D;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38854u0 = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(8, this, z11));
        this.f38854u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f38854u0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f38854u0.setDuration(350L);
        this.f38854u0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i10 == org.telegram.messenger.zs.f19701u3 && (messages_availableeffects = org.telegram.messenger.vp.r1(this.f38832c).f18814i8) != null && !messages_availableeffects.effects.isEmpty()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f38847p0) {
            return;
        }
        this.f38847p0 = true;
        ah0 ah0Var = this.W;
        if (ah0Var != null) {
            ah0Var.invalidate();
        }
        org.telegram.ui.Components.zf zfVar = this.V;
        if (zfVar != null) {
            zfVar.invalidate();
        }
        d(new sg0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.zs.f(this.f38832c).n(this, org.telegram.messenger.zs.f19701u3);
    }

    public final void e(org.telegram.messenger.jj jjVar) {
        org.telegram.messenger.ej k10 = k(jjVar);
        if (k10 != null) {
            k10.a();
            ArrayList arrayList = k10.d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f((org.telegram.messenger.jj) obj);
            }
            return;
        }
        f(jjVar);
    }

    public final void f(org.telegram.messenger.jj jjVar) {
        org.telegram.ui.Cells.q1 q1Var;
        gh0 gh0Var = this.J;
        if (gh0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < gh0Var.getChildCount()) {
                View childAt = gh0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == jjVar) {
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
            if (arrayList.get(i10) == jjVar) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (q1Var2 == null) {
            gh0Var.getAdapter().g(i12);
            return;
        }
        jjVar.K1 = true;
        q1Var2.s3(jjVar, q1Var2.getCurrentMessagesGroup(), q1Var2.E2(), q1Var2.F2(), q1Var2.x2(), false);
        gh0Var.getAdapter().g(i12);
    }

    public final void g(boolean z10) {
        this.f38849r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f38847p0) {
            return;
        }
        this.f38847p0 = true;
        nh.h.f(false);
        nh.h hVar = this.f38839h0;
        if (hVar != null) {
            hVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.zs.f(this.f38832c).n(this, org.telegram.messenger.zs.f19701u3);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f38859x0 != null && this.f38861y0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float L = org.telegram.messenger.i0.L(28.0f) + this.f38859x0.f29774c;
            RectF rectF = org.telegram.messenger.i0.P;
            float f15 = L / 2.0f;
            float f16 = f13 - f15;
            float L2 = org.telegram.messenger.i0.L(32.0f) / 2.0f;
            rectF.set(f16, f14 - L2, f13 + f15, f14 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.f38861y0);
            this.f38859x0.c(f16 + org.telegram.messenger.i0.L(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f38847p0;
    }

    public final long j() {
        org.telegram.messenger.jj messageObject;
        if (!this.m0 && this.f38834d0 != null) {
            if (this.f38842k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f16337k;
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

    public final org.telegram.messenger.ej k(org.telegram.messenger.jj jjVar) {
        if (jjVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.O.f(jjVar.d1());
        if (ejVar != null && (ejVar.d.size() <= 1 || ejVar.d(jjVar) == null)) {
            return null;
        }
        return ejVar;
    }

    public final void m(boolean z10) {
        jg.g1 g1Var;
        int i10;
        gh0 gh0Var = this.J;
        if (gh0Var != null && gh0Var.getAdapter() != null && (g1Var = this.L) != null) {
            int b10 = gh0Var.getAdapter().b();
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
            this.f38855v0 = z10;
        }
    }

    public final void n(long j10) {
        int i10;
        org.telegram.messenger.jj jjVar;
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
            jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
        } else {
            jjVar = null;
        }
        if (jjVar != null) {
            TLRPC.Message message = jjVar.f16337k;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.f38834d0 != null && (Y0 = org.telegram.messenger.vp.r1(this.f38832c).Y0(j10)) != null) {
            this.f38834d0.setSelectedReactionAnimated(sg.o0.e(Y0));
        }
    }

    public final void o(org.telegram.ui.Components.z60 z60Var) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f38830b;
        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        z60Var.R(this.f38841j0, w7.b9.k(p6Var), false);
        ViewGroup viewGroup = z60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.b6.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f38829a0) {
            org.telegram.messenger.i0.v1(getCurrentFocus());
            this.f38829a0 = false;
            return;
        }
        bh0 bh0Var = this.f38834d0;
        if (bh0Var != null && bh0Var.getReactionsWindow() != null) {
            if (!this.f38834d0.getReactionsWindow().C) {
                this.f38834d0.getReactionsWindow().d();
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
        yg0 yg0Var = this.E;
        setContentView(yg0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        yg0Var.setSystemUiVisibility(256);
        org.telegram.messenger.i0.n3(yg0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.ej ejVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
            if (i13 >= size) {
                break;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i13);
            if (jjVar.z2()) {
                org.telegram.messenger.ej ejVar2 = (org.telegram.messenger.ej) hVar.f(jjVar.e1());
                if (ejVar2 == null) {
                    ejVar2 = new org.telegram.messenger.ej();
                    ejVar2.f15404n = false;
                    long d12 = jjVar.d1();
                    ejVar2.f15394a = d12;
                    hVar.k(ejVar2, d12);
                }
                ArrayList arrayList3 = ejVar2.d;
                if (ejVar2.d(jjVar) == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            if (((org.telegram.messenger.jj) arrayList3.get(i14)).f1() == jjVar.f1()) {
                                break;
                            }
                            i14++;
                        } else {
                            arrayList3.add(jjVar);
                            break;
                        }
                    }
                }
            } else if (jjVar.e1() != 0) {
                jjVar.f16337k.grouped_id = 0L;
                jjVar.e = 0L;
            }
            i13++;
        }
        for (int i15 = 0; i15 < hVar.m(); i15++) {
            ((org.telegram.messenger.ej) hVar.n(i15)).a();
        }
        ArrayList arrayList4 = this.M;
        arrayList4.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList4.size()) {
            int i17 = this.N;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList4.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f38857w0 == null) {
                    this.f38857w0 = new org.telegram.ui.Cells.q1(getContext(), this.f38832c, true, null, this.f38830b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.f38857w0;
                q1Var2.f22532d6 = false;
                q1Var2.f22558f6 = false;
                q1Var2.f22570g6 = false;
                q1Var2.f22581h6 = false;
                q1Var2.f22593i6 = false;
                org.telegram.messenger.ej ejVar3 = (org.telegram.messenger.ej) hVar.f(jjVar2.d1());
                ag.c2 c2Var = q1Var2.T0;
                c2Var.f14396o0 = true;
                ImageReceiver imageReceiver = q1Var2.f22794y7;
                imageReceiver.f14396o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.R7;
                imageReceiver2.f14396o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.D7;
                imageReceiver3.f14396o0 = true;
                if (ejVar3 != null) {
                    ArrayList arrayList5 = ejVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != ejVar3.f15397f.size()) {
                            ejVar3.a();
                        }
                        q1Var2.Rc = 0;
                        int i18 = 0;
                        i11 = 0;
                        while (i18 < arrayList5.size()) {
                            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList5.get(i18);
                            org.telegram.messenger.bj d = ejVar3.d(jjVar3);
                            if (d != null && (d.f14783l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                ejVar = ejVar3;
                                q1Var3.r3(jjVar3, ejVar, false, false, false, false);
                                q1Var = q1Var3;
                                i11 += q1Var.Z6;
                            } else {
                                org.telegram.messenger.ej ejVar4 = ejVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                ejVar = ejVar4;
                            }
                            i18++;
                            org.telegram.messenger.ej ejVar5 = ejVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            ejVar3 = ejVar5;
                        }
                        i10 = i16;
                    }
                }
                i10 = i16;
                q1Var2.r3(jjVar2, ejVar3, false, false, false, false);
                c2Var.f14396o0 = false;
                imageReceiver.f14396o0 = false;
                imageReceiver2.f14396o0 = false;
                imageReceiver3.f14396o0 = false;
                q1Var2.L3();
                i11 = q1Var2.Z6;
            }
            this.N = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        gh0 gh0Var = this.J;
        gh0Var.getAdapter().f();
        int b10 = gh0Var.getAdapter().b();
        if (b10 > 10) {
            i12 = b10 % 10;
        }
        this.L.i1(i12, org.telegram.messenger.i0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.zf q(org.telegram.ui.Components.zf zfVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = zfVar;
        int[] iArr = this.f38845n0;
        zfVar.getLocationOnScreen(iArr);
        ah0 ah0Var = new ah0(this, getContext(), zfVar.f33031b, this.f38830b, zfVar, z10);
        this.W = ah0Var;
        ah0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.zf zfVar2 = this.V;
        ah0 ah0Var2 = this.W;
        ah0Var2.E = zfVar2.E;
        ah0Var2.f33040h0 = zfVar2.f33040h0;
        ah0Var2.f33034c0.t(zfVar2.f33034c0.f25700i, false, true);
        ah0Var2.f33035d0 = zfVar2.f33035d0;
        ah0Var2.setEmoji(zfVar2.f33037f.f25301f[0]);
        ah0Var2.i(zfVar2.f33047s, zfVar2.f33046r, true);
        ah0Var2.P.e(true, zfVar2.P.f30445c);
        ah0Var2.f33050y.e(true, zfVar2.f33050y.f30445c);
        int i10 = zfVar2.I;
        int i11 = zfVar2.J;
        ah0Var2.I = i10;
        ah0Var2.J = i11;
        float f7 = zfVar2.M;
        float f10 = zfVar2.N;
        ah0Var2.M = f7;
        ah0Var2.N = f10;
        this.W.P.e(true, zfVar.P.f30445c);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(zfVar.getWidth(), zfVar.getHeight()));
        org.telegram.ui.Components.zf zfVar3 = this.V;
        zfVar.getHeight();
        this.X = zfVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.zf zfVar4 = this.V;
        zfVar.getHeight();
        iArr[0] = org.telegram.messenger.z20.D(6.0f, width - zfVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.qz0 qz0Var = null;
        if (i10 > 0) {
            qz0Var = new org.telegram.ui.Components.qz0(rh.h8.Z0(false, org.telegram.messenger.cd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.f38859x0 = qz0Var;
        if (this.f38861y0 == null) {
            Paint paint = new Paint(1);
            this.f38861y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i11 < arrayList.size()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
                if (jjVar != null && (message = jjVar.f16337k) != null && (messageMedia = message.media) != null) {
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
        if (this.f38835e0) {
            return;
        }
        this.f38837f0 = false;
        this.f38835e0 = true;
        this.f38834d0.p(null, null, true);
        this.f38834d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        this.f38834d0.r(false);
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
        org.telegram.ui.Components.nl0.d(new org.telegram.messenger.j20() {
            @Override
            public final void a(Object obj, Object obj2) {
                kh0 kh0Var = kh0.this;
                hi.b bVar = kh0Var.f38840i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.zf zfVar2 = kh0Var.V;
                if (zfVar2 != null) {
                    zfVar2.setAlpha(alpha);
                }
                kh0Var.e = bitmap;
                Paint paint = new Paint(1);
                kh0Var.h = paint;
                Bitmap bitmap3 = kh0Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                kh0Var.f38836f = bitmapShader;
                paint.setShader(bitmapShader);
                kh0Var.f38844n = new Matrix();
                bVar.a(bitmap2);
                yg.d.c(bVar, kh0Var.E);
                ViewGroup viewGroup = kh0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        yg0 yg0Var = this.G;
        if (yg0Var != null) {
            yg0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j10) {
    }
}

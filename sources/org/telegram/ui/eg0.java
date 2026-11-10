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
public class eg0 extends Dialog implements org.telegram.messenger.ls {
    public float D;
    public final sf0 E;
    public final zf0 F;
    public final sf0 G;
    public long H;
    public org.telegram.ui.Components.f5 I;
    public final ag0 J;
    public final fi.w K;
    public final org.telegram.ui.Components.u90 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.q1 P;
    public int Q;
    public org.telegram.ui.Components.we R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.kd U;
    public org.telegram.ui.Components.cg V;
    public uf0 W;
    public int X;
    public ViewGroup Y;
    public final tf0 Z;
    public final Context f45268a;
    public boolean f45269a0;
    public final org.telegram.ui.ActionBar.h6 f45270b;
    public float f45271b0;
    public final int f45272c;
    public FrameLayout f45273c0;
    public i0.b d;
    public vf0 f45274d0;
    public Bitmap f45275e;
    public boolean f45276e0;
    public BitmapShader f45277f;
    public boolean f45278f0;
    public boolean f45279g0;
    public Paint h;
    public final xh.e f45280h0;
    public final ri.b f45281i0;
    public final dh.c f45282j0;
    public RectF f45283k0;
    public boolean f45284l0;
    public boolean m0;
    public Matrix f45285n;
    public final int[] f45286n0;
    public boolean f45287o0;
    public boolean f45288p0;
    public org.telegram.ui.Cells.q1 f45289q0;
    public boolean f45290r;
    public float f45291r0;
    public boolean f45292s;
    public float f45293s0;
    public final Rect f45294t0;
    public ValueAnimator f45295u0;
    public boolean f45296v0;
    public boolean f45297w;
    public org.telegram.ui.Cells.q1 f45298w0;
    public boolean f45299x;
    public org.telegram.ui.Components.my0 f45300x0;
    public boolean f45301y;
    public Paint f45302y0;

    public eg0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 2131755352);
        int i7 = org.telegram.messenger.p10.f24474s0;
        this.f45272c = i7;
        this.d = i0.b.f15121e;
        this.M = new ArrayList();
        this.O = new a0.h();
        this.S = new Paint(1);
        this.f45286n0 = new int[2];
        this.f45288p0 = false;
        this.f45294t0 = new Rect();
        this.f45268a = context;
        this.f45270b = h6Var;
        org.telegram.messenger.g0.S(getWindow());
        sf0 sf0Var = new sf0(this, context, 1);
        this.E = sf0Var;
        this.f45280h0 = xh.e.d(1, sf0Var, sf0Var);
        sf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f49031b;

            {
                this.f49031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f49031b.onBackPressed();
                        return;
                    default:
                        this.f49031b.onBackPressed();
                        return;
                }
            }
        });
        sf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                eg0 eg0Var = eg0.this;
                if (!eg0Var.f45287o0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(eg0Var.R);
                    org.telegram.messenger.g0.i3(new of0(eg0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        ri.b bVar = new ri.b();
        this.f45281i0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f45282j0 = cVar;
        cVar.h = new jh.k(sf0Var);
        cVar.f8711i = sf0Var;
        zf0 zf0Var = new zf0(this, context, h6Var);
        this.F = zf0Var;
        zf0Var.setClipToPadding(false);
        sf0Var.addView(zf0Var, c8.ha.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(sf0Var, fVar);
        ag0 ag0Var = new ag0(this, context, h6Var);
        this.J = ag0Var;
        ag0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f49031b;

            {
                this.f49031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f49031b.onBackPressed();
                        return;
                    default:
                        this.f49031b.onBackPressed();
                        return;
                }
            }
        });
        ag0Var.setOnItemClickListener(new h(this, 17));
        ag0Var.setOnScrollListener(new g3(this, 19));
        ag0Var.setItemAnimator(new mi.l(null, ag0Var, h6Var));
        org.telegram.ui.Components.u90 u90Var = new org.telegram.ui.Components.u90(this, 1);
        this.L = u90Var;
        u90Var.O = new ai.l(this, 11);
        ag0Var.setLayoutManager(u90Var);
        ag0Var.i(new di.k(13));
        fi.w wVar = new fi.w(this, context, h6Var, 1);
        this.K = wVar;
        ag0Var.setAdapter(wVar);
        ag0Var.setVerticalScrollBarEnabled(false);
        ag0Var.setOverScrollMode(2);
        zf0Var.addView(ag0Var, c8.ha.c(-2.0f, -1));
        sf0 sf0Var2 = new sf0(this, context, 0);
        this.G = sf0Var2;
        sf0Var.addView(sf0Var2, c8.ha.c(-1.0f, -1));
        this.Z = new tf0(this, sf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        ch.w wVar;
        if (this.f45274d0 == null && f2Var != null) {
            int i7 = this.f45272c;
            org.telegram.messenger.qp.s1(i7).E0();
            FrameLayout frameLayout = new FrameLayout(this.f45268a);
            this.f45273c0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f45273c0.setClipToPadding(false);
            this.f45273c0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? ii0Var = new org.telegram.ui.Components.ii0(5, this.f45272c, getContext(), null, this.f45270b);
            this.f45274d0 = ii0Var;
            ii0Var.setClipChildren(false);
            this.f45274d0.setClipToPadding(false);
            this.f45274d0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f45274d0.setDelegate(new xf0(this, f2Var));
            this.f45274d0.setTop(false);
            this.f45274d0.setClipChildren(false);
            this.f45274d0.setClipToPadding(false);
            this.f45274d0.setVisibility(0);
            this.f45274d0.setHint(org.telegram.messenger.id.M0(2131754443, null));
            this.f45274d0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f45274d0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.F.addView(this.f45273c0, c8.ha.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f45273c0.addView(this.f45274d0, c8.ha.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f45274d0.setScaleY(0.4f);
            this.f45274d0.setScaleX(0.4f);
            this.f45274d0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.qp.s1(i7).f24806h8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                s();
            } else {
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25091u3);
            }
            vf0 vf0Var = this.f45274d0;
            if (vf0Var != null && !vf0Var.f34652g1) {
                vf0Var.f34652g1 = true;
                vf0Var.f34654h1 = true;
                ch.b0 b0Var = vf0Var.f34677x0;
                if (b0Var != null && (wVar = b0Var.f6196m) != null && !wVar.L1) {
                    wVar.L1 = true;
                    wVar.M1 = true;
                    r01 r01Var = wVar.f50036h0;
                    if (r01Var != null) {
                        r01Var.invalidate();
                    }
                    h01 h01Var = wVar.f50038i0;
                    if (h01Var != null) {
                        h01Var.invalidate();
                    }
                }
            }
            new fi.q3(this.E, false, new r3(this, 13));
        }
    }

    public final void d(Runnable runnable, boolean z9) {
        boolean z10;
        vf0 vf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f45295u0;
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
        if (!z9 && (vf0Var = this.f45274d0) != null && this.f45276e0) {
            vf0Var.e();
            if (this.f45274d0.getReactionsWindow() != null && this.f45274d0.getReactionsWindow().f6186a != null) {
                this.f45274d0.getReactionsWindow().f6186a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f45274d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f45297w = true;
        this.f45292s = !z9;
        this.J.invalidate();
        this.f45299x = true;
        this.f45301y = true;
        float f11 = this.D;
        if (z9) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f45295u0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(10, this, z10));
        this.f45295u0.addListener(new org.telegram.ui.ActionBar.g(this, z9, z10, runnable));
        this.f45295u0.setInterpolator(org.telegram.ui.Components.wq.h);
        this.f45295u0.setDuration(350L);
        this.f45295u0.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 == org.telegram.messenger.qs.f25091u3 && (messages_availableeffects = org.telegram.messenger.qp.s1(this.f45272c).f24806h8) != null && !messages_availableeffects.effects.isEmpty()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f45288p0) {
            return;
        }
        this.f45288p0 = true;
        uf0 uf0Var = this.W;
        if (uf0Var != null) {
            uf0Var.invalidate();
        }
        org.telegram.ui.Components.cg cgVar = this.V;
        if (cgVar != null) {
            cgVar.invalidate();
        }
        d(new nf0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.qs.f(this.f45272c).n(this, org.telegram.messenger.qs.f25091u3);
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
        ag0 ag0Var = this.J;
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
            ag0Var.getAdapter().g(i11);
            return;
        }
        ijVar.K1 = true;
        q1Var2.w3(ijVar, q1Var2.getCurrentMessagesGroup(), q1Var2.H2(), q1Var2.I2(), q1Var2.z2(), false);
        ag0Var.getAdapter().g(i11);
    }

    public final void g(boolean z9) {
        this.f45290r = z9;
        dismiss();
    }

    public final void h() {
        if (this.f45288p0) {
            return;
        }
        this.f45288p0 = true;
        xh.e.f(false);
        xh.e eVar = this.f45280h0;
        if (eVar != null) {
            eVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.qs.f(this.f45272c).n(this, org.telegram.messenger.qs.f25091u3);
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f45300x0 != null && this.f45302y0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.f45300x0.f36133c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f16 = L / 2.0f;
            float f17 = f14 - f16;
            float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
            rectF.set(f17, f15 - L2, f14 + f16, f15 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.f45302y0);
            this.f45300x0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f45288p0;
    }

    public final long j() {
        org.telegram.messenger.ij messageObject;
        if (!this.m0 && this.f45274d0 != null) {
            if (this.f45283k0 != null) {
                this.m0 = true;
                return this.H;
            }
            org.telegram.ui.Cells.q1 q1Var = this.P;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f23266k;
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
        org.telegram.ui.Components.u90 u90Var;
        int i7;
        ag0 ag0Var = this.J;
        if (ag0Var != null && ag0Var.getAdapter() != null && (u90Var = this.L) != null) {
            int b10 = ag0Var.getAdapter().b();
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
            this.f45296v0 = z9;
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
            TLRPC.Message message = ijVar.f23266k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f45274d0 != null && (Z0 = org.telegram.messenger.qp.s1(this.f45272c).Z0(j3)) != null) {
            this.f45274d0.setSelectedReactionAnimated(ch.o0.e(Z0));
        }
    }

    public final void o(org.telegram.ui.Components.k60 k60Var) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f45270b;
        k60Var.T(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        k60Var.Q(this.f45282j0, c8.g0.k(h6Var), false);
        ViewGroup viewGroup = k60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, c8.ha.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f45269a0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f45269a0 = false;
            return;
        }
        vf0 vf0Var = this.f45274d0;
        if (vf0Var != null && vf0Var.getReactionsWindow() != null) {
            if (!this.f45274d0.getReactionsWindow().C) {
                this.f45274d0.getReactionsWindow().d();
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
        sf0 sf0Var = this.E;
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
        org.telegram.messenger.g0.o3(sf0Var, !org.telegram.ui.ActionBar.m6.I.q());
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
                    djVar2.f22049n = false;
                    long c12 = ijVar.c1();
                    djVar2.f22038a = c12;
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
                ijVar.f23266k.grouped_id = 0L;
                ijVar.f23238e = 0L;
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
                if (this.f45298w0 == null) {
                    this.f45298w0 = new org.telegram.ui.Cells.q1(getContext(), this.f45272c, true, null, this.f45270b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.f45298w0;
                q1Var2.f29843e6 = false;
                q1Var2.f29869g6 = false;
                q1Var2.f29883h6 = false;
                q1Var2.f29896i6 = false;
                q1Var2.f29907j6 = false;
                org.telegram.messenger.dj djVar3 = (org.telegram.messenger.dj) hVar.f(ijVar2.c1());
                di.z2 z2Var = q1Var2.T0;
                z2Var.f21213o0 = true;
                ImageReceiver imageReceiver = q1Var2.f30109z7;
                imageReceiver.f21213o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.S7;
                imageReceiver2.f21213o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.E7;
                imageReceiver3.f21213o0 = true;
                if (djVar3 != null) {
                    ArrayList arrayList5 = djVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != djVar3.f22042f.size()) {
                            djVar3.a();
                        }
                        q1Var2.Tc = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList5.get(i17);
                            org.telegram.messenger.aj d = djVar3.d(ijVar3);
                            if (d != null && (d.f21455l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                djVar = djVar3;
                                q1Var3.v3(ijVar3, djVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.f29791a7;
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
                z2Var.f21213o0 = false;
                imageReceiver.f21213o0 = false;
                imageReceiver2.f21213o0 = false;
                imageReceiver3.f21213o0 = false;
                q1Var2.P3();
                i10 = q1Var2.f29791a7;
            }
            this.N = Math.max(i16, i10);
            i15 = i7 + 1;
        }
        ag0 ag0Var = this.J;
        ag0Var.getAdapter().f();
        int b10 = ag0Var.getAdapter().b();
        if (b10 > 10) {
            i11 = b10 % 10;
        }
        this.L.i1(i11, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.cg q(org.telegram.ui.Components.cg cgVar, boolean z9, View.OnClickListener onClickListener) {
        this.V = cgVar;
        int[] iArr = this.f45286n0;
        cgVar.getLocationOnScreen(iArr);
        uf0 uf0Var = new uf0(this, getContext(), cgVar.f32560b, this.f45270b, cgVar, z9);
        this.W = uf0Var;
        uf0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.cg cgVar2 = this.V;
        uf0 uf0Var2 = this.W;
        uf0Var2.E = cgVar2.E;
        uf0Var2.f32570h0 = cgVar2.f32570h0;
        uf0Var2.f32563c0.t(cgVar2.f32563c0.f34193i, false, true);
        uf0Var2.f32564d0 = cgVar2.f32564d0;
        uf0Var2.setEmoji(cgVar2.f32567f.f33464f[0]);
        uf0Var2.i(cgVar2.f32577s, cgVar2.f32576r, true);
        uf0Var2.P.e(true, cgVar2.P.f38854c);
        uf0Var2.f32580y.e(true, cgVar2.f32580y.f38854c);
        int i7 = cgVar2.I;
        int i10 = cgVar2.J;
        uf0Var2.I = i7;
        uf0Var2.J = i10;
        float f10 = cgVar2.M;
        float f11 = cgVar2.N;
        uf0Var2.M = f10;
        uf0Var2.N = f11;
        this.W.P.e(true, cgVar.P.f38854c);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(cgVar.getWidth(), cgVar.getHeight()));
        org.telegram.ui.Components.cg cgVar3 = this.V;
        cgVar.getHeight();
        this.X = cgVar3.m();
        int i11 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.cg cgVar4 = this.V;
        cgVar.getHeight();
        iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - cgVar4.m(), i11);
        return this.W;
    }

    public final void r(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z9;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.my0 my0Var = null;
        if (i7 > 0) {
            my0Var = new org.telegram.ui.Components.my0(bi.dd.a1(false, org.telegram.messenger.id.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f45300x0 = my0Var;
        if (this.f45302y0 == null) {
            Paint paint = new Paint(1);
            this.f45302y0 = paint;
            paint.setColor(1073741824);
        }
        this.J.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                if (ijVar != null && (message = ijVar.f23266k) != null && (messageMedia = message.media) != null) {
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
        if (this.f45276e0) {
            return;
        }
        this.f45278f0 = false;
        this.f45276e0 = true;
        this.f45274d0.p(null, null, true);
        this.f45274d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wq.h).start();
        this.f45274d0.r(false);
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        xh.e.f(true);
        super.show();
        final float alpha = this.V.getAlpha();
        org.telegram.ui.Components.cg cgVar = this.V;
        if (cgVar != null) {
            cgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.jk0.d(new org.telegram.messenger.v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                eg0 eg0Var = eg0.this;
                ri.b bVar = eg0Var.f45281i0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.cg cgVar2 = eg0Var.V;
                if (cgVar2 != null) {
                    cgVar2.setAlpha(alpha);
                }
                eg0Var.f45275e = bitmap;
                Paint paint = new Paint(1);
                eg0Var.h = paint;
                Bitmap bitmap3 = eg0Var.f45275e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                eg0Var.f45277f = bitmapShader;
                paint.setShader(bitmapShader);
                eg0Var.f45285n = new Matrix();
                bVar.a(bitmap2);
                ih.d.c(bVar, eg0Var.E);
                ViewGroup viewGroup = eg0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        sf0 sf0Var = this.G;
        if (sf0Var != null) {
            sf0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j3) {
    }
}

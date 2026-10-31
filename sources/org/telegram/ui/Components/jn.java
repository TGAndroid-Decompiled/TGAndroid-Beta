package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
public final class jn extends uh implements org.telegram.ui.ActionBar.k6, tu0, org.telegram.messenger.us {
    public static final int f27409r1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final q30 D;
    public int D0;
    public vy E;
    public int E0;
    public final vh.r2 F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public final int J;
    public int J0;
    public final CharSequence[] K;
    public int K0;
    public final boolean[] L;
    public int L0;
    public int M;
    public final c5.e M0;
    public Editable N;
    public final c5.e N0;
    public Editable O;
    public final c5.e[] O0;
    public Editable P;
    public final ArrayList P0;
    public final ih.t Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final mg.c2 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f27410a0;
    public boolean f27411a1;
    public boolean f27412b0;
    public int f27413b1;
    public boolean f27414c0;
    public int f27415c1;
    public boolean f27416d0;
    public int f27417d1;
    public final boolean f27418e0;
    public boolean f27419e1;
    public boolean f27420f0;
    public boolean f27421f1;
    public boolean f27422g0;
    public org.telegram.ui.Cells.e6 f27423g1;
    public boolean f27424h0;
    public boolean f27425h1;
    public boolean f27426i0;
    public boolean f27427i1;
    public in f27428j0;
    public final Paint f27429j1;
    public int f27430k0;
    public ag.v f27431k1;
    public int f27432l0;
    public int l1;
    public int m0;
    public final ih.g f27433m1;
    public final boolean f27434n;
    public int f27435n0;
    public Drawable f27436n1;
    public int f27437o0;
    public Drawable f27438o1;
    public int f27439p0;
    public int f27440p1;
    public int f27441q0;
    public int f27442q1;
    public final fg.j f27443r;
    public int f27444r0;
    public final org.telegram.ui.w71 f27445s;
    public int f27446s0;
    public int f27447t0;
    public int f27448u0;
    public int f27449v0;
    public final ym f27450w;
    public int f27451w0;
    public final ag.d1 f27452x;
    public int f27453x0;
    public final an f27454y;
    public int f27455y0;
    public int f27456z0;

    public jn(bi biVar, Context context, boolean z10, org.telegram.ui.ActionBar.p6 p6Var, Boolean bool) {
        super(context, p6Var, biVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f27412b0 = true;
        this.f27420f0 = true;
        this.f27422g0 = true;
        this.f27430k0 = -1;
        c5.e eVar = new c5.e(this);
        this.M0 = eVar;
        c5.e eVar2 = new c5.e(this);
        this.N0 = eVar2;
        this.O0 = new c5.e[]{eVar, eVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new mg.c2(this, 27);
        this.V0 = false;
        this.W0 = -1;
        this.f27425h1 = false;
        this.f27427i1 = false;
        Paint paint = new Paint(1);
        this.f27429j1 = paint;
        this.f27433m1 = new ih.g();
        this.f27434n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean q6 = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(this.f30947b.D3).f14863a).q();
        this.I = q6;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f27414c0 = booleanValue;
            this.f27418e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        l0();
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vl, this.f30946a));
        this.f30947b.f24695l3.setDelegate(this);
        fg.j jVar = new fg.j(2, this, context);
        this.f27443r = jVar;
        org.telegram.ui.w71 w71Var = new org.telegram.ui.w71(3, context, null);
        this.f27445s = w71Var;
        setBlur3Capture(w71Var);
        this.d = w71Var;
        this.h = true;
        this.f30949f = true;
        ym ymVar = new ym(this);
        this.f27450w = ymVar;
        w71Var.setItemAnimator(ymVar);
        arrayList.clear();
        ymVar.f47927m = false;
        ymVar.C = false;
        ymVar.o(gr.h);
        ymVar.n(350L);
        w71Var.setClipToPadding(false);
        w71Var.setVerticalScrollBarEnabled(false);
        w71Var.setSections(true);
        ag.d1 d1Var = new ag.d1(this, org.telegram.messenger.i0.L(65.0f) + org.telegram.messenger.i0.f16020m, w71Var, 4);
        this.f27452x = d1Var;
        w71Var.setLayoutManager(d1Var);
        d1Var.O = true;
        new s4.x(new org.telegram.ui.ja(this, 3)).h(w71Var);
        addView(w71Var, w7.b6.e(-1, -1, 51));
        w71Var.setPreserveFocusAfterLayout(true);
        w71Var.setAdapter(jVar);
        w71Var.setOnItemClickListener(new om(this, p6Var, biVar, context));
        w71Var.setOnScrollListener(new ag.u(this, 18));
        q30 q30Var = new q30(context, 4);
        this.D = q30Var;
        q30Var.setAlpha(0.0f);
        q30Var.setVisibility(4);
        addView(q30Var, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(this.f30947b.D3).f18957y7.J.f10700a).f16658c;
        this.Q = new ih.t(this.f30947b.D3);
        org.telegram.messenger.zs.f(this.f30947b.D3).c(this, org.telegram.messenger.zs.f19711w0);
        if (q6) {
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
            ?? sx0Var = new sx0(context, this.f30947b.D3, null, p6Var);
            this.f27454y = sx0Var;
            sx0Var.D = true;
            sx0Var.E = true;
            sx0Var.setHorizontalPadding(org.telegram.messenger.i0.L(24.0f));
            addView((View) sx0Var, w7.b6.e(-2, 160, 51));
        }
        this.F = new vh.r2(this.f30947b.f24695l3, false, null);
        W();
    }

    public static void N(jn jnVar, int i10) {
        q30 q30Var = jnVar.D;
        s4.c1 K = jnVar.f27445s.K(jnVar.f27447t0 + i10);
        if (K != null) {
            View view = K.f47898a;
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f)) {
                    an anVar = jnVar.f27454y;
                    if (anVar != null) {
                        anVar.f();
                    }
                    q30Var.setText(org.telegram.messenger.cd.L0(2131747197, null));
                    q30Var.f(e6Var.getCheckBox(), true);
                    ImageView imageView = q30Var.f29520c;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.i0.L(48.0f));
                    q30Var.setTranslationY(q30Var.getTranslationY() + org.telegram.messenger.i0.L(10.0f));
                }
            }
        }
    }

    public static void O(org.telegram.ui.Components.jn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.O(org.telegram.ui.Components.jn, android.view.View, int):void");
    }

    public static void P(jn jnVar, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        if (jnVar.I && z10) {
            if (jnVar.f27423g1 == e6Var && jnVar.f27411a1 && jnVar.f27425h1) {
                jnVar.Z();
                jnVar.f27411a1 = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = jnVar.f27423g1;
            jnVar.f27423g1 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            fg emojiButton = e6Var.getEmojiButton();
            dg dgVar = dg.e;
            emojiButton.j(dgVar, false);
            org.telegram.ui.w71 w71Var = jnVar.f27445s;
            View F = w71Var.F(e6Var);
            if (F == null) {
                T = null;
            } else {
                T = w71Var.T(F);
            }
            an anVar = jnVar.f27454y;
            if (anVar != null) {
                anVar.f();
                if (T != null) {
                    View view = T.f47898a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && anVar.getDelegate() != view) {
                        anVar.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 != null && e6Var2 != e6Var) {
                if (jnVar.f27411a1) {
                    jnVar.Z();
                    jnVar.c0(false);
                    jnVar.f0();
                }
                e6Var2.setEmojiButtonVisibility(false);
                e6Var2.getEmojiButton().j(dgVar, false);
            }
        }
    }

    public static void Q(jn jnVar, org.telegram.ui.Cells.e6 e6Var) {
        jnVar.f27423g1 = e6Var;
        if (jnVar.f27411a1) {
            jnVar.Z();
            jnVar.f0();
            return;
        }
        jnVar.i0(1);
    }

    public static void R(jn jnVar, int i10) {
        bi biVar;
        org.telegram.ui.ActionBar.k2 k2Var;
        int i11;
        ih.g gVar = jnVar.f27433m1;
        if (gVar.b(i10) != null) {
            ih.f b10 = gVar.b(i10);
            if (b10 != null && (biVar = jnVar.f30947b) != null && (k2Var = biVar.W1) != null) {
                Activity parentActivity = k2Var.getParentActivity();
                if (b10 instanceof jh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((jh.d) b10).f10403b);
                    PhotoViewer.v1().N2(parentActivity, null, null);
                    PhotoViewer.v1().j2(arrayList, 0, 14, false, new rm(jnVar, i10), null);
                    return;
                } else if (b10 instanceof jh.j) {
                    jh.j jVar = (jh.j) b10;
                    org.telegram.ui.lt.p().v(parentActivity);
                    org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
                    ?? obj = new Object();
                    obj.f30655b = jnVar;
                    obj.f30654a = i10;
                    p5.u(obj);
                    org.telegram.ui.lt p9 = org.telegram.ui.lt.p();
                    TLRPC.Document document = jVar.f10419b;
                    if (org.telegram.messenger.jj.H2(document)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    p9.s(document, null, "", null, null, i11, false, jVar.f10420c, jnVar.f30946a, 200);
                    return;
                } else if (b10 instanceof jh.c) {
                    jh.c cVar = (jh.c) b10;
                    String str = cVar.d;
                    jnVar.j0(i10, new org.telegram.ui.rf(1, str, org.telegram.messenger.i0.i0(cVar.e, true, true) + " " + cVar.f10401f), org.telegram.messenger.i0.L(240.0f), org.telegram.messenger.i0.L(60.0f));
                    return;
                } else if (b10 instanceof jh.i) {
                    jh.i iVar = (jh.i) b10;
                    TLRPC.Document F0 = iVar.f10417b.F0();
                    String y12 = org.telegram.messenger.jj.y1(F0);
                    jnVar.j0(i10, new i(y12, org.telegram.messenger.jj.w1(F0) + " - " + org.telegram.messenger.cd.R((int) org.telegram.messenger.jj.H0(F0)), iVar, 1), org.telegram.messenger.i0.L(240.0f), org.telegram.messenger.i0.L(60.0f));
                    return;
                } else if (b10 instanceof jh.h) {
                    jnVar.j0(i10, new di((jh.h) b10, 1), org.telegram.messenger.i0.L(300.0f), (org.telegram.messenger.i0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof jh.e) {
                    jh.e eVar = (jh.e) b10;
                    s4.f0(jnVar.getContext(), jnVar.f30946a, eVar.f10405b, eVar.f10408n, new km(jnVar, i10, 1), new lm(jnVar, i10, 0));
                    return;
                } else {
                    jnVar.e0(i10);
                    return;
                }
            }
            return;
        }
        jnVar.e0(i10);
    }

    public static CharSequence b0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n12 = org.telegram.messenger.i0.n1(charSequence);
        while (TextUtils.indexOf(n12, "\n\n\n") >= 0) {
            n12 = TextUtils.replace(n12, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n12, "\n\n\n") == 0) {
            n12 = TextUtils.replace(n12, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n12;
    }

    public static ag.v g0(org.telegram.ui.ActionBar.k2 k2Var, int i10, org.telegram.messenger.q20 q20Var, tf tfVar) {
        if (k2Var == null) {
            return null;
        }
        ag.v vVar = new ag.v(k2Var.getContext(), k2Var, k2Var.getResourceProvider(), tfVar);
        vVar.T3 = new vm(vVar, q20Var, k2Var);
        vVar.U3 = new wm(q20Var, vVar);
        vVar.a2.g0();
        vVar.x1(1, true);
        vVar.U0(i10);
        vVar.f24715q4 = new mm(q20Var);
        vVar.O1 = new xm(vVar, q20Var, k2Var);
        vVar.P1 = new f2(q20Var, vVar);
        vVar.d1();
        vVar.A0(true);
        vVar.show();
        return vVar;
    }

    private int getAnswersMaxCount() {
        if (this.f27434n) {
            return getMessagesController().S6;
        }
        return ((org.telegram.messenger.l0) getMessagesController().f18957y7.G.f10700a).f16658c;
    }

    private int getCurrentAccount() {
        bi biVar = this.f30947b;
        if (biVar != null) {
            return biVar.D3;
        }
        return org.telegram.messenger.d20.f15147s0;
    }

    private org.telegram.messenger.vp getMessagesController() {
        return org.telegram.messenger.vp.r1(getCurrentAccount());
    }

    @Override
    public final void A() {
        fg.j jVar = this.f27443r;
        if (jVar != null) {
            jVar.f();
        }
        if (this.I) {
            c0(false);
            an anVar = this.f27454y;
            if (anVar != null) {
                anVar.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f27423g1;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.f27423g1.getTextView().clearFocus();
                org.telegram.messenger.i0.v1(this.f27423g1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.B(int, int):void");
    }

    @Override
    public final void G(uh uhVar) {
        bi biVar = this.f30947b;
        try {
            biVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f27434n) {
            biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131744079, null));
        } else if (this.f27418e0) {
            biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131748281, null));
        } else {
            biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131748282, null));
        }
        biVar.K1();
        this.f27452x.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f27445s.y0(1);
    }

    @Override
    public final void K(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int L;
        if (this.I) {
            if (i10 > org.telegram.messenger.i0.L(50.0f) && this.f27419e1 && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                if (z10) {
                    this.f27417d1 = i10;
                    org.telegram.messenger.vp.c1().edit().putInt("kbd_height_land3", this.f27417d1).commit();
                } else {
                    this.f27415c1 = i10;
                    org.telegram.messenger.vp.c1().edit().putInt("kbd_height", this.f27415c1).commit();
                }
            }
            boolean z13 = this.f27411a1;
            bi biVar = this.f30947b;
            vh.r2 r2Var = this.F;
            if (z13) {
                if (z10) {
                    i11 = this.f27417d1;
                } else {
                    i11 = this.f27415c1;
                }
                if (this.f27425h1) {
                    i11 += org.telegram.messenger.i0.L(120.0f);
                }
                int i12 = i11 + org.telegram.messenger.i0.f16021n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = org.telegram.messenger.i0.f16026q.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f27427i1 != this.f27425h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.f27413b1 = layoutParams.height;
                    r2Var.a();
                    biVar.f24695l3.requestLayout();
                    boolean z14 = this.f27427i1;
                    if (z14 != this.f27425h1) {
                        if (z14) {
                            L = -org.telegram.messenger.i0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(120.0f);
                        }
                        T(L);
                    }
                    this.f27427i1 = this.f27425h1;
                }
            }
            if (this.Y0 != i10 || this.Z0 != z10) {
                this.Y0 = i10;
                this.Z0 = z10;
                boolean z15 = this.f27419e1;
                org.telegram.ui.Cells.e6 e6Var = this.f27423g1;
                if (e6Var != null) {
                    if (e6Var.getEditField().isFocused() && r2Var.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f27419e1 = z12;
                } else {
                    this.f27419e1 = false;
                }
                if (this.f27419e1 && this.f27411a1) {
                    i0(0);
                }
                if (this.f27413b1 != 0 && !(z11 = this.f27419e1) && z11 != z15 && !this.f27411a1) {
                    this.f27413b1 = 0;
                    r2Var.a();
                    biVar.f24695l3.requestLayout();
                }
                if (this.f27419e1 && this.G) {
                    this.G = false;
                    org.telegram.messenger.i0.r(this.U0);
                }
            }
        }
    }

    public final void S() {
        an anVar = this.f27454y;
        if (anVar != null) {
            anVar.setDelegate(null);
            anVar.f();
        }
        this.f27445s.setItemAnimator(this.f27450w);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        fg.j jVar = this.f27443r;
        if (i11 == length) {
            jVar.s(this.f27448u0);
        }
        jVar.i(this.f27448u0);
        l0();
        this.f27430k0 = (this.f27447t0 + this.M) - 1;
        jVar.g(this.f27449v0);
        jVar.g(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.eg(this, f7, 2));
        ofFloat.addListener(new qm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10;
        if (!this.f27414c0 && !this.f27410a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.T = false;
        }
        int i10 = this.C0;
        if (i10 < 0) {
            return;
        }
        s4.c1 K = this.f27445s.K(i10);
        if (K == null) {
            this.f27443r.g(this.C0);
            return;
        }
        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) K.f47898a;
        if (!z10) {
            c6Var.setChecked(false);
        }
        c6Var.getCheckBox().f24197a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10;
        int i10;
        int i11;
        if (TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.f27433m1.f8537a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i12]))); i12++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f30947b.W1.getParentActivity());
            boolean z11 = this.f27434n;
            if (z11) {
                i10 = 2131752567;
            } else {
                i10 = 2131752573;
            }
            String L0 = org.telegram.messenger.cd.L0(i10, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            if (z11) {
                i11 = 2131752568;
            } else {
                i11 = 2131752574;
            }
            x1Var.T = org.telegram.messenger.cd.L0(i11, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new t(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void W() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11 = this.f27414c0;
        CharSequence[] charSequenceArr = this.K;
        if (z11) {
            int i13 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.L;
                if (i13 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(b0(charSequenceArr[i13])) && zArr[i13]) {
                    i10++;
                }
                i13++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.f27434n;
        if (z12) {
            i11 = getMessagesController().T6;
        } else {
            i11 = 255;
        }
        if (z12) {
            i12 = getMessagesController().U6;
        } else {
            i12 = 100;
        }
        if ((!TextUtils.isEmpty(b0(this.O)) && this.O.length() > this.S0) || ((!TextUtils.isEmpty(b0(this.P)) && this.P.length() > 200) || TextUtils.isEmpty(b0(this.N)) || this.N.length() > i11)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(b0(charSequenceArr[i14]))) {
                if (charSequenceArr[i14].length() > i12) {
                    i15 = 0;
                    z13 = true;
                    break;
                }
                i15++;
                z13 = true;
            }
            i14++;
        }
        if (i15 < 1 || (this.f27414c0 && i10 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.f27433m1.f8537a.size() <= 0) {
            this.f27424h0 = true;
        } else {
            this.f27424h0 = false;
        }
        boolean z14 = this.f27424h0;
        bi biVar = this.f30947b;
        biVar.f21610q0 = z14;
        this.X0 = z10;
        biVar.K1();
    }

    public final void X(org.telegram.ui.Cells.p8 p8Var, boolean z10) {
        if (this.V != 0) {
            p8Var.q(org.telegram.messenger.cd.L0(2131747145, null), org.telegram.messenger.cd.Q(this.V), z10, false);
        } else if (this.U != 0) {
            p8Var.q(org.telegram.messenger.cd.L0(2131747147, null), org.telegram.messenger.cd.G(this.U / 3600, "Hours", new Object[0]), z10, false);
        } else {
            p8Var.q(org.telegram.messenger.cd.L0(2131747145, null), null, z10, false);
        }
    }

    public final void Y(jh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f10405b;
        ih.t tVar = this.Q;
        boolean containsKey = tVar.f8582c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) tVar.f8581b.get(eVar.f10405b);
        fe.b bVar = eVar.f10410s;
        ImageReceiver imageReceiver = eVar.f8536a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f10409r.a(z11, z10);
        eVar.f10408n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(webPage.photo.sizes, org.telegram.messenger.i0.L(36.0f), false, w9, true), webPage.photo), "48_48", org.telegram.messenger.ic.f(w9, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            bVar.a(true, z10);
            return;
        }
        bVar.a(false, z10);
        imageReceiver.f();
    }

    public final void Z() {
        if (this.f27425h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.i0.L(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f27413b1 = layoutParams.height;
            this.f27427i1 = this.f27425h1;
            this.f27425h1 = false;
            T(-org.telegram.messenger.i0.L(120.0f));
        }
    }

    public final void a0(android.view.View r10, org.telegram.ui.Cells.e6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.a0(android.view.View, org.telegram.ui.Cells.e6, boolean):void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20872a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
    }

    public final void c0(boolean z10) {
        if (this.I) {
            if (this.f27411a1) {
                vy vyVar = this.E;
                vyVar.P.C0();
                vyVar.I.scrollTo(0, 0);
                vyVar.G(1);
                vyVar.Q.h1(0, 0);
                this.E.t(false);
                if (z10) {
                    this.E.B();
                }
                this.f27425h1 = false;
                i0(0);
            }
            if (z10) {
                vy vyVar2 = this.E;
                if (vyVar2 != null && vyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new nm(this, 0));
                    this.f27421f1 = true;
                    ofFloat.addListener(new qm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                    ofFloat.start();
                    return;
                }
                d0();
            }
        }
    }

    public final void d0() {
        vy vyVar;
        fg emojiButton;
        if (!this.f27411a1 && (vyVar = this.E) != null && vyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.f27423g1;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(dg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.f27413b1;
        this.f27413b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 == org.telegram.messenger.zs.f19711w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.Q.f8581b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f19948id)) != null) {
                    entry.setValue(webPage);
                }
            }
            ih.g gVar = this.f27433m1;
            int size = gVar.f8537a.size();
            for (int i12 = 0; i12 < size; i12++) {
                ih.f fVar = (ih.f) gVar.f8537a.get(i12);
                if (fVar instanceof jh.e) {
                    Y((jh.e) fVar, true);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19630i4) {
            vy vyVar = this.E;
            if (vyVar != null) {
                vyVar.P.g1();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f27423g1;
            if (e6Var != null) {
                int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                this.f27423g1.getEditField().setTextColor(-1);
                this.f27423g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(int i10) {
        int i11;
        this.l1 = i10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f30947b.W1;
        this.f27433m1.b(i10);
        if (i10 != -2 && i10 != -3) {
            i11 = 41026;
        } else {
            i11 = 74;
        }
        this.f27431k1 = g0(k2Var, i11, new km(this, i10, 0), new tf(this, 28));
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Cells.e6 e6Var = this.f27423g1;
        if (e6Var != null) {
            this.F.e = true;
            EditTextBoldCursor editField = e6Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.i0.J3(editField);
        }
        if (org.telegram.messenger.i0.D) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        i0(i10);
        if (!org.telegram.messenger.i0.D && !this.f27419e1 && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            this.G = true;
            mg.c2 c2Var = this.U0;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.h3(c2Var, 100L);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        s4.c1 T;
        int i10;
        org.telegram.ui.w71 w71Var = this.f27445s;
        if (w71Var.getChildCount() <= 1 || (childAt = w71Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = w71Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = w71Var.T(F);
        }
        ck0 ck0Var = (ck0) T;
        int y3 = (((int) childAt.getY()) - org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(20.0f);
        if (y3 > 0 && ck0Var != null && ck0Var.b() == 1) {
            i10 = y3;
        } else {
            i10 = 0;
        }
        if (y3 < 0 || ck0Var == null || ck0Var.b() != 1) {
            y3 = i10;
        }
        return org.telegram.messenger.i0.L(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.f27413b1;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.R0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        org.telegram.ui.w71 w71Var = this.f27445s;
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 16, new Class[]{bn.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        int i11 = org.telegram.ui.ActionBar.t6.f21153p7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 262144, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.f21095m6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 8388608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 8388608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 262144, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        int i13 = org.telegram.ui.ActionBar.t6.f21059k7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        int i14 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 32, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.c7(w71Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        return arrayList;
    }

    @Override
    public final boolean h() {
        return this.X0;
    }

    public final void h0(int i10, ih.f fVar) {
        int i11;
        ih.g gVar = this.f27433m1;
        if (fVar != null) {
            gVar.f8537a.put(i10, fVar);
        } else {
            gVar.f8537a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.f27435n0;
        } else if (i10 == -3) {
            i11 = this.f27439p0;
        } else {
            int i12 = this.f27447t0;
            if (i12 >= 0 && i10 >= 0 && i10 < this.M) {
                i11 = i10 + i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            s4.c1 K = this.f27445s.K(i11);
            if (K != null) {
                View view = K.f47898a;
                if (view instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view).e.b(fVar, true);
                }
            }
            this.f27443r.g(i11);
        }
        if (fVar instanceof jh.e) {
            jh.e eVar = (jh.e) fVar;
            String str = eVar.f10405b;
            ih.s sVar = new ih.s(7, this, fVar);
            ih.t tVar = this.Q;
            HashMap hashMap = tVar.f8582c;
            HashMap hashMap2 = tVar.f8581b;
            if (hashMap2.containsKey(str)) {
                sVar.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(sVar);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(tVar.f8580a).sendRequestTyped(getwebpagepreview, new a3.b(1), new ih.s(0, tVar, str));
                }
            }
            Y(eVar, false);
        }
        W();
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.e6 e6Var;
        if (this.I) {
            vh.r2 r2Var = this.F;
            fg fgVar = null;
            bi biVar = this.f30947b;
            if (i10 == 1) {
                vy vyVar = this.E;
                if (vyVar != null && vyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vy vyVar2 = this.E;
                if (vyVar2 != null && vyVar2.f31865c1 != org.telegram.messenger.d20.f15147s0) {
                    biVar.f24695l3.removeView(vyVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    vy vyVar3 = new vy(null, true, false, false, getContext(), true, null, null, true, this.f30946a, false, false);
                    this.E = vyVar3;
                    vyVar3.f31863c = 3;
                    vyVar3.f31927w0 = false;
                    vyVar3.f31933x2 = false;
                    vyVar3.setShouldDrawBackground(false);
                    vy vyVar4 = this.E;
                    vyVar4.U0 = false;
                    vyVar4.setVisibility(8);
                    if (org.telegram.messenger.i0.Q1()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new pm(this));
                    biVar.f24695l3.addView(this.E);
                    this.E.setBottomInset(org.telegram.messenger.i0.f16021n);
                }
                this.E.setVisibility(0);
                this.f27411a1 = true;
                vy vyVar5 = this.E;
                if (this.f27415c1 <= 0) {
                    if (org.telegram.messenger.i0.Q1()) {
                        this.f27415c1 = org.telegram.messenger.i0.L(150.0f);
                    } else {
                        this.f27415c1 = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                    }
                }
                if (this.f27417d1 <= 0) {
                    if (org.telegram.messenger.i0.Q1()) {
                        this.f27417d1 = org.telegram.messenger.i0.L(150.0f);
                    } else {
                        this.f27417d1 = org.telegram.messenger.vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i11 = this.f27417d1;
                } else {
                    i11 = this.f27415c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.i0.f16021n + i11;
                vyVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1() && (e6Var = this.f27423g1) != null) {
                    org.telegram.messenger.i0.v1(e6Var.getEditField());
                }
                this.f27413b1 = i11;
                r2Var.a();
                biVar.f24695l3.requestLayout();
                org.telegram.ui.Cells.e6 e6Var2 = this.f27423g1;
                if (e6Var2 != null) {
                    fgVar = e6Var2.getEmojiButton();
                }
                if (fgVar != null) {
                    fgVar.j(dg.d, true);
                }
                if (!z10 && !this.f27419e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27413b1, 0.0f);
                    ofFloat.addUpdateListener(new nm(this, 1));
                    ofFloat.addListener(new qm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e6 e6Var3 = this.f27423g1;
            if (e6Var3 != null) {
                fgVar = e6Var3.getEmojiButton();
            }
            if (fgVar != null) {
                fgVar.j(dg.e, true);
            }
            vy vyVar6 = this.E;
            if (vyVar6 != null) {
                this.f27411a1 = false;
                this.f27425h1 = false;
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    vyVar6.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f27413b1 = 0;
            }
            r2Var.a();
            biVar.f24695l3.requestLayout();
        }
    }

    @Override
    public final boolean j() {
        if (this.f27411a1) {
            c0(true);
            return true;
        } else if (!V()) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(int i10, org.telegram.messenger.r20 r20Var, int i11, int i12) {
        z60 F = z60.F(this, null, new View(getContext()));
        F.f32941s = 0;
        F.f32942t = false;
        F.c(2131232330, org.telegram.messenger.cd.L0(2131746286, null), new lm(this, i10, 1), false);
        F.c(2131232107, org.telegram.messenger.cd.L0(2131751599, null), new lm(this, i10, 2), true);
        nl0 nl0Var = new nl0(getContext(), this.f30946a);
        F.f32936p = new org.telegram.ui.se(nl0Var, 1);
        F.S = org.telegram.messenger.i0.L(185.0f);
        F.Y();
        nl0Var.e(F);
        vg.f c10 = nl0Var.f28821n.c(null, null, false);
        c10.o(w7.b9.k(nl0Var.f28818b));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.M.e = true;
        c10.q(org.telegram.messenger.i0.L(16.0f));
        nl0Var.F = c10;
        nl0Var.E = (Drawable) r20Var.a(nl0Var.f28823s);
        Point point = org.telegram.messenger.i0.f16026q;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - org.telegram.messenger.i0.L(8.0f), i14 - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + i15, org.telegram.messenger.i0.L(8.0f) + i16);
        nl0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) nl0Var.f28826y.getLayoutParams()).gravity = 1;
        nl0Var.L = true;
        nl0Var.show();
    }

    public final void k0() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f30946a;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.N6, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21059k7, p6Var);
            if (w02 != this.f27440p1 || w03 != this.f27442q1) {
                this.f27440p1 = w02;
                this.f27442q1 = w03;
                Drawable drawable = this.f27436n1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f27438o1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.w71 w71Var = this.f27445s;
                if (w71Var != null) {
                    for (int i10 = 0; i10 < w71Var.getChildCount(); i10++) {
                        View childAt = w71Var.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.p8) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void l0() {
        boolean z10;
        this.f27437o0 = -1;
        this.f27439p0 = -1;
        this.f27441q0 = -1;
        this.F0 = -1;
        this.B0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.C0 = -1;
        this.E0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        c5.e eVar = this.M0;
        eVar.f3775a = -1;
        c5.e eVar2 = this.N0;
        eVar2.f3775a = -1;
        this.L0 = -1;
        this.f27455y0 = -1;
        this.f27456z0 = -1;
        this.f27448u0 = -1;
        this.f27447t0 = -1;
        this.f27453x0 = -1;
        this.f27435n0 = -1;
        this.f27432l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z11 = this.f27434n;
        if (!z11) {
            this.Q0 = 4;
            this.f27435n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.f27444r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.f27446s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.f27447t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.f27448u0 = i14;
        }
        int i15 = this.Q0;
        this.f27449v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.f27451w0 = i15 + 1;
        if (z11) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.f27456z0 = i16;
            if (this.f27422g0) {
                this.Q0 = i15 + 4;
                this.f27455y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.un) this.f30947b.W1).e;
            if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i18 = this.Q0;
                this.Q0 = i18 + 1;
                this.B0 = i18;
            } else {
                this.f27410a0 = true;
            }
            int i19 = this.Q0;
            int i20 = i19 + 1;
            this.Q0 = i20;
            this.F0 = i19;
            if (!z10) {
                this.Q0 = i19 + 2;
                this.C0 = i20;
            } else {
                this.T = false;
            }
            int i21 = this.Q0;
            this.D0 = i21;
            this.E0 = i21 + 1;
            int i22 = i21 + 3;
            this.Q0 = i22;
            this.G0 = i21 + 2;
            if (z10) {
                eVar.f3775a = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                eVar2.f3775a = i21 + 4;
                if (eVar2.f3776b) {
                    this.Q0 = i21 + 6;
                    this.L0 = i23;
                }
            }
            int i24 = this.Q0;
            int i25 = i24 + 1;
            this.Q0 = i25;
            this.H0 = i24;
            if (this.U != 0 || this.V != 0) {
                this.I0 = i25;
                this.J0 = i24 + 2;
                this.Q0 = i24 + 4;
                this.K0 = i24 + 3;
            }
            int i26 = this.Q0;
            int i27 = i26 + 1;
            this.Q0 = i27;
            this.f27453x0 = i26;
            if (this.f27414c0) {
                this.f27437o0 = i27;
                this.f27439p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.f27441q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override
    public final void o() {
        this.H = true;
        bi biVar = this.f30947b;
        org.telegram.messenger.zs.f(biVar.D3).n(this, org.telegram.messenger.zs.f19711w0);
        if (this.I) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
            vy vyVar = this.E;
            if (vyVar != null) {
                biVar.f24695l3.removeView(vyVar);
            }
        }
    }

    @Override
    public final boolean r() {
        if (!V()) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f27426i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        this.f30947b.K1();
    }

    public void setDelegate(in inVar) {
        this.f27428j0 = inVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
    }

    @Override
    public final void u(float f7) {
        this.f30947b.K1();
    }

    @Override
    public final void updateColors() {
        try {
            this.f27429j1.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vl, this.f30946a));
            k0();
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void w(int i10) {
        int i11;
        boolean z10;
        if (i10 == 40) {
            boolean z11 = this.f27434n;
            int i12 = 0;
            int i13 = 1;
            bi biVar = this.f30947b;
            CharSequence[] charSequenceArr = this.K;
            if (z11) {
                CharSequence[] charSequenceArr2 = {b0(this.N)};
                int i14 = biVar.D3;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.ui.b0(i14).W(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (W != null) {
                    int size = W.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.MessageEntity messageEntity = W.get(i15);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f27422g0;
                if (z12 && this.f27420f0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = W;
                for (int i16 = 0; i16 < charSequenceArr.length; i16++) {
                    if (!TextUtils.isEmpty(b0(charSequenceArr[i16]))) {
                        CharSequence[] charSequenceArr3 = {b0(charSequenceArr[i16])};
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.ui.b0(i14).W(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (W2 != null) {
                            int size2 = W2.size();
                            for (int i17 = 0; i17 < size2; i17++) {
                                TLRPC.MessageEntity messageEntity2 = W2.get(i17);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = W2;
                        todoItem.f19940id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                s4.Z(i14, biVar.W0() + 1, biVar.a1(), new kg.d0(this, (org.telegram.ui.un) biVar.W1, tL_messageMediaToDo, 2));
                return;
            }
            boolean z13 = this.f27414c0;
            org.telegram.ui.w71 w71Var = this.f27445s;
            boolean[] zArr = this.L;
            if (z13 && !this.X0) {
                int i18 = 0;
                while (i12 < zArr.length) {
                    if (!TextUtils.isEmpty(b0(charSequenceArr[i12])) && zArr[i12]) {
                        i18++;
                    }
                    i12++;
                }
                if (i18 <= 0) {
                    for (int i19 = this.f27447t0; i19 < this.f27447t0 + this.M; i19++) {
                        s4.c1 K = w71Var.K(i19);
                        if (K != null) {
                            View view = K.f47898a;
                            if (view instanceof org.telegram.ui.Cells.e6) {
                                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                                if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f)) {
                                    an anVar = this.f27454y;
                                    if (anVar != null) {
                                        anVar.f();
                                    }
                                    String L0 = org.telegram.messenger.cd.L0(2131747170, null);
                                    q30 q30Var = this.D;
                                    q30Var.setText(L0);
                                    q30Var.f(e6Var.getCheckBox(), true);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            int i20 = 0;
            while (true) {
                int length = charSequenceArr.length;
                ih.g gVar = this.f27433m1;
                if (i20 < length) {
                    if (TextUtils.isEmpty(b0(charSequenceArr[i20])) && gVar.b(i20) != null) {
                        this.V0 = true;
                        this.W0 = i20;
                        w71Var.y0(this.f27447t0 + i20);
                        return;
                    }
                    i20++;
                } else {
                    CharSequence[] charSequenceArr4 = {b0(this.N)};
                    int i21 = biVar.D3;
                    ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.ui.b0(i21).W(charSequenceArr4, true, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (W3 != null) {
                        int size3 = W3.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            TLRPC.MessageEntity messageEntity3 = W3.get(i22);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f27412b0;
                    tL_poll.quiz = this.f27414c0;
                    tL_poll.public_voters = !this.f27410a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f3776b;
                    if (this.N0.f3776b) {
                        ArrayList arrayList = this.P0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i23 = this.U;
                    if (i23 != 0) {
                        poll2.hide_results_until_close = this.W;
                        poll2.close_period = i23;
                        poll2.flags |= 16;
                    } else {
                        int i24 = this.V;
                        if (i24 != 0) {
                            poll2.hide_results_until_close = this.W;
                            poll2.close_date = i24;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = W3;
                    ArrayList arrayList2 = new ArrayList(this.J);
                    int i25 = 0;
                    while (i25 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(b0(charSequenceArr[i25]))) {
                            gVar.h(tL_messageMediaPoll.poll.answers.size());
                            i11 = i12;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i13];
                            charSequenceArr5[i12] = b0(charSequenceArr[i25]);
                            ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.ui.b0(i21).W(charSequenceArr5, i13, i13);
                            CharSequence charSequence4 = charSequenceArr5[i12];
                            if (W4 != null) {
                                int size4 = W4.size();
                                int i26 = i12;
                                while (i26 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = W4.get(i26);
                                    int i27 = i12;
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                    i26++;
                                    i12 = i27;
                                }
                            }
                            i11 = i12;
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = W4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i11] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.f27412b0 || this.f27414c0) && zArr[i25]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i25++;
                        i12 = i11;
                        i13 = 1;
                    }
                    int i28 = i12;
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence b02 = b0(this.P);
                    if (b02 != null) {
                        tL_messageMediaPoll.results.solution = b02.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i28] = b02;
                        ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.ui.b0(i21).W(charSequenceArr6, true, true);
                        if (W5 != null && !W5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = W5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    s4.Z(i21, biVar.W0() + 1, biVar.a1(), new ag.m2(this, (org.telegram.ui.un) biVar.W1, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}

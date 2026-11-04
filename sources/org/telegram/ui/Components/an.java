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
public final class an extends th implements org.telegram.ui.ActionBar.z5, pt0, org.telegram.messenger.cs {
    public static final int f31903s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final u20 E;
    public int E0;
    public ey F;
    public int F0;
    public final gi.p3 G;
    public int G0;
    public boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public final int K;
    public int K0;
    public final CharSequence[] L;
    public int L0;
    public final boolean[] M;
    public int M0;
    public int N;
    public final cg.v0 N0;
    public Editable O;
    public final cg.v0 O0;
    public Editable P;
    public final cg.v0[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final th.o R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final mi.b0 V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean f31904a0;
    public boolean f31905a1;
    public boolean f31906b0;
    public boolean f31907b1;
    public boolean f31908c0;
    public int f31909c1;
    public boolean f31910d0;
    public int f31911d1;
    public boolean f31912e0;
    public int f31913e1;
    public final boolean f31914f0;
    public boolean f31915f1;
    public boolean f31916g0;
    public boolean f31917g1;
    public boolean f31918h0;
    public org.telegram.ui.Cells.z5 f31919h1;
    public boolean f31920i0;
    public boolean f31921i1;
    public boolean f31922j0;
    public boolean f31923j1;
    public zm f31924k0;
    public final Paint k1;
    public int f31925l0;
    public ei.x2 f31926l1;
    public int m0;
    public int m1;
    public final boolean f31927n;
    public int f31928n0;
    public final th.d f31929n1;
    public int f31930o0;
    public Drawable f31931o1;
    public int f31932p0;
    public Drawable f31933p1;
    public int f31934q0;
    public int f31935q1;
    public final org.telegram.ui.n4 f31936r;
    public int f31937r0;
    public int f31938r1;
    public final org.telegram.ui.u51 f31939s;
    public int f31940s0;
    public int f31941t0;
    public int f31942u0;
    public int f31943v0;
    public final pm f31944w;
    public int f31945w0;
    public final lg.d0 f31946x;
    public int f31947x0;
    public final rm f31948y;
    public int f31949y0;
    public int f31950z0;

    public an(bi biVar, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, Boolean bool) {
        super(context, e6Var, biVar);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.f31908c0 = true;
        this.f31916g0 = true;
        this.f31918h0 = true;
        this.f31925l0 = -1;
        cg.v0 v0Var = new cg.v0(this);
        this.N0 = v0Var;
        cg.v0 v0Var2 = new cg.v0(this);
        this.O0 = v0Var2;
        this.P0 = new cg.v0[]{v0Var, v0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new mi.b0(this, 28);
        this.W0 = false;
        this.X0 = -1;
        this.f31921i1 = false;
        this.f31923j1 = false;
        Paint paint = new Paint(1);
        this.k1 = paint;
        this.f31929n1 = new th.d();
        this.f31927n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(this.f38416b.E3).f21919a).q();
        this.J = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f31910d0 = booleanValue;
            this.f31914f0 = booleanValue;
            boolean z11 = !booleanValue;
            this.U = z11;
            this.S = z11;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vl, this.f38415a));
        this.f38416b.f32249m3.setDelegate(this);
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(1, this, context);
        this.f31936r = n4Var;
        org.telegram.ui.u51 u51Var = new org.telegram.ui.u51(5, context, null);
        this.f31939s = u51Var;
        setBlur3Capture(u51Var);
        this.d = u51Var;
        this.h = true;
        this.f38419f = true;
        pm pmVar = new pm(this);
        this.f31944w = pmVar;
        u51Var.setItemAnimator(pmVar);
        arrayList.clear();
        pmVar.f55567m = false;
        pmVar.C = false;
        pmVar.o(xq.h);
        pmVar.n(350L);
        u51Var.setClipToPadding(false);
        u51Var.setVerticalScrollBarEnabled(false);
        u51Var.setSections(true);
        lg.d0 d0Var = new lg.d0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.f22602m, u51Var, 4);
        this.f31946x = d0Var;
        u51Var.setLayoutManager(d0Var);
        d0Var.O = true;
        new u4.y(new fi.c(this, 4)).h(u51Var);
        addView(u51Var, b8.mf.e(-1, -1, 51));
        u51Var.setPreserveFocusAfterLayout(true);
        u51Var.setAdapter(n4Var);
        u51Var.setOnItemClickListener(new fm(this, e6Var, biVar, context));
        u51Var.setOnScrollListener(new ji(this, 5));
        u20 u20Var = new u20(context, 4);
        this.E = u20Var;
        u20Var.setAlpha(0.0f);
        u20Var.setVisibility(4);
        addView(u20Var, b8.mf.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.f38416b.E3).f23167x7.J.f13798b).f23620c;
        this.R = new th.o(this.f38416b.E3);
        org.telegram.messenger.hs.f(this.f38416b.E3).c(this, org.telegram.messenger.hs.f23326w0);
        if (q10) {
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
            ?? ow0Var = new ow0(context, this.f38416b.E3, null, e6Var);
            this.f31948y = ow0Var;
            ow0Var.E = true;
            ow0Var.F = true;
            ow0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView((View) ow0Var, b8.mf.e(-2, 160, 51));
        }
        this.G = new gi.p3(this.f38416b.f32249m3, false, null);
        X();
    }

    public static void O(an anVar, int i3) {
        u20 u20Var = anVar.E;
        u4.d1 K = anVar.f31939s.K(anVar.f31942u0 + i3);
        if (K != null) {
            View view = K.f55540a;
            if (view instanceof org.telegram.ui.Cells.z5) {
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    rm rmVar = anVar.f31948y;
                    if (rmVar != null) {
                        rmVar.f();
                    }
                    u20Var.setText(org.telegram.messenger.bd.M0(2131747190, null));
                    u20Var.c(z5Var.getCheckBox());
                    ImageView imageView = u20Var.f38618b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    u20Var.setTranslationY(u20Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    public static void P(org.telegram.ui.Components.an r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an.P(org.telegram.ui.Components.an, android.view.View, int):void");
    }

    public static void Q(an anVar, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        u4.d1 T;
        if (anVar.J && z10) {
            if (anVar.f31919h1 == z5Var && anVar.f31907b1 && anVar.f31921i1) {
                anVar.b0();
                anVar.f31907b1 = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = anVar.f31919h1;
            anVar.f31919h1 = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            hg emojiButton = z5Var.getEmojiButton();
            fg fgVar = fg.f33793e;
            emojiButton.j(fgVar, false);
            org.telegram.ui.u51 u51Var = anVar.f31939s;
            View F = u51Var.F(z5Var);
            if (F == null) {
                T = null;
            } else {
                T = u51Var.T(F);
            }
            rm rmVar = anVar.f31948y;
            if (rmVar != null) {
                rmVar.f();
                if (T != null) {
                    View view = T.f55540a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && rmVar.getDelegate() != view) {
                        rmVar.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 != null && z5Var2 != z5Var) {
                if (anVar.f31907b1) {
                    anVar.b0();
                    anVar.e0(false);
                    anVar.h0();
                }
                z5Var2.setEmojiButtonVisibility(false);
                z5Var2.getEmojiButton().j(fgVar, false);
            }
        }
    }

    public static void R(an anVar, org.telegram.ui.Cells.z5 z5Var) {
        anVar.f31919h1 = z5Var;
        if (anVar.f31907b1) {
            anVar.b0();
            anVar.h0();
            return;
        }
        anVar.k0(1);
    }

    public static void S(an anVar, int i3) {
        bi biVar;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i10;
        th.d dVar = anVar.f31929n1;
        if (dVar.b(i3) != null) {
            th.c b10 = dVar.b(i3);
            if (b10 != null && (biVar = anVar.f38416b) != null && (d2Var = biVar.X1) != null) {
                Activity parentActivity = d2Var.getParentActivity();
                if (b10 instanceof uh.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((uh.d) b10).f56355b);
                    PhotoViewer.v1().N2(parentActivity, null, null);
                    PhotoViewer.v1().j2(arrayList, 0, 14, false, new im(anVar, i3), null);
                    return;
                } else if (b10 instanceof uh.h) {
                    uh.h hVar = (uh.h) b10;
                    org.telegram.ui.is.p().v(parentActivity);
                    org.telegram.ui.is p10 = org.telegram.ui.is.p();
                    ?? obj = new Object();
                    obj.f35437b = anVar;
                    obj.f35436a = i3;
                    p10.u(obj);
                    org.telegram.ui.is p11 = org.telegram.ui.is.p();
                    TLRPC.Document document = hVar.f56367b;
                    if (org.telegram.messenger.zi.I2(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    p11.s(document, null, "", null, null, i10, false, hVar.f56368c, anVar.f38415a, 200);
                    return;
                } else if (b10 instanceof uh.c) {
                    uh.c cVar = (uh.c) b10;
                    String str = cVar.d;
                    anVar.l0(i3, new org.telegram.ui.bf(1, str, org.telegram.messenger.g0.i0(cVar.f56352e, true, true) + " " + cVar.f56353f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof uh.g) {
                    uh.g gVar = (uh.g) b10;
                    TLRPC.Document F0 = gVar.f56365b.F0();
                    String y12 = org.telegram.messenger.zi.y1(F0);
                    anVar.l0(i3, new gi.s4(y12, org.telegram.messenger.zi.w1(F0) + " - " + org.telegram.messenger.bd.R((int) org.telegram.messenger.zi.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof uh.f) {
                    anVar.l0(i3, new di((uh.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof uh.e) {
                    uh.e eVar = (uh.e) b10;
                    t4.f0(anVar.getContext(), anVar.f38415a, eVar.f56357b, eVar.f56361n, new bm(anVar, i3, 1), new cm(anVar, i3, 0));
                    return;
                } else {
                    anVar.g0(i3);
                    return;
                }
            }
            return;
        }
        anVar.g0(i3);
    }

    public static CharSequence d0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n12 = org.telegram.messenger.g0.n1(charSequence);
        while (TextUtils.indexOf(n12, "\n\n\n") >= 0) {
            n12 = TextUtils.replace(n12, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n12, "\n\n\n") == 0) {
            n12 = TextUtils.replace(n12, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n12;
    }

    private int getAnswersMaxCount() {
        if (this.f31927n) {
            return getMessagesController().R6;
        }
        return ((org.telegram.messenger.j0) getMessagesController().f23167x7.G.f13798b).f23620c;
    }

    private int getCurrentAccount() {
        bi biVar = this.f38416b;
        if (biVar != null) {
            return biVar.E3;
        }
        return org.telegram.messenger.h10.f22829t0;
    }

    private org.telegram.messenger.hp getMessagesController() {
        return org.telegram.messenger.hp.s1(getCurrentAccount());
    }

    public static ei.x2 i0(org.telegram.ui.ActionBar.d2 d2Var, int i3, org.telegram.messenger.u10 u10Var, vf vfVar) {
        if (d2Var == null) {
            return null;
        }
        ei.x2 x2Var = new ei.x2(d2Var.getContext(), d2Var, d2Var.getResourceProvider(), vfVar);
        x2Var.U3 = new mm(x2Var, u10Var, d2Var);
        x2Var.V3 = new nm(u10Var, x2Var);
        x2Var.f32215b2.i0();
        x2Var.y1(1, true);
        x2Var.V0(i3);
        x2Var.f32269r4 = new dm(u10Var);
        x2Var.P1 = new om(x2Var, u10Var, d2Var);
        x2Var.Q1 = new org.telegram.ui.jo(21, u10Var, x2Var);
        x2Var.e1();
        x2Var.A0(true);
        x2Var.show();
        return x2Var;
    }

    @Override
    public final void A() {
        org.telegram.ui.n4 n4Var = this.f31936r;
        if (n4Var != null) {
            n4Var.f();
        }
        if (this.J) {
            e0(false);
            rm rmVar = this.f31948y;
            if (rmVar != null) {
                rmVar.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f31919h1;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.f31919h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f31919h1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an.B(int, int):void");
    }

    @Override
    public final void H(th thVar) {
        bi biVar = this.f38416b;
        try {
            biVar.S2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f31927n) {
            biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131744064, null));
        } else if (this.f31914f0) {
            biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131748272, null));
        } else {
            biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131748273, null));
        }
        biVar.L1();
        this.f31946x.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31939s.y0(1);
    }

    @Override
    public final void K(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.J) {
            if (i3 > org.telegram.messenger.g0.L(50.0f) && this.f31915f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.f31913e1 = i3;
                    org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.f31913e1).commit();
                } else {
                    this.f31911d1 = i3;
                    org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.f31911d1).commit();
                }
            }
            boolean z13 = this.f31907b1;
            bi biVar = this.f38416b;
            gi.p3 p3Var = this.G;
            if (z13) {
                if (z10) {
                    i10 = this.f31913e1;
                } else {
                    i10 = this.f31911d1;
                }
                if (this.f31921i1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.f22603n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.f22608q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f31923j1 != this.f31921i1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.F.setLayoutParams(layoutParams);
                    this.f31909c1 = layoutParams.height;
                    p3Var.a();
                    biVar.f32249m3.requestLayout();
                    boolean z14 = this.f31923j1;
                    if (z14 != this.f31921i1) {
                        if (z14) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        U(L);
                    }
                    this.f31923j1 = this.f31921i1;
                }
            }
            if (this.Z0 != i3 || this.f31905a1 != z10) {
                this.Z0 = i3;
                this.f31905a1 = z10;
                boolean z15 = this.f31915f1;
                org.telegram.ui.Cells.z5 z5Var = this.f31919h1;
                if (z5Var != null) {
                    if (z5Var.getEditField().isFocused() && p3Var.c() && i3 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f31915f1 = z12;
                } else {
                    this.f31915f1 = false;
                }
                if (this.f31915f1 && this.f31907b1) {
                    k0(0);
                }
                if (this.f31909c1 != 0 && !(z11 = this.f31915f1) && z11 != z15 && !this.f31907b1) {
                    this.f31909c1 = 0;
                    p3Var.a();
                    biVar.f32249m3.requestLayout();
                }
                if (this.f31915f1 && this.H) {
                    this.H = false;
                    org.telegram.messenger.g0.r(this.V0);
                }
            }
        }
    }

    public final void T() {
        rm rmVar = this.f31948y;
        if (rmVar != null) {
            rmVar.setDelegate(null);
            rmVar.f();
        }
        this.f31939s.setItemAnimator(this.f31944w);
        int i3 = this.N;
        this.M[i3] = false;
        int i10 = i3 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.n4 n4Var = this.f31936r;
        if (i10 == length) {
            n4Var.s(this.f31943v0);
        }
        n4Var.i(this.f31943v0);
        n0();
        this.f31925l0 = (this.f31942u0 + this.N) - 1;
        n4Var.g(this.f31945w0);
        n4Var.g(this.B0);
    }

    public final void U(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.of(this, f10, 2));
        ofFloat.addListener(new hm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
        ofFloat.start();
    }

    public final void V() {
        boolean z10;
        if (!this.f31910d0 && !this.f31906b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.U = false;
        }
        int i3 = this.D0;
        if (i3 < 0) {
            return;
        }
        u4.d1 K = this.f31939s.K(i3);
        if (K == null) {
            this.f31936r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) K.f55540a;
        if (!z10) {
            x5Var.setChecked(false);
        }
        x5Var.getCheckBox().f31628a.a(!z10, true);
    }

    public final boolean W() {
        boolean z10;
        int i3;
        int i10;
        if (TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.f31929n1.f55399a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i11]))); i11++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f38416b.X1.getParentActivity());
            boolean z11 = this.f31927n;
            if (z11) {
                i3 = 2131752567;
            } else {
                i3 = 2131752573;
            }
            String M0 = org.telegram.messenger.bd.M0(i3, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (z11) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            s1Var.U = org.telegram.messenger.bd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new t(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void X() {
        int i3;
        int i10;
        int i11;
        boolean z10;
        boolean z11 = this.f31910d0;
        CharSequence[] charSequenceArr = this.L;
        if (z11) {
            int i12 = 0;
            i3 = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i12 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(d0(charSequenceArr[i12])) && zArr[i12]) {
                    i3++;
                }
                i12++;
            }
        } else {
            i3 = 0;
        }
        boolean z12 = this.f31927n;
        if (z12) {
            i10 = getMessagesController().S6;
        } else {
            i10 = 255;
        }
        if (z12) {
            i11 = getMessagesController().T6;
        } else {
            i11 = 100;
        }
        if ((!TextUtils.isEmpty(d0(this.P)) && this.P.length() > this.T0) || ((!TextUtils.isEmpty(d0(this.Q)) && this.Q.length() > 200) || TextUtils.isEmpty(d0(this.O)) || this.O.length() > i10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(d0(charSequenceArr[i13]))) {
                if (charSequenceArr[i13].length() > i11) {
                    i14 = 0;
                    z13 = true;
                    break;
                }
                i14++;
                z13 = true;
            }
            i13++;
        }
        if (i14 < 1 || (this.f31910d0 && i3 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.f31929n1.f55399a.size() <= 0) {
            this.f31920i0 = true;
        } else {
            this.f31920i0 = false;
        }
        boolean z14 = this.f31920i0;
        bi biVar = this.f38416b;
        biVar.f28614r0 = z14;
        this.Y0 = z10;
        biVar.L1();
    }

    public final void Z(org.telegram.ui.Cells.l8 l8Var, boolean z10) {
        if (this.W != 0) {
            l8Var.q(org.telegram.messenger.bd.M0(2131747138, null), org.telegram.messenger.bd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            l8Var.q(org.telegram.messenger.bd.M0(2131747140, null), org.telegram.messenger.bd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            l8Var.q(org.telegram.messenger.bd.M0(2131747138, null), null, z10, false);
        }
    }

    public final void a0(uh.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f56357b;
        th.o oVar = this.R;
        boolean containsKey = oVar.f55442c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) oVar.f55441b.get(eVar.f56357b);
        qe.a aVar = eVar.f56363s;
        ImageReceiver imageReceiver = eVar.f55398a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f56362r.a(z11, z10);
        eVar.f56361n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.ac.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z10);
            return;
        }
        aVar.a(false, z10);
        imageReceiver.f();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
    }

    public final void b0() {
        if (this.f31921i1) {
            this.F.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.f31909c1 = layoutParams.height;
            this.f31923j1 = this.f31921i1;
            this.f31921i1 = false;
            U(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    public final void c0(android.view.View r10, org.telegram.ui.Cells.z5 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an.c0(android.view.View, org.telegram.ui.Cells.z5, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i3 == org.telegram.messenger.hs.f23326w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.R.f55441b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f27156id)) != null) {
                    entry.setValue(webPage);
                }
            }
            th.d dVar = this.f31929n1;
            int size = dVar.f55399a.size();
            for (int i11 = 0; i11 < size; i11++) {
                th.c cVar = (th.c) dVar.f55399a.get(i11);
                if (cVar instanceof uh.e) {
                    a0((uh.e) cVar, true);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            ey eyVar = this.F;
            if (eyVar != null) {
                eyVar.Q.g1();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f31919h1;
            if (z5Var != null) {
                int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                this.f31919h1.getEditField().setTextColor(-1);
                this.f31919h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            if (this.f31907b1) {
                ey eyVar = this.F;
                eyVar.Q.C0();
                eyVar.J.scrollTo(0, 0);
                eyVar.E(1);
                eyVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.f31921i1 = false;
                k0(0);
            }
            if (z10) {
                ey eyVar2 = this.F;
                if (eyVar2 != null && eyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new em(this, 0));
                    this.f31917g1 = true;
                    ofFloat.addListener(new hm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                    ofFloat.start();
                    return;
                }
                f0();
            }
        }
    }

    public final void f0() {
        ey eyVar;
        hg emojiButton;
        if (!this.f31907b1 && (eyVar = this.F) != null && eyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.f31919h1;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(fg.f33793e, false);
            }
            this.F.setVisibility(8);
        }
        int i3 = this.f31909c1;
        this.f31909c1 = 0;
        if (i3 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i3) {
        int i10;
        this.m1 = i3;
        org.telegram.ui.ActionBar.d2 d2Var = this.f38416b.X1;
        this.f31929n1.b(i3);
        if (i3 != -2 && i3 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.f31926l1 = i0(d2Var, i10, new bm(this, i3, 0), new vf(this, 27));
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        u4.d1 T;
        int i3;
        org.telegram.ui.u51 u51Var = this.f31939s;
        if (u51Var.getChildCount() <= 1 || (childAt = u51Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = u51Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        bj0 bj0Var = (bj0) T;
        int y9 = (((int) childAt.getY()) - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(20.0f);
        if (y9 > 0 && bj0Var != null && bj0Var.b() == 1) {
            i3 = y9;
        } else {
            i3 = 0;
        }
        if (y9 < 0 || bj0Var == null || bj0Var.b() != 1) {
            y9 = i3;
        }
        return org.telegram.messenger.g0.L(25.0f) + y9;
    }

    public int getEmojiPadding() {
        return this.f31909c1;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.S0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        org.telegram.ui.u51 u51Var = this.f31939s;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 16, new Class[]{sm.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f28043m6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 262144, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f28008k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 32, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u51Var, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        return arrayList;
    }

    public final void h0() {
        int i3;
        org.telegram.ui.Cells.z5 z5Var = this.f31919h1;
        if (z5Var != null) {
            this.G.f13361e = true;
            EditTextBoldCursor editField = z5Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.K3(editField);
        }
        if (org.telegram.messenger.g0.D) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        k0(i3);
        if (!org.telegram.messenger.g0.D && !this.f31915f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.H = true;
            mi.b0 b0Var = this.V0;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 100L);
        }
    }

    @Override
    public final boolean i() {
        return this.Y0;
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int i3, th.c cVar) {
        int i10;
        th.d dVar = this.f31929n1;
        if (cVar != null) {
            dVar.f55399a.put(i3, cVar);
        } else {
            dVar.f55399a.remove(i3);
        }
        if (i3 == -2) {
            i10 = this.f31930o0;
        } else if (i3 == -3) {
            i10 = this.f31934q0;
        } else {
            int i11 = this.f31942u0;
            if (i11 >= 0 && i3 >= 0 && i3 < this.N) {
                i10 = i3 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            u4.d1 K = this.f31939s.K(i10);
            if (K != null) {
                View view = K.f55540a;
                if (view instanceof org.telegram.ui.Cells.z5) {
                    ((org.telegram.ui.Cells.z5) view).f31048e.b(cVar, true);
                }
            }
            this.f31936r.g(i10);
        }
        if (cVar instanceof uh.e) {
            uh.e eVar = (uh.e) cVar;
            String str = eVar.f56357b;
            ai.q4 q4Var = new ai.q4(14, this, cVar);
            th.o oVar = this.R;
            HashMap hashMap = oVar.f55442c;
            HashMap hashMap2 = oVar.f55441b;
            if (hashMap2.containsKey(str)) {
                q4Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(q4Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(oVar.f55440a).sendRequestTyped(getwebpagepreview, new c3.b(1), new org.telegram.ui.Wallet.s1(5, oVar, str));
                }
            }
            a0(eVar, false);
        }
        X();
    }

    @Override
    public final boolean k() {
        if (this.f31907b1) {
            e0(true);
            return true;
        } else if (!W()) {
            return true;
        } else {
            return false;
        }
    }

    public final void k0(int i3) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.z5 z5Var;
        if (this.J) {
            gi.p3 p3Var = this.G;
            hg hgVar = null;
            bi biVar = this.f38416b;
            if (i3 == 1) {
                ey eyVar = this.F;
                if (eyVar != null && eyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ey eyVar2 = this.F;
                if (eyVar2 != null && eyVar2.f33529d1 != org.telegram.messenger.h10.f22829t0) {
                    biVar.f32249m3.removeView(eyVar2);
                    this.F = null;
                }
                if (this.F == null) {
                    ey eyVar3 = new ey(null, true, false, false, getContext(), true, null, null, true, this.f38415a, false, false);
                    this.F = eyVar3;
                    eyVar3.f33525c = 3;
                    eyVar3.f33592x0 = false;
                    eyVar3.f33598y2 = false;
                    eyVar3.setShouldDrawBackground(false);
                    ey eyVar4 = this.F;
                    eyVar4.V0 = false;
                    eyVar4.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new gm(this));
                    biVar.f32249m3.addView(this.F);
                    this.F.setBottomInset(org.telegram.messenger.g0.f22603n);
                }
                this.F.setVisibility(0);
                this.f31907b1 = true;
                ey eyVar5 = this.F;
                if (this.f31911d1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f31911d1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f31911d1 = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.f31913e1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f31913e1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f31913e1 = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i10 = this.f31913e1;
                } else {
                    i10 = this.f31911d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eyVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f22603n + i10;
                eyVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (z5Var = this.f31919h1) != null) {
                    org.telegram.messenger.g0.v1(z5Var.getEditField());
                }
                this.f31909c1 = i10;
                p3Var.a();
                biVar.f32249m3.requestLayout();
                org.telegram.ui.Cells.z5 z5Var2 = this.f31919h1;
                if (z5Var2 != null) {
                    hgVar = z5Var2.getEmojiButton();
                }
                if (hgVar != null) {
                    hgVar.j(fg.d, true);
                }
                if (!z10 && !this.f31915f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31909c1, 0.0f);
                    ofFloat.addUpdateListener(new em(this, 1));
                    ofFloat.addListener(new hm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z5 z5Var3 = this.f31919h1;
            if (z5Var3 != null) {
                hgVar = z5Var3.getEmojiButton();
            }
            if (hgVar != null) {
                hgVar.j(fg.f33793e, true);
            }
            ey eyVar6 = this.F;
            if (eyVar6 != null) {
                this.f31907b1 = false;
                this.f31921i1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    eyVar6.setVisibility(8);
                }
            }
            if (i3 == 0) {
                this.f31909c1 = 0;
            }
            p3Var.a();
            biVar.f32249m3.requestLayout();
        }
    }

    public final void l0(int i3, org.telegram.messenger.v10 v10Var, int i10, int i11) {
        f60 F = f60.F(this, null, new View(getContext()));
        F.f33747s = 0;
        F.f33748t = false;
        F.c(2131232331, org.telegram.messenger.bd.M0(2131746279, null), new cm(this, i3, 1), false);
        F.c(2131232108, org.telegram.messenger.bd.M0(2131751599, null), new cm(this, i3, 2), true);
        nk0 nk0Var = new nk0(getContext(), this.f38415a);
        F.f33742p = new org.telegram.ui.ee(nk0Var, 1);
        F.S = org.telegram.messenger.g0.L(185.0f);
        F.Y();
        nk0Var.e(F);
        gh.g c2 = nk0Var.f36577n.c(null, null, false);
        c2.p(b8.cd.k(nk0Var.f36573b));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.R.f12302e = true;
        c2.r(org.telegram.messenger.g0.L(16.0f));
        nk0Var.G = c2;
        nk0Var.F = (Drawable) v10Var.a(nk0Var.f36579s);
        Point point = org.telegram.messenger.g0.f22608q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c2.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        nk0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) nk0Var.f36582y.getLayoutParams()).gravity = 1;
        nk0Var.M = true;
        nk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f38415a;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28008k7, e6Var);
            if (w02 != this.f31935q1 || w03 != this.f31938r1) {
                this.f31935q1 = w02;
                this.f31938r1 = w03;
                Drawable drawable = this.f31931o1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f31933p1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.u51 u51Var = this.f31939s;
                if (u51Var != null) {
                    for (int i3 = 0; i3 < u51Var.getChildCount(); i3++) {
                        View childAt = u51Var.getChildAt(i3);
                        if (childAt instanceof org.telegram.ui.Cells.l8) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void n0() {
        boolean z10;
        this.f31932p0 = -1;
        this.f31934q0 = -1;
        this.f31937r0 = -1;
        this.G0 = -1;
        this.C0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.D0 = -1;
        this.F0 = -1;
        this.E0 = -1;
        this.H0 = -1;
        cg.v0 v0Var = this.N0;
        v0Var.f4758b = -1;
        cg.v0 v0Var2 = this.O0;
        v0Var2.f4758b = -1;
        this.M0 = -1;
        this.f31950z0 = -1;
        this.A0 = -1;
        this.f31943v0 = -1;
        this.f31942u0 = -1;
        this.f31949y0 = -1;
        this.f31930o0 = -1;
        this.m0 = 1;
        this.R0 = 3;
        this.f31928n0 = 2;
        boolean z11 = this.f31927n;
        if (!z11) {
            this.R0 = 4;
            this.f31930o0 = 3;
        }
        int i3 = this.R0;
        int i10 = i3 + 1;
        this.f31940s0 = i3;
        int i11 = i3 + 2;
        this.R0 = i11;
        this.f31941t0 = i10;
        int i12 = this.N;
        if (i12 != 0) {
            this.f31942u0 = i11;
            this.R0 = i11 + i12;
        }
        if (i12 != this.L.length) {
            int i13 = this.R0;
            this.R0 = i13 + 1;
            this.f31943v0 = i13;
        }
        int i14 = this.R0;
        this.f31945w0 = i14;
        int i15 = i14 + 2;
        this.R0 = i15;
        this.f31947x0 = i14 + 1;
        if (z11) {
            int i16 = i14 + 3;
            this.R0 = i16;
            this.A0 = i15;
            if (this.f31918h0) {
                this.R0 = i14 + 4;
                this.f31950z0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.wm) this.f38416b.X1).f51292e;
            if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i17 = this.R0;
                this.R0 = i17 + 1;
                this.C0 = i17;
            } else {
                this.f31906b0 = true;
            }
            int i18 = this.R0;
            int i19 = i18 + 1;
            this.R0 = i19;
            this.G0 = i18;
            if (!z10) {
                this.R0 = i18 + 2;
                this.D0 = i19;
            } else {
                this.U = false;
            }
            int i20 = this.R0;
            this.E0 = i20;
            this.F0 = i20 + 1;
            int i21 = i20 + 3;
            this.R0 = i21;
            this.H0 = i20 + 2;
            if (z10) {
                v0Var.f4758b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                v0Var2.f4758b = i20 + 4;
                if (v0Var2.f4757a) {
                    this.R0 = i20 + 6;
                    this.M0 = i22;
                }
            }
            int i23 = this.R0;
            int i24 = i23 + 1;
            this.R0 = i24;
            this.I0 = i23;
            if (this.V != 0 || this.W != 0) {
                this.J0 = i24;
                this.K0 = i23 + 2;
                this.R0 = i23 + 4;
                this.L0 = i23 + 3;
            }
            int i25 = this.R0;
            int i26 = i25 + 1;
            this.R0 = i26;
            this.f31949y0 = i25;
            if (this.f31910d0) {
                this.f31932p0 = i26;
                this.f31934q0 = i25 + 2;
                this.R0 = i25 + 4;
                this.f31937r0 = i25 + 3;
            }
        }
        int i27 = this.R0;
        this.R0 = i27 + 1;
        this.B0 = i27;
    }

    @Override
    public final void p() {
        this.I = true;
        bi biVar = this.f38416b;
        org.telegram.messenger.hs.f(biVar.E3).n(this, org.telegram.messenger.hs.f23326w0);
        if (this.J) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
            ey eyVar = this.F;
            if (eyVar != null) {
                biVar.f32249m3.removeView(eyVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f31922j0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!W()) {
            return false;
        }
        return true;
    }

    public void setDelegate(zm zmVar) {
        this.f31924k0 = zmVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    @Override
    public final void t() {
        this.f38416b.L1();
    }

    @Override
    public final void updateColors() {
        try {
            this.k1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vl, this.f38415a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v(float f10) {
        this.f38416b.L1();
    }

    @Override
    public final void w(int i3) {
        int i10;
        boolean z10;
        if (i3 == 40) {
            boolean z11 = this.f31927n;
            int i11 = 0;
            int i12 = 1;
            bi biVar = this.f38416b;
            CharSequence[] charSequenceArr = this.L;
            if (z11) {
                CharSequence[] charSequenceArr2 = {d0(this.O)};
                int i13 = biVar.E3;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.li.b0(i13).W(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (W != null) {
                    int size = W.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.MessageEntity messageEntity = W.get(i14);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f31918h0;
                if (z12 && this.f31916g0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = W;
                for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i15]))) {
                        CharSequence[] charSequenceArr3 = {d0(charSequenceArr[i15])};
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.li.b0(i13).W(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (W2 != null) {
                            int size2 = W2.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                TLRPC.MessageEntity messageEntity2 = W2.get(i16);
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
                        todoItem.f27148id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                t4.Z(i13, biVar.X0() + 1, biVar.b1(), new ai.m(this, (org.telegram.ui.wm) biVar.X1, tL_messageMediaToDo, 9));
                return;
            }
            boolean z13 = this.f31910d0;
            org.telegram.ui.u51 u51Var = this.f31939s;
            boolean[] zArr = this.M;
            if (z13 && !this.Y0) {
                int i17 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i11])) && zArr[i11]) {
                        i17++;
                    }
                    i11++;
                }
                if (i17 <= 0) {
                    for (int i18 = this.f31942u0; i18 < this.f31942u0 + this.N; i18++) {
                        u4.d1 K = u51Var.K(i18);
                        if (K != null) {
                            View view = K.f55540a;
                            if (view instanceof org.telegram.ui.Cells.z5) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    rm rmVar = this.f31948y;
                                    if (rmVar != null) {
                                        rmVar.f();
                                    }
                                    String M0 = org.telegram.messenger.bd.M0(2131747163, null);
                                    u20 u20Var = this.E;
                                    u20Var.setText(M0);
                                    u20Var.c(z5Var.getCheckBox());
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
            int i19 = 0;
            while (true) {
                int length = charSequenceArr.length;
                th.d dVar = this.f31929n1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && dVar.b(i19) != null) {
                        this.W0 = true;
                        this.X0 = i19;
                        u51Var.y0(this.f31942u0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {d0(this.O)};
                    int i20 = biVar.E3;
                    ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.li.b0(i20).W(charSequenceArr4, true, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (W3 != null) {
                        int size3 = W3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            TLRPC.MessageEntity messageEntity3 = W3.get(i21);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f31908c0;
                    tL_poll.quiz = this.f31910d0;
                    tL_poll.public_voters = !this.f31906b0;
                    tL_poll.open_answers = this.U;
                    tL_poll.revoting_disabled = !this.S;
                    tL_poll.shuffle_answers = this.T;
                    tL_poll.subscribers_only = this.N0.f4757a;
                    if (this.O0.f4757a) {
                        ArrayList arrayList = this.Q0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i22 = this.V;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.f31904a0;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.W;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.f31904a0;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = W3;
                    ArrayList arrayList2 = new ArrayList(this.K);
                    int i24 = 0;
                    while (i24 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(d0(charSequenceArr[i24]))) {
                            dVar.h(tL_messageMediaPoll.poll.answers.size());
                            i10 = i11;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i12];
                            charSequenceArr5[i11] = d0(charSequenceArr[i24]);
                            ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.li.b0(i20).W(charSequenceArr5, i12, i12);
                            CharSequence charSequence4 = charSequenceArr5[i11];
                            if (W4 != null) {
                                int size4 = W4.size();
                                int i25 = i11;
                                while (i25 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = W4.get(i25);
                                    int i26 = i11;
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                    i25++;
                                    i11 = i26;
                                }
                            }
                            i10 = i11;
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = W4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i10] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.f31908c0 || this.f31910d0) && zArr[i24]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i24++;
                        i11 = i10;
                        i12 = 1;
                    }
                    int i27 = i11;
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence d02 = d0(this.Q);
                    if (d02 != null) {
                        tL_messageMediaPoll.results.solution = d02.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i27] = d02;
                        ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.li.b0(i20).W(charSequenceArr6, true, true);
                        if (W5 != null && !W5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = W5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    t4.Z(i20, biVar.X0() + 1, biVar.b1(), new ai.v1(this, (org.telegram.ui.wm) biVar.X1, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }
}

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
public final class tn extends mi implements org.telegram.ui.ActionBar.b6, cu0, org.telegram.messenger.gs {
    public static final int f39926s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final m30 E;
    public int E0;
    public ty F;
    public int F0;
    public final hi.o3 G;
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
    public final bg.w0 N0;
    public Editable O;
    public final bg.w0 O0;
    public Editable P;
    public final bg.w0[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final sh.o R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final ik V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean f39927a0;
    public boolean f39928a1;
    public boolean f39929b0;
    public boolean f39930b1;
    public boolean f39931c0;
    public int f39932c1;
    public boolean f39933d0;
    public int f39934d1;
    public boolean f39935e0;
    public int f39936e1;
    public final boolean f39937f0;
    public boolean f39938f1;
    public boolean f39939g0;
    public boolean f39940g1;
    public boolean f39941h0;
    public org.telegram.ui.Cells.b6 f39942h1;
    public boolean f39943i0;
    public boolean f39944i1;
    public boolean f39945j0;
    public boolean f39946j1;
    public sn f39947k0;
    public final Paint f39948k1;
    public int f39949l0;
    public fi.n2 l1;
    public int m0;
    public int f39950m1;
    public final boolean f39951n;
    public int f39952n0;
    public final sh.d n1;
    public int f39953o0;
    public Drawable f39954o1;
    public int f39955p0;
    public Drawable f39956p1;
    public int f39957q0;
    public int f39958q1;
    public final org.telegram.ui.l4 f39959r;
    public int f39960r0;
    public int f39961r1;
    public final org.telegram.ui.f61 f39962s;
    public int f39963s0;
    public int f39964t0;
    public int f39965u0;
    public int f39966v0;
    public final hn f39967w;
    public int f39968w0;
    public final kg.d0 f39969x;
    public int f39970x0;
    public final kn f39971y;
    public int f39972y0;
    public int f39973z0;

    public tn(ui uiVar, Context context, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, Boolean bool) {
        super(context, h6Var, uiVar);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.f39931c0 = true;
        this.f39939g0 = true;
        this.f39941h0 = true;
        this.f39949l0 = -1;
        bg.w0 w0Var = new bg.w0(this);
        this.N0 = w0Var;
        bg.w0 w0Var2 = new bg.w0(this);
        this.O0 = w0Var2;
        this.P0 = new bg.w0[]{w0Var, w0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new ik(this, 2);
        this.W0 = false;
        this.X0 = -1;
        this.f39944i1 = false;
        this.f39946j1 = false;
        Paint paint = new Paint(1);
        this.f39948k1 = paint;
        this.n1 = new sh.d();
        this.f39951n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.k10.i(org.telegram.messenger.c.a(this.f37477b.H3).f23166a).q();
        this.J = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f39933d0 = booleanValue;
            this.f39937f0 = booleanValue;
            boolean z11 = !booleanValue;
            this.U = z11;
            this.S = z11;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Yl, this.f37476a));
        this.f37477b.f40398p3.setDelegate(this);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(1, this, context);
        this.f39959r = l4Var;
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(5, context, null);
        this.f39962s = f61Var;
        setBlur3Capture(f61Var);
        this.d = f61Var;
        this.h = true;
        this.f37480f = true;
        hn hnVar = new hn(this);
        this.f39967w = hnVar;
        f61Var.setItemAnimator(hnVar);
        arrayList.clear();
        hnVar.f59139m = false;
        hnVar.C = false;
        hnVar.o(nr.h);
        hnVar.n(350L);
        f61Var.setClipToPadding(false);
        f61Var.setVerticalScrollBarEnabled(false);
        f61Var.setSections(true);
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.f24004m, f61Var, 4);
        this.f39969x = d0Var;
        f61Var.setLayoutManager(d0Var);
        d0Var.O = true;
        new v4.y(new gi.c(this, 4)).h(f61Var);
        addView(f61Var, c8.na.e(-1, -1, 51));
        f61Var.setPreserveFocusAfterLayout(true);
        f61Var.setAdapter(l4Var);
        f61Var.setOnItemClickListener(new xm(this, h6Var, uiVar, context));
        f61Var.setOnScrollListener(new oa(this, 6));
        m30 m30Var = new m30(context, 4);
        this.E = m30Var;
        m30Var.setAlpha(0.0f);
        m30Var.setVisibility(4);
        addView(m30Var, c8.na.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(this.f37477b.H3).A7.O.f15495b).f24776c;
        this.R = new sh.o(this.f37477b.H3);
        org.telegram.messenger.ls.f(this.f37477b.H3).c(this, org.telegram.messenger.ls.f25369w0);
        if (q10) {
            org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25306l4);
            ?? ax0Var = new ax0(context, this.f37477b.H3, null, h6Var);
            this.f39971y = ax0Var;
            ax0Var.E = true;
            ax0Var.F = true;
            ax0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView((View) ax0Var, c8.na.e(-2, 160, 51));
        }
        this.G = new hi.o3(this.f37477b.f40398p3, false, null);
        Y();
    }

    public static void P(tn tnVar, int i7) {
        m30 m30Var = tnVar.E;
        v4.e1 K = tnVar.f39962s.K(tnVar.f39965u0 + i7);
        if (K != null) {
            View view = K.f59111a;
            if (view instanceof org.telegram.ui.Cells.b6) {
                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    kn knVar = tnVar.f39971y;
                    if (knVar != null) {
                        knVar.f();
                    }
                    m30Var.setText(org.telegram.messenger.hd.N0(2131746988, null));
                    m30Var.c(b6Var.getCheckBox());
                    ImageView imageView = m30Var.f37353b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    m30Var.setTranslationY(m30Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    public static void Q(org.telegram.ui.Components.tn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.Q(org.telegram.ui.Components.tn, android.view.View, int):void");
    }

    public static void R(tn tnVar, org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        v4.e1 T;
        if (tnVar.J && z10) {
            if (tnVar.f39942h1 == b6Var && tnVar.f39930b1 && tnVar.f39944i1) {
                tnVar.b0();
                tnVar.f39930b1 = false;
            }
            org.telegram.ui.Cells.b6 b6Var2 = tnVar.f39942h1;
            tnVar.f39942h1 = b6Var;
            b6Var.setEmojiButtonVisibility(true);
            ah emojiButton = b6Var.getEmojiButton();
            yg ygVar = yg.f42410e;
            emojiButton.j(ygVar, false);
            org.telegram.ui.f61 f61Var = tnVar.f39962s;
            View F = f61Var.F(b6Var);
            if (F == null) {
                T = null;
            } else {
                T = f61Var.T(F);
            }
            kn knVar = tnVar.f39971y;
            if (knVar != null) {
                knVar.f();
                if (T != null) {
                    View view = T.f59111a;
                    if ((view instanceof org.telegram.ui.Cells.b6) && knVar.getDelegate() != view) {
                        knVar.setDelegate((org.telegram.ui.Cells.b6) view);
                    }
                }
            }
            if (b6Var2 != null && b6Var2 != b6Var) {
                if (tnVar.f39930b1) {
                    tnVar.b0();
                    tnVar.e0(false);
                    tnVar.h0();
                }
                b6Var2.setEmojiButtonVisibility(false);
                b6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void S(tn tnVar, org.telegram.ui.Cells.b6 b6Var) {
        tnVar.f39942h1 = b6Var;
        if (tnVar.f39930b1) {
            tnVar.b0();
            tnVar.h0();
            return;
        }
        tnVar.k0(1);
    }

    public static void T(tn tnVar, int i7) {
        ui uiVar;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i10;
        sh.d dVar = tnVar.n1;
        if (dVar.b(i7) != null) {
            sh.c b10 = dVar.b(i7);
            if (b10 != null && (uiVar = tnVar.f37477b) != null && (g2Var = uiVar.f40352a2) != null) {
                Activity parentActivity = g2Var.getParentActivity();
                if (b10 instanceof th.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((th.d) b10).f58225b);
                    PhotoViewer.p1().I2(parentActivity, null, null);
                    PhotoViewer.p1().f2(arrayList, 0, 14, false, new an(tnVar, i7), null);
                    return;
                } else if (b10 instanceof th.h) {
                    th.h hVar = (th.h) b10;
                    org.telegram.ui.ns.p().v(parentActivity);
                    org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                    ?? obj = new Object();
                    obj.f34188b = tnVar;
                    obj.f34187a = i7;
                    p10.u(obj);
                    org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                    TLRPC.Document document = hVar.f58237b;
                    if (org.telegram.messenger.gj.H2(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    p11.s(document, null, "", null, null, i10, false, hVar.f58238c, tnVar.f37476a, 200);
                    return;
                } else if (b10 instanceof th.c) {
                    th.c cVar = (th.c) b10;
                    String str = cVar.d;
                    tnVar.l0(i7, new org.telegram.ui.ef(1, str, org.telegram.messenger.g0.i0(cVar.f58222e, true, true) + " " + cVar.f58223f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.g) {
                    th.g gVar = (th.g) b10;
                    TLRPC.Document F0 = gVar.f58235b.F0();
                    String x12 = org.telegram.messenger.gj.x1(F0);
                    tnVar.l0(i7, new hi.r4(x12, org.telegram.messenger.gj.v1(F0) + " - " + org.telegram.messenger.hd.R((int) org.telegram.messenger.gj.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.f) {
                    tnVar.l0(i7, new wi((th.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof th.e) {
                    th.e eVar = (th.e) b10;
                    c5.d0(tnVar.getContext(), tnVar.f37476a, eVar.f58227b, eVar.f58231n, new sm(tnVar, i7, 1), new um(tnVar, i7, 0));
                    return;
                } else {
                    tnVar.g0(i7);
                    return;
                }
            }
            return;
        }
        tnVar.g0(i7);
    }

    public static CharSequence d0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence);
        while (TextUtils.indexOf(n1, "\n\n\n") >= 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n1, "\n\n\n") == 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n1;
    }

    private int getAnswersMaxCount() {
        if (this.f39951n) {
            return getMessagesController().U6;
        }
        return ((org.telegram.messenger.j0) getMessagesController().A7.L.f15495b).f24776c;
    }

    private int getCurrentAccount() {
        ui uiVar = this.f37477b;
        if (uiVar != null) {
            return uiVar.H3;
        }
        return org.telegram.messenger.k10.f24932t0;
    }

    private org.telegram.messenger.np getMessagesController() {
        return org.telegram.messenger.np.u1(getCurrentAccount());
    }

    public static fi.n2 i0(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.messenger.y10 y10Var, ng ngVar) {
        if (g2Var == null) {
            return null;
        }
        fi.n2 n2Var = new fi.n2(g2Var.getContext(), g2Var, g2Var.getResourceProvider(), ngVar);
        n2Var.X3 = new en(n2Var, y10Var, g2Var);
        n2Var.Y3 = new fn(y10Var, n2Var);
        n2Var.f40363e2.i0();
        n2Var.z1(1, true);
        n2Var.W0(i7);
        n2Var.f40419u4 = new vm(y10Var);
        n2Var.S1 = new gn(n2Var, y10Var, g2Var);
        n2Var.T1 = new h2(14, y10Var, n2Var);
        n2Var.f1();
        n2Var.A0(true);
        n2Var.show();
        return n2Var;
    }

    @Override
    public final void A() {
        org.telegram.ui.l4 l4Var = this.f39959r;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.J) {
            e0(false);
            kn knVar = this.f39971y;
            if (knVar != null) {
                knVar.f();
            }
            org.telegram.ui.Cells.b6 b6Var = this.f39942h1;
            if (b6Var != null) {
                b6Var.setEmojiButtonVisibility(false);
                this.f39942h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f39942h1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.B(int, int):void");
    }

    @Override
    public final void I(mi miVar) {
        ui uiVar = this.f37477b;
        try {
            uiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f39951n) {
            uiVar.V2.setTitle(org.telegram.messenger.hd.N0(2131743813, null));
        } else if (this.f39937f0) {
            uiVar.V2.setTitle(org.telegram.messenger.hd.N0(2131748071, null));
        } else {
            uiVar.V2.setTitle(org.telegram.messenger.hd.N0(2131748072, null));
        }
        uiVar.M1();
        this.f39969x.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f39962s.y0(1);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.J) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f39938f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.f39936e1 = i7;
                    org.telegram.messenger.np.f1().edit().putInt("kbd_height_land3", this.f39936e1).commit();
                } else {
                    this.f39934d1 = i7;
                    org.telegram.messenger.np.f1().edit().putInt("kbd_height", this.f39934d1).commit();
                }
            }
            boolean z13 = this.f39930b1;
            ui uiVar = this.f37477b;
            hi.o3 o3Var = this.G;
            if (z13) {
                if (z10) {
                    i10 = this.f39936e1;
                } else {
                    i10 = this.f39934d1;
                }
                if (this.f39944i1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.f24005n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.f24010q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f39946j1 != this.f39944i1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.F.setLayoutParams(layoutParams);
                    this.f39932c1 = layoutParams.height;
                    o3Var.a();
                    uiVar.f40398p3.requestLayout();
                    boolean z14 = this.f39946j1;
                    if (z14 != this.f39944i1) {
                        if (z14) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        V(L);
                    }
                    this.f39946j1 = this.f39944i1;
                }
            }
            if (this.Z0 != i7 || this.f39928a1 != z10) {
                this.Z0 = i7;
                this.f39928a1 = z10;
                boolean z15 = this.f39938f1;
                org.telegram.ui.Cells.b6 b6Var = this.f39942h1;
                if (b6Var != null) {
                    if (b6Var.getEditField().isFocused() && o3Var.c() && i7 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f39938f1 = z12;
                } else {
                    this.f39938f1 = false;
                }
                if (this.f39938f1 && this.f39930b1) {
                    k0(0);
                }
                if (this.f39932c1 != 0 && !(z11 = this.f39938f1) && z11 != z15 && !this.f39930b1) {
                    this.f39932c1 = 0;
                    o3Var.a();
                    uiVar.f40398p3.requestLayout();
                }
                if (this.f39938f1 && this.H) {
                    this.H = false;
                    org.telegram.messenger.g0.r(this.V0);
                }
            }
        }
    }

    public final void U() {
        kn knVar = this.f39971y;
        if (knVar != null) {
            knVar.setDelegate(null);
            knVar.f();
        }
        this.f39962s.setItemAnimator(this.f39967w);
        int i7 = this.N;
        this.M[i7] = false;
        int i10 = i7 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.l4 l4Var = this.f39959r;
        if (i10 == length) {
            l4Var.s(this.f39966v0);
        }
        l4Var.i(this.f39966v0);
        n0();
        this.f39949l0 = (this.f39965u0 + this.N) - 1;
        l4Var.g(this.f39968w0);
        l4Var.g(this.B0);
    }

    public final void V(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.rf(this, f10, 4));
        ofFloat.addListener(new zm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
        ofFloat.start();
    }

    public final void W() {
        boolean z10;
        if (!this.f39933d0 && !this.f39929b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.U = false;
        }
        int i7 = this.D0;
        if (i7 < 0) {
            return;
        }
        v4.e1 K = this.f39962s.K(i7);
        if (K == null) {
            this.f39959r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) K.f59111a;
        if (!z10) {
            z5Var.setChecked(false);
        }
        z5Var.getCheckBox().f33134a.a(!z10, true);
    }

    public final boolean X() {
        boolean z10;
        int i7;
        int i10;
        if (TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.n1.f57442a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i11]))); i11++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37477b.f40352a2.getParentActivity());
            boolean z11 = this.f39951n;
            if (z11) {
                i7 = 2131752555;
            } else {
                i7 = 2131752561;
            }
            String N0 = org.telegram.messenger.hd.N0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            if (z11) {
                i10 = 2131752556;
            } else {
                i10 = 2131752562;
            }
            t1Var.U = org.telegram.messenger.hd.N0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747386, null), new c0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void Y() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11 = this.f39933d0;
        CharSequence[] charSequenceArr = this.L;
        if (z11) {
            int i12 = 0;
            i7 = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i12 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(d0(charSequenceArr[i12])) && zArr[i12]) {
                    i7++;
                }
                i12++;
            }
        } else {
            i7 = 0;
        }
        boolean z12 = this.f39951n;
        if (z12) {
            i10 = getMessagesController().V6;
        } else {
            i10 = 255;
        }
        if (z12) {
            i11 = getMessagesController().W6;
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
        if (i14 < 1 || (this.f39933d0 && i7 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.n1.f57442a.size() <= 0) {
            this.f39943i0 = true;
        } else {
            this.f39943i0 = false;
        }
        boolean z14 = this.f39943i0;
        ui uiVar = this.f37477b;
        uiVar.f30173r0 = z14;
        this.Y0 = z10;
        uiVar.M1();
    }

    public final void Z(org.telegram.ui.Cells.n8 n8Var, boolean z10) {
        if (this.W != 0) {
            n8Var.q(org.telegram.messenger.hd.N0(2131746936, null), org.telegram.messenger.hd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            n8Var.q(org.telegram.messenger.hd.N0(2131746938, null), org.telegram.messenger.hd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            n8Var.q(org.telegram.messenger.hd.N0(2131746936, null), null, z10, false);
        }
    }

    public final void a0(th.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f58227b;
        sh.o oVar = this.R;
        boolean containsKey = oVar.f57485c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) oVar.f57484b.get(eVar.f58227b);
        te.a aVar = eVar.f58233s;
        ImageReceiver imageReceiver = eVar.f57441a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f58232r.a(z11, z10);
        eVar.f58231n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.gc.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z10);
            return;
        }
        aVar.a(false, z10);
        imageReceiver.f();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29758z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29290a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
    }

    public final void b0() {
        if (this.f39944i1) {
            this.F.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.f39932c1 = layoutParams.height;
            this.f39946j1 = this.f39944i1;
            this.f39944i1 = false;
            V(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    public final void c0(android.view.View r10, org.telegram.ui.Cells.b6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.c0(android.view.View, org.telegram.ui.Cells.b6, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i7 == org.telegram.messenger.ls.f25369w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.R.f57484b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f28553id)) != null) {
                    entry.setValue(webPage);
                }
            }
            sh.d dVar = this.n1;
            int size = dVar.f57442a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sh.c cVar = (sh.c) dVar.f57442a.get(i11);
                if (cVar instanceof th.e) {
                    a0((th.e) cVar, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25306l4) {
            ty tyVar = this.F;
            if (tyVar != null) {
                tyVar.Q.g1();
            }
            org.telegram.ui.Cells.b6 b6Var = this.f39942h1;
            if (b6Var != null) {
                int currentTextColor = b6Var.getEditField().getCurrentTextColor();
                this.f39942h1.getEditField().setTextColor(-1);
                this.f39942h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            if (this.f39930b1) {
                ty tyVar = this.F;
                tyVar.Q.C0();
                tyVar.J.scrollTo(0, 0);
                tyVar.F(1);
                tyVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.f39944i1 = false;
                k0(0);
            }
            if (z10) {
                ty tyVar2 = this.F;
                if (tyVar2 != null && tyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new wm(this, 0));
                    this.f39940g1 = true;
                    ofFloat.addListener(new zm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                    ofFloat.start();
                    return;
                }
                f0();
            }
        }
    }

    public final void f0() {
        ty tyVar;
        ah emojiButton;
        if (!this.f39930b1 && (tyVar = this.F) != null && tyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.b6 b6Var = this.f39942h1;
            if (b6Var != null && (emojiButton = b6Var.getEmojiButton()) != null) {
                emojiButton.j(yg.f42410e, false);
            }
            this.F.setVisibility(8);
        }
        int i7 = this.f39932c1;
        this.f39932c1 = 0;
        if (i7 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i7) {
        int i10;
        this.f39950m1 = i7;
        org.telegram.ui.ActionBar.g2 g2Var = this.f37477b.f40352a2;
        this.n1.b(i7);
        if (i7 != -2 && i7 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.l1 = i0(g2Var, i10, new sm(this, i7, 0), new ng(this, 29));
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        v4.e1 T;
        int i7;
        org.telegram.ui.f61 f61Var = this.f39962s;
        if (f61Var.getChildCount() <= 1 || (childAt = f61Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = f61Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        mj0 mj0Var = (mj0) T;
        int y10 = (((int) childAt.getY()) - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(20.0f);
        if (y10 > 0 && mj0Var != null && mj0Var.b() == 1) {
            i7 = y10;
        } else {
            i7 = 0;
        }
        if (y10 < 0 || mj0Var == null || mj0Var.b() != 1) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.f39932c1;
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
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        org.telegram.ui.f61 f61Var = this.f39962s;
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 16, new Class[]{ln.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29290a7));
        int i10 = org.telegram.ui.ActionBar.m6.f29568p7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.f29512m6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 8388608, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 0, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        int i12 = org.telegram.ui.ActionBar.m6.f29477k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 0, new Class[]{org.telegram.ui.Cells.b6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        int i13 = org.telegram.ui.ActionBar.m6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 32, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f61Var, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        return arrayList;
    }

    public final void h0() {
        int i7;
        org.telegram.ui.Cells.b6 b6Var = this.f39942h1;
        if (b6Var != null) {
            this.G.f15108e = true;
            EditTextBoldCursor editField = b6Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.I3(editField);
        }
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        k0(i7);
        if (!org.telegram.messenger.g0.D && !this.f39938f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.H = true;
            ik ikVar = this.V0;
            org.telegram.messenger.g0.r(ikVar);
            org.telegram.messenger.g0.h3(ikVar, 100L);
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

    public final void j0(int i7, sh.c cVar) {
        int i10;
        sh.d dVar = this.n1;
        if (cVar != null) {
            dVar.f57442a.put(i7, cVar);
        } else {
            dVar.f57442a.remove(i7);
        }
        if (i7 == -2) {
            i10 = this.f39953o0;
        } else if (i7 == -3) {
            i10 = this.f39957q0;
        } else {
            int i11 = this.f39965u0;
            if (i11 >= 0 && i7 >= 0 && i7 < this.N) {
                i10 = i7 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            v4.e1 K = this.f39962s.K(i10);
            if (K != null) {
                View view = K.f59111a;
                if (view instanceof org.telegram.ui.Cells.b6) {
                    ((org.telegram.ui.Cells.b6) view).f30442e.b(cVar, true);
                }
            }
            this.f39959r.g(i10);
        }
        if (cVar instanceof th.e) {
            th.e eVar = (th.e) cVar;
            String str = eVar.f58227b;
            bi.r6 r6Var = new bi.r6(18, this, cVar);
            sh.o oVar = this.R;
            HashMap hashMap = oVar.f57485c;
            HashMap hashMap2 = oVar.f57484b;
            if (hashMap2.containsKey(str)) {
                r6Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(r6Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(oVar.f57483a).sendRequestTyped(getwebpagepreview, new d3.b(1), new org.telegram.ui.Wallet.e0(8, oVar, str));
                }
            }
            a0(eVar, false);
        }
        Y();
    }

    @Override
    public final boolean k() {
        if (this.f39930b1) {
            e0(true);
            return true;
        } else if (!X()) {
            return true;
        } else {
            return false;
        }
    }

    public final void k0(int i7) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.b6 b6Var;
        if (this.J) {
            hi.o3 o3Var = this.G;
            ah ahVar = null;
            ui uiVar = this.f37477b;
            if (i7 == 1) {
                ty tyVar = this.F;
                if (tyVar != null && tyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ty tyVar2 = this.F;
                if (tyVar2 != null && tyVar2.f40074d1 != org.telegram.messenger.k10.f24932t0) {
                    uiVar.f40398p3.removeView(tyVar2);
                    this.F = null;
                }
                if (this.F == null) {
                    ty tyVar3 = new ty(null, true, false, false, getContext(), true, null, null, true, this.f37476a, false, false);
                    this.F = tyVar3;
                    tyVar3.f40069c = 3;
                    tyVar3.f40136x0 = false;
                    tyVar3.f40142y2 = false;
                    tyVar3.setShouldDrawBackground(false);
                    ty tyVar4 = this.F;
                    tyVar4.V0 = false;
                    tyVar4.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new ym(this));
                    uiVar.f40398p3.addView(this.F);
                    this.F.setBottomInset(org.telegram.messenger.g0.f24005n);
                }
                this.F.setVisibility(0);
                this.f39930b1 = true;
                ty tyVar5 = this.F;
                if (this.f39934d1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f39934d1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f39934d1 = org.telegram.messenger.np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.f39936e1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f39936e1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f39936e1 = org.telegram.messenger.np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i10 = this.f39936e1;
                } else {
                    i10 = this.f39934d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tyVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f24005n + i10;
                tyVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (b6Var = this.f39942h1) != null) {
                    org.telegram.messenger.g0.v1(b6Var.getEditField());
                }
                this.f39932c1 = i10;
                o3Var.a();
                uiVar.f40398p3.requestLayout();
                org.telegram.ui.Cells.b6 b6Var2 = this.f39942h1;
                if (b6Var2 != null) {
                    ahVar = b6Var2.getEmojiButton();
                }
                if (ahVar != null) {
                    ahVar.j(yg.d, true);
                }
                if (!z10 && !this.f39938f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39932c1, 0.0f);
                    ofFloat.addUpdateListener(new wm(this, 1));
                    ofFloat.addListener(new zm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b6 b6Var3 = this.f39942h1;
            if (b6Var3 != null) {
                ahVar = b6Var3.getEmojiButton();
            }
            if (ahVar != null) {
                ahVar.j(yg.f42410e, true);
            }
            ty tyVar6 = this.F;
            if (tyVar6 != null) {
                this.f39930b1 = false;
                this.f39944i1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    tyVar6.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f39932c1 = 0;
            }
            o3Var.a();
            uiVar.f40398p3.requestLayout();
        }
    }

    public final void l0(int i7, org.telegram.messenger.z10 z10Var, int i10, int i11) {
        a70 G = a70.G(this, null, new View(getContext()));
        G.f33363s = 0;
        G.f33365t = false;
        G.c(2131232333, org.telegram.messenger.hd.N0(2131746075, null), new um(this, i7, 1), false);
        G.c(2131232110, org.telegram.messenger.hd.N0(2131751586, null), new um(this, i7, 2), true);
        yk0 yk0Var = new yk0(getContext(), this.f37476a);
        G.f33357p = new org.telegram.ui.fe(yk0Var, 1);
        G.V = org.telegram.messenger.g0.L(185.0f);
        G.Z();
        yk0Var.e(G);
        fh.g c10 = yk0Var.f42428n.c(null, null, false);
        c10.p(c8.j0.l(yk0Var.f42424b));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.f11634e = true;
        c10.r(org.telegram.messenger.g0.L(16.0f));
        yk0Var.G = c10;
        yk0Var.F = (Drawable) z10Var.a(yk0Var.f42430s);
        Point point = org.telegram.messenger.g0.f24010q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        yk0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) yk0Var.f42433y.getLayoutParams()).gravity = 1;
        yk0Var.M = true;
        yk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f37476a;
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.N6, h6Var);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29477k7, h6Var);
            if (w02 != this.f39958q1 || w03 != this.f39961r1) {
                this.f39958q1 = w02;
                this.f39961r1 = w03;
                Drawable drawable = this.f39954o1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f39956p1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.f61 f61Var = this.f39962s;
                if (f61Var != null) {
                    for (int i7 = 0; i7 < f61Var.getChildCount(); i7++) {
                        View childAt = f61Var.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.n8) {
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
        this.f39955p0 = -1;
        this.f39957q0 = -1;
        this.f39960r0 = -1;
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
        bg.w0 w0Var = this.N0;
        w0Var.f3325b = -1;
        bg.w0 w0Var2 = this.O0;
        w0Var2.f3325b = -1;
        this.M0 = -1;
        this.f39973z0 = -1;
        this.A0 = -1;
        this.f39966v0 = -1;
        this.f39965u0 = -1;
        this.f39972y0 = -1;
        this.f39953o0 = -1;
        this.m0 = 1;
        this.R0 = 3;
        this.f39952n0 = 2;
        boolean z11 = this.f39951n;
        if (!z11) {
            this.R0 = 4;
            this.f39953o0 = 3;
        }
        int i7 = this.R0;
        int i10 = i7 + 1;
        this.f39963s0 = i7;
        int i11 = i7 + 2;
        this.R0 = i11;
        this.f39964t0 = i10;
        int i12 = this.N;
        if (i12 != 0) {
            this.f39965u0 = i11;
            this.R0 = i11 + i12;
        }
        if (i12 != this.L.length) {
            int i13 = this.R0;
            this.R0 = i13 + 1;
            this.f39966v0 = i13;
        }
        int i14 = this.R0;
        this.f39968w0 = i14;
        int i15 = i14 + 2;
        this.R0 = i15;
        this.f39970x0 = i14 + 1;
        if (z11) {
            int i16 = i14 + 3;
            this.R0 = i16;
            this.A0 = i15;
            if (this.f39941h0) {
                this.R0 = i14 + 4;
                this.f39973z0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.bn) this.f37477b.f40352a2).f45958e;
            if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i17 = this.R0;
                this.R0 = i17 + 1;
                this.C0 = i17;
            } else {
                this.f39929b0 = true;
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
                w0Var.f3325b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                w0Var2.f3325b = i20 + 4;
                if (w0Var2.f3324a) {
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
            this.f39972y0 = i25;
            if (this.f39933d0) {
                this.f39955p0 = i26;
                this.f39957q0 = i25 + 2;
                this.R0 = i25 + 4;
                this.f39960r0 = i25 + 3;
            }
        }
        int i27 = this.R0;
        this.R0 = i27 + 1;
        this.B0 = i27;
    }

    @Override
    public final void p() {
        this.I = true;
        ui uiVar = this.f37477b;
        org.telegram.messenger.ls.f(uiVar.H3).n(this, org.telegram.messenger.ls.f25369w0);
        if (this.J) {
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
            ty tyVar = this.F;
            if (tyVar != null) {
                uiVar.f40398p3.removeView(tyVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f39945j0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!X()) {
            return false;
        }
        return true;
    }

    public void setDelegate(sn snVar) {
        this.f39947k0 = snVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37477b.f30142b.invalidate();
    }

    @Override
    public final void t() {
        this.f37477b.M1();
    }

    @Override
    public final void updateColors() {
        try {
            this.f39948k1.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Yl, this.f37476a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v(float f10) {
        this.f37477b.M1();
    }

    @Override
    public final void w(int i7) {
        int i10;
        boolean z10;
        if (i7 == 40) {
            boolean z11 = this.f39951n;
            int i11 = 0;
            int i12 = 1;
            ui uiVar = this.f37477b;
            CharSequence[] charSequenceArr = this.L;
            if (z11) {
                CharSequence[] charSequenceArr2 = {d0(this.O)};
                int i13 = uiVar.H3;
                ArrayList<TLRPC.MessageEntity> Y = org.telegram.messenger.si.d0(i13).Y(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (Y != null) {
                    int size = Y.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.MessageEntity messageEntity = Y.get(i14);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f39941h0;
                if (z12 && this.f39939g0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = Y;
                for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i15]))) {
                        CharSequence[] charSequenceArr3 = {d0(charSequenceArr[i15])};
                        ArrayList<TLRPC.MessageEntity> Y2 = org.telegram.messenger.si.d0(i13).Y(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (Y2 != null) {
                            int size2 = Y2.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                TLRPC.MessageEntity messageEntity2 = Y2.get(i16);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = Y2;
                        todoItem.f28545id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                c5.X(i13, uiVar.Y0() + 1, uiVar.c1(), new bi.j(this, (org.telegram.ui.bn) uiVar.f40352a2, tL_messageMediaToDo, 12));
                return;
            }
            boolean z13 = this.f39933d0;
            org.telegram.ui.f61 f61Var = this.f39962s;
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
                    for (int i18 = this.f39965u0; i18 < this.f39965u0 + this.N; i18++) {
                        v4.e1 K = f61Var.K(i18);
                        if (K != null) {
                            View view = K.f59111a;
                            if (view instanceof org.telegram.ui.Cells.b6) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                                if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    kn knVar = this.f39971y;
                                    if (knVar != null) {
                                        knVar.f();
                                    }
                                    String N0 = org.telegram.messenger.hd.N0(2131746961, null);
                                    m30 m30Var = this.E;
                                    m30Var.setText(N0);
                                    m30Var.c(b6Var.getCheckBox());
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
                sh.d dVar = this.n1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && dVar.b(i19) != null) {
                        this.W0 = true;
                        this.X0 = i19;
                        f61Var.y0(this.f39965u0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {d0(this.O)};
                    int i20 = uiVar.H3;
                    ArrayList<TLRPC.MessageEntity> Y3 = org.telegram.messenger.si.d0(i20).Y(charSequenceArr4, true, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (Y3 != null) {
                        int size3 = Y3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            TLRPC.MessageEntity messageEntity3 = Y3.get(i21);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f39931c0;
                    tL_poll.quiz = this.f39933d0;
                    tL_poll.public_voters = !this.f39929b0;
                    tL_poll.open_answers = this.U;
                    tL_poll.revoting_disabled = !this.S;
                    tL_poll.shuffle_answers = this.T;
                    tL_poll.subscribers_only = this.N0.f3324a;
                    if (this.O0.f3324a) {
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
                        poll2.hide_results_until_close = this.f39927a0;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.W;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.f39927a0;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = Y3;
                    ArrayList arrayList2 = new ArrayList(this.K);
                    int i24 = 0;
                    while (i24 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(d0(charSequenceArr[i24]))) {
                            dVar.h(tL_messageMediaPoll.poll.answers.size());
                            i10 = i11;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i12];
                            charSequenceArr5[i11] = d0(charSequenceArr[i24]);
                            ArrayList<TLRPC.MessageEntity> Y4 = org.telegram.messenger.si.d0(i20).Y(charSequenceArr5, i12, i12);
                            CharSequence charSequence4 = charSequenceArr5[i11];
                            if (Y4 != null) {
                                int size4 = Y4.size();
                                int i25 = i11;
                                while (i25 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = Y4.get(i25);
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
                            tL_pollAnswer.text.entities = Y4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i10] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.f39931c0 || this.f39933d0) && zArr[i24]) {
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
                        ArrayList<TLRPC.MessageEntity> Y5 = org.telegram.messenger.si.d0(i20).Y(charSequenceArr6, true, true);
                        if (Y5 != null && !Y5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = Y5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    c5.X(i20, uiVar.Y0() + 1, uiVar.c1(), new bi.o2(this, (org.telegram.ui.bn) uiVar.f40352a2, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }
}

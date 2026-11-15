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
public final class jn extends ci implements org.telegram.ui.ActionBar.z5, rt0, org.telegram.messenger.is {
    public static final int f36061s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final b30 E;
    public int E0;
    public ly F;
    public int F0;
    public final hi.p3 G;
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
    public final bg.v0 N0;
    public Editable O;
    public final bg.v0 O0;
    public Editable P;
    public final bg.v0[] P0;
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
    public final zj V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean f36062a0;
    public boolean f36063a1;
    public boolean f36064b0;
    public boolean f36065b1;
    public boolean f36066c0;
    public int f36067c1;
    public boolean f36068d0;
    public int f36069d1;
    public boolean f36070e0;
    public int f36071e1;
    public final boolean f36072f0;
    public boolean f36073f1;
    public boolean f36074g0;
    public boolean f36075g1;
    public boolean f36076h0;
    public org.telegram.ui.Cells.z5 f36077h1;
    public boolean f36078i0;
    public boolean f36079i1;
    public boolean f36080j0;
    public boolean f36081j1;
    public in f36082k0;
    public final Paint f36083k1;
    public int f36084l0;
    public fi.p2 l1;
    public int m0;
    public int f36085m1;
    public final boolean f36086n;
    public int f36087n0;
    public final sh.d n1;
    public int f36088o0;
    public Drawable f36089o1;
    public int f36090p0;
    public Drawable f36091p1;
    public int f36092q0;
    public int f36093q1;
    public final org.telegram.ui.l4 f36094r;
    public int f36095r0;
    public int f36096r1;
    public final org.telegram.ui.b61 f36097s;
    public int f36098s0;
    public int f36099t0;
    public int f36100u0;
    public int f36101v0;
    public final ym f36102w;
    public int f36103w0;
    public final kg.c0 f36104x;
    public int f36105x0;
    public final an f36106y;
    public int f36107y0;
    public int f36108z0;

    public jn(ki kiVar, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, Boolean bool) {
        super(context, e6Var, kiVar);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.f36066c0 = true;
        this.f36074g0 = true;
        this.f36076h0 = true;
        this.f36084l0 = -1;
        bg.v0 v0Var = new bg.v0(this);
        this.N0 = v0Var;
        bg.v0 v0Var2 = new bg.v0(this);
        this.O0 = v0Var2;
        this.P0 = new bg.v0[]{v0Var, v0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new zj(this, 2);
        this.W0 = false;
        this.X0 = -1;
        this.f36079i1 = false;
        this.f36081j1 = false;
        Paint paint = new Paint(1);
        this.f36083k1 = paint;
        this.n1 = new sh.d();
        this.f36086n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(this.f33609b.H3).f22782a).q();
        this.J = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f36068d0 = booleanValue;
            this.f36072f0 = booleanValue;
            boolean z11 = !booleanValue;
            this.U = z11;
            this.S = z11;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yl, this.f33608a));
        this.f33609b.f36470p3.setDelegate(this);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(1, this, context);
        this.f36094r = l4Var;
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(5, context, null);
        this.f36097s = b61Var;
        setBlur3Capture(b61Var);
        this.d = b61Var;
        this.h = true;
        this.f33612f = true;
        ym ymVar = new ym(this);
        this.f36102w = ymVar;
        b61Var.setItemAnimator(ymVar);
        arrayList.clear();
        ymVar.f58564m = false;
        ymVar.C = false;
        ymVar.o(er.h);
        ymVar.n(350L);
        b61Var.setClipToPadding(false);
        b61Var.setVerticalScrollBarEnabled(false);
        b61Var.setSections(true);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.f23605m, b61Var, 4);
        this.f36104x = c0Var;
        b61Var.setLayoutManager(c0Var);
        c0Var.O = true;
        new v4.y(new gi.c(this, 4)).h(b61Var);
        addView(b61Var, c8.ja.e(-1, -1, 51));
        b61Var.setPreserveFocusAfterLayout(true);
        b61Var.setAdapter(l4Var);
        b61Var.setOnItemClickListener(new om(this, e6Var, kiVar, context));
        b61Var.setOnScrollListener(new ri(this, 5));
        b30 b30Var = new b30(context, 4);
        this.E = b30Var;
        b30Var.setAlpha(0.0f);
        b30Var.setVisibility(4);
        addView(b30Var, c8.ja.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.f33609b.H3).f25451y7.J.f15881b).f24498c;
        this.R = new sh.o(this.f33609b.H3);
        org.telegram.messenger.ns.f(this.f33609b.H3).c(this, org.telegram.messenger.ns.f25594w0);
        if (q10) {
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
            ?? rw0Var = new rw0(context, this.f33609b.H3, null, e6Var);
            this.f36106y = rw0Var;
            rw0Var.E = true;
            rw0Var.F = true;
            rw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView((View) rw0Var, c8.ja.e(-2, 160, 51));
        }
        this.G = new hi.p3(this.f33609b.f36470p3, false, null);
        Y();
    }

    public static void P(jn jnVar, int i7) {
        b30 b30Var = jnVar.E;
        v4.e1 K = jnVar.f36097s.K(jnVar.f36100u0 + i7);
        if (K != null) {
            View view = K.f58535a;
            if (view instanceof org.telegram.ui.Cells.z5) {
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    an anVar = jnVar.f36106y;
                    if (anVar != null) {
                        anVar.f();
                    }
                    b30Var.setText(org.telegram.messenger.hd.M0(2131747182, null));
                    b30Var.c(z5Var.getCheckBox());
                    ImageView imageView = b30Var.f33162b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    b30Var.setTranslationY(b30Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    public static void Q(org.telegram.ui.Components.jn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.Q(org.telegram.ui.Components.jn, android.view.View, int):void");
    }

    public static void R(jn jnVar, org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        v4.e1 T;
        if (jnVar.J && z10) {
            if (jnVar.f36077h1 == z5Var && jnVar.f36065b1 && jnVar.f36079i1) {
                jnVar.b0();
                jnVar.f36065b1 = false;
            }
            org.telegram.ui.Cells.z5 z5Var2 = jnVar.f36077h1;
            jnVar.f36077h1 = z5Var;
            z5Var.setEmojiButtonVisibility(true);
            pg emojiButton = z5Var.getEmojiButton();
            ng ngVar = ng.f37572e;
            emojiButton.j(ngVar, false);
            org.telegram.ui.b61 b61Var = jnVar.f36097s;
            View F = b61Var.F(z5Var);
            if (F == null) {
                T = null;
            } else {
                T = b61Var.T(F);
            }
            an anVar = jnVar.f36106y;
            if (anVar != null) {
                anVar.f();
                if (T != null) {
                    View view = T.f58535a;
                    if ((view instanceof org.telegram.ui.Cells.z5) && anVar.getDelegate() != view) {
                        anVar.setDelegate((org.telegram.ui.Cells.z5) view);
                    }
                }
            }
            if (z5Var2 != null && z5Var2 != z5Var) {
                if (jnVar.f36065b1) {
                    jnVar.b0();
                    jnVar.e0(false);
                    jnVar.h0();
                }
                z5Var2.setEmojiButtonVisibility(false);
                z5Var2.getEmojiButton().j(ngVar, false);
            }
        }
    }

    public static void S(jn jnVar, org.telegram.ui.Cells.z5 z5Var) {
        jnVar.f36077h1 = z5Var;
        if (jnVar.f36065b1) {
            jnVar.b0();
            jnVar.h0();
            return;
        }
        jnVar.k0(1);
    }

    public static void T(jn jnVar, int i7) {
        ki kiVar;
        org.telegram.ui.ActionBar.e2 e2Var;
        int i10;
        sh.d dVar = jnVar.n1;
        if (dVar.b(i7) != null) {
            sh.c b10 = dVar.b(i7);
            if (b10 != null && (kiVar = jnVar.f33609b) != null && (e2Var = kiVar.f36424a2) != null) {
                Activity parentActivity = e2Var.getParentActivity();
                if (b10 instanceof th.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((th.d) b10).f57647b);
                    PhotoViewer.p1().I2(parentActivity, null, null);
                    PhotoViewer.p1().f2(arrayList, 0, 14, false, new rm(jnVar, i7), null);
                    return;
                } else if (b10 instanceof th.h) {
                    th.h hVar = (th.h) b10;
                    org.telegram.ui.ns.p().v(parentActivity);
                    org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                    ?? obj = new Object();
                    obj.f39721b = jnVar;
                    obj.f39720a = i7;
                    p10.u(obj);
                    org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                    TLRPC.Document document = hVar.f57659b;
                    if (org.telegram.messenger.gj.H2(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    p11.s(document, null, "", null, null, i10, false, hVar.f57660c, jnVar.f33608a, 200);
                    return;
                } else if (b10 instanceof th.c) {
                    th.c cVar = (th.c) b10;
                    String str = cVar.d;
                    jnVar.l0(i7, new org.telegram.ui.cf(1, str, org.telegram.messenger.g0.i0(cVar.f57644e, true, true) + " " + cVar.f57645f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.g) {
                    th.g gVar = (th.g) b10;
                    TLRPC.Document F0 = gVar.f57657b.F0();
                    String x12 = org.telegram.messenger.gj.x1(F0);
                    jnVar.l0(i7, new hi.s4(x12, org.telegram.messenger.gj.v1(F0) + " - " + org.telegram.messenger.hd.R((int) org.telegram.messenger.gj.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.f) {
                    jnVar.l0(i7, new mi((th.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof th.e) {
                    th.e eVar = (th.e) b10;
                    t4.d0(jnVar.getContext(), jnVar.f33608a, eVar.f57649b, eVar.f57653n, new jm(jnVar, i7, 1), new lm(jnVar, i7, 0));
                    return;
                } else {
                    jnVar.g0(i7);
                    return;
                }
            }
            return;
        }
        jnVar.g0(i7);
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
        if (this.f36086n) {
            return getMessagesController().S6;
        }
        return ((org.telegram.messenger.j0) getMessagesController().f25451y7.G.f15881b).f24498c;
    }

    private int getCurrentAccount() {
        ki kiVar = this.f33609b;
        if (kiVar != null) {
            return kiVar.H3;
        }
        return org.telegram.messenger.m10.f24940t0;
    }

    private org.telegram.messenger.np getMessagesController() {
        return org.telegram.messenger.np.s1(getCurrentAccount());
    }

    public static fi.p2 i0(org.telegram.ui.ActionBar.e2 e2Var, int i7, org.telegram.messenger.z10 z10Var, dg dgVar) {
        if (e2Var == null) {
            return null;
        }
        fi.p2 p2Var = new fi.p2(e2Var.getContext(), e2Var, e2Var.getResourceProvider(), dgVar);
        p2Var.X3 = new vm(p2Var, z10Var, e2Var);
        p2Var.Y3 = new wm(z10Var, p2Var);
        p2Var.f36435e2.i0();
        p2Var.y1(1, true);
        p2Var.V0(i7);
        p2Var.f36491u4 = new mm(z10Var);
        p2Var.S1 = new xm(p2Var, z10Var, e2Var);
        p2Var.T1 = new f1(15, z10Var, p2Var);
        p2Var.e1();
        p2Var.A0(true);
        p2Var.show();
        return p2Var;
    }

    @Override
    public final void A() {
        org.telegram.ui.l4 l4Var = this.f36094r;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.J) {
            e0(false);
            an anVar = this.f36106y;
            if (anVar != null) {
                anVar.f();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f36077h1;
            if (z5Var != null) {
                z5Var.setEmojiButtonVisibility(false);
                this.f36077h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f36077h1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.B(int, int):void");
    }

    @Override
    public final void I(ci ciVar) {
        ki kiVar = this.f33609b;
        try {
            kiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f36086n) {
            kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131744054, null));
        } else if (this.f36072f0) {
            kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131748264, null));
        } else {
            kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131748265, null));
        }
        kiVar.L1();
        this.f36104x.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f36097s.y0(1);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.J) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f36073f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.f36071e1 = i7;
                    org.telegram.messenger.np.d1().edit().putInt("kbd_height_land3", this.f36071e1).commit();
                } else {
                    this.f36069d1 = i7;
                    org.telegram.messenger.np.d1().edit().putInt("kbd_height", this.f36069d1).commit();
                }
            }
            boolean z13 = this.f36065b1;
            ki kiVar = this.f33609b;
            hi.p3 p3Var = this.G;
            if (z13) {
                if (z10) {
                    i10 = this.f36071e1;
                } else {
                    i10 = this.f36069d1;
                }
                if (this.f36079i1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.f23606n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.f23611q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f36081j1 != this.f36079i1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.F.setLayoutParams(layoutParams);
                    this.f36067c1 = layoutParams.height;
                    p3Var.a();
                    kiVar.f36470p3.requestLayout();
                    boolean z14 = this.f36081j1;
                    if (z14 != this.f36079i1) {
                        if (z14) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        V(L);
                    }
                    this.f36081j1 = this.f36079i1;
                }
            }
            if (this.Z0 != i7 || this.f36063a1 != z10) {
                this.Z0 = i7;
                this.f36063a1 = z10;
                boolean z15 = this.f36073f1;
                org.telegram.ui.Cells.z5 z5Var = this.f36077h1;
                if (z5Var != null) {
                    if (z5Var.getEditField().isFocused() && p3Var.c() && i7 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f36073f1 = z12;
                } else {
                    this.f36073f1 = false;
                }
                if (this.f36073f1 && this.f36065b1) {
                    k0(0);
                }
                if (this.f36067c1 != 0 && !(z11 = this.f36073f1) && z11 != z15 && !this.f36065b1) {
                    this.f36067c1 = 0;
                    p3Var.a();
                    kiVar.f36470p3.requestLayout();
                }
                if (this.f36073f1 && this.H) {
                    this.H = false;
                    org.telegram.messenger.g0.r(this.V0);
                }
            }
        }
    }

    public final void U() {
        an anVar = this.f36106y;
        if (anVar != null) {
            anVar.setDelegate(null);
            anVar.f();
        }
        this.f36097s.setItemAnimator(this.f36102w);
        int i7 = this.N;
        this.M[i7] = false;
        int i10 = i7 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.l4 l4Var = this.f36094r;
        if (i10 == length) {
            l4Var.s(this.f36101v0);
        }
        l4Var.i(this.f36101v0);
        n0();
        this.f36084l0 = (this.f36100u0 + this.N) - 1;
        l4Var.g(this.f36103w0);
        l4Var.g(this.B0);
    }

    public final void V(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.pf(this, f10, 2));
        ofFloat.addListener(new qm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
        ofFloat.start();
    }

    public final void W() {
        boolean z10;
        if (!this.f36068d0 && !this.f36064b0) {
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
        v4.e1 K = this.f36097s.K(i7);
        if (K == null) {
            this.f36094r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) K.f58535a;
        if (!z10) {
            x5Var.setChecked(false);
        }
        x5Var.getCheckBox().f32735a.a(!z10, true);
    }

    public final boolean X() {
        boolean z10;
        int i7;
        int i10;
        if (TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.n1.f56858a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i11]))); i11++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f33609b.f36424a2.getParentActivity());
            boolean z11 = this.f36086n;
            if (z11) {
                i7 = 2131752567;
            } else {
                i7 = 2131752573;
            }
            String M0 = org.telegram.messenger.hd.M0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (z11) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            t1Var.U = org.telegram.messenger.hd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747580, null), new s(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void Y() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11 = this.f36068d0;
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
        boolean z12 = this.f36086n;
        if (z12) {
            i10 = getMessagesController().T6;
        } else {
            i10 = 255;
        }
        if (z12) {
            i11 = getMessagesController().U6;
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
        if (i14 < 1 || (this.f36068d0 && i7 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.n1.f56858a.size() <= 0) {
            this.f36078i0 = true;
        } else {
            this.f36078i0 = false;
        }
        boolean z14 = this.f36078i0;
        ki kiVar = this.f33609b;
        kiVar.f29713r0 = z14;
        this.Y0 = z10;
        kiVar.L1();
    }

    public final void Z(org.telegram.ui.Cells.l8 l8Var, boolean z10) {
        if (this.W != 0) {
            l8Var.q(org.telegram.messenger.hd.M0(2131747130, null), org.telegram.messenger.hd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            l8Var.q(org.telegram.messenger.hd.M0(2131747132, null), org.telegram.messenger.hd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            l8Var.q(org.telegram.messenger.hd.M0(2131747130, null), null, z10, false);
        }
    }

    public final void a0(th.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f57649b;
        sh.o oVar = this.R;
        boolean containsKey = oVar.f56901c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) oVar.f56900b.get(eVar.f57649b);
        te.a aVar = eVar.f57655s;
        ImageReceiver imageReceiver = eVar.f56857a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f57654r.a(z11, z10);
        eVar.f57653n = webPage;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
    }

    public final void b0() {
        if (this.f36079i1) {
            this.F.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.f36067c1 = layoutParams.height;
            this.f36081j1 = this.f36079i1;
            this.f36079i1 = false;
            V(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    public final void c0(android.view.View r10, org.telegram.ui.Cells.z5 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.c0(android.view.View, org.telegram.ui.Cells.z5, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i7 == org.telegram.messenger.ns.f25594w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.R.f56900b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f28206id)) != null) {
                    entry.setValue(webPage);
                }
            }
            sh.d dVar = this.n1;
            int size = dVar.f56858a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sh.c cVar = (sh.c) dVar.f56858a.get(i11);
                if (cVar instanceof th.e) {
                    a0((th.e) cVar, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25515i4) {
            ly lyVar = this.F;
            if (lyVar != null) {
                lyVar.Q.g1();
            }
            org.telegram.ui.Cells.z5 z5Var = this.f36077h1;
            if (z5Var != null) {
                int currentTextColor = z5Var.getEditField().getCurrentTextColor();
                this.f36077h1.getEditField().setTextColor(-1);
                this.f36077h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            if (this.f36065b1) {
                ly lyVar = this.F;
                lyVar.Q.C0();
                lyVar.J.scrollTo(0, 0);
                lyVar.F(1);
                lyVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.f36079i1 = false;
                k0(0);
            }
            if (z10) {
                ly lyVar2 = this.F;
                if (lyVar2 != null && lyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new nm(this, 0));
                    this.f36075g1 = true;
                    ofFloat.addListener(new qm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                    ofFloat.start();
                    return;
                }
                f0();
            }
        }
    }

    public final void f0() {
        ly lyVar;
        pg emojiButton;
        if (!this.f36065b1 && (lyVar = this.F) != null && lyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.z5 z5Var = this.f36077h1;
            if (z5Var != null && (emojiButton = z5Var.getEmojiButton()) != null) {
                emojiButton.j(ng.f37572e, false);
            }
            this.F.setVisibility(8);
        }
        int i7 = this.f36067c1;
        this.f36067c1 = 0;
        if (i7 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i7) {
        int i10;
        this.f36085m1 = i7;
        org.telegram.ui.ActionBar.e2 e2Var = this.f33609b.f36424a2;
        this.n1.b(i7);
        if (i7 != -2 && i7 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.l1 = i0(e2Var, i10, new jm(this, i7, 0), new dg(this, 29));
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
        org.telegram.ui.b61 b61Var = this.f36097s;
        if (b61Var.getChildCount() <= 1 || (childAt = b61Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = b61Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        cj0 cj0Var = (cj0) T;
        int y10 = (((int) childAt.getY()) - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.L(20.0f);
        if (y10 > 0 && cj0Var != null && cj0Var.b() == 1) {
            i7 = y10;
        } else {
            i7 = 0;
        }
        if (y10 < 0 || cj0Var == null || cj0Var.b() != 1) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.f36067c1;
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
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        org.telegram.ui.b61 b61Var = this.f36097s;
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 16, new Class[]{bn.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        int i10 = org.telegram.ui.ActionBar.j6.f29070p7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f29014m6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 262144, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f28979k7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 0, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 32, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.s6(b61Var, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        return arrayList;
    }

    public final void h0() {
        int i7;
        org.telegram.ui.Cells.z5 z5Var = this.f36077h1;
        if (z5Var != null) {
            this.G.f14845e = true;
            EditTextBoldCursor editField = z5Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.J3(editField);
        }
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        k0(i7);
        if (!org.telegram.messenger.g0.D && !this.f36073f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.H = true;
            zj zjVar = this.V0;
            org.telegram.messenger.g0.r(zjVar);
            org.telegram.messenger.g0.i3(zjVar, 100L);
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
            dVar.f56858a.put(i7, cVar);
        } else {
            dVar.f56858a.remove(i7);
        }
        if (i7 == -2) {
            i10 = this.f36088o0;
        } else if (i7 == -3) {
            i10 = this.f36092q0;
        } else {
            int i11 = this.f36100u0;
            if (i11 >= 0 && i7 >= 0 && i7 < this.N) {
                i10 = i7 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            v4.e1 K = this.f36097s.K(i10);
            if (K != null) {
                View view = K.f58535a;
                if (view instanceof org.telegram.ui.Cells.z5) {
                    ((org.telegram.ui.Cells.z5) view).f32118e.b(cVar, true);
                }
            }
            this.f36094r.g(i10);
        }
        if (cVar instanceof th.e) {
            th.e eVar = (th.e) cVar;
            String str = eVar.f57649b;
            bi.e4 e4Var = new bi.e4(14, this, cVar);
            sh.o oVar = this.R;
            HashMap hashMap = oVar.f56901c;
            HashMap hashMap2 = oVar.f56900b;
            if (hashMap2.containsKey(str)) {
                e4Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(e4Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(oVar.f56899a).sendRequestTyped(getwebpagepreview, new d3.b(1), new org.telegram.ui.Wallet.t1(5, oVar, str));
                }
            }
            a0(eVar, false);
        }
        Y();
    }

    @Override
    public final boolean k() {
        if (this.f36065b1) {
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
        org.telegram.ui.Cells.z5 z5Var;
        if (this.J) {
            hi.p3 p3Var = this.G;
            pg pgVar = null;
            ki kiVar = this.f33609b;
            if (i7 == 1) {
                ly lyVar = this.F;
                if (lyVar != null && lyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ly lyVar2 = this.F;
                if (lyVar2 != null && lyVar2.f36941d1 != org.telegram.messenger.m10.f24940t0) {
                    kiVar.f36470p3.removeView(lyVar2);
                    this.F = null;
                }
                if (this.F == null) {
                    ly lyVar3 = new ly(null, true, false, false, getContext(), true, null, null, true, this.f33608a, false, false);
                    this.F = lyVar3;
                    lyVar3.f36936c = 3;
                    lyVar3.f37003x0 = false;
                    lyVar3.f37009y2 = false;
                    lyVar3.setShouldDrawBackground(false);
                    ly lyVar4 = this.F;
                    lyVar4.V0 = false;
                    lyVar4.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new pm(this));
                    kiVar.f36470p3.addView(this.F);
                    this.F.setBottomInset(org.telegram.messenger.g0.f23606n);
                }
                this.F.setVisibility(0);
                this.f36065b1 = true;
                ly lyVar5 = this.F;
                if (this.f36069d1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f36069d1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f36069d1 = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.f36071e1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f36071e1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f36071e1 = org.telegram.messenger.np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i10 = this.f36071e1;
                } else {
                    i10 = this.f36069d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lyVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f23606n + i10;
                lyVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (z5Var = this.f36077h1) != null) {
                    org.telegram.messenger.g0.v1(z5Var.getEditField());
                }
                this.f36067c1 = i10;
                p3Var.a();
                kiVar.f36470p3.requestLayout();
                org.telegram.ui.Cells.z5 z5Var2 = this.f36077h1;
                if (z5Var2 != null) {
                    pgVar = z5Var2.getEmojiButton();
                }
                if (pgVar != null) {
                    pgVar.j(ng.d, true);
                }
                if (!z10 && !this.f36073f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36067c1, 0.0f);
                    ofFloat.addUpdateListener(new nm(this, 1));
                    ofFloat.addListener(new qm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z5 z5Var3 = this.f36077h1;
            if (z5Var3 != null) {
                pgVar = z5Var3.getEmojiButton();
            }
            if (pgVar != null) {
                pgVar.j(ng.f37572e, true);
            }
            ly lyVar6 = this.F;
            if (lyVar6 != null) {
                this.f36065b1 = false;
                this.f36079i1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    lyVar6.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f36067c1 = 0;
            }
            p3Var.a();
            kiVar.f36470p3.requestLayout();
        }
    }

    public final void l0(int i7, org.telegram.messenger.a20 a20Var, int i10, int i11) {
        m60 F = m60.F(this, null, new View(getContext()));
        F.f37111s = 0;
        F.f37112t = false;
        F.c(2131232332, org.telegram.messenger.hd.M0(2131746271, null), new lm(this, i7, 1), false);
        F.c(2131232109, org.telegram.messenger.hd.M0(2131751598, null), new lm(this, i7, 2), true);
        ok0 ok0Var = new ok0(getContext(), this.f33608a);
        F.f37106p = new org.telegram.ui.de(ok0Var, 1);
        F.S = org.telegram.messenger.g0.L(185.0f);
        F.Y();
        ok0Var.e(F);
        fh.g c10 = ok0Var.f38010n.c(null, null, false);
        c10.p(c8.g0.k(ok0Var.f38006b));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.f11322e = true;
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ok0Var.G = c10;
        ok0Var.F = (Drawable) a20Var.a(ok0Var.f38012s);
        Point point = org.telegram.messenger.g0.f23611q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        ok0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) ok0Var.f38015y.getLayoutParams()).gravity = 1;
        ok0Var.M = true;
        ok0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f33608a;
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.N6, e6Var);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28979k7, e6Var);
            if (w02 != this.f36093q1 || w03 != this.f36096r1) {
                this.f36093q1 = w02;
                this.f36096r1 = w03;
                Drawable drawable = this.f36089o1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f36091p1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.b61 b61Var = this.f36097s;
                if (b61Var != null) {
                    for (int i7 = 0; i7 < b61Var.getChildCount(); i7++) {
                        View childAt = b61Var.getChildAt(i7);
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
        this.f36090p0 = -1;
        this.f36092q0 = -1;
        this.f36095r0 = -1;
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
        bg.v0 v0Var = this.N0;
        v0Var.f3347b = -1;
        bg.v0 v0Var2 = this.O0;
        v0Var2.f3347b = -1;
        this.M0 = -1;
        this.f36108z0 = -1;
        this.A0 = -1;
        this.f36101v0 = -1;
        this.f36100u0 = -1;
        this.f36107y0 = -1;
        this.f36088o0 = -1;
        this.m0 = 1;
        this.R0 = 3;
        this.f36087n0 = 2;
        boolean z11 = this.f36086n;
        if (!z11) {
            this.R0 = 4;
            this.f36088o0 = 3;
        }
        int i7 = this.R0;
        int i10 = i7 + 1;
        this.f36098s0 = i7;
        int i11 = i7 + 2;
        this.R0 = i11;
        this.f36099t0 = i10;
        int i12 = this.N;
        if (i12 != 0) {
            this.f36100u0 = i11;
            this.R0 = i11 + i12;
        }
        if (i12 != this.L.length) {
            int i13 = this.R0;
            this.R0 = i13 + 1;
            this.f36101v0 = i13;
        }
        int i14 = this.R0;
        this.f36103w0 = i14;
        int i15 = i14 + 2;
        this.R0 = i15;
        this.f36105x0 = i14 + 1;
        if (z11) {
            int i16 = i14 + 3;
            this.R0 = i16;
            this.A0 = i15;
            if (this.f36076h0) {
                this.R0 = i14 + 4;
                this.f36108z0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.an) this.f33609b.f36424a2).f45172e;
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
                this.f36064b0 = true;
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
                v0Var.f3347b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                v0Var2.f3347b = i20 + 4;
                if (v0Var2.f3346a) {
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
            this.f36107y0 = i25;
            if (this.f36068d0) {
                this.f36090p0 = i26;
                this.f36092q0 = i25 + 2;
                this.R0 = i25 + 4;
                this.f36095r0 = i25 + 3;
            }
        }
        int i27 = this.R0;
        this.R0 = i27 + 1;
        this.B0 = i27;
    }

    @Override
    public final void p() {
        this.I = true;
        ki kiVar = this.f33609b;
        org.telegram.messenger.ns.f(kiVar.H3).n(this, org.telegram.messenger.ns.f25594w0);
        if (this.J) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
            ly lyVar = this.F;
            if (lyVar != null) {
                kiVar.f36470p3.removeView(lyVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f36080j0) {
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

    public void setDelegate(in inVar) {
        this.f36082k0 = inVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33609b.f29682b.invalidate();
    }

    @Override
    public final void t() {
        this.f33609b.L1();
    }

    @Override
    public final void updateColors() {
        try {
            this.f36083k1.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yl, this.f33608a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v(float f10) {
        this.f33609b.L1();
    }

    @Override
    public final void w(int i7) {
        int i10;
        boolean z10;
        if (i7 == 40) {
            boolean z11 = this.f36086n;
            int i11 = 0;
            int i12 = 1;
            ki kiVar = this.f33609b;
            CharSequence[] charSequenceArr = this.L;
            if (z11) {
                CharSequence[] charSequenceArr2 = {d0(this.O)};
                int i13 = kiVar.H3;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.si.b0(i13).W(charSequenceArr2, true, true);
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
                boolean z12 = this.f36076h0;
                if (z12 && this.f36074g0) {
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
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.si.b0(i13).W(charSequenceArr3, true, true);
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
                        todoItem.f28198id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                t4.X(i13, kiVar.X0() + 1, kiVar.b1(), new bi.j(this, (org.telegram.ui.an) kiVar.f36424a2, tL_messageMediaToDo, 9));
                return;
            }
            boolean z13 = this.f36068d0;
            org.telegram.ui.b61 b61Var = this.f36097s;
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
                    for (int i18 = this.f36100u0; i18 < this.f36100u0 + this.N; i18++) {
                        v4.e1 K = b61Var.K(i18);
                        if (K != null) {
                            View view = K.f58535a;
                            if (view instanceof org.telegram.ui.Cells.z5) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    an anVar = this.f36106y;
                                    if (anVar != null) {
                                        anVar.f();
                                    }
                                    String M0 = org.telegram.messenger.hd.M0(2131747155, null);
                                    b30 b30Var = this.E;
                                    b30Var.setText(M0);
                                    b30Var.c(z5Var.getCheckBox());
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
                        b61Var.y0(this.f36100u0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {d0(this.O)};
                    int i20 = kiVar.H3;
                    ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.si.b0(i20).W(charSequenceArr4, true, true);
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
                    tL_poll.multiple_choice = this.f36066c0;
                    tL_poll.quiz = this.f36068d0;
                    tL_poll.public_voters = !this.f36064b0;
                    tL_poll.open_answers = this.U;
                    tL_poll.revoting_disabled = !this.S;
                    tL_poll.shuffle_answers = this.T;
                    tL_poll.subscribers_only = this.N0.f3346a;
                    if (this.O0.f3346a) {
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
                        poll2.hide_results_until_close = this.f36062a0;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.W;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.f36062a0;
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
                            ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.si.b0(i20).W(charSequenceArr5, i12, i12);
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
                            if ((this.f36066c0 || this.f36068d0) && zArr[i24]) {
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
                        ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.si.b0(i20).W(charSequenceArr6, true, true);
                        if (W5 != null && !W5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = W5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    t4.X(i20, kiVar.X0() + 1, kiVar.b1(), new bi.o1(this, (org.telegram.ui.an) kiVar.f36424a2, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;
public final class lp extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs {
    public static final int f37168g2 = 0;
    public final org.telegram.ui.xc A1;
    public final gp B1;
    public final View C1;
    public final n6 D1;
    public final n6 E1;
    public final TextView F1;
    public kp G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public g01 L1;
    public float M1;
    public ValueAnimator N1;
    public j30 O1;
    public boolean P1;
    public org.telegram.ui.ActionBar.t3 Q1;
    public org.telegram.ui.ActionBar.h2 R1;
    public si S1;
    public ai.k0 T1;
    public n6 U1;
    public boolean V1;
    public lq W1;
    public boolean X1;
    public boolean Y1;
    public TL_stories.TL_premium_boostsStatus Z1;
    public float f37169a2;
    public ValueAnimator f37170b2;
    public boolean f37171c2;
    public boolean d2;
    public int f37172e2;
    public int f37173f2;
    public final ImageView f37174m1;
    public final org.telegram.ui.ActionBar.y1 n1;
    public final TextView f37175o1;
    public final TextView f37176p1;
    public TLRPC.WallPaper f37177q1;
    public final jp f37178r1;
    public final org.telegram.ui.zm f37179s1;
    public final org.telegram.ui.ActionBar.t3 f37180t1;
    public final boolean f37181u1;
    public final org.telegram.ui.bn f37182v1;
    public final ck0 f37183w1;
    public final v4.c0 f37184x1;
    public final wz f37185y1;
    public final mh0 f37186z1;

    public lp(org.telegram.ui.bn bnVar, org.telegram.ui.zm zmVar) {
        super(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.i6) zmVar, true);
        String str;
        boolean z10;
        this.K1 = -1;
        this.X1 = false;
        this.Y1 = false;
        this.f37169a2 = 0.0f;
        this.f37182v1 = bnVar;
        this.f37179s1 = zmVar;
        this.f37180t1 = zmVar.f54538f;
        this.f37177q1 = zmVar.f54539g;
        this.f37181u1 = org.telegram.ui.ActionBar.n6.I.q();
        jp jpVar = new jp(this.f30187a, bnVar.a(), zmVar, 0);
        this.f37178r1 = jpVar;
        this.f30218p0 = false;
        this.f30194c0 = false;
        this.f30228w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i7 = org.telegram.ui.ActionBar.n6.f29485i5;
            this.H0 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
            org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.n6.w0(i7, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        } else {
            Q(org.telegram.ui.ActionBar.n6.f29485i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.gd.M0(2131745456, null));
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29502j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f37174m1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.n1 = y1Var;
        imageView.setImageDrawable(y1Var);
        imageView.setOnClickListener(new vo(this, 1));
        frameLayout.addView(imageView, c8.ma.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        mh0 mh0Var = new mh0(2131624241, L2, L2, false, null);
        this.f37186z1 = mh0Var;
        this.H1 = !org.telegram.ui.ActionBar.n6.I.q();
        V0(org.telegram.ui.ActionBar.n6.I.q(), false);
        mh0Var.J(true);
        mh0Var.h = true;
        this.f37172e2 = w02;
        mh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.A1 = xcVar;
        xcVar.setAnimation(mh0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new vo(this, 2));
        frameLayout.addView(xcVar, c8.ma.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.B1 = new v4.d0(getContext());
        ck0 ck0Var = new ck0(getContext(), null);
        this.f37183w1 = ck0Var;
        ck0Var.setAdapter(jpVar);
        ck0Var.setDrawSelection(false);
        ck0Var.setClipChildren(false);
        ck0Var.setClipToPadding(false);
        ck0Var.setHasFixedSize(true);
        ck0Var.setItemAnimator(null);
        ck0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.c0 c0Var = new v4.c0(0, false);
        this.f37184x1 = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        ck0Var.setOnItemClickListener(new n(this, 3));
        ck0Var.setOnScrollListener(new oa(this, 8));
        wz wzVar = new wz(getContext(), this.J0);
        this.f37185y1 = wzVar;
        wzVar.setViewType(14);
        wzVar.setVisibility(0);
        frameLayout.addView(wzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(ck0Var, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.C1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.n6.w0(i10, this.J0);
        int i11 = org.telegram.ui.ActionBar.n6.Hi;
        int w04 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        Drawable k02 = org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(view, k02, M, M2, i6Var);
        view.setOnClickListener(new vo(this, 3));
        frameLayout.addView(view, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.F1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f37177q1 == null) {
            textView2.setText(org.telegram.messenger.gd.M0(2131752127, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.M0(2131752129, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        n6 n6Var = new n6(getContext(), true, true, true);
        this.D1 = n6Var;
        n6Var.getDrawable().q(true);
        n6Var.f37740n = false;
        n6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i12, this.J0);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(n6Var, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        n6 n6Var2 = new n6(getContext(), true, true, true);
        this.E1 = n6Var2;
        n6Var2.getDrawable().q(true);
        n6Var2.f37740n = false;
        n6Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i12, this.J0);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        n6Var2.setAlpha(0.0f);
        n6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(n6Var2, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f37177q1 != null) {
            TextView textView3 = new TextView(getContext());
            this.f37175o1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.gd.M0(2131745890, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new y7(6, this, bnVar));
            frameLayout.addView(textView3, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f37176p1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (bnVar.j() != null) {
                str = org.telegram.messenger.o10.k(bnVar.j(), true);
            } else {
                TLRPC.Chat chat = bnVar.f45978e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.gd.a0("ChatThemeApplyHint", null, 2131752195, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Z0();
        a1(false);
    }

    public static void J0(lp lpVar, org.telegram.ui.x71 x71Var) {
        ?? obj = new Object();
        obj.f28921a = true;
        org.telegram.ui.bn bnVar = lpVar.f37182v1;
        x71Var.f53670a.f52942a = bnVar.getResourceProvider();
        x71Var.f53720r1 = new fp(lpVar);
        obj.f28923c = new me(5);
        obj.d = new uo(lpVar, 5);
        obj.f28922b = new uo(lpVar, 6);
        obj.f28924e = true;
        lpVar.R1 = x71Var;
        bnVar.showAsSheet(x71Var, obj);
    }

    public static org.telegram.ui.ActionBar.m6 K0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.n6.Q0(string) != null && !org.telegram.ui.ActionBar.n6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.n6.Q0(string2) != null && org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
            str2 = string2;
        }
        if (z10) {
            return org.telegram.ui.ActionBar.n6.Q0(str2);
        }
        return org.telegram.ui.ActionBar.n6.Q0(str);
    }

    public static void X0(g01 g01Var) {
        if (g01Var == null) {
            return;
        }
        float width = g01Var.getWidth() / 2.0f;
        float max = Math.max(width, g01Var.getWidth() - width);
        float max2 = Math.max(0.0f, g01Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g01Var, g01.f35274x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(xs.f42178e);
        ofFloat.addListener(new x(g01Var, 18));
        ofFloat.start();
    }

    @Override
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29485i5));
    }

    public final void L0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp.L0(boolean):void");
    }

    public final org.telegram.ui.Components.g01 M0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp.M0():org.telegram.ui.Components.g01");
    }

    public final void N0() {
        if (Q0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = org.telegram.messenger.gd.M0(2131752185, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131752186, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752188, null), new org.telegram.ui.ActionBar.r1(this) {
                public final lp f42153b;

                {
                    this.f42153b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f42153b.L0(false);
                            return;
                        default:
                            this.f42153b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752187, null), new org.telegram.ui.ActionBar.r1(this) {
                public final lp f42153b;

                {
                    this.f42153b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f42153b.L0(false);
                            return;
                        default:
                            this.f42153b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
            return;
        }
        dismiss();
    }

    public final void O0() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0);
            mh0 mh0Var = this.f37186z1;
            if (mh0Var != null && w02 != this.f37172e2) {
                this.f37172e2 = w02;
                mh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.n1;
            if (y1Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
                y1Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
                y1Var.b(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
                ImageView imageView = this.f37174m1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.J0);
            if (w03 != this.f37173f2) {
                this.f37173f2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void P0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.I1) {
            org.telegram.ui.ActionBar.n6.f29350b = false;
            if (Q0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f37179s1.f54539g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.t3 t3Var = this.G1.f36837a;
            if (t3Var.f29997a) {
                this.f37179s1.r(null, wallPaper2, false, Boolean.valueOf(this.H1), true);
            } else {
                this.f37179s1.r(t3Var, wallPaper2, false, Boolean.valueOf(this.H1), true);
            }
            si siVar = this.S1;
            if (siVar != null) {
                fj fjVar = siVar.f39694m2;
                if (fjVar != null) {
                    boolean z10 = this.H1;
                    qa qaVar = fjVar.f35117w;
                    ((ArrayList) qaVar.f38754e).clear();
                    WallpapersListActivity.E0((ArrayList) qaVar.f38754e, z10);
                    qaVar.f();
                }
                this.S1.Q0();
            }
            jp jpVar = this.f37178r1;
            if (jpVar != null && jpVar.d != null) {
                for (int i7 = 0; i7 < jpVar.d.size(); i7++) {
                    ((kp) jpVar.d.get(i7)).f36839c = this.H1 ? 1 : 0;
                }
                jpVar.f();
            }
        }
    }

    public final boolean Q0() {
        ig.b bVar;
        if (this.G1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.t3 t3Var = this.Q1;
        ig.b bVar2 = null;
        if (t3Var != null) {
            bVar = t3Var.f29999c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.t3 t3Var2 = this.G1.f36837a;
        if (t3Var2 != null) {
            bVar2 = t3Var2.f29999c;
        }
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void R0() {
        ArrayList arrayList;
        if (!this.V1) {
            org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.f30187a);
            if (f10.f23834f.f19532c && (arrayList = f10.f23831b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z10 = true;
            this.V1 = true;
            if (f10.f23834f.f19532c) {
                f10.q(new hp(this, f10), false);
                return;
            }
            ip ipVar = new ip(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.q1 q1Var = f10.f23834f;
            if (currentTimeMillis - q1Var.f19531b <= 7200000) {
                z10 = false;
            }
            if (((ArrayList) q1Var.d) != null && q1Var.f19532c && !z10) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            l2.q1 q1Var2 = f10.f23834f;
            tl_getUniqueGiftChatThemes.offset = (String) q1Var2.f19533e;
            tl_getUniqueGiftChatThemes.hash = q1Var2.f19530a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f10.getConnectionsManager();
            org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.f23828s;
            Objects.requireNonNull(q5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.z3(0, f10, ipVar));
        }
    }

    public final void S0(ArrayList arrayList) {
        ig.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        kp kpVar = new kp((org.telegram.ui.ActionBar.t3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.P1) {
            org.telegram.ui.ActionBar.t3 t3Var = this.f37179s1.f54538f;
            this.Q1 = t3Var;
            if (t3Var != null) {
                t3Var.k();
            }
        }
        arrayList2.add(0, kpVar);
        if (!this.P1) {
            this.G1 = kpVar;
        }
        org.telegram.ui.ActionBar.t3 t3Var2 = this.Q1;
        if (t3Var2 != null) {
            bVar = t3Var2.f29999c;
        } else {
            bVar = null;
        }
        boolean z10 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.t3 t3Var3 = (org.telegram.ui.ActionBar.t3) arrayList.get(i7);
            kp kpVar2 = new kp(t3Var3);
            t3Var3.m(this.f30187a);
            kpVar2.f36839c = this.H1 ? 1 : 0;
            if (ig.b.a(t3Var3.f29999c, bVar)) {
                arrayList2.add(1, kpVar2);
                z10 = true;
            } else {
                arrayList2.add(kpVar2);
            }
            i7++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.t3 t3Var4 = this.Q1;
        if (t3Var4 != null && !z10) {
            kp kpVar3 = new kp(t3Var4);
            t3Var4.m(this.f30187a);
            kpVar3.f36839c = this.H1 ? 1 : 0;
            arrayList2.add(1, kpVar3);
        }
        jp jpVar = this.f37178r1;
        jpVar.d = arrayList2;
        jpVar.f();
        this.A1.setVisibility(0);
        if (!this.P1) {
            U0(false);
            this.f37183w1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.P1 = true;
        a1(true);
    }

    public final void T0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.I1) {
            this.J1 = false;
            this.f37182v1.getClass();
            if (Q0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f37177q1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.t3 t3Var = this.G1.f36837a;
            if (t3Var.f29997a) {
                this.f37179s1.r(null, wallPaper2, true, Boolean.valueOf(this.H1), false);
                return;
            }
            this.f37179s1.r(t3Var, wallPaper2, true, Boolean.valueOf(this.H1), false);
        }
    }

    public final void U0(boolean z10) {
        jp jpVar = this.f37178r1;
        ArrayList arrayList = jpVar.d;
        org.telegram.ui.ActionBar.t3 t3Var = this.Q1;
        v4.c0 c0Var = this.f37184x1;
        ck0 ck0Var = this.f37183w1;
        if (t3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 != arrayList.size()) {
                    if (ig.b.a(((kp) arrayList.get(i7)).f36837a.f29999c, this.Q1.f29999c)) {
                        this.G1 = (kp) arrayList.get(i7);
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                this.K1 = i7;
                jpVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, jpVar.d.size() - 1);
                if (z10) {
                    ck0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.G1 = (kp) arrayList.get(0);
            jpVar.E(0);
            if (z10) {
                ck0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        T0();
    }

    @Override
    public final ArrayList V() {
        yo yoVar = new yo(this);
        ArrayList arrayList = new ArrayList();
        if (this.f37182v1.f46217w7) {
            org.telegram.ui.ActionBar.h2 h2Var = this.R1;
            if (h2Var instanceof org.telegram.ui.x71) {
                arrayList.addAll(((org.telegram.ui.x71) h2Var).X0());
                return arrayList;
            }
        }
        si siVar = this.S1;
        if (siVar != null) {
            arrayList.addAll(siVar.V());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f30223s0}, yoVar, org.telegram.ui.ActionBar.n6.f29467h5));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        View view = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.w6) obj).f30163n = this.f37179s1;
        }
        return arrayList;
    }

    public final void V0(boolean z10, boolean z11) {
        int i7;
        if (this.H1 != z10) {
            this.H1 = z10;
            org.telegram.ui.xc xcVar = this.A1;
            mh0 mh0Var = this.f37186z1;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    i10 = mh0Var.f37486e[0];
                }
                mh0Var.P(i10);
                if (xcVar != null) {
                    xcVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i7 = mh0Var.f37486e[0] - 1;
            } else {
                i7 = 0;
            }
            mh0Var.N(i7, false, true);
            mh0Var.P(i7);
            if (xcVar != null) {
                xcVar.invalidate();
            }
        }
    }

    public final void W0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp.W0(boolean):void");
    }

    public final void Y0(org.telegram.ui.ActionBar.m6 m6Var) {
        if (m6Var != null && m6Var != org.telegram.ui.ActionBar.n6.I) {
            this.f37171c2 = true;
            try {
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25215w4, m6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f37171c2 = false;
            }
        }
    }

    public final void Z0() {
        TextView textView = this.f37176p1;
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29613p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i7, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i7, 76);
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.u6.j(textView, k02, null, g10, i6Var);
        }
        TextView textView2 = this.f37175o1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.n6.f29615p7;
            org.telegram.ui.ActionBar.u6.U(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i10, 76);
            org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.u6.j(textView2, k03, null, g11, i6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.q6 g12 = org.telegram.ui.ActionBar.u6.g(i11, 30);
        org.telegram.ui.ActionBar.i6 i6Var3 = this.J0;
        ImageView imageView = this.f37174m1;
        org.telegram.ui.ActionBar.u6.Q(imageView, h02, null, g12, i6Var3);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.y1 y1Var = this.n1;
        y1Var.a(w02);
        y1Var.b(org.telegram.ui.ActionBar.n6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.Q(this.A1, org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.u6.g(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.n6.f29558m5;
        org.telegram.ui.ActionBar.i6 i6Var4 = this.J0;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.u6.U(textView3, i13, i6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.u6.g(i12, 76), this.J0);
    }

    public final void a1(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp.a1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25148l4) {
            org.telegram.messenger.ks.f(this.f30187a).d(new uo(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        g01 g01Var;
        org.telegram.ui.ActionBar.m6 K0;
        boolean z10;
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25148l4);
        super.dismiss();
        this.f37182v1.getClass();
        boolean z11 = this.I1;
        boolean z12 = this.f37181u1;
        if (!z11 && this.H1 != z12) {
            g01Var = M0();
        } else {
            g01Var = null;
        }
        if (!this.I1) {
            org.telegram.ui.zm zmVar = this.f37179s1;
            TLRPC.WallPaper wallPaper = zmVar.f54539g;
            if (wallPaper == null) {
                wallPaper = this.f37177q1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (g01Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            zmVar.r(this.f37180t1, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.H1 != z12) {
            if (org.telegram.ui.ActionBar.n6.I.q() == z12) {
                K0 = org.telegram.ui.ActionBar.n6.I;
            } else {
                K0 = K0(z12);
            }
            if (this.d2) {
                Y0(K0);
            } else {
                org.telegram.ui.ActionBar.n6.u(K0, false, z12);
            }
        }
        this.d2 = false;
        X0(g01Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !Q0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f30190b.getTop() && x10 >= this.f30190b.getLeft() && x10 <= this.f30190b.getRight()) {
            return false;
        }
        this.f37182v1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void g0(float f10) {
        j30 j30Var = this.O1;
        if (j30Var != null) {
            j30Var.a();
        }
    }

    @Override
    public final void onBackPressed() {
        N0();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.f30187a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25148l4);
        this.I1 = false;
        if (f10.f23834f.f19532c && (arrayList = f10.f23831b) != null && !arrayList.isEmpty()) {
            S0(f10.e(7));
        } else {
            R0();
        }
        if (this.f37182v1.j() != null && org.telegram.messenger.bz.f23158e1 > 0 && !this.f37182v1.j().self) {
            org.telegram.messenger.bz.f23158e1--;
            org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.bz.f23158e1).apply();
            j30 j30Var = new j30(9, getContext(), this.f37182v1.getResourceProvider(), false);
            this.O1 = j30Var;
            j30Var.setVisibility(4);
            this.O1.setShowingDuration(5000L);
            this.O1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
            if (this.H1) {
                this.O1.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ChatThemeDaySwitchTooltip", null, 2131752192, new Object[0])));
            } else {
                this.O1.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ChatThemeNightSwitchTooltip", null, 2131752189, new Object[0])));
            }
            org.telegram.messenger.g0.h3(new uo(this, 7), 1500L);
            this.f30193c.addView(this.O1, c8.ma.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        O0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29485i5, this.J0))) {
                this.H0 = w02;
                boolean z10 = false;
                org.telegram.messenger.g0.s3(this, w02, false, null);
                if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                    z10 = true;
                }
                org.telegram.messenger.g0.m3(this, z10);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

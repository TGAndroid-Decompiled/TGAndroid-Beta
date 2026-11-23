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
public final class kp extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public static final int f36824g2 = 0;
    public final org.telegram.ui.xc A1;
    public final fp B1;
    public final View C1;
    public final n6 D1;
    public final n6 E1;
    public final TextView F1;
    public jp G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public h01 L1;
    public float M1;
    public ValueAnimator N1;
    public j30 O1;
    public boolean P1;
    public org.telegram.ui.ActionBar.s3 Q1;
    public org.telegram.ui.ActionBar.g2 R1;
    public ti S1;
    public ai.h0 T1;
    public n6 U1;
    public boolean V1;
    public kq W1;
    public boolean X1;
    public boolean Y1;
    public TL_stories.TL_premium_boostsStatus Z1;
    public float f36825a2;
    public ValueAnimator f36826b2;
    public boolean f36827c2;
    public boolean d2;
    public int f36828e2;
    public int f36829f2;
    public final ImageView f36830m1;
    public final org.telegram.ui.ActionBar.x1 n1;
    public final TextView f36831o1;
    public final TextView f36832p1;
    public TLRPC.WallPaper f36833q1;
    public final ip f36834r1;
    public final org.telegram.ui.zm f36835s1;
    public final org.telegram.ui.ActionBar.s3 f36836t1;
    public final boolean f36837u1;
    public final org.telegram.ui.bn f36838v1;
    public final ek0 f36839w1;
    public final v4.c0 f36840x1;
    public final vz f36841y1;
    public final nh0 f36842z1;

    public kp(org.telegram.ui.bn bnVar, org.telegram.ui.zm zmVar) {
        super(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.i6) zmVar, true);
        String str;
        boolean z10;
        this.K1 = -1;
        this.X1 = false;
        this.Y1 = false;
        this.f36825a2 = 0.0f;
        this.f36838v1 = bnVar;
        this.f36835s1 = zmVar;
        this.f36836t1 = zmVar.f54653f;
        this.f36833q1 = zmVar.f54654g;
        this.f36837u1 = org.telegram.ui.ActionBar.n6.I.q();
        ip ipVar = new ip(this.f30223a, bnVar.a(), zmVar, 0);
        this.f36834r1 = ipVar;
        this.f30254p0 = false;
        this.f30230c0 = false;
        this.f30264w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i7 = org.telegram.ui.ActionBar.n6.f29542i5;
            this.H0 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
            org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.n6.w0(i7, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        } else {
            Q(org.telegram.ui.ActionBar.n6.f29542i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.gd.N0(2131745455, null));
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29559j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f36830m1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.n1 = x1Var;
        imageView.setImageDrawable(x1Var);
        imageView.setOnClickListener(new uo(this, 1));
        frameLayout.addView(imageView, c8.na.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        nh0 nh0Var = new nh0(2131624241, L2, L2, false, null);
        this.f36842z1 = nh0Var;
        this.H1 = !org.telegram.ui.ActionBar.n6.I.q();
        V0(org.telegram.ui.ActionBar.n6.I.q(), false);
        nh0Var.J(true);
        nh0Var.h = true;
        this.f36828e2 = w02;
        nh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.A1 = xcVar;
        xcVar.setAnimation(nh0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new uo(this, 2));
        frameLayout.addView(xcVar, c8.na.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.B1 = new v4.d0(getContext());
        ek0 ek0Var = new ek0(getContext(), null);
        this.f36839w1 = ek0Var;
        ek0Var.setAdapter(ipVar);
        ek0Var.setDrawSelection(false);
        ek0Var.setClipChildren(false);
        ek0Var.setClipToPadding(false);
        ek0Var.setHasFixedSize(true);
        ek0Var.setItemAnimator(null);
        ek0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.c0 c0Var = new v4.c0(0, false);
        this.f36840x1 = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        ek0Var.setOnItemClickListener(new n(this, 3));
        ek0Var.setOnScrollListener(new na(this, 8));
        vz vzVar = new vz(getContext(), this.J0);
        this.f36841y1 = vzVar;
        vzVar.setViewType(14);
        vzVar.setVisibility(0);
        frameLayout.addView(vzVar, c8.na.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(ek0Var, c8.na.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
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
        view.setOnClickListener(new uo(this, 3));
        frameLayout.addView(view, c8.na.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.F1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f36833q1 == null) {
            textView2.setText(org.telegram.messenger.gd.N0(2131752126, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.N0(2131752128, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.na.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        n6 n6Var = new n6(getContext(), true, true, true);
        this.D1 = n6Var;
        n6Var.getDrawable().q(true);
        n6Var.f37685n = false;
        n6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i12, this.J0);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(n6Var, c8.na.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        n6 n6Var2 = new n6(getContext(), true, true, true);
        this.E1 = n6Var2;
        n6Var2.getDrawable().q(true);
        n6Var2.f37685n = false;
        n6Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i12, this.J0);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        n6Var2.setAlpha(0.0f);
        n6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(n6Var2, c8.na.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f36833q1 != null) {
            TextView textView3 = new TextView(getContext());
            this.f36831o1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.gd.N0(2131745889, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new l8(5, this, bnVar));
            frameLayout.addView(textView3, c8.na.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f36832p1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (bnVar.j() != null) {
                str = org.telegram.messenger.n10.k(bnVar.j(), true);
            } else {
                TLRPC.Chat chat = bnVar.f46173e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.gd.a0("ChatThemeApplyHint", null, 2131752194, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.na.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Z0();
        a1(false);
    }

    public static void J0(kp kpVar, org.telegram.ui.v71 v71Var) {
        ?? obj = new Object();
        obj.f28948a = true;
        org.telegram.ui.bn bnVar = kpVar.f36838v1;
        v71Var.f52845a.f52554a = bnVar.getResourceProvider();
        v71Var.f52895r1 = new ep(kpVar);
        obj.f28950c = new ne(5);
        obj.d = new to(kpVar, 5);
        obj.f28949b = new to(kpVar, 6);
        obj.f28951e = true;
        kpVar.R1 = v71Var;
        bnVar.showAsSheet(v71Var, obj);
    }

    public static org.telegram.ui.ActionBar.m6 K0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0);
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

    public static void X0(h01 h01Var) {
        if (h01Var == null) {
            return;
        }
        float width = h01Var.getWidth() / 2.0f;
        float max = Math.max(width, h01Var.getWidth() - width);
        float max2 = Math.max(0.0f, h01Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h01Var, h01.f35597x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ws.f41716e);
        ofFloat.addListener(new x(h01Var, 18));
        ofFloat.start();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29542i5));
    }

    public final void L0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp.L0(boolean):void");
    }

    public final org.telegram.ui.Components.h01 M0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp.M0():org.telegram.ui.Components.h01");
    }

    public final void N0() {
        if (Q0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String N0 = org.telegram.messenger.gd.N0(2131752184, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131752185, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752187, null), new org.telegram.ui.ActionBar.q1(this) {
                public final kp f41689b;

                {
                    this.f41689b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f41689b.L0(false);
                            return;
                        default:
                            this.f41689b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752186, null), new org.telegram.ui.ActionBar.q1(this) {
                public final kp f41689b;

                {
                    this.f41689b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f41689b.L0(false);
                            return;
                        default:
                            this.f41689b.dismiss();
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
            nh0 nh0Var = this.f36842z1;
            if (nh0Var != null && w02 != this.f36828e2) {
                this.f36828e2 = w02;
                nh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.n1;
            if (x1Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
                x1Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
                x1Var.b(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
                ImageView imageView = this.f36830m1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0);
            if (w03 != this.f36829f2) {
                this.f36829f2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void P0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.I1) {
            org.telegram.ui.ActionBar.n6.f29407b = false;
            if (Q0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f36835s1.f54654g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = this.G1.f36472a;
            if (s3Var.f30045a) {
                this.f36835s1.r(null, wallPaper2, false, Boolean.valueOf(this.H1), true);
            } else {
                this.f36835s1.r(s3Var, wallPaper2, false, Boolean.valueOf(this.H1), true);
            }
            ti tiVar = this.S1;
            if (tiVar != null) {
                gj gjVar = tiVar.f39991m2;
                if (gjVar != null) {
                    boolean z10 = this.H1;
                    pa paVar = gjVar.f35454w;
                    ((ArrayList) paVar.f38441e).clear();
                    WallpapersListActivity.E0((ArrayList) paVar.f38441e, z10);
                    paVar.f();
                }
                this.S1.Q0();
            }
            ip ipVar = this.f36834r1;
            if (ipVar != null && ipVar.d != null) {
                for (int i7 = 0; i7 < ipVar.d.size(); i7++) {
                    ((jp) ipVar.d.get(i7)).f36474c = this.H1 ? 1 : 0;
                }
                ipVar.f();
            }
        }
    }

    public final boolean Q0() {
        ig.b bVar;
        if (this.G1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.s3 s3Var = this.Q1;
        ig.b bVar2 = null;
        if (s3Var != null) {
            bVar = s3Var.f30047c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.s3 s3Var2 = this.G1.f36472a;
        if (s3Var2 != null) {
            bVar2 = s3Var2.f30047c;
        }
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void R0() {
        ArrayList arrayList;
        if (!this.V1) {
            org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.f30223a);
            if (f10.f23945f.f19633c && (arrayList = f10.f23942b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z10 = true;
            this.V1 = true;
            if (f10.f23945f.f19633c) {
                f10.q(new gp(this, f10), false);
                return;
            }
            hp hpVar = new hp(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.r1 r1Var = f10.f23945f;
            if (currentTimeMillis - r1Var.f19632b <= 7200000) {
                z10 = false;
            }
            if (((ArrayList) r1Var.d) != null && r1Var.f19633c && !z10) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            l2.r1 r1Var2 = f10.f23945f;
            tl_getUniqueGiftChatThemes.offset = (String) r1Var2.f19634e;
            tl_getUniqueGiftChatThemes.hash = r1Var2.f19631a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f10.getConnectionsManager();
            org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.f23939s;
            Objects.requireNonNull(q5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.z3(0, f10, hpVar));
        }
    }

    public final void S0(ArrayList arrayList) {
        ig.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        jp jpVar = new jp((org.telegram.ui.ActionBar.s3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.P1) {
            org.telegram.ui.ActionBar.s3 s3Var = this.f36835s1.f54653f;
            this.Q1 = s3Var;
            if (s3Var != null) {
                s3Var.k();
            }
        }
        arrayList2.add(0, jpVar);
        if (!this.P1) {
            this.G1 = jpVar;
        }
        org.telegram.ui.ActionBar.s3 s3Var2 = this.Q1;
        if (s3Var2 != null) {
            bVar = s3Var2.f30047c;
        } else {
            bVar = null;
        }
        boolean z10 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.s3 s3Var3 = (org.telegram.ui.ActionBar.s3) arrayList.get(i7);
            jp jpVar2 = new jp(s3Var3);
            s3Var3.m(this.f30223a);
            jpVar2.f36474c = this.H1 ? 1 : 0;
            if (ig.b.a(s3Var3.f30047c, bVar)) {
                arrayList2.add(1, jpVar2);
                z10 = true;
            } else {
                arrayList2.add(jpVar2);
            }
            i7++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.s3 s3Var4 = this.Q1;
        if (s3Var4 != null && !z10) {
            jp jpVar3 = new jp(s3Var4);
            s3Var4.m(this.f30223a);
            jpVar3.f36474c = this.H1 ? 1 : 0;
            arrayList2.add(1, jpVar3);
        }
        ip ipVar = this.f36834r1;
        ipVar.d = arrayList2;
        ipVar.f();
        this.A1.setVisibility(0);
        if (!this.P1) {
            U0(false);
            this.f36839w1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.P1 = true;
        a1(true);
    }

    public final void T0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.I1) {
            this.J1 = false;
            this.f36838v1.getClass();
            if (Q0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f36833q1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = this.G1.f36472a;
            if (s3Var.f30045a) {
                this.f36835s1.r(null, wallPaper2, true, Boolean.valueOf(this.H1), false);
                return;
            }
            this.f36835s1.r(s3Var, wallPaper2, true, Boolean.valueOf(this.H1), false);
        }
    }

    public final void U0(boolean z10) {
        ip ipVar = this.f36834r1;
        ArrayList arrayList = ipVar.d;
        org.telegram.ui.ActionBar.s3 s3Var = this.Q1;
        v4.c0 c0Var = this.f36840x1;
        ek0 ek0Var = this.f36839w1;
        if (s3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 != arrayList.size()) {
                    if (ig.b.a(((jp) arrayList.get(i7)).f36472a.f30047c, this.Q1.f30047c)) {
                        this.G1 = (jp) arrayList.get(i7);
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
                ipVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, ipVar.d.size() - 1);
                if (z10) {
                    ek0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.G1 = (jp) arrayList.get(0);
            ipVar.E(0);
            if (z10) {
                ek0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        T0();
    }

    @Override
    public final ArrayList V() {
        xo xoVar = new xo(this);
        ArrayList arrayList = new ArrayList();
        if (this.f36838v1.f46412w7) {
            org.telegram.ui.ActionBar.g2 g2Var = this.R1;
            if (g2Var instanceof org.telegram.ui.v71) {
                arrayList.addAll(((org.telegram.ui.v71) g2Var).X0());
                return arrayList;
            }
        }
        ti tiVar = this.S1;
        if (tiVar != null) {
            arrayList.addAll(tiVar.V());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f30259s0}, xoVar, org.telegram.ui.ActionBar.n6.f29524h5));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        View view = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.w6) obj).f30289n = this.f36835s1;
        }
        return arrayList;
    }

    public final void V0(boolean z10, boolean z11) {
        int i7;
        if (this.H1 != z10) {
            this.H1 = z10;
            org.telegram.ui.xc xcVar = this.A1;
            nh0 nh0Var = this.f36842z1;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    i10 = nh0Var.f37805e[0];
                }
                nh0Var.P(i10);
                if (xcVar != null) {
                    xcVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i7 = nh0Var.f37805e[0] - 1;
            } else {
                i7 = 0;
            }
            nh0Var.N(i7, false, true);
            nh0Var.P(i7);
            if (xcVar != null) {
                xcVar.invalidate();
            }
        }
    }

    public final void W0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp.W0(boolean):void");
    }

    public final void Y0(org.telegram.ui.ActionBar.m6 m6Var) {
        if (m6Var != null && m6Var != org.telegram.ui.ActionBar.n6.I) {
            this.f36827c2 = true;
            try {
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25314w4, m6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f36827c2 = false;
            }
        }
    }

    public final void Z0() {
        TextView textView = this.f36832p1;
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29670p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i7, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i7, 76);
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.u6.j(textView, k02, null, g10, i6Var);
        }
        TextView textView2 = this.f36831o1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.n6.f29672p7;
            org.telegram.ui.ActionBar.u6.U(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i10, 76);
            org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.u6.j(textView2, k03, null, g11, i6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.q6 g12 = org.telegram.ui.ActionBar.u6.g(i11, 30);
        org.telegram.ui.ActionBar.i6 i6Var3 = this.J0;
        ImageView imageView = this.f36830m1;
        org.telegram.ui.ActionBar.u6.Q(imageView, h02, null, g12, i6Var3);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.x1 x1Var = this.n1;
        x1Var.a(w02);
        x1Var.b(org.telegram.ui.ActionBar.n6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.Q(this.A1, org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.u6.g(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.n6.f29615m5;
        org.telegram.ui.ActionBar.i6 i6Var4 = this.J0;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.u6.U(textView3, i13, i6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.u6.g(i12, 76), this.J0);
    }

    public final void a1(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp.a1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            org.telegram.messenger.ks.f(this.f30223a).d(new to(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        h01 h01Var;
        org.telegram.ui.ActionBar.m6 K0;
        boolean z10;
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        super.dismiss();
        this.f36838v1.getClass();
        boolean z11 = this.I1;
        boolean z12 = this.f36837u1;
        if (!z11 && this.H1 != z12) {
            h01Var = M0();
        } else {
            h01Var = null;
        }
        if (!this.I1) {
            org.telegram.ui.zm zmVar = this.f36835s1;
            TLRPC.WallPaper wallPaper = zmVar.f54654g;
            if (wallPaper == null) {
                wallPaper = this.f36833q1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (h01Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            zmVar.r(this.f36836t1, wallPaper2, z10, Boolean.valueOf(z12), false);
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
        X0(h01Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !Q0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f30226b.getTop() && x10 >= this.f30226b.getLeft() && x10 <= this.f30226b.getRight()) {
            return false;
        }
        this.f36838v1.getFragmentView().dispatchTouchEvent(motionEvent);
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
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.f30223a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        this.I1 = false;
        if (f10.f23945f.f19633c && (arrayList = f10.f23942b) != null && !arrayList.isEmpty()) {
            S0(f10.e(7));
        } else {
            R0();
        }
        if (this.f36838v1.j() != null && org.telegram.messenger.bz.f23283e1 > 0 && !this.f36838v1.j().self) {
            org.telegram.messenger.bz.f23283e1--;
            org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.bz.f23283e1).apply();
            j30 j30Var = new j30(9, getContext(), this.f36838v1.getResourceProvider(), false);
            this.O1 = j30Var;
            j30Var.setVisibility(4);
            this.O1.setShowingDuration(5000L);
            this.O1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
            if (this.H1) {
                this.O1.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ChatThemeDaySwitchTooltip", null, 2131752191, new Object[0])));
            } else {
                this.O1.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ChatThemeNightSwitchTooltip", null, 2131752188, new Object[0])));
            }
            org.telegram.messenger.g0.h3(new to(this, 7), 1500L);
            this.f30229c.addView(this.O1, c8.na.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        O0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29542i5, this.J0))) {
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

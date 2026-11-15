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
import org.telegram.ui.t71;
public final class ep extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final int f34387g2 = 0;
    public final org.telegram.ui.xc A1;
    public final zo B1;
    public final View C1;
    public final h6 D1;
    public final h6 E1;
    public final TextView F1;
    public dp G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public zz0 L1;
    public float M1;
    public ValueAnimator N1;
    public b30 O1;
    public boolean P1;
    public org.telegram.ui.ActionBar.p3 Q1;
    public org.telegram.ui.ActionBar.e2 R1;
    public ki S1;
    public ai.j0 T1;
    public h6 U1;
    public boolean V1;
    public eq W1;
    public boolean X1;
    public boolean Y1;
    public TL_stories.TL_premium_boostsStatus Z1;
    public float f34388a2;
    public ValueAnimator f34389b2;
    public boolean f34390c2;
    public boolean d2;
    public int f34391e2;
    public int f34392f2;
    public final ImageView f34393m1;
    public final org.telegram.ui.ActionBar.x1 n1;
    public final TextView f34394o1;
    public final TextView f34395p1;
    public TLRPC.WallPaper f34396q1;
    public final cp f34397r1;
    public final org.telegram.ui.ym f34398s1;
    public final org.telegram.ui.ActionBar.p3 f34399t1;
    public final boolean f34400u1;
    public final org.telegram.ui.an f34401v1;
    public final uj0 f34402w1;
    public final v4.b0 f34403x1;
    public final pz f34404y1;
    public final ch0 f34405z1;

    public ep(org.telegram.ui.an anVar, org.telegram.ui.ym ymVar) {
        super(1, (Context) anVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) ymVar, true);
        String str;
        boolean z10;
        this.K1 = -1;
        this.X1 = false;
        this.Y1 = false;
        this.f34388a2 = 0.0f;
        this.f34401v1 = anVar;
        this.f34398s1 = ymVar;
        this.f34399t1 = ymVar.f53545f;
        this.f34396q1 = ymVar.f53546g;
        this.f34400u1 = org.telegram.ui.ActionBar.j6.I.q();
        cp cpVar = new cp(this.f29679a, anVar.a(), ymVar, 0);
        this.f34397r1 = cpVar;
        this.f29710p0 = false;
        this.f29686c0 = false;
        this.f29720w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i7 = org.telegram.ui.ActionBar.j6.f28940i5;
            this.H0 = org.telegram.ui.ActionBar.j6.w0(i7, this.J0);
            org.telegram.messenger.g0.t3(this, org.telegram.ui.ActionBar.j6.w0(i7, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        } else {
            Q(org.telegram.ui.ActionBar.j6.f28940i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.hd.M0(2131745651, null));
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f28957j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f34393m1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.n1 = x1Var;
        imageView.setImageDrawable(x1Var);
        imageView.setOnClickListener(new oo(this, 1));
        frameLayout.addView(imageView, c8.ja.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        ch0 ch0Var = new ch0(2131624241, L2, L2, false, null);
        this.f34405z1 = ch0Var;
        this.H1 = !org.telegram.ui.ActionBar.j6.I.q();
        U0(org.telegram.ui.ActionBar.j6.I.q(), false);
        ch0Var.J(true);
        ch0Var.h = true;
        this.f34391e2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.A1 = xcVar;
        xcVar.setAnimation(ch0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new oo(this, 2));
        frameLayout.addView(xcVar, c8.ja.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.B1 = new v4.c0(getContext());
        uj0 uj0Var = new uj0(getContext(), null);
        this.f34402w1 = uj0Var;
        uj0Var.setAdapter(cpVar);
        uj0Var.setDrawSelection(false);
        uj0Var.setClipChildren(false);
        uj0Var.setClipToPadding(false);
        uj0Var.setHasFixedSize(true);
        uj0Var.setItemAnimator(null);
        uj0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.b0 b0Var = new v4.b0(0, false);
        this.f34403x1 = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        uj0Var.setOnItemClickListener(new j(this, 3));
        uj0Var.setOnScrollListener(new ri(this, 7));
        pz pzVar = new pz(getContext(), this.J0);
        this.f34404y1 = pzVar;
        pzVar.setViewType(14);
        pzVar.setVisibility(0);
        frameLayout.addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(uj0Var, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.C1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.j6.w0(i10, this.J0);
        int i11 = org.telegram.ui.ActionBar.j6.Hi;
        int w04 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        Drawable k02 = org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(view, k02, M, M2, e6Var);
        view.setOnClickListener(new oo(this, 3));
        frameLayout.addView(view, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.F1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f34396q1 == null) {
            textView2.setText(org.telegram.messenger.hd.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var = new h6(getContext(), true, true, true);
        this.D1 = h6Var;
        h6Var.getDrawable().q(true);
        h6Var.f35178n = false;
        h6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i12, this.J0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(h6Var, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var2 = new h6(getContext(), true, true, true);
        this.E1 = h6Var2;
        h6Var2.getDrawable().q(true);
        h6Var2.f35178n = false;
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i12, this.J0);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        h6Var2.setAlpha(0.0f);
        h6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(h6Var2, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f34396q1 != null) {
            TextView textView3 = new TextView(getContext());
            this.f34394o1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.hd.M0(2131746085, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new n2(10, this, anVar));
            frameLayout.addView(textView3, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f34395p1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (anVar.j() != null) {
                str = org.telegram.messenger.q10.j(anVar.j(), true);
            } else {
                TLRPC.Chat chat = anVar.f45173e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.hd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(ep epVar, t71 t71Var) {
        ?? obj = new Object();
        obj.f28476a = true;
        org.telegram.ui.an anVar = epVar.f34401v1;
        t71Var.f51408a.f51123a = anVar.getResourceProvider();
        t71Var.f51458r1 = new yo(epVar);
        obj.f28478c = new ih(3);
        obj.d = new no(epVar, 5);
        obj.f28477b = new no(epVar, 6);
        obj.f28479e = true;
        epVar.R1 = t71Var;
        anVar.showAsSheet(t71Var, obj);
    }

    public static org.telegram.ui.ActionBar.i6 J0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.Q0(string) != null && !org.telegram.ui.ActionBar.j6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.Q0(string2) != null && org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
            str2 = string2;
        }
        if (z10) {
            return org.telegram.ui.ActionBar.j6.Q0(str2);
        }
        return org.telegram.ui.ActionBar.j6.Q0(str);
    }

    public static void W0(zz0 zz0Var) {
        if (zz0Var == null) {
            return;
        }
        float width = zz0Var.getWidth() / 2.0f;
        float max = Math.max(width, zz0Var.getWidth() - width);
        float max2 = Math.max(0.0f, zz0Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zz0Var, zz0.f42522x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(qs.f38759e);
        ofFloat.addListener(new x5(zz0Var, 17));
        ofFloat.start();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28940i5));
    }

    public final void K0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ep.K0(boolean):void");
    }

    public final org.telegram.ui.Components.zz0 L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ep.L0():org.telegram.ui.Components.zz0");
    }

    public final void M0() {
        if (P0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = org.telegram.messenger.hd.M0(2131752196, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131752197, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752199, null), new org.telegram.ui.ActionBar.q1(this) {
                public final ep f38733b;

                {
                    this.f38733b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f38733b.K0(false);
                            return;
                        default:
                            this.f38733b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752198, null), new org.telegram.ui.ActionBar.q1(this) {
                public final ep f38733b;

                {
                    this.f38733b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f38733b.K0(false);
                            return;
                        default:
                            this.f38733b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
            return;
        }
        dismiss();
    }

    public final void N0() {
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0);
            ch0 ch0Var = this.f34405z1;
            if (ch0Var != null && w02 != this.f34391e2) {
                this.f34391e2 = w02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.n1;
            if (x1Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
                x1Var.a(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
                x1Var.b(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
                ImageView imageView = this.f34393m1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
            if (w03 != this.f34392f2) {
                this.f34392f2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.I1) {
            org.telegram.ui.ActionBar.j6.f28805b = false;
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f34398s1.f53546g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.p3 p3Var = this.G1.f34022a;
            if (p3Var.f29470a) {
                this.f34398s1.r(null, wallPaper2, false, Boolean.valueOf(this.H1), true);
            } else {
                this.f34398s1.r(p3Var, wallPaper2, false, Boolean.valueOf(this.H1), true);
            }
            ki kiVar = this.S1;
            if (kiVar != null) {
                yi yiVar = kiVar.f36471m2;
                if (yiVar != null) {
                    boolean z10 = this.H1;
                    ha haVar = yiVar.f42004w;
                    ((ArrayList) haVar.f35206e).clear();
                    WallpapersListActivity.E0((ArrayList) haVar.f35206e, z10);
                    haVar.f();
                }
                this.S1.P0();
            }
            cp cpVar = this.f34397r1;
            if (cpVar != null && cpVar.d != null) {
                for (int i7 = 0; i7 < cpVar.d.size(); i7++) {
                    ((dp) cpVar.d.get(i7)).f34024c = this.H1 ? 1 : 0;
                }
                cpVar.f();
            }
        }
    }

    public final boolean P0() {
        ig.b bVar;
        if (this.G1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p3 p3Var = this.Q1;
        ig.b bVar2 = null;
        if (p3Var != null) {
            bVar = p3Var.f29472c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.G1.f34022a;
        if (p3Var2 != null) {
            bVar2 = p3Var2.f29472c;
        }
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (!this.V1) {
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f29679a);
            if (f10.f23028f.f19168c && (arrayList = f10.f23025b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z10 = true;
            this.V1 = true;
            if (f10.f23028f.f19168c) {
                f10.q(new ap(this, f10), false);
                return;
            }
            bp bpVar = new bp(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.q1 q1Var = f10.f23028f;
            if (currentTimeMillis - q1Var.f19167b <= 7200000) {
                z10 = false;
            }
            if (((ArrayList) q1Var.d) != null && q1Var.f19168c && !z10) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            l2.q1 q1Var2 = f10.f23028f;
            tl_getUniqueGiftChatThemes.offset = (String) q1Var2.f19169e;
            tl_getUniqueGiftChatThemes.hash = q1Var2.f19166a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f10.getConnectionsManager();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f23022s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.x3(0, f10, bpVar));
        }
    }

    public final void R0(ArrayList arrayList) {
        ig.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        dp dpVar = new dp((org.telegram.ui.ActionBar.p3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.P1) {
            org.telegram.ui.ActionBar.p3 p3Var = this.f34398s1.f53545f;
            this.Q1 = p3Var;
            if (p3Var != null) {
                p3Var.k();
            }
        }
        arrayList2.add(0, dpVar);
        if (!this.P1) {
            this.G1 = dpVar;
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.Q1;
        if (p3Var2 != null) {
            bVar = p3Var2.f29472c;
        } else {
            bVar = null;
        }
        boolean z10 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.p3 p3Var3 = (org.telegram.ui.ActionBar.p3) arrayList.get(i7);
            dp dpVar2 = new dp(p3Var3);
            p3Var3.m(this.f29679a);
            dpVar2.f34024c = this.H1 ? 1 : 0;
            if (ig.b.a(p3Var3.f29472c, bVar)) {
                arrayList2.add(1, dpVar2);
                z10 = true;
            } else {
                arrayList2.add(dpVar2);
            }
            i7++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.p3 p3Var4 = this.Q1;
        if (p3Var4 != null && !z10) {
            dp dpVar3 = new dp(p3Var4);
            p3Var4.m(this.f29679a);
            dpVar3.f34024c = this.H1 ? 1 : 0;
            arrayList2.add(1, dpVar3);
        }
        cp cpVar = this.f34397r1;
        cpVar.d = arrayList2;
        cpVar.f();
        this.A1.setVisibility(0);
        if (!this.P1) {
            T0(false);
            this.f34402w1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.P1 = true;
        Z0(true);
    }

    public final void S0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.I1) {
            this.J1 = false;
            this.f34401v1.getClass();
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f34396q1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.p3 p3Var = this.G1.f34022a;
            if (p3Var.f29470a) {
                this.f34398s1.r(null, wallPaper2, true, Boolean.valueOf(this.H1), false);
                return;
            }
            this.f34398s1.r(p3Var, wallPaper2, true, Boolean.valueOf(this.H1), false);
        }
    }

    public final void T0(boolean z10) {
        cp cpVar = this.f34397r1;
        ArrayList arrayList = cpVar.d;
        org.telegram.ui.ActionBar.p3 p3Var = this.Q1;
        v4.b0 b0Var = this.f34403x1;
        uj0 uj0Var = this.f34402w1;
        if (p3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 != arrayList.size()) {
                    if (ig.b.a(((dp) arrayList.get(i7)).f34022a.f29472c, this.Q1.f29472c)) {
                        this.G1 = (dp) arrayList.get(i7);
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
                cpVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, cpVar.d.size() - 1);
                if (z10) {
                    uj0Var.y0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.G1 = (dp) arrayList.get(0);
            cpVar.E(0);
            if (z10) {
                uj0Var.y0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        S0();
    }

    public final void U0(boolean z10, boolean z11) {
        int i7;
        if (this.H1 != z10) {
            this.H1 = z10;
            org.telegram.ui.xc xcVar = this.A1;
            ch0 ch0Var = this.f34405z1;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    i10 = ch0Var.f33577e[0];
                }
                ch0Var.P(i10);
                if (xcVar != null) {
                    xcVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i7 = ch0Var.f33577e[0] - 1;
            } else {
                i7 = 0;
            }
            ch0Var.N(i7, false, true);
            ch0Var.P(i7);
            if (xcVar != null) {
                xcVar.invalidate();
            }
        }
    }

    @Override
    public final ArrayList V() {
        ro roVar = new ro(this);
        ArrayList arrayList = new ArrayList();
        if (this.f34401v1.f45397v7) {
            org.telegram.ui.ActionBar.e2 e2Var = this.R1;
            if (e2Var instanceof t71) {
                arrayList.addAll(((t71) e2Var).X0());
                return arrayList;
            }
        }
        ki kiVar = this.S1;
        if (kiVar != null) {
            arrayList.addAll(kiVar.V());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f29715s0}, roVar, org.telegram.ui.ActionBar.j6.f28922h5));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        View view = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hi));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.s6) obj).f29608n = this.f34398s1;
        }
        return arrayList;
    }

    public final void V0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ep.V0(boolean):void");
    }

    public final void X0(org.telegram.ui.ActionBar.i6 i6Var) {
        if (i6Var != null && i6Var != org.telegram.ui.ActionBar.j6.I) {
            this.f34390c2 = true;
            try {
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25577t4, i6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f34390c2 = false;
            }
        }
    }

    public final void Y0() {
        TextView textView = this.f34395p1;
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29068p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i7, 76);
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.q6.j(textView, k02, null, g10, e6Var);
        }
        TextView textView2 = this.f34394o1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.f29070p7;
            org.telegram.ui.ActionBar.q6.U(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.m6 g11 = org.telegram.ui.ActionBar.q6.g(i10, 76);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.q6.j(textView2, k03, null, g11, e6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.m6 g12 = org.telegram.ui.ActionBar.q6.g(i11, 30);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        ImageView imageView = this.f34393m1;
        org.telegram.ui.ActionBar.q6.Q(imageView, h02, null, g12, e6Var3);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.x1 x1Var = this.n1;
        x1Var.a(w02);
        x1Var.b(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.Q(this.A1, org.telegram.ui.ActionBar.j6.h0(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.q6.g(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.j6.f29013m5;
        org.telegram.ui.ActionBar.e6 e6Var4 = this.J0;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.q6.U(textView3, i13, e6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.q6.g(i12, 76), this.J0);
    }

    public final void Z0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ep.Z0(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25514i4) {
            org.telegram.messenger.ns.f(this.f29679a).d(new no(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        zz0 zz0Var;
        org.telegram.ui.ActionBar.i6 J0;
        boolean z10;
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        super.dismiss();
        this.f34401v1.getClass();
        boolean z11 = this.I1;
        boolean z12 = this.f34400u1;
        if (!z11 && this.H1 != z12) {
            zz0Var = L0();
        } else {
            zz0Var = null;
        }
        if (!this.I1) {
            org.telegram.ui.ym ymVar = this.f34398s1;
            TLRPC.WallPaper wallPaper = ymVar.f53546g;
            if (wallPaper == null) {
                wallPaper = this.f34396q1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (zz0Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ymVar.r(this.f34399t1, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.H1 != z12) {
            if (org.telegram.ui.ActionBar.j6.I.q() == z12) {
                J0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                J0 = J0(z12);
            }
            if (this.d2) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.j6.u(J0, false, z12);
            }
        }
        this.d2 = false;
        W0(zz0Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f29682b.getTop() && x10 >= this.f29682b.getLeft() && x10 <= this.f29682b.getRight()) {
            return false;
        }
        this.f34401v1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void g0(float f10) {
        b30 b30Var = this.O1;
        if (b30Var != null) {
            b30Var.a();
        }
    }

    @Override
    public final void onBackPressed() {
        M0();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f29679a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        this.I1 = false;
        if (f10.f23028f.f19168c && (arrayList = f10.f23025b) != null && !arrayList.isEmpty()) {
            R0(f10.e(7));
        } else {
            Q0();
        }
        if (this.f34401v1.j() != null && org.telegram.messenger.gz.f23942e1 > 0 && !this.f34401v1.j().self) {
            org.telegram.messenger.gz.f23942e1--;
            org.telegram.messenger.t0.f26600b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.gz.f23942e1).apply();
            b30 b30Var = new b30(9, getContext(), this.f34401v1.getResourceProvider(), false);
            this.O1 = b30Var;
            b30Var.setVisibility(4);
            this.O1.setShowingDuration(5000L);
            this.O1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
            if (this.H1) {
                this.O1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
            } else {
                this.O1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
            }
            org.telegram.messenger.g0.i3(new no(this, 7), 1500L);
            this.f29685c.addView(this.O1, c8.ja.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, this.J0))) {
                this.H0 = w02;
                boolean z10 = false;
                org.telegram.messenger.g0.t3(this, w02, false, null);
                if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                    z10 = true;
                }
                org.telegram.messenger.g0.n3(this, z10);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

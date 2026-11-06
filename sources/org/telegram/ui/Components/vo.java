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
import org.telegram.ui.u71;
public final class vo extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final int f38993c2 = 0;
    public final j6 A1;
    public final TextView B1;
    public uo C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public wz0 H1;
    public float I1;
    public ValueAnimator J1;
    public y20 K1;
    public boolean L1;
    public org.telegram.ui.ActionBar.r3 M1;
    public org.telegram.ui.ActionBar.f2 N1;
    public di O1;
    public bi.x5 P1;
    public j6 Q1;
    public boolean R1;
    public wp S1;
    public boolean T1;
    public boolean U1;
    public TL_stories.TL_premium_boostsStatus V1;
    public float W1;
    public ValueAnimator X1;
    public boolean Y1;
    public boolean Z1;
    public int f38994a2;
    public int f38995b2;
    public final ImageView f38996i1;
    public final org.telegram.ui.ActionBar.y1 f38997j1;
    public final TextView f38998k1;
    public final TextView l1;
    public TLRPC.WallPaper f38999m1;
    public final to n1;
    public final org.telegram.ui.ym f39000o1;
    public final org.telegram.ui.ActionBar.r3 f39001p1;
    public final boolean f39002q1;
    public final org.telegram.ui.an f39003r1;
    public final pj0 f39004s1;
    public final v4.b0 f39005t1;
    public final lz f39006u1;
    public final zg0 f39007v1;
    public final org.telegram.ui.yc f39008w1;
    public final qo f39009x1;
    public final View f39010y1;
    public final j6 f39011z1;

    public vo(org.telegram.ui.an anVar, org.telegram.ui.ym ymVar) {
        super(1, (Context) anVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) ymVar, true);
        String str;
        boolean z9;
        this.G1 = -1;
        this.T1 = false;
        this.U1 = false;
        this.W1 = 0.0f;
        this.f39003r1 = anVar;
        this.f39000o1 = ymVar;
        this.f39001p1 = ymVar.f52272f;
        this.f38999m1 = ymVar.f52273g;
        this.f39002q1 = org.telegram.ui.ActionBar.k6.I.q();
        to toVar = new to(this.f28612a, anVar.a(), ymVar, 0);
        this.n1 = toVar;
        this.f28638o0 = false;
        this.f28616b0 = false;
        this.f28647v0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int i7 = org.telegram.ui.ActionBar.k6.f27939i5;
            this.G0 = org.telegram.ui.ActionBar.k6.w0(i7, this.I0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(i7, this.I0), false, null);
            if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        } else {
            P(org.telegram.ui.ActionBar.k6.f27939i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.N = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.hd.M0(2131745652, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27956j5, this.I0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f38996i1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f38997j1 = y1Var;
        imageView.setImageDrawable(y1Var);
        imageView.setOnClickListener(new fo(this, 1));
        frameLayout.addView(imageView, c8.ha.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.I0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        zg0 zg0Var = new zg0(2131624240, L2, L2, false, null);
        this.f39007v1 = zg0Var;
        this.D1 = !org.telegram.ui.ActionBar.k6.I.q();
        U0(org.telegram.ui.ActionBar.k6.I.q(), false);
        zg0Var.J(true);
        zg0Var.h = true;
        this.f38994a2 = w02;
        zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.yc ycVar = new org.telegram.ui.yc(1, getContext(), this);
        this.f39008w1 = ycVar;
        ycVar.setAnimation(zg0Var);
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        ycVar.setOnClickListener(new fo(this, 2));
        frameLayout.addView(ycVar, c8.ha.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.f39009x1 = new v4.c0(getContext());
        pj0 pj0Var = new pj0(getContext(), null);
        this.f39004s1 = pj0Var;
        pj0Var.setAdapter(toVar);
        pj0Var.setDrawSelection(false);
        pj0Var.setClipChildren(false);
        pj0Var.setClipToPadding(false);
        pj0Var.setHasFixedSize(true);
        pj0Var.setItemAnimator(null);
        pj0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.b0 b0Var = new v4.b0(0, false);
        this.f39005t1 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        pj0Var.setOnItemClickListener(new k(this, 3));
        pj0Var.setOnScrollListener(new ui(this, 5));
        lz lzVar = new lz(getContext(), this.I0);
        this.f39006u1 = lzVar;
        lzVar.setViewType(14);
        lzVar.setVisibility(0);
        frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(pj0Var, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.f39010y1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, this.I0);
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i11, this.I0);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, f6Var);
        view.setOnClickListener(new fo(this, 3));
        frameLayout.addView(view, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.B1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f38999m1 == null) {
            textView2.setText(org.telegram.messenger.hd.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        j6 j6Var = new j6(getContext(), true, true, true);
        this.f39011z1 = j6Var;
        j6Var.getDrawable().q(true);
        j6Var.f34873n = false;
        j6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i12, this.I0);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(j6Var, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        j6 j6Var2 = new j6(getContext(), true, true, true);
        this.A1 = j6Var2;
        j6Var2.getDrawable().q(true);
        j6Var2.f34873n = false;
        j6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i12, this.I0);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        j6Var2.setAlpha(0.0f);
        j6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(j6Var2, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f38999m1 != null) {
            TextView textView3 = new TextView(getContext());
            this.f38998k1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.hd.M0(2131746086, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new lk(3, this, anVar));
            frameLayout.addView(textView3, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.l1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (anVar.j() != null) {
                str = org.telegram.messenger.t10.j(anVar.j(), true);
            } else {
                TLRPC.Chat chat = anVar.f43772e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.hd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(vo voVar, u71 u71Var) {
        ?? obj = new Object();
        obj.f27420a = true;
        org.telegram.ui.an anVar = voVar.f39003r1;
        u71Var.f50266a.f50584a = anVar.getResourceProvider();
        u71Var.f50312q1 = new po(voVar);
        obj.f27422c = new org.telegram.messenger.pd(27);
        obj.d = new eo(voVar, 5);
        obj.f27421b = new eo(voVar, 6);
        obj.f27423e = true;
        voVar.N1 = u71Var;
        anVar.showAsSheet(u71Var, obj);
    }

    public static org.telegram.ui.ActionBar.j6 J0(boolean z9) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
            str2 = string2;
        }
        if (z9) {
            return org.telegram.ui.ActionBar.k6.Q0(str2);
        }
        return org.telegram.ui.ActionBar.k6.Q0(str);
    }

    public static void W0(wz0 wz0Var) {
        if (wz0Var == null) {
            return;
        }
        float width = wz0Var.getWidth() / 2.0f;
        float max = Math.max(width, wz0Var.getWidth() - width);
        float max2 = Math.max(0.0f, wz0Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wz0Var, wz0.f40117x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ks.f35412e);
        ofFloat.addListener(new z5(wz0Var, 17));
        ofFloat.start();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27939i5));
    }

    public final void K0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.K0(boolean):void");
    }

    public final org.telegram.ui.Components.wz0 L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.L0():org.telegram.ui.Components.wz0");
    }

    public final void M0() {
        if (P0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = org.telegram.messenger.hd.M0(2131752196, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131752197, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752199, null), new org.telegram.ui.ActionBar.r1(this) {
                public final vo f34336b;

                {
                    this.f34336b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f34336b.K0(false);
                            return;
                        default:
                            this.f34336b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752198, null), new org.telegram.ui.ActionBar.r1(this) {
                public final vo f34336b;

                {
                    this.f34336b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f34336b.K0(false);
                            return;
                        default:
                            this.f34336b.dismiss();
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0);
            zg0 zg0Var = this.f39007v1;
            if (zg0Var != null && w02 != this.f38994a2) {
                this.f38994a2 = w02;
                zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.f38997j1;
            if (y1Var != null) {
                int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
                y1Var.a(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
                y1Var.b(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
                ImageView imageView = this.f38996i1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0);
            if (w03 != this.f38995b2) {
                this.f38995b2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        TLRPC.WallPaper wallPaper;
        if (!this.I && !this.E1) {
            org.telegram.ui.ActionBar.k6.f27804b = false;
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f39000o1.f52273g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.r3 r3Var = this.C1.f38688a;
            if (r3Var.f28455a) {
                this.f39000o1.r(null, wallPaper2, false, Boolean.valueOf(this.D1), true);
            } else {
                this.f39000o1.r(r3Var, wallPaper2, false, Boolean.valueOf(this.D1), true);
            }
            di diVar = this.O1;
            if (diVar != null) {
                qi qiVar = diVar.f32919i2;
                if (qiVar != null) {
                    boolean z9 = this.D1;
                    la laVar = qiVar.f37310w;
                    ((ArrayList) laVar.f35585e).clear();
                    WallpapersListActivity.E0((ArrayList) laVar.f35585e, z9);
                    laVar.f();
                }
                this.O1.P0();
            }
            to toVar = this.n1;
            if (toVar != null && toVar.d != null) {
                for (int i7 = 0; i7 < toVar.d.size(); i7++) {
                    ((uo) toVar.d.get(i7)).f38690c = this.D1 ? 1 : 0;
                }
                toVar.f();
            }
        }
    }

    public final boolean P0() {
        ig.b bVar;
        if (this.C1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r3 r3Var = this.M1;
        ig.b bVar2 = null;
        if (r3Var != null) {
            bVar = r3Var.f28457c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.r3 r3Var2 = this.C1.f38688a;
        if (r3Var2 != null) {
            bVar2 = r3Var2.f28457c;
        }
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (!this.R1) {
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f28612a);
            if (f10.f21953f.f18060c && (arrayList = f10.f21950b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z9 = true;
            this.R1 = true;
            if (f10.f21953f.f18060c) {
                f10.q(new ro(this, f10), false);
                return;
            }
            so soVar = new so(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.u1 u1Var = f10.f21953f;
            if (currentTimeMillis - u1Var.f18059b <= 7200000) {
                z9 = false;
            }
            if (((ArrayList) u1Var.d) != null && u1Var.f18060c && !z9) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            l2.u1 u1Var2 = f10.f21953f;
            tl_getUniqueGiftChatThemes.offset = (String) u1Var2.f18061e;
            tl_getUniqueGiftChatThemes.hash = u1Var2.f18058a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f10.getConnectionsManager();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f21947s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.x3(0, f10, soVar));
        }
    }

    public final void R0(ArrayList arrayList) {
        ig.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        uo uoVar = new uo((org.telegram.ui.ActionBar.r3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.L1) {
            org.telegram.ui.ActionBar.r3 r3Var = this.f39000o1.f52272f;
            this.M1 = r3Var;
            if (r3Var != null) {
                r3Var.k();
            }
        }
        arrayList2.add(0, uoVar);
        if (!this.L1) {
            this.C1 = uoVar;
        }
        org.telegram.ui.ActionBar.r3 r3Var2 = this.M1;
        if (r3Var2 != null) {
            bVar = r3Var2.f28457c;
        } else {
            bVar = null;
        }
        boolean z9 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.r3 r3Var3 = (org.telegram.ui.ActionBar.r3) arrayList.get(i7);
            uo uoVar2 = new uo(r3Var3);
            r3Var3.m(this.f28612a);
            uoVar2.f38690c = this.D1 ? 1 : 0;
            if (ig.b.a(r3Var3.f28457c, bVar)) {
                arrayList2.add(1, uoVar2);
                z9 = true;
            } else {
                arrayList2.add(uoVar2);
            }
            i7++;
            z9 = z9;
        }
        org.telegram.ui.ActionBar.r3 r3Var4 = this.M1;
        if (r3Var4 != null && !z9) {
            uo uoVar3 = new uo(r3Var4);
            r3Var4.m(this.f28612a);
            uoVar3.f38690c = this.D1 ? 1 : 0;
            arrayList2.add(1, uoVar3);
        }
        to toVar = this.n1;
        toVar.d = arrayList2;
        toVar.f();
        this.f39008w1.setVisibility(0);
        if (!this.L1) {
            T0(false);
            this.f39004s1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.L1 = true;
        Z0(true);
    }

    public final void S0() {
        TLRPC.WallPaper wallPaper;
        if (!this.I && !this.E1) {
            this.F1 = false;
            this.f39003r1.getClass();
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f38999m1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.r3 r3Var = this.C1.f38688a;
            if (r3Var.f28455a) {
                this.f39000o1.r(null, wallPaper2, true, Boolean.valueOf(this.D1), false);
                return;
            }
            this.f39000o1.r(r3Var, wallPaper2, true, Boolean.valueOf(this.D1), false);
        }
    }

    public final void T0(boolean z9) {
        to toVar = this.n1;
        ArrayList arrayList = toVar.d;
        org.telegram.ui.ActionBar.r3 r3Var = this.M1;
        v4.b0 b0Var = this.f39005t1;
        pj0 pj0Var = this.f39004s1;
        if (r3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 != arrayList.size()) {
                    if (ig.b.a(((uo) arrayList.get(i7)).f38688a.f28457c, this.M1.f28457c)) {
                        this.C1 = (uo) arrayList.get(i7);
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                this.G1 = i7;
                toVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, toVar.d.size() - 1);
                if (z9) {
                    pj0Var.y0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.C1 = (uo) arrayList.get(0);
            toVar.E(0);
            if (z9) {
                pj0Var.y0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        S0();
    }

    @Override
    public final ArrayList U() {
        io ioVar = new io(this);
        ArrayList arrayList = new ArrayList();
        if (this.f39003r1.f43980u7) {
            org.telegram.ui.ActionBar.f2 f2Var = this.N1;
            if (f2Var instanceof u71) {
                arrayList.addAll(((u71) f2Var).X0());
                return arrayList;
            }
        }
        di diVar = this.O1;
        if (diVar != null) {
            arrayList.addAll(diVar.U());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f28642r0}, ioVar, org.telegram.ui.ActionBar.k6.f27921h5));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        View view = this.f39010y1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.t6) obj).f28542n = this.f39000o1;
        }
        return arrayList;
    }

    public final void U0(boolean z9, boolean z10) {
        int i7;
        if (this.D1 != z9) {
            this.D1 = z9;
            org.telegram.ui.yc ycVar = this.f39008w1;
            zg0 zg0Var = this.f39007v1;
            int i10 = 0;
            if (z10) {
                if (z9) {
                    i10 = zg0Var.f40956e[0];
                }
                zg0Var.P(i10);
                if (ycVar != null) {
                    ycVar.d();
                    return;
                }
                return;
            }
            if (z9) {
                i7 = zg0Var.f40956e[0] - 1;
            } else {
                i7 = 0;
            }
            zg0Var.N(i7, false, true);
            zg0Var.P(i7);
            if (ycVar != null) {
                ycVar.invalidate();
            }
        }
    }

    public final void V0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.V0(boolean):void");
    }

    public final void X0(org.telegram.ui.ActionBar.j6 j6Var) {
        if (j6Var != null && j6Var != org.telegram.ui.ActionBar.k6.I) {
            this.Y1 = true;
            try {
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25064t4, j6Var, Boolean.FALSE, null, -1);
            } finally {
                this.Y1 = false;
            }
        }
    }

    public final void Y0() {
        TextView textView = this.l1;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28067p5, this.I0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i7, this.I0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i7, 76);
            org.telegram.ui.ActionBar.f6 f6Var = this.I0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.r6.k(textView, k02, null, h, f6Var);
        }
        TextView textView2 = this.f38998k1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.k6.f28069p7;
            org.telegram.ui.ActionBar.r6.V(textView2, i10, this.I0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i10, 76);
            org.telegram.ui.ActionBar.f6 f6Var2 = this.I0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.r6.k(textView2, k03, null, h7, f6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, this.I0), 30), 1, -1);
        org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i11, 30);
        org.telegram.ui.ActionBar.f6 f6Var3 = this.I0;
        ImageView imageView = this.f38996i1;
        org.telegram.ui.ActionBar.r6.R(imageView, h02, null, h10, f6Var3);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.I0);
        org.telegram.ui.ActionBar.y1 y1Var = this.f38997j1;
        y1Var.a(w02);
        y1Var.b(org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.R(this.f39008w1, org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 30), 1, -1), null, org.telegram.ui.ActionBar.r6.h(i12, 30), this.I0);
        int i13 = org.telegram.ui.ActionBar.k6.f28012m5;
        org.telegram.ui.ActionBar.f6 f6Var4 = this.I0;
        TextView textView3 = this.B1;
        org.telegram.ui.ActionBar.r6.V(textView3, i13, f6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 76);
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.r6.h(i12, 76), this.I0);
    }

    public final void Z0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.Z0(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25001i4) {
            org.telegram.messenger.qs.f(this.f28612a).d(new eo(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        wz0 wz0Var;
        org.telegram.ui.ActionBar.j6 J0;
        boolean z9;
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        super.dismiss();
        this.f39003r1.getClass();
        boolean z10 = this.E1;
        boolean z11 = this.f39002q1;
        if (!z10 && this.D1 != z11) {
            wz0Var = L0();
        } else {
            wz0Var = null;
        }
        if (!this.E1) {
            org.telegram.ui.ym ymVar = this.f39000o1;
            TLRPC.WallPaper wallPaper = ymVar.f52273g;
            if (wallPaper == null) {
                wallPaper = this.f38999m1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (wz0Var == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ymVar.r(this.f39001p1, wallPaper2, z9, Boolean.valueOf(z11), false);
        }
        if (this.D1 != z11) {
            if (org.telegram.ui.ActionBar.k6.I.q() == z11) {
                J0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                J0 = J0(z11);
            }
            if (this.Z1) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.k6.u(J0, false, z11);
            }
        }
        this.Z1 = false;
        W0(wz0Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f28615b.getTop() && x10 >= this.f28615b.getLeft() && x10 <= this.f28615b.getRight()) {
            return false;
        }
        this.f39003r1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void g0(float f10) {
        y20 y20Var = this.K1;
        if (y20Var != null) {
            y20Var.a();
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
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f28612a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25001i4);
        this.E1 = false;
        if (f10.f21953f.f18060c && (arrayList = f10.f21950b) != null && !arrayList.isEmpty()) {
            R0(f10.e(7));
        } else {
            Q0();
        }
        if (this.f39003r1.j() != null && org.telegram.messenger.iz.f23370e1 > 0 && !this.f39003r1.j().self) {
            org.telegram.messenger.iz.f23370e1--;
            org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.iz.f23370e1).apply();
            y20 y20Var = new y20(9, getContext(), this.f39003r1.getResourceProvider(), false);
            this.K1 = y20Var;
            y20Var.setVisibility(4);
            this.K1.setShowingDuration(5000L);
            this.K1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
            if (this.D1) {
                this.K1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
            } else {
                this.K1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
            }
            org.telegram.messenger.g0.i3(new eo(this, 7), 1500L);
            this.f28618c.addView(this.K1, c8.ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.F0 == -1 && this.G0 != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27939i5, this.I0))) {
                this.G0 = w02;
                boolean z9 = false;
                org.telegram.messenger.g0.u3(this, w02, false, null);
                if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                    z9 = true;
                }
                org.telegram.messenger.g0.n3(this, z9);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}

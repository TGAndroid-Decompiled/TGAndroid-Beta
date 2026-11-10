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
import org.telegram.ui.x71;
public final class vo extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public static final int f39059f2 = 0;
    public final po A1;
    public final View B1;
    public final i6 C1;
    public final i6 D1;
    public final TextView E1;
    public uo F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public xz0 K1;
    public float L1;
    public ValueAnimator M1;
    public y20 N1;
    public boolean O1;
    public org.telegram.ui.ActionBar.s3 P1;
    public org.telegram.ui.ActionBar.f2 Q1;
    public ci R1;
    public bi.x5 S1;
    public i6 T1;
    public boolean U1;
    public wp V1;
    public boolean W1;
    public boolean X1;
    public TL_stories.TL_premium_boostsStatus Y1;
    public float Z1;
    public ValueAnimator f39060a2;
    public boolean f39061b2;
    public boolean f39062c2;
    public int d2;
    public int f39063e2;
    public final ImageView l1;
    public final org.telegram.ui.ActionBar.y1 f39064m1;
    public final TextView n1;
    public final TextView f39065o1;
    public TLRPC.WallPaper f39066p1;
    public final to f39067q1;
    public final org.telegram.ui.an f39068r1;
    public final org.telegram.ui.ActionBar.s3 f39069s1;
    public final boolean f39070t1;
    public final org.telegram.ui.cn f39071u1;
    public final pj0 f39072v1;
    public final v4.b0 f39073w1;
    public final lz f39074x1;
    public final zg0 f39075y1;
    public final org.telegram.ui.yc f39076z1;

    public vo(org.telegram.ui.cn cnVar, org.telegram.ui.an anVar) {
        super(1, (Context) cnVar.getParentActivity(), (org.telegram.ui.ActionBar.h6) anVar, true);
        String str;
        boolean z9;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.f39071u1 = cnVar;
        this.f39068r1 = anVar;
        this.f39069s1 = anVar.f43729f;
        this.f39066p1 = anVar.f43730g;
        this.f39070t1 = org.telegram.ui.ActionBar.m6.I.q();
        to toVar = new to(this.f28669a, cnVar.a(), anVar, 0);
        this.f39067q1 = toVar;
        this.f28698o0 = false;
        this.f28673b0 = false;
        this.f28707v0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int i7 = org.telegram.ui.ActionBar.m6.f27981i5;
            this.G0 = org.telegram.ui.ActionBar.m6.w0(i7, this.I0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.m6.w0(i7, this.I0), false, null);
            if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        } else {
            P(org.telegram.ui.ActionBar.m6.f27981i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.N = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.id.M0(2131745651, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.f27998j5, this.I0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f39064m1 = y1Var;
        imageView.setImageDrawable(y1Var);
        imageView.setOnClickListener(new eo(this, 1));
        frameLayout.addView(imageView, c8.ha.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        zg0 zg0Var = new zg0(2131624240, L2, L2, false, null);
        this.f39075y1 = zg0Var;
        this.G1 = !org.telegram.ui.ActionBar.m6.I.q();
        U0(org.telegram.ui.ActionBar.m6.I.q(), false);
        zg0Var.J(true);
        zg0Var.h = true;
        this.d2 = w02;
        zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.yc ycVar = new org.telegram.ui.yc(1, getContext(), this);
        this.f39076z1 = ycVar;
        ycVar.setAnimation(zg0Var);
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        ycVar.setOnClickListener(new eo(this, 2));
        frameLayout.addView(ycVar, c8.ha.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new v4.c0(getContext());
        pj0 pj0Var = new pj0(getContext(), null);
        this.f39072v1 = pj0Var;
        pj0Var.setAdapter(toVar);
        pj0Var.setDrawSelection(false);
        pj0Var.setClipChildren(false);
        pj0Var.setClipToPadding(false);
        pj0Var.setHasFixedSize(true);
        pj0Var.setItemAnimator(null);
        pj0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.b0 b0Var = new v4.b0(0, false);
        this.f39073w1 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        pj0Var.setOnItemClickListener(new j(this, 3));
        pj0Var.setOnScrollListener(new ti(this, 5));
        lz lzVar = new lz(getContext(), this.I0);
        this.f39074x1 = lzVar;
        lzVar.setViewType(14);
        lzVar.setVisibility(0);
        frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(pj0Var, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
        int i11 = org.telegram.ui.ActionBar.m6.Ei;
        int w04 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
        Drawable k02 = org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(view, k02, M, M2, h6Var);
        view.setOnClickListener(new eo(this, 3));
        frameLayout.addView(view, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f39066p1 == null) {
            textView2.setText(org.telegram.messenger.id.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.id.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        i6 i6Var = new i6(getContext(), true, true, true);
        this.C1 = i6Var;
        i6Var.getDrawable().q(true);
        i6Var.f34546n = false;
        i6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.m6.Gi;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i12, this.I0);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(i6Var, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        i6 i6Var2 = new i6(getContext(), true, true, true);
        this.D1 = i6Var2;
        i6Var2.getDrawable().q(true);
        i6Var2.f34546n = false;
        i6Var2.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i12, this.I0);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        i6Var2.setAlpha(0.0f);
        i6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(i6Var2, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f39066p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.id.M0(2131746085, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new kk(3, this, cnVar));
            frameLayout.addView(textView3, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f39065o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (cnVar.j() != null) {
                str = org.telegram.messenger.t10.j(cnVar.j(), true);
            } else {
                TLRPC.Chat chat = cnVar.f44473e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.id.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(vo voVar, x71 x71Var) {
        ?? obj = new Object();
        obj.f27388a = true;
        org.telegram.ui.cn cnVar = voVar.f39071u1;
        x71Var.f51561a.f51930a = cnVar.getResourceProvider();
        x71Var.f51607q1 = new oo(voVar);
        obj.f27390c = new org.telegram.messenger.rc(29);
        obj.d = new co(voVar, 5);
        obj.f27389b = new co(voVar, 6);
        obj.f27391e = true;
        voVar.Q1 = x71Var;
        cnVar.showAsSheet(x71Var, obj);
    }

    public static org.telegram.ui.ActionBar.l6 J0(boolean z9) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.m6.Q0(string) != null && !org.telegram.ui.ActionBar.m6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.m6.Q0(string2) != null && org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
            str2 = string2;
        }
        if (z9) {
            return org.telegram.ui.ActionBar.m6.Q0(str2);
        }
        return org.telegram.ui.ActionBar.m6.Q0(str);
    }

    public static void W0(xz0 xz0Var) {
        if (xz0Var == null) {
            return;
        }
        float width = xz0Var.getWidth() / 2.0f;
        float max = Math.max(width, xz0Var.getWidth() - width);
        float max2 = Math.max(0.0f, xz0Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xz0Var, xz0.f40439x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(js.f35060e);
        ofFloat.addListener(new y5(xz0Var, 17));
        ofFloat.start();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27981i5));
    }

    public final void K0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.K0(boolean):void");
    }

    public final org.telegram.ui.Components.xz0 L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.L0():org.telegram.ui.Components.xz0");
    }

    public final void M0() {
        if (P0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = org.telegram.messenger.id.M0(2131752196, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131752197, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752199, null), new org.telegram.ui.ActionBar.r1(this) {
                public final vo f33941b;

                {
                    this.f33941b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f33941b.K0(false);
                            return;
                        default:
                            this.f33941b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752198, null), new org.telegram.ui.ActionBar.r1(this) {
                public final vo f33941b;

                {
                    this.f33941b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f33941b.K0(false);
                            return;
                        default:
                            this.f33941b.dismiss();
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
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0);
            zg0 zg0Var = this.f39075y1;
            if (zg0Var != null && w02 != this.d2) {
                this.d2 = w02;
                zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.f39064m1;
            if (y1Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
                y1Var.a(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
                y1Var.b(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0);
            if (w03 != this.f39063e2) {
                this.f39063e2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        TLRPC.WallPaper wallPaper;
        if (!this.I && !this.H1) {
            org.telegram.ui.ActionBar.m6.f27846b = false;
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f39068r1.f43730g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = this.F1.f38725a;
            if (s3Var.f28485a) {
                this.f39068r1.r(null, wallPaper2, false, Boolean.valueOf(this.G1), true);
            } else {
                this.f39068r1.r(s3Var, wallPaper2, false, Boolean.valueOf(this.G1), true);
            }
            ci ciVar = this.R1;
            if (ciVar != null) {
                pi piVar = ciVar.f32622l2;
                if (piVar != null) {
                    boolean z9 = this.G1;
                    ka kaVar = piVar.f36939w;
                    ((ArrayList) kaVar.f35262e).clear();
                    WallpapersListActivity.E0((ArrayList) kaVar.f35262e, z9);
                    kaVar.f();
                }
                this.R1.P0();
            }
            to toVar = this.f39067q1;
            if (toVar != null && toVar.d != null) {
                for (int i7 = 0; i7 < toVar.d.size(); i7++) {
                    ((uo) toVar.d.get(i7)).f38727c = this.G1 ? 1 : 0;
                }
                toVar.f();
            }
        }
    }

    public final boolean P0() {
        ig.b bVar;
        if (this.F1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.s3 s3Var = this.P1;
        ig.b bVar2 = null;
        if (s3Var != null) {
            bVar = s3Var.f28487c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.s3 s3Var2 = this.F1.f38725a;
        if (s3Var2 != null) {
            bVar2 = s3Var2.f28487c;
        }
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (!this.U1) {
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f28669a);
            if (f10.f21987f.f18064c && (arrayList = f10.f21984b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z9 = true;
            this.U1 = true;
            if (f10.f21987f.f18064c) {
                f10.q(new qo(this, f10), false);
                return;
            }
            so soVar = new so(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.u1 u1Var = f10.f21987f;
            if (currentTimeMillis - u1Var.f18063b <= 7200000) {
                z9 = false;
            }
            if (((ArrayList) u1Var.d) != null && u1Var.f18064c && !z9) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            l2.u1 u1Var2 = f10.f21987f;
            tl_getUniqueGiftChatThemes.offset = (String) u1Var2.f18065e;
            tl_getUniqueGiftChatThemes.hash = u1Var2.f18062a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f10.getConnectionsManager();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f21981s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.x3(0, f10, soVar));
        }
    }

    public final void R0(ArrayList arrayList) {
        ig.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        uo uoVar = new uo((org.telegram.ui.ActionBar.s3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            org.telegram.ui.ActionBar.s3 s3Var = this.f39068r1.f43729f;
            this.P1 = s3Var;
            if (s3Var != null) {
                s3Var.k();
            }
        }
        arrayList2.add(0, uoVar);
        if (!this.O1) {
            this.F1 = uoVar;
        }
        org.telegram.ui.ActionBar.s3 s3Var2 = this.P1;
        if (s3Var2 != null) {
            bVar = s3Var2.f28487c;
        } else {
            bVar = null;
        }
        boolean z9 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.s3 s3Var3 = (org.telegram.ui.ActionBar.s3) arrayList.get(i7);
            uo uoVar2 = new uo(s3Var3);
            s3Var3.m(this.f28669a);
            uoVar2.f38727c = this.G1 ? 1 : 0;
            if (ig.b.a(s3Var3.f28487c, bVar)) {
                arrayList2.add(1, uoVar2);
                z9 = true;
            } else {
                arrayList2.add(uoVar2);
            }
            i7++;
            z9 = z9;
        }
        org.telegram.ui.ActionBar.s3 s3Var4 = this.P1;
        if (s3Var4 != null && !z9) {
            uo uoVar3 = new uo(s3Var4);
            s3Var4.m(this.f28669a);
            uoVar3.f38727c = this.G1 ? 1 : 0;
            arrayList2.add(1, uoVar3);
        }
        to toVar = this.f39067q1;
        toVar.d = arrayList2;
        toVar.f();
        this.f39076z1.setVisibility(0);
        if (!this.O1) {
            T0(false);
            this.f39072v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        Z0(true);
    }

    public final void S0() {
        TLRPC.WallPaper wallPaper;
        if (!this.I && !this.H1) {
            this.I1 = false;
            this.f39071u1.getClass();
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f39066p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.s3 s3Var = this.F1.f38725a;
            if (s3Var.f28485a) {
                this.f39068r1.r(null, wallPaper2, true, Boolean.valueOf(this.G1), false);
                return;
            }
            this.f39068r1.r(s3Var, wallPaper2, true, Boolean.valueOf(this.G1), false);
        }
    }

    public final void T0(boolean z9) {
        to toVar = this.f39067q1;
        ArrayList arrayList = toVar.d;
        org.telegram.ui.ActionBar.s3 s3Var = this.P1;
        v4.b0 b0Var = this.f39073w1;
        pj0 pj0Var = this.f39072v1;
        if (s3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 != arrayList.size()) {
                    if (ig.b.a(((uo) arrayList.get(i7)).f38725a.f28487c, this.P1.f28487c)) {
                        this.F1 = (uo) arrayList.get(i7);
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                this.J1 = i7;
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
            this.F1 = (uo) arrayList.get(0);
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
        ho hoVar = new ho(this);
        ArrayList arrayList = new ArrayList();
        if (this.f39071u1.f44683u7) {
            org.telegram.ui.ActionBar.f2 f2Var = this.Q1;
            if (f2Var instanceof x71) {
                arrayList.addAll(((x71) f2Var).X0());
                return arrayList;
            }
        }
        ci ciVar = this.R1;
        if (ciVar != null) {
            arrayList.addAll(ciVar.U());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f28702r0}, hoVar, org.telegram.ui.ActionBar.m6.f27963h5));
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        View view = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ei));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.v6) obj).f28639n = this.f39068r1;
        }
        return arrayList;
    }

    public final void U0(boolean z9, boolean z10) {
        int i7;
        if (this.G1 != z9) {
            this.G1 = z9;
            org.telegram.ui.yc ycVar = this.f39076z1;
            zg0 zg0Var = this.f39075y1;
            int i10 = 0;
            if (z10) {
                if (z9) {
                    i10 = zg0Var.f40968e[0];
                }
                zg0Var.P(i10);
                if (ycVar != null) {
                    ycVar.d();
                    return;
                }
                return;
            }
            if (z9) {
                i7 = zg0Var.f40968e[0] - 1;
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

    public final void X0(org.telegram.ui.ActionBar.l6 l6Var) {
        if (l6Var != null && l6Var != org.telegram.ui.ActionBar.m6.I) {
            this.f39061b2 = true;
            try {
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25085t4, l6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f39061b2 = false;
            }
        }
    }

    public final void Y0() {
        TextView textView = this.f39065o1;
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28109p5, this.I0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.m6.Ci;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i7, this.I0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i7, 76);
            org.telegram.ui.ActionBar.h6 h6Var = this.I0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.t6.j(textView, k02, null, g10, h6Var);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.m6.f28111p7;
            org.telegram.ui.ActionBar.t6.U(textView2, i10, this.I0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i10, 76);
            org.telegram.ui.ActionBar.h6 h6Var2 = this.I0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.t6.j(textView2, k03, null, g11, h6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i11, this.I0), 30), 1, -1);
        org.telegram.ui.ActionBar.p6 g12 = org.telegram.ui.ActionBar.t6.g(i11, 30);
        org.telegram.ui.ActionBar.h6 h6Var3 = this.I0;
        ImageView imageView = this.l1;
        org.telegram.ui.ActionBar.t6.Q(imageView, h02, null, g12, h6Var3);
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
        org.telegram.ui.ActionBar.y1 y1Var = this.f39064m1;
        y1Var.a(w02);
        y1Var.b(org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.Q(this.f39076z1, org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 30), 1, -1), null, org.telegram.ui.ActionBar.t6.g(i12, 30), this.I0);
        int i13 = org.telegram.ui.ActionBar.m6.f28054m5;
        org.telegram.ui.ActionBar.h6 h6Var4 = this.I0;
        TextView textView3 = this.E1;
        org.telegram.ui.ActionBar.t6.U(textView3, i13, h6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 76);
        org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.t6.g(i12, 76), this.I0);
    }

    public final void Z0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.Z0(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            org.telegram.messenger.qs.f(this.f28669a).d(new co(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        xz0 xz0Var;
        org.telegram.ui.ActionBar.l6 J0;
        boolean z9;
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
        super.dismiss();
        this.f39071u1.getClass();
        boolean z10 = this.H1;
        boolean z11 = this.f39070t1;
        if (!z10 && this.G1 != z11) {
            xz0Var = L0();
        } else {
            xz0Var = null;
        }
        if (!this.H1) {
            org.telegram.ui.an anVar = this.f39068r1;
            TLRPC.WallPaper wallPaper = anVar.f43730g;
            if (wallPaper == null) {
                wallPaper = this.f39066p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (xz0Var == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            anVar.r(this.f39069s1, wallPaper2, z9, Boolean.valueOf(z11), false);
        }
        if (this.G1 != z11) {
            if (org.telegram.ui.ActionBar.m6.I.q() == z11) {
                J0 = org.telegram.ui.ActionBar.m6.I;
            } else {
                J0 = J0(z11);
            }
            if (this.f39062c2) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.m6.u(J0, false, z11);
            }
        }
        this.f39062c2 = false;
        W0(xz0Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f28672b.getTop() && x10 >= this.f28672b.getLeft() && x10 <= this.f28672b.getRight()) {
            return false;
        }
        this.f39071u1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void g0(float f10) {
        y20 y20Var = this.N1;
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
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f28669a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
        this.H1 = false;
        if (f10.f21987f.f18064c && (arrayList = f10.f21984b) != null && !arrayList.isEmpty()) {
            R0(f10.e(7));
        } else {
            Q0();
        }
        if (this.f39071u1.j() != null && org.telegram.messenger.iz.f23402e1 > 0 && !this.f39071u1.j().self) {
            org.telegram.messenger.iz.f23402e1--;
            org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.iz.f23402e1).apply();
            y20 y20Var = new y20(9, getContext(), this.f39071u1.getResourceProvider(), false);
            this.N1 = y20Var;
            y20Var.setVisibility(4);
            this.N1.setShowingDuration(5000L);
            this.N1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
            if (this.G1) {
                this.N1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
            } else {
                this.N1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
            }
            org.telegram.messenger.g0.i3(new co(this, 7), 1500L);
            this.f28675c.addView(this.N1, c8.ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.F0 == -1 && this.G0 != (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27981i5, this.I0))) {
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

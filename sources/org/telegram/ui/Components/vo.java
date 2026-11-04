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
import org.telegram.ui.l71;
public final class vo extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final int f39181d2 = 0;
    public final h6 A1;
    public final h6 B1;
    public final TextView C1;
    public uo D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public wz0 I1;
    public float J1;
    public ValueAnimator K1;
    public u20 L1;
    public boolean M1;
    public org.telegram.ui.ActionBar.p3 N1;
    public org.telegram.ui.ActionBar.d2 O1;
    public bi P1;
    public ai.c0 Q1;
    public h6 R1;
    public boolean S1;
    public wp T1;
    public boolean U1;
    public boolean V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public float X1;
    public ValueAnimator Y1;
    public boolean Z1;
    public boolean f39182a2;
    public int f39183b2;
    public int c2;
    public final ImageView f39184j1;
    public final org.telegram.ui.ActionBar.w1 k1;
    public final TextView f39185l1;
    public final TextView m1;
    public TLRPC.WallPaper f39186n1;
    public final to f39187o1;
    public final org.telegram.ui.um f39188p1;
    public final org.telegram.ui.ActionBar.p3 f39189q1;
    public final boolean f39190r1;
    public final org.telegram.ui.wm f39191s1;
    public final tj0 f39192t1;
    public final u4.b0 f39193u1;
    public final iz f39194v1;
    public final ch0 f39195w1;
    public final org.telegram.ui.xc f39196x1;
    public final qo f39197y1;
    public final View f39198z1;

    public vo(org.telegram.ui.wm wmVar, org.telegram.ui.um umVar) {
        super(1, (Context) wmVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) umVar, true);
        String str;
        boolean z10;
        this.H1 = -1;
        this.U1 = false;
        this.V1 = false;
        this.X1 = 0.0f;
        this.f39191s1 = wmVar;
        this.f39188p1 = umVar;
        this.f39189q1 = umVar.f50124f;
        this.f39186n1 = umVar.f50125g;
        this.f39190r1 = org.telegram.ui.ActionBar.k6.I.q();
        to toVar = new to(this.f28583a, wmVar.a(), umVar, 0);
        this.f39187o1 = toVar;
        this.f28611p0 = false;
        this.f28590c0 = false;
        this.f28621w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i3 = org.telegram.ui.ActionBar.k6.f27971i5;
            this.H0 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(i3, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        } else {
            P(org.telegram.ui.ActionBar.k6.f27971i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.bd.M0(2131745661, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27988j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f39184j1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.k1 = w1Var;
        imageView.setImageDrawable(w1Var);
        imageView.setOnClickListener(new eo(this, 1));
        frameLayout.addView(imageView, b8.mf.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        ch0 ch0Var = new ch0(2131624240, L2, L2, false, null);
        this.f39195w1 = ch0Var;
        this.E1 = !org.telegram.ui.ActionBar.k6.I.q();
        U0(org.telegram.ui.ActionBar.k6.I.q(), false);
        ch0Var.J(true);
        ch0Var.h = true;
        this.f39183b2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.f39196x1 = xcVar;
        xcVar.setAnimation(ch0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new eo(this, 2));
        frameLayout.addView(xcVar, b8.mf.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.f39197y1 = new u4.c0(getContext());
        tj0 tj0Var = new tj0(getContext(), null);
        this.f39192t1 = tj0Var;
        tj0Var.setAdapter(toVar);
        tj0Var.setDrawSelection(false);
        tj0Var.setClipChildren(false);
        tj0Var.setClipToPadding(false);
        tj0Var.setHasFixedSize(true);
        tj0Var.setItemAnimator(null);
        tj0Var.setNestedScrollingEnabled(false);
        getContext();
        u4.b0 b0Var = new u4.b0(0, false);
        this.f39193u1 = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        tj0Var.setOnItemClickListener(new k(this, 3));
        tj0Var.setOnScrollListener(new ji(this, 7));
        iz izVar = new iz(getContext(), this.J0);
        this.f39194v1 = izVar;
        izVar.setViewType(14);
        izVar.setVisibility(0);
        frameLayout.addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(tj0Var, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.f39198z1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, e6Var);
        view.setOnClickListener(new eo(this, 3));
        frameLayout.addView(view, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.C1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f39186n1 == null) {
            textView2.setText(org.telegram.messenger.bd.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.bd.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var = new h6(getContext(), true, true, true);
        this.A1 = h6Var;
        h6Var.getDrawable().q(true);
        h6Var.f34310n = false;
        h6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i12, this.J0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(h6Var, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var2 = new h6(getContext(), true, true, true);
        this.B1 = h6Var2;
        h6Var2.getDrawable().q(true);
        h6Var2.f34310n = false;
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i12, this.J0);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        h6Var2.setAlpha(0.0f);
        h6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(h6Var2, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f39186n1 != null) {
            TextView textView3 = new TextView(getContext());
            this.f39185l1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.bd.M0(2131746095, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new q2(9, this, wmVar));
            frameLayout.addView(textView3, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.m1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (wmVar.j() != null) {
                str = org.telegram.messenger.l10.j(wmVar.j(), true);
            } else {
                TLRPC.Chat chat = wmVar.f51292e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.bd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(vo voVar, l71 l71Var) {
        ?? obj = new Object();
        obj.f27395a = true;
        org.telegram.ui.wm wmVar = voVar.f39191s1;
        l71Var.f47141a.f47115a = wmVar.getResourceProvider();
        l71Var.f47191r1 = new po(voVar);
        obj.f27397c = new go(1);
        obj.d = new co(voVar, 5);
        obj.f27396b = new co(voVar, 6);
        obj.f27398e = true;
        voVar.O1 = l71Var;
        wmVar.showAsSheet(l71Var, obj);
    }

    public static org.telegram.ui.ActionBar.j6 J0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0);
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
        if (z10) {
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wz0Var, wz0.f40173x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ks.f35477e);
        ofFloat.addListener(new x5(wz0Var, 17));
        ofFloat.start();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27971i5));
    }

    public final void K0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.K0(boolean):void");
    }

    public final org.telegram.ui.Components.wz0 L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.L0():org.telegram.ui.Components.wz0");
    }

    public final void M0() {
        if (P0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = org.telegram.messenger.bd.M0(2131752196, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131752197, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752199, null), new org.telegram.ui.ActionBar.p1(this) {
                public final vo f34463b;

                {
                    this.f34463b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                    switch (r2) {
                        case 0:
                            this.f34463b.K0(false);
                            return;
                        default:
                            this.f34463b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752198, null), new org.telegram.ui.ActionBar.p1(this) {
                public final vo f34463b;

                {
                    this.f34463b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                    switch (r2) {
                        case 0:
                            this.f34463b.K0(false);
                            return;
                        default:
                            this.f34463b.dismiss();
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0);
            ch0 ch0Var = this.f39195w1;
            if (ch0Var != null && w02 != this.f39183b2) {
                this.f39183b2 = w02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.w1 w1Var = this.k1;
            if (w1Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
                w1Var.a(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
                w1Var.b(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
                ImageView imageView = this.f39184j1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
            if (w03 != this.c2) {
                this.c2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.F1) {
            org.telegram.ui.ActionBar.k6.f27835b = false;
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f39188p1.f50125g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.p3 p3Var = this.D1.f38832a;
            if (p3Var.f28419a) {
                this.f39188p1.r(null, wallPaper2, false, Boolean.valueOf(this.E1), true);
            } else {
                this.f39188p1.r(p3Var, wallPaper2, false, Boolean.valueOf(this.E1), true);
            }
            bi biVar = this.P1;
            if (biVar != null) {
                qi qiVar = biVar.f32238j2;
                if (qiVar != null) {
                    boolean z10 = this.E1;
                    ka kaVar = qiVar.f37467w;
                    ((ArrayList) kaVar.f35356e).clear();
                    WallpapersListActivity.E0((ArrayList) kaVar.f35356e, z10);
                    kaVar.f();
                }
                this.P1.P0();
            }
            to toVar = this.f39187o1;
            if (toVar != null && toVar.d != null) {
                for (int i3 = 0; i3 < toVar.d.size(); i3++) {
                    ((uo) toVar.d.get(i3)).f38834c = this.E1 ? 1 : 0;
                }
                toVar.f();
            }
        }
    }

    public final boolean P0() {
        jg.b bVar;
        if (this.D1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p3 p3Var = this.N1;
        jg.b bVar2 = null;
        if (p3Var != null) {
            bVar = p3Var.f28421c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = jg.b.d("❌");
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.D1.f38832a;
        if (p3Var2 != null) {
            bVar2 = p3Var2.f28421c;
        }
        if (bVar2 == null) {
            bVar2 = jg.b.d("❌");
        }
        return !jg.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (!this.S1) {
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f28583a);
            if (f10.f22144f.f16749c && (arrayList = f10.f22141b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z10 = true;
            this.S1 = true;
            if (f10.f22144f.f16749c) {
                f10.q(new ro(this, f10), false);
                return;
            }
            so soVar = new so(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            k2.u1 u1Var = f10.f22144f;
            if (currentTimeMillis - u1Var.f16748b <= 7200000) {
                z10 = false;
            }
            if (((ArrayList) u1Var.d) != null && u1Var.f16749c && !z10) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            k2.u1 u1Var2 = f10.f22144f;
            tl_getUniqueGiftChatThemes.offset = (String) u1Var2.f16750e;
            tl_getUniqueGiftChatThemes.hash = u1Var2.f16747a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f10.getConnectionsManager();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.f22138s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.x3(0, f10, soVar));
        }
    }

    public final void R0(ArrayList arrayList) {
        jg.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        uo uoVar = new uo((org.telegram.ui.ActionBar.p3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.M1) {
            org.telegram.ui.ActionBar.p3 p3Var = this.f39188p1.f50124f;
            this.N1 = p3Var;
            if (p3Var != null) {
                p3Var.k();
            }
        }
        arrayList2.add(0, uoVar);
        if (!this.M1) {
            this.D1 = uoVar;
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.N1;
        if (p3Var2 != null) {
            bVar = p3Var2.f28421c;
        } else {
            bVar = null;
        }
        boolean z10 = false;
        int i3 = 1;
        while (i3 < arrayList.size()) {
            org.telegram.ui.ActionBar.p3 p3Var3 = (org.telegram.ui.ActionBar.p3) arrayList.get(i3);
            uo uoVar2 = new uo(p3Var3);
            p3Var3.m(this.f28583a);
            uoVar2.f38834c = this.E1 ? 1 : 0;
            if (jg.b.a(p3Var3.f28421c, bVar)) {
                arrayList2.add(1, uoVar2);
                z10 = true;
            } else {
                arrayList2.add(uoVar2);
            }
            i3++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.p3 p3Var4 = this.N1;
        if (p3Var4 != null && !z10) {
            uo uoVar3 = new uo(p3Var4);
            p3Var4.m(this.f28583a);
            uoVar3.f38834c = this.E1 ? 1 : 0;
            arrayList2.add(1, uoVar3);
        }
        to toVar = this.f39187o1;
        toVar.d = arrayList2;
        toVar.f();
        this.f39196x1.setVisibility(0);
        if (!this.M1) {
            T0(false);
            this.f39192t1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.M1 = true;
        Z0(true);
    }

    public final void S0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.F1) {
            this.G1 = false;
            this.f39191s1.getClass();
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f39186n1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.p3 p3Var = this.D1.f38832a;
            if (p3Var.f28419a) {
                this.f39188p1.r(null, wallPaper2, true, Boolean.valueOf(this.E1), false);
                return;
            }
            this.f39188p1.r(p3Var, wallPaper2, true, Boolean.valueOf(this.E1), false);
        }
    }

    public final void T0(boolean z10) {
        to toVar = this.f39187o1;
        ArrayList arrayList = toVar.d;
        org.telegram.ui.ActionBar.p3 p3Var = this.N1;
        u4.b0 b0Var = this.f39193u1;
        tj0 tj0Var = this.f39192t1;
        if (p3Var != null) {
            int i3 = 0;
            while (true) {
                if (i3 != arrayList.size()) {
                    if (jg.b.a(((uo) arrayList.get(i3)).f38832a.f28421c, this.N1.f28421c)) {
                        this.D1 = (uo) arrayList.get(i3);
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 != -1) {
                this.H1 = i3;
                toVar.E(i3);
                if (i3 > 0 && i3 < arrayList.size() / 2) {
                    i3--;
                }
                int min = Math.min(i3, toVar.d.size() - 1);
                if (z10) {
                    tj0Var.y0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.D1 = (uo) arrayList.get(0);
            toVar.E(0);
            if (z10) {
                tj0Var.y0(0);
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
        if (this.f39191s1.f51514v7) {
            org.telegram.ui.ActionBar.d2 d2Var = this.O1;
            if (d2Var instanceof l71) {
                arrayList.addAll(((l71) d2Var).X0());
                return arrayList;
            }
        }
        bi biVar = this.P1;
        if (biVar != null) {
            arrayList.addAll(biVar.U());
        }
        int i3 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f28616s0}, ioVar, org.telegram.ui.ActionBar.k6.f27954h5));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        View view = this.f39198z1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.ActionBar.t6) obj).f28667n = this.f39188p1;
        }
        return arrayList;
    }

    public final void U0(boolean z10, boolean z11) {
        int i3;
        if (this.E1 != z10) {
            this.E1 = z10;
            org.telegram.ui.xc xcVar = this.f39196x1;
            ch0 ch0Var = this.f39195w1;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    i10 = ch0Var.f32725e[0];
                }
                ch0Var.P(i10);
                if (xcVar != null) {
                    xcVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i3 = ch0Var.f32725e[0] - 1;
            } else {
                i3 = 0;
            }
            ch0Var.N(i3, false, true);
            ch0Var.P(i3);
            if (xcVar != null) {
                xcVar.invalidate();
            }
        }
    }

    public final void V0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.V0(boolean):void");
    }

    public final void X0(org.telegram.ui.ActionBar.j6 j6Var) {
        if (j6Var != null && j6Var != org.telegram.ui.ActionBar.k6.I) {
            this.Z1 = true;
            try {
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23310t4, j6Var, Boolean.FALSE, null, -1);
            } finally {
                this.Z1 = false;
            }
        }
    }

    public final void Y0() {
        TextView textView = this.m1;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28100p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i3, 76);
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.r6.k(textView, k02, null, h, e6Var);
        }
        TextView textView2 = this.f39185l1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
            org.telegram.ui.ActionBar.r6.V(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o11, o11);
            org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i10, 76);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.r6.k(textView2, k03, null, h7, e6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i11, 30);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        ImageView imageView = this.f39184j1;
        org.telegram.ui.ActionBar.r6.R(imageView, h02, null, h10, e6Var3);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.w1 w1Var = this.k1;
        w1Var.a(w02);
        w1Var.b(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.R(this.f39196x1, org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.r6.h(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.k6.f28042m5;
        org.telegram.ui.ActionBar.e6 e6Var4 = this.J0;
        TextView textView3 = this.C1;
        org.telegram.ui.ActionBar.r6.V(textView3, i13, e6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o12 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o12, o12), null, org.telegram.ui.ActionBar.r6.h(i12, 76), this.J0);
    }

    public final void Z0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo.Z0(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.messenger.hs.f(this.f28583a).d(new co(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        wz0 wz0Var;
        org.telegram.ui.ActionBar.j6 J0;
        boolean z10;
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        super.dismiss();
        this.f39191s1.getClass();
        boolean z11 = this.F1;
        boolean z12 = this.f39190r1;
        if (!z11 && this.E1 != z12) {
            wz0Var = L0();
        } else {
            wz0Var = null;
        }
        if (!this.F1) {
            org.telegram.ui.um umVar = this.f39188p1;
            TLRPC.WallPaper wallPaper = umVar.f50125g;
            if (wallPaper == null) {
                wallPaper = this.f39186n1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (wz0Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            umVar.r(this.f39189q1, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.E1 != z12) {
            if (org.telegram.ui.ActionBar.k6.I.q() == z12) {
                J0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                J0 = J0(z12);
            }
            if (this.f39182a2) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.k6.u(J0, false, z12);
            }
        }
        this.f39182a2 = false;
        W0(wz0Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f28586b.getTop() && x10 >= this.f28586b.getLeft() && x10 <= this.f28586b.getRight()) {
            return false;
        }
        this.f39191s1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void g0(float f10) {
        u20 u20Var = this.L1;
        if (u20Var != null) {
            u20Var.a();
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
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.f28583a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        this.F1 = false;
        if (f10.f22144f.f16749c && (arrayList = f10.f22141b) != null && !arrayList.isEmpty()) {
            R0(f10.e(7));
        } else {
            Q0();
        }
        if (this.f39191s1.j() != null && org.telegram.messenger.az.f21625e1 > 0 && !this.f39191s1.j().self) {
            org.telegram.messenger.az.f21625e1--;
            org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.az.f21625e1).apply();
            u20 u20Var = new u20(9, getContext(), this.f39191s1.getResourceProvider(), false);
            this.L1 = u20Var;
            u20Var.setVisibility(4);
            this.L1.setShowingDuration(5000L);
            this.L1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
            if (this.E1) {
                this.L1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
            } else {
                this.L1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
            }
            org.telegram.messenger.g0.i3(new co(this, 7), 1500L);
            this.f28589c.addView(this.L1, b8.mf.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, this.J0))) {
                this.H0 = w02;
                boolean z10 = false;
                org.telegram.messenger.g0.u3(this, w02, false, null);
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

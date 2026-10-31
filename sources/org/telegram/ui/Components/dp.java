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
import org.telegram.ui.m91;
public final class dp extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final int f25481c2 = 0;
    public final f6 A1;
    public final TextView B1;
    public cp C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public b11 H1;
    public float I1;
    public ValueAnimator J1;
    public q30 K1;
    public boolean L1;
    public org.telegram.ui.ActionBar.y3 M1;
    public org.telegram.ui.ActionBar.k2 N1;
    public bi O1;
    public fg.i P1;
    public f6 Q1;
    public boolean R1;
    public dq S1;
    public boolean T1;
    public boolean U1;
    public TL_stories.TL_premium_boostsStatus V1;
    public float W1;
    public ValueAnimator X1;
    public boolean Y1;
    public boolean Z1;
    public int a2;
    public int f25482b2;
    public final ImageView f25483i1;
    public final org.telegram.ui.ActionBar.c2 f25484j1;
    public final TextView f25485k1;
    public final TextView l1;
    public TLRPC.WallPaper f25486m1;
    public final bp f25487n1;
    public final org.telegram.ui.sn f25488o1;
    public final org.telegram.ui.ActionBar.y3 f25489p1;
    public final boolean f25490q1;
    public final org.telegram.ui.un f25491r1;
    public final tk0 f25492s1;
    public final s4.a0 f25493t1;
    public final zz f25494u1;
    public final bi0 f25495v1;
    public final org.telegram.ui.hd f25496w1;
    public final yo f25497x1;
    public final View f25498y1;
    public final f6 f25499z1;

    public dp(org.telegram.ui.un unVar, org.telegram.ui.sn snVar) {
        super(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.p6) snVar, true);
        String str;
        boolean z10;
        this.G1 = -1;
        this.T1 = false;
        this.U1 = false;
        this.W1 = 0.0f;
        this.f25491r1 = unVar;
        this.f25488o1 = snVar;
        this.f25489p1 = snVar.f41590f;
        this.f25486m1 = snVar.f41591g;
        this.f25490q1 = org.telegram.ui.ActionBar.t6.I.q();
        bp bpVar = new bp(this.f21583a, unVar.a(), snVar, 0);
        this.f25487n1 = bpVar;
        this.f21608o0 = false;
        this.f21587b0 = false;
        this.f21617v0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int i10 = org.telegram.ui.ActionBar.t6.f21019i5;
            this.G0 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
            org.telegram.messenger.i0.t3(this, org.telegram.ui.ActionBar.t6.w0(i10, this.I0), false, null);
            if (org.telegram.messenger.i0.B(this.G0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.i0.m3(this, z10);
        } else {
            Q(org.telegram.ui.ActionBar.t6.f21019i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.N = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.cd.L0(2131745668, null));
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21037j5, this.I0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f25483i1 = imageView;
        int L = org.telegram.messenger.i0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.f25484j1 = c2Var;
        imageView.setImageDrawable(c2Var);
        imageView.setOnClickListener(new no(this, 1));
        frameLayout.addView(imageView, w7.b6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
        int L2 = org.telegram.messenger.i0.L(28.0f);
        bi0 bi0Var = new bi0(2131624238, L2, L2, false, null);
        this.f25495v1 = bi0Var;
        this.D1 = !org.telegram.ui.ActionBar.t6.I.q();
        U0(org.telegram.ui.ActionBar.t6.I.q(), false);
        bi0Var.J(true);
        bi0Var.h = true;
        this.a2 = w02;
        bi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(this, getContext(), 1);
        this.f25496w1 = hdVar;
        hdVar.setAnimation(bi0Var);
        hdVar.setScaleType(ImageView.ScaleType.CENTER);
        hdVar.setOnClickListener(new no(this, 2));
        frameLayout.addView(hdVar, w7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.f25497x1 = new s4.b0(getContext());
        tk0 tk0Var = new tk0(getContext(), null);
        this.f25492s1 = tk0Var;
        tk0Var.setAdapter(bpVar);
        tk0Var.setDrawSelection(false);
        tk0Var.setClipChildren(false);
        tk0Var.setClipToPadding(false);
        tk0Var.setHasFixedSize(true);
        tk0Var.setItemAnimator(null);
        tk0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.a0 a0Var = new s4.a0(0, false);
        this.f25493t1 = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        tk0Var.setOnItemClickListener(new k(this, 3));
        tk0Var.setOnScrollListener(new ag.u(this, 20));
        zz zzVar = new zz(getContext(), this.I0);
        this.f25494u1 = zzVar;
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(tk0Var, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.f25498y1 = view;
        int L3 = org.telegram.messenger.i0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
        int i12 = org.telegram.ui.ActionBar.t6.Ei;
        int w04 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
        Drawable k02 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(view, k02, N, N2, p6Var);
        view.setOnClickListener(new no(this, 3));
        frameLayout.addView(view, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.B1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f25486m1 == null) {
            textView2.setText(org.telegram.messenger.cd.L0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.cd.L0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        f6 f6Var = new f6(getContext(), true, true, true);
        this.f25499z1 = f6Var;
        f6Var.getDrawable().q(true);
        f6Var.f25986n = false;
        f6Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.t6.Gi;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i13, this.I0);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(f6Var, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        f6 f6Var2 = new f6(getContext(), true, true, true);
        this.A1 = f6Var2;
        f6Var2.getDrawable().q(true);
        f6Var2.f25986n = false;
        f6Var2.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, this.I0);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        f6Var2.setAlpha(0.0f);
        f6Var2.setTranslationY(org.telegram.messenger.i0.L(11.0f));
        frameLayout.addView(f6Var2, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f25486m1 != null) {
            TextView textView3 = new TextView(getContext());
            this.f25485k1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.cd.L0(2131746102, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.ud(26, this, unVar));
            frameLayout.addView(textView3, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.l1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (unVar.j() != null) {
                str = org.telegram.messenger.h20.j(unVar.j(), true);
            } else {
                TLRPC.Chat chat = unVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(org.telegram.messenger.cd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(dp dpVar, m91 m91Var) {
        ?? obj = new Object();
        obj.f20389a = true;
        org.telegram.ui.un unVar = dpVar.f25491r1;
        m91Var.f39537a.f39868a = unVar.getResourceProvider();
        m91Var.f39583q1 = new xo(dpVar);
        obj.f20391c = new org.telegram.messenger.rz(18);
        obj.d = new mo(dpVar, 5);
        obj.f20390b = new mo(dpVar, 6);
        obj.e = true;
        dpVar.N1 = m91Var;
        unVar.showAsSheet(m91Var, obj);
    }

    public static org.telegram.ui.ActionBar.s6 J0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string) != null && !org.telegram.ui.ActionBar.t6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string2) != null && org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
            str2 = string2;
        }
        if (z10) {
            return org.telegram.ui.ActionBar.t6.Q0(str2);
        }
        return org.telegram.ui.ActionBar.t6.Q0(str);
    }

    public static void W0(b11 b11Var) {
        if (b11Var == null) {
            return;
        }
        float width = b11Var.getWidth() / 2.0f;
        float max = Math.max(width, b11Var.getWidth() - width);
        float max2 = Math.max(0.0f, b11Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b11Var, b11.f24494x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(vs.e);
        ofFloat.addListener(new w5(b11Var, 17));
        ofFloat.start();
    }

    @Override
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21019i5));
    }

    public final void K0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dp.K0(boolean):void");
    }

    public final org.telegram.ui.Components.b11 L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dp.L0():org.telegram.ui.Components.b11");
    }

    public final void M0() {
        if (P0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String L0 = org.telegram.messenger.cd.L0(2131752196, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131752197, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752199, null), new org.telegram.ui.ActionBar.u1(this) {
                public final dp f29393b;

                {
                    this.f29393b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29393b.K0(false);
                            return;
                        default:
                            this.f29393b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752198, null), new org.telegram.ui.ActionBar.u1(this) {
                public final dp f29393b;

                {
                    this.f29393b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29393b.K0(false);
                            return;
                        default:
                            this.f29393b.dismiss();
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
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0);
            bi0 bi0Var = this.f25495v1;
            if (bi0Var != null && w02 != this.a2) {
                this.a2 = w02;
                bi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.f25484j1;
            if (c2Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
                c2Var.a(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
                c2Var.b(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
                ImageView imageView = this.f25483i1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0);
            if (w03 != this.f25482b2) {
                this.f25482b2 = w03;
                v0(w03);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void O0() {
        TLRPC.WallPaper wallPaper;
        if (!this.I && !this.E1) {
            org.telegram.ui.ActionBar.t6.f20884b = false;
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f25488o1.f41591g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.y3 y3Var = this.C1.f25123a;
            if (y3Var.f21558a) {
                this.f25488o1.r(null, wallPaper2, false, Boolean.valueOf(this.D1), true);
            } else {
                this.f25488o1.r(y3Var, wallPaper2, false, Boolean.valueOf(this.D1), true);
            }
            bi biVar = this.O1;
            if (biVar != null) {
                qi qiVar = biVar.f24683i2;
                if (qiVar != null) {
                    boolean z10 = this.D1;
                    fa faVar = qiVar.f29662w;
                    ((ArrayList) faVar.e).clear();
                    WallpapersListActivity.D0((ArrayList) faVar.e, z10);
                    faVar.f();
                }
                this.O1.P0();
            }
            bp bpVar = this.f25487n1;
            if (bpVar != null && bpVar.d != null) {
                for (int i10 = 0; i10 < bpVar.d.size(); i10++) {
                    ((cp) bpVar.d.get(i10)).f25125c = this.D1 ? 1 : 0;
                }
                bpVar.f();
            }
        }
    }

    public final boolean P0() {
        yf.b bVar;
        if (this.C1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.y3 y3Var = this.M1;
        yf.b bVar2 = null;
        if (y3Var != null) {
            bVar = y3Var.f21560c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = yf.b.d("❌");
        }
        org.telegram.ui.ActionBar.y3 y3Var2 = this.C1.f25123a;
        if (y3Var2 != null) {
            bVar2 = y3Var2.f21560c;
        }
        if (bVar2 == null) {
            bVar2 = yf.b.d("❌");
        }
        return !yf.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (!this.R1) {
            org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.f21583a);
            if (f7.f15673f.f8112c && (arrayList = f7.f15671b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z10 = true;
            this.R1 = true;
            if (f7.f15673f.f8112c) {
                f7.q(new zo(this, f7), false);
                return;
            }
            ap apVar = new ap(this, f7);
            long currentTimeMillis = System.currentTimeMillis();
            i2.w1 w1Var = f7.f15673f;
            if (currentTimeMillis - w1Var.f8111b <= 7200000) {
                z10 = false;
            }
            if (((ArrayList) w1Var.d) != null && w1Var.f8112c && !z10) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            i2.w1 w1Var2 = f7.f15673f;
            tl_getUniqueGiftChatThemes.offset = (String) w1Var2.e;
            tl_getUniqueGiftChatThemes.hash = w1Var2.f8110a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = f7.getConnectionsManager();
            org.telegram.messenger.r5 r5Var = org.telegram.messenger.g4.f15668s;
            Objects.requireNonNull(r5Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.y3(r5Var), new org.telegram.messenger.a4(0, f7, apVar));
        }
    }

    public final void R0(ArrayList arrayList) {
        yf.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        cp cpVar = new cp((org.telegram.ui.ActionBar.y3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.L1) {
            org.telegram.ui.ActionBar.y3 y3Var = this.f25488o1.f41590f;
            this.M1 = y3Var;
            if (y3Var != null) {
                y3Var.k();
            }
        }
        arrayList2.add(0, cpVar);
        if (!this.L1) {
            this.C1 = cpVar;
        }
        org.telegram.ui.ActionBar.y3 y3Var2 = this.M1;
        if (y3Var2 != null) {
            bVar = y3Var2.f21560c;
        } else {
            bVar = null;
        }
        boolean z10 = false;
        int i10 = 1;
        while (i10 < arrayList.size()) {
            org.telegram.ui.ActionBar.y3 y3Var3 = (org.telegram.ui.ActionBar.y3) arrayList.get(i10);
            cp cpVar2 = new cp(y3Var3);
            y3Var3.m(this.f21583a);
            cpVar2.f25125c = this.D1 ? 1 : 0;
            if (yf.b.a(y3Var3.f21560c, bVar)) {
                arrayList2.add(1, cpVar2);
                z10 = true;
            } else {
                arrayList2.add(cpVar2);
            }
            i10++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.y3 y3Var4 = this.M1;
        if (y3Var4 != null && !z10) {
            cp cpVar3 = new cp(y3Var4);
            y3Var4.m(this.f21583a);
            cpVar3.f25125c = this.D1 ? 1 : 0;
            arrayList2.add(1, cpVar3);
        }
        bp bpVar = this.f25487n1;
        bpVar.d = arrayList2;
        bpVar.f();
        this.f25496w1.setVisibility(0);
        if (!this.L1) {
            T0(false);
            this.f25492s1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.L1 = true;
        Z0(true);
    }

    public final void S0() {
        TLRPC.WallPaper wallPaper;
        if (!this.I && !this.E1) {
            this.F1 = false;
            this.f25491r1.getClass();
            if (P0()) {
                wallPaper = null;
            } else {
                wallPaper = this.f25486m1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.y3 y3Var = this.C1.f25123a;
            if (y3Var.f21558a) {
                this.f25488o1.r(null, wallPaper2, true, Boolean.valueOf(this.D1), false);
                return;
            }
            this.f25488o1.r(y3Var, wallPaper2, true, Boolean.valueOf(this.D1), false);
        }
    }

    public final void T0(boolean z10) {
        bp bpVar = this.f25487n1;
        ArrayList arrayList = bpVar.d;
        org.telegram.ui.ActionBar.y3 y3Var = this.M1;
        s4.a0 a0Var = this.f25493t1;
        tk0 tk0Var = this.f25492s1;
        if (y3Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (yf.b.a(((cp) arrayList.get(i10)).f25123a.f21560c, this.M1.f21560c)) {
                        this.C1 = (cp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                this.G1 = i10;
                bpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, bpVar.d.size() - 1);
                if (z10) {
                    tk0Var.y0(min);
                } else {
                    a0Var.h1(min, 0);
                }
            }
        } else {
            this.C1 = (cp) arrayList.get(0);
            bpVar.E(0);
            if (z10) {
                tk0Var.y0(0);
            } else {
                a0Var.h1(0, 0);
            }
        }
        S0();
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.D1 != z10) {
            this.D1 = z10;
            org.telegram.ui.hd hdVar = this.f25496w1;
            bi0 bi0Var = this.f25495v1;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = bi0Var.e[0];
                }
                bi0Var.P(i11);
                if (hdVar != null) {
                    hdVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = bi0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            bi0Var.N(i10, false, true);
            bi0Var.P(i10);
            if (hdVar != null) {
                hdVar.invalidate();
            }
        }
    }

    @Override
    public final ArrayList V() {
        qo qoVar = new qo(this);
        ArrayList arrayList = new ArrayList();
        if (this.f25491r1.f42436u7) {
            org.telegram.ui.ActionBar.k2 k2Var = this.N1;
            if (k2Var instanceof m91) {
                arrayList.addAll(((m91) k2Var).W0());
                return arrayList;
            }
        }
        bi biVar = this.O1;
        if (biVar != null) {
            arrayList.addAll(biVar.V());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.f21612r0}, qoVar, org.telegram.ui.ActionBar.t6.f21001h5));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        View view = this.f25498y1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.c7) obj).f20242n = this.f25488o1;
        }
        return arrayList;
    }

    public final void V0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dp.V0(boolean):void");
    }

    public final void X0(org.telegram.ui.ActionBar.s6 s6Var) {
        if (s6Var != null && s6Var != org.telegram.ui.ActionBar.t6.I) {
            this.Y1 = true;
            try {
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19695t4, s6Var, Boolean.FALSE, null, -1);
            } finally {
                this.Y1 = false;
            }
        }
    }

    public final void Y0() {
        TextView textView = this.l1;
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p5, this.I0);
            int L = org.telegram.messenger.i0.L(6.0f);
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10);
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i10, 76);
            org.telegram.ui.ActionBar.p6 p6Var = this.I0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.a7.k(textView, k02, null, h, p6Var);
        }
        TextView textView2 = this.f25485k1;
        if (textView2 != null) {
            int i11 = org.telegram.ui.ActionBar.t6.f21153p7;
            org.telegram.ui.ActionBar.a7.V(textView2, i11, this.I0);
            int L2 = org.telegram.messenger.i0.L(6.0f);
            int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o11, o11);
            org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i11, 76);
            org.telegram.ui.ActionBar.p6 p6Var2 = this.I0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.a7.k(textView2, k03, null, h10, p6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i12, this.I0), 30), 1, -1);
        org.telegram.ui.ActionBar.w6 h11 = org.telegram.ui.ActionBar.a7.h(i12, 30);
        org.telegram.ui.ActionBar.p6 p6Var3 = this.I0;
        ImageView imageView = this.f25483i1;
        org.telegram.ui.ActionBar.a7.R(imageView, h02, null, h11, p6Var3);
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
        org.telegram.ui.ActionBar.c2 c2Var = this.f25484j1;
        c2Var.a(w02);
        c2Var.b(org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.R(this.f25496w1, org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 30), 1, -1), null, org.telegram.ui.ActionBar.a7.h(i13, 30), this.I0);
        int i14 = org.telegram.ui.ActionBar.t6.f21094m5;
        org.telegram.ui.ActionBar.p6 p6Var4 = this.I0;
        TextView textView3 = this.B1;
        org.telegram.ui.ActionBar.a7.V(textView3, i14, p6Var4);
        int L3 = org.telegram.messenger.i0.L(6.0f);
        int o12 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 76);
        org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o12, o12), null, org.telegram.ui.ActionBar.a7.h(i13, 76), this.I0);
    }

    public final void Z0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dp.Z0(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            org.telegram.messenger.zs.f(this.f21583a).d(new mo(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        b11 b11Var;
        org.telegram.ui.ActionBar.s6 J0;
        boolean z10;
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        super.dismiss();
        this.f25491r1.getClass();
        boolean z11 = this.E1;
        boolean z12 = this.f25490q1;
        if (!z11 && this.D1 != z12) {
            b11Var = L0();
        } else {
            b11Var = null;
        }
        if (!this.E1) {
            org.telegram.ui.sn snVar = this.f25488o1;
            TLRPC.WallPaper wallPaper = snVar.f41591g;
            if (wallPaper == null) {
                wallPaper = this.f25486m1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (b11Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            snVar.r(this.f25489p1, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.D1 != z12) {
            if (org.telegram.ui.ActionBar.t6.I.q() == z12) {
                J0 = org.telegram.ui.ActionBar.t6.I;
            } else {
                J0 = J0(z12);
            }
            if (this.Z1) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.t6.u(J0, false, z12);
            }
        }
        this.Z1 = false;
        W0(b11Var);
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.f21586b.getTop() && x10 >= this.f21586b.getLeft() && x10 <= this.f21586b.getRight()) {
            return false;
        }
        this.f25491r1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void g0(float f7) {
        q30 q30Var = this.K1;
        if (q30Var != null) {
            q30Var.b(true);
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
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.f21583a);
        f7.m(true);
        f7.m(false);
        f7.l(true);
        f7.l(false);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        this.E1 = false;
        if (f7.f15673f.f8112c && (arrayList = f7.f15671b) != null && !arrayList.isEmpty()) {
            R0(f7.e(7));
        } else {
            Q0();
        }
        if (this.f25491r1.j() != null && org.telegram.messenger.tz.f18143e1 > 0 && !this.f25491r1.j().self) {
            org.telegram.messenger.tz.f18143e1--;
            org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.tz.f18143e1).apply();
            q30 q30Var = new q30(9, getContext(), this.f25491r1.getResourceProvider(), false);
            this.K1 = q30Var;
            q30Var.setVisibility(4);
            this.K1.setShowingDuration(5000L);
            this.K1.setBottomOffset(-org.telegram.messenger.i0.L(8.0f));
            if (this.D1) {
                this.K1.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
            } else {
                this.K1.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
            }
            org.telegram.messenger.i0.h3(new mo(this, 7), 1500L);
            this.f21589c.addView(this.K1, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.F0 == -1 && this.G0 != (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21019i5, this.I0))) {
                this.G0 = w02;
                boolean z10 = false;
                org.telegram.messenger.i0.t3(this, w02, false, null);
                if (org.telegram.messenger.i0.B(w02) > 0.721d) {
                    z10 = true;
                }
                org.telegram.messenger.i0.m3(this, z10);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}

package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class DataSettingsActivity extends org.telegram.ui.ActionBar.k2 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public fg.j f33311a;
    public ag.b1 f33312b;
    public ArrayList f33313c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f33314f;
    public int h;
    public int f33315n;
    private int proxyRow;
    public int f33316r;
    private int resetDownloadRow;
    public int f33317s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int f33318w;
    public int f33319x;
    public int f33320y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
    }

    public static void Y(org.telegram.ui.DataSettingsActivity r18, android.content.Context r19, android.view.View r20, int r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.Y(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void Z(DataSettingsActivity dataSettingsActivity) {
        org.telegram.messenger.a6 a6Var;
        org.telegram.messenger.a6 a6Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(dataSettingsActivity.currentAccount).f7.edit();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).M;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).K;
                str = "mobilePreset";
            } else if (i10 == 1) {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).N;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).L;
                str = "wifiPreset";
            } else {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).O;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).J;
                str = "roamingPreset";
            }
            a6Var.c(a6Var2);
            a6Var.f14582g = a6Var2.b();
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).P = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, a6Var.toString());
        }
        edit.commit();
        org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).g();
        for (int i11 = 0; i11 < 3; i11++) {
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).w(i11);
        }
        dataSettingsActivity.f33311a.k(dataSettingsActivity.e, 4);
        dataSettingsActivity.s0(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751678, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 15));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.f33311a = new fg.j(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ag.b1 b1Var = new ag.b1(this, context, 25);
        this.f33312b = b1Var;
        b1Var.r1();
        this.f33312b.setVerticalScrollBarEnabled(false);
        this.f33312b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.f33312b, w7.b6.e(-1, -1, 51));
        this.f33312b.setAdapter(this.f33311a);
        this.f33312b.setSectionsDrawBackground(true);
        this.f33312b.setOnItemClickListener(new org.telegram.ui.Components.f2(28, this, context));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f33312b.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33312b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33312b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.l5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33312b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33312b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33312b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33312b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.b6.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.b6.q(this.currentAccount).s(true);
        s0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.f43710h0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zt ztVar = new zt(this, 1);
        org.telegram.messenger.i0.h3(ztVar, 100L);
        y6.l0(new au(this, ztVar, System.currentTimeMillis(), 0));
        if (this.f33312b != null && this.f33311a != null) {
            for (int i10 = 0; i10 < this.f33312b.getChildCount(); i10++) {
                View childAt = this.f33312b.getChildAt(i10);
                s4.c1 T = this.f33312b.T(childAt);
                if (T != null) {
                    fg.j jVar = this.f33311a;
                    this.f33312b.getClass();
                    jVar.t(T, RecyclerView.R(childAt));
                }
            }
        }
        s0(false);
    }

    public final void r0(int i10) {
        if (this.f33312b != null && this.f33311a != null) {
            for (int i11 = 0; i11 < this.f33312b.getChildCount(); i11++) {
                s4.c1 T = this.f33312b.T(this.f33312b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f33311a.t(T, i10);
                    return;
                }
            }
        }
    }

    public final void s0(boolean z10) {
        boolean z11;
        int i10;
        this.f33317s = 1;
        this.T = 3;
        this.f33318w = 2;
        this.f33315n = -1;
        ArrayList d12 = org.telegram.messenger.i0.d1();
        this.f33313c = d12;
        if (d12.size() > 1) {
            int i11 = this.T;
            this.T = i11 + 1;
            this.f33315n = i11;
        }
        int i12 = this.T;
        this.f33319x = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.T = i12 + 5;
        this.f33314f = i12 + 4;
        org.telegram.messenger.b6 downloadController = getDownloadController();
        org.telegram.messenger.a6 a6Var = downloadController.J;
        org.telegram.messenger.a6 a6Var2 = downloadController.L;
        org.telegram.messenger.a6 a6Var3 = downloadController.K;
        if (a6Var.a(downloadController.o()) && downloadController.J.b() == downloadController.O.f14582g && a6Var3.a(downloadController.n()) && a6Var3.b() == downloadController.M.f14582g && a6Var2.a(downloadController.p()) && a6Var2.b() == downloadController.N.f14582g) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i13 = this.resetDownloadRow;
        if (z11) {
            i10 = -1;
        } else {
            i10 = this.T;
            this.T = i10 + 1;
        }
        this.resetDownloadRow = i10;
        fg.j jVar = this.f33311a;
        if (jVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                jVar.g(this.f33314f);
                this.f33311a.i(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                jVar.g(this.f33314f);
                this.f33311a.s(i13);
            } else {
                z10 = true;
            }
        }
        int i14 = this.T;
        this.f33316r = i14;
        this.R = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.S = i14 + 5;
        this.f33320y = i14 + 6;
        int i15 = i14 + 8;
        this.T = i15;
        this.D = i14 + 7;
        boolean z12 = org.telegram.messenger.v2.f18448a;
        this.G = i15;
        this.F = i14 + 9;
        this.H = i14 + 10;
        this.E = -1;
        this.M = i14 + 11;
        this.useLessDataForCallsRow = i14 + 12;
        this.N = i14 + 13;
        this.O = i14 + 14;
        this.proxyRow = i14 + 15;
        this.P = i14 + 16;
        this.clearDraftsRow = i14 + 17;
        this.T = i14 + 19;
        this.Q = i14 + 18;
        fg.j jVar2 = this.f33311a;
        if (jVar2 != null && z10) {
            jVar2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

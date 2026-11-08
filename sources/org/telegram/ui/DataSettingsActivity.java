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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.f2 {
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
    public l4 f41214a;
    public zs f41215b;
    public ArrayList f41216c;
    private int clearDraftsRow;
    public int d;
    public int f41217e;
    public int f41218f;
    public int h;
    public int f41219n;
    private int proxyRow;
    public int f41220r;
    private int resetDownloadRow;
    public int f41221s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int f41222w;
    public int f41223x;
    public int f41224y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
    }

    public static void Z(org.telegram.ui.DataSettingsActivity r18, android.content.Context r19, android.view.View r20, int r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.Z(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void a0(DataSettingsActivity dataSettingsActivity) {
        org.telegram.messenger.y5 y5Var;
        org.telegram.messenger.y5 y5Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataSettingsActivity.currentAccount).f24774e7.edit();
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "mobilePreset";
            } else if (i7 == 1) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "wifiPreset";
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).J;
                str = "roamingPreset";
            }
            y5Var.c(y5Var2);
            y5Var.f26594g = y5Var2.b();
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).P = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, y5Var.toString());
        }
        edit.commit();
        org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).g();
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).w(i10);
        }
        dataSettingsActivity.f41214a.k(dataSettingsActivity.f41217e, 4);
        dataSettingsActivity.t0(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751678, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 24));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f41214a = new l4(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zs zsVar = new zs(0, context, this);
        this.f41215b = zsVar;
        zsVar.r1();
        this.f41215b.setVerticalScrollBarEnabled(false);
        this.f41215b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f41215b, c8.ha.e(-1, -1, 51));
        this.f41215b.setAdapter(this.f41214a);
        this.f41215b.setSectionsDrawBackground(true);
        this.f41215b.setOnItemClickListener(new org.telegram.ui.Components.f2(27, this, context));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57071m = false;
        this.f41215b.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41215b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41215b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27852d6));
        int i7 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41215b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41215b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41215b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41215b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.z5.q(this.currentAccount).s(true);
        t0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.f52092h0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ws wsVar = new ws(this, 1);
        org.telegram.messenger.g0.i3(wsVar, 100L);
        y6.m0(new bi.b2(this, wsVar, System.currentTimeMillis(), 1));
        if (this.f41215b != null && this.f41214a != null) {
            for (int i7 = 0; i7 < this.f41215b.getChildCount(); i7++) {
                View childAt = this.f41215b.getChildAt(i7);
                v4.d1 T = this.f41215b.T(childAt);
                if (T != null) {
                    l4 l4Var = this.f41214a;
                    this.f41215b.getClass();
                    l4Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void s0(int i7) {
        if (this.f41215b != null && this.f41214a != null) {
            for (int i10 = 0; i10 < this.f41215b.getChildCount(); i10++) {
                v4.d1 T = this.f41215b.T(this.f41215b.getChildAt(i10));
                if (T != null && T.b() == i7) {
                    this.f41214a.t(T, i7);
                    return;
                }
            }
        }
    }

    public final void t0(boolean z9) {
        boolean z10;
        int i7;
        this.f41221s = 1;
        this.T = 3;
        this.f41222w = 2;
        this.f41219n = -1;
        ArrayList d12 = org.telegram.messenger.g0.d1();
        this.f41216c = d12;
        if (d12.size() > 1) {
            int i10 = this.T;
            this.T = i10 + 1;
            this.f41219n = i10;
        }
        int i11 = this.T;
        this.f41223x = i11;
        this.d = i11 + 1;
        this.f41217e = i11 + 2;
        this.h = i11 + 3;
        this.T = i11 + 5;
        this.f41218f = i11 + 4;
        org.telegram.messenger.z5 downloadController = getDownloadController();
        org.telegram.messenger.y5 y5Var = downloadController.J;
        org.telegram.messenger.y5 y5Var2 = downloadController.L;
        org.telegram.messenger.y5 y5Var3 = downloadController.K;
        if (y5Var.a(downloadController.o()) && downloadController.J.b() == downloadController.O.f26594g && y5Var3.a(downloadController.n()) && y5Var3.b() == downloadController.M.f26594g && y5Var2.a(downloadController.p()) && y5Var2.b() == downloadController.N.f26594g) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = this.resetDownloadRow;
        if (z10) {
            i7 = -1;
        } else {
            i7 = this.T;
            this.T = i7 + 1;
        }
        this.resetDownloadRow = i7;
        l4 l4Var = this.f41214a;
        if (l4Var != null && !z9) {
            if (i12 < 0 && i7 >= 0) {
                l4Var.g(this.f41218f);
                this.f41214a.i(this.resetDownloadRow);
            } else if (i12 >= 0 && i7 < 0) {
                l4Var.g(this.f41218f);
                this.f41214a.s(i12);
            } else {
                z9 = true;
            }
        }
        int i13 = this.T;
        this.f41220r = i13;
        this.R = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.S = i13 + 5;
        this.f41224y = i13 + 6;
        int i14 = i13 + 8;
        this.T = i14;
        this.D = i13 + 7;
        boolean z11 = org.telegram.messenger.r2.f25212a;
        this.G = i14;
        this.F = i13 + 9;
        this.H = i13 + 10;
        this.E = -1;
        this.M = i13 + 11;
        this.useLessDataForCallsRow = i13 + 12;
        this.N = i13 + 13;
        this.O = i13 + 14;
        this.proxyRow = i13 + 15;
        this.P = i13 + 16;
        this.clearDraftsRow = i13 + 17;
        this.T = i13 + 19;
        this.Q = i13 + 18;
        l4 l4Var2 = this.f41214a;
        if (l4Var2 != null && z9) {
            l4Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.g2 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public long Y;
    public l4 f43132a;
    public dt f43133b;
    public ArrayList f43134c;
    private int clearDraftsRow;
    public int d;
    public int f43135e;
    public int f43136f;
    public int h;
    public int f43137n;
    private int proxyRow;
    public int f43138r;
    private int resetDownloadRow;
    public int f43139s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int f43140w;
    public int f43141x;
    public int f43142y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
    }

    public static void Z(org.telegram.ui.DataSettingsActivity r18, android.content.Context r19, android.view.View r20, int r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.Z(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void a0(DataSettingsActivity dataSettingsActivity) {
        org.telegram.messenger.z5 z5Var;
        org.telegram.messenger.z5 z5Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(dataSettingsActivity.currentAccount).h7.edit();
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                z5Var = org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).N;
                z5Var2 = org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).L;
                str = "mobilePreset";
            } else if (i7 == 1) {
                z5Var = org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).O;
                z5Var2 = org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).M;
                str = "wifiPreset";
            } else {
                z5Var = org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).P;
                z5Var2 = org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).K;
                str = "roamingPreset";
            }
            z5Var.c(z5Var2);
            z5Var.f28360g = z5Var2.b();
            org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, z5Var.toString());
        }
        edit.commit();
        org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).g();
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.messenger.a6.q(dataSettingsActivity.currentAccount).w(i10);
        }
        dataSettingsActivity.f43132a.k(dataSettingsActivity.f43135e, 4);
        dataSettingsActivity.t0(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751665, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 27));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.f43132a = new l4(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        dt dtVar = new dt(0, context, this);
        this.f43133b = dtVar;
        dtVar.r1();
        this.f43133b.setVerticalScrollBarEnabled(false);
        this.f43133b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f43133b, c8.na.e(-1, -1, 51));
        this.f43133b.setAdapter(this.f43132a);
        this.f43133b.setSectionsDrawBackground(true);
        this.f43133b.setOnItemClickListener(new zs(0, this, context));
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.f43133b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43133b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43133b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43133b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43133b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43133b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43133b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.a6.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.a6.q(this.currentAccount).s(true);
        t0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.f54236i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        at atVar = new at(this, 1);
        org.telegram.messenger.g0.h3(atVar, 100L);
        y6.m0(new bi.d4(this, atVar, System.currentTimeMillis(), 3));
        if (this.f43133b != null && this.f43132a != null) {
            for (int i7 = 0; i7 < this.f43133b.getChildCount(); i7++) {
                View childAt = this.f43133b.getChildAt(i7);
                v4.f1 T = this.f43133b.T(childAt);
                if (T != null) {
                    l4 l4Var = this.f43132a;
                    this.f43133b.getClass();
                    l4Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void s0(int i7) {
        if (this.f43133b != null && this.f43132a != null) {
            for (int i10 = 0; i10 < this.f43133b.getChildCount(); i10++) {
                v4.f1 T = this.f43133b.T(this.f43133b.getChildAt(i10));
                if (T != null && T.b() == i7) {
                    this.f43132a.t(T, i7);
                    return;
                }
            }
        }
    }

    public final void t0(boolean z10) {
        boolean z11;
        int i7;
        this.f43139s = 1;
        this.U = 3;
        this.f43140w = 2;
        this.f43137n = -1;
        ArrayList d12 = org.telegram.messenger.g0.d1();
        this.f43134c = d12;
        if (d12.size() > 1) {
            int i10 = this.U;
            this.U = i10 + 1;
            this.f43137n = i10;
        }
        int i11 = this.U;
        this.f43141x = i11;
        this.d = i11 + 1;
        this.f43135e = i11 + 2;
        this.h = i11 + 3;
        this.U = i11 + 5;
        this.f43136f = i11 + 4;
        org.telegram.messenger.a6 downloadController = getDownloadController();
        org.telegram.messenger.z5 z5Var = downloadController.K;
        org.telegram.messenger.z5 z5Var2 = downloadController.M;
        org.telegram.messenger.z5 z5Var3 = downloadController.L;
        if (z5Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.f28360g && z5Var3.a(downloadController.n()) && z5Var3.b() == downloadController.N.f28360g && z5Var2.a(downloadController.p()) && z5Var2.b() == downloadController.O.f28360g) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = this.resetDownloadRow;
        if (z11) {
            i7 = -1;
        } else {
            i7 = this.U;
            this.U = i7 + 1;
        }
        this.resetDownloadRow = i7;
        l4 l4Var = this.f43132a;
        if (l4Var != null && !z10) {
            if (i12 < 0 && i7 >= 0) {
                l4Var.g(this.f43136f);
                this.f43132a.i(this.resetDownloadRow);
            } else if (i12 >= 0 && i7 < 0) {
                l4Var.g(this.f43136f);
                this.f43132a.s(i12);
            } else {
                z10 = true;
            }
        }
        int i13 = this.U;
        this.f43138r = i13;
        this.S = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.T = i13 + 5;
        this.f43142y = i13 + 6;
        int i14 = i13 + 8;
        this.U = i14;
        this.E = i13 + 7;
        boolean z12 = org.telegram.messenger.s2.f26829a;
        this.H = i14;
        this.G = i13 + 9;
        this.I = i13 + 10;
        this.F = -1;
        this.N = i13 + 11;
        this.useLessDataForCallsRow = i13 + 12;
        this.O = i13 + 13;
        this.P = i13 + 14;
        this.proxyRow = i13 + 15;
        this.Q = i13 + 16;
        this.clearDraftsRow = i13 + 17;
        this.U = i13 + 19;
        this.R = i13 + 18;
        l4 l4Var2 = this.f43132a;
        if (l4Var2 != null && z10) {
            l4Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

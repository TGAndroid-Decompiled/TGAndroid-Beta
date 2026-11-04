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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.d2 {
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
    public n4 f41243a;
    public xs f41244b;
    public ArrayList f41245c;
    private int clearDraftsRow;
    public int d;
    public int f41246e;
    public int f41247f;
    public int h;
    public int f41248n;
    private int proxyRow;
    public int f41249r;
    private int resetDownloadRow;
    public int f41250s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int f41251w;
    public int f41252x;
    public int f41253y;

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
        org.telegram.messenger.y5 y5Var;
        org.telegram.messenger.y5 y5Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(dataSettingsActivity.currentAccount).f22999e7.edit();
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "mobilePreset";
            } else if (i3 == 1) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                str = "wifiPreset";
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).P;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "roamingPreset";
            }
            y5Var.c(y5Var2);
            y5Var.f26529g = y5Var2.b();
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, y5Var.toString());
        }
        edit.commit();
        org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).g();
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).w(i10);
        }
        dataSettingsActivity.f41243a.k(dataSettingsActivity.f41246e, 4);
        dataSettingsActivity.t0(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751678, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 25));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f41243a = new n4(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        xs xsVar = new xs(0, context, this);
        this.f41244b = xsVar;
        xsVar.r1();
        this.f41244b.setVerticalScrollBarEnabled(false);
        this.f41244b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.f41244b, b8.mf.e(-1, -1, 51));
        this.f41244b.setAdapter(this.f41243a);
        this.f41244b.setSectionsDrawBackground(true);
        this.f41244b.setOnItemClickListener(new org.telegram.ui.Components.i41(7, this, context));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f41244b.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41244b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41244b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        int i3 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41244b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41244b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41244b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41244b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
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
        z6.f52541i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        us usVar = new us(this, 1);
        org.telegram.messenger.g0.i3(usVar, 100L);
        z6.m0(new ci.u1(this, usVar, System.currentTimeMillis(), 1));
        if (this.f41244b != null && this.f41243a != null) {
            for (int i3 = 0; i3 < this.f41244b.getChildCount(); i3++) {
                View childAt = this.f41244b.getChildAt(i3);
                u4.d1 T = this.f41244b.T(childAt);
                if (T != null) {
                    n4 n4Var = this.f41243a;
                    this.f41244b.getClass();
                    n4Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void s0(int i3) {
        if (this.f41244b != null && this.f41243a != null) {
            for (int i10 = 0; i10 < this.f41244b.getChildCount(); i10++) {
                u4.d1 T = this.f41244b.T(this.f41244b.getChildAt(i10));
                if (T != null && T.b() == i3) {
                    this.f41243a.t(T, i3);
                    return;
                }
            }
        }
    }

    public final void t0(boolean z10) {
        boolean z11;
        int i3;
        this.f41250s = 1;
        this.U = 3;
        this.f41251w = 2;
        this.f41248n = -1;
        ArrayList d12 = org.telegram.messenger.g0.d1();
        this.f41245c = d12;
        if (d12.size() > 1) {
            int i10 = this.U;
            this.U = i10 + 1;
            this.f41248n = i10;
        }
        int i11 = this.U;
        this.f41252x = i11;
        this.d = i11 + 1;
        this.f41246e = i11 + 2;
        this.h = i11 + 3;
        this.U = i11 + 5;
        this.f41247f = i11 + 4;
        org.telegram.messenger.z5 downloadController = getDownloadController();
        org.telegram.messenger.y5 y5Var = downloadController.K;
        org.telegram.messenger.y5 y5Var2 = downloadController.M;
        org.telegram.messenger.y5 y5Var3 = downloadController.L;
        if (y5Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.f26529g && y5Var3.a(downloadController.n()) && y5Var3.b() == downloadController.N.f26529g && y5Var2.a(downloadController.p()) && y5Var2.b() == downloadController.O.f26529g) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = this.resetDownloadRow;
        if (z11) {
            i3 = -1;
        } else {
            i3 = this.U;
            this.U = i3 + 1;
        }
        this.resetDownloadRow = i3;
        n4 n4Var = this.f41243a;
        if (n4Var != null && !z10) {
            if (i12 < 0 && i3 >= 0) {
                n4Var.g(this.f41247f);
                this.f41243a.i(this.resetDownloadRow);
            } else if (i12 >= 0 && i3 < 0) {
                n4Var.g(this.f41247f);
                this.f41243a.s(i12);
            } else {
                z10 = true;
            }
        }
        int i13 = this.U;
        this.f41249r = i13;
        this.S = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.T = i13 + 5;
        this.f41253y = i13 + 6;
        int i14 = i13 + 8;
        this.U = i14;
        this.E = i13 + 7;
        boolean z12 = org.telegram.messenger.r2.f25040a;
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
        n4 n4Var2 = this.f41243a;
        if (n4Var2 != null && z10) {
            n4Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.e2 {
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
    public l4 f42568a;
    public ct f42569b;
    public ArrayList f42570c;
    private int clearDraftsRow;
    public int d;
    public int f42571e;
    public int f42572f;
    public int h;
    public int f42573n;
    private int proxyRow;
    public int f42574r;
    private int resetDownloadRow;
    public int f42575s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int f42576w;
    public int f42577x;
    public int f42578y;

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
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(dataSettingsActivity.currentAccount).f25280f7.edit();
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "mobilePreset";
            } else if (i7 == 1) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                str = "wifiPreset";
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).P;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "roamingPreset";
            }
            y5Var.c(y5Var2);
            y5Var.f27663g = y5Var2.b();
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
        dataSettingsActivity.f42568a.k(dataSettingsActivity.f42571e, 4);
        dataSettingsActivity.t0(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751677, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 25));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f42568a = new l4(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ct ctVar = new ct(0, context, this);
        this.f42569b = ctVar;
        ctVar.r1();
        this.f42569b.setVerticalScrollBarEnabled(false);
        this.f42569b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f42569b, c8.ja.e(-1, -1, 51));
        this.f42569b.setAdapter(this.f42568a);
        this.f42569b.setSectionsDrawBackground(true);
        this.f42569b.setOnItemClickListener(new tr(1, this, context));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f42569b.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f42569b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42569b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        int i7 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42569b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42569b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42569b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42569b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
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
        y6.f53430i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zs zsVar = new zs(this, 1);
        org.telegram.messenger.g0.i3(zsVar, 100L);
        y6.m0(new di.o1(this, zsVar, System.currentTimeMillis(), 1));
        if (this.f42569b != null && this.f42568a != null) {
            for (int i7 = 0; i7 < this.f42569b.getChildCount(); i7++) {
                View childAt = this.f42569b.getChildAt(i7);
                v4.e1 T = this.f42569b.T(childAt);
                if (T != null) {
                    l4 l4Var = this.f42568a;
                    this.f42569b.getClass();
                    l4Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void s0(int i7) {
        if (this.f42569b != null && this.f42568a != null) {
            for (int i10 = 0; i10 < this.f42569b.getChildCount(); i10++) {
                v4.e1 T = this.f42569b.T(this.f42569b.getChildAt(i10));
                if (T != null && T.b() == i7) {
                    this.f42568a.t(T, i7);
                    return;
                }
            }
        }
    }

    public final void t0(boolean z10) {
        boolean z11;
        int i7;
        this.f42575s = 1;
        this.U = 3;
        this.f42576w = 2;
        this.f42573n = -1;
        ArrayList d12 = org.telegram.messenger.g0.d1();
        this.f42570c = d12;
        if (d12.size() > 1) {
            int i10 = this.U;
            this.U = i10 + 1;
            this.f42573n = i10;
        }
        int i11 = this.U;
        this.f42577x = i11;
        this.d = i11 + 1;
        this.f42571e = i11 + 2;
        this.h = i11 + 3;
        this.U = i11 + 5;
        this.f42572f = i11 + 4;
        org.telegram.messenger.z5 downloadController = getDownloadController();
        org.telegram.messenger.y5 y5Var = downloadController.K;
        org.telegram.messenger.y5 y5Var2 = downloadController.M;
        org.telegram.messenger.y5 y5Var3 = downloadController.L;
        if (y5Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.f27663g && y5Var3.a(downloadController.n()) && y5Var3.b() == downloadController.N.f27663g && y5Var2.a(downloadController.p()) && y5Var2.b() == downloadController.O.f27663g) {
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
        l4 l4Var = this.f42568a;
        if (l4Var != null && !z10) {
            if (i12 < 0 && i7 >= 0) {
                l4Var.g(this.f42572f);
                this.f42568a.i(this.resetDownloadRow);
            } else if (i12 >= 0 && i7 < 0) {
                l4Var.g(this.f42572f);
                this.f42568a.s(i12);
            } else {
                z10 = true;
            }
        }
        int i13 = this.U;
        this.f42574r = i13;
        this.S = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.T = i13 + 5;
        this.f42578y = i13 + 6;
        int i14 = i13 + 8;
        this.U = i14;
        this.E = i13 + 7;
        boolean z12 = org.telegram.messenger.r2.f26198a;
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
        l4 l4Var2 = this.f42568a;
        if (l4Var2 != null && z10) {
            l4Var2.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

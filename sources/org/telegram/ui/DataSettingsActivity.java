package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class DataSettingsActivity extends org.telegram.ui.ActionBar.r2 {
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
    public zt f35485a;
    public bi.r1 f35486b;
    public ArrayList f35487c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f35488f;
    public int h;
    public int f35489n;
    private int proxyRow;
    public int f35490r;
    private int resetDownloadRow;
    public int f35491s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f35492w;
    public int f35493x;
    public int f35494y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
    }

    public static void V(org.telegram.ui.DataSettingsActivity r20, android.content.Context r21, android.view.View r22, int r23, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.V(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void W(DataSettingsActivity dataSettingsActivity) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i10 == 1) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "roamingPreset";
            }
            preset.set(preset2);
            preset.enabled = preset2.isEnabled();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentMobilePreset = 3;
            edit.putInt("currentMobilePreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentWifiPreset = 3;
            edit.putInt("currentWifiPreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentRoamingPreset = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, preset.toString());
        }
        edit.commit();
        DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
        for (int i11 = 0; i11 < 3; i11++) {
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i11);
        }
        dataSettingsActivity.f35485a.q(dataSettingsActivity.e, 4);
        dataSettingsActivity.p0(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 23));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f35485a = new zt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        bi.r1 r1Var = new bi.r1(this, context, 27);
        this.f35486b = r1Var;
        r1Var.u1();
        this.f35486b.setVerticalScrollBarEnabled(false);
        this.f35486b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f35486b, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.f35486b.setAdapter(this.f35485a);
        this.f35486b.setSectionsDrawBackground(true);
        this.f35486b.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(5, this, context));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        this.f35486b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35486b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35486b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.n5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        int i10 = org.telegram.ui.ActionBar.y6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35486b, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35486b, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35486b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35486b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void o0(int i10) {
        if (this.f35486b != null && this.f35485a != null) {
            for (int i11 = 0; i11 < this.f35486b.getChildCount(); i11++) {
                s4.e1 T = this.f35486b.T(this.f35486b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f35485a.v(T, i10);
                    return;
                }
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        DownloadController.getInstance(this.currentAccount).loadAutoDownloadConfig(true);
        p0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        c7.f38338i0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        wt wtVar = new wt(this, 1);
        AndroidUtilities.runOnUIThread(wtVar, 100L);
        c7.i0(new bi.c2(this, wtVar, System.currentTimeMillis(), 1));
        if (this.f35486b != null && this.f35485a != null) {
            for (int i10 = 0; i10 < this.f35486b.getChildCount(); i10++) {
                View childAt = this.f35486b.getChildAt(i10);
                s4.e1 T = this.f35486b.T(childAt);
                if (T != null) {
                    zt ztVar = this.f35485a;
                    this.f35486b.getClass();
                    ztVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        p0(false);
    }

    public final void p0(boolean z10) {
        boolean z11;
        int i10;
        this.f35491s = 1;
        this.T = 3;
        this.v = 2;
        this.f35489n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f35487c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.T;
            this.T = i11 + 1;
            this.f35489n = i11;
        }
        int i12 = this.T;
        this.f35492w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.T = i12 + 5;
        this.f35488f = i12 + 4;
        DownloadController downloadController = getDownloadController();
        if (downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled) {
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
        zt ztVar = this.f35485a;
        if (ztVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                ztVar.m(this.f35488f);
                this.f35485a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                ztVar.m(this.f35488f);
                this.f35485a.u(i13);
            } else {
                z10 = true;
            }
        }
        int i14 = this.T;
        this.f35490r = i14;
        this.R = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.S = i14 + 5;
        this.f35493x = i14 + 6;
        int i15 = i14 + 8;
        this.T = i15;
        this.f35494y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.G = i15;
            this.T = i14 + 10;
            this.F = i14 + 9;
        } else {
            this.F = -1;
            this.G = -1;
        }
        int i16 = this.T;
        this.H = i16;
        this.E = -1;
        this.M = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.N = i16 + 3;
        this.O = i16 + 4;
        this.proxyRow = i16 + 5;
        this.P = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.T = i16 + 9;
        this.Q = i16 + 8;
        zt ztVar2 = this.f35485a;
        if (ztVar2 != null && z10) {
            ztVar2.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

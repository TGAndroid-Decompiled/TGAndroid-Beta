package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class DataSettingsActivity extends org.telegram.ui.ActionBar.n2 {
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
    public nu f33748a;
    public ai.w0 f33749b;
    public ArrayList f33750c;
    private int clearDraftsRow;
    public int d;
    public int f33751e;
    public int f33752f;
    public int h;
    public int f33753n;
    private int proxyRow;
    public int f33754r;
    private int resetDownloadRow;
    public int f33755s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f33756w;
    public int f33757x;
    public int f33758y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
    }

    public static void S(org.telegram.ui.DataSettingsActivity r19, android.content.Context r20, android.view.View r21, int r22, float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.S(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void T(DataSettingsActivity dataSettingsActivity) {
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
        dataSettingsActivity.f33748a.q(dataSettingsActivity.f33751e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 18));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f33748a = new nu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ai.w0 w0Var = new ai.w0(this, context, 26);
        this.f33749b = w0Var;
        w0Var.r1();
        this.f33749b.setVerticalScrollBarEnabled(false);
        this.f33749b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f33749b, w7.z5.e(-1, -1, 51));
        this.f33749b.setAdapter(this.f33748a);
        this.f33749b.setSectionsDrawBackground(true);
        this.f33749b.setOnItemClickListener(new org.telegram.ui.Components.w2(26, this, context));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46577m = false;
        this.f33749b.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f33749b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f21233z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33749b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f33749b != null && this.f33748a != null) {
            for (int i11 = 0; i11 < this.f33749b.getChildCount(); i11++) {
                s4.c1 T = this.f33749b.T(this.f33749b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f33748a.v(T, i10);
                    return;
                }
            }
        }
    }

    public final void o0(boolean z10) {
        boolean z11;
        int i10;
        this.f33755s = 1;
        this.T = 3;
        this.v = 2;
        this.f33753n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f33750c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.T;
            this.T = i11 + 1;
            this.f33753n = i11;
        }
        int i12 = this.T;
        this.f33756w = i12;
        this.d = i12 + 1;
        this.f33751e = i12 + 2;
        this.h = i12 + 3;
        this.T = i12 + 5;
        this.f33752f = i12 + 4;
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
        nu nuVar = this.f33748a;
        if (nuVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                nuVar.m(this.f33752f);
                this.f33748a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                nuVar.m(this.f33752f);
                this.f33748a.u(i13);
            } else {
                z10 = true;
            }
        }
        int i14 = this.T;
        this.f33754r = i14;
        this.R = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.S = i14 + 5;
        this.f33757x = i14 + 6;
        int i15 = i14 + 8;
        this.T = i15;
        this.f33758y = i14 + 7;
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
        nu nuVar2 = this.f33748a;
        if (nuVar2 != null && z10) {
            nuVar2.l();
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
        o0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        a7.m0 = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ju juVar = new ju(this, 1);
        AndroidUtilities.runOnUIThread(juVar, 100L);
        a7.g0(new ku(this, juVar, System.currentTimeMillis(), 0));
        if (this.f33749b != null && this.f33748a != null) {
            for (int i10 = 0; i10 < this.f33749b.getChildCount(); i10++) {
                View childAt = this.f33749b.getChildAt(i10);
                s4.c1 T = this.f33749b.T(childAt);
                if (T != null) {
                    nu nuVar = this.f33748a;
                    this.f33749b.getClass();
                    nuVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

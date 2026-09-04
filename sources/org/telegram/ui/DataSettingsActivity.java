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
    public final int N;
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
    public ou f33384a;
    public bi.o0 f33385b;
    public ArrayList f33386c;
    private int clearDraftsRow;
    public int d;
    public int f33387e;
    public int f33388f;
    public int h;
    public int f33389n;
    private int proxyRow;
    public int f33390r;
    private int resetDownloadRow;
    public int f33391s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f33392w;
    public int f33393x;
    public int f33394y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.N = -1;
    }

    public static void U(org.telegram.ui.DataSettingsActivity r21, android.content.Context r22, android.view.View r23, int r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.U(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void V(DataSettingsActivity dataSettingsActivity) {
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
        dataSettingsActivity.f33384a.q(dataSettingsActivity.f33387e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 19));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f33384a = new ou(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        bi.o0 o0Var = new bi.o0(this, context, 26);
        this.f33385b = o0Var;
        o0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f33385b);
        this.f33385b.setVerticalScrollBarEnabled(false);
        this.f33385b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f33385b, w7.x5.e(-1, -1, 51));
        this.f33385b.setAdapter(this.f33384a);
        this.f33385b.setOnItemClickListener(new org.telegram.ui.Components.b3(24, this, context));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.C = false;
        jVar.f45777m = false;
        this.f33385b.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.i5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f21061z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33385b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f33385b != null && this.f33384a != null) {
            for (int i11 = 0; i11 < this.f33385b.getChildCount(); i11++) {
                s4.c1 T = this.f33385b.T(this.f33385b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f33384a.v(T, i10);
                    return;
                }
            }
        }
    }

    public final void o0(boolean z10) {
        boolean z11;
        int i10;
        this.f33391s = 1;
        this.U = 3;
        this.v = 2;
        this.f33389n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f33386c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.U;
            this.U = i11 + 1;
            this.f33389n = i11;
        }
        int i12 = this.U;
        this.f33392w = i12;
        this.d = i12 + 1;
        this.f33387e = i12 + 2;
        this.h = i12 + 3;
        this.U = i12 + 5;
        this.f33388f = i12 + 4;
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
            i10 = this.U;
            this.U = i10 + 1;
        }
        this.resetDownloadRow = i10;
        ou ouVar = this.f33384a;
        if (ouVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                ouVar.m(this.f33388f);
                this.f33384a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                ouVar.m(this.f33388f);
                this.f33384a.u(i13);
            } else {
                z10 = true;
            }
        }
        int i14 = this.U;
        this.f33390r = i14;
        this.S = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.T = i14 + 5;
        this.f33393x = i14 + 6;
        int i15 = i14 + 8;
        this.U = i15;
        this.f33394y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.G = i15;
            this.U = i14 + 10;
            this.F = i14 + 9;
        } else {
            this.F = -1;
            this.G = -1;
        }
        int i16 = this.U;
        this.H = i16;
        this.E = -1;
        this.M = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.O = i16 + 3;
        this.P = i16 + 4;
        this.proxyRow = i16 + 5;
        this.Q = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.U = i16 + 9;
        this.R = i16 + 8;
        ou ouVar2 = this.f33384a;
        if (ouVar2 != null && z10) {
            ouVar2.l();
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
        z6.f43299k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33385b.setPadding(0, 0, 0, i13);
        this.f33385b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ku kuVar = new ku(this, 1);
        AndroidUtilities.runOnUIThread(kuVar, 100L);
        z6.j0(new lu(this, kuVar, System.currentTimeMillis(), 0));
        if (this.f33385b != null && this.f33384a != null) {
            for (int i10 = 0; i10 < this.f33385b.getChildCount(); i10++) {
                View childAt = this.f33385b.getChildAt(i10);
                s4.c1 T = this.f33385b.T(childAt);
                if (T != null) {
                    ou ouVar = this.f33384a;
                    this.f33385b.getClass();
                    ouVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

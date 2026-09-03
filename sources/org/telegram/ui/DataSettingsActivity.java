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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public nu f31551a;
    public lh.e1 f31552b;
    public ArrayList f31553c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f31554f;
    public int h;
    public int f31555n;
    private int proxyRow;
    public int f31556r;
    private int resetDownloadRow;
    public int f31557s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f31558w;
    public int f31559x;
    public int f31560y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
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
        dataSettingsActivity.f31551a.q(dataSettingsActivity.e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 5));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f31551a = new nu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        lh.e1 e1Var = new lh.e1(this, context, 24);
        this.f31552b = e1Var;
        e1Var.o1();
        this.actionBar.setAdaptiveBackground(this.f31552b);
        this.f31552b.setVerticalScrollBarEnabled(false);
        this.f31552b.setLayoutManager(new f2.i0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f31552b, k7.b6.e(-1, -1, 51));
        this.f31552b.setAdapter(this.f31551a);
        this.f31552b.setOnItemClickListener(new ss(2, this, context));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.f5807m = false;
        this.f31552b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.i5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f20273z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31552b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f31552b != null && this.f31551a != null) {
            for (int i11 = 0; i11 < this.f31552b.getChildCount(); i11++) {
                f2.l1 T = this.f31552b.T(this.f31552b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f31551a.v(T, i10);
                    return;
                }
            }
        }
    }

    public final void o0(boolean z4) {
        boolean z10;
        int i10;
        this.f31557s = 1;
        this.R = 3;
        this.v = 2;
        this.f31555n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f31553c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.R;
            this.R = i11 + 1;
            this.f31555n = i11;
        }
        int i12 = this.R;
        this.f31558w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.R = i12 + 5;
        this.f31554f = i12 + 4;
        DownloadController downloadController = getDownloadController();
        if (downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.resetDownloadRow;
        if (z10) {
            i10 = -1;
        } else {
            i10 = this.R;
            this.R = i10 + 1;
        }
        this.resetDownloadRow = i10;
        nu nuVar = this.f31551a;
        if (nuVar != null && !z4) {
            if (i13 < 0 && i10 >= 0) {
                nuVar.m(this.f31554f);
                this.f31551a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                nuVar.m(this.f31554f);
                this.f31551a.u(i13);
            } else {
                z4 = true;
            }
        }
        int i14 = this.R;
        this.f31556r = i14;
        this.P = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.Q = i14 + 5;
        this.f31559x = i14 + 6;
        int i15 = i14 + 8;
        this.R = i15;
        this.f31560y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.D = i15;
            this.R = i14 + 10;
            this.C = i14 + 9;
        } else {
            this.C = -1;
            this.D = -1;
        }
        int i16 = this.R;
        this.E = i16;
        this.B = -1;
        this.J = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.L = i16 + 3;
        this.M = i16 + 4;
        this.proxyRow = i16 + 5;
        this.N = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.R = i16 + 9;
        this.O = i16 + 8;
        nu nuVar2 = this.f31551a;
        if (nuVar2 != null && z4) {
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
        d7.f33342h0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31552b.setPadding(0, 0, 0, i13);
        this.f31552b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ju juVar = new ju(this, 1);
        AndroidUtilities.runOnUIThread(juVar, 100L);
        d7.j0(new ku(this, juVar, System.currentTimeMillis(), 0));
        if (this.f31552b != null && this.f31551a != null) {
            for (int i10 = 0; i10 < this.f31552b.getChildCount(); i10++) {
                View childAt = this.f31552b.getChildAt(i10);
                f2.l1 T = this.f31552b.T(childAt);
                if (T != null) {
                    nu nuVar = this.f31551a;
                    this.f31552b.getClass();
                    nuVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

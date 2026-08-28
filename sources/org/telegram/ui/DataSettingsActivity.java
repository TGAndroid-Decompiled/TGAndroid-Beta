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
public class DataSettingsActivity extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;
    public final int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public cu f35454a;
    public gh.f1 f35455b;
    public ArrayList f35456c;
    private int clearDraftsRow;
    public int d;
    public int f35457e;
    public int f35458f;
    public int h;
    public int f35459n;
    private int proxyRow;
    public int f35460r;
    private int resetDownloadRow;
    public int f35461s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f35462w;
    public int f35463x;
    public int f35464y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.J = -1;
    }

    public static void T(org.telegram.ui.DataSettingsActivity r21, android.content.Context r22, android.view.View r23, int r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DataSettingsActivity.T(org.telegram.ui.DataSettingsActivity, android.content.Context, android.view.View, int, float):void");
    }

    public static void U(DataSettingsActivity dataSettingsActivity) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == 0) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
            } else if (i9 == 1) {
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
        for (int i10 = 0; i10 < 3; i10++) {
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i10);
        }
        dataSettingsActivity.f35454a.q(dataSettingsActivity.f35457e, 4);
        dataSettingsActivity.n0(false);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 13));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f35454a = new cu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        gh.f1 f1Var = new gh.f1(this, context, 26);
        this.f35455b = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35455b);
        this.f35455b.setVerticalScrollBarEnabled(false);
        this.f35455b.setLayoutManager(new f2.m0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35455b, g7.e6.e(-1, -1, 51));
        this.f35455b.setAdapter(this.f35454a);
        this.f35455b.setOnItemClickListener(new yr(3, this, context));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.f35455b.setItemAnimator(nVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35455b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0(int i9) {
        if (this.f35455b != null && this.f35454a != null) {
            for (int i10 = 0; i10 < this.f35455b.getChildCount(); i10++) {
                f2.q1 T = this.f35455b.T(this.f35455b.getChildAt(i10));
                if (T != null && T.b() == i9) {
                    this.f35454a.v(T, i9);
                    return;
                }
            }
        }
    }

    public final void n0(boolean z10) {
        boolean z11;
        int i9;
        this.f35461s = 1;
        this.Q = 3;
        this.v = 2;
        this.f35459n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f35456c = rootDirs;
        if (rootDirs.size() > 1) {
            int i10 = this.Q;
            this.Q = i10 + 1;
            this.f35459n = i10;
        }
        int i11 = this.Q;
        this.f35462w = i11;
        this.d = i11 + 1;
        this.f35457e = i11 + 2;
        this.h = i11 + 3;
        this.Q = i11 + 5;
        this.f35458f = i11 + 4;
        DownloadController downloadController = getDownloadController();
        if (downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = this.resetDownloadRow;
        if (z11) {
            i9 = -1;
        } else {
            i9 = this.Q;
            this.Q = i9 + 1;
        }
        this.resetDownloadRow = i9;
        cu cuVar = this.f35454a;
        if (cuVar != null && !z10) {
            if (i12 < 0 && i9 >= 0) {
                cuVar.m(this.f35458f);
                this.f35454a.o(this.resetDownloadRow);
            } else if (i12 >= 0 && i9 < 0) {
                cuVar.m(this.f35458f);
                this.f35454a.u(i12);
            } else {
                z10 = true;
            }
        }
        int i13 = this.Q;
        this.f35460r = i13;
        this.O = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.P = i13 + 5;
        this.f35463x = i13 + 6;
        int i14 = i13 + 8;
        this.Q = i14;
        this.f35464y = i13 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.C = i14;
            this.Q = i13 + 10;
            this.B = i13 + 9;
        } else {
            this.B = -1;
            this.C = -1;
        }
        int i15 = this.Q;
        this.D = i15;
        this.A = -1;
        this.I = i15 + 1;
        this.useLessDataForCallsRow = i15 + 2;
        this.K = i15 + 3;
        this.L = i15 + 4;
        this.proxyRow = i15 + 5;
        this.M = i15 + 6;
        this.clearDraftsRow = i15 + 7;
        this.Q = i15 + 9;
        this.N = i15 + 8;
        cu cuVar2 = this.f35454a;
        if (cuVar2 != null && z10) {
            cuVar2.l();
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
        n0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.f44731g0 = true;
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f35455b.setPadding(0, 0, 0, i12);
        this.f35455b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        yt ytVar = new yt(this, 1);
        AndroidUtilities.runOnUIThread(ytVar, 100L);
        y6.i0(new zt(this, ytVar, System.currentTimeMillis(), 0));
        if (this.f35455b != null && this.f35454a != null) {
            for (int i9 = 0; i9 < this.f35455b.getChildCount(); i9++) {
                View childAt = this.f35455b.getChildAt(i9);
                f2.q1 T = this.f35455b.T(childAt);
                if (T != null) {
                    cu cuVar = this.f35454a;
                    this.f35455b.getClass();
                    cuVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        n0(false);
    }
}

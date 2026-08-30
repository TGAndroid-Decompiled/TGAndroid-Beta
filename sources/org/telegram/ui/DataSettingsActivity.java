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
    public lu f31577a;
    public lh.e1 f31578b;
    public ArrayList f31579c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f31580f;
    public int h;
    public int f31581n;
    private int proxyRow;
    public int f31582r;
    private int resetDownloadRow;
    public int f31583s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f31584w;
    public int f31585x;
    public int f31586y;

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
        dataSettingsActivity.f31577a.q(dataSettingsActivity.e, 4);
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
        this.f31577a = new lu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        lh.e1 e1Var = new lh.e1(this, context, 24);
        this.f31578b = e1Var;
        e1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f31578b);
        this.f31578b.setVerticalScrollBarEnabled(false);
        this.f31578b.setLayoutManager(new f2.i0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f31578b, k7.b6.e(-1, -1, 51));
        this.f31578b.setAdapter(this.f31577a);
        this.f31578b.setOnItemClickListener(new qs(2, this, context));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.f5818m = false;
        this.f31578b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f20298z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31578b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f31578b != null && this.f31577a != null) {
            for (int i11 = 0; i11 < this.f31578b.getChildCount(); i11++) {
                f2.l1 T = this.f31578b.T(this.f31578b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f31577a.v(T, i10);
                    return;
                }
            }
        }
    }

    public final void o0(boolean z4) {
        boolean z10;
        int i10;
        this.f31583s = 1;
        this.R = 3;
        this.v = 2;
        this.f31581n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f31579c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.R;
            this.R = i11 + 1;
            this.f31581n = i11;
        }
        int i12 = this.R;
        this.f31584w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.R = i12 + 5;
        this.f31580f = i12 + 4;
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
        lu luVar = this.f31577a;
        if (luVar != null && !z4) {
            if (i13 < 0 && i10 >= 0) {
                luVar.m(this.f31580f);
                this.f31577a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                luVar.m(this.f31580f);
                this.f31577a.u(i13);
            } else {
                z4 = true;
            }
        }
        int i14 = this.R;
        this.f31582r = i14;
        this.P = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.Q = i14 + 5;
        this.f31585x = i14 + 6;
        int i15 = i14 + 8;
        this.R = i15;
        this.f31586y = i14 + 7;
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
        lu luVar2 = this.f31577a;
        if (luVar2 != null && z4) {
            luVar2.l();
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
        b7.f32806h0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31578b.setPadding(0, 0, 0, i13);
        this.f31578b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        hu huVar = new hu(this, 1);
        AndroidUtilities.runOnUIThread(huVar, 100L);
        b7.j0(new iu(this, huVar, System.currentTimeMillis(), 0));
        if (this.f31578b != null && this.f31577a != null) {
            for (int i10 = 0; i10 < this.f31578b.getChildCount(); i10++) {
                View childAt = this.f31578b.getChildAt(i10);
                f2.l1 T = this.f31578b.T(childAt);
                if (T != null) {
                    lu luVar = this.f31577a;
                    this.f31578b.getClass();
                    luVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

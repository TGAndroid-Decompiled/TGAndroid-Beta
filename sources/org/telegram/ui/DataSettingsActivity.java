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
    public pu f29892a;
    public bi.y1 f29893b;
    public ArrayList f29894c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f29895f;
    public int h;
    public int f29896n;
    private int proxyRow;
    public int f29897r;
    private int resetDownloadRow;
    public int f29898s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f29899w;
    public int f29900x;
    public int f29901y;

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
        dataSettingsActivity.f29892a.q(dataSettingsActivity.e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 18));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f29892a = new pu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        bi.y1 y1Var = new bi.y1(this, context, 25);
        this.f29893b = y1Var;
        y1Var.o1();
        this.actionBar.setAdaptiveBackground(this.f29893b);
        this.f29893b.setVerticalScrollBarEnabled(false);
        this.f29893b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f29893b, w7.a6.e(-1, -1, 51));
        this.f29893b.setAdapter(this.f29892a);
        this.f29893b.setOnItemClickListener(new org.telegram.ui.Components.km(19, this, context));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.f29893b.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29893b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f29893b != null && this.f29892a != null) {
            for (int i11 = 0; i11 < this.f29893b.getChildCount(); i11++) {
                s4.c1 T = this.f29893b.T(this.f29893b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f29892a.v(T, i10);
                    return;
                }
            }
        }
    }

    public final void o0(boolean z10) {
        boolean z11;
        int i10;
        this.f29898s = 1;
        this.U = 3;
        this.v = 2;
        this.f29896n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f29894c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.U;
            this.U = i11 + 1;
            this.f29896n = i11;
        }
        int i12 = this.U;
        this.f29899w = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.U = i12 + 5;
        this.f29895f = i12 + 4;
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
        pu puVar = this.f29892a;
        if (puVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                puVar.m(this.f29895f);
                this.f29892a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                puVar.m(this.f29895f);
                this.f29892a.u(i13);
            } else {
                z10 = true;
            }
        }
        int i14 = this.U;
        this.f29897r = i14;
        this.S = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.T = i14 + 5;
        this.f29900x = i14 + 6;
        int i15 = i14 + 8;
        this.U = i15;
        this.f29901y = i14 + 7;
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
        pu puVar2 = this.f29892a;
        if (puVar2 != null && z10) {
            puVar2.l();
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
        y6.f38903k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f29893b.setPadding(0, 0, 0, i13);
        this.f29893b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ku kuVar = new ku(this, 1);
        AndroidUtilities.runOnUIThread(kuVar, 100L);
        y6.j0(new lu(this, kuVar, System.currentTimeMillis(), 0));
        if (this.f29893b != null && this.f29892a != null) {
            for (int i10 = 0; i10 < this.f29893b.getChildCount(); i10++) {
                View childAt = this.f29893b.getChildAt(i10);
                s4.c1 T = this.f29893b.T(childAt);
                if (T != null) {
                    pu puVar = this.f29892a;
                    this.f29893b.getClass();
                    puVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

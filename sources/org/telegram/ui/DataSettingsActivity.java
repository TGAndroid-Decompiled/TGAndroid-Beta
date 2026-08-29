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
    public du f35521a;
    public jh.e1 f35522b;
    public ArrayList f35523c;
    private int clearDraftsRow;
    public int d;
    public int f35524e;
    public int f35525f;
    public int h;
    public int f35526n;
    private int proxyRow;
    public int f35527r;
    private int resetDownloadRow;
    public int f35528s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;
    public int f35529w;
    public int f35530x;
    public int f35531y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.J = -1;
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
        dataSettingsActivity.f35521a.q(dataSettingsActivity.f35524e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 5));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f35521a = new du(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        jh.e1 e1Var = new jh.e1(this, context, 25);
        this.f35522b = e1Var;
        e1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35522b);
        this.f35522b.setVerticalScrollBarEnabled(false);
        this.f35522b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35522b, i7.f6.e(-1, -1, 51));
        this.f35522b.setAdapter(this.f35521a);
        this.f35522b.setOnItemClickListener(new xr(3, this, context));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.f35522b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.h5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35522b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f35522b != null && this.f35521a != null) {
            for (int i11 = 0; i11 < this.f35522b.getChildCount(); i11++) {
                f2.n1 T = this.f35522b.T(this.f35522b.getChildAt(i11));
                if (T != null && T.b() == i10) {
                    this.f35521a.v(T, i10);
                    return;
                }
            }
        }
    }

    public final void o0(boolean z10) {
        boolean z11;
        int i10;
        this.f35528s = 1;
        this.Q = 3;
        this.v = 2;
        this.f35526n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f35523c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.Q;
            this.Q = i11 + 1;
            this.f35526n = i11;
        }
        int i12 = this.Q;
        this.f35529w = i12;
        this.d = i12 + 1;
        this.f35524e = i12 + 2;
        this.h = i12 + 3;
        this.Q = i12 + 5;
        this.f35525f = i12 + 4;
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
            i10 = this.Q;
            this.Q = i10 + 1;
        }
        this.resetDownloadRow = i10;
        du duVar = this.f35521a;
        if (duVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                duVar.m(this.f35525f);
                this.f35521a.o(this.resetDownloadRow);
            } else if (i13 >= 0 && i10 < 0) {
                duVar.m(this.f35525f);
                this.f35521a.u(i13);
            } else {
                z10 = true;
            }
        }
        int i14 = this.Q;
        this.f35527r = i14;
        this.O = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.P = i14 + 5;
        this.f35530x = i14 + 6;
        int i15 = i14 + 8;
        this.Q = i15;
        this.f35531y = i14 + 7;
        if (BuildVars.DEBUG_VERSION) {
            this.C = i15;
            this.Q = i14 + 10;
            this.B = i14 + 9;
        } else {
            this.B = -1;
            this.C = -1;
        }
        int i16 = this.Q;
        this.D = i16;
        this.A = -1;
        this.I = i16 + 1;
        this.useLessDataForCallsRow = i16 + 2;
        this.K = i16 + 3;
        this.L = i16 + 4;
        this.proxyRow = i16 + 5;
        this.M = i16 + 6;
        this.clearDraftsRow = i16 + 7;
        this.Q = i16 + 9;
        this.N = i16 + 8;
        du duVar2 = this.f35521a;
        if (duVar2 != null && z10) {
            duVar2.l();
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
        x6.f44478g0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35522b.setPadding(0, 0, 0, i13);
        this.f35522b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        zt ztVar = new zt(this, 1);
        AndroidUtilities.runOnUIThread(ztVar, 100L);
        x6.j0(new au(this, ztVar, System.currentTimeMillis(), 0));
        if (this.f35522b != null && this.f35521a != null) {
            for (int i10 = 0; i10 < this.f35522b.getChildCount(); i10++) {
                View childAt = this.f35522b.getChildAt(i10);
                f2.n1 T = this.f35522b.T(childAt);
                if (T != null) {
                    du duVar = this.f35521a;
                    this.f35522b.getClass();
                    duVar.v(T, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

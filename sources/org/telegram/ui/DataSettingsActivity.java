package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadioButton;

public class DataSettingsActivity extends org.telegram.ui.ActionBar.n2 {
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

    public fu f35457a;

    public hh.f1 f35458b;

    public ArrayList f35459c;
    private int clearDraftsRow;
    public int d;

    public int f35460e;

    public int f35461f;
    public int h;

    public int f35462n;
    private int proxyRow;

    public int f35463r;
    private int resetDownloadRow;

    public int f35464s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int v;

    public int f35465w;

    public int f35466x;

    public int f35467y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.J = -1;
    }

    public static void U(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i10, float f10) {
        int i11;
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        String str2;
        String str3;
        boolean z10;
        String string;
        int i12 = dataSettingsActivity.saveToGalleryGroupsRow;
        int i13 = 4;
        int i14 = 2;
        int i15 = 1;
        if (i10 == i12 || i10 == dataSettingsActivity.saveToGalleryChannelsRow || i10 == dataSettingsActivity.saveToGalleryPeerRow) {
            if (i10 == i12) {
                i13 = 2;
            } else if (i10 != dataSettingsActivity.saveToGalleryChannelsRow) {
                i13 = 1;
            }
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(a9.p.g(i13, "type")));
                return;
            } else {
                SaveToGallerySettingsHelper.getSettings(i13).toggle();
                AndroidUtilities.updateVisibleRows(dataSettingsActivity.f35458b);
                return;
            }
        }
        final int i16 = 0;
        if (i10 == dataSettingsActivity.f35460e || i10 == dataSettingsActivity.f35461f || i10 == dataSettingsActivity.h) {
            int i17 = 2;
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                if (i10 == dataSettingsActivity.f35460e) {
                    i11 = 0;
                } else {
                    i11 = i10 == dataSettingsActivity.h ? 1 : 2;
                }
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i11));
                return;
            }
            dataSettingsActivity.f35457a.getClass();
            org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
            boolean z11 = g5Var.f24392e.h;
            if (i10 == dataSettingsActivity.f35460e) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).mobilePreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).mediumPreset;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i17 = 0;
            } else if (i10 == dataSettingsActivity.h) {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).wifiPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).highPreset;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i17 = 1;
            } else {
                preset = DownloadController.getInstance(dataSettingsActivity.currentAccount).roamingPreset;
                preset2 = DownloadController.getInstance(dataSettingsActivity.currentAccount).lowPreset;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            if (z11 || !preset.enabled) {
                preset.enabled = !preset.enabled;
            } else {
                preset.set(preset2);
            }
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
            editorEdit.putString(str, preset.toString());
            editorEdit.putInt(str2, 3);
            editorEdit.commit();
            g5Var.setChecked(!z11);
            f2.o1 o1VarG = dataSettingsActivity.f35458b.G(view);
            if (o1VarG != null) {
                dataSettingsActivity.f35457a.v(o1VarG, i10);
            }
            DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i17);
            dataSettingsActivity.o0(false);
            return;
        }
        if (i10 == dataSettingsActivity.resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string2;
            b2Var.P = LocaleController.getString(R.string.ResetAutomaticMediaDownloadAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new org.telegram.ui.ActionBar.a2(dataSettingsActivity) {

                public final DataSettingsActivity f37552b;

                {
                    this.f37552b = dataSettingsActivity;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                    switch (i16) {
                        case 0:
                            DataSettingsActivity.V(this.f37552b);
                            break;
                        default:
                            TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                            DataSettingsActivity dataSettingsActivity2 = this.f37552b;
                            dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new n(dataSettingsActivity2, 6));
                            break;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i10 == dataSettingsActivity.f35464s) {
            dataSettingsActivity.presentFragment(new z6());
            return;
        }
        float f11 = 4.0f;
        if (i10 == dataSettingsActivity.useLessDataForCallsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            int i18 = globalMainSettings.getInt("VoipDataSaving", org.telegram.ui.Components.voip.e2.c());
            if (i18 == 0) {
                i14 = 0;
            } else if (i18 != 1) {
                if (i18 == 2) {
                    i14 = 3;
                } else if (i18 != 3) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
            }
            Activity parentActivity = dataSettingsActivity.getParentActivity();
            String[] strArr = {LocaleController.getString(R.string.UseLessDataNever), LocaleController.getString(R.string.UseLessDataOnRoaming), LocaleController.getString(R.string.UseLessDataOnMobile), LocaleController.getString(R.string.UseLessDataAlways)};
            String string3 = LocaleController.getString(R.string.VoipUseLessData);
            eu euVar = new eu(dataSettingsActivity, globalMainSettings, i10);
            Pattern pattern = org.telegram.ui.Components.y4.f34802a;
            LinearLayout linearLayoutF = org.telegram.messenger.y1.f(parentActivity, 1);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
            int i19 = 0;
            while (i19 < 4) {
                org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(parentActivity, null);
                h6Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                h6Var.setTag(Integer.valueOf(i19));
                h6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                h6Var.b(strArr[i19], i14 == i19);
                linearLayoutF.addView(h6Var);
                h6Var.setOnClickListener(new org.telegram.ui.Components.q2(i15, alertDialog$Builder2, euVar));
                i19++;
                f11 = 4.0f;
            }
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.N = string3;
            alertDialog$Builder2.n(linearLayoutF);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Cancel), null);
            dataSettingsActivity.setVisibleDialog(b2Var2);
            b2Var2.show();
            return;
        }
        if (i10 == dataSettingsActivity.v) {
            dataSettingsActivity.presentFragment(new ru(null));
            return;
        }
        if (i10 != dataSettingsActivity.f35462n) {
            if (i10 == dataSettingsActivity.proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i10 == dataSettingsActivity.f35467y) {
                SharedConfig.toggleStreamMedia();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.streamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.B) {
                SharedConfig.toggleStreamAllVideo();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.streamAllVideo);
                return;
            }
            if (i10 == dataSettingsActivity.C) {
                SharedConfig.toggleStreamMkv();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.streamMkv);
                return;
            }
            if (i10 == dataSettingsActivity.A) {
                SharedConfig.toggleSaveStreamMedia();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.saveStreamMedia);
                return;
            }
            if (i10 == dataSettingsActivity.J) {
                a21 a21Var = new a21(null);
                a21Var.f36356n = new org.telegram.ui.Cells.h3[4];
                dataSettingsActivity.presentFragment(a21Var);
                return;
            }
            if (i10 == dataSettingsActivity.F) {
                SharedConfig.toggleAutoplayGifs();
                if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.isAutoplayGifs());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.G) {
                SharedConfig.toggleAutoplayVideo();
                if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.isAutoplayVideo());
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String string4 = LocaleController.getString(R.string.AreYouSureClearDraftsTitle);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                b2Var3.N = string4;
                b2Var3.P = LocaleController.getString(R.string.AreYouSureClearDrafts);
                final int i20 = 1;
                alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(dataSettingsActivity) {

                    public final DataSettingsActivity f37552b;

                    {
                        this.f37552b = dataSettingsActivity;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i110) {
                        switch (i20) {
                            case 0:
                                DataSettingsActivity.V(this.f37552b);
                                break;
                            default:
                                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                                DataSettingsActivity dataSettingsActivity2 = this.f37552b;
                                dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new n(dataSettingsActivity2, 6));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                dataSettingsActivity.showDialog(b2Var3);
                TextView textView2 = (TextView) b2Var3.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String string5 = LocaleController.getString(R.string.StoragePath);
        org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f22702a;
        b2Var4.N = string5;
        LinearLayout linearLayout = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout.setOrientation(1);
        alertDialog$Builder4.n(linearLayout);
        String absolutePath = ((File) dataSettingsActivity.f35459c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size = dataSettingsActivity.f35459c.size();
            int i21 = 0;
            while (true) {
                if (i21 >= size) {
                    str3 = absolutePath;
                    break;
                }
                String absolutePath2 = ((File) dataSettingsActivity.f35459c.get(i21)).getAbsolutePath();
                if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                    str3 = absolutePath2;
                    break;
                }
                i21++;
            }
        } else {
            str3 = absolutePath;
            break;
        }
        try {
            z10 = dataSettingsActivity.f35459c.size() != 2 || ((File) dataSettingsActivity.f35459c.get(0)).getAbsolutePath().contains("/storage/emulated/") == ((File) dataSettingsActivity.f35459c.get(1)).getAbsolutePath().contains("/storage/emulated/");
        } catch (Exception unused) {
            z10 = true;
        }
        int size2 = dataSettingsActivity.f35459c.size();
        int i22 = 0;
        while (i22 < size2) {
            File file = (File) dataSettingsActivity.f35459c.get(i22);
            int i23 = i22;
            String absolutePath3 = file.getAbsolutePath();
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            n4Var.setPadding(AndroidUtilities.dp(4.0f), i16, AndroidUtilities.dp(4.0f), i16);
            n4Var.setTag(Integer.valueOf(i23));
            boolean zContains = absolutePath3.contains("/storage/emulated/");
            if (!z10 || zContains) {
                string = zContains ? LocaleController.formatString(R.string.StoragePathFreeInternal, AndroidUtilities.formatFileSize(file.getFreeSpace())) : LocaleController.formatString(R.string.StoragePathFreeExternal, AndroidUtilities.formatFileSize(file.getFreeSpace()));
            } else {
                int i24 = R.string.StoragePathFreeValueExternal;
                Object[] objArr = new Object[i14];
                objArr[0] = AndroidUtilities.formatFileSize(file.getFreeSpace());
                objArr[1] = absolutePath3;
                string = LocaleController.formatString(i24, objArr);
            }
            n4Var.f24719b.setText(LocaleController.getString(zContains ? R.string.InternalStorage : R.string.SdCard));
            n4Var.f24720c.setText(string);
            RadioButton radioButton = n4Var.f24718a;
            radioButton.a(false, false);
            n4Var.f24721e = null;
            n4Var.d = false;
            radioButton.a(absolutePath3.startsWith(str3), false);
            n4Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 2, -1));
            linearLayout.addView(n4Var);
            n4Var.setOnClickListener(new ag.u1(dataSettingsActivity, absolutePath3, zContains, alertDialog$Builder4, 2));
            i22 = i23 + 1;
            size2 = size2;
            i14 = 2;
            i16 = 0;
        }
        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
        dataSettingsActivity.showDialog(b2Var4);
    }

    public static void V(DataSettingsActivity dataSettingsActivity) {
        DownloadController.Preset preset;
        DownloadController.Preset preset2;
        String str;
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataSettingsActivity.currentAccount).edit();
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
            editorEdit.putInt("currentMobilePreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentWifiPreset = 3;
            editorEdit.putInt("currentWifiPreset", 3);
            DownloadController.getInstance(dataSettingsActivity.currentAccount).currentRoamingPreset = 3;
            editorEdit.putInt("currentRoamingPreset", 3);
            editorEdit.putString(str, preset.toString());
        }
        editorEdit.commit();
        DownloadController.getInstance(dataSettingsActivity.currentAccount).checkAutodownloadSettings();
        for (int i11 = 0; i11 < 3; i11++) {
            DownloadController.getInstance(dataSettingsActivity.currentAccount).savePresetToServer(i11);
        }
        dataSettingsActivity.f35457a.q(dataSettingsActivity.f35460e, 4);
        dataSettingsActivity.o0(false);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.DataSettings));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 14));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f35457a = new fu(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        hh.f1 f1Var = new hh.f1(this, context, 26);
        this.f35458b = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35458b);
        this.f35458b.setVerticalScrollBarEnabled(false);
        this.f35458b.setLayoutManager(new f2.k0(1, false));
        frameLayout2.addView(this.f35458b, h7.z5.e(-1, -1, 51));
        this.f35458b.setAdapter(this.f35457a);
        this.f35458b.setOnItemClickListener(new zr(3, this, context));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.f35458b.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.g5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35458b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(int i10) {
        if (this.f35458b == null || this.f35457a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f35458b.getChildCount(); i11++) {
            f2.o1 o1VarT = this.f35458b.T(this.f35458b.getChildAt(i11));
            if (o1VarT != null && o1VarT.b() == i10) {
                this.f35457a.v(o1VarT, i10);
                return;
            }
        }
    }

    public final void o0(boolean z10) {
        int i10;
        this.f35464s = 1;
        this.Q = 3;
        this.v = 2;
        this.f35462n = -1;
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        this.f35459c = rootDirs;
        if (rootDirs.size() > 1) {
            int i11 = this.Q;
            this.Q = i11 + 1;
            this.f35462n = i11;
        }
        int i12 = this.Q;
        this.f35465w = i12;
        this.d = i12 + 1;
        this.f35460e = i12 + 2;
        this.h = i12 + 3;
        this.Q = i12 + 5;
        this.f35461f = i12 + 4;
        DownloadController downloadController = getDownloadController();
        boolean z11 = downloadController.lowPreset.equals(downloadController.getCurrentRoamingPreset()) && downloadController.lowPreset.isEnabled() == downloadController.roamingPreset.enabled && downloadController.mediumPreset.equals(downloadController.getCurrentMobilePreset()) && downloadController.mediumPreset.isEnabled() == downloadController.mobilePreset.enabled && downloadController.highPreset.equals(downloadController.getCurrentWiFiPreset()) && downloadController.highPreset.isEnabled() == downloadController.wifiPreset.enabled;
        int i13 = this.resetDownloadRow;
        if (z11) {
            i10 = -1;
        } else {
            i10 = this.Q;
            this.Q = i10 + 1;
        }
        this.resetDownloadRow = i10;
        fu fuVar = this.f35457a;
        if (fuVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                fuVar.m(this.f35461f);
                this.f35457a.o(this.resetDownloadRow);
            } else if (i13 < 0 || i10 >= 0) {
                z10 = true;
            } else {
                fuVar.m(this.f35461f);
                this.f35457a.u(i13);
            }
        }
        int i14 = this.Q;
        this.f35463r = i14;
        this.O = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.P = i14 + 5;
        this.f35466x = i14 + 6;
        int i15 = i14 + 8;
        this.Q = i15;
        this.f35467y = i14 + 7;
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
        fu fuVar2 = this.f35457a;
        if (fuVar2 == null || !z10) {
            return;
        }
        fuVar2.l();
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
        z6.f45032g0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35458b.setPadding(0, 0, 0, i13);
        this.f35458b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        bu buVar = new bu(this, 1);
        AndroidUtilities.runOnUIThread(buVar, 100L);
        z6.j0(new cu(this, buVar, System.currentTimeMillis(), 0));
        if (this.f35458b != null && this.f35457a != null) {
            for (int i10 = 0; i10 < this.f35458b.getChildCount(); i10++) {
                View childAt = this.f35458b.getChildAt(i10);
                f2.o1 o1VarT = this.f35458b.T(childAt);
                if (o1VarT != null) {
                    fu fuVar = this.f35457a;
                    this.f35458b.getClass();
                    fuVar.v(o1VarT, RecyclerView.R(childAt));
                }
            }
        }
        o0(false);
    }
}

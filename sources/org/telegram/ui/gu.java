package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gu implements org.telegram.ui.Components.vw0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.vh0, Utilities.Callback5, org.telegram.ui.Components.se0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.bm0, gg.a2, org.telegram.ui.Components.gm0, r0.n, org.telegram.ui.Components.fm0, yt, me.d, uj0 {
    public final int f38106a;
    public final Object f38107b;

    public gu(Object obj, int i10) {
        this.f38106a = i10;
        this.f38107b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ua0 ua0Var = (ua0) this.f38107b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ua0Var.f42382a.equals(defaultWindowInsets)) {
            ua0Var.f42382a = defaultWindowInsets;
            ua0Var.requestLayout();
        }
        int childCount = ua0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ua0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override
    public void U0(ut utVar) {
        vg0 vg0Var = (vg0) this.f38107b;
        vg0Var.I = true;
        String str = utVar.f42549c;
        vg0Var.f42849a.setText(str);
        vg0Var.t(str, utVar);
        vg0Var.f42859y = utVar;
        vg0Var.f42858x = 0;
        vg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + utVar.f42549c, utVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(vg0Var, 4), 300L);
        sg0 sg0Var = vg0Var.f42850b;
        sg0Var.requestFocus();
        sg0Var.setSelection(sg0Var.length());
    }

    @Override
    public a0.i V() {
        switch (this.f38106a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f38107b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        mc0 mc0Var = (mc0) this.f38107b;
        ArrayList arrayList = mc0Var.f39833s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            gc0 gc0Var = (gc0) arrayList.get(i10);
            int i11 = gc0Var.f17125a;
            int i12 = gc0Var.f37974e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && gc0Var.f37975f == 1) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                    SharedPreferences.Editor edit = globalMainSettings.edit();
                    boolean z11 = !z10;
                    edit.putBoolean("view_animations", z11);
                    SharedConfig.setAnimationsEnabled(z11);
                    edit.commit();
                    ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                }
            } else if (LiteMode.isPowerSaverApplied()) {
                mc0Var.f39829e = org.telegram.ui.Components.ad.a0(mc0Var).L(new org.telegram.ui.Components.aa(0.1f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (gc0Var.f17125a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = mc0Var.U(i12)) != -1) {
                mc0Var.f39831n[U] = !zArr[U];
                mc0Var.Y();
                mc0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                mc0Var.Y();
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f38106a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f38107b, view, i10);
            case 22:
                final lj0 lj0Var = (lj0) this.f38107b;
                if (i10 >= lj0Var.I && i10 < lj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) lj0Var.f39607x.get(i10 - lj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lj0Var.getParentActivity(), 0, lj0Var.getResourceProvider());
                    if (messageObject.isStory()) {
                        if (isUserDialog) {
                            i11 = R.string.OpenProfile;
                        } else {
                            i11 = R.string.OpenChannel2;
                        }
                        arrayList.add(LocaleController.getString(i11));
                        if (isUserDialog) {
                            i12 = R.drawable.msg_openprofile;
                        } else {
                            i12 = R.drawable.msg_channel;
                        }
                        arrayList3.add(Integer.valueOf(i12));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            org.telegram.ui.ActionBar.n2 W9;
                            org.telegram.ui.ActionBar.n2 n2Var = lj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    W9 = ProfileActivity.m4(j3);
                                } else {
                                    W9 = zn.W9(j3);
                                }
                                n2Var.presentFragment(W9);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                                n2Var.presentFragment(new zn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    lj0Var.showDialog(b2Var);
                }
                return false;
            default:
                al0 al0Var = (al0) this.f38107b;
                al0Var.getClass();
                if (view instanceof zk0) {
                    zk0 zk0Var = (zk0) view;
                    al0Var.Z(zk0Var.f44685e);
                    zk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public a0.i d0() {
        switch (this.f38106a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        vf.d dVar;
        int i12 = this.f38106a;
        Object obj = this.f38107b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                return;
            case 12:
                ((l70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                fe0 fe0Var = (fe0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", fe0Var.I);
                bundle.putString("ephone", fe0Var.J);
                bundle.putString("phoneFormated", fe0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = fe0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = fe0Var.M;
                fe0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new wd0(fe0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                oe0 oe0Var = (oe0) obj;
                wg0.n0(oe0Var.f40514y, oe0Var.f40511s, oe0Var.v, oe0Var.f40512w);
                return;
            case 19:
                hf0 hf0Var = (hf0) obj;
                wg0 wg0Var = hf0Var.E;
                wg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(hf0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.bj) obj).run();
                return;
            case 27:
                al0 al0Var = ((wk0) obj).f43700b;
                SparseArray sparseArray = al0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    yk0 yk0Var = (yk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = yk0Var.f44363e;
                    if (document != null) {
                        arrayList.add(document);
                        vf.c cVar = al0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = yk0Var.f44363e;
                        ArrayList arrayList2 = cVar.f49556e;
                        if (document2 != null) {
                            if (!cVar.f49557f) {
                                cVar.f(true);
                                cVar.f49557f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((vf.b) arrayList2.get(i14)).f49548a != null && ((vf.b) arrayList2.get(i14)).f49548a.f20044id == document2.f20044id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (yk0Var.f44365g != null && (dVar = al0Var.getMediaDataController().ringtoneUploaderHashMap.get(yk0Var.f44365g)) != null) {
                        dVar.f49560c = true;
                        dVar.a();
                        int i15 = dVar.f49558a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f49559b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (yk0Var == al0Var.H) {
                        al0Var.N = null;
                        al0Var.H = (yk0) al0Var.f35952b.get(0);
                        al0Var.I = true;
                    }
                    al0Var.f35951a.remove(yk0Var);
                    al0Var.f35953c.remove(yk0Var);
                }
                al0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20248id = tL_inputDocument;
                    tL_inputDocument.f20050id = document3.f20044id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    al0Var.getConnectionsManager().sendRequest(saveringtone, new ai.v7(8));
                }
                al0.W(al0Var);
                al0Var.c0();
                al0Var.f35955f.l();
                b2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33851c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33851c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ca) {
                            ((org.telegram.ui.Cells.ca) childAt).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E6, false));
                        } else {
                            i17++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public void g(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((hu) this.f38107b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33729c.get(i10);
        if (preset == dataAutoDownloadActivity.f33737y) {
            dataAutoDownloadActivity.f33730e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f33730e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f33730e = 2;
        } else {
            dataAutoDownloadActivity.f33730e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33731f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f33730e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f33730e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f33730e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f33730e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.d1 K = dataAutoDownloadActivity.f33728b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33727a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void h(int i10) {
        switch (this.f38106a) {
            case 11:
                a70 a70Var = (a70) this.f38107b;
                c70 c70Var = a70Var.I;
                c70Var.q0(a70Var.H);
                if (a70Var.h == null && !a70Var.f35859f.e() && a70Var.h() == 0) {
                    c70Var.f36564s.e(false, true);
                }
                a70Var.l();
                return;
            default:
                rk0 rk0Var = (rk0) this.f38107b;
                if (rk0Var.f41450f == null && !rk0Var.h.e()) {
                    rk0Var.f41451n.f33829c.c();
                }
                rk0Var.l();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.te0 te0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f38107b;
        ArrayList arrayList = ExternalActionActivity.f33749x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33756n, externalActionActivity.v, true, externalActionActivity.f33757r, externalActionActivity.f33758s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33753c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, te0Var);
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        hh0 hh0Var = (hh0) this.f38107b;
        hh0Var.getClass();
        hh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        hh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.f38107b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.f43019x.isShowing()) {
            a00Var.f43019x.d(true);
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f38107b).f33768w;
    }

    @Override
    public boolean s0(int i10) {
        switch (this.f38106a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x0(ArrayList arrayList) {
        int i10 = this.f38106a;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f38106a) {
            case 6:
                lz lzVar = (lz) this.f38107b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.p61) obj).d != 1 || lzVar.f39708b == null) {
                    return;
                }
                boolean z10 = !lzVar.f39709c;
                lzVar.f39709c = z10;
                ai.m0 m0Var = lzVar.f39711f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(lzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(lzVar.f39709c);
                lzVar.f39710e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.qm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.qm0) this.f38107b).f30216n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f38107b, (org.telegram.ui.Components.p61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f38107b).run();
        return true;
    }

    private final void b(ArrayList arrayList) {
    }

    private final void e(ArrayList arrayList) {
    }

    @Override
    public void l() {
    }

    @Override
    public void A(float f7, int i10) {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}

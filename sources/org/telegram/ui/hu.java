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
public final class hu implements org.telegram.ui.Components.tv0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.zg0, Utilities.Callback5, org.telegram.ui.Components.vd0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.el0, tf.i1, org.telegram.ui.Components.jl0, r0.o, org.telegram.ui.Components.il0, zt, xd.b, lj0 {
    public final int f34752a;
    public final Object f34753b;

    public hu(Object obj, int i10) {
        this.f34752a = i10;
        this.f34753b = obj;
    }

    @Override
    public a0.h H0() {
        switch (this.f34752a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void J1(ArrayList arrayList) {
        int i10 = this.f34752a;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        zg0 zg0Var = (zg0) this.f34753b;
        zg0Var.getClass();
        zg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        zg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        oa0 oa0Var = (oa0) this.f34753b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!oa0Var.f36708a.equals(defaultWindowInsets)) {
            oa0Var.f36708a = defaultWindowInsets;
            oa0Var.requestLayout();
        }
        int childCount = oa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(oa0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override
    public a0.h X0() {
        switch (this.f34752a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(ut utVar) {
        og0 og0Var = (og0) this.f34753b;
        og0Var.F = true;
        String str = utVar.f38915c;
        og0Var.f36796a.setText(str);
        og0Var.v(str, utVar);
        og0Var.f36805y = utVar;
        og0Var.f36804x = 0;
        og0Var.F = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + utVar.f38915c, utVar.d).apply();
        AndroidUtilities.runOnUIThread(new eg0(og0Var, 4), 300L);
        lg0 lg0Var = og0Var.f36797b;
        lg0Var.requestFocus();
        lg0Var.setSelection(lg0Var.length());
    }

    @Override
    public boolean Z0(View view) {
        switch (this.f34752a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f34753b).draw(canvas);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f34752a) {
            case 16:
                gc0 gc0Var = (gc0) this.f34753b;
                ArrayList arrayList = gc0Var.f34414s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    ac0 ac0Var = (ac0) arrayList.get(i10);
                    int i11 = ac0Var.f1830a;
                    int i12 = ac0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && ac0Var.f32549f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z4 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z10 = !z4;
                            edit.putBoolean("view_animations", z10);
                            SharedConfig.setAnimationsEnabled(z10);
                            edit.commit();
                            ((org.telegram.ui.Cells.n8) view).setChecked(z10);
                            return;
                        }
                        return;
                    } else if (LiteMode.isPowerSaverApplied()) {
                        gc0Var.e = org.telegram.ui.Components.qc.a0(gc0Var).L(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (ac0Var.f1830a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 > AndroidUtilities.dp(75.0f)) && (U = gc0Var.U(i12)) != -1) {
                        gc0Var.f34412n[U] = !zArr[U];
                        gc0Var.Y();
                        gc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        gc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                rg0.U((rg0) this.f34753b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f34752a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f34753b, view, i10);
            case 23:
                final cj0 cj0Var = (cj0) this.f34753b;
                if (i10 >= cj0Var.F && i10 < cj0Var.G) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) cj0Var.f33177x.get(i10 - cj0Var.F);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cj0Var.getParentActivity(), 0, cj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.p2 R9;
                            org.telegram.ui.ActionBar.p2 p2Var = cj0.this;
                            p2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z4 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z4) {
                                    R9 = ProfileActivity.m4(j10);
                                } else {
                                    R9 = zn.R9(j10);
                                }
                                p2Var.presentFragment(R9);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z4) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                                p2Var.presentFragment(new zn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.M = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    d2Var.N = intArray;
                    d2Var.J = onClickListener;
                    cj0Var.showDialog(d2Var);
                }
                return false;
            default:
                qk0 qk0Var = (qk0) this.f34753b;
                qk0Var.getClass();
                if (view instanceof pk0) {
                    pk0 pk0Var = (pk0) view;
                    qk0Var.Z(pk0Var.e);
                    pk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void g(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((iu) this.f34753b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31543c.get(i10);
        if (preset == dataAutoDownloadActivity.f31550y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.C) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31544f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.H, dataAutoDownloadActivity.e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            f2.l1 K = dataAutoDownloadActivity.f31542b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f31541a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.F = true;
    }

    @Override
    public void h(org.telegram.ui.Components.wd0 wd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f34753b;
        ArrayList arrayList = ExternalActionActivity.f31561x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31567n, externalActionActivity.v, true, externalActionActivity.f31568r, externalActionActivity.f31569s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31565c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, wd0Var);
    }

    @Override
    public void k(int i10) {
        switch (this.f34752a) {
            case 11:
                y60 y60Var = (y60) this.f34753b;
                a70 a70Var = y60Var.F;
                a70Var.q0(y60Var.E);
                if (y60Var.h == null && !y60Var.f40158f.e() && y60Var.h() == 0) {
                    a70Var.f32506s.e(false, true);
                }
                y60Var.l();
                return;
            default:
                ik0 ik0Var = (ik0) this.f34753b;
                if (ik0Var.f34994f == null && !ik0Var.h.e()) {
                    ik0Var.f34995n.f31638c.c();
                }
                ik0Var.l();
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        ff.f fVar;
        int i12 = this.f34752a;
        Object obj = this.f34753b;
        switch (i12) {
            case 1:
                ((i5.v) obj).run();
                return;
            case 12:
                ((i70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                ae0 ae0Var = (ae0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ae0Var.F);
                bundle.putString("ephone", ae0Var.G);
                bundle.putString("phoneFormated", ae0Var.I);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ae0Var.I;
                tL_auth_resetLoginEmail.phone_code_hash = ae0Var.J;
                ae0Var.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new rd0(ae0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                je0 je0Var = (je0) obj;
                pg0.n0(je0Var.f35261y, je0Var.f35258s, je0Var.v, je0Var.f35259w);
                return;
            case 19:
                cf0 cf0Var = (cf0) obj;
                pg0 pg0Var = cf0Var.B;
                pg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(cf0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.uj) obj).run();
                return;
            case 28:
                qk0 qk0Var = ((mk0) obj).f36128b;
                SparseArray sparseArray = qk0Var.G;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ok0 ok0Var = (ok0) sparseArray.valueAt(i13);
                    TLRPC.Document document = ok0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        ff.e eVar = qk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ok0Var.e;
                        ArrayList arrayList2 = eVar.e;
                        if (document2 != null) {
                            if (!eVar.f6113f) {
                                eVar.f(true);
                                eVar.f6113f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((ff.d) arrayList2.get(i14)).f6105a != null && ((ff.d) arrayList2.get(i14)).f6105a.f19165id == document2.f19165id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (ok0Var.f36835g != null && (fVar = qk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ok0Var.f36835g)) != null) {
                        fVar.f6116c = true;
                        fVar.a();
                        int i15 = fVar.f6114a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = fVar.f6115b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (ok0Var == qk0Var.E) {
                        qk0Var.K = null;
                        qk0Var.E = (ok0) qk0Var.f37431b.get(0);
                        qk0Var.F = true;
                    }
                    qk0Var.f37430a.remove(ok0Var);
                    qk0Var.f37432c.remove(ok0Var);
                }
                qk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f19367id = tL_inputDocument;
                    tL_inputDocument.f19171id = document3.f19165id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    qk0Var.getConnectionsManager().sendRequest(saveringtone, new nh.p5(4));
                }
                qk0.W(qk0Var);
                qk0Var.c0();
                qk0Var.f37433f.l();
                d2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31658c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f31658c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.z9) {
                            ((org.telegram.ui.Cells.z9) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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
    public void n(KeyEvent keyEvent) {
        yz yzVar = (yz) this.f34753b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && yzVar.f38622x.isShowing()) {
            yzVar.f38622x.d(true);
        }
    }

    @Override
    public void n0(View view, float f10, float f11) {
        int i10 = this.f34752a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f34753b).f31578w;
    }

    @Override
    public boolean t1(int i10) {
        switch (this.f34752a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34752a) {
            case 6:
                jz jzVar = (jz) this.f34753b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.i51) obj).d != 1 || jzVar.f35391b == null) {
                    return;
                }
                boolean z4 = !jzVar.f35392c;
                jzVar.f35392c = z4;
                dh.v vVar = jzVar.f35393f;
                if (vVar != null) {
                    vVar.run(Boolean.valueOf(z4), Boolean.valueOf(jzVar.d));
                }
                ((org.telegram.ui.Cells.r8) view).setChecked(jzVar.f35392c);
                jzVar.e.V2.N(true);
                return;
            default:
                org.telegram.ui.Components.rl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.rl0) this.f34753b).f28511m2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((i5.x) this.f34753b).run();
        return true;
    }

    private final void f(ArrayList arrayList) {
    }

    private final void i(ArrayList arrayList) {
    }

    @Override
    public void j() {
    }

    @Override
    public void z(float f10, int i10) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }
}

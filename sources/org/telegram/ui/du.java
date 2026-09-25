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
public final class du implements org.telegram.ui.Components.dw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.dh0, Utilities.Callback5, org.telegram.ui.Components.be0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.hl0, gg.b2, org.telegram.ui.Components.ml0, r0.n, org.telegram.ui.Components.ll0, vt, le.e, mj0 {
    public final int f33194a;
    public final Object f33195b;

    public du(Object obj, int i10) {
        this.f33194a = i10;
        this.f33195b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        ah0 ah0Var = (ah0) this.f33195b;
        ah0Var.getClass();
        ah0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        ah0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void F(ArrayList arrayList) {
        int i10 = this.f33194a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        qa0 qa0Var = (qa0) this.f33195b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!qa0Var.f36841a.equals(defaultWindowInsets)) {
            qa0Var.f36841a = defaultWindowInsets;
            qa0Var.requestLayout();
        }
        int childCount = qa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(qa0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(int i10) {
        switch (this.f33194a) {
            case 11:
                x60 x60Var = (x60) this.f33195b;
                z60 z60Var = x60Var.I;
                z60Var.q0(x60Var.H);
                if (x60Var.h == null && !x60Var.f39843f.e() && x60Var.h() == 0) {
                    z60Var.f40390s.e(false, true);
                }
                x60Var.l();
                return;
            default:
                kk0 kk0Var = (kk0) this.f33195b;
                if (kk0Var.f35102f == null && !kk0Var.h.e()) {
                    kk0Var.f35103n.f31153c.c();
                }
                kk0Var.l();
                return;
        }
    }

    @Override
    public void a1(qt qtVar) {
        pg0 pg0Var = (pg0) this.f33195b;
        pg0Var.I = true;
        String str = qtVar.f36984c;
        pg0Var.f36521a.setText(str);
        pg0Var.v(str, qtVar);
        pg0Var.f36530y = qtVar;
        pg0Var.f36529x = 0;
        pg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + qtVar.f36984c, qtVar.d).apply();
        AndroidUtilities.runOnUIThread(new fg0(pg0Var, 4), 300L);
        mg0 mg0Var = pg0Var.f36522b;
        mg0Var.requestFocus();
        mg0Var.setSelection(mg0Var.length());
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f33195b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f33194a) {
            case 16:
                hc0 hc0Var = (hc0) this.f33195b;
                ArrayList arrayList = hc0Var.f34191s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    bc0 bc0Var = (bc0) arrayList.get(i10);
                    int i11 = bc0Var.f15715a;
                    int i12 = bc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && bc0Var.f32386f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                            return;
                        }
                        return;
                    } else if (LiteMode.isPowerSaverApplied()) {
                        hc0Var.e = org.telegram.ui.Components.xc.a0(hc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (bc0Var.f15715a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = hc0Var.U(i12)) != -1) {
                        hc0Var.f34189n[U] = !zArr[U];
                        hc0Var.Y();
                        hc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        hc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                sg0.U((sg0) this.f33195b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f33194a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f33195b, view, i10);
            case 23:
                final dj0 dj0Var = (dj0) this.f33195b;
                if (i10 >= dj0Var.I && i10 < dj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) dj0Var.f33146x.get(i10 - dj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dj0Var.getParentActivity(), 0, dj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.m2 R9;
                            org.telegram.ui.ActionBar.m2 m2Var = dj0.this;
                            m2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j3);
                                } else {
                                    R9 = wn.R9(j3);
                                }
                                m2Var.presentFragment(R9);
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
                            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                                m2Var.presentFragment(new wn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                    a2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    a2Var.Q = intArray;
                    a2Var.M = onClickListener;
                    dj0Var.showDialog(a2Var);
                }
                return false;
            default:
                sk0 sk0Var = (sk0) this.f33195b;
                sk0Var.getClass();
                if (view instanceof rk0) {
                    rk0 rk0Var = (rk0) view;
                    sk0Var.Z(rk0Var.e);
                    rk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f33194a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.f33194a;
        Object obj = this.f33195b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                return;
            case 12:
                ((i70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                ae0 ae0Var = (ae0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ae0Var.I);
                bundle.putString("ephone", ae0Var.J);
                bundle.putString("phoneFormated", ae0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ae0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ae0Var.M;
                ae0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new rd0(ae0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                je0 je0Var = (je0) obj;
                qg0.n0(je0Var.f34788y, je0Var.f34785s, je0Var.v, je0Var.f34786w);
                return;
            case 19:
                cf0 cf0Var = (cf0) obj;
                qg0 qg0Var = cf0Var.E;
                qg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(cf0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.qj) obj).run();
                return;
            case 28:
                sk0 sk0Var = ((ok0) obj).f36261b;
                SparseArray sparseArray = sk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    qk0 qk0Var = (qk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = qk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = sk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = qk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f43984f) {
                                cVar.f(true);
                                cVar.f43984f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i14)).f43976a != null && ((uf.b) arrayList2.get(i14)).f43976a.f18342id == document2.f18342id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (qk0Var.f36940g != null && (dVar = sk0Var.getMediaDataController().ringtoneUploaderHashMap.get(qk0Var.f36940g)) != null) {
                        dVar.f43987c = true;
                        dVar.a();
                        int i15 = dVar.f43985a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f43986b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (qk0Var == sk0Var.H) {
                        sk0Var.N = null;
                        sk0Var.H = (qk0) sk0Var.f37811b.get(0);
                        sk0Var.I = true;
                    }
                    sk0Var.f37810a.remove(qk0Var);
                    sk0Var.f37812c.remove(qk0Var);
                }
                sk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18544id = tL_inputDocument;
                    tL_inputDocument.f18348id = document3.f18342id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    sk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.u7(8));
                }
                sk0.W(sk0Var);
                sk0Var.c0();
                sk0Var.f37813f.l();
                a2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31173c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f31173c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false));
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
    public void g(org.telegram.ui.Components.ce0 ce0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f33195b;
        ArrayList arrayList = ExternalActionActivity.f31076x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31082n, externalActionActivity.v, true, externalActionActivity.f31083r, externalActionActivity.f31084s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31080c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ce0Var);
    }

    @Override
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((eu) this.f33195b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31058c.get(i10);
        if (preset == dataAutoDownloadActivity.f31065y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31059f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.c1 K = dataAutoDownloadActivity.f31057b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f31056a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public a0.i i() {
        switch (this.f33194a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public a0.i o() {
        switch (this.f33194a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        wz wzVar = (wz) this.f33195b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && wzVar.f37550x.isShowing()) {
            wzVar.f37550x.d(true);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f33194a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f33195b).f31093w;
    }

    @Override
    public boolean s(int i10) {
        switch (this.f33194a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f33194a) {
            case 6:
                iz izVar = (iz) this.f33195b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.v51) obj).d != 1 || izVar.f34604b == null) {
                    return;
                }
                boolean z10 = !izVar.f34605c;
                izVar.f34605c = z10;
                ai.m0 m0Var = izVar.f34606f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(izVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(izVar.f34605c);
                izVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.wl0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.wl0) this.f33195b).f30115p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f33195b).run();
        return true;
    }

    private final void k(ArrayList arrayList) {
    }

    private final void l(ArrayList arrayList) {
    }

    @Override
    public void n() {
    }

    @Override
    public void C(float f7, int i10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }
}

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
public final class eu implements org.telegram.ui.Components.sv0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.tg0, Utilities.Callback5, org.telegram.ui.Components.rd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.xk0, gg.b2, org.telegram.ui.Components.cl0, r0.n, org.telegram.ui.Components.bl0, wt, le.e, nj0 {
    public final int f33020a;
    public final Object f33021b;

    public eu(Object obj, int i10) {
        this.f33020a = i10;
        this.f33021b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        bh0 bh0Var = (bh0) this.f33021b;
        bh0Var.getClass();
        bh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        bh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public a0.i F() {
        switch (this.f33020a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean O(int i10) {
        switch (this.f33020a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void Q(ArrayList arrayList) {
        int i10 = this.f33020a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ra0 ra0Var = (ra0) this.f33021b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ra0Var.f36749a.equals(defaultWindowInsets)) {
            ra0Var.f36749a = defaultWindowInsets;
            ra0Var.requestLayout();
        }
        int childCount = ra0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ra0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f33021b).draw(canvas);
    }

    @Override
    public void a1(st stVar) {
        qg0 qg0Var = (qg0) this.f33021b;
        qg0Var.I = true;
        String str = stVar.f37417c;
        qg0Var.f36422a.setText(str);
        qg0Var.v(str, stVar);
        qg0Var.f36431y = stVar;
        qg0Var.f36430x = 0;
        qg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + stVar.f37417c, stVar.d).apply();
        AndroidUtilities.runOnUIThread(new gg0(qg0Var, 4), 300L);
        ng0 ng0Var = qg0Var.f36423b;
        ng0Var.requestFocus();
        ng0Var.setSelection(ng0Var.length());
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f33020a) {
            case 16:
                ic0 ic0Var = (ic0) this.f33021b;
                ArrayList arrayList = ic0Var.f34108s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    cc0 cc0Var = (cc0) arrayList.get(i10);
                    int i11 = cc0Var.f15508a;
                    int i12 = cc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && cc0Var.f32308f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                            return;
                        }
                        return;
                    } else if (LiteMode.isPowerSaverApplied()) {
                        ic0Var.e = org.telegram.ui.Components.xc.a0(ic0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (cc0Var.f15508a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = ic0Var.U(i12)) != -1) {
                        ic0Var.f34106n[U] = !zArr[U];
                        ic0Var.Y();
                        ic0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        ic0Var.Y();
                        return;
                    }
                }
                return;
            default:
                tg0.U((tg0) this.f33021b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f33020a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f33021b, view, i10);
            case 23:
                final ej0 ej0Var = (ej0) this.f33021b;
                if (i10 >= ej0Var.I && i10 < ej0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) ej0Var.f32957x.get(i10 - ej0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ej0Var.getParentActivity(), 0, ej0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.n2 R9;
                            org.telegram.ui.ActionBar.n2 n2Var = ej0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j3);
                                } else {
                                    R9 = xn.R9(j3);
                                }
                                n2Var.presentFragment(R9);
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
                                n2Var.presentFragment(new xn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    ej0Var.showDialog(b2Var);
                }
                return false;
            default:
                sk0 sk0Var = (sk0) this.f33021b;
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
        switch (this.f33020a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.f33020a;
        Object obj = this.f33021b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                return;
            case 12:
                ((k70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                be0 be0Var = (be0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", be0Var.I);
                bundle.putString("ephone", be0Var.J);
                bundle.putString("phoneFormated", be0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = be0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = be0Var.M;
                be0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new sd0(be0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                ke0 ke0Var = (ke0) obj;
                rg0.n0(ke0Var.f34697y, ke0Var.f34694s, ke0Var.v, ke0Var.f34695w);
                return;
            case 19:
                df0 df0Var = (df0) obj;
                rg0 rg0Var = df0Var.E;
                rg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(df0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.rj) obj).run();
                return;
            case 28:
                sk0 sk0Var = ((ok0) obj).f35905b;
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
                            if (!cVar.f43646f) {
                                cVar.f(true);
                                cVar.f43646f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i14)).f43638a != null && ((uf.b) arrayList2.get(i14)).f43638a.f18089id == document2.f18089id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (qk0Var.f36468g != null && (dVar = sk0Var.getMediaDataController().ringtoneUploaderHashMap.get(qk0Var.f36468g)) != null) {
                        dVar.f43649c = true;
                        dVar.a();
                        int i15 = dVar.f43647a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f43648b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (qk0Var == sk0Var.H) {
                        sk0Var.N = null;
                        sk0Var.H = (qk0) sk0Var.f37318b.get(0);
                        sk0Var.I = true;
                    }
                    sk0Var.f37317a.remove(qk0Var);
                    sk0Var.f37319c.remove(qk0Var);
                }
                sk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18291id = tL_inputDocument;
                    tL_inputDocument.f18095id = document3.f18089id;
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
                sk0Var.f37320f.l();
                b2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f30857c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f30857c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.fa) {
                            ((org.telegram.ui.Cells.fa) childAt).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false));
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((fu) this.f33021b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f30742c.get(i10);
        if (preset == dataAutoDownloadActivity.f30749y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f30743f;
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
            s4.c1 K = dataAutoDownloadActivity.f30741b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f30740a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void h(int i10) {
        switch (this.f33020a) {
            case 11:
                z60 z60Var = (z60) this.f33021b;
                b70 b70Var = z60Var.I;
                b70Var.q0(z60Var.H);
                if (z60Var.h == null && !z60Var.f39994f.e() && z60Var.h() == 0) {
                    b70Var.f32006s.e(false, true);
                }
                z60Var.l();
                return;
            default:
                kk0 kk0Var = (kk0) this.f33021b;
                if (kk0Var.f34741f == null && !kk0Var.h.e()) {
                    kk0Var.f34742n.f30837c.c();
                }
                kk0Var.l();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f33021b;
        ArrayList arrayList = ExternalActionActivity.f30760x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f30766n, externalActionActivity.v, true, externalActionActivity.f30767r, externalActionActivity.f30768s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f30764c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        xz xzVar = (xz) this.f33021b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && xzVar.f37472x.isShowing()) {
            xzVar.f37472x.d(true);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f33020a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f33021b).f30777w;
    }

    @Override
    public a0.i w() {
        switch (this.f33020a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f33020a) {
            case 6:
                jz jzVar = (jz) this.f33021b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.h51) obj).d != 1 || jzVar.f34532b == null) {
                    return;
                }
                boolean z10 = !jzVar.f34533c;
                jzVar.f34533c = z10;
                ai.m0 m0Var = jzVar.f34534f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(jzVar.d));
                }
                ((org.telegram.ui.Cells.x8) view).setChecked(jzVar.f34533c);
                jzVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.ml0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.ml0) this.f33021b).f26222p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f33021b).run();
        return true;
    }

    private final void j(ArrayList arrayList) {
    }

    private final void k(ArrayList arrayList) {
    }

    @Override
    public void l() {
    }

    @Override
    public void C(float f7, int i10) {
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}

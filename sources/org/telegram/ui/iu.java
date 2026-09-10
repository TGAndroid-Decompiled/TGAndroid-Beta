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
public final class iu implements org.telegram.ui.Components.dw0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.ch0, Utilities.Callback5, org.telegram.ui.Components.ae0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.gl0, fg.c2, org.telegram.ui.Components.ll0, r0.n, org.telegram.ui.Components.kl0, au, le.d, uj0 {
    public final int f33797a;
    public final Object f33798b;

    public iu(Object obj, int i10) {
        this.f33797a = i10;
        this.f33798b = obj;
    }

    @Override
    public a0.i D() {
        switch (this.f33797a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        hh0 hh0Var = (hh0) this.f33798b;
        hh0Var.getClass();
        hh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        hh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public a0.i P() {
        switch (this.f33797a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        va0 va0Var = (va0) this.f33798b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!va0Var.f37513a.equals(defaultWindowInsets)) {
            va0Var.f37513a = defaultWindowInsets;
            va0Var.requestLayout();
        }
        int childCount = va0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(va0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(int i10) {
        switch (this.f33797a) {
            case 11:
                c70 c70Var = (c70) this.f33798b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f31549f.e() && c70Var.h() == 0) {
                    e70Var.f32100s.e(false, true);
                }
                c70Var.l();
                return;
            default:
                sk0 sk0Var = (sk0) this.f33798b;
                if (sk0Var.f36717f == null && !sk0Var.h.e()) {
                    sk0Var.f36718n.f29979c.c();
                }
                sk0Var.l();
                return;
        }
    }

    @Override
    public void a1(wt wtVar) {
        wg0 wg0Var = (wg0) this.f33798b;
        wg0Var.I = true;
        String str = wtVar.f38388c;
        wg0Var.f38179a.setText(str);
        wg0Var.v(str, wtVar);
        wg0Var.f38188y = wtVar;
        wg0Var.f38187x = 0;
        wg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + wtVar.f38388c, wtVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(wg0Var, 4), 300L);
        tg0 tg0Var = wg0Var.f38180b;
        tg0Var.requestFocus();
        tg0Var.setSelection(tg0Var.length());
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f33798b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f33797a) {
            case 16:
                nc0 nc0Var = (nc0) this.f33798b;
                ArrayList arrayList = nc0Var.f35215s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    hc0 hc0Var = (hc0) arrayList.get(i10);
                    int i11 = hc0Var.f14046a;
                    int i12 = hc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && hc0Var.f33345f == 1) {
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
                        nc0Var.e = org.telegram.ui.Components.wc.a0(nc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (hc0Var.f14046a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = nc0Var.U(i12)) != -1) {
                        nc0Var.f35213n[U] = !zArr[U];
                        nc0Var.Y();
                        nc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        nc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                zg0.U((zg0) this.f33798b, i10);
                return;
        }
    }

    @Override
    public boolean c0(int i10) {
        switch (this.f33797a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f33797a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f33798b, view, i10);
            case 23:
                final kj0 kj0Var = (kj0) this.f33798b;
                if (i10 >= kj0Var.I && i10 < kj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) kj0Var.f34397x.get(i10 - kj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kj0Var.getParentActivity(), 0, kj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.p2 p2Var = kj0.this;
                            p2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j3);
                                } else {
                                    R9 = eo.R9(j3);
                                }
                                p2Var.presentFragment(R9);
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
                            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                                p2Var.presentFragment(new eo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    d2Var.Q = intArray;
                    d2Var.M = onClickListener;
                    kj0Var.showDialog(d2Var);
                }
                return false;
            default:
                al0 al0Var = (al0) this.f33798b;
                al0Var.getClass();
                if (view instanceof zk0) {
                    zk0 zk0Var = (zk0) view;
                    al0Var.Z(zk0Var.e);
                    zk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f33797a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        tf.d dVar;
        int i12 = this.f33797a;
        Object obj = this.f33798b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                return;
            case 12:
                ((m70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                ge0 ge0Var = (ge0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ge0Var.I);
                bundle.putString("ephone", ge0Var.J);
                bundle.putString("phoneFormated", ge0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ge0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ge0Var.M;
                ge0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new xd0(ge0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                pe0 pe0Var = (pe0) obj;
                xg0.n0(pe0Var.f35807y, pe0Var.f35804s, pe0Var.v, pe0Var.f35805w);
                return;
            case 19:
                if0 if0Var = (if0) obj;
                xg0 xg0Var = if0Var.E;
                xg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(if0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.ak) obj).run();
                return;
            case 28:
                al0 al0Var = ((wk0) obj).f38237b;
                SparseArray sparseArray = al0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    yk0 yk0Var = (yk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = yk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        tf.c cVar = al0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = yk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f42133f) {
                                cVar.f(true);
                                cVar.f42133f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((tf.b) arrayList2.get(i14)).f42125a != null && ((tf.b) arrayList2.get(i14)).f42125a.f17201id == document2.f17201id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (yk0Var.f39022g != null && (dVar = al0Var.getMediaDataController().ringtoneUploaderHashMap.get(yk0Var.f39022g)) != null) {
                        dVar.f42136c = true;
                        dVar.a();
                        int i15 = dVar.f42134a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f42135b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (yk0Var == al0Var.H) {
                        al0Var.N = null;
                        al0Var.H = (yk0) al0Var.f31028b.get(0);
                        al0Var.I = true;
                    }
                    al0Var.f31027a.remove(yk0Var);
                    al0Var.f31029c.remove(yk0Var);
                }
                al0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f17408id = tL_inputDocument;
                    tL_inputDocument.f17207id = document3.f17201id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    al0Var.getConnectionsManager().sendRequest(saveringtone, new bi.g1(4));
                }
                al0.W(al0Var);
                al0Var.c0();
                al0Var.f31030f.l();
                d2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f29999c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f29999c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ga) {
                            ((org.telegram.ui.Cells.ga) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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
    public void g(org.telegram.ui.Components.be0 be0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f33798b;
        ArrayList arrayList = ExternalActionActivity.f29902x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f29908n, externalActionActivity.v, true, externalActionActivity.f29909r, externalActionActivity.f29910s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f29906c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, be0Var);
    }

    @Override
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ju) this.f33798b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f29884c.get(i10);
        if (preset == dataAutoDownloadActivity.f29891y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f29885f;
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
            s4.c1 K = dataAutoDownloadActivity.f29883b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f29882a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void k0(ArrayList arrayList) {
        int i10 = this.f33797a;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        c00 c00Var = (c00) this.f33798b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && c00Var.f38850x.isShowing()) {
            c00Var.f38850x.d(true);
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f33797a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f33798b).f29919w;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f33797a) {
            case 6:
                oz ozVar = (oz) this.f33798b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.v51) obj).d != 1 || ozVar.f35647b == null) {
                    return;
                }
                boolean z10 = !ozVar.f35648c;
                ozVar.f35648c = z10;
                bi.k6 k6Var = ozVar.f35649f;
                if (k6Var != null) {
                    k6Var.run(Boolean.valueOf(z10), Boolean.valueOf(ozVar.d));
                }
                ((org.telegram.ui.Cells.x8) view).setChecked(ozVar.f35648c);
                ozVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.vl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.vl0) this.f33798b).f27987p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f33798b).run();
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
    public void B(float f7, int i10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void i(View view, float f7, float f10) {
    }
}

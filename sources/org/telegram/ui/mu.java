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
public final class mu implements org.telegram.ui.Components.rw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.th0, Utilities.Callback5, org.telegram.ui.Components.qe0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.xl0, hg.z1, org.telegram.ui.Components.cm0, r0.o, org.telegram.ui.Components.bm0, eu, ne.d, zj0 {
    public final int f38347a;
    public final Object f38348b;

    public mu(Object obj, int i10) {
        this.f38347a = i10;
        this.f38348b = obj;
    }

    @Override
    public void I0(ArrayList arrayList) {
        int i10 = this.f38347a;
    }

    @Override
    public a0.h K() {
        switch (this.f38347a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        za0 za0Var = (za0) this.f38348b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!za0Var.f42579a.equals(defaultWindowInsets)) {
            za0Var.f42579a = defaultWindowInsets;
            za0Var.requestLayout();
        }
        int childCount = za0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(za0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        int i12;
        switch (this.f38347a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f38348b, view, i10);
            case 22:
                final qj0 qj0Var = (qj0) this.f38348b;
                if (i10 >= qj0Var.I && i10 < qj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) qj0Var.f39482x.get(i10 - qj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qj0Var.getParentActivity(), 0, qj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.m2 W9;
                            org.telegram.ui.ActionBar.m2 m2Var = qj0.this;
                            m2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    W9 = ProfileActivity.m4(j10);
                                } else {
                                    W9 = fo.W9(j10);
                                }
                                m2Var.presentFragment(W9);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                                m2Var.presentFragment(new fo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    a2Var.Q = intArray;
                    a2Var.M = onClickListener;
                    qj0Var.showDialog(a2Var);
                }
                return false;
            default:
                fl0 fl0Var = (fl0) this.f38348b;
                fl0Var.getClass();
                if (view instanceof el0) {
                    el0 el0Var = (el0) view;
                    fl0Var.Z(el0Var.e);
                    el0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void a1(au auVar) {
        ah0 ah0Var = (ah0) this.f38348b;
        ah0Var.I = true;
        String str = auVar.f34341c;
        ah0Var.f34215a.setText(str);
        ah0Var.t(str, auVar);
        ah0Var.f34224y = auVar;
        ah0Var.f34223x = 0;
        ah0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + auVar.f34341c, auVar.d).apply();
        AndroidUtilities.runOnUIThread(new qg0(ah0Var, 4), 300L);
        xg0 xg0Var = ah0Var.f34216b;
        xg0Var.requestFocus();
        xg0Var.setSelection(xg0Var.length());
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f38348b).draw(canvas);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        rc0 rc0Var = (rc0) this.f38348b;
        ArrayList arrayList = rc0Var.f39763s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            lc0 lc0Var = (lc0) arrayList.get(i10);
            int i11 = lc0Var.f43203a;
            int i12 = lc0Var.e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && lc0Var.f37917f == 1) {
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
                rc0Var.e = org.telegram.ui.Components.zc.a0(rc0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (lc0Var.f43203a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = rc0Var.U(i12)) != -1) {
                rc0Var.f39761n[U] = !zArr[U];
                rc0Var.Y();
                rc0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                rc0Var.Y();
            }
        }
    }

    @Override
    public void f(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((nu) this.f38348b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f32060c.get(i10);
        if (preset == dataAutoDownloadActivity.f32067y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f32061f;
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
            s4.b1 K = dataAutoDownloadActivity.f32059b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f32058a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.f38347a;
        Object obj = this.f38348b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                return;
            case 12:
                ((s70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                le0 le0Var = (le0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", le0Var.I);
                bundle.putString("ephone", le0Var.J);
                bundle.putString("phoneFormated", le0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = le0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = le0Var.M;
                le0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ce0(le0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                ue0 ue0Var = (ue0) obj;
                bh0.n0(ue0Var.f40665y, ue0Var.f40662s, ue0Var.v, ue0Var.f40663w);
                return;
            case 19:
                nf0 nf0Var = (nf0) obj;
                bh0 bh0Var = nf0Var.E;
                bh0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(nf0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.ej) obj).run();
                return;
            case 27:
                fl0 fl0Var = ((bl0) obj).f34595b;
                SparseArray sparseArray = fl0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    dl0 dl0Var = (dl0) sparseArray.valueAt(i13);
                    TLRPC.Document document = dl0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = fl0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = dl0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f47551f) {
                                cVar.f(true);
                                cVar.f47551f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i14)).f47543a != null && ((wf.b) arrayList2.get(i14)).f47543a.f19222id == document2.f19222id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (dl0Var.f35327g != null && (dVar = fl0Var.getMediaDataController().ringtoneUploaderHashMap.get(dl0Var.f35327g)) != null) {
                        dVar.f47554c = true;
                        dVar.a();
                        int i15 = dVar.f47552a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f47553b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (dl0Var == fl0Var.H) {
                        fl0Var.N = null;
                        fl0Var.H = (dl0) fl0Var.f35853b.get(0);
                        fl0Var.I = true;
                    }
                    fl0Var.f35852a.remove(dl0Var);
                    fl0Var.f35854c.remove(dl0Var);
                }
                fl0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f19424id = tL_inputDocument;
                    tL_inputDocument.f19228id = document3.f19222id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    fl0Var.getConnectionsManager().sendRequest(saveringtone, new bi.g7(8));
                }
                fl0.W(fl0Var);
                fl0Var.c0();
                fl0Var.f35855f.l();
                a2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f32175c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f32175c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ca) {
                            ((org.telegram.ui.Cells.ca) childAt).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E6, false));
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
    public void i(org.telegram.ui.Components.re0 re0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f38348b;
        ArrayList arrayList = ExternalActionActivity.f32078x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f32084n, externalActionActivity.v, true, externalActionActivity.f32085r, externalActionActivity.f32086s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f32082c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, re0Var);
    }

    @Override
    public a0.h j0() {
        switch (this.f38347a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void k(int i10) {
        switch (this.f38347a) {
            case 11:
                h70 h70Var = (h70) this.f38348b;
                j70 j70Var = h70Var.I;
                j70Var.q0(h70Var.H);
                if (h70Var.h == null && !h70Var.f36634f.e() && h70Var.h() == 0) {
                    j70Var.f37292s.e(false, true);
                }
                h70Var.l();
                return;
            default:
                wk0 wk0Var = (wk0) this.f38348b;
                if (wk0Var.f41613f == null && !wk0Var.h.e()) {
                    wk0Var.f41614n.f32155c.c();
                }
                wk0Var.l();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        f00 f00Var = (f00) this.f38348b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f00Var.f34008x.isShowing()) {
            f00Var.f34008x.d(true);
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        mh0 mh0Var = (mh0) this.f38348b;
        mh0Var.getClass();
        mh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        mh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f38348b).f32095w;
    }

    @Override
    public boolean t0(int i10) {
        switch (this.f38347a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f38347a) {
            case 6:
                qz qzVar = (qz) this.f38348b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.l61) obj).d != 1 || qzVar.f39559b == null) {
                    return;
                }
                boolean z10 = !qzVar.f39560c;
                qzVar.f39560c = z10;
                bi.f0 f0Var = qzVar.f39561f;
                if (f0Var != null) {
                    f0Var.run(Boolean.valueOf(z10), Boolean.valueOf(qzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(qzVar.f39560c);
                qzVar.e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.mm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.mm0) this.f38348b).f27439n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f38348b, (org.telegram.ui.Components.l61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f38348b).run();
        return true;
    }

    private final void c(ArrayList arrayList) {
    }

    private final void e(ArrayList arrayList) {
    }

    @Override
    public void m() {
    }

    @Override
    public void C(float f7, int i10) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}

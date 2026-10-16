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
public final class mu implements org.telegram.ui.Components.rw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.th0, Utilities.Callback5, org.telegram.ui.Components.qe0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.xl0, hg.z1, org.telegram.ui.Components.cm0, r0.n, org.telegram.ui.Components.bm0, eu, ne.d, yj0 {
    public final int f38071a;
    public final Object f38072b;

    public mu(Object obj, int i10) {
        this.f38071a = i10;
        this.f38072b = obj;
    }

    @Override
    public boolean E0(int i10) {
        switch (this.f38071a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public a0.h K() {
        switch (this.f38071a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void O0(ArrayList arrayList) {
        int i10 = this.f38071a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ya0 ya0Var = (ya0) this.f38072b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ya0Var.f41794a.equals(defaultWindowInsets)) {
            ya0Var.f41794a = defaultWindowInsets;
            ya0Var.requestLayout();
        }
        int childCount = ya0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ya0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void Z0(au auVar) {
        zg0 zg0Var = (zg0) this.f38072b;
        zg0Var.I = true;
        String str = auVar.f34086c;
        zg0Var.f42309a.setText(str);
        zg0Var.t(str, auVar);
        zg0Var.f42318y = auVar;
        zg0Var.f42317x = 0;
        zg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + auVar.f34086c, auVar.d).apply();
        AndroidUtilities.runOnUIThread(new pg0(zg0Var, 4), 300L);
        wg0 wg0Var = zg0Var.f42310b;
        wg0Var.requestFocus();
        wg0Var.setSelection(wg0Var.length());
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        int i12;
        switch (this.f38071a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f38072b, view, i10);
            case 22:
                final pj0 pj0Var = (pj0) this.f38072b;
                if (i10 >= pj0Var.I && i10 < pj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) pj0Var.f38959x.get(i10 - pj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pj0Var.getParentActivity(), 0, pj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.m2 m2Var = pj0.this;
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
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    a2Var.Q = intArray;
                    a2Var.M = onClickListener;
                    pj0Var.showDialog(a2Var);
                }
                return false;
            default:
                el0 el0Var = (el0) this.f38072b;
                el0Var.getClass();
                if (view instanceof dl0) {
                    dl0 dl0Var = (dl0) view;
                    el0Var.Z(dl0Var.e);
                    dl0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f38072b).draw(canvas);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        qc0 qc0Var = (qc0) this.f38072b;
        ArrayList arrayList = qc0Var.f39108s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            kc0 kc0Var = (kc0) arrayList.get(i10);
            int i11 = kc0Var.f42904a;
            int i12 = kc0Var.e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && kc0Var.f37347f == 1) {
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
                qc0Var.e = org.telegram.ui.Components.zc.a0(qc0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (kc0Var.f42904a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = qc0Var.U(i12)) != -1) {
                qc0Var.f39106n[U] = !zArr[U];
                qc0Var.Y();
                qc0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                qc0Var.Y();
            }
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f38071a) {
            case 11:
                h70 h70Var = (h70) this.f38072b;
                j70 j70Var = h70Var.I;
                j70Var.q0(h70Var.H);
                if (h70Var.h == null && !h70Var.f36424f.e() && h70Var.h() == 0) {
                    j70Var.f36962s.e(false, true);
                }
                h70Var.l();
                return;
            default:
                vk0 vk0Var = (vk0) this.f38072b;
                if (vk0Var.f40725f == null && !vk0Var.h.e()) {
                    vk0Var.f40726n.f31857c.c();
                }
                vk0Var.l();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.f38071a;
        Object obj = this.f38072b;
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
                je0 je0Var = (je0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", je0Var.I);
                bundle.putString("ephone", je0Var.J);
                bundle.putString("phoneFormated", je0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = je0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = je0Var.M;
                je0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ae0(je0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                te0 te0Var = (te0) obj;
                ah0.n0(te0Var.f40095y, te0Var.f40092s, te0Var.v, te0Var.f40093w);
                return;
            case 19:
                mf0 mf0Var = (mf0) obj;
                ah0 ah0Var = mf0Var.E;
                ah0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(mf0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.ej) obj).run();
                return;
            case 27:
                el0 el0Var = ((al0) obj).f33986b;
                SparseArray sparseArray = el0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    cl0 cl0Var = (cl0) sparseArray.valueAt(i13);
                    TLRPC.Document document = cl0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = el0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = cl0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f47550f) {
                                cVar.f(true);
                                cVar.f47550f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i14)).f47542a != null && ((wf.b) arrayList2.get(i14)).f47542a.f18922id == document2.f18922id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (cl0Var.f34729g != null && (dVar = el0Var.getMediaDataController().ringtoneUploaderHashMap.get(cl0Var.f34729g)) != null) {
                        dVar.f47553c = true;
                        dVar.a();
                        int i15 = dVar.f47551a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f47552b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (cl0Var == el0Var.H) {
                        el0Var.N = null;
                        el0Var.H = (cl0) el0Var.f35323b.get(0);
                        el0Var.I = true;
                    }
                    el0Var.f35322a.remove(cl0Var);
                    el0Var.f35324c.remove(cl0Var);
                }
                el0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f19124id = tL_inputDocument;
                    tL_inputDocument.f18928id = document3.f18922id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    el0Var.getConnectionsManager().sendRequest(saveringtone, new bi.g7(8));
                }
                el0.W(el0Var);
                el0Var.c0();
                el0Var.f35325f.l();
                a2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31877c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f31877c.getChildAt(i17);
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
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((nu) this.f38072b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31762c.get(i10);
        if (preset == dataAutoDownloadActivity.f31769y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31763f;
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
            s4.b1 K = dataAutoDownloadActivity.f31761b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f31760a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void i(org.telegram.ui.Components.re0 re0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f38072b;
        ArrayList arrayList = ExternalActionActivity.f31780x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31786n, externalActionActivity.v, true, externalActionActivity.f31787r, externalActionActivity.f31788s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31784c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, re0Var);
    }

    @Override
    public a0.h k0() {
        switch (this.f38071a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        f00 f00Var = (f00) this.f38072b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f00Var.f33711x.isShowing()) {
            f00Var.f33711x.d(true);
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        lh0 lh0Var = (lh0) this.f38072b;
        lh0Var.getClass();
        lh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        lh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f38072b).f31797w;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f38071a) {
            case 6:
                qz qzVar = (qz) this.f38072b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.m61) obj).d != 1 || qzVar.f39242b == null) {
                    return;
                }
                boolean z10 = !qzVar.f39243c;
                qzVar.f39243c = z10;
                bi.f0 f0Var = qzVar.f39244f;
                if (f0Var != null) {
                    f0Var.run(Boolean.valueOf(z10), Boolean.valueOf(qzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(qzVar.f39243c);
                qzVar.e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.mm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.mm0) this.f38072b).f27148n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f38072b, (org.telegram.ui.Components.m61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f38072b).run();
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
    public void A(float f7, int i10) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}

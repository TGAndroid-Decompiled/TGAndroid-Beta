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
public final class hu implements org.telegram.ui.Components.sv0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.sg0, Utilities.Callback5, org.telegram.ui.Components.rd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.wk0, gg.b2, org.telegram.ui.Components.bl0, r0.n, org.telegram.ui.Components.al0, zt, le.d, tj0 {
    public final int f34356a;
    public final Object f34357b;

    public hu(Object obj, int i10) {
        this.f34356a = i10;
        this.f34357b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        gh0 gh0Var = (gh0) this.f34357b;
        gh0Var.getClass();
        gh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        gh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public a0.i F() {
        switch (this.f34356a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean O(int i10) {
        switch (this.f34356a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void Q(ArrayList arrayList) {
        int i10 = this.f34356a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        wa0 wa0Var = (wa0) this.f34357b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!wa0Var.f38760a.equals(defaultWindowInsets)) {
            wa0Var.f38760a = defaultWindowInsets;
            wa0Var.requestLayout();
        }
        int childCount = wa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(wa0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f34357b).draw(canvas);
    }

    @Override
    public void a1(vt vtVar) {
        vg0 vg0Var = (vg0) this.f34357b;
        vg0Var.I = true;
        String str = vtVar.f38618c;
        vg0Var.f38531a.setText(str);
        vg0Var.v(str, vtVar);
        vg0Var.f38540y = vtVar;
        vg0Var.f38539x = 0;
        vg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + vtVar.f38618c, vtVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(vg0Var, 4), 300L);
        sg0 sg0Var = vg0Var.f38532b;
        sg0Var.requestFocus();
        sg0Var.setSelection(sg0Var.length());
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f34356a) {
            case 16:
                nc0 nc0Var = (nc0) this.f34357b;
                ArrayList arrayList = nc0Var.f35958s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    hc0 hc0Var = (hc0) arrayList.get(i10);
                    int i11 = hc0Var.f15531a;
                    int i12 = hc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && hc0Var.f34218f == 1) {
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
                        nc0Var.e = org.telegram.ui.Components.vc.a0(nc0Var).L(new org.telegram.ui.Components.w9(0.1f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (hc0Var.f15531a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = nc0Var.U(i12)) != -1) {
                        nc0Var.f35956n[U] = !zArr[U];
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
                yg0.U((yg0) this.f34357b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f34356a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f34357b, view, i10);
            case 23:
                final jj0 jj0Var = (jj0) this.f34357b;
                if (i10 >= jj0Var.I && i10 < jj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) jj0Var.f34935x.get(i10 - jj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jj0Var.getParentActivity(), 0, jj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.n2 n2Var = jj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j3);
                                } else {
                                    R9 = bo.R9(j3);
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
                                n2Var.presentFragment(new bo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    jj0Var.showDialog(b2Var);
                }
                return false;
            default:
                yk0 yk0Var = (yk0) this.f34357b;
                yk0Var.getClass();
                if (view instanceof xk0) {
                    xk0 xk0Var = (xk0) view;
                    yk0Var.Z(xk0Var.e);
                    xk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f34356a) {
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
        int i12 = this.f34356a;
        Object obj = this.f34357b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                return;
            case 12:
                ((n70) obj).U(true);
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
                wg0.n0(pe0Var.f36554y, pe0Var.f36551s, pe0Var.v, pe0Var.f36552w);
                return;
            case 19:
                if0 if0Var = (if0) obj;
                wg0 wg0Var = if0Var.E;
                wg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(if0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.sj) obj).run();
                return;
            case 28:
                yk0 yk0Var = ((uk0) obj).f38064b;
                SparseArray sparseArray = yk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    wk0 wk0Var = (wk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = wk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = yk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = wk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f43694f) {
                                cVar.f(true);
                                cVar.f43694f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i14)).f43686a != null && ((uf.b) arrayList2.get(i14)).f43686a.f18115id == document2.f18115id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (wk0Var.f39252g != null && (dVar = yk0Var.getMediaDataController().ringtoneUploaderHashMap.get(wk0Var.f39252g)) != null) {
                        dVar.f43697c = true;
                        dVar.a();
                        int i15 = dVar.f43695a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f43696b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (wk0Var == yk0Var.H) {
                        yk0Var.N = null;
                        yk0Var.H = (wk0) yk0Var.f39897b.get(0);
                        yk0Var.I = true;
                    }
                    yk0Var.f39896a.remove(wk0Var);
                    yk0Var.f39898c.remove(wk0Var);
                }
                yk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18317id = tL_inputDocument;
                    tL_inputDocument.f18121id = document3.f18115id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    yk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.t7(8));
                }
                yk0.W(yk0Var);
                yk0Var.c0();
                yk0Var.f39899f.l();
                b2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f30883c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f30883c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E6, false));
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((iu) this.f34357b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f30768c.get(i10);
        if (preset == dataAutoDownloadActivity.f30775y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f30769f;
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
            s4.c1 K = dataAutoDownloadActivity.f30767b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f30766a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void h(int i10) {
        switch (this.f34356a) {
            case 11:
                c70 c70Var = (c70) this.f34357b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f32693f.e() && c70Var.h() == 0) {
                    e70Var.f33207s.e(false, true);
                }
                c70Var.l();
                return;
            default:
                qk0 qk0Var = (qk0) this.f34357b;
                if (qk0Var.f36897f == null && !qk0Var.h.e()) {
                    qk0Var.f36898n.f30863c.c();
                }
                qk0Var.l();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f34357b;
        ArrayList arrayList = ExternalActionActivity.f30786x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f30792n, externalActionActivity.v, true, externalActionActivity.f30793r, externalActionActivity.f30794s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f30790c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.f34357b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.f38656x.isShowing()) {
            a00Var.f38656x.d(true);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f34356a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f34357b).f30803w;
    }

    @Override
    public a0.i w() {
        switch (this.f34356a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34356a) {
            case 6:
                mz mzVar = (mz) this.f34357b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.i51) obj).d != 1 || mzVar.f35844b == null) {
                    return;
                }
                boolean z10 = !mzVar.f35845c;
                mzVar.f35845c = z10;
                ai.m0 m0Var = mzVar.f35846f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(mzVar.f35845c);
                mzVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.ll0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.ll0) this.f34357b).f25969p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f34357b).run();
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

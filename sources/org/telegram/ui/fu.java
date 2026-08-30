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
public final class fu implements org.telegram.ui.Components.tv0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.yg0, Utilities.Callback5, org.telegram.ui.Components.ud0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.fl0, tf.j1, org.telegram.ui.Components.kl0, r0.o, org.telegram.ui.Components.jl0, xt, xd.b, jj0 {
    public final int f34354a;
    public final Object f34355b;

    public fu(Object obj, int i10) {
        this.f34354a = i10;
        this.f34355b = obj;
    }

    @Override
    public a0.h I() {
        switch (this.f34354a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        xg0 xg0Var = (xg0) this.f34355b;
        xg0Var.getClass();
        xg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        xg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        ma0 ma0Var = (ma0) this.f34355b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!ma0Var.f36254a.equals(defaultWindowInsets)) {
            ma0Var.f36254a = defaultWindowInsets;
            ma0Var.requestLayout();
        }
        int childCount = ma0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(ma0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override
    public boolean Q(int i10) {
        switch (this.f34354a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void T(ArrayList arrayList) {
        int i10 = this.f34354a;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f34355b).draw(canvas);
    }

    @Override
    public void b1(st stVar) {
        mg0 mg0Var = (mg0) this.f34355b;
        mg0Var.F = true;
        String str = stVar.f38437c;
        mg0Var.f36293a.setText(str);
        mg0Var.v(str, stVar);
        mg0Var.f36302y = stVar;
        mg0Var.f36301x = 0;
        mg0Var.F = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + stVar.f38437c, stVar.d).apply();
        AndroidUtilities.runOnUIThread(new cg0(mg0Var, 4), 300L);
        jg0 jg0Var = mg0Var.f36294b;
        jg0Var.requestFocus();
        jg0Var.setSelection(jg0Var.length());
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f34354a) {
            case 16:
                ec0 ec0Var = (ec0) this.f34355b;
                ArrayList arrayList = ec0Var.f33988s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    yb0 yb0Var = (yb0) arrayList.get(i10);
                    int i11 = yb0Var.f1808a;
                    int i12 = yb0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && yb0Var.f40469f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z4 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z10 = !z4;
                            edit.putBoolean("view_animations", z10);
                            SharedConfig.setAnimationsEnabled(z10);
                            edit.commit();
                            ((org.telegram.ui.Cells.o8) view).setChecked(z10);
                            return;
                        }
                        return;
                    } else if (LiteMode.isPowerSaverApplied()) {
                        ec0Var.e = org.telegram.ui.Components.qc.a0(ec0Var).L(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (yb0Var.f1808a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 > AndroidUtilities.dp(75.0f)) && (U = ec0Var.U(i12)) != -1) {
                        ec0Var.f33986n[U] = !zArr[U];
                        ec0Var.Y();
                        ec0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        ec0Var.Y();
                        return;
                    }
                }
                return;
            default:
                pg0.U((pg0) this.f34355b, i10);
                return;
        }
    }

    @Override
    public boolean e1(View view) {
        switch (this.f34354a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        int i11;
        int i12;
        switch (this.f34354a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f34355b, view, i10);
            case 23:
                final aj0 aj0Var = (aj0) this.f34355b;
                if (i10 >= aj0Var.F && i10 < aj0Var.G) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) aj0Var.f32656x.get(i10 - aj0Var.F);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aj0Var.getParentActivity(), 0, aj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.p2 p2Var = aj0.this;
                            p2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z4 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z4) {
                                    R9 = ProfileActivity.m4(j10);
                                } else {
                                    R9 = xn.R9(j10);
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
                                p2Var.presentFragment(new xn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.M = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    d2Var.N = intArray;
                    d2Var.J = onClickListener;
                    aj0Var.showDialog(d2Var);
                }
                return false;
            default:
                ok0 ok0Var = (ok0) this.f34355b;
                ok0Var.getClass();
                if (view instanceof nk0) {
                    nk0 nk0Var = (nk0) view;
                    ok0Var.Z(nk0Var.e);
                    nk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void g(int i10) {
        switch (this.f34354a) {
            case 11:
                w60 w60Var = (w60) this.f34355b;
                y60 y60Var = w60Var.F;
                y60Var.q0(w60Var.E);
                if (w60Var.h == null && !w60Var.f39347f.e() && w60Var.h() == 0) {
                    y60Var.f40434s.e(false, true);
                }
                w60Var.l();
                return;
            default:
                gk0 gk0Var = (gk0) this.f34355b;
                if (gk0Var.f34637f == null && !gk0Var.h.e()) {
                    gk0Var.f34638n.f31664c.c();
                }
                gk0Var.l();
                return;
        }
    }

    @Override
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((gu) this.f34355b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31569c.get(i10);
        if (preset == dataAutoDownloadActivity.f31576y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.C) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31570f;
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
            f2.l1 K = dataAutoDownloadActivity.f31568b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f31567a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.F = true;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        gf.f fVar;
        int i12 = this.f34354a;
        Object obj = this.f34355b;
        switch (i12) {
            case 1:
                ((i5.v) obj).run();
                return;
            case 12:
                ((g70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                yd0 yd0Var = (yd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", yd0Var.F);
                bundle.putString("ephone", yd0Var.G);
                bundle.putString("phoneFormated", yd0Var.I);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = yd0Var.I;
                tL_auth_resetLoginEmail.phone_code_hash = yd0Var.J;
                yd0Var.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new pd0(yd0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                he0 he0Var = (he0) obj;
                ng0.n0(he0Var.f34844y, he0Var.f34841s, he0Var.v, he0Var.f34842w);
                return;
            case 19:
                af0 af0Var = (af0) obj;
                ng0 ng0Var = af0Var.B;
                ng0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(af0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.uj) obj).run();
                return;
            case 28:
                ok0 ok0Var = ((kk0) obj).f35763b;
                SparseArray sparseArray = ok0Var.G;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    mk0 mk0Var = (mk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = mk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        gf.e eVar = ok0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = mk0Var.e;
                        ArrayList arrayList2 = eVar.e;
                        if (document2 != null) {
                            if (!eVar.f6544f) {
                                eVar.f(true);
                                eVar.f6544f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((gf.d) arrayList2.get(i14)).f6536a != null && ((gf.d) arrayList2.get(i14)).f6536a.f19190id == document2.f19190id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (mk0Var.f36343g != null && (fVar = ok0Var.getMediaDataController().ringtoneUploaderHashMap.get(mk0Var.f36343g)) != null) {
                        fVar.f6547c = true;
                        fVar.a();
                        int i15 = fVar.f6545a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = fVar.f6546b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (mk0Var == ok0Var.E) {
                        ok0Var.K = null;
                        ok0Var.E = (mk0) ok0Var.f36925b.get(0);
                        ok0Var.F = true;
                    }
                    ok0Var.f36924a.remove(mk0Var);
                    ok0Var.f36926c.remove(mk0Var);
                }
                ok0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f19392id = tL_inputDocument;
                    tL_inputDocument.f19196id = document3.f19190id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    ok0Var.getConnectionsManager().sendRequest(saveringtone, new nh.p5(4));
                }
                ok0.W(ok0Var);
                ok0Var.c0();
                ok0Var.f36927f.l();
                d2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31684c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f31684c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.aa) {
                            ((org.telegram.ui.Cells.aa) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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
    public void j(org.telegram.ui.Components.vd0 vd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f34355b;
        ArrayList arrayList = ExternalActionActivity.f31587x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31593n, externalActionActivity.v, true, externalActionActivity.f31594r, externalActionActivity.f31595s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31591c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, vd0Var);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        wz wzVar = (wz) this.f34355b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && wzVar.f38150x.isShowing()) {
            wzVar.f38150x.d(true);
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
        int i10 = this.f34354a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f34355b).f31604w;
    }

    @Override
    public a0.h t() {
        switch (this.f34354a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34354a) {
            case 6:
                hz hzVar = (hz) this.f34355b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.i51) obj).d != 1 || hzVar.f34975b == null) {
                    return;
                }
                boolean z4 = !hzVar.f34976c;
                hzVar.f34976c = z4;
                dh.v vVar = hzVar.f34977f;
                if (vVar != null) {
                    vVar.run(Boolean.valueOf(z4), Boolean.valueOf(hzVar.d));
                }
                ((org.telegram.ui.Cells.s8) view).setChecked(hzVar.f34976c);
                hzVar.e.V2.N(true);
                return;
            default:
                org.telegram.ui.Components.sl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.sl0) this.f34355b).f28750m2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((i5.x) this.f34355b).run();
        return true;
    }

    private final void e(ArrayList arrayList) {
    }

    private final void k(ArrayList arrayList) {
    }

    @Override
    public void m() {
    }

    @Override
    public void z(float f10, int i10) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void d(View view, float f10, float f11) {
    }
}

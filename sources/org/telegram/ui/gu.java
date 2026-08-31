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
public final class gu implements org.telegram.ui.Components.uv0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.ah0, Utilities.Callback5, org.telegram.ui.Components.wd0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.gl0, uf.j1, org.telegram.ui.Components.ll0, r0.o, org.telegram.ui.Components.kl0, yt, xd.b, kj0 {
    public final int f37265a;
    public final Object f37266b;

    public gu(Object obj, int i10) {
        this.f37265a = i10;
        this.f37266b = obj;
    }

    @Override
    public a0.h K() {
        switch (this.f37265a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        yg0 yg0Var = (yg0) this.f37266b;
        yg0Var.getClass();
        yg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        yg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        na0 na0Var = (na0) this.f37266b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!na0Var.f39366a.equals(defaultWindowInsets)) {
            na0Var.f39366a = defaultWindowInsets;
            na0Var.requestLayout();
        }
        int childCount = na0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(na0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override
    public boolean R(int i10) {
        switch (this.f37265a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void V(ArrayList arrayList) {
        int i10 = this.f37265a;
    }

    @Override
    public void V0(tt ttVar) {
        ng0 ng0Var = (ng0) this.f37266b;
        ng0Var.F = true;
        String str = ttVar.f41705c;
        ng0Var.f39427a.setText(str);
        ng0Var.v(str, ttVar);
        ng0Var.f39437y = ttVar;
        ng0Var.f39436x = 0;
        ng0Var.F = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ttVar.f41705c, ttVar.d).apply();
        AndroidUtilities.runOnUIThread(new dg0(ng0Var, 4), 300L);
        kg0 kg0Var = ng0Var.f39428b;
        kg0Var.requestFocus();
        kg0Var.setSelection(kg0Var.length());
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f37265a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f37266b).draw(canvas);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f37265a) {
            case 16:
                fc0 fc0Var = (fc0) this.f37266b;
                ArrayList arrayList = fc0Var.f36850s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    zb0 zb0Var = (zb0) arrayList.get(i10);
                    int i11 = zb0Var.f2505a;
                    int i12 = zb0Var.f43888e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && zb0Var.f43889f == 1) {
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
                        fc0Var.f36846e = org.telegram.ui.Components.qc.a0(fc0Var).L(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (zb0Var.f2505a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 > AndroidUtilities.dp(75.0f)) && (U = fc0Var.U(i12)) != -1) {
                        fc0Var.f36848n[U] = !zArr[U];
                        fc0Var.Y();
                        fc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        fc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                qg0.U((qg0) this.f37266b, i10);
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        int i11;
        int i12;
        switch (this.f37265a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f37266b, view, i10);
            case 23:
                final bj0 bj0Var = (bj0) this.f37266b;
                if (i10 >= bj0Var.F && i10 < bj0Var.G) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) bj0Var.f35547x.get(i10 - bj0Var.F);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bj0Var.getParentActivity(), 0, bj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.p2 p2Var = bj0.this;
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
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    d2Var.M = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    d2Var.N = intArray;
                    d2Var.J = onClickListener;
                    bj0Var.showDialog(d2Var);
                }
                return false;
            default:
                qk0 qk0Var = (qk0) this.f37266b;
                qk0Var.getClass();
                if (view instanceof pk0) {
                    pk0 pk0Var = (pk0) view;
                    qk0Var.Z(pk0Var.f40077e);
                    pk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void g(int i10) {
        switch (this.f37265a) {
            case 11:
                x60 x60Var = (x60) this.f37266b;
                z60 z60Var = x60Var.F;
                z60Var.q0(x60Var.E);
                if (x60Var.h == null && !x60Var.f42981f.e() && x60Var.h() == 0) {
                    z60Var.f43848s.e(false, true);
                }
                x60Var.l();
                return;
            default:
                ik0 ik0Var = (ik0) this.f37266b;
                if (ik0Var.f37890f == null && !ik0Var.h.e()) {
                    ik0Var.f37891n.f34186c.c();
                }
                ik0Var.l();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.xd0 xd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f37266b;
        ArrayList arrayList = ExternalActionActivity.f34106x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f34113n, externalActionActivity.v, true, externalActionActivity.f34114r, externalActionActivity.f34115s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f34110c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, xd0Var);
    }

    @Override
    public void i(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((hu) this.f37266b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f34086c.get(i10);
        if (preset == dataAutoDownloadActivity.f34094y) {
            dataAutoDownloadActivity.f34087e = 0;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.f34087e = 1;
        } else if (preset == dataAutoDownloadActivity.C) {
            dataAutoDownloadActivity.f34087e = 2;
        } else {
            dataAutoDownloadActivity.f34087e = 3;
        }
        int i11 = dataAutoDownloadActivity.f34088f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f34087e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f34087e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f34087e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.H, dataAutoDownloadActivity.f34087e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            f2.m1 K = dataAutoDownloadActivity.f34085b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f34084a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.F = true;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        gf.f fVar;
        int i12 = this.f37265a;
        Object obj = this.f37266b;
        switch (i12) {
            case 1:
                ((i5.v) obj).run();
                return;
            case 12:
                ((h70) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                zd0 zd0Var = (zd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", zd0Var.F);
                bundle.putString("ephone", zd0Var.G);
                bundle.putString("phoneFormated", zd0Var.I);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = zd0Var.I;
                tL_auth_resetLoginEmail.phone_code_hash = zd0Var.J;
                zd0Var.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new qd0(zd0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                ie0 ie0Var = (ie0) obj;
                og0.n0(ie0Var.f37819y, ie0Var.f37816s, ie0Var.v, ie0Var.f37817w);
                return;
            case 19:
                bf0 bf0Var = (bf0) obj;
                og0 og0Var = bf0Var.B;
                og0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(bf0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.uj) obj).run();
                return;
            case 28:
                qk0 qk0Var = ((mk0) obj).f39170b;
                SparseArray sparseArray = qk0Var.G;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ok0 ok0Var = (ok0) sparseArray.valueAt(i13);
                    TLRPC.Document document = ok0Var.f39798e;
                    if (document != null) {
                        arrayList.add(document);
                        gf.e eVar = qk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ok0Var.f39798e;
                        ArrayList arrayList2 = eVar.f7041e;
                        if (document2 != null) {
                            if (!eVar.f7042f) {
                                eVar.f(true);
                                eVar.f7042f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((gf.d) arrayList2.get(i14)).f7033a != null && ((gf.d) arrayList2.get(i14)).f7033a.f20849id == document2.f20849id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (ok0Var.f39800g != null && (fVar = qk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ok0Var.f39800g)) != null) {
                        fVar.f7045c = true;
                        fVar.a();
                        int i15 = fVar.f7043a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = fVar.f7044b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (ok0Var == qk0Var.E) {
                        qk0Var.K = null;
                        qk0Var.E = (ok0) qk0Var.f40558b.get(0);
                        qk0Var.F = true;
                    }
                    qk0Var.f40557a.remove(ok0Var);
                    qk0Var.f40559c.remove(ok0Var);
                }
                qk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f21053id = tL_inputDocument;
                    tL_inputDocument.f20855id = document3.f20849id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    qk0Var.getConnectionsManager().sendRequest(saveringtone, new oh.p5(4));
                }
                qk0.W(qk0Var);
                qk0Var.c0();
                qk0Var.f40561f.l();
                d2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f34208c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f34208c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.aa) {
                            ((org.telegram.ui.Cells.aa) childAt).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false));
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
        xz xzVar = (xz) this.f37266b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && xzVar.f41404x.isShowing()) {
            xzVar.f41404x.d(true);
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i10 = this.f37265a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f37266b).f34125w;
    }

    @Override
    public a0.h y() {
        switch (this.f37265a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37265a) {
            case 6:
                iz izVar = (iz) this.f37266b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.j51) obj).d != 1 || izVar.f37959b == null) {
                    return;
                }
                boolean z4 = !izVar.f37960c;
                izVar.f37960c = z4;
                eh.w wVar = izVar.f37962f;
                if (wVar != null) {
                    wVar.run(Boolean.valueOf(z4), Boolean.valueOf(izVar.d));
                }
                ((org.telegram.ui.Cells.s8) view).setChecked(izVar.f37960c);
                izVar.f37961e.V2.N(true);
                return;
            default:
                org.telegram.ui.Components.tl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.tl0) this.f37266b).f31383m2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((i5.x) this.f37266b).run();
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

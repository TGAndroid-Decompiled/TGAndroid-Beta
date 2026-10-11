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
public final class fu implements org.telegram.ui.Components.ww0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.wh0, Utilities.Callback5, org.telegram.ui.Components.se0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.cm0, gg.a2, org.telegram.ui.Components.hm0, r0.n, org.telegram.ui.Components.gm0, xt, me.d, tj0 {
    public final int f37804a;
    public final Object f37805b;

    public fu(Object obj, int i10) {
        this.f37804a = i10;
        this.f37805b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ta0 ta0Var = (ta0) this.f37805b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ta0Var.f42173a.equals(defaultWindowInsets)) {
            ta0Var.f42173a = defaultWindowInsets;
            ta0Var.requestLayout();
        }
        int childCount = ta0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ta0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override
    public void U0(tt ttVar) {
        ug0 ug0Var = (ug0) this.f37805b;
        ug0Var.I = true;
        String str = ttVar.f42295c;
        ug0Var.f42586a.setText(str);
        ug0Var.t(str, ttVar);
        ug0Var.f42596y = ttVar;
        ug0Var.f42595x = 0;
        ug0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ttVar.f42295c, ttVar.d).apply();
        AndroidUtilities.runOnUIThread(new kg0(ug0Var, 4), 300L);
        rg0 rg0Var = ug0Var.f42587b;
        rg0Var.requestFocus();
        rg0Var.setSelection(rg0Var.length());
    }

    @Override
    public a0.i V() {
        switch (this.f37804a) {
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
        ((Layout) this.f37805b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        lc0 lc0Var = (lc0) this.f37805b;
        ArrayList arrayList = lc0Var.f39623s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            fc0 fc0Var = (fc0) arrayList.get(i10);
            int i11 = fc0Var.f17211a;
            int i12 = fc0Var.f37672e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && fc0Var.f37673f == 1) {
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
                lc0Var.f39619e = org.telegram.ui.Components.ad.a0(lc0Var).L(new org.telegram.ui.Components.aa(0.1f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (fc0Var.f17211a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = lc0Var.U(i12)) != -1) {
                lc0Var.f39621n[U] = !zArr[U];
                lc0Var.Y();
                lc0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                lc0Var.Y();
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f37804a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f37805b, view, i10);
            case 22:
                final kj0 kj0Var = (kj0) this.f37805b;
                if (i10 >= kj0Var.I && i10 < kj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) kj0Var.f39397x.get(i10 - kj0Var.I);
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
                            org.telegram.ui.ActionBar.m2 W9;
                            org.telegram.ui.ActionBar.m2 m2Var = kj0.this;
                            m2Var.getClass();
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
                                m2Var.presentFragment(W9);
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
                                m2Var.presentFragment(new zn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                    a2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    a2Var.Q = intArray;
                    a2Var.M = onClickListener;
                    kj0Var.showDialog(a2Var);
                }
                return false;
            default:
                zk0 zk0Var = (zk0) this.f37805b;
                zk0Var.getClass();
                if (view instanceof yk0) {
                    yk0 yk0Var = (yk0) view;
                    zk0Var.Z(yk0Var.f44484e);
                    yk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public a0.i d0() {
        switch (this.f37804a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        vf.d dVar;
        int i12 = this.f37804a;
        Object obj = this.f37805b;
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
                ee0 ee0Var = (ee0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ee0Var.I);
                bundle.putString("ephone", ee0Var.J);
                bundle.putString("phoneFormated", ee0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ee0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ee0Var.M;
                ee0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new vd0(ee0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                ne0 ne0Var = (ne0) obj;
                vg0.n0(ne0Var.f40269y, ne0Var.f40266s, ne0Var.v, ne0Var.f40267w);
                return;
            case 19:
                gf0 gf0Var = (gf0) obj;
                vg0 vg0Var = gf0Var.E;
                vg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(gf0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.bj) obj).run();
                return;
            case 27:
                zk0 zk0Var = ((vk0) obj).f43109b;
                SparseArray sparseArray = zk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    xk0 xk0Var = (xk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = xk0Var.f44133e;
                    if (document != null) {
                        arrayList.add(document);
                        vf.c cVar = zk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = xk0Var.f44133e;
                        ArrayList arrayList2 = cVar.f49679e;
                        if (document2 != null) {
                            if (!cVar.f49680f) {
                                cVar.f(true);
                                cVar.f49680f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((vf.b) arrayList2.get(i14)).f49671a != null && ((vf.b) arrayList2.get(i14)).f49671a.f20074id == document2.f20074id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (xk0Var.f44135g != null && (dVar = zk0Var.getMediaDataController().ringtoneUploaderHashMap.get(xk0Var.f44135g)) != null) {
                        dVar.f49683c = true;
                        dVar.a();
                        int i15 = dVar.f49681a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f49682b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (xk0Var == zk0Var.H) {
                        zk0Var.N = null;
                        zk0Var.H = (xk0) zk0Var.f44714b.get(0);
                        zk0Var.I = true;
                    }
                    zk0Var.f44713a.remove(xk0Var);
                    zk0Var.f44715c.remove(xk0Var);
                }
                zk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20278id = tL_inputDocument;
                    tL_inputDocument.f20080id = document3.f20074id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    zk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.v7(8));
                }
                zk0.W(zk0Var);
                zk0Var.c0();
                zk0Var.f44717f.l();
                a2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33913c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33913c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ca) {
                            ((org.telegram.ui.Cells.ca) childAt).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false));
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((gu) this.f37805b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33791c.get(i10);
        if (preset == dataAutoDownloadActivity.f33799y) {
            dataAutoDownloadActivity.f33792e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f33792e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f33792e = 2;
        } else {
            dataAutoDownloadActivity.f33792e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33793f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f33792e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f33792e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f33792e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f33792e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.d1 K = dataAutoDownloadActivity.f33790b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33789a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void h(int i10) {
        switch (this.f37804a) {
            case 11:
                a70 a70Var = (a70) this.f37805b;
                c70 c70Var = a70Var.I;
                c70Var.q0(a70Var.H);
                if (a70Var.h == null && !a70Var.f35939f.e() && a70Var.h() == 0) {
                    c70Var.f36642s.e(false, true);
                }
                a70Var.l();
                return;
            default:
                qk0 qk0Var = (qk0) this.f37805b;
                if (qk0Var.f41229f == null && !qk0Var.h.e()) {
                    qk0Var.f41230n.f33891c.c();
                }
                qk0Var.l();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.te0 te0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f37805b;
        ArrayList arrayList = ExternalActionActivity.f33811x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33818n, externalActionActivity.v, true, externalActionActivity.f33819r, externalActionActivity.f33820s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33815c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, te0Var);
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        gh0 gh0Var = (gh0) this.f37805b;
        gh0Var.getClass();
        gh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        gh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void o(KeyEvent keyEvent) {
        zz zzVar = (zz) this.f37805b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && zzVar.f42841x.isShowing()) {
            zzVar.f42841x.d(true);
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f37805b).f33830w;
    }

    @Override
    public boolean s0(int i10) {
        switch (this.f37804a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x0(ArrayList arrayList) {
        int i10 = this.f37804a;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37804a) {
            case 6:
                kz kzVar = (kz) this.f37805b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.q61) obj).d != 1 || kzVar.f39485b == null) {
                    return;
                }
                boolean z10 = !kzVar.f39486c;
                kzVar.f39486c = z10;
                ai.m0 m0Var = kzVar.f39488f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(kzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(kzVar.f39486c);
                kzVar.f39487e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.rm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.rm0) this.f37805b).f30570n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f37805b, (org.telegram.ui.Components.q61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f37805b).run();
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

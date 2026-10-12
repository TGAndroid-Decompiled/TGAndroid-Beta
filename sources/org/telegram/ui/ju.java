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
public final class ju implements org.telegram.ui.Components.bx0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.zh0, Utilities.Callback5, org.telegram.ui.Components.we0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.hm0, gg.a2, org.telegram.ui.Components.mm0, r0.n, org.telegram.ui.Components.lm0, bu, me.d, vj0 {
    public final int f39282a;
    public final Object f39283b;

    public ju(Object obj, int i10) {
        this.f39282a = i10;
        this.f39283b = obj;
    }

    @Override
    public a0.i G() {
        switch (this.f39282a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        va0 va0Var = (va0) this.f39283b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!va0Var.f42740a.equals(defaultWindowInsets)) {
            va0Var.f42740a = defaultWindowInsets;
            va0Var.requestLayout();
        }
        int childCount = va0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(va0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override
    public void V0(xt xtVar) {
        wg0 wg0Var = (wg0) this.f39283b;
        wg0Var.I = true;
        String str = xtVar.f44158c;
        wg0Var.f43512a.setText(str);
        wg0Var.t(str, xtVar);
        wg0Var.f43522y = xtVar;
        wg0Var.f43521x = 0;
        wg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + xtVar.f44158c, xtVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(wg0Var, 4), 300L);
        tg0 tg0Var = wg0Var.f43513b;
        tg0Var.requestFocus();
        tg0Var.setSelection(tg0Var.length());
    }

    @Override
    public a0.i W() {
        switch (this.f39282a) {
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
        ((Layout) this.f39283b).draw(canvas);
    }

    @Override
    public boolean b0(int i10) {
        switch (this.f39282a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        nc0 nc0Var = (nc0) this.f39283b;
        ArrayList arrayList = nc0Var.f40379s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            hc0 hc0Var = (hc0) arrayList.get(i10);
            int i11 = hc0Var.f16876a;
            int i12 = hc0Var.f38327e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && hc0Var.f38328f == 1) {
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
                nc0Var.f40375e = org.telegram.ui.Components.zc.a0(nc0Var).L(new org.telegram.ui.Components.aa(0.1f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (hc0Var.f16876a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = nc0Var.U(i12)) != -1) {
                nc0Var.f40377n[U] = !zArr[U];
                nc0Var.Y();
                nc0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                nc0Var.Y();
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f39282a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f39283b, view, i10);
            case 22:
                final mj0 mj0Var = (mj0) this.f39283b;
                if (i10 >= mj0Var.I && i10 < mj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) mj0Var.f40072x.get(i10 - mj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mj0Var.getParentActivity(), 0, mj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.m2 m2Var = mj0.this;
                            m2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    W9 = ProfileActivity.m4(j3);
                                } else {
                                    W9 = eo.W9(j3);
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
                                m2Var.presentFragment(new eo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                    a2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    a2Var.Q = intArray;
                    a2Var.M = onClickListener;
                    mj0Var.showDialog(a2Var);
                }
                return false;
            default:
                bl0 bl0Var = (bl0) this.f39283b;
                bl0Var.getClass();
                if (view instanceof al0) {
                    al0 al0Var = (al0) view;
                    bl0Var.Z(al0Var.f35898e);
                    al0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        vf.d dVar;
        int i12 = this.f39282a;
        Object obj = this.f39283b;
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
                xg0.n0(pe0Var.f40944y, pe0Var.f40941s, pe0Var.v, pe0Var.f40942w);
                return;
            case 19:
                if0 if0Var = (if0) obj;
                xg0 xg0Var = if0Var.E;
                xg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(if0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.hj) obj).run();
                return;
            case 27:
                bl0 bl0Var = ((xk0) obj).f44032b;
                SparseArray sparseArray = bl0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    zk0 zk0Var = (zk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = zk0Var.f44868e;
                    if (document != null) {
                        arrayList.add(document);
                        vf.c cVar = bl0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = zk0Var.f44868e;
                        ArrayList arrayList2 = cVar.f49786e;
                        if (document2 != null) {
                            if (!cVar.f49787f) {
                                cVar.f(true);
                                cVar.f49787f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((vf.b) arrayList2.get(i14)).f49778a != null && ((vf.b) arrayList2.get(i14)).f49778a.f19808id == document2.f19808id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (zk0Var.f44870g != null && (dVar = bl0Var.getMediaDataController().ringtoneUploaderHashMap.get(zk0Var.f44870g)) != null) {
                        dVar.f49790c = true;
                        dVar.a();
                        int i15 = dVar.f49788a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f49789b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (zk0Var == bl0Var.H) {
                        bl0Var.N = null;
                        bl0Var.H = (zk0) bl0Var.f36194b.get(0);
                        bl0Var.I = true;
                    }
                    bl0Var.f36193a.remove(zk0Var);
                    bl0Var.f36195c.remove(zk0Var);
                }
                bl0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20014id = tL_inputDocument;
                    tL_inputDocument.f19814id = document3.f19808id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    bl0Var.getConnectionsManager().sendRequest(saveringtone, new ai.v7(8));
                }
                bl0.W(bl0Var);
                bl0Var.c0();
                bl0Var.f36197f.l();
                a2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33688c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33688c.getChildAt(i17);
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ku) this.f39283b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33566c.get(i10);
        if (preset == dataAutoDownloadActivity.f33574y) {
            dataAutoDownloadActivity.f33567e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f33567e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f33567e = 2;
        } else {
            dataAutoDownloadActivity.f33567e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33568f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f33567e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f33567e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f33567e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f33567e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.d1 K = dataAutoDownloadActivity.f33565b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33564a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void h(int i10) {
        switch (this.f39282a) {
            case 11:
                c70 c70Var = (c70) this.f39283b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f36346f.e() && c70Var.h() == 0) {
                    e70Var.f37015s.e(false, true);
                }
                c70Var.l();
                return;
            default:
                sk0 sk0Var = (sk0) this.f39283b;
                if (sk0Var.f41948f == null && !sk0Var.h.e()) {
                    sk0Var.f41949n.f33666c.c();
                }
                sk0Var.l();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.xe0 xe0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f39283b;
        ArrayList arrayList = ExternalActionActivity.f33586x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33593n, externalActionActivity.v, true, externalActionActivity.f33594r, externalActionActivity.f33595s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33590c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, xe0Var);
    }

    @Override
    public void i0(ArrayList arrayList) {
        int i10 = this.f39282a;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        ih0 ih0Var = (ih0) this.f39283b;
        ih0Var.getClass();
        ih0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        ih0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void o(KeyEvent keyEvent) {
        c00 c00Var = (c00) this.f39283b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && c00Var.f44212x.isShowing()) {
            c00Var.f44212x.d(true);
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f39283b).f33605w;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f39282a) {
            case 6:
                nz nzVar = (nz) this.f39283b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.u61) obj).d != 1 || nzVar.f40508b == null) {
                    return;
                }
                boolean z10 = !nzVar.f40509c;
                nzVar.f40509c = z10;
                ai.m0 m0Var = nzVar.f40511f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(nzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(nzVar.f40509c);
                nzVar.f40510e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.wm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.wm0) this.f39283b).f32467n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f39283b, (org.telegram.ui.Components.u61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f39283b).run();
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
    public void C(float f7, int i10) {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}

package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
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
public final class bu implements org.telegram.ui.Components.nl0, org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.fh0, Utilities.Callback5, org.telegram.ui.Components.de0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.jl0, gg.b2, org.telegram.ui.Components.ol0, r0.n, yt, le.d, qj0 {
    public final int f35192a;
    public final Object f35193b;

    public bu(Object obj, int i10) {
        this.f35192a = i10;
        this.f35193b = obj;
    }

    @Override
    public void C(ArrayList arrayList) {
        int i10 = this.f35192a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ua0 ua0Var = (ua0) this.f35193b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ua0Var.f41135a.equals(defaultWindowInsets)) {
            ua0Var.f41135a = defaultWindowInsets;
            ua0Var.requestLayout();
        }
        int childCount = ua0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ua0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(int i10) {
        switch (this.f35192a) {
            case 12:
                b70 b70Var = (b70) this.f35193b;
                d70 d70Var = b70Var.I;
                d70Var.q0(b70Var.H);
                if (b70Var.h == null && !b70Var.f35015f.e() && b70Var.h() == 0) {
                    d70Var.f35684s.e(false, true);
                }
                b70Var.l();
                return;
            default:
                ok0 ok0Var = (ok0) this.f35193b;
                if (ok0Var.f39227f == null && !ok0Var.h.e()) {
                    ok0Var.f39228n.f33820c.c();
                }
                ok0Var.l();
                return;
        }
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        eh0 eh0Var = (eh0) this.f35193b;
        eh0Var.getClass();
        eh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        eh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f35193b).draw(canvas);
    }

    @Override
    public void b1(ut utVar) {
        tg0 tg0Var = (tg0) this.f35193b;
        tg0Var.I = true;
        String str = utVar.f41300c;
        tg0Var.f40817a.setText(str);
        tg0Var.v(str, utVar);
        tg0Var.f40827y = utVar;
        tg0Var.f40826x = 0;
        tg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + utVar.f41300c, utVar.d).apply();
        AndroidUtilities.runOnUIThread(new jg0(tg0Var, 4), 300L);
        qg0 qg0Var = tg0Var.f40818b;
        qg0Var.requestFocus();
        qg0Var.setSelection(qg0Var.length());
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.g61 G;
        Object obj;
        long j3;
        int S;
        boolean[] zArr;
        switch (this.f35192a) {
            case 0:
                du duVar = (du) this.f35193b;
                HashSet hashSet = duVar.f35837b0;
                if (!duVar.f35838c0 && (G = duVar.f35839d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f20185id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f20038id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof xg.l) {
                        ((xg.l) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f35193b, view, i10, f7);
                return;
            case 17:
                lc0 lc0Var = (lc0) this.f35193b;
                ArrayList arrayList = lc0Var.f38236s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    fc0 fc0Var = (fc0) arrayList.get(i10);
                    int i11 = fc0Var.f17183a;
                    int i12 = fc0Var.f36267e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && fc0Var.f36268f == 1) {
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
                        lc0Var.f38232e = org.telegram.ui.Components.yc.a0(lc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (fc0Var.f17183a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (S = lc0Var.S(i12)) != -1) {
                        lc0Var.f38234n[S] = !zArr[S];
                        lc0Var.X();
                        lc0Var.W();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        lc0Var.X();
                    }
                    li.m.f();
                    return;
                }
                return;
            default:
                wg0.S((wg0) this.f35193b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f35192a) {
            case 14:
                return LanguageSelectActivity.T((LanguageSelectActivity) this.f35193b, view, i10);
            case 24:
                final hj0 hj0Var = (hj0) this.f35193b;
                if (i10 >= hj0Var.I && i10 < hj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) hj0Var.f37102x.get(i10 - hj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hj0Var.getParentActivity(), 0, hj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.n2 Q9;
                            org.telegram.ui.ActionBar.n2 n2Var = hj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    Q9 = ProfileActivity.m4(j3);
                                } else {
                                    Q9 = yn.Q9(j3);
                                }
                                n2Var.presentFragment(Q9);
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
                                n2Var.presentFragment(new yn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    hj0Var.showDialog(b2Var);
                }
                return false;
            default:
                wk0 wk0Var = (wk0) this.f35193b;
                wk0Var.getClass();
                if (view instanceof vk0) {
                    vk0 vk0Var = (vk0) view;
                    wk0Var.Y(vk0Var.f41765e);
                    vk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f35192a) {
            case 0:
                return false;
            case 1:
                return false;
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.f35192a;
        Object obj = this.f35193b;
        switch (i12) {
            case 3:
                ((a3.h0) obj).run();
                return;
            case 13:
                ((m70) obj).S(true);
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 18:
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
            case 19:
                ne0 ne0Var = (ne0) obj;
                ug0.n0(ne0Var.f38955y, ne0Var.f38952s, ne0Var.v, ne0Var.f38953w);
                return;
            case 20:
                gf0 gf0Var = (gf0) obj;
                ug0 ug0Var = gf0Var.E;
                ug0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(gf0Var, 12), 10);
                return;
            case 27:
                ((org.telegram.messenger.qj) obj).run();
                return;
            default:
                wk0 wk0Var = ((sk0) obj).f40518b;
                SparseArray sparseArray = wk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    uk0 uk0Var = (uk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = uk0Var.f41248e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = wk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = uk0Var.f41248e;
                        ArrayList arrayList2 = cVar.f47624e;
                        if (document2 != null) {
                            if (!cVar.f47625f) {
                                cVar.f(true);
                                cVar.f47625f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i14)).f47616a != null && ((uf.b) arrayList2.get(i14)).f47616a.f20044id == document2.f20044id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (uk0Var.f41250g != null && (dVar = wk0Var.getMediaDataController().ringtoneUploaderHashMap.get(uk0Var.f41250g)) != null) {
                        dVar.f47628c = true;
                        dVar.a();
                        int i15 = dVar.f47626a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f47627b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (uk0Var == wk0Var.H) {
                        wk0Var.N = null;
                        wk0Var.H = (uk0) wk0Var.f42510b.get(0);
                        wk0Var.I = true;
                    }
                    wk0Var.f42509a.remove(uk0Var);
                    wk0Var.f42511c.remove(uk0Var);
                }
                wk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20248id = tL_inputDocument;
                    tL_inputDocument.f20050id = document3.f20044id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    wk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.u7(8));
                }
                wk0.U(wk0Var);
                wk0Var.c0();
                wk0Var.f42513f.l();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((iu) this.f35193b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33720c.get(i10);
        if (preset == dataAutoDownloadActivity.f33728y) {
            dataAutoDownloadActivity.f33721e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f33721e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f33721e = 2;
        } else {
            dataAutoDownloadActivity.f33721e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33722f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f33721e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f33721e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f33721e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f33721e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.c1 K = dataAutoDownloadActivity.f33719b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33718a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void m(org.telegram.ui.Components.ee0 ee0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f35193b;
        ArrayList arrayList = ExternalActionActivity.f33740x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33747n, externalActionActivity.v, true, externalActionActivity.f33748r, externalActionActivity.f33749s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33744c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ee0Var);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.f35193b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.f41866x.isShowing()) {
            a00Var.f41866x.d(true);
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mz mzVar = (mz) this.f35193b;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (((org.telegram.ui.Components.g61) obj).d != 1 || mzVar.f38782b == null) {
            return;
        }
        boolean z10 = !mzVar.f38783c;
        mzVar.f38783c = z10;
        ai.m0 m0Var = mzVar.f38785f;
        if (m0Var != null) {
            m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
        }
        ((org.telegram.ui.Cells.w8) view).setChecked(mzVar.f38783c);
        mzVar.f38784e.f25245f3.N(true);
    }

    @Override
    public void s0(View view, float f7, float f10) {
        int i10 = this.f35192a;
    }

    @Override
    public a0.i w() {
        switch (this.f35192a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public a0.i y() {
        switch (this.f35192a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean z(int i10) {
        switch (this.f35192a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f35193b).f33759w;
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f35193b).run();
        return true;
    }

    private final void k(ArrayList arrayList) {
    }

    private final void n(ArrayList arrayList) {
    }

    @Override
    public void l() {
    }

    @Override
    public void V(float f7, int i10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }

    private final void h(View view, float f7, float f10) {
    }

    private final void i(View view, float f7, float f10) {
    }
}

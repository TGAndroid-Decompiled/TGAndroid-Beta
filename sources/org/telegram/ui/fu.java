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
public final class fu implements org.telegram.ui.Components.ll0, org.telegram.ui.Components.ew0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.dh0, Utilities.Callback5, org.telegram.ui.Components.ae0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.hl0, gg.b2, org.telegram.ui.Components.ml0, r0.n, zt, le.d, uj0 {
    public final int f33610a;
    public final Object f33611b;

    public fu(Object obj, int i10) {
        this.f33610a = i10;
        this.f33611b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        hh0 hh0Var = (hh0) this.f33611b;
        hh0Var.getClass();
        hh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        hh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void F(ArrayList arrayList) {
        int i10 = this.f33610a;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        xa0 xa0Var = (xa0) this.f33611b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!xa0Var.f39418a.equals(defaultWindowInsets)) {
            xa0Var.f39418a = defaultWindowInsets;
            xa0Var.requestLayout();
        }
        int childCount = xa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(xa0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override
    public void a(int i10) {
        switch (this.f33610a) {
            case 12:
                c70 c70Var = (c70) this.f33611b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f32566f.e() && c70Var.h() == 0) {
                    e70Var.f33213s.e(false, true);
                }
                c70Var.l();
                return;
            default:
                sk0 sk0Var = (sk0) this.f33611b;
                if (sk0Var.f37365f == null && !sk0Var.h.e()) {
                    sk0Var.f37366n.f31110c.c();
                }
                sk0Var.l();
                return;
        }
    }

    @Override
    public void a1(vt vtVar) {
        wg0 wg0Var = (wg0) this.f33611b;
        wg0Var.I = true;
        String str = vtVar.f38619c;
        wg0Var.f39146a.setText(str);
        wg0Var.v(str, vtVar);
        wg0Var.f39155y = vtVar;
        wg0Var.f39154x = 0;
        wg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + vtVar.f38619c, vtVar.d).apply();
        AndroidUtilities.runOnUIThread(new mg0(wg0Var, 4), 300L);
        tg0 tg0Var = wg0Var.f39147b;
        tg0Var.requestFocus();
        tg0Var.setSelection(tg0Var.length());
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f33611b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f33610a) {
            case 0:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f33611b, view, i10, f7);
                return;
            case 17:
                oc0 oc0Var = (oc0) this.f33611b;
                ArrayList arrayList = oc0Var.f36170s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    ic0 ic0Var = (ic0) arrayList.get(i10);
                    int i11 = ic0Var.f15672a;
                    int i12 = ic0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && ic0Var.f34492f == 1) {
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
                        oc0Var.e = org.telegram.ui.Components.xc.a0(oc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (ic0Var.f15672a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = oc0Var.U(i12)) != -1) {
                        oc0Var.f36168n[U] = !zArr[U];
                        oc0Var.Y();
                        oc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        oc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                zg0.U((zg0) this.f33611b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f33610a) {
            case 14:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f33611b, view, i10);
            case 24:
                final kj0 kj0Var = (kj0) this.f33611b;
                if (i10 >= kj0Var.I && i10 < kj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) kj0Var.f35132x.get(i10 - kj0Var.I);
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
                            org.telegram.ui.ActionBar.n2 R9;
                            org.telegram.ui.ActionBar.n2 n2Var = kj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j3);
                                } else {
                                    R9 = zn.R9(j3);
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
                                n2Var.presentFragment(new zn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    kj0Var.showDialog(b2Var);
                }
                return false;
            default:
                bl0 bl0Var = (bl0) this.f33611b;
                bl0Var.getClass();
                if (view instanceof al0) {
                    al0 al0Var = (al0) view;
                    bl0Var.Z(al0Var.e);
                    al0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f33610a) {
            case 0:
                return false;
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.e eVar;
        int i12 = this.f33610a;
        Object obj = this.f33611b;
        switch (i12) {
            case 2:
                ((a3.h0) obj).run();
                return;
            case 13:
                ((n70) obj).U(true);
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 18:
                he0 he0Var = (he0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", he0Var.I);
                bundle.putString("ephone", he0Var.J);
                bundle.putString("phoneFormated", he0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = he0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = he0Var.M;
                he0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new yd0(he0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 19:
                qe0 qe0Var = (qe0) obj;
                xg0.n0(qe0Var.f36808y, qe0Var.f36805s, qe0Var.v, qe0Var.f36806w);
                return;
            case 20:
                jf0 jf0Var = (jf0) obj;
                xg0 xg0Var = jf0Var.E;
                xg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(jf0Var, 12), 10);
                return;
            case 27:
                ((org.telegram.messenger.sj) obj).run();
                return;
            default:
                bl0 bl0Var = ((xk0) obj).f39506b;
                SparseArray sparseArray = bl0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    zk0 zk0Var = (zk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = zk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.d dVar = bl0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = zk0Var.e;
                        ArrayList arrayList2 = dVar.e;
                        if (document2 != null) {
                            if (!dVar.f43956f) {
                                dVar.f(true);
                                dVar.f43956f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.c) arrayList2.get(i14)).f43948a != null && ((uf.c) arrayList2.get(i14)).f43948a.f18302id == document2.f18302id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (zk0Var.f40190g != null && (eVar = bl0Var.getMediaDataController().ringtoneUploaderHashMap.get(zk0Var.f40190g)) != null) {
                        eVar.f43959c = true;
                        eVar.a();
                        int i15 = eVar.f43957a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = eVar.f43958b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (zk0Var == bl0Var.H) {
                        bl0Var.N = null;
                        bl0Var.H = (zk0) bl0Var.f32401b.get(0);
                        bl0Var.I = true;
                    }
                    bl0Var.f32400a.remove(zk0Var);
                    bl0Var.f32402c.remove(zk0Var);
                }
                bl0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18504id = tL_inputDocument;
                    tL_inputDocument.f18308id = document3.f18302id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    bl0Var.getConnectionsManager().sendRequest(saveringtone, new ai.t7(8));
                }
                bl0.W(bl0Var);
                bl0Var.c0();
                bl0Var.f32403f.l();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.be0 be0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f33611b;
        ArrayList arrayList = ExternalActionActivity.f31033x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31039n, externalActionActivity.v, true, externalActionActivity.f31040r, externalActionActivity.f31041s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31037c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, be0Var);
    }

    @Override
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ju) this.f33611b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31015c.get(i10);
        if (preset == dataAutoDownloadActivity.f31022y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31016f;
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
            s4.c1 L = dataAutoDownloadActivity.f31014b.L(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (L != null) {
                dataAutoDownloadActivity.f31013a.v(L, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public a0.i i() {
        switch (this.f33610a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public a0.i o() {
        switch (this.f33610a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.f33611b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.f38644x.isShowing()) {
            a00Var.f38644x.d(true);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f33610a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f33611b).f31050w;
    }

    @Override
    public boolean s(int i10) {
        switch (this.f33610a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f33610a) {
            case 7:
                mz mzVar = (mz) this.f33611b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.x51) obj).d != 1 || mzVar.f35777b == null) {
                    return;
                }
                boolean z10 = !mzVar.f35778c;
                mzVar.f35778c = z10;
                ai.m0 m0Var = mzVar.f35779f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(mzVar.f35778c);
                mzVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.wl0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.wl0) this.f33611b).f30090p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f33611b).run();
        return true;
    }

    private final void l(ArrayList arrayList) {
    }

    private final void m(ArrayList arrayList) {
    }

    @Override
    public void n() {
    }

    @Override
    public void C(float f7, int i10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }

    private final void k(View view, float f7, float f10) {
    }
}

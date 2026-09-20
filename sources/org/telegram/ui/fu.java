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
public final class fu implements org.telegram.ui.Components.kl0, org.telegram.ui.Components.dw0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.ch0, Utilities.Callback5, org.telegram.ui.Components.zd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.gl0, gg.b2, org.telegram.ui.Components.ll0, r0.n, au, le.d, wj0 {
    public final int f33721a;
    public final Object f33722b;

    public fu(Object obj, int i10) {
        this.f33721a = i10;
        this.f33722b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        ih0 ih0Var = (ih0) this.f33722b;
        ih0Var.getClass();
        ih0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        ih0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public boolean F(int i10) {
        switch (this.f33721a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void G(ArrayList arrayList) {
        int i10 = this.f33721a;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        ya0 ya0Var = (ya0) this.f33722b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ya0Var.f39872a.equals(defaultWindowInsets)) {
            ya0Var.f39872a = defaultWindowInsets;
            ya0Var.requestLayout();
        }
        int childCount = ya0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ya0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void Z0(vt vtVar) {
        xg0 xg0Var = (xg0) this.f33722b;
        xg0Var.I = true;
        String str = vtVar.f38599c;
        xg0Var.f39560a.setText(str);
        xg0Var.v(str, vtVar);
        xg0Var.f39569y = vtVar;
        xg0Var.f39568x = 0;
        xg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + vtVar.f38599c, vtVar.d).apply();
        AndroidUtilities.runOnUIThread(new ng0(xg0Var, 4), 300L);
        ug0 ug0Var = xg0Var.f39561b;
        ug0Var.requestFocus();
        ug0Var.setSelection(ug0Var.length());
    }

    @Override
    public void a(int i10) {
        switch (this.f33721a) {
            case 12:
                c70 c70Var = (c70) this.f33722b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f32654f.e() && c70Var.h() == 0) {
                    e70Var.f33268s.e(false, true);
                }
                c70Var.l();
                return;
            default:
                tk0 tk0Var = (tk0) this.f33722b;
                if (tk0Var.f37841f == null && !tk0Var.h.e()) {
                    tk0Var.f37842n.f31150c.c();
                }
                tk0Var.l();
                return;
        }
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f33722b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f33721a) {
            case 0:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f33722b, view, i10, f7);
                return;
            case 17:
                pc0 pc0Var = (pc0) this.f33722b;
                ArrayList arrayList = pc0Var.f36537s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    jc0 jc0Var = (jc0) arrayList.get(i10);
                    int i11 = jc0Var.f15704a;
                    int i12 = jc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && jc0Var.f34890f == 1) {
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
                        pc0Var.e = org.telegram.ui.Components.xc.a0(pc0Var).L(new org.telegram.ui.Components.x9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (jc0Var.f15704a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = pc0Var.U(i12)) != -1) {
                        pc0Var.f36535n[U] = !zArr[U];
                        pc0Var.Y();
                        pc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        pc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                ah0.U((ah0) this.f33722b, i10);
                return;
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f33721a) {
            case 0:
                return false;
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f33721a) {
            case 14:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f33722b, view, i10);
            case 24:
                final mj0 mj0Var = (mj0) this.f33722b;
                if (i10 >= mj0Var.I && i10 < mj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) mj0Var.f35760x.get(i10 - mj0Var.I);
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
                            org.telegram.ui.ActionBar.n2 R9;
                            org.telegram.ui.ActionBar.n2 n2Var = mj0.this;
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    mj0Var.showDialog(b2Var);
                }
                return false;
            default:
                bl0 bl0Var = (bl0) this.f33722b;
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
    public void f(org.telegram.ui.Components.ae0 ae0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f33722b;
        ArrayList arrayList = ExternalActionActivity.f31073x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31079n, externalActionActivity.v, true, externalActionActivity.f31080r, externalActionActivity.f31081s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31077c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ae0Var);
    }

    @Override
    public void g(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ju) this.f33722b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31055c.get(i10);
        if (preset == dataAutoDownloadActivity.f31062y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31056f;
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
            s4.c1 L = dataAutoDownloadActivity.f31054b.L(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (L != null) {
                dataAutoDownloadActivity.f31053a.v(L, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.f33721a;
        Object obj = this.f33722b;
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
                ie0 ie0Var = (ie0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ie0Var.I);
                bundle.putString("ephone", ie0Var.J);
                bundle.putString("phoneFormated", ie0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ie0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ie0Var.M;
                ie0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new zd0(ie0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 19:
                re0 re0Var = (re0) obj;
                yg0.n0(re0Var.f37135y, re0Var.f37132s, re0Var.v, re0Var.f37133w);
                return;
            case 20:
                kf0 kf0Var = (kf0) obj;
                yg0 yg0Var = kf0Var.E;
                yg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(kf0Var, 12), 10);
                return;
            case 27:
                ((org.telegram.messenger.rj) obj).run();
                return;
            default:
                bl0 bl0Var = ((xk0) obj).f39611b;
                SparseArray sparseArray = bl0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    zk0 zk0Var = (zk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = zk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = bl0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = zk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f44000f) {
                                cVar.f(true);
                                cVar.f44000f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i14)).f43992a != null && ((uf.b) arrayList2.get(i14)).f43992a.f18334id == document2.f18334id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (zk0Var.f40232g != null && (dVar = bl0Var.getMediaDataController().ringtoneUploaderHashMap.get(zk0Var.f40232g)) != null) {
                        dVar.f44003c = true;
                        dVar.a();
                        int i15 = dVar.f44001a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f44002b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (zk0Var == bl0Var.H) {
                        bl0Var.N = null;
                        bl0Var.H = (zk0) bl0Var.f32484b.get(0);
                        bl0Var.I = true;
                    }
                    bl0Var.f32483a.remove(zk0Var);
                    bl0Var.f32485c.remove(zk0Var);
                }
                bl0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18536id = tL_inputDocument;
                    tL_inputDocument.f18340id = document3.f18334id;
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
                bl0Var.f32486f.l();
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public a0.i l() {
        switch (this.f33721a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.f33722b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.f38624x.isShowing()) {
            a00Var.f38624x.d(true);
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f33721a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f33722b).f31090w;
    }

    @Override
    public a0.i w() {
        switch (this.f33721a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f33721a) {
            case 7:
                mz mzVar = (mz) this.f33722b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.w51) obj).d != 1 || mzVar.f35852b == null) {
                    return;
                }
                boolean z10 = !mzVar.f35853c;
                mzVar.f35853c = z10;
                ai.m0 m0Var = mzVar.f35854f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
                }
                ((org.telegram.ui.Cells.x8) view).setChecked(mzVar.f35853c);
                mzVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.vl0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.vl0) this.f33722b).f29207p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f33722b).run();
        return true;
    }

    private final void j(ArrayList arrayList) {
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

    private final void h(View view, float f7, float f10) {
    }

    private final void i(View view, float f7, float f10) {
    }
}

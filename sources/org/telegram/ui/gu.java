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
public final class gu implements org.telegram.ui.Components.bl0, org.telegram.ui.Components.tv0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.tg0, Utilities.Callback5, org.telegram.ui.Components.rd0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.xk0, gg.b2, org.telegram.ui.Components.cl0, r0.n, bu, le.d, vj0 {
    public final int f34047a;
    public final Object f34048b;

    public gu(Object obj, int i10) {
        this.f34047a = i10;
        this.f34048b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        ih0 ih0Var = (ih0) this.f34048b;
        ih0Var.getClass();
        ih0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        ih0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public a0.i F() {
        switch (this.f34047a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean O(int i10) {
        switch (this.f34047a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void Q(ArrayList arrayList) {
        int i10 = this.f34047a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ya0 ya0Var = (ya0) this.f34048b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ya0Var.f39847a.equals(defaultWindowInsets)) {
            ya0Var.f39847a = defaultWindowInsets;
            ya0Var.requestLayout();
        }
        int childCount = ya0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ya0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f34048b).draw(canvas);
    }

    @Override
    public void a1(xt xtVar) {
        xg0 xg0Var = (xg0) this.f34048b;
        xg0Var.I = true;
        String str = xtVar.f39702c;
        xg0Var.f39619a.setText(str);
        xg0Var.v(str, xtVar);
        xg0Var.f39628y = xtVar;
        xg0Var.f39627x = 0;
        xg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + xtVar.f39702c, xtVar.d).apply();
        AndroidUtilities.runOnUIThread(new ng0(xg0Var, 4), 300L);
        ug0 ug0Var = xg0Var.f39620b;
        ug0Var.requestFocus();
        ug0Var.setSelection(ug0Var.length());
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f34047a) {
            case 0:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f34048b, view, i10, f7);
                return;
            case 17:
                pc0 pc0Var = (pc0) this.f34048b;
                ArrayList arrayList = pc0Var.f36603s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    jc0 jc0Var = (jc0) arrayList.get(i10);
                    int i11 = jc0Var.f15543a;
                    int i12 = jc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && jc0Var.f34846f == 1) {
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
                        pc0Var.e = org.telegram.ui.Components.vc.a0(pc0Var).L(new org.telegram.ui.Components.w9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (jc0Var.f15543a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = pc0Var.U(i12)) != -1) {
                        pc0Var.f36601n[U] = !zArr[U];
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
                ah0.U((ah0) this.f34048b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f34047a) {
            case 14:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f34048b, view, i10);
            case 24:
                final lj0 lj0Var = (lj0) this.f34048b;
                if (i10 >= lj0Var.I && i10 < lj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) lj0Var.f35579x.get(i10 - lj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lj0Var.getParentActivity(), 0, lj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.o2 R9;
                            org.telegram.ui.ActionBar.o2 o2Var = lj0.this;
                            o2Var.getClass();
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
                                o2Var.presentFragment(R9);
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
                            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                                o2Var.presentFragment(new bo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                    c2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    c2Var.Q = intArray;
                    c2Var.M = onClickListener;
                    lj0Var.showDialog(c2Var);
                }
                return false;
            default:
                al0 al0Var = (al0) this.f34048b;
                al0Var.getClass();
                if (view instanceof zk0) {
                    zk0 zk0Var = (zk0) view;
                    al0Var.Z(zk0Var.e);
                    zk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f34047a) {
            case 0:
                return false;
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.f34047a;
        Object obj = this.f34048b;
        switch (i12) {
            case 2:
                ((a3.h0) obj).run();
                return;
            case 13:
                ((p70) obj).U(true);
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
                yg0.n0(re0Var.f37213y, re0Var.f37210s, re0Var.v, re0Var.f37211w);
                return;
            case 20:
                kf0 kf0Var = (kf0) obj;
                yg0 yg0Var = kf0Var.E;
                yg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(kf0Var, 12), 10);
                return;
            case 27:
                ((org.telegram.messenger.sj) obj).run();
                return;
            default:
                al0 al0Var = ((wk0) obj).f39075b;
                SparseArray sparseArray = al0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    yk0 yk0Var = (yk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = yk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = al0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = yk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f43726f) {
                                cVar.f(true);
                                cVar.f43726f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i14)).f43718a != null && ((uf.b) arrayList2.get(i14)).f43718a.f18127id == document2.f18127id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (yk0Var.f39936g != null && (dVar = al0Var.getMediaDataController().ringtoneUploaderHashMap.get(yk0Var.f39936g)) != null) {
                        dVar.f43729c = true;
                        dVar.a();
                        int i15 = dVar.f43727a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f43728b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (yk0Var == al0Var.H) {
                        al0Var.N = null;
                        al0Var.H = (yk0) al0Var.f31918b.get(0);
                        al0Var.I = true;
                    }
                    al0Var.f31917a.remove(yk0Var);
                    al0Var.f31919c.remove(yk0Var);
                }
                al0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18329id = tL_inputDocument;
                    tL_inputDocument.f18133id = document3.f18127id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    al0Var.getConnectionsManager().sendRequest(saveringtone, new ai.t7(8));
                }
                al0.W(al0Var);
                al0Var.c0();
                al0Var.f31920f.l();
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ku) this.f34048b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f30788c.get(i10);
        if (preset == dataAutoDownloadActivity.f30795y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f30789f;
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
            s4.c1 L = dataAutoDownloadActivity.f30787b.L(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (L != null) {
                dataAutoDownloadActivity.f30786a.v(L, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void h(int i10) {
        switch (this.f34047a) {
            case 12:
                e70 e70Var = (e70) this.f34048b;
                g70 g70Var = e70Var.I;
                g70Var.q0(e70Var.H);
                if (e70Var.h == null && !e70Var.f33308f.e() && e70Var.h() == 0) {
                    g70Var.f33894s.e(false, true);
                }
                e70Var.l();
                return;
            default:
                sk0 sk0Var = (sk0) this.f34048b;
                if (sk0Var.f37514f == null && !sk0Var.h.e()) {
                    sk0Var.f37515n.f30883c.c();
                }
                sk0Var.l();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f34048b;
        ArrayList arrayList = ExternalActionActivity.f30806x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f30812n, externalActionActivity.v, true, externalActionActivity.f30813r, externalActionActivity.f30814s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f30810c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        c00 c00Var = (c00) this.f34048b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && c00Var.f39740x.isShowing()) {
            c00Var.f39740x.d(true);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f34047a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f34048b).f30823w;
    }

    @Override
    public a0.i w() {
        switch (this.f34047a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34047a) {
            case 7:
                oz ozVar = (oz) this.f34048b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.j51) obj).d != 1 || ozVar.f36465b == null) {
                    return;
                }
                boolean z10 = !ozVar.f36466c;
                ozVar.f36466c = z10;
                ai.m0 m0Var = ozVar.f36467f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(ozVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(ozVar.f36466c);
                ozVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.ml0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.ml0) this.f34048b).f26194p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f34048b).run();
        return true;
    }

    private final void k(ArrayList arrayList) {
    }

    private final void m(ArrayList arrayList) {
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

    private final void j(View view, float f7, float f10) {
    }
}

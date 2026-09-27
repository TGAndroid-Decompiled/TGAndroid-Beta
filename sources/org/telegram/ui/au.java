package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
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
public final class au implements org.telegram.ui.Components.nl0, org.telegram.ui.Components.fw0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.fh0, Utilities.Callback5, org.telegram.ui.Components.be0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.jl0, gg.b2, org.telegram.ui.Components.ol0, r0.n, xt, le.e, pj0 {
    public final int f32146a;
    public final Object f32147b;

    public au(Object obj, int i10) {
        this.f32146a = i10;
        this.f32147b = obj;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        dh0 dh0Var = (dh0) this.f32147b;
        dh0Var.getClass();
        dh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        dh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public void F(ArrayList arrayList) {
        int i10 = this.f32146a;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ta0 ta0Var = (ta0) this.f32147b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ta0Var.f37745a.equals(defaultWindowInsets)) {
            ta0Var.f37745a = defaultWindowInsets;
            ta0Var.requestLayout();
        }
        int childCount = ta0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ta0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override
    public void a(int i10) {
        switch (this.f32146a) {
            case 13:
                a70 a70Var = (a70) this.f32147b;
                c70 c70Var = a70Var.I;
                c70Var.q0(a70Var.H);
                if (a70Var.h == null && !a70Var.f31986f.e() && a70Var.h() == 0) {
                    c70Var.f32558s.e(false, true);
                }
                a70Var.l();
                return;
            default:
                mk0 mk0Var = (mk0) this.f32147b;
                if (mk0Var.f35718f == null && !mk0Var.h.e()) {
                    mk0Var.f35719n.f31154c.c();
                }
                mk0Var.l();
                return;
        }
    }

    @Override
    public void a1(tt ttVar) {
        sg0 sg0Var = (sg0) this.f32147b;
        sg0Var.I = true;
        String str = ttVar.f37910c;
        sg0Var.f37448a.setText(str);
        sg0Var.v(str, ttVar);
        sg0Var.f37457y = ttVar;
        sg0Var.f37456x = 0;
        sg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ttVar.f37910c, ttVar.d).apply();
        AndroidUtilities.runOnUIThread(new ig0(sg0Var, 4), 300L);
        pg0 pg0Var = sg0Var.f37449b;
        pg0Var.requestFocus();
        pg0Var.setSelection(pg0Var.length());
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f32147b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.x51 G;
        Object obj;
        long j3;
        int U;
        boolean[] zArr;
        switch (this.f32146a) {
            case 0:
                bu buVar = (bu) this.f32147b;
                HashSet hashSet = buVar.f32438b0;
                if (!buVar.f32439c0 && (G = buVar.f32440d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f18476id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f18329id;
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
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f32147b, view, i10, f7);
                return;
            case 18:
                kc0 kc0Var = (kc0) this.f32147b;
                ArrayList arrayList = kc0Var.f35005s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    ec0 ec0Var = (ec0) arrayList.get(i10);
                    int i11 = ec0Var.f15754a;
                    int i12 = ec0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && ec0Var.f33216f == 1) {
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
                        kc0Var.e = org.telegram.ui.Components.xc.a0(kc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (ec0Var.f15754a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = kc0Var.U(i12)) != -1) {
                        kc0Var.f35003n[U] = !zArr[U];
                        kc0Var.Y();
                        kc0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        kc0Var.Y();
                        return;
                    }
                }
                return;
            default:
                vg0.U((vg0) this.f32147b, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f32146a) {
            case 15:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f32147b, view, i10);
            case 25:
                final gj0 gj0Var = (gj0) this.f32147b;
                if (i10 >= gj0Var.I && i10 < gj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) gj0Var.f33967x.get(i10 - gj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gj0Var.getParentActivity(), 0, gj0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.o2 o2Var = gj0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j3);
                                } else {
                                    R9 = xn.R9(j3);
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
                                o2Var.presentFragment(new xn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    c2Var.Q = intArray;
                    c2Var.M = onClickListener;
                    gj0Var.showDialog(c2Var);
                }
                return false;
            default:
                vk0 vk0Var = (vk0) this.f32147b;
                vk0Var.getClass();
                if (view instanceof uk0) {
                    uk0 uk0Var = (uk0) view;
                    vk0Var.Z(uk0Var.e);
                    uk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f32146a) {
            case 0:
                return false;
            case 1:
                return false;
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.f32146a;
        Object obj = this.f32147b;
        switch (i12) {
            case 3:
                ((a3.h0) obj).run();
                return;
            case 14:
                ((l70) obj).U(true);
                return;
            case 16:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 19:
                de0 de0Var = (de0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", de0Var.I);
                bundle.putString("ephone", de0Var.J);
                bundle.putString("phoneFormated", de0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = de0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = de0Var.M;
                de0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ud0(de0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                me0 me0Var = (me0) obj;
                tg0.n0(me0Var.f35676y, me0Var.f35673s, me0Var.v, me0Var.f35674w);
                return;
            case 21:
                ff0 ff0Var = (ff0) obj;
                tg0 tg0Var = ff0Var.E;
                tg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(ff0Var, 12), 10);
                return;
            default:
                ((org.telegram.messenger.qj) obj).run();
                return;
        }
    }

    @Override
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((gu) this.f32147b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f31059c.get(i10);
        if (preset == dataAutoDownloadActivity.f31066y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f31060f;
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
            s4.c1 L = dataAutoDownloadActivity.f31058b.L(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (L != null) {
                dataAutoDownloadActivity.f31057a.v(L, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void j(org.telegram.ui.Components.ce0 ce0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f32147b;
        ArrayList arrayList = ExternalActionActivity.f31077x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f31083n, externalActionActivity.v, true, externalActionActivity.f31084r, externalActionActivity.f31085s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f31081c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ce0Var);
    }

    @Override
    public a0.i l() {
        switch (this.f32146a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public a0.i o() {
        switch (this.f32146a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        zz zzVar = (zz) this.f32147b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && zzVar.f38389x.isShowing()) {
            zzVar.f38389x.d(true);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f32146a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f32147b).f31094w;
    }

    @Override
    public boolean s(int i10) {
        switch (this.f32146a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f32146a) {
            case 8:
                lz lzVar = (lz) this.f32147b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.x51) obj).d != 1 || lzVar.f35479b == null) {
                    return;
                }
                boolean z10 = !lzVar.f35480c;
                lzVar.f35480c = z10;
                ai.m0 m0Var = lzVar.f35481f;
                if (m0Var != null) {
                    m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(lzVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(lzVar.f35480c);
                lzVar.e.Y2.N(true);
                return;
            default:
                org.telegram.ui.Components.yl0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.yl0) this.f32147b).f30709p2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.f32147b).run();
        return true;
    }

    private final void m(ArrayList arrayList) {
    }

    private final void q(ArrayList arrayList) {
    }

    @Override
    public void n() {
    }

    @Override
    public void C(float f7, int i10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }

    private final void i(View view, float f7, float f10) {
    }

    private final void k(View view, float f7, float f10) {
    }
}

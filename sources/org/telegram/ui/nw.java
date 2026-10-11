package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nw implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.hm0, my, ContactsLoadingObserver.Callback, org.telegram.ui.Components.gw0, org.telegram.ui.Components.im0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, xt, FileLoader.FileResolver {
    public final int f40361a;
    public final Object f40362b;
    public final Object f40363c;

    public nw(int i10, Object obj, Object obj2) {
        this.f40361a = i10;
        this.f40362b = obj;
        this.f40363c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(sy syVar) {
        return false;
    }

    @Override
    public void U0(tt ttVar) {
        mn0 mn0Var = (mn0) this.f40362b;
        int intValue = ((Integer) ((View) this.f40363c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = mn0Var.Y[intValue];
        if (intValue == 5) {
            mn0Var.f40023s = ttVar.d;
        } else {
            mn0Var.v = ttVar.d;
        }
        editTextBoldCursor.setText(ttVar.f42259a);
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f40361a) {
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40362b;
        int[] iArr = (int[]) this.f40363c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        gd0 gd0Var = new gd0(2);
        gd0Var.t0(sharingLocationInfo.messageObject);
        gd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(gd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f40361a) {
            case 2:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f40362b, (Context) this.f40363c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f40362b, (Context) this.f40363c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        gd0 gd0Var = (gd0) this.f40362b;
        Context context = (Context) this.f40363c;
        if (gd0Var.G0 == 2) {
            Object J = gd0Var.T.J(i10);
            if (J instanceof ad0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, gd0Var.getParentActivity(), gd0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new qv(16, gd0Var, (ad0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                yc0 yc0Var = new yc0(gd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                gd0Var.I0 = yc0Var;
                yc0Var.setOutsideTouchable(true);
                gd0Var.I0.setClippingEnabled(true);
                gd0Var.I0.setInputMethodMode(2);
                gd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                gd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                gd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        gd0 gd0Var = (gd0) this.f40362b;
        ad0 ad0Var = (ad0) this.f40363c;
        gd0Var.getClass();
        if (z10 && !z11 && ad0Var.f36042e != null && (f02 = gd0Var.f0(ad0Var)) != null) {
            ad0Var.f36042e.setIcon(f02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f40361a;
        org.telegram.ui.ActionBar.a2 a2Var2 = null;
        int i12 = 0;
        Object obj = this.f40363c;
        Object obj2 = this.f40362b;
        switch (i11) {
            case 1:
                rw rwVar = (rw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                rwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20155id = dialogFilter.f17251id;
                sy syVar = rwVar.f41520b;
                syVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                syVar.getMessagesController().removeFilter(dialogFilter);
                syVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 2:
            case 7:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 25:
            default:
                uo0 uo0Var = (uo0) obj2;
                uo0Var.f42696b0 = true;
                uo0Var.f42693a0.email_unconfirmed_pattern = (String) obj;
                uo0Var.J0();
                return;
            case 3:
                b20 b20Var = (b20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = b20Var.f36245e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(filtersSetupActivity.getParentActivity(), 3, null);
                    a2Var3.f20390g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20155id = dialogFilter2.f17251id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new aa(b20Var, a2Var2, dialogFilter2, 10));
                return;
            case 4:
                g60 g60Var = (g60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = g60Var.d;
                if (g60Var.p1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f20179id);
                        g60Var.f37869a1.addKickedUser(user.f20179id);
                        g60Var.l1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.j1(), user2);
                    g60Var.l1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.j1(), (TLRPC.User) null, chat, false, false);
                    g60Var.l1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 5:
                c70 c70Var = (c70) obj2;
                c70Var.f36613x.i((TLRPC.User) obj);
                if (c70Var.f36593f.f30964r.length() > 0) {
                    c70Var.f36593f.f30964r.setText((CharSequence) null);
                    return;
                }
                return;
            case 6:
                c70 c70Var2 = (c70) obj2;
                c70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var4 = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var4 != null && a2Var4.b()) {
                    i12 = 100;
                }
                c70Var2.m0(i12);
                return;
            case 8:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((vg0) obj);
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 18:
                ((ke0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 19:
                ne0 ne0Var = (ne0) obj2;
                ne0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ne0Var.f40231r);
                bundle.putString("requestPhone", ne0Var.f40232s);
                bundle.putString("phoneHash", ne0Var.v);
                bundle.putString("phoneCode", ne0Var.f40233w);
                ne0Var.f40235y.u1(7, true, bundle, false);
                return;
            case 21:
                yf0.o((yf0) obj2, (Context) obj);
                return;
            case 23:
                mn0 mn0Var = (mn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!mn0Var.f40030v0) {
                    mn0Var.f40025s1.clear();
                }
                mn0Var.f40027t1.clear();
                pm0 pm0Var = (pm0) mn0Var.B1;
                pm0Var.d.i1(mn0Var.E, mn0Var.F, mn0Var.G, zArr[0], null, null, pm0Var.f40910b);
                mn0Var.finishFragment();
                return;
            case 24:
                int[] iArr = ((mn0) obj2).f40035x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 26:
                mn0.U((mn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f40361a) {
            case 28:
                return FileLoader.getInstance(((PhotoViewer) this.f40362b).T).getPathToAttach((TLObject) this.f40363c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f40362b).T).getPathToMessage((TLRPC.Message) this.f40363c);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f40361a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f40361a) {
            case 17:
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.f40363c;
                vg0 vg0Var = ((ee0) this.f40362b).W;
                if (vg0Var.getParentActivity() != null) {
                    vg0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.f40363c;
                vg0 vg0Var2 = ((jf0) this.f40362b).E;
                if (vg0Var2.getParentActivity() != null && !vg0Var2.getParentActivity().isFinishing()) {
                    vg0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40362b;
        Intent intent = (Intent) this.f40363c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        o80 o80Var = (o80) this.f40363c;
        sy syVar2 = (sy) this.f40362b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = o80Var.f40443f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        o80Var.f40441d0.saveKeepMediaExceptions(o80Var.f40440c0, o80Var.f40443f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", o80Var.f40440c0);
        l80 l80Var = new l80(bundle, syVar2);
        l80Var.d = o80Var.f40443f0;
        l80Var.U();
        o80Var.f40444g0.presentFragment(l80Var);
        AndroidUtilities.runOnUIThread(new n70(3, l80Var, keepMediaException), 150L);
        return true;
    }

    public nw(o80 o80Var, sy syVar) {
        this.f40361a = 7;
        this.f40363c = o80Var;
        this.f40362b = syVar;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
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
public final class ks implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.am0, xx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.zv0, org.telegram.ui.Components.bm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final int f39026a;
    public final Object f39027b;
    public final Object f39028c;

    public ks(int i10, Object obj, Object obj2) {
        this.f39026a = i10;
        this.f39027b = obj;
        this.f39028c = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(ey eyVar) {
        return false;
    }

    @Override
    public boolean P0(View view) {
        switch (this.f39026a) {
            case 1:
                return false;
            case 4:
                return false;
            case 7:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f39026a;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39027b;
        int[] iArr = (int[]) this.f39028c;
        Pattern pattern = LaunchActivity.D1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.P0(i10);
        rc0 rc0Var = new rc0(2);
        rc0Var.u0(sharingLocationInfo.messageObject);
        rc0Var.E0 = new ci.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.u0(rc0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f39026a) {
            case 1:
                DataSettingsActivity.U((DataSettingsActivity) this.f39027b, (Context) this.f39028c, view, i10, f7);
                return;
            case 4:
                ey.c0((ey) this.f39027b, (dy) this.f39028c, view, i10);
                return;
            case 7:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f39027b, (Context) this.f39028c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f39027b, (Context) this.f39028c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        rc0 rc0Var = (rc0) this.f39027b;
        Context context = (Context) this.f39028c;
        if (rc0Var.F0 == 2) {
            Object J = rc0Var.T.J(i10);
            if (J instanceof lc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, rc0Var.getParentActivity(), rc0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.j(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new org.telegram.ui.Components.c51(27, rc0Var, (lc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                jc0 jc0Var = new jc0(rc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                rc0Var.H0 = jc0Var;
                jc0Var.setOutsideTouchable(true);
                rc0Var.H0.setClippingEnabled(true);
                rc0Var.H0.setInputMethodMode(2);
                rc0Var.H0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                rc0Var.H0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                rc0Var.H0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        rc0 rc0Var = (rc0) this.f39027b;
        lc0 lc0Var = (lc0) this.f39028c;
        rc0Var.getClass();
        if (z10 && !z11 && lc0Var.e != null && (g02 = rc0Var.g0(lc0Var)) != null) {
            lc0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f39026a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i12 = 0;
        Object obj = this.f39028c;
        Object obj2 = this.f39027b;
        switch (i11) {
            case 0:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ts tsVar = contactsActivity.W;
                if (tsVar != null) {
                    tsVar.b(user);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 1:
            case 4:
            case 5:
            case 7:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 27:
            default:
                int[] iArr = ((zm0) obj2).f44176x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 2:
                cv.U((cv) obj2, (TLRPC.User) obj);
                return;
            case 3:
                ((ey) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f20491id);
                return;
            case 6:
                dw dwVar = (dw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                dwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20467id = dialogFilter.f17862id;
                ey eyVar = dwVar.f36730b;
                eyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                eyVar.getMessagesController().removeFilter(dialogFilter);
                eyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 8:
                p10 p10Var = (p10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.f20763i0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20467id = dialogFilter2.f17862id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ca(p10Var, c2Var2, dialogFilter2, 10));
                return;
            case 9:
                u50 u50Var = (u50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = u50Var.d;
                if (u50Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.f20491id);
                        u50Var.f42217a1.addKickedUser(user2.f20491id);
                        u50Var.k1().k(0L, 102, user2, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(u50Var.i1(), user3);
                    u50Var.k1().k(0L, 32, user3, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(u50Var.i1(), (TLRPC.User) null, chat, false, false);
                    u50Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 10:
                p60 p60Var = (p60) obj2;
                p60Var.f40376x.h((TLRPC.User) obj);
                if (p60Var.f40356f.f27258r.length() > 0) {
                    p60Var.f40356f.f27258r.setText((CharSequence) null);
                    return;
                }
                return;
            case 11:
                p60 p60Var2 = (p60) obj2;
                p60Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                p60Var2.m0(i12);
                return;
            case 13:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 14:
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) obj2).u0((hg0) obj);
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.z0(true);
                return;
            case 23:
                ((wd0) obj2).G.s1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 24:
                ae0 ae0Var = (ae0) obj2;
                ae0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ae0Var.f35742r);
                bundle.putString("requestPhone", ae0Var.f35743s);
                bundle.putString("phoneHash", ae0Var.v);
                bundle.putString("phoneCode", ae0Var.f35744w);
                ae0Var.f35746y.y1(7, true, bundle, false);
                return;
            case 26:
                lf0.n((lf0) obj2, (Context) obj);
                return;
            case 28:
                zm0 zm0Var = (zm0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zm0Var.f44171v0) {
                    zm0Var.f44166s1.clear();
                }
                zm0Var.f44168t1.clear();
                cm0 cm0Var = (cm0) zm0Var.B1;
                cm0Var.d.i1(zm0Var.E, zm0Var.F, zm0Var.G, zArr[0], null, null, cm0Var.f36372b);
                zm0Var.finishFragment();
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f39026a) {
            case 22:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f39028c;
                hg0 hg0Var = ((qd0) this.f39027b).W;
                if (hg0Var.getParentActivity() != null) {
                    hg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f39028c;
                hg0 hg0Var2 = ((xe0) this.f39027b).E;
                if (hg0Var2.getParentActivity() != null && !hg0Var2.getParentActivity().isFinishing()) {
                    hg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39027b;
        Intent intent = (Intent) this.f39028c;
        Pattern pattern = LaunchActivity.D1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        c80 c80Var = (c80) this.f39027b;
        ey eyVar2 = (ey) this.f39028c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = c80Var.f36265f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        c80Var.f36263d0.saveKeepMediaExceptions(c80Var.f36262c0, c80Var.f36265f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", c80Var.f36262c0);
        y70 y70Var = new y70(bundle, eyVar2);
        y70Var.d = c80Var.f36265f0;
        y70Var.U();
        c80Var.f36266g0.presentFragment(y70Var);
        AndroidUtilities.runOnUIThread(new ot(28, y70Var, keepMediaException), 150L);
        return true;
    }

    public ks(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f39026a = 0;
        this.f39027b = contactsActivity;
        this.f39028c = user;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }

    private final void h(View view, float f7, float f10) {
    }
}

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
public final class ov implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, xx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.vv0, org.telegram.ui.Components.yl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, pt {
    public final int f39888a;
    public final Object f39889b;
    public final Object f39890c;

    public ov(int i10, Object obj, Object obj2) {
        this.f39888a = i10;
        this.f39889b = obj;
        this.f39890c = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void L0(kt ktVar) {
        xm0 xm0Var = (xm0) this.f39889b;
        int intValue = ((Integer) ((View) this.f39890c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = xm0Var.Y[intValue];
        if (intValue == 5) {
            xm0Var.f43203s = ktVar.d;
        } else {
            xm0Var.v = ktVar.d;
        }
        editTextBoldCursor.setText(ktVar.f38677a);
    }

    @Override
    public boolean P0(View view) {
        switch (this.f39888a) {
            case 1:
                return false;
            case 4:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        pc0 pc0Var = (pc0) this.f39889b;
        Context context = (Context) this.f39890c;
        if (pc0Var.G0 == 2) {
            Object J = pc0Var.T.J(i10);
            if (J instanceof jc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, pc0Var.getParentActivity(), pc0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new org.telegram.ui.Components.g51(26, pc0Var, (jc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                hc0 hc0Var = new hc0(pc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pc0Var.I0 = hc0Var;
                hc0Var.setOutsideTouchable(true);
                pc0Var.I0.setClippingEnabled(true);
                pc0Var.I0.setInputMethodMode(2);
                pc0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pc0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                pc0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f39888a;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39889b;
        int[] iArr = (int[]) this.f39890c;
        Pattern pattern = LaunchActivity.C1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.O0(i10);
        pc0 pc0Var = new pc0(2);
        pc0Var.t0(sharingLocationInfo.messageObject);
        pc0Var.F0 = new ci.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.t0(pc0Var);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f39888a) {
            case 1:
                ey.f0((ey) this.f39889b, (dy) this.f39890c, view, i10);
                return;
            case 4:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f39889b, (Context) this.f39890c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f39889b, (Context) this.f39890c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        pc0 pc0Var = (pc0) this.f39889b;
        jc0 jc0Var = (jc0) this.f39890c;
        pc0Var.getClass();
        if (z10 && !z11 && jc0Var.e != null && (f02 = pc0Var.f0(jc0Var)) != null) {
            jc0Var.e.setIcon(f02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f39888a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f39890c;
        Object obj2 = this.f39889b;
        switch (i11) {
            case 0:
                ((ey) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).f20419id);
                return;
            case 1:
            case 2:
            case 4:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            case 27:
            default:
                fo0 fo0Var = (fo0) obj2;
                fo0Var.f36974b0 = true;
                fo0Var.f36971a0.email_unconfirmed_pattern = (String) obj;
                fo0Var.J0();
                return;
            case 3:
                dw dwVar = (dw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                dwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20395id = dialogFilter.f17795id;
                ey eyVar = dwVar.f36326b;
                eyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                eyVar.getMessagesController().removeFilter(dialogFilter);
                eyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 5:
                n10 n10Var = (n10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = n10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f20661g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20395id = dialogFilter2.f17795id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ea(n10Var, b2Var2, dialogFilter2, 10));
                return;
            case 6:
                s50 s50Var = (s50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = s50Var.d;
                if (s50Var.p1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f20419id);
                        s50Var.f40913a1.addKickedUser(user.f20419id);
                        s50Var.l1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(s50Var.j1(), user2);
                    s50Var.l1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(s50Var.j1(), (TLRPC.User) null, chat, false, false);
                    s50Var.l1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 7:
                n60 n60Var = (n60) obj2;
                n60Var.f39356x.h((TLRPC.User) obj);
                if (n60Var.f39336f.f27712r.length() > 0) {
                    n60Var.f39336f.f27712r.setText((CharSequence) null);
                    return;
                }
                return;
            case 8:
                n60 n60Var2 = (n60) obj2;
                n60Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                n60Var2.m0(i12);
                return;
            case 10:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 11:
                Pattern pattern = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((fg0) obj);
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.C1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                return;
            case 20:
                ((ud0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 21:
                xd0 xd0Var = (xd0) obj2;
                xd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", xd0Var.f43095r);
                bundle.putString("requestPhone", xd0Var.f43096s);
                bundle.putString("phoneHash", xd0Var.v);
                bundle.putString("phoneCode", xd0Var.f43097w);
                xd0Var.f43099y.u1(7, true, bundle, false);
                return;
            case 23:
                jf0.o((jf0) obj2, (Context) obj);
                return;
            case 25:
                xm0 xm0Var = (xm0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!xm0Var.f43210v0) {
                    xm0Var.f43205s1.clear();
                }
                xm0Var.f43207t1.clear();
                bm0 bm0Var = (bm0) xm0Var.B1;
                bm0Var.d.i1(xm0Var.E, xm0Var.F, xm0Var.G, zArr[0], null, null, bm0Var.f35710b);
                xm0Var.finishFragment();
                return;
            case 26:
                int[] iArr = ((xm0) obj2).f43215x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 28:
                xm0.U((xm0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f39888a) {
            case 19:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f39890c;
                fg0 fg0Var = ((od0) this.f39889b).W;
                if (fg0Var.getParentActivity() != null) {
                    fg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f39890c;
                fg0 fg0Var2 = ((te0) this.f39889b).E;
                if (fg0Var2.getParentActivity() != null && !fg0Var2.getParentActivity().isFinishing()) {
                    fg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39889b;
        Intent intent = (Intent) this.f39890c;
        Pattern pattern = LaunchActivity.C1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        x70 x70Var = (x70) this.f39890c;
        ey eyVar2 = (ey) this.f39889b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = x70Var.f43019f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        x70Var.f43017d0.saveKeepMediaExceptions(x70Var.f43016c0, x70Var.f43019f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", x70Var.f43016c0);
        u70 u70Var = new u70(bundle, eyVar2);
        u70Var.d = x70Var.f43019f0;
        u70Var.U();
        x70Var.f43020g0.presentFragment(u70Var);
        AndroidUtilities.runOnUIThread(new nt(28, u70Var, keepMediaException), 150L);
        return true;
    }

    public ov(x70 x70Var, ey eyVar) {
        this.f39888a = 9;
        this.f39890c = x70Var;
        this.f39889b = eyVar;
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}

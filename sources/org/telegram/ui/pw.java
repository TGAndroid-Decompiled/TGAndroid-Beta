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
public final class pw implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0, oy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.sv0, org.telegram.ui.Components.ol0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, yt, FileLoader.FileResolver {
    public final int f39544a;
    public final Object f39545b;
    public final Object f39546c;

    public pw(int i10, Object obj, Object obj2) {
        this.f39544a = i10;
        this.f39545b = obj;
        this.f39546c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39545b;
        int[] iArr = (int[]) this.f39546c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        gd0 gd0Var = new gd0(2);
        gd0Var.u0(sharingLocationInfo.messageObject);
        gd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(gd0Var);
    }

    @Override
    public void b1(ut utVar) {
        kn0 kn0Var = (kn0) this.f39545b;
        int intValue = ((Integer) ((View) this.f39546c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = kn0Var.Y[intValue];
        if (intValue == 5) {
            kn0Var.f38044s = utVar.d;
        } else {
            kn0Var.v = utVar.d;
        }
        editTextBoldCursor.setText(utVar.f41297a);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f39544a) {
            case 2:
                FiltersSetupActivity.S((FiltersSetupActivity) this.f39545b, (Context) this.f39546c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.S((NotificationsCustomSettingsActivity) this.f39545b, (Context) this.f39546c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        gd0 gd0Var = (gd0) this.f39545b;
        Context context = (Context) this.f39546c;
        if (gd0Var.G0 == 2) {
            Object J = gd0Var.T.J(i10);
            if (J instanceof ad0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, gd0Var.getParentActivity(), gd0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new tv(16, gd0Var, (ad0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
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
        Bitmap g02;
        gd0 gd0Var = (gd0) this.f39545b;
        ad0 ad0Var = (ad0) this.f39546c;
        gd0Var.getClass();
        if (z10 && !z11 && ad0Var.f34791e != null && (g02 = gd0Var.g0(ad0Var)) != null) {
            ad0Var.f34791e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f1(View view) {
        switch (this.f39544a) {
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f39544a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f39546c;
        Object obj2 = this.f39545b;
        switch (i11) {
            case 1:
                ly lyVar = (ly) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                lyVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20160id = dialogFilter.f17256id;
                uy uyVar = lyVar.f38359b;
                uyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar.getMessagesController().removeFilter(dialogFilter);
                uyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
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
                so0 so0Var = (so0) obj2;
                so0Var.f40543b0 = true;
                so0Var.f40540a0.email_unconfirmed_pattern = (String) obj;
                so0Var.J0();
                return;
            case 3:
                d20 d20Var = (d20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = d20Var.f35621e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f20422g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f20160id = dialogFilter2.f17256id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ca(d20Var, b2Var2, dialogFilter2, 10));
                return;
            case 4:
                h60 h60Var = (h60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = h60Var.d;
                if (h60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f20184id);
                        h60Var.f36873a1.addKickedUser(user.f20184id);
                        h60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(h60Var.i1(), user2);
                    h60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(h60Var.i1(), (TLRPC.User) null, chat, false, false);
                    h60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 5:
                d70 d70Var = (d70) obj2;
                d70Var.f35688x.c((TLRPC.User) obj);
                if (d70Var.f35668f.f26246r.length() > 0) {
                    d70Var.f35668f.f26246r.setText((CharSequence) null);
                    return;
                }
                return;
            case 6:
                d70 d70Var2 = (d70) obj2;
                d70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                d70Var2.m0(i12);
                return;
            case 8:
                LanguageSelectActivity.W((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((ug0) obj);
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
                bundle.putString("password", ne0Var.f38950r);
                bundle.putString("requestPhone", ne0Var.f38951s);
                bundle.putString("phoneHash", ne0Var.v);
                bundle.putString("phoneCode", ne0Var.f38952w);
                ne0Var.f38954y.u1(7, true, bundle, false);
                return;
            case 21:
                xf0.o((xf0) obj2, (Context) obj);
                return;
            case 23:
                kn0 kn0Var = (kn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!kn0Var.f38051v0) {
                    kn0Var.f38046s1.clear();
                }
                kn0Var.f38048t1.clear();
                nm0 nm0Var = (nm0) kn0Var.B1;
                nm0Var.d.j1(kn0Var.E, kn0Var.F, kn0Var.G, zArr[0], null, null, nm0Var.f39011b);
                kn0Var.finishFragment();
                return;
            case 24:
                int[] iArr = ((kn0) obj2).f38056x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 26:
                kn0.S((kn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f39544a) {
            case 28:
                return FileLoader.getInstance(((PhotoViewer) this.f39545b).T).getPathToAttach((TLObject) this.f39546c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f39545b).T).getPathToMessage((TLRPC.Message) this.f39546c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f39544a) {
            case 17:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f39546c;
                ug0 ug0Var = ((ee0) this.f39545b).W;
                if (ug0Var.getParentActivity() != null) {
                    ug0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f39546c;
                ug0 ug0Var2 = ((jf0) this.f39545b).E;
                if (ug0Var2.getParentActivity() != null && !ug0Var2.getParentActivity().isFinishing()) {
                    ug0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f39545b;
        Intent intent = (Intent) this.f39546c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void s0(View view, float f7, float f10) {
        int i10 = this.f39544a;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        o80 o80Var = (o80) this.f39546c;
        uy uyVar2 = (uy) this.f39545b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = o80Var.f39124f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        o80Var.f39122d0.saveKeepMediaExceptions(o80Var.f39121c0, o80Var.f39124f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", o80Var.f39121c0);
        l80 l80Var = new l80(bundle, uyVar2);
        l80Var.d = o80Var.f39124f0;
        l80Var.S();
        o80Var.f39125g0.presentFragment(l80Var);
        AndroidUtilities.runOnUIThread(new cu(26, l80Var, keepMediaException), 150L);
        return true;
    }

    public pw(o80 o80Var, uy uyVar) {
        this.f39544a = 7;
        this.f39546c = o80Var;
        this.f39545b = uyVar;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}

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
public final class jy implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nl0, ny, ContactsLoadingObserver.Callback, org.telegram.ui.Components.ov0, org.telegram.ui.Components.ol0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, xt, FileLoader.FileResolver {
    public final int f34877a;
    public final Object f34878b;
    public final Object f34879c;

    public jy(int i10, Object obj, Object obj2) {
        this.f34877a = i10;
        this.f34878b = obj;
        this.f34879c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void a1(tt ttVar) {
        jn0 jn0Var = (jn0) this.f34878b;
        int intValue = ((Integer) ((View) this.f34879c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = jn0Var.Y[intValue];
        if (intValue == 5) {
            jn0Var.f34807s = ttVar.d;
        } else {
            jn0Var.v = ttVar.d;
        }
        editTextBoldCursor.setText(ttVar.f37908a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f34878b;
        int[] iArr = (int[]) this.f34879c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        fd0 fd0Var = new fd0(2);
        fd0Var.u0(sharingLocationInfo.messageObject);
        fd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(fd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f34877a) {
            case 1:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f34878b, (Context) this.f34879c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f34878b, (Context) this.f34879c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        fd0 fd0Var = (fd0) this.f34878b;
        Context context = (Context) this.f34879c;
        if (fd0Var.G0 == 2) {
            Object J = fd0Var.T.J(i10);
            if (J instanceof zc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, fd0Var.getParentActivity(), fd0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new rv(16, fd0Var, (zc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                xc0 xc0Var = new xc0(fd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                fd0Var.I0 = xc0Var;
                xc0Var.setOutsideTouchable(true);
                fd0Var.I0.setClippingEnabled(true);
                fd0Var.I0.setInputMethodMode(2);
                fd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                fd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                fd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f34877a) {
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        fd0 fd0Var = (fd0) this.f34878b;
        zc0 zc0Var = (zc0) this.f34879c;
        fd0Var.getClass();
        if (z10 && !z11 && zc0Var.e != null && (g02 = fd0Var.g0(zc0Var)) != null) {
            zc0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f34877a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i12 = 0;
        Object obj = this.f34879c;
        Object obj2 = this.f34878b;
        switch (i11) {
            case 0:
                ky kyVar = (ky) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                kyVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18452id = dialogFilter.f15826id;
                ty tyVar = kyVar.f35193b;
                tyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                tyVar.getMessagesController().removeFilter(dialogFilter);
                tyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 1:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 24:
            default:
                PhotoViewer.B(((ns0) obj2).f36082b, (ArrayList) obj);
                return;
            case 2:
                c20 c20Var = (c20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = c20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.f18729g0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f18452id = dialogFilter2.f15826id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new da(c20Var, c2Var2, dialogFilter2, 10));
                return;
            case 3:
                g60 g60Var = (g60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = g60Var.d;
                if (g60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f18476id);
                        g60Var.f33726a1.addKickedUser(user.f18476id);
                        g60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.i1(), user2);
                    g60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.i1(), (TLRPC.User) null, chat, false, false);
                    g60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 4:
                c70 c70Var = (c70) obj2;
                c70Var.f32563x.c((TLRPC.User) obj);
                if (c70Var.f32543f.f23850r.length() > 0) {
                    c70Var.f32543f.f23850r.setText((CharSequence) null);
                    return;
                }
                return;
            case 5:
                c70 c70Var2 = (c70) obj2;
                c70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                c70Var2.m0(i12);
                return;
            case 7:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((tg0) obj);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 17:
                ((je0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 18:
                me0 me0Var = (me0) obj2;
                me0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", me0Var.f35672r);
                bundle.putString("requestPhone", me0Var.f35673s);
                bundle.putString("phoneHash", me0Var.v);
                bundle.putString("phoneCode", me0Var.f35674w);
                me0Var.f35676y.u1(7, true, bundle, false);
                return;
            case 20:
                wf0.o((wf0) obj2, (Context) obj);
                return;
            case 22:
                jn0 jn0Var = (jn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!jn0Var.f34814v0) {
                    jn0Var.f34809s1.clear();
                }
                jn0Var.f34811t1.clear();
                mm0 mm0Var = (mm0) jn0Var.B1;
                mm0Var.d.j1(jn0Var.E, jn0Var.F, jn0Var.G, zArr[0], null, null, mm0Var.f35726b);
                jn0Var.finishFragment();
                return;
            case 23:
                int[] iArr = ((jn0) obj2).f34819x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 25:
                jn0.U((jn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 26:
                ro0 ro0Var = (ro0) obj2;
                ro0Var.f37171b0 = true;
                ro0Var.f37168a0.email_unconfirmed_pattern = (String) obj;
                ro0Var.J0();
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f34877a) {
            case 27:
                return FileLoader.getInstance(((PhotoViewer) this.f34878b).T).getPathToAttach((TLObject) this.f34879c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f34878b).T).getPathToMessage((TLRPC.Message) this.f34879c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34877a) {
            case 16:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f34879c;
                tg0 tg0Var = ((de0) this.f34878b).W;
                if (tg0Var.getParentActivity() != null) {
                    tg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f34879c;
                tg0 tg0Var2 = ((if0) this.f34878b).E;
                if (tg0Var2.getParentActivity() != null && !tg0Var2.getParentActivity().isFinishing()) {
                    tg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f34878b;
        Intent intent = (Intent) this.f34879c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f34877a;
    }

    @Override
    public boolean u(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        n80 n80Var = (n80) this.f34878b;
        ty tyVar2 = (ty) this.f34879c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = n80Var.f35845f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        n80Var.f35843d0.saveKeepMediaExceptions(n80Var.f35842c0, n80Var.f35845f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", n80Var.f35842c0);
        k80 k80Var = new k80(bundle, tyVar2);
        k80Var.d = n80Var.f35845f0;
        k80Var.U();
        n80Var.f35846g0.presentFragment(k80Var);
        AndroidUtilities.runOnUIThread(new tv(24, k80Var, keepMediaException), 150L);
        return true;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}

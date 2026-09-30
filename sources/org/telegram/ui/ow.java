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
public final class ow implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0, ky, ContactsLoadingObserver.Callback, org.telegram.ui.Components.pv0, org.telegram.ui.Components.pl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, vt, FileLoader.FileResolver {
    public final int f36456a;
    public final Object f36457b;
    public final Object f36458c;

    public ow(int i10, Object obj, Object obj2) {
        this.f36456a = i10;
        this.f36457b = obj;
        this.f36458c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(qy qyVar) {
        return false;
    }

    @Override
    public void a1(qt qtVar) {
        fn0 fn0Var = (fn0) this.f36457b;
        int intValue = ((Integer) ((View) this.f36458c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = fn0Var.Y[intValue];
        if (intValue == 5) {
            fn0Var.f33827s = qtVar.d;
        } else {
            fn0Var.v = qtVar.d;
        }
        editTextBoldCursor.setText(qtVar.f37082a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f36457b;
        int[] iArr = (int[]) this.f36458c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        cd0 cd0Var = new cd0(2);
        cd0Var.u0(sharingLocationInfo.messageObject);
        cd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(cd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f36456a) {
            case 1:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f36457b, (Context) this.f36458c, view, i10);
                return;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f36457b, (Context) this.f36458c, view, i10, f7, f10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        cd0 cd0Var = (cd0) this.f36457b;
        Context context = (Context) this.f36458c;
        if (cd0Var.G0 == 2) {
            Object J = cd0Var.T.J(i10);
            if (J instanceof wc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, cd0Var.getParentActivity(), cd0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new ov(16, cd0Var, (wc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                uc0 uc0Var = new uc0(cd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                cd0Var.I0 = uc0Var;
                uc0Var.setOutsideTouchable(true);
                cd0Var.I0.setClippingEnabled(true);
                cd0Var.I0.setInputMethodMode(2);
                cd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                cd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                cd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f36456a) {
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        cd0 cd0Var = (cd0) this.f36457b;
        wc0 wc0Var = (wc0) this.f36458c;
        cd0Var.getClass();
        if (z10 && !z11 && wc0Var.e != null && (g02 = cd0Var.g0(wc0Var)) != null) {
            wc0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.f36456a;
        org.telegram.ui.ActionBar.a2 a2Var2 = null;
        int i12 = 0;
        Object obj = this.f36458c;
        Object obj2 = this.f36457b;
        switch (i11) {
            case 0:
                pw pwVar = (pw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                pwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18475id = dialogFilter.f15849id;
                qy qyVar = pwVar.f36786b;
                qyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                qyVar.getMessagesController().removeFilter(dialogFilter);
                qyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
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
                PhotoViewer.B(((ks0) obj2).f35256b, (ArrayList) obj);
                return;
            case 2:
                z10 z10Var = (z10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(filtersSetupActivity.getParentActivity(), 3, null);
                    a2Var3.f18699g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f18475id = dialogFilter2.f15849id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new aa(z10Var, a2Var2, dialogFilter2, 10));
                return;
            case 3:
                d60 d60Var = (d60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = d60Var.d;
                if (d60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f18499id);
                        d60Var.f33013a1.addKickedUser(user.f18499id);
                        d60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(d60Var.i1(), user2);
                    d60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(d60Var.i1(), (TLRPC.User) null, chat, false, false);
                    d60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 4:
                z60 z60Var = (z60) obj2;
                z60Var.f40504x.g((TLRPC.User) obj);
                if (z60Var.f40484f.f24137r.length() > 0) {
                    z60Var.f40484f.f24137r.setText((CharSequence) null);
                    return;
                }
                return;
            case 5:
                z60 z60Var2 = (z60) obj2;
                z60Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var4 = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var4 != null && a2Var4.b()) {
                    i12 = 100;
                }
                z60Var2.m0(i12);
                return;
            case 7:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((qg0) obj);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 17:
                ((ge0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 18:
                je0 je0Var = (je0) obj2;
                je0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", je0Var.f34876r);
                bundle.putString("requestPhone", je0Var.f34877s);
                bundle.putString("phoneHash", je0Var.v);
                bundle.putString("phoneCode", je0Var.f34878w);
                je0Var.f34880y.u1(7, true, bundle, false);
                return;
            case 20:
                tf0.o((tf0) obj2, (Context) obj);
                return;
            case 22:
                fn0 fn0Var = (fn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!fn0Var.f33834v0) {
                    fn0Var.f33829s1.clear();
                }
                fn0Var.f33831t1.clear();
                im0 im0Var = (im0) fn0Var.B1;
                im0Var.d.j1(fn0Var.E, fn0Var.F, fn0Var.G, zArr[0], null, null, im0Var.f34640b);
                fn0Var.finishFragment();
                return;
            case 23:
                int[] iArr = ((fn0) obj2).f33839x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 25:
                fn0.U((fn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 26:
                no0 no0Var = (no0) obj2;
                no0Var.f36053b0 = true;
                no0Var.f36050a0.email_unconfirmed_pattern = (String) obj;
                no0Var.J0();
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f36456a) {
            case 27:
                return FileLoader.getInstance(((PhotoViewer) this.f36457b).T).getPathToAttach((TLObject) this.f36458c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f36457b).T).getPathToMessage((TLRPC.Message) this.f36458c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f36456a) {
            case 16:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f36458c;
                qg0 qg0Var = ((ae0) this.f36457b).W;
                if (qg0Var.getParentActivity() != null) {
                    qg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f36458c;
                qg0 qg0Var2 = ((ff0) this.f36457b).E;
                if (qg0Var2.getParentActivity() != null && !qg0Var2.getParentActivity().isFinishing()) {
                    qg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f36457b;
        Intent intent = (Intent) this.f36458c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f36456a;
    }

    @Override
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        k80 k80Var = (k80) this.f36457b;
        qy qyVar2 = (qy) this.f36458c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = k80Var.f35066f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        k80Var.f35064d0.saveKeepMediaExceptions(k80Var.f35063c0, k80Var.f35066f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", k80Var.f35063c0);
        h80 h80Var = new h80(bundle, qyVar2);
        h80Var.d = k80Var.f35066f0;
        h80Var.U();
        k80Var.f35067g0.presentFragment(h80Var);
        AndroidUtilities.runOnUIThread(new tt(28, h80Var, keepMediaException), 150L);
        return true;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}

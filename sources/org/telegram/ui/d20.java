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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d20 implements org.telegram.ui.ActionBar.a2, oy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.bv0, org.telegram.ui.Components.bl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, org.telegram.ui.Components.al0, zt, FileLoader.FileResolver, org.telegram.ui.Components.b5 {
    public final int f32916a;
    public final Object f32917b;
    public final Object f32918c;

    public d20(int i10, Object obj, Object obj2) {
        this.f32916a = i10;
        this.f32917b = obj;
        this.f32918c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        aw0 aw0Var = ((sv0) this.f32917b).f37496a;
        aw0Var.f31957e0.a((TLRPC.TL_messageMediaToDo) this.f32918c);
        aw0Var.finishFragment();
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void a1(vt vtVar) {
        on0 on0Var = (on0) this.f32917b;
        int intValue = ((Integer) ((View) this.f32918c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = on0Var.Y[intValue];
        if (intValue == 5) {
            on0Var.f36296s = vtVar.d;
        } else {
            on0Var.v = vtVar.d;
        }
        editTextBoldCursor.setText(vtVar.f38616a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f32917b;
        int[] iArr = (int[]) this.f32918c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        id0 id0Var = new id0(2);
        id0Var.u0(sharingLocationInfo.messageObject);
        id0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(id0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f32917b, (Context) this.f32918c, view, i10, f7, f10);
    }

    @Override
    public boolean d(int i10, View view) {
        id0 id0Var = (id0) this.f32917b;
        Context context = (Context) this.f32918c;
        if (id0Var.G0 == 2) {
            Object J = id0Var.T.J(i10);
            if (J instanceof cd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, id0Var.getParentActivity(), id0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new sv(16, id0Var, (cd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                ad0 ad0Var = new ad0(id0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                id0Var.I0 = ad0Var;
                ad0Var.setOutsideTouchable(true);
                id0Var.I0.setClippingEnabled(true);
                id0Var.I0.setInputMethodMode(2);
                id0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                id0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                id0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        id0 id0Var = (id0) this.f32917b;
        cd0 cd0Var = (cd0) this.f32918c;
        id0Var.getClass();
        if (z10 && !z11 && cd0Var.e != null && (g02 = id0Var.g0(cd0Var)) != null) {
            cd0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.f32916a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.f32918c;
        Object obj2 = this.f32917b;
        switch (i11) {
            case 0:
                e20 e20Var = (e20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.f18471g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18232id = dialogFilter.f15601id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new aa(e20Var, b2Var2, dialogFilter, 10));
                return;
            case 1:
                i60 i60Var = (i60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = i60Var.d;
                if (i60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f18256id);
                        i60Var.f34428a1.addKickedUser(user.f18256id);
                        i60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.i1(), user2);
                    i60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.i1(), (TLRPC.User) null, chat, false, false);
                    i60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 2:
                e70 e70Var = (e70) obj2;
                e70Var.f33212x.i((TLRPC.User) obj);
                if (e70Var.f33192f.f22569r.length() > 0) {
                    e70Var.f33192f.f22569r.setText((CharSequence) null);
                    return;
                }
                return;
            case 3:
                e70 e70Var2 = (e70) obj2;
                e70Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                e70Var2.m0(i12);
                return;
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 19:
            case 22:
            case 25:
            case 26:
            default:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ss0) obj2).f37457b;
                bv0 bv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f30903a7;
                ArrayList arrayList3 = photoViewer.f30932d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!bv0Var.M()) {
                    photoViewer.G0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.v;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                arrayList = arrayList8;
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f18130id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31126z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f31126z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f18128id = photo.f18133id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31126z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f31126z5, photo.f18133id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f30923c7.remove(photoViewer.P4);
                            photoViewer.f30913b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.G0(false, false);
                            } else {
                                int i16 = photoViewer.P4;
                                if (i16 >= arrayList6.size()) {
                                    i16 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.A2(i16);
                            }
                            if (message == null) {
                                NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.G0(false, false);
                        return;
                    }
                    int i17 = photoViewer.P4;
                    if (i17 >= arrayList5.size()) {
                        i17 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.A2(i17);
                    return;
                } else {
                    return;
                }
            case 5:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 6:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((wg0) obj);
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 15:
                ((me0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 16:
                pe0 pe0Var = (pe0) obj2;
                pe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", pe0Var.f36550r);
                bundle.putString("requestPhone", pe0Var.f36551s);
                bundle.putString("phoneHash", pe0Var.v);
                bundle.putString("phoneCode", pe0Var.f36552w);
                pe0Var.f36554y.u1(7, true, bundle, false);
                return;
            case 18:
                zf0.o((zf0) obj2, (Context) obj);
                return;
            case 20:
                on0 on0Var = (on0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!on0Var.f36303v0) {
                    on0Var.f36298s1.clear();
                }
                on0Var.f36300t1.clear();
                rm0 rm0Var = (rm0) on0Var.B1;
                rm0Var.d.j1(on0Var.E, on0Var.F, on0Var.G, zArr2[0], null, null, rm0Var.f37169b);
                on0Var.finishFragment();
                return;
            case 21:
                int[] iArr = ((on0) obj2).f36308x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 23:
                on0.U((on0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 24:
                wo0 wo0Var = (wo0) obj2;
                wo0Var.f39306b0 = true;
                wo0Var.f39303a0.email_unconfirmed_pattern = (String) obj;
                wo0Var.J0();
                return;
            case 27:
                PhotoViewer.B(((ss0) obj2).f37457b, (ArrayList) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f32916a) {
            case 25:
                return FileLoader.getInstance(((PhotoViewer) this.f32917b).T).getPathToAttach((TLObject) this.f32918c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f32917b).T).getPathToMessage((TLRPC.Message) this.f32918c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f32916a) {
            case 14:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f32918c;
                wg0 wg0Var = ((ge0) this.f32917b).W;
                if (wg0Var.getParentActivity() != null) {
                    wg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f32918c;
                wg0 wg0Var2 = ((lf0) this.f32917b).E;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing()) {
                    wg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f32917b;
        Intent intent = (Intent) this.f32918c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        p80 p80Var = (p80) this.f32917b;
        uy uyVar2 = (uy) this.f32918c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f36468f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.f36466d0.saveKeepMediaExceptions(p80Var.f36465c0, p80Var.f36468f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", p80Var.f36465c0);
        m80 m80Var = new m80(bundle, uyVar2);
        m80Var.d = p80Var.f36468f0;
        m80Var.U();
        p80Var.f36469g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new kw(23, m80Var, keepMediaException), 150L);
        return true;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}

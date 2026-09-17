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
public final class f20 implements org.telegram.ui.ActionBar.b2, qy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.cv0, org.telegram.ui.Components.cl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, org.telegram.ui.Components.bl0, bu, FileLoader.FileResolver, org.telegram.ui.Components.b5 {
    public final int f33518a;
    public final Object f33519b;
    public final Object f33520c;

    public f20(int i10, Object obj, Object obj2) {
        this.f33518a = i10;
        this.f33519b = obj;
        this.f33520c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        cw0 cw0Var = ((uv0) this.f33519b).f38231a;
        cw0Var.f32937e0.a((TLRPC.TL_messageMediaToDo) this.f33520c);
        cw0Var.finishFragment();
    }

    @Override
    public boolean K(wy wyVar) {
        return false;
    }

    @Override
    public void a1(xt xtVar) {
        qn0 qn0Var = (qn0) this.f33519b;
        int intValue = ((Integer) ((View) this.f33520c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = qn0Var.Y[intValue];
        if (intValue == 5) {
            qn0Var.f36982s = xtVar.d;
        } else {
            qn0Var.v = xtVar.d;
        }
        editTextBoldCursor.setText(xtVar.f39695a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f33519b;
        int[] iArr = (int[]) this.f33520c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        kd0 kd0Var = new kd0(2);
        kd0Var.u0(sharingLocationInfo.messageObject);
        kd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(kd0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f33519b, (Context) this.f33520c, view, i10, f7, f10);
    }

    @Override
    public boolean d(int i10, View view) {
        kd0 kd0Var = (kd0) this.f33519b;
        Context context = (Context) this.f33520c;
        if (kd0Var.G0 == 2) {
            Object J = kd0Var.T.J(i10);
            if (J instanceof ed0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, kd0Var.getParentActivity(), kd0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new uv(16, kd0Var, (ed0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                cd0 cd0Var = new cd0(kd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                kd0Var.I0 = cd0Var;
                cd0Var.setOutsideTouchable(true);
                kd0Var.I0.setClippingEnabled(true);
                kd0Var.I0.setInputMethodMode(2);
                kd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                kd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                kd0Var.I0.b();
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
        kd0 kd0Var = (kd0) this.f33519b;
        ed0 ed0Var = (ed0) this.f33520c;
        kd0Var.getClass();
        if (z10 && !z11 && ed0Var.e != null && (g02 = kd0Var.g0(ed0Var)) != null) {
            ed0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ConferenceCall conferenceCall;
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.f33518a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i12 = 0;
        Object obj = this.f33520c;
        Object obj2 = this.f33519b;
        switch (i11) {
            case 0:
                g20 g20Var = (g20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = g20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.f18502g0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18244id = dialogFilter.f15613id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ca(g20Var, c2Var2, dialogFilter, 10));
                return;
            case 1:
                k60 k60Var = (k60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = k60Var.d;
                if (k60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.f18268id);
                        k60Var.f35012a1.addKickedUser(user.f18268id);
                        k60Var.k1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(k60Var.i1(), user2);
                    k60Var.k1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(k60Var.i1(), (TLRPC.User) null, chat, false, false);
                    k60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 2:
                g70 g70Var = (g70) obj2;
                g70Var.f33895x.i((TLRPC.User) obj);
                if (g70Var.f33875f.f22543r.length() > 0) {
                    g70Var.f33875f.f22543r.setText((CharSequence) null);
                    return;
                }
                return;
            case 3:
                g70 g70Var2 = (g70) obj2;
                g70Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                g70Var2.m0(i12);
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
                PhotoViewer photoViewer = ((us0) obj2).f38192b;
                dv0 dv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f30919a7;
                ArrayList arrayList3 = photoViewer.f30948d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!dv0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f18142id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31142z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f31142z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f18140id = photo.f18145id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31142z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f31142z5, photo.f18145id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f30939c7.remove(photoViewer.P4);
                            photoViewer.f30929b7.remove(photoViewer.P4);
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
                                photoViewer.B2(i16);
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
                    photoViewer.B2(i17);
                    return;
                } else {
                    return;
                }
            case 5:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 6:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((yg0) obj);
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 15:
                ((oe0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 16:
                re0 re0Var = (re0) obj2;
                re0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", re0Var.f37204r);
                bundle.putString("requestPhone", re0Var.f37205s);
                bundle.putString("phoneHash", re0Var.v);
                bundle.putString("phoneCode", re0Var.f37206w);
                re0Var.f37208y.u1(7, true, bundle, false);
                return;
            case 18:
                bg0.o((bg0) obj2, (Context) obj);
                return;
            case 20:
                qn0 qn0Var = (qn0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!qn0Var.f36989v0) {
                    qn0Var.f36984s1.clear();
                }
                qn0Var.f36986t1.clear();
                tm0 tm0Var = (tm0) qn0Var.B1;
                tm0Var.d.j1(qn0Var.E, qn0Var.F, qn0Var.G, zArr2[0], null, null, tm0Var.f37835b);
                qn0Var.finishFragment();
                return;
            case 21:
                int[] iArr = ((qn0) obj2).f36994x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 23:
                qn0.U((qn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 24:
                yo0 yo0Var = (yo0) obj2;
                yo0Var.f39948b0 = true;
                yo0Var.f39945a0.email_unconfirmed_pattern = (String) obj;
                yo0Var.J0();
                return;
            case 27:
                PhotoViewer.B(((us0) obj2).f38192b, (ArrayList) obj);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f33518a) {
            case 25:
                return FileLoader.getInstance(((PhotoViewer) this.f33519b).T).getPathToAttach((TLObject) this.f33520c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f33519b).T).getPathToMessage((TLRPC.Message) this.f33520c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f33518a) {
            case 14:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f33520c;
                yg0 yg0Var = ((ie0) this.f33519b).W;
                if (yg0Var.getParentActivity() != null) {
                    yg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f33520c;
                yg0 yg0Var2 = ((nf0) this.f33519b).E;
                if (yg0Var2.getParentActivity() != null && !yg0Var2.getParentActivity().isFinishing()) {
                    yg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f33519b;
        Intent intent = (Intent) this.f33520c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        r80 r80Var = (r80) this.f33519b;
        wy wyVar2 = (wy) this.f33520c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = r80Var.f37120f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        r80Var.f37118d0.saveKeepMediaExceptions(r80Var.f37117c0, r80Var.f37120f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", r80Var.f37117c0);
        o80 o80Var = new o80(bundle, wyVar2);
        o80Var.d = r80Var.f37120f0;
        o80Var.U();
        r80Var.f37121g0.presentFragment(o80Var);
        AndroidUtilities.runOnUIThread(new mw(23, o80Var, keepMediaException), 150L);
        return true;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}

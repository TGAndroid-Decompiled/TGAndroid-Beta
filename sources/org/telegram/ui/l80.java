package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l80 implements qy, org.telegram.ui.ActionBar.c2, ContactsLoadingObserver.Callback, org.telegram.ui.Components.lv0, org.telegram.ui.Components.ll0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, org.telegram.ui.Components.kl0, au, FileLoader.FileResolver, org.telegram.ui.Components.c5, GenericProvider {
    public final int f34613a;
    public final Object f34614b;
    public final Object f34615c;

    public l80(int i10, Object obj, Object obj2) {
        this.f34613a = i10;
        this.f34614b = obj;
        this.f34615c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f34613a) {
            case 25:
                bw0 bw0Var = ((tv0) this.f34614b).f37045a;
                bw0Var.f31431e0.b((TLRPC.TL_messageMediaToDo) this.f34615c);
                bw0Var.finishFragment();
                return;
            default:
                bw0 bw0Var2 = ((tv0) this.f34614b).f37045a;
                bw0Var2.f31431e0.b((TLRPC.TL_messageMediaPoll) this.f34615c);
                bw0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void a1(wt wtVar) {
        on0 on0Var = (on0) this.f34614b;
        int intValue = ((Integer) ((View) this.f34615c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = on0Var.Y[intValue];
        if (intValue == 5) {
            on0Var.f35557s = wtVar.d;
        } else {
            on0Var.v = wtVar.d;
        }
        editTextBoldCursor.setText(wtVar.f38386a);
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f34614b;
        int[] iArr = (int[]) this.f34615c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        id0 id0Var = new id0(2);
        id0Var.u0(sharingLocationInfo.messageObject);
        id0Var.F0 = new bi.za(iArr, sharingLocationInfo.messageObject.getDialogId(), 9);
        launchActivity.p0(id0Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f34614b, (Context) this.f34615c, view, i10, f7, f10);
    }

    @Override
    public boolean d(int i10, View view) {
        id0 id0Var = (id0) this.f34614b;
        Context context = (Context) this.f34615c;
        if (id0Var.G0 == 2) {
            Object J = id0Var.T.J(i10);
            if (J instanceof cd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, id0Var.getParentActivity(), id0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new ow(13, id0Var, (cd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
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
        id0 id0Var = (id0) this.f34614b;
        cd0 cd0Var = (cd0) this.f34615c;
        id0Var.getClass();
        if (z10 && !z11 && cd0Var.e != null && (g02 = id0Var.g0(cd0Var)) != null) {
            cd0Var.e.setIcon(g02);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.f34613a;
        Object obj = this.f34615c;
        Object obj2 = this.f34614b;
        switch (i11) {
            case 1:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((xg0) obj);
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                return;
            case 11:
                ((me0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 12:
                pe0 pe0Var = (pe0) obj2;
                pe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", pe0Var.f35803r);
                bundle.putString("requestPhone", pe0Var.f35804s);
                bundle.putString("phoneHash", pe0Var.v);
                bundle.putString("phoneCode", pe0Var.f35805w);
                pe0Var.f35807y.u1(7, true, bundle, false);
                return;
            case 14:
                zf0.o((zf0) obj2, (Context) obj);
                return;
            case 16:
                on0 on0Var = (on0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!on0Var.f35564v0) {
                    on0Var.f35559s1.clear();
                }
                on0Var.f35561t1.clear();
                rm0 rm0Var = (rm0) on0Var.B1;
                rm0Var.d.j1(on0Var.E, on0Var.F, on0Var.G, zArr[0], null, null, rm0Var.f36390b);
                on0Var.finishFragment();
                return;
            case 17:
                int[] iArr = ((on0) obj2).f35569x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 19:
                on0.U((on0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 20:
                wo0 wo0Var = (wo0) obj2;
                wo0Var.f38258b0 = true;
                wo0Var.f38255a0.email_unconfirmed_pattern = (String) obj;
                wo0Var.J0();
                return;
            case 23:
                PhotoViewer.C(((rs0) obj2).f36451b, (ArrayList) obj);
                return;
            case 24:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer = ((rs0) obj2).f36451b;
                cv0 cv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f30018a7;
                ArrayList arrayList3 = photoViewer.f30047d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!cv0Var.M()) {
                    photoViewer.G0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i12 = photoViewer.P4;
                    if (i12 >= 0 && i12 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i13 = photoViewer.v;
                            if (i13 != 0) {
                                arrayList7.add(Integer.valueOf(i13));
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
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr2[0], messageObject.getChatMode());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i14 = photoViewer.P4;
                    if (i14 >= 0 && i14 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f17216id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f30241z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f30241z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f17214id = photo.f17219id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f30241z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f30241z5, photo.f17219id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f30038c7.remove(photoViewer.P4);
                            photoViewer.f30028b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.G0(false, false);
                            } else {
                                int i15 = photoViewer.P4;
                                if (i15 >= arrayList6.size()) {
                                    i15 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.B2(i15);
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
                    int i16 = photoViewer.P4;
                    if (i16 >= arrayList5.size()) {
                        i16 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.B2(i16);
                    return;
                } else {
                    return;
                }
            case 28:
                ((PrivacyControlActivity) obj2).t0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new rg0(9, privacySettingsActivity, (org.telegram.ui.Cells.x8) obj));
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f34613a) {
            case 21:
                return FileLoader.getInstance(((PhotoViewer) this.f34614b).T).getPathToAttach((TLObject) this.f34615c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f34614b).T).getPathToMessage((TLRPC.Message) this.f34615c);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34613a) {
            case 10:
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.f34615c;
                xg0 xg0Var = ((ge0) this.f34614b).W;
                if (xg0Var.getParentActivity() != null) {
                    xg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    return;
                }
                return;
            default:
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.f34615c;
                xg0 xg0Var2 = ((lf0) this.f34614b).E;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing()) {
                    xg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    return;
                }
                return;
        }
    }

    @Override
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.f34614b;
        Intent intent = (Intent) this.f34615c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override
    public Object provide(Object obj) {
        jx0 jx0Var = (jx0) this.f34615c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((kx0) this.f34614b).d.f34805n;
        premiumPreviewFragment.f30284n0.d(0, 0.0f, 0, jx0Var.getMeasuredWidth(), -jx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f30284n0.f40690f;
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        p80 p80Var = (p80) this.f34614b;
        wy wyVar2 = (wy) this.f34615c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f35704f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.f35702d0.saveKeepMediaExceptions(p80Var.f35701c0, p80Var.f35704f0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", p80Var.f35701c0);
        m80 m80Var = new m80(bundle, wyVar2);
        m80Var.d = p80Var.f35704f0;
        m80Var.U();
        p80Var.f35705g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new uv(26, m80Var, keepMediaException), 150L);
        return true;
    }

    public l80(tv0 tv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f34613a = 26;
        this.f34614b = tv0Var;
        this.f34615c = tL_messageMediaPoll;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}

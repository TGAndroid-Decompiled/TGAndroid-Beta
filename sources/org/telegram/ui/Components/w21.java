package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class w21 implements Runnable {
    public final int f29855a;
    public final long f29856b;
    public final Object f29857c;
    public final Object d;
    public final Object e;

    public w21(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f29855a = i10;
        this.f29857c = obj;
        this.d = obj2;
        this.f29856b = j3;
        this.e = obj3;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.qy qyVar;
        org.telegram.ui.qy qyVar2;
        ChatObject.Call groupCall;
        int i11 = this.f29855a;
        long j3 = this.f29856b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f29857c;
        switch (i11) {
            case 0:
                k31 k31Var = (k31) obj3;
                ArrayList arrayList = (ArrayList) obj;
                k31Var.f25621e0.removeAll((HashSet) obj2);
                k31Var.o();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        k31Var.m(intValue, false);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.qy qyVar3 = (org.telegram.ui.qy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i13 = Integer.MAX_VALUE;
                if (dialogFilter != null && qyVar3.g4(dialog)) {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        i13 = Math.min(i13, dialogFilter.pinnedDialogs.valueAt(i14));
                    }
                    i10 = i13 - qyVar3.N2;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                long j10 = this.f29856b;
                if (DialogObject.isEncryptedDialog(j10)) {
                    encryptedChat = org.telegram.messenger.f0.l(qyVar3.getMessagesController(), j10);
                } else {
                    encryptedChat = null;
                }
                UndoView Y3 = qyVar3.Y3();
                if (Y3 != null) {
                    if (!qyVar3.g4(dialog)) {
                        qyVar = qyVar3;
                        qyVar.s4(j10, true, dialogFilter, i10, true);
                        Y3.k(0L, 78, 1, 1600, null, null);
                        if (dialogFilter != null) {
                            if (encryptedChat != null) {
                                if (!dialogFilter.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                    dialogFilter.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                }
                            } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j10))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(j10));
                            }
                        }
                    } else {
                        qyVar = qyVar3;
                        qyVar.s4(j10, false, dialogFilter, i10, true);
                        Y3.k(0L, 79, 1, 1600, null, null);
                    }
                    if (dialogFilter != null) {
                        org.telegram.ui.qy qyVar4 = qyVar;
                        org.telegram.ui.b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, qyVar4, null);
                        qyVar2 = qyVar4;
                    } else {
                        qyVar2 = qyVar;
                    }
                    qyVar2.getMessagesController().reorderPinnedDialogs(qyVar2.V2, null, 0L);
                    qyVar2.T4(true);
                    if (qyVar2.f37021e0 != null) {
                        int i15 = 0;
                        while (true) {
                            org.telegram.ui.py[] pyVarArr = qyVar2.f37021e0;
                            if (i15 < pyVarArr.length) {
                                pyVarArr[i15].d.H = false;
                                i15++;
                            }
                        }
                    }
                    qyVar2.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ChatObject.Call call = d60Var.f32919a1;
                if (call != null && !d60Var.f32992s0) {
                    call.addInvitedUser(j3);
                    d60Var.O0(true);
                    s30 s30Var = d60Var.E1;
                    if (s30Var != null) {
                        s30Var.dismiss();
                    }
                    try {
                        a2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    a2VarArr[0] = null;
                    d60Var.k1().k(0L, 34, user, d60Var.Z0, null, null);
                    return;
                }
                return;
            case 3:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                org.telegram.ui.sq sqVar = (org.telegram.ui.sq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_peerStories) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    messagesController.putUsers(tL_stories_peerStories.users, false);
                    messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                    sqVar.run();
                    return;
                }
                sqVar.run();
                return;
            case 4:
                org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) obj3;
                LaunchActivity launchActivity = ua0Var.f38365g;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j11 = this.f29856b;
                    long j12 = -j11;
                    if (messagesController2.getGroupCall(j12, false) != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j12));
                        accountInstance.getMessagesController().getInputPeer(j11);
                        org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf(!groupCall.call.rtmp_stream), launchActivity, m2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j12);
                    if (chatFull != null) {
                        if (chatFull.call == null) {
                            if (m2Var.getParentActivity() != null) {
                                org.telegram.messenger.f0.p(R.string.InviteExpired, yc.a0(m2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                        accountInstance.getMessagesController().getGroupCall(j12, true, new org.telegram.ui.ta0(ua0Var, accountInstance, j11, m2Var, 0));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                long j13 = this.f29856b;
                ai.l lVar = new ai.l(photoViewer, (String) obj2, photoEntry, j13, 8);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new org.telegram.ui.xi0(18, lVar, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.B2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                if (bitmap == null) {
                    lVar.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j13, null, true));
                    return;
                } else {
                    lVar.run(bitmap);
                    return;
                }
            case 6:
                yh.x3 x3Var = (yh.x3) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (!((yh.t5) obj2).e) {
                    qc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27581t = true;
                    Q.j();
                    return;
                }
                x3Var.v1(j3, callback);
                return;
            case 7:
                yh.x3.d0((yh.x3) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (org.telegram.ui.qy) obj);
                return;
            case 8:
                yh.x3 x3Var2 = (yh.x3) obj3;
                x3Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                x3Var2.f48235j0.setLoading(false);
                x3Var2.v1(j3, (Utilities.Callback) obj);
                return;
            case 9:
                ((yh.t5) obj2).d0((MessageObject) obj, ((yh.b4) obj3).f47215a, this.f29856b, true, true, null);
                return;
            case 10:
                yh.t5 t5Var = (yh.t5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject2 instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    t5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    return;
                }
                t5Var.getClass();
                callback2.run(null);
                return;
            case 11:
                yh.t5 t5Var2 = (yh.t5) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (!t5Var2.e) {
                    yh.t5.e("NO_BALANCE");
                    callback3.run(null);
                    return;
                }
                t5Var2.H(starGift, this.f29856b, null, true, callback3);
                return;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                yc a02 = yc.a0((org.telegram.ui.wn) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                return;
            default:
                ((yh.t5) obj3).h0((LaunchActivity) obj2, j3, (String) obj);
                return;
        }
    }

    public w21(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f29855a = i10;
        this.f29857c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f29856b = j3;
    }

    public w21(org.telegram.ui.ActionBar.e3 e3Var, long j3, Object obj, Object obj2, int i10) {
        this.f29855a = i10;
        this.f29857c = e3Var;
        this.f29856b = j3;
        this.d = obj;
        this.e = obj2;
    }
}

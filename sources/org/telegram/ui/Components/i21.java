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
public final class i21 implements Runnable {
    public final int f26947a;
    public final long f26948b;
    public final Object f26949c;
    public final Object d;
    public final Object f26950e;

    public i21(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f26947a = i10;
        this.f26949c = obj;
        this.d = obj2;
        this.f26948b = j3;
        this.f26950e = obj3;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.uy uyVar;
        org.telegram.ui.uy uyVar2;
        ChatObject.Call groupCall;
        int i11 = this.f26947a;
        long j3 = this.f26948b;
        Object obj = this.f26950e;
        Object obj2 = this.d;
        Object obj3 = this.f26949c;
        switch (i11) {
            case 0:
                w21 w21Var = (w21) obj3;
                ArrayList arrayList = (ArrayList) obj;
                w21Var.f32099e0.removeAll((HashSet) obj2);
                w21Var.o();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        w21Var.m(intValue, false);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.uy uyVar3 = (org.telegram.ui.uy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i13 = Integer.MAX_VALUE;
                if (dialogFilter != null && uyVar3.g4(dialog)) {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        i13 = Math.min(i13, dialogFilter.pinnedDialogs.valueAt(i14));
                    }
                    i10 = i13 - uyVar3.N2;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                long j10 = this.f26948b;
                if (DialogObject.isEncryptedDialog(j10)) {
                    encryptedChat = org.telegram.messenger.w1.m(uyVar3.getMessagesController(), j10);
                } else {
                    encryptedChat = null;
                }
                UndoView Y3 = uyVar3.Y3();
                if (Y3 != null) {
                    if (!uyVar3.g4(dialog)) {
                        uyVar = uyVar3;
                        uyVar.s4(j10, true, dialogFilter, i10, true);
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
                        uyVar = uyVar3;
                        uyVar.s4(j10, false, dialogFilter, i10, true);
                        Y3.k(0L, 79, 1, 1600, null, null);
                    }
                    if (dialogFilter != null) {
                        org.telegram.ui.uy uyVar4 = uyVar;
                        org.telegram.ui.f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, uyVar4, null);
                        uyVar2 = uyVar4;
                    } else {
                        uyVar2 = uyVar;
                    }
                    uyVar2.getMessagesController().reorderPinnedDialogs(uyVar2.V2, null, 0L);
                    uyVar2.T4(true);
                    if (uyVar2.f41259e0 != null) {
                        int i15 = 0;
                        while (true) {
                            org.telegram.ui.ty[] tyVarArr = uyVar2.f41259e0;
                            if (i15 < tyVarArr.length) {
                                tyVarArr[i15].d.H = false;
                                i15++;
                            }
                        }
                    }
                    uyVar2.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ChatObject.Call call = j60Var.f37513a1;
                if (call != null && !j60Var.f37587s0) {
                    call.addInvitedUser(j3);
                    j60Var.O0(true);
                    r30 r30Var = j60Var.E1;
                    if (r30Var != null) {
                        r30Var.dismiss();
                    }
                    try {
                        b2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    b2VarArr[0] = null;
                    j60Var.k1().k(0L, 34, user, j60Var.Z0, null, null);
                    return;
                }
                return;
            case 3:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                org.telegram.ui.yq yqVar = (org.telegram.ui.yq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_peerStories) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    messagesController.putUsers(tL_stories_peerStories.users, false);
                    messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                    yqVar.run();
                    return;
                }
                yqVar.run();
                return;
            case 4:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) obj3;
                LaunchActivity launchActivity = ab0Var.f34375g;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j11 = this.f26948b;
                    long j12 = -j11;
                    if (messagesController2.getGroupCall(j12, false) != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j12));
                        accountInstance.getMessagesController().getInputPeer(j11);
                        org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf(!groupCall.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j12);
                    if (chatFull != null) {
                        if (chatFull.call == null) {
                            if (n2Var.getParentActivity() != null) {
                                org.telegram.messenger.w1.o(R.string.InviteExpired, yc.a0(n2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                        accountInstance.getMessagesController().getGroupCall(j12, true, new org.telegram.ui.za0(ab0Var, accountInstance, j11, n2Var, 0));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                long j13 = this.f26948b;
                org.telegram.messenger.f2 f2Var = new org.telegram.messenger.f2(photoViewer, (String) obj2, photoEntry, j13, 4);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new org.telegram.ui.ej0(18, f2Var, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.B2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                if (bitmap == null) {
                    f2Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j13, null, true));
                    return;
                } else {
                    f2Var.run(bitmap);
                    return;
                }
            case 6:
                zh.w3 w3Var = (zh.w3) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (!((zh.s5) obj2).f52569e) {
                    qc Q = w3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f29689t = true;
                    Q.j();
                    return;
                }
                w3Var.v1(j3, callback);
                return;
            case 7:
                zh.w3.e0((zh.w3) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (org.telegram.ui.uy) obj);
                return;
            case 8:
                zh.w3 w3Var2 = (zh.w3) obj3;
                w3Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                w3Var2.f52773j0.setLoading(false);
                w3Var2.v1(j3, (Utilities.Callback) obj);
                return;
            case 9:
                ((zh.s5) obj2).d0((MessageObject) obj, ((zh.a4) obj3).f51678a, this.f26948b, true, true, null);
                return;
            case 10:
                zh.s5 s5Var = (zh.s5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject2 instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    s5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    return;
                }
                s5Var.getClass();
                callback2.run(null);
                return;
            case 11:
                zh.s5 s5Var2 = (zh.s5) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (!s5Var2.f52569e) {
                    zh.s5.e("NO_BALANCE");
                    callback3.run(null);
                    return;
                }
                s5Var2.H(starGift, this.f26948b, null, true, callback3);
                return;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                yc a02 = yc.a0((org.telegram.ui.co) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                return;
            default:
                ((zh.s5) obj3).h0((LaunchActivity) obj2, j3, (String) obj);
                return;
        }
    }

    public i21(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26947a = i10;
        this.f26949c = obj;
        this.d = obj2;
        this.f26950e = obj3;
        this.f26948b = j3;
    }

    public i21(org.telegram.ui.ActionBar.f3 f3Var, long j3, Object obj, Object obj2, int i10) {
        this.f26947a = i10;
        this.f26949c = f3Var;
        this.f26948b = j3;
        this.d = obj;
        this.f26950e = obj2;
    }
}

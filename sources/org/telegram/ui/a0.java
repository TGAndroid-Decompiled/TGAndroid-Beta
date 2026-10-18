package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a0 implements View.OnClickListener {
    public final int f35221a;
    public final Object f35222b;
    public final Object f35223c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35221a = i10;
        this.f35222b = obj;
        this.f35223c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        ey eyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f35221a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f35223c;
        Object obj3 = this.f35222b;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                o3 o3Var = (o3) obj;
                l4Var.f38713h0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.f38713h0.f42749b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(o3Var.f39648f, null).k(false).k(true);
                return;
            case 1:
                h7 h7Var = (h7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                bi.b bVar = ((p7) obj2).d;
                long j10 = bVar.f4429b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.f4432g);
                n2Var.presentFragment(new sn(bundle));
                h7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = h7Var.f37422a;
                if (m1Var != null) {
                    m1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.mk0 mk0Var = (org.telegram.ui.Components.mk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (mk0Var == null || mk0Var.f28544w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                sn snVar = (sn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (snVar.getParentActivity() != null) {
                    if (snVar.O0.getVisibility() != 0 || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        snVar.Y.a0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((sn) obj3).za((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                sn.y1((sn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                sn.C0((sn) obj3, (jk) obj2, (boolean[]) obj);
                return;
            case 7:
                en enVar = (en) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = enVar.f36557a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.f20272id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new sm(enVar, chat, 3));
                return;
            case 8:
                ko koVar = (ko) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.i6 i6Var = i6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var.a(z10);
                org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                koVar.J0 = z12;
                runnable = a3Var.f20609a.dismissRunnable;
                runnable.run();
                koVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((lr) obj3).f38902c.f35468a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.w71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) obj4;
                            if (y71Var.b()) {
                                document = y71Var.f32561g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.y71 y71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.y71 y71Var3 = (org.telegram.ui.Components.y71) arrayList.get(i12);
                                if (y71Var3.f32564k < j11 && org.telegram.ui.Components.a81.Y(y71Var3.f32566m)) {
                                    j11 = y71Var3.f32564k;
                                    y71Var2 = y71Var3;
                                }
                            }
                            if (y71Var2 != null) {
                                document = y71Var2.f32561g;
                            } else {
                                document = ((org.telegram.ui.Components.y71) arrayList.get(0)).f32561g;
                            }
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f33445y, 1, null, null, new yq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f33445y, AccountInstance.getInstance(photoViewer.T), arrayList2, new xa(photoViewer, 3));
                    }
                    photoViewer.f33353o0.M(null, null);
                    return;
                }
                return;
            case 10:
                hs hsVar = (hs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.f5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new yr(hsVar, user, 1), hsVar.f37598r).o();
                return;
            case 11:
                og0 og0Var = (og0) obj3;
                ((org.telegram.ui.Components.i80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f17798id;
                if (og0Var.f40396c.getCurrentPosition() == 0 && (eyVar = og0Var.J) != null) {
                    eyVar.u4(i13);
                    return;
                }
                if (og0Var.J == null) {
                    og0Var.l0(null);
                }
                og0Var.I = Integer.valueOf(i13);
                og0Var.m0(0, true);
                og0Var.f40396c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr[0];
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    f3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((ei.d) obj3).N && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.b0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f33761a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f33761a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f35221a = 12;
        this.f35222b = f3VarArr;
        this.d = callback;
        this.f35223c = str;
    }
}

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

public final class c0 implements View.OnClickListener {

    public final int f36902a;

    public final Object f36903b;

    public final Object f36904c;
    public final Object d;

    public c0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36902a = i10;
        this.f36903b = obj;
        this.f36904c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Document document;
        gy gyVar;
        org.telegram.ui.ActionBar.e3 e3Var;
        int i10 = this.f36902a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.f36904c;
        Object obj3 = this.f36903b;
        switch (i10) {
            case 0:
                m4 m4Var = (m4) obj3;
                String str = (String) obj2;
                q3 q3Var = (q3) obj;
                m4Var.f40335d0.k(false);
                AndroidUtilities.hideKeyboard(m4Var.f40335d0.U);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.mc(q3Var.f41499f, null).k(false).k(true);
                break;
            case 1:
                e7 e7Var = (e7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                ih.a aVar = ((m7) obj2).d;
                long j10 = aVar.f11477b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f11481g);
                n2Var.presentFragment(new rn(bundle));
                e7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.f37641a;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                break;
            case 2:
                org.telegram.ui.Components.gj0 gj0Var = (org.telegram.ui.Components.gj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (gj0Var == null || gj0Var.f28731w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                }
                break;
            case 3:
                rn rnVar = (rn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (rnVar.getParentActivity() != null) {
                    if (rnVar.K0.getVisibility() != 0 || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        rnVar.U.c0(keyboardInlineButton, messageObject, messageObject, null);
                    }
                }
                break;
            case 4:
                ((rn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                rn.j1((rn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                rn.F0((rn) obj3, (fk) obj2, (boolean[]) obj);
                break;
            case 7:
                dn dnVar = (dn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = dnVar.f37446a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.f24750e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.f22380id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new rm(dnVar, chat, i11));
                break;
            case 8:
                jo joVar = (jo) obj3;
                org.telegram.ui.Cells.f6[] f6VarArr = (org.telegram.ui.Cells.f6[]) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                Integer num = (Integer) view.getTag();
                f6VarArr[0].a(num.intValue() == 0);
                f6VarArr[1].a(num.intValue() == 1);
                joVar.F0 = num.intValue() == 1;
                z2Var.f23994a.dismissRunnable.run();
                joVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((nr) obj3).f40906c.f41411a;
                Drawable[] drawableArr = PhotoViewer.P8;
                ArrayList arrayList = ((org.telegram.ui.Components.i61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) obj4;
                            if (k61Var.b()) {
                                document = k61Var.f30012g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.k61 k61Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.k61 k61Var3 = (org.telegram.ui.Components.k61) arrayList.get(i14);
                                if (k61Var3.f30015k < j11 && org.telegram.ui.Components.m61.Y(k61Var3.f30017m)) {
                                    j11 = k61Var3.f30015k;
                                    k61Var2 = k61Var3;
                                }
                            }
                            document = k61Var2 != null ? k61Var2.f30012g : ((org.telegram.ui.Components.k61) arrayList.get(0)).f30012g;
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f35800y, AccountInstance.getInstance(photoViewer.P), arrayList2, new ra(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f35800y, 1, null, null, new nq0(photoViewer, i12));
                    }
                    photoViewer.f35675k0.M(null, null);
                    break;
                }
                break;
            case 10:
                js jsVar = (js) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.y4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new as(jsVar, user, i12), jsVar.f39489r).o();
                break;
            case 11:
                qg0 qg0Var = (qg0) obj3;
                ((org.telegram.ui.Components.b70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).f19622id;
                if (qg0Var.f42640c.getCurrentPosition() != 0 || (gyVar = qg0Var.F) == null) {
                    if (qg0Var.F == null) {
                        qg0Var.l0(null);
                    }
                    qg0Var.E = Integer.valueOf(i15);
                    qg0Var.m0(0, true);
                    qg0Var.f42640c.D(0);
                } else {
                    gyVar.w4(i15);
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr[0];
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    e3VarArr[0] = null;
                    callback.run(str2);
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((lh.d) obj3).J && (e3Var = e3VarArr2[0]) != null) {
                    e3Var.dismiss();
                    e3VarArr2[0] = null;
                    runnable.run();
                }
                break;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.h5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36110a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36110a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                break;
        }
    }

    public c0(org.telegram.ui.ActionBar.e3[] e3VarArr, Utilities.Callback callback, String str) {
        this.f36902a = 12;
        this.f36903b = e3VarArr;
        this.d = callback;
        this.f36904c = str;
    }
}

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
    public final int f33997a;
    public final Object f33998b;
    public final Object f33999c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f33997a = i10;
        this.f33998b = obj;
        this.f33999c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        yy yyVar;
        org.telegram.ui.ActionBar.e3 e3Var;
        int i10 = this.f33997a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f33999c;
        Object obj3 = this.f33998b;
        switch (i10) {
            case 0:
                k4 k4Var = (k4) obj3;
                String str = (String) obj2;
                o3 o3Var = (o3) obj;
                k4Var.f37545h0.k(false);
                AndroidUtilities.hideKeyboard(k4Var.f37545h0.f41503b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.zc(o3Var.f38849f, null).k(false).k(true);
                return;
            case 1:
                i7 i7Var = (i7) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Bundle bundle = new Bundle();
                ai.b bVar = ((q7) obj2).d;
                long j10 = bVar.f916b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.f919g);
                m2Var.presentFragment(new fo(bundle));
                i7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = i7Var.f37049a;
                if (m1Var != null) {
                    m1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (qk0Var == null || qk0Var.f28635w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                fo foVar = (fo) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (foVar.getParentActivity() != null) {
                    if (foVar.O0.getVisibility() != 0 || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        foVar.Y.a0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((fo) obj3).za((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                fo.y1((fo) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                fo.C0((fo) obj3, (uk) obj2, (boolean[]) obj);
                return;
            case 7:
                qn qnVar = (qn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = qnVar.f39497a;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.e));
                }
                m2Var2.getMessagesController().addUserToChat(chat.f19216id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new en(qnVar, chat, 3));
                return;
            case 8:
                zo zoVar = (zo) obj3;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var.a(z10);
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                zoVar.J0 = z12;
                runnable = z2Var.f20838a.dismissRunnable;
                runnable.run();
                zoVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((as) obj3).f34333c.f41639a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.d81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.f81 f81Var = (org.telegram.ui.Components.f81) obj4;
                            if (f81Var.b()) {
                                document = f81Var.f24964g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.f81 f81Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.f81 f81Var3 = (org.telegram.ui.Components.f81) arrayList.get(i12);
                                if (f81Var3.f24967k < j11 && org.telegram.ui.Components.h81.Y(f81Var3.f24969m)) {
                                    j11 = f81Var3.f24967k;
                                    f81Var2 = f81Var3;
                                }
                            }
                            if (f81Var2 != null) {
                                document = f81Var2.f24964g;
                            } else {
                                document = ((org.telegram.ui.Components.f81) arrayList.get(0)).f24964g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f32405y, 1, null, null, new ur0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f32405y, AccountInstance.getInstance(photoViewer.T), arrayList2, new za(photoViewer, 3));
                    }
                    photoViewer.f32313o0.M(null, null);
                    return;
                }
                return;
            case 10:
                ws wsVar = (ws) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.g5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ns(wsVar, user, 1), wsVar.f41645r).o();
                return;
            case 11:
                kh0 kh0Var = (kh0) obj3;
                ((org.telegram.ui.Components.m80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f16708id;
                if (kh0Var.f37392c.getCurrentPosition() == 0 && (yyVar = kh0Var.J) != null) {
                    yyVar.t4(i13);
                    return;
                }
                if (kh0Var.J == null) {
                    kh0Var.l0(null);
                }
                kh0Var.I = Integer.valueOf(i13);
                kh0Var.m0(0, true);
                kh0Var.f37392c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr[0];
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    e3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((di.d) obj3).N && (e3Var = e3VarArr2[0]) != null) {
                    e3Var.dismiss();
                    e3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.h5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32719a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32719a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.e3[] e3VarArr, Utilities.Callback callback, String str) {
        this.f33997a = 12;
        this.f33998b = e3VarArr;
        this.d = callback;
        this.f33999c = str;
    }
}

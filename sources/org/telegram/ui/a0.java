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
    public final int f35226a;
    public final Object f35227b;
    public final Object f35228c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35226a = i10;
        this.f35227b = obj;
        this.f35228c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        cy cyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f35226a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f35228c;
        Object obj3 = this.f35227b;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                o3 o3Var = (o3) obj;
                l4Var.f38760h0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.f38760h0.f42782b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(o3Var.f39749f, null).k(false).k(true);
                return;
            case 1:
                h7 h7Var = (h7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                bi.b bVar = ((p7) obj2).d;
                long j10 = bVar.f4425b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.f4428g);
                n2Var.presentFragment(new qn(bundle));
                h7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = h7Var.f37509a;
                if (m1Var != null) {
                    m1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.mk0 mk0Var = (org.telegram.ui.Components.mk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (mk0Var == null || mk0Var.f28557w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                qn qnVar = (qn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (qnVar.getParentActivity() != null) {
                    if (qnVar.O0.getVisibility() != 0 || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        qnVar.Y.a0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((qn) obj3).za((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                qn.y1((qn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                qn.C0((qn) obj3, (hk) obj2, (boolean[]) obj);
                return;
            case 7:
                cn cnVar = (cn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = cnVar.f36004a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.f20273id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new qm(cnVar, chat, 3));
                return;
            case 8:
                io ioVar = (io) obj3;
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
                ioVar.J0 = z12;
                runnable = a3Var.f20610a.dismissRunnable;
                runnable.run();
                ioVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((jr) obj3).f38329c.f43533a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.x71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) obj4;
                            if (z71Var.b()) {
                                document = z71Var.f32877g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.z71 z71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.z71 z71Var3 = (org.telegram.ui.Components.z71) arrayList.get(i12);
                                if (z71Var3.f32880k < j11 && org.telegram.ui.Components.b81.Y(z71Var3.f32882m)) {
                                    j11 = z71Var3.f32880k;
                                    z71Var2 = z71Var3;
                                }
                            }
                            if (z71Var2 != null) {
                                document = z71Var2.f32877g;
                            } else {
                                document = ((org.telegram.ui.Components.z71) arrayList.get(0)).f32877g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f33451y, 1, null, null, new wq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f33451y, AccountInstance.getInstance(photoViewer.T), arrayList2, new va(photoViewer, 3));
                    }
                    photoViewer.f33359o0.M(null, null);
                    return;
                }
                return;
            case 10:
                fs fsVar = (fs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.f5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new wr(fsVar, user, 1), fsVar.f37065r).o();
                return;
            case 11:
                ng0 ng0Var = (ng0) obj3;
                ((org.telegram.ui.Components.i80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f17799id;
                if (ng0Var.f39882c.getCurrentPosition() == 0 && (cyVar = ng0Var.J) != null) {
                    cyVar.u4(i13);
                    return;
                }
                if (ng0Var.J == null) {
                    ng0Var.l0(null);
                }
                ng0Var.I = Integer.valueOf(i13);
                ng0Var.m0(0, true);
                ng0Var.f39882c.D(0);
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
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f33769a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f33769a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f35226a = 12;
        this.f35227b = f3VarArr;
        this.d = callback;
        this.f35228c = str;
    }
}

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
    public final int f35786a;
    public final Object f35787b;
    public final Object f35788c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35786a = i10;
        this.f35787b = obj;
        this.f35788c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        ty tyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f35786a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f35788c;
        Object obj3 = this.f35787b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.f38501h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.f38501h0.f43477b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.ad(m3Var.f39753f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                zh.a aVar = ((l7) obj2).d;
                long j3 = aVar.f54693b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.f54697g);
                n2Var.presentFragment(new zn(bundle));
                d7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.n1 n1Var = d7Var.f36872a;
                if (n1Var != null) {
                    n1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.uk0 uk0Var = (org.telegram.ui.Components.uk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (uk0Var == null || uk0Var.f31529w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                zn znVar = (zn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (znVar.getParentActivity() != null) {
                    if (znVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        znVar.Y.a0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((zn) obj3).za((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                zn.y1((zn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                zn.C0((zn) obj3, (qk) obj2, (boolean[]) obj);
                return;
            case 7:
                ln lnVar = (ln) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = lnVar.f39634a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.f22565e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.f20038id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new zm(lnVar, chat, 3));
                return;
            case 8:
                uo uoVar = (uo) obj3;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
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
                uoVar.J0 = z12;
                runnable = a3Var.f20380a.dismissRunnable;
                runnable.run();
                uoVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((vr) obj3).f42970c.f41169a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.g81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) obj4;
                            if (i81Var.b()) {
                                document = i81Var.f27273g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.i81 i81Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.i81 i81Var3 = (org.telegram.ui.Components.i81) arrayList.get(i12);
                                if (i81Var3.f27276k < j10 && org.telegram.ui.Components.k81.Y(i81Var3.f27278m)) {
                                    j10 = i81Var3.f27276k;
                                    i81Var2 = i81Var3;
                                }
                            }
                            if (i81Var2 != null) {
                                document = i81Var2.f27273g;
                            } else {
                                document = ((org.telegram.ui.Components.i81) arrayList.get(0)).f27273g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f34082y, 1, null, null, new or0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f34082y, AccountInstance.getInstance(photoViewer.T), arrayList2, new va(photoViewer, 3));
                    }
                    photoViewer.f33990o0.M(null, null);
                    return;
                }
                return;
            case 10:
                qs qsVar = (qs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.g5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new hs(qsVar, user, 1), qsVar.f41176r).o();
                return;
            case 11:
                fh0 fh0Var = (fh0) obj3;
                ((org.telegram.ui.Components.p80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f17252id;
                if (fh0Var.f36685c.getCurrentPosition() == 0 && (tyVar = fh0Var.J) != null) {
                    tyVar.t4(i13);
                    return;
                }
                if (fh0Var.J == null) {
                    fh0Var.l0(null);
                }
                fh0Var.I = Integer.valueOf(i13);
                fh0Var.m0(0, true);
                fh0Var.f36685c.D(0);
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
                if (!((ci.d) obj3).N && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34403a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34403a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f35786a = 12;
        this.f35787b = f3VarArr;
        this.d = callback;
        this.f35788c = str;
    }
}

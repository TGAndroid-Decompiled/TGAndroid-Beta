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
    public final int f34638a;
    public final Object f34639b;
    public final Object f34640c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f34638a = i10;
        this.f34639b = obj;
        this.f34640c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        uy uyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f34638a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f34640c;
        Object obj3 = this.f34639b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.f37271h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.f37271h0.f42387b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.yc(m3Var.f38456f, null).k(false).k(true);
                return;
            case 1:
                f7 f7Var = (f7) obj3;
                a7 a7Var = (a7) obj;
                Bundle bundle = new Bundle();
                zh.a aVar = ((o7) obj2).d;
                long j3 = aVar.f53574b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.f53578g);
                a7Var.presentFragment(new yn(bundle));
                f7Var.f36221f.E.dismiss();
                org.telegram.ui.ActionBar.n1 n1Var = f7Var.f36217a;
                if (n1Var != null) {
                    n1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (ck0Var == null || ck0Var.f25462w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                yn ynVar = (yn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (ynVar.getParentActivity() != null) {
                    if (ynVar.M0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        ynVar.W.c0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((yn) obj3).ua((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                yn.c1((yn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                yn.O0((yn) obj3, (mk) obj2, (boolean[]) obj);
                return;
            case 7:
                kn knVar = (kn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.n2 n2Var = knVar.f38076a;
                n2Var.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.f22578e));
                }
                n2Var.getMessagesController().addUserToChat(chat.f20047id, n2Var.getUserConfig().getCurrentUser(), 0, null, n2Var, new xm(knVar, chat, 3));
                return;
            case 8:
                to toVar = (to) obj3;
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
                toVar.J0 = z12;
                runnable = a3Var.f20383a.dismissRunnable;
                runnable.run();
                toVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((vr) obj3).f41811c.f38388a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.a81) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.c81 c81Var = (org.telegram.ui.Components.c81) obj4;
                            if (c81Var.b()) {
                                document = c81Var.f25305g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.c81 c81Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.c81 c81Var3 = (org.telegram.ui.Components.c81) arrayList.get(i12);
                                if (c81Var3.f25308k < j10 && org.telegram.ui.Components.e81.Y(c81Var3.f25310m)) {
                                    j10 = c81Var3.f25308k;
                                    c81Var2 = c81Var3;
                                }
                            }
                            if (c81Var2 != null) {
                                document = c81Var2.f25305g;
                            } else {
                                document = ((org.telegram.ui.Components.c81) arrayList.get(0)).f25305g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f34092y, 1, null, null, new jr0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f34092y, AccountInstance.getInstance(photoViewer.T), arrayList2, new wa(photoViewer, 3));
                    }
                    photoViewer.f34000o0.M(null, null);
                    return;
                }
                return;
            case 10:
                qs qsVar = (qs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.e5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new hs(qsVar, user, 1), qsVar.f39875r).o();
                return;
            case 11:
                ch0 ch0Var = (ch0) obj3;
                ((org.telegram.ui.Components.b80) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f17266id;
                if (ch0Var.f40108c.getCurrentPosition() == 0 && (uyVar = ch0Var.J) != null) {
                    uyVar.F4(i13);
                    return;
                }
                if (ch0Var.J == null) {
                    ch0Var.l0(null);
                }
                ch0Var.I = Integer.valueOf(i13);
                ch0Var.m0(0, true);
                ch0Var.f40108c.E(0);
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
                ProfileActivity.S((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.i5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34413a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34413a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Y();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f34638a = 12;
        this.f34639b = f3VarArr;
        this.d = callback;
        this.f34640c = str;
    }
}

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
    public final int f31615a;
    public final Object f31616b;
    public final Object f31617c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f31615a = i10;
        this.f31616b = obj;
        this.f31617c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        ry ryVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f31615a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f31617c;
        Object obj3 = this.f31616b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.f34009h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.f34009h0.f38848b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(m3Var.f35132f, null).k(false).k(true);
                return;
            case 1:
                e7 e7Var = (e7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                zh.a aVar = ((m7) obj2).d;
                long j3 = aVar.f49139b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.f49142g);
                n2Var.presentFragment(new xn(bundle));
                e7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.f32830a;
                if (n1Var != null) {
                    n1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (qj0Var == null || qj0Var.f27371w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                xn xnVar = (xn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (xnVar.getParentActivity() != null) {
                    if (xnVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        xnVar.Y.d0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((xn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                xn.j1((xn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                xn.F0((xn) obj3, (mk) obj2, (boolean[]) obj);
                return;
            case 7:
                jn jnVar = (jn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = jnVar.f34487a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.f18083id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new xm(jnVar, chat, 3));
                return;
            case 8:
                so soVar = (so) obj3;
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
                soVar.J0 = z12;
                runnable = a3Var.f18414a.dismissRunnable;
                runnable.run();
                soVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((sr) obj3).f37406c.f34794a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.b71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.d71 d71Var = (org.telegram.ui.Components.d71) obj4;
                            if (d71Var.b()) {
                                document = d71Var.f23304g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.d71 d71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.d71 d71Var3 = (org.telegram.ui.Components.d71) arrayList.get(i12);
                                if (d71Var3.f23307k < j10 && org.telegram.ui.Components.f71.Y(d71Var3.f23309m)) {
                                    j10 = d71Var3.f23307k;
                                    d71Var2 = d71Var3;
                                }
                            }
                            if (d71Var2 != null) {
                                document = d71Var2.f23304g;
                            } else {
                                document = ((org.telegram.ui.Components.d71) arrayList.get(0)).f23304g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f31086y, 1, null, null, new ir0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f31086y, AccountInstance.getInstance(photoViewer.T), arrayList2, new ua(photoViewer, 3));
                    }
                    photoViewer.f30994o0.M(null, null);
                    return;
                }
                return;
            case 10:
                ns nsVar = (ns) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.e5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new es(nsVar, user, 1), nsVar.f35591r).o();
                return;
            case 11:
                zg0 zg0Var = (zg0) obj3;
                ((org.telegram.ui.Components.o70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f15577id;
                if (zg0Var.f37686c.getCurrentPosition() == 0 && (ryVar = zg0Var.J) != null) {
                    ryVar.w4(i13);
                    return;
                }
                if (zg0Var.J == null) {
                    zg0Var.l0(null);
                }
                zg0Var.I = Integer.valueOf(i13);
                zg0Var.m0(0, true);
                zg0Var.f37686c.D(0);
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
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.i5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31399a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31399a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f31615a = 12;
        this.f31616b = f3VarArr;
        this.d = callback;
        this.f31617c = str;
    }
}

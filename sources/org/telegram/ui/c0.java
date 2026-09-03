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
    public final int f32967a;
    public final Object f32968b;
    public final Object f32969c;
    public final Object d;

    public c0(Object obj, Object obj2, Object obj3, int i10) {
        this.f32967a = i10;
        this.f32968b = obj;
        this.f32969c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        Runnable runnable;
        TLRPC.Document document;
        qy qyVar;
        org.telegram.ui.ActionBar.g3 g3Var;
        int i10 = this.f32967a;
        boolean z11 = false;
        Object obj = this.d;
        Object obj2 = this.f32969c;
        Object obj3 = this.f32968b;
        switch (i10) {
            case 0:
                n4 n4Var = (n4) obj3;
                String str = (String) obj2;
                r3 r3Var = (r3) obj;
                n4Var.f36363e0.k(false);
                AndroidUtilities.hideKeyboard(n4Var.f36363e0.V);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.qc(r3Var.f37686f, null).k(false).k(true);
                return;
            case 1:
                i7 i7Var = (i7) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Bundle bundle = new Bundle();
                mh.a aVar = ((q7) obj2).d;
                long j10 = aVar.f14158b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f14161g);
                p2Var.presentFragment(new zn(bundle));
                i7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.p1 p1Var = i7Var.f34810a;
                if (p1Var != null) {
                    p1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yj0 yj0Var = (org.telegram.ui.Components.yj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (yj0Var == null || yj0Var.f31039w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                zn znVar = (zn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (znVar.getParentActivity() != null) {
                    if (znVar.L0.getVisibility() != 0 || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        znVar.V.c0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((zn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                zn.j1((zn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                zn.F0((zn) obj3, (ok) obj2, (boolean[]) obj);
                return;
            case 7:
                ln lnVar = (ln) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = lnVar.f35808a;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.e));
                }
                p2Var2.getMessagesController().addUserToChat(chat.f19159id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new zm(lnVar, chat, 3));
                return;
            case 8:
                ro roVar = (ro) obj3;
                org.telegram.ui.Cells.h6[] h6VarArr = (org.telegram.ui.Cells.h6[]) obj2;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.h6 h6Var = h6VarArr[0];
                if (num.intValue() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h6Var.a(z4);
                org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[1];
                if (num.intValue() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var2.a(z10);
                if (num.intValue() == 1) {
                    z11 = true;
                }
                roVar.G0 = z11;
                runnable = b3Var.f19500a.dismissRunnable;
                runnable.run();
                roVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((tr) obj3).f38581c.f32939a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                ArrayList arrayList = ((org.telegram.ui.Components.e71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.g71 g71Var = (org.telegram.ui.Components.g71) obj4;
                            if (g71Var.b()) {
                                document = g71Var.f25078g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.g71 g71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.g71 g71Var3 = (org.telegram.ui.Components.g71) arrayList.get(i12);
                                if (g71Var3.f25081k < j11 && org.telegram.ui.Components.i71.Y(g71Var3.f25083m)) {
                                    j11 = g71Var3.f25081k;
                                    g71Var2 = g71Var3;
                                }
                            }
                            if (g71Var2 != null) {
                                document = g71Var2.f25078g;
                            } else {
                                document = ((org.telegram.ui.Components.g71) arrayList.get(0)).f25078g;
                            }
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.Q).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.Q).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f31887y, 1, null, null, new zq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f31887y, AccountInstance.getInstance(photoViewer.Q), arrayList2, new va(photoViewer, 3));
                    }
                    photoViewer.f31769l0.M(null, null);
                    return;
                }
                return;
            case 10:
                ps psVar = (ps) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.z4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new gs(psVar, user, 1), psVar.f37224r).o();
                return;
            case 11:
                xg0 xg0Var = (xg0) obj3;
                ((org.telegram.ui.Components.p70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f16649id;
                if (xg0Var.f37165c.getCurrentPosition() == 0 && (qyVar = xg0Var.G) != null) {
                    qyVar.w4(i13);
                    return;
                }
                if (xg0Var.G == null) {
                    xg0Var.l0(null);
                }
                xg0Var.F = Integer.valueOf(i13);
                xg0Var.m0(0, true);
                xg0Var.f37165c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = g3VarArr[0];
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    g3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.g3[] g3VarArr2 = (org.telegram.ui.ActionBar.g3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((ph.d) obj3).K && (g3Var = g3VarArr2[0]) != null) {
                    g3Var.dismiss();
                    g3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32190a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32190a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public c0(org.telegram.ui.ActionBar.g3[] g3VarArr, Utilities.Callback callback, String str) {
        this.f32967a = 12;
        this.f32968b = g3VarArr;
        this.d = callback;
        this.f32969c = str;
    }
}

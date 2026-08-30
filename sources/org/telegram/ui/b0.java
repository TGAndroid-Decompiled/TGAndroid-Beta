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
public final class b0 implements View.OnClickListener {
    public final int f32744a;
    public final Object f32745b;
    public final Object f32746c;
    public final Object d;

    public b0(Object obj, Object obj2, Object obj3, int i10) {
        this.f32744a = i10;
        this.f32745b = obj;
        this.f32746c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        Runnable runnable;
        TLRPC.Document document;
        oy oyVar;
        org.telegram.ui.ActionBar.g3 g3Var;
        int i10 = this.f32744a;
        boolean z11 = false;
        Object obj = this.d;
        Object obj2 = this.f32746c;
        Object obj3 = this.f32745b;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                p3 p3Var = (p3) obj;
                l4Var.f35933e0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.f35933e0.V);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.qc(p3Var.f37161f, null).k(false).k(true);
                return;
            case 1:
                g7 g7Var = (g7) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Bundle bundle = new Bundle();
                mh.a aVar = ((o7) obj2).d;
                long j10 = aVar.f14170b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f14173g);
                p2Var.presentFragment(new xn(bundle));
                g7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.p1 p1Var = g7Var.f34457a;
                if (p1Var != null) {
                    p1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yj0 yj0Var = (org.telegram.ui.Components.yj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (yj0Var == null || yj0Var.f31035w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                xn xnVar = (xn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (xnVar.getParentActivity() != null) {
                    if (xnVar.L0.getVisibility() != 0 || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        xnVar.V.c0(keyboardInlineButton, messageObject, messageObject, null);
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
                org.telegram.ui.ActionBar.p2 p2Var2 = jnVar.f35381a;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                p2Var2.getMessagesController().addUserToChat(chat.f19184id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new xm(jnVar, chat, 3));
                return;
            case 8:
                po poVar = (po) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.i6 i6Var = i6VarArr[0];
                if (num.intValue() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i6Var.a(z4);
                org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[1];
                if (num.intValue() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var2.a(z10);
                if (num.intValue() == 1) {
                    z11 = true;
                }
                poVar.G0 = z11;
                runnable = b3Var.f19525a.dismissRunnable;
                runnable.run();
                poVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((rr) obj3).f38106c.f38990a;
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
                                document = g71Var.f25075g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.g71 g71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.g71 g71Var3 = (org.telegram.ui.Components.g71) arrayList.get(i12);
                                if (g71Var3.f25078k < j11 && org.telegram.ui.Components.i71.Y(g71Var3.f25080m)) {
                                    j11 = g71Var3.f25078k;
                                    g71Var2 = g71Var3;
                                }
                            }
                            if (g71Var2 != null) {
                                document = g71Var2.f25075g;
                            } else {
                                document = ((org.telegram.ui.Components.g71) arrayList.get(0)).f25075g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f31913y, 1, null, null, new sq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f31913y, AccountInstance.getInstance(photoViewer.Q), arrayList2, new ta(photoViewer, 3));
                    }
                    photoViewer.f31795l0.M(null, null);
                    return;
                }
                return;
            case 10:
                ns nsVar = (ns) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.z4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new es(nsVar, user, 1), nsVar.f36720r).o();
                return;
            case 11:
                vg0 vg0Var = (vg0) obj3;
                ((org.telegram.ui.Components.o70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f16669id;
                if (vg0Var.f34875c.getCurrentPosition() == 0 && (oyVar = vg0Var.G) != null) {
                    oyVar.w4(i13);
                    return;
                }
                if (vg0Var.G == null) {
                    vg0Var.l0(null);
                }
                vg0Var.F = Integer.valueOf(i13);
                vg0Var.m0(0, true);
                vg0Var.f34875c.D(0);
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
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32216a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32216a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public b0(org.telegram.ui.ActionBar.g3[] g3VarArr, Utilities.Callback callback, String str) {
        this.f32744a = 12;
        this.f32745b = g3VarArr;
        this.d = callback;
        this.f32746c = str;
    }
}

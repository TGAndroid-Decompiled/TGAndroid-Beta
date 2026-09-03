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
    public final int f35282a;
    public final Object f35283b;
    public final Object f35284c;
    public final Object d;

    public b0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35282a = i10;
        this.f35283b = obj;
        this.f35284c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        Runnable runnable;
        TLRPC.Document document;
        py pyVar;
        org.telegram.ui.ActionBar.h3 h3Var;
        int i10 = this.f35282a;
        boolean z11 = false;
        Object obj = this.d;
        Object obj2 = this.f35284c;
        Object obj3 = this.f35283b;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                p3 p3Var = (p3) obj;
                l4Var.f38512e0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.f38512e0.V);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.qc(p3Var.f39865f, null).k(false).k(true);
                return;
            case 1:
                g7 g7Var = (g7) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Bundle bundle = new Bundle();
                nh.a aVar = ((o7) obj2).d;
                long j10 = aVar.f16246b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f16250g);
                p2Var.presentFragment(new xn(bundle));
                g7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.p1 p1Var = g7Var.f37000a;
                if (p1Var != null) {
                    p1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.zj0 zj0Var = (org.telegram.ui.Components.zj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (zj0Var == null || zj0Var.f33957w) {
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
                org.telegram.ui.ActionBar.p2 p2Var2 = jnVar.f38085a;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.f23253e));
                }
                p2Var2.getMessagesController().addUserToChat(chat.f20845id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new xm(jnVar, chat, 3));
                return;
            case 8:
                po poVar = (po) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
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
                runnable = c3Var.f21209a.dismissRunnable;
                runnable.run();
                poVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((sr) obj3).f41299c.f35592a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                ArrayList arrayList = ((org.telegram.ui.Components.f71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) obj4;
                            if (h71Var.b()) {
                                document = h71Var.f27401g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.h71 h71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.h71 h71Var3 = (org.telegram.ui.Components.h71) arrayList.get(i12);
                                if (h71Var3.f27404k < j11 && org.telegram.ui.Components.j71.Y(h71Var3.f27406m)) {
                                    j11 = h71Var3.f27404k;
                                    h71Var2 = h71Var3;
                                }
                            }
                            if (h71Var2 != null) {
                                document = h71Var2.f27401g;
                            } else {
                                document = ((org.telegram.ui.Components.h71) arrayList.get(0)).f27401g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f34439y, 1, null, null, new zq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f34439y, AccountInstance.getInstance(photoViewer.Q), arrayList2, new ta(photoViewer, 3));
                    }
                    photoViewer.f34321l0.M(null, null);
                    return;
                }
                return;
            case 10:
                os osVar = (os) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.z4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new fs(osVar, user, 1), osVar.f39796r).o();
                return;
            case 11:
                wg0 wg0Var = (wg0) obj3;
                ((org.telegram.ui.Components.q70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f18057id;
                if (wg0Var.f40022c.getCurrentPosition() == 0 && (pyVar = wg0Var.G) != null) {
                    pyVar.w4(i13);
                    return;
                }
                if (wg0Var.G == null) {
                    wg0Var.l0(null);
                }
                wg0Var.F = Integer.valueOf(i13);
                wg0Var.m0(0, true);
                wg0Var.f40022c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.h3 h3Var2 = h3VarArr[0];
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    h3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.h3[] h3VarArr2 = (org.telegram.ui.ActionBar.h3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((qh.d) obj3).K && (h3Var = h3VarArr2[0]) != null) {
                    h3Var.dismiss();
                    h3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.l5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public b0(org.telegram.ui.ActionBar.h3[] h3VarArr, Utilities.Callback callback, String str) {
        this.f35282a = 12;
        this.f35283b = h3VarArr;
        this.d = callback;
        this.f35284c = str;
    }
}

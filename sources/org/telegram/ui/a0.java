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
    public final int f30756a;
    public final Object f30757b;
    public final Object f30758c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30756a = i10;
        this.f30757b = obj;
        this.f30758c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        wy wyVar;
        org.telegram.ui.ActionBar.h3 h3Var;
        int i10 = this.f30756a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f30758c;
        Object obj3 = this.f30757b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj3;
                String str = (String) obj2;
                n3 n3Var = (n3) obj;
                j4Var.f33908h0.k(false);
                AndroidUtilities.hideKeyboard(j4Var.f33908h0.f38103b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.wc(n3Var.f35104f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Bundle bundle = new Bundle();
                yh.a aVar = ((l7) obj2).d;
                long j3 = aVar.f47168b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.f47171g);
                p2Var.presentFragment(new eo(bundle));
                d7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.p1 p1Var = d7Var.f31848a;
                if (p1Var != null) {
                    p1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.zj0 zj0Var = (org.telegram.ui.Components.zj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (zj0Var == null || zj0Var.f29708w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                eo eoVar = (eo) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (eoVar.getParentActivity() != null) {
                    if (eoVar.O0.getVisibility() != 0 || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        eoVar.Y.c0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((eo) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                eo.j1((eo) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                eo.F0((eo) obj3, (rk) obj2, (boolean[]) obj);
                return;
            case 7:
                pn pnVar = (pn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = pnVar.f35881a;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                p2Var2.getMessagesController().addUserToChat(chat.f17195id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new dn(pnVar, chat, 3));
                return;
            case 8:
                yo yoVar = (yo) obj3;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj2;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.k6 k6Var = k6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k6Var.a(z10);
                org.telegram.ui.Cells.k6 k6Var2 = k6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                yoVar.J0 = z12;
                runnable = c3Var.f17571a.dismissRunnable;
                runnable.run();
                yoVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((yr) obj3).f39102c.f36130a;
                Drawable[] drawableArr = PhotoViewer.T8;
                ArrayList arrayList = ((org.telegram.ui.Components.p71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) obj4;
                            if (r71Var.b()) {
                                document = r71Var.f26620g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r71 r71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.r71 r71Var3 = (org.telegram.ui.Components.r71) arrayList.get(i12);
                                if (r71Var3.f26623k < j10 && org.telegram.ui.Components.t71.Y(r71Var3.f26625m)) {
                                    j10 = r71Var3.f26623k;
                                    r71Var2 = r71Var3;
                                }
                            }
                            if (r71Var2 != null) {
                                document = r71Var2.f26620g;
                            } else {
                                document = ((org.telegram.ui.Components.r71) arrayList.get(0)).f26620g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f30227y, 1, null, null, new or0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f30227y, AccountInstance.getInstance(photoViewer.T), arrayList2, new wa(photoViewer, 3));
                    }
                    photoViewer.f30135o0.M(null, null);
                    return;
                }
                return;
            case 10:
                ts tsVar = (ts) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.d5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ks(tsVar, user, 1), tsVar.f37005r).o();
                return;
            case 11:
                fh0 fh0Var = (fh0) obj3;
                ((org.telegram.ui.Components.w70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f14645id;
                if (fh0Var.f33117c.getCurrentPosition() == 0 && (wyVar = fh0Var.J) != null) {
                    wyVar.w4(i13);
                    return;
                }
                if (fh0Var.J == null) {
                    fh0Var.l0(null);
                }
                fh0Var.I = Integer.valueOf(i13);
                fh0Var.m0(0, true);
                fh0Var.f33117c.D(0);
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
                if (!((bi.d) obj3).N && (h3Var = h3VarArr2[0]) != null) {
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
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f30540a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f30540a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.h3[] h3VarArr, Utilities.Callback callback, String str) {
        this.f30756a = 12;
        this.f30757b = h3VarArr;
        this.d = callback;
        this.f30758c = str;
    }
}

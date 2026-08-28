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
    public final int f36581a;
    public final Object f36582b;
    public final Object f36583c;
    public final Object d;

    public b0(Object obj, Object obj2, Object obj3, int i9) {
        this.f36581a = i9;
        this.f36582b = obj;
        this.f36583c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        dy dyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i9 = this.f36581a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f36583c;
        Object obj3 = this.f36582b;
        switch (i9) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                p3 p3Var = (p3) obj;
                l4Var.f40014d0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.f40014d0.U);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.oc(p3Var.f41323f, null).k(false).k(true);
                return;
            case 1:
                d7 d7Var = (d7) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Bundle bundle = new Bundle();
                hh.a aVar = ((l7) obj2).d;
                long j10 = aVar.f10781b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f10785g);
                o2Var.presentFragment(new qn(bundle));
                d7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = d7Var.f37425a;
                if (o1Var != null) {
                    o1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ej0 ej0Var = (org.telegram.ui.Components.ej0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (ej0Var == null || ej0Var.f28045w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                qn qnVar = (qn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (qnVar.getParentActivity() != null) {
                    if (qnVar.K0.getVisibility() != 0 || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        qnVar.U.b0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((qn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                qn.j1((qn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                qn.E0((qn) obj3, (dk) obj2, (boolean[]) obj);
                return;
            case 7:
                cn cnVar = (cn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = cnVar.f37236a;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.f24790e));
                }
                o2Var2.getMessagesController().addUserToChat(chat.f22380id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new qm(cnVar, chat, 3));
                return;
            case 8:
                ho hoVar = (ho) obj3;
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
                hoVar.F0 = z12;
                runnable = a3Var.f22713a.dismissRunnable;
                runnable.run();
                hoVar.o0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((lr) obj3).f40220c.f41231a;
                Drawable[] drawableArr = PhotoViewer.P8;
                ArrayList arrayList = ((org.telegram.ui.Components.g61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) obj4;
                            if (i61Var.b()) {
                                document = i61Var.f29362g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.i61 i61Var2 = null;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                org.telegram.ui.Components.i61 i61Var3 = (org.telegram.ui.Components.i61) arrayList.get(i11);
                                if (i61Var3.f29365k < j11 && org.telegram.ui.Components.k61.Y(i61Var3.f29367m)) {
                                    j11 = i61Var3.f29365k;
                                    i61Var2 = i61Var3;
                                }
                            }
                            if (i61Var2 != null) {
                                document = i61Var2.f29362g;
                            } else {
                                document = ((org.telegram.ui.Components.i61) arrayList.get(0)).f29362g;
                            }
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f35797y, 1, null, null, new mq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f35797y, AccountInstance.getInstance(photoViewer.P), arrayList2, new qa(photoViewer, 3));
                    }
                    photoViewer.f35672k0.M(null, null);
                    return;
                }
                return;
            case 10:
                is isVar = (is) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.y4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new zr(isVar, user, 1), isVar.f39275r).o();
                return;
            case 11:
                ng0 ng0Var = (ng0) obj3;
                ((org.telegram.ui.Components.x60) obj2).u();
                int i12 = ((MessagesController.DialogFilter) obj).f19649id;
                if (ng0Var.f42999c.getCurrentPosition() == 0 && (dyVar = ng0Var.F) != null) {
                    dyVar.w4(i12);
                    return;
                }
                if (ng0Var.F == null) {
                    ng0Var.k0(null);
                }
                ng0Var.E = Integer.valueOf(i12);
                ng0Var.l0(0, true);
                ng0Var.f42999c.D(0);
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
                if (!((kh.d) obj3).J && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.T((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.h5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36107a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36107a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Y();
                return;
        }
    }

    public b0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f36581a = 12;
        this.f36582b = f3VarArr;
        this.d = callback;
        this.f36583c = str;
    }
}

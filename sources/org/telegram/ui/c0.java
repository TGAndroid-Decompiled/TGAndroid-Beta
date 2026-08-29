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
    public final int f36948a;
    public final Object f36949b;
    public final Object f36950c;
    public final Object d;

    public c0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36948a = i10;
        this.f36949b = obj;
        this.f36950c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        fy fyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.f36948a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f36950c;
        Object obj3 = this.f36949b;
        switch (i10) {
            case 0:
                m4 m4Var = (m4) obj3;
                String str = (String) obj2;
                q3 q3Var = (q3) obj;
                m4Var.f40392d0.k(false);
                AndroidUtilities.hideKeyboard(m4Var.f40392d0.U);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.tc(q3Var.f41516f, null).k(false).k(true);
                return;
            case 1:
                c7 c7Var = (c7) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Bundle bundle = new Bundle();
                kh.a aVar = ((k7) obj2).d;
                long j10 = aVar.f13890b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.f13894g);
                o2Var.presentFragment(new tn(bundle));
                c7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = c7Var.f37009a;
                if (o1Var != null) {
                    o1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (pj0Var == null || pj0Var.f31694w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                tn tnVar = (tn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tnVar.getParentActivity() != null) {
                    if (tnVar.K0.getVisibility() != 0 || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        tnVar.U.c0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((tn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                tn.j1((tn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                tn.F0((tn) obj3, (gk) obj2, (boolean[]) obj);
                return;
            case 7:
                fn fnVar = (fn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = fnVar.f38212a;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.f24770e));
                }
                o2Var2.getMessagesController().addUserToChat(chat.f22392id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new sm(fnVar, chat, 3));
                return;
            case 8:
                ko koVar = (ko) obj3;
                org.telegram.ui.Cells.g6[] g6VarArr = (org.telegram.ui.Cells.g6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.g6 g6Var = g6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g6Var.a(z10);
                org.telegram.ui.Cells.g6 g6Var2 = g6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                koVar.F0 = z12;
                runnable = a3Var.f22729a.dismissRunnable;
                runnable.run();
                koVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((lr) obj3).f40263c.f41212a;
                Drawable[] drawableArr = PhotoViewer.P8;
                ArrayList arrayList = ((org.telegram.ui.Components.t61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) obj4;
                            if (v61Var.b()) {
                                document = v61Var.f33477g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.v61 v61Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.v61 v61Var3 = (org.telegram.ui.Components.v61) arrayList.get(i12);
                                if (v61Var3.f33480k < j11 && org.telegram.ui.Components.x61.Y(v61Var3.f33482m)) {
                                    j11 = v61Var3.f33480k;
                                    v61Var2 = v61Var3;
                                }
                            }
                            if (v61Var2 != null) {
                                document = v61Var2.f33477g;
                            } else {
                                document = ((org.telegram.ui.Components.v61) arrayList.get(0)).f33477g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f35864y, 1, null, null, new mq0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f35864y, AccountInstance.getInstance(photoViewer.P), arrayList2, new pa(photoViewer, 3));
                    }
                    photoViewer.f35738k0.M(null, null);
                    return;
                }
                return;
            case 10:
                hs hsVar = (hs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.c5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new yr(hsVar, user, 1), hsVar.f39009r).o();
                return;
            case 11:
                ng0 ng0Var = (ng0) obj3;
                ((org.telegram.ui.Components.j70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f19620id;
                if (ng0Var.f43594c.getCurrentPosition() == 0 && (fyVar = ng0Var.F) != null) {
                    fyVar.w4(i13);
                    return;
                }
                if (ng0Var.F == null) {
                    ng0Var.l0(null);
                }
                ng0Var.E = Integer.valueOf(i13);
                ng0Var.m0(0, true);
                ng0Var.f43594c.D(0);
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
                if (!((nh.d) obj3).J && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
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
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f36172a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f36172a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public c0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.f36948a = 12;
        this.f36949b = f3VarArr;
        this.d = callback;
        this.f36950c = str;
    }
}

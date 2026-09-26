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
    public final int f31929a;
    public final Object f31930b;
    public final Object f31931c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f31929a = i10;
        this.f31930b = obj;
        this.f31931c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        Runnable runnable;
        TLRPC.Document document;
        qy qyVar;
        org.telegram.ui.ActionBar.e3 e3Var;
        int i10 = this.f31929a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f31931c;
        Object obj3 = this.f31930b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.f34394h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.f34394h0.f39228b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(m3Var.f35461f, null).k(false).k(true);
                return;
            case 1:
                e7 e7Var = (e7) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Bundle bundle = new Bundle();
                zh.a aVar = ((m7) obj2).d;
                long j3 = aVar.f49464b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.f49467g);
                m2Var.presentFragment(new wn(bundle));
                e7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = e7Var.f33281a;
                if (m1Var != null) {
                    m1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.bk0 bk0Var = (org.telegram.ui.Components.bk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (bk0Var == null || bk0Var.f23053w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                wn wnVar = (wn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (wnVar.getParentActivity() != null) {
                    if (wnVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        wnVar.Y.c0(keyboardInlineButton, messageObject, messageObject, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((wn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                wn.m1((wn) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                wn.G0((wn) obj3, (mk) obj2, (boolean[]) obj);
                return;
            case 7:
                in inVar = (in) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = inVar.f34556a;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.e));
                }
                m2Var2.getMessagesController().addUserToChat(chat.f18335id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new wm(inVar, chat, 3));
                return;
            case 8:
                ro roVar = (ro) obj3;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
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
                roVar.J0 = z12;
                runnable = z2Var.f19949a.dismissRunnable;
                runnable.run();
                roVar.p0(true, true);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((rr) obj3).f37451c.f34572a;
                Drawable[] drawableArr = PhotoViewer.U8;
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
                                document = r71Var.f27855g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r71 r71Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.r71 r71Var3 = (org.telegram.ui.Components.r71) arrayList.get(i12);
                                if (r71Var3.f27858k < j10 && org.telegram.ui.Components.t71.Y(r71Var3.f27860m)) {
                                    j10 = r71Var3.f27858k;
                                    r71Var2 = r71Var3;
                                }
                            }
                            if (r71Var2 != null) {
                                document = r71Var2.f27855g;
                            } else {
                                document = ((org.telegram.ui.Components.r71) arrayList.get(0)).f27855g;
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
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.f31400y, 1, null, null, new gr0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.f31400y, AccountInstance.getInstance(photoViewer.T), arrayList2, new ua(photoViewer, 3));
                    }
                    photoViewer.f31308o0.M(null, null);
                    return;
                }
                return;
            case 10:
                ms msVar = (ms) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.e5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ds(msVar, user, 1), msVar.f35656r).o();
                return;
            case 11:
                yg0 yg0Var = (yg0) obj3;
                ((org.telegram.ui.Components.z70) obj2).u();
                int i13 = ((MessagesController.DialogFilter) obj).f15832id;
                if (yg0Var.f38125c.getCurrentPosition() == 0 && (qyVar = yg0Var.J) != null) {
                    qyVar.w4(i13);
                    return;
                }
                if (yg0Var.J == null) {
                    yg0Var.l0(null);
                }
                yg0Var.I = Integer.valueOf(i13);
                yg0Var.m0(0, true);
                yg0Var.f38125c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr[0];
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    e3VarArr[0] = null;
                    callback.run(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((ci.d) obj3).N && (e3Var = e3VarArr2[0]) != null) {
                    e3Var.dismiss();
                    e3VarArr2[0] = null;
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
                ((org.telegram.ui.ActionBar.m1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31713a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31713a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.e3[] e3VarArr, Utilities.Callback callback, String str) {
        this.f31929a = 12;
        this.f31930b = e3VarArr;
        this.d = callback;
        this.f31931c = str;
    }
}

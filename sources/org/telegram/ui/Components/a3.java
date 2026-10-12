package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a3 implements Utilities.Callback {
    public final int f23424a;
    public final Object f23425b;

    public a3(Object obj, int i10) {
        this.f23424a = i10;
        this.f23425b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f23424a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((ah.g) this.f23425b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                di.g gVar = ((md) this.f23425b).f7382f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((vm) this.f23425b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f27671b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((et) this.f23425b).N).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((nu) this.f23425b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f23425b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((cb0) this.f23425b).V.Y0(((Integer) obj).intValue() + 8);
                return;
            case 7:
                vc0 vc0Var = (vc0) this.f23425b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = vc0Var.e.f29348a;
                wb0 wb0Var = vc0Var.f29936f;
                if (((sc0) arrayList2.get(wb0Var.getCurrentPosition())).f29114a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((sc0) arrayList2.get(i11)).f29114a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (wb0Var.getCurrentPosition() != i10) {
                        wb0Var.D(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                pc0 pc0Var = (pc0) this.f23425b;
                pc0Var.f28288n.y(pc0Var.f28287f.T((View) obj));
                return;
            case 9:
                re0 re0Var = (re0) this.f23425b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = re0Var.h;
                if (re0Var.getContext() != null) {
                    if (re0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f12 = 1.0f;
                        if (intValue <= AndroidUtilities.dp(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f13 = 2.0f;
                            float height = (re0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        es esVar = es.h;
                        duration.setInterpolator(esVar).start();
                        ViewPropertyAnimator animate2 = re0Var.I.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(esVar);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                of0 of0Var = (of0) this.f23425b;
                of0Var.K.b(of0Var.N, true, 0, ((Long) obj).longValue());
                of0Var.dismiss();
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23425b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        f14 = -0.2f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 12:
                ez0 ez0Var = (ez0) this.f23425b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = ez0Var.f24827a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                if (userFull != null) {
                    tL_birthday = userFull.birthday;
                } else {
                    tL_birthday = null;
                }
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday2;
                    MessagesStorage.getInstance(i12).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new bi.e5(ez0Var, userFull, tL_birthday, 13), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            default:
                h71 h71Var = (h71) this.f23425b;
                h71Var.W2.Q(h71Var.T((View) obj), h71Var.f25532a3);
                return;
        }
    }
}

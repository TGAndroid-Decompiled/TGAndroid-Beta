package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
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
public final class v2 implements Utilities.Callback {
    public final int f29336a;
    public final Object f29337b;

    public v2(Object obj, int i10) {
        this.f29336a = i10;
        this.f29337b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f29336a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((af.b) this.f29337b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ph.f fVar = ((bd) this.f29337b).f41809f;
                fVar.setText(charSequence);
                fVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((em) this.f29337b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f24278b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((ps) this.f29337b).K).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((vt) this.f29337b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f29337b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((da0) this.f29337b).S.Y0(((Integer) obj).intValue() + 8);
                return;
            case 7:
                wb0 wb0Var = (wb0) this.f29337b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = wb0Var.e.f29177a;
                xa0 xa0Var = wb0Var.f30288f;
                if (((tb0) arrayList2.get(xa0Var.getCurrentPosition())).f28953a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((tb0) arrayList2.get(i11)).f28953a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (xa0Var.getCurrentPosition() != i10) {
                        xa0Var.D(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                vd0 vd0Var = (vd0) this.f29337b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = vd0Var.h;
                if (vd0Var.getContext() != null) {
                    if (vd0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= AndroidUtilities.dp(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (vd0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z4) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        nr nrVar = nr.h;
                        duration.setInterpolator(nrVar).start();
                        ViewPropertyAnimator animate2 = vd0Var.F.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(nrVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                se0 se0Var = (se0) this.f29337b;
                se0Var.H.a(se0Var.K, true, 0, ((Long) obj).longValue());
                se0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f29337b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        f15 = -0.2f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f15);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                return;
            default:
                ky0 ky0Var = (ky0) this.f29337b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = ky0Var.f26399a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new gg.y(ky0Var, userFull, tL_birthday, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
        }
    }
}

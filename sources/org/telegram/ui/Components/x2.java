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
public final class x2 implements Utilities.Callback {
    public final int f32482a;
    public final Object f32483b;

    public x2(Object obj, int i10) {
        this.f32482a = i10;
        this.f32483b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f32482a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((c2) this.f32483b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ei.g gVar = ((id) this.f32483b).f9410f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((qm) this.f32483b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f27704b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((ys) this.f32483b).P).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((gu) this.f32483b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f32483b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((va0) this.f32483b).V.b1(((Integer) obj).intValue() + 8);
                return;
            case 7:
                pc0 pc0Var = (pc0) this.f32483b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = pc0Var.e.f28867a;
                pb0 pb0Var = pc0Var.f29540f;
                if (((mc0) arrayList2.get(pb0Var.getCurrentPosition())).f28578a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((mc0) arrayList2.get(i11)).f28578a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (pb0Var.getCurrentPosition() != i10) {
                        pb0Var.D(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                jc0 jc0Var = (jc0) this.f32483b;
                jc0Var.f27676n.y(jc0Var.f27675f.T((View) obj));
                return;
            case 9:
                ne0 ne0Var = (ne0) this.f32483b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = ne0Var.h;
                if (ne0Var.getContext() != null) {
                    if (ne0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
                            float height = (ne0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        zr zrVar = zr.h;
                        duration.setInterpolator(zrVar).start();
                        ViewPropertyAnimator animate2 = ne0Var.M.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(zrVar);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                lf0 lf0Var = (lf0) this.f32483b;
                lf0Var.K.a(lf0Var.N, true, 0, ((Long) obj).longValue());
                lf0Var.dismiss();
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f32483b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
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
                dz0 dz0Var = (dz0) this.f32483b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = dz0Var.f25864a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new ai.j2(dz0Var, userFull, tL_birthday, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            default:
                i71 i71Var = (i71) this.f32483b;
                i71Var.Z2.Q(i71Var.T((View) obj), i71Var.f27322d3);
                return;
        }
    }
}

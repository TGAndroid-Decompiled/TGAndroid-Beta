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
public final class z2 implements Utilities.Callback {
    public final int f32807a;
    public final Object f32808b;

    public z2(Object obj, int i10) {
        this.f32807a = i10;
        this.f32808b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f32807a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((e2) this.f32808b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ei.g gVar = ((kd) this.f32808b).f9401f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((sm) this.f32808b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f28238b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((at) this.f32808b).N).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((iu) this.f32808b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f32808b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((wa0) this.f32808b).V.a1(((Integer) obj).intValue() + 8);
                return;
            case 7:
                oc0 oc0Var = (oc0) this.f32808b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = oc0Var.e.f28497a;
                qb0 qb0Var = oc0Var.f28924f;
                if (((lc0) arrayList2.get(qb0Var.getCurrentPosition())).f28196a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((lc0) arrayList2.get(i11)).f28196a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (qb0Var.getCurrentPosition() != i10) {
                        qb0Var.D(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ic0 ic0Var = (ic0) this.f32808b;
                ic0Var.f27187n.y(ic0Var.f27186f.T((View) obj));
                return;
            case 9:
                le0 le0Var = (le0) this.f32808b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = le0Var.h;
                if (le0Var.getContext() != null) {
                    if (le0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
                            float height = (le0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        bs bsVar = bs.h;
                        duration.setInterpolator(bsVar).start();
                        ViewPropertyAnimator animate2 = le0Var.M.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(bsVar);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                if0 if0Var = (if0) this.f32808b;
                if0Var.K.b(if0Var.N, true, 0, ((Long) obj).longValue());
                if0Var.dismiss();
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f32808b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
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
                zy0 zy0Var = (zy0) this.f32808b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = zy0Var.f33045a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new ai.p2(zy0Var, userFull, tL_birthday, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            default:
                a71 a71Var = (a71) this.f32808b;
                a71Var.W2.Q(a71Var.T((View) obj), a71Var.f24513a3);
                return;
        }
    }
}

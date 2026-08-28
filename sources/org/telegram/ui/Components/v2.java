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
    public final int f33237a;
    public final Object f33238b;

    public v2(Object obj, int i9) {
        this.f33237a = i9;
        this.f33238b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f33237a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((bg.c2) this.f33238b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                kh.g gVar = ((ad) this.f33238b).f15632f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((yl) this.f33238b).v;
                chatAttachAlertPhotoLayout.q0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f27493b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((hs) this.f33238b).J).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((mt) this.f33238b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f33238b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((k90) this.f33238b).R.Y0(((Integer) obj).intValue() + 8);
                return;
            case 7:
                cb0 cb0Var = (cb0) this.f33238b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = cb0Var.f27457e.f26746a;
                ea0 ea0Var = cb0Var.f27458f;
                if (((za0) arrayList2.get(ea0Var.getCurrentPosition())).f35264a != num.intValue()) {
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((za0) arrayList2.get(i10)).f35264a == num.intValue()) {
                                i9 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (ea0Var.getCurrentPosition() != i9) {
                        ea0Var.D(i9);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                yc0 yc0Var = (yc0) this.f33238b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = yc0Var.h;
                if (yc0Var.getContext() != null) {
                    if (yc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= AndroidUtilities.dp(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (yc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        gr grVar = gr.h;
                        duration.setInterpolator(grVar).start();
                        ViewPropertyAnimator animate2 = yc0Var.E.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(grVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                wd0 wd0Var = (wd0) this.f33238b;
                wd0Var.G.b(wd0Var.J, true, 0, ((Long) obj).longValue());
                wd0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f33238b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.f6.I.q()) {
                    if (org.telegram.ui.ActionBar.f6.I.q()) {
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
                ox0 ox0Var = (ox0) this.f33238b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = ox0Var.f31461a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                if (userFull != null) {
                    tL_birthday = userFull.birthday;
                } else {
                    tL_birthday = null;
                }
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday2;
                    MessagesStorage.getInstance(i11).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bg.b0(ox0Var, userFull, tL_birthday, 21), 1024);
                MessagesController.getInstance(i11).invalidateContentSettings();
                MessagesController.getInstance(i11).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
        }
    }
}

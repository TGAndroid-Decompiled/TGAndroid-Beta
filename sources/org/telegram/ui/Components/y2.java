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
public final class y2 implements Utilities.Callback {
    public final int f29225a;
    public final Object f29226b;

    public y2(Object obj, int i10) {
        this.f29225a = i10;
        this.f29226b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f29225a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((bi.s) this.f29226b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                bi.i iVar = ((jd) this.f29226b).f3268f;
                iVar.setText(charSequence);
                iVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((nm) this.f29226b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f26422b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((xs) this.f29226b).N).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((fu) this.f29226b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f29226b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((la0) this.f29226b).V.Y0(((Integer) obj).intValue() + 8);
                return;
            case 7:
                ec0 ec0Var = (ec0) this.f29226b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ec0Var.e.f22094a;
                fb0 fb0Var = ec0Var.f22664f;
                if (((bc0) arrayList2.get(fb0Var.getCurrentPosition())).f21799a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((bc0) arrayList2.get(i11)).f21799a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (fb0Var.getCurrentPosition() != i10) {
                        fb0Var.D(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                be0 be0Var = (be0) this.f29226b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = be0Var.h;
                if (be0Var.getContext() != null) {
                    if (be0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
                            float height = (be0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        wr wrVar = wr.h;
                        duration.setInterpolator(wrVar).start();
                        ViewPropertyAnimator animate2 = be0Var.I.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(wrVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ye0 ye0Var = (ye0) this.f29226b;
                ye0Var.K.a(ye0Var.N, true, 0, ((Long) obj).longValue());
                ye0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f29226b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        f14 = -0.2f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                return;
            default:
                ty0 ty0Var = (ty0) this.f29226b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = ty0Var.f27511a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new bi.wa(ty0Var, userFull, tL_birthday, 12), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
        }
    }
}

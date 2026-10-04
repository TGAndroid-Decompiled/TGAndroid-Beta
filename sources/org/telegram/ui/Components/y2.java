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
public final class y2 implements Utilities.Callback {
    public final int f33028a;
    public final Object f33029b;

    public y2(Object obj, int i10) {
        this.f33028a = i10;
        this.f33029b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f33028a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((ai.o8) this.f33029b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ci.g gVar = ((md) this.f33029b).f5517f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((km) this.f33029b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f29643b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((us) this.f33029b).N).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((eu) this.f33029b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f33029b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((pa0) this.f33029b).V.Y0(((Integer) obj).intValue() + 8);
                return;
            case 7:
                ic0 ic0Var = (ic0) this.f33029b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ic0Var.f27359e.f26791a;
                jb0 jb0Var = ic0Var.f27360f;
                if (((fc0) arrayList2.get(jb0Var.getCurrentPosition())).f26436a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((fc0) arrayList2.get(i11)).f26436a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (jb0Var.getCurrentPosition() != i10) {
                        jb0Var.E(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                cc0 cc0Var = (cc0) this.f33029b;
                cc0Var.f25324n.y(cc0Var.f25323f.T((View) obj));
                return;
            case 9:
                ee0 ee0Var = (ee0) this.f33029b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = ee0Var.h;
                if (ee0Var.getContext() != null) {
                    if (ee0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
                            float height = (ee0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        tr trVar = tr.h;
                        duration.setInterpolator(trVar).start();
                        ViewPropertyAnimator animate2 = ee0Var.I.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(trVar);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                bf0 bf0Var = (bf0) this.f33029b;
                bf0Var.K.a(bf0Var.N, true, 0, ((Long) obj).longValue());
                bf0Var.dismiss();
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f33029b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.i6.I.q()) {
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
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
                cz0 cz0Var = (cz0) this.f33029b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = cz0Var.f25478a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new ai.s5(cz0Var, userFull, tL_birthday, 13), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            default:
                c71 c71Var = (c71) this.f33029b;
                c71Var.f25245f3.Q(c71Var.T((View) obj), c71Var.j3);
                return;
        }
    }
}

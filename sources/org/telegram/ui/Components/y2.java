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
    public final int f34900a;
    public final Object f34901b;

    public y2(Object obj, int i10) {
        this.f34900a = i10;
        this.f34901b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f9;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f34900a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((bg.f) this.f34901b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                nh.g gVar = ((ed) this.f34901b).f18076f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((cm) this.f34901b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f28403b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((ls) this.f34901b).J).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((st) this.f34901b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f34901b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((y90) this.f34901b).R.Y0(((Integer) obj).intValue() + 8);
                return;
            case 7:
                rb0 rb0Var = (rb0) this.f34901b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = rb0Var.f32252e.f31633a;
                sa0 sa0Var = rb0Var.f32253f;
                if (((ob0) arrayList2.get(sa0Var.getCurrentPosition())).f31331a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((ob0) arrayList2.get(i11)).f31331a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (sa0Var.getCurrentPosition() != i10) {
                        sa0Var.D(i10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                nd0 nd0Var = (nd0) this.f34901b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = nd0Var.h;
                if (nd0Var.getContext() != null) {
                    if (nd0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
                            float height = (nd0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        jr jrVar = jr.h;
                        duration.setInterpolator(jrVar).start();
                        ViewPropertyAnimator animate2 = nd0Var.E.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(jrVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ke0 ke0Var = (ke0) this.f34901b;
                ke0Var.G.a(ke0Var.J, true, 0, ((Long) obj).longValue());
                ke0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f34901b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = 0.04f;
                } else {
                    f9 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f9);
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
            default:
                zx0 zx0Var = (zx0) this.f34901b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = zx0Var.f35443a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new eg.z(zx0Var, userFull, tL_birthday, 19), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
        }
    }
}

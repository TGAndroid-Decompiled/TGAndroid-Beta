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

    public final int f33254a;

    public final Object f33255b;

    public v2(Object obj, int i10) {
        this.f33254a = i10;
        this.f33255b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33254a) {
            case 0:
                ((cg.w1) this.f33255b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                lh.g gVar = ((xc) this.f33255b).f16338f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ul) this.f33255b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f34900b.dismiss();
                break;
            case 3:
                MessagesController.getInstance(((fs) this.f33255b).J).openApp((TLRPC.User) obj, 0);
                break;
            case 4:
                ((lt) this.f33255b).performMenuAction(((Integer) obj).intValue());
                break;
            case 5:
                Runnable runnable = (Runnable) this.f33255b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 6:
                ((o90) this.f33255b).R.Y0(((Integer) obj).intValue() + 8);
                break;
            case 7:
                gb0 gb0Var = (gb0) this.f33255b;
                Integer num = (Integer) obj;
                ArrayList arrayList = gb0Var.f28583e.f28004a;
                ia0 ia0Var = gb0Var.f28584f;
                if (((db0) arrayList.get(ia0Var.getCurrentPosition())).f27703a != num.intValue()) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (((db0) arrayList.get(i11)).f27703a == num.intValue()) {
                            i10 = i11;
                            if (ia0Var.getCurrentPosition() == i10) {
                                ia0Var.D(i10);
                                break;
                            }
                        }
                    }
                    if (ia0Var.getCurrentPosition() == i10) {
                        ia0Var.D(i10);
                        break;
                    }
                }
                break;
            case 8:
                dd0 dd0Var = (dd0) this.f33255b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = dd0Var.h;
                if (dd0Var.getContext() != null) {
                    boolean z10 = dd0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int iIntValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator duration = frameLayout.animate().translationY(iIntValue <= AndroidUtilities.dp(20.0f) ? 0.0f : (((dd0Var.getHeight() - iIntValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop()).setDuration(320L);
                        er erVar = er.h;
                        duration.setInterpolator(erVar).start();
                        dd0Var.E.animate().alpha(iIntValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar);
                    }
                    break;
                }
                break;
            case 9:
                be0 be0Var = (be0) this.f33255b;
                be0Var.G.b(be0Var.J, true, 0, ((Long) obj).longValue());
                be0Var.dismiss();
                break;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f33255b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.04f : -0.07f);
                Bitmap bitmapApplyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                bitmapApplyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.g6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap bitmapApplyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                bitmapApplyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(bitmapApplyColorMatrix, bitmapApplyColorMatrix2);
                break;
            default:
                qx0 qx0Var = (qx0) this.f33255b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i12 = qx0Var.f31991a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i12).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new cg.y(qx0Var, userFull, tL_birthday2, 21), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                break;
        }
    }
}

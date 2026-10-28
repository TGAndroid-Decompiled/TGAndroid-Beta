package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.json.JSONObject;
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
public final class b3 implements Utilities.Callback {
    public final int f26712a;
    public final Object f26713b;

    public b3(Object obj, int i10) {
        this.f26712a = i10;
        this.f26713b = obj;
    }

    private final void a(Object obj) {
        qa1 qa1Var = (qa1) this.f26713b;
        String str = (String) obj;
        synchronized (qa1Var.d) {
            qa1Var.d.add(str);
        }
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f26712a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((h2) this.f26713b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                fi.g gVar = ((jd) this.f26713b).f11198f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((tm) this.f26713b).v;
                chatAttachAlertPhotoLayout.s0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f30254b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((ct) this.f26713b).P).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((ju) this.f26713b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f26713b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                oc0 oc0Var = (oc0) this.f26713b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = oc0Var.e.f30495a;
                pb0 pb0Var = oc0Var.f31266f;
                if (((lc0) arrayList2.get(pb0Var.getCurrentPosition())).f30227a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((lc0) arrayList2.get(i11)).f30227a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (pb0Var.getCurrentPosition() != i10) {
                        pb0Var.E(i10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ic0 ic0Var = (ic0) this.f26713b;
                ic0Var.f29308n.y(ic0Var.f29307f.T((View) obj));
                return;
            case 8:
                me0 me0Var = (me0) this.f26713b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = me0Var.h;
                if (me0Var.getContext() != null) {
                    if (me0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
                            float height = (me0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        ds dsVar = ds.h;
                        duration.setInterpolator(dsVar).start();
                        ViewPropertyAnimator animate2 = me0Var.M.animate();
                        if (intValue > AndroidUtilities.dp(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(dsVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                kf0 kf0Var = (kf0) this.f26713b;
                kf0Var.K.a(kf0Var.N, true, 0, ((Long) obj).longValue());
                kf0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f26713b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    if (org.telegram.ui.ActionBar.y6.I.q()) {
                        f14 = -0.2f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 11:
                oz0 oz0Var = (oz0) this.f26713b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = oz0Var.f31403a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new bi.h2(oz0Var, userFull, tL_birthday, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            case 12:
                s71 s71Var = (s71) this.f26713b;
                s71Var.f32504g3.R(s71Var.T((View) obj), s71Var.f32508k3);
                return;
            case 13:
                a(obj);
                return;
            default:
                za1 za1Var = (za1) this.f26713b;
                String str = (String) obj;
                za1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    synchronized (za1Var.f35308f) {
                        za1Var.f35305a = jSONObject;
                        za1Var.f35308f.notifyAll();
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}

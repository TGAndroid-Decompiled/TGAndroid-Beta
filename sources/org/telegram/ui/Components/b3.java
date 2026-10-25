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
    public final int f26726a;
    public final Object f26727b;

    public b3(Object obj, int i10) {
        this.f26726a = i10;
        this.f26727b = obj;
    }

    private final void a(Object obj) {
        pa1 pa1Var = (pa1) this.f26727b;
        String str = (String) obj;
        synchronized (pa1Var.d) {
            pa1Var.d.add(str);
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
        switch (this.f26726a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((h2) this.f26727b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                fi.g gVar = ((jd) this.f26727b).f11199f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((tm) this.f26727b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f30213b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((ct) this.f26727b).P).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((ju) this.f26727b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.f26727b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                nc0 nc0Var = (nc0) this.f26727b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = nc0Var.e.f30163a;
                ob0 ob0Var = nc0Var.f30957f;
                if (((kc0) arrayList2.get(ob0Var.getCurrentPosition())).f29899a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((kc0) arrayList2.get(i11)).f29899a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (ob0Var.getCurrentPosition() != i10) {
                        ob0Var.E(i10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                hc0 hc0Var = (hc0) this.f26727b;
                hc0Var.f28919n.y(hc0Var.f28918f.T((View) obj));
                return;
            case 8:
                le0 le0Var = (le0) this.f26727b;
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
                        ds dsVar = ds.h;
                        duration.setInterpolator(dsVar).start();
                        ViewPropertyAnimator animate2 = le0Var.M.animate();
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
                jf0 jf0Var = (jf0) this.f26727b;
                jf0Var.K.a(jf0Var.N, true, 0, ((Long) obj).longValue());
                jf0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f26727b;
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
                nz0 nz0Var = (nz0) this.f26727b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = nz0Var.f31100a;
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
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new bi.h2(nz0Var, userFull, tL_birthday, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            case 12:
                r71 r71Var = (r71) this.f26727b;
                r71Var.f32150g3.R(r71Var.T((View) obj), r71Var.f32154k3);
                return;
            case 13:
                a(obj);
                return;
            default:
                ya1 ya1Var = (ya1) this.f26727b;
                String str = (String) obj;
                ya1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    synchronized (ya1Var.d) {
                        ya1Var.f34994a = jSONObject;
                        ya1Var.d.notifyAll();
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}

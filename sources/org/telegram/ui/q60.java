package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q60 extends org.telegram.ui.ActionBar.j {
    public final int f40329a;
    public final Object f40330b;

    public q60(Object obj, int i10) {
        this.f40329a = i10;
        this.f40330b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f40329a;
        Object obj = this.f40330b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((u60) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((w60) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((c70) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((e70) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((t70) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                cb0 cb0Var = (cb0) obj;
                if (i10 == -1) {
                    cb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(cb0Var.F);
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((sb0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                fg0 fg0Var = (fg0) obj;
                if (i10 == 1) {
                    fg0Var.p1();
                    return;
                } else if (i10 == -1 && fg0Var.onBackPressed(true)) {
                    fg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((ig0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((kh0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((lh0) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                wi0 wi0Var = (wi0) obj;
                if (i10 == -1) {
                    wi0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", wi0Var.f42889b);
                    wi0Var.presentFragment(new r91(bundle));
                    return;
                } else {
                    return;
                }
            case 13:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                xp0 xp0Var = (xp0) obj;
                if (i10 == -1) {
                    xp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (xp0Var.f43252c != null && !xp0Var.f43253f) {
                        vp0 vp0Var = xp0Var.d;
                        float f7 = vp0Var.f42268f - vp0Var.f42273x;
                        float f10 = vp0Var.v;
                        float f11 = (vp0Var.h - vp0Var.f42274y) / vp0Var.f42272w;
                        float f12 = vp0Var.d / f10;
                        float f13 = vp0Var.e / f10;
                        xp0 xp0Var2 = vp0Var.H;
                        int width = (int) ((f7 / f10) * xp0Var2.f43250a.getWidth());
                        int height = (int) (f11 * xp0Var2.f43250a.getHeight());
                        int width2 = (int) (f12 * xp0Var2.f43250a.getWidth());
                        int width3 = (int) (f13 * xp0Var2.f43250a.getWidth());
                        if (width < 0) {
                            i11 = 0;
                        } else {
                            i11 = width;
                        }
                        if (height < 0) {
                            i12 = 0;
                        } else {
                            i12 = height;
                        }
                        if (i11 + width2 > xp0Var2.f43250a.getWidth()) {
                            width2 = xp0Var2.f43250a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > xp0Var2.f43250a.getHeight()) {
                            width3 = xp0Var2.f43250a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(xp0Var2.f43250a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(xp0Var2.f43250a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == xp0Var.f43250a) {
                            xp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.e50) xp0Var.f43252c).r(false, bitmap, null);
                        xp0Var.f43253f = true;
                    }
                    xp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                lq0 lq0Var = (lq0) obj;
                if (i10 == -1) {
                    lq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = lq0Var.Y;
                    lq0Var.Y = !z10;
                    if (!z10) {
                        lq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        lq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    lq0Var.K.B0();
                    lq0Var.M.h1(0, 0);
                    lq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    kq0 kq0Var = lq0Var.f38935s0;
                    if (kq0Var != null) {
                        kq0Var.c();
                    }
                    lq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((qq0) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i16 = PopupNotificationActivity.f33480b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f33480b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 21:
                zv0 zv0Var = (zv0) obj;
                if (i10 == -1) {
                    if (zv0Var.onBackPressed(true)) {
                        zv0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    zv0Var.Y();
                    return;
                } else {
                    return;
                }
            case 22:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i10 == -1) {
                    if (privacyControlActivity.v0(true)) {
                        privacyControlActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    privacyControlActivity.z0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((mx0) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((w11) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((b21) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((t21) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

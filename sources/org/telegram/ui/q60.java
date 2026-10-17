package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q60 extends org.telegram.ui.ActionBar.j {
    public final int f40323a;
    public final Object f40324b;

    public q60(Object obj, int i10) {
        this.f40323a = i10;
        this.f40324b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f40323a;
        Object obj = this.f40324b;
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
                    bundle.putLong("chat_id", wi0Var.f42865b);
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
                wp0 wp0Var = (wp0) obj;
                if (i10 == -1) {
                    wp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (wp0Var.f42906c != null && !wp0Var.f42907f) {
                        up0 up0Var = wp0Var.d;
                        float f7 = up0Var.f42027f - up0Var.f42032x;
                        float f10 = up0Var.v;
                        float f11 = (up0Var.h - up0Var.f42033y) / up0Var.f42031w;
                        float f12 = up0Var.d / f10;
                        float f13 = up0Var.e / f10;
                        wp0 wp0Var2 = up0Var.H;
                        int width = (int) ((f7 / f10) * wp0Var2.f42904a.getWidth());
                        int height = (int) (f11 * wp0Var2.f42904a.getHeight());
                        int width2 = (int) (f12 * wp0Var2.f42904a.getWidth());
                        int width3 = (int) (f13 * wp0Var2.f42904a.getWidth());
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
                        if (i11 + width2 > wp0Var2.f42904a.getWidth()) {
                            width2 = wp0Var2.f42904a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > wp0Var2.f42904a.getHeight()) {
                            width3 = wp0Var2.f42904a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(wp0Var2.f42904a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(wp0Var2.f42904a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == wp0Var.f42904a) {
                            wp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.e50) wp0Var.f42906c).r(false, bitmap, null);
                        wp0Var.f42907f = true;
                    }
                    wp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                kq0 kq0Var = (kq0) obj;
                if (i10 == -1) {
                    kq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = kq0Var.Y;
                    kq0Var.Y = !z10;
                    if (!z10) {
                        kq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        kq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    kq0Var.K.B0();
                    kq0Var.M.h1(0, 0);
                    kq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    jq0 jq0Var = kq0Var.f38661s0;
                    if (jq0Var != null) {
                        jq0Var.g();
                    }
                    kq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((pq0) obj).finishFragment();
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
                    int i16 = PopupNotificationActivity.f33473b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f33473b0;
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

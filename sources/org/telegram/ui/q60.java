package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q60 extends org.telegram.ui.ActionBar.j {
    public final int f40287a;
    public final Object f40288b;

    public q60(Object obj, int i10) {
        this.f40287a = i10;
        this.f40288b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f40287a;
        Object obj = this.f40288b;
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
                eg0 eg0Var = (eg0) obj;
                if (i10 == 1) {
                    eg0Var.p1();
                    return;
                } else if (i10 == -1 && eg0Var.onBackPressed(true)) {
                    eg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((hg0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((jh0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((kh0) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                vi0 vi0Var = (vi0) obj;
                if (i10 == -1) {
                    vi0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", vi0Var.f42199b);
                    vi0Var.presentFragment(new r91(bundle));
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
                    if (xp0Var.f43214c != null && !xp0Var.f43215f) {
                        vp0 vp0Var = xp0Var.d;
                        float f7 = vp0Var.f42241f - vp0Var.f42246x;
                        float f10 = vp0Var.v;
                        float f11 = (vp0Var.h - vp0Var.f42247y) / vp0Var.f42245w;
                        float f12 = vp0Var.d / f10;
                        float f13 = vp0Var.e / f10;
                        xp0 xp0Var2 = vp0Var.H;
                        int width = (int) ((f7 / f10) * xp0Var2.f43212a.getWidth());
                        int height = (int) (f11 * xp0Var2.f43212a.getHeight());
                        int width2 = (int) (f12 * xp0Var2.f43212a.getWidth());
                        int width3 = (int) (f13 * xp0Var2.f43212a.getWidth());
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
                        if (i11 + width2 > xp0Var2.f43212a.getWidth()) {
                            width2 = xp0Var2.f43212a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > xp0Var2.f43212a.getHeight()) {
                            width3 = xp0Var2.f43212a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(xp0Var2.f43212a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(xp0Var2.f43212a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == xp0Var.f43212a) {
                            xp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.e50) xp0Var.f43214c).r(false, bitmap, null);
                        xp0Var.f43215f = true;
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
                    kq0 kq0Var = lq0Var.f38891s0;
                    if (kq0Var != null) {
                        kq0Var.g();
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

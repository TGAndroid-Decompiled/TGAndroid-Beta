package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q70 extends org.telegram.ui.ActionBar.j {
    public final int f39072a;
    public final Object f39073b;

    public q70(Object obj, int i10) {
        this.f39072a = i10;
        this.f39073b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f39072a;
        Object obj = this.f39073b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((s70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((y70) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((a80) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((p80) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                zb0 zb0Var = (zb0) obj;
                if (i10 == -1) {
                    zb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(zb0Var.F);
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((qc0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                ah0 ah0Var = (ah0) obj;
                if (i10 == 1) {
                    ah0Var.p1();
                    return;
                } else if (i10 == -1 && ah0Var.onBackPressed(true)) {
                    ah0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((dh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((di0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((ei0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                pj0 pj0Var = (pj0) obj;
                if (i10 == -1) {
                    pj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", pj0Var.f38948b);
                    pj0Var.presentFragment(new hb1(bundle));
                    return;
                } else {
                    return;
                }
            case 12:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                rq0 rq0Var = (rq0) obj;
                if (i10 == -1) {
                    rq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (rq0Var.f39573c != null && !rq0Var.f39574f) {
                        pq0 pq0Var = rq0Var.d;
                        float f7 = pq0Var.f38990f - pq0Var.f38995x;
                        float f10 = pq0Var.v;
                        float f11 = (pq0Var.h - pq0Var.f38996y) / pq0Var.f38994w;
                        float f12 = pq0Var.d / f10;
                        float f13 = pq0Var.e / f10;
                        rq0 rq0Var2 = pq0Var.H;
                        int width = (int) ((f7 / f10) * rq0Var2.f39571a.getWidth());
                        int height = (int) (f11 * rq0Var2.f39571a.getHeight());
                        int width2 = (int) (f12 * rq0Var2.f39571a.getWidth());
                        int width3 = (int) (f13 * rq0Var2.f39571a.getWidth());
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
                        if (i11 + width2 > rq0Var2.f39571a.getWidth()) {
                            width2 = rq0Var2.f39571a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > rq0Var2.f39571a.getHeight()) {
                            width3 = rq0Var2.f39571a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(rq0Var2.f39571a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(rq0Var2.f39571a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == rq0Var.f39571a) {
                            rq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.i50) rq0Var.f39573c).r(false, bitmap, null);
                        rq0Var.f39574f = true;
                    }
                    rq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 17:
                fr0 fr0Var = (fr0) obj;
                if (i10 == -1) {
                    fr0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = fr0Var.Y;
                    fr0Var.Y = !z10;
                    if (!z10) {
                        fr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        fr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    fr0Var.K.B0();
                    fr0Var.M.h1(0, 0);
                    fr0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    er0 er0Var = fr0Var.f35935s0;
                    if (er0Var != null) {
                        er0Var.g();
                    }
                    fr0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((kr0) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i16 = PopupNotificationActivity.f32135b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f32135b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 20:
                zw0 zw0Var = (zw0) obj;
                if (i10 == -1) {
                    if (zw0Var.onBackPressed(true)) {
                        zw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    zw0Var.Y();
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 22:
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
            case 23:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((my0) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((n31) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((s31) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((l41) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((t41) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

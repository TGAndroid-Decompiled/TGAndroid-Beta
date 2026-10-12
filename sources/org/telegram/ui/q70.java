package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q70 extends org.telegram.ui.ActionBar.j {
    public final int f39351a;
    public final Object f39352b;

    public q70(Object obj, int i10) {
        this.f39351a = i10;
        this.f39352b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f39351a;
        Object obj = this.f39352b;
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
                ac0 ac0Var = (ac0) obj;
                if (i10 == -1) {
                    ac0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ac0Var.F);
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((rc0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                bh0 bh0Var = (bh0) obj;
                if (i10 == 1) {
                    bh0Var.p1();
                    return;
                } else if (i10 == -1 && bh0Var.onBackPressed(true)) {
                    bh0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((eh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((ei0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((fi0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                qj0 qj0Var = (qj0) obj;
                if (i10 == -1) {
                    qj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", qj0Var.f39471b);
                    qj0Var.presentFragment(new hb1(bundle));
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
                tq0 tq0Var = (tq0) obj;
                if (i10 == -1) {
                    tq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (tq0Var.f40473c != null && !tq0Var.f40474f) {
                        rq0 rq0Var = tq0Var.d;
                        float f7 = rq0Var.f39849f - rq0Var.f39854x;
                        float f10 = rq0Var.v;
                        float f11 = (rq0Var.h - rq0Var.f39855y) / rq0Var.f39853w;
                        float f12 = rq0Var.d / f10;
                        float f13 = rq0Var.e / f10;
                        tq0 tq0Var2 = rq0Var.H;
                        int width = (int) ((f7 / f10) * tq0Var2.f40471a.getWidth());
                        int height = (int) (f11 * tq0Var2.f40471a.getHeight());
                        int width2 = (int) (f12 * tq0Var2.f40471a.getWidth());
                        int width3 = (int) (f13 * tq0Var2.f40471a.getWidth());
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
                        if (i11 + width2 > tq0Var2.f40471a.getWidth()) {
                            width2 = tq0Var2.f40471a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > tq0Var2.f40471a.getHeight()) {
                            width3 = tq0Var2.f40471a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(tq0Var2.f40471a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(tq0Var2.f40471a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == tq0Var.f40471a) {
                            tq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.i50) tq0Var.f40473c).r(false, bitmap, null);
                        tq0Var.f40474f = true;
                    }
                    tq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 17:
                hr0 hr0Var = (hr0) obj;
                if (i10 == -1) {
                    hr0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = hr0Var.Y;
                    hr0Var.Y = !z10;
                    if (!z10) {
                        hr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        hr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    hr0Var.K.B0();
                    hr0Var.M.h1(0, 0);
                    hr0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    gr0 gr0Var = hr0Var.f36937s0;
                    if (gr0Var != null) {
                        gr0Var.g();
                    }
                    hr0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((mr0) obj).finishFragment();
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
                    int i16 = PopupNotificationActivity.f32433b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f32433b0;
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

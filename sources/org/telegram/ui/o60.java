package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o60 extends org.telegram.ui.ActionBar.j {
    public final int f39787a;
    public final Object f39788b;

    public o60(Object obj, int i10) {
        this.f39787a = i10;
        this.f39788b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f39787a;
        Object obj = this.f39788b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((s60) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((u60) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((a70) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((c70) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((r70) obj).finishFragment();
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
                ab0 ab0Var = (ab0) obj;
                if (i10 == -1) {
                    ab0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ab0Var.F);
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((qb0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                dg0 dg0Var = (dg0) obj;
                if (i10 == 1) {
                    dg0Var.p1();
                    return;
                } else if (i10 == -1 && dg0Var.onBackPressed(true)) {
                    dg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((gg0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((ih0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((jh0) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                ui0 ui0Var = (ui0) obj;
                if (i10 == -1) {
                    ui0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ui0Var.f41990b);
                    ui0Var.presentFragment(new p91(bundle));
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
                vp0 vp0Var = (vp0) obj;
                if (i10 == -1) {
                    vp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (vp0Var.f42353c != null && !vp0Var.f42354f) {
                        tp0 tp0Var = vp0Var.d;
                        float f7 = tp0Var.f41721f - tp0Var.f41726x;
                        float f10 = tp0Var.v;
                        float f11 = (tp0Var.h - tp0Var.f41727y) / tp0Var.f41725w;
                        float f12 = tp0Var.d / f10;
                        float f13 = tp0Var.e / f10;
                        vp0 vp0Var2 = tp0Var.H;
                        int width = (int) ((f7 / f10) * vp0Var2.f42351a.getWidth());
                        int height = (int) (f11 * vp0Var2.f42351a.getHeight());
                        int width2 = (int) (f12 * vp0Var2.f42351a.getWidth());
                        int width3 = (int) (f13 * vp0Var2.f42351a.getWidth());
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
                        if (i11 + width2 > vp0Var2.f42351a.getWidth()) {
                            width2 = vp0Var2.f42351a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > vp0Var2.f42351a.getHeight()) {
                            width3 = vp0Var2.f42351a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(vp0Var2.f42351a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(vp0Var2.f42351a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == vp0Var.f42351a) {
                            vp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.e50) vp0Var.f42353c).r(false, bitmap, null);
                        vp0Var.f42354f = true;
                    }
                    vp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                jq0 jq0Var = (jq0) obj;
                if (i10 == -1) {
                    jq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = jq0Var.Y;
                    jq0Var.Y = !z10;
                    if (!z10) {
                        jq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        jq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    jq0Var.K.B0();
                    jq0Var.M.h1(0, 0);
                    jq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    iq0 iq0Var = jq0Var.f38328s0;
                    if (iq0Var != null) {
                        iq0Var.g();
                    }
                    jq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((oq0) obj).finishFragment();
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
                    int i16 = PopupNotificationActivity.f33489b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f33489b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 21:
                xv0 xv0Var = (xv0) obj;
                if (i10 == -1) {
                    if (xv0Var.onBackPressed(true)) {
                        xv0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    xv0Var.Y();
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
                    ((kx0) obj).finishFragment();
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
                    ((u11) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((z11) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((r21) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

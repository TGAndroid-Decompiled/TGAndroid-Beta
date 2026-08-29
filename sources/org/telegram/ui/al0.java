package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class al0 extends org.telegram.ui.ActionBar.k {
    public final int f36567a;
    public final Object f36568b;

    public al0(Object obj, int i10) {
        this.f36567a = i10;
        this.f36568b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f36567a;
        Object obj = this.f36568b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                kp0 kp0Var = (kp0) obj;
                if (i10 == -1) {
                    kp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (kp0Var.f39990c != null && !kp0Var.f39992f) {
                        ip0 ip0Var = kp0Var.d;
                        float f9 = ip0Var.f39308f - ip0Var.f39313x;
                        float f10 = ip0Var.v;
                        float f11 = (ip0Var.h - ip0Var.f39314y) / ip0Var.f39312w;
                        float f12 = ip0Var.d / f10;
                        float f13 = ip0Var.f39307e / f10;
                        kp0 kp0Var2 = ip0Var.D;
                        int width = (int) ((f9 / f10) * kp0Var2.f39988a.getWidth());
                        int height = (int) (f11 * kp0Var2.f39988a.getHeight());
                        int width2 = (int) (f12 * kp0Var2.f39988a.getWidth());
                        int width3 = (int) (f13 * kp0Var2.f39988a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > kp0Var2.f39988a.getWidth()) {
                            width2 = kp0Var2.f39988a.getWidth() - width;
                        }
                        if (height + width3 > kp0Var2.f39988a.getHeight()) {
                            width3 = kp0Var2.f39988a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(kp0Var2.f39988a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(kp0Var2.f39988a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == kp0Var.f39988a) {
                            kp0Var.f39991e = true;
                        }
                        ((org.telegram.ui.Components.s40) kp0Var.f39990c).s(false, bitmap, null);
                        kp0Var.f39992f = true;
                    }
                    kp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                zp0 zp0Var = (zp0) obj;
                if (i10 == -1) {
                    zp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = zp0Var.U;
                    zp0Var.U = !z10;
                    if (!z10) {
                        zp0Var.G.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        zp0Var.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    zp0Var.G.B0();
                    zp0Var.I.h1(0, 0);
                    zp0Var.H.l();
                    return;
                } else if (i10 == 2) {
                    yp0 yp0Var = zp0Var.f45290o0;
                    if (yp0Var != null) {
                        yp0Var.g();
                    }
                    zp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((eq0) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i12 = PopupNotificationActivity.X;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.X;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 5:
                pv0 pv0Var = (pv0) obj;
                if (i10 == -1) {
                    if (pv0Var.onBackPressed(true)) {
                        pv0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    pv0Var.Y();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 7:
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
            case 8:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((bx0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((c21) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((i21) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((b31) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                b81 b81Var = (b81) obj;
                if (i10 == -1) {
                    b81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    b81Var.l0(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((t91) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 20:
                vc1 vc1Var = (vc1) obj;
                if (i10 == -1) {
                    vc1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    vc1.Y(vc1Var);
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((md1) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((ff1) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.T >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 24:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i10 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    userInfoActivity.c0(true);
                    return;
                } else {
                    return;
                }
            case 25:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 26:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                if (i10 == -1) {
                    if (org.telegram.ui.web.d1.Y(d1Var).s()) {
                        org.telegram.ui.web.d1.Z(d1Var).r();
                        d1Var.f44003s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) d1Var.f31601a, (f5.d) new l4.x0(15));
                        return;
                    }
                    d1Var.finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((ph.r) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((ph.p2) obj).q();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((ph.x3) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

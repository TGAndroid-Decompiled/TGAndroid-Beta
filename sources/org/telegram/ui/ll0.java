package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final int f38692a;
    public final Object f38693b;

    public ll0(Object obj, int i10) {
        this.f38692a = i10;
        this.f38693b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f38692a;
        Object obj = this.f38693b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                zp0 zp0Var = (zp0) obj;
                if (i10 == -1) {
                    zp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (zp0Var.f43999c != null && !zp0Var.f44001f) {
                        xp0 xp0Var = zp0Var.d;
                        float f10 = xp0Var.f43428f - xp0Var.f43433x;
                        float f11 = xp0Var.v;
                        float f12 = (xp0Var.h - xp0Var.f43434y) / xp0Var.f43432w;
                        float f13 = xp0Var.d / f11;
                        float f14 = xp0Var.f43427e / f11;
                        zp0 zp0Var2 = xp0Var.E;
                        int width = (int) ((f10 / f11) * zp0Var2.f43997a.getWidth());
                        int height = (int) (f12 * zp0Var2.f43997a.getHeight());
                        int width2 = (int) (f13 * zp0Var2.f43997a.getWidth());
                        int width3 = (int) (f14 * zp0Var2.f43997a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > zp0Var2.f43997a.getWidth()) {
                            width2 = zp0Var2.f43997a.getWidth() - width;
                        }
                        if (height + width3 > zp0Var2.f43997a.getHeight()) {
                            width3 = zp0Var2.f43997a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(zp0Var2.f43997a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(zp0Var2.f43997a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == zp0Var.f43997a) {
                            zp0Var.f44000e = true;
                        }
                        ((org.telegram.ui.Components.y40) zp0Var.f43999c).s(false, bitmap, null);
                        zp0Var.f44001f = true;
                    }
                    zp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                mq0 mq0Var = (mq0) obj;
                if (i10 == -1) {
                    mq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z4 = mq0Var.V;
                    mq0Var.V = !z4;
                    if (!z4) {
                        mq0Var.H.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        mq0Var.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    mq0Var.H.B0();
                    mq0Var.J.h1(0, 0);
                    mq0Var.I.l();
                    return;
                } else if (i10 == 2) {
                    lq0 lq0Var = mq0Var.f39051p0;
                    if (lq0Var != null) {
                        lq0Var.d();
                    }
                    mq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((rq0) obj).finishFragment();
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
                    int i12 = PopupNotificationActivity.Y;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.Y;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 5:
                fw0 fw0Var = (fw0) obj;
                if (i10 == -1) {
                    if (fw0Var.onBackPressed(true)) {
                        fw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    fw0Var.Y();
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
                    ((tx0) obj).finishFragment();
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
                    ((w21) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((b31) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((t31) obj).finishFragment();
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
                v81 v81Var = (v81) obj;
                if (i10 == -1) {
                    v81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    v81Var.l0(new org.telegram.ui.ActionBar.p2(null));
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((na1) obj).finishFragment();
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
                od1 od1Var = (od1) obj;
                if (i10 == -1) {
                    od1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    od1.Y(od1Var);
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((he1) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((yf1) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.U >= 0) {
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
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) obj;
                if (i10 == -1) {
                    if (org.telegram.ui.web.f1.Y(f1Var).s()) {
                        org.telegram.ui.web.f1.Z(f1Var).r();
                        f1Var.f42502s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) f1Var.f25523a, (h5.d) new ag.d(17));
                        return;
                    }
                    f1Var.finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((sh.r) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((sh.p2) obj).q();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((sh.x3) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

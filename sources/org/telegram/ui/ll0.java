package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final int f38780a;
    public final Object f38781b;

    public ll0(Object obj, int i10) {
        this.f38780a = i10;
        this.f38781b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f38780a;
        Object obj = this.f38781b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                up0 up0Var = (up0) obj;
                if (i10 == -1) {
                    up0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (up0Var.f42005c != null && !up0Var.f42007f) {
                        sp0 sp0Var = up0Var.d;
                        float f10 = sp0Var.f41341f - sp0Var.f41346x;
                        float f11 = sp0Var.v;
                        float f12 = (sp0Var.h - sp0Var.f41347y) / sp0Var.f41345w;
                        float f13 = sp0Var.d / f11;
                        float f14 = sp0Var.f41340e / f11;
                        up0 up0Var2 = sp0Var.E;
                        int width = (int) ((f10 / f11) * up0Var2.f42003a.getWidth());
                        int height = (int) (f12 * up0Var2.f42003a.getHeight());
                        int width2 = (int) (f13 * up0Var2.f42003a.getWidth());
                        int width3 = (int) (f14 * up0Var2.f42003a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > up0Var2.f42003a.getWidth()) {
                            width2 = up0Var2.f42003a.getWidth() - width;
                        }
                        if (height + width3 > up0Var2.f42003a.getHeight()) {
                            width3 = up0Var2.f42003a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(up0Var2.f42003a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(up0Var2.f42003a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == up0Var.f42003a) {
                            up0Var.f42006e = true;
                        }
                        ((org.telegram.ui.Components.y40) up0Var.f42005c).s(false, bitmap, null);
                        up0Var.f42007f = true;
                    }
                    up0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                hq0 hq0Var = (hq0) obj;
                if (i10 == -1) {
                    hq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z4 = hq0Var.V;
                    hq0Var.V = !z4;
                    if (!z4) {
                        hq0Var.H.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        hq0Var.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    hq0Var.H.B0();
                    hq0Var.J.h1(0, 0);
                    hq0Var.I.l();
                    return;
                } else if (i10 == 2) {
                    gq0 gq0Var = hq0Var.f37591p0;
                    if (gq0Var != null) {
                        gq0Var.d();
                    }
                    hq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((mq0) obj).finishFragment();
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
                aw0 aw0Var = (aw0) obj;
                if (i10 == -1) {
                    if (aw0Var.onBackPressed(true)) {
                        aw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    aw0Var.Y();
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
                    ((ox0) obj).finishFragment();
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
                    ((q21) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((w21) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((p31) obj).finishFragment();
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
                p81 p81Var = (p81) obj;
                if (i10 == -1) {
                    p81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    p81Var.l0(new org.telegram.ui.ActionBar.p2(null));
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((ha1) obj).finishFragment();
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
                jd1 jd1Var = (jd1) obj;
                if (i10 == -1) {
                    jd1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    jd1.Y(jd1Var);
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((be1) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((sf1) obj).finishFragment();
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
                        f1Var.f42539s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) f1Var.f25815a, (h5.d) new ag.d(17));
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

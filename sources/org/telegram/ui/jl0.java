package org.telegram.ui;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class jl0 extends org.telegram.ui.ActionBar.j {
    public final int f35372a;
    public final Object f35373b;

    public jl0(Object obj, int i10) {
        this.f35372a = i10;
        this.f35373b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f35372a;
        Object obj = this.f35373b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                sp0 sp0Var = (sp0) obj;
                if (i10 == -1) {
                    sp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (sp0Var.f38421c != null && !sp0Var.f38422f) {
                        qp0 qp0Var = sp0Var.d;
                        float f10 = qp0Var.f37816f - qp0Var.f37821x;
                        float f11 = qp0Var.v;
                        float f12 = (qp0Var.h - qp0Var.f37822y) / qp0Var.f37820w;
                        float f13 = qp0Var.d / f11;
                        float f14 = qp0Var.e / f11;
                        sp0 sp0Var2 = qp0Var.E;
                        int width = (int) ((f10 / f11) * sp0Var2.f38419a.getWidth());
                        int height = (int) (f12 * sp0Var2.f38419a.getHeight());
                        int width2 = (int) (f13 * sp0Var2.f38419a.getWidth());
                        int width3 = (int) (f14 * sp0Var2.f38419a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > sp0Var2.f38419a.getWidth()) {
                            width2 = sp0Var2.f38419a.getWidth() - width;
                        }
                        if (height + width3 > sp0Var2.f38419a.getHeight()) {
                            width3 = sp0Var2.f38419a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(sp0Var2.f38419a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(sp0Var2.f38419a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == sp0Var.f38419a) {
                            sp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.w40) sp0Var.f38421c).s(false, bitmap, null);
                        sp0Var.f38422f = true;
                    }
                    sp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                fq0 fq0Var = (fq0) obj;
                if (i10 == -1) {
                    fq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z4 = fq0Var.V;
                    fq0Var.V = !z4;
                    if (!z4) {
                        fq0Var.H.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        fq0Var.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    fq0Var.H.B0();
                    fq0Var.J.h1(0, 0);
                    fq0Var.I.l();
                    return;
                } else if (i10 == 2) {
                    eq0 eq0Var = fq0Var.f34332p0;
                    if (eq0Var != null) {
                        eq0Var.c();
                    }
                    fq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((kq0) obj).finishFragment();
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
                yv0 yv0Var = (yv0) obj;
                if (i10 == -1) {
                    if (yv0Var.onBackPressed(true)) {
                        yv0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    yv0Var.Y();
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
                    ((mx0) obj).finishFragment();
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
                    ((o21) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((u21) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((n31) obj).finishFragment();
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
                o81 o81Var = (o81) obj;
                if (i10 == -1) {
                    o81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    o81Var.l0(new org.telegram.ui.ActionBar.p2(null));
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((ga1) obj).finishFragment();
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
                hd1 hd1Var = (hd1) obj;
                if (i10 == -1) {
                    hd1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    hd1.Y(hd1Var);
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((yd1) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((qf1) obj).finishFragment();
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
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                if (i10 == -1) {
                    if (org.telegram.ui.web.e1.Y(e1Var).s()) {
                        org.telegram.ui.web.e1.Z(e1Var).r();
                        e1Var.f39479s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) e1Var.f23580a, (h5.d) new nh.e(16));
                        return;
                    }
                    e1Var.finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((rh.s) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((rh.q2) obj).q();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((rh.y3) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

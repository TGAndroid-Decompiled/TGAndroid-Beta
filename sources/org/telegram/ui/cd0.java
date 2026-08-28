package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class cd0 extends org.telegram.ui.ActionBar.j {
    public final int f37170a;
    public final Object f37171b;

    public cd0(Object obj, int i9) {
        this.f37170a = i9;
        this.f37171b = obj;
    }

    @Override
    public final void b(int i9) {
        Bitmap bitmap;
        int i10 = this.f37170a;
        Object obj = this.f37171b;
        switch (i10) {
            case 0:
                fg0 fg0Var = (fg0) obj;
                if (i9 == 1) {
                    fg0Var.p1();
                    return;
                } else if (i9 == -1 && fg0Var.onBackPressed(true)) {
                    fg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 1:
                if (i9 == -1) {
                    ((hg0) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i9 == -1) {
                    ((hh0) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i9 == -1) {
                    ((ih0) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                ti0 ti0Var = (ti0) obj;
                if (i9 == -1) {
                    ti0Var.finishFragment();
                    return;
                } else if (i9 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ti0Var.f43012b);
                    ti0Var.presentFragment(new s91(bundle));
                    return;
                } else {
                    return;
                }
            case 5:
                if (i9 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i9 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i9 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i9 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                lp0 lp0Var = (lp0) obj;
                if (i9 == -1) {
                    lp0Var.finishFragment();
                    return;
                } else if (i9 == 1) {
                    if (lp0Var.f40206c != null && !lp0Var.f40208f) {
                        jp0 jp0Var = lp0Var.d;
                        float f10 = jp0Var.f39544f - jp0Var.f39549x;
                        float f11 = jp0Var.v;
                        float f12 = (jp0Var.h - jp0Var.f39550y) / jp0Var.f39548w;
                        float f13 = jp0Var.d / f11;
                        float f14 = jp0Var.f39543e / f11;
                        lp0 lp0Var2 = jp0Var.D;
                        int width = (int) ((f10 / f11) * lp0Var2.f40204a.getWidth());
                        int height = (int) (f12 * lp0Var2.f40204a.getHeight());
                        int width2 = (int) (f13 * lp0Var2.f40204a.getWidth());
                        int width3 = (int) (f14 * lp0Var2.f40204a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > lp0Var2.f40204a.getWidth()) {
                            width2 = lp0Var2.f40204a.getWidth() - width;
                        }
                        if (height + width3 > lp0Var2.f40204a.getHeight()) {
                            width3 = lp0Var2.f40204a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(lp0Var2.f40204a, width, height, width2, width3);
                        } catch (Throwable th) {
                            FileLog.e(th);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(lp0Var2.f40204a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                bitmap = null;
                            }
                        }
                        if (bitmap == lp0Var.f40204a) {
                            lp0Var.f40207e = true;
                        }
                        ((org.telegram.ui.Components.e40) lp0Var.f40206c).s(false, bitmap, null);
                        lp0Var.f40208f = true;
                    }
                    lp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 10:
                zp0 zp0Var = (zp0) obj;
                if (i9 == -1) {
                    zp0Var.finishFragment();
                    return;
                } else if (i9 == 1) {
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
                } else if (i9 == 2) {
                    yp0 yp0Var = zp0Var.f45225o0;
                    if (yp0Var != null) {
                        yp0Var.h();
                    }
                    zp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 11:
                if (i9 == -1) {
                    ((eq0) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i9 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i9 == 1) {
                    int i11 = PopupNotificationActivity.X;
                    popupNotificationActivity.k();
                    return;
                } else if (i9 == 2) {
                    int i12 = PopupNotificationActivity.X;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 13:
                pv0 pv0Var = (pv0) obj;
                if (i9 == -1) {
                    if (pv0Var.onBackPressed(true)) {
                        pv0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    pv0Var.X();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i9 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i9 == -1) {
                    if (privacyControlActivity.u0(true)) {
                        privacyControlActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    privacyControlActivity.y0();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i9 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i9 == -1) {
                    ((cx0) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i9 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i9 == -1) {
                    ((b21) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i9 == -1) {
                    ((h21) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i9 == -1) {
                    ((b31) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i9 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i9 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 24:
                if (i9 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                z71 z71Var = (z71) obj;
                if (i9 == -1) {
                    z71Var.finishFragment();
                    return;
                } else if (i9 == 2) {
                    z71Var.k0(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            case 26:
                if (i9 == -1) {
                    ((s91) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i9 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.c0(stickersActivity, i9);
                return;
            case 28:
                tc1 tc1Var = (tc1) obj;
                if (i9 == -1) {
                    tc1Var.finishFragment();
                    return;
                } else if (i9 == 1) {
                    tc1.X(tc1Var);
                    return;
                } else {
                    return;
                }
            default:
                if (i9 == -1) {
                    ((kd1) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

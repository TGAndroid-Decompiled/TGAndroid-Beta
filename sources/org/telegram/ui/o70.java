package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o70 extends org.telegram.ui.ActionBar.j {
    public final int f40570a;
    public final Object f40571b;

    public o70(Object obj, int i10) {
        this.f40570a = i10;
        this.f40571b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f40570a;
        Object obj = this.f40571b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((v70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((x70) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((n80) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                wb0 wb0Var = (wb0) obj;
                if (i10 == -1) {
                    wb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(wb0Var.F);
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((nc0) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                xg0 xg0Var = (xg0) obj;
                if (i10 == 1) {
                    xg0Var.p1();
                    return;
                } else if (i10 == -1 && xg0Var.onBackPressed(true)) {
                    xg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((ah0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((ai0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((bi0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                mj0 mj0Var = (mj0) obj;
                if (i10 == -1) {
                    mj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", mj0Var.f40063b);
                    mj0Var.presentFragment(new db1(bundle));
                    return;
                } else {
                    return;
                }
            case 11:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                pq0 pq0Var = (pq0) obj;
                if (i10 == -1) {
                    pq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (pq0Var.f41072c != null && !pq0Var.f41074f) {
                        nq0 nq0Var = pq0Var.d;
                        float f7 = nq0Var.f40458f - nq0Var.f40463x;
                        float f10 = nq0Var.v;
                        float f11 = (nq0Var.h - nq0Var.f40464y) / nq0Var.f40462w;
                        float f12 = nq0Var.d / f10;
                        float f13 = nq0Var.f40457e / f10;
                        pq0 pq0Var2 = nq0Var.H;
                        int width = (int) ((f7 / f10) * pq0Var2.f41070a.getWidth());
                        int height = (int) (f11 * pq0Var2.f41070a.getHeight());
                        int width2 = (int) (f12 * pq0Var2.f41070a.getWidth());
                        int width3 = (int) (f13 * pq0Var2.f41070a.getWidth());
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
                        if (i11 + width2 > pq0Var2.f41070a.getWidth()) {
                            width2 = pq0Var2.f41070a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > pq0Var2.f41070a.getHeight()) {
                            width3 = pq0Var2.f41070a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(pq0Var2.f41070a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(pq0Var2.f41070a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == pq0Var.f41070a) {
                            pq0Var.f41073e = true;
                        }
                        ((org.telegram.ui.Components.p50) pq0Var.f41072c).r(false, bitmap, null);
                        pq0Var.f41074f = true;
                    }
                    pq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                dr0 dr0Var = (dr0) obj;
                if (i10 == -1) {
                    dr0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = dr0Var.Y;
                    dr0Var.Y = !z10;
                    if (!z10) {
                        dr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        dr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    dr0Var.K.B0();
                    dr0Var.M.h1(0, 0);
                    dr0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    cr0 cr0Var = dr0Var.f36894s0;
                    if (cr0Var != null) {
                        cr0Var.g();
                    }
                    dr0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i10 == -1) {
                    ((ir0) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i16 = PopupNotificationActivity.f33951b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f33951b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 19:
                vw0 vw0Var = (vw0) obj;
                if (i10 == -1) {
                    if (vw0Var.onBackPressed(true)) {
                        vw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    vw0Var.Y();
                    return;
                } else {
                    return;
                }
            case 20:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 21:
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
            case 22:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((iy0) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((i31) obj).finishFragment();
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
                    ((h41) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((p41) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}

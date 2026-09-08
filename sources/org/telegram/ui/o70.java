package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class o70 extends org.telegram.ui.ActionBar.j {
    public final int f39153a;
    public final Object f39154b;

    public o70(Object obj, int i10) {
        this.f39153a = i10;
        this.f39154b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f39153a;
        Object obj = this.f39154b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((u70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((w70) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((l80) obj).finishFragment();
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
                xb0 xb0Var = (xb0) obj;
                if (i10 == -1) {
                    xb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(xb0Var.F);
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
                wg0 wg0Var = (wg0) obj;
                if (i10 == 1) {
                    wg0Var.p1();
                    return;
                } else if (i10 == -1 && wg0Var.onBackPressed(true)) {
                    wg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((yg0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((yh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((zh0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                lj0 lj0Var = (lj0) obj;
                if (i10 == -1) {
                    lj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", lj0Var.f38408b);
                    lj0Var.presentFragment(new bb1(bundle));
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
                nq0 nq0Var = (nq0) obj;
                if (i10 == -1) {
                    nq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (nq0Var.f39032c != null && !nq0Var.f39034f) {
                        lq0 lq0Var = nq0Var.d;
                        float f7 = lq0Var.f38488f - lq0Var.f38493x;
                        float f10 = lq0Var.v;
                        float f11 = (lq0Var.h - lq0Var.f38494y) / lq0Var.f38492w;
                        float f12 = lq0Var.d / f10;
                        float f13 = lq0Var.f38487e / f10;
                        nq0 nq0Var2 = lq0Var.H;
                        int width = (int) ((f7 / f10) * nq0Var2.f39030a.getWidth());
                        int height = (int) (f11 * nq0Var2.f39030a.getHeight());
                        int width2 = (int) (f12 * nq0Var2.f39030a.getWidth());
                        int width3 = (int) (f13 * nq0Var2.f39030a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > nq0Var2.f39030a.getWidth()) {
                            width2 = nq0Var2.f39030a.getWidth() - width;
                        }
                        if (height + width3 > nq0Var2.f39030a.getHeight()) {
                            width3 = nq0Var2.f39030a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(nq0Var2.f39030a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(nq0Var2.f39030a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == nq0Var.f39030a) {
                            nq0Var.f39033e = true;
                        }
                        ((org.telegram.ui.Components.u40) nq0Var.f39032c).s(false, bitmap, null);
                        nq0Var.f39034f = true;
                    }
                    nq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                br0 br0Var = (br0) obj;
                if (i10 == -1) {
                    br0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = br0Var.Y;
                    br0Var.Y = !z10;
                    if (!z10) {
                        br0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        br0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    br0Var.K.B0();
                    br0Var.M.h1(0, 0);
                    br0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    ar0 ar0Var = br0Var.f34933s0;
                    if (ar0Var != null) {
                        ar0Var.g();
                    }
                    br0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i10 == -1) {
                    ((gr0) obj).finishFragment();
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
                    int i12 = PopupNotificationActivity.f33784b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f33784b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 19:
                tw0 tw0Var = (tw0) obj;
                if (i10 == -1) {
                    if (tw0Var.onBackPressed(true)) {
                        tw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    tw0Var.Y();
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
                    ((hy0) obj).finishFragment();
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
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
        }
    }
}

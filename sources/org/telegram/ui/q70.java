package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class q70 extends org.telegram.ui.ActionBar.j {
    public final int f36794a;
    public final Object f36795b;

    public q70(Object obj, int i10) {
        this.f36794a = i10;
        this.f36795b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f36794a;
        Object obj = this.f36795b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((r70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((g80) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                rb0 rb0Var = (rb0) obj;
                if (i10 == -1) {
                    rb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(rb0Var.F);
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((hc0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                qg0 qg0Var = (qg0) obj;
                if (i10 == 1) {
                    qg0Var.p1();
                    return;
                } else if (i10 == -1 && qg0Var.onBackPressed(true)) {
                    qg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((sg0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((sh0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((th0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                ej0 ej0Var = (ej0) obj;
                if (i10 == -1) {
                    ej0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ej0Var.f33403b);
                    ej0Var.presentFragment(new sa1(bundle));
                    return;
                } else {
                    return;
                }
            case 10:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                fq0 fq0Var = (fq0) obj;
                if (i10 == -1) {
                    fq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (fq0Var.f33729c != null && !fq0Var.f33730f) {
                        dq0 dq0Var = fq0Var.d;
                        float f7 = dq0Var.f33147f - dq0Var.f33152x;
                        float f10 = dq0Var.v;
                        float f11 = (dq0Var.h - dq0Var.f33153y) / dq0Var.f33151w;
                        float f12 = dq0Var.d / f10;
                        float f13 = dq0Var.e / f10;
                        fq0 fq0Var2 = dq0Var.H;
                        int width = (int) ((f7 / f10) * fq0Var2.f33727a.getWidth());
                        int height = (int) (f11 * fq0Var2.f33727a.getHeight());
                        int width2 = (int) (f12 * fq0Var2.f33727a.getWidth());
                        int width3 = (int) (f13 * fq0Var2.f33727a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > fq0Var2.f33727a.getWidth()) {
                            width2 = fq0Var2.f33727a.getWidth() - width;
                        }
                        if (height + width3 > fq0Var2.f33727a.getHeight()) {
                            width3 = fq0Var2.f33727a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(fq0Var2.f33727a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(fq0Var2.f33727a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == fq0Var.f33727a) {
                            fq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.v40) fq0Var.f33729c).s(false, bitmap, null);
                        fq0Var.f33730f = true;
                    }
                    fq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 15:
                tq0 tq0Var = (tq0) obj;
                if (i10 == -1) {
                    tq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = tq0Var.Y;
                    tq0Var.Y = !z10;
                    if (!z10) {
                        tq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        tq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    tq0Var.K.B0();
                    tq0Var.M.h1(0, 0);
                    tq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    sq0 sq0Var = tq0Var.f38195s0;
                    if (sq0Var != null) {
                        sq0Var.g();
                    }
                    tq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((yq0) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i12 = PopupNotificationActivity.f31415b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f31415b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 18:
                kw0 kw0Var = (kw0) obj;
                if (i10 == -1) {
                    if (kw0Var.onBackPressed(true)) {
                        kw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    kw0Var.Y();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 20:
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
            case 21:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((yx0) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((y21) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((d31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((w31) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((f41) obj).finishFragment();
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

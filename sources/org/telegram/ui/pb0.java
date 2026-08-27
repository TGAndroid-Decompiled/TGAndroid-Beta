package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

public final class pb0 extends org.telegram.ui.ActionBar.j {

    public final int f41319a;

    public final Object f41320b;

    public pb0(Object obj, int i10) {
        this.f41319a = i10;
        this.f41320b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmapCreateBitmap;
        int i11 = this.f41319a;
        Object obj = this.f41320b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((xb0) obj).finishFragment();
                }
                break;
            case 1:
                ig0 ig0Var = (ig0) obj;
                if (i10 == 1) {
                    ig0Var.p1();
                    break;
                } else if (i10 == -1 && ig0Var.onBackPressed(true)) {
                    ig0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((kg0) obj).finishFragment();
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((kh0) obj).finishFragment();
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((lh0) obj).finishFragment();
                }
                break;
            case 5:
                vi0 vi0Var = (vi0) obj;
                if (i10 == -1) {
                    vi0Var.finishFragment();
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", vi0Var.f43469b);
                    vi0Var.presentFragment(new q91(bundle));
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                }
                break;
            case 10:
                mp0 mp0Var = (mp0) obj;
                if (i10 == -1) {
                    mp0Var.finishFragment();
                } else if (i10 == 1) {
                    if (mp0Var.f40577c != null && !mp0Var.f40579f) {
                        kp0 kp0Var = mp0Var.d;
                        float f10 = kp0Var.f39824f - kp0Var.f39829x;
                        float f11 = kp0Var.v;
                        float f12 = (kp0Var.h - kp0Var.f39830y) / kp0Var.f39828w;
                        float f13 = kp0Var.d / f11;
                        float f14 = kp0Var.f39823e / f11;
                        mp0 mp0Var2 = kp0Var.D;
                        int width = (int) ((f10 / f11) * mp0Var2.f40575a.getWidth());
                        int height = (int) (f12 * mp0Var2.f40575a.getHeight());
                        int width2 = (int) (f13 * mp0Var2.f40575a.getWidth());
                        int width3 = (int) (f14 * mp0Var2.f40575a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > mp0Var2.f40575a.getWidth()) {
                            width2 = mp0Var2.f40575a.getWidth() - width;
                        }
                        if (height + width3 > mp0Var2.f40575a.getHeight()) {
                            width3 = mp0Var2.f40575a.getHeight() - height;
                        }
                        try {
                            bitmapCreateBitmap = Bitmaps.createBitmap(mp0Var2.f40575a, width, height, width2, width3);
                        } catch (Throwable th) {
                            FileLog.e(th);
                            System.gc();
                            try {
                                bitmapCreateBitmap = Bitmaps.createBitmap(mp0Var2.f40575a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                bitmapCreateBitmap = null;
                            }
                        }
                        if (bitmapCreateBitmap == mp0Var.f40575a) {
                            mp0Var.f40578e = true;
                        }
                        ((org.telegram.ui.Components.j40) mp0Var.f40577c).s(false, bitmapCreateBitmap, null);
                        mp0Var.f40579f = true;
                    }
                    mp0Var.finishFragment();
                }
                break;
            case 11:
                aq0 aq0Var = (aq0) obj;
                if (i10 == -1) {
                    aq0Var.finishFragment();
                } else if (i10 == 1) {
                    boolean z10 = aq0Var.U;
                    aq0Var.U = !z10;
                    if (z10) {
                        aq0Var.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    } else {
                        aq0Var.G.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    }
                    aq0Var.G.B0();
                    aq0Var.I.h1(0, 0);
                    aq0Var.H.l();
                } else if (i10 == 2) {
                    zp0 zp0Var = aq0Var.f36615o0;
                    if (zp0Var != null) {
                        zp0Var.h();
                    }
                    aq0Var.finishFragment();
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((fq0) obj).finishFragment();
                }
                break;
            case 13:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                } else if (i10 == 1) {
                    int i12 = PopupNotificationActivity.X;
                    popupNotificationActivity.k();
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.X;
                    popupNotificationActivity.p();
                }
                break;
            case 14:
                qv0 qv0Var = (qv0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qv0Var.Y();
                    }
                } else if (qv0Var.onBackPressed(true)) {
                    qv0Var.finishFragment();
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                }
                break;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        privacyControlActivity.z0();
                    }
                } else if (privacyControlActivity.v0(true)) {
                    privacyControlActivity.finishFragment();
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((cx0) obj).finishFragment();
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((a21) obj).finishFragment();
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((g21) obj).finishFragment();
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((a31) obj).finishFragment();
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                }
                break;
            case 26:
                x71 x71Var = (x71) obj;
                if (i10 == -1) {
                    x71Var.finishFragment();
                } else if (i10 == 2) {
                    x71Var.l0(new kg0(null));
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((q91) obj).finishFragment();
                }
                break;
            case 28:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                }
                break;
            default:
                tc1 tc1Var = (tc1) obj;
                if (i10 == -1) {
                    tc1Var.finishFragment();
                } else if (i10 == 1) {
                    tc1.Y(tc1Var);
                }
                break;
        }
    }
}

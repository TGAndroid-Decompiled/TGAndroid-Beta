package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p2 implements org.telegram.messenger.u10 {
    public final int f37032a;
    public final Object f37033b;

    public p2(Object obj, int i3) {
        this.f37032a = i3;
        this.f37033b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f37032a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((o2) this.f37033b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                gi.g gVar = ((sc) this.f37033b).f13144f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((sl) this.f37033b).f38055w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f38416b.dismiss();
                return;
            case 3:
                org.telegram.messenger.hp.s1(((vr) this.f37033b).Q).x3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f37033b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((xs) this.f37033b).G(((Integer) obj).intValue());
                return;
            case 6:
                da0 da0Var = (da0) this.f37033b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = da0Var.f33036e.f32143a;
                j90 j90Var = da0Var.f33037f;
                if (((aa0) arrayList2.get(j90Var.getCurrentPosition())).f31781a != num.intValue()) {
                    int i3 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((aa0) arrayList2.get(i10)).f31781a == num.intValue()) {
                                i3 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (j90Var.getCurrentPosition() != i3) {
                        j90Var.D(i3);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                x90 x90Var = (x90) this.f37033b;
                x90Var.f40294n.y(x90Var.f40293f.T((View) obj));
                return;
            case 8:
                zb0 zb0Var = (zb0) this.f37033b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = zb0Var.h;
                if (zb0Var.getContext() != null) {
                    if (zb0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.g0.f22603n;
                    if (org.telegram.messenger.az.f21658r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (zb0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        xq xqVar = xq.h;
                        duration.setInterpolator(xqVar).start();
                        ViewPropertyAnimator animate2 = zb0Var.N.animate();
                        if (intValue > org.telegram.messenger.g0.L(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(xqVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                vc0 vc0Var = (vc0) this.f37033b;
                vc0Var.C1.a(vc0Var.F1, true, 0, ((Long) obj).longValue());
                vc0Var.dismiss();
                return;
            case 10:
                org.telegram.messenger.n10 n10Var = (org.telegram.messenger.n10) this.f37033b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        f15 = -0.2f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f15);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                n10Var.a(l10, l11);
                return;
            case 11:
                iw0 iw0Var = (iw0) this.f37033b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = iw0Var.f34837a;
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(i11).b2(org.telegram.messenger.h10.i(i11).e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                    org.telegram.messenger.qr.a0(i11).j2(b22, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new ai.r6(iw0Var, b22, tL_birthday, 19), 1024);
                org.telegram.messenger.hp.s1(i11).m2();
                org.telegram.messenger.hp.s1(i11).k4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.hs.f(i11).k(107, new Object[0]);
                return;
            default:
                l41 l41Var = (l41) this.f37033b;
                l41Var.f35594g3.R(l41Var.T((View) obj), l41Var.f35597k3);
                return;
        }
    }
}

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
public final class s2 implements org.telegram.messenger.c20 {
    public final int f37882a;
    public final Object f37883b;

    public s2(Object obj, int i7) {
        this.f37882a = i7;
        this.f37883b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f37882a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f37883b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                fi.g gVar = ((uc) this.f37883b).f12366f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((tl) this.f37883b).f38450w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f39071b.dismiss();
                return;
            case 3:
                org.telegram.messenger.qp.s1(((vr) this.f37883b).P).x3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f37883b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((zs) this.f37883b).G(((Integer) obj).intValue());
                return;
            case 6:
                ja0 ja0Var = (ja0) this.f37883b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ja0Var.f34973e.f34259a;
                o90 o90Var = ja0Var.f34974f;
                if (((ga0) arrayList2.get(o90Var.getCurrentPosition())).f33914a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((ga0) arrayList2.get(i10)).f33914a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (o90Var.getCurrentPosition() != i7) {
                        o90Var.E(i7);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                da0 da0Var = (da0) this.f37883b;
                da0Var.f32923n.y(da0Var.f32922f.T((View) obj));
                return;
            case 8:
                fc0 fc0Var = (fc0) this.f37883b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = fc0Var.h;
                if (fc0Var.getContext() != null) {
                    if (fc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.g0.f22558n;
                    if (org.telegram.messenger.iz.f23431r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (fc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z9) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        xq xqVar = xq.h;
                        duration.setInterpolator(xqVar).start();
                        ViewPropertyAnimator animate2 = fc0Var.M.animate();
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
                bd0 bd0Var = (bd0) this.f37883b;
                bd0Var.B1.a(bd0Var.E1, true, 0, ((Long) obj).longValue());
                bd0Var.dismiss();
                return;
            case 10:
                org.telegram.messenger.v10 v10Var = (org.telegram.messenger.v10) this.f37883b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.l6.I.q()) {
                    if (org.telegram.ui.ActionBar.l6.I.q()) {
                        f15 = -0.2f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f15);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                v10Var.a(l10, l11);
                return;
            case 11:
                kw0 kw0Var = (kw0) this.f37883b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = kw0Var.f35493a;
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i11).b2(org.telegram.messenger.p10.i(i11).e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                    org.telegram.messenger.yr.a0(i11).j2(b22, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.f2(kw0Var, b22, tL_birthday, 18), 1024);
                org.telegram.messenger.qp.s1(i11).m2();
                org.telegram.messenger.qp.s1(i11).k4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.qs.f(i11).k(107, new Object[0]);
                return;
            default:
                r41 r41Var = (r41) this.f37883b;
                r41Var.f37556f3.R(r41Var.T((View) obj), r41Var.j3);
                return;
        }
    }
}

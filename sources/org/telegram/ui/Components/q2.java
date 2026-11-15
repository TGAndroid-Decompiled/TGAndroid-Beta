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
public final class q2 implements org.telegram.messenger.z10 {
    public final int f38473a;
    public final Object f38474b;

    public q2(Object obj, int i7) {
        this.f38473a = i7;
        this.f38474b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f38473a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((a2) this.f38474b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.g gVar = ((pc) this.f38474b).f14623f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ((hi.g7) this.f38474b).a((ai.h) obj);
                return;
            case 3:
                ((ji.p) this.f38474b).setEditMenuProgress(((Float) obj).floatValue());
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((am) this.f38474b).f33020w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f33607b.dismiss();
                return;
            case 5:
                org.telegram.messenger.np.s1(((bs) this.f38474b).Q).x3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f38474b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((ft) this.f38474b).H(((Integer) obj).intValue());
                return;
            case 8:
                ja0 ja0Var = (ja0) this.f38474b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ja0Var.f35951e.f35208a;
                p90 p90Var = ja0Var.f35952f;
                if (((ga0) arrayList2.get(p90Var.getCurrentPosition())).f34876a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((ga0) arrayList2.get(i10)).f34876a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (p90Var.getCurrentPosition() != i7) {
                        p90Var.C(i7);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                da0 da0Var = (da0) this.f38474b;
                da0Var.f33903n.y(da0Var.f33902f.T((View) obj));
                return;
            case 10:
                fc0 fc0Var = (fc0) this.f38474b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = fc0Var.h;
                if (fc0Var.getContext() != null) {
                    if (fc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.g0.f23604n;
                    if (org.telegram.messenger.gz.f23975r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (fc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        er erVar = er.h;
                        duration.setInterpolator(erVar).start();
                        ViewPropertyAnimator animate2 = fc0Var.N.animate();
                        if (intValue > org.telegram.messenger.g0.L(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(erVar);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                bd0 bd0Var = (bd0) this.f38474b;
                bd0Var.F1.a(bd0Var.I1, true, 0, ((Long) obj).longValue());
                bd0Var.dismiss();
                return;
            case 12:
                org.telegram.messenger.s10 s10Var = (org.telegram.messenger.s10) this.f38474b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        f15 = -0.2f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f15);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                s10Var.a(l10, l11);
                return;
            case 13:
                mw0 mw0Var = (mw0) this.f38474b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = mw0Var.f37390a;
                TLRPC.UserFull b22 = org.telegram.messenger.np.s1(i11).b2(org.telegram.messenger.m10.i(i11).e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                    org.telegram.messenger.vr.a0(i11).j2(b22, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.j6(mw0Var, b22, tL_birthday, 19), 1024);
                org.telegram.messenger.np.s1(i11).m2();
                org.telegram.messenger.np.s1(i11).k4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ns.f(i11).k(107, new Object[0]);
                return;
            default:
                u41 u41Var = (u41) this.f38474b;
                u41Var.f39895g3.R(u41Var.T((View) obj), u41Var.f39898k3);
                return;
        }
    }
}

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
public final class y2 implements org.telegram.messenger.x10 {
    public final int f42272a;
    public final Object f42273b;

    public y2(Object obj, int i7) {
        this.f42272a = i7;
        this.f42273b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f42272a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((org.telegram.ui.ii) this.f42273b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.g gVar = ((yc) this.f42273b).f15051f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ((hi.t6) this.f42273b).a((ai.g) obj);
                return;
            case 3:
                ((ji.p) this.f42273b).setEditMenuProgress(((Float) obj).floatValue());
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((hm) this.f42273b).f35930w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f36766b.dismiss();
                return;
            case 5:
                org.telegram.messenger.mp.u1(((is) this.f42273b).Q).E3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f42273b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((mt) this.f42273b).H(((Integer) obj).intValue());
                return;
            case 8:
                ua0 ua0Var = (ua0) this.f42273b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ua0Var.f40280e.f39546a;
                aa0 aa0Var = ua0Var.f40281f;
                if (((ra0) arrayList2.get(aa0Var.getCurrentPosition())).f39081a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((ra0) arrayList2.get(i10)).f39081a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (aa0Var.getCurrentPosition() != i7) {
                        aa0Var.A(i7);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                oa0 oa0Var = (oa0) this.f42273b;
                oa0Var.f38048n.y(oa0Var.f38047f.T((View) obj));
                return;
            case 10:
                pc0 pc0Var = (pc0) this.f42273b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = pc0Var.h;
                if (pc0Var.getContext() != null) {
                    if (pc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.g0.f24116n;
                    if (org.telegram.messenger.bz.f23194r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (pc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        lr lrVar = lr.h;
                        duration.setInterpolator(lrVar).start();
                        ViewPropertyAnimator animate2 = pc0Var.N.animate();
                        if (intValue > org.telegram.messenger.g0.L(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(lrVar);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ld0 ld0Var = (ld0) this.f42273b;
                ld0Var.F1.a(ld0Var.I1, true, 0, ((Long) obj).longValue());
                ld0Var.dismiss();
                return;
            case 12:
                org.telegram.messenger.q10 q10Var = (org.telegram.messenger.q10) this.f42273b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    if (org.telegram.ui.ActionBar.n6.I.q()) {
                        f15 = -0.2f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f15);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                q10Var.a(l10, l11);
                return;
            case 13:
                tw0 tw0Var = (tw0) this.f42273b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = tw0Var.f40113a;
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i11).d2(org.telegram.messenger.j10.i(i11).e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                    org.telegram.messenger.tr.a0(i11).j2(d2, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.m1(tw0Var, d2, tL_birthday, 21), 1024);
                org.telegram.messenger.mp.u1(i11).o2();
                org.telegram.messenger.mp.u1(i11).s4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ks.f(i11).k(107, new Object[0]);
                return;
            default:
                e51 e51Var = (e51) this.f42273b;
                e51Var.f34607g3.R(e51Var.T((View) obj), e51Var.f34610k3);
                return;
        }
    }
}

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
public final class y2 implements org.telegram.messenger.w10 {
    public final int f42306a;
    public final Object f42307b;

    public y2(Object obj, int i7) {
        this.f42306a = i7;
        this.f42307b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f42306a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((org.telegram.ui.ii) this.f42307b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.h hVar = ((yc) this.f42307b).f14936f;
                hVar.setText(charSequence);
                hVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ((ji.q) this.f42307b).setEditMenuProgress(((Float) obj).floatValue());
                return;
            case 3:
                ((hi.c7) this.f42307b).a((ai.c) obj);
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((hm) this.f42307b).f35771w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f37135b.dismiss();
                return;
            case 5:
                org.telegram.messenger.mp.u1(((hs) this.f42307b).Q).E3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f42307b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((mt) this.f42307b).H(((Integer) obj).intValue());
                return;
            case 8:
                ta0 ta0Var = (ta0) this.f42307b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ta0Var.f39884e.f39258a;
                z90 z90Var = ta0Var.f39885f;
                if (((qa0) arrayList2.get(z90Var.getCurrentPosition())).f38750a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((qa0) arrayList2.get(i10)).f38750a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (z90Var.getCurrentPosition() != i7) {
                        z90Var.C(i7);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                na0 na0Var = (na0) this.f42307b;
                na0Var.f37745n.y(na0Var.f37744f.T((View) obj));
                return;
            case 10:
                oc0 oc0Var = (oc0) this.f42307b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = oc0Var.h;
                if (oc0Var.getContext() != null) {
                    if (oc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.g0.f24221n;
                    if (org.telegram.messenger.bz.f23316r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (oc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        kr krVar = kr.h;
                        duration.setInterpolator(krVar).start();
                        ViewPropertyAnimator animate2 = oc0Var.N.animate();
                        if (intValue > org.telegram.messenger.g0.L(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(krVar);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                kd0 kd0Var = (kd0) this.f42307b;
                kd0Var.F1.a(kd0Var.I1, true, 0, ((Long) obj).longValue());
                kd0Var.dismiss();
                return;
            case 12:
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.f42307b;
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
                p10Var.a(l10, l11);
                return;
            case 13:
                uw0 uw0Var = (uw0) this.f42307b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = uw0Var.f40480a;
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i11).d2(org.telegram.messenger.i10.i(i11).e());
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
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.q1(uw0Var, d2, tL_birthday, 21), 1024);
                org.telegram.messenger.mp.u1(i11).o2();
                org.telegram.messenger.mp.u1(i11).s4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ks.f(i11).k(107, new Object[0]);
                return;
            default:
                g51 g51Var = (g51) this.f42307b;
                g51Var.f35323g3.R(g51Var.T((View) obj), g51Var.f35326k3);
                return;
        }
    }
}

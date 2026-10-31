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
public final class r2 implements org.telegram.messenger.q20 {
    public final int f29801a;
    public final Object f29802b;

    public r2(Object obj, int i10) {
        this.f29801a = i10;
        this.f29802b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float top;
        float f7;
        float f10;
        float f11;
        TL_account.TL_birthday tL_birthday;
        switch (this.f29801a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((ag.d3) this.f29802b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                vh.f fVar = ((nc) this.f29802b).f51340f;
                fVar.setText(charSequence);
                fVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bm) this.f29802b).f24837w;
                chatAttachAlertPhotoLayout.s0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f30947b.dismiss();
                return;
            case 3:
                org.telegram.messenger.vp.r1(((gs) this.f29802b).P).u3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f29802b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((mt) this.f29802b).G(((Integer) obj).intValue());
                return;
            case 6:
                ab0 ab0Var = (ab0) this.f29802b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = ab0Var.e.f32677a;
                fa0 fa0Var = ab0Var.f24355f;
                if (((xa0) arrayList2.get(fa0Var.getCurrentPosition())).f32452a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList2.size()) {
                            if (((xa0) arrayList2.get(i11)).f32452a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (fa0Var.getCurrentPosition() != i10) {
                        fa0Var.E(i10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ua0 ua0Var = (ua0) this.f29802b;
                ua0Var.f30883n.y(ua0Var.f30882f.T((View) obj));
                return;
            case 8:
                zc0 zc0Var = (zc0) this.f29802b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = zc0Var.h;
                if (zc0Var.getContext() != null) {
                    if (zc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.i0.f16021n;
                    if (org.telegram.messenger.tz.f18177r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f12 = 1.0f;
                        if (intValue <= org.telegram.messenger.i0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f13 = 2.0f;
                            float height = (zc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f13 = 1.0f;
                            }
                            top = (height - (height2 / f13)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        gr grVar = gr.h;
                        duration.setInterpolator(grVar).start();
                        ViewPropertyAnimator animate2 = zc0Var.M.animate();
                        if (intValue > org.telegram.messenger.i0.L(20.0f)) {
                            f12 = 0.0f;
                        }
                        animate2.alpha(f12).setDuration(320L).setInterpolator(grVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                vd0 vd0Var = (vd0) this.f29802b;
                vd0Var.B1.a(vd0Var.E1, true, 0, ((Long) obj).longValue());
                vd0Var.dismiss();
                return;
            case 10:
                org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) this.f29802b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                org.telegram.messenger.i0.i(colorMatrix, f7);
                float f14 = -0.07f;
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f10);
                Bitmap l4 = org.telegram.messenger.i0.l(bitmap, colorMatrix);
                l4.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (!org.telegram.ui.ActionBar.t6.I.q()) {
                    if (org.telegram.ui.ActionBar.t6.I.q()) {
                        f14 = -0.2f;
                    }
                    org.telegram.messenger.i0.h(colorMatrix2, f14);
                }
                Bitmap l10 = org.telegram.messenger.i0.l(bitmap, colorMatrix2);
                l10.setHasAlpha(false);
                bitmap.recycle();
                j20Var.a(l4, l10);
                return;
            case 11:
                nx0 nx0Var = (nx0) this.f29802b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i12 = nx0Var.f28904a;
                TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i12).a2(org.telegram.messenger.d20.i(i12).e());
                if (a2 != null) {
                    tL_birthday = a2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday2;
                    org.telegram.messenger.hs.a0(i12).j2(a2, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new ag.p0(nx0Var, a2, tL_birthday, 14), 1024);
                org.telegram.messenger.vp.r1(i12).l2();
                org.telegram.messenger.vp.r1(i12).h4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.zs.f(i12).k(107, new Object[0]);
                return;
            default:
                u51 u51Var = (u51) this.f29802b;
                u51Var.f30819f3.R(u51Var.T((View) obj), u51Var.f30823j3);
                return;
        }
    }
}

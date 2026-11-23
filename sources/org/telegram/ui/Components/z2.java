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
public final class z2 implements org.telegram.messenger.y10 {
    public final int f42637a;
    public final Object f42638b;

    public z2(Object obj, int i7) {
        this.f42637a = i7;
        this.f42638b = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float top;
        float f10;
        float f11;
        float f12;
        TL_account.TL_birthday tL_birthday;
        switch (this.f42637a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((org.telegram.ui.ii) this.f42638b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.h hVar = ((yc) this.f42638b).f15151f;
                hVar.setText(charSequence);
                hVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ((ji.r) this.f42638b).setEditMenuProgress(((Float) obj).floatValue());
                return;
            case 3:
                ((hi.s6) this.f42638b).a((ai.g) obj);
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((jm) this.f42638b).f36560w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.f37519b.dismiss();
                return;
            case 5:
                org.telegram.messenger.np.u1(((ks) this.f42638b).Q).E3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f42638b;
                ArrayList arrayList = (ArrayList) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((ot) this.f42638b).H(((Integer) obj).intValue());
                return;
            case 8:
                wa0 wa0Var = (wa0) this.f42638b;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = wa0Var.f41739e.f40306a;
                ca0 ca0Var = wa0Var.f41740f;
                if (((ta0) arrayList2.get(ca0Var.getCurrentPosition())).f39808a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (((ta0) arrayList2.get(i10)).f39808a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (ca0Var.getCurrentPosition() != i7) {
                        ca0Var.A(i7);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qa0 qa0Var = (qa0) this.f42638b;
                qa0Var.f38860n.y(qa0Var.f38859f.T((View) obj));
                return;
            case 10:
                qc0 qc0Var = (qc0) this.f42638b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = qc0Var.h;
                if (qc0Var.getContext() != null) {
                    if (qc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int intValue = num2.intValue() - org.telegram.messenger.g0.f24041n;
                    if (org.telegram.messenger.cz.f23436r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        float f13 = 1.0f;
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            top = 0.0f;
                        } else {
                            float f14 = 2.0f;
                            float height = (qc0Var.getHeight() - intValue) / 2.0f;
                            float height2 = frameLayout.getHeight();
                            if (z10) {
                                f14 = 1.0f;
                            }
                            top = (height - (height2 / f14)) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(top).setDuration(320L);
                        nr nrVar = nr.h;
                        duration.setInterpolator(nrVar).start();
                        ViewPropertyAnimator animate2 = qc0Var.N.animate();
                        if (intValue > org.telegram.messenger.g0.L(20.0f)) {
                            f13 = 0.0f;
                        }
                        animate2.alpha(f13).setDuration(320L).setInterpolator(nrVar);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                md0 md0Var = (md0) this.f42638b;
                md0Var.F1.a(md0Var.I1, true, 0, ((Long) obj).longValue());
                md0Var.dismiss();
                return;
            case 12:
                org.telegram.messenger.r10 r10Var = (org.telegram.messenger.r10) this.f42638b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                float f15 = -0.07f;
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (!org.telegram.ui.ActionBar.m6.I.q()) {
                    if (org.telegram.ui.ActionBar.m6.I.q()) {
                        f15 = -0.2f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix2, f15);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                r10Var.a(l10, l11);
                return;
            case 13:
                vw0 vw0Var = (vw0) this.f42638b;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i11 = vw0Var.f41566a;
                TLRPC.UserFull d2 = org.telegram.messenger.np.u1(i11).d2(org.telegram.messenger.k10.i(i11).e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                    org.telegram.messenger.ur.a0(i11).j2(d2, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.q1(vw0Var, d2, tL_birthday, 21), 1024);
                org.telegram.messenger.np.u1(i11).o2();
                org.telegram.messenger.np.u1(i11).s4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ls.f(i11).k(107, new Object[0]);
                return;
            default:
                h51 h51Var = (h51) this.f42638b;
                h51Var.f35789g3.R(h51Var.T((View) obj), h51Var.f35792k3);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk0 extends cg.c {
    public final Context d;
    public final NotificationsCustomSettingsActivity f37122e;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f37122e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37122e.F.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37122e;
            if (i10 < notificationsCustomSettingsActivity.F.size()) {
                return ((fk0) notificationsCustomSettingsActivity.F.get(i10)).f2505a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        float f10;
        ArrayList arrayList = this.f37122e.F;
        if (i10 >= 0 && i10 < arrayList.size()) {
            fk0 fk0Var = (fk0) arrayList.get(i10);
            boolean z10 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((fk0) arrayList.get(i11)).f2505a != 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i12 = m1Var.f5879f;
            View view = m1Var.f5875a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(fk0Var.f36809e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.s8) view).f("" + ((Object) fk0Var.f36809e), fk0Var.f36812i, z4);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.va) view).g(fk0Var.f36811g, null, z4);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.u8) view).b(fk0Var.h, "" + ((Object) fk0Var.f36809e), z4);
                    return;
                case 4:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (fk0Var.f36809e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(fk0Var.f36809e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.aa) view).c(fk0Var.f36809e, fk0Var.f36810f, false, z4);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(fk0Var.f36812i);
                    j5Var.b(fk0Var.f36809e, fk0Var.f36810f, fk0Var.d, fk0Var.f36812i, 0, false, z4, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (fk0Var.d == 0) {
                        o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21878p7);
                        o8Var.i("" + ((Object) fk0Var.f36809e), z4);
                        return;
                    }
                    o8Var.e(org.telegram.ui.ActionBar.k6.f21981v6, org.telegram.ui.ActionBar.k6.f21963u6);
                    o8Var.m(fk0Var.d, "" + ((Object) fk0Var.f36809e), z4);
                    return;
                case 8:
                    ek0 ek0Var = (ek0) view;
                    ek0Var.e(org.telegram.ui.ActionBar.k6.f21981v6, org.telegram.ui.ActionBar.k6.f21963u6);
                    CharSequence charSequence = fk0Var.f36809e;
                    if (fk0Var.d != 1) {
                        z10 = false;
                    }
                    ViewPropertyAnimator animate = ek0Var.N.animate();
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 180.0f;
                    }
                    b.p(animate.rotation(f10), org.telegram.ui.Components.pr.h, 340L);
                    ek0Var.i(charSequence, z4);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37122e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.va(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.u8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.aa(context);
                break;
            case 6:
                g6Var = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, g6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.o8(context);
                break;
            case 8:
                ?? o8Var = new org.telegram.ui.Cells.o8(context);
                ImageView imageView = new ImageView(context);
                o8Var.N = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f21981v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                o8Var.addView(imageView, k7.c6.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = o8Var;
                break;
        }
        return new f2.m1(m4Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean isGlobalNotificationsEnabled;
        fk0 fk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f37122e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.F;
        int i10 = notificationsCustomSettingsActivity.f34191s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f34192w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f34189n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f34192w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = m1Var.b();
            View view = m1Var.f5875a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                fk0Var = (fk0) arrayList3.get(b10);
            } else {
                fk0Var = null;
            }
            if (fk0Var == null || fk0Var.f36808c != 102) {
                int i11 = m1Var.f5879f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.aa) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.u8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.s8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}

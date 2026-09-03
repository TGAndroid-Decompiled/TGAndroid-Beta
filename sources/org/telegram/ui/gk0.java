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
public final class gk0 extends bg.c {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.F.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
            if (i10 < notificationsCustomSettingsActivity.F.size()) {
                return ((fk0) notificationsCustomSettingsActivity.F.get(i10)).f1830a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        float f10;
        ArrayList arrayList = this.e.F;
        if (i10 >= 0 && i10 < arrayList.size()) {
            fk0 fk0Var = (fk0) arrayList.get(i10);
            boolean z10 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((fk0) arrayList.get(i11)).f1830a != 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i12 = l1Var.f5777f;
            View view = l1Var.f5774a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.l4) view).setText(fk0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.r8) view).f("" + ((Object) fk0Var.e), fk0Var.f34102i, z4);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.ua) view).g(fk0Var.f34101g, null, z4);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.t8) view).b(fk0Var.h, "" + ((Object) fk0Var.e), z4);
                    return;
                case 4:
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    if (fk0Var.e == null) {
                        z8Var.setFixedSize(12);
                        z8Var.setText(null);
                        return;
                    }
                    z8Var.setFixedSize(0);
                    z8Var.setText(fk0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.z9) view).c(fk0Var.e, fk0Var.f34100f, false, z4);
                    return;
                case 6:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    i5Var.setDrawLine(true);
                    i5Var.setChecked(fk0Var.f34102i);
                    i5Var.b(fk0Var.e, fk0Var.f34100f, fk0Var.d, fk0Var.f34102i, 0, false, z4, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (fk0Var.d == 0) {
                        n8Var.e(-1, org.telegram.ui.ActionBar.j6.f20097p7);
                        n8Var.i("" + ((Object) fk0Var.e), z4);
                        return;
                    }
                    n8Var.e(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
                    n8Var.m(fk0Var.d, "" + ((Object) fk0Var.e), z4);
                    return;
                case 8:
                    ek0 ek0Var = (ek0) view;
                    ek0Var.e(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
                    CharSequence charSequence = fk0Var.e;
                    if (fk0Var.d != 1) {
                        z10 = false;
                    }
                    ViewPropertyAnimator animate = ek0Var.N.animate();
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 180.0f;
                    }
                    b.p(animate.rotation(f10), org.telegram.ui.Components.mr.h, 340L);
                    ek0Var.i(charSequence, z4);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.ua(context, 6, 0, false);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.t8(context, null);
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.z9(context);
                break;
            case 6:
                f6Var = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).resourceProvider;
                l4Var = new org.telegram.ui.Cells.i5(21, 64, this.d, f6Var, true);
                break;
            case 7:
            default:
                l4Var = new org.telegram.ui.Cells.n8(context);
                break;
            case 8:
                ?? n8Var = new org.telegram.ui.Cells.n8(context);
                ImageView imageView = new ImageView(context);
                n8Var.N = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f20200v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                n8Var.addView(imageView, k7.b6.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                l4Var = n8Var;
                break;
        }
        return new f2.l1(l4Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean isGlobalNotificationsEnabled;
        fk0 fk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.F;
        int i10 = notificationsCustomSettingsActivity.f31642s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f31643w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f31640n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f31643w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = l1Var.b();
            View view = l1Var.f5774a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                fk0Var = (fk0) arrayList3.get(b10);
            } else {
                fk0Var = null;
            }
            if (fk0Var == null || fk0Var.f34099c != 102) {
                int i11 = l1Var.f5777f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.z9) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.t8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.r8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.l4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}

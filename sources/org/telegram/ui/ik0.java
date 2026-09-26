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
public final class ik0 extends og.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.I.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
            if (i10 < notificationsCustomSettingsActivity.I.size()) {
                return ((hk0) notificationsCustomSettingsActivity.I.get(i10)).f15715a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            hk0 hk0Var = (hk0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((hk0) arrayList.get(i11)).f15715a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = c1Var.f42962f;
            View view = c1Var.f42959a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(hk0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) hk0Var.e), hk0Var.f34245i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.za) view).g(hk0Var.f34244g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(hk0Var.h, "" + ((Object) hk0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (hk0Var.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(hk0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ea) view).c(hk0Var.e, hk0Var.f34243f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(hk0Var.f34245i);
                    j5Var.b(hk0Var.e, hk0Var.f34243f, hk0Var.d, hk0Var.f34245i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (hk0Var.d == 0) {
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.f19279p7);
                        r8Var.i("" + ((Object) hk0Var.e), z10);
                        return;
                    }
                    r8Var.e(org.telegram.ui.ActionBar.h6.f19390v6, org.telegram.ui.ActionBar.h6.f19372u6);
                    r8Var.m(hk0Var.d, "" + ((Object) hk0Var.e), z10);
                    return;
                case 8:
                    gk0 gk0Var = (gk0) view;
                    gk0Var.e(org.telegram.ui.ActionBar.h6.f19390v6, org.telegram.ui.ActionBar.h6.f19372u6);
                    CharSequence charSequence = hk0Var.e;
                    if (hk0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = gk0Var.Q.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.ok.s(animate.rotation(f7), org.telegram.ui.Components.sr.h, 340L);
                    gk0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.za(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 6:
                d6Var = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, d6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                ?? r8Var = new org.telegram.ui.Cells.r8(context);
                ImageView imageView = new ImageView(context);
                r8Var.Q = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f19390v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                r8Var.addView(imageView, w7.y5.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = r8Var;
                break;
        }
        return new s4.c1(m4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean isGlobalNotificationsEnabled;
        hk0 hk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f31155s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f31156w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f31153n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f31156w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = c1Var.b();
            View view = c1Var.f42959a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                hk0Var = (hk0) arrayList3.get(b10);
            } else {
                hk0Var = null;
            }
            if (hk0Var == null || hk0Var.f34242c != 102) {
                int i11 = c1Var.f42962f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.ea) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.y8) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.w8) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}

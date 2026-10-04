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
public final class mk0 extends og.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity f38669e;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f38669e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46535f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38669e.I.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38669e;
            if (i10 < notificationsCustomSettingsActivity.I.size()) {
                return ((lk0) notificationsCustomSettingsActivity.I.get(i10)).f17187a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.f38669e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            lk0 lk0Var = (lk0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((lk0) arrayList.get(i11)).f17187a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = c1Var.f46535f;
            View view = c1Var.f46531a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(lk0Var.f38286e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) lk0Var.f38286e), lk0Var.f38289i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.za) view).g(lk0Var.f38288g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(lk0Var.h, "" + ((Object) lk0Var.f38286e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (lk0Var.f38286e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(lk0Var.f38286e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ea) view).c(lk0Var.f38286e, lk0Var.f38287f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(lk0Var.f38289i);
                    j5Var.b(lk0Var.f38286e, lk0Var.f38287f, lk0Var.d, lk0Var.f38289i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (lk0Var.d == 0) {
                        r8Var.e(-1, org.telegram.ui.ActionBar.i6.f21044p7);
                        r8Var.i("" + ((Object) lk0Var.f38286e), z10);
                        return;
                    }
                    r8Var.e(org.telegram.ui.ActionBar.i6.f21157v6, org.telegram.ui.ActionBar.i6.f21139u6);
                    r8Var.m(lk0Var.d, "" + ((Object) lk0Var.f38286e), z10);
                    return;
                case 8:
                    kk0 kk0Var = (kk0) view;
                    kk0Var.e(org.telegram.ui.ActionBar.i6.f21157v6, org.telegram.ui.ActionBar.i6.f21139u6);
                    CharSequence charSequence = lk0Var.f38286e;
                    if (lk0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = kk0Var.Q.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.bi.r(animate.rotation(f7), org.telegram.ui.Components.tr.h, 340L);
                    kk0Var.i(charSequence, z10);
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
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38669e;
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
                d6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
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
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21157v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                r8Var.addView(imageView, w7.z5.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = r8Var;
                break;
        }
        return new s4.c1(m4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean isGlobalNotificationsEnabled;
        lk0 lk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f38669e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f33831s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33832w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f33829n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33832w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = c1Var.b();
            View view = c1Var.f46531a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                lk0Var = (lk0) arrayList3.get(b10);
            } else {
                lk0Var = null;
            }
            if (lk0Var == null || lk0Var.f38285c != 102) {
                int i11 = c1Var.f46535f;
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

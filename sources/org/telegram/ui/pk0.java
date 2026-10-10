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
public final class pk0 extends og.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity f40868e;

    public pk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f40868e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40868e.I.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40868e;
            if (i10 < notificationsCustomSettingsActivity.I.size()) {
                return ((ok0) notificationsCustomSettingsActivity.I.get(i10)).f17129a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.f40868e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            ok0 ok0Var = (ok0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((ok0) arrayList.get(i11)).f17129a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = d1Var.f47706f;
            View view = d1Var.f47702a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(ok0Var.f40597e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) ok0Var.f40597e), ok0Var.f40600i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.xa) view).g(ok0Var.f40599g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(ok0Var.h, "" + ((Object) ok0Var.f40597e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (ok0Var.f40597e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(ok0Var.f40597e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ca) view).c(ok0Var.f40597e, ok0Var.f40598f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(ok0Var.f40600i);
                    j5Var.b(ok0Var.f40597e, ok0Var.f40598f, ok0Var.d, ok0Var.f40600i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (ok0Var.d == 0) {
                        r8Var.e(-1, org.telegram.ui.ActionBar.i6.f21022p7);
                        r8Var.i("" + ((Object) ok0Var.f40597e), z10);
                        return;
                    }
                    r8Var.e(org.telegram.ui.ActionBar.i6.f21132v6, org.telegram.ui.ActionBar.i6.f21114u6);
                    r8Var.m(ok0Var.d, "" + ((Object) ok0Var.f40597e), z10);
                    return;
                case 8:
                    nk0 nk0Var = (nk0) view;
                    nk0Var.e(org.telegram.ui.ActionBar.i6.f21132v6, org.telegram.ui.ActionBar.i6.f21114u6);
                    CharSequence charSequence = ok0Var.f40597e;
                    if (ok0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = nk0Var.R.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.bi.t(animate.rotation(f7), org.telegram.ui.Components.is.h, 340L);
                    nk0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40868e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.xa(6, 0, context, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 6:
                e6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, e6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                ?? r8Var = new org.telegram.ui.Cells.r8(context);
                ImageView imageView = new ImageView(context);
                r8Var.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f21132v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                r8Var.addView(imageView, w7.x5.a(24.0f, 17.0f, 0.0f, 17.0f, 0.0f, 24, i11 | 16));
                m4Var = r8Var;
                break;
        }
        return new s4.d1(m4Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean isGlobalNotificationsEnabled;
        ok0 ok0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40868e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f33872s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33873w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f33870n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33873w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = d1Var.b();
            View view = d1Var.f47702a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                ok0Var = (ok0) arrayList3.get(b10);
            } else {
                ok0Var = null;
            }
            if (ok0Var == null || ok0Var.f40596c != 102) {
                int i11 = d1Var.f47706f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.ca) view).a(null, isGlobalNotificationsEnabled);
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

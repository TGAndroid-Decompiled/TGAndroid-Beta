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
public final class ok0 extends og.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity f40595e;

    public ok0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f40595e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 0 && i10 != 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40595e.I.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40595e;
            if (i10 < notificationsCustomSettingsActivity.I.size()) {
                return ((nk0) notificationsCustomSettingsActivity.I.get(i10)).f17211a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.f40595e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            nk0 nk0Var = (nk0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((nk0) arrayList.get(i11)).f17211a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = d1Var.f47786f;
            View view = d1Var.f47782a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(nk0Var.f40305e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) nk0Var.f40305e), nk0Var.f40308i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.xa) view).g(nk0Var.f40307g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(nk0Var.h, "" + ((Object) nk0Var.f40305e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (nk0Var.f40305e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(nk0Var.f40305e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ca) view).c(nk0Var.f40305e, nk0Var.f40306f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(nk0Var.f40308i);
                    j5Var.b(nk0Var.f40305e, nk0Var.f40306f, nk0Var.d, nk0Var.f40308i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (nk0Var.d == 0) {
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.f21043p7);
                        r8Var.i("" + ((Object) nk0Var.f40305e), z10);
                        return;
                    }
                    r8Var.e(org.telegram.ui.ActionBar.h6.f21154v6, org.telegram.ui.ActionBar.h6.f21136u6);
                    r8Var.m(nk0Var.d, "" + ((Object) nk0Var.f40305e), z10);
                    return;
                case 8:
                    mk0 mk0Var = (mk0) view;
                    mk0Var.e(org.telegram.ui.ActionBar.h6.f21154v6, org.telegram.ui.ActionBar.h6.f21136u6);
                    CharSequence charSequence = nk0Var.f40305e;
                    if (nk0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = mk0Var.R.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.ai.t(animate.rotation(f7), org.telegram.ui.Components.is.h, 340L);
                    mk0Var.i(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40595e;
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
                r8Var.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f21154v6), PorterDuff.Mode.SRC_IN));
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
        nk0 nk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40595e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f33896s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33897w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f33894n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33897w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = d1Var.b();
            View view = d1Var.f47782a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                nk0Var = (nk0) arrayList3.get(b10);
            } else {
                nk0Var = null;
            }
            if (nk0Var == null || nk0Var.f40304c != 102) {
                int i11 = d1Var.f47786f;
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

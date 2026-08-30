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
public final class ek0 extends bg.c {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
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
                return ((dk0) notificationsCustomSettingsActivity.F.get(i10)).f1808a;
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
            dk0 dk0Var = (dk0) arrayList.get(i10);
            boolean z10 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((dk0) arrayList.get(i11)).f1808a != 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i12 = l1Var.f5788f;
            View view = l1Var.f5785a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.m4) view).setText(dk0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.s8) view).f("" + ((Object) dk0Var.e), dk0Var.f33674i, z4);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.va) view).g(dk0Var.f33673g, null, z4);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.u8) view).b(dk0Var.h, "" + ((Object) dk0Var.e), z4);
                    return;
                case 4:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (dk0Var.e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(dk0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.aa) view).c(dk0Var.e, dk0Var.f33672f, false, z4);
                    return;
                case 6:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    j5Var.setChecked(dk0Var.f33674i);
                    j5Var.b(dk0Var.e, dk0Var.f33672f, dk0Var.d, dk0Var.f33674i, 0, false, z4, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (dk0Var.d == 0) {
                        o8Var.e(-1, org.telegram.ui.ActionBar.j6.f20122p7);
                        o8Var.i("" + ((Object) dk0Var.e), z4);
                        return;
                    }
                    o8Var.e(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                    o8Var.m(dk0Var.d, "" + ((Object) dk0Var.e), z4);
                    return;
                case 8:
                    ck0 ck0Var = (ck0) view;
                    ck0Var.e(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                    CharSequence charSequence = dk0Var.e;
                    if (dk0Var.d != 1) {
                        z10 = false;
                    }
                    ViewPropertyAnimator animate = ck0Var.N.animate();
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 180.0f;
                    }
                    b.p(animate.rotation(f10), org.telegram.ui.Components.nr.h, 340L);
                    ck0Var.i(charSequence, z4);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
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
                f6Var = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, f6Var, true);
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
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f20225v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                o8Var.addView(imageView, k7.b6.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = o8Var;
                break;
        }
        return new f2.l1(m4Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean isGlobalNotificationsEnabled;
        dk0 dk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.F;
        int i10 = notificationsCustomSettingsActivity.f31668s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f31669w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f31666n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f31669w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = l1Var.b();
            View view = l1Var.f5785a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                dk0Var = (dk0) arrayList3.get(b10);
            } else {
                dk0Var = null;
            }
            if (dk0Var == null || dk0Var.f33671c != 102) {
                int i11 = l1Var.f5788f;
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

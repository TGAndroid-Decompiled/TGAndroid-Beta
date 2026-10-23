package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dk0 extends pg.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
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
                return ((ck0) notificationsCustomSettingsActivity.I.get(i10)).f44713a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            ck0 ck0Var = (ck0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((ck0) arrayList.get(i11)).f44713a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = b1Var.f46346f;
            View view = b1Var.f46343a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.l4) view).setText(ck0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) ck0Var.e), ck0Var.f36387i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.wa) view).f(ck0Var.f36386g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(ck0Var.h, "" + ((Object) ck0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (ck0Var.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(ck0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ca) view).c(ck0Var.e, ck0Var.f36385f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    i5Var.setDrawLine(true);
                    i5Var.setChecked(ck0Var.f36387i);
                    i5Var.b(ck0Var.e, ck0Var.f36385f, ck0Var.d, ck0Var.f36387i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (ck0Var.d == 0) {
                        r8Var.g(-1, org.telegram.ui.ActionBar.k6.f21404p7);
                        r8Var.k("" + ((Object) ck0Var.e), z10);
                        return;
                    }
                    r8Var.g(org.telegram.ui.ActionBar.k6.f21516v6, org.telegram.ui.ActionBar.k6.f21499u6);
                    r8Var.o(ck0Var.d, "" + ((Object) ck0Var.e), z10);
                    return;
                case 8:
                    bk0 bk0Var = (bk0) view;
                    bk0Var.g(org.telegram.ui.ActionBar.k6.f21516v6, org.telegram.ui.ActionBar.k6.f21499u6);
                    CharSequence charSequence = ck0Var.e;
                    if (ck0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = bk0Var.W.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.sl.t(animate.rotation(f7), org.telegram.ui.Components.bs.h, 340L);
                    bk0Var.k(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.wa(context, 6, 0, false);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.y8(context, null);
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 6:
                g6Var = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).resourceProvider;
                l4Var = new org.telegram.ui.Cells.i5(21, 64, this.d, g6Var, true);
                break;
            case 7:
            default:
                l4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                ?? r8Var = new org.telegram.ui.Cells.r8(context);
                ImageView imageView = new ImageView(context);
                r8Var.W = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21516v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                r8Var.addView(imageView, w7.z5.d(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                l4Var = r8Var;
                break;
        }
        return new s4.b1(l4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean isGlobalNotificationsEnabled;
        ck0 ck0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f33513s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33514w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f33511n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33514w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = b1Var.b();
            View view = b1Var.f46343a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                ck0Var = (ck0) arrayList3.get(b10);
            } else {
                ck0Var = null;
            }
            if (ck0Var == null || ck0Var.f36384c != 102) {
                int i11 = b1Var.f46346f;
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
                ((org.telegram.ui.Cells.l4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}

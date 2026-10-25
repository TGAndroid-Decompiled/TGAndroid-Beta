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
public final class jk0 extends qg.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
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
                return ((ik0) notificationsCustomSettingsActivity.I.get(i10)).f47037a;
            }
            return 5;
        }
        return 5;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        float f7;
        ArrayList arrayList = this.e.I;
        if (i10 >= 0 && i10 < arrayList.size()) {
            ik0 ik0Var = (ik0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((ik0) arrayList.get(i11)).f47037a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = e1Var.f47738f;
            View view = e1Var.f47735a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.q4) view).setText(ik0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.a9) view).f("" + ((Object) ik0Var.e), ik0Var.f40256i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.ab) view).f(ik0Var.f40255g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.c9) view).b(ik0Var.h, "" + ((Object) ik0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                    if (ik0Var.e == null) {
                        i9Var.setFixedSize(12);
                        i9Var.setText(null);
                        return;
                    }
                    i9Var.setFixedSize(0);
                    i9Var.setText(ik0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ga) view).c(ik0Var.e, ik0Var.f40254f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                    n5Var.setDrawLine(true);
                    n5Var.setChecked(ik0Var.f40256i);
                    n5Var.b(ik0Var.e, ik0Var.f40254f, ik0Var.d, ik0Var.f40256i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    if (ik0Var.d == 0) {
                        v8Var.g(-1, org.telegram.ui.ActionBar.y6.f23579p7);
                        v8Var.k("" + ((Object) ik0Var.e), z10);
                        return;
                    }
                    v8Var.g(org.telegram.ui.ActionBar.y6.f23690v6, org.telegram.ui.ActionBar.y6.f23671u6);
                    v8Var.o(ik0Var.d, "" + ((Object) ik0Var.e), z10);
                    return;
                case 8:
                    hk0 hk0Var = (hk0) view;
                    hk0Var.g(org.telegram.ui.ActionBar.y6.f23690v6, org.telegram.ui.ActionBar.y6.f23671u6);
                    CharSequence charSequence = ik0Var.e;
                    if (ik0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = hk0Var.W.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.vh.q(animate.rotation(f7), org.telegram.ui.Components.ds.h, 340L);
                    hk0Var.k(charSequence, z10);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i11;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                q4Var = new org.telegram.ui.Cells.q4(context);
                break;
            case 1:
                q4Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                q4Var = new org.telegram.ui.Cells.ab(context, 6, 0, false);
                break;
            case 3:
                q4Var = new org.telegram.ui.Cells.c9(context, null);
                break;
            case 4:
                q4Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 5:
                q4Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 6:
                u6Var = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).resourceProvider;
                q4Var = new org.telegram.ui.Cells.n5(21, 64, this.d, u6Var, true);
                break;
            case 7:
            default:
                q4Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                ?? v8Var = new org.telegram.ui.Cells.v8(context);
                ImageView imageView = new ImageView(context);
                v8Var.W = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23690v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                imageView.setImageResource(R.drawable.msg_expand);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                v8Var.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, i11 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                q4Var = v8Var;
                break;
        }
        return new s4.e1(q4Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean isGlobalNotificationsEnabled;
        ik0 ik0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f35576s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f35577w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f35574n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f35577w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = e1Var.b();
            View view = e1Var.f47735a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                ik0Var = (ik0) arrayList3.get(b10);
            } else {
                ik0Var = null;
            }
            if (ik0Var == null || ik0Var.f40253c != 102) {
                int i11 = e1Var.f47738f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                return;
                            }
                            ((org.telegram.ui.Cells.ga) view).a(null, isGlobalNotificationsEnabled);
                            return;
                        }
                        ((org.telegram.ui.Cells.c9) view).a(null, isGlobalNotificationsEnabled);
                        return;
                    }
                    ((org.telegram.ui.Cells.a9) view).e(null, isGlobalNotificationsEnabled);
                    return;
                }
                ((org.telegram.ui.Cells.q4) view).a(null, isGlobalNotificationsEnabled);
            }
        }
    }
}

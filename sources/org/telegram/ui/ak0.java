package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ak0 extends xf.b {
    public final Context d;

    public final NotificationsCustomSettingsActivity f36556e;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f36556e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 0 || i10 == 4) ? false : true;
    }

    @Override
    public final int h() {
        return this.f36556e.E.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36556e;
        if (i10 >= notificationsCustomSettingsActivity.E.size()) {
            return 5;
        }
        return ((zj0) notificationsCustomSettingsActivity.E.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ArrayList arrayList = this.f36556e.E;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        zj0 zj0Var = (zj0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((zj0) arrayList.get(i11)).f49413a != 4;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.j4) view).setText(zj0Var.f45191e);
                break;
            case 1:
                ((org.telegram.ui.Cells.p8) view).f("" + ((Object) zj0Var.f45191e), zj0Var.f45194i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.sa) view).g(zj0Var.f45193g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.r8) view).b(zj0Var.h, "" + ((Object) zj0Var.f45191e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (zj0Var.f45191e != null) {
                    x8Var.setFixedSize(0);
                    x8Var.setText(zj0Var.f45191e);
                } else {
                    x8Var.setFixedSize(12);
                    x8Var.setText(null);
                }
                break;
            case 5:
                ((org.telegram.ui.Cells.x9) view).c(zj0Var.f45191e, zj0Var.f45192f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
                g5Var.setDrawLine(true);
                g5Var.setChecked(zj0Var.f45194i);
                g5Var.b(zj0Var.f45191e, zj0Var.f45192f, zj0Var.d, zj0Var.f45194i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                if (zj0Var.d != 0) {
                    l8Var.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                    l8Var.m(zj0Var.d, "" + ((Object) zj0Var.f45191e), z10);
                } else {
                    l8Var.e(-1, org.telegram.ui.ActionBar.g6.f23269p7);
                    l8Var.i("" + ((Object) zj0Var.f45191e), z10);
                }
                break;
            case 8:
                yj0 yj0Var = (yj0) view;
                yj0Var.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                CharSequence charSequence = zj0Var.f45191e;
                org.telegram.messenger.rl.o(yj0Var.M.animate().rotation(zj0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.er.h, 340L);
                yj0Var.i(charSequence, z10);
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout j4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36556e;
        Context context = this.d;
        switch (i10) {
            case 0:
                j4Var = new org.telegram.ui.Cells.j4(context);
                break;
            case 1:
                j4Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 2:
                j4Var = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                break;
            case 3:
                j4Var = new org.telegram.ui.Cells.r8(context, null);
                break;
            case 4:
                j4Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 5:
                j4Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 6:
                j4Var = new org.telegram.ui.Cells.g5(21, 64, this.d, ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider, true);
                break;
            case 7:
            default:
                j4Var = new org.telegram.ui.Cells.l8(context);
                break;
            case 8:
                yj0 yj0Var = new yj0(context);
                ImageView imageView = new ImageView(context);
                yj0Var.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23373v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                yj0Var.addView(imageView, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                j4Var = yj0Var;
                break;
        }
        return new org.telegram.ui.Components.lk0(j4Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        boolean zIsGlobalNotificationsEnabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f36556e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.E;
        int i10 = notificationsCustomSettingsActivity.f35553s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f35554w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f35551n;
                zIsGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.f35554w) == null || arrayList.isEmpty());
            } else {
                zIsGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int iB = o1Var.b();
            View view = o1Var.f5789a;
            zj0 zj0Var = (iB < 0 || iB >= arrayList3.size()) ? null : (zj0) arrayList3.get(iB);
            if (zj0Var == null || zj0Var.f45190c != 102) {
                int i11 = o1Var.f5793f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.j4) view).a(null, zIsGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.p8) view).e(null, zIsGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.r8) view).a(null, zIsGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.x9) view).a(null, zIsGlobalNotificationsEnabled);
                }
            }
        }
    }
}

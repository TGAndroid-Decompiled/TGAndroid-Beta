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
public final class ck0 extends pg.b {
    public final Context d;
    public final NotificationsCustomSettingsActivity e;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
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
                return ((bk0) notificationsCustomSettingsActivity.I.get(i10)).f44712a;
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
            bk0 bk0Var = (bk0) arrayList.get(i10);
            boolean z11 = true;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && ((bk0) arrayList.get(i11)).f44712a != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = b1Var.f46345f;
            View view = b1Var.f46342a;
            switch (i12) {
                case 0:
                    ((org.telegram.ui.Cells.l4) view).setText(bk0Var.e);
                    return;
                case 1:
                    ((org.telegram.ui.Cells.w8) view).f("" + ((Object) bk0Var.e), bk0Var.f36093i, z10);
                    return;
                case 2:
                    ((org.telegram.ui.Cells.wa) view).f(bk0Var.f36092g, null, z10);
                    return;
                case 3:
                    ((org.telegram.ui.Cells.y8) view).b(bk0Var.h, "" + ((Object) bk0Var.e), z10);
                    return;
                case 4:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (bk0Var.e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(bk0Var.e);
                    return;
                case 5:
                    ((org.telegram.ui.Cells.ca) view).c(bk0Var.e, bk0Var.f36091f, false, z10);
                    return;
                case 6:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    i5Var.setDrawLine(true);
                    i5Var.setChecked(bk0Var.f36093i);
                    i5Var.b(bk0Var.e, bk0Var.f36091f, bk0Var.d, bk0Var.f36093i, 0, false, z10, true);
                    return;
                case 7:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (bk0Var.d == 0) {
                        r8Var.g(-1, org.telegram.ui.ActionBar.k6.f21405p7);
                        r8Var.k("" + ((Object) bk0Var.e), z10);
                        return;
                    }
                    r8Var.g(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
                    r8Var.o(bk0Var.d, "" + ((Object) bk0Var.e), z10);
                    return;
                case 8:
                    ak0 ak0Var = (ak0) view;
                    ak0Var.g(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
                    CharSequence charSequence = bk0Var.e;
                    if (bk0Var.d != 1) {
                        z11 = false;
                    }
                    ViewPropertyAnimator animate = ak0Var.W.animate();
                    if (z11) {
                        f7 = 0.0f;
                    } else {
                        f7 = 180.0f;
                    }
                    org.telegram.messenger.tl.t(animate.rotation(f7), org.telegram.ui.Components.zr.h, 340L);
                    ak0Var.k(charSequence, z10);
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
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21517v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
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
        bk0 bk0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.f33515s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33516w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.f33513n;
                if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33516w) == null || arrayList.isEmpty())) {
                    isGlobalNotificationsEnabled = false;
                } else {
                    isGlobalNotificationsEnabled = true;
                }
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = b1Var.b();
            View view = b1Var.f46342a;
            if (b10 >= 0 && b10 < arrayList3.size()) {
                bk0Var = (bk0) arrayList3.get(b10);
            } else {
                bk0Var = null;
            }
            if (bk0Var == null || bk0Var.f36090c != 102) {
                int i11 = b1Var.f46345f;
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

package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class gh0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public final fh0 l1;
    public final org.telegram.ui.Components.ch0 f46098m1;
    public org.telegram.messenger.c20 n1;

    public gh0(Context context, boolean z9, org.telegram.messenger.c20 c20Var) {
        super(context, false);
        int i7;
        this.n1 = c20Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f46098m1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624194, 46, 46, null);
        imageView.d();
        int L = org.telegram.messenger.g0.L(72.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, null);
        frameLayout.addView((View) imageView, c8.ha.e(72, 72, 17));
        fh0 fh0Var = new fh0(context);
        this.l1 = fh0Var;
        frameLayout.addView(fh0Var, c8.ha.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        fh0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final gh0 f45306b;

            {
                this.f45306b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.ch0 ch0Var = this.f45306b.f46098m1;
                        if (!ch0Var.b()) {
                            ch0Var.setProgress(0.0f);
                            ch0Var.d();
                            return;
                        }
                        return;
                    default:
                        gh0 gh0Var = this.f45306b;
                        org.telegram.messenger.c20 c20Var2 = gh0Var.n1;
                        if (c20Var2 != null) {
                            c20Var2.a(Boolean.TRUE);
                            gh0Var.n1 = null;
                        }
                        gh0Var.dismiss();
                        return;
                }
            }
        });
        f10.addView(frameLayout, c8.ha.o(-1, 110));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.id.M0(2131747886, null));
        textView.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        f10.addView(textView, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.id.M0(2131747887, null));
        textView2.setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(21.0f));
        f10.addView(textView2, c8.ha.o(-1, -2));
        f10.addView(new di.b4(2131232225, context, org.telegram.messenger.id.M0(2131747890, null)), c8.ha.o(-1, -2));
        f10.addView(new di.b4(2131232221, context, org.telegram.messenger.id.M0(2131747889, null)), c8.ha.o(-1, -2));
        f10.addView(new di.b4(2131232107, context, org.telegram.messenger.id.M0(2131747888, null)), c8.ha.o(-1, -2));
        this.N = f10;
        P(org.telegram.ui.ActionBar.m6.f27963h5);
        TextView textView3 = new TextView(context);
        if (z9) {
            i7 = 2131747884;
        } else {
            i7 = 2131747885;
        }
        textView3.setText(org.telegram.messenger.id.M0(i7, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Gi, null);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 24.0f);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(textView3, e10, M2, e11, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gh0 f45306b;

            {
                this.f45306b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.ch0 ch0Var = this.f45306b.f46098m1;
                        if (!ch0Var.b()) {
                            ch0Var.setProgress(0.0f);
                            ch0Var.d();
                            return;
                        }
                        return;
                    default:
                        gh0 gh0Var = this.f45306b;
                        org.telegram.messenger.c20 c20Var2 = gh0Var.n1;
                        if (c20Var2 != null) {
                            c20Var2.a(Boolean.TRUE);
                            gh0Var.n1 = null;
                        }
                        gh0Var.dismiss();
                        return;
                }
            }
        });
        f10.addView(textView3, c8.ha.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i12 = 0; i12 < 4; i12++) {
            try {
                org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.f25067r);
            } catch (Exception unused) {
            }
        }
    }

    public static void I0() {
        long j3 = org.telegram.messenger.qp.e1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j3;
        long j10 = 259200000;
        if (j3 >= 259200000) {
            j10 = 604800000;
            if (j3 >= 604800000) {
                j10 = 2592000000L;
            }
        }
        org.telegram.messenger.qp.e1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j10).apply();
    }

    public static boolean J0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j3 = org.telegram.messenger.qp.e1().getLong("askNotificationsAfter", -1L);
            if (j3 != -2) {
                if (j3 < 0 || System.currentTimeMillis() >= j3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25067r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 256) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    i12 += org.telegram.messenger.yr.a0(i13).K;
                }
                if (this.l1.a(i12)) {
                    org.telegram.ui.Components.ch0 ch0Var = this.f46098m1;
                    if (!ch0Var.b()) {
                        ch0Var.setProgress(0.0f);
                        ch0Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.c20 c20Var = this.n1;
        if (c20Var != null) {
            c20Var.a(Boolean.FALSE);
            this.n1 = null;
            I0();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            try {
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25067r);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}

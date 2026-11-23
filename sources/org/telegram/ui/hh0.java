package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class hh0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public final fh0 f48555m1;
    public final org.telegram.ui.Components.qh0 n1;
    public org.telegram.messenger.w10 f48556o1;

    public hh0(Context context, boolean z10, org.telegram.messenger.w10 w10Var) {
        super(context, false);
        int i7;
        this.f48556o1 = w10Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.n1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624195, 46, 46, null);
        imageView.d();
        int L = org.telegram.messenger.g0.L(72.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, null);
        frameLayout.addView((View) imageView, c8.na.e(72, 72, 17));
        fh0 fh0Var = new fh0(context);
        this.f48555m1 = fh0Var;
        frameLayout.addView(fh0Var, c8.na.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        fh0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final hh0 f47559b;

            {
                this.f47559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.qh0 qh0Var = this.f47559b.n1;
                        if (!qh0Var.b()) {
                            qh0Var.setProgress(0.0f);
                            qh0Var.d();
                            return;
                        }
                        return;
                    default:
                        hh0 hh0Var = this.f47559b;
                        org.telegram.messenger.w10 w10Var2 = hh0Var.f48556o1;
                        if (w10Var2 != null) {
                            w10Var2.a(Boolean.TRUE);
                            hh0Var.f48556o1 = null;
                        }
                        hh0Var.dismiss();
                        return;
                }
            }
        });
        g10.addView(frameLayout, c8.na.o(-1, 110));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(textView, i11, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.gd.N0(2131747692, null));
        textView.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        g10.addView(textView, c8.na.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i11, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.gd.N0(2131747693, null));
        textView2.setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(21.0f));
        g10.addView(textView2, c8.na.o(-1, -2));
        g10.addView(new gh0(2131232230, context, org.telegram.messenger.gd.N0(2131747696, null)), c8.na.o(-1, -2));
        g10.addView(new gh0(2131232226, context, org.telegram.messenger.gd.N0(2131747695, null)), c8.na.o(-1, -2));
        g10.addView(new gh0(2131232112, context, org.telegram.messenger.gd.N0(2131747694, null)), c8.na.o(-1, -2));
        this.O = g10;
        Q(org.telegram.ui.ActionBar.n6.f29524h5);
        TextView textView3 = new TextView(context);
        if (z10) {
            i7 = 2131747690;
        } else {
            i7 = 2131747691;
        }
        textView3.setText(org.telegram.messenger.gd.N0(i7, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, null);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 24.0f);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(textView3, e10, M2, e11, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hh0 f47559b;

            {
                this.f47559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.qh0 qh0Var = this.f47559b.n1;
                        if (!qh0Var.b()) {
                            qh0Var.setProgress(0.0f);
                            qh0Var.d();
                            return;
                        }
                        return;
                    default:
                        hh0 hh0Var = this.f47559b;
                        org.telegram.messenger.w10 w10Var2 = hh0Var.f48556o1;
                        if (w10Var2 != null) {
                            w10Var2.a(Boolean.TRUE);
                            hh0Var.f48556o1 = null;
                        }
                        hh0Var.dismiss();
                        return;
                }
            }
        });
        g10.addView(textView3, c8.na.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i12 = 0; i12 < 4; i12++) {
            try {
                org.telegram.messenger.ks.f(i12).c(this, org.telegram.messenger.ks.f25276r);
            } catch (Exception unused) {
            }
        }
    }

    public static void J0() {
        long j3 = org.telegram.messenger.mp.g1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j3;
        long j10 = 259200000;
        if (j3 >= 259200000) {
            j10 = 604800000;
            if (j3 >= 604800000) {
                j10 = 2592000000L;
            }
        }
        org.telegram.messenger.mp.g1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j10).apply();
    }

    public static boolean K0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j3 = org.telegram.messenger.mp.g1().getLong("askNotificationsAfter", -1L);
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
        if (i7 == org.telegram.messenger.ks.f25276r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 256) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    i12 += org.telegram.messenger.tr.a0(i13).L;
                }
                if (this.f48555m1.a(i12)) {
                    org.telegram.ui.Components.qh0 qh0Var = this.n1;
                    if (!qh0Var.b()) {
                        qh0Var.setProgress(0.0f);
                        qh0Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.w10 w10Var = this.f48556o1;
        if (w10Var != null) {
            w10Var.a(Boolean.FALSE);
            this.f48556o1 = null;
            J0();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            try {
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25276r);
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

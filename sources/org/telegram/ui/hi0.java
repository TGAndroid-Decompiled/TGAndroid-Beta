package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class hi0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.vs {
    public final gi0 f37821i1;
    public final org.telegram.ui.Components.fi0 f37822j1;
    public org.telegram.messenger.r20 f37823k1;

    public hi0(Context context, boolean z10, org.telegram.messenger.r20 r20Var) {
        super(context, false);
        int i10;
        this.f37823k1 = r20Var;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f37822j1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624192, 46, 46, null);
        imageView.d();
        int L = org.telegram.messenger.i0.L(72.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, null);
        frameLayout.addView((View) imageView, w7.b6.e(72, 72, 17));
        gi0 gi0Var = new gi0(context);
        this.f37821i1 = gi0Var;
        frameLayout.addView(gi0Var, w7.b6.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        gi0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final hi0 f37156b;

            {
                this.f37156b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.fi0 fi0Var = this.f37156b.f37822j1;
                        if (!fi0Var.b()) {
                            fi0Var.setProgress(0.0f);
                            fi0Var.d();
                            return;
                        }
                        return;
                    default:
                        hi0 hi0Var = this.f37156b;
                        org.telegram.messenger.r20 r20Var2 = hi0Var.f37823k1;
                        if (r20Var2 != null) {
                            r20Var2.a(Boolean.TRUE);
                            hi0Var.f37823k1 = null;
                        }
                        hi0Var.dismiss();
                        return;
                }
            }
        });
        f7.addView(frameLayout, w7.b6.o(-1, 110));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.dd.L0(2131747902, null));
        textView.setPadding(org.telegram.messenger.i0.L(30.0f), 0, org.telegram.messenger.i0.L(30.0f), 0);
        f7.addView(textView, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.dd.L0(2131747903, null));
        textView2.setPadding(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(21.0f));
        f7.addView(textView2, w7.b6.o(-1, -2));
        f7.addView(new bg0(2131232224, context, org.telegram.messenger.dd.L0(2131747906, null)), w7.b6.o(-1, -2));
        f7.addView(new bg0(2131232220, context, org.telegram.messenger.dd.L0(2131747905, null)), w7.b6.o(-1, -2));
        f7.addView(new bg0(2131232106, context, org.telegram.messenger.dd.L0(2131747904, null)), w7.b6.o(-1, -2));
        this.N = f7;
        Q(org.telegram.ui.ActionBar.t6.f21002h5);
        TextView textView3 = new TextView(context);
        if (z10) {
            i10 = 2131747900;
        } else {
            i10 = 2131747901;
        }
        textView3.setText(org.telegram.messenger.dd.L0(i10, null));
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, null);
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 24.0f);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.w6 f10 = org.telegram.ui.ActionBar.a7.f(i11);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(textView3, e, N2, f10, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hi0 f37156b;

            {
                this.f37156b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.fi0 fi0Var = this.f37156b.f37822j1;
                        if (!fi0Var.b()) {
                            fi0Var.setProgress(0.0f);
                            fi0Var.d();
                            return;
                        }
                        return;
                    default:
                        hi0 hi0Var = this.f37156b;
                        org.telegram.messenger.r20 r20Var2 = hi0Var.f37823k1;
                        if (r20Var2 != null) {
                            r20Var2.a(Boolean.TRUE);
                            hi0Var.f37823k1 = null;
                        }
                        hi0Var.dismiss();
                        return;
                }
            }
        });
        f7.addView(textView3, w7.b6.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i13 = 0; i13 < 4; i13++) {
            try {
                org.telegram.messenger.at.f(i13).c(this, org.telegram.messenger.at.f14772r);
            } catch (Exception unused) {
            }
        }
    }

    public static void I0() {
        long j10 = org.telegram.messenger.wp.d1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        org.telegram.messenger.wp.d1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean J0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j10 = org.telegram.messenger.wp.d1().getLong("askNotificationsAfter", -1L);
            if (j10 != -2) {
                if (j10 < 0 || System.currentTimeMillis() >= j10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.wp.D8;
            if ((intValue & 256) >= 0) {
                int i13 = 0;
                for (int i14 = 0; i14 < 4; i14++) {
                    i13 += org.telegram.messenger.is.a0(i14).K;
                }
                if (this.f37821i1.a(i13)) {
                    org.telegram.ui.Components.fi0 fi0Var = this.f37822j1;
                    if (!fi0Var.b()) {
                        fi0Var.setProgress(0.0f);
                        fi0Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.r20 r20Var = this.f37823k1;
        if (r20Var != null) {
            r20Var.a(Boolean.FALSE);
            this.f37823k1 = null;
            I0();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14772r);
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

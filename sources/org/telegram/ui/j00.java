package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class j00 extends rg.b {
    public final Context d;
    public final FiltersSetupActivity f48853e;

    public j00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f48853e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 3 && i7 != 0 && i7 != 5 && i7 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48853e.f43095n.size();
    }

    @Override
    public final int d(int i7) {
        h00 h00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f48853e;
            if (i7 >= filtersSetupActivity.f43095n.size() || (h00Var = (h00) filtersSetupActivity.f43095n.get(i7)) == null) {
                return 3;
            }
            return h00Var.f56630a;
        }
        return 3;
    }

    @Override
    public final void t(v4.f1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j00.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        f00 f00Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Context context = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                int i14 = 5;
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f49152a = textView;
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                                org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (org.telegram.messenger.gd.f24241a0) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                textView.setGravity(i10);
                                if (org.telegram.messenger.gd.f24241a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, i11, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f49153b = textView2;
                                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29789z6, null);
                                org.telegram.messenger.n10.q(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (org.telegram.messenger.gd.f24241a0) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView2.setGravity(i12);
                                if (org.telegram.messenger.gd.f24241a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, i13, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(context);
                                frameLayout.f49154c = pg0Var;
                                pg0Var.setText(org.telegram.messenger.gd.N0(2131754483, null));
                                org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
                                pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
                                int i15 = org.telegram.ui.ActionBar.m6.Fi;
                                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
                                pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 14.0f));
                                Drawable background = pg0Var.getBackground();
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
                                pg0Var.setBackground(background);
                                org.telegram.ui.ActionBar.t6.j(pg0Var, background, M, null, null);
                                frameLayout.addView(pg0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.q31(15, this, frameLayout));
                                f00Var = frameLayout;
                            } else {
                                f00Var = new org.telegram.ui.Cells.s8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                            frameLayout2.f49437a = m5Var;
                            m5Var.setTextSize(16);
                            if (!org.telegram.messenger.gd.f24241a0) {
                                i14 = 3;
                            }
                            m5Var.setGravity(i14);
                            int i16 = org.telegram.ui.ActionBar.m6.f29578o6;
                            org.telegram.ui.ActionBar.t6.X(m5Var, i16, null);
                            m5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(m5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f49438b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            f00Var = frameLayout2;
                        }
                    } else {
                        f00Var = new org.telegram.ui.Cells.a9(context);
                    }
                } else {
                    f00 f00Var2 = new f00(this.f48853e, context);
                    f00Var2.setOnReorderButtonTouchListener(new hi.p1(5, this, f00Var2));
                    f00Var2.setOnOptionsClick(new a(this, 27));
                    f00Var = f00Var2;
                }
            } else {
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751703, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f47897a = imageView2;
                imageView2.f(2131624019, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, c8.ma.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(W2);
                frameLayout3.addView(textView3, c8.ma.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                f00Var = frameLayout3;
            }
        } else {
            f00Var = new org.telegram.ui.Cells.o4(context);
        }
        return new v4.f1(f00Var);
    }
}

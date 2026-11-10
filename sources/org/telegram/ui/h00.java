package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class h00 extends rg.b {
    public final Context d;
    public final FiltersSetupActivity f46189e;

    public h00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f46189e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 0 && i7 != 5 && i7 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46189e.f41239n.size();
    }

    @Override
    public final int d(int i7) {
        f00 f00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f46189e;
            if (i7 >= filtersSetupActivity.f41239n.size() || (f00Var = (f00) filtersSetupActivity.f41239n.get(i7)) == null) {
                return 3;
            }
            return f00Var.f54543a;
        }
        return 3;
    }

    @Override
    public final void t(v4.d1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h00.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        d00 d00Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Context context = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    int i14 = 3;
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f46463a = textView;
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (org.telegram.messenger.id.f23161a0) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                textView.setGravity(i10);
                                if (org.telegram.messenger.id.f23161a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i11, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f46464b = textView2;
                                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28300z6, null);
                                org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (org.telegram.messenger.id.f23161a0) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView2.setGravity(i12);
                                if (org.telegram.messenger.id.f23161a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, i13, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.ag0 ag0Var = new org.telegram.ui.Components.ag0(context);
                                frameLayout.f46465c = ag0Var;
                                ag0Var.setText(org.telegram.messenger.id.M0(2131754486, null));
                                org.telegram.ui.ActionBar.t6.U(ag0Var, org.telegram.ui.ActionBar.m6.Gi, null);
                                ag0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bi, false));
                                int i15 = org.telegram.ui.ActionBar.m6.Ci;
                                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
                                ag0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 14.0f));
                                Drawable background = ag0Var.getBackground();
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
                                ag0Var.setBackground(background);
                                org.telegram.ui.ActionBar.t6.j(ag0Var, background, M, null, null);
                                frameLayout.addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.u41(13, this, frameLayout));
                                d00Var = frameLayout;
                            } else {
                                d00Var = new org.telegram.ui.Cells.r8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                            frameLayout2.f46782a = m5Var;
                            m5Var.setTextSize(16);
                            if (org.telegram.messenger.id.f23161a0) {
                                i14 = 5;
                            }
                            m5Var.setGravity(i14);
                            int i16 = org.telegram.ui.ActionBar.m6.f28090o6;
                            org.telegram.ui.ActionBar.t6.X(m5Var, i16, null);
                            m5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(m5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f46783b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            d00Var = frameLayout2;
                        }
                    } else {
                        d00Var = new org.telegram.ui.Cells.z8(context);
                    }
                } else {
                    d00 d00Var2 = new d00(this.f46189e, context);
                    d00Var2.setOnReorderButtonTouchListener(new fi.n1(6, this, d00Var2));
                    d00Var2.setOnOptionsClick(new a(this, 27));
                    d00Var = d00Var2;
                }
            } else {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751715, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f45086a = imageView2;
                imageView2.f(2131624018, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(X2);
                frameLayout3.addView(textView3, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                d00Var = frameLayout3;
            }
        } else {
            d00Var = new org.telegram.ui.Cells.n4(context);
        }
        return new v4.d1(d00Var);
    }
}

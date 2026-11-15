package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class g00 extends rg.b {
    public final Context d;
    public final FiltersSetupActivity f47264e;

    public g00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f47264e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 0 && i7 != 5 && i7 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f47264e.f42609n.size();
    }

    @Override
    public final int d(int i7) {
        e00 e00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f47264e;
            if (i7 >= filtersSetupActivity.f42609n.size() || (e00Var = (e00) filtersSetupActivity.f42609n.get(i7)) == null) {
                return 3;
            }
            return e00Var.f56015a;
        }
        return 3;
    }

    @Override
    public final void t(v4.e1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g00.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        c00 c00Var;
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
                                frameLayout.f47564a = textView;
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                                org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (org.telegram.messenger.hd.f24101a0) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                textView.setGravity(i10);
                                if (org.telegram.messenger.hd.f24101a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                frameLayout.addView(textView, c8.ja.d(-2, -2.0f, i11, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f47565b = textView2;
                                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, null);
                                org.telegram.messenger.i20.p(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (org.telegram.messenger.hd.f24101a0) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView2.setGravity(i12);
                                if (org.telegram.messenger.hd.f24101a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, i13, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(context);
                                frameLayout.f47566c = dg0Var;
                                dg0Var.setText(org.telegram.messenger.hd.M0(2131754486, null));
                                org.telegram.ui.ActionBar.q6.U(dg0Var, org.telegram.ui.ActionBar.j6.Ji, null);
                                dg0Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
                                int i15 = org.telegram.ui.ActionBar.j6.Fi;
                                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i15, false);
                                org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
                                dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
                                Drawable background = dg0Var.getBackground();
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
                                dg0Var.setBackground(background);
                                org.telegram.ui.ActionBar.q6.j(dg0Var, background, M, null, null);
                                frameLayout.addView(dg0Var, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.vv0(21, this, frameLayout));
                                c00Var = frameLayout;
                            } else {
                                c00Var = new org.telegram.ui.Cells.q8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                            frameLayout2.f47867a = j5Var;
                            j5Var.setTextSize(16);
                            if (org.telegram.messenger.hd.f24101a0) {
                                i14 = 5;
                            }
                            j5Var.setGravity(i14);
                            int i16 = org.telegram.ui.ActionBar.j6.f29049o6;
                            org.telegram.ui.ActionBar.q6.X(j5Var, i16, null);
                            j5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(j5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f47868b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            c00Var = frameLayout2;
                        }
                    } else {
                        c00Var = new org.telegram.ui.Cells.y8(context);
                    }
                } else {
                    c00 c00Var2 = new c00(this.f47264e, context);
                    c00Var2.setOnReorderButtonTouchListener(new hi.p1(6, this, c00Var2));
                    c00Var2.setOnOptionsClick(new a(this, 27));
                    c00Var = c00Var2;
                }
            } else {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131751715, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f46280a = imageView2;
                imageView2.f(2131624019, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, c8.ja.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(X2);
                frameLayout3.addView(textView3, c8.ja.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                c00Var = frameLayout3;
            }
        } else {
            c00Var = new org.telegram.ui.Cells.n4(context);
        }
        return new v4.e1(c00Var);
    }
}

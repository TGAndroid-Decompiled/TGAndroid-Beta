package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class e00 extends rg.b {
    public final Context d;
    public final FiltersSetupActivity f45165e;

    public e00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f45165e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 3 && i7 != 0 && i7 != 5 && i7 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45165e.f41241n.size();
    }

    @Override
    public final int d(int i7) {
        c00 c00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f45165e;
            if (i7 >= filtersSetupActivity.f41241n.size() || (c00Var = (c00) filtersSetupActivity.f41241n.get(i7)) == null) {
                return 3;
            }
            return c00Var.f54532a;
        }
        return 3;
    }

    @Override
    public final void t(v4.d1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e00.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        a00 a00Var;
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
                                frameLayout.f45413a = textView;
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (org.telegram.messenger.id.f23157a0) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                textView.setGravity(i10);
                                if (org.telegram.messenger.id.f23157a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i11, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f45414b = textView2;
                                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28262z6, null);
                                org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (org.telegram.messenger.id.f23157a0) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView2.setGravity(i12);
                                if (org.telegram.messenger.id.f23157a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, i13, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.ag0 ag0Var = new org.telegram.ui.Components.ag0(context);
                                frameLayout.f45415c = ag0Var;
                                ag0Var.setText(org.telegram.messenger.id.M0(2131754486, null));
                                org.telegram.ui.ActionBar.r6.V(ag0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                                ag0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
                                int i15 = org.telegram.ui.ActionBar.k6.Ci;
                                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                                ag0Var.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 14.0f));
                                Drawable background = ag0Var.getBackground();
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                                ag0Var.setBackground(background);
                                org.telegram.ui.ActionBar.r6.k(ag0Var, background, N, null, null);
                                frameLayout.addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.t41(13, this, frameLayout));
                                a00Var = frameLayout;
                            } else {
                                a00Var = new org.telegram.ui.Cells.r8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                            frameLayout2.f45747a = k5Var;
                            k5Var.setTextSize(16);
                            if (org.telegram.messenger.id.f23157a0) {
                                i14 = 5;
                            }
                            k5Var.setGravity(i14);
                            int i16 = org.telegram.ui.ActionBar.k6.f28052o6;
                            org.telegram.ui.ActionBar.r6.Y(k5Var, i16, null);
                            k5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(k5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f45748b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            a00Var = frameLayout2;
                        }
                    } else {
                        a00Var = new org.telegram.ui.Cells.z8(context);
                    }
                } else {
                    a00 a00Var2 = new a00(this.f45165e, context);
                    a00Var2.setOnReorderButtonTouchListener(new fi.n1(6, this, a00Var2));
                    a00Var2.setOnOptionsClick(new a(this, 27));
                    a00Var = a00Var2;
                }
            } else {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751716, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f44144a = imageView2;
                imageView2.f(2131624018, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(X2);
                frameLayout3.addView(textView3, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                a00Var = frameLayout3;
            }
        } else {
            a00Var = new org.telegram.ui.Cells.n4(context);
        }
        return new v4.d1(a00Var);
    }
}

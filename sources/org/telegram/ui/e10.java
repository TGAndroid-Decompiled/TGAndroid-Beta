package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class e10 extends hg.c {
    public final Context d;
    public final FiltersSetupActivity e;

    public e10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.f33342n.size();
    }

    @Override
    public final int d(int i10) {
        c10 c10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 >= filtersSetupActivity.f33342n.size() || (c10Var = (c10) filtersSetupActivity.f33342n.get(i10)) == null) {
                return 3;
            }
            return c10Var.f7681a;
        }
        return 3;
    }

    @Override
    public final void t(s4.c1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e10.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        a10 a10Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                int i15 = 5;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f36955a = textView;
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                                org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (org.telegram.messenger.dd.X) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                textView.setGravity(i11);
                                if (org.telegram.messenger.dd.X) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                frameLayout.addView(textView, w7.b6.d(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f36956b = textView2;
                                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
                                org.telegram.messenger.a30.o(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (org.telegram.messenger.dd.X) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                textView2.setGravity(i13);
                                if (org.telegram.messenger.dd.X) {
                                    i14 = 5;
                                } else {
                                    i14 = 3;
                                }
                                frameLayout.addView(textView2, w7.b6.d(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
                                frameLayout.f36957c = dh0Var;
                                dh0Var.setText(org.telegram.messenger.dd.L0(2131754486, null));
                                org.telegram.ui.ActionBar.a7.V(dh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                                dh0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
                                int i16 = org.telegram.ui.ActionBar.t6.Ci;
                                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                                org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
                                dh0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 14.0f));
                                Drawable background = dh0Var.getBackground();
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
                                dh0Var.setBackground(background);
                                org.telegram.ui.ActionBar.a7.k(dh0Var, background, N, null, null);
                                frameLayout.addView(dh0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new vu(6, this, frameLayout));
                                a10Var = frameLayout;
                            } else {
                                a10Var = new org.telegram.ui.Cells.t8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                            frameLayout2.f37269a = u5Var;
                            u5Var.setTextSize(16);
                            if (!org.telegram.messenger.dd.X) {
                                i15 = 3;
                            }
                            u5Var.setGravity(i15);
                            int i17 = org.telegram.ui.ActionBar.t6.f21135o6;
                            org.telegram.ui.ActionBar.a7.Y(u5Var, i17, null);
                            u5Var.setTag(Integer.valueOf(i17));
                            frameLayout2.addView(u5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f37270b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            a10Var = frameLayout2;
                        }
                    } else {
                        a10Var = new org.telegram.ui.Cells.b9(context);
                    }
                } else {
                    a10 a10Var2 = new a10(this.e, context);
                    a10Var2.setOnReorderButtonTouchListener(new org.telegram.ui.ActionBar.d1(5, this, a10Var2));
                    a10Var2.setOnOptionsClick(new a(this, 27));
                    a10Var = a10Var2;
                }
            } else {
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131751716, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f35900a = imageView2;
                imageView2.f(2131624018, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, w7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(W2);
                frameLayout3.addView(textView3, w7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                a10Var = frameLayout3;
            }
        } else {
            a10Var = new org.telegram.ui.Cells.p4(context);
        }
        return new s4.c1(a10Var);
    }
}

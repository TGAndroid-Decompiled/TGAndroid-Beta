package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p10 extends pg.b {
    public final Context d;
    public final FiltersSetupActivity e;

    public p10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.f33446n.size();
    }

    @Override
    public final int j(int i10) {
        n10 n10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 >= filtersSetupActivity.f33446n.size() || (n10Var = (n10) filtersSetupActivity.f33446n.get(i10)) == null) {
                return 3;
            }
            return n10Var.f44713a;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p10.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        l10 l10Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    int i15 = 3;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f40605a = textView;
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
                                org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (LocaleController.isRTL) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                textView.setGravity(i11);
                                if (LocaleController.isRTL) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f40606b = textView2;
                                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21588z6, null);
                                org.telegram.messenger.sl.u(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (LocaleController.isRTL) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                textView2.setGravity(i13);
                                if (LocaleController.isRTL) {
                                    i14 = 5;
                                } else {
                                    i14 = 3;
                                }
                                frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(context);
                                frameLayout.f40607c = xi0Var;
                                xi0Var.setText(LocaleController.getString(R.string.Add));
                                org.telegram.ui.ActionBar.r6.W(xi0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                xi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false));
                                int i16 = org.telegram.ui.ActionBar.k6.Oh;
                                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                                xi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, x02));
                                Drawable background = xi0Var.getBackground();
                                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i16);
                                xi0Var.setBackground(background);
                                org.telegram.ui.ActionBar.r6.k(xi0Var, background, O, null, null);
                                frameLayout.addView(xi0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.d51(17, this, frameLayout));
                                l10Var = frameLayout;
                            } else {
                                l10Var = new org.telegram.ui.Cells.w8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                            frameLayout2.f40964a = n5Var;
                            n5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            n5Var.setGravity(i15);
                            int i17 = org.telegram.ui.ActionBar.k6.f21386o6;
                            org.telegram.ui.ActionBar.r6.Z(n5Var, i17, null);
                            n5Var.setTag(Integer.valueOf(i17));
                            frameLayout2.addView(n5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f40965b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            l10Var = frameLayout2;
                        }
                    } else {
                        l10Var = new org.telegram.ui.Cells.e9(context);
                    }
                } else {
                    l10 l10Var2 = new l10(this.e, context);
                    l10Var2.setOnReorderButtonTouchListener(new ei.p1(6, this, l10Var2));
                    l10Var2.setOnOptionsClick(new a(this, 28));
                    l10Var = l10Var2;
                }
            } else {
                int i18 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f39355a = imageView2;
                imageView2.f(i18, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                l10Var = frameLayout3;
            }
        } else {
            l10Var = new org.telegram.ui.Cells.l4(context);
        }
        return new s4.b1(l10Var);
    }
}

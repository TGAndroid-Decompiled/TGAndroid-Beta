package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f20 extends ng.b {
    public final Context d;
    public final FiltersSetupActivity e;

    public f20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.f29916n.size();
    }

    @Override
    public final int j(int i10) {
        d20 d20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 >= filtersSetupActivity.f29916n.size() || (d20Var = (d20) filtersSetupActivity.f29916n.get(i10)) == null) {
                return 3;
            }
            return d20Var.f14046a;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f20.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        b20 b20Var;
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
                                frameLayout.f32975a = textView;
                                org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                                textView.setMaxLines(1);
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
                                frameLayout.addView(textView, w7.a6.d(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f32976b = textView2;
                                org.telegram.messenger.em.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false), 1, 13.0f, 1);
                                textView2.setMaxLines(1);
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
                                frameLayout.addView(textView2, w7.a6.d(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(context);
                                frameLayout.f32977c = hi0Var;
                                hi0Var.setText(LocaleController.getString(R.string.Add));
                                hi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                                org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                                hi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
                                frameLayout.addView(hi0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new ow(3, this, frameLayout));
                                b20Var = frameLayout;
                            } else {
                                b20Var = new org.telegram.ui.Cells.x8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
                            frameLayout2.f33248a = l5Var;
                            l5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            l5Var.setGravity(i15);
                            int i16 = org.telegram.ui.ActionBar.j6.f18126o6;
                            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                            l5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(l5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f33249b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            b20Var = frameLayout2;
                        }
                    } else {
                        b20Var = new org.telegram.ui.Cells.f9(context);
                    }
                } else {
                    b20 b20Var2 = new b20(this.e, context);
                    b20Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                    b20Var2.setOnReorderButtonTouchListener(new bi.x1(6, this, b20Var2));
                    b20Var2.setOnOptionsClick(new a(this, 28));
                    b20Var = b20Var2;
                }
            } else {
                int i17 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f31497a = imageView2;
                imageView2.f(i17, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, w7.a6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, w7.a6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                b20Var = frameLayout3;
            }
        } else {
            b20Var = new org.telegram.ui.Cells.m4(context);
        }
        return new s4.c1(b20Var);
    }
}

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
public final class a20 extends cg.c {
    public final Context d;
    public final FiltersSetupActivity f35001e;

    public a20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f35001e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f35001e.f34122n.size();
    }

    @Override
    public final int j(int i10) {
        x10 x10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f35001e;
            if (i10 >= filtersSetupActivity.f34122n.size() || (x10Var = (x10) filtersSetupActivity.f34122n.get(i10)) == null) {
                return 3;
            }
            return x10Var.f2505a;
        }
        return 3;
    }

    @Override
    public final void v(f2.m1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a20.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        v10 v10Var;
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
                                frameLayout.f35326a = textView;
                                b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
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
                                frameLayout.addView(textView, k7.c6.d(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f35327b = textView2;
                                b.q(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false), 1, 13.0f, 1);
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
                                frameLayout.addView(textView2, k7.c6.d(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context);
                                frameLayout.f35328c = gi0Var;
                                gi0Var.setText(LocaleController.getString(R.string.Add));
                                gi0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                                gi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nh, false));
                                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                                org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                                gi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, w02));
                                frameLayout.addView(gi0Var, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.rx0(21, this, frameLayout));
                                v10Var = frameLayout;
                            } else {
                                v10Var = new org.telegram.ui.Cells.s8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
                            frameLayout2.f35668a = l5Var;
                            l5Var.setTextSize(16);
                            if (!LocaleController.isRTL) {
                                i15 = 3;
                            }
                            l5Var.setGravity(i15);
                            int i16 = org.telegram.ui.ActionBar.k6.f21859o6;
                            l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                            l5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(l5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f35669b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            v10Var = frameLayout2;
                        }
                    } else {
                        v10Var = new org.telegram.ui.Cells.a9(context);
                    }
                } else {
                    v10 v10Var2 = new v10(this.f35001e, context);
                    v10Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                    v10Var2.setOnReorderButtonTouchListener(new org.telegram.ui.ActionBar.i1(5, this, v10Var2));
                    v10Var2.setOnOptionsClick(new a(this, 28));
                    v10Var = v10Var2;
                }
            } else {
                int i17 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f42251a = imageView2;
                imageView2.f(i17, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, k7.c6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, k7.c6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                v10Var = frameLayout3;
            }
        } else {
            v10Var = new org.telegram.ui.Cells.m4(context);
        }
        return new f2.m1(v10Var);
    }
}

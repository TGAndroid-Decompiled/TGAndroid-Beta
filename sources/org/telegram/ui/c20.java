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
public final class c20 extends og.b {
    public final Context d;
    public final FiltersSetupActivity e;

    public c20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.f31091n.size();
    }

    @Override
    public final int j(int i10) {
        a20 a20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 >= filtersSetupActivity.f31091n.size() || (a20Var = (a20) filtersSetupActivity.f31091n.get(i10)) == null) {
                return 3;
            }
            return a20Var.f15754a;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c20.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        y10 y10Var;
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
                                frameLayout.f32849a = textView;
                                org.telegram.messenger.qk.t(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
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
                                frameLayout.addView(textView, w7.y5.d(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f32850b = textView2;
                                org.telegram.messenger.qk.t(textView2, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19461z6, false), 1, 13.0f, 1);
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
                                frameLayout.addView(textView2, w7.y5.d(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(context);
                                frameLayout.f32851c = ki0Var;
                                ki0Var.setText(LocaleController.getString(R.string.Add));
                                ki0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                                ki0Var.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Nh, false));
                                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                                org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                                ki0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, w02));
                                frameLayout.addView(ki0Var, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new rv(6, this, frameLayout));
                                y10Var = frameLayout;
                            } else {
                                y10Var = new org.telegram.ui.Cells.w8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                            frameLayout2.f33109a = j5Var;
                            j5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            j5Var.setGravity(i15);
                            int i16 = org.telegram.ui.ActionBar.i6.f19259o6;
                            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                            j5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(j5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f33110b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            y10Var = frameLayout2;
                        }
                    } else {
                        y10Var = new org.telegram.ui.Cells.e9(context);
                    }
                } else {
                    y10 y10Var2 = new y10(this.e, context);
                    y10Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                    y10Var2.setOnReorderButtonTouchListener(new ci.q1(6, this, y10Var2));
                    y10Var2.setOnOptionsClick(new a(this, 28));
                    y10Var = y10Var2;
                }
            } else {
                int i17 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f40377a = imageView2;
                imageView2.f(i17, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, w7.y5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, w7.y5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                y10Var = frameLayout3;
            }
        } else {
            y10Var = new org.telegram.ui.Cells.m4(context);
        }
        return new s4.c1(y10Var);
    }
}

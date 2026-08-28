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
public final class l10 extends wf.b {
    public final Context d;
    public final FiltersSetupActivity f39968e;

    public l10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f39968e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 0 && i9 != 5 && i9 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39968e.f35481n.size();
    }

    @Override
    public final int j(int i9) {
        j10 j10Var;
        if (i9 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f39968e;
            if (i9 >= filtersSetupActivity.f35481n.size() || (j10Var = (j10) filtersSetupActivity.f35481n.get(i9)) == null) {
                return 3;
            }
            return j10Var.f48814a;
        }
        return 3;
    }

    @Override
    public final void v(f2.q1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l10.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        h10 h10Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Context context = this.d;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    int i14 = 3;
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f40294a = textView;
                                org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                                textView.setMaxLines(1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (LocaleController.isRTL) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                textView.setGravity(i10);
                                if (LocaleController.isRTL) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                frameLayout.addView(textView, g7.e6.d(-2, -2.0f, i11, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f40295b = textView2;
                                org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false), 1, 13.0f, 1);
                                textView2.setMaxLines(1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (LocaleController.isRTL) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView2.setGravity(i12);
                                if (LocaleController.isRTL) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, i13, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(context);
                                frameLayout.f40296c = jh0Var;
                                jh0Var.setText(LocaleController.getString(R.string.Add));
                                jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
                                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                                org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                                jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, w02));
                                frameLayout.addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.vh0(23, this, frameLayout));
                                h10Var = frameLayout;
                            } else {
                                h10Var = new org.telegram.ui.Cells.t8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                            frameLayout2.f40577a = h5Var;
                            h5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i14 = 5;
                            }
                            h5Var.setGravity(i14);
                            int i15 = org.telegram.ui.ActionBar.f6.o6;
                            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                            h5Var.setTag(Integer.valueOf(i15));
                            frameLayout2.addView(h5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f40578b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            h10Var = frameLayout2;
                        }
                    } else {
                        h10Var = new org.telegram.ui.Cells.b9(context);
                    }
                } else {
                    h10 h10Var2 = new h10(this.f39968e, context);
                    h10Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                    h10Var2.setOnReorderButtonTouchListener(new kh.r1(6, this, h10Var2));
                    h10Var2.setOnOptionsClick(new a(this, 28));
                    h10Var = h10Var2;
                }
            } else {
                int i16 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f38985a = imageView2;
                imageView2.f(i16, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, g7.e6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, g7.e6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                h10Var = frameLayout3;
            }
        } else {
            h10Var = new org.telegram.ui.Cells.m4(context);
        }
        return new f2.q1(h10Var);
    }
}

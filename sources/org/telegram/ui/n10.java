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
public final class n10 extends zf.b {
    public final Context d;
    public final FiltersSetupActivity f40685e;

    public n10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f40685e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40685e.f35548n.size();
    }

    @Override
    public final int j(int i10) {
        l10 l10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f40685e;
            if (i10 >= filtersSetupActivity.f35548n.size() || (l10Var = (l10) filtersSetupActivity.f35548n.get(i10)) == null) {
                return 3;
            }
            return l10Var.f50845a;
        }
        return 3;
    }

    @Override
    public final void v(f2.n1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n10.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        j10 j10Var;
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
                                frameLayout.f40950a = textView;
                                b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
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
                                frameLayout.addView(textView, i7.f6.d(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f40951b = textView2;
                                b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false), 1, 13.0f, 1);
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
                                frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.th0 th0Var = new org.telegram.ui.Components.th0(context);
                                frameLayout.f40952c = th0Var;
                                th0Var.setText(LocaleController.getString(R.string.Add));
                                th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                                org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                                th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
                                frameLayout.addView(th0Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.fi0(24, this, frameLayout));
                                j10Var = frameLayout;
                            } else {
                                j10Var = new org.telegram.ui.Cells.q8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                            frameLayout2.f41278a = h5Var;
                            h5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            h5Var.setGravity(i15);
                            int i16 = org.telegram.ui.ActionBar.g6.f23260o6;
                            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                            h5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(h5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f41279b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            j10Var = frameLayout2;
                        }
                    } else {
                        j10Var = new org.telegram.ui.Cells.y8(context);
                    }
                } else {
                    j10 j10Var2 = new j10(this.f40685e, context);
                    j10Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                    j10Var2.setOnReorderButtonTouchListener(new nh.o1(6, this, j10Var2));
                    j10Var2.setOnOptionsClick(new a(this, 28));
                    j10Var = j10Var2;
                }
            } else {
                int i17 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f39727a = imageView2;
                imageView2.f(i17, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, i7.f6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, i7.f6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                j10Var = frameLayout3;
            }
        } else {
            j10Var = new org.telegram.ui.Cells.k4(context);
        }
        return new f2.n1(j10Var);
    }
}

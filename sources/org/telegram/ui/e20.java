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
public final class e20 extends og.b {
    public final Context d;
    public final FiltersSetupActivity f36960e;

    public e20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f36960e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36960e.f33602n.size();
    }

    @Override
    public final int j(int i10) {
        c20 c20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f36960e;
            if (i10 >= filtersSetupActivity.f33602n.size() || (c20Var = (c20) filtersSetupActivity.f33602n.get(i10)) == null) {
                return 3;
            }
            return c20Var.f16876a;
        }
        return 3;
    }

    @Override
    public final void v(s4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e20.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        a20 a20Var;
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
                                frameLayout.f37597a = textView;
                                org.telegram.messenger.am.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
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
                                frameLayout.addView(textView, w7.w5.a(-2.0f, 22.0f, 10.0f, 22.0f, 0.0f, -2, i12));
                                TextView textView2 = new TextView(context);
                                frameLayout.f37598b = textView2;
                                org.telegram.messenger.am.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20963z6, false), 1, 13.0f, 1);
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
                                frameLayout.addView(textView2, w7.w5.a(-2.0f, 22.0f, 35.0f, 22.0f, 0.0f, -2, i14));
                                org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(context);
                                frameLayout.f37599c = ej0Var;
                                ej0Var.setText(LocaleController.getString(R.string.Add));
                                ej0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                                ej0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                                org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                                ej0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, x02));
                                frameLayout.addView(ej0Var, w7.w5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new uv(6, this, frameLayout));
                                a20Var = frameLayout;
                            } else {
                                a20Var = new org.telegram.ui.Cells.w8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                            frameLayout2.f37899a = h5Var;
                            h5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            h5Var.setGravity(i15);
                            int i16 = org.telegram.ui.ActionBar.h6.f20762o6;
                            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                            h5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(h5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f37900b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            a20Var = frameLayout2;
                        }
                    } else {
                        a20Var = new org.telegram.ui.Cells.e9(context);
                    }
                } else {
                    a20 a20Var2 = new a20(this.f36960e, context);
                    a20Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                    a20Var2.setOnReorderButtonTouchListener(new ci.p1(6, this, a20Var2));
                    a20Var2.setOnOptionsClick(new a(this, 27));
                    a20Var = a20Var2;
                }
            } else {
                int i17 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f36034a = imageView2;
                imageView2.f(i17, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, w7.w5.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, w7.w5.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
                a20Var = frameLayout3;
            }
        } else {
            a20Var = new org.telegram.ui.Cells.m4(context);
        }
        return new s4.d1(a20Var);
    }
}

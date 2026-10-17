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
public final class n10 extends pg.b {
    public final Context d;
    public final FiltersSetupActivity e;

    public n10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45941f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.f33132n.size();
    }

    @Override
    public final int j(int i10) {
        l10 l10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 >= filtersSetupActivity.f33132n.size() || (l10Var = (l10) filtersSetupActivity.f33132n.get(i10)) == null) {
                return 3;
            }
            return l10Var.f44314a;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n10.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
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
                                frameLayout.f39620a = textView;
                                org.telegram.messenger.wh.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
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
                                frameLayout.addView(textView, w7.z5.a(-2.0f, 22.0f, 10.0f, 22.0f, 0.0f, -2, i12));
                                TextView textView2 = new TextView(context);
                                frameLayout.f39621b = textView2;
                                org.telegram.messenger.wh.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21391z6, false), 1, 13.0f, 1);
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
                                frameLayout.addView(textView2, w7.z5.a(-2.0f, 22.0f, 35.0f, 22.0f, 0.0f, -2, i14));
                                org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(context);
                                frameLayout.f39622c = ti0Var;
                                ti0Var.setText(LocaleController.getString(R.string.Add));
                                ti0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                                ti0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                                org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                                ti0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, x02));
                                frameLayout.addView(ti0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.g51(16, this, frameLayout));
                                j10Var = frameLayout;
                            } else {
                                j10Var = new org.telegram.ui.Cells.v8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                            frameLayout2.f39935a = j5Var;
                            j5Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            j5Var.setGravity(i15);
                            int i16 = org.telegram.ui.ActionBar.h6.f21189o6;
                            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                            j5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(j5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f39936b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            j10Var = frameLayout2;
                        }
                    } else {
                        j10Var = new org.telegram.ui.Cells.d9(context);
                    }
                } else {
                    j10 j10Var2 = new j10(this.e, context);
                    j10Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                    j10Var2.setOnReorderButtonTouchListener(new ei.p1(6, this, j10Var2));
                    j10Var2.setOnOptionsClick(new a(this, 27));
                    j10Var = j10Var2;
                }
            } else {
                int i17 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f38374a = imageView2;
                imageView2.f(i17, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, w7.z5.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, w7.z5.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
                j10Var = frameLayout3;
            }
        } else {
            j10Var = new org.telegram.ui.Cells.l4(context);
        }
        return new s4.b1(j10Var);
    }
}

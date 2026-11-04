package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class c00 extends sg.b {
    public final Context d;
    public final FiltersSetupActivity f44184e;

    public c00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f44184e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 0 && i3 != 5 && i3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f44184e.f41270n.size();
    }

    @Override
    public final int d(int i3) {
        a00 a00Var;
        if (i3 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f44184e;
            if (i3 >= filtersSetupActivity.f41270n.size() || (a00Var = (a00) filtersSetupActivity.f41270n.get(i3)) == null) {
                return 3;
            }
            return a00Var.f54715a;
        }
        return 3;
    }

    @Override
    public final void t(u4.d1 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c00.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        yz yzVar;
        int i10;
        int i11;
        int i12;
        int i13;
        Context context = this.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    int i14 = 3;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f44509a = textView;
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (org.telegram.messenger.bd.f21784a0) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                textView.setGravity(i10);
                                if (org.telegram.messenger.bd.f21784a0) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                frameLayout.addView(textView, b8.mf.d(-2, -2.0f, i11, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f44510b = textView2;
                                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
                                org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (org.telegram.messenger.bd.f21784a0) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView2.setGravity(i12);
                                if (org.telegram.messenger.bd.f21784a0) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, i13, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(context);
                                frameLayout.f44511c = dg0Var;
                                dg0Var.setText(org.telegram.messenger.bd.M0(2131754486, null));
                                org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                                dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
                                int i15 = org.telegram.ui.ActionBar.k6.Ci;
                                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                                org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                                dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
                                Drawable background = dg0Var.getBackground();
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                                dg0Var.setBackground(background);
                                org.telegram.ui.ActionBar.r6.k(dg0Var, background, N, null, null);
                                frameLayout.addView(dg0Var, b8.mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.ux0(19, this, (Object) frameLayout));
                                yzVar = frameLayout;
                            } else {
                                yzVar = new org.telegram.ui.Cells.q8(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                            frameLayout2.f44846a = k5Var;
                            k5Var.setTextSize(16);
                            if (org.telegram.messenger.bd.f21784a0) {
                                i14 = 5;
                            }
                            k5Var.setGravity(i14);
                            int i16 = org.telegram.ui.ActionBar.k6.f28081o6;
                            org.telegram.ui.ActionBar.r6.Y(k5Var, i16, null);
                            k5Var.setTag(Integer.valueOf(i16));
                            frameLayout2.addView(k5Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f44847b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            yzVar = frameLayout2;
                        }
                    } else {
                        yzVar = new org.telegram.ui.Cells.y8(context);
                    }
                } else {
                    yz yzVar2 = new yz(this.f44184e, context);
                    yzVar2.setOnReorderButtonTouchListener(new gi.n1(6, this, yzVar2));
                    yzVar2.setOnOptionsClick(new a(this, 27));
                    yzVar = yzVar2;
                }
            } else {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751716, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f52766a = imageView2;
                imageView2.f(2131624018, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, b8.mf.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 26));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(X2);
                frameLayout3.addView(textView3, b8.mf.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                yzVar = frameLayout3;
            }
        } else {
            yzVar = new org.telegram.ui.Cells.n4(context);
        }
        return new u4.d1(yzVar);
    }
}

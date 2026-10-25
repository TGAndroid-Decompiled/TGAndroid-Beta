package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b51 extends org.telegram.ui.Components.lm0 {
    public final c61 f37977c;

    public b51(c61 c61Var) {
        this.f37977c = c61Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37977c.f38323u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f37977c.f38325v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        c61 c61Var = this.f37977c;
        if (i10 == c61Var.f38278a) {
            return 7;
        }
        if (i10 < c61Var.f38281b || i10 >= c61Var.f38284c) {
            if (i10 < c61Var.d || i10 >= c61Var.e) {
                if (i10 >= c61Var.E && i10 < c61Var.F) {
                    return 1;
                }
                if (i10 >= c61Var.f38315r && i10 < c61Var.f38318s) {
                    return 3;
                }
                if (c61Var.f38334y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (c61Var.f38336z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == c61Var.v) {
                    return 6;
                }
                if (c61Var.f38328w0.indexOfKey(i10) < 0 && i10 != c61Var.f38291f && i10 != c61Var.f38333y && i10 != c61Var.f38306n && i10 != c61Var.h && i10 != c61Var.f38330x) {
                    if (i10 != c61Var.f38327w) {
                        return 3;
                    }
                    return 8;
                }
                return 0;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b51.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bn0 bn0Var;
        int o10;
        c61 c61Var = this.f37977c;
        int i11 = c61Var.W;
        org.telegram.ui.ActionBar.u6 u6Var = c61Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = c61Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            bn0Var = new h51(c61Var, context, z10);
        } else if (i10 == 2) {
            bn0Var = new ImageView(c61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = c61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f39551a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (c61Var.f38295g1) {
                    o10 = org.telegram.ui.ActionBar.y6.v(c61Var.f38293f1, org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Te, false), 99);
                }
                if (c61Var.f38295g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), o10));
                } else {
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), o10);
                    org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Te, 99);
                    textView.setBackground(c02);
                    org.telegram.ui.ActionBar.f7.k(textView, c02, h, null, null);
                }
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                bn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(c61Var.getContext());
                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f39271b = y3Var;
                y3Var.b(0.3f, 250L, org.telegram.ui.Components.ds.h);
                y3Var.setTextSize(AndroidUtilities.dp(14.0f));
                y3Var.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.ActionBar.f7.Z(y3Var, org.telegram.ui.ActionBar.y6.Sh, u6Var);
                y3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f39270a = frameLayout3;
                int i12 = org.telegram.ui.ActionBar.y6.Oh;
                org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i12);
                frameLayout3.setBackground(e);
                org.telegram.ui.ActionBar.f7.k(frameLayout3, e, N, f7, u6Var);
                frameLayout3.addView(y3Var, org.telegram.ui.Components.gb1.i(-1, -2, 17));
                frameLayout2.addView(frameLayout3, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                tg.p0 p0Var = new tg.p0(frameLayout2.getContext(), u6Var, false);
                frameLayout2.f39272c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                bn0Var = frameLayout2;
            } else if (i10 == 6) {
                bn0 bn0Var2 = new bn0(c61Var.getContext(), 2);
                bn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    bn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    bn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    bn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                bn0Var2.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(bn0Var2, org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
                bn0Var = bn0Var2;
            } else if (i10 == 7) {
                View x3Var = new org.telegram.ui.Cells.x3(c61Var.getContext(), 52);
                x3Var.setTag("searchbox");
                bn0Var = x3Var;
            } else {
                bn0Var = new l51(c61Var, c61Var.getContext());
            }
        } else {
            l51 l51Var = new l51(c61Var, c61Var.getContext());
            if (i10 == 8) {
                l51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(l51Var);
                l51Var.h = imageReceiver;
                l51Var.f41143r = imageReceiver;
                imageReceiver.setImageBitmap(c61Var.N);
                c61Var.O = l51Var;
                l51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            bn0Var = l51Var;
        }
        if (c61.c(c61Var)) {
            bn0Var.setScaleX(0.0f);
            bn0Var.setScaleY(0.0f);
        }
        return new s4.e1(bn0Var);
    }
}

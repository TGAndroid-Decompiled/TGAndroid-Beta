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
public final class a51 extends org.telegram.ui.Components.lm0 {
    public final b61 f35575c;

    public a51(b61 b61Var) {
        this.f35575c = b61Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f35575c.f35932u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f35575c.f35934v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        b61 b61Var = this.f35575c;
        if (i10 == b61Var.f35887a) {
            return 7;
        }
        if (i10 < b61Var.f35890b || i10 >= b61Var.f35893c) {
            if (i10 < b61Var.d || i10 >= b61Var.e) {
                if (i10 >= b61Var.E && i10 < b61Var.F) {
                    return 1;
                }
                if (i10 >= b61Var.f35924r && i10 < b61Var.f35927s) {
                    return 3;
                }
                if (b61Var.f35943y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (b61Var.f35945z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == b61Var.v) {
                    return 6;
                }
                if (b61Var.f35937w0.indexOfKey(i10) < 0 && i10 != b61Var.f35900f && i10 != b61Var.f35942y && i10 != b61Var.f35915n && i10 != b61Var.h && i10 != b61Var.f35939x) {
                    if (i10 != b61Var.f35936w) {
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
    public final void v(s4.b1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a51.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        tm0 tm0Var;
        int o10;
        b61 b61Var = this.f35575c;
        int i11 = b61Var.W;
        org.telegram.ui.ActionBar.g6 g6Var = b61Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = b61Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            tm0Var = new g51(b61Var, context, z10);
        } else if (i10 == 2) {
            tm0Var = new ImageView(b61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = b61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f37221a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (b61Var.f35904g1) {
                    o10 = org.telegram.ui.ActionBar.k6.v(b61Var.f35902f1, org.telegram.ui.ActionBar.k6.o1(0.4f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Te, false), 99);
                }
                if (b61Var.f35904g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(11.0f), o10));
                } else {
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(11.0f), o10);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Te, 99);
                    textView.setBackground(c02);
                    org.telegram.ui.ActionBar.r6.k(textView, c02, h, null, null);
                }
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                tm0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(b61Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f36822b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.bs.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.ActionBar.r6.a0(t3Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f36821a = frameLayout3;
                int i12 = org.telegram.ui.ActionBar.k6.Oh;
                org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                org.telegram.ui.ActionBar.n6 f7 = org.telegram.ui.ActionBar.r6.f(i12);
                frameLayout3.setBackground(e);
                org.telegram.ui.ActionBar.r6.k(frameLayout3, e, O, f7, g6Var);
                frameLayout3.addView(t3Var, w7.z5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.z5.c(-1.0f, -1));
                sg.p0 p0Var = new sg.p0(frameLayout2.getContext(), g6Var, false);
                frameLayout2.f36823c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.z5.c(-1.0f, -1));
                tm0Var = frameLayout2;
            } else if (i10 == 6) {
                tm0 tm0Var2 = new tm0(b61Var.getContext(), 2);
                tm0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    tm0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    tm0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    tm0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                tm0Var2.setGravity(17);
                org.telegram.ui.ActionBar.r6.W(tm0Var2, org.telegram.ui.ActionBar.k6.f21571y6, g6Var);
                tm0Var = tm0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(b61Var.getContext(), 52);
                s3Var.setTag("searchbox");
                tm0Var = s3Var;
            } else {
                tm0Var = new k51(b61Var, b61Var.getContext());
            }
        } else {
            k51 k51Var = new k51(b61Var, b61Var.getContext());
            if (i10 == 8) {
                k51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(k51Var);
                k51Var.h = imageReceiver;
                k51Var.f38827r = imageReceiver;
                imageReceiver.setImageBitmap(b61Var.N);
                b61Var.O = k51Var;
                k51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            tm0Var = k51Var;
        }
        if (b61.c(b61Var)) {
            tm0Var.setScaleX(0.0f);
            tm0Var.setScaleY(0.0f);
        }
        return new s4.b1(tm0Var);
    }
}

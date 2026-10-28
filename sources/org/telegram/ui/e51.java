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
public final class e51 extends org.telegram.ui.Components.mm0 {
    public final f61 f38761c;

    public e51(f61 f61Var) {
        this.f38761c = f61Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38761c.f39229u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f38761c.f39231v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        f61 f61Var = this.f38761c;
        if (i10 == f61Var.f39184a) {
            return 7;
        }
        if (i10 < f61Var.f39187b || i10 >= f61Var.f39190c) {
            if (i10 < f61Var.d || i10 >= f61Var.e) {
                if (i10 >= f61Var.E && i10 < f61Var.F) {
                    return 1;
                }
                if (i10 >= f61Var.f39221r && i10 < f61Var.f39224s) {
                    return 3;
                }
                if (f61Var.f39240y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (f61Var.f39242z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == f61Var.v) {
                    return 6;
                }
                if (f61Var.f39234w0.indexOfKey(i10) < 0 && i10 != f61Var.f39197f && i10 != f61Var.f39239y && i10 != f61Var.f39212n && i10 != f61Var.h && i10 != f61Var.f39236x) {
                    if (i10 != f61Var.f39233w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        dn0 dn0Var;
        int o10;
        f61 f61Var = this.f38761c;
        int i11 = f61Var.W;
        org.telegram.ui.ActionBar.u6 u6Var = f61Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = f61Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            dn0Var = new k51(f61Var, context, z10);
        } else if (i10 == 2) {
            dn0Var = new ImageView(f61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = f61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f40443a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (f61Var.f39201g1) {
                    o10 = org.telegram.ui.ActionBar.y6.v(f61Var.f39199f1, org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Te, false), 99);
                }
                if (f61Var.f39201g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), o10));
                } else {
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(11.0f), o10);
                    org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Te, 99);
                    textView.setBackground(c02);
                    org.telegram.ui.ActionBar.f7.k(textView, c02, h, null, null);
                }
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, org.telegram.ui.Components.kb1.i(-2, -2, 17));
                dn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(f61Var.getContext());
                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f40048b = y3Var;
                y3Var.b(0.3f, 250L, org.telegram.ui.Components.ds.h);
                y3Var.setTextSize(AndroidUtilities.dp(14.0f));
                y3Var.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.ActionBar.f7.Z(y3Var, org.telegram.ui.ActionBar.y6.Sh, u6Var);
                y3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f40047a = frameLayout3;
                int i12 = org.telegram.ui.ActionBar.y6.Oh;
                org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i12);
                frameLayout3.setBackground(e);
                org.telegram.ui.ActionBar.f7.k(frameLayout3, e, N, f7, u6Var);
                frameLayout3.addView(y3Var, org.telegram.ui.Components.kb1.i(-1, -2, 17));
                frameLayout2.addView(frameLayout3, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                tg.p0 p0Var = new tg.p0(frameLayout2.getContext(), u6Var, false);
                frameLayout2.f40049c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                dn0Var = frameLayout2;
            } else if (i10 == 6) {
                dn0 dn0Var2 = new dn0(f61Var.getContext(), 2);
                dn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    dn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    dn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    dn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                dn0Var2.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(dn0Var2, org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
                dn0Var = dn0Var2;
            } else if (i10 == 7) {
                View x3Var = new org.telegram.ui.Cells.x3(f61Var.getContext(), 52);
                x3Var.setTag("searchbox");
                dn0Var = x3Var;
            } else {
                dn0Var = new o51(f61Var, f61Var.getContext());
            }
        } else {
            o51 o51Var = new o51(f61Var, f61Var.getContext());
            if (i10 == 8) {
                o51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(o51Var);
                o51Var.h = imageReceiver;
                o51Var.f41979r = imageReceiver;
                imageReceiver.setImageBitmap(f61Var.N);
                f61Var.O = o51Var;
                o51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            dn0Var = o51Var;
        }
        if (f61.c(f61Var)) {
            dn0Var.setScaleX(0.0f);
            dn0Var.setScaleY(0.0f);
        }
        return new s4.e1(dn0Var);
    }
}

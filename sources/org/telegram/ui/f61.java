package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f61 extends org.telegram.ui.Components.kl0 {
    public final g71 f33496c;

    public f61(g71 g71Var) {
        this.f33496c = g71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42678f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33496c.f33823u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f33496c.f33825v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        g71 g71Var = this.f33496c;
        if (i10 == g71Var.f33778a) {
            return 7;
        }
        if (i10 < g71Var.f33781b || i10 >= g71Var.f33784c) {
            if (i10 < g71Var.d || i10 >= g71Var.e) {
                if (i10 >= g71Var.E && i10 < g71Var.F) {
                    return 1;
                }
                if (i10 >= g71Var.f33815r && i10 < g71Var.f33818s) {
                    return 3;
                }
                if (g71Var.f33834y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (g71Var.f33836z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == g71Var.v) {
                    return 6;
                }
                if (g71Var.f33828w0.indexOfKey(i10) < 0 && i10 != g71Var.f33791f && i10 != g71Var.f33833y && i10 != g71Var.f33806n && i10 != g71Var.h && i10 != g71Var.f33830x) {
                    if (i10 != g71Var.f33827w) {
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
    public final void v(s4.c1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f61.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hn0 hn0Var;
        int k10;
        g71 g71Var = this.f33496c;
        int i11 = g71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = g71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = g71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            hn0Var = new l61(g71Var, context, z10);
        } else if (i10 == 2) {
            hn0Var = new ImageView(g71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = g71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35047a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (g71Var.f33795g1) {
                    k10 = org.telegram.ui.ActionBar.i6.v(g71Var.f33793f1, org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                hn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(g71Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f34819b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f34818a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
                frameLayout3.addView(t3Var, w7.x5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.x5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), e6Var, false);
                frameLayout2.f34820c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.x5.c(-1.0f, -1));
                hn0Var = frameLayout2;
            } else if (i10 == 6) {
                hn0 hn0Var2 = new hn0(g71Var.getContext(), 2);
                hn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    hn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    hn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    hn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                hn0Var2.setGravity(17);
                hn0Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19218y6, e6Var));
                hn0Var = hn0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(g71Var.getContext(), 52);
                s3Var.setTag("searchbox");
                hn0Var = s3Var;
            } else {
                hn0Var = new p61(g71Var, g71Var.getContext());
            }
        } else {
            p61 p61Var = new p61(g71Var, g71Var.getContext());
            if (i10 == 8) {
                p61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(p61Var);
                p61Var.h = imageReceiver;
                p61Var.f36449r = imageReceiver;
                imageReceiver.setImageBitmap(g71Var.N);
                g71Var.O = p61Var;
                p61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            hn0Var = p61Var;
        }
        if (g71.c(g71Var)) {
            hn0Var.setScaleX(0.0f);
            hn0Var.setScaleY(0.0f);
        }
        return new s4.c1(hn0Var);
    }
}

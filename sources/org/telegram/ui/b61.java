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
public final class b61 extends org.telegram.ui.Components.xl0 {
    public final c71 f32250c;

    public b61(c71 c71Var) {
        this.f32250c = c71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32250c.f32612u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f32250c.f32614v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        c71 c71Var = this.f32250c;
        if (i10 == c71Var.f32567a) {
            return 7;
        }
        if (i10 < c71Var.f32570b || i10 >= c71Var.f32573c) {
            if (i10 < c71Var.d || i10 >= c71Var.e) {
                if (i10 >= c71Var.E && i10 < c71Var.F) {
                    return 1;
                }
                if (i10 >= c71Var.f32604r && i10 < c71Var.f32607s) {
                    return 3;
                }
                if (c71Var.f32623y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (c71Var.f32625z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == c71Var.v) {
                    return 6;
                }
                if (c71Var.f32617w0.indexOfKey(i10) < 0 && i10 != c71Var.f32580f && i10 != c71Var.f32622y && i10 != c71Var.f32595n && i10 != c71Var.h && i10 != c71Var.f32619x) {
                    if (i10 != c71Var.f32616w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b61.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cn0 cn0Var;
        int k10;
        c71 c71Var = this.f32250c;
        int i11 = c71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = c71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = c71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            cn0Var = new h61(c71Var, context, z10);
        } else if (i10 == 2) {
            cn0Var = new ImageView(c71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = c71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f33833a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (c71Var.f32584g1) {
                    k10 = org.telegram.ui.ActionBar.i6.v(c71Var.f32582f1, org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                cn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(c71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f33440b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.sr.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f33439a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
                frameLayout3.addView(u3Var, w7.y5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), e6Var, false);
                frameLayout2.f33441c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                cn0Var = frameLayout2;
            } else if (i10 == 6) {
                cn0 cn0Var2 = new cn0(c71Var.getContext(), 2);
                cn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    cn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    cn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    cn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                cn0Var2.setGravity(17);
                cn0Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19442y6, e6Var));
                cn0Var = cn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(c71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                cn0Var = t3Var;
            } else {
                cn0Var = new l61(c71Var, c71Var.getContext());
            }
        } else {
            l61 l61Var = new l61(c71Var, c71Var.getContext());
            if (i10 == 8) {
                l61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(l61Var);
                l61Var.h = imageReceiver;
                l61Var.f35260r = imageReceiver;
                imageReceiver.setImageBitmap(c71Var.N);
                c71Var.O = l61Var;
                l61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            cn0Var = l61Var;
        }
        if (c71.c(c71Var)) {
            cn0Var.setScaleX(0.0f);
            cn0Var.setScaleY(0.0f);
        }
        return new s4.c1(cn0Var);
    }
}

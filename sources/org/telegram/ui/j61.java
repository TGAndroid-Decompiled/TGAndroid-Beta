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
public final class j61 extends org.telegram.ui.Components.pm0 {
    public final k71 f38837c;

    public j61(k71 k71Var) {
        this.f38837c = k71Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38837c.f39157u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f38837c.f39159v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        k71 k71Var = this.f38837c;
        if (i10 == k71Var.f39111a) {
            return 7;
        }
        if (i10 < k71Var.f39114b || i10 >= k71Var.f39117c) {
            if (i10 < k71Var.d || i10 >= k71Var.f39122e) {
                if (i10 >= k71Var.E && i10 < k71Var.F) {
                    return 1;
                }
                if (i10 >= k71Var.f39149r && i10 < k71Var.f39152s) {
                    return 3;
                }
                if (k71Var.f39168y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (k71Var.f39170z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == k71Var.v) {
                    return 6;
                }
                if (k71Var.f39162w0.indexOfKey(i10) < 0 && i10 != k71Var.f39125f && i10 != k71Var.f39167y && i10 != k71Var.f39140n && i10 != k71Var.h && i10 != k71Var.f39164x) {
                    if (i10 != k71Var.f39161w) {
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
    public final void v(s4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j61.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gn0 gn0Var;
        int k10;
        k71 k71Var = this.f38837c;
        int i11 = k71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = k71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = k71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            gn0Var = new p61(k71Var, context, z10);
        } else if (i10 == 2) {
            gn0Var = new ImageView(k71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = k71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f40420a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (k71Var.f39129g1) {
                    k10 = org.telegram.ui.ActionBar.i6.v(k71Var.f39127f1, org.telegram.ui.ActionBar.i6.m1(0.4f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                gn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(k71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f40083b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.hs.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f40082a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
                frameLayout3.addView(u3Var, w7.x5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.x5.d(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), e6Var, false);
                frameLayout2.f40084c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.x5.d(-1.0f, -1));
                gn0Var = frameLayout2;
            } else if (i10 == 6) {
                gn0 gn0Var2 = new gn0(k71Var.getContext(), 2);
                gn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    gn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    gn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    gn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                gn0Var2.setGravity(17);
                gn0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var));
                gn0Var = gn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(k71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                gn0Var = t3Var;
            } else {
                gn0Var = new t61(k71Var, k71Var.getContext());
            }
        } else {
            t61 t61Var = new t61(k71Var, k71Var.getContext());
            if (i10 == 8) {
                t61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(t61Var);
                t61Var.h = imageReceiver;
                t61Var.f41874r = imageReceiver;
                imageReceiver.setImageBitmap(k71Var.N);
                k71Var.O = t61Var;
                t61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            gn0Var = t61Var;
        }
        if (k71.c(k71Var)) {
            gn0Var.setScaleX(0.0f);
            gn0Var.setScaleY(0.0f);
        }
        return new s4.d1(gn0Var);
    }
}

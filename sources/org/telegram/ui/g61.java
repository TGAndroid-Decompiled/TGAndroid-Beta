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
public final class g61 extends org.telegram.ui.Components.kl0 {
    public final h71 f33783c;

    public g61(h71 h71Var) {
        this.f33783c = h71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33783c.f34159u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f33783c.f34161v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        h71 h71Var = this.f33783c;
        if (i10 == h71Var.f34114a) {
            return 7;
        }
        if (i10 < h71Var.f34117b || i10 >= h71Var.f34120c) {
            if (i10 < h71Var.d || i10 >= h71Var.e) {
                if (i10 >= h71Var.E && i10 < h71Var.F) {
                    return 1;
                }
                if (i10 >= h71Var.f34151r && i10 < h71Var.f34154s) {
                    return 3;
                }
                if (h71Var.f34170y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (h71Var.f34172z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == h71Var.v) {
                    return 6;
                }
                if (h71Var.f34164w0.indexOfKey(i10) < 0 && i10 != h71Var.f34127f && i10 != h71Var.f34169y && i10 != h71Var.f34142n && i10 != h71Var.h && i10 != h71Var.f34166x) {
                    if (i10 != h71Var.f34163w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g61.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hn0 hn0Var;
        int k10;
        h71 h71Var = this.f33783c;
        int i11 = h71Var.W;
        org.telegram.ui.ActionBar.e6 e6Var = h71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = h71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            hn0Var = new m61(h71Var, context, z10);
        } else if (i10 == 2) {
            hn0Var = new ImageView(h71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = h71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35331a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (h71Var.f34131g1) {
                    k10 = org.telegram.ui.ActionBar.i6.v(h71Var.f34129f1, org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                hn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(h71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35068b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35067a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
                frameLayout3.addView(u3Var, w7.x5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.x5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), e6Var, false);
                frameLayout2.f35069c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.x5.c(-1.0f, -1));
                hn0Var = frameLayout2;
            } else if (i10 == 6) {
                hn0 hn0Var2 = new hn0(h71Var.getContext(), 2);
                hn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    hn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    hn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    hn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                hn0Var2.setGravity(17);
                hn0Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19215y6, e6Var));
                hn0Var = hn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(h71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                hn0Var = t3Var;
            } else {
                hn0Var = new q61(h71Var, h71Var.getContext());
            }
        } else {
            q61 q61Var = new q61(h71Var, h71Var.getContext());
            if (i10 == 8) {
                q61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(q61Var);
                q61Var.h = imageReceiver;
                q61Var.f36773r = imageReceiver;
                imageReceiver.setImageBitmap(h71Var.N);
                h71Var.O = q61Var;
                q61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            hn0Var = q61Var;
        }
        if (h71.c(h71Var)) {
            hn0Var.setScaleX(0.0f);
            hn0Var.setScaleY(0.0f);
        }
        return new s4.c1(hn0Var);
    }
}

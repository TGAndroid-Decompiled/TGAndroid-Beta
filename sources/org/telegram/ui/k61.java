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
public final class k61 extends org.telegram.ui.Components.ul0 {
    public final l71 f34244c;

    public k61(l71 l71Var) {
        this.f34244c = l71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34244c.f34597u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f34244c.f34599v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        l71 l71Var = this.f34244c;
        if (i10 == l71Var.f34552a) {
            return 7;
        }
        if (i10 < l71Var.f34555b || i10 >= l71Var.f34558c) {
            if (i10 < l71Var.d || i10 >= l71Var.e) {
                if (i10 >= l71Var.E && i10 < l71Var.F) {
                    return 1;
                }
                if (i10 >= l71Var.f34589r && i10 < l71Var.f34592s) {
                    return 3;
                }
                if (l71Var.f34608y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (l71Var.f34610z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == l71Var.v) {
                    return 6;
                }
                if (l71Var.f34602w0.indexOfKey(i10) < 0 && i10 != l71Var.f34565f && i10 != l71Var.f34607y && i10 != l71Var.f34580n && i10 != l71Var.h && i10 != l71Var.f34604x) {
                    if (i10 != l71Var.f34601w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k61.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hn0 hn0Var;
        int k10;
        l71 l71Var = this.f34244c;
        int i11 = l71Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = l71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = l71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            hn0Var = new q61(l71Var, context, z10);
        } else if (i10 == 2) {
            hn0Var = new ImageView(l71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = l71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35690a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (l71Var.f34569g1) {
                    k10 = org.telegram.ui.ActionBar.j6.v(l71Var.f34567f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.a6.e(-2, -2, 17));
                hn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(l71Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35404b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.wr.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35403a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
                frameLayout3.addView(t3Var, w7.a6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.a6.c(-1.0f, -1));
                qg.s0 s0Var = new qg.s0(frameLayout2.getContext(), f6Var, false);
                frameLayout2.f35405c = s0Var;
                s0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(s0Var, w7.a6.c(-1.0f, -1));
                hn0Var = frameLayout2;
            } else if (i10 == 6) {
                hn0 hn0Var2 = new hn0(l71Var.getContext(), 1);
                hn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    hn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    hn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    hn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                hn0Var2.setGravity(17);
                hn0Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
                hn0Var = hn0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(l71Var.getContext(), 52);
                s3Var.setTag("searchbox");
                hn0Var = s3Var;
            } else {
                hn0Var = new u61(l71Var, l71Var.getContext());
            }
        } else {
            u61 u61Var = new u61(l71Var, l71Var.getContext());
            if (i10 == 8) {
                u61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(u61Var);
                u61Var.h = imageReceiver;
                u61Var.f37132r = imageReceiver;
                imageReceiver.setImageBitmap(l71Var.N);
                l71Var.O = u61Var;
                u61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            hn0Var = u61Var;
        }
        if (l71.c(l71Var)) {
            hn0Var.setScaleX(0.0f);
            hn0Var.setScaleY(0.0f);
        }
        return new s4.c1(hn0Var);
    }
}

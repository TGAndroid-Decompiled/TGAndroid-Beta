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
public final class i61 extends org.telegram.ui.Components.xl0 {
    public final j71 f34487c;

    public i61(j71 j71Var) {
        this.f34487c = j71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42998f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34487c.f34844u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f34487c.f34846v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        j71 j71Var = this.f34487c;
        if (i10 == j71Var.f34799a) {
            return 7;
        }
        if (i10 < j71Var.f34802b || i10 >= j71Var.f34805c) {
            if (i10 < j71Var.d || i10 >= j71Var.e) {
                if (i10 >= j71Var.E && i10 < j71Var.F) {
                    return 1;
                }
                if (i10 >= j71Var.f34836r && i10 < j71Var.f34839s) {
                    return 3;
                }
                if (j71Var.f34855y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (j71Var.f34857z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == j71Var.v) {
                    return 6;
                }
                if (j71Var.f34849w0.indexOfKey(i10) < 0 && i10 != j71Var.f34812f && i10 != j71Var.f34854y && i10 != j71Var.f34827n && i10 != j71Var.h && i10 != j71Var.f34851x) {
                    if (i10 != j71Var.f34848w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i61.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        in0 in0Var;
        int k10;
        j71 j71Var = this.f34487c;
        int i11 = j71Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = j71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = j71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            in0Var = new o61(j71Var, context, z10);
        } else if (i10 == 2) {
            in0Var = new ImageView(j71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = j71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35920a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (j71Var.f34816g1) {
                    k10 = org.telegram.ui.ActionBar.j6.v(j71Var.f34814f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                in0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(j71Var.getContext());
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35640b = v3Var;
                v3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
                v3Var.setTextSize(AndroidUtilities.dp(14.0f));
                v3Var.setTypeface(AndroidUtilities.bold());
                v3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
                v3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35639a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
                frameLayout3.addView(v3Var, w7.y5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), f6Var, false);
                frameLayout2.f35641c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                in0Var = frameLayout2;
            } else if (i10 == 6) {
                in0 in0Var2 = new in0(j71Var.getContext(), 2);
                in0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    in0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    in0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    in0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                in0Var2.setGravity(17);
                in0Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19492y6, f6Var));
                in0Var = in0Var2;
            } else if (i10 == 7) {
                View u3Var = new org.telegram.ui.Cells.u3(j71Var.getContext(), 52);
                u3Var.setTag("searchbox");
                in0Var = u3Var;
            } else {
                in0Var = new s61(j71Var, j71Var.getContext());
            }
        } else {
            s61 s61Var = new s61(j71Var, j71Var.getContext());
            if (i10 == 8) {
                s61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(s61Var);
                s61Var.h = imageReceiver;
                s61Var.f37333r = imageReceiver;
                imageReceiver.setImageBitmap(j71Var.N);
                j71Var.O = s61Var;
                s61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            in0Var = s61Var;
        }
        if (j71.c(j71Var)) {
            in0Var.setScaleX(0.0f);
            in0Var.setScaleY(0.0f);
        }
        return new s4.c1(in0Var);
    }
}

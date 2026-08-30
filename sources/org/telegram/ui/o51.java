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
public final class o51 extends org.telegram.ui.Components.rl0 {
    public final q61 f36795c;

    public o51(q61 q61Var) {
        this.f36795c = q61Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36795c.f37632r0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f36795c.f37635s0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        q61 q61Var = this.f36795c;
        if (i10 == q61Var.f37594a) {
            return 7;
        }
        if (i10 < q61Var.f37597b || i10 >= q61Var.f37600c) {
            if (i10 < q61Var.d || i10 >= q61Var.e) {
                if (i10 >= q61Var.B && i10 < q61Var.C) {
                    return 1;
                }
                if (i10 >= q61Var.f37631r && i10 < q61Var.f37634s) {
                    return 3;
                }
                if (q61Var.f37641v0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (q61Var.f37644w0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == q61Var.v) {
                    return 6;
                }
                if (q61Var.f37637t0.indexOfKey(i10) < 0 && i10 != q61Var.f37607f && i10 != q61Var.f37649y && i10 != q61Var.f37622n && i10 != q61Var.h && i10 != q61Var.f37646x) {
                    if (i10 != q61Var.f37643w) {
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
    public final void v(f2.l1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o51.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        wm0 wm0Var;
        int k10;
        q61 q61Var = this.f36795c;
        int i11 = q61Var.T;
        org.telegram.ui.ActionBar.f6 f6Var = q61Var.W0;
        boolean z4 = false;
        if (i10 == 0) {
            Context context = q61Var.getContext();
            if (i11 == 6) {
                z4 = true;
            }
            wm0Var = new u51(q61Var, context, z4);
        } else if (i10 == 2) {
            wm0Var = new ImageView(q61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = q61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f38556a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (q61Var.f37604d1) {
                    k10 = org.telegram.ui.ActionBar.j6.v(q61Var.f37602c1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, k7.b6.e(-2, -2, 17));
                wm0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(q61Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f38198b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.nr.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f38197a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
                frameLayout3.addView(t3Var, k7.b6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, k7.b6.c(-1.0f, -1));
                eg.c1 c1Var = new eg.c1(frameLayout2.getContext(), f6Var, false);
                frameLayout2.f38199c = c1Var;
                c1Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(c1Var, k7.b6.c(-1.0f, -1));
                wm0Var = frameLayout2;
            } else if (i10 == 6) {
                wm0 wm0Var2 = new wm0(q61Var.getContext(), 1);
                wm0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    wm0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    wm0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    wm0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                wm0Var2.setGravity(17);
                wm0Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
                wm0Var = wm0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(q61Var.getContext(), 52);
                s3Var.setTag("searchbox");
                wm0Var = s3Var;
            } else {
                wm0Var = new y51(q61Var, q61Var.getContext());
            }
        } else {
            y51 y51Var = new y51(q61Var, q61Var.getContext());
            if (i10 == 8) {
                y51Var.N = true;
                ImageReceiver imageReceiver = new ImageReceiver(y51Var);
                y51Var.h = imageReceiver;
                y51Var.f40404r = imageReceiver;
                imageReceiver.setImageBitmap(q61Var.K);
                q61Var.L = y51Var;
                y51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            wm0Var = y51Var;
        }
        if (q61.c(q61Var)) {
            wm0Var.setScaleX(0.0f);
            wm0Var.setScaleY(0.0f);
        }
        return new f2.l1(wm0Var);
    }
}

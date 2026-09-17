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
public final class h61 extends org.telegram.ui.Components.ll0 {
    public final i71 f34192c;

    public h61(i71 i71Var) {
        this.f34192c = i71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34192c.f34488u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f34192c.f34490v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        i71 i71Var = this.f34192c;
        if (i10 == i71Var.f34443a) {
            return 7;
        }
        if (i10 < i71Var.f34446b || i10 >= i71Var.f34449c) {
            if (i10 < i71Var.d || i10 >= i71Var.e) {
                if (i10 >= i71Var.E && i10 < i71Var.F) {
                    return 1;
                }
                if (i10 >= i71Var.f34480r && i10 < i71Var.f34483s) {
                    return 3;
                }
                if (i71Var.f34499y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (i71Var.f34501z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == i71Var.v) {
                    return 6;
                }
                if (i71Var.f34493w0.indexOfKey(i10) < 0 && i10 != i71Var.f34456f && i10 != i71Var.f34498y && i10 != i71Var.f34471n && i10 != i71Var.h && i10 != i71Var.f34495x) {
                    if (i10 != i71Var.f34492w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h61.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jn0 jn0Var;
        int k10;
        i71 i71Var = this.f34192c;
        int i11 = i71Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = i71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = i71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            jn0Var = new n61(i71Var, context, z10);
        } else if (i10 == 2) {
            jn0Var = new ImageView(i71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = i71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35695a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (i71Var.f34460g1) {
                    k10 = org.telegram.ui.ActionBar.j6.v(i71Var.f34458f1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                jn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(i71Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35464b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.qr.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35463a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
                frameLayout3.addView(t3Var, w7.x5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.x5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), f6Var, false);
                frameLayout2.f35465c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.x5.c(-1.0f, -1));
                jn0Var = frameLayout2;
            } else if (i10 == 6) {
                jn0 jn0Var2 = new jn0(i71Var.getContext(), 2);
                jn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    jn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    jn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    jn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                jn0Var2.setGravity(17);
                jn0Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19244y6, f6Var));
                jn0Var = jn0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(i71Var.getContext(), 52);
                s3Var.setTag("searchbox");
                jn0Var = s3Var;
            } else {
                jn0Var = new r61(i71Var, i71Var.getContext());
            }
        } else {
            r61 r61Var = new r61(i71Var, i71Var.getContext());
            if (i10 == 8) {
                r61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(r61Var);
                r61Var.h = imageReceiver;
                r61Var.f37098r = imageReceiver;
                imageReceiver.setImageBitmap(i71Var.N);
                i71Var.O = r61Var;
                r61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            jn0Var = r61Var;
        }
        if (i71.c(i71Var)) {
            jn0Var.setScaleX(0.0f);
            jn0Var.setScaleY(0.0f);
        }
        return new s4.c1(jn0Var);
    }
}

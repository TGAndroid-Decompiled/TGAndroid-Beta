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
public final class a51 extends org.telegram.ui.Components.vk0 {
    public final b61 f36366c;

    public a51(b61 b61Var) {
        this.f36366c = b61Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 2 || i9 == 1 || i9 == 3 || i9 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36366c.f36696q0;
    }

    @Override
    public final long i(int i9) {
        return Math.abs(((Long) this.f36366c.f36699r0.get(i9)).longValue());
    }

    @Override
    public final int j(int i9) {
        b61 b61Var = this.f36366c;
        if (i9 == b61Var.f36660a) {
            return 7;
        }
        if (i9 < b61Var.f36663b || i9 >= b61Var.f36666c) {
            if (i9 < b61Var.d || i9 >= b61Var.f36671e) {
                if (i9 >= b61Var.A && i9 < b61Var.B) {
                    return 1;
                }
                if (i9 >= b61Var.f36698r && i9 < b61Var.f36701s) {
                    return 3;
                }
                if (b61Var.f36706u0.indexOfKey(i9) >= 0) {
                    return 4;
                }
                if (b61Var.f36708v0.indexOfKey(i9) >= 0) {
                    return 5;
                }
                if (i9 == b61Var.v) {
                    return 6;
                }
                if (b61Var.f36702s0.indexOfKey(i9) < 0 && i9 != b61Var.f36674f && i9 != b61Var.f36716y && i9 != b61Var.f36689n && i9 != b61Var.h && i9 != b61Var.f36713x) {
                    if (i9 != b61Var.f36710w) {
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
    public final void v(f2.q1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a51.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        nd0 nd0Var;
        int k10;
        b61 b61Var = this.f36366c;
        int i10 = b61Var.S;
        org.telegram.ui.ActionBar.b6 b6Var = b61Var.V0;
        boolean z10 = false;
        if (i9 == 0) {
            Context context = b61Var.getContext();
            if (i10 == 6) {
                z10 = true;
            }
            nd0Var = new g51(b61Var, context, z10);
        } else if (i9 == 2) {
            nd0Var = new ImageView(b61Var.getContext());
        } else if (i9 != 3 && i9 != 1 && i9 != 8) {
            if (i9 == 4) {
                Context context2 = b61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f38145a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (b61Var.f36668c1) {
                    k10 = org.telegram.ui.ActionBar.f6.v(b61Var.f36665b1, org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, g7.e6.e(-2, -2, 17));
                nd0Var = frameLayout;
            } else if (i9 == 5) {
                ?? frameLayout2 = new FrameLayout(b61Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f37824b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.gr.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f37823a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
                frameLayout3.addView(u3Var, g7.e6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, g7.e6.c(-1.0f, -1));
                zf.p0 p0Var = new zf.p0(frameLayout2.getContext(), b6Var, false);
                frameLayout2.f37825c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, g7.e6.c(-1.0f, -1));
                nd0Var = frameLayout2;
            } else if (i9 == 6) {
                nd0 nd0Var2 = new nd0(b61Var.getContext(), 3);
                nd0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    nd0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    nd0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    nd0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                nd0Var2.setGravity(17);
                nd0Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
                nd0Var = nd0Var2;
            } else if (i9 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(b61Var.getContext(), 52);
                t3Var.setTag("searchbox");
                nd0Var = t3Var;
            } else {
                nd0Var = new k51(b61Var, b61Var.getContext());
            }
        } else {
            k51 k51Var = new k51(b61Var, b61Var.getContext());
            if (i9 == 8) {
                k51Var.M = true;
                ImageReceiver imageReceiver = new ImageReceiver(k51Var);
                k51Var.h = imageReceiver;
                k51Var.f39716r = imageReceiver;
                imageReceiver.setImageBitmap(b61Var.J);
                b61Var.K = k51Var;
                k51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            nd0Var = k51Var;
        }
        if (b61.c(b61Var)) {
            nd0Var.setScaleX(0.0f);
            nd0Var.setScaleY(0.0f);
        }
        return new f2.q1(nd0Var);
    }
}

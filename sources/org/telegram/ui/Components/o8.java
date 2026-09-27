package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f27037a;
    public final org.telegram.ui.ActionBar.g1 f27038b;
    public final n8 f27039c;
    public long d;
    public final p90 e;

    public o8(Context context, hh0 hh0Var, final n8 n8Var, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, e6Var);
        this.f27037a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f27039c = n8Var;
        if (hh0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, e6Var).setOnClickListener(new l8(hh0Var, 0));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26385b;

            {
                this.f26385b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26385b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26385b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26385b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26385b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26385b;

            {
                this.f26385b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26385b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26385b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26385b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26385b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26385b;

            {
                this.f26385b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26385b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26385b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26385b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26385b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, e6Var).setOnClickListener(new ai.o5(this, context, i10, e6Var, n8Var));
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, e6Var);
        this.f27038b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26385b;

            {
                this.f26385b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26385b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26385b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26385b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26385b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.i6.f19297q7;
            c10.c(org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H8, e6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19021b7, e6Var)));
            frameLayout.addView(view, w7.y5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 8));
            p90 p90Var = new p90(context, null);
            this.e = p90Var;
            p90Var.setTag(R.id.fit_width_tag, 1);
            p90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            p90Var.setTextSize(1, 13.0f);
            p90Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
            p90Var.setMovementMethod(LinkMovementMethod.getInstance());
            p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
            p90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(p90Var, w7.y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f27039c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 29));
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f27038b;
        if (i10 == 0) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
    }
}

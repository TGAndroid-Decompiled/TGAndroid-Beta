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
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f26898a;
    public final org.telegram.ui.ActionBar.f1 f26899b;
    public final n8 f26900c;
    public long d;
    public final l90 e;

    public o8(Context context, fh0 fh0Var, final n8 n8Var, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, e6Var);
        this.f26898a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f26900c = n8Var;
        if (fh0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, e6Var).setOnClickListener(new l8(fh0Var, 0));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26351b;

            {
                this.f26351b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26351b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26351b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26351b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26351b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26351b;

            {
                this.f26351b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26351b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26351b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26351b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26351b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26351b;

            {
                this.f26351b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26351b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26351b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26351b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26351b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, e6Var).setOnClickListener(new ai.p5(this, context, i10, e6Var, n8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, e6Var);
        this.f26899b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26351b;

            {
                this.f26351b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26351b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26351b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26351b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26351b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.j6.f19301q7;
            c10.c(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, e6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19026b7, e6Var)));
            frameLayout.addView(view, w7.y5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 8));
            l90 l90Var = new l90(context, null);
            this.e = l90Var;
            l90Var.setTag(R.id.fit_width_tag, 1);
            l90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            l90Var.setTextSize(1, 13.0f);
            l90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            l90Var.setMovementMethod(LinkMovementMethod.getInstance());
            l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            l90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(l90Var, w7.y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f26900c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new x2(this, i10, 1));
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f26899b;
        if (i10 == 0) {
            f1Var.setVisibility(8);
        } else {
            f1Var.setVisibility(0);
        }
    }
}

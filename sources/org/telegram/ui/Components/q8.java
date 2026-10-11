package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f30190a;
    public final org.telegram.ui.ActionBar.e1 f30191b;
    public final p8 f30192c;
    public long d;
    public final ea0 f30193e;

    public q8(Context context, yh0 yh0Var, final p8 p8Var, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, d6Var);
        this.f30190a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f30192c = p8Var;
        if (yh0Var != null) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var).setOnClickListener(new n8(yh0Var, 0));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final q8 f29409b;

            {
                this.f29409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29409b.a();
                        p8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f29409b.a();
                        p8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f29409b.a();
                        p8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f29409b.a();
                        p8Var.Q0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final q8 f29409b;

            {
                this.f29409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29409b.a();
                        p8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f29409b.a();
                        p8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f29409b.a();
                        p8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f29409b.a();
                        p8Var.Q0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final q8 f29409b;

            {
                this.f29409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29409b.a();
                        p8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f29409b.a();
                        p8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f29409b.a();
                        p8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f29409b.a();
                        p8Var.Q0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, d6Var).setOnClickListener(new ai.p5(this, context, i10, d6Var, p8Var));
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, d6Var);
        this.f30191b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final q8 f29409b;

            {
                this.f29409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29409b.a();
                        p8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f29409b.a();
                        p8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f29409b.a();
                        p8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f29409b.a();
                        p8Var.Q0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.h6.f21062q7;
            c10.c(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H8, d6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786b7, d6Var)));
            frameLayout.addView(view, w7.x5.d(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 8));
            ea0 ea0Var = new ea0(context, null);
            this.f30193e = ea0Var;
            ea0Var.setTag(R.id.fit_width_tag, 1);
            ea0Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            ea0Var.setTextSize(1, 13.0f);
            ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
            ea0Var.setMovementMethod(LinkMovementMethod.getInstance());
            ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            ea0Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(ea0Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f30192c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.p8(this, i10, 29));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.f30191b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}

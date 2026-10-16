package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class s8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28761a;
    public final org.telegram.ui.ActionBar.e1 f28762b;
    public final r8 f28763c;
    public long d;
    public final da0 e;

    public s8(Context context, vh0 vh0Var, final r8 r8Var, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, c6Var);
        this.f28761a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f28763c = r8Var;
        if (vh0Var != null) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var).setOnClickListener(new p8(vh0Var, 0));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, c6Var).setOnClickListener(new View.OnClickListener(this) {
            public final s8 f28222b;

            {
                this.f28222b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28222b.a();
                        r8Var.X0(86400, 70);
                        return;
                    case 1:
                        this.f28222b.a();
                        r8Var.X0(604800, 70);
                        return;
                    case 2:
                        this.f28222b.a();
                        r8Var.X0(2678400, 70);
                        return;
                    default:
                        this.f28222b.a();
                        r8Var.X0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, c6Var).setOnClickListener(new View.OnClickListener(this) {
            public final s8 f28222b;

            {
                this.f28222b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28222b.a();
                        r8Var.X0(86400, 70);
                        return;
                    case 1:
                        this.f28222b.a();
                        r8Var.X0(604800, 70);
                        return;
                    case 2:
                        this.f28222b.a();
                        r8Var.X0(2678400, 70);
                        return;
                    default:
                        this.f28222b.a();
                        r8Var.X0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, c6Var).setOnClickListener(new View.OnClickListener(this) {
            public final s8 f28222b;

            {
                this.f28222b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28222b.a();
                        r8Var.X0(86400, 70);
                        return;
                    case 1:
                        this.f28222b.a();
                        r8Var.X0(604800, 70);
                        return;
                    case 2:
                        this.f28222b.a();
                        r8Var.X0(2678400, 70);
                        return;
                    default:
                        this.f28222b.a();
                        r8Var.X0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, c6Var).setOnClickListener(new bi.b5(this, context, i10, c6Var, r8Var));
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, c6Var);
        this.f28762b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final s8 f28222b;

            {
                this.f28222b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28222b.a();
                        r8Var.X0(86400, 70);
                        return;
                    case 1:
                        this.f28222b.a();
                        r8Var.X0(604800, 70);
                        return;
                    case 2:
                        this.f28222b.a();
                        r8Var.X0(2678400, 70);
                        return;
                    default:
                        this.f28222b.a();
                        r8Var.X0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.g6.f19839q7;
            c10.c(org.telegram.ui.ActionBar.g6.x0(null, i12, false), org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H8, c6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19563b7, c6Var)));
            frameLayout.addView(view, w7.z5.d(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 8));
            da0 da0Var = new da0(context, null);
            this.e = da0Var;
            da0Var.setTag(R.id.fit_width_tag, 1);
            da0Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            da0Var.setTextSize(1, 13.0f);
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
            da0Var.setMovementMethod(LinkMovementMethod.getInstance());
            da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
            da0Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(da0Var, w7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f28763c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new o8(this, i10, 0));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.f28762b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}

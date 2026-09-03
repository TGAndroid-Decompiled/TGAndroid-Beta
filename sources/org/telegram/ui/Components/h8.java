package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f27407a;
    public final org.telegram.ui.ActionBar.g1 f27408b;
    public final g8 f27409c;
    public long d;
    public final g90 f27410e;

    public h8(Context context, ch0 ch0Var, final g8 g8Var, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        if (z4) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, g6Var);
        this.f27407a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f27409c = g8Var;
        if (ch0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var).setOnClickListener(new e8(ch0Var, 0));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, g6Var).setOnClickListener(new View.OnClickListener(this) {
            public final h8 f26815b;

            {
                this.f26815b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26815b.a();
                        g8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f26815b.a();
                        g8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f26815b.a();
                        g8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f26815b.a();
                        g8Var.Q0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, g6Var).setOnClickListener(new View.OnClickListener(this) {
            public final h8 f26815b;

            {
                this.f26815b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26815b.a();
                        g8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f26815b.a();
                        g8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f26815b.a();
                        g8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f26815b.a();
                        g8Var.Q0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, g6Var).setOnClickListener(new View.OnClickListener(this) {
            public final h8 f26815b;

            {
                this.f26815b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26815b.a();
                        g8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f26815b.a();
                        g8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f26815b.a();
                        g8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f26815b.a();
                        g8Var.Q0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, g6Var).setOnClickListener(new lh.u3(this, context, i10, g6Var, g8Var));
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, g6Var);
        this.f27408b = c3;
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f26815b;

            {
                this.f26815b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26815b.a();
                        g8Var.Q0(86400, 70);
                        return;
                    case 1:
                        this.f26815b.a();
                        g8Var.Q0(604800, 70);
                        return;
                    case 2:
                        this.f26815b.a();
                        g8Var.Q0(2678400, 70);
                        return;
                    default:
                        this.f26815b.a();
                        g8Var.Q0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.k6.f21897q7;
            c3.c(org.telegram.ui.ActionBar.k6.w0(null, i12, false), org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H8, g6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.k6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21626b7, g6Var)));
            frameLayout.addView(view, k7.c6.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, k7.c6.n(-1, 8));
            g90 g90Var = new g90(context, null);
            this.f27410e = g90Var;
            g90Var.setTag(R.id.fit_width_tag, 1);
            g90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            g90Var.setTextSize(1, 13.0f);
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
            g90Var.setMovementMethod(LinkMovementMethod.getInstance());
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
            g90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g90Var, k7.c6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f27409c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new af.b(this, i10, 27));
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f27408b;
        if (i10 == 0) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
    }
}

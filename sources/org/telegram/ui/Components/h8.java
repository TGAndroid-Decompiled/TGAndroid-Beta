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
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28988a;
    public final org.telegram.ui.ActionBar.g1 f28989b;
    public final g8 f28990c;
    public long d;
    public final l80 f28991e;

    public h8(Context context, fg0 fg0Var, final g8 g8Var, boolean z10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        if (z10) {
            i10 = R.drawable.popup_fixed_alert;
        } else {
            i10 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i10, 0, context, b6Var);
        this.f28988a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f28990c = g8Var;
        if (fg0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, b6Var).setOnClickListener(new e8(fg0Var, 0));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, b6Var).setOnClickListener(new View.OnClickListener(this) {
            public final h8 f28324b;

            {
                this.f28324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28324b.a();
                        g8Var.V0(86400, 70);
                        return;
                    case 1:
                        this.f28324b.a();
                        g8Var.V0(604800, 70);
                        return;
                    case 2:
                        this.f28324b.a();
                        g8Var.V0(2678400, 70);
                        return;
                    default:
                        this.f28324b.a();
                        g8Var.V0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, b6Var).setOnClickListener(new View.OnClickListener(this) {
            public final h8 f28324b;

            {
                this.f28324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28324b.a();
                        g8Var.V0(86400, 70);
                        return;
                    case 1:
                        this.f28324b.a();
                        g8Var.V0(604800, 70);
                        return;
                    case 2:
                        this.f28324b.a();
                        g8Var.V0(2678400, 70);
                        return;
                    default:
                        this.f28324b.a();
                        g8Var.V0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, b6Var).setOnClickListener(new View.OnClickListener(this) {
            public final h8 f28324b;

            {
                this.f28324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28324b.a();
                        g8Var.V0(86400, 70);
                        return;
                    case 1:
                        this.f28324b.a();
                        g8Var.V0(604800, 70);
                        return;
                    case 2:
                        this.f28324b.a();
                        g8Var.V0(2678400, 70);
                        return;
                    default:
                        this.f28324b.a();
                        g8Var.V0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i9 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, b6Var).setOnClickListener(new fh.g4(this, context, i9, b6Var, g8Var));
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, b6Var);
        this.f28989b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f28324b;

            {
                this.f28324b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28324b.a();
                        g8Var.V0(86400, 70);
                        return;
                    case 1:
                        this.f28324b.a();
                        g8Var.V0(604800, 70);
                        return;
                    case 2:
                        this.f28324b.a();
                        g8Var.V0(2678400, 70);
                        return;
                    default:
                        this.f28324b.a();
                        g8Var.V0(0, 71);
                        return;
                }
            }
        });
        if (i9 != 1) {
            int i11 = org.telegram.ui.ActionBar.f6.f23230q7;
            c10.c(org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        }
        if (i9 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H8, b6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.f6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22966b7, b6Var)));
            frameLayout.addView(view, g7.e6.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, g7.e6.n(-1, 8));
            l80 l80Var = new l80(context, null);
            this.f28991e = l80Var;
            l80Var.setTag(R.id.fit_width_tag, 1);
            l80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            l80Var.setTextSize(1, 13.0f);
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
            l80Var.setMovementMethod(LinkMovementMethod.getInstance());
            l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
            l80Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(l80Var, g7.e6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f28990c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i9) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new bg.c2(this, i9, 28));
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f28989b;
        if (i9 == 0) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
    }
}

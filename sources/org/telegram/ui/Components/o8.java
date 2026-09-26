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
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f26993a;
    public final org.telegram.ui.ActionBar.e1 f26994b;
    public final n8 f26995c;
    public long d;
    public final o90 e;

    public o8(Context context, gh0 gh0Var, final n8 n8Var, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, d6Var);
        this.f26993a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f26995c = n8Var;
        if (gh0Var != null) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var).setOnClickListener(new l8(gh0Var, 0));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26330b;

            {
                this.f26330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26330b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26330b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26330b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26330b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26330b;

            {
                this.f26330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26330b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26330b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26330b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26330b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26330b;

            {
                this.f26330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26330b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26330b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26330b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26330b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, d6Var).setOnClickListener(new ai.o5(this, context, i10, d6Var, n8Var));
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, d6Var);
        this.f26994b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final o8 f26330b;

            {
                this.f26330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26330b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26330b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26330b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26330b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.h6.f19298q7;
            c10.c(org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H8, d6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.h6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19023b7, d6Var)));
            frameLayout.addView(view, w7.y5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 8));
            o90 o90Var = new o90(context, null);
            this.e = o90Var;
            o90Var.setTag(R.id.fit_width_tag, 1);
            o90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            o90Var.setTextSize(1, 13.0f);
            o90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
            o90Var.setMovementMethod(LinkMovementMethod.getInstance());
            o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
            o90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(o90Var, w7.y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f26995c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 29));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.f26994b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}

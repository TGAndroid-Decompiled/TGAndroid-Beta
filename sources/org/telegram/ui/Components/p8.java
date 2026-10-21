package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29257a;
    public final org.telegram.ui.ActionBar.e1 f29258b;
    public final o8 f29259c;
    public long d;
    public final x90 e;

    public p8(Context context, qh0 qh0Var, final o8 o8Var, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, d6Var);
        this.f29257a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f29259c = o8Var;
        if (qh0Var != null) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var).setOnClickListener(new m8(qh0Var, 0));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final p8 f28707b;

            {
                this.f28707b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28707b.a();
                        o8Var.H0(86400, 70);
                        return;
                    case 1:
                        this.f28707b.a();
                        o8Var.H0(604800, 70);
                        return;
                    case 2:
                        this.f28707b.a();
                        o8Var.H0(2678400, 70);
                        return;
                    default:
                        this.f28707b.a();
                        o8Var.H0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final p8 f28707b;

            {
                this.f28707b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28707b.a();
                        o8Var.H0(86400, 70);
                        return;
                    case 1:
                        this.f28707b.a();
                        o8Var.H0(604800, 70);
                        return;
                    case 2:
                        this.f28707b.a();
                        o8Var.H0(2678400, 70);
                        return;
                    default:
                        this.f28707b.a();
                        o8Var.H0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final p8 f28707b;

            {
                this.f28707b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28707b.a();
                        o8Var.H0(86400, 70);
                        return;
                    case 1:
                        this.f28707b.a();
                        o8Var.H0(604800, 70);
                        return;
                    case 2:
                        this.f28707b.a();
                        o8Var.H0(2678400, 70);
                        return;
                    default:
                        this.f28707b.a();
                        o8Var.H0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, d6Var).setOnClickListener(new ci.c4(this, context, i10, d6Var, o8Var));
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, d6Var);
        this.f29258b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f28707b;

            {
                this.f28707b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28707b.a();
                        o8Var.H0(86400, 70);
                        return;
                    case 1:
                        this.f28707b.a();
                        o8Var.H0(604800, 70);
                        return;
                    case 2:
                        this.f28707b.a();
                        o8Var.H0(2678400, 70);
                        return;
                    default:
                        this.f28707b.a();
                        o8Var.H0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.h6.f21228q7;
            c10.c(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H8, d6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20952b7, d6Var)));
            frameLayout.addView(view, w7.z5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 8));
            x90 x90Var = new x90(context, null);
            this.e = x90Var;
            x90Var.setTag(R.id.fit_width_tag, 1);
            x90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            x90Var.setTextSize(1, 13.0f);
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
            x90Var.setMovementMethod(LinkMovementMethod.getInstance());
            x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            x90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(x90Var, w7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f29259c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new e2(this, i10, 2));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.f29258b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}

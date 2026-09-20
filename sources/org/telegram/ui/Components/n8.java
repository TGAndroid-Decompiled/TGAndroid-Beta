package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class n8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f26605a;
    public final org.telegram.ui.ActionBar.f1 f26606b;
    public final m8 f26607c;
    public long d;
    public final k90 e;

    public n8(Context context, eh0 eh0Var, final m8 m8Var, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, f6Var);
        this.f26605a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f26607c = m8Var;
        if (eh0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var).setOnClickListener(new k8(eh0Var, 0));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final n8 f26050b;

            {
                this.f26050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26050b.a();
                        m8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26050b.a();
                        m8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26050b.a();
                        m8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26050b.a();
                        m8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final n8 f26050b;

            {
                this.f26050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26050b.a();
                        m8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26050b.a();
                        m8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26050b.a();
                        m8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26050b.a();
                        m8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final n8 f26050b;

            {
                this.f26050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26050b.a();
                        m8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26050b.a();
                        m8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26050b.a();
                        m8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26050b.a();
                        m8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, f6Var).setOnClickListener(new ai.p5(this, context, i10, f6Var, m8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, f6Var);
        this.f26606b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final n8 f26050b;

            {
                this.f26050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26050b.a();
                        m8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f26050b.a();
                        m8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f26050b.a();
                        m8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f26050b.a();
                        m8Var.U0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.j6.f19333q7;
            c10.c(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19058b7, f6Var)));
            frameLayout.addView(view, w7.y5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 8));
            k90 k90Var = new k90(context, null);
            this.e = k90Var;
            k90Var.setTag(R.id.fit_width_tag, 1);
            k90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            k90Var.setTextSize(1, 13.0f);
            k90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            k90Var.setMovementMethod(LinkMovementMethod.getInstance());
            k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            k90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(k90Var, w7.y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f26607c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.n8(this, i10, 29));
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f26606b;
        if (i10 == 0) {
            f1Var.setVisibility(8);
        } else {
            f1Var.setVisibility(0);
        }
    }
}

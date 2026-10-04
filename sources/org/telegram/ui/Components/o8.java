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
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29275a;
    public final org.telegram.ui.ActionBar.f1 f29276b;
    public final n8 f29277c;
    public long d;
    public final q90 f29278e;

    public o8(Context context, hh0 hh0Var, final n8 n8Var, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, d6Var);
        this.f29275a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f29277c = n8Var;
        if (hh0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var).setOnClickListener(new l8(hh0Var, 0));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f28544b;

            {
                this.f28544b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28544b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f28544b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f28544b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f28544b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f28544b;

            {
                this.f28544b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28544b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f28544b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f28544b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f28544b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final o8 f28544b;

            {
                this.f28544b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28544b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f28544b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f28544b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f28544b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, d6Var).setOnClickListener(new ai.o5(this, context, i10, d6Var, n8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, d6Var);
        this.f29276b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final o8 f28544b;

            {
                this.f28544b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28544b.a();
                        n8Var.U0(86400, 70);
                        return;
                    case 1:
                        this.f28544b.a();
                        n8Var.U0(604800, 70);
                        return;
                    case 2:
                        this.f28544b.a();
                        n8Var.U0(2678400, 70);
                        return;
                    default:
                        this.f28544b.a();
                        n8Var.U0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.i6.f21059q7;
            c10.c(org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H8, d6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20782b7, d6Var)));
            frameLayout.addView(view, w7.z5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 8));
            q90 q90Var = new q90(context, null);
            this.f29278e = q90Var;
            q90Var.setTag(R.id.fit_width_tag, 1);
            q90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            q90Var.setTextSize(1, 13.0f);
            q90Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
            q90Var.setMovementMethod(LinkMovementMethod.getInstance());
            q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
            q90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(q90Var, w7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f29277c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 29));
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f29276b;
        if (i10 == 0) {
            f1Var.setVisibility(8);
        } else {
            f1Var.setVisibility(0);
        }
    }
}

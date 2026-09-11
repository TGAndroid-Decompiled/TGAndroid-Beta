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
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29617a;
    public final org.telegram.ui.ActionBar.f1 f29618b;
    public final p8 f29619c;
    public long d;
    public final d90 f29620e;

    public q8(Context context, ug0 ug0Var, final p8 p8Var, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i11, 0, context, f6Var);
        this.f29617a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.f29619c = p8Var;
        if (ug0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var).setOnClickListener(new n8(ug0Var, 0));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final q8 f28999b;

            {
                this.f28999b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28999b.a();
                        p8Var.Y0(86400, 70);
                        return;
                    case 1:
                        this.f28999b.a();
                        p8Var.Y0(604800, 70);
                        return;
                    case 2:
                        this.f28999b.a();
                        p8Var.Y0(2678400, 70);
                        return;
                    default:
                        this.f28999b.a();
                        p8Var.Y0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final q8 f28999b;

            {
                this.f28999b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28999b.a();
                        p8Var.Y0(86400, 70);
                        return;
                    case 1:
                        this.f28999b.a();
                        p8Var.Y0(604800, 70);
                        return;
                    case 2:
                        this.f28999b.a();
                        p8Var.Y0(2678400, 70);
                        return;
                    default:
                        this.f28999b.a();
                        p8Var.Y0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final q8 f28999b;

            {
                this.f28999b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28999b.a();
                        p8Var.Y0(86400, 70);
                        return;
                    case 1:
                        this.f28999b.a();
                        p8Var.Y0(604800, 70);
                        return;
                    case 2:
                        this.f28999b.a();
                        p8Var.Y0(2678400, 70);
                        return;
                    default:
                        this.f28999b.a();
                        p8Var.Y0(0, 71);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, f6Var).setOnClickListener(new bi.z4(this, context, i10, f6Var, p8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, f6Var);
        this.f29618b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final q8 f28999b;

            {
                this.f28999b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28999b.a();
                        p8Var.Y0(86400, 70);
                        return;
                    case 1:
                        this.f28999b.a();
                        p8Var.Y0(604800, 70);
                        return;
                    case 2:
                        this.f28999b.a();
                        p8Var.Y0(2678400, 70);
                        return;
                    default:
                        this.f28999b.a();
                        p8Var.Y0(0, 71);
                        return;
                }
            }
        });
        if (i10 != 1) {
            int i12 = org.telegram.ui.ActionBar.j6.f20898q7;
            c10.c(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20627b7, f6Var)));
            frameLayout.addView(view, w7.x5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 8));
            d90 d90Var = new d90(context, null);
            this.f29620e = d90Var;
            d90Var.setTag(R.id.fit_width_tag, 1);
            d90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            d90Var.setTextSize(1, 13.0f);
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            d90Var.setMovementMethod(LinkMovementMethod.getInstance());
            d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            d90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d90Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.f29619c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new m8(this, i10, 0));
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f29618b;
        if (i10 == 0) {
            f1Var.setVisibility(8);
        } else {
            f1Var.setVisibility(0);
        }
    }
}

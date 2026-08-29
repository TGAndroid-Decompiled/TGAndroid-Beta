package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d81 extends LinearLayout {
    public final org.telegram.ui.ActionBar.g1[] f37409a;

    public d81(ContextThemeWrapper contextThemeWrapper, final oq0 oq0Var) {
        super(contextThemeWrapper);
        this.f37409a = r1;
        setOrientation(1);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c3.c(-328966, -328966);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                oq0 oq0Var2 = oq0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = oq0Var2.f41212a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = oq0Var2.f41212a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = oq0Var2.f41212a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = oq0Var2.f41212a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = oq0Var2.f41212a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c3.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c6.c(-328966, -328966);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                oq0 oq0Var2 = oq0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = oq0Var2.f41212a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = oq0Var2.f41212a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = oq0Var2.f41212a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = oq0Var2.f41212a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = oq0Var2.f41212a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c6.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c10.c(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                oq0 oq0Var2 = oq0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = oq0Var2.f41212a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = oq0Var2.f41212a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = oq0Var2.f41212a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = oq0Var2.f41212a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = oq0Var2.f41212a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c11.c(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                oq0 oq0Var2 = oq0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = oq0Var2.f41212a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = oq0Var2.f41212a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = oq0Var2.f41212a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = oq0Var2.f41212a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = oq0Var2.f41212a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c12.c(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                oq0 oq0Var2 = oq0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = oq0Var2.f41212a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = oq0Var2.f41212a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = oq0Var2.f41212a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = oq0Var2.f41212a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = oq0Var2.f41212a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1[] g1VarArr = {c3, c6, c10, c11, c12};
        View n31Var = new n31(contextThemeWrapper, 2);
        n31Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        n31Var.setBackgroundColor(-15198184);
        addView(n31Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) n31Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        n31Var.setLayoutParams(layoutParams);
    }
}

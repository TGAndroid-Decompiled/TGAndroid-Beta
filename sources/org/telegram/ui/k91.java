package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k91 extends LinearLayout {
    public final org.telegram.ui.ActionBar.f1[] f38007a;

    public k91(ContextThemeWrapper contextThemeWrapper, final qr0 qr0Var) {
        super(contextThemeWrapper);
        this.f38007a = r1;
        setOrientation(1);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c10.c(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                qr0 qr0Var2 = qr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.f40002a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.f40002a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.f40002a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.f40002a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.f40002a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c11.c(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                qr0 qr0Var2 = qr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.f40002a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.f40002a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.f40002a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.f40002a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.f40002a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c12.c(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                qr0 qr0Var2 = qr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.f40002a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.f40002a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.f40002a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.f40002a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.f40002a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c13.c(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                qr0 qr0Var2 = qr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.f40002a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.f40002a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.f40002a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.f40002a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.f40002a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c14.c(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                qr0 qr0Var2 = qr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.f40002a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.f40002a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.f40002a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.f40002a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.f40002a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1[] f1VarArr = {c10, c11, c12, c13, c14};
        View v51Var = new v51(contextThemeWrapper, 1);
        v51Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        v51Var.setBackgroundColor(-15198184);
        addView(v51Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v51Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        v51Var.setLayoutParams(layoutParams);
    }
}

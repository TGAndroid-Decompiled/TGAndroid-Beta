package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f81 extends LinearLayout {
    public final org.telegram.ui.ActionBar.g1[] f39300a;

    public f81(ContextThemeWrapper contextThemeWrapper, final fr0 fr0Var) {
        super(contextThemeWrapper);
        this.f39300a = r1;
        setOrientation(1);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                fr0 fr0Var2 = fr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = fr0Var2.f39437a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = fr0Var2.f39437a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = fr0Var2.f39437a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = fr0Var2.f39437a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = fr0Var2.f39437a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                fr0 fr0Var2 = fr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = fr0Var2.f39437a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = fr0Var2.f39437a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = fr0Var2.f39437a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = fr0Var2.f39437a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = fr0Var2.f39437a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                fr0 fr0Var2 = fr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = fr0Var2.f39437a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = fr0Var2.f39437a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = fr0Var2.f39437a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = fr0Var2.f39437a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = fr0Var2.f39437a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                fr0 fr0Var2 = fr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = fr0Var2.f39437a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = fr0Var2.f39437a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = fr0Var2.f39437a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = fr0Var2.f39437a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = fr0Var2.f39437a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c14.d(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                fr0 fr0Var2 = fr0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = fr0Var2.f39437a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = fr0Var2.f39437a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = fr0Var2.f39437a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = fr0Var2.f39437a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = fr0Var2.f39437a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1[] g1VarArr = {c10, c11, c12, c13, c14};
        View o41Var = new o41(contextThemeWrapper, 1);
        o41Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        o41Var.setBackgroundColor(-15198184);
        addView(o41Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o41Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        o41Var.setLayoutParams(layoutParams);
    }
}

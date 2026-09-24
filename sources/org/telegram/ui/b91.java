package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b91 extends LinearLayout {
    public final org.telegram.ui.ActionBar.e1[] f32345a;

    public b91(ContextThemeWrapper contextThemeWrapper, final ir0 ir0Var) {
        super(contextThemeWrapper);
        this.f32345a = r1;
        setOrientation(1);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c10.c(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                ir0 ir0Var2 = ir0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = ir0Var2.f34559a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ir0Var2.f34559a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ir0Var2.f34559a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ir0Var2.f34559a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ir0Var2.f34559a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c11.c(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                ir0 ir0Var2 = ir0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = ir0Var2.f34559a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ir0Var2.f34559a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ir0Var2.f34559a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ir0Var2.f34559a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ir0Var2.f34559a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c12.c(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                ir0 ir0Var2 = ir0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = ir0Var2.f34559a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ir0Var2.f34559a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ir0Var2.f34559a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ir0Var2.f34559a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ir0Var2.f34559a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c13.c(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                ir0 ir0Var2 = ir0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = ir0Var2.f34559a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ir0Var2.f34559a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ir0Var2.f34559a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ir0Var2.f34559a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ir0Var2.f34559a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c14.c(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                ir0 ir0Var2 = ir0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = ir0Var2.f34559a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = ir0Var2.f34559a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = ir0Var2.f34559a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = ir0Var2.f34559a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = ir0Var2.f34559a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.e1[] e1VarArr = {c10, c11, c12, c13, c14};
        View m51Var = new m51(contextThemeWrapper, 1);
        m51Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        m51Var.setBackgroundColor(-15198184);
        addView(m51Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m51Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        m51Var.setLayoutParams(layoutParams);
    }
}

package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class a81 extends LinearLayout {

    public final org.telegram.ui.ActionBar.f1[] f36453a;

    public a81(ContextThemeWrapper contextThemeWrapper, final pq0 pq0Var) {
        super(contextThemeWrapper);
        this.f36453a = new org.telegram.ui.ActionBar.f1[]{f1VarC, f1VarC, f1VarC, f1VarC, f1VarC};
        setOrientation(1);
        org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        f1VarC.c(-328966, -328966);
        final int i10 = 0;
        f1VarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i11 = i10;
                pq0 pq0Var2 = pq0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = pq0Var2.f41411a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = pq0Var2.f41411a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = pq0Var2.f41411a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = pq0Var2.f41411a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = pq0Var2.f41411a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        f1VarC2.c(-328966, -328966);
        final int i11 = 1;
        f1VarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i12 = i11;
                pq0 pq0Var2 = pq0Var;
                switch (i12) {
                    case 0:
                        PhotoViewer photoViewer = pq0Var2.f41411a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = pq0Var2.f41411a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = pq0Var2.f41411a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = pq0Var2.f41411a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = pq0Var2.f41411a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC2.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 f1VarC3 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        f1VarC3.c(-328966, -328966);
        final int i12 = 2;
        f1VarC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i13 = i12;
                pq0 pq0Var2 = pq0Var;
                switch (i13) {
                    case 0:
                        PhotoViewer photoViewer = pq0Var2.f41411a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = pq0Var2.f41411a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = pq0Var2.f41411a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = pq0Var2.f41411a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = pq0Var2.f41411a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC3.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 f1VarC4 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        f1VarC4.c(-328966, -328966);
        final int i13 = 3;
        f1VarC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i14 = i13;
                pq0 pq0Var2 = pq0Var;
                switch (i14) {
                    case 0:
                        PhotoViewer photoViewer = pq0Var2.f41411a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = pq0Var2.f41411a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = pq0Var2.f41411a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = pq0Var2.f41411a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = pq0Var2.f41411a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC4.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 f1VarC5 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        f1VarC5.c(-328966, -328966);
        final int i14 = 4;
        f1VarC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i15 = i14;
                pq0 pq0Var2 = pq0Var;
                switch (i15) {
                    case 0:
                        PhotoViewer photoViewer = pq0Var2.f41411a;
                        Drawable[] drawableArr = PhotoViewer.P8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = pq0Var2.f41411a;
                        Drawable[] drawableArr2 = PhotoViewer.P8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = pq0Var2.f41411a;
                        Drawable[] drawableArr3 = PhotoViewer.P8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = pq0Var2.f41411a;
                        Drawable[] drawableArr4 = PhotoViewer.P8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = pq0Var2.f41411a;
                        Drawable[] drawableArr5 = PhotoViewer.P8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC5.setSelectorColor(268435455);
        View z71Var = new z71(contextThemeWrapper, 0);
        z71Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        z71Var.setBackgroundColor(-15198184);
        addView(z71Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z71Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        z71Var.setLayoutParams(layoutParams);
    }
}

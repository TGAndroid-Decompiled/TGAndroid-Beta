package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
public final class c2 extends org.telegram.ui.Components.p6 {
    public final int f19842b;
    public final Object f19843c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f19842b = i10;
        this.f19843c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f7) {
        float f10;
        switch (this.f19842b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f19843c;
                e2Var2.f19993g0 = f7;
                e2Var2.invalidate();
                return;
            case 1:
                bo.Hc = f7;
                bo boVar = (bo) this.f19843c;
                boVar.R6.setSaturation(f7);
                boVar.Q6.setColorFilter(new ColorMatrixColorFilter(boVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f19843c;
                h8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = h8Var.f24568l0;
                if (v0Var != null && v0Var.getSearchContainer() != null) {
                    v0Var.getSearchContainer().setClipChildren(false);
                    v0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = v0Var.getSearchContainer();
                    float f12 = 66.0f;
                    if (AndroidUtilities.isTablet()) {
                        f10 = 74.0f;
                    } else {
                        f10 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, AndroidUtilities.dp(f10), 0);
                    FrameLayout searchContainer2 = v0Var.getSearchContainer();
                    if (AndroidUtilities.isTablet()) {
                        f12 = 74.0f;
                    }
                    searchContainer2.setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(f12));
                    if (v0Var.getSearchClearButton() != null) {
                        v0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                org.telegram.ui.Components.h8.k0(h8Var).invalidate();
                return;
            case 3:
                k00 k00Var = (k00) this.f19843c;
                k00Var.f25491w0 = f7;
                int i10 = k00Var.U;
                org.telegram.ui.ActionBar.e6 e6Var = k00Var.f25462a;
                k00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(k00Var.f25467c0, e6Var)));
                ai.w0 w0Var = k00Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((k00) obj).invalidate();
                return;
            case 4:
                j81 j81Var = (j81) obj;
                j81 j81Var2 = (j81) this.f19843c;
                j81Var2.f25261x = f7;
                j81Var2.invalidate();
                return;
            case 5:
                e91 e91Var = (e91) obj;
                e91 e91Var2 = (e91) this.f19843c;
                e91Var2.E = f7;
                d91 d91Var = e91Var2.L;
                if (d91Var != null) {
                    d91Var.a(f7);
                }
                e91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ue0 ue0Var = ((PhotoViewer) this.f19843c).C1;
                if (ue0Var != null) {
                    ue0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f19843c).f31244b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f19842b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f19843c).f19993g0);
            case 1:
                return Float.valueOf(bo.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.h8) this.f19843c).Q0);
            case 3:
                k00 k00Var = (k00) obj;
                return Float.valueOf(((k00) this.f19843c).f25491w0);
            case 4:
                j81 j81Var = (j81) obj;
                return Float.valueOf(((j81) this.f19843c).f25261x);
            case 5:
                e91 e91Var = (e91) obj;
                return Float.valueOf(((e91) this.f19843c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f19843c).f31244b1);
        }
    }

    public c2(j81 j81Var) {
        super("progress", 0);
        this.f19842b = 4;
        this.f19843c = j81Var;
    }

    public c2(e91 e91Var) {
        super("clipProgress", 0);
        this.f19842b = 5;
        this.f19843c = e91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f19842b = 7;
        this.f19843c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f19842b = 6;
        this.f19843c = photoViewer;
    }

    public c2(bo boVar) {
        super("", 0);
        this.f19842b = 1;
        this.f19843c = boVar;
    }

    public c2(org.telegram.ui.Components.h8 h8Var) {
        super("actionBarSlide", 0);
        this.f19842b = 2;
        this.f19843c = h8Var;
    }
}

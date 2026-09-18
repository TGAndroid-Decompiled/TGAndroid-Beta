package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
public final class c2 extends org.telegram.ui.Components.p6 {
    public final int f19862b;
    public final Object f19863c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f19862b = i10;
        this.f19863c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f19862b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f19863c;
                e2Var2.f20025g0 = f7;
                e2Var2.invalidate();
                return;
            case 1:
                bo.Hc = f7;
                bo boVar = (bo) this.f19863c;
                boVar.R6.setSaturation(f7);
                boVar.Q6.setColorFilter(new ColorMatrixColorFilter(boVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f19863c;
                h8Var.Q0 = f7;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = h8Var.f24560l0;
                if (w0Var != null && w0Var.getSearchContainer() != null) {
                    w0Var.getSearchContainer().setClipChildren(false);
                    w0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = w0Var.getSearchContainer();
                    float f12 = 66.0f;
                    if (AndroidUtilities.isTablet()) {
                        f10 = 74.0f;
                    } else {
                        f10 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, AndroidUtilities.dp(f10), 0);
                    FrameLayout searchContainer2 = w0Var.getSearchContainer();
                    if (AndroidUtilities.isTablet()) {
                        f12 = 74.0f;
                    }
                    searchContainer2.setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(f12));
                    if (w0Var.getSearchClearButton() != null) {
                        w0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                org.telegram.ui.Components.h8.k0(h8Var).invalidate();
                return;
            case 3:
                k00 k00Var = (k00) this.f19863c;
                k00Var.f25508w0 = f7;
                int i10 = k00Var.U;
                org.telegram.ui.ActionBar.f6 f6Var = k00Var.f25479a;
                k00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.f25484c0, f6Var)));
                ai.w0 w0Var2 = k00Var.F;
                w0Var2.g1();
                w0Var2.invalidate();
                ((k00) obj).invalidate();
                return;
            case 4:
                k81 k81Var = (k81) obj;
                k81 k81Var2 = (k81) this.f19863c;
                k81Var2.f25596x = f7;
                k81Var2.invalidate();
                return;
            case 5:
                f91 f91Var = (f91) obj;
                f91 f91Var2 = (f91) this.f19863c;
                f91Var2.E = f7;
                e91 e91Var = f91Var2.L;
                if (e91Var != null) {
                    e91Var.a(f7);
                }
                f91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ue0 ue0Var = ((PhotoViewer) this.f19863c).C1;
                if (ue0Var != null) {
                    ue0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f19863c).f31264b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f19862b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f19863c).f20025g0);
            case 1:
                return Float.valueOf(bo.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.h8) this.f19863c).Q0);
            case 3:
                k00 k00Var = (k00) obj;
                return Float.valueOf(((k00) this.f19863c).f25508w0);
            case 4:
                k81 k81Var = (k81) obj;
                return Float.valueOf(((k81) this.f19863c).f25596x);
            case 5:
                f91 f91Var = (f91) obj;
                return Float.valueOf(((f91) this.f19863c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f19863c).f31264b1);
        }
    }

    public c2(k81 k81Var) {
        super("progress", 0);
        this.f19862b = 4;
        this.f19863c = k81Var;
    }

    public c2(f91 f91Var) {
        super("clipProgress", 0);
        this.f19862b = 5;
        this.f19863c = f91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f19862b = 7;
        this.f19863c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f19862b = 6;
        this.f19863c = photoViewer;
    }

    public c2(bo boVar) {
        super("", 0);
        this.f19862b = 1;
        this.f19863c = boVar;
    }

    public c2(org.telegram.ui.Components.h8 h8Var) {
        super("actionBarSlide", 0);
        this.f19862b = 2;
        this.f19863c = h8Var;
    }
}

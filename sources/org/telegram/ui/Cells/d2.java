package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.y81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class d2 extends org.telegram.ui.Components.r6 {
    public final int f20089b;
    public final Object f20090c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20089b = i10;
        this.f20090c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f20089b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f20090c;
                f2Var2.f20247g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                zn.Hc = f7;
                zn znVar = (zn) this.f20090c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f20090c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.f25214l0;
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
                org.telegram.ui.Components.j8.k0(j8Var).invalidate();
                return;
            case 3:
                k00 k00Var = (k00) this.f20090c;
                k00Var.f25517w0 = f7;
                int i10 = k00Var.U;
                org.telegram.ui.ActionBar.e6 e6Var = k00Var.f25488a;
                k00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, e6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.f25493c0, e6Var)));
                ai.w0 w0Var = k00Var.F;
                w0Var.g1();
                w0Var.invalidate();
                ((k00) obj).invalidate();
                return;
            case 4:
                y81 y81Var = (y81) obj;
                y81 y81Var2 = (y81) this.f20090c;
                y81Var2.f30508x = f7;
                y81Var2.invalidate();
                return;
            case 5:
                s91 s91Var = (s91) obj;
                s91 s91Var2 = (s91) this.f20090c;
                s91Var2.E = f7;
                r91 r91Var = s91Var2.L;
                if (r91Var != null) {
                    r91Var.a(f7);
                }
                s91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                df0 df0Var = ((PhotoViewer) this.f20090c).C1;
                if (df0Var != null) {
                    df0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20090c).f31491b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20089b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f20090c).f20247g0);
            case 1:
                return Float.valueOf(zn.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f20090c).Q0);
            case 3:
                k00 k00Var = (k00) obj;
                return Float.valueOf(((k00) this.f20090c).f25517w0);
            case 4:
                y81 y81Var = (y81) obj;
                return Float.valueOf(((y81) this.f20090c).f30508x);
            case 5:
                s91 s91Var = (s91) obj;
                return Float.valueOf(((s91) this.f20090c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20090c).f31491b1);
        }
    }

    public d2(y81 y81Var) {
        super("progress", 0);
        this.f20089b = 4;
        this.f20090c = y81Var;
    }

    public d2(s91 s91Var) {
        super("clipProgress", 0);
        this.f20089b = 5;
        this.f20090c = s91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20089b = 7;
        this.f20090c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20089b = 6;
        this.f20090c = photoViewer;
    }

    public d2(zn znVar) {
        super("", 0);
        this.f20089b = 1;
        this.f20090c = znVar;
    }

    public d2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f20089b = 2;
        this.f20090c = j8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.w81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
public final class c2 extends org.telegram.ui.Components.q6 {
    public final int f18959b;
    public final Object f18960c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f18959b = i10;
        this.f18960c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f7) {
        float f10;
        switch (this.f18959b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f18960c;
                e2Var2.f19057g0 = f7;
                e2Var2.invalidate();
                return;
            case 1:
                eo.Ic = f7;
                eo eoVar = (eo) this.f18960c;
                eoVar.R6.setSaturation(f7);
                eoVar.Q6.setColorFilter(new ColorMatrixColorFilter(eoVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f18960c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.l5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.f24290l0;
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
                org.telegram.ui.Components.j8.k0(j8Var).invalidate();
                return;
            case 3:
                r00 r00Var = (r00) this.f18960c;
                r00Var.f26541w0 = f7;
                int i10 = r00Var.U;
                org.telegram.ui.ActionBar.f6 f6Var = r00Var.f26512a;
                r00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(r00Var.f26517c0, f6Var)));
                bi.y1 y1Var = r00Var.F;
                y1Var.e1();
                y1Var.invalidate();
                ((r00) obj).invalidate();
                return;
            case 4:
                w81 w81Var = (w81) obj;
                w81 w81Var2 = (w81) this.f18960c;
                w81Var2.f28726x = f7;
                w81Var2.invalidate();
                return;
            case 5:
                q91 q91Var = (q91) obj;
                q91 q91Var2 = (q91) this.f18960c;
                q91Var2.E = f7;
                p91 p91Var = q91Var2.L;
                if (p91Var != null) {
                    p91Var.a(f7);
                }
                q91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                df0 df0Var = ((PhotoViewer) this.f18960c).C1;
                if (df0Var != null) {
                    df0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f18960c).f30359b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f18959b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f18960c).f19057g0);
            case 1:
                return Float.valueOf(eo.Ic);
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f18960c).Q0);
            case 3:
                r00 r00Var = (r00) obj;
                return Float.valueOf(((r00) this.f18960c).f26541w0);
            case 4:
                w81 w81Var = (w81) obj;
                return Float.valueOf(((w81) this.f18960c).f28726x);
            case 5:
                q91 q91Var = (q91) obj;
                return Float.valueOf(((q91) this.f18960c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f18960c).f30359b1);
        }
    }

    public c2(w81 w81Var) {
        super("progress", 0);
        this.f18959b = 4;
        this.f18960c = w81Var;
    }

    public c2(q91 q91Var) {
        super("clipProgress", 0);
        this.f18959b = 5;
        this.f18960c = q91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f18959b = 7;
        this.f18960c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f18959b = 6;
        this.f18960c = photoViewer;
    }

    public c2(eo eoVar) {
        super("", 0);
        this.f18959b = 1;
        this.f18960c = eoVar;
    }

    public c2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f18959b = 2;
        this.f18960c = j8Var;
    }
}

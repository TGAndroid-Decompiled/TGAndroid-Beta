package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
public final class d2 extends org.telegram.ui.Components.u6 {
    public final int f21060b;
    public final Object f21061c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21060b = i10;
        this.f21061c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21060b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f21061c;
                f2Var2.f21159g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                fo.Ic = f7;
                fo foVar = (fo) this.f21061c;
                foVar.R6.setSaturation(f7);
                foVar.Q6.setColorFilter(new ColorMatrixColorFilter(foVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.f21061c;
                m8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.f27247l0;
                if (u0Var != null && u0Var.getSearchContainer() != null) {
                    u0Var.getSearchContainer().setClipChildren(false);
                    u0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = u0Var.getSearchContainer();
                    float f12 = 66.0f;
                    if (AndroidUtilities.isTablet()) {
                        f10 = 74.0f;
                    } else {
                        f10 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, AndroidUtilities.dp(f10), 0);
                    FrameLayout searchContainer2 = u0Var.getSearchContainer();
                    if (AndroidUtilities.isTablet()) {
                        f12 = 74.0f;
                    }
                    searchContainer2.setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(f12));
                    if (u0Var.getSearchClearButton() != null) {
                        u0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                org.telegram.ui.Components.m8.l0(m8Var).invalidate();
                return;
            case 3:
                w00 w00Var = (w00) this.f21061c;
                w00Var.f30724w0 = f7;
                int i10 = w00Var.U;
                org.telegram.ui.ActionBar.c6 c6Var = w00Var.f30695a;
                w00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(w00Var.f30700c0, c6Var)));
                bi.o0 o0Var = w00Var.F;
                o0Var.f1();
                o0Var.invalidate();
                ((w00) obj).invalidate();
                return;
            case 4:
                l91 l91Var = (l91) obj;
                l91 l91Var2 = (l91) this.f21061c;
                l91Var2.f26999x = f7;
                l91Var2.invalidate();
                return;
            case 5:
                ea1 ea1Var = (ea1) obj;
                ea1 ea1Var2 = (ea1) this.f21061c;
                ea1Var2.E = f7;
                da1 da1Var = ea1Var2.L;
                if (da1Var != null) {
                    da1Var.b(f7);
                }
                ea1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                tf0 tf0Var = ((PhotoViewer) this.f21061c).C1;
                if (tf0Var != null) {
                    tf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21061c).f32537b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21060b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f21061c).f21159g0);
            case 1:
                return Float.valueOf(fo.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.m8) this.f21061c).Q0);
            case 3:
                w00 w00Var = (w00) obj;
                return Float.valueOf(((w00) this.f21061c).f30724w0);
            case 4:
                l91 l91Var = (l91) obj;
                return Float.valueOf(((l91) this.f21061c).f26999x);
            case 5:
                ea1 ea1Var = (ea1) obj;
                return Float.valueOf(((ea1) this.f21061c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21061c).f32537b1);
        }
    }

    public d2(l91 l91Var) {
        super("progress", 0);
        this.f21060b = 4;
        this.f21061c = l91Var;
    }

    public d2(ea1 ea1Var) {
        super("clipProgress", 0);
        this.f21060b = 5;
        this.f21061c = ea1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21060b = 7;
        this.f21061c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21060b = 6;
        this.f21061c = photoViewer;
    }

    public d2(fo foVar) {
        super("", 0);
        this.f21060b = 1;
        this.f21061c = foVar;
    }

    public d2(org.telegram.ui.Components.m8 m8Var) {
        super("actionBarSlide", 0);
        this.f21060b = 2;
        this.f21061c = m8Var;
    }
}

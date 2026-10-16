package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
public final class d2 extends org.telegram.ui.Components.u6 {
    public final int f20755b;
    public final Object f20756c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20755b = i10;
        this.f20756c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f20755b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f20756c;
                f2Var2.f20855g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                fo.Ic = f7;
                fo foVar = (fo) this.f20756c;
                foVar.R6.setSaturation(f7);
                foVar.Q6.setColorFilter(new ColorMatrixColorFilter(foVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.f20756c;
                m8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.f26981l0;
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
                w00 w00Var = (w00) this.f20756c;
                w00Var.f30390w0 = f7;
                int i10 = w00Var.U;
                org.telegram.ui.ActionBar.c6 c6Var = w00Var.f30361a;
                w00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(w00Var.f30366c0, c6Var)));
                bi.o0 o0Var = w00Var.F;
                o0Var.f1();
                o0Var.invalidate();
                ((w00) obj).invalidate();
                return;
            case 4:
                m91 m91Var = (m91) obj;
                m91 m91Var2 = (m91) this.f20756c;
                m91Var2.f27048x = f7;
                m91Var2.invalidate();
                return;
            case 5:
                fa1 fa1Var = (fa1) obj;
                fa1 fa1Var2 = (fa1) this.f20756c;
                fa1Var2.E = f7;
                ea1 ea1Var = fa1Var2.L;
                if (ea1Var != null) {
                    ea1Var.b(f7);
                }
                fa1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                uf0 uf0Var = ((PhotoViewer) this.f20756c).C1;
                if (uf0Var != null) {
                    uf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20756c).f32239b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20755b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f20756c).f20855g0);
            case 1:
                return Float.valueOf(fo.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.m8) this.f20756c).Q0);
            case 3:
                w00 w00Var = (w00) obj;
                return Float.valueOf(((w00) this.f20756c).f30390w0);
            case 4:
                m91 m91Var = (m91) obj;
                return Float.valueOf(((m91) this.f20756c).f27048x);
            case 5:
                fa1 fa1Var = (fa1) obj;
                return Float.valueOf(((fa1) this.f20756c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20756c).f32239b1);
        }
    }

    public d2(m91 m91Var) {
        super("progress", 0);
        this.f20755b = 4;
        this.f20756c = m91Var;
    }

    public d2(fa1 fa1Var) {
        super("clipProgress", 0);
        this.f20755b = 5;
        this.f20756c = fa1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20755b = 7;
        this.f20756c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20755b = 6;
        this.f20756c = photoViewer;
    }

    public d2(fo foVar) {
        super("", 0);
        this.f20755b = 1;
        this.f20756c = foVar;
    }

    public d2(org.telegram.ui.Components.m8 m8Var) {
        super("actionBarSlide", 0);
        this.f20755b = 2;
        this.f20756c = m8Var;
    }
}

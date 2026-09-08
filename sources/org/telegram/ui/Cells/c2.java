package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
public final class c2 extends org.telegram.ui.Components.s6 {
    public final int f21700b;
    public final Object f21701c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21700b = i10;
        this.f21701c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f7) {
        float f10;
        switch (this.f21700b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f21701c;
                e2Var2.f21870g0 = f7;
                e2Var2.invalidate();
                return;
            case 1:
                co.Ic = f7;
                co coVar = (co) this.f21701c;
                coVar.R6.setSaturation(f7);
                coVar.Q6.setColorFilter(new ColorMatrixColorFilter(coVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f21701c;
                k8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = k8Var.f27755l0;
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
                org.telegram.ui.Components.k8.k0(k8Var).invalidate();
                return;
            case 3:
                k00 k00Var = (k00) this.f21701c;
                k00Var.f27661w0 = f7;
                int i10 = k00Var.U;
                org.telegram.ui.ActionBar.f6 f6Var = k00Var.f27631a;
                k00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.f27636c0, f6Var)));
                bi.o0 o0Var = k00Var.F;
                o0Var.e1();
                o0Var.invalidate();
                ((k00) obj).invalidate();
                return;
            case 4:
                j81 j81Var = (j81) obj;
                j81 j81Var2 = (j81) this.f21701c;
                j81Var2.f27416x = f7;
                j81Var2.invalidate();
                return;
            case 5:
                d91 d91Var = (d91) obj;
                d91 d91Var2 = (d91) this.f21701c;
                d91Var2.E = f7;
                c91 c91Var = d91Var2.L;
                if (c91Var != null) {
                    c91Var.b(f7);
                }
                d91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ue0 ue0Var = ((PhotoViewer) this.f21701c).C1;
                if (ue0Var != null) {
                    ue0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21701c).f33892b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21700b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f21701c).f21870g0);
            case 1:
                return Float.valueOf(co.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.k8) this.f21701c).Q0);
            case 3:
                k00 k00Var = (k00) obj;
                return Float.valueOf(((k00) this.f21701c).f27661w0);
            case 4:
                j81 j81Var = (j81) obj;
                return Float.valueOf(((j81) this.f21701c).f27416x);
            case 5:
                d91 d91Var = (d91) obj;
                return Float.valueOf(((d91) this.f21701c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21701c).f33892b1);
        }
    }

    public c2(j81 j81Var) {
        super("progress", 0);
        this.f21700b = 4;
        this.f21701c = j81Var;
    }

    public c2(d91 d91Var) {
        super("clipProgress", 0);
        this.f21700b = 5;
        this.f21701c = d91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21700b = 7;
        this.f21701c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21700b = 6;
        this.f21701c = photoViewer;
    }

    public c2(co coVar) {
        super("", 0);
        this.f21700b = 1;
        this.f21701c = coVar;
    }

    public c2(org.telegram.ui.Components.k8 k8Var) {
        super("actionBarSlide", 0);
        this.f21700b = 2;
        this.f21701c = k8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc1;
import org.telegram.ui.Components.kc1;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.w91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class b2 extends org.telegram.ui.Components.u6 {
    public final int f23896b;
    public final Object f23897c;

    public b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f23896b = i10;
        this.f23897c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f23896b) {
            case 0:
                d2 d2Var = (d2) obj;
                d2 d2Var2 = (d2) this.f23897c;
                d2Var2.f23994h0 = f7;
                d2Var2.invalidate();
                return;
            case 1:
                wn.f45036gd = f7;
                wn wnVar = (wn) this.f23897c;
                wnVar.f45144h7.setSaturation(f7);
                wnVar.g7.setColorFilter(new ColorMatrixColorFilter(wnVar.f45144h7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.f23897c;
                m8Var.Q0 = f7;
                org.telegram.ui.ActionBar.b6 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.f30442k0;
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
                org.telegram.ui.Components.m8.n0(m8Var).invalidate();
                return;
            case 3:
                s00 s00Var = (s00) this.f23897c;
                s00Var.f32445w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.u6 u6Var = s00Var.f32416a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(s00Var.f32421c0, u6Var)));
                bi.r1 r1Var = s00Var.F;
                r1Var.g1();
                r1Var.invalidate();
                ((s00) obj).invalidate();
                return;
            case 4:
                w91 w91Var = (w91) obj;
                w91 w91Var2 = (w91) this.f23897c;
                w91Var2.f34485x = f7;
                w91Var2.invalidate();
                return;
            case 5:
                kc1 kc1Var = (kc1) obj;
                kc1 kc1Var2 = (kc1) this.f23897c;
                kc1Var2.E = f7;
                jc1 jc1Var = kc1Var2.L;
                if (jc1Var != null) {
                    jc1Var.a(f7);
                }
                kc1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                pf0 pf0Var = ((PhotoViewer) this.f23897c).C1;
                if (pf0Var != null) {
                    pf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f23897c).f35981b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23896b) {
            case 0:
                d2 d2Var = (d2) obj;
                return Float.valueOf(((d2) this.f23897c).f23994h0);
            case 1:
                return Float.valueOf(wn.f45036gd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.m8) this.f23897c).Q0);
            case 3:
                s00 s00Var = (s00) obj;
                return Float.valueOf(((s00) this.f23897c).f32445w0);
            case 4:
                w91 w91Var = (w91) obj;
                return Float.valueOf(((w91) this.f23897c).f34485x);
            case 5:
                kc1 kc1Var = (kc1) obj;
                return Float.valueOf(((kc1) this.f23897c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f23897c).f35981b1);
        }
    }

    public b2(w91 w91Var) {
        super("progress", 0);
        this.f23896b = 4;
        this.f23897c = w91Var;
    }

    public b2(kc1 kc1Var) {
        super("clipProgress", 0);
        this.f23896b = 5;
        this.f23897c = kc1Var;
    }

    public b2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f23896b = 7;
        this.f23897c = profileActivity;
    }

    public b2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f23896b = 6;
        this.f23897c = photoViewer;
    }

    public b2(wn wnVar) {
        super("", 0);
        this.f23896b = 1;
        this.f23897c = wnVar;
    }

    public b2(org.telegram.ui.Components.m8 m8Var) {
        super("actionBarSlide", 0);
        this.f23896b = 2;
        this.f23897c = m8Var;
    }
}

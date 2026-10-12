package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.na1;
import org.telegram.ui.Components.oa1;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
public final class d2 extends org.telegram.ui.Components.t6 {
    public final int f21724b;
    public final Object f21725c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21724b = i10;
        this.f21725c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21724b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f21725c;
                f2Var2.f21831g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                eo.Ic = f7;
                eo eoVar = (eo) this.f21725c;
                eoVar.R6.setSaturation(f7);
                eoVar.Q6.setColorFilter(new ColorMatrixColorFilter(eoVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f21725c;
                l8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = l8Var.f28083l0;
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
                org.telegram.ui.Components.l8.l0(l8Var).invalidate();
                return;
            case 3:
                d10 d10Var = (d10) this.f21725c;
                d10Var.f25193w0 = f7;
                int i10 = d10Var.U;
                org.telegram.ui.ActionBar.c6 c6Var = d10Var.f25163a;
                d10Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.w0(i10, c6Var), org.telegram.ui.ActionBar.h6.w0(d10Var.f25168c0, c6Var)));
                ai.w0 w0Var = d10Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((d10) obj).invalidate();
                return;
            case 4:
                v91 v91Var = (v91) obj;
                v91 v91Var2 = (v91) this.f21725c;
                v91Var2.f31474x = f7;
                v91Var2.invalidate();
                return;
            case 5:
                oa1 oa1Var = (oa1) obj;
                oa1 oa1Var2 = (oa1) this.f21725c;
                oa1Var2.E = f7;
                na1 na1Var = oa1Var2.L;
                if (na1Var != null) {
                    na1Var.a(f7);
                }
                oa1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                zf0 zf0Var = ((PhotoViewer) this.f21725c).C1;
                if (zf0Var != null) {
                    zf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21725c).f34057b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21724b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f21725c).f21831g0);
            case 1:
                return Float.valueOf(eo.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.l8) this.f21725c).Q0);
            case 3:
                d10 d10Var = (d10) obj;
                return Float.valueOf(((d10) this.f21725c).f25193w0);
            case 4:
                v91 v91Var = (v91) obj;
                return Float.valueOf(((v91) this.f21725c).f31474x);
            case 5:
                oa1 oa1Var = (oa1) obj;
                return Float.valueOf(((oa1) this.f21725c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21725c).f34057b1);
        }
    }

    public d2(v91 v91Var) {
        super("progress", 0);
        this.f21724b = 4;
        this.f21725c = v91Var;
    }

    public d2(oa1 oa1Var) {
        super("clipProgress", 0);
        this.f21724b = 5;
        this.f21725c = oa1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21724b = 7;
        this.f21725c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21724b = 6;
        this.f21725c = photoViewer;
    }

    public d2(eo eoVar) {
        super("", 0);
        this.f21724b = 1;
        this.f21725c = eoVar;
    }

    public d2(org.telegram.ui.Components.l8 l8Var) {
        super("actionBarSlide", 0);
        this.f21724b = 2;
        this.f21725c = l8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.x81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class d2 extends org.telegram.ui.Components.r6 {
    public final int f20125b;
    public final Object f20126c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20125b = i10;
        this.f20126c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f7) {
        float f10;
        switch (this.f20125b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f20126c;
                f2Var2.f20283g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                wn.Hc = f7;
                wn wnVar = (wn) this.f20126c;
                wnVar.R6.setSaturation(f7);
                wnVar.Q6.setColorFilter(new ColorMatrixColorFilter(wnVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f20126c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.f25315l0;
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
                org.telegram.ui.Components.j8.k0(j8Var).invalidate();
                return;
            case 3:
                l00 l00Var = (l00) this.f20126c;
                l00Var.f25963w0 = f7;
                int i10 = l00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = l00Var.f25934a;
                l00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(l00Var.f25939c0, d6Var)));
                ai.w0 w0Var = l00Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((l00) obj).invalidate();
                return;
            case 4:
                x81 x81Var = (x81) obj;
                x81 x81Var2 = (x81) this.f20126c;
                x81Var2.f30296x = f7;
                x81Var2.invalidate();
                return;
            case 5:
                q91 q91Var = (q91) obj;
                q91 q91Var2 = (q91) this.f20126c;
                q91Var2.E = f7;
                p91 p91Var = q91Var2.L;
                if (p91Var != null) {
                    p91Var.a(f7);
                }
                q91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ef0 ef0Var = ((PhotoViewer) this.f20126c).C1;
                if (ef0Var != null) {
                    ef0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20126c).f31533b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20125b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f20126c).f20283g0);
            case 1:
                return Float.valueOf(wn.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f20126c).Q0);
            case 3:
                l00 l00Var = (l00) obj;
                return Float.valueOf(((l00) this.f20126c).f25963w0);
            case 4:
                x81 x81Var = (x81) obj;
                return Float.valueOf(((x81) this.f20126c).f30296x);
            case 5:
                q91 q91Var = (q91) obj;
                return Float.valueOf(((q91) this.f20126c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20126c).f31533b1);
        }
    }

    public d2(x81 x81Var) {
        super("progress", 0);
        this.f20125b = 4;
        this.f20126c = x81Var;
    }

    public d2(q91 q91Var) {
        super("clipProgress", 0);
        this.f20125b = 5;
        this.f20126c = q91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20125b = 7;
        this.f20126c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20125b = 6;
        this.f20126c = photoViewer;
    }

    public d2(wn wnVar) {
        super("", 0);
        this.f20125b = 1;
        this.f20126c = wnVar;
    }

    public d2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f20125b = 2;
        this.f20126c = j8Var;
    }
}

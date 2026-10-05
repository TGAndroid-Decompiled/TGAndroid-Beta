package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba1;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.n00;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yn;
public final class d2 extends org.telegram.ui.Components.r6 {
    public final int f21918b;
    public final Object f21919c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21918b = i10;
        this.f21919c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21918b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f21919c;
                f2Var2.f22087g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                yn.Cc = f7;
                yn ynVar = (yn) this.f21919c;
                ynVar.P6.setSaturation(f7);
                ynVar.O6.setColorFilter(new ColorMatrixColorFilter(ynVar.P6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f21919c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.i5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.f27715l0;
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
                n00 n00Var = (n00) this.f21919c;
                n00Var.f28904w0 = f7;
                int i10 = n00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = n00Var.f28874a;
                n00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.i6.v0(i10, d6Var), org.telegram.ui.ActionBar.i6.v0(n00Var.f28879c0, d6Var)));
                ai.w0 w0Var = n00Var.F;
                w0Var.g1();
                w0Var.invalidate();
                ((n00) obj).invalidate();
                return;
            case 4:
                i91 i91Var = (i91) obj;
                i91 i91Var2 = (i91) this.f21919c;
                i91Var2.f27440x = f7;
                i91Var2.invalidate();
                return;
            case 5:
                ca1 ca1Var = (ca1) obj;
                ca1 ca1Var2 = (ca1) this.f21919c;
                ca1Var2.E = f7;
                ba1 ba1Var = ca1Var2.L;
                if (ba1Var != null) {
                    ba1Var.a(f7);
                }
                ca1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                gf0 gf0Var = ((PhotoViewer) this.f21919c).C1;
                if (gf0Var != null) {
                    gf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21919c).f34230b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21918b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f21919c).f22087g0);
            case 1:
                return Float.valueOf(yn.Cc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f21919c).Q0);
            case 3:
                n00 n00Var = (n00) obj;
                return Float.valueOf(((n00) this.f21919c).f28904w0);
            case 4:
                i91 i91Var = (i91) obj;
                return Float.valueOf(((i91) this.f21919c).f27440x);
            case 5:
                ca1 ca1Var = (ca1) obj;
                return Float.valueOf(((ca1) this.f21919c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21919c).f34230b1);
        }
    }

    public d2(i91 i91Var) {
        super("progress", 0);
        this.f21918b = 4;
        this.f21919c = i91Var;
    }

    public d2(ca1 ca1Var) {
        super("clipProgress", 0);
        this.f21918b = 5;
        this.f21919c = ca1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21918b = 7;
        this.f21919c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21918b = 6;
        this.f21919c = photoViewer;
    }

    public d2(yn ynVar) {
        super("", 0);
        this.f21918b = 1;
        this.f21919c = ynVar;
    }

    public d2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f21918b = 2;
        this.f21919c = j8Var;
    }
}

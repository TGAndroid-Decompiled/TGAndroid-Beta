package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.z81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class d2 extends org.telegram.ui.Components.r6 {
    public final int f20127b;
    public final Object f20128c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20127b = i10;
        this.f20128c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f20127b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f20128c;
                f2Var2.f20285g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                xn.Hc = f7;
                xn xnVar = (xn) this.f20128c;
                xnVar.R6.setSaturation(f7);
                xnVar.Q6.setColorFilter(new ColorMatrixColorFilter(xnVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f20128c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.f25358l0;
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
                m00 m00Var = (m00) this.f20128c;
                m00Var.f26270w0 = f7;
                int i10 = m00Var.U;
                org.telegram.ui.ActionBar.e6 e6Var = m00Var.f26241a;
                m00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(m00Var.f26246c0, e6Var)));
                ai.w0 w0Var2 = m00Var.F;
                w0Var2.g1();
                w0Var2.invalidate();
                ((m00) obj).invalidate();
                return;
            case 4:
                z81 z81Var = (z81) obj;
                z81 z81Var2 = (z81) this.f20128c;
                z81Var2.f30883x = f7;
                z81Var2.invalidate();
                return;
            case 5:
                s91 s91Var = (s91) obj;
                s91 s91Var2 = (s91) this.f20128c;
                s91Var2.E = f7;
                r91 r91Var = s91Var2.L;
                if (r91Var != null) {
                    r91Var.a(f7);
                }
                s91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ef0 ef0Var = ((PhotoViewer) this.f20128c).C1;
                if (ef0Var != null) {
                    ef0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20128c).f31535b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20127b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f20128c).f20285g0);
            case 1:
                return Float.valueOf(xn.Hc);
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f20128c).Q0);
            case 3:
                m00 m00Var = (m00) obj;
                return Float.valueOf(((m00) this.f20128c).f26270w0);
            case 4:
                z81 z81Var = (z81) obj;
                return Float.valueOf(((z81) this.f20128c).f30883x);
            case 5:
                s91 s91Var = (s91) obj;
                return Float.valueOf(((s91) this.f20128c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20128c).f31535b1);
        }
    }

    public d2(z81 z81Var) {
        super("progress", 0);
        this.f20127b = 4;
        this.f20128c = z81Var;
    }

    public d2(s91 s91Var) {
        super("clipProgress", 0);
        this.f20127b = 5;
        this.f20128c = s91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20127b = 7;
        this.f20128c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20127b = 6;
        this.f20128c = photoViewer;
    }

    public d2(xn xnVar) {
        super("", 0);
        this.f20127b = 1;
        this.f20128c = xnVar;
    }

    public d2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f20127b = 2;
        this.f20128c = j8Var;
    }
}

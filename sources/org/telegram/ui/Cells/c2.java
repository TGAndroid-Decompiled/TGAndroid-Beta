package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class c2 extends org.telegram.ui.Components.m6 {
    public final int f20902b;
    public final Object f20903c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20902b = i10;
        this.f20903c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f10) {
        float f11;
        switch (this.f20902b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f20903c;
                e2Var2.f20989d0 = f10;
                e2Var2.invalidate();
                return;
            case 1:
                xn.Fc = f10;
                xn xnVar = (xn) this.f20903c;
                xnVar.O6.setSaturation(f10);
                xnVar.N6.setColorFilter(new ColorMatrixColorFilter(xnVar.O6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f20903c;
                c8Var.N0 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.f23896i0;
                if (w0Var != null && w0Var.getSearchContainer() != null) {
                    w0Var.getSearchContainer().setClipChildren(false);
                    w0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = w0Var.getSearchContainer();
                    float f13 = 66.0f;
                    if (AndroidUtilities.isTablet()) {
                        f11 = 74.0f;
                    } else {
                        f11 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, AndroidUtilities.dp(f11), 0);
                    FrameLayout searchContainer2 = w0Var.getSearchContainer();
                    if (AndroidUtilities.isTablet()) {
                        f13 = 74.0f;
                    }
                    searchContainer2.setTranslationX((AndroidUtilities.dp(-52.0f) * f12) + AndroidUtilities.dp(f13));
                    if (w0Var.getSearchClearButton() != null) {
                        w0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f12);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f10));
                org.telegram.ui.Components.c8.k0(c8Var).invalidate();
                return;
            case 3:
                j00 j00Var = (j00) this.f20903c;
                j00Var.f25839t0 = f10;
                int i10 = j00Var.R;
                org.telegram.ui.ActionBar.f6 f6Var = j00Var.f25814a;
                j00Var.Q.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(j00Var.W, f6Var)));
                lh.e1 e1Var = j00Var.C;
                e1Var.f1();
                e1Var.invalidate();
                ((j00) obj).invalidate();
                return;
            case 4:
                m81 m81Var = (m81) obj;
                m81 m81Var2 = (m81) this.f20903c;
                m81Var2.f26989x = f10;
                m81Var2.invalidate();
                return;
            case 5:
                h91 h91Var = (h91) obj;
                h91 h91Var2 = (h91) this.f20903c;
                h91Var2.B = f10;
                g91 g91Var = h91Var2.I;
                if (g91Var != null) {
                    g91Var.a(f10);
                }
                h91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f10);
                ye0 ye0Var = ((PhotoViewer) this.f20903c).f31924z1;
                if (ye0Var != null) {
                    ye0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20903c).Y0 = f10;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20902b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f20903c).f20989d0);
            case 1:
                return Float.valueOf(xn.Fc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.c8) this.f20903c).N0);
            case 3:
                j00 j00Var = (j00) obj;
                return Float.valueOf(((j00) this.f20903c).f25839t0);
            case 4:
                m81 m81Var = (m81) obj;
                return Float.valueOf(((m81) this.f20903c).f26989x);
            case 5:
                h91 h91Var = (h91) obj;
                return Float.valueOf(((h91) this.f20903c).B);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20903c).Y0);
        }
    }

    public c2(m81 m81Var) {
        super("progress", 0);
        this.f20902b = 4;
        this.f20903c = m81Var;
    }

    public c2(h91 h91Var) {
        super("clipProgress", 0);
        this.f20902b = 5;
        this.f20903c = h91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20902b = 7;
        this.f20903c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20902b = 6;
        this.f20903c = photoViewer;
    }

    public c2(xn xnVar) {
        super("", 0);
        this.f20902b = 1;
        this.f20903c = xnVar;
    }

    public c2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.f20902b = 2;
        this.f20903c = c8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.z81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class d2 extends org.telegram.ui.Components.r6 {
    public final int f20142b;
    public final Object f20143c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20142b = i10;
        this.f20143c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f20142b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f20143c;
                f2Var2.f20300g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                wn.Hc = f7;
                wn wnVar = (wn) this.f20143c;
                wnVar.R6.setSaturation(f7);
                wnVar.Q6.setColorFilter(new ColorMatrixColorFilter(wnVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f20143c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.f25327l0;
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
                n00 n00Var = (n00) this.f20143c;
                n00Var.f26505w0 = f7;
                int i10 = n00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = n00Var.f26476a;
                n00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(n00Var.f26481c0, d6Var)));
                ai.w0 w0Var = n00Var.F;
                w0Var.h1();
                w0Var.invalidate();
                ((n00) obj).invalidate();
                return;
            case 4:
                z81 z81Var = (z81) obj;
                z81 z81Var2 = (z81) this.f20143c;
                z81Var2.f30934x = f7;
                z81Var2.invalidate();
                return;
            case 5:
                t91 t91Var = (t91) obj;
                t91 t91Var2 = (t91) this.f20143c;
                t91Var2.E = f7;
                s91 s91Var = t91Var2.L;
                if (s91Var != null) {
                    s91Var.a(f7);
                }
                t91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                hf0 hf0Var = ((PhotoViewer) this.f20143c).C1;
                if (hf0Var != null) {
                    hf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20143c).f31607b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20142b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f20143c).f20300g0);
            case 1:
                return Float.valueOf(wn.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f20143c).Q0);
            case 3:
                n00 n00Var = (n00) obj;
                return Float.valueOf(((n00) this.f20143c).f26505w0);
            case 4:
                z81 z81Var = (z81) obj;
                return Float.valueOf(((z81) this.f20143c).f30934x);
            case 5:
                t91 t91Var = (t91) obj;
                return Float.valueOf(((t91) this.f20143c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20143c).f31607b1);
        }
    }

    public d2(z81 z81Var) {
        super("progress", 0);
        this.f20142b = 4;
        this.f20143c = z81Var;
    }

    public d2(t91 t91Var) {
        super("clipProgress", 0);
        this.f20142b = 5;
        this.f20143c = t91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20142b = 7;
        this.f20143c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20142b = 6;
        this.f20143c = photoViewer;
    }

    public d2(wn wnVar) {
        super("", 0);
        this.f20142b = 1;
        this.f20143c = wnVar;
    }

    public d2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f20142b = 2;
        this.f20143c = j8Var;
    }
}

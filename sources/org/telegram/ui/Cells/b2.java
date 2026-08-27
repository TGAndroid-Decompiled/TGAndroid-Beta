package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.yz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public final class b2 extends org.telegram.ui.Components.l6 {

    public final int f24093b;

    public final Object f24094c;

    public b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f24093b = i10;
        this.f24094c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f24093b) {
            case 0:
                d2 d2Var = (d2) this.f24094c;
                d2Var.f24185c0 = f10;
                d2Var.invalidate();
                break;
            case 1:
                rn.Ec = f10;
                rn rnVar = (rn) this.f24094c;
                rnVar.N6.setSaturation(f10);
                rnVar.M6.setColorFilter(new ColorMatrixColorFilter(rnVar.N6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f24094c;
                b8Var.M0 = f10;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.f27021h0;
                if (v0Var != null && v0Var.getSearchContainer() != null) {
                    v0Var.getSearchContainer().setClipChildren(false);
                    v0Var.getSearchContainer().setClipToPadding(false);
                    v0Var.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    v0Var.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (v0Var.getSearchClearButton() != null) {
                        v0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f10));
                ((org.telegram.ui.ActionBar.e3) b8Var).containerView.invalidate();
                break;
            case 3:
                yz yzVar = (yz) this.f24094c;
                yzVar.f35093s0 = f10;
                int i10 = yzVar.Q;
                org.telegram.ui.ActionBar.c6 c6Var = yzVar.f35068a;
                yzVar.P.setColor(i0.b.d(f10, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(yzVar.V, c6Var)));
                hh.f1 f1Var = yzVar.B;
                f1Var.f1();
                f1Var.invalidate();
                ((yz) obj).invalidate();
                break;
            case 4:
                q71 q71Var = (q71) this.f24094c;
                q71Var.f31829x = f10;
                q71Var.invalidate();
                break;
            case 5:
                k81 k81Var = (k81) this.f24094c;
                k81Var.A = f10;
                j81 j81Var = k81Var.H;
                if (j81Var != null) {
                    j81Var.b(f10);
                }
                k81Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f10);
                ge0 ge0Var = ((PhotoViewer) this.f24094c).f35802y1;
                if (ge0Var != null) {
                    ge0Var.setVideoThumbFlashAlpha(f10);
                }
                break;
            default:
                ((ProfileActivity) this.f24094c).X0 = f10;
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24093b) {
            case 0:
                return Float.valueOf(((d2) this.f24094c).f24185c0);
            case 1:
                return Float.valueOf(rn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.b8) this.f24094c).M0);
            case 3:
                return Float.valueOf(((yz) this.f24094c).f35093s0);
            case 4:
                return Float.valueOf(((q71) this.f24094c).f31829x);
            case 5:
                return Float.valueOf(((k81) this.f24094c).A);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.f24094c).X0);
        }
    }

    public b2(q71 q71Var) {
        super("progress", 0);
        this.f24093b = 4;
        this.f24094c = q71Var;
    }

    public b2(k81 k81Var) {
        super("clipProgress", 0);
        this.f24093b = 5;
        this.f24094c = k81Var;
    }

    public b2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f24093b = 7;
        this.f24094c = profileActivity;
    }

    public b2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f24093b = 6;
        this.f24094c = photoViewer;
    }

    public b2(rn rnVar) {
        super("", 0);
        this.f24093b = 1;
        this.f24094c = rnVar;
    }

    public b2(org.telegram.ui.Components.b8 b8Var) {
        super("actionBarSlide", 0);
        this.f24093b = 2;
        this.f24094c = b8Var;
    }
}

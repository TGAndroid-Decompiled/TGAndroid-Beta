package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
public final class b2 extends org.telegram.ui.Components.q6 {
    public final int f24112b;
    public final Object f24113c;

    public b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f24112b = i10;
        this.f24113c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f9) {
        float f10;
        switch (this.f24112b) {
            case 0:
                d2 d2Var = (d2) obj;
                d2 d2Var2 = (d2) this.f24113c;
                d2Var2.f24207c0 = f9;
                d2Var2.invalidate();
                return;
            case 1:
                tn.Ec = f9;
                tn tnVar = (tn) this.f24113c;
                tnVar.N6.setSaturation(f9);
                tnVar.M6.setColorFilter(new ColorMatrixColorFilter(tnVar.N6));
                return;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.f24113c;
                g8Var.M0 = f9;
                org.telegram.ui.ActionBar.h5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f11 = 1.0f - f9;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = g8Var.f28787h0;
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
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f9));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f9));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f9));
                org.telegram.ui.Components.g8.k0(g8Var).invalidate();
                return;
            case 3:
                f00 f00Var = (f00) this.f24113c;
                f00Var.f28251s0 = f9;
                int i10 = f00Var.Q;
                org.telegram.ui.ActionBar.c6 c6Var = f00Var.f28226a;
                f00Var.P.setColor(i0.a.d(f9, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(f00Var.V, c6Var)));
                jh.e1 e1Var = f00Var.B;
                e1Var.f1();
                e1Var.invalidate();
                ((f00) obj).invalidate();
                return;
            case 4:
                a81 a81Var = (a81) obj;
                a81 a81Var2 = (a81) this.f24113c;
                a81Var2.f26705x = f9;
                a81Var2.invalidate();
                return;
            case 5:
                u81 u81Var = (u81) obj;
                u81 u81Var2 = (u81) this.f24113c;
                u81Var2.A = f9;
                t81 t81Var = u81Var2.H;
                if (t81Var != null) {
                    t81Var.a(f9);
                }
                u81Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f9);
                pe0 pe0Var = ((PhotoViewer) this.f24113c).f35866y1;
                if (pe0Var != null) {
                    pe0Var.setVideoThumbFlashAlpha(f9);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f24113c).X0 = f9;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24112b) {
            case 0:
                d2 d2Var = (d2) obj;
                return Float.valueOf(((d2) this.f24113c).f24207c0);
            case 1:
                return Float.valueOf(tn.Ec);
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(((org.telegram.ui.Components.g8) this.f24113c).M0);
            case 3:
                f00 f00Var = (f00) obj;
                return Float.valueOf(((f00) this.f24113c).f28251s0);
            case 4:
                a81 a81Var = (a81) obj;
                return Float.valueOf(((a81) this.f24113c).f26705x);
            case 5:
                u81 u81Var = (u81) obj;
                return Float.valueOf(((u81) this.f24113c).A);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f24113c).X0);
        }
    }

    public b2(a81 a81Var) {
        super("progress", 0);
        this.f24112b = 4;
        this.f24113c = a81Var;
    }

    public b2(u81 u81Var) {
        super("clipProgress", 0);
        this.f24112b = 5;
        this.f24113c = u81Var;
    }

    public b2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f24112b = 7;
        this.f24113c = profileActivity;
    }

    public b2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f24112b = 6;
        this.f24113c = photoViewer;
    }

    public b2(tn tnVar) {
        super("", 0);
        this.f24112b = 1;
        this.f24113c = tnVar;
    }

    public b2(org.telegram.ui.Components.g8 g8Var) {
        super("actionBarSlide", 0);
        this.f24112b = 2;
        this.f24113c = g8Var;
    }
}

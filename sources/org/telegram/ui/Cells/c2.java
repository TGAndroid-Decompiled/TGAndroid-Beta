package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.n81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class c2 extends org.telegram.ui.Components.m6 {
    public final int f22633b;
    public final Object f22634c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f22633b = i10;
        this.f22634c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f10) {
        float f11;
        switch (this.f22633b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f22634c;
                e2Var2.f22727d0 = f10;
                e2Var2.invalidate();
                return;
            case 1:
                xn.Fc = f10;
                xn xnVar = (xn) this.f22634c;
                xnVar.O6.setSaturation(f10);
                xnVar.N6.setColorFilter(new ColorMatrixColorFilter(xnVar.O6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f22634c;
                c8Var.N0 = f10;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.f25839i0;
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
                l00 l00Var = (l00) this.f22634c;
                l00Var.f28512t0 = f10;
                int i10 = l00Var.R;
                org.telegram.ui.ActionBar.g6 g6Var = l00Var.f28486a;
                l00Var.Q.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(l00Var.W, g6Var)));
                mh.d1 d1Var = l00Var.C;
                d1Var.f1();
                d1Var.invalidate();
                ((l00) obj).invalidate();
                return;
            case 4:
                n81 n81Var = (n81) obj;
                n81 n81Var2 = (n81) this.f22634c;
                n81Var2.f29441x = f10;
                n81Var2.invalidate();
                return;
            case 5:
                i91 i91Var = (i91) obj;
                i91 i91Var2 = (i91) this.f22634c;
                i91Var2.B = f10;
                h91 h91Var = i91Var2.I;
                if (h91Var != null) {
                    h91Var.a(f10);
                }
                i91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f10);
                af0 af0Var = ((PhotoViewer) this.f22634c).f34450z1;
                if (af0Var != null) {
                    af0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f22634c).Y0 = f10;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22633b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f22634c).f22727d0);
            case 1:
                return Float.valueOf(xn.Fc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.c8) this.f22634c).N0);
            case 3:
                l00 l00Var = (l00) obj;
                return Float.valueOf(((l00) this.f22634c).f28512t0);
            case 4:
                n81 n81Var = (n81) obj;
                return Float.valueOf(((n81) this.f22634c).f29441x);
            case 5:
                i91 i91Var = (i91) obj;
                return Float.valueOf(((i91) this.f22634c).B);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f22634c).Y0);
        }
    }

    public c2(n81 n81Var) {
        super("progress", 0);
        this.f22633b = 4;
        this.f22634c = n81Var;
    }

    public c2(i91 i91Var) {
        super("clipProgress", 0);
        this.f22633b = 5;
        this.f22634c = i91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f22633b = 7;
        this.f22634c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f22633b = 6;
        this.f22634c = photoViewer;
    }

    public c2(xn xnVar) {
        super("", 0);
        this.f22633b = 1;
        this.f22634c = xnVar;
    }

    public c2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.f22633b = 2;
        this.f22634c = c8Var;
    }
}

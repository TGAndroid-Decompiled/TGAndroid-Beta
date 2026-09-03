package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class c2 extends org.telegram.ui.Components.m6 {
    public final int f22635b;
    public final Object f22636c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f22635b = i10;
        this.f22636c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f10) {
        float f11;
        switch (this.f22635b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f22636c;
                e2Var2.f22729d0 = f10;
                e2Var2.invalidate();
                return;
            case 1:
                xn.Fc = f10;
                xn xnVar = (xn) this.f22636c;
                xnVar.O6.setSaturation(f10);
                xnVar.N6.setColorFilter(new ColorMatrixColorFilter(xnVar.O6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f22636c;
                c8Var.N0 = f10;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.f25813i0;
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
                l00 l00Var = (l00) this.f22636c;
                l00Var.f28561t0 = f10;
                int i10 = l00Var.R;
                org.telegram.ui.ActionBar.g6 g6Var = l00Var.f28535a;
                l00Var.Q.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(l00Var.W, g6Var)));
                mh.d1 d1Var = l00Var.C;
                d1Var.e1();
                d1Var.invalidate();
                ((l00) obj).invalidate();
                return;
            case 4:
                m81 m81Var = (m81) obj;
                m81 m81Var2 = (m81) this.f22636c;
                m81Var2.f29011x = f10;
                m81Var2.invalidate();
                return;
            case 5:
                h91 h91Var = (h91) obj;
                h91 h91Var2 = (h91) this.f22636c;
                h91Var2.B = f10;
                g91 g91Var = h91Var2.I;
                if (g91Var != null) {
                    g91Var.a(f10);
                }
                h91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f10);
                af0 af0Var = ((PhotoViewer) this.f22636c).f34450z1;
                if (af0Var != null) {
                    af0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f22636c).Y0 = f10;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22635b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f22636c).f22729d0);
            case 1:
                return Float.valueOf(xn.Fc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.c8) this.f22636c).N0);
            case 3:
                l00 l00Var = (l00) obj;
                return Float.valueOf(((l00) this.f22636c).f28561t0);
            case 4:
                m81 m81Var = (m81) obj;
                return Float.valueOf(((m81) this.f22636c).f29011x);
            case 5:
                h91 h91Var = (h91) obj;
                return Float.valueOf(((h91) this.f22636c).B);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f22636c).Y0);
        }
    }

    public c2(m81 m81Var) {
        super("progress", 0);
        this.f22635b = 4;
        this.f22636c = m81Var;
    }

    public c2(h91 h91Var) {
        super("clipProgress", 0);
        this.f22635b = 5;
        this.f22636c = h91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f22635b = 7;
        this.f22636c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f22635b = 6;
        this.f22636c = photoViewer;
    }

    public c2(xn xnVar) {
        super("", 0);
        this.f22635b = 1;
        this.f22636c = xnVar;
    }

    public c2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.f22635b = 2;
        this.f22636c = c8Var;
    }
}

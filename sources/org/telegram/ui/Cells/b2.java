package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class b2 extends org.telegram.ui.Components.m6 {
    public final int f20831b;
    public final Object f20832c;

    public b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20831b = i10;
        this.f20832c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f10) {
        float f11;
        switch (this.f20831b) {
            case 0:
                d2 d2Var = (d2) obj;
                d2 d2Var2 = (d2) this.f20832c;
                d2Var2.f20906d0 = f10;
                d2Var2.invalidate();
                return;
            case 1:
                zn.Fc = f10;
                zn znVar = (zn) this.f20832c;
                znVar.O6.setSaturation(f10);
                znVar.N6.setColorFilter(new ColorMatrixColorFilter(znVar.O6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f20832c;
                c8Var.N0 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.f23851i0;
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
                k00 k00Var = (k00) this.f20832c;
                k00Var.f26115t0 = f10;
                int i10 = k00Var.R;
                org.telegram.ui.ActionBar.f6 f6Var = k00Var.f26090a;
                k00Var.Q.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.W, f6Var)));
                lh.e1 e1Var = k00Var.C;
                e1Var.e1();
                e1Var.invalidate();
                ((k00) obj).invalidate();
                return;
            case 4:
                m81 m81Var = (m81) obj;
                m81 m81Var2 = (m81) this.f20832c;
                m81Var2.f26999x = f10;
                m81Var2.invalidate();
                return;
            case 5:
                h91 h91Var = (h91) obj;
                h91 h91Var2 = (h91) this.f20832c;
                h91Var2.B = f10;
                g91 g91Var = h91Var2.I;
                if (g91Var != null) {
                    g91Var.a(f10);
                }
                h91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f10);
                ze0 ze0Var = ((PhotoViewer) this.f20832c).f31898z1;
                if (ze0Var != null) {
                    ze0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20832c).Y0 = f10;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20831b) {
            case 0:
                d2 d2Var = (d2) obj;
                return Float.valueOf(((d2) this.f20832c).f20906d0);
            case 1:
                return Float.valueOf(zn.Fc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.c8) this.f20832c).N0);
            case 3:
                k00 k00Var = (k00) obj;
                return Float.valueOf(((k00) this.f20832c).f26115t0);
            case 4:
                m81 m81Var = (m81) obj;
                return Float.valueOf(((m81) this.f20832c).f26999x);
            case 5:
                h91 h91Var = (h91) obj;
                return Float.valueOf(((h91) this.f20832c).B);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20832c).Y0);
        }
    }

    public b2(m81 m81Var) {
        super("progress", 0);
        this.f20831b = 4;
        this.f20832c = m81Var;
    }

    public b2(h91 h91Var) {
        super("clipProgress", 0);
        this.f20831b = 5;
        this.f20832c = h91Var;
    }

    public b2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20831b = 7;
        this.f20832c = profileActivity;
    }

    public b2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20831b = 6;
        this.f20832c = photoViewer;
    }

    public b2(zn znVar) {
        super("", 0);
        this.f20831b = 1;
        this.f20832c = znVar;
    }

    public b2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.f20831b = 2;
        this.f20832c = c8Var;
    }
}

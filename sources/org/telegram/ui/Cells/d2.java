package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ja1;
import org.telegram.ui.Components.ka1;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class d2 extends org.telegram.ui.Components.t6 {
    public final int f21954b;
    public final Object f21955c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21954b = i10;
        this.f21955c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21954b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f21955c;
                f2Var2.f22059g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                zn.Ic = f7;
                zn znVar = (zn) this.f21955c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f21955c;
                l8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = l8Var.f28211l0;
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
                org.telegram.ui.Components.l8.l0(l8Var).invalidate();
                return;
            case 3:
                b10 b10Var = (b10) this.f21955c;
                b10Var.f24774w0 = f7;
                int i10 = b10Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = b10Var.f24744a;
                b10Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(b10Var.f24749c0, d6Var)));
                ai.w0 w0Var = b10Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((b10) obj).invalidate();
                return;
            case 4:
                r91 r91Var = (r91) obj;
                r91 r91Var2 = (r91) this.f21955c;
                r91Var2.f30411x = f7;
                r91Var2.invalidate();
                return;
            case 5:
                ka1 ka1Var = (ka1) obj;
                ka1 ka1Var2 = (ka1) this.f21955c;
                ka1Var2.E = f7;
                ja1 ja1Var = ka1Var2.L;
                if (ja1Var != null) {
                    ja1Var.a(f7);
                }
                ka1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                xf0 xf0Var = ((PhotoViewer) this.f21955c).C1;
                if (xf0Var != null) {
                    xf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21955c).f34248b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21954b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f21955c).f22059g0);
            case 1:
                return Float.valueOf(zn.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.l8) this.f21955c).Q0);
            case 3:
                b10 b10Var = (b10) obj;
                return Float.valueOf(((b10) this.f21955c).f24774w0);
            case 4:
                r91 r91Var = (r91) obj;
                return Float.valueOf(((r91) this.f21955c).f30411x);
            case 5:
                ka1 ka1Var = (ka1) obj;
                return Float.valueOf(((ka1) this.f21955c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21955c).f34248b1);
        }
    }

    public d2(r91 r91Var) {
        super("progress", 0);
        this.f21954b = 4;
        this.f21955c = r91Var;
    }

    public d2(ka1 ka1Var) {
        super("clipProgress", 0);
        this.f21954b = 5;
        this.f21955c = ka1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21954b = 7;
        this.f21955c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21954b = 6;
        this.f21955c = photoViewer;
    }

    public d2(zn znVar) {
        super("", 0);
        this.f21954b = 1;
        this.f21955c = znVar;
    }

    public d2(org.telegram.ui.Components.l8 l8Var) {
        super("actionBarSlide", 0);
        this.f21954b = 2;
        this.f21955c = l8Var;
    }
}

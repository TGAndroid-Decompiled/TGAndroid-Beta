package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.ja1;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class d2 extends org.telegram.ui.Components.t6 {
    public final int f21990b;
    public final Object f21991c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21990b = i10;
        this.f21991c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21990b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f21991c;
                f2Var2.f22095g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                zn.Ic = f7;
                zn znVar = (zn) this.f21991c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f21991c;
                l8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = l8Var.f28243l0;
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
                b10 b10Var = (b10) this.f21991c;
                b10Var.f24842w0 = f7;
                int i10 = b10Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = b10Var.f24812a;
                b10Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(b10Var.f24817c0, d6Var)));
                ai.w0 w0Var = b10Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((b10) obj).invalidate();
                return;
            case 4:
                q91 q91Var = (q91) obj;
                q91 q91Var2 = (q91) this.f21991c;
                q91Var2.f30213x = f7;
                q91Var2.invalidate();
                return;
            case 5:
                ja1 ja1Var = (ja1) obj;
                ja1 ja1Var2 = (ja1) this.f21991c;
                ja1Var2.E = f7;
                ia1 ia1Var = ja1Var2.L;
                if (ia1Var != null) {
                    ia1Var.a(f7);
                }
                ja1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                wf0 wf0Var = ((PhotoViewer) this.f21991c).C1;
                if (wf0Var != null) {
                    wf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21991c).f34282b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21990b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f21991c).f22095g0);
            case 1:
                return Float.valueOf(zn.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.l8) this.f21991c).Q0);
            case 3:
                b10 b10Var = (b10) obj;
                return Float.valueOf(((b10) this.f21991c).f24842w0);
            case 4:
                q91 q91Var = (q91) obj;
                return Float.valueOf(((q91) this.f21991c).f30213x);
            case 5:
                ja1 ja1Var = (ja1) obj;
                return Float.valueOf(((ja1) this.f21991c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21991c).f34282b1);
        }
    }

    public d2(q91 q91Var) {
        super("progress", 0);
        this.f21990b = 4;
        this.f21991c = q91Var;
    }

    public d2(ja1 ja1Var) {
        super("clipProgress", 0);
        this.f21990b = 5;
        this.f21991c = ja1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21990b = 7;
        this.f21991c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21990b = 6;
        this.f21991c = photoViewer;
    }

    public d2(zn znVar) {
        super("", 0);
        this.f21990b = 1;
        this.f21991c = znVar;
    }

    public d2(org.telegram.ui.Components.l8 l8Var) {
        super("actionBarSlide", 0);
        this.f21990b = 2;
        this.f21991c = l8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.ja1;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class d2 extends org.telegram.ui.Components.t6 {
    public final int f21962b;
    public final Object f21963c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21962b = i10;
        this.f21963c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21962b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f21963c;
                f2Var2.f22067g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                zn.Ic = f7;
                zn znVar = (zn) this.f21963c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f21963c;
                l8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = l8Var.f28346l0;
                if (v0Var != null && v0Var.getSearchContainer() != null) {
                    v0Var.getSearchContainer().setClipChildren(false);
                    v0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = v0Var.getSearchContainer();
                    float f12 = 66.0f;
                    if (AndroidUtilities.isTablet()) {
                        f10 = 74.0f;
                    } else {
                        f10 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, AndroidUtilities.dp(f10), 0);
                    FrameLayout searchContainer2 = v0Var.getSearchContainer();
                    if (AndroidUtilities.isTablet()) {
                        f12 = 74.0f;
                    }
                    searchContainer2.setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(f12));
                    if (v0Var.getSearchClearButton() != null) {
                        v0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                org.telegram.ui.Components.l8.l0(l8Var).invalidate();
                return;
            case 3:
                a10 a10Var = (a10) this.f21963c;
                a10Var.f24528w0 = f7;
                int i10 = a10Var.U;
                org.telegram.ui.ActionBar.e6 e6Var = a10Var.f24498a;
                a10Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(a10Var.f24503c0, e6Var)));
                ai.w0 w0Var = a10Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((a10) obj).invalidate();
                return;
            case 4:
                p91 p91Var = (p91) obj;
                p91 p91Var2 = (p91) this.f21963c;
                p91Var2.f29814x = f7;
                p91Var2.invalidate();
                return;
            case 5:
                ja1 ja1Var = (ja1) obj;
                ja1 ja1Var2 = (ja1) this.f21963c;
                ja1Var2.E = f7;
                ia1 ia1Var = ja1Var2.L;
                if (ia1Var != null) {
                    ia1Var.a(f7);
                }
                ja1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                vf0 vf0Var = ((PhotoViewer) this.f21963c).C1;
                if (vf0Var != null) {
                    vf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f21963c).f34220b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21962b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f21963c).f22067g0);
            case 1:
                return Float.valueOf(zn.Ic);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.l8) this.f21963c).Q0);
            case 3:
                a10 a10Var = (a10) obj;
                return Float.valueOf(((a10) this.f21963c).f24528w0);
            case 4:
                p91 p91Var = (p91) obj;
                return Float.valueOf(((p91) this.f21963c).f29814x);
            case 5:
                ja1 ja1Var = (ja1) obj;
                return Float.valueOf(((ja1) this.f21963c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f21963c).f34220b1);
        }
    }

    public d2(p91 p91Var) {
        super("progress", 0);
        this.f21962b = 4;
        this.f21963c = p91Var;
    }

    public d2(ja1 ja1Var) {
        super("clipProgress", 0);
        this.f21962b = 5;
        this.f21963c = ja1Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f21962b = 7;
        this.f21963c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21962b = 6;
        this.f21963c = photoViewer;
    }

    public d2(zn znVar) {
        super("", 0);
        this.f21962b = 1;
        this.f21963c = znVar;
    }

    public d2(org.telegram.ui.Components.l8 l8Var) {
        super("actionBarSlide", 0);
        this.f21962b = 2;
        this.f21963c = l8Var;
    }
}

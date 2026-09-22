package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class d2 extends org.telegram.ui.Components.q6 {
    public final int f20131b;
    public final Object f20132c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f20131b = i10;
        this.f20132c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f20131b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f20132c;
                f2Var2.f20275g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                zn.Hc = f7;
                zn znVar = (zn) this.f20132c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f20132c;
                i8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = i8Var.f25011l0;
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
                org.telegram.ui.Components.i8.k0(i8Var).invalidate();
                return;
            case 3:
                k00 k00Var = (k00) this.f20132c;
                k00Var.f25552w0 = f7;
                int i10 = k00Var.U;
                org.telegram.ui.ActionBar.f6 f6Var = k00Var.f25523a;
                k00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.f25528c0, f6Var)));
                ai.w0 w0Var = k00Var.F;
                w0Var.g1();
                w0Var.invalidate();
                ((k00) obj).invalidate();
                return;
            case 4:
                a91 a91Var = (a91) obj;
                a91 a91Var2 = (a91) this.f20132c;
                a91Var2.f22578x = f7;
                a91Var2.invalidate();
                return;
            case 5:
                t91 t91Var = (t91) obj;
                t91 t91Var2 = (t91) this.f20132c;
                t91Var2.E = f7;
                s91 s91Var = t91Var2.L;
                if (s91Var != null) {
                    s91Var.a(f7);
                }
                t91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ff0 ff0Var = ((PhotoViewer) this.f20132c).C1;
                if (ff0Var != null) {
                    ff0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f20132c).f31552b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20131b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f20132c).f20275g0);
            case 1:
                return Float.valueOf(zn.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.i8) this.f20132c).Q0);
            case 3:
                k00 k00Var = (k00) obj;
                return Float.valueOf(((k00) this.f20132c).f25552w0);
            case 4:
                a91 a91Var = (a91) obj;
                return Float.valueOf(((a91) this.f20132c).f22578x);
            case 5:
                t91 t91Var = (t91) obj;
                return Float.valueOf(((t91) this.f20132c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f20132c).f31552b1);
        }
    }

    public d2(a91 a91Var) {
        super("progress", 0);
        this.f20131b = 4;
        this.f20132c = a91Var;
    }

    public d2(t91 t91Var) {
        super("clipProgress", 0);
        this.f20131b = 5;
        this.f20132c = t91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f20131b = 7;
        this.f20132c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f20131b = 6;
        this.f20132c = photoViewer;
    }

    public d2(zn znVar) {
        super("", 0);
        this.f20131b = 1;
        this.f20132c = znVar;
    }

    public d2(org.telegram.ui.Components.i8 i8Var) {
        super("actionBarSlide", 0);
        this.f20131b = 2;
        this.f20132c = i8Var;
    }
}

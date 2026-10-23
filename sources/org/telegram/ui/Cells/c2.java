package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
public final class c2 extends org.telegram.ui.Components.s6 {
    public final int f22199b;
    public final Object f22200c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f22199b = i10;
        this.f22200c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f22199b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f22200c;
                e2Var2.f22306g0 = f7;
                e2Var2.invalidate();
                return;
            case 1:
                sn.Wc = f7;
                sn snVar = (sn) this.f22200c;
                snVar.f41495d7.setSaturation(f7);
                snVar.f41482c7.setColorFilter(new ColorMatrixColorFilter(snVar.f41495d7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f22200c;
                k8Var.Q0 = f7;
                org.telegram.ui.ActionBar.n5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.f27927k0;
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
                org.telegram.ui.Components.k8.n0(k8Var).invalidate();
                return;
            case 3:
                s00 s00Var = (s00) this.f22200c;
                s00Var.f30333w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.g6 g6Var = s00Var.f30304a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(s00Var.f30309c0, g6Var)));
                ai.u1 u1Var = s00Var.F;
                u1Var.g1();
                u1Var.invalidate();
                ((s00) obj).invalidate();
                return;
            case 4:
                m91 m91Var = (m91) obj;
                m91 m91Var2 = (m91) this.f22200c;
                m91Var2.f28619x = f7;
                m91Var2.invalidate();
                return;
            case 5:
                fa1 fa1Var = (fa1) obj;
                fa1 fa1Var2 = (fa1) this.f22200c;
                fa1Var2.E = f7;
                ea1 ea1Var = fa1Var2.L;
                if (ea1Var != null) {
                    ea1Var.a(f7);
                }
                fa1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                rf0 rf0Var = ((PhotoViewer) this.f22200c).C1;
                if (rf0Var != null) {
                    rf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f22200c).f33899c1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22199b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f22200c).f22306g0);
            case 1:
                return Float.valueOf(sn.Wc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.k8) this.f22200c).Q0);
            case 3:
                s00 s00Var = (s00) obj;
                return Float.valueOf(((s00) this.f22200c).f30333w0);
            case 4:
                m91 m91Var = (m91) obj;
                return Float.valueOf(((m91) this.f22200c).f28619x);
            case 5:
                fa1 fa1Var = (fa1) obj;
                return Float.valueOf(((fa1) this.f22200c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f22200c).f33899c1);
        }
    }

    public c2(m91 m91Var) {
        super("progress", 0);
        this.f22199b = 4;
        this.f22200c = m91Var;
    }

    public c2(fa1 fa1Var) {
        super("clipProgress", 0);
        this.f22199b = 5;
        this.f22200c = fa1Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f22199b = 7;
        this.f22200c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f22199b = 6;
        this.f22200c = photoViewer;
    }

    public c2(sn snVar) {
        super("", 0);
        this.f22199b = 1;
        this.f22200c = snVar;
    }

    public c2(org.telegram.ui.Components.k8 k8Var) {
        super("actionBarSlide", 0);
        this.f22199b = 2;
        this.f22200c = k8Var;
    }
}

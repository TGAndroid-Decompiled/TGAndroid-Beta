package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.w91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
public final class d2 extends org.telegram.ui.Components.s6 {
    public final int f22114b;
    public final Object f22115c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f22114b = i10;
        this.f22115c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f22114b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f22115c;
                f2Var2.f22216g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                sn.Jc = f7;
                sn snVar = (sn) this.f22115c;
                snVar.R6.setSaturation(f7);
                snVar.Q6.setColorFilter(new ColorMatrixColorFilter(snVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f22115c;
                k8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.f27778l0;
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
                org.telegram.ui.Components.k8.l0(k8Var).invalidate();
                return;
            case 3:
                s00 s00Var = (s00) this.f22115c;
                s00Var.f30122w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = s00Var.f30093a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(s00Var.f30098c0, d6Var)));
                ai.u1 u1Var = s00Var.F;
                u1Var.f1();
                u1Var.invalidate();
                ((s00) obj).invalidate();
                return;
            case 4:
                d91 d91Var = (d91) obj;
                d91 d91Var2 = (d91) this.f22115c;
                d91Var2.f25535x = f7;
                d91Var2.invalidate();
                return;
            case 5:
                w91 w91Var = (w91) obj;
                w91 w91Var2 = (w91) this.f22115c;
                w91Var2.E = f7;
                v91 v91Var = w91Var2.L;
                if (v91Var != null) {
                    v91Var.b(f7);
                }
                w91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                nf0 nf0Var = ((PhotoViewer) this.f22115c).C1;
                if (nf0Var != null) {
                    nf0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f22115c).f33585c1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22114b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f22115c).f22216g0);
            case 1:
                return Float.valueOf(sn.Jc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.k8) this.f22115c).Q0);
            case 3:
                s00 s00Var = (s00) obj;
                return Float.valueOf(((s00) this.f22115c).f30122w0);
            case 4:
                d91 d91Var = (d91) obj;
                return Float.valueOf(((d91) this.f22115c).f25535x);
            case 5:
                w91 w91Var = (w91) obj;
                return Float.valueOf(((w91) this.f22115c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f22115c).f33585c1);
        }
    }

    public d2(d91 d91Var) {
        super("progress", 0);
        this.f22114b = 4;
        this.f22115c = d91Var;
    }

    public d2(w91 w91Var) {
        super("clipProgress", 0);
        this.f22114b = 5;
        this.f22115c = w91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f22114b = 7;
        this.f22115c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f22114b = 6;
        this.f22115c = photoViewer;
    }

    public d2(sn snVar) {
        super("", 0);
        this.f22114b = 1;
        this.f22115c = snVar;
    }

    public d2(org.telegram.ui.Components.k8 k8Var) {
        super("actionBarSlide", 0);
        this.f22114b = 2;
        this.f22115c = k8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class c2 extends org.telegram.ui.Components.r6 {
    public final int f19832b;
    public final Object f19833c;

    public c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f19832b = i10;
        this.f19833c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f7) {
        float f10;
        switch (this.f19832b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f19833c;
                e2Var2.f19932g0 = f7;
                e2Var2.invalidate();
                return;
            case 1:
                xn.Hc = f7;
                xn xnVar = (xn) this.f19833c;
                xnVar.R6.setSaturation(f7);
                xnVar.Q6.setColorFilter(new ColorMatrixColorFilter(xnVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f19833c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.i5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.f25176l0;
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
                org.telegram.ui.Components.j8.k0(j8Var).invalidate();
                return;
            case 3:
                l00 l00Var = (l00) this.f19833c;
                l00Var.f25762w0 = f7;
                int i10 = l00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = l00Var.f25733a;
                l00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(l00Var.f25738c0, d6Var)));
                ai.w0 w0Var = l00Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((l00) obj).invalidate();
                return;
            case 4:
                i81 i81Var = (i81) obj;
                i81 i81Var2 = (i81) this.f19833c;
                i81Var2.f24909x = f7;
                i81Var2.invalidate();
                return;
            case 5:
                d91 d91Var = (d91) obj;
                d91 d91Var2 = (d91) this.f19833c;
                d91Var2.E = f7;
                c91 c91Var = d91Var2.L;
                if (c91Var != null) {
                    c91Var.a(f7);
                }
                d91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                ue0 ue0Var = ((PhotoViewer) this.f19833c).C1;
                if (ue0Var != null) {
                    ue0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f19833c).f31218b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f19832b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f19833c).f19932g0);
            case 1:
                return Float.valueOf(xn.Hc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.j8) this.f19833c).Q0);
            case 3:
                l00 l00Var = (l00) obj;
                return Float.valueOf(((l00) this.f19833c).f25762w0);
            case 4:
                i81 i81Var = (i81) obj;
                return Float.valueOf(((i81) this.f19833c).f24909x);
            case 5:
                d91 d91Var = (d91) obj;
                return Float.valueOf(((d91) this.f19833c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f19833c).f31218b1);
        }
    }

    public c2(i81 i81Var) {
        super("progress", 0);
        this.f19832b = 4;
        this.f19833c = i81Var;
    }

    public c2(d91 d91Var) {
        super("clipProgress", 0);
        this.f19832b = 5;
        this.f19833c = d91Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f19832b = 7;
        this.f19833c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f19832b = 6;
        this.f19833c = photoViewer;
    }

    public c2(xn xnVar) {
        super("", 0);
        this.f19832b = 1;
        this.f19833c = xnVar;
    }

    public c2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.f19832b = 2;
        this.f19833c = j8Var;
    }
}

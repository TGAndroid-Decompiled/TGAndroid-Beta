package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec1;
import org.telegram.ui.Components.fc1;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class b2 extends org.telegram.ui.Components.u6 {
    public final int f23893b;
    public final Object f23894c;

    public b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f23893b = i10;
        this.f23894c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f23893b) {
            case 0:
                d2 d2Var = (d2) obj;
                d2 d2Var2 = (d2) this.f23894c;
                d2Var2.f23990g0 = f7;
                d2Var2.invalidate();
                return;
            case 1:
                un.f44169cd = f7;
                un unVar = (un) this.f23894c;
                unVar.f44224d7.setSaturation(f7);
                unVar.f44211c7.setColorFilter(new ColorMatrixColorFilter(unVar.f44224d7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.f23894c;
                m8Var.Q0 = f7;
                org.telegram.ui.ActionBar.b6 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.f30433k0;
                if (w0Var != null && w0Var.getSearchContainer() != null) {
                    w0Var.getSearchContainer().setClipChildren(false);
                    w0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = w0Var.getSearchContainer();
                    float f12 = 66.0f;
                    if (AndroidUtilities.isTablet()) {
                        f10 = 74.0f;
                    } else {
                        f10 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, AndroidUtilities.dp(f10), 0);
                    FrameLayout searchContainer2 = w0Var.getSearchContainer();
                    if (AndroidUtilities.isTablet()) {
                        f12 = 74.0f;
                    }
                    searchContainer2.setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(f12));
                    if (w0Var.getSearchClearButton() != null) {
                        w0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                org.telegram.ui.Components.m8.n0(m8Var).invalidate();
                return;
            case 3:
                s00 s00Var = (s00) this.f23894c;
                s00Var.f32388w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.u6 u6Var = s00Var.f32359a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(s00Var.f32364c0, u6Var)));
                bi.r1 r1Var = s00Var.F;
                r1Var.g1();
                r1Var.invalidate();
                ((s00) obj).invalidate();
                return;
            case 4:
                v91 v91Var = (v91) obj;
                v91 v91Var2 = (v91) this.f23894c;
                v91Var2.f33611x = f7;
                v91Var2.invalidate();
                return;
            case 5:
                fc1 fc1Var = (fc1) obj;
                fc1 fc1Var2 = (fc1) this.f23894c;
                fc1Var2.E = f7;
                ec1 ec1Var = fc1Var2.L;
                if (ec1Var != null) {
                    ec1Var.a(f7);
                }
                fc1Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                of0 of0Var = ((PhotoViewer) this.f23894c).C1;
                if (of0Var != null) {
                    of0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f23894c).f35954b1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23893b) {
            case 0:
                d2 d2Var = (d2) obj;
                return Float.valueOf(((d2) this.f23894c).f23990g0);
            case 1:
                return Float.valueOf(un.f44169cd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.m8) this.f23894c).Q0);
            case 3:
                s00 s00Var = (s00) obj;
                return Float.valueOf(((s00) this.f23894c).f32388w0);
            case 4:
                v91 v91Var = (v91) obj;
                return Float.valueOf(((v91) this.f23894c).f33611x);
            case 5:
                fc1 fc1Var = (fc1) obj;
                return Float.valueOf(((fc1) this.f23894c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f23894c).f35954b1);
        }
    }

    public b2(v91 v91Var) {
        super("progress", 0);
        this.f23893b = 4;
        this.f23894c = v91Var;
    }

    public b2(fc1 fc1Var) {
        super("clipProgress", 0);
        this.f23893b = 5;
        this.f23894c = fc1Var;
    }

    public b2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f23893b = 7;
        this.f23894c = profileActivity;
    }

    public b2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f23893b = 6;
        this.f23894c = photoViewer;
    }

    public b2(un unVar) {
        super("", 0);
        this.f23893b = 1;
        this.f23894c = unVar;
    }

    public b2(org.telegram.ui.Components.m8 m8Var) {
        super("actionBarSlide", 0);
        this.f23893b = 2;
        this.f23894c = m8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.x91;
import org.telegram.ui.Components.y91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class d2 extends org.telegram.ui.Components.s6 {
    public final int f22122b;
    public final Object f22123c;

    public d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f22122b = i10;
        this.f22123c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f22122b) {
            case 0:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) this.f22123c;
                f2Var2.f22224g0 = f7;
                f2Var2.invalidate();
                return;
            case 1:
                qn.Jc = f7;
                qn qnVar = (qn) this.f22123c;
                qnVar.R6.setSaturation(f7);
                qnVar.Q6.setColorFilter(new ColorMatrixColorFilter(qnVar.R6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f22123c;
                k8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.f27793l0;
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
                s00 s00Var = (s00) this.f22123c;
                s00Var.f30098w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = s00Var.f30069a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(s00Var.f30074c0, d6Var)));
                ai.u1 u1Var = s00Var.F;
                u1Var.f1();
                u1Var.invalidate();
                ((s00) obj).invalidate();
                return;
            case 4:
                f91 f91Var = (f91) obj;
                f91 f91Var2 = (f91) this.f22123c;
                f91Var2.f26167x = f7;
                f91Var2.invalidate();
                return;
            case 5:
                y91 y91Var = (y91) obj;
                y91 y91Var2 = (y91) this.f22123c;
                y91Var2.E = f7;
                x91 x91Var = y91Var2.L;
                if (x91Var != null) {
                    x91Var.b(f7);
                }
                y91Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f7);
                of0 of0Var = ((PhotoViewer) this.f22123c).C1;
                if (of0Var != null) {
                    of0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f22123c).f33602c1 = f7;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22122b) {
            case 0:
                f2 f2Var = (f2) obj;
                return Float.valueOf(((f2) this.f22123c).f22224g0);
            case 1:
                return Float.valueOf(qn.Jc);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.k8) this.f22123c).Q0);
            case 3:
                s00 s00Var = (s00) obj;
                return Float.valueOf(((s00) this.f22123c).f30098w0);
            case 4:
                f91 f91Var = (f91) obj;
                return Float.valueOf(((f91) this.f22123c).f26167x);
            case 5:
                y91 y91Var = (y91) obj;
                return Float.valueOf(((y91) this.f22123c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f22123c).f33602c1);
        }
    }

    public d2(f91 f91Var) {
        super("progress", 0);
        this.f22122b = 4;
        this.f22123c = f91Var;
    }

    public d2(y91 y91Var) {
        super("clipProgress", 0);
        this.f22122b = 5;
        this.f22123c = y91Var;
    }

    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f22122b = 7;
        this.f22123c = profileActivity;
    }

    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f22122b = 6;
        this.f22123c = photoViewer;
    }

    public d2(qn qnVar) {
        super("", 0);
        this.f22122b = 1;
        this.f22123c = qnVar;
    }

    public d2(org.telegram.ui.Components.k8 k8Var) {
        super("actionBarSlide", 0);
        this.f22122b = 2;
        this.f22123c = k8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.vz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class c2 extends org.telegram.ui.Components.l6 {
    public final int f24181b;
    public final Object f24182c;

    public c2(int i9, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f24181b = i9;
        this.f24182c = frameLayout;
    }

    @Override
    public final void b(Object obj, float f10) {
        float f11;
        switch (this.f24181b) {
            case 0:
                e2 e2Var = (e2) obj;
                e2 e2Var2 = (e2) this.f24182c;
                e2Var2.f24275c0 = f10;
                e2Var2.invalidate();
                return;
            case 1:
                qn.Ec = f10;
                qn qnVar = (qn) this.f24182c;
                qnVar.N6.setSaturation(f10);
                qnVar.M6.setColorFilter(new ColorMatrixColorFilter(qnVar.N6));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.f24182c;
                c8Var.M0 = f10;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f12);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.f27389h0;
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
                org.telegram.ui.Components.c8.j0(c8Var).invalidate();
                return;
            case 3:
                vz vzVar = (vz) this.f24182c;
                vzVar.f34055s0 = f10;
                int i9 = vzVar.Q;
                org.telegram.ui.ActionBar.b6 b6Var = vzVar.f34030a;
                vzVar.P.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(vzVar.V, b6Var)));
                gh.f1 f1Var = vzVar.B;
                f1Var.f1();
                f1Var.invalidate();
                ((vz) obj).invalidate();
                return;
            case 4:
                o71 o71Var = (o71) obj;
                o71 o71Var2 = (o71) this.f24182c;
                o71Var2.f31319x = f10;
                o71Var2.invalidate();
                return;
            case 5:
                i81 i81Var = (i81) obj;
                i81 i81Var2 = (i81) this.f24182c;
                i81Var2.A = f10;
                h81 h81Var = i81Var2.H;
                if (h81Var != null) {
                    h81Var.b(f10);
                }
                i81Var2.invalidate();
                return;
            case 6:
                ((View) obj).setAlpha(f10);
                be0 be0Var = ((PhotoViewer) this.f24182c).f35799y1;
                if (be0Var != null) {
                    be0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                ((ProfileActivity) this.f24182c).X0 = f10;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24181b) {
            case 0:
                e2 e2Var = (e2) obj;
                return Float.valueOf(((e2) this.f24182c).f24275c0);
            case 1:
                return Float.valueOf(qn.Ec);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.c8) this.f24182c).M0);
            case 3:
                vz vzVar = (vz) obj;
                return Float.valueOf(((vz) this.f24182c).f34055s0);
            case 4:
                o71 o71Var = (o71) obj;
                return Float.valueOf(((o71) this.f24182c).f31319x);
            case 5:
                i81 i81Var = (i81) obj;
                return Float.valueOf(((i81) this.f24182c).A);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(((ProfileActivity) this.f24182c).X0);
        }
    }

    public c2(o71 o71Var) {
        super("progress", 0);
        this.f24181b = 4;
        this.f24182c = o71Var;
    }

    public c2(i81 i81Var) {
        super("clipProgress", 0);
        this.f24181b = 5;
        this.f24182c = i81Var;
    }

    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.f24181b = 7;
        this.f24182c = profileActivity;
    }

    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f24181b = 6;
        this.f24182c = photoViewer;
    }

    public c2(qn qnVar) {
        super("", 0);
        this.f24181b = 1;
        this.f24182c = qnVar;
    }

    public c2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.f24181b = 2;
        this.f24182c = c8Var;
    }
}

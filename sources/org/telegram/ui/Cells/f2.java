package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn;
public final class f2 extends org.telegram.ui.Components.l6 {
    public final int f29102b;
    public final Object f29103c;

    public f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f29102b = i7;
        this.f29103c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f29102b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f29103c;
                h2Var2.f29247h0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                cn.f44368ld = f10;
                cn cnVar = (cn) this.f29103c;
                cnVar.h7.setSaturation(f10);
                cnVar.f44466g7.setColorFilter(new ColorMatrixColorFilter(cnVar.h7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f29103c;
                b8Var.H2 = f10;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.f32126b2;
                if (r0Var != null && r0Var.getSearchContainer() != null) {
                    r0Var.getSearchContainer().setClipChildren(false);
                    r0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = r0Var.getSearchContainer();
                    float f13 = 66.0f;
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 74.0f;
                    } else {
                        f11 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, org.telegram.messenger.g0.L(f11), 0);
                    FrameLayout searchContainer2 = r0Var.getSearchContainer();
                    if (org.telegram.messenger.g0.Q1()) {
                        f13 = 74.0f;
                    }
                    searchContainer2.setTranslationX((org.telegram.messenger.g0.L(-52.0f) * f12) + org.telegram.messenger.g0.L(f13));
                    if (r0Var.getSearchClearButton() != null) {
                        r0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.g0.L(52.0f) * f12);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                b8Var.f28624b.invalidate();
                return;
            case 3:
                fz fzVar = (fz) this.f29103c;
                fzVar.f33795w0 = f10;
                int i7 = fzVar.U;
                org.telegram.ui.ActionBar.g6 g6Var = fzVar.f33765a;
                fzVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.w0(fzVar.f33770c0, g6Var)));
                bi.q1 q1Var = fzVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((fz) obj).invalidate();
                return;
            case 4:
                x61 x61Var = (x61) obj;
                x61 x61Var2 = (x61) this.f29103c;
                x61Var2.f40322y = f10;
                x61Var2.invalidate();
                return;
            case 5:
                s71 s71Var = (s71) obj;
                s71 s71Var2 = (s71) this.f29103c;
                s71Var2.E = f10;
                r71 r71Var = s71Var2.L;
                if (r71Var != null) {
                    r71Var.b(f10);
                }
                s71Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                gd0 gd0Var = ((PhotoViewer) this.f29103c).C1;
                if (gd0Var != null) {
                    gd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29102b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f29103c).f29247h0);
            case 1:
                return Float.valueOf(cn.f44368ld);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.b8) this.f29103c).H2);
            case 3:
                fz fzVar = (fz) obj;
                return Float.valueOf(((fz) this.f29103c).f33795w0);
            case 4:
                x61 x61Var = (x61) obj;
                return Float.valueOf(((x61) this.f29103c).f40322y);
            case 5:
                s71 s71Var = (s71) obj;
                return Float.valueOf(((s71) this.f29103c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(x61 x61Var) {
        super("progress", 0);
        this.f29102b = 4;
        this.f29103c = x61Var;
    }

    public f2(s71 s71Var) {
        super("clipProgress", 0);
        this.f29102b = 5;
        this.f29103c = s71Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f29102b = 6;
        this.f29103c = photoViewer;
    }

    public f2(cn cnVar) {
        super("", 0);
        this.f29102b = 1;
        this.f29103c = cnVar;
    }

    public f2(org.telegram.ui.Components.b8 b8Var) {
        super("actionBarSlide", 0);
        this.f29102b = 2;
        this.f29103c = b8Var;
    }
}

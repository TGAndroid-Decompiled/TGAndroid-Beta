package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.w61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
public final class f2 extends org.telegram.ui.Components.l6 {
    public final int f29098b;
    public final Object f29099c;

    public f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f29098b = i7;
        this.f29099c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f29098b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f29099c;
                h2Var2.f29243h0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                an.f43713jd = f10;
                an anVar = (an) this.f29099c;
                anVar.h7.setSaturation(f10);
                anVar.f43811g7.setColorFilter(new ColorMatrixColorFilter(anVar.h7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f29099c;
                b8Var.H2 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.f32084b2;
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
                b8Var.f28619b.invalidate();
                return;
            case 3:
                fz fzVar = (fz) this.f29099c;
                fzVar.f33728w0 = f10;
                int i7 = fzVar.U;
                org.telegram.ui.ActionBar.f6 f6Var = fzVar.f33698a;
                fzVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(fzVar.f33703c0, f6Var)));
                bi.q1 q1Var = fzVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((fz) obj).invalidate();
                return;
            case 4:
                w61 w61Var = (w61) obj;
                w61 w61Var2 = (w61) this.f29099c;
                w61Var2.f39834y = f10;
                w61Var2.invalidate();
                return;
            case 5:
                r71 r71Var = (r71) obj;
                r71 r71Var2 = (r71) this.f29099c;
                r71Var2.E = f10;
                q71 q71Var = r71Var2.L;
                if (q71Var != null) {
                    q71Var.b(f10);
                }
                r71Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                fd0 fd0Var = ((PhotoViewer) this.f29099c).C1;
                if (fd0Var != null) {
                    fd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29098b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f29099c).f29243h0);
            case 1:
                return Float.valueOf(an.f43713jd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.b8) this.f29099c).H2);
            case 3:
                fz fzVar = (fz) obj;
                return Float.valueOf(((fz) this.f29099c).f33728w0);
            case 4:
                w61 w61Var = (w61) obj;
                return Float.valueOf(((w61) this.f29099c).f39834y);
            case 5:
                r71 r71Var = (r71) obj;
                return Float.valueOf(((r71) this.f29099c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(w61 w61Var) {
        super("progress", 0);
        this.f29098b = 4;
        this.f29099c = w61Var;
    }

    public f2(r71 r71Var) {
        super("clipProgress", 0);
        this.f29098b = 5;
        this.f29099c = r71Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f29098b = 6;
        this.f29099c = photoViewer;
    }

    public f2(an anVar) {
        super("", 0);
        this.f29098b = 1;
        this.f29099c = anVar;
    }

    public f2(org.telegram.ui.Components.b8 b8Var) {
        super("actionBarSlide", 0);
        this.f29098b = 2;
        this.f29099c = b8Var;
    }
}

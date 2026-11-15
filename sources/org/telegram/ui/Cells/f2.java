package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
public final class f2 extends org.telegram.ui.Components.j6 {
    public final int f30211b;
    public final Object f30212c;

    public f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f30211b = i7;
        this.f30212c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f30211b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f30212c;
                h2Var2.f30366i0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                an.f45109md = f10;
                an anVar = (an) this.f30212c;
                anVar.i7.setSaturation(f10);
                anVar.h7.setColorFilter(new ColorMatrixColorFilter(anVar.i7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) this.f30212c;
                y7Var.L2 = f10;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.q0 q0Var = y7Var.f41898f2;
                if (q0Var != null && q0Var.getSearchContainer() != null) {
                    q0Var.getSearchContainer().setClipChildren(false);
                    q0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = q0Var.getSearchContainer();
                    float f13 = 66.0f;
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 74.0f;
                    } else {
                        f11 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, org.telegram.messenger.g0.L(f11), 0);
                    FrameLayout searchContainer2 = q0Var.getSearchContainer();
                    if (org.telegram.messenger.g0.Q1()) {
                        f13 = 74.0f;
                    }
                    searchContainer2.setTranslationX((org.telegram.messenger.g0.L(-52.0f) * f12) + org.telegram.messenger.g0.L(f13));
                    if (q0Var.getSearchClearButton() != null) {
                        q0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.g0.L(52.0f) * f12);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                y7Var.f29682b.invalidate();
                return;
            case 3:
                iz izVar = (iz) this.f30212c;
                izVar.f35813x0 = f10;
                int i7 = izVar.V;
                org.telegram.ui.ActionBar.e6 e6Var = izVar.f35781a;
                izVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(izVar.f35787d0, e6Var)));
                di.c1 c1Var = izVar.G;
                c1Var.g1();
                c1Var.invalidate();
                ((iz) obj).invalidate();
                return;
            case 4:
                x61 x61Var = (x61) obj;
                x61 x61Var2 = (x61) this.f30212c;
                x61Var2.f41607y = f10;
                x61Var2.invalidate();
                return;
            case 5:
                s71 s71Var = (s71) obj;
                s71 s71Var2 = (s71) this.f30212c;
                s71Var2.F = f10;
                r71 r71Var = s71Var2.M;
                if (r71Var != null) {
                    r71Var.c(f10);
                }
                s71Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                gd0 gd0Var = ((PhotoViewer) this.f30212c).D1;
                if (gd0Var != null) {
                    gd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30211b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f30212c).f30366i0);
            case 1:
                return Float.valueOf(an.f45109md);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.y7) this.f30212c).L2);
            case 3:
                iz izVar = (iz) obj;
                return Float.valueOf(((iz) this.f30212c).f35813x0);
            case 4:
                x61 x61Var = (x61) obj;
                return Float.valueOf(((x61) this.f30212c).f41607y);
            case 5:
                s71 s71Var = (s71) obj;
                return Float.valueOf(((s71) this.f30212c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(x61 x61Var) {
        super("progress", 0);
        this.f30211b = 4;
        this.f30212c = x61Var;
    }

    public f2(s71 s71Var) {
        super("clipProgress", 0);
        this.f30211b = 5;
        this.f30212c = s71Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f30211b = 6;
        this.f30212c = photoViewer;
    }

    public f2(an anVar) {
        super("", 0);
        this.f30211b = 1;
        this.f30212c = anVar;
    }

    public f2(org.telegram.ui.Components.y7 y7Var) {
        super("actionBarSlide", 0);
        this.f30211b = 2;
        this.f30212c = y7Var;
    }
}

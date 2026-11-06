package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
public final class f2 extends org.telegram.ui.Components.l6 {
    public final int f29094b;
    public final Object f29095c;

    public f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f29094b = i7;
        this.f29095c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f29094b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f29095c;
                h2Var2.f29239h0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                an.f43683jd = f10;
                an anVar = (an) this.f29095c;
                anVar.h7.setSaturation(f10);
                anVar.f43781g7.setColorFilter(new ColorMatrixColorFilter(anVar.h7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f29095c;
                b8Var.H2 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.f32035b2;
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
                b8Var.f28615b.invalidate();
                return;
            case 3:
                ez ezVar = (ez) this.f29095c;
                ezVar.f33405w0 = f10;
                int i7 = ezVar.U;
                org.telegram.ui.ActionBar.f6 f6Var = ezVar.f33375a;
                ezVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(ezVar.f33380c0, f6Var)));
                bi.q1 q1Var = ezVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((ez) obj).invalidate();
                return;
            case 4:
                q61 q61Var = (q61) obj;
                q61 q61Var2 = (q61) this.f29095c;
                q61Var2.f37288y = f10;
                q61Var2.invalidate();
                return;
            case 5:
                l71 l71Var = (l71) obj;
                l71 l71Var2 = (l71) this.f29095c;
                l71Var2.E = f10;
                k71 k71Var = l71Var2.L;
                if (k71Var != null) {
                    k71Var.b(f10);
                }
                l71Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                fd0 fd0Var = ((PhotoViewer) this.f29095c).C1;
                if (fd0Var != null) {
                    fd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29094b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f29095c).f29239h0);
            case 1:
                return Float.valueOf(an.f43683jd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.b8) this.f29095c).H2);
            case 3:
                ez ezVar = (ez) obj;
                return Float.valueOf(((ez) this.f29095c).f33405w0);
            case 4:
                q61 q61Var = (q61) obj;
                return Float.valueOf(((q61) this.f29095c).f37288y);
            case 5:
                l71 l71Var = (l71) obj;
                return Float.valueOf(((l71) this.f29095c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(q61 q61Var) {
        super("progress", 0);
        this.f29094b = 4;
        this.f29095c = q61Var;
    }

    public f2(l71 l71Var) {
        super("clipProgress", 0);
        this.f29094b = 5;
        this.f29095c = l71Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f29094b = 6;
        this.f29095c = photoViewer;
    }

    public f2(an anVar) {
        super("", 0);
        this.f29094b = 1;
        this.f29095c = anVar;
    }

    public f2(org.telegram.ui.Components.b8 b8Var) {
        super("actionBarSlide", 0);
        this.f29094b = 2;
        this.f29095c = b8Var;
    }
}

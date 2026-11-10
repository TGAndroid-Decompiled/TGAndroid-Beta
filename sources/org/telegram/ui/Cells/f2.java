package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.w61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn;
public final class f2 extends org.telegram.ui.Components.k6 {
    public final int f29113b;
    public final Object f29114c;

    public f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f29113b = i7;
        this.f29114c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f29113b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f29114c;
                h2Var2.f29258h0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                cn.f44409ld = f10;
                cn cnVar = (cn) this.f29114c;
                cnVar.h7.setSaturation(f10);
                cnVar.f44507g7.setColorFilter(new ColorMatrixColorFilter(cnVar.h7));
                return;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) this.f29114c;
                a8Var.K2 = f10;
                org.telegram.ui.ActionBar.m5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.r0 r0Var = a8Var.f31737e2;
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
                a8Var.f28672b.invalidate();
                return;
            case 3:
                ez ezVar = (ez) this.f29114c;
                ezVar.f33393w0 = f10;
                int i7 = ezVar.U;
                org.telegram.ui.ActionBar.h6 h6Var = ezVar.f33363a;
                ezVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(ezVar.f33368c0, h6Var)));
                bi.q1 q1Var = ezVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((ez) obj).invalidate();
                return;
            case 4:
                w61 w61Var = (w61) obj;
                w61 w61Var2 = (w61) this.f29114c;
                w61Var2.f39907y = f10;
                w61Var2.invalidate();
                return;
            case 5:
                r71 r71Var = (r71) obj;
                r71 r71Var2 = (r71) this.f29114c;
                r71Var2.E = f10;
                q71 q71Var = r71Var2.L;
                if (q71Var != null) {
                    q71Var.b(f10);
                }
                r71Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                fd0 fd0Var = ((PhotoViewer) this.f29114c).C1;
                if (fd0Var != null) {
                    fd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29113b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f29114c).f29258h0);
            case 1:
                return Float.valueOf(cn.f44409ld);
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(((org.telegram.ui.Components.a8) this.f29114c).K2);
            case 3:
                ez ezVar = (ez) obj;
                return Float.valueOf(((ez) this.f29114c).f33393w0);
            case 4:
                w61 w61Var = (w61) obj;
                return Float.valueOf(((w61) this.f29114c).f39907y);
            case 5:
                r71 r71Var = (r71) obj;
                return Float.valueOf(((r71) this.f29114c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(w61 w61Var) {
        super("progress", 0);
        this.f29113b = 4;
        this.f29114c = w61Var;
    }

    public f2(r71 r71Var) {
        super("clipProgress", 0);
        this.f29113b = 5;
        this.f29114c = r71Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f29113b = 6;
        this.f29114c = photoViewer;
    }

    public f2(cn cnVar) {
        super("", 0);
        this.f29113b = 1;
        this.f29114c = cnVar;
    }

    public f2(org.telegram.ui.Components.a8 a8Var) {
        super("actionBarSlide", 0);
        this.f29113b = 2;
        this.f29114c = a8Var;
    }
}

package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
public final class f2 extends org.telegram.ui.Components.p6 {
    public final int f30587b;
    public final Object f30588c;

    public f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f30587b = i7;
        this.f30588c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f30587b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f30588c;
                h2Var2.f30743i0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                bn.f45923nd = f10;
                bn bnVar = (bn) this.f30588c;
                bnVar.f46060j7.setSaturation(f10);
                bnVar.i7.setColorFilter(new ColorMatrixColorFilter(bnVar.f46060j7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.f30588c;
                g8Var.L2 = f10;
                org.telegram.ui.ActionBar.n5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.r0 r0Var = g8Var.f35390f2;
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
                g8Var.f30192b.invalidate();
                return;
            case 3:
                pz pzVar = (pz) this.f30588c;
                pzVar.f38646x0 = f10;
                int i7 = pzVar.V;
                org.telegram.ui.ActionBar.i6 i6Var = pzVar.f38614a;
                pzVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(pzVar.f38620d0, i6Var)));
                di.b1 b1Var = pzVar.G;
                b1Var.g1();
                b1Var.invalidate();
                ((pz) obj).invalidate();
                return;
            case 4:
                h71 h71Var = (h71) obj;
                h71 h71Var2 = (h71) this.f30588c;
                h71Var2.f35799y = f10;
                h71Var2.invalidate();
                return;
            case 5:
                c81 c81Var = (c81) obj;
                c81 c81Var2 = (c81) this.f30588c;
                c81Var2.F = f10;
                b81 b81Var = c81Var2.M;
                if (b81Var != null) {
                    b81Var.b(f10);
                }
                c81Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                qd0 qd0Var = ((PhotoViewer) this.f30588c).D1;
                if (qd0Var != null) {
                    qd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30587b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f30588c).f30743i0);
            case 1:
                return Float.valueOf(bn.f45923nd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.g8) this.f30588c).L2);
            case 3:
                pz pzVar = (pz) obj;
                return Float.valueOf(((pz) this.f30588c).f38646x0);
            case 4:
                h71 h71Var = (h71) obj;
                return Float.valueOf(((h71) this.f30588c).f35799y);
            case 5:
                c81 c81Var = (c81) obj;
                return Float.valueOf(((c81) this.f30588c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(h71 h71Var) {
        super("progress", 0);
        this.f30587b = 4;
        this.f30588c = h71Var;
    }

    public f2(c81 c81Var) {
        super("clipProgress", 0);
        this.f30587b = 5;
        this.f30588c = c81Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f30587b = 6;
        this.f30588c = photoViewer;
    }

    public f2(bn bnVar) {
        super("", 0);
        this.f30587b = 1;
        this.f30588c = bnVar;
    }

    public f2(org.telegram.ui.Components.g8 g8Var) {
        super("actionBarSlide", 0);
        this.f30587b = 2;
        this.f30588c = g8Var;
    }
}

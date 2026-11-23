package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
public final class g2 extends org.telegram.ui.Components.p6 {
    public final int f30732b;
    public final Object f30733c;

    public g2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f30732b = i7;
        this.f30733c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f30732b) {
            case 0:
                i2 i2Var = (i2) obj;
                i2 i2Var2 = (i2) this.f30733c;
                i2Var2.f30878i0 = f10;
                i2Var2.invalidate();
                return;
            case 1:
                bn.f46109nd = f10;
                bn bnVar = (bn) this.f30733c;
                bnVar.f46246j7.setSaturation(f10);
                bnVar.i7.setColorFilter(new ColorMatrixColorFilter(bnVar.f46246j7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) this.f30733c;
                e8Var.L2 = f10;
                org.telegram.ui.ActionBar.n5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.q0 q0Var = e8Var.f34596f2;
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
                e8Var.f30226b.invalidate();
                return;
            case 3:
                oz ozVar = (oz) this.f30733c;
                ozVar.f38321x0 = f10;
                int i7 = ozVar.V;
                org.telegram.ui.ActionBar.i6 i6Var = ozVar.f38289a;
                ozVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(ozVar.f38295d0, i6Var)));
                di.b1 b1Var = ozVar.G;
                b1Var.g1();
                b1Var.invalidate();
                ((oz) obj).invalidate();
                return;
            case 4:
                l71 l71Var = (l71) obj;
                l71 l71Var2 = (l71) this.f30733c;
                l71Var2.f37087y = f10;
                l71Var2.invalidate();
                return;
            case 5:
                g81 g81Var = (g81) obj;
                g81 g81Var2 = (g81) this.f30733c;
                g81Var2.F = f10;
                f81 f81Var = g81Var2.M;
                if (f81Var != null) {
                    f81Var.c(f10);
                }
                g81Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                qd0 qd0Var = ((PhotoViewer) this.f30733c).D1;
                if (qd0Var != null) {
                    qd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30732b) {
            case 0:
                i2 i2Var = (i2) obj;
                return Float.valueOf(((i2) this.f30733c).f30878i0);
            case 1:
                return Float.valueOf(bn.f46109nd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.e8) this.f30733c).L2);
            case 3:
                oz ozVar = (oz) obj;
                return Float.valueOf(((oz) this.f30733c).f38321x0);
            case 4:
                l71 l71Var = (l71) obj;
                return Float.valueOf(((l71) this.f30733c).f37087y);
            case 5:
                g81 g81Var = (g81) obj;
                return Float.valueOf(((g81) this.f30733c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public g2(l71 l71Var) {
        super("progress", 0);
        this.f30732b = 4;
        this.f30733c = l71Var;
    }

    public g2(g81 g81Var) {
        super("clipProgress", 0);
        this.f30732b = 5;
        this.f30733c = g81Var;
    }

    public g2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f30732b = 6;
        this.f30733c = photoViewer;
    }

    public g2(bn bnVar) {
        super("", 0);
        this.f30732b = 1;
        this.f30733c = bnVar;
    }

    public g2(org.telegram.ui.Components.e8 e8Var) {
        super("actionBarSlide", 0);
        this.f30732b = 2;
        this.f30733c = e8Var;
    }
}

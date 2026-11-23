package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
public final class g2 extends org.telegram.ui.Components.q6 {
    public final int f30677b;
    public final Object f30678c;

    public g2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f30677b = i7;
        this.f30678c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f30677b) {
            case 0:
                i2 i2Var = (i2) obj;
                i2 i2Var2 = (i2) this.f30678c;
                i2Var2.f30822i0 = f10;
                i2Var2.invalidate();
                return;
            case 1:
                bn.f45941nd = f10;
                bn bnVar = (bn) this.f30678c;
                bnVar.f46078j7.setSaturation(f10);
                bnVar.i7.setColorFilter(new ColorMatrixColorFilter(bnVar.f46078j7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.f30678c;
                f8Var.L2 = f10;
                org.telegram.ui.ActionBar.m5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.q0 q0Var = f8Var.f35115f2;
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
                f8Var.f30176b.invalidate();
                return;
            case 3:
                rz rzVar = (rz) this.f30678c;
                rzVar.f39422x0 = f10;
                int i7 = rzVar.V;
                org.telegram.ui.ActionBar.h6 h6Var = rzVar.f39390a;
                rzVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(rzVar.f39396d0, h6Var)));
                di.b1 b1Var = rzVar.G;
                b1Var.g1();
                b1Var.invalidate();
                ((rz) obj).invalidate();
                return;
            case 4:
                k71 k71Var = (k71) obj;
                k71 k71Var2 = (k71) this.f30678c;
                k71Var2.f36856y = f10;
                k71Var2.invalidate();
                return;
            case 5:
                f81 f81Var = (f81) obj;
                f81 f81Var2 = (f81) this.f30678c;
                f81Var2.F = f10;
                e81 e81Var = f81Var2.M;
                if (e81Var != null) {
                    e81Var.b(f10);
                }
                f81Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                rd0 rd0Var = ((PhotoViewer) this.f30678c).D1;
                if (rd0Var != null) {
                    rd0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30677b) {
            case 0:
                i2 i2Var = (i2) obj;
                return Float.valueOf(((i2) this.f30678c).f30822i0);
            case 1:
                return Float.valueOf(bn.f45941nd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.f8) this.f30678c).L2);
            case 3:
                rz rzVar = (rz) obj;
                return Float.valueOf(((rz) this.f30678c).f39422x0);
            case 4:
                k71 k71Var = (k71) obj;
                return Float.valueOf(((k71) this.f30678c).f36856y);
            case 5:
                f81 f81Var = (f81) obj;
                return Float.valueOf(((f81) this.f30678c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public g2(k71 k71Var) {
        super("progress", 0);
        this.f30677b = 4;
        this.f30678c = k71Var;
    }

    public g2(f81 f81Var) {
        super("clipProgress", 0);
        this.f30677b = 5;
        this.f30678c = f81Var;
    }

    public g2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f30677b = 6;
        this.f30678c = photoViewer;
    }

    public g2(bn bnVar) {
        super("", 0);
        this.f30677b = 1;
        this.f30678c = bnVar;
    }

    public g2(org.telegram.ui.Components.f8 f8Var) {
        super("actionBarSlide", 0);
        this.f30677b = 2;
        this.f30678c = f8Var;
    }
}

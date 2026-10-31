package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.x71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.un;
public final class f2 extends org.telegram.ui.Components.h6 {
    public final int f21889b;
    public final Object f21890c;

    public f2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f21889b = i10;
        this.f21890c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.f21889b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f21890c;
                h2Var2.f21963h0 = f7;
                h2Var2.invalidate();
                return;
            case 1:
                un.f42170bd = f7;
                un unVar = (un) this.f21890c;
                unVar.f42274h7.setSaturation(f7);
                unVar.f42263g7.setColorFilter(new ColorMatrixColorFilter(unVar.f42274h7));
                return;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) this.f21890c;
                w7Var.H2 = f7;
                org.telegram.ui.ActionBar.u5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f11 = 1.0f - f7;
                titleTextView.setTranslationX(org.telegram.messenger.i0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.i0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.t0 t0Var = w7Var.f32044b2;
                if (t0Var != null && t0Var.getSearchContainer() != null) {
                    t0Var.getSearchContainer().setClipChildren(false);
                    t0Var.getSearchContainer().setClipToPadding(false);
                    FrameLayout searchContainer = t0Var.getSearchContainer();
                    float f12 = 66.0f;
                    if (org.telegram.messenger.i0.Q1()) {
                        f10 = 74.0f;
                    } else {
                        f10 = 66.0f;
                    }
                    searchContainer.setPadding(0, 0, org.telegram.messenger.i0.L(f10), 0);
                    FrameLayout searchContainer2 = t0Var.getSearchContainer();
                    if (org.telegram.messenger.i0.Q1()) {
                        f12 = 74.0f;
                    }
                    searchContainer2.setTranslationX((org.telegram.messenger.i0.L(-52.0f) * f11) + org.telegram.messenger.i0.L(f12));
                    if (t0Var.getSearchClearButton() != null) {
                        t0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.i0.L(52.0f) * f11);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f7));
                backButton.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f7));
                backButton.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f7));
                w7Var.f21586b.invalidate();
                return;
            case 3:
                tz tzVar = (tz) this.f21890c;
                tzVar.f30730w0 = f7;
                int i10 = tzVar.U;
                org.telegram.ui.ActionBar.p6 p6Var = tzVar.f30701a;
                tzVar.T.setColor(i0.b.f(f7, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(tzVar.f30706c0, p6Var)));
                ag.b1 b1Var = tzVar.F;
                b1Var.g1();
                b1Var.invalidate();
                ((tz) obj).invalidate();
                return;
            case 4:
                x71 x71Var = (x71) obj;
                x71 x71Var2 = (x71) this.f21890c;
                x71Var2.f32422y = f7;
                x71Var2.invalidate();
                return;
            case 5:
                s81 s81Var = (s81) obj;
                s81 s81Var2 = (s81) this.f21890c;
                s81Var2.E = f7;
                r81 r81Var = s81Var2.L;
                if (r81Var != null) {
                    r81Var.c(f7);
                }
                s81Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f7);
                be0 be0Var = ((PhotoViewer) this.f21890c).C1;
                if (be0Var != null) {
                    be0Var.setVideoThumbFlashAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21889b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f21890c).f21963h0);
            case 1:
                return Float.valueOf(un.f42170bd);
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(((org.telegram.ui.Components.w7) this.f21890c).H2);
            case 3:
                tz tzVar = (tz) obj;
                return Float.valueOf(((tz) this.f21890c).f30730w0);
            case 4:
                x71 x71Var = (x71) obj;
                return Float.valueOf(((x71) this.f21890c).f32422y);
            case 5:
                s81 s81Var = (s81) obj;
                return Float.valueOf(((s81) this.f21890c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(x71 x71Var) {
        super("progress", 0);
        this.f21889b = 4;
        this.f21890c = x71Var;
    }

    public f2(s81 s81Var) {
        super("clipProgress", 0);
        this.f21889b = 5;
        this.f21890c = s81Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f21889b = 6;
        this.f21890c = photoViewer;
    }

    public f2(un unVar) {
        super("", 0);
        this.f21889b = 1;
        this.f21890c = unVar;
    }

    public f2(org.telegram.ui.Components.w7 w7Var) {
        super("actionBarSlide", 0);
        this.f21889b = 2;
        this.f21890c = w7Var;
    }
}

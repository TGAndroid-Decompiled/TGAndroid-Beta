package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wm;
public final class f2 extends org.telegram.ui.Components.j6 {
    public final int f29152b;
    public final Object f29153c;

    public f2(int i3, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.f29152b = i3;
        this.f29153c = frameLayout;
    }

    @Override
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.f29152b) {
            case 0:
                h2 h2Var = (h2) obj;
                h2 h2Var2 = (h2) this.f29153c;
                h2Var2.f29307i0 = f10;
                h2Var2.invalidate();
                return;
            case 1:
                wm.f51228kd = f10;
                wm wmVar = (wm) this.f29153c;
                wmVar.f51352i7.setSaturation(f10);
                wmVar.h7.setColorFilter(new ColorMatrixColorFilter(wmVar.f51352i7));
                return;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) this.f29153c;
                z7Var.I2 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f12 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f12);
                org.telegram.ui.ActionBar.q0 q0Var = z7Var.c2;
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
                z7Var.f28586b.invalidate();
                return;
            case 3:
                bz bzVar = (bz) this.f29153c;
                bzVar.f32474x0 = f10;
                int i3 = bzVar.V;
                org.telegram.ui.ActionBar.e6 e6Var = bzVar.f32442a;
                bzVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(bzVar.f32448d0, e6Var)));
                ci.j1 j1Var = bzVar.G;
                j1Var.g1();
                j1Var.invalidate();
                ((bz) obj).invalidate();
                return;
            case 4:
                o61 o61Var = (o61) obj;
                o61 o61Var2 = (o61) this.f29153c;
                o61Var2.f36770y = f10;
                o61Var2.invalidate();
                return;
            case 5:
                j71 j71Var = (j71) obj;
                j71 j71Var2 = (j71) this.f29153c;
                j71Var2.F = f10;
                i71 i71Var = j71Var2.M;
                if (i71Var != null) {
                    i71Var.b(f10);
                }
                j71Var2.invalidate();
                return;
            default:
                ((View) obj).setAlpha(f10);
                ad0 ad0Var = ((PhotoViewer) this.f29153c).D1;
                if (ad0Var != null) {
                    ad0Var.setVideoThumbFlashAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29152b) {
            case 0:
                h2 h2Var = (h2) obj;
                return Float.valueOf(((h2) this.f29153c).f29307i0);
            case 1:
                return Float.valueOf(wm.f51228kd);
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(((org.telegram.ui.Components.z7) this.f29153c).I2);
            case 3:
                bz bzVar = (bz) obj;
                return Float.valueOf(((bz) this.f29153c).f32474x0);
            case 4:
                o61 o61Var = (o61) obj;
                return Float.valueOf(((o61) this.f29153c).f36770y);
            case 5:
                j71 j71Var = (j71) obj;
                return Float.valueOf(((j71) this.f29153c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    public f2(o61 o61Var) {
        super("progress", 0);
        this.f29152b = 4;
        this.f29153c = o61Var;
    }

    public f2(j71 j71Var) {
        super("clipProgress", 0);
        this.f29152b = 5;
        this.f29153c = j71Var;
    }

    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.f29152b = 6;
        this.f29153c = photoViewer;
    }

    public f2(wm wmVar) {
        super("", 0);
        this.f29152b = 1;
        this.f29153c = wmVar;
    }

    public f2(org.telegram.ui.Components.z7 z7Var) {
        super("actionBarSlide", 0);
        this.f29152b = 2;
        this.f29153c = z7Var;
    }
}

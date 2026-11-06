package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.w41;
import org.telegram.ui.PhotoViewer;
public final class o8 extends org.telegram.ui.Components.l6 {
    public final int f29692b;

    public o8(String str, int i7) {
        super(str, 0);
        this.f29692b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        double sqrt;
        boolean z9;
        float f11;
        switch (this.f29692b) {
            case 0:
                r8 r8Var = (r8) obj;
                r8Var.setAnimationProgress(f10);
                r8Var.invalidate();
                return;
            case 1:
                s8 s8Var = (s8) obj;
                s8.a(s8Var, f10);
                s8Var.invalidate();
                return;
            case 2:
                b9 b9Var = (b9) obj;
                b9.a(b9Var, f10);
                b9Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Components.a6 a6Var = (org.telegram.ui.Components.a6) obj;
                if (a6Var.f31688e != f10) {
                    a6Var.f31688e = f10;
                    a6Var.f31690g.invalidate();
                    return;
                }
                return;
            case 4:
                ((ImageReceiver) obj).f21194h1 = f10;
                return;
            case 5:
                ((ClippingImageView) obj).setAnimationProgress(f10);
                return;
            case 6:
                ((PhotoViewer) obj).setAnimationValue(f10);
                return;
            case 7:
                ((t2) obj).setClipProgress(f10);
                return;
            case 8:
                ((gb) obj).setInOutOffset(f10);
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                return;
            case 10:
                ((w41) obj).M0(f10);
                return;
            case 11:
                wh.h hVar = (wh.h) obj;
                hVar.G = f10;
                RectF rectF = hVar.f57790w;
                RectF rectF2 = hVar.f57789s;
                float interpolation = 1.0f - wh.f.f57769p.getInterpolation(f10);
                float interpolation2 = (wh.f.h.getInterpolation(hVar.G) - wh.f.f57762i.getInterpolation(hVar.G)) * org.telegram.messenger.g0.L(13.0f);
                RectF rectF3 = hVar.f57787n;
                RectF rectF4 = hVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = wh.h.g(rectF3.height(), (org.telegram.messenger.g0.L(2.0f) * interpolation) + org.telegram.messenger.g0.L(wh.g.f57775b), wh.f.f57765l.getInterpolation(hVar.G)) / 2.0f;
                wh.e eVar = wh.f.f57766m;
                float g11 = wh.h.g(rectF3.width(), (org.telegram.messenger.g0.L(10.0f) * interpolation) + hVar.h(), eVar.getInterpolation(hVar.G));
                float f12 = g10 * 2.0f;
                float max = Math.max(g11, f12);
                float interpolation3 = (eVar.getInterpolation(hVar.G) * Math.min(org.telegram.messenger.g0.L(-12.0f) + hVar.F, (max - Math.max(rectF3.width(), f12)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (wh.f.f57767n.getInterpolation(hVar.G) * ((org.telegram.messenger.g0.L(6.0f) * interpolation) + org.telegram.messenger.g0.L(38.0f)));
                RectF rectF5 = hVar.f57788r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (hVar.Q && !hVar.M) {
                    float g12 = wh.h.g(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.0f), wh.f.f57768o.getInterpolation(hVar.G));
                    float f13 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f13 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f14 = (float) sqrt;
                    float centerX = rectF3.centerX() - f14;
                    boolean z10 = true;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        PointF f15 = wh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f15 != null) {
                            centerX = f15.x;
                            f13 = f15.y;
                        } else {
                            hVar.Q = false;
                        }
                    }
                    rectF2.set(centerX - g12, f13 - g12, centerX + g12, f13 + g12);
                    float f16 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + f14;
                    if (centerX2 <= rectF5.right - (rectF5.height() / 2.0f)) {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f17 = wh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f17 != null) {
                            centerX2 = f17.x;
                            f16 = f17.y;
                        } else {
                            hVar.Q = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f16 - g12, centerX2 + g12, f16 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && hVar.Q) {
                        hVar.Q = false;
                    }
                    if (hVar.Q) {
                        Path path = hVar.f57785e;
                        path.reset();
                        float b10 = wh.h.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = wh.h.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        hVar.a(path, rectF3, b10, b11, false, false);
                        float f18 = -90.0f;
                        if (z9) {
                            f11 = wh.h.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f11 = -90.0f;
                        }
                        float j3 = wh.h.j(b11);
                        float f19 = f11;
                        hVar.a(path, rectF2, j3, f19, true, true);
                        if (!z9) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = wh.h.f57776b0;
                        float f20 = rectF5.left;
                        rectF6.set(f20, rectF5.top, rectF5.height() + f20, rectF5.bottom);
                        hVar.a(path, rectF6, wh.h.j(f19), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z10) {
                            f18 = wh.h.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        hVar.a(path, rectF6, -90.0f, wh.h.j(f18), false, false);
                        if (!z10) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        hVar.a(path, rectF, f18, wh.h.j(b10), true, true);
                        path.close();
                    }
                }
                hVar.invalidateSelf();
                return;
            default:
                wh.h hVar2 = (wh.h) obj;
                hVar2.H = f10;
                hVar2.invalidateSelf();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29692b) {
            case 0:
                return Float.valueOf(((r8) obj).f30209s);
            case 1:
                return Float.valueOf(((s8) obj).h);
            case 2:
                return Float.valueOf(((b9) obj).f28942f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.a6) obj).f31688e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).f21194h1);
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((t2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((gb) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((w41) obj).f39842v1);
            case 11:
                return Float.valueOf(((wh.h) obj).G);
            default:
                return Float.valueOf(((wh.h) obj).H);
        }
    }
}

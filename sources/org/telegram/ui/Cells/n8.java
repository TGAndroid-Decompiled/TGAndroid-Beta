package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.v41;
import org.telegram.ui.PhotoViewer;
public final class n8 extends org.telegram.ui.Components.j6 {
    public final int f29715b;

    public n8(String str, int i3) {
        super(str, 0);
        this.f29715b = i3;
    }

    @Override
    public final void c(Object obj, float f10) {
        double sqrt;
        boolean z10;
        float f11;
        switch (this.f29715b) {
            case 0:
                q8 q8Var = (q8) obj;
                q8Var.setAnimationProgress(f10);
                q8Var.invalidate();
                return;
            case 1:
                r8 r8Var = (r8) obj;
                r8.a(r8Var, f10);
                r8Var.invalidate();
                return;
            case 2:
                a9 a9Var = (a9) obj;
                a9.a(a9Var, f10);
                a9Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj;
                if (y5Var.f40620e != f10) {
                    y5Var.f40620e = f10;
                    y5Var.f40622g.invalidate();
                    return;
                }
                return;
            case 4:
                ((ImageReceiver) obj).f21249i1 = f10;
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
                ((fb) obj).setInOutOffset(f10);
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                return;
            case 10:
                ((v41) obj).M0(f10);
                return;
            case 11:
                xh.h hVar = (xh.h) obj;
                hVar.H = f10;
                RectF rectF = hVar.f58859w;
                RectF rectF2 = hVar.f58858s;
                float interpolation = 1.0f - xh.f.f58837p.getInterpolation(f10);
                float interpolation2 = (xh.f.h.getInterpolation(hVar.H) - xh.f.f58830i.getInterpolation(hVar.H)) * org.telegram.messenger.g0.L(13.0f);
                RectF rectF3 = hVar.f58856n;
                RectF rectF4 = hVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g7 = xh.h.g(rectF3.height(), (org.telegram.messenger.g0.L(2.0f) * interpolation) + org.telegram.messenger.g0.L(xh.g.f58843b), xh.f.f58833l.getInterpolation(hVar.H)) / 2.0f;
                xh.e eVar = xh.f.f58834m;
                float g10 = xh.h.g(rectF3.width(), (org.telegram.messenger.g0.L(10.0f) * interpolation) + hVar.h(), eVar.getInterpolation(hVar.H));
                float f12 = g7 * 2.0f;
                float max = Math.max(g10, f12);
                float interpolation3 = (eVar.getInterpolation(hVar.H) * Math.min(org.telegram.messenger.g0.L(-12.0f) + hVar.G, (max - Math.max(rectF3.width(), f12)) / 2.0f)) + rectF4.centerX() + g7;
                float interpolation4 = ((rectF4.bottom - g7) - 1.0f) - (xh.f.f58835n.getInterpolation(hVar.H) * ((org.telegram.messenger.g0.L(6.0f) * interpolation) + org.telegram.messenger.g0.L(38.0f)));
                RectF rectF5 = hVar.f58857r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g7;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g7;
                if (hVar.R && !hVar.N) {
                    float g11 = xh.h.g(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.0f), xh.f.f58836o.getInterpolation(hVar.H));
                    float f13 = rectF5.bottom + g11;
                    double width = (rectF3.width() / 2.0f) + g11;
                    double abs = Math.abs(f13 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f14 = (float) sqrt;
                    float centerX = rectF3.centerX() - f14;
                    boolean z11 = true;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f15 = xh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g11, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g11, true);
                        if (f15 != null) {
                            centerX = f15.x;
                            f13 = f15.y;
                        } else {
                            hVar.R = false;
                        }
                    }
                    rectF2.set(centerX - g11, f13 - g11, centerX + g11, f13 + g11);
                    float f16 = rectF5.bottom + g11;
                    float centerX2 = rectF3.centerX() + f14;
                    if (centerX2 <= rectF5.right - (rectF5.height() / 2.0f)) {
                        z11 = false;
                    }
                    if (z11) {
                        PointF f17 = xh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g11, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g11, false);
                        if (f17 != null) {
                            centerX2 = f17.x;
                            f16 = f17.y;
                        } else {
                            hVar.R = false;
                        }
                    }
                    rectF.set(centerX2 - g11, f16 - g11, centerX2 + g11, f16 + g11);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && hVar.R) {
                        hVar.R = false;
                    }
                    if (hVar.R) {
                        Path path = hVar.f58854e;
                        path.reset();
                        float b10 = xh.h.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = xh.h.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        hVar.a(path, rectF3, b10, b11, false, false);
                        float f18 = -90.0f;
                        if (z10) {
                            f11 = xh.h.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f11 = -90.0f;
                        }
                        float j10 = xh.h.j(b11);
                        float f19 = f11;
                        hVar.a(path, rectF2, j10, f19, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = xh.h.f58844c0;
                        float f20 = rectF5.left;
                        rectF6.set(f20, rectF5.top, rectF5.height() + f20, rectF5.bottom);
                        hVar.a(path, rectF6, xh.h.j(f19), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z11) {
                            f18 = xh.h.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        hVar.a(path, rectF6, -90.0f, xh.h.j(f18), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        hVar.a(path, rectF, f18, xh.h.j(b10), true, true);
                        path.close();
                    }
                }
                hVar.invalidateSelf();
                return;
            default:
                xh.h hVar2 = (xh.h) obj;
                hVar2.I = f10;
                hVar2.invalidateSelf();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29715b) {
            case 0:
                return Float.valueOf(((q8) obj).f30238s);
            case 1:
                return Float.valueOf(((r8) obj).h);
            case 2:
                return Float.valueOf(((a9) obj).f28957f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.y5) obj).f40620e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).f21249i1);
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((t2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((fb) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((v41) obj).f39004w1);
            case 11:
                return Float.valueOf(((xh.h) obj).H);
            default:
                return Float.valueOf(((xh.h) obj).I);
        }
    }
}

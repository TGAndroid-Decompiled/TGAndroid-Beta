package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.ub;
import org.telegram.ui.PhotoViewer;
public final class t8 extends org.telegram.ui.Components.s6 {
    public final int f23294b;

    public t8(String str, int i10) {
        super(str, 0);
        this.f23294b = i10;
    }

    @Override
    public final void b(Object obj, float f7) {
        double sqrt;
        boolean z10;
        boolean z11;
        float f10;
        switch (this.f23294b) {
            case 0:
                w8 w8Var = (w8) obj;
                w8Var.setAnimationProgress(f7);
                w8Var.invalidate();
                return;
            case 1:
                x8 x8Var = (x8) obj;
                x8.a(x8Var, f7);
                x8Var.invalidate();
                return;
            case 2:
                g9 g9Var = (g9) obj;
                g9.a(g9Var, f7);
                g9Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) obj;
                if (h6Var.f26611e != f7) {
                    h6Var.f26611e = f7;
                    h6Var.f26613g.invalidate();
                    return;
                }
                return;
            case 4:
                ((ImageReceiver) obj).setCurrentAlpha(f7);
                return;
            case 5:
                ((ClippingImageView) obj).setAnimationProgress(f7);
                return;
            case 6:
                ((PhotoViewer) obj).setAnimationValue(f7);
                return;
            case 7:
                ((r2) obj).setClipProgress(f7);
                return;
            case 8:
                ((ub) obj).setInOutOffset(f7);
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f7);
                return;
            case 10:
                ((o61) obj).H(f7);
                return;
            case 11:
                vh.h hVar = (vh.h) obj;
                hVar.G = f7;
                RectF rectF = hVar.v;
                RectF rectF2 = hVar.f47890s;
                float interpolation = 1.0f - vh.f.f47870p.getInterpolation(f7);
                float interpolation2 = (vh.f.h.getInterpolation(hVar.G) - vh.f.f47863i.getInterpolation(hVar.G)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = hVar.f47888n;
                RectF rectF4 = hVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = vh.h.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(vh.g.f47876b), vh.f.f47866l.getInterpolation(hVar.G)) / 2.0f;
                vh.e eVar = vh.f.f47867m;
                float g11 = vh.h.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + hVar.h(), eVar.getInterpolation(hVar.G));
                float f11 = g10 * 2.0f;
                float max = Math.max(g11, f11);
                float interpolation3 = (eVar.getInterpolation(hVar.G) * Math.min(AndroidUtilities.dp(-12.0f) + hVar.F, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (vh.f.f47868n.getInterpolation(hVar.G) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = hVar.f47889r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (hVar.Q && !hVar.M) {
                    float g12 = vh.h.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), vh.f.f47869o.getInterpolation(hVar.G));
                    float f12 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f12 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f13 = (float) sqrt;
                    float centerX = rectF3.centerX() - f13;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f14 = vh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f14 != null) {
                            centerX = f14.x;
                            f12 = f14.y;
                        } else {
                            hVar.Q = false;
                        }
                    }
                    rectF2.set(centerX - g12, f12 - g12, centerX + g12, f12 + g12);
                    float f15 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + f13;
                    if (centerX2 > rectF5.right - (rectF5.height() / 2.0f)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        PointF f16 = vh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f16 != null) {
                            centerX2 = f16.x;
                            f15 = f16.y;
                        } else {
                            hVar.Q = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f15 - g12, centerX2 + g12, f15 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && hVar.Q) {
                        hVar.Q = false;
                    }
                    if (hVar.Q) {
                        Path path = hVar.f47886e;
                        path.reset();
                        float b10 = vh.h.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = vh.h.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        hVar.a(path, rectF3, b10, b11, false, false);
                        float f17 = -90.0f;
                        if (z10) {
                            f10 = vh.h.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f10 = -90.0f;
                        }
                        float j3 = vh.h.j(b11);
                        float f18 = f10;
                        hVar.a(path, rectF2, j3, f18, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = vh.h.f47877b0;
                        float f19 = rectF5.left;
                        rectF6.set(f19, rectF5.top, rectF5.height() + f19, rectF5.bottom);
                        hVar.a(path, rectF6, vh.h.j(f18), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z11) {
                            f17 = vh.h.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        hVar.a(path, rectF6, -90.0f, vh.h.j(f17), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        hVar.a(path, rectF, f17, vh.h.j(b10), true, true);
                        path.close();
                    }
                }
                hVar.invalidateSelf();
                return;
            default:
                vh.h hVar2 = (vh.h) obj;
                hVar2.H = f7;
                hVar2.invalidateSelf();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23294b) {
            case 0:
                return Float.valueOf(((w8) obj).f23494s);
            case 1:
                return Float.valueOf(((x8) obj).h);
            case 2:
                return Float.valueOf(((g9) obj).f21995f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.h6) obj).f26611e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((r2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((ub) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((o61) obj).E);
            case 11:
                return Float.valueOf(((vh.h) obj).G);
            default:
                return Float.valueOf(((vh.h) obj).H);
        }
    }
}

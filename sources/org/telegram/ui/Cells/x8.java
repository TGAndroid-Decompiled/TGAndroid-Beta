package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.ub;
import org.telegram.ui.PhotoViewer;
public final class x8 extends org.telegram.ui.Components.u6 {
    public final int f25728b;

    public x8(String str, int i10) {
        super(str, 0);
        this.f25728b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        double sqrt;
        boolean z10;
        float f10;
        switch (this.f25728b) {
            case 0:
                a9 a9Var = (a9) obj;
                a9Var.setAnimationProgress(f7);
                a9Var.invalidate();
                return;
            case 1:
                b9 b9Var = (b9) obj;
                b9.a(b9Var, f7);
                b9Var.invalidate();
                return;
            case 2:
                k9 k9Var = (k9) obj;
                k9.a(k9Var, f7);
                k9Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) obj;
                if (k6Var.e != f7) {
                    k6Var.e = f7;
                    k6Var.f29866g.invalidate();
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
                ((p2) obj).setClipProgress(f7);
                return;
            case 8:
                ((ub) obj).setInOutOffset(f7);
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f7);
                return;
            case 10:
                ((c81) obj).H(f7);
                return;
            case 11:
                wh.h hVar = (wh.h) obj;
                hVar.G = f7;
                RectF rectF = hVar.v;
                RectF rectF2 = hVar.f51318s;
                float interpolation = 1.0f - wh.f.f51299p.getInterpolation(f7);
                float interpolation2 = (wh.f.h.getInterpolation(hVar.G) - wh.f.f51292i.getInterpolation(hVar.G)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = hVar.f51316n;
                RectF rectF4 = hVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g7 = wh.h.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(wh.g.f51305b), wh.f.f51295l.getInterpolation(hVar.G)) / 2.0f;
                wh.e eVar = wh.f.f51296m;
                float g10 = wh.h.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + hVar.h(), eVar.getInterpolation(hVar.G));
                float f11 = g7 * 2.0f;
                float max = Math.max(g10, f11);
                float interpolation3 = (eVar.getInterpolation(hVar.G) * Math.min(AndroidUtilities.dp(-12.0f) + hVar.F, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g7;
                float interpolation4 = ((rectF4.bottom - g7) - 1.0f) - (wh.f.f51297n.getInterpolation(hVar.G) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = hVar.f51317r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g7;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g7;
                if (hVar.Q && !hVar.M) {
                    float g11 = wh.h.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), wh.f.f51298o.getInterpolation(hVar.G));
                    float f12 = rectF5.bottom + g11;
                    double width = (rectF3.width() / 2.0f) + g11;
                    double abs = Math.abs(f12 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f13 = (float) sqrt;
                    float centerX = rectF3.centerX() - f13;
                    boolean z11 = true;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f14 = wh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g11, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g11, true);
                        if (f14 != null) {
                            centerX = f14.x;
                            f12 = f14.y;
                        } else {
                            hVar.Q = false;
                        }
                    }
                    rectF2.set(centerX - g11, f12 - g11, centerX + g11, f12 + g11);
                    float f15 = rectF5.bottom + g11;
                    float centerX2 = rectF3.centerX() + f13;
                    if (centerX2 <= rectF5.right - (rectF5.height() / 2.0f)) {
                        z11 = false;
                    }
                    if (z11) {
                        PointF f16 = wh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g11, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g11, false);
                        if (f16 != null) {
                            centerX2 = f16.x;
                            f15 = f16.y;
                        } else {
                            hVar.Q = false;
                        }
                    }
                    rectF.set(centerX2 - g11, f15 - g11, centerX2 + g11, f15 + g11);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && hVar.Q) {
                        hVar.Q = false;
                    }
                    if (hVar.Q) {
                        Path path = hVar.e;
                        path.reset();
                        float b10 = wh.h.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = wh.h.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        hVar.a(path, rectF3, b10, b11, false, false);
                        float f17 = -90.0f;
                        if (z10) {
                            f10 = wh.h.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f10 = -90.0f;
                        }
                        float j10 = wh.h.j(b11);
                        float f18 = f10;
                        hVar.a(path, rectF2, j10, f18, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = wh.h.f51306b0;
                        float f19 = rectF5.left;
                        rectF6.set(f19, rectF5.top, rectF5.height() + f19, rectF5.bottom);
                        hVar.a(path, rectF6, wh.h.j(f18), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z11) {
                            f17 = wh.h.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        hVar.a(path, rectF6, -90.0f, wh.h.j(f17), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        hVar.a(path, rectF, f17, wh.h.j(b10), true, true);
                        path.close();
                    }
                }
                hVar.invalidateSelf();
                return;
            default:
                wh.h hVar2 = (wh.h) obj;
                hVar2.H = f7;
                hVar2.invalidateSelf();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25728b) {
            case 0:
                return Float.valueOf(((a9) obj).f23869s);
            case 1:
                return Float.valueOf(((b9) obj).h);
            case 2:
                return Float.valueOf(((k9) obj).f24358f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.k6) obj).e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((p2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((ub) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((c81) obj).E);
            case 11:
                return Float.valueOf(((wh.h) obj).G);
            default:
                return Float.valueOf(((wh.h) obj).H);
        }
    }
}

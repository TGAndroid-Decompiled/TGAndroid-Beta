package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.tb;
import org.telegram.ui.PhotoViewer;
public final class u8 extends org.telegram.ui.Components.q6 {
    public final int f20528b;

    public u8(String str, int i10) {
        super(str, 0);
        this.f20528b = i10;
    }

    @Override
    public final void b(Object obj, float f7) {
        double sqrt;
        boolean z10;
        boolean z11;
        float f10;
        switch (this.f20528b) {
            case 0:
                x8 x8Var = (x8) obj;
                x8Var.setAnimationProgress(f7);
                x8Var.invalidate();
                return;
            case 1:
                y8 y8Var = (y8) obj;
                y8.a(y8Var, f7);
                y8Var.invalidate();
                return;
            case 2:
                h9 h9Var = (h9) obj;
                h9.a(h9Var, f7);
                h9Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) obj;
                if (g6Var.e != f7) {
                    g6Var.e = f7;
                    g6Var.f23253g.invalidate();
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
                ((tb) obj).setInOutOffset(f7);
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f7);
                return;
            case 10:
                ((b71) obj).H(f7);
                return;
            case 11:
                th.i iVar = (th.i) obj;
                iVar.G = f7;
                RectF rectF = iVar.v;
                RectF rectF2 = iVar.f42235s;
                float interpolation = 1.0f - th.g.f42216p.getInterpolation(f7);
                float interpolation2 = (th.g.h.getInterpolation(iVar.G) - th.g.f42209i.getInterpolation(iVar.G)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = iVar.f42233n;
                RectF rectF4 = iVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = th.i.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(th.h.f42222b), th.g.f42212l.getInterpolation(iVar.G)) / 2.0f;
                th.f fVar = th.g.f42213m;
                float g11 = th.i.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + iVar.h(), fVar.getInterpolation(iVar.G));
                float f11 = g10 * 2.0f;
                float max = Math.max(g11, f11);
                float interpolation3 = (fVar.getInterpolation(iVar.G) * Math.min(AndroidUtilities.dp(-12.0f) + iVar.F, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (th.g.f42214n.getInterpolation(iVar.G) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = iVar.f42234r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (iVar.Q && !iVar.M) {
                    float g12 = th.i.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), th.g.f42215o.getInterpolation(iVar.G));
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
                        PointF f14 = th.i.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f14 != null) {
                            centerX = f14.x;
                            f12 = f14.y;
                        } else {
                            iVar.Q = false;
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
                        PointF f16 = th.i.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f16 != null) {
                            centerX2 = f16.x;
                            f15 = f16.y;
                        } else {
                            iVar.Q = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f15 - g12, centerX2 + g12, f15 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && iVar.Q) {
                        iVar.Q = false;
                    }
                    if (iVar.Q) {
                        Path path = iVar.e;
                        path.reset();
                        float b10 = th.i.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = th.i.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        iVar.a(path, rectF3, b10, b11, false, false);
                        float f17 = -90.0f;
                        if (z10) {
                            f10 = th.i.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f10 = -90.0f;
                        }
                        float j3 = th.i.j(b11);
                        float f18 = f10;
                        iVar.a(path, rectF2, j3, f18, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = th.i.f42223b0;
                        float f19 = rectF5.left;
                        rectF6.set(f19, rectF5.top, rectF5.height() + f19, rectF5.bottom);
                        iVar.a(path, rectF6, th.i.j(f18), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z11) {
                            f17 = th.i.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        iVar.a(path, rectF6, -90.0f, th.i.j(f17), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        iVar.a(path, rectF, f17, th.i.j(b10), true, true);
                        path.close();
                    }
                }
                iVar.invalidateSelf();
                return;
            default:
                th.i iVar2 = (th.i) obj;
                iVar2.H = f7;
                iVar2.invalidateSelf();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f20528b) {
            case 0:
                return Float.valueOf(((x8) obj).f20728s);
            case 1:
                return Float.valueOf(((y8) obj).h);
            case 2:
                return Float.valueOf(((h9) obj).f19281f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.g6) obj).e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((r2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((tb) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((b71) obj).E);
            case 11:
                return Float.valueOf(((th.i) obj).G);
            default:
                return Float.valueOf(((th.i) obj).H);
        }
    }
}

package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class yi0 extends Path {
    public final org.telegram.ui.Cells.u1 f30613a;
    public final int f30614b;
    public final int f30615c;
    public final int d;
    public final boolean e;
    public final boolean f30616f;
    public final byte[] f30617g;
    public int h;
    public final Paint f30618i;
    public final vq f30619j;
    public final e6 f30620k;
    public final ArrayList f30621l;
    public final ArrayList f30622m;
    public final float f30623n;
    public final float f30624o;
    public final float f30625p;
    public xi0 f30626q;

    public yi0(final org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f30618i = paint;
        this.f30619j = new vq();
        this.f30621l = new ArrayList();
        this.f30622m = new ArrayList();
        this.f30613a = u1Var;
        this.f30620k = new e6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
                        if (u1Var2 != null) {
                            u1Var2.invalidate();
                        }
                        if (u1Var2.getParent() instanceof View) {
                            ((View) u1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.u1 u1Var3 = u1Var;
                        if (u1Var3 != null) {
                            u1Var3.invalidate();
                        }
                        if (u1Var3.getParent() instanceof View) {
                            ((View) u1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, rr.h);
        this.f30614b = i10;
        int i12 = -i11;
        this.f30615c = i12;
        this.d = i12;
        this.e = true;
        this.f30616f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f30625p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f30623n;
        float f15 = max + f14;
        float f16 = this.f30624o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f30346a = f15 - AndroidUtilities.dp(3.0f);
        obj.f30347b = f18 + AndroidUtilities.dp(3.0f);
        obj.f30348c = f17;
        obj.d = f12 + f16;
        xi0 xi0Var = this.f30626q;
        if (xi0Var != null) {
            float f19 = xi0Var.d;
            xi0Var.h = (f19 + f17) / 2.0f;
            obj.f30350g = (f19 + f17) / 2.0f;
        }
        this.f30621l.add(obj);
        this.f30626q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f30620k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f30616f;
        Paint paint = this.f30618i;
        org.telegram.ui.Cells.u1 u1Var = this.f30613a;
        vq vqVar = this.f30619j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            vqVar.rewind();
            int I2 = u1Var.I2(this.f30617g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(I2), u1Var.getBackgroundDrawableRight(), u1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            vqVar.addRect(rectF, Path.Direction.CW);
            vqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            vqVar.rewind();
            int O2 = u1Var.O2(-this.f30615c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(O2), u1Var.getBackgroundDrawableRight(), u1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            vqVar.addRect(rectF2, Path.Direction.CW);
            vqVar.a();
        } else {
            canvas.translate(f7, f10);
            vqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f30621l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                xi0 xi0Var = (xi0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f7, xi0Var.f30346a, d);
                if (xi0Var.e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = xi0Var.f30350g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, xi0Var.f30348c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f7, xi0Var.f30347b, d);
                if (xi0Var.f30349f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = xi0Var.h;
                }
                vqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, xi0Var.d, d), Path.Direction.CW);
                i10++;
            }
            vqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(vqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public yi0(final org.telegram.ui.Cells.u1 u1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f30618i = paint;
        this.f30619j = new vq();
        this.f30621l = new ArrayList();
        this.f30622m = new ArrayList();
        this.f30613a = u1Var;
        this.f30620k = new e6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
                        if (u1Var2 != null) {
                            u1Var2.invalidate();
                        }
                        if (u1Var2.getParent() instanceof View) {
                            ((View) u1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.u1 u1Var3 = u1Var;
                        if (u1Var3 != null) {
                            u1Var3.invalidate();
                        }
                        if (u1Var3.getParent() instanceof View) {
                            ((View) u1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, rr.h);
        this.f30614b = i10;
        this.f30617g = bArr;
        this.f30615c = 0;
        this.d = 0;
        this.e = false;
        this.f30616f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public yi0(org.telegram.ui.Cells.u1 u1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f30618i = paint;
        this.f30619j = new vq();
        this.f30621l = new ArrayList();
        this.f30622m = new ArrayList();
        this.f30613a = null;
        this.f30620k = new e6(0.0f, new vw(26, u1Var, viewParent), 350L, 420L, rr.h);
        this.f30614b = i10;
        this.f30615c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f30616f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i16 = 0;
        boolean z10 = false;
        while (i16 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i16);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i15, i14 - i13);
                int i17 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i17, textLayoutBlock.charactersEnd - i17);
                float f10 = -f7;
                this.f30623n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f30623n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f30624o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f30625p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    if (max != min) {
                        if (min < max) {
                            min = max;
                            max = min;
                        }
                        int lineForOffset = staticLayout.getLineForOffset(max);
                        int lineForOffset2 = staticLayout.getLineForOffset(min);
                        for (int i18 = lineForOffset; i18 <= lineForOffset2; i18++) {
                            int lineStart = staticLayout.getLineStart(i18);
                            int lineEnd = staticLayout.getLineEnd(i18);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i18 == lineForOffset && max > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(max);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i18);
                                }
                                if (i18 == lineForOffset2 && min < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(min);
                                } else {
                                    lineRight = staticLayout.getLineRight(i18);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i18), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i18));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f30622m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f30621l.size() > 0) {
            xi0 xi0Var = (xi0) this.f30621l.get(0);
            xi0 xi0Var2 = (xi0) hg.c.g(1, this.f30621l);
            xi0Var.e = true;
            xi0Var.f30348c -= AndroidUtilities.dp(0.66f);
            xi0Var2.f30349f = true;
            xi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}

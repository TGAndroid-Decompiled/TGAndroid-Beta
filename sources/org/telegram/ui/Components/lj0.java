package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
public final class lj0 extends Path {
    public final org.telegram.ui.Cells.u1 f28201a;
    public final int f28202b;
    public final int f28203c;
    public final int d;
    public final boolean e;
    public final boolean f28204f;
    public final byte[] f28205g;
    public int h;
    public final Paint f28206i;
    public final er f28207j;
    public final f6 f28208k;
    public final ArrayList f28209l;
    public final ArrayList f28210m;
    public final float f28211n;
    public final float f28212o;
    public final float f28213p;
    public kj0 f28214q;
    public final int f28215r;
    public final org.telegram.ui.Cells.y9 f28216s;
    public final int f28217t;
    public final ArrayList f28218u;

    public lj0(final org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f28206i = paint;
        this.f28207j = new er();
        this.f28209l = new ArrayList();
        this.f28210m = new ArrayList();
        this.f28217t = 1;
        this.f28218u = new ArrayList();
        this.f28201a = u1Var;
        this.f28208k = new f6(0.0f, new Runnable() {
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
        }, 350L, 420L, bs.h);
        this.f28202b = i10;
        int i12 = -i11;
        this.f28203c = i12;
        this.d = i12;
        this.e = true;
        this.f28204f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public static void b(er erVar, kj0 kj0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.y9 y9Var;
        float f12;
        org.telegram.ui.Cells.y9 y9Var2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (kj0Var.f27899j != null) {
            f12 = y9Var.getX() - kj0Var.f27900k;
        } else {
            f12 = 0.0f;
        }
        if (kj0Var.f27899j != null) {
            f15 = y9Var2.getY() - kj0Var.f27901l;
        }
        float lerp = AndroidUtilities.lerp(rect.left - f7, kj0Var.f27893a + f12, f11);
        if (kj0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = kj0Var.f27897g + f15;
        }
        float lerp2 = AndroidUtilities.lerp(f13, kj0Var.f27895c + f15, f11);
        float lerp3 = AndroidUtilities.lerp(rect.right - f7, kj0Var.f27894b + f12, f11);
        if (kj0Var.f27896f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = kj0Var.h + f15;
        }
        erVar.addRect(lerp, lerp2, lerp3, AndroidUtilities.lerp(f14, kj0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f28213p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f28211n;
        float f15 = max + f14;
        float f16 = this.f28212o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f27893a = f15 - AndroidUtilities.dp(3.0f);
        obj.f27894b = f18 + AndroidUtilities.dp(3.0f);
        obj.f27895c = f17;
        obj.d = f12 + f16;
        obj.f27898i = this.f28215r;
        org.telegram.ui.Cells.y9 y9Var = this.f28216s;
        obj.f27899j = y9Var;
        if (y9Var != null) {
            obj.f27900k = y9Var.getX();
            obj.f27901l = y9Var.getY();
        }
        kj0 kj0Var = this.f28214q;
        if (kj0Var != null) {
            float f19 = kj0Var.d;
            kj0Var.h = (f19 + f17) / 2.0f;
            obj.f27897g = (f19 + f17) / 2.0f;
        }
        this.f28209l.add(obj);
        this.f28214q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float d = this.f28208k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f28204f;
        org.telegram.ui.Cells.u1 u1Var = this.f28201a;
        er erVar = this.f28207j;
        Paint paint = this.f28206i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            erVar.rewind();
            int I2 = u1Var.I2(this.f28205g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(I2), u1Var.getBackgroundDrawableRight(), u1Var.G2(I2));
            AndroidUtilities.lerp(rect2, rectF, d, rectF);
            erVar.addRect(rectF, Path.Direction.CW);
            erVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            erVar.rewind();
            int O2 = u1Var.O2(-this.f28203c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(O2), u1Var.getBackgroundDrawableRight(), u1Var.G2(O2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            erVar.addRect(rectF2, Path.Direction.CW);
            erVar.a();
        } else {
            int i11 = this.f28217t;
            ArrayList arrayList2 = this.f28209l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                er erVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f28218u;
                    if (i13 >= size) {
                        break;
                    }
                    kj0 kj0Var = (kj0) arrayList2.get(i13);
                    if (erVar2 == null || kj0Var.e) {
                        if (erVar2 != null) {
                            erVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new er());
                        }
                        erVar2 = (er) arrayList.get(i12);
                        erVar2.rewind();
                    }
                    er erVar3 = erVar2;
                    b(erVar3, kj0Var, f7, f10, rect2, d);
                    erVar2 = erVar3;
                    i13++;
                }
                if (erVar2 != null) {
                    erVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f7, rect2.top - f10, rect2.right - f7, rect2.bottom - f10, (int) (alpha * f11), 31);
                paint.setAlpha(255);
                while (i10 <= i12) {
                    canvas.drawPath((Path) arrayList.get(i10), paint);
                    i10++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f7, f10);
            erVar.rewind();
            while (i10 < arrayList2.size()) {
                b(erVar, (kj0) arrayList2.get(i10), f7, f10, rect2, d);
                i10++;
                rect2 = rect;
            }
            erVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(erVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28209l;
            if (i10 < arrayList.size()) {
                kj0 kj0Var = (kj0) arrayList.get(i10);
                if (i10 == 0 || ((kj0) arrayList.get(i10 - 1)).f27898i != kj0Var.f27898i) {
                    kj0Var.e = true;
                    kj0Var.f27895c -= AndroidUtilities.dp(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((kj0) arrayList.get(i10 + 1)).f27898i != kj0Var.f27898i) {
                    kj0Var.f27896f = true;
                    kj0Var.d += AndroidUtilities.dp(0.66f);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e(Layout layout, int i10, int i11) {
        float lineLeft;
        float lineRight;
        if (i10 != i11) {
            if (i11 < i10) {
                i11 = i10;
                i10 = i11;
            }
            int lineForOffset = layout.getLineForOffset(i10);
            int lineForOffset2 = layout.getLineForOffset(i11);
            for (int i12 = lineForOffset; i12 <= lineForOffset2; i12++) {
                int lineStart = layout.getLineStart(i12);
                int lineEnd = layout.getLineEnd(i12);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    if (i12 == lineForOffset && i10 > lineStart) {
                        lineLeft = layout.getPrimaryHorizontal(i10);
                    } else {
                        lineLeft = layout.getLineLeft(i12);
                    }
                    if (i12 == lineForOffset2 && i11 < lineEnd) {
                        lineRight = layout.getPrimaryHorizontal(i11);
                    } else {
                        lineRight = layout.getLineRight(i12);
                    }
                    a(Math.min(lineLeft, lineRight), layout.getLineTop(i12), Math.max(lineLeft, lineRight), layout.getLineBottom(i12));
                }
            }
        }
    }

    public lj0(final org.telegram.ui.Cells.u1 u1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f28206i = paint;
        this.f28207j = new er();
        this.f28209l = new ArrayList();
        this.f28210m = new ArrayList();
        this.f28217t = 1;
        this.f28218u = new ArrayList();
        this.f28201a = u1Var;
        this.f28208k = new f6(0.0f, new Runnable() {
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
        }, 350L, 420L, bs.h);
        this.f28202b = i10;
        this.f28205g = bArr;
        this.f28203c = 0;
        this.d = 0;
        this.e = false;
        this.f28204f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public lj0(final org.telegram.ui.Cells.u1 u1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f28206i = paint;
        this.f28207j = new er();
        this.f28209l = new ArrayList();
        this.f28210m = new ArrayList();
        this.f28217t = 1;
        this.f28218u = new ArrayList();
        this.f28201a = null;
        this.f28208k = new f6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        u1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        u1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, bs.h);
        this.f28202b = i10;
        this.f28203c = i11;
        this.d = i12;
        this.e = false;
        this.f28204f = false;
        if (arrayList == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        boolean z10 = false;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i14);
            if (textLayoutBlock != null && i11 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(0, i11 - i13);
                int i15 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i15, textLayoutBlock.charactersEnd - i15);
                float f10 = -f7;
                this.f28211n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f28211n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f28212o = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.f28213p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    e(textLayoutBlock.textLayout, max, min);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f28210m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        d();
    }

    public lj0(final org.telegram.ui.Cells.u1 u1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f28206i = paint;
        this.f28207j = new er();
        this.f28209l = new ArrayList();
        this.f28210m = new ArrayList();
        this.f28217t = 1;
        this.f28218u = new ArrayList();
        this.f28201a = null;
        this.f28208k = new f6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        u1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        u1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, bs.h);
        this.f28202b = i10;
        this.f28203c = i11;
        this.d = i12;
        this.e = false;
        this.f28204f = false;
        if (richMessageLayout == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        this.f28213p = -3.4028235E38f;
        for (int i13 = 0; i13 < richMessageLayout.textBlocks.size(); i13++) {
            org.telegram.ui.Cells.y9 y9Var = richMessageLayout.textBlocks.get(i13);
            Layout layout = y9Var == null ? null : y9Var.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i13).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.f28211n = y9Var.getX();
                    this.f28212o = y9Var.getY();
                    this.f28216s = y9Var;
                    this.f28214q = null;
                    int size = this.f28209l.size();
                    if (AndroidUtilities.isRTL(layout.getText())) {
                        layout.getSelectionPath(clamp, clamp2, this);
                    } else {
                        e(layout, clamp, clamp2);
                    }
                    if (this.f28209l.size() > size) {
                        this.f28215r++;
                    }
                }
            }
        }
        this.f28217t = Math.max(1, this.f28215r);
        d();
    }
}

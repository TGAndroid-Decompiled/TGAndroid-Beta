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
public final class kj0 extends Path {
    public final org.telegram.ui.Cells.u1 f27887a;
    public final int f27888b;
    public final int f27889c;
    public final int d;
    public final boolean e;
    public final boolean f27890f;
    public final byte[] f27891g;
    public int h;
    public final Paint f27892i;
    public final er f27893j;
    public final f6 f27894k;
    public final ArrayList f27895l;
    public final ArrayList f27896m;
    public final float f27897n;
    public final float f27898o;
    public final float f27899p;
    public jj0 f27900q;
    public final int f27901r;
    public final org.telegram.ui.Cells.y9 f27902s;
    public final int f27903t;
    public final ArrayList f27904u;

    public kj0(final org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f27892i = paint;
        this.f27893j = new er();
        this.f27895l = new ArrayList();
        this.f27896m = new ArrayList();
        this.f27903t = 1;
        this.f27904u = new ArrayList();
        this.f27887a = u1Var;
        this.f27894k = new f6(0.0f, new Runnable() {
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
        this.f27888b = i10;
        int i12 = -i11;
        this.f27889c = i12;
        this.d = i12;
        this.e = true;
        this.f27890f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public static void b(er erVar, jj0 jj0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.y9 y9Var;
        float f12;
        org.telegram.ui.Cells.y9 y9Var2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (jj0Var.f27545j != null) {
            f12 = y9Var.getX() - jj0Var.f27546k;
        } else {
            f12 = 0.0f;
        }
        if (jj0Var.f27545j != null) {
            f15 = y9Var2.getY() - jj0Var.f27547l;
        }
        float lerp = AndroidUtilities.lerp(rect.left - f7, jj0Var.f27539a + f12, f11);
        if (jj0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = jj0Var.f27543g + f15;
        }
        float lerp2 = AndroidUtilities.lerp(f13, jj0Var.f27541c + f15, f11);
        float lerp3 = AndroidUtilities.lerp(rect.right - f7, jj0Var.f27540b + f12, f11);
        if (jj0Var.f27542f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = jj0Var.h + f15;
        }
        erVar.addRect(lerp, lerp2, lerp3, AndroidUtilities.lerp(f14, jj0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f27899p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f27897n;
        float f15 = max + f14;
        float f16 = this.f27898o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f27539a = f15 - AndroidUtilities.dp(3.0f);
        obj.f27540b = f18 + AndroidUtilities.dp(3.0f);
        obj.f27541c = f17;
        obj.d = f12 + f16;
        obj.f27544i = this.f27901r;
        org.telegram.ui.Cells.y9 y9Var = this.f27902s;
        obj.f27545j = y9Var;
        if (y9Var != null) {
            obj.f27546k = y9Var.getX();
            obj.f27547l = y9Var.getY();
        }
        jj0 jj0Var = this.f27900q;
        if (jj0Var != null) {
            float f19 = jj0Var.d;
            jj0Var.h = (f19 + f17) / 2.0f;
            obj.f27543g = (f19 + f17) / 2.0f;
        }
        this.f27895l.add(obj);
        this.f27900q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float d = this.f27894k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f27890f;
        org.telegram.ui.Cells.u1 u1Var = this.f27887a;
        er erVar = this.f27893j;
        Paint paint = this.f27892i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            erVar.rewind();
            int I2 = u1Var.I2(this.f27891g);
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
            int O2 = u1Var.O2(-this.f27889c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(O2), u1Var.getBackgroundDrawableRight(), u1Var.G2(O2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            erVar.addRect(rectF2, Path.Direction.CW);
            erVar.a();
        } else {
            int i11 = this.f27903t;
            ArrayList arrayList2 = this.f27895l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                er erVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f27904u;
                    if (i13 >= size) {
                        break;
                    }
                    jj0 jj0Var = (jj0) arrayList2.get(i13);
                    if (erVar2 == null || jj0Var.e) {
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
                    b(erVar3, jj0Var, f7, f10, rect2, d);
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
                b(erVar, (jj0) arrayList2.get(i10), f7, f10, rect2, d);
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
            ArrayList arrayList = this.f27895l;
            if (i10 < arrayList.size()) {
                jj0 jj0Var = (jj0) arrayList.get(i10);
                if (i10 == 0 || ((jj0) arrayList.get(i10 - 1)).f27544i != jj0Var.f27544i) {
                    jj0Var.e = true;
                    jj0Var.f27541c -= AndroidUtilities.dp(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((jj0) arrayList.get(i10 + 1)).f27544i != jj0Var.f27544i) {
                    jj0Var.f27542f = true;
                    jj0Var.d += AndroidUtilities.dp(0.66f);
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

    public kj0(final org.telegram.ui.Cells.u1 u1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f27892i = paint;
        this.f27893j = new er();
        this.f27895l = new ArrayList();
        this.f27896m = new ArrayList();
        this.f27903t = 1;
        this.f27904u = new ArrayList();
        this.f27887a = u1Var;
        this.f27894k = new f6(0.0f, new Runnable() {
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
        this.f27888b = i10;
        this.f27891g = bArr;
        this.f27889c = 0;
        this.d = 0;
        this.e = false;
        this.f27890f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public kj0(final org.telegram.ui.Cells.u1 u1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f27892i = paint;
        this.f27893j = new er();
        this.f27895l = new ArrayList();
        this.f27896m = new ArrayList();
        this.f27903t = 1;
        this.f27904u = new ArrayList();
        this.f27887a = null;
        this.f27894k = new f6(0.0f, new Runnable() {
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
        this.f27888b = i10;
        this.f27889c = i11;
        this.d = i12;
        this.e = false;
        this.f27890f = false;
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
                this.f27897n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f27897n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f27898o = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.f27899p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    e(textLayoutBlock.textLayout, max, min);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f27896m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        d();
    }

    public kj0(final org.telegram.ui.Cells.u1 u1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f27892i = paint;
        this.f27893j = new er();
        this.f27895l = new ArrayList();
        this.f27896m = new ArrayList();
        this.f27903t = 1;
        this.f27904u = new ArrayList();
        this.f27887a = null;
        this.f27894k = new f6(0.0f, new Runnable() {
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
        this.f27888b = i10;
        this.f27889c = i11;
        this.d = i12;
        this.e = false;
        this.f27890f = false;
        if (richMessageLayout == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        this.f27899p = -3.4028235E38f;
        for (int i13 = 0; i13 < richMessageLayout.textBlocks.size(); i13++) {
            org.telegram.ui.Cells.y9 y9Var = richMessageLayout.textBlocks.get(i13);
            Layout layout = y9Var == null ? null : y9Var.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i13).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.f27897n = y9Var.getX();
                    this.f27898o = y9Var.getY();
                    this.f27902s = y9Var;
                    this.f27900q = null;
                    int size = this.f27895l.size();
                    if (AndroidUtilities.isRTL(layout.getText())) {
                        layout.getSelectionPath(clamp, clamp2, this);
                    } else {
                        e(layout, clamp, clamp2);
                    }
                    if (this.f27895l.size() > size) {
                        this.f27901r++;
                    }
                }
            }
        }
        this.f27903t = Math.max(1, this.f27901r);
        d();
    }
}

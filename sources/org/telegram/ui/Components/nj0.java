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
public final class nj0 extends Path {
    public final org.telegram.ui.Cells.t1 f28941a;
    public final int f28942b;
    public final int f28943c;
    public final int d;
    public final boolean e;
    public final boolean f28944f;
    public final byte[] f28945g;
    public int h;
    public final Paint f28946i;
    public final br f28947j;
    public final d6 f28948k;
    public final ArrayList f28949l;
    public final ArrayList f28950m;
    public final float f28951n;
    public final float f28952o;
    public final float f28953p;
    public mj0 f28954q;
    public final int f28955r;
    public final org.telegram.ui.Cells.z9 f28956s;
    public final int f28957t;
    public final ArrayList f28958u;

    public nj0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f28946i = paint;
        this.f28947j = new br();
        this.f28949l = new ArrayList();
        this.f28950m = new ArrayList();
        this.f28957t = 1;
        this.f28958u = new ArrayList();
        this.f28941a = t1Var;
        this.f28948k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, zr.h);
        this.f28942b = i10;
        int i12 = -i11;
        this.f28943c = i12;
        this.d = i12;
        this.e = true;
        this.f28944f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public static void b(br brVar, mj0 mj0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.z9 z9Var;
        float f12;
        org.telegram.ui.Cells.z9 z9Var2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (mj0Var.f28613j != null) {
            f12 = z9Var.getX() - mj0Var.f28614k;
        } else {
            f12 = 0.0f;
        }
        if (mj0Var.f28613j != null) {
            f15 = z9Var2.getY() - mj0Var.f28615l;
        }
        float lerp = AndroidUtilities.lerp(rect.left - f7, mj0Var.f28607a + f12, f11);
        if (mj0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = mj0Var.f28611g + f15;
        }
        float lerp2 = AndroidUtilities.lerp(f13, mj0Var.f28609c + f15, f11);
        float lerp3 = AndroidUtilities.lerp(rect.right - f7, mj0Var.f28608b + f12, f11);
        if (mj0Var.f28610f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = mj0Var.h + f15;
        }
        brVar.addRect(lerp, lerp2, lerp3, AndroidUtilities.lerp(f14, mj0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f28953p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f28951n;
        float f15 = max + f14;
        float f16 = this.f28952o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f28607a = f15 - AndroidUtilities.dp(3.0f);
        obj.f28608b = f18 + AndroidUtilities.dp(3.0f);
        obj.f28609c = f17;
        obj.d = f12 + f16;
        obj.f28612i = this.f28955r;
        org.telegram.ui.Cells.z9 z9Var = this.f28956s;
        obj.f28613j = z9Var;
        if (z9Var != null) {
            obj.f28614k = z9Var.getX();
            obj.f28615l = z9Var.getY();
        }
        mj0 mj0Var = this.f28954q;
        if (mj0Var != null) {
            float f19 = mj0Var.d;
            mj0Var.h = (f19 + f17) / 2.0f;
            obj.f28611g = (f19 + f17) / 2.0f;
        }
        this.f28949l.add(obj);
        this.f28954q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float d = this.f28948k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f28944f;
        org.telegram.ui.Cells.t1 t1Var = this.f28941a;
        br brVar = this.f28947j;
        Paint paint = this.f28946i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            brVar.rewind();
            int H2 = t1Var.H2(this.f28945g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.G2(H2), t1Var.getBackgroundDrawableRight(), t1Var.F2(H2));
            AndroidUtilities.lerp(rect2, rectF, d, rectF);
            brVar.addRect(rectF, Path.Direction.CW);
            brVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            brVar.rewind();
            int N2 = t1Var.N2(-this.f28943c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.G2(N2), t1Var.getBackgroundDrawableRight(), t1Var.F2(N2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            brVar.addRect(rectF2, Path.Direction.CW);
            brVar.a();
        } else {
            int i11 = this.f28957t;
            ArrayList arrayList2 = this.f28949l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                br brVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f28958u;
                    if (i13 >= size) {
                        break;
                    }
                    mj0 mj0Var = (mj0) arrayList2.get(i13);
                    if (brVar2 == null || mj0Var.e) {
                        if (brVar2 != null) {
                            brVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new br());
                        }
                        brVar2 = (br) arrayList.get(i12);
                        brVar2.rewind();
                    }
                    br brVar3 = brVar2;
                    b(brVar3, mj0Var, f7, f10, rect2, d);
                    brVar2 = brVar3;
                    i13++;
                }
                if (brVar2 != null) {
                    brVar2.a();
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
            brVar.rewind();
            while (i10 < arrayList2.size()) {
                b(brVar, (mj0) arrayList2.get(i10), f7, f10, rect2, d);
                i10++;
                rect2 = rect;
            }
            brVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(brVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28949l;
            if (i10 < arrayList.size()) {
                mj0 mj0Var = (mj0) arrayList.get(i10);
                if (i10 == 0 || ((mj0) arrayList.get(i10 - 1)).f28612i != mj0Var.f28612i) {
                    mj0Var.e = true;
                    mj0Var.f28609c -= AndroidUtilities.dp(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((mj0) arrayList.get(i10 + 1)).f28612i != mj0Var.f28612i) {
                    mj0Var.f28610f = true;
                    mj0Var.d += AndroidUtilities.dp(0.66f);
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

    public nj0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f28946i = paint;
        this.f28947j = new br();
        this.f28949l = new ArrayList();
        this.f28950m = new ArrayList();
        this.f28957t = 1;
        this.f28958u = new ArrayList();
        this.f28941a = t1Var;
        this.f28948k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, zr.h);
        this.f28942b = i10;
        this.f28945g = bArr;
        this.f28943c = 0;
        this.d = 0;
        this.e = false;
        this.f28944f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public nj0(final org.telegram.ui.Cells.t1 t1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f28946i = paint;
        this.f28947j = new br();
        this.f28949l = new ArrayList();
        this.f28950m = new ArrayList();
        this.f28957t = 1;
        this.f28958u = new ArrayList();
        this.f28941a = null;
        this.f28948k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        t1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        t1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, zr.h);
        this.f28942b = i10;
        this.f28943c = i11;
        this.d = i12;
        this.e = false;
        this.f28944f = false;
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
                this.f28951n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f28951n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f28952o = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.f28953p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    e(textLayoutBlock.textLayout, max, min);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f28950m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        d();
    }

    public nj0(final org.telegram.ui.Cells.t1 t1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f28946i = paint;
        this.f28947j = new br();
        this.f28949l = new ArrayList();
        this.f28950m = new ArrayList();
        this.f28957t = 1;
        this.f28958u = new ArrayList();
        this.f28941a = null;
        this.f28948k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        t1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        t1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, zr.h);
        this.f28942b = i10;
        this.f28943c = i11;
        this.d = i12;
        this.e = false;
        this.f28944f = false;
        if (richMessageLayout == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        this.f28953p = -3.4028235E38f;
        for (int i13 = 0; i13 < richMessageLayout.textBlocks.size(); i13++) {
            org.telegram.ui.Cells.z9 z9Var = richMessageLayout.textBlocks.get(i13);
            Layout layout = z9Var == null ? null : z9Var.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i13).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.f28951n = z9Var.getX();
                    this.f28952o = z9Var.getY();
                    this.f28956s = z9Var;
                    this.f28954q = null;
                    int size = this.f28949l.size();
                    if (AndroidUtilities.isRTL(layout.getText())) {
                        layout.getSelectionPath(clamp, clamp2, this);
                    } else {
                        e(layout, clamp, clamp2);
                    }
                    if (this.f28949l.size() > size) {
                        this.f28955r++;
                    }
                }
            }
        }
        this.f28957t = Math.max(1, this.f28955r);
        d();
    }
}

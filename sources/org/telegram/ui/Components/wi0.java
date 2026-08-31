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
public final class wi0 extends Path {
    public final org.telegram.ui.Cells.t1 f32757a;
    public final int f32758b;
    public final int f32759c;
    public final int d;
    public final boolean f32760e;
    public final boolean f32761f;
    public final byte[] f32762g;
    public int h;
    public final Paint f32763i;
    public final uq f32764j;
    public final z5 f32765k;
    public final ArrayList f32766l;
    public final ArrayList f32767m;
    public final float f32768n;
    public final float f32769o;
    public final float f32770p;
    public vi0 f32771q;

    public wi0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f32763i = paint;
        this.f32764j = new uq();
        this.f32766l = new ArrayList();
        this.f32767m = new ArrayList();
        this.f32757a = t1Var;
        this.f32765k = new z5(0.0f, new Runnable() {
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
        }, 350L, 420L, pr.h);
        this.f32758b = i10;
        int i12 = -i11;
        this.f32759c = i12;
        this.d = i12;
        this.f32760e = true;
        this.f32761f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f32770p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f32768n;
        float f16 = max + f15;
        float f17 = this.f32769o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f31912a = f16 - AndroidUtilities.dp(3.0f);
        obj.f31913b = f19 + AndroidUtilities.dp(3.0f);
        obj.f31914c = f18;
        obj.d = f13 + f17;
        vi0 vi0Var = this.f32771q;
        if (vi0Var != null) {
            float f20 = vi0Var.d;
            vi0Var.h = (f20 + f18) / 2.0f;
            obj.f31917g = (f20 + f18) / 2.0f;
        }
        this.f32766l.add(obj);
        this.f32771q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        int i10 = 0;
        float d = this.f32765k.d(1.0f, false);
        canvas.save();
        boolean z4 = this.f32761f;
        Paint paint = this.f32763i;
        org.telegram.ui.Cells.t1 t1Var = this.f32757a;
        uq uqVar = this.f32764j;
        if (z4) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            uqVar.rewind();
            int I2 = t1Var.I2(this.f32762g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            uqVar.addRect(rectF, Path.Direction.CW);
            uqVar.a();
        } else if (this.f32760e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            uqVar.rewind();
            int O2 = t1Var.O2(-this.f32759c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            uqVar.addRect(rectF2, Path.Direction.CW);
            uqVar.a();
        } else {
            canvas.translate(f10, f11);
            uqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f32766l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                vi0 vi0Var = (vi0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f10, vi0Var.f31912a, d);
                if (vi0Var.f31915e) {
                    f13 = rect.top - f11;
                } else {
                    f13 = vi0Var.f31917g;
                }
                float lerp4 = AndroidUtilities.lerp(f13, vi0Var.f31914c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f10, vi0Var.f31913b, d);
                if (vi0Var.f31916f) {
                    f14 = rect.bottom - f11;
                } else {
                    f14 = vi0Var.h;
                }
                uqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f14, vi0Var.d, d), Path.Direction.CW);
                i10++;
            }
            uqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(uqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public wi0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f32763i = paint;
        this.f32764j = new uq();
        this.f32766l = new ArrayList();
        this.f32767m = new ArrayList();
        this.f32757a = t1Var;
        this.f32765k = new z5(0.0f, new Runnable() {
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
        }, 350L, 420L, pr.h);
        this.f32758b = i10;
        this.f32762g = bArr;
        this.f32759c = 0;
        this.d = 0;
        this.f32760e = false;
        this.f32761f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public wi0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f10) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f32763i = paint;
        this.f32764j = new uq();
        this.f32766l = new ArrayList();
        this.f32767m = new ArrayList();
        this.f32757a = null;
        this.f32765k = new z5(0.0f, new a90(8, t1Var, viewParent), 350L, 420L, pr.h);
        this.f32758b = i10;
        this.f32759c = i14;
        this.d = i12;
        int i15 = 0;
        this.f32760e = false;
        this.f32761f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i16 = 0;
        boolean z4 = false;
        while (i16 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i16);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i15, i14 - i13);
                int i17 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i17, textLayoutBlock.charactersEnd - i17);
                float f11 = -f10;
                this.f32768n = f11;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f32768n = f11 + AndroidUtilities.dp(10.0f);
                }
                this.f32769o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f32770p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z4 = z4 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z4) {
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
                    this.f32767m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f32766l.size() > 0) {
            vi0 vi0Var = (vi0) this.f32766l.get(0);
            vi0 vi0Var2 = (vi0) l.d.i(1, this.f32766l);
            vi0Var.f31915e = true;
            vi0Var.f31914c -= AndroidUtilities.dp(0.66f);
            vi0Var2.f31916f = true;
            vi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}

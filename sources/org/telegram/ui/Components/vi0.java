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
public final class vi0 extends Path {
    public final org.telegram.ui.Cells.s1 f29484a;
    public final int f29485b;
    public final int f29486c;
    public final int d;
    public final boolean e;
    public final boolean f29487f;
    public final byte[] f29488g;
    public int h;
    public final Paint f29489i;
    public final rq f29490j;
    public final z5 f29491k;
    public final ArrayList f29492l;
    public final ArrayList f29493m;
    public final float f29494n;
    public final float f29495o;
    public final float f29496p;
    public ui0 f29497q;

    public vi0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f29489i = paint;
        this.f29490j = new rq();
        this.f29492l = new ArrayList();
        this.f29493m = new ArrayList();
        this.f29484a = s1Var;
        this.f29491k = new z5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, mr.h);
        this.f29485b = i10;
        int i12 = -i11;
        this.f29486c = i12;
        this.d = i12;
        this.e = true;
        this.f29487f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f29496p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f29494n;
        float f16 = max + f15;
        float f17 = this.f29495o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f29216a = f16 - AndroidUtilities.dp(3.0f);
        obj.f29217b = f19 + AndroidUtilities.dp(3.0f);
        obj.f29218c = f18;
        obj.d = f13 + f17;
        ui0 ui0Var = this.f29497q;
        if (ui0Var != null) {
            float f20 = ui0Var.d;
            ui0Var.h = (f20 + f18) / 2.0f;
            obj.f29220g = (f20 + f18) / 2.0f;
        }
        this.f29492l.add(obj);
        this.f29497q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        int i10 = 0;
        float d = this.f29491k.d(1.0f, false);
        canvas.save();
        boolean z4 = this.f29487f;
        Paint paint = this.f29489i;
        org.telegram.ui.Cells.s1 s1Var = this.f29484a;
        rq rqVar = this.f29490j;
        if (z4) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            rqVar.rewind();
            int I2 = s1Var.I2(this.f29488g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(I2), s1Var.getBackgroundDrawableRight(), s1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            rqVar.addRect(rectF, Path.Direction.CW);
            rqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            rqVar.rewind();
            int O2 = s1Var.O2(-this.f29486c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(O2), s1Var.getBackgroundDrawableRight(), s1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            rqVar.addRect(rectF2, Path.Direction.CW);
            rqVar.a();
        } else {
            canvas.translate(f10, f11);
            rqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f29492l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ui0 ui0Var = (ui0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f10, ui0Var.f29216a, d);
                if (ui0Var.e) {
                    f13 = rect.top - f11;
                } else {
                    f13 = ui0Var.f29220g;
                }
                float lerp4 = AndroidUtilities.lerp(f13, ui0Var.f29218c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f10, ui0Var.f29217b, d);
                if (ui0Var.f29219f) {
                    f14 = rect.bottom - f11;
                } else {
                    f14 = ui0Var.h;
                }
                rqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f14, ui0Var.d, d), Path.Direction.CW);
                i10++;
            }
            rqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(rqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public vi0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f29489i = paint;
        this.f29490j = new rq();
        this.f29492l = new ArrayList();
        this.f29493m = new ArrayList();
        this.f29484a = s1Var;
        this.f29491k = new z5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, mr.h);
        this.f29485b = i10;
        this.f29488g = bArr;
        this.f29486c = 0;
        this.d = 0;
        this.e = false;
        this.f29487f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public vi0(org.telegram.ui.Cells.s1 s1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f10) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f29489i = paint;
        this.f29490j = new rq();
        this.f29492l = new ArrayList();
        this.f29493m = new ArrayList();
        this.f29484a = null;
        this.f29491k = new z5(0.0f, new z80(8, s1Var, viewParent), 350L, 420L, mr.h);
        this.f29485b = i10;
        this.f29486c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f29487f = false;
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
                this.f29494n = f11;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f29494n = f11 + AndroidUtilities.dp(10.0f);
                }
                this.f29495o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f29496p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
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
                    this.f29493m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f29492l.size() > 0) {
            ui0 ui0Var = (ui0) this.f29492l.get(0);
            ui0 ui0Var2 = (ui0) kf.k0.i(1, this.f29492l);
            ui0Var.e = true;
            ui0Var.f29218c -= AndroidUtilities.dp(0.66f);
            ui0Var2.f29219f = true;
            ui0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}

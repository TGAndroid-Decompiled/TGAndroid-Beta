package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class n40 {
    public final int f39686a;
    public org.telegram.messenger.g6 f39688c;
    public org.telegram.ui.Components.f5 d;
    public boolean e;
    public boolean f39689f;
    public long f39690g;
    public String f39694l;
    public final Drawable[] f39687b = new Drawable[6];
    public final li.k h = new li.k(23);
    public final HashSet f39691i = new HashSet();
    public boolean f39692j = false;
    public final m40 f39693k = new m40(this, 0);
    public final RectF f39695m = new RectF();

    public n40(int i10) {
        int i11 = 0;
        this.f39686a = i10;
        while (true) {
            Drawable[] drawableArr = this.f39687b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = org.telegram.messenger.k6.g(a50.L0());
                i11++;
            } else {
                this.f39690g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f39691i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f39692j != z10) {
            this.f39692j = z10;
            m40 m40Var = this.f39693k;
            if (!isEmpty) {
                org.telegram.ui.Components.f5 f5Var = this.d;
                if (f5Var != null) {
                    f5Var.b(m40Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.f5 f5Var2 = this.d;
            if (f5Var2 != null) {
                f5Var2.o(m40Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j10;
        float f10;
        float L = org.telegram.messenger.i0.L(6.0f);
        RectF rectF2 = this.f39695m;
        rectF2.set(rectF);
        float f11 = -L;
        rectF2.inset(f11, f11);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f39686a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f39690g;
        float f12 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f12);
        boolean z10 = this.f39689f;
        Drawable[] drawableArr = this.f39687b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f39688c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + L));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 0.0f;
                j10 = j11;
                this.f39688c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f39688c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f39688c.draw(canvas);
                this.f39688c.setAlpha(255);
                canvas.restore();
            } else {
                j10 = j11;
                f10 = 0.0f;
            }
            if (f7 > f10) {
                canvas.save();
                rectF2.inset(org.telegram.messenger.i0.L(-4.0f), org.telegram.messenger.i0.L(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f7 * 255.0f));
                this.d.draw(canvas);
                this.d.setAlpha(255);
                canvas.restore();
            }
        } else {
            j10 = j11;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + L) * (min - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(127);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(255);
            canvas.restore();
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + L) * min);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(127);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(255);
        canvas.restore();
        if (f12 >= 1.0f) {
            if (this.f39689f && this.e) {
                z11 = true;
            } else {
                this.f39690g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = org.telegram.messenger.k6.g(a50.L0());
                if (this.f39689f) {
                    this.e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f13 = (int) f11;
        rectF2.inset(f13, f13);
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        rectF2.set(f14, f15, rectF2.right, f15 + L);
        li.k kVar = this.h;
        kVar.o(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f13, f13);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        rectF2.set(f16, f17 - L, rectF2.right, f17);
        kVar.o(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f39694l != null) {
            int l4 = org.telegram.messenger.e20.l();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.vi.b0(l4).l0(tL_inputStickerSetShortName, 0, false, true, new s3(this, 8));
            if (l02 != null) {
                String replace = this.f39694l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = l02.documents;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    document = null;
                    if (i10 >= size) {
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document3 = document2;
                    if (TextUtils.equals(org.telegram.messenger.kj.V(document3, null, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.f5 f5Var = this.d;
                    f5Var.e = document;
                    f5Var.i(false);
                    return;
                }
                org.telegram.messenger.f8.d("emoji \"" + this.f39694l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

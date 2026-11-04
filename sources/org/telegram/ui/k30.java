package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class k30 {
    public final int f46747a;
    public org.telegram.messenger.e6 f46749c;
    public org.telegram.ui.Components.g5 d;
    public boolean f46750e;
    public boolean f46751f;
    public long f46752g;
    public String f46756l;
    public final Drawable[] f46748b = new Drawable[6];
    public final k4.j h = new k4.j(24);
    public final HashSet f46753i = new HashSet();
    public boolean f46754j = false;
    public final j30 f46755k = new j30(this, 0);
    public final RectF f46757m = new RectF();

    public k30(int i3) {
        int i10 = 0;
        this.f46747a = i3;
        while (true) {
            Drawable[] drawableArr = this.f46748b;
            if (i10 < drawableArr.length) {
                drawableArr[i10] = org.telegram.messenger.i6.g(x30.L0());
                i10++;
            } else {
                this.f46752g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f46753i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f46754j != z10) {
            this.f46754j = z10;
            j30 j30Var = this.f46755k;
            if (!isEmpty) {
                org.telegram.ui.Components.g5 g5Var = this.d;
                if (g5Var != null) {
                    g5Var.b(j30Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                g5Var2.o(j30Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        long j10;
        float f11;
        float L = org.telegram.messenger.g0.L(6.0f);
        RectF rectF2 = this.f46757m;
        rectF2.set(rectF);
        float f12 = -L;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f46747a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f46752g;
        float f13 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f46751f;
        Drawable[] drawableArr = this.f46748b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f46749c != null && this.f46750e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + L));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 0.0f;
                j10 = j11;
                this.f46749c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f46749c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f46749c.draw(canvas);
                this.f46749c.setAlpha(255);
                canvas.restore();
            } else {
                j10 = j11;
                f11 = 0.0f;
            }
            if (f10 > f11) {
                canvas.save();
                rectF2.inset(org.telegram.messenger.g0.L(-4.0f), org.telegram.messenger.g0.L(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f10 * 255.0f));
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
        if (f13 >= 1.0f) {
            if (this.f46751f && this.f46750e) {
                z11 = true;
            } else {
                this.f46752g = currentTimeMillis - (j10 % 180);
                int i3 = 0;
                while (i3 < drawableArr.length - 1) {
                    int i10 = i3 + 1;
                    drawableArr[i3] = drawableArr[i10];
                    i3 = i10;
                }
                drawableArr[drawableArr.length - 1] = org.telegram.messenger.i6.g(x30.L0());
                if (this.f46751f) {
                    this.f46750e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f14 = (int) f12;
        rectF2.inset(f14, f14);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        rectF2.set(f15, f16, rectF2.right, f16 + L);
        k4.j jVar = this.h;
        jVar.w(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - L, rectF2.right, f18);
        jVar.w(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f46756l != null) {
            int l10 = org.telegram.messenger.h10.l();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(l10).l0(tL_inputStickerSetShortName, 0, false, true, new s3(this, 8));
            if (l02 != null) {
                String replace = this.f46756l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = l02.documents;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    document = null;
                    if (i3 >= size) {
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i3);
                    i3++;
                    TLRPC.Document document3 = document2;
                    if (TextUtils.equals(org.telegram.messenger.zi.V(document3, null, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.g5 g5Var = this.d;
                    g5Var.f33966e = document;
                    g5Var.i(false);
                    return;
                }
                org.telegram.messenger.a8.d("emoji \"" + this.f46756l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

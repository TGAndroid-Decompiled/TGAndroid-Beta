package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class p50 {
    public final int f37185a;
    public Emoji.EmojiDrawable f37187c;
    public org.telegram.ui.Components.l5 d;
    public boolean e;
    public boolean f37188f;
    public long f37189g;
    public String f37193l;
    public final Drawable[] f37186b = new Drawable[6];
    public final g20 h = new g20();
    public final HashSet f37190i = new HashSet();
    public boolean f37191j = false;
    public final o50 f37192k = new o50(this, 0);
    public final RectF f37194m = new RectF();

    public p50(int i10) {
        int i11 = 0;
        this.f37185a = i10;
        while (true) {
            Drawable[] drawableArr = this.f37186b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(c60.A0());
                i11++;
            } else {
                this.f37189g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f37190i.isEmpty();
        boolean z4 = !isEmpty;
        if (this.f37191j != z4) {
            this.f37191j = z4;
            o50 o50Var = this.f37192k;
            if (!isEmpty) {
                org.telegram.ui.Components.l5 l5Var = this.d;
                if (l5Var != null) {
                    l5Var.b(o50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.l5 l5Var2 = this.d;
            if (l5Var2 != null) {
                l5Var2.p(o50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        long j10;
        float f11;
        float f12;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f37194m;
        rectF2.set(rectF);
        float f13 = -dp;
        rectF2.inset(f13, f13);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f37185a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f37189g;
        float f14 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f14);
        boolean z4 = this.f37188f;
        Drawable[] drawableArr = this.f37186b;
        boolean z10 = false;
        if (z4 && this.d != null && this.f37187c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 255.0f;
                f12 = 0.0f;
                j10 = j11;
                this.f37187c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f37187c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f37187c.draw(canvas);
                this.f37187c.setAlpha(255);
                canvas.restore();
            } else {
                j10 = j11;
                f11 = 255.0f;
                f12 = 0.0f;
            }
            if (f10 > f12) {
                canvas.save();
                rectF2.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f10 * f11));
                this.d.draw(canvas);
                this.d.setAlpha(255);
                canvas.restore();
            }
        } else {
            j10 = j11;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + dp) * (min - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(127);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(255);
            canvas.restore();
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + dp) * min);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(127);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(255);
        canvas.restore();
        if (f14 >= 1.0f) {
            if (this.f37188f && this.e) {
                z10 = true;
            } else {
                this.f37189g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(c60.A0());
                if (this.f37188f) {
                    this.e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f15 = (int) f13;
        rectF2.inset(f15, f15);
        float f16 = rectF2.left;
        float f17 = rectF2.top;
        rectF2.set(f16, f17, rectF2.right, f17 + dp);
        g20 g20Var = this.h;
        g20Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f15, f15);
        float f18 = rectF2.left;
        float f19 = rectF2.bottom;
        rectF2.set(f18, f19 - dp, rectF2.right, f19);
        g20Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z10;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f37193l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new w3(this, 6));
            if (stickerSet != null) {
                String replace = this.f37193l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
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
                    if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document3, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.l5 l5Var = this.d;
                    l5Var.e = document;
                    l5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f37193l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

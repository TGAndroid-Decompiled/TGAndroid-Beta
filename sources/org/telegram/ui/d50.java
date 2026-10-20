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
public final class d50 {
    public final int f36262a;
    public Emoji.EmojiDrawable f36264c;
    public org.telegram.ui.Components.r5 d;
    public boolean e;
    public boolean f36265f;
    public long f36266g;
    public String f36270l;
    public final Drawable[] f36263b = new Drawable[6];
    public final s10 h = new s10();
    public final HashSet f36267i = new HashSet();
    public boolean f36268j = false;
    public final c50 f36269k = new c50(this, 0);
    public final RectF f36271m = new RectF();

    public d50(int i10) {
        int i11 = 0;
        this.f36262a = i10;
        while (true) {
            Drawable[] drawableArr = this.f36263b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(q50.B0());
                i11++;
            } else {
                this.f36266g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f36267i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f36268j != z10) {
            this.f36268j = z10;
            c50 c50Var = this.f36269k;
            if (!isEmpty) {
                org.telegram.ui.Components.r5 r5Var = this.d;
                if (r5Var != null) {
                    r5Var.b(c50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.r5 r5Var2 = this.d;
            if (r5Var2 != null) {
                r5Var2.p(c50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j10;
        float f10;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f36271m;
        rectF2.set(rectF);
        float f11 = -dp;
        rectF2.inset(f11, f11);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f36262a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f36266g;
        float f12 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f12);
        boolean z10 = this.f36265f;
        Drawable[] drawableArr = this.f36263b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f36264c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 0.0f;
                j10 = j11;
                this.f36264c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f36264c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f36264c.draw(canvas);
                this.f36264c.setAlpha(255);
                canvas.restore();
            } else {
                j10 = j11;
                f10 = 0.0f;
            }
            if (f7 > f10) {
                canvas.save();
                rectF2.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
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
        if (f12 >= 1.0f) {
            if (this.f36265f && this.e) {
                z11 = true;
            } else {
                this.f36266g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(q50.B0());
                if (this.f36265f) {
                    this.e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f13 = (int) f11;
        rectF2.inset(f13, f13);
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        rectF2.set(f14, f15, rectF2.right, f15 + dp);
        s10 s10Var = this.h;
        s10Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f13, f13);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        rectF2.set(f16, f17 - dp, rectF2.right, f17);
        s10Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f36270l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new v3(this, 7));
            if (stickerSet != null) {
                String replace = this.f36270l.replace("️", "");
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
                    org.telegram.ui.Components.r5 r5Var = this.d;
                    r5Var.e = document;
                    r5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f36270l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

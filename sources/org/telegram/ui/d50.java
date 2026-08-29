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
    public final int f37299a;
    public Emoji.EmojiDrawable f37301c;
    public org.telegram.ui.Components.p5 d;
    public boolean f37302e;
    public boolean f37303f;
    public long f37304g;
    public String f37308l;
    public final Drawable[] f37300b = new Drawable[6];
    public final u10 h = new u10();
    public final HashSet f37305i = new HashSet();
    public boolean f37306j = false;
    public final c50 f37307k = new c50(this, 0);
    public final RectF f37309m = new RectF();

    public d50(int i10) {
        int i11 = 0;
        this.f37299a = i10;
        while (true) {
            Drawable[] drawableArr = this.f37300b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(r50.A0());
                i11++;
            } else {
                this.f37304g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f37305i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f37306j != z10) {
            this.f37306j = z10;
            c50 c50Var = this.f37307k;
            if (!isEmpty) {
                org.telegram.ui.Components.p5 p5Var = this.d;
                if (p5Var != null) {
                    p5Var.b(c50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.p5 p5Var2 = this.d;
            if (p5Var2 != null) {
                p5Var2.p(c50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f9) {
        long j10;
        float f10;
        float f11;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f37309m;
        rectF2.set(rectF);
        float f12 = -dp;
        rectF2.inset(f12, f12);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f37299a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f37304g;
        float f13 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f13);
        boolean z10 = this.f37303f;
        Drawable[] drawableArr = this.f37300b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f37301c != null && this.f37302e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f9 < 1.0f) {
                canvas.save();
                f10 = 255.0f;
                f11 = 0.0f;
                j10 = j11;
                this.f37301c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f37301c.setAlpha((int) ((1.0f - f9) * 255.0f));
                this.f37301c.draw(canvas);
                this.f37301c.setAlpha(255);
                canvas.restore();
            } else {
                j10 = j11;
                f10 = 255.0f;
                f11 = 0.0f;
            }
            if (f9 > f11) {
                canvas.save();
                rectF2.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f9 * f10));
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
        if (f13 >= 1.0f) {
            if (this.f37303f && this.f37302e) {
                z11 = true;
            } else {
                this.f37304g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(r50.A0());
                if (this.f37303f) {
                    this.f37302e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f14 = (int) f12;
        rectF2.inset(f14, f14);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        rectF2.set(f15, f16, rectF2.right, f16 + dp);
        u10 u10Var = this.h;
        u10Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f14, f14);
        float f17 = rectF2.left;
        float f18 = rectF2.bottom;
        rectF2.set(f17, f18 - dp, rectF2.right, f18);
        u10Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f37308l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new x3(this, 6));
            if (stickerSet != null) {
                String replace = this.f37308l.replace("️", "");
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
                    org.telegram.ui.Components.p5 p5Var = this.d;
                    p5Var.f31588e = document;
                    p5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f37308l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

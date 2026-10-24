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
public final class h50 {
    public final int f37749a;
    public Emoji.EmojiDrawable f37751c;
    public org.telegram.ui.Components.p5 d;
    public boolean e;
    public boolean f37752f;
    public long f37753g;
    public String f37757l;
    public final Drawable[] f37750b = new Drawable[6];
    public final w10 h = new w10();
    public final HashSet f37754i = new HashSet();
    public boolean f37755j = false;
    public final g50 f37756k = new g50(this, 0);
    public final RectF f37758m = new RectF();

    public h50(int i10) {
        int i11 = 0;
        this.f37749a = i10;
        while (true) {
            Drawable[] drawableArr = this.f37750b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(u50.A0());
                i11++;
            } else {
                this.f37753g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f37754i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f37755j != z10) {
            this.f37755j = z10;
            g50 g50Var = this.f37756k;
            if (!isEmpty) {
                org.telegram.ui.Components.p5 p5Var = this.d;
                if (p5Var != null) {
                    p5Var.b(g50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.p5 p5Var2 = this.d;
            if (p5Var2 != null) {
                p5Var2.p(g50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j10;
        float f10;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f37758m;
        rectF2.set(rectF);
        float f11 = -dp;
        rectF2.inset(f11, f11);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f37749a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f37753g;
        float f12 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f12);
        boolean z10 = this.f37752f;
        Drawable[] drawableArr = this.f37750b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f37751c != null && this.e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 0.0f;
                j10 = j11;
                this.f37751c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f37751c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.f37751c.draw(canvas);
                this.f37751c.setAlpha(255);
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
            if (this.f37752f && this.e) {
                z11 = true;
            } else {
                this.f37753g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(u50.A0());
                if (this.f37752f) {
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
        w10 w10Var = this.h;
        w10Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f13, f13);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        rectF2.set(f16, f17 - dp, rectF2.right, f17);
        w10Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f37757l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new u3(this, 7));
            if (stickerSet != null) {
                String replace = this.f37757l.replace("️", "");
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
                    p5Var.e = document;
                    p5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f37757l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

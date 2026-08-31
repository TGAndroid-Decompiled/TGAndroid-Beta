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
public final class q50 {
    public final int f40340a;
    public Emoji.EmojiDrawable f40342c;
    public org.telegram.ui.Components.l5 d;
    public boolean f40343e;
    public boolean f40344f;
    public long f40345g;
    public String f40349l;
    public final Drawable[] f40341b = new Drawable[6];
    public final h20 h = new h20();
    public final HashSet f40346i = new HashSet();
    public boolean f40347j = false;
    public final p50 f40348k = new p50(this, 0);
    public final RectF f40350m = new RectF();

    public q50(int i10) {
        int i11 = 0;
        this.f40340a = i10;
        while (true) {
            Drawable[] drawableArr = this.f40341b;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = Emoji.getEmojiDrawable(d60.A0());
                i11++;
            } else {
                this.f40345g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f40346i.isEmpty();
        boolean z4 = !isEmpty;
        if (this.f40347j != z4) {
            this.f40347j = z4;
            p50 p50Var = this.f40348k;
            if (!isEmpty) {
                org.telegram.ui.Components.l5 l5Var = this.d;
                if (l5Var != null) {
                    l5Var.b(p50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.l5 l5Var2 = this.d;
            if (l5Var2 != null) {
                l5Var2.p(p50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        long j10;
        float f11;
        float f12;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f40350m;
        rectF2.set(rectF);
        float f13 = -dp;
        rectF2.inset(f13, f13);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f40340a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f40345g;
        float f14 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f14);
        boolean z4 = this.f40344f;
        Drawable[] drawableArr = this.f40341b;
        boolean z10 = false;
        if (z4 && this.d != null && this.f40342c != null && this.f40343e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 255.0f;
                f12 = 0.0f;
                j10 = j11;
                this.f40342c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f40342c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f40342c.draw(canvas);
                this.f40342c.setAlpha(255);
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
            if (this.f40344f && this.f40343e) {
                z10 = true;
            } else {
                this.f40345g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(d60.A0());
                if (this.f40344f) {
                    this.f40343e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f15 = (int) f13;
        rectF2.inset(f15, f15);
        float f16 = rectF2.left;
        float f17 = rectF2.top;
        rectF2.set(f16, f17, rectF2.right, f17 + dp);
        h20 h20Var = this.h;
        h20Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f15, f15);
        float f18 = rectF2.left;
        float f19 = rectF2.bottom;
        rectF2.set(f18, f19 - dp, rectF2.right, f19);
        h20Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z10;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f40349l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new w3(this, 6));
            if (stickerSet != null) {
                String replace = this.f40349l.replace("️", "");
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
                    l5Var.f28599e = document;
                    l5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f40349l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

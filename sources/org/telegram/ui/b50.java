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
public final class b50 {
    public final int f36645a;
    public Emoji.EmojiDrawable f36647c;
    public org.telegram.ui.Components.k5 d;
    public boolean f36648e;
    public boolean f36649f;
    public long f36650g;
    public String f36654l;
    public final Drawable[] f36646b = new Drawable[6];
    public final s10 h = new s10();
    public final HashSet f36651i = new HashSet();
    public boolean f36652j = false;
    public final a50 f36653k = new a50(this, 0);
    public final RectF f36655m = new RectF();

    public b50(int i9) {
        int i10 = 0;
        this.f36645a = i9;
        while (true) {
            Drawable[] drawableArr = this.f36646b;
            if (i10 < drawableArr.length) {
                drawableArr[i10] = Emoji.getEmojiDrawable(o50.z0());
                i10++;
            } else {
                this.f36650g = System.currentTimeMillis();
                return;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.f36651i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.f36652j != z10) {
            this.f36652j = z10;
            a50 a50Var = this.f36653k;
            if (!isEmpty) {
                org.telegram.ui.Components.k5 k5Var = this.d;
                if (k5Var != null) {
                    k5Var.b(a50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.k5 k5Var2 = this.d;
            if (k5Var2 != null) {
                k5Var2.p(a50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        long j10;
        float f11;
        float f12;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f36655m;
        rectF2.set(rectF);
        float f13 = -dp;
        rectF2.inset(f13, f13);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long currentTimeMillis = (this.f36645a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f36650g;
        float f14 = ((float) j11) / 180.0f;
        float min = Math.min(1.0f, f14);
        boolean z10 = this.f36649f;
        Drawable[] drawableArr = this.f36646b;
        boolean z11 = false;
        if (z10 && this.d != null && this.f36647c != null && this.f36648e) {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 255.0f;
                f12 = 0.0f;
                j10 = j11;
                this.f36647c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f36647c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f36647c.draw(canvas);
                this.f36647c.setAlpha(255);
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
            if (this.f36649f && this.f36648e) {
                z11 = true;
            } else {
                this.f36650g = currentTimeMillis - (j10 % 180);
                int i9 = 0;
                while (i9 < drawableArr.length - 1) {
                    int i10 = i9 + 1;
                    drawableArr[i9] = drawableArr[i10];
                    i9 = i10;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(o50.z0());
                if (this.f36649f) {
                    this.f36648e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f15 = (int) f13;
        rectF2.inset(f15, f15);
        float f16 = rectF2.left;
        float f17 = rectF2.top;
        rectF2.set(f16, f17, rectF2.right, f17 + dp);
        s10 s10Var = this.h;
        s10Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f15, f15);
        float f18 = rectF2.left;
        float f19 = rectF2.bottom;
        rectF2.set(f18, f19 - dp, rectF2.right, f19);
        s10Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d != null && this.f36654l != null) {
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new w3(this, 6));
            if (stickerSet != null) {
                String replace = this.f36654l.replace("️", "");
                ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    document = null;
                    if (i9 >= size) {
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i9);
                    i9++;
                    TLRPC.Document document3 = document2;
                    if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document3, null).replace("️", ""), replace)) {
                        document = document3;
                        break;
                    }
                }
                if (document != null) {
                    org.telegram.ui.Components.k5 k5Var = this.d;
                    k5Var.f29946e = document;
                    k5Var.j(false);
                    return;
                }
                FileLog.e("emoji \"" + this.f36654l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }
}

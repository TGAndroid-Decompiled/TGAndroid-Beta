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

public final class e50 {

    public final int f37624a;

    public Emoji.EmojiDrawable f37626c;
    public org.telegram.ui.Components.k5 d;

    public boolean f37627e;

    public boolean f37628f;

    public long f37629g;

    public String f37633l;

    public final Drawable[] f37625b = new Drawable[6];
    public final v10 h = new v10();

    public final HashSet f37630i = new HashSet();

    public boolean f37631j = false;

    public final d50 f37632k = new d50(this, 0);

    public final RectF f37634m = new RectF();

    public e50(int i10) {
        int i11 = 0;
        this.f37624a = i10;
        while (true) {
            Drawable[] drawableArr = this.f37625b;
            if (i11 >= drawableArr.length) {
                this.f37629g = System.currentTimeMillis();
                return;
            } else {
                drawableArr[i11] = Emoji.getEmojiDrawable(s50.A0());
                i11++;
            }
        }
    }

    public final void a() {
        boolean zIsEmpty = this.f37630i.isEmpty();
        boolean z10 = !zIsEmpty;
        if (this.f37631j != z10) {
            this.f37631j = z10;
            d50 d50Var = this.f37632k;
            if (zIsEmpty) {
                org.telegram.ui.Components.k5 k5Var = this.d;
                if (k5Var != null) {
                    k5Var.p(d50Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.k5 k5Var2 = this.d;
            if (k5Var2 != null) {
                k5Var2.b(d50Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float fDp = AndroidUtilities.dp(6.0f);
        RectF rectF2 = this.f37634m;
        rectF2.set(rectF);
        float f13 = -fDp;
        rectF2.inset(f13, f13);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
        long jCurrentTimeMillis = (((long) this.f37624a) * 45) + System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f37629g;
        float f14 = j10 / 180.0f;
        float fMin = Math.min(1.0f, f14);
        boolean z10 = this.f37628f;
        Drawable[] drawableArr = this.f37625b;
        boolean z11 = false;
        if (!z10 || this.d == null || this.f37626c == null || !this.f37627e) {
            j10 = j10;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + fDp) * (fMin - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(127);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(255);
            canvas.restore();
        } else {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (fMin - 1.0f) * (rectF.height() + fDp));
            if (f10 < 1.0f) {
                canvas.save();
                f11 = 255.0f;
                f12 = 0.0f;
                this.f37626c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.f37626c.setAlpha((int) ((1.0f - f10) * 255.0f));
                this.f37626c.draw(canvas);
                this.f37626c.setAlpha(255);
                canvas.restore();
            } else {
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
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + fDp) * fMin);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(127);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(255);
        canvas.restore();
        if (f14 >= 1.0f) {
            if (this.f37628f && this.f37627e) {
                z11 = true;
            } else {
                this.f37629g = jCurrentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(s50.A0());
                if (this.f37628f) {
                    this.f37627e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f15 = (int) f13;
        rectF2.inset(f15, f15);
        float f16 = rectF2.left;
        float f17 = rectF2.top;
        rectF2.set(f16, f17, rectF2.right, f17 + fDp);
        v10 v10Var = this.h;
        v10Var.b(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f15, f15);
        float f18 = rectF2.left;
        float f19 = rectF2.bottom;
        rectF2.set(f18, f19 - fDp, rectF2.right, f19);
        v10Var.b(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d == null || this.f37633l == null) {
            return;
        }
        int productionAccount = UserConfig.getProductionAccount();
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new x3(this, 6));
        if (stickerSet == null) {
            return;
        }
        String strReplace = this.f37633l.replace("️", "");
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
            if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document3, null).replace("️", ""), strReplace)) {
                document = document3;
                break;
            }
        }
        if (document != null) {
            org.telegram.ui.Components.k5 k5Var = this.d;
            k5Var.f29956e = document;
            k5Var.j(false);
        } else {
            FileLog.e("emoji \"" + this.f37633l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
        }
    }
}

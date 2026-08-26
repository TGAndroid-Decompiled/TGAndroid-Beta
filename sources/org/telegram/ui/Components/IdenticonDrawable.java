package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public class IdenticonDrawable extends Drawable {
    private byte[] data;
    private Paint paint = new Paint();
    private int[] colors = {-1, -2758925, -13805707, -13657655};

    private int getBits(int i) {
        return (this.data[i / 8] >> (i % 8)) & 3;
    }

    @Override
    public void draw(Canvas canvas) {
        byte[] bArr = this.data;
        if (bArr == null) {
            return;
        }
        if (bArr.length != 16) {
            float fFloor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f = 12.0f * fFloor;
            float fMax = Math.max(0.0f, (getBounds().width() - f) / 2.0f);
            float fMax2 = Math.max(0.0f, (getBounds().height() - f) / 2.0f);
            int i = 0;
            for (int i2 = 0; i2 < 12; i2++) {
                for (int i3 = 0; i3 < 12; i3++) {
                    this.paint.setColor(this.colors[Math.abs(getBits(i)) % 4]);
                    float f2 = (i3 * fFloor) + fMax;
                    float f3 = i2 * fFloor;
                    canvas.drawRect(f2, f3 + fMax2, f2 + fFloor, f3 + fFloor + fMax2, this.paint);
                    i += 2;
                }
            }
            return;
        }
        float fFloor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
        float f4 = 8.0f * fFloor2;
        float fMax3 = Math.max(0.0f, (getBounds().width() - f4) / 2.0f);
        float fMax4 = Math.max(0.0f, (getBounds().height() - f4) / 2.0f);
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            for (int i6 = 0; i6 < 8; i6++) {
                int bits = getBits(i4);
                i4 += 2;
                this.paint.setColor(this.colors[Math.abs(bits) % 4]);
                float f5 = (i6 * fFloor2) + fMax3;
                float f6 = i5 * fFloor2;
                canvas.drawRect(f5, f6 + fMax4, f5 + fFloor2, f6 + fFloor2 + fMax4, this.paint);
            }
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setColors(int[] iArr) {
        if (this.colors.length != 4) {
            throw new IllegalArgumentException("colors must have length of 4");
        }
        this.colors = iArr;
        invalidateSelf();
    }

    public void setEncryptedChat(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = encryptedChat.key_hash;
        this.data = bArr;
        if (bArr == null) {
            byte[] bArrCalcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
            this.data = bArrCalcAuthKeyHash;
            encryptedChat.key_hash = bArrCalcAuthKeyHash;
        }
        invalidateSelf();
    }
}

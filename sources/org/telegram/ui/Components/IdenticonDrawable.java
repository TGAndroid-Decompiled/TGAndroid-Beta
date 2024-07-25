package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC$EncryptedChat;
public class IdenticonDrawable extends Drawable {
    private byte[] data;
    private Paint paint = new Paint();
    private int[] colors = {-1, -2758925, -13805707, -13657655};

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

    private int getBits(int i) {
        return (this.data[i / 8] >> (i % 8)) & 3;
    }

    public void setEncryptedChat(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        byte[] bArr = tLRPC$EncryptedChat.key_hash;
        this.data = bArr;
        if (bArr == null) {
            byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(tLRPC$EncryptedChat.auth_key);
            this.data = calcAuthKeyHash;
            tLRPC$EncryptedChat.key_hash = calcAuthKeyHash;
        }
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        byte[] bArr = this.data;
        if (bArr == null) {
            return;
        }
        if (bArr.length == 16) {
            float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
            float f = 8.0f * floor;
            float max = Math.max(0.0f, (getBounds().width() - f) / 2.0f);
            float max2 = Math.max(0.0f, (getBounds().height() - f) / 2.0f);
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                for (int i3 = 0; i3 < 8; i3++) {
                    int bits = getBits(i);
                    i += 2;
                    this.paint.setColor(this.colors[Math.abs(bits) % 4]);
                    float f2 = max + (i3 * floor);
                    float f3 = i2 * floor;
                    canvas.drawRect(f2, f3 + max2, f2 + floor, f3 + floor + max2, this.paint);
                }
            }
            return;
        }
        float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
        float f4 = 12.0f * floor2;
        float max3 = Math.max(0.0f, (getBounds().width() - f4) / 2.0f);
        float max4 = Math.max(0.0f, (getBounds().height() - f4) / 2.0f);
        int i4 = 0;
        for (int i5 = 0; i5 < 12; i5++) {
            for (int i6 = 0; i6 < 12; i6++) {
                this.paint.setColor(this.colors[Math.abs(getBits(i4)) % 4]);
                float f5 = max3 + (i6 * floor2);
                float f6 = i5 * floor2;
                canvas.drawRect(f5, f6 + max4, f5 + floor2, f6 + floor2 + max4, this.paint);
                i4 += 2;
            }
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yl implements Runnable {
    public final int f19118a = 0;
    public final String f19119b;
    public final Object f19120c;
    public final Object d;

    public yl(String str, String str2, byte[] bArr) {
        this.f19119b = str;
        this.f19120c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                WearAuthListenerService.a(this.f19119b, (String) this.f19120c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19120c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19119b);
                return;
        }
    }

    public yl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19120c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19119b = str;
    }
}

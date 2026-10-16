package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f18909a = 0;
    public final String f18910b;
    public final Object f18911c;
    public final Object d;

    public zl(String str, String str2, byte[] bArr) {
        this.f18910b = str;
        this.f18911c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f18909a) {
            case 0:
                WearAuthListenerService.a(this.f18910b, (String) this.f18911c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f18911c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f18910b);
                return;
        }
    }

    public zl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f18911c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f18910b = str;
    }
}

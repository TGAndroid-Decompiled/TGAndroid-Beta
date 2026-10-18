package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f20216a;
    public final MediaDataController f20217b;
    public final String f20218c;

    public z6(MediaDataController mediaDataController, String str, int i10) {
        this.f20216a = i10;
        this.f20217b = mediaDataController;
        this.f20218c = str;
    }

    @Override
    public final void run() {
        switch (this.f20216a) {
            case 0:
                this.f20217b.lambda$fetchNewEmojiKeywords$208(this.f20218c);
                return;
            case 1:
                this.f20217b.lambda$fetchNewEmojiKeywords$210(this.f20218c);
                return;
            case 2:
                this.f20217b.lambda$fetchNewEmojiKeywords$212(this.f20218c);
                return;
            case 3:
                this.f20217b.lambda$fetchNewEmojiKeywords$209(this.f20218c);
                return;
            case 4:
                this.f20217b.lambda$fetchNewEmojiKeywords$214(this.f20218c);
                return;
            case 5:
                this.f20217b.lambda$putEmojiKeywords$215(this.f20218c);
                return;
            default:
                this.f20217b.lambda$processLoadedDiceStickers$86(this.f20218c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f20209a;
    public final MediaDataController f20210b;
    public final String f20211c;

    public z6(MediaDataController mediaDataController, String str, int i10) {
        this.f20209a = i10;
        this.f20210b = mediaDataController;
        this.f20211c = str;
    }

    @Override
    public final void run() {
        switch (this.f20209a) {
            case 0:
                this.f20210b.lambda$fetchNewEmojiKeywords$208(this.f20211c);
                return;
            case 1:
                this.f20210b.lambda$fetchNewEmojiKeywords$210(this.f20211c);
                return;
            case 2:
                this.f20210b.lambda$fetchNewEmojiKeywords$212(this.f20211c);
                return;
            case 3:
                this.f20210b.lambda$fetchNewEmojiKeywords$209(this.f20211c);
                return;
            case 4:
                this.f20210b.lambda$fetchNewEmojiKeywords$214(this.f20211c);
                return;
            case 5:
                this.f20210b.lambda$putEmojiKeywords$215(this.f20211c);
                return;
            default:
                this.f20210b.lambda$processLoadedDiceStickers$86(this.f20211c);
                return;
        }
    }
}

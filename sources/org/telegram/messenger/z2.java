package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f20199a;
    public final FileLoader f20200b;
    public final String f20201c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f20199a = i10;
        this.f20200b = fileLoader;
        this.f20201c = str;
    }

    @Override
    public final void run() {
        switch (this.f20199a) {
            case 0:
                this.f20200b.lambda$cancelLoadFile$7(this.f20201c);
                return;
            case 1:
                this.f20200b.lambda$cancel$9(this.f20201c);
                return;
            default:
                this.f20200b.lambda$cancelLoadAllFiles$12(this.f20201c);
                return;
        }
    }
}

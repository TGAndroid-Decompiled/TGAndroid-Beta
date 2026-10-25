package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f21954a;
    public final FileLoader f21955b;

    public z2(FileLoader fileLoader, int i10) {
        this.f21954a = i10;
        this.f21955b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f21954a) {
            case 0:
                this.f21955b.lambda$new$20();
                return;
            case 1:
                this.f21955b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f21955b.lambda$cancel$10();
                return;
        }
    }
}

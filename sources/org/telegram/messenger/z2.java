package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f20188a;
    public final FileLoader f20189b;
    public final String f20190c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f20188a = i10;
        this.f20189b = fileLoader;
        this.f20190c = str;
    }

    @Override
    public final void run() {
        switch (this.f20188a) {
            case 0:
                this.f20189b.lambda$cancelLoadFile$7(this.f20190c);
                return;
            case 1:
                this.f20189b.lambda$cancel$9(this.f20190c);
                return;
            default:
                this.f20189b.lambda$cancelLoadAllFiles$12(this.f20190c);
                return;
        }
    }
}

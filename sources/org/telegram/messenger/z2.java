package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f20205a;
    public final FileLoader f20206b;
    public final String f20207c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f20205a = i10;
        this.f20206b = fileLoader;
        this.f20207c = str;
    }

    @Override
    public final void run() {
        switch (this.f20205a) {
            case 0:
                this.f20206b.lambda$cancelLoadFile$7(this.f20207c);
                return;
            case 1:
                this.f20206b.lambda$cancel$9(this.f20207c);
                return;
            default:
                this.f20206b.lambda$cancelLoadAllFiles$12(this.f20207c);
                return;
        }
    }
}

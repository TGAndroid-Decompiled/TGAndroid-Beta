package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f20191a;
    public final FileLoader f20192b;
    public final String f20193c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f20191a = i10;
        this.f20192b = fileLoader;
        this.f20193c = str;
    }

    @Override
    public final void run() {
        switch (this.f20191a) {
            case 0:
                this.f20192b.lambda$cancelLoadFile$7(this.f20193c);
                return;
            case 1:
                this.f20192b.lambda$cancel$9(this.f20193c);
                return;
            default:
                this.f20192b.lambda$cancelLoadAllFiles$12(this.f20193c);
                return;
        }
    }
}

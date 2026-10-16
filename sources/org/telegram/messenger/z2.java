package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f18830a;
    public final FileLoader f18831b;
    public final String f18832c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f18830a = i10;
        this.f18831b = fileLoader;
        this.f18832c = str;
    }

    @Override
    public final void run() {
        switch (this.f18830a) {
            case 0:
                this.f18831b.lambda$cancelLoadFile$7(this.f18832c);
                return;
            case 1:
                this.f18831b.lambda$cancel$9(this.f18832c);
                return;
            default:
                this.f18831b.lambda$cancelLoadAllFiles$12(this.f18832c);
                return;
        }
    }
}

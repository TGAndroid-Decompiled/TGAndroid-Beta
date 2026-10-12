package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f19128a;
    public final FileLoader f19129b;
    public final String f19130c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f19128a = i10;
        this.f19129b = fileLoader;
        this.f19130c = str;
    }

    @Override
    public final void run() {
        switch (this.f19128a) {
            case 0:
                this.f19129b.lambda$cancelLoadFile$7(this.f19130c);
                return;
            case 1:
                this.f19129b.lambda$cancel$9(this.f19130c);
                return;
            default:
                this.f19129b.lambda$cancelLoadAllFiles$12(this.f19130c);
                return;
        }
    }
}

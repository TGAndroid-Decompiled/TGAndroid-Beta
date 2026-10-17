package org.telegram.messenger;
public final class z2 implements Runnable {
    public final int f20198a;
    public final FileLoader f20199b;
    public final String f20200c;

    public z2(FileLoader fileLoader, String str, int i10) {
        this.f20198a = i10;
        this.f20199b = fileLoader;
        this.f20200c = str;
    }

    @Override
    public final void run() {
        switch (this.f20198a) {
            case 0:
                this.f20199b.lambda$cancelLoadFile$7(this.f20200c);
                return;
            case 1:
                this.f20199b.lambda$cancel$9(this.f20200c);
                return;
            default:
                this.f20199b.lambda$cancelLoadAllFiles$12(this.f20200c);
                return;
        }
    }
}

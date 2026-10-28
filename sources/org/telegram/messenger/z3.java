package org.telegram.messenger;
public final class z3 implements Runnable {
    public final int f21956a;
    public final FileUploadOperation f21957b;

    public z3(FileUploadOperation fileUploadOperation, int i10) {
        this.f21956a = i10;
        this.f21957b = fileUploadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21956a) {
            case 0:
                this.f21957b.lambda$start$0();
                return;
            case 1:
                this.f21957b.lambda$cancel$3();
                return;
            case 2:
                this.f21957b.lambda$startUploadRequest$7();
                return;
            default:
                this.f21957b.lambda$onNetworkChanged$2();
                return;
        }
    }
}

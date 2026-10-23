package org.telegram.messenger;
public final class z3 implements Runnable {
    public final int f20277a;
    public final FileUploadOperation f20278b;
    public final int[] f20279c;

    public z3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20277a = i10;
        this.f20278b = fileUploadOperation;
        this.f20279c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20277a) {
            case 0:
                this.f20278b.lambda$startUploadRequest$9(this.f20279c);
                return;
            default:
                this.f20278b.lambda$startUploadRequest$5(this.f20279c);
                return;
        }
    }
}

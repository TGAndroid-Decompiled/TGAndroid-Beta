package org.telegram.messenger;
public final class z3 implements Runnable {
    public final int f20263a;
    public final FileUploadOperation f20264b;
    public final int[] f20265c;

    public z3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20263a = i10;
        this.f20264b = fileUploadOperation;
        this.f20265c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20263a) {
            case 0:
                this.f20264b.lambda$startUploadRequest$9(this.f20265c);
                return;
            default:
                this.f20264b.lambda$startUploadRequest$5(this.f20265c);
                return;
        }
    }
}

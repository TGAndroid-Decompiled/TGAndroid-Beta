package org.telegram.messenger;
public final class z3 implements Runnable {
    public final int f20213a;
    public final FileUploadOperation f20214b;
    public final int[] f20215c;

    public z3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f20213a = i10;
        this.f20214b = fileUploadOperation;
        this.f20215c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20213a) {
            case 0:
                this.f20214b.lambda$startUploadRequest$9(this.f20215c);
                return;
            default:
                this.f20214b.lambda$startUploadRequest$5(this.f20215c);
                return;
        }
    }
}

package org.telegram.ui.Components;

public final class BackgroundGradientDrawable$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId = 1;
    public final BackgroundGradientDrawable f$0;
    public final Runnable[] f$1;
    public final IntSize f$3;
    public final int f$4;
    public final BackgroundGradientDrawable.Listener[] f$5;

    public BackgroundGradientDrawable$$ExternalSyntheticLambda2(BackgroundGradientDrawable backgroundGradientDrawable, IntSize intSize, Runnable[] runnableArr, int i, BackgroundGradientDrawable.Listener[] listenerArr) {
        this.f$0 = backgroundGradientDrawable;
        this.f$3 = intSize;
        this.f$1 = runnableArr;
        this.f$4 = i;
        this.f$5 = listenerArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startDitheringInternal$1(this.f$1, null, this.f$3, this.f$4, this.f$5);
                break;
            default:
                this.f$0.lambda$startDitheringInternal$2(this.f$3, this.f$1, this.f$4, this.f$5);
                break;
        }
    }

    public BackgroundGradientDrawable$$ExternalSyntheticLambda2(BackgroundGradientDrawable backgroundGradientDrawable, Runnable[] runnableArr, IntSize intSize, int i, BackgroundGradientDrawable.Listener[] listenerArr) {
        this.f$0 = backgroundGradientDrawable;
        this.f$1 = runnableArr;
        this.f$3 = intSize;
        this.f$4 = i;
        this.f$5 = listenerArr;
    }
}

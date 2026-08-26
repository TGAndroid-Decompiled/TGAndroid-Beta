package org.telegram.ui;

public final class DialogsActivity$ContentView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity.ContentView f$0;

    public DialogsActivity$ContentView$$ExternalSyntheticLambda0(DialogsActivity.ContentView contentView, int i) {
        this.$r8$classId = i;
        this.f$0 = contentView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onTouchEvent$1();
                break;
            default:
                this.f$0.lambda$onMeasure$0();
                break;
        }
    }
}

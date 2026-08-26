package org.telegram.ui;

public final class TodoItemMenu$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final TodoItemMenu f$0;

    public TodoItemMenu$$ExternalSyntheticLambda0(TodoItemMenu todoItemMenu, int i) {
        this.$r8$classId = i;
        this.f$0 = todoItemMenu;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss(false);
                break;
            case 1:
                this.f$0.lambda$dismiss$14();
                break;
            default:
                this.f$0.dismiss(false);
                break;
        }
    }
}

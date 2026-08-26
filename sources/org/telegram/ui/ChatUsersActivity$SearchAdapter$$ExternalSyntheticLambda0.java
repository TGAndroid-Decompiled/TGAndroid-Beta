package org.telegram.ui;

public final class ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatUsersActivity.SearchAdapter f$0;
    public final String f$1;

    public ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0(ChatUsersActivity.SearchAdapter searchAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = searchAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchUsers$1(this.f$1);
                break;
            default:
                this.f$0.lambda$processSearch$3(this.f$1);
                break;
        }
    }
}

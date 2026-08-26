package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class ChatActivityEnterView$$ExternalSyntheticLambda108 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ChatActivityEnterView$$ExternalSyntheticLambda108(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivityEnterView) this.f$0).lambda$createGiftButton$18(this.f$1, dialogInterface);
                break;
            default:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1) this.f$0).lambda$onClick$2(this.f$1, dialogInterface);
                break;
        }
    }
}

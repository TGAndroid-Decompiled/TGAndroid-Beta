package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;

public final class ChatAttachAlert$$ExternalSyntheticLambda3 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda3(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        CharSequence charSequence = (CharSequence) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        Boolean bool = (Boolean) obj4;
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlert) this.f$0).lambda$new$20(charSequence, num, num2, bool);
                break;
            case 1:
                ((ChatAttachAlert) this.f$0).lambda$new$24(charSequence, num, num2, bool);
                break;
            default:
                ((CaptionPhotoViewer) this.f$0).lambda$new$1(charSequence, num, num2, bool);
                break;
        }
    }
}

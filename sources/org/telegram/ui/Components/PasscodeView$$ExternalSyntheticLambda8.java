package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class PasscodeView$$ExternalSyntheticLambda8 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public PasscodeView$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((PasscodeView) this.f$0).lambda$onAttachedToWindow$13((Integer) obj);
                break;
            case 1:
                ((ChatAttachAlertPhotoLayout.PhotoAttachAdapter) this.f$0).lambda$onCreateViewHolder$3((Long) obj);
                break;
            case 2:
                ((EmojiView$$ExternalSyntheticLambda9) this.f$0).run();
                break;
            case 3:
                ((CaptionPhotoViewer) this.f$0).lambda$new$0((CharSequence) obj);
                break;
            case 4:
                ((DialogsBotsAdapter) this.f$0).openBot((TLRPC.User) obj);
                break;
            case 5:
                ((EditTextCaption) this.f$0).performMenuAction(((Integer) obj).intValue());
                break;
            case 6:
                EmojiPacksAlert.lambda$installSet$5((Runnable) this.f$0, (ArrayList) obj);
                break;
            case 7:
                ((MediaActivity) this.f$0).lambda$createView$6((Integer) obj);
                break;
            case 8:
                ((MessagePreviewView) this.f$0).lambda$new$0((Integer) obj);
                break;
            case 9:
                ((PhonebookShareAlert) this.f$0).lambda$new$5((Long) obj);
                break;
            case 10:
                ScrimOptions.lambda$makeGlobalBlurBitmaps$7((Utilities.Callback2) this.f$0, (Bitmap) obj);
                break;
            default:
                ((SuggestBirthdayActionLayout) this.f$0).lambda$open$2((TL_account.TL_birthday) obj);
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;

public final class StickersAlert$$ExternalSyntheticLambda48 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;

    public StickersAlert$$ExternalSyntheticLambda48(BaseFragment baseFragment, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document, ChatActivity chatActivity, boolean z) {
        this.f$0 = baseFragment;
        this.f$1 = tL_messages_stickerSet;
        this.f$2 = document;
        this.f$3 = chatActivity;
        this.f$4 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StickersAlert.lambda$editSticker$1((BaseFragment) this.f$0, (TLRPC.TL_messages_stickerSet) this.f$1, (TLRPC.Document) this.f$2, (ChatActivity) this.f$3, this.f$4);
                break;
            case 1:
                ((BlurringShader.ThumbBlurer) this.f$0).lambda$getBitmap$0((String) this.f$1, (Bitmap) this.f$2, this.f$4, (Bitmap) this.f$3);
                break;
            default:
                String str = (String) this.f$2;
                TextView textView = (TextView) this.f$3;
                ((EditTextCaption) this.f$0).lambda$showInputDialog$4(this.f$4, (EditTextBoldCursor) this.f$1, str, textView);
                break;
        }
    }

    public StickersAlert$$ExternalSyntheticLambda48(BlurringShader.ThumbBlurer thumbBlurer, String str, Bitmap bitmap, boolean z, Bitmap bitmap2) {
        this.f$0 = thumbBlurer;
        this.f$1 = str;
        this.f$2 = bitmap;
        this.f$4 = z;
        this.f$3 = bitmap2;
    }

    public StickersAlert$$ExternalSyntheticLambda48(EditTextCaption editTextCaption, boolean z, EditTextBoldCursor editTextBoldCursor, String str, TextView textView) {
        this.f$0 = editTextCaption;
        this.f$4 = z;
        this.f$1 = editTextBoldCursor;
        this.f$2 = str;
        this.f$3 = textView;
    }
}

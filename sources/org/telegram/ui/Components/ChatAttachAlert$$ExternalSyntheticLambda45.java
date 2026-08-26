package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.CaptionContainerView$$ExternalSyntheticLambda0;

public final class ChatAttachAlert$$ExternalSyntheticLambda45 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda45(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        CharSequence charSequence = (CharSequence) obj;
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                ChatAttachAlert.AnonymousClass19 anonymousClass19 = chatAttachAlert.commentTextView;
                anonymousClass19.setText(charSequence);
                anonymousClass19.editText.setSelection(charSequence.length(), charSequence.length());
                chatAttachAlert.onWriteButtonPressed();
                break;
            case 1:
                ChatAttachAlert chatAttachAlert2 = (ChatAttachAlert) this.f$0;
                ChatAttachAlert.AnonymousClass21 anonymousClass21 = chatAttachAlert2.topCommentTextView;
                anonymousClass21.setText(charSequence);
                anonymousClass21.editText.setSelection(charSequence.length(), charSequence.length());
                chatAttachAlert2.onWriteButtonPressed();
                break;
            default:
                CaptionPhotoViewer captionPhotoViewer = (CaptionPhotoViewer) this.f$0;
                CaptionContainerView.AnonymousClass3 anonymousClass3 = captionPhotoViewer.editText;
                anonymousClass3.setText(charSequence);
                AndroidUtilities.hideKeyboard(anonymousClass3.editText);
                anonymousClass3.hidePopup(true);
                CaptionContainerView$$ExternalSyntheticLambda0 captionContainerView$$ExternalSyntheticLambda0 = captionPhotoViewer.textChangeRunnable;
                AndroidUtilities.cancelRunOnUIThread(captionContainerView$$ExternalSyntheticLambda0);
                captionContainerView$$ExternalSyntheticLambda0.run();
                break;
        }
    }
}

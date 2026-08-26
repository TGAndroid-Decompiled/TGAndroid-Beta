package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

public final class SearchTagsList$$ExternalSyntheticLambda5 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public SearchTagsList$$ExternalSyntheticLambda5(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                SearchTagsList.lambda$openRenameTagAlert$7((View) this.f$0, dialogInterface);
                break;
            case 1:
                ((ThemeEditorView.AnonymousClass1) this.f$0).lambda$onTouchEvent$1(dialogInterface);
                break;
            case 2:
                ((ChatActivityEnterView) this.f$0).lambda$onSendLongClick$43(dialogInterface);
                break;
            case 3:
                ((ChatAttachAlert) this.f$0).lambda$dismiss$71(dialogInterface);
                break;
            case 4:
                ((EditTextCaption) this.f$0).lambda$showInputDialog$7(dialogInterface);
                break;
            case 5:
                ((FragmentContextView) this.f$0).lambda$checkCreateView$7(dialogInterface);
                break;
            default:
                ((StickersAlert) this.f$0).lambda$init$10(dialogInterface);
                break;
        }
    }
}

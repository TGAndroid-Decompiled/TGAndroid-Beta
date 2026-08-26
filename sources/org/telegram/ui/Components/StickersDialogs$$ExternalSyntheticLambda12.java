package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ChatActivity;

public final class StickersDialogs$$ExternalSyntheticLambda12 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StickersDialogs$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                StickersDialogs.lambda$showNameEditorDialog$1((AlertDialog) this.f$0, (AlertDialog) this.f$1, (EditTextBoldCursor) this.f$2, (Boolean) obj);
                break;
            case 1:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0).lambda$run$1((ArrayList) this.f$1, (Runnable) this.f$2, (ArrayList) obj);
                break;
            case 2:
                ((AudioPlayerAlert) this.f$1).lambda$onSubItemClick$18((AlertDialog) this.f$0, (TLRPC.Document) this.f$2, (TLRPC.InputFile) obj);
                break;
            default:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$onTodoDoneButtonClick$6((ChatActivity) this.f$1, (TLRPC.TL_messageMediaToDo) this.f$2, (Long) obj);
                break;
        }
    }

    public StickersDialogs$$ExternalSyntheticLambda12(AudioPlayerAlert audioPlayerAlert, AlertDialog alertDialog, TLRPC.Document document) {
        this.$r8$classId = 2;
        this.f$1 = audioPlayerAlert;
        this.f$0 = alertDialog;
        this.f$2 = document;
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class JoinGroupAlert$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$3;

    public JoinGroupAlert$$ExternalSyntheticLambda3(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((JoinGroupAlert) this.f$0).lambda$new$6((TLRPC.TL_error) this.f$1, this.f$2, (TLRPC.TL_messages_importChatInvite) this.f$3);
                break;
            case 1:
                ((StickersAlert.AnonymousClass1) this.f$0).lambda$deleteSticker$0((TLObject) this.f$1, this.f$2, (AlertDialog) this.f$3);
                break;
            case 2:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$70(this.f$2, (TLRPC.Chat) this.f$0, (AlertDialog.Builder) this.f$1, (boolean[]) this.f$3);
                break;
            case 3:
                ((ChatAttachAlertDocumentLayout.SearchAdapter) this.f$0).lambda$search$0((String) this.f$1, this.f$2, (ArrayList) this.f$3);
                break;
            default:
                ((PermanentLinkBottomSheet) this.f$0).lambda$generateLink$3((TLRPC.TL_error) this.f$1, (TLObject) this.f$3, this.f$2);
                break;
        }
    }

    public JoinGroupAlert$$ExternalSyntheticLambda3(TLObject tLObject, TLRPC.TL_error tL_error, PermanentLinkBottomSheet permanentLinkBottomSheet, boolean z) {
        this.$r8$classId = 4;
        this.f$0 = permanentLinkBottomSheet;
        this.f$1 = tL_error;
        this.f$3 = tLObject;
        this.f$2 = z;
    }

    public JoinGroupAlert$$ExternalSyntheticLambda3(boolean z, TLRPC.Chat chat, AlertDialog.Builder builder, boolean[] zArr) {
        this.$r8$classId = 2;
        this.f$2 = z;
        this.f$0 = chat;
        this.f$1 = builder;
        this.f$3 = zArr;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SearchTagsList$$ExternalSyntheticLambda3 implements MediaDataController.KeywordResultCallback, AlertDialog.OnButtonClickListener, Utilities.Callback3Return {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public SearchTagsList$$ExternalSyntheticLambda3(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.$r8$classId = 3;
        this.f$1 = i;
        this.f$0 = context;
        this.f$2 = tL_messages_stickerSet;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                SearchTagsList.lambda$openRenameTagAlert$5((EditTextBoldCursor) this.f$0, this.f$1, (TLRPC.Reaction) this.f$2, alertDialog, i);
                break;
            default:
                AlertsCreator.lambda$createSimpleTextInputAlert$14((EditTextBoldCursor) this.f$0, this.f$1, (MessagesStorage.StringCallback) this.f$2, alertDialog, i);
                break;
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f$0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f$2;
        return StickersDialogs.lambda$openStickerPickerDialog$11(this.f$1, context, tL_messages_stickerSet, obj, (TLRPC.Document) obj2, (Boolean) obj3);
    }

    public SearchTagsList$$ExternalSyntheticLambda3(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((StickerMasksAlert.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$run$0(this.f$1, (HashMap) this.f$2, arrayList, str);
    }
}

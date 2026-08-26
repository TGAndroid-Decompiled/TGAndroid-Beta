package org.telegram.ui.Components;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StickersAlert$$ExternalSyntheticLambda28 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StickersAlert$$ExternalSyntheticLambda28(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((StickersAlert) this.f$0).lambda$checkUrlAvailable$46((String) this.f$1, (TextView) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1) this.f$0).lambda$onClick$1((AlertDialog[]) this.f$1, (BottomSheet.Builder) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$searchStickers$4((TLRPC.TL_messages_getStickers) this.f$1, (Runnable) this.f$2, tLObject, tL_error);
                break;
            case 3:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$7((BaseFragment) this.f$1, (ArrayList) this.f$2, tLObject, tL_error);
                break;
            case 4:
                MessagePrivateSeenView.lambda$showSheet$4((ButtonWithCounterView) this.f$0, (BottomSheet) this.f$1, (Runnable) this.f$2, tLObject, tL_error);
                break;
            default:
                ((SuggestBirthdayActionLayout) this.f$0).lambda$open$1((TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tLObject, tL_error);
                break;
        }
    }
}

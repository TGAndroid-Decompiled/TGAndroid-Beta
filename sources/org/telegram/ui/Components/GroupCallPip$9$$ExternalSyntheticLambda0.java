package org.telegram.ui.Components;

import android.util.LongSparseArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class GroupCallPip$9$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public GroupCallPip$9$$ExternalSyntheticLambda0(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.$r8$classId = 0;
        this.f$0 = view;
        this.f$1 = view2;
        this.f$2 = windowManager;
        this.f$3 = view3;
        this.f$4 = view4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GroupCallPip.AnonymousClass9.lambda$onAnimationEnd$0((View) this.f$0, (View) this.f$1, (WindowManager) this.f$2, (View) this.f$3, (View) this.f$4);
                break;
            case 1:
                ((StickerMasksAlert.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$run$1((TLRPC.TL_messages_getStickers) this.f$1, (TLObject) this.f$3, (ArrayList) this.f$4, (LongSparseArray) this.f$2);
                break;
            case 2:
                ((StickersAlert) this.f$0).lambda$checkUrlAvailable$45((String) this.f$1, (TLRPC.TL_error) this.f$3, (TLObject) this.f$4, (TextView) this.f$2);
                break;
            case 3:
                ((SuggestBirthdayActionLayout) this.f$0).lambda$open$0((TLObject) this.f$1, (TLRPC.UserFull) this.f$3, (TL_account.TL_birthday) this.f$4, (TLRPC.TL_error) this.f$2);
                break;
            default:
                ((TopicsTabsView) this.f$0).lambda$onTabLongClick$14((MessagesController) this.f$1, (TLRPC.TL_forumTopic) this.f$3, (ItemOptions) this.f$4, (ItemOptions) this.f$2);
                break;
        }
    }

    public GroupCallPip$9$$ExternalSyntheticLambda0(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = tLObject;
        this.f$4 = obj3;
        this.f$2 = obj4;
    }
}

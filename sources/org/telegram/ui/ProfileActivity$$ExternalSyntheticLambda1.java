package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ProfileActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;

    public ProfileActivity$$ExternalSyntheticLambda1(int i, Context context, BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        this.$r8$classId = 3;
        this.f$0 = buttonWithCounterView;
        this.f$1 = context;
        this.f$3 = i;
        this.f$2 = bottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$84((AtomicReference) this.f$1, (String) this.f$2, this.f$3, view);
                break;
            case 1:
                ((ChannelAdminLogActivity) this.f$0).lambda$createMenu$13(this.f$3, (ArrayList) this.f$1, (Integer) this.f$2, view);
                break;
            case 2:
                ((GroupCallActivity) this.f$0).lambda$showMenuForCell$75(this.f$3, (ArrayList) this.f$1, (TLRPC.GroupCallParticipant) this.f$2, view);
                break;
            case 3:
                PasskeysActivity.lambda$showLearnSheet$9((ButtonWithCounterView) this.f$0, (Context) this.f$1, this.f$3, (BottomSheet) this.f$2, view);
                break;
            default:
                ((TopicsFragment) this.f$0).lambda$showChatPreview$17((TLRPC.TL_forumTopic) this.f$1, (ActionBarPopupWindow.ActionBarPopupWindowLayout[]) this.f$2, this.f$3, view);
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i, ArrayList arrayList, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationCenterDelegate;
        this.f$3 = i;
        this.f$1 = arrayList;
        this.f$2 = obj;
    }

    public ProfileActivity$$ExternalSyntheticLambda1(BaseFragment baseFragment, Object obj, Serializable serializable, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseFragment;
        this.f$1 = obj;
        this.f$2 = serializable;
        this.f$3 = i;
    }
}

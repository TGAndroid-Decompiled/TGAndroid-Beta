package org.telegram.ui;

import android.view.View;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda353 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda353(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ReactedUsersListView) this.f$0).setSeenUsers((List) obj);
                break;
            case 1:
                ((ChatUsersActivity.AnonymousClass8) this.f$0).lambda$didSelectUsers$0((TLRPC.User) obj);
                break;
            case 2:
                ((ArticleViewer.PageLayout) this.f$0).lambda$new$1((Float) obj);
                break;
            case 3:
                LoginActivity.LoginPayView.lambda$setParams$15((Utilities.Callback) this.f$0, (BillingResult) obj);
                break;
            case 4:
                PremiumPreviewFragment.lambda$buyPremium$12((PollItemMenu$$ExternalSyntheticLambda0) this.f$0, (BillingResult) obj);
                break;
            case 5:
                ((ArrayList) this.f$0).add((TLRPC.User) obj);
                break;
            case 6:
                ((ProfileActivity) this.f$0).lambda$openAddMember$91((TLRPC.User) obj);
                break;
            default:
                ((ProxyListActivity) this.f$0).lambda$didReceivedNotification$7((View) obj);
                break;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.RecyclerListView;

public final class BoostsActivity$$ExternalSyntheticLambda5 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BoostsActivity$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((BoostsActivity) this.f$0).lambda$createView$12((Context) this.f$1, view, i);
                break;
            case 1:
                ((ChannelColorActivity.Adapter) this.f$0).lambda$onCreateViewHolder$1((ChannelColorActivity.PeerColorPicker) this.f$1, view, i);
                break;
            case 2:
                ((ChannelColorActivity) this.f$0).lambda$createView$4((TLRPC.ChatFull) this.f$1, view, i);
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$createMenu$265((MessageSeenView) this.f$1, view, i);
                break;
            case 4:
                ((ChatRightsEditActivity) this.f$0).lambda$createView$8((Context) this.f$1, view, i);
                break;
            case 5:
                ((DataUsageActivity) this.f$0).lambda$createView$2((RecyclerListView) this.f$1, view, i);
                break;
            case 6:
                ((DefaultThemesPreviewCell) this.f$0).lambda$new$0((BaseFragment) this.f$1, view, i);
                break;
            case 7:
                ((EditWidgetActivity) this.f$0).lambda$createView$1((Context) this.f$1, view, i);
                break;
            case 8:
                ((GroupCreateActivity) this.f$0).lambda$createView$4((Context) this.f$1, view, i);
                break;
            case 9:
                ((LocationActivity) this.f$0).lambda$createView$28((ActionBarMenu) this.f$1, view, i);
                break;
            case 10:
                ((ManageLinksActivity) this.f$0).lambda$createView$9((Context) this.f$1, view, i);
                break;
            case 11:
                ((NotificationsSoundActivity) this.f$0).lambda$createView$1((Context) this.f$1, view, i);
                break;
            case 12:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$19((Context) this.f$1, view, i);
                break;
            default:
                ((UsersSelectActivity) this.f$0).lambda$createView$1((Context) this.f$1, view, i);
                break;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.RecyclerListView;

public final class ChannelBoostLayout$$ExternalSyntheticLambda2 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final Context f$1;
    public final long f$2;
    public final Object f$3;
    public final BaseFragment f$4;

    public ChannelBoostLayout$$ExternalSyntheticLambda2(ChannelBoostLayout channelBoostLayout, Context context, long j, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment) {
        this.f$0 = channelBoostLayout;
        this.f$1 = context;
        this.f$2 = j;
        this.f$3 = resourcesProvider;
        this.f$4 = baseFragment;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ChannelBoostLayout) this.f$0).lambda$new$0(this.f$1, this.f$2, (Theme.ResourcesProvider) this.f$3, this.f$4, view, i);
                break;
            default:
                ((InviteMembersBottomSheet) this.f$0).lambda$new$0(this.f$2, this.f$4, (LongSparseArray) this.f$3, this.f$1, view, i);
                break;
        }
    }

    public ChannelBoostLayout$$ExternalSyntheticLambda2(InviteMembersBottomSheet inviteMembersBottomSheet, long j, BaseFragment baseFragment, LongSparseArray longSparseArray, Context context) {
        this.f$0 = inviteMembersBottomSheet;
        this.f$2 = j;
        this.f$4 = baseFragment;
        this.f$3 = longSparseArray;
        this.f$1 = context;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.LocationActivity;

public final class StarAppsSheet extends BottomSheetWithRecyclerListView {
    public DialogsBotsAdapter adapter;

    public StarAppsSheet(Context context) {
        super(context, null, true, false, false, null);
        fixNavigationBar();
        this.handleOffset = true;
        this.showHandle = true;
        setSlidingActionBar();
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, 0);
        this.recyclerListView.addOnScrollListener(new LocationActivity.AnonymousClass10(this, 8));
        this.recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 28));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        DialogsBotsAdapter dialogsBotsAdapter = new DialogsBotsAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.adapter = dialogsBotsAdapter;
        dialogsBotsAdapter.applyBackground = false;
        return dialogsBotsAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    public final void lambda$new$0$12(int i) {
        UItem item = this.adapter.getItem(i - 1);
        Object obj = item != null ? item.object : null;
        if (obj instanceof TLRPC.User) {
            MessagesController.getInstance(this.currentAccount).openApp(this.attachedFragment, (TLRPC.User) obj, null, 0, null);
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public class StarAppsSheet extends BottomSheetWithRecyclerListView {
    private DialogsBotsAdapter adapter;

    public StarAppsSheet(Context context) {
        super(context, null, true, false, false, null);
        fixNavigationBar();
        this.handleOffset = true;
        setShowHandle(true);
        setSlidingActionBar();
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, 0);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                StarAppsSheet.this.adapter.checkBottom();
            }
        });
        this.recyclerListView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 0));
    }

    public void lambda$new$0(View view, int i) {
        Object object = this.adapter.getObject(i - 1);
        if (object instanceof TLRPC.User) {
            MessagesController.getInstance(this.currentAccount).openApp(this.attachedFragment, (TLRPC.User) object, null, 0, null);
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        DialogsBotsAdapter dialogsBotsAdapter = new DialogsBotsAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, this.resourcesProvider);
        this.adapter = dialogsBotsAdapter;
        dialogsBotsAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public CharSequence getTitle() {
        return LocaleController.getString(R.string.SearchAppsExamples);
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}

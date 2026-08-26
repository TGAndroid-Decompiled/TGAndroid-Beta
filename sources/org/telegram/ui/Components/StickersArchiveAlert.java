package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;

public final class StickersArchiveAlert extends AlertDialog.Builder {
    public final int currentType;
    public final BaseFragment parentFragment;
    public final ArrayList stickerSets;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Activity context;

        public ListAdapter(Activity activity) {
            this.context = activity;
        }

        @Override
        public final int getItemCount() {
            return StickersArchiveAlert.this.stickerSets.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArchivedStickerSetCell archivedStickerSetCell = (ArchivedStickerSetCell) viewHolder.itemView;
            StickersArchiveAlert stickersArchiveAlert = StickersArchiveAlert.this;
            archivedStickerSetCell.setStickersSet((TLRPC.StickerSetCovered) stickersArchiveAlert.stickerSets.get(i), i != stickersArchiveAlert.stickerSets.size() - 1);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ArchivedStickerSetCell archivedStickerSetCell = new ArchivedStickerSetCell(this.context, false);
            archivedStickerSetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(82.0f)));
            return new RecyclerListView.Holder(archivedStickerSetCell);
        }
    }

    public StickersArchiveAlert(Activity activity, BaseFragment baseFragment, ArrayList arrayList) {
        super(activity, 0, null);
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(0);
        if (stickerSetCovered.set.masks) {
            this.currentType = 1;
            this.alertDialog.title = LocaleController.getString(R.string.ArchivedMasksAlertTitle);
        } else {
            this.currentType = 0;
            this.alertDialog.title = LocaleController.getString(R.string.ArchivedStickersAlertTitle);
        }
        this.stickerSets = new ArrayList(arrayList);
        this.parentFragment = baseFragment;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        setView(linearLayout);
        TextView textView = new TextView(activity);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setGravity(LayoutHelper.getAbsoluteGravityStart());
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(23.0f), 0);
        if (stickerSetCovered.set.masks) {
            textView.setText(LocaleController.getString(R.string.ArchivedMasksAlertInfo));
        } else {
            textView.setText(LocaleController.getString(R.string.ArchivedStickersAlertInfo));
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2));
        RecyclerListView recyclerListView = new RecyclerListView(activity, null);
        this.alertDialog.getContext();
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerListView.setAdapter(new ListAdapter(activity));
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        recyclerListView.setGlowColor(-657673);
        linearLayout.addView(recyclerListView, LayoutHelper.createLinear(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
        setNegativeButton(LocaleController.getString(R.string.Close), new ContactsActivity$$ExternalSyntheticLambda18(5));
        if (baseFragment != null) {
            setPositiveButton(LocaleController.getString(R.string.Settings), new ProfileGooeyView$$ExternalSyntheticLambda0(this, 27));
        }
    }
}

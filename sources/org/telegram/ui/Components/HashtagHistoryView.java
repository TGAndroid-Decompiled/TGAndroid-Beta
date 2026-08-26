package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public class HashtagHistoryView extends FrameLayout {
    private final UniversalAdapter adapter;
    private final int currentAccount;
    private final ImageView emptyImage;
    private final TextView emptyText;
    public final FrameLayout emptyView;
    private ArrayList<String> history;
    private Utilities.Callback<String> onClickListener;
    private final UniversalRecyclerView recyclerView;
    private final Theme.ResourcesProvider resourcesProvider;

    public HashtagHistoryView(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i, 0, new EmojiView$$ExternalSyntheticLambda18(this, 15), new HashtagHistoryView$$ExternalSyntheticLambda2(this), new HashtagHistoryView$$ExternalSyntheticLambda2(this), resourcesProvider);
        this.recyclerView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        UniversalAdapter universalAdapter = (UniversalAdapter) universalRecyclerView.getAdapter();
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        addView(universalRecyclerView, -1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.emptyView = frameLayout;
        ImageView imageView = new ImageView(context);
        this.emptyImage = imageView;
        int i2 = Theme.key_windowBackgroundWhiteGrayIcon;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, LayoutHelper.createFrame(56, 56, 49));
        TextView textView = new TextView(context);
        this.emptyText = textView;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.HashtagSearchPlaceholder));
        textView.setGravity(17);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, LayoutHelper.createFrame(210, -2, 17));
        universalRecyclerView.setEmptyView(frameLayout);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        this.history = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(this.currentAccount).history);
        if (this.history.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.history.size(); i++) {
            String str = this.history.get(i);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(UItem.asButton(i + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(UItem.asButton(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    public void lambda$onLongClick$0(String str, AlertDialog alertDialog, int i) {
        HashtagSearchController.getInstance(this.currentAccount).removeHashtagFromHistory(str);
        update();
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 0) {
            HashtagSearchController.getInstance(this.currentAccount).clearHistory();
            update();
        } else {
            Utilities.Callback<String> callback = this.onClickListener;
            if (callback != null) {
                callback.run(this.history.get(i2 - 1));
            }
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 0) {
            return false;
        }
        String str = this.history.get(i2 - 1);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.ClearSearchSingleAlertTitle));
        builder.setMessage(LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str));
        builder.setPositiveButton(LocaleController.getString(R.string.ClearSearchRemove), new AIEditorAlert$$ExternalSyntheticLambda34(27, this, str));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.create().show();
        return true;
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.onClickListener = callback;
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.recyclerView.addOnScrollListener(onScrollListener);
    }

    public void setTopBottomPadding(int i, int i2) {
        this.recyclerView.setPadding(0, i, 0, i2);
        this.emptyView.setTranslationY((i - i2) / 2.0f);
    }

    public void update() {
        this.adapter.update(true);
    }
}

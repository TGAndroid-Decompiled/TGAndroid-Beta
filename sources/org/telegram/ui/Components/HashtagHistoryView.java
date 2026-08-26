package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;

public final class HashtagHistoryView extends FrameLayout {
    public final UniversalAdapter adapter;
    public final int currentAccount;
    public final FrameLayout emptyView;
    public ArrayList history;
    public Utilities.Callback onClickListener;
    public final UniversalRecyclerView recyclerView;
    public final Theme.ResourcesProvider resourcesProvider;

    public HashtagHistoryView(int i, Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(activity, i, 0, new GiftSheet$$ExternalSyntheticLambda8(this, 3), new HashtagHistoryView$$ExternalSyntheticLambda1(this), new HashtagHistoryView$$ExternalSyntheticLambda1(this), resourcesProvider);
        this.recyclerView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        UniversalAdapter universalAdapter = (UniversalAdapter) universalRecyclerView.getAdapter();
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        addView(universalRecyclerView, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.emptyView = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i2 = Theme.key_windowBackgroundWhiteGrayIcon;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, LayoutHelper.createFrame(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        zzkg.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, LayoutHelper.createFrame(210, -2, 17));
        universalRecyclerView.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.onClickListener = callback;
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.recyclerView.addOnScrollListener(onScrollListener);
    }
}

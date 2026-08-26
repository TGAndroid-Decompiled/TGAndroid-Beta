package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class SelectStoriesBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public UniversalAdapter adapter;
    public final ButtonWithCounterView button;
    public final int columnsCount;
    public int id;
    public final ExtendedGridLayoutManager layoutManager;
    public final HashMap selectedStoriesIds;
    public final StoriesController.StoriesList storiesList;

    public SelectStoriesBottomSheet(BaseFragment baseFragment, long j, int i, BulletinFactory$$ExternalSyntheticLambda4 bulletinFactory$$ExternalSyntheticLambda4) {
        super(baseFragment);
        this.selectedStoriesIds = new HashMap();
        this.columnsCount = i;
        StoriesController.StoriesList storiesList = MessagesController.getInstance(baseFragment.getCurrentAccount()).getStoriesController().getStoriesList(j, 1, -1, true);
        this.storiesList = storiesList;
        storiesList.getClass();
        storiesList.load(30, Collections.EMPTY_LIST, false);
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        setSlidingActionBar();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        int i2 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i2, 0, i2, 0);
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        frameLayout.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 55));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider, true);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        buttonWithCounterView.setEnabled(false);
        buttonWithCounterView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(9, this, bulletinFactory$$ExternalSyntheticLambda4));
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(i, false);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i3) {
                int i4;
                SelectStoriesBottomSheet selectStoriesBottomSheet = SelectStoriesBottomSheet.this;
                UniversalAdapter universalAdapter = selectStoriesBottomSheet.adapter;
                ExtendedGridLayoutManager extendedGridLayoutManager2 = selectStoriesBottomSheet.layoutManager;
                if (universalAdapter == null) {
                    return extendedGridLayoutManager2.mSpanCount;
                }
                UItem item = universalAdapter.getItem(i3 - 1);
                return (item == null || (i4 = item.spanCount) == -1) ? extendedGridLayoutManager2.mSpanCount : i4;
            }
        };
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, 0);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 6));
        this.recyclerListView.setOnItemLongClickListener(new StoriesViewPager$$ExternalSyntheticLambda0(this, 4));
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                SelectStoriesBottomSheet.this.checkLoadMoreScroll();
            }
        });
        this.adapter.update(true);
    }

    public final void checkLoadMoreScroll() {
        ExtendedGridLayoutManager extendedGridLayoutManager = this.layoutManager;
        int iFindFirstVisibleItemPosition = extendedGridLayoutManager.findFirstVisibleItemPosition();
        int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(extendedGridLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
        StoriesController.StoriesList storiesList = this.storiesList;
        if (storiesList != null) {
            int i = iFindFirstVisibleItemPosition + iAbs;
            int loadedCount = storiesList.getLoadedCount();
            int i2 = this.columnsCount;
            if (i > loadedCount - i2) {
                int iMin = Math.min(100, Math.max(1, i2 / 2) * i2 * i2);
                storiesList.getClass();
                storiesList.load(iMin, Collections.EMPTY_LIST, false);
            }
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, false, new LinkManager$$ExternalSyntheticLambda1(this, 12), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated && ((StoriesController.StoriesList) objArr[0]) == this.storiesList) {
            this.adapter.update(false);
            checkLoadMoreScroll();
        }
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StoriesController.StoriesList storiesList = this.storiesList;
        int i = storiesList.maxLinkId;
        storiesList.maxLinkId = i + 1;
        storiesList.links.add(Integer.valueOf(i));
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18 = storiesList.destroyRunnable;
        if (stickersActivity$$ExternalSyntheticLambda18 != null) {
            AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
        }
        this.id = i;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18;
        super.onDetachedFromWindow();
        int i = this.id;
        StoriesController.StoriesList storiesList = this.storiesList;
        storiesList.links.remove(Integer.valueOf(i));
        if (storiesList.links.isEmpty() && (stickersActivity$$ExternalSyntheticLambda18 = storiesList.destroyRunnable) != null) {
            AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
            AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda18, 300000L);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    public final boolean onItemClick(int i, View view) {
        UItem item;
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null || i == 0 || (item = universalAdapter.getItem(i - 1)) == null) {
            return false;
        }
        Object obj = item.object;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id = messageObject.getId();
            HashMap map = this.selectedStoriesIds;
            if (map.containsKey(Integer.valueOf(id))) {
                map.remove(Integer.valueOf(id));
                item.checked = false;
                ((SharedPhotoVideoCell2) view).setChecked(false, true);
            } else {
                map.put(Integer.valueOf(id), messageObject.storyItem);
                item.checked = true;
                ((SharedPhotoVideoCell2) view).setChecked(true, true);
            }
            ButtonWithCounterView buttonWithCounterView = this.button;
            buttonWithCounterView.setEnabled(!map.isEmpty());
            buttonWithCounterView.setCount(map.size(), true);
        }
        return true;
    }
}

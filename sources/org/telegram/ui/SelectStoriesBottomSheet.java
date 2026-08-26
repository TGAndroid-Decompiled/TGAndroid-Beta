package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class SelectStoriesBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private UniversalAdapter adapter;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private final int columnsCount;
    private final long dialogId;
    private int id;
    private final ExtendedGridLayoutManager layoutManager;
    private final HashMap<Integer, TL_stories.StoryItem> selectedStoriesIds;
    private final StoriesController.StoriesList storiesList;

    public SelectStoriesBottomSheet(BaseFragment baseFragment, long j, int i, Utilities.Callback<ArrayList<TL_stories.StoryItem>> callback) {
        super(baseFragment, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING);
        this.selectedStoriesIds = new HashMap<>();
        this.dialogId = j;
        this.columnsCount = i;
        StoriesController.StoriesList storiesList = MessagesController.getInstance(baseFragment.getCurrentAccount()).getStoriesController().getStoriesList(j, 1, -1, true);
        this.storiesList = storiesList;
        storiesList.getClass();
        storiesList.load(30, Collections.EMPTY_LIST, false);
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        setSlidingActionBar();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        int i2 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i2, 0, i2, 0);
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, this.resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false);
        buttonWithCounterView.setEnabled(false);
        buttonWithCounterView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(24, this, callback));
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(getContext(), i);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i3) {
                int i4;
                if (SelectStoriesBottomSheet.this.adapter == null) {
                    return SelectStoriesBottomSheet.this.layoutManager.getSpanCount();
                }
                UItem item = SelectStoriesBottomSheet.this.adapter.getItem(i3 - 1);
                return (item == null || (i4 = item.spanCount) == -1) ? SelectStoriesBottomSheet.this.layoutManager.getSpanCount() : i4;
            }
        });
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, 0);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 7));
        this.recyclerListView.setOnItemLongClickListener(new TodoItemMenu$$ExternalSyntheticLambda3(this, 19));
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                SelectStoriesBottomSheet.this.checkLoadMoreScroll();
            }
        });
        this.adapter.update(true);
    }

    public void checkLoadMoreScroll() {
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
        StoriesController.StoriesList storiesList = this.storiesList;
        if (storiesList != null) {
            int i = iFindFirstVisibleItemPosition + iAbs;
            int loadedCount = storiesList.getLoadedCount();
            int i2 = this.columnsCount;
            if (i > loadedCount - i2) {
                int iMax = Math.max(1, i2 / 2);
                int i3 = this.columnsCount;
                int iMin = Math.min(100, iMax * i3 * i3);
                StoriesController.StoriesList storiesList2 = this.storiesList;
                storiesList2.getClass();
                storiesList2.load(iMin, Collections.EMPTY_LIST, false);
            }
        }
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        if (this.storiesList == null) {
            return;
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
        int i = this.columnsCount;
        ArrayList arrayList2 = this.storiesList.messageObjects;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            MessageObject messageObject = (MessageObject) obj;
            arrayList.add(StoryCellFactory.asStory(0, messageObject, this.columnsCount, true).setChecked(this.selectedStoriesIds.containsKey(Integer.valueOf(messageObject.getId()))).setSpanCount(1));
            i--;
            if (i == 0) {
                i = this.columnsCount;
            }
        }
        if (this.storiesList.isLoading() || !this.storiesList.done) {
            while (true) {
                if (i2 >= (i <= 0 ? this.columnsCount : i)) {
                    break;
                }
                i2++;
                zzlb.m(i2, 34, arrayList);
            }
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(68.0f)));
    }

    public void lambda$new$0(Utilities.Callback callback, View view) {
        if (this.storiesList.getCount() == 0) {
            return;
        }
        callback.run(new ArrayList(this.selectedStoriesIds.values()));
        lambda$showGiftOfferSheet$15();
    }

    public boolean onItemClick(View view, int i) {
        UItem item;
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null || i == 0 || (item = universalAdapter.getItem(i - 1)) == null) {
            return false;
        }
        Object obj = item.object;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id = messageObject.getId();
            if (this.selectedStoriesIds.containsKey(Integer.valueOf(id))) {
                this.selectedStoriesIds.remove(Integer.valueOf(id));
                item.checked = false;
                ((SharedPhotoVideoCell2) view).setChecked(false, true);
            } else {
                this.selectedStoriesIds.put(Integer.valueOf(id), messageObject.storyItem);
                item.checked = true;
                ((SharedPhotoVideoCell2) view).setChecked(true, true);
            }
            this.button.setEnabled(!this.selectedStoriesIds.isEmpty());
            this.button.setCount(this.selectedStoriesIds.size(), true);
        }
        return true;
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new LinkManager$$ExternalSyntheticLambda6(this, 25), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated && ((StoriesController.StoriesList) objArr[0]) == this.storiesList) {
            this.adapter.update(false);
            checkLoadMoreScroll();
        }
    }

    @Override
    public CharSequence getTitle() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        StoriesController.StoriesList storiesList = this.storiesList;
        int i = storiesList.maxLinkId;
        storiesList.maxLinkId = i + 1;
        storiesList.links.add(Integer.valueOf(i));
        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0 = storiesList.destroyRunnable;
        if (storyViewer$5$$ExternalSyntheticLambda0 != null) {
            AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda0);
        }
        this.id = i;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public void onDetachedFromWindow() {
        StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0;
        super.onDetachedFromWindow();
        StoriesController.StoriesList storiesList = this.storiesList;
        storiesList.links.remove(Integer.valueOf(this.id));
        if (storiesList.links.isEmpty() && (storyViewer$5$$ExternalSyntheticLambda0 = storiesList.destroyRunnable) != null) {
            AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(storyViewer$5$$ExternalSyntheticLambda0, 300000L);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}

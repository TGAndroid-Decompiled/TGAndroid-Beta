package org.telegram.ui.Components.Premium.boosts;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import j$.util.function.BiConsumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$TL_help_country;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class SelectorBottomSheet extends BottomSheetWithRecyclerListView {
    private final ButtonWithCounterView actionButton;
    private final HashMap<Long, TLObject> allSelectedObjects;
    private final Paint backgroundPaint;
    private final SelectorBtnCell buttonContainer;
    private final List<String> countriesLetters;
    private final List<TLRPC$TL_help_country> countriesList;
    private final Map<String, List<TLRPC$TL_help_country>> countriesMap;
    private final TLRPC$Chat currentChat;
    private final SelectorHeaderCell headerView;
    private final ArrayList<SelectorAdapter.Item> items;
    private int listPaddingTop;
    private final ArrayList<SelectorAdapter.Item> oldItems;
    private Runnable onCloseClick;
    private final HashSet<Long> openedIds;
    private final ArrayList<TLRPC$InputPeer> peers;
    private String query;
    private final Runnable remoteSearchRunnable;
    private final SelectorSearchCell searchField;
    private final GraySectionCell sectionCell;
    private final HashSet<Long> selectedIds;
    private SelectedObjectsListener selectedObjectsListener;
    private SelectorAdapter selectorAdapter;
    private final AnimatedFloat statusBarT;
    private int top;
    private int type;
    private final ArrayList<TLRPC$InputPeer> users;

    public interface SelectedObjectsListener {

        public final class CC {
            public static void $default$onShowToast(SelectedObjectsListener selectedObjectsListener, String str) {
            }
        }

        void onChatsSelected(List<TLRPC$Chat> list, boolean z);

        void onCountrySelected(List<TLRPC$TL_help_country> list);

        void onShowToast(String str);

        void onUsersSelected(List<TLRPC$User> list);
    }

    public SelectorBottomSheet(BaseFragment baseFragment, boolean z, long j) {
        super(baseFragment, z, false);
        this.backgroundPaint = new Paint(1);
        this.oldItems = new ArrayList<>();
        ArrayList<SelectorAdapter.Item> arrayList = new ArrayList<>();
        this.items = arrayList;
        this.selectedIds = new HashSet<>();
        this.openedIds = new HashSet<>();
        this.peers = new ArrayList<>();
        this.users = new ArrayList<>();
        this.countriesMap = new HashMap();
        this.countriesLetters = new ArrayList();
        this.countriesList = new ArrayList();
        this.allSelectedObjects = new LinkedHashMap();
        this.listPaddingTop = AndroidUtilities.dp(134.0f);
        this.remoteSearchRunnable = new Runnable() {
            @Override
            public void run() {
                String str = SelectorBottomSheet.this.query;
                if (str != null) {
                    SelectorBottomSheet selectorBottomSheet = SelectorBottomSheet.this;
                    selectorBottomSheet.loadData(selectorBottomSheet.type, false, str);
                }
            }
        };
        this.backgroundPaddingLeft = 0;
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        ((ViewGroup) this.actionBar.getParent()).removeView(this.actionBar);
        ViewGroup viewGroup = this.containerView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.statusBarT = new AnimatedFloat(viewGroup, 0L, 350L, cubicBezierInterpolator);
        SelectorHeaderCell selectorHeaderCell = new SelectorHeaderCell(getContext(), this.resourcesProvider);
        this.headerView = selectorHeaderCell;
        selectorHeaderCell.setOnCloseClickListener(new Runnable() {
            @Override
            public final void run() {
                SelectorBottomSheet.this.dismiss();
            }
        });
        selectorHeaderCell.setText(getTitle());
        selectorHeaderCell.setCloseImageVisible(true);
        selectorHeaderCell.backDrawable.setRotation(0.0f, false);
        SelectorSearchCell selectorSearchCell = new SelectorSearchCell(getContext(), this.resourcesProvider, null) {
            @Override
            protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                SelectorBottomSheet.this.listPaddingTop = getMeasuredHeight() + AndroidUtilities.dp(78.0f);
                SelectorBottomSheet.this.selectorAdapter.notifyChangedLast();
            }
        };
        this.searchField = selectorSearchCell;
        int i = Theme.key_dialogBackground;
        selectorSearchCell.setBackgroundColor(getThemedColor(i));
        selectorSearchCell.setOnSearchTextChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                SelectorBottomSheet.this.onSearch((String) obj);
            }
        });
        GraySectionCell graySectionCell = new GraySectionCell(getContext(), this.resourcesProvider);
        this.sectionCell = graySectionCell;
        updateSection();
        ViewGroup viewGroup2 = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup2.addView(selectorHeaderCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i2, 0, i2, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup3.addView(selectorSearchCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i3, 0, i3, 0));
        ViewGroup viewGroup4 = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup4.addView(graySectionCell, LayoutHelper.createFrameMarginPx(-1, 32.0f, 55, i4, 0, i4, 0));
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), this.resourcesProvider, null);
        this.buttonContainer = selectorBtnCell;
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SelectorBottomSheet.this.lambda$new$0(view);
            }
        });
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup5 = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup5.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i5, 0, i5, 0));
        this.selectorAdapter.setData(arrayList, this.recyclerListView);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i6 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i6, 0, i6, AndroidUtilities.dp(60.0f));
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                if (i7 == 1) {
                    AndroidUtilities.hideKeyboard(SelectorBottomSheet.this.searchField.getEditText());
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i7) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i7);
            }

            @Override
            public void onDoubleTap(View view, int i7, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i7, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i7, float f, float f2) {
                SelectorBottomSheet.this.lambda$new$5(view, i7, f, f2);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                if (recyclerView.getChildAdapterPosition(view) == SelectorBottomSheet.this.items.size()) {
                    rect.bottom = SelectorBottomSheet.this.listPaddingTop;
                }
            }
        });
        updateList(false, true);
        loadData(1, true, null);
        loadData(3, true, null);
    }

    public void lambda$new$0(View view) {
        save(false);
    }

    public void lambda$new$5(View view, int i, float f, float f2) {
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            TLRPC$User user = selectorUserCell.getUser();
            TLRPC$Chat chat = selectorUserCell.getChat();
            final long j = user != null ? user.id : -chat.id;
            if (this.selectedIds.contains(Long.valueOf(j))) {
                this.selectedIds.remove(Long.valueOf(j));
            } else {
                this.selectedIds.add(Long.valueOf(j));
                HashMap<Long, TLObject> hashMap = this.allSelectedObjects;
                Long valueOf = Long.valueOf(j);
                if (user == null) {
                    user = chat;
                }
                hashMap.put(valueOf, user);
            }
            if ((this.selectedIds.size() == 11 && this.type == 1) || (this.selectedIds.size() == BoostRepository.giveawayAddPeersMax() + 1 && this.type == 2)) {
                this.selectedIds.remove(Long.valueOf(j));
                showMaximumUsersToast();
                return;
            }
            this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
                @Override
                public final void run() {
                    SelectorBottomSheet.this.lambda$new$1();
                }
            }, null);
            updateList(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && this.selectedIds.contains(Long.valueOf(j))) {
                BoostDialogs.showPrivateChannelAlert(getBaseFragment().getContext(), this.resourcesProvider, new Runnable() {
                    @Override
                    public final void run() {
                        SelectorBottomSheet.this.lambda$new$3(j);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        SelectorBottomSheet.this.clearSearchAfterSelectChannel();
                    }
                });
            } else if (chat != null) {
                clearSearchAfterSelectChannel();
            }
        }
        if (view instanceof SelectorCountryCell) {
            long hashCode = ((SelectorCountryCell) view).getCountry().default_name.hashCode();
            if (this.selectedIds.contains(Long.valueOf(hashCode))) {
                this.selectedIds.remove(Long.valueOf(hashCode));
            } else {
                this.selectedIds.add(Long.valueOf(hashCode));
            }
            if (this.selectedIds.size() == BoostRepository.giveawayCountriesMax() + 1 && this.type == 3) {
                this.selectedIds.remove(Long.valueOf(hashCode));
                showMaximumUsersToast();
                return;
            }
            this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
                @Override
                public final void run() {
                    SelectorBottomSheet.this.lambda$new$4();
                }
            }, this.countriesList);
            if (isSearching()) {
                this.query = null;
                this.searchField.setText(BuildConfig.APP_CENTER_HASH);
                updateList(false, false);
                updateList(true, true);
                return;
            }
            updateList(true, false);
        }
    }

    public void lambda$new$1() {
        updateList(true, false);
    }

    public void lambda$new$3(long j) {
        this.selectedIds.remove(Long.valueOf(j));
        this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                SelectorBottomSheet.this.lambda$new$2();
            }
        }, null);
        updateList(true, false);
    }

    public void lambda$new$2() {
        updateList(true, false);
    }

    public void lambda$new$4() {
        updateList(true, false);
    }

    public void clearSearchAfterSelectChannel() {
        if (isSearching()) {
            this.query = null;
            this.searchField.setText(BuildConfig.APP_CENTER_HASH);
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            this.peers.clear();
            this.peers.addAll(BoostRepository.getMyChannels(this.currentChat.id));
            updateList(false, false);
            updateList(true, true);
        }
    }

    private void save(boolean z) {
        if (this.selectedIds.size() != 0 || z) {
            int i = this.type;
            if (i == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : this.allSelectedObjects.values()) {
                    if (tLObject instanceof TLRPC$User) {
                        TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                        if (this.selectedIds.contains(Long.valueOf(tLRPC$User.id))) {
                            arrayList.add(tLRPC$User);
                        }
                    }
                }
                SelectedObjectsListener selectedObjectsListener = this.selectedObjectsListener;
                if (selectedObjectsListener != null) {
                    selectedObjectsListener.onUsersSelected(arrayList);
                }
            } else if (i == 2) {
                ArrayList arrayList2 = new ArrayList();
                for (TLObject tLObject2 : this.allSelectedObjects.values()) {
                    if (tLObject2 instanceof TLRPC$Chat) {
                        TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject2;
                        if (this.selectedIds.contains(Long.valueOf(-tLRPC$Chat.id))) {
                            arrayList2.add(tLRPC$Chat);
                        }
                    }
                }
                SelectedObjectsListener selectedObjectsListener2 = this.selectedObjectsListener;
                if (selectedObjectsListener2 != null) {
                    selectedObjectsListener2.onChatsSelected(arrayList2, true);
                }
            } else {
                if (i != 3) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                for (TLRPC$TL_help_country tLRPC$TL_help_country : this.countriesList) {
                    if (this.selectedIds.contains(Long.valueOf(tLRPC$TL_help_country.default_name.hashCode()))) {
                        arrayList3.add(tLRPC$TL_help_country);
                    }
                }
                SelectedObjectsListener selectedObjectsListener3 = this.selectedObjectsListener;
                if (selectedObjectsListener3 != null) {
                    selectedObjectsListener3.onCountrySelected(arrayList3);
                }
            }
        }
    }

    public void scrollToTop(boolean z) {
        if (z) {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.6f);
            linearSmoothScrollerCustom.setTargetPosition(1);
            linearSmoothScrollerCustom.setOffset(AndroidUtilities.dp(38.0f));
            this.recyclerListView.getLayoutManager().startSmoothScroll(linearSmoothScrollerCustom);
            return;
        }
        this.recyclerListView.scrollToPosition(0);
    }

    public void lambda$loadData$6(List list) {
        if (isSearching()) {
            this.peers.clear();
            this.peers.addAll(list);
            updateList(true, true);
            scrollToTop(true);
        }
    }

    public void lambda$loadData$7(boolean z, List list) {
        if (z) {
            this.users.addAll(list);
        }
        if (this.type == 1) {
            this.peers.clear();
            this.peers.addAll(list);
            updateList(true, true);
            scrollToTop(true);
        }
    }

    public void loadData(int i, final boolean z, String str) {
        if (i == 1) {
            BoostRepository.loadChatParticipants(this.currentChat.id, 0, str, 0, 50, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SelectorBottomSheet.this.lambda$loadData$7(z, (List) obj);
                }
            });
        } else if (i == 2) {
            BoostRepository.searchChats(this.currentChat.id, 0, str, 50, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SelectorBottomSheet.this.lambda$loadData$6((List) obj);
                }
            });
        } else if (i != 3) {
        } else {
            BoostRepository.loadCountries(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SelectorBottomSheet.this.lambda$loadData$9(z, (Pair) obj);
                }
            });
        }
    }

    public void lambda$loadData$9(boolean z, Pair pair) {
        if (z) {
            this.countriesMap.putAll((Map) pair.first);
            this.countriesLetters.addAll((Collection) pair.second);
            Map.EL.forEach(this.countriesMap, new BiConsumer() {
                @Override
                public final void accept(Object obj, Object obj2) {
                    SelectorBottomSheet.this.lambda$loadData$8((String) obj, (List) obj2);
                }

                @Override
                public BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer.CC.$default$andThen(this, biConsumer);
                }
            });
        }
        if (this.type == 3) {
            updateList(true, true);
            scrollToTop(true);
        }
    }

    public void lambda$loadData$8(String str, List list) {
        this.countriesList.addAll(list);
    }

    public boolean hasChanges() {
        if (this.selectedIds.size() == this.openedIds.size() && this.openedIds.containsAll(this.selectedIds) && this.selectedIds.containsAll(this.openedIds)) {
            return false;
        }
        BoostDialogs.showUnsavedChanges(this.type, getContext(), this.resourcesProvider, new Runnable() {
            @Override
            public final void run() {
                SelectorBottomSheet.this.lambda$hasChanges$10();
            }
        }, new Runnable() {
            @Override
            public final void run() {
                SelectorBottomSheet.this.lambda$hasChanges$11();
            }
        });
        return true;
    }

    public void lambda$hasChanges$10() {
        save(true);
    }

    public void lambda$hasChanges$11() {
        this.selectedIds.clear();
        this.openedIds.clear();
        dismiss();
    }

    @Override
    public void dismiss() {
        Runnable runnable = this.onCloseClick;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
    }

    public void setSelectedObjectsListener(SelectedObjectsListener selectedObjectsListener) {
        this.selectedObjectsListener = selectedObjectsListener;
    }

    public int getTop() {
        return Math.max(0, this.top - (this.statusBarT.get() == 1.0f ? AndroidUtilities.statusBarHeight : 0));
    }

    public void setOnCloseClick(Runnable runnable) {
        this.onCloseClick = runnable;
    }

    public void prepare(List<TLObject> list, int i) {
        this.type = i;
        this.query = null;
        this.openedIds.clear();
        this.selectedIds.clear();
        this.peers.clear();
        this.allSelectedObjects.clear();
        if (i == 1) {
            this.peers.addAll(this.users);
        } else if (i == 2) {
            this.peers.addAll(BoostRepository.getMyChannels(this.currentChat.id));
        }
        if (list != null) {
            for (TLObject tLObject : list) {
                long j = tLObject instanceof TLRPC$TL_inputPeerChat ? -((TLRPC$TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC$TL_inputPeerChannel) {
                    j = -((TLRPC$TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC$Chat) {
                    j = -((TLRPC$Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC$User) {
                    j = ((TLRPC$User) tLObject).id;
                }
                if (tLObject instanceof TLRPC$TL_help_country) {
                    j = ((TLRPC$TL_help_country) tLObject).default_name.hashCode();
                }
                this.selectedIds.add(Long.valueOf(j));
                this.allSelectedObjects.put(Long.valueOf(j), tLObject);
            }
        }
        this.openedIds.addAll(this.selectedIds);
        this.searchField.setText(BuildConfig.APP_CENTER_HASH);
        this.searchField.spansContainer.removeAllSpans(false);
        this.searchField.updateSpans(false, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                SelectorBottomSheet.this.lambda$prepare$12();
            }
        }, this.countriesList);
        updateSection();
        updateList(false, true);
        this.headerView.setText(getTitle());
        updateActionButton(false);
        scrollToTop(false);
    }

    public void lambda$prepare$12() {
        updateList(true, false);
    }

    private void updateSection() {
        String formatPluralStringComma;
        int i = this.type;
        if (i == 1) {
            formatPluralStringComma = LocaleController.formatPluralStringComma("Subscribers", Math.max(0, this.selectorAdapter.getParticipantsCount(this.currentChat) - 1));
            this.sectionCell.setLayerHeight(32);
        } else if (i == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToPlural", (int) BoostRepository.giveawayAddPeersMax(), new Object[0]);
            this.sectionCell.setLayerHeight(32);
        } else if (i != 3) {
            formatPluralStringComma = BuildConfig.APP_CENTER_HASH;
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) BoostRepository.giveawayCountriesMax(), new Object[0]);
            this.sectionCell.setLayerHeight(1);
        }
        this.sectionCell.setText(formatPluralStringComma);
    }

    private void showMaximumUsersToast() {
        String string;
        int i = this.type;
        if (i == 1) {
            string = LocaleController.getString("BoostingSelectUpToWarningUsers", R.string.BoostingSelectUpToWarningUsers);
        } else if (i == 2) {
            string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsPlural", (int) BoostRepository.giveawayAddPeersMax(), new Object[0]);
        } else {
            string = i != 3 ? BuildConfig.APP_CENTER_HASH : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) BoostRepository.giveawayCountriesMax(), new Object[0]);
        }
        SelectedObjectsListener selectedObjectsListener = this.selectedObjectsListener;
        if (selectedObjectsListener != null) {
            selectedObjectsListener.onShowToast(string);
        }
    }

    private void updateList(boolean z, boolean z2) {
        updateItems(z, z2);
        updateCheckboxes(z);
        updateActionButton(z);
    }

    private void updateCheckboxes(boolean z) {
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof SelectorUserCell) {
                int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    SelectorAdapter.Item item = this.items.get(childAdapterPosition - 1);
                    SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                    selectorUserCell.setChecked(item.checked, z);
                    TLRPC$Chat tLRPC$Chat = item.chat;
                    if (tLRPC$Chat != null) {
                        selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount(tLRPC$Chat) > 200 ? 0.3f : 1.0f, z);
                    } else {
                        selectorUserCell.setCheckboxAlpha(1.0f, z);
                    }
                }
            }
            if (childAt instanceof SelectorCountryCell) {
                SelectorCountryCell selectorCountryCell = (SelectorCountryCell) childAt;
                selectorCountryCell.setChecked(this.selectedIds.contains(Long.valueOf(selectorCountryCell.getCountry().default_name.hashCode())), true);
            }
        }
    }

    @Override
    protected void onPreDraw(Canvas canvas, int i, float f) {
        this.top = i;
        this.headerView.setTranslationY(Math.max(i, AndroidUtilities.statusBarHeight + (((this.headerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f)));
        this.searchField.setTranslationY(this.headerView.getTranslationY() + this.headerView.getMeasuredHeight());
        this.sectionCell.setTranslationY(this.searchField.getTranslationY() + this.searchField.getMeasuredHeight());
        this.recyclerListView.setTranslationY(((this.headerView.getMeasuredHeight() + this.searchField.getMeasuredHeight()) + this.sectionCell.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        drawFilledStatusBar(canvas, i);
    }

    private void drawFilledStatusBar(Canvas canvas, int i) {
        this.backgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        int max = Math.max(0, i);
        int lerp = AndroidUtilities.lerp(max, 0, this.statusBarT.set(max < AndroidUtilities.statusBarHeight));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, this.containerView.getHeight() + AndroidUtilities.dp(14.0f));
        float dp = AndroidUtilities.dp(14.0f) * (1.0f - this.statusBarT.get());
        canvas.drawRoundRect(rectF, dp, dp, this.backgroundPaint);
    }

    private void updateActionButton(boolean z) {
        String string;
        this.actionButton.setShowZero(false);
        int i = this.type;
        if (i != 1) {
            string = (i == 2 || i == 3) ? LocaleController.getString("Save", R.string.Save) : BuildConfig.APP_CENTER_HASH;
        } else {
            string = LocaleController.getString("BoostingSaveRecipients", R.string.BoostingSaveRecipients);
        }
        this.actionButton.setText(string, z);
        this.actionButton.setCount(this.selectedIds.size(), z);
        this.actionButton.setEnabled(this.selectedIds.size() > 0);
    }

    public void onSearch(String str) {
        this.query = str;
        int i = this.type;
        if (i == 1) {
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            AndroidUtilities.runOnUIThread(this.remoteSearchRunnable, 350L);
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            updateItems(false, true);
            scrollToTop(true);
        } else if (!isSearching()) {
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            this.peers.clear();
            this.peers.addAll(BoostRepository.getMyChannels(this.currentChat.id));
            updateItems(false, true);
            scrollToTop(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            AndroidUtilities.runOnUIThread(this.remoteSearchRunnable, 350L);
        }
    }

    private void updateSectionCell(boolean z) {
        if (this.selectedIds.size() > 0 && this.type != 3) {
            this.sectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), true, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SelectorBottomSheet.this.lambda$updateSectionCell$13(view);
                }
            });
        } else if (z) {
            this.sectionCell.setRightText(null);
        } else {
            this.sectionCell.setRightText((String) null, (View.OnClickListener) null);
        }
    }

    public void lambda$updateSectionCell$13(View view) {
        this.selectedIds.clear();
        this.searchField.spansContainer.removeAllSpans(true);
        updateList(true, false);
    }

    private boolean isSearching() {
        return !TextUtils.isEmpty(this.query);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateItems(boolean z, boolean z2) {
        int i;
        SelectorAdapter selectorAdapter;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        if (this.type == 3) {
            i = 0;
            for (String str : this.countriesLetters) {
                ArrayList arrayList = new ArrayList();
                for (TLRPC$TL_help_country tLRPC$TL_help_country : this.countriesMap.get(str)) {
                    if (!isSearching() || matchLocal(tLRPC$TL_help_country, AndroidUtilities.translitSafe(this.query).toLowerCase())) {
                        i += AndroidUtilities.dp(44.0f);
                        arrayList.add(SelectorAdapter.Item.asCountry(tLRPC$TL_help_country, this.selectedIds.contains(Long.valueOf(tLRPC$TL_help_country.default_name.hashCode()))));
                    }
                }
                if (!arrayList.isEmpty()) {
                    i += AndroidUtilities.dp(32.0f);
                    this.items.add(SelectorAdapter.Item.asLetter(str.toUpperCase()));
                    this.items.addAll(arrayList);
                }
            }
        } else {
            i = 0;
        }
        Iterator<TLRPC$InputPeer> it = this.peers.iterator();
        while (it.hasNext()) {
            TLRPC$InputPeer next = it.next();
            i += AndroidUtilities.dp(56.0f);
            this.items.add(SelectorAdapter.Item.asPeer(next, this.selectedIds.contains(Long.valueOf(DialogObject.getPeerDialogId(next)))));
        }
        if (this.items.isEmpty()) {
            this.items.add(SelectorAdapter.Item.asNoUsers());
            i += AndroidUtilities.dp(150.0f);
        }
        this.items.add(SelectorAdapter.Item.asPad(Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i)));
        updateSectionCell(z);
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(this.oldItems, this.items);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }

    private boolean matchLocal(TLObject tLObject, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC$TL_help_country) {
            TLRPC$TL_help_country tLRPC$TL_help_country = (TLRPC$TL_help_country) tLObject;
            String lowerCase = AndroidUtilities.translitSafe(tLRPC$TL_help_country.default_name).toLowerCase();
            if (!lowerCase.startsWith(str)) {
                if (!lowerCase.contains(" " + str)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tLRPC$TL_help_country.iso2).toLowerCase();
                    if (!lowerCase2.startsWith(str)) {
                        if (!lowerCase2.contains(" " + str)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    @Override
    protected CharSequence getTitle() {
        int i = this.type;
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? BuildConfig.APP_CENTER_HASH : LocaleController.getString("BoostingSelectCountry", R.string.BoostingSelectCountry);
            }
            return LocaleController.getString("BoostingAddChannel", R.string.BoostingAddChannel);
        }
        return LocaleController.getString("GiftPremium", R.string.GiftPremium);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), this.resourcesProvider);
        this.selectorAdapter = selectorAdapter;
        return selectorAdapter;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;

public final class ArchiveSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ListAdapter adapter;
    public boolean changed;
    public final ArrayList items;
    public RecyclerListView listView;
    public final ArrayList oldItems;
    public TLRPC.GlobalPrivacySettings settings;
    public int shiftDp;

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public final int id;
        public final String text;

        public ItemInner(int i, int i2, String str) {
            super(i, false);
            this.id = i2;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ItemInner.class != obj.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            return this.id == itemInner.id && Objects.equals(this.text, itemInner.text);
        }
    }

    public final class ListAdapter extends AdapterWithDiffUtils {
        public ListAdapter() {
        }

        @Override
        public final int getItemCount() {
            return ArchiveSettingsActivity.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            if (i < 0) {
                return 0;
            }
            ArchiveSettingsActivity archiveSettingsActivity = ArchiveSettingsActivity.this;
            if (i >= archiveSettingsActivity.items.size()) {
                return 0;
            }
            return ((ItemInner) archiveSettingsActivity.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return (i == 2 || i == 0) ? false : true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            if (i >= 0) {
                ArchiveSettingsActivity archiveSettingsActivity = ArchiveSettingsActivity.this;
                ArrayList arrayList = archiveSettingsActivity.items;
                if (i >= arrayList.size()) {
                    return;
                }
                ItemInner itemInner = (ItemInner) arrayList.get(i);
                int i2 = i + 1;
                int i3 = 0;
                boolean z2 = i2 < arrayList.size() && ((ItemInner) arrayList.get(i2)).viewType == itemInner.viewType;
                int i4 = viewHolder.mItemViewType;
                View view = viewHolder.itemView;
                if (i4 == 0) {
                    ((HeaderCell) view).setText(itemInner.text);
                    return;
                }
                if (i4 == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (TextUtils.isEmpty(itemInner.text)) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                        return;
                    } else {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                        return;
                    }
                }
                if (i4 == 1) {
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    int i5 = itemInner.id;
                    if (i5 == 1) {
                        z = archiveSettingsActivity.settings.keep_archived_unmuted;
                        textCheckCell.setCheckBoxIcon(0);
                    } else if (i5 == 4) {
                        z = archiveSettingsActivity.settings.keep_archived_folders;
                        textCheckCell.setCheckBoxIcon(0);
                    } else {
                        if (i5 != 7) {
                            return;
                        }
                        boolean z3 = archiveSettingsActivity.settings.archive_and_mute_new_noncontact_peers;
                        if (!archiveSettingsActivity.getUserConfig().isPremium() && !archiveSettingsActivity.getMessagesController().autoarchiveAvailable) {
                            i3 = R.drawable.permission_locked;
                        }
                        textCheckCell.setCheckBoxIcon(i3);
                        z = z3;
                    }
                    textCheckCell.setTextAndCheck(itemInner.text, z, z2);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCheckCell;
            ArchiveSettingsActivity archiveSettingsActivity = ArchiveSettingsActivity.this;
            if (i == 0) {
                textCheckCell = new HeaderCell(archiveSettingsActivity.getParentActivity());
            } else {
                textCheckCell = i == 1 ? new TextCheckCell(archiveSettingsActivity.getParentActivity()) : new TextInfoPrivacyCell(archiveSettingsActivity.getParentActivity(), 24, null);
            }
            return new RecyclerListView.Holder(textCheckCell);
        }
    }

    public ArchiveSettingsActivity() {
        super(null);
        this.changed = false;
        this.shiftDp = -3;
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new PhotoViewer.AnonymousClass36(1, 2, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter();
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 2));
        getContactsController().loadGlobalPrivacySetting();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.settings = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.settings = new TLRPC.TL_globalPrivacySettings();
        }
        updateItems(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.privacyRulesUpdated) {
            if (i == NotificationCenter.dialogFiltersUpdated) {
                updateItems(true);
                return;
            }
            return;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.settings = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.settings = new TLRPC.TL_globalPrivacySettings();
        }
        if (this.listView != null) {
            for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                View childAt = this.listView.getChildAt(i3);
                this.listView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    ArrayList arrayList = this.items;
                    if (childAdapterPosition < arrayList.size()) {
                        int i4 = ((ItemInner) arrayList.get(childAdapterPosition)).id;
                        if (i4 == 1) {
                            ((TextCheckCell) childAt).setChecked(this.settings.keep_archived_unmuted);
                        } else if (i4 == 4) {
                            ((TextCheckCell) childAt).setChecked(this.settings.keep_archived_folders);
                        } else if (i4 == 7) {
                            ((TextCheckCell) childAt).setChecked(this.settings.archive_and_mute_new_noncontact_peers);
                        }
                    }
                }
            }
        }
        this.changed = false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        super.onFragmentDestroy();
        if (this.changed) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.settings;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new PassportActivity$$ExternalSyntheticLambda1(1));
            this.changed = false;
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void updateItems(boolean z) {
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new ItemInner(0, 0, LocaleController.getString("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new ItemInner(1, 1, LocaleController.getString("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new ItemInner(2, 2, LocaleController.getString("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().getDialogFilters().size() > 1) {
            arrayList2.add(new ItemInner(0, 3, LocaleController.getString("ArchiveSettingUnmutedChats")));
            arrayList2.add(new ItemInner(1, 4, LocaleController.getString("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new ItemInner(2, 5, LocaleController.getString("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new ItemInner(0, 6, LocaleController.getString("NewChatsFromNonContacts")));
        arrayList2.add(new ItemInner(1, 7, LocaleController.getString("NewChatsFromNonContactsCheck")));
        arrayList2.add(new ItemInner(2, 8, LocaleController.getString("ArchiveAndMuteInfo")));
        ListAdapter listAdapter = this.adapter;
        if (listAdapter == null) {
            return;
        }
        if (z) {
            listAdapter.setItems(arrayList, arrayList2);
        } else {
            listAdapter.mObservable.notifyChanged();
        }
    }
}

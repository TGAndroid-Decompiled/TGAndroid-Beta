package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TopicExceptionCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;

public final class TopicsNotifySettingsFragments extends BaseFragment {
    public Adapter adapter;
    public long dialogId;
    public HashSet exceptionsTopics;
    public final ArrayList items;
    public RecyclerListView recyclerListView;

    public final class AnonymousClass2 implements RecyclerListView.OnItemClickListener {

        public final class AnonymousClass1 implements ProfileNotificationsActivity.ProfileNotificationsActivityDelegate {
            public final TLRPC.TL_forumTopic val$topic;

            public AnonymousClass1(TLRPC.TL_forumTopic tL_forumTopic) {
                this.val$topic = tL_forumTopic;
            }

            @Override
            public final void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
            }

            @Override
            public final void didRemoveException() {
                TopicsNotifySettingsFragments topicsNotifySettingsFragments = TopicsNotifySettingsFragments.this;
                TLRPC.TL_forumTopic tL_forumTopic = this.val$topic;
                topicsNotifySettingsFragments.removeException(tL_forumTopic.id);
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(16, this, tL_forumTopic), 300L);
            }
        }

        public AnonymousClass2() {
        }

        @Override
        public final void onItemClick(int i, View view) {
            TopicsNotifySettingsFragments topicsNotifySettingsFragments = TopicsNotifySettingsFragments.this;
            ArrayList arrayList = topicsNotifySettingsFragments.items;
            if (((Item) arrayList.get(i)).viewType == 1) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -topicsNotifySettingsFragments.dialogId);
                bundle.putBoolean("for_select", true);
                TopicsFragment topicsFragment = new TopicsFragment(bundle);
                topicsFragment.excludeTopics = topicsNotifySettingsFragments.exceptionsTopics;
                topicsFragment.onTopicSelectedListener = new TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda0(this);
                topicsNotifySettingsFragments.presentFragment(topicsFragment);
            }
            if (((Item) arrayList.get(i)).viewType == 2) {
                TLRPC.TL_forumTopic tL_forumTopic = ((Item) arrayList.get(i)).topic;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("dialog_id", topicsNotifySettingsFragments.dialogId);
                bundle2.putLong("topic_id", tL_forumTopic.id);
                bundle2.putBoolean("exception", false);
                ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle2, null);
                profileNotificationsActivity.delegate = new AnonymousClass1(tL_forumTopic);
                topicsNotifySettingsFragments.presentFragment(profileNotificationsActivity);
            }
            if (((Item) arrayList.get(i)).viewType == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(topicsNotifySettingsFragments.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda0(this));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                topicsNotifySettingsFragments.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
        }
    }

    public final class Adapter extends AdapterWithDiffUtils {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return TopicsNotifySettingsFragments.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((Item) TopicsNotifySettingsFragments.this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 1 || i == 2 || i == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TopicsNotifySettingsFragments topicsNotifySettingsFragments = TopicsNotifySettingsFragments.this;
            ArrayList arrayList = topicsNotifySettingsFragments.items;
            if (((Item) arrayList.get(i)).viewType == 2) {
                TopicExceptionCell topicExceptionCell = (TopicExceptionCell) viewHolder.itemView;
                long j = topicsNotifySettingsFragments.dialogId;
                TLRPC.TL_forumTopic tL_forumTopic = ((Item) arrayList.get(i)).topic;
                ForumUtilities.setTopicIcon(topicExceptionCell.backupImageView, tL_forumTopic, false, false, null);
                BackupImageView backupImageView = topicExceptionCell.backupImageView;
                if (backupImageView != null && backupImageView.getImageReceiver() != null && (backupImageView.getImageReceiver().getDrawable() instanceof ForumUtilities.GeneralTopicDrawable)) {
                    ((ForumUtilities.GeneralTopicDrawable) backupImageView.getImageReceiver().getDrawable()).setColor(Theme.getColor(null, Theme.key_chats_archiveBackground, false));
                }
                topicExceptionCell.title.setText(tL_forumTopic.title);
                topicExceptionCell.subtitle.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j, tL_forumTopic.id));
                topicExceptionCell.drawDivider = i == arrayList.size() - 1 || ((Item) arrayList.get(i + 1)).viewType == 2;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View view = null;
            if (i == 1) {
                TextCell textCell = new TextCell(viewGroup.getContext());
                textCell.setTextAndIcon(R.drawable.msg_contact_add, (CharSequence) LocaleController.getString(R.string.NotificationsAddAnException), true);
                textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                shadowSectionCell = textCell;
            } else if (i == 2) {
                TopicExceptionCell topicExceptionCell = new TopicExceptionCell(viewGroup.getContext());
                topicExceptionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                shadowSectionCell = topicExceptionCell;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        TextCell textCell2 = new TextCell(viewGroup.getContext());
                        textCell2.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        textCell2.setColors(-1, Theme.key_text_RedRegular);
                        textCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        shadowSectionCell = textCell2;
                    }
                    return zzkl.m(view, view);
                }
                shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), (Object) null);
            }
            view = shadowSectionCell;
            return zzkl.m(view, view);
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final TLRPC.TL_forumTopic topic;

        public Item(int i, TLRPC.TL_forumTopic tL_forumTopic) {
            super(i, false);
            this.topic = tL_forumTopic;
        }

        public final boolean equals(Object obj) {
            TLRPC.TL_forumTopic tL_forumTopic;
            if (this == obj) {
                return true;
            }
            if (obj == null || Item.class != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.viewType != item.viewType) {
                return false;
            }
            TLRPC.TL_forumTopic tL_forumTopic2 = this.topic;
            return tL_forumTopic2 == null || (tL_forumTopic = item.topic) == null || tL_forumTopic2.id == tL_forumTopic.id;
        }
    }

    public TopicsNotifySettingsFragments(Bundle bundle) {
        super(bundle);
        this.items = new ArrayList();
        this.exceptionsTopics = new HashSet();
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zzkt.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 1));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.recyclerListView = new RecyclerListView(context, null);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        zzku.m(this.recyclerListView);
        RecyclerListView recyclerListView = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new AnonymousClass2());
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.dialogId = this.arguments.getLong("dialog_id");
        updateRows$29();
        return super.onFragmentCreate();
    }

    public final void removeException(int i) {
        getNotificationsController().getNotificationsSettingsFacade().clearPreference(this.dialogId, i);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = getMessagesController().getInputPeer(this.dialogId);
        tL_inputNotifyForumTopic.top_msg_id = i;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        getConnectionsManager().sendRequest(updatenotifysettings, new PassportActivity$$ExternalSyntheticLambda1(1));
    }

    public final void updateRows$29() {
        ArrayList arrayList;
        int i = 0;
        boolean z = (this.isPaused || this.adapter == null) ? false : true;
        ArrayList arrayList2 = this.items;
        if (z) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new Item(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.dialogId);
        if (topics != null) {
            int i2 = 0;
            while (i < topics.size()) {
                if (this.exceptionsTopics.contains(Integer.valueOf(topics.get(i).id))) {
                    arrayList2.add(new Item(2, topics.get(i)));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            arrayList2.add(new Item(3, null));
            arrayList2.add(new Item(4, null));
        }
        arrayList2.add(new Item(3, null));
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.setItems(arrayList, arrayList2);
        }
    }
}

package org.telegram.p009ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BackDrawable;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCell;
import org.telegram.p009ui.Cells.TopicExceptionCell;
import org.telegram.p009ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.NotificationsSettingsActivity;
import org.telegram.p009ui.ProfileNotificationsActivity;
import org.telegram.p009ui.TopicsFragment;
import org.telegram.p009ui.TopicsNotifySettingsFragments;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_updateNotifySettings;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_inputNotifyForumTopic;
import org.telegram.tgnet.TLRPC$TL_inputPeerNotifySettings;

public class TopicsNotifySettingsFragments extends BaseFragment {
    Adapter adapter;
    long dialogId;
    HashSet<Integer> exceptionsTopics;
    ArrayList<Item> items;
    RecyclerListView recyclerListView;

    public static void lambda$removeException$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public TopicsNotifySettingsFragments(Bundle bundle) {
        super(bundle);
        this.items = new ArrayList<>();
        this.exceptionsTopics = new HashSet<>();
    }

    @Override
    public View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    TopicsNotifySettingsFragments.this.finishFragment();
                }
            }
        });
        this.actionBar.setTitle(LocaleController.getString(C1072R.string.NotificationsExceptions));
        this.recyclerListView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new C42162());
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        return this.fragmentView;
    }

    public class C42162 implements RecyclerListView.OnItemClickListener {
        C42162() {
        }

        @Override
        public void onItemClick(View view, int i) {
            if (TopicsNotifySettingsFragments.this.items.get(i).viewType == 1) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -TopicsNotifySettingsFragments.this.dialogId);
                bundle.putBoolean("for_select", true);
                TopicsFragment topicsFragment = new TopicsFragment(bundle);
                topicsFragment.setExcludeTopics(TopicsNotifySettingsFragments.this.exceptionsTopics);
                topicsFragment.setOnTopicSelectedListener(new TopicsFragment.OnTopicSelectedListener() {
                    @Override
                    public final void onTopicSelected(TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
                        TopicsNotifySettingsFragments.C42162.this.lambda$onItemClick$1(tLRPC$TL_forumTopic);
                    }
                });
                TopicsNotifySettingsFragments.this.presentFragment(topicsFragment);
            }
            if (TopicsNotifySettingsFragments.this.items.get(i).viewType == 2) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = TopicsNotifySettingsFragments.this.items.get(i).topic;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("dialog_id", TopicsNotifySettingsFragments.this.dialogId);
                bundle2.putInt("topic_id", tLRPC$TL_forumTopic.f910id);
                bundle2.putBoolean("exception", false);
                ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle2);
                profileNotificationsActivity.setDelegate(new C42171(tLRPC$TL_forumTopic));
                TopicsNotifySettingsFragments.this.presentFragment(profileNotificationsActivity);
            }
            if (TopicsNotifySettingsFragments.this.items.get(i).viewType == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TopicsNotifySettingsFragments.this.getParentActivity());
                builder.setTitle(LocaleController.getString("NotificationsDeleteAllExceptionTitle", C1072R.string.NotificationsDeleteAllExceptionTitle));
                builder.setMessage(LocaleController.getString("NotificationsDeleteAllExceptionAlert", C1072R.string.NotificationsDeleteAllExceptionAlert));
                builder.setPositiveButton(LocaleController.getString("Delete", C1072R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        TopicsNotifySettingsFragments.C42162.this.lambda$onItemClick$2(dialogInterface, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
                AlertDialog create = builder.create();
                TopicsNotifySettingsFragments.this.showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        }

        public void lambda$onItemClick$1(final TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", TopicsNotifySettingsFragments.this.dialogId);
            bundle.putInt("topic_id", tLRPC$TL_forumTopic.f910id);
            bundle.putBoolean("exception", true);
            ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle);
            profileNotificationsActivity.setDelegate(new ProfileNotificationsActivity.ProfileNotificationsActivityDelegate() {
                @Override
                public final void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
                    TopicsNotifySettingsFragments.C42162.this.lambda$onItemClick$0(tLRPC$TL_forumTopic, notificationException);
                }

                @Override
                public void didRemoveException(long j) {
                    ProfileNotificationsActivity.ProfileNotificationsActivityDelegate.CC.$default$didRemoveException(this, j);
                }
            });
            TopicsNotifySettingsFragments.this.presentFragment(profileNotificationsActivity);
        }

        public void lambda$onItemClick$0(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, NotificationsSettingsActivity.NotificationException notificationException) {
            TopicsNotifySettingsFragments.this.exceptionsTopics.add(Integer.valueOf(tLRPC$TL_forumTopic.f910id));
            TopicsNotifySettingsFragments.this.updateRows();
        }

        public class C42171 implements ProfileNotificationsActivity.ProfileNotificationsActivityDelegate {
            final TLRPC$TL_forumTopic val$topic;

            @Override
            public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
            }

            C42171(TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
                this.val$topic = tLRPC$TL_forumTopic;
            }

            @Override
            public void didRemoveException(long j) {
                TopicsNotifySettingsFragments.this.removeException(this.val$topic.f910id);
                final TLRPC$TL_forumTopic tLRPC$TL_forumTopic = this.val$topic;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TopicsNotifySettingsFragments.C42162.C42171.this.lambda$didRemoveException$0(tLRPC$TL_forumTopic);
                    }
                }, 300L);
            }

            public void lambda$didRemoveException$0(TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
                TopicsNotifySettingsFragments.this.exceptionsTopics.remove(Integer.valueOf(tLRPC$TL_forumTopic.f910id));
                TopicsNotifySettingsFragments.this.updateRows();
            }
        }

        public void lambda$onItemClick$2(DialogInterface dialogInterface, int i) {
            Iterator<Integer> it = TopicsNotifySettingsFragments.this.exceptionsTopics.iterator();
            while (it.hasNext()) {
                TopicsNotifySettingsFragments.this.removeException(it.next().intValue());
            }
            TopicsNotifySettingsFragments.this.exceptionsTopics.clear();
            TopicsNotifySettingsFragments.this.updateRows();
        }
    }

    public void removeException(int i) {
        getNotificationsController().getNotificationsSettingsFacade().clearPreference(this.dialogId, i);
        TLRPC$TL_account_updateNotifySettings tLRPC$TL_account_updateNotifySettings = new TLRPC$TL_account_updateNotifySettings();
        tLRPC$TL_account_updateNotifySettings.settings = new TLRPC$TL_inputPeerNotifySettings();
        TLRPC$TL_inputNotifyForumTopic tLRPC$TL_inputNotifyForumTopic = new TLRPC$TL_inputNotifyForumTopic();
        tLRPC$TL_inputNotifyForumTopic.peer = getMessagesController().getInputPeer(this.dialogId);
        tLRPC$TL_inputNotifyForumTopic.top_msg_id = i;
        tLRPC$TL_account_updateNotifySettings.peer = tLRPC$TL_inputNotifyForumTopic;
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateNotifySettings, TopicsNotifySettingsFragments$$ExternalSyntheticLambda0.INSTANCE);
    }

    @Override
    public boolean onFragmentCreate() {
        this.dialogId = this.arguments.getLong("dialog_id");
        updateRows();
        return super.onFragmentCreate();
    }

    public void updateRows() {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList;
        int i = 0;
        if ((this.isPaused || this.adapter == null) ? false : true) {
            arrayList = new ArrayList<>();
            arrayList.addAll(this.items);
        } else {
            arrayList = null;
        }
        this.items.clear();
        this.items.add(new Item(1, null));
        ArrayList<TLRPC$TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.dialogId);
        if (topics != null) {
            int i2 = 0;
            while (i < topics.size()) {
                if (this.exceptionsTopics.contains(Integer.valueOf(topics.get(i).f910id))) {
                    this.items.add(new Item(2, topics.get(i)));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            this.items.add(new Item(3, null));
            this.items.add(new Item(4, null));
        }
        this.items.add(new Item(3, null));
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.setItems(arrayList, this.items);
        }
    }

    public void setExceptions(HashSet<Integer> hashSet) {
        this.exceptionsTopics = hashSet;
    }

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextCell textCell = null;
            if (i == 1) {
                TextCell textCell2 = new TextCell(viewGroup.getContext());
                textCell2.setTextAndIcon(LocaleController.getString("NotificationsAddAnException", C1072R.string.NotificationsAddAnException), C1072R.C1073drawable.msg_contact_add, true);
                textCell2.setColors("windowBackgroundWhiteBlueIcon", "windowBackgroundWhiteBlueButton");
                textCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCell = textCell2;
            } else if (i == 2) {
                TopicExceptionCell topicExceptionCell = new TopicExceptionCell(viewGroup.getContext());
                topicExceptionCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCell = topicExceptionCell;
            } else if (i == 3) {
                textCell = new ShadowSectionCell(viewGroup.getContext());
            } else if (i == 4) {
                TextCell textCell3 = new TextCell(viewGroup.getContext());
                textCell3.setText(LocaleController.getString("NotificationsDeleteAllException", C1072R.string.NotificationsDeleteAllException), false);
                textCell3.setColors(null, "windowBackgroundWhiteRedText5");
                textCell3.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCell = textCell3;
            }
            textCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(textCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (TopicsNotifySettingsFragments.this.items.get(i).viewType == 2) {
                TopicExceptionCell topicExceptionCell = (TopicExceptionCell) viewHolder.itemView;
                TopicsNotifySettingsFragments topicsNotifySettingsFragments = TopicsNotifySettingsFragments.this;
                topicExceptionCell.setTopic(topicsNotifySettingsFragments.dialogId, topicsNotifySettingsFragments.items.get(i).topic);
                boolean z = true;
                if (i != TopicsNotifySettingsFragments.this.items.size() - 1 && TopicsNotifySettingsFragments.this.items.get(i + 1).viewType != 2) {
                    z = false;
                }
                topicExceptionCell.drawDivider = z;
            }
        }

        @Override
        public int getItemCount() {
            return TopicsNotifySettingsFragments.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return TopicsNotifySettingsFragments.this.items.get(i).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 2 || viewHolder.getItemViewType() == 4;
        }
    }

    public class Item extends AdapterWithDiffUtils.Item {
        final TLRPC$TL_forumTopic topic;

        private Item(TopicsNotifySettingsFragments topicsNotifySettingsFragments, int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            super(i, false);
            this.topic = tLRPC$TL_forumTopic;
        }

        public boolean equals(Object obj) {
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
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
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = this.topic;
            return tLRPC$TL_forumTopic2 == null || (tLRPC$TL_forumTopic = item.topic) == null || tLRPC$TL_forumTopic2.f910id == tLRPC$TL_forumTopic.f910id;
        }
    }
}

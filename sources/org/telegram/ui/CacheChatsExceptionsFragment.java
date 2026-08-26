package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;

public class CacheChatsExceptionsFragment extends BaseFragment {
    public Adapter adapter;
    public int currentType;
    public ArrayList exceptionsDialogs;
    public final ArrayList items;
    public RecyclerListView recyclerListView;

    public final class Adapter extends AdapterWithDiffUtils {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return CacheChatsExceptionsFragment.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((Item) CacheChatsExceptionsFragment.this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 1 || i == 2 || i == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            CacheChatsExceptionsFragment cacheChatsExceptionsFragment = CacheChatsExceptionsFragment.this;
            ArrayList arrayList = cacheChatsExceptionsFragment.items;
            if (((Item) arrayList.get(i)).viewType == 2) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                CacheByChatsController.KeepMediaException keepMediaException = ((Item) arrayList.get(i)).exception;
                TLObject userOrChat = cacheChatsExceptionsFragment.getMessagesController().getUserOrChat(keepMediaException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    string = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    string = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                boolean z = true;
                userCell.setSelfAsSavedMessages(true);
                String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
                if (i != arrayList.size() - 1 && ((Item) arrayList.get(i + 1)).viewType != 2) {
                    z = false;
                }
                userCell.setData(userOrChat, string, keepMediaString, z);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View view = null;
            if (i != 1) {
                if (i == 2) {
                    UserCell userCell = new UserCell(4, 0, viewGroup.getContext(), null, false, false);
                    userCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = userCell;
                } else if (i == 3) {
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), (Object) null);
                } else if (i == 4) {
                    TextCell textCell = new TextCell(viewGroup.getContext());
                    textCell.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    textCell.setColors(-1, Theme.key_text_RedRegular);
                    textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCell;
                }
                return zzkl.m(view, view);
            }
            TextCell textCell2 = new TextCell(viewGroup.getContext());
            textCell2.setTextAndIcon(R.drawable.msg_contact_add, (CharSequence) LocaleController.getString(R.string.NotificationsAddAnException), true);
            textCell2.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            textCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            shadowSectionCell = textCell2;
            view = shadowSectionCell;
            return zzkl.m(view, view);
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final CacheByChatsController.KeepMediaException exception;

        public Item(int i, CacheByChatsController.KeepMediaException keepMediaException) {
            super(i, false);
            this.exception = keepMediaException;
        }

        public final boolean equals(Object obj) {
            CacheByChatsController.KeepMediaException keepMediaException;
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
            CacheByChatsController.KeepMediaException keepMediaException2 = this.exception;
            return keepMediaException2 == null || (keepMediaException = item.exception) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
        }
    }

    public CacheChatsExceptionsFragment(Bundle bundle) {
        super(bundle);
        this.items = new ArrayList();
        this.exceptionsDialogs = new ArrayList();
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zzkt.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 13));
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
        this.recyclerListView.setOnItemClickListener(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 25));
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        updateRows$24();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.currentType = getArguments().getInt("type");
        updateRows$24();
        return super.onFragmentCreate();
    }

    public final void updateRows$24() {
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
        ArrayList arrayList3 = this.exceptionsDialogs;
        int size = arrayList3.size();
        boolean z2 = false;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(new Item(2, (CacheByChatsController.KeepMediaException) obj));
            z2 = true;
        }
        if (z2) {
            arrayList2.add(new Item(3, null));
            arrayList2.add(new Item(4, null));
        }
        arrayList2.add(new Item(3, null));
        Adapter adapter = this.adapter;
        if (adapter != null) {
            if (arrayList != null) {
                adapter.setItems(arrayList, arrayList2);
            } else {
                adapter.mObservable.notifyChanged();
            }
        }
    }
}

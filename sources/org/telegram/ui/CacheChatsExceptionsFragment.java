package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;

public class CacheChatsExceptionsFragment extends BaseFragment {
    private final int VIEW_TYPE_ADD_EXCEPTION;
    private final int VIEW_TYPE_CHAT;
    private final int VIEW_TYPE_DELETE_ALL;
    private final int VIEW_TYPE_DIVIDER;
    Adapter adapter;
    int currentType;
    ArrayList<CacheByChatsController.KeepMediaException> exceptionsDialogs;
    ArrayList<Item> items;
    RecyclerListView recyclerListView;

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public int getItemCount() {
            return CacheChatsExceptionsFragment.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return CacheChatsExceptionsFragment.this.items.get(i).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 2 || viewHolder.getItemViewType() == 4;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            if (CacheChatsExceptionsFragment.this.items.get(i).viewType == 2) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                CacheByChatsController.KeepMediaException keepMediaException = CacheChatsExceptionsFragment.this.items.get(i).exception;
                TLObject userOrChat = CacheChatsExceptionsFragment.this.getMessagesController().getUserOrChat(keepMediaException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    string = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    string = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                String str = string;
                userCell.setSelfAsSavedMessages(true);
                userCell.setData(userOrChat, str, CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia), 0, i == CacheChatsExceptionsFragment.this.items.size() - 1 || CacheChatsExceptionsFragment.this.items.get(i + 1).viewType == 2);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View view = null;
            if (i != 1) {
                if (i == 2) {
                    UserCell userCell = new UserCell(4, 0, viewGroup.getContext(), null, false, false);
                    userCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = userCell;
                } else if (i == 3) {
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), null, 0);
                } else if (i == 4) {
                    TextCell textCell = new TextCell(viewGroup.getContext());
                    textCell.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    textCell.setColors(-1, Theme.key_text_RedRegular);
                    textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCell;
                }
                return zzkd.m(view, view, -2);
            }
            TextCell textCell2 = new TextCell(viewGroup.getContext());
            textCell2.setTextAndIcon((CharSequence) LocaleController.getString(R.string.NotificationsAddAnException), R.drawable.msg_contact_add, true);
            textCell2.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            textCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            shadowSectionCell = textCell2;
            view = shadowSectionCell;
            return zzkd.m(view, view, -2);
        }
    }

    public class Item extends AdapterWithDiffUtils.Item {
        final CacheByChatsController.KeepMediaException exception;

        public boolean equals(Object obj) {
            CacheByChatsController.KeepMediaException keepMediaException;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.viewType != item.viewType) {
                return false;
            }
            CacheByChatsController.KeepMediaException keepMediaException2 = this.exception;
            return keepMediaException2 == null || (keepMediaException = item.exception) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
        }

        private Item(int i, CacheByChatsController.KeepMediaException keepMediaException) {
            super(i, false);
            this.exception = keepMediaException;
        }
    }

    public CacheChatsExceptionsFragment(Bundle bundle) {
        super(bundle);
        this.VIEW_TYPE_ADD_EXCEPTION = 1;
        this.VIEW_TYPE_CHAT = 2;
        this.VIEW_TYPE_DIVIDER = 3;
        this.VIEW_TYPE_DELETE_ALL = 4;
        this.items = new ArrayList<>();
        this.exceptionsDialogs = new ArrayList<>();
    }

    public boolean lambda$createView$0(DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        dialogsActivity.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= arrayList.size()) {
                break;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.exceptionsDialogs.size()) {
                    z3 = false;
                    break;
                }
                if (this.exceptionsDialogs.get(i5).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId) {
                    keepMediaException = this.exceptionsDialogs.get(i5);
                    break;
                }
                i5++;
            }
            if (!z3) {
                int i6 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (getMessagesController().getCacheByChatsController().getKeepMedia(this.currentType) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i6 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList<CacheByChatsController.KeepMediaException> arrayList2 = this.exceptionsDialogs;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId, i6);
                arrayList2.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i4++;
        }
        getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(this.currentType, this.exceptionsDialogs);
        updateRows();
        if (keepMediaException != null) {
            for (int i7 = 0; i7 < this.items.size(); i7++) {
                if (this.items.get(i7).exception != null && this.items.get(i7).exception.dialogId == keepMediaException.dialogId) {
                    i3 = i7;
                    break;
                }
            }
            this.recyclerListView.scrollToPosition(i3);
            showPopupFor(keepMediaException);
        }
        return true;
    }

    public void lambda$createView$1(CacheByChatsController.KeepMediaException keepMediaException, int i, int i2) {
        if (i2 == CacheByChatsController.KEEP_MEDIA_DELETE) {
            this.exceptionsDialogs.remove(keepMediaException);
            updateRows();
        } else {
            keepMediaException.keepMedia = i2;
            AndroidUtilities.updateVisibleRows(this.recyclerListView);
        }
        getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(this.currentType, this.exceptionsDialogs);
    }

    public void lambda$createView$2() {
        this.exceptionsDialogs.clear();
        getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(this.currentType, this.exceptionsDialogs);
        updateRows();
        finishFragment();
    }

    public void lambda$createView$3(View view, int i, float f, float f2) {
        if (this.items.get(i).viewType != 1) {
            if (this.items.get(i).viewType == 2) {
                CacheByChatsController.KeepMediaException keepMediaException = this.items.get(i).exception;
                KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(this, view.getContext());
                keepMediaPopupView.updateForDialog(false);
                keepMediaPopupView.setParentWindow(AlertsCreator.createSimplePopup(this, keepMediaPopupView, view, f, f2));
                keepMediaPopupView.setCallback(new CacheChatsExceptionsFragment$$ExternalSyntheticLambda1(this, 1, keepMediaException));
                return;
            }
            if (this.items.get(i).viewType == 4) {
                AlertDialog alertDialogCreate = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new VoIPFragment$8$$ExternalSyntheticLambda1(this, 27), null).create();
                alertDialogCreate.show();
                alertDialogCreate.redPositive();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        int i2 = this.currentType;
        if (i2 == 1) {
            bundle.putInt("dialogsType", 6);
        } else if (i2 == 2) {
            bundle.putInt("dialogsType", 5);
        } else {
            bundle.putInt("dialogsType", 4);
        }
        bundle.putBoolean("allowGlobalSearch", false);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new WearAuthSheet$$ExternalSyntheticLambda3(21, this, dialogsActivity));
        presentFragment(dialogsActivity);
    }

    public void lambda$showPopupFor$4(CacheByChatsController.KeepMediaException keepMediaException, int i, int i2) {
        keepMediaException.keepMedia = i2;
        getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(this.currentType, this.exceptionsDialogs);
        AndroidUtilities.updateVisibleRows(this.recyclerListView);
    }

    public void lambda$showPopupFor$5(CacheByChatsController.KeepMediaException keepMediaException) {
        int i = 0;
        for (int i2 = 0; i2 < this.items.size(); i2++) {
            if (this.items.get(i2).exception != null && this.items.get(i2).exception.dialogId == keepMediaException.dialogId) {
                i = i2;
                break;
            }
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.recyclerListView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(this, getContext());
            keepMediaPopupView.updateForDialog(true);
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            keepMediaPopupView.setParentWindow(AlertsCreator.createSimplePopup(this, keepMediaPopupView, view, view.getMeasuredWidth() / 2.0f, viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredHeight() / 2.0f));
            keepMediaPopupView.setCallback(new CacheChatsExceptionsFragment$$ExternalSyntheticLambda1(this, 0, keepMediaException));
        }
    }

    private void updateRows() {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList;
        int i = 0;
        int i2 = 1;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        if ((this.isPaused || this.adapter == null) ? false : true) {
            arrayList = new ArrayList<>();
            arrayList.addAll(this.items);
        } else {
            arrayList = null;
        }
        this.items.clear();
        this.items.add(new Item(i2, keepMediaException));
        ArrayList<CacheByChatsController.KeepMediaException> arrayList2 = this.exceptionsDialogs;
        int size = arrayList2.size();
        boolean z = false;
        while (i < size) {
            CacheByChatsController.KeepMediaException keepMediaException2 = arrayList2.get(i);
            i++;
            this.items.add(new Item(2, keepMediaException2));
            z = true;
        }
        int i3 = 3;
        if (z) {
            this.items.add(new Item(i3, objArr6 == true ? 1 : 0));
            this.items.add(new Item(4, objArr4 == true ? 1 : 0));
        }
        this.items.add(new Item(i3, objArr2 == true ? 1 : 0));
        Adapter adapter = this.adapter;
        if (adapter != null) {
            if (arrayList != null) {
                adapter.setItems(arrayList, this.items);
            } else {
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zzki.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    CacheChatsExceptionsFragment.this.finishFragment();
                }
            }
        });
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.recyclerListView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.recyclerListView, false);
        RecyclerListView recyclerListView = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda4(this, 3));
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        updateRows();
        return this.fragmentView;
    }

    @Override
    public boolean onFragmentCreate() {
        this.currentType = getArguments().getInt("type");
        updateRows();
        return super.onFragmentCreate();
    }

    public void setExceptions(ArrayList<CacheByChatsController.KeepMediaException> arrayList) {
        this.exceptionsDialogs = arrayList;
        updateRows();
    }

    public void showPopupFor(CacheByChatsController.KeepMediaException keepMediaException) {
        AndroidUtilities.runOnUIThread(new KeepMediaPopupView$$ExternalSyntheticLambda0(this, 1, keepMediaException), 150L);
    }
}

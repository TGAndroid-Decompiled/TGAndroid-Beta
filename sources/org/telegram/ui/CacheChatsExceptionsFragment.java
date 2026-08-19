package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.ActionBar.BackDrawable;
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
    ArrayList exceptionsDialogs;
    ArrayList items;
    RecyclerListView recyclerListView;

    public CacheChatsExceptionsFragment(Bundle bundle) {
        super(bundle);
        this.VIEW_TYPE_ADD_EXCEPTION = 1;
        this.VIEW_TYPE_CHAT = 2;
        this.VIEW_TYPE_DIVIDER = 3;
        this.VIEW_TYPE_DELETE_ALL = 4;
        this.items = new ArrayList();
        this.exceptionsDialogs = new ArrayList();
    }

    @Override
    public View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
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
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
            }

            @Override
            public void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i, float f, float f2) {
                CacheChatsExceptionsFragment.$r8$lambda$ahpzqgAYT8EcHLiqTiKMnhi1XDQ(this.f$0, view, i, f, f2);
            }
        });
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        updateRows();
        return this.fragmentView;
    }

    public static void $r8$lambda$ahpzqgAYT8EcHLiqTiKMnhi1XDQ(final CacheChatsExceptionsFragment cacheChatsExceptionsFragment, View view, int i, float f, float f2) {
        if (((Item) cacheChatsExceptionsFragment.items.get(i)).viewType == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i2 = cacheChatsExceptionsFragment.currentType;
            if (i2 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i2 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            final DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                }

                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i3, int i4, TopicsFragment topicsFragment) {
                    return CacheChatsExceptionsFragment.m1416$r8$lambda$ZbRlHZgNb8zBrVy_2YDlhOFLI(this.f$0, dialogsActivity, dialogsActivity2, arrayList, charSequence, z, z2, i3, i4, topicsFragment);
                }

                @Override
                public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            cacheChatsExceptionsFragment.presentFragment(dialogsActivity);
            return;
        }
        if (((Item) cacheChatsExceptionsFragment.items.get(i)).viewType == 2) {
            final CacheByChatsController.KeepMediaException keepMediaException = ((Item) cacheChatsExceptionsFragment.items.get(i)).exception;
            KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(cacheChatsExceptionsFragment, view.getContext());
            keepMediaPopupView.updateForDialog(false);
            keepMediaPopupView.setParentWindow(AlertsCreator.createSimplePopup(cacheChatsExceptionsFragment, keepMediaPopupView, view, f, f2));
            keepMediaPopupView.setCallback(new KeepMediaPopupView.Callback() {
                @Override
                public final void onKeepMediaChange(int i3, int i4) {
                    CacheChatsExceptionsFragment.m1417$r8$lambda$zMD6Dd4_Zot_McJfsgLFFYkog(this.f$0, keepMediaException, i3, i4);
                }
            });
            return;
        }
        if (((Item) cacheChatsExceptionsFragment.items.get(i)).viewType == 4) {
            AlertDialog alertDialogCreate = AlertsCreator.createSimpleAlert(cacheChatsExceptionsFragment.getContext(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new Runnable() {
                @Override
                public final void run() {
                    CacheChatsExceptionsFragment.$r8$lambda$wYSHLtrdb74JT_xBF51_bQT2SEg(this.f$0);
                }
            }, null).create();
            alertDialogCreate.show();
            alertDialogCreate.redPositive();
        }
    }

    public static boolean m1416$r8$lambda$ZbRlHZgNb8zBrVy_2YDlhOFLI(CacheChatsExceptionsFragment cacheChatsExceptionsFragment, DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        cacheChatsExceptionsFragment.getClass();
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
                if (i5 >= cacheChatsExceptionsFragment.exceptionsDialogs.size()) {
                    z3 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) cacheChatsExceptionsFragment.exceptionsDialogs.get(i5)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) cacheChatsExceptionsFragment.exceptionsDialogs.get(i5);
                    break;
                }
                i5++;
            }
            if (!z3) {
                int i6 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().getKeepMedia(cacheChatsExceptionsFragment.currentType) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i6 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList2 = cacheChatsExceptionsFragment.exceptionsDialogs;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId, i6);
                arrayList2.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i4++;
        }
        cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
        cacheChatsExceptionsFragment.updateRows();
        if (keepMediaException != null) {
            for (int i7 = 0; i7 < cacheChatsExceptionsFragment.items.size(); i7++) {
                if (((Item) cacheChatsExceptionsFragment.items.get(i7)).exception != null && ((Item) cacheChatsExceptionsFragment.items.get(i7)).exception.dialogId == keepMediaException.dialogId) {
                    i3 = i7;
                    break;
                }
            }
            cacheChatsExceptionsFragment.recyclerListView.scrollToPosition(i3);
            cacheChatsExceptionsFragment.showPopupFor(keepMediaException);
        }
        return true;
    }

    public static void m1417$r8$lambda$zMD6Dd4_Zot_McJfsgLFFYkog(CacheChatsExceptionsFragment cacheChatsExceptionsFragment, CacheByChatsController.KeepMediaException keepMediaException, int i, int i2) {
        cacheChatsExceptionsFragment.getClass();
        if (i2 == CacheByChatsController.KEEP_MEDIA_DELETE) {
            cacheChatsExceptionsFragment.exceptionsDialogs.remove(keepMediaException);
            cacheChatsExceptionsFragment.updateRows();
        } else {
            keepMediaException.keepMedia = i2;
            AndroidUtilities.updateVisibleRows(cacheChatsExceptionsFragment.recyclerListView);
        }
        cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
    }

    public static void $r8$lambda$wYSHLtrdb74JT_xBF51_bQT2SEg(CacheChatsExceptionsFragment cacheChatsExceptionsFragment) {
        cacheChatsExceptionsFragment.exceptionsDialogs.clear();
        cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
        cacheChatsExceptionsFragment.updateRows();
        cacheChatsExceptionsFragment.finishFragment();
    }

    public void showPopupFor(final CacheByChatsController.KeepMediaException keepMediaException) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheChatsExceptionsFragment.$r8$lambda$JtV_44DlczAJRntA2IitmLrw0bo(this.f$0, keepMediaException);
            }
        }, 150L);
    }

    public static void $r8$lambda$JtV_44DlczAJRntA2IitmLrw0bo(final CacheChatsExceptionsFragment cacheChatsExceptionsFragment, final CacheByChatsController.KeepMediaException keepMediaException) {
        int i = 0;
        for (int i2 = 0; i2 < cacheChatsExceptionsFragment.items.size(); i2++) {
            if (((Item) cacheChatsExceptionsFragment.items.get(i2)).exception != null && ((Item) cacheChatsExceptionsFragment.items.get(i2)).exception.dialogId == keepMediaException.dialogId) {
                i = i2;
                break;
            }
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = cacheChatsExceptionsFragment.recyclerListView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(cacheChatsExceptionsFragment, cacheChatsExceptionsFragment.getContext());
            keepMediaPopupView.updateForDialog(true);
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            keepMediaPopupView.setParentWindow(AlertsCreator.createSimplePopup(cacheChatsExceptionsFragment, keepMediaPopupView, view, view.getMeasuredWidth() / 2.0f, viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredHeight() / 2.0f));
            keepMediaPopupView.setCallback(new KeepMediaPopupView.Callback() {
                @Override
                public final void onKeepMediaChange(int i3, int i4) {
                    CacheChatsExceptionsFragment.m1418$r8$lambda$GfPdSETVFtRWsTy2iU8CXPsUNU(this.f$0, keepMediaException, i3, i4);
                }
            });
        }
    }

    public static void m1418$r8$lambda$GfPdSETVFtRWsTy2iU8CXPsUNU(CacheChatsExceptionsFragment cacheChatsExceptionsFragment, CacheByChatsController.KeepMediaException keepMediaException, int i, int i2) {
        cacheChatsExceptionsFragment.getClass();
        keepMediaException.keepMedia = i2;
        cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
        AndroidUtilities.updateVisibleRows(cacheChatsExceptionsFragment.recyclerListView);
    }

    @Override
    public boolean onFragmentCreate() {
        this.currentType = getArguments().getInt("type");
        updateRows();
        return super.onFragmentCreate();
    }

    private void updateRows() {
        ArrayList arrayList;
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
            arrayList = new ArrayList();
            arrayList.addAll(this.items);
        } else {
            arrayList = null;
        }
        this.items.clear();
        this.items.add(new Item(i2, keepMediaException));
        ArrayList arrayList2 = this.exceptionsDialogs;
        int size = arrayList2.size();
        boolean z = false;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            this.items.add(new Item(2, (CacheByChatsController.KeepMediaException) obj));
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

    public void setExceptions(ArrayList arrayList) {
        this.exceptionsDialogs = arrayList;
        updateRows();
    }

    private class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View view;
            if (i == 1) {
                TextCell textCell = new TextCell(viewGroup.getContext());
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.NotificationsAddAnException), R.drawable.msg_contact_add, true);
                textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                shadowSectionCell = textCell;
            } else {
                if (i == 2) {
                    UserCell userCell = new UserCell(viewGroup.getContext(), 4, 0, false, false);
                    userCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = userCell;
                } else if (i == 3) {
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext());
                } else if (i != 4) {
                    view = null;
                } else {
                    TextCell textCell2 = new TextCell(viewGroup.getContext());
                    textCell2.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    textCell2.setColors(-1, Theme.key_text_RedRegular);
                    textCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textCell2;
                }
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(view);
            }
            view = shadowSectionCell;
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String name;
            if (((Item) CacheChatsExceptionsFragment.this.items.get(i)).viewType == 2) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                CacheByChatsController.KeepMediaException keepMediaException = ((Item) CacheChatsExceptionsFragment.this.items.get(i)).exception;
                TLObject userOrChat = CacheChatsExceptionsFragment.this.getMessagesController().getUserOrChat(keepMediaException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    if (user.self) {
                        name = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        name = ContactsController.formatName(user.first_name, user.last_name);
                    }
                } else {
                    name = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                String str = name;
                userCell.setSelfAsSavedMessages(true);
                userCell.setData(userOrChat, str, CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia), 0, i == CacheChatsExceptionsFragment.this.items.size() - 1 || ((Item) CacheChatsExceptionsFragment.this.items.get(i + 1)).viewType == 2);
            }
        }

        @Override
        public int getItemCount() {
            return CacheChatsExceptionsFragment.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return ((Item) CacheChatsExceptionsFragment.this.items.get(i)).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 2 || viewHolder.getItemViewType() == 4;
        }
    }

    class Item extends AdapterWithDiffUtils.Item {
        final CacheByChatsController.KeepMediaException exception;

        private Item(int i, CacheByChatsController.KeepMediaException keepMediaException) {
            super(i, false);
            this.exception = keepMediaException;
        }

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
    }
}

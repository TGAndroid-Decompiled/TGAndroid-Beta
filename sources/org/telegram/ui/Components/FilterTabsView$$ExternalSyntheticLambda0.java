package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;

public final class FilterTabsView$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener {
    public final DialogsActivity.AnonymousClass10 f$0;

    public FilterTabsView$$ExternalSyntheticLambda0(DialogsActivity.AnonymousClass10 anonymousClass10) {
        this.f$0 = anonymousClass10;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        DialogsActivity.AnonymousClass10 anonymousClass10 = this.f$0;
        FilterTabsView.FilterTabsViewDelegate filterTabsViewDelegate = anonymousClass10.delegate;
        if (DialogsActivity.this.searching) {
            return;
        }
        FilterTabsView.TabView tabView = (FilterTabsView.TabView) view;
        if (!anonymousClass10.isEditing) {
            if (i != anonymousClass10.currentPosition || filterTabsViewDelegate == null) {
                anonymousClass10.scrollToTab(tabView.currentTab, i);
                return;
            } else {
                DialogsActivity.this.scrollToTop(true, false);
                return;
            }
        }
        if (i != 0) {
            int iDp = AndroidUtilities.dp(6.0f);
            RectF rectF = tabView.rect;
            float f3 = iDp;
            if (rectF.left - f3 >= f || rectF.right + f3 <= f) {
                return;
            }
            DialogsActivity.AnonymousClass11 anonymousClass11 = (DialogsActivity.AnonymousClass11) anonymousClass10.delegate;
            anonymousClass11.showDeleteAlert(DialogsActivity.this.getMessagesController().getDialogFilters().get(tabView.currentTab.id));
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        MessagesController.DialogFilter dialogFilter;
        boolean z;
        MessagesController.DialogFilter dialogFilter2;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        ItemOptions itemOptions;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        String string;
        DialogsActivity$$ExternalSyntheticLambda8 dialogsActivity$$ExternalSyntheticLambda8;
        boolean z8;
        TLRPC.Chat chat;
        DialogsActivity.AnonymousClass10 anonymousClass10 = this.f$0;
        DialogsActivity.AnonymousClass11 anonymousClass11 = (DialogsActivity.AnonymousClass11) anonymousClass10.delegate;
        DialogsActivity dialogsActivity = DialogsActivity.this;
        if (!dialogsActivity.searching && !anonymousClass10.isEditing) {
            FilterTabsView.TabView tabView = (FilterTabsView.TabView) view;
            if (dialogsActivity.initialDialogsType == 0 && !((BaseFragment) dialogsActivity).actionBar.isActionModeShowed() && dialogsActivity.storiesOverscroll == 0.0f) {
                ItemOptions itemOptions2 = dialogsActivity.filterOptions;
                if (itemOptions2 != null && itemOptions2.isShown()) {
                    dialogsActivity.filterOptions.dismiss();
                    dialogsActivity.filterOptions = null;
                    return false;
                }
                if (tabView.getId() == dialogsActivity.filterTabsView.getDefaultTabId()) {
                    dialogFilter = null;
                } else {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = dialogsActivity.getMessagesController().getDialogFilters();
                    int id = tabView.getId();
                    if (dialogFilters == null || id < 0 || id >= dialogFilters.size()) {
                        dialogFilter = null;
                    } else {
                        dialogFilter = dialogFilters.get(tabView.getId());
                    }
                }
                boolean z9 = dialogFilter == null;
                boolean[] zArr = {true};
                ArrayList arrayList = new ArrayList(z9 ? dialogsActivity.getMessagesController().getDialogs(dialogsActivity.folderId) : dialogsActivity.getMessagesController().getAllDialogs());
                if (dialogFilter != null) {
                    MessagesController.DialogFilter dialogFilter3 = dialogsActivity.getMessagesController().getDialogFilters().get(tabView.getId());
                    if (dialogFilter3 != null) {
                        int i8 = 0;
                        while (i8 < arrayList.size()) {
                            boolean z10 = z9;
                            if (!dialogFilter3.includesDialog(dialogsActivity.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i8)).id)) {
                                arrayList.remove(i8);
                                i8--;
                            }
                            i8++;
                            z9 = z10;
                        }
                        z = z9;
                        z2 = dialogFilter3.isChatlist() || (dialogFilter3.neverShow.isEmpty() && (dialogFilter3.flags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0);
                        if (z2) {
                            for (int i9 = 0; i9 < dialogFilter3.alwaysShow.size(); i9++) {
                                long jLongValue = dialogFilter3.alwaysShow.get(i9).longValue();
                                if (jLongValue < 0 && (chat = dialogsActivity.getMessagesController().getChat(Long.valueOf(-jLongValue))) != null && FilterCreateActivity.canAddToFolder(chat)) {
                                    zArr[0] = false;
                                    break;
                                }
                            }
                        }
                    } else {
                        z = z9;
                        z2 = false;
                    }
                    if (arrayList.isEmpty()) {
                        dialogFilter2 = dialogFilter3;
                    } else {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                dialogFilter2 = dialogFilter3;
                                z8 = true;
                                break;
                            }
                            dialogFilter2 = dialogFilter3;
                            int i11 = i10;
                            if (!dialogsActivity.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i10)).id, 0L)) {
                                z8 = false;
                                break;
                            }
                            i10 = i11 + 1;
                            dialogFilter3 = dialogFilter2;
                        }
                        z3 = !z8;
                    }
                    z4 = false;
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        if (((TLRPC.Dialog) arrayList.get(i2)).unread_mark || ((TLRPC.Dialog) arrayList.get(i2)).unread_count > 0) {
                            z4 = true;
                        }
                    }
                    itemOptions = new ItemOptions(dialogsActivity, tabView, false, true);
                    itemOptions.setScrimViewBackground(new DialogsActivity.AnonymousClass11.AnonymousClass1(anonymousClass11));
                    if (dialogsActivity.getMessagesController().getDialogFilters().size() > 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    itemOptions.addIf(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new ComposeDrawable$$ExternalSyntheticLambda0(anonymousClass11, 14), z5);
                    int i12 = R.drawable.msg_edit;
                    if (z) {
                        i3 = R.string.FilterEditAll;
                    } else {
                        i3 = R.string.FilterEdit;
                    }
                    z6 = z;
                    itemOptions.add(i12, LocaleController.getString(i3), new PhotoViewer$$ExternalSyntheticLambda89(anonymousClass11, z6, dialogFilter, 20), false);
                    if (dialogFilter != null || arrayList.isEmpty()) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z3) {
                        i4 = R.drawable.msg_mute;
                    } else {
                        i4 = R.drawable.msg_unmute;
                    }
                    if (z3) {
                        i5 = R.string.FilterMuteAll;
                    } else {
                        i5 = R.string.FilterUnmuteAll;
                    }
                    itemOptions.addIf(i4, LocaleController.getString(i5), new PhotoViewer$$ExternalSyntheticLambda89(anonymousClass11, arrayList, z3, 21), z7);
                    itemOptions.addIf(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new DialogsActivity$$ExternalSyntheticLambda8(22, anonymousClass11, arrayList), z4);
                    int i13 = R.drawable.msg_share;
                    if (dialogFilter2 == null && dialogFilter2.isMyChatlist()) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    itemOptions.addIf(i13, FilterCreateActivity.withNew(i6, LocaleController.getString(R.string.LinkActionShare), true), new IntroActivity$$ExternalSyntheticLambda5(anonymousClass11, zArr, dialogFilter2, 16), z2);
                    i7 = R.drawable.msg_delete;
                    string = LocaleController.getString(R.string.FilterDeleteItem);
                    dialogsActivity$$ExternalSyntheticLambda8 = new DialogsActivity$$ExternalSyntheticLambda8(23, anonymousClass11, dialogFilter);
                    if (!z6) {
                        itemOptions.add(i7, string, dialogsActivity$$ExternalSyntheticLambda8, true);
                    }
                    itemOptions.dimAlpha = 96;
                    itemOptions.gravity = 3;
                    itemOptions.translate(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    itemOptions.show();
                    dialogsActivity.filterOptions = itemOptions;
                    anonymousClass10.listView.hideSelector(true);
                    return true;
                }
                z = z9;
                dialogFilter2 = null;
                z2 = false;
                z3 = false;
                z4 = false;
                while (i2 < arrayList.size()) {
                    if (((TLRPC.Dialog) arrayList.get(i2)).unread_mark) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                }
                itemOptions = new ItemOptions(dialogsActivity, tabView, false, true);
                itemOptions.setScrimViewBackground(new DialogsActivity.AnonymousClass11.AnonymousClass1(anonymousClass11));
                if (dialogsActivity.getMessagesController().getDialogFilters().size() > 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                itemOptions.addIf(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new ComposeDrawable$$ExternalSyntheticLambda0(anonymousClass11, 14), z5);
                int i14 = R.drawable.msg_edit;
                if (z) {
                    i3 = R.string.FilterEditAll;
                } else {
                    i3 = R.string.FilterEdit;
                }
                z6 = z;
                itemOptions.add(i14, LocaleController.getString(i3), new PhotoViewer$$ExternalSyntheticLambda89(anonymousClass11, z6, dialogFilter, 20), false);
                if (dialogFilter != null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z3) {
                    i4 = R.drawable.msg_mute;
                } else {
                    i4 = R.drawable.msg_unmute;
                }
                if (z3) {
                    i5 = R.string.FilterMuteAll;
                } else {
                    i5 = R.string.FilterUnmuteAll;
                }
                itemOptions.addIf(i4, LocaleController.getString(i5), new PhotoViewer$$ExternalSyntheticLambda89(anonymousClass11, arrayList, z3, 21), z7);
                itemOptions.addIf(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new DialogsActivity$$ExternalSyntheticLambda8(22, anonymousClass11, arrayList), z4);
                int i15 = R.drawable.msg_share;
                if (dialogFilter2 == null) {
                    i6 = 0;
                } else {
                    i6 = 0;
                }
                itemOptions.addIf(i15, FilterCreateActivity.withNew(i6, LocaleController.getString(R.string.LinkActionShare), true), new IntroActivity$$ExternalSyntheticLambda5(anonymousClass11, zArr, dialogFilter2, 16), z2);
                i7 = R.drawable.msg_delete;
                string = LocaleController.getString(R.string.FilterDeleteItem);
                dialogsActivity$$ExternalSyntheticLambda8 = new DialogsActivity$$ExternalSyntheticLambda8(23, anonymousClass11, dialogFilter);
                if (!z6) {
                    itemOptions.add(i7, string, dialogsActivity$$ExternalSyntheticLambda8, true);
                }
                itemOptions.dimAlpha = 96;
                itemOptions.gravity = 3;
                itemOptions.translate(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                itemOptions.show();
                dialogsActivity.filterOptions = itemOptions;
                anonymousClass10.listView.hideSelector(true);
                return true;
            }
        }
        return false;
    }
}

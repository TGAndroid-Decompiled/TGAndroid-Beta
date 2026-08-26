package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UndoView;

public final class DialogsActivity$$ExternalSyntheticLambda10 implements RecyclerAnimationScrollHelper.ScrollListener, ShareTopView.OnModeChangeListener, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener, FilteredSearchView.Delegate, AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda10(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    private final void onDoubleTap$org$telegram$ui$DialogsActivity$$ExternalSyntheticLambda144(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$DialogsActivity$$ExternalSyntheticLambda145(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$DialogsActivity$$ExternalSyntheticLambda148(View view, float f, float f2) {
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        DialogsActivity dialogsActivity = this.f$0;
        dialogsActivity.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        dialogsActivity.statusBarHeight = defaultWindowInsets.top;
        dialogsActivity.navigationBarHeight = defaultWindowInsets.bottom;
        int i = windowInsetsCompat.mImpl.getInsets(8).bottom;
        if (dialogsActivity.imeInsetHeight != i) {
            dialogsActivity.imeInsetHeight = i;
            dialogsActivity.fragmentView.requestLayout();
        }
        dialogsActivity.dialogsActivityStatusLayout.setPadding(0, dialogsActivity.statusBarHeight, 0, 0);
        dialogsActivity.updateFloatingButtonOffset();
        for (UndoView undoView : dialogsActivity.undoView) {
            if (undoView != null) {
                int i2 = dialogsActivity.navigationBarHeight + dialogsActivity.additionNavigationBarHeight;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        DialogsActivity.AnonymousClass27 anonymousClass27 = dialogsActivity.rightSlidingDialogContainer;
        if (anonymousClass27 != null) {
            ViewCompat.dispatchApplyWindowInsets(anonymousClass27, windowInsetsCompat);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 7:
                this.f$0.lambda$showSuggestion$122();
                break;
            case 8:
            default:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.getMessagesController().hidePromoDialog();
                dialogsActivity.hideActionMode$1(false);
                break;
            case 9:
                DialogsActivity dialogsActivity2 = this.f$0;
                dialogsActivity2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            dialogsActivity2.getParentActivity().startActivity(permissionManagerIntent);
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            dialogsActivity2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 10:
                DialogsActivity dialogsActivity3 = this.f$0;
                dialogsActivity3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    dialogsActivity3.getParentActivity().startActivity(intent2);
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        this.f$0.lambda$createSearchViewPager$152(i);
        return false;
    }

    public void onModeChanged(int i) {
        DialogsActivity.AnonymousClass22 anonymousClass22 = this.f$0.commentView;
        if (anonymousClass22 == null) {
            return;
        }
        if (i == 0) {
            anonymousClass22.hideTopView(true);
        } else {
            anonymousClass22.showTopView(true, false);
        }
    }

    @Override
    public void onScroll() {
        DialogsActivity dialogsActivity = this.f$0;
        dialogsActivity.invalidateScrollY = true;
        dialogsActivity.fragmentView.invalidate();
    }

    public void updateFiltersView(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.f$0.updateFiltersView(z, arrayList, arrayList2, z2, true);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        TLRPC.Chat chat;
        switch (this.$r8$classId) {
            case 2:
                DialogsActivity dialogsActivity = this.f$0;
                UItem item = dialogsActivity.searchViewPager.channelsSearchAdapter.getItem(i);
                Object obj = item != null ? item.object : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof MessageObject) {
                        MessageObject messageObject = (MessageObject) obj;
                        Bundle bundle = new Bundle();
                        if (messageObject.getDialogId() >= 0) {
                            bundle.putLong("user_id", messageObject.getDialogId());
                        } else {
                            bundle.putLong("chat_id", -messageObject.getDialogId());
                        }
                        bundle.putInt("message_id", messageObject.getId());
                        ChatActivity chatActivity = new ChatActivity(bundle);
                        DialogsActivity.highlightFoundQuote(chatActivity, messageObject);
                        dialogsActivity.presentFragment(chatActivity);
                    }
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    ChatActivity chatActivity2 = new ChatActivity(bundle2);
                    SearchViewPager.AnonymousClass8 anonymousClass8 = dialogsActivity.searchViewPager.channelsSearchAdapter;
                    anonymousClass8.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i++;
                        if (i >= anonymousClass8.items.size()) {
                            chatActivity2.nextChannels = arrayList;
                            dialogsActivity.presentFragment(chatActivity2);
                            break;
                        } else {
                            UItem item2 = anonymousClass8.getItem(i);
                            if (item2 != null) {
                                Object obj2 = item2.object;
                                if (obj2 instanceof TLRPC.Chat) {
                                    chat = (TLRPC.Chat) obj2;
                                } else {
                                    chat = null;
                                }
                            } else {
                                chat = null;
                            }
                            if (chat != null) {
                                arrayList.add(chat);
                            }
                        }
                    }
                }
                break;
            case 3:
                DialogsActivity dialogsActivity2 = this.f$0;
                UItem item3 = dialogsActivity2.searchViewPager.botsSearchAdapter.getItem(i);
                Object obj3 = item3 != null ? item3.object : null;
                if (obj3 instanceof TLRPC.User) {
                    dialogsActivity2.presentFragment(ProfileActivity.of(((TLRPC.User) obj3).id));
                } else if (obj3 instanceof MessageObject) {
                    MessageObject messageObject2 = (MessageObject) obj3;
                    Bundle bundle3 = new Bundle();
                    if (messageObject2.getDialogId() >= 0) {
                        bundle3.putLong("user_id", messageObject2.getDialogId());
                    } else {
                        bundle3.putLong("chat_id", -messageObject2.getDialogId());
                    }
                    bundle3.putInt("message_id", messageObject2.getId());
                    ChatActivity chatActivity3 = new ChatActivity(bundle3);
                    DialogsActivity.highlightFoundQuote(chatActivity3, messageObject2);
                    dialogsActivity2.presentFragment(chatActivity3);
                }
                break;
            default:
                DialogsActivity dialogsActivity3 = this.f$0;
                Object item4 = dialogsActivity3.searchViewPager.dialogsSearchAdapter.getItem(i);
                if (!(item4 instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof ProfileSearchCell) {
                        ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                        if (profileSearchCell.premiumBlocked) {
                            dialogsActivity3.showPremiumBlockedToast$2(profileSearchCell.getDialogId(), view);
                        }
                    }
                    if (dialogsActivity3.initialDialogsType != 10) {
                        dialogsActivity3.onItemClick(view, i, dialogsActivity3.searchViewPager.dialogsSearchAdapter);
                    } else {
                        DialogsActivity.AnonymousClass47 anonymousClass47 = dialogsActivity3.searchViewPager;
                        ChatActivity.AnonymousClass34 anonymousClass34 = anonymousClass47.searchListView;
                        dialogsActivity3.onItemLongClick(view, i, f, anonymousClass47.dialogsSearchAdapter);
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item4;
                    dialogsActivity3.presentFragment(ChatActivity.of(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    SearchViewPager.AnonymousClass1 anonymousClass1 = dialogsActivity3.searchViewPager.dialogsSearchAdapter;
                    anonymousClass1.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(anonymousClass1.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
                }
                break;
        }
    }
}

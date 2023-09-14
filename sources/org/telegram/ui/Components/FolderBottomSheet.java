package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_chatlists_chatlistInvite;
import org.telegram.tgnet.TLRPC$TL_chatlists_chatlistInviteAlready;
import org.telegram.tgnet.TLRPC$TL_chatlists_chatlistUpdates;
import org.telegram.tgnet.TLRPC$TL_chatlists_getLeaveChatlistSuggestions;
import org.telegram.tgnet.TLRPC$TL_chatlists_hideChatlistUpdates;
import org.telegram.tgnet.TLRPC$TL_chatlists_joinChatlistInvite;
import org.telegram.tgnet.TLRPC$TL_chatlists_joinChatlistUpdates;
import org.telegram.tgnet.TLRPC$TL_chatlists_leaveChatlist;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputChatlistDialogFilter;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_updateDialogFilter;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$chatlist_ChatlistInvite;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.FiltersSetupActivity;
public class FolderBottomSheet extends BottomSheetWithRecyclerListView {
    private int alreadyHeaderRow;
    private ArrayList<Long> alreadyJoined;
    private ArrayList<TLRPC$Peer> alreadyPeers;
    private int alreadySectionRow;
    private int alreadyUsersEndRow;
    private int alreadyUsersStartRow;
    private FrameLayout bulletinContainer;
    private Button button;
    private View buttonShadow;
    private boolean deleting;
    private String escapedTitle;
    private int filterId;
    private HeaderCell headerCell;
    private int headerRow;
    private TLRPC$chatlist_ChatlistInvite invite;
    private long lastClicked;
    private long lastClickedDialogId;
    private Utilities.Callback<Boolean> onDone;
    private ArrayList<TLRPC$Peer> peers;
    private int reqId;
    private int rowsCount;
    private int sectionRow;
    private ArrayList<Long> selectedPeers;
    private int shiftDp;
    private String slug;
    private boolean success;
    private String title;
    private TitleCell titleCell;
    private int titleRow;
    private TLRPC$TL_chatlists_chatlistUpdates updates;
    private int usersEndRow;
    private int usersSectionRow;
    private int usersStartRow;

    public static void showForDeletion(final BaseFragment baseFragment, final int i, final Utilities.Callback<Boolean> callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = baseFragment.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2).id == i) {
                    dialogFilter = arrayList.get(i2);
                    break;
                }
            }
        }
        dialogFilter = null;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                FolderBottomSheet.lambda$showForDeletion$2(i, baseFragment, callback);
            }
        };
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog create = new AlertDialog.Builder(baseFragment.getContext()).setTitle(LocaleController.getString("FilterDelete", R.string.FilterDelete)).setMessage(LocaleController.getString("FilterDeleteAlertLinks", R.string.FilterDeleteAlertLinks)).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    FolderBottomSheet.lambda$showForDeletion$3(Utilities.Callback.this, dialogInterface, i3);
                }
            }).setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    runnable.run();
                }
            }).create();
            baseFragment.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        runnable.run();
    }

    public static void lambda$showForDeletion$2(final int i, final BaseFragment baseFragment, final Utilities.Callback callback) {
        TLRPC$TL_chatlists_getLeaveChatlistSuggestions tLRPC$TL_chatlists_getLeaveChatlistSuggestions = new TLRPC$TL_chatlists_getLeaveChatlistSuggestions();
        TLRPC$TL_inputChatlistDialogFilter tLRPC$TL_inputChatlistDialogFilter = new TLRPC$TL_inputChatlistDialogFilter();
        tLRPC$TL_chatlists_getLeaveChatlistSuggestions.chatlist = tLRPC$TL_inputChatlistDialogFilter;
        tLRPC$TL_inputChatlistDialogFilter.filter_id = i;
        baseFragment.getConnectionsManager().sendRequest(tLRPC$TL_chatlists_getLeaveChatlistSuggestions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                FolderBottomSheet.lambda$showForDeletion$1(BaseFragment.this, i, callback, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$showForDeletion$1(final BaseFragment baseFragment, final int i, final Utilities.Callback callback, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FolderBottomSheet.lambda$showForDeletion$0(TLObject.this, baseFragment, i, callback);
            }
        });
    }

    public static void lambda$showForDeletion$0(TLObject tLObject, BaseFragment baseFragment, int i, Utilities.Callback callback) {
        FolderBottomSheet folderBottomSheet;
        if (tLObject instanceof TLRPC$Vector) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < ((TLRPC$Vector) tLObject).objects.size(); i2++) {
                try {
                    arrayList.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC$Peer) ((TLRPC$Vector) tLObject).objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            folderBottomSheet = new FolderBottomSheet(baseFragment, i, arrayList);
        } else {
            folderBottomSheet = new FolderBottomSheet(baseFragment, i, (List<Long>) null);
        }
        folderBottomSheet.setOnDone(callback);
        baseFragment.showDialog(folderBottomSheet);
    }

    public static void lambda$showForDeletion$3(Utilities.Callback callback, DialogInterface dialogInterface, int i) {
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }

    public FolderBottomSheet(BaseFragment baseFragment, int i, List<Long> list) {
        super(baseFragment, false, false);
        TLRPC$Chat chat;
        this.filterId = -1;
        this.title = "";
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList<>();
        this.selectedPeers = new ArrayList<>();
        this.reqId = -1;
        this.shiftDp = -5;
        this.filterId = i;
        this.deleting = true;
        this.peers = new ArrayList<>();
        this.selectedPeers.clear();
        if (list != null) {
            this.selectedPeers.addAll(list);
        }
        ArrayList<MessagesController.DialogFilter> arrayList = baseFragment.getMessagesController().dialogFilters;
        MessagesController.DialogFilter dialogFilter = null;
        if (arrayList != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i2).id == i) {
                    dialogFilter = arrayList.get(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (dialogFilter != null) {
            this.title = dialogFilter.name;
            for (int i3 = 0; i3 < this.selectedPeers.size(); i3++) {
                TLRPC$Peer peer = baseFragment.getMessagesController().getPeer(this.selectedPeers.get(i3).longValue());
                if ((peer instanceof TLRPC$TL_peerChat) || (peer instanceof TLRPC$TL_peerChannel)) {
                    this.peers.add(peer);
                }
            }
            for (int i4 = 0; i4 < dialogFilter.alwaysShow.size(); i4++) {
                long longValue = dialogFilter.alwaysShow.get(i4).longValue();
                if (!this.selectedPeers.contains(Long.valueOf(longValue))) {
                    TLRPC$Peer peer2 = baseFragment.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC$TL_peerChat) || (peer2 instanceof TLRPC$TL_peerChannel)) && ((chat = baseFragment.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.peers.add(peer2);
                    }
                }
            }
        }
        init();
    }

    public FolderBottomSheet(BaseFragment baseFragment, int i, TLRPC$TL_chatlists_chatlistUpdates tLRPC$TL_chatlists_chatlistUpdates) {
        super(baseFragment, false, false);
        int i2 = 0;
        this.filterId = -1;
        this.title = "";
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList<>();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.selectedPeers = arrayList;
        this.reqId = -1;
        this.shiftDp = -5;
        this.filterId = i;
        this.updates = tLRPC$TL_chatlists_chatlistUpdates;
        arrayList.clear();
        this.peers = tLRPC$TL_chatlists_chatlistUpdates.missing_peers;
        ArrayList<MessagesController.DialogFilter> arrayList2 = baseFragment.getMessagesController().dialogFilters;
        if (arrayList2 != null) {
            while (true) {
                if (i2 >= arrayList2.size()) {
                    break;
                } else if (arrayList2.get(i2).id == i) {
                    this.title = arrayList2.get(i2).name;
                    break;
                } else {
                    i2++;
                }
            }
        }
        init();
    }

    public FolderBottomSheet(BaseFragment baseFragment, String str, TLRPC$chatlist_ChatlistInvite tLRPC$chatlist_ChatlistInvite) {
        super(baseFragment, false, false);
        int i = 0;
        this.filterId = -1;
        this.title = "";
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList<>();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.selectedPeers = arrayList;
        this.reqId = -1;
        this.shiftDp = -5;
        this.slug = str;
        this.invite = tLRPC$chatlist_ChatlistInvite;
        arrayList.clear();
        if (tLRPC$chatlist_ChatlistInvite instanceof TLRPC$TL_chatlists_chatlistInvite) {
            TLRPC$TL_chatlists_chatlistInvite tLRPC$TL_chatlists_chatlistInvite = (TLRPC$TL_chatlists_chatlistInvite) tLRPC$chatlist_ChatlistInvite;
            this.title = tLRPC$TL_chatlists_chatlistInvite.title;
            this.peers = tLRPC$TL_chatlists_chatlistInvite.peers;
        } else if (tLRPC$chatlist_ChatlistInvite instanceof TLRPC$TL_chatlists_chatlistInviteAlready) {
            TLRPC$TL_chatlists_chatlistInviteAlready tLRPC$TL_chatlists_chatlistInviteAlready = (TLRPC$TL_chatlists_chatlistInviteAlready) tLRPC$chatlist_ChatlistInvite;
            this.peers = tLRPC$TL_chatlists_chatlistInviteAlready.missing_peers;
            this.alreadyPeers = tLRPC$TL_chatlists_chatlistInviteAlready.already_peers;
            this.filterId = tLRPC$TL_chatlists_chatlistInviteAlready.filter_id;
            ArrayList<MessagesController.DialogFilter> arrayList2 = baseFragment.getMessagesController().dialogFilters;
            if (arrayList2 != null) {
                while (true) {
                    if (i >= arrayList2.size()) {
                        break;
                    } else if (arrayList2.get(i).id == this.filterId) {
                        this.title = arrayList2.get(i).name;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        init();
    }

    private void init() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FolderBottomSheet.init():void");
    }

    public void lambda$init$5(View view) {
        onJoinButtonClicked();
    }

    private void onJoinButtonClicked() {
        final TLRPC$TL_chatlists_joinChatlistInvite tLRPC$TL_chatlists_joinChatlistInvite;
        final Utilities.Callback callback;
        boolean z;
        Button button = this.button;
        if (button == null || !button.isLoading()) {
            ArrayList<TLRPC$Peer> arrayList = this.peers;
            if (arrayList == null) {
                dismiss();
            } else if (arrayList.isEmpty() && !this.deleting) {
                dismiss();
            } else if (this.selectedPeers.isEmpty() && (this.invite instanceof TLRPC$TL_chatlists_chatlistInvite)) {
                Button button2 = this.button;
                int i = -this.shiftDp;
                this.shiftDp = i;
                AndroidUtilities.shakeViewSpring(button2, i);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            } else {
                final ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < this.peers.size(); i2++) {
                    long peerDialogId = DialogObject.getPeerDialogId(this.peers.get(i2));
                    if (this.selectedPeers.contains(Long.valueOf(peerDialogId))) {
                        arrayList2.add(getBaseFragment().getMessagesController().getInputPeer(peerDialogId));
                    }
                }
                UndoView undoView = null;
                if (this.deleting) {
                    TLRPC$TL_chatlists_leaveChatlist tLRPC$TL_chatlists_leaveChatlist = new TLRPC$TL_chatlists_leaveChatlist();
                    TLRPC$TL_inputChatlistDialogFilter tLRPC$TL_inputChatlistDialogFilter = new TLRPC$TL_inputChatlistDialogFilter();
                    tLRPC$TL_chatlists_leaveChatlist.chatlist = tLRPC$TL_inputChatlistDialogFilter;
                    tLRPC$TL_inputChatlistDialogFilter.filter_id = this.filterId;
                    tLRPC$TL_chatlists_leaveChatlist.peers.addAll(arrayList2);
                    tLRPC$TL_chatlists_joinChatlistInvite = tLRPC$TL_chatlists_leaveChatlist;
                } else if (this.updates != null) {
                    if (arrayList2.isEmpty()) {
                        TLRPC$TL_chatlists_hideChatlistUpdates tLRPC$TL_chatlists_hideChatlistUpdates = new TLRPC$TL_chatlists_hideChatlistUpdates();
                        TLRPC$TL_inputChatlistDialogFilter tLRPC$TL_inputChatlistDialogFilter2 = new TLRPC$TL_inputChatlistDialogFilter();
                        tLRPC$TL_chatlists_hideChatlistUpdates.chatlist = tLRPC$TL_inputChatlistDialogFilter2;
                        tLRPC$TL_inputChatlistDialogFilter2.filter_id = this.filterId;
                        getBaseFragment().getConnectionsManager().sendRequest(tLRPC$TL_chatlists_hideChatlistUpdates, null);
                        getBaseFragment().getMessagesController().invalidateChatlistFolderUpdate(this.filterId);
                        dismiss();
                        return;
                    }
                    TLRPC$TL_chatlists_joinChatlistUpdates tLRPC$TL_chatlists_joinChatlistUpdates = new TLRPC$TL_chatlists_joinChatlistUpdates();
                    TLRPC$TL_inputChatlistDialogFilter tLRPC$TL_inputChatlistDialogFilter3 = new TLRPC$TL_inputChatlistDialogFilter();
                    tLRPC$TL_chatlists_joinChatlistUpdates.chatlist = tLRPC$TL_inputChatlistDialogFilter3;
                    tLRPC$TL_inputChatlistDialogFilter3.filter_id = this.filterId;
                    tLRPC$TL_chatlists_joinChatlistUpdates.peers.addAll(arrayList2);
                    tLRPC$TL_chatlists_joinChatlistInvite = tLRPC$TL_chatlists_joinChatlistUpdates;
                } else if ((this.invite instanceof TLRPC$TL_chatlists_chatlistInviteAlready) && arrayList2.isEmpty()) {
                    dismiss();
                    return;
                } else {
                    TLRPC$TL_chatlists_joinChatlistInvite tLRPC$TL_chatlists_joinChatlistInvite2 = new TLRPC$TL_chatlists_joinChatlistInvite();
                    tLRPC$TL_chatlists_joinChatlistInvite2.slug = this.slug;
                    tLRPC$TL_chatlists_joinChatlistInvite2.peers.addAll(arrayList2);
                    tLRPC$TL_chatlists_joinChatlistInvite = tLRPC$TL_chatlists_joinChatlistInvite2;
                }
                final INavigationLayout parentLayout = getBaseFragment().getParentLayout();
                if (!this.deleting) {
                    if (parentLayout != null) {
                        final Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                FolderBottomSheet.this.lambda$onJoinButtonClicked$11(arrayList2, (BaseFragment) obj);
                            }
                        };
                        if (this.updates != null) {
                            callback = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    FolderBottomSheet.lambda$onJoinButtonClicked$12(Utilities.Callback.this, parentLayout, (Integer) obj);
                                }
                            };
                        } else {
                            callback = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    FolderBottomSheet.lambda$onJoinButtonClicked$15(INavigationLayout.this, callback2, (Integer) obj);
                                }
                            };
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList2.size()) {
                                z = false;
                                break;
                            }
                            if (!this.alreadyJoined.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC$InputPeer) arrayList2.get(i3))))) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                        if (z) {
                            boolean[] zArr = new boolean[1];
                            getBaseFragment().getMessagesController().ensureFolderDialogExists(1, zArr);
                            if (zArr[0]) {
                                getBaseFragment().getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                            }
                        }
                        this.button.setLoading(true);
                        this.reqId = getBaseFragment().getConnectionsManager().sendRequest(tLRPC$TL_chatlists_joinChatlistInvite, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                FolderBottomSheet.this.lambda$onJoinButtonClicked$18(callback, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                } else if (parentLayout != null) {
                    final BaseFragment lastFragment = parentLayout.getLastFragment();
                    if (lastFragment instanceof ChatActivity) {
                        undoView = ((ChatActivity) lastFragment).getUndoView();
                    } else if (lastFragment instanceof DialogsActivity) {
                        undoView = ((DialogsActivity) lastFragment).getUndoView();
                    } else if (lastFragment instanceof FiltersSetupActivity) {
                        undoView = ((FiltersSetupActivity) lastFragment).getUndoView();
                    } else if (lastFragment instanceof FilterCreateActivity) {
                        List<BaseFragment> fragmentStack = parentLayout.getFragmentStack();
                        if (fragmentStack.size() >= 2 && (fragmentStack.get(fragmentStack.size() - 2) instanceof FiltersSetupActivity)) {
                            lastFragment.finishFragment();
                            undoView = ((FiltersSetupActivity) fragmentStack.get(fragmentStack.size() - 2)).getUndoView();
                        }
                    }
                    UndoView undoView2 = undoView;
                    if (undoView2 == null) {
                        this.button.setLoading(true);
                        this.reqId = getBaseFragment().getConnectionsManager().sendRequest(tLRPC$TL_chatlists_joinChatlistInvite, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                FolderBottomSheet.this.lambda$onJoinButtonClicked$7(lastFragment, arrayList2, tLObject, tLRPC$TL_error);
                            }
                        });
                        return;
                    }
                    ArrayList<Long> arrayList3 = new ArrayList<>();
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        arrayList3.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC$InputPeer) arrayList2.get(i4))));
                    }
                    final Pair<Runnable, Runnable> removeFolderTemporarily = getBaseFragment().getMessagesController().removeFolderTemporarily(this.filterId, arrayList3);
                    undoView2.showWithAction(0L, 88, this.title, Integer.valueOf(arrayList2.size()), new Runnable() {
                        @Override
                        public final void run() {
                            FolderBottomSheet.this.lambda$onJoinButtonClicked$10(tLRPC$TL_chatlists_joinChatlistInvite, removeFolderTemporarily);
                        }
                    }, (Runnable) removeFolderTemporarily.second);
                    this.success = true;
                    dismiss();
                    getBaseFragment().getMessagesController().invalidateChatlistFolderUpdate(this.filterId);
                }
            }
        }
    }

    public void lambda$onJoinButtonClicked$7(final BaseFragment baseFragment, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FolderBottomSheet.this.lambda$onJoinButtonClicked$6(baseFragment, arrayList);
            }
        });
    }

    public void lambda$onJoinButtonClicked$6(BaseFragment baseFragment, ArrayList arrayList) {
        this.reqId = -1;
        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, this.title), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", arrayList.size(), new Object[0])).setDuration(5000).show();
        this.success = true;
        dismiss();
        getBaseFragment().getMessagesController().invalidateChatlistFolderUpdate(this.filterId);
    }

    public void lambda$onJoinButtonClicked$10(TLObject tLObject, final Pair pair) {
        this.reqId = getBaseFragment().getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                FolderBottomSheet.this.lambda$onJoinButtonClicked$9(pair, tLObject2, tLRPC$TL_error);
            }
        });
    }

    public void lambda$onJoinButtonClicked$9(final Pair pair, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FolderBottomSheet.this.lambda$onJoinButtonClicked$8(pair);
            }
        });
    }

    public void lambda$onJoinButtonClicked$8(Pair pair) {
        this.reqId = -1;
        ((Runnable) pair.first).run();
    }

    public void lambda$onJoinButtonClicked$11(ArrayList arrayList, BaseFragment baseFragment) {
        String formatPluralString;
        if (this.updates != null || (this.invite instanceof TLRPC$TL_chatlists_chatlistInviteAlready)) {
            BulletinFactory of = BulletinFactory.of(baseFragment);
            int i = R.raw.folder_in;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkUpdatedTitle", R.string.FolderLinkUpdatedTitle, this.escapedTitle));
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", this.alreadyJoined.size(), new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList.size(), new Object[0]);
            }
            of.createSimpleBulletin(i, replaceTags, formatPluralString).setDuration(5000).show();
            return;
        }
        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkAddedTitle", R.string.FolderLinkAddedTitle, this.escapedTitle)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList.size(), new Object[0])).setDuration(5000).show();
    }

    public static void lambda$onJoinButtonClicked$12(Utilities.Callback callback, INavigationLayout iNavigationLayout, Integer num) {
        callback.run(iNavigationLayout.getLastFragment());
    }

    public static void lambda$onJoinButtonClicked$15(INavigationLayout iNavigationLayout, final Utilities.Callback callback, final Integer num) {
        List<BaseFragment> fragmentStack = iNavigationLayout.getFragmentStack();
        boolean z = true;
        final BaseFragment baseFragment = null;
        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
            baseFragment = fragmentStack.get(size);
            if (baseFragment instanceof DialogsActivity) {
                break;
            }
            if (z) {
                baseFragment.finishFragment();
                z = false;
            } else {
                baseFragment.removeSelfFromStack();
            }
        }
        if (baseFragment instanceof DialogsActivity) {
            final DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
            dialogsActivity.closeSearching();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    FolderBottomSheet.lambda$onJoinButtonClicked$14(DialogsActivity.this, num, callback, baseFragment);
                }
            }, 80L);
            return;
        }
        callback.run(baseFragment);
    }

    public static void lambda$onJoinButtonClicked$14(DialogsActivity dialogsActivity, Integer num, final Utilities.Callback callback, final BaseFragment baseFragment) {
        dialogsActivity.scrollToFolder(num.intValue());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback.this.run(baseFragment);
            }
        }, 200L);
    }

    public void lambda$onJoinButtonClicked$18(final Utilities.Callback callback, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FolderBottomSheet.this.lambda$onJoinButtonClicked$17(tLRPC$TL_error, tLObject, callback);
            }
        });
    }

    public void lambda$onJoinButtonClicked$17(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, final Utilities.Callback callback) {
        final int i = -1;
        this.reqId = -1;
        int i2 = 0;
        if (FilterCreateActivity.processErrors(tLRPC$TL_error, getBaseFragment(), BulletinFactory.of(getBaseFragment())) && tLObject != null) {
            if (tLObject instanceof TLRPC$Updates) {
                TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
                ArrayList<TLRPC$Update> arrayList = tLRPC$Updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC$Update tLRPC$Update = tLRPC$Updates.update;
                    if (tLRPC$Update instanceof TLRPC$TL_updateDialogFilter) {
                        i = ((TLRPC$TL_updateDialogFilter) tLRPC$Update).id;
                    }
                } else {
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i2) instanceof TLRPC$TL_updateDialogFilter) {
                            i = ((TLRPC$TL_updateDialogFilter) arrayList.get(i2)).id;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (this.invite instanceof TLRPC$TL_chatlists_chatlistInvite) {
                getBaseFragment().getMessagesController().loadRemoteFilters(true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        FolderBottomSheet.this.lambda$onJoinButtonClicked$16(callback, i, (Boolean) obj);
                    }
                });
                return;
            }
            if (this.updates != null) {
                getBaseFragment().getMessagesController().checkChatlistFolderUpdate(this.filterId, true);
            }
            this.success = true;
            dismiss();
            callback.run(Integer.valueOf(i));
            return;
        }
        this.button.setLoading(false);
    }

    public void lambda$onJoinButtonClicked$16(Utilities.Callback callback, int i, Boolean bool) {
        this.success = bool.booleanValue();
        dismiss();
        callback.run(Integer.valueOf(i));
    }

    public void setOnDone(Utilities.Callback<Boolean> callback) {
        this.onDone = callback;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        if (this.reqId >= 0) {
            getBaseFragment().getConnectionsManager().cancelRequest(this.reqId, true);
        }
        Utilities.Callback<Boolean> callback = this.onDone;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.success));
            this.onDone = null;
        }
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        this.recyclerListView.setOverScrollMode(2);
        this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.button != null ? 68.0f : 0.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                FolderBottomSheet.this.lambda$onViewCreated$19(view, i);
            }
        });
    }

    public void lambda$onViewCreated$19(View view, int i) {
        int i2;
        String string;
        String str;
        if (!(view instanceof GroupCreateUserCell) || (i2 = (i - 1) - this.usersStartRow) < 0 || i2 >= this.peers.size()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(this.peers.get(i2));
        if (this.selectedPeers.contains(Long.valueOf(peerDialogId))) {
            if (this.alreadyJoined.contains(Long.valueOf(peerDialogId))) {
                int i3 = -this.shiftDp;
                this.shiftDp = i3;
                AndroidUtilities.shakeViewSpring(view, i3);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList = new ArrayList();
                if (peerDialogId >= 0) {
                    arrayList.add(getBaseFragment().getMessagesController().getUser(Long.valueOf(peerDialogId)));
                    str = "beep boop.";
                } else {
                    TLRPC$Chat chat = getBaseFragment().getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.getString("FolderLinkAlreadySubscribed", R.string.FolderLinkAlreadySubscribed);
                    } else {
                        string = LocaleController.getString("FolderLinkAlreadyJoined", R.string.FolderLinkAlreadyJoined);
                    }
                    arrayList.add(chat);
                    str = string;
                }
                if (this.lastClickedDialogId != peerDialogId || System.currentTimeMillis() - this.lastClicked > 1500) {
                    this.lastClickedDialogId = peerDialogId;
                    this.lastClicked = System.currentTimeMillis();
                    BulletinFactory.of(this.bulletinContainer, null).createChatsBulletin(arrayList, str, null).setDuration(1500).show();
                    return;
                }
                return;
            }
            this.selectedPeers.remove(Long.valueOf(peerDialogId));
            ((GroupCreateUserCell) view).setChecked(false, true);
        } else {
            this.selectedPeers.add(Long.valueOf(peerDialogId));
            ((GroupCreateUserCell) view).setChecked(true, true);
        }
        updateCount(true);
        updateHeaderCell(true);
        announceSelection(false);
    }

    public void updateCount(boolean z) {
        int i;
        String str;
        int size = this.selectedPeers.size();
        Button button = this.button;
        if (button != null) {
            if (this.deleting) {
                if (size > 0) {
                    i = R.string.FolderLinkButtonRemoveChats;
                    str = "FolderLinkButtonRemoveChats";
                } else {
                    i = R.string.FolderLinkButtonRemove;
                    str = "FolderLinkButtonRemove";
                }
                button.setText(LocaleController.getString(str, i), z);
            } else {
                ArrayList<TLRPC$Peer> arrayList = this.peers;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.button.setText(LocaleController.getString("OK", R.string.OK), z);
                } else if (this.invite instanceof TLRPC$TL_chatlists_chatlistInvite) {
                    this.button.setText(LocaleController.formatString("FolderLinkButtonAdd", R.string.FolderLinkButtonAdd, this.title), z);
                } else {
                    this.button.setText(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString("FolderLinkButtonNone", R.string.FolderLinkButtonNone), z);
                }
            }
            this.button.setCount(size, z);
            if (this.invite instanceof TLRPC$TL_chatlists_chatlistInvite) {
                this.button.setEnabled(!this.selectedPeers.isEmpty());
            }
        }
        TitleCell titleCell = this.titleCell;
        if (titleCell != null) {
            titleCell.setSelectedCount(size, z);
        }
    }

    public static class Button extends FrameLayout {
        float countAlpha;
        AnimatedFloat countAlphaAnimated;
        private ValueAnimator countAnimator;
        private float countScale;
        AnimatedTextView.AnimatedTextDrawable countText;
        private boolean enabled;
        private ValueAnimator enabledAnimator;
        private float enabledT;
        private int lastCount;
        private boolean loading;
        private ValueAnimator loadingAnimator;
        private CircularProgressDrawable loadingDrawable;
        private float loadingT;
        Paint paint;
        private View rippleView;
        AnimatedTextView.AnimatedTextDrawable text;

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        public Button(Context context, String str) {
            super(context);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.countAlphaAnimated = new AnimatedFloat(350L, cubicBezierInterpolator);
            this.loadingT = 0.0f;
            this.countScale = 1.0f;
            this.enabledT = 1.0f;
            this.enabled = true;
            View view = new View(context);
            this.rippleView = view;
            int i = Theme.key_featuredStickers_addButton;
            view.setBackground(Theme.AdaptiveRipple.rect(Theme.getColor(i), 8.0f));
            addView(this.rippleView, LayoutHelper.createFrame(-1, -1.0f));
            setBackground((ShapeDrawable) Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(i)));
            Paint paint = new Paint(1);
            this.paint = paint;
            int i2 = Theme.key_featuredStickers_buttonText;
            paint.setColor(Theme.getColor(i2));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false);
            this.text = animatedTextDrawable;
            animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
            this.text.setCallback(this);
            this.text.setTextSize(AndroidUtilities.dp(14.0f));
            this.text.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.text.setTextColor(Theme.getColor(i2));
            this.text.setText(str);
            this.text.setGravity(1);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, false, true);
            this.countText = animatedTextDrawable2;
            animatedTextDrawable2.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
            this.countText.setCallback(this);
            this.countText.setTextSize(AndroidUtilities.dp(12.0f));
            this.countText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.countText.setTextColor(Theme.getColor(i));
            this.countText.setText("");
            this.countText.setGravity(1);
            setWillNotDraw(false);
        }

        public void setText(String str, boolean z) {
            if (z) {
                this.text.cancelAnimation();
            }
            this.text.setText(str, z);
            invalidate();
        }

        public void setLoading(final boolean z) {
            if (this.loading != z) {
                ValueAnimator valueAnimator = this.loadingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.loadingAnimator = null;
                }
                float[] fArr = new float[2];
                fArr[0] = this.loadingT;
                this.loading = z;
                fArr[1] = z ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.loadingAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        FolderBottomSheet.Button.this.lambda$setLoading$0(valueAnimator2);
                    }
                });
                this.loadingAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Button.this.loadingT = z ? 1.0f : 0.0f;
                        Button.this.invalidate();
                    }
                });
                this.loadingAnimator.setDuration(320L);
                this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.loadingAnimator.start();
            }
        }

        public void lambda$setLoading$0(ValueAnimator valueAnimator) {
            this.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public boolean isLoading() {
            return this.loading;
        }

        private void animateCount() {
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.countAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.countAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    FolderBottomSheet.Button.this.lambda$animateCount$1(valueAnimator2);
                }
            });
            this.countAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Button.this.countScale = 1.0f;
                    Button.this.invalidate();
                }
            });
            this.countAnimator.setInterpolator(new OvershootInterpolator(2.0f));
            this.countAnimator.setDuration(200L);
            this.countAnimator.start();
        }

        public void lambda$animateCount$1(ValueAnimator valueAnimator) {
            this.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            invalidate();
        }

        public void setCount(int i, boolean z) {
            int i2;
            if (z) {
                this.countText.cancelAnimation();
            }
            if (z && i != (i2 = this.lastCount) && i > 0 && i2 > 0) {
                animateCount();
            }
            this.lastCount = i;
            this.countAlpha = i != 0 ? 1.0f : 0.0f;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
            animatedTextDrawable.setText("" + i, z);
            invalidate();
        }

        @Override
        public void setEnabled(boolean z) {
            if (this.enabled != z) {
                ValueAnimator valueAnimator = this.enabledAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.enabledAnimator = null;
                }
                float[] fArr = new float[2];
                fArr[0] = this.enabledT;
                this.enabled = z;
                fArr[1] = z ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.enabledAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        FolderBottomSheet.Button.this.lambda$setEnabled$2(valueAnimator2);
                    }
                });
                this.enabledAnimator.addListener(new AnimatorListenerAdapter(this) {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                    }
                });
                this.enabledAnimator.start();
            }
        }

        public void lambda$setEnabled$2(ValueAnimator valueAnimator) {
            this.enabledT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return this.text == drawable || this.countText == drawable || super.verifyDrawable(drawable);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.rippleView.draw(canvas);
            boolean z = false;
            if (this.loadingT > 0.0f) {
                if (this.loadingDrawable == null) {
                    this.loadingDrawable = new CircularProgressDrawable(this.text.getTextColor());
                }
                int dp = (int) ((1.0f - this.loadingT) * AndroidUtilities.dp(24.0f));
                this.loadingDrawable.setBounds(0, dp, getWidth(), getHeight() + dp);
                this.loadingDrawable.setAlpha((int) (this.loadingT * 255.0f));
                this.loadingDrawable.draw(canvas);
                invalidate();
            }
            float f = this.loadingT;
            if (f < 1.0f) {
                if (f != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, (int) (this.loadingT * AndroidUtilities.dp(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.loadingT * 0.4f));
                    z = true;
                }
                float currentWidth = this.text.getCurrentWidth();
                float f2 = this.countAlphaAnimated.set(this.countAlpha);
                float dp2 = ((AndroidUtilities.dp(15.66f) + this.countText.getCurrentWidth()) * f2) + currentWidth;
                android.graphics.Rect rect = AndroidUtilities.rectTmp2;
                rect.set((int) (((getMeasuredWidth() - dp2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) ((((getMeasuredWidth() - dp2) + getWidth()) / 2.0f) + currentWidth), (int) (((getMeasuredHeight() + this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f)));
                this.text.setAlpha((int) ((1.0f - this.loadingT) * 255.0f * AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT)));
                this.text.setBounds(rect);
                this.text.draw(canvas);
                rect.set((int) (((getMeasuredWidth() - dp2) / 2.0f) + currentWidth + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (((getMeasuredWidth() - dp2) / 2.0f) + currentWidth + AndroidUtilities.dp(13.0f) + Math.max(AndroidUtilities.dp(9.0f), this.countText.getCurrentWidth())), (int) ((getMeasuredHeight() + AndroidUtilities.dp(18.0f)) / 2.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                if (this.countScale != 1.0f) {
                    canvas.save();
                    float f3 = this.countScale;
                    canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                }
                this.paint.setAlpha((int) ((1.0f - this.loadingT) * 255.0f * f2 * f2));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.paint);
                rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
                this.countText.setAlpha((int) ((1.0f - this.loadingT) * 255.0f * f2));
                this.countText.setBounds(rect);
                this.countText.draw(canvas);
                if (this.countScale != 1.0f) {
                    canvas.restore();
                }
                if (z) {
                    canvas.restore();
                }
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.text.getText());
            if (this.lastCount > 0) {
                str = ", " + LocaleController.formatPluralString("Chats", this.lastCount, new Object[0]);
            } else {
                str = "";
            }
            sb.append(str);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
    }

    @Override
    protected CharSequence getTitle() {
        if (this.deleting) {
            return LocaleController.getString("FolderLinkTitleRemove", R.string.FolderLinkTitleRemove);
        }
        if (this.invite instanceof TLRPC$TL_chatlists_chatlistInvite) {
            return LocaleController.getString("FolderLinkTitleAdd", R.string.FolderLinkTitleAdd);
        }
        ArrayList<TLRPC$Peer> arrayList = this.peers;
        if (arrayList == null || arrayList.isEmpty()) {
            return LocaleController.getString("FolderLinkTitleAlready", R.string.FolderLinkTitleAlready);
        }
        return LocaleController.getString("FolderLinkTitleAddChats", R.string.FolderLinkTitleAddChats);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 2 && viewHolder.getAdapterPosition() >= FolderBottomSheet.this.usersStartRow && viewHolder.getAdapterPosition() <= FolderBottomSheet.this.usersEndRow;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                boolean z = false;
                if (i == 0) {
                    FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
                    FolderBottomSheet folderBottomSheet2 = FolderBottomSheet.this;
                    view = folderBottomSheet.titleCell = new TitleCell(folderBottomSheet2.getContext(), ((FolderBottomSheet.this.invite instanceof TLRPC$TL_chatlists_chatlistInviteAlready) || FolderBottomSheet.this.updates != null) ? true : true, FolderBottomSheet.this.escapedTitle);
                } else if (i == 1) {
                    view = new TextInfoPrivacyCell(FolderBottomSheet.this.getContext());
                    view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                } else if (i == 2) {
                    GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(FolderBottomSheet.this.getContext(), 1, 0, false);
                    groupCreateUserCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = groupCreateUserCell;
                } else if (i == 3) {
                    view = new HeaderCell(FolderBottomSheet.this.getContext());
                    view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                } else {
                    view = null;
                }
                return new RecyclerListView.Holder(view);
            }

            @Override
            public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FolderBottomSheet.AnonymousClass1.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            @Override
            public int getItemViewType(int i) {
                if (i == FolderBottomSheet.this.titleRow) {
                    return 0;
                }
                if (i == FolderBottomSheet.this.sectionRow || i == FolderBottomSheet.this.usersSectionRow || i == FolderBottomSheet.this.alreadySectionRow) {
                    return 1;
                }
                return (i == FolderBottomSheet.this.headerRow || i == FolderBottomSheet.this.alreadyHeaderRow) ? 3 : 2;
            }

            @Override
            public int getItemCount() {
                return FolderBottomSheet.this.rowsCount;
            }
        };
    }

    public static class HeaderCell extends FrameLayout {
        public AnimatedTextView actionTextView;
        public AnimatedTextView textView;

        public HeaderCell(Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, false);
            this.textView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            AnimatedTextView animatedTextView2 = this.textView;
            int i = Theme.key_windowBackgroundWhiteBlueHeader;
            animatedTextView2.setTextColor(Theme.getColor(i));
            this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(this.textView, LayoutHelper.createFrame(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
            AnimatedTextView animatedTextView3 = new AnimatedTextView(context, true, true, true);
            this.actionTextView = animatedTextView3;
            animatedTextView3.setAnimationProperties(0.45f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionTextView.setTextSize(AndroidUtilities.dp(15.0f));
            this.actionTextView.setTextColor(Theme.getColor(i));
            this.actionTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(this.actionTextView, LayoutHelper.createFrame(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
            ViewCompat.setAccessibilityHeading(this, true);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (z) {
                this.textView.cancelAnimation();
            }
            this.textView.setText(charSequence, z && !LocaleController.isRTL);
        }

        public void setAction(CharSequence charSequence, final Runnable runnable) {
            this.actionTextView.setText(charSequence, !LocaleController.isRTL);
            this.actionTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    FolderBottomSheet.HeaderCell.lambda$setAction$0(runnable, view);
                }
            });
        }

        public static void lambda$setAction$0(Runnable runnable, View view) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setText(this.textView.getText());
        }
    }

    public class TitleCell extends FrameLayout {
        private boolean already;
        private FoldersPreview preview;
        private TextView subtitleTextView;
        private String title;
        private TextView titleTextView;

        public TitleCell(Context context, boolean z, String str) {
            super(context);
            this.already = z;
            this.title = str;
            FoldersPreview foldersPreview = new FoldersPreview(this, context, null, LocaleController.getString("FolderLinkPreviewLeft"), str, LocaleController.getString("FolderLinkPreviewRight"), null);
            this.preview = foldersPreview;
            addView(foldersPreview, LayoutHelper.createFrame(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleTextView.setText(FolderBottomSheet.this.getTitle());
            this.titleTextView.setGravity(17);
            addView(this.titleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleTextView = textView2;
            textView2.setTextColor(Theme.getColor(i));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setLines(2);
            this.subtitleTextView.setGravity(17);
            this.subtitleTextView.setLineSpacing(0.0f, 1.15f);
            addView(this.subtitleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
            setSelectedCount(0, false);
        }

        public void setSelectedCount(int i, boolean z) {
            if (FolderBottomSheet.this.deleting) {
                this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkSubtitleRemove", R.string.FolderLinkSubtitleRemove, this.title)));
            } else if (this.already) {
                this.preview.setCount(FolderBottomSheet.this.peers != null ? FolderBottomSheet.this.peers.size() : 0, false);
                if (FolderBottomSheet.this.peers == null || FolderBottomSheet.this.peers.isEmpty()) {
                    this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkSubtitleAlready", R.string.FolderLinkSubtitleAlready, this.title)));
                } else {
                    this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FolderLinkSubtitleChats", FolderBottomSheet.this.peers != null ? FolderBottomSheet.this.peers.size() : 0, this.title)));
                }
            } else if (FolderBottomSheet.this.peers == null || FolderBottomSheet.this.peers.isEmpty()) {
                this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkSubtitleAlready", R.string.FolderLinkSubtitleAlready, this.title)));
            } else {
                this.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkSubtitle", R.string.FolderLinkSubtitle, this.title)));
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
        }

        public class FoldersPreview extends View {
            AnimatedTextView.AnimatedTextDrawable countText;
            StaticLayout leftFolder;
            StaticLayout leftFolder2;
            float leftFolder2Width;
            float leftFolderWidth;
            LinearGradient leftGradient;
            Matrix leftMatrix;
            Paint leftPaint;
            StaticLayout middleFolder;
            float middleFolderWidth;
            TextPaint paint;
            Path path;
            float[] radii;
            StaticLayout rightFolder;
            StaticLayout rightFolder2;
            float rightFolder2Width;
            float rightFolderWidth;
            LinearGradient rightGradient;
            Matrix rightMatrix;
            Paint rightPaint;
            Paint selectedPaint;
            TextPaint selectedTextPaint;

            public FoldersPreview(TitleCell titleCell, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
                super(context);
                this.paint = new TextPaint(1);
                this.selectedTextPaint = new TextPaint(1);
                this.selectedPaint = new Paint(1);
                this.path = new Path();
                this.radii = new float[8];
                this.leftPaint = new Paint(1);
                this.rightPaint = new Paint(1);
                this.leftMatrix = new Matrix();
                this.rightMatrix = new Matrix();
                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_profile_tabText), 0.8f));
                this.paint.setTextSize(AndroidUtilities.dp(15.33f));
                this.paint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.selectedTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2));
                this.selectedTextPaint.setTextSize(AndroidUtilities.dp(17.0f));
                this.selectedTextPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.selectedPaint.setColor(Theme.getColor(Theme.key_featuredStickers_unread));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.countText = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.countText.setCallback(this);
                this.countText.setTextSize(AndroidUtilities.dp(11.66f));
                this.countText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.countText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.countText.setGravity(1);
                if (charSequence != null) {
                    StaticLayout makeLayout = makeLayout(charSequence, false);
                    this.leftFolder2 = makeLayout;
                    this.leftFolder2Width = makeLayout.getLineWidth(0);
                }
                if (charSequence2 != null) {
                    StaticLayout makeLayout2 = makeLayout(charSequence2, false);
                    this.leftFolder = makeLayout2;
                    this.leftFolderWidth = makeLayout2.getLineWidth(0);
                }
                StaticLayout makeLayout3 = makeLayout(charSequence3, true);
                this.middleFolder = makeLayout3;
                this.middleFolderWidth = makeLayout3.getLineWidth(0);
                if (charSequence4 != null) {
                    StaticLayout makeLayout4 = makeLayout(charSequence4, false);
                    this.rightFolder = makeLayout4;
                    this.rightFolderWidth = makeLayout4.getLineWidth(0);
                }
                if (charSequence5 != null) {
                    StaticLayout makeLayout5 = makeLayout(charSequence5, false);
                    this.rightFolder2 = makeLayout5;
                    this.rightFolder2Width = makeLayout5.getLineWidth(0);
                }
                float[] fArr = this.radii;
                float dp = AndroidUtilities.dp(3.0f);
                fArr[3] = dp;
                fArr[2] = dp;
                fArr[1] = dp;
                fArr[0] = dp;
                float[] fArr2 = this.radii;
                float dp2 = AndroidUtilities.dp(1.0f);
                fArr2[7] = dp2;
                fArr2[6] = dp2;
                fArr2[5] = dp2;
                fArr2[4] = dp2;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.leftGradient = linearGradient;
                this.leftPaint.setShader(linearGradient);
                this.leftPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.rightGradient = linearGradient2;
                this.rightPaint.setShader(linearGradient2);
                this.rightPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }

            private StaticLayout makeLayout(CharSequence charSequence, boolean z) {
                if (charSequence == null || "ALL_CHATS".equals(charSequence.toString())) {
                    charSequence = LocaleController.getString("FilterAllChats", R.string.FilterAllChats);
                }
                return new StaticLayout(charSequence, z ? this.selectedTextPaint : this.paint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                super.onDraw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.save();
                float dp = this.middleFolderWidth + (isCountEmpty() ? 0.0f : AndroidUtilities.dp(15.32f) + this.countText.getCurrentWidth());
                float f2 = dp / 2.0f;
                float f3 = measuredWidth - f2;
                canvas.translate(f3, measuredHeight - (this.middleFolder.getHeight() / 2.0f));
                this.middleFolder.draw(canvas);
                canvas.restore();
                if (!isCountEmpty()) {
                    android.graphics.Rect rect = AndroidUtilities.rectTmp2;
                    rect.set((int) (this.middleFolderWidth + f3 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (this.middleFolderWidth + f3 + AndroidUtilities.dp(15.32f) + this.countText.getCurrentWidth()), (int) (AndroidUtilities.dp(9.0f) + measuredHeight));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(rect);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), this.selectedPaint);
                    rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
                    this.countText.setBounds(rect);
                    this.countText.draw(canvas);
                }
                float dp2 = AndroidUtilities.dp(30.0f);
                float f4 = this.leftFolderWidth;
                float f5 = (f3 - dp2) - f4;
                if (this.leftFolder2 == null || f4 >= AndroidUtilities.dp(64.0f)) {
                    f = f5;
                } else {
                    float f6 = f5 - (this.leftFolder2Width + dp2);
                    canvas.save();
                    canvas.translate(f6, (measuredHeight - (this.leftFolder2.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.leftFolder2.draw(canvas);
                    canvas.restore();
                    f = f6;
                }
                if (this.leftFolder != null) {
                    canvas.save();
                    canvas.translate(f5, (measuredHeight - (this.leftFolder.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.leftFolder.draw(canvas);
                    canvas.restore();
                }
                float f7 = dp + f3;
                if (this.rightFolder != null) {
                    canvas.save();
                    canvas.translate(f7 + dp2, (measuredHeight - (this.rightFolder.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.rightFolder.draw(canvas);
                    canvas.restore();
                    f7 += this.rightFolderWidth + dp2;
                }
                if (this.rightFolder2 != null && this.rightFolderWidth < AndroidUtilities.dp(64.0f)) {
                    canvas.save();
                    canvas.translate(f7 + dp2, (measuredHeight - (this.rightFolder2.getHeight() / 2.0f)) + AndroidUtilities.dp(1.0f));
                    this.rightFolder2.draw(canvas);
                    canvas.restore();
                    f7 += dp2 + this.rightFolder2Width;
                }
                float height = measuredHeight + (this.middleFolder.getHeight() / 2.0f) + AndroidUtilities.dp(12.0f);
                canvas.drawRect(0.0f, height, getMeasuredWidth(), height + 1.0f, this.paint);
                this.path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f8 = f2 + measuredWidth;
                rectF2.set(f3 - AndroidUtilities.dp(4.0f), height - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f8, height);
                this.path.addRoundRect(rectF2, this.radii, Path.Direction.CW);
                canvas.drawPath(this.path, this.selectedPaint);
                canvas.save();
                float max = Math.max(AndroidUtilities.dp(8.0f), f);
                this.leftMatrix.reset();
                this.leftMatrix.postTranslate(Math.min(f3, max + AndroidUtilities.dp(8.0f)), 0.0f);
                this.leftGradient.setLocalMatrix(this.leftMatrix);
                float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7);
                this.rightMatrix.reset();
                this.rightMatrix.postTranslate(Math.max(f8, min - AndroidUtilities.dp(88.0f)), 0.0f);
                this.rightGradient.setLocalMatrix(this.rightMatrix);
                canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.leftPaint);
                canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.rightPaint);
                canvas.restore();
                canvas.restore();
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.countText || super.verifyDrawable(drawable);
            }

            private boolean isCountEmpty() {
                return this.countText.getText() == null || this.countText.getText().length() == 0;
            }

            public void setCount(int i, boolean z) {
                String str;
                if (z) {
                    this.countText.cancelAnimation();
                }
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
                if (i > 0) {
                    str = "+" + i;
                } else {
                    str = "";
                }
                animatedTextDrawable.setText(str, z);
                invalidate();
            }
        }
    }

    public void updateHeaderCell(boolean z) {
        HeaderCell headerCell = this.headerCell;
        if (headerCell == null) {
            return;
        }
        if (this.deleting) {
            headerCell.setText(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", this.peers.size(), new Object[0]), false);
        } else {
            headerCell.setText(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", this.peers.size(), new Object[0]), false);
        }
        ArrayList<TLRPC$Peer> arrayList = this.peers;
        if (arrayList != null && arrayList.size() - this.alreadyJoined.size() > 1) {
            final boolean z2 = this.selectedPeers.size() >= this.peers.size() - this.alreadyJoined.size();
            this.headerCell.setAction(LocaleController.getString(z2 ? R.string.DeselectAll : R.string.SelectAll), new Runnable() {
                @Override
                public final void run() {
                    FolderBottomSheet.this.lambda$updateHeaderCell$20(z2);
                }
            });
            return;
        }
        this.headerCell.setAction("", null);
    }

    public void lambda$updateHeaderCell$20(boolean z) {
        deselectAll(this.headerCell, z);
    }

    private void announceSelection(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.selectedPeers.size(), new Object[0]));
        if (!z || this.headerCell == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.headerCell.actionTextView.getText());
        }
        sb.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
    }

    private void deselectAll(final HeaderCell headerCell, final boolean z) {
        this.selectedPeers.clear();
        this.selectedPeers.addAll(this.alreadyJoined);
        if (!z) {
            for (int i = 0; i < this.peers.size(); i++) {
                long peerDialogId = DialogObject.getPeerDialogId(this.peers.get(i));
                if (!this.selectedPeers.contains(Long.valueOf(peerDialogId))) {
                    this.selectedPeers.add(Long.valueOf(peerDialogId));
                }
            }
        }
        updateCount(true);
        headerCell.setAction(LocaleController.getString(z ? R.string.SelectAll : R.string.DeselectAll), new Runnable() {
            @Override
            public final void run() {
                FolderBottomSheet.this.lambda$deselectAll$21(headerCell, z);
            }
        });
        announceSelection(true);
        for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
            View childAt = this.recyclerListView.getChildAt(i2);
            if (childAt instanceof GroupCreateUserCell) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((GroupCreateUserCell) childAt).setChecked(this.selectedPeers.contains(Long.valueOf(((Long) tag).longValue())), true);
                }
            }
        }
    }

    public void lambda$deselectAll$21(HeaderCell headerCell, boolean z) {
        deselectAll(headerCell, !z);
    }
}

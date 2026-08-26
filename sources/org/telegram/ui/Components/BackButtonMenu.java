package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TopicsFragment;

public class BackButtonMenu {

    public static class PulledDialog<T> {
        Class<T> activity;
        TLRPC.Chat chat;
        long dialogId;
        int filterId;
        int folderId;
        int stackIndex;
        TLRPC.TL_forumTopic topic;
        TLRPC.User user;
    }

    public static void addToPulledDialogs(BaseFragment baseFragment, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        INavigationLayout parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
        if (actionBarLayout.getPulledDialogs() == null) {
            actionBarLayout.setPulledDialogs(new ArrayList());
        }
        for (PulledDialog pulledDialog : actionBarLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && pulledDialog.dialogId == j) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = pulledDialog.topic) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        PulledDialog pulledDialog2 = new PulledDialog();
        pulledDialog2.activity = ChatActivity.class;
        pulledDialog2.stackIndex = i;
        pulledDialog2.dialogId = j;
        pulledDialog2.filterId = i3;
        pulledDialog2.folderId = i2;
        pulledDialog2.chat = chat;
        pulledDialog2.user = user;
        pulledDialog2.topic = tL_forumTopic;
        actionBarLayout.getPulledDialogs().add(pulledDialog2);
    }

    public static void clearPulledDialogs(BaseFragment baseFragment, int i) {
        INavigationLayout parentLayout;
        if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
        if (actionBarLayout.getPulledDialogs() != null) {
            int i2 = 0;
            while (i2 < actionBarLayout.getPulledDialogs().size()) {
                if (actionBarLayout.getPulledDialogs().get(i2).stackIndex > i) {
                    actionBarLayout.getPulledDialogs().remove(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    public static ArrayList<PulledDialog> getStackedHistoryDialogs(BaseFragment baseFragment, long j) {
        INavigationLayout parentLayout;
        TLRPC.Chat currentChat;
        TLRPC.User currentUser;
        long dialogId;
        int dialogFilterId;
        int dialogFolderId;
        Class<T> cls;
        ArrayList<PulledDialog> arrayList = new ArrayList<>();
        if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return arrayList;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
        List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
        List<PulledDialog> pulledDialogs = actionBarLayout.getPulledDialogs();
        if (fragmentStack != null) {
            int size = fragmentStack.size();
            for (int i = 0; i < size; i++) {
                BaseFragment baseFragment2 = fragmentStack.get(i);
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                    if (chatActivity.getChatMode() == 0 && !chatActivity.isReport()) {
                        currentChat = chatActivity.getCurrentChat();
                        currentUser = chatActivity.getCurrentUser();
                        dialogId = chatActivity.getDialogId();
                        dialogFolderId = chatActivity.getDialogFolderId();
                        dialogFilterId = chatActivity.getDialogFilterId();
                        cls = ChatActivity.class;
                        if (dialogId == j && (j != 0 || !UserObject.isUserSelf(currentUser))) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    PulledDialog pulledDialog = new PulledDialog();
                                    pulledDialog.activity = cls;
                                    pulledDialog.stackIndex = i;
                                    pulledDialog.chat = currentChat;
                                    pulledDialog.user = currentUser;
                                    pulledDialog.dialogId = dialogId;
                                    pulledDialog.folderId = dialogFolderId;
                                    pulledDialog.filterId = dialogFilterId;
                                    if (currentChat != null || currentUser != null) {
                                        arrayList.add(pulledDialog);
                                        break;
                                    }
                                    break;
                                }
                                if (arrayList.get(i2).dialogId == dialogId) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                } else if (baseFragment2 instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) baseFragment2;
                    currentChat = profileActivity.getCurrentChat();
                    try {
                        currentUser = profileActivity.getUserInfo().user;
                    } catch (Exception unused) {
                        currentUser = null;
                    }
                    dialogId = profileActivity.getDialogId();
                    dialogFilterId = 0;
                    dialogFolderId = 0;
                    cls = ProfileActivity.class;
                    if (dialogId == j) {
                    }
                }
            }
        }
        if (pulledDialogs != null) {
            for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                PulledDialog pulledDialog2 = pulledDialogs.get(size2);
                if (pulledDialog2.dialogId != j) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            arrayList.add(pulledDialog2);
                            break;
                        }
                        if (arrayList.get(i3).dialogId == pulledDialog2.dialogId) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        Collections.sort(arrayList, new SeekBar$$ExternalSyntheticLambda0(3));
        return arrayList;
    }

    private static ArrayList<PulledDialog> getStackedHistoryForTopic(BaseFragment baseFragment, long j, long j2) {
        INavigationLayout parentLayout;
        int i;
        ArrayList<PulledDialog> arrayList = new ArrayList<>();
        if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return arrayList;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
        List<PulledDialog> pulledDialogs = actionBarLayout.getPulledDialogs();
        if (pulledDialogs != null) {
            i = -1;
            for (int i2 = 0; i2 < pulledDialogs.size(); i2++) {
                PulledDialog pulledDialog = pulledDialogs.get(i2);
                TLRPC.TL_forumTopic tL_forumTopic = pulledDialog.topic;
                if (tL_forumTopic != null && tL_forumTopic.id != j2) {
                    int i3 = pulledDialog.stackIndex;
                    if (i3 >= i) {
                        i = i3;
                    }
                    arrayList.add(pulledDialog);
                }
            }
        } else {
            i = -1;
        }
        if (actionBarLayout.getFragmentStack().size() <= 1 || !(Theme.ResourcesProvider.CC.m(actionBarLayout, 2, actionBarLayout.getFragmentStack()) instanceof TopicsFragment)) {
            PulledDialog pulledDialog2 = new PulledDialog();
            arrayList.add(pulledDialog2);
            pulledDialog2.stackIndex = -1;
            pulledDialog2.activity = TopicsFragment.class;
            pulledDialog2.chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
        } else {
            PulledDialog pulledDialog3 = new PulledDialog();
            arrayList.add(pulledDialog3);
            pulledDialog3.stackIndex = i + 1;
            pulledDialog3.activity = DialogsActivity.class;
            PulledDialog pulledDialog4 = new PulledDialog();
            arrayList.add(pulledDialog4);
            pulledDialog4.stackIndex = -1;
            pulledDialog4.activity = TopicsFragment.class;
            pulledDialog4.chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
        }
        Collections.sort(arrayList, new SeekBar$$ExternalSyntheticLambda0(4));
        return arrayList;
    }

    public static void goToPulledDialog(BaseFragment baseFragment, PulledDialog pulledDialog) {
        BaseFragment baseFragment2;
        if (pulledDialog == null) {
            return;
        }
        GenericDeclaration genericDeclaration = pulledDialog.activity;
        if (genericDeclaration == ChatActivity.class) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = pulledDialog.chat;
            if (chat != null) {
                bundle.putLong("chat_id", chat.id);
            } else {
                TLRPC.User user = pulledDialog.user;
                if (user != null) {
                    bundle.putLong("user_id", user.id);
                }
            }
            bundle.putInt("dialog_folder_id", pulledDialog.folderId);
            bundle.putInt("dialog_filter_id", pulledDialog.filterId);
            TLRPC.TL_forumTopic tL_forumTopic = pulledDialog.topic;
            if (tL_forumTopic != null) {
                baseFragment2 = baseFragment;
                baseFragment2.presentFragment(ForumUtilities.getChatActivityForTopic(baseFragment2, pulledDialog.chat.id, tL_forumTopic, 0, bundle), true);
            } else {
                baseFragment2 = baseFragment;
                baseFragment2.presentFragment(new ChatActivity(bundle), true);
            }
        } else {
            baseFragment2 = baseFragment;
            if (genericDeclaration == ProfileActivity.class) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("dialog_id", pulledDialog.dialogId);
                baseFragment2.presentFragment(new ProfileActivity(bundle2), true);
            }
        }
        if (pulledDialog.activity == TopicsFragment.class) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", pulledDialog.chat.id);
            baseFragment2.presentFragment(new TopicsFragment(bundle3), true);
        }
        if (pulledDialog.activity == DialogsActivity.class) {
            baseFragment2.presentFragment(new DialogsActivity(null), true);
        }
    }

    public static int lambda$getStackedHistoryDialogs$2(PulledDialog pulledDialog, PulledDialog pulledDialog2) {
        return pulledDialog2.stackIndex - pulledDialog.stackIndex;
    }

    public static int lambda$getStackedHistoryForTopic$1(PulledDialog pulledDialog, PulledDialog pulledDialog2) {
        return pulledDialog2.stackIndex - pulledDialog.stackIndex;
    }

    public static void lambda$show$0(AtomicReference atomicReference, PulledDialog pulledDialog, INavigationLayout iNavigationLayout, TLRPC.TL_forumTopic tL_forumTopic, BaseFragment baseFragment, View view) {
        Long lValueOf;
        int i;
        Long lValueOf2 = null;
        if (atomicReference.get() != null) {
            ((ActionBarPopupWindow) atomicReference.getAndSet(null)).dismiss();
        }
        if (pulledDialog.stackIndex >= 0) {
            if (iNavigationLayout != null) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
                if (actionBarLayout.getFragmentStack() == null || pulledDialog.stackIndex >= actionBarLayout.getFragmentStack().size()) {
                    lValueOf = null;
                } else {
                    BaseFragment baseFragment2 = actionBarLayout.getFragmentStack().get(pulledDialog.stackIndex);
                    if (baseFragment2 instanceof ChatActivity) {
                        ChatActivity chatActivity = (ChatActivity) baseFragment2;
                        lValueOf2 = Long.valueOf(chatActivity.getDialogId());
                        lValueOf = Long.valueOf(chatActivity.getTopicId());
                    } else if (baseFragment2 instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) baseFragment2;
                        lValueOf2 = Long.valueOf(profileActivity.getDialogId());
                        lValueOf = Long.valueOf(profileActivity.getTopicId());
                    } else {
                        lValueOf = null;
                    }
                }
            } else {
                lValueOf = null;
            }
            if ((lValueOf2 != null && lValueOf2.longValue() != pulledDialog.dialogId) || (tL_forumTopic != null && lValueOf != null && tL_forumTopic.id != lValueOf.longValue())) {
                ActionBarLayout actionBarLayout2 = (ActionBarLayout) iNavigationLayout;
                for (int iM = Theme.ResourcesProvider.CC.m(actionBarLayout2, 2); iM > pulledDialog.stackIndex; iM--) {
                    actionBarLayout2.removeFragmentFromStack(iM);
                }
            } else if (iNavigationLayout != null) {
                ActionBarLayout actionBarLayout3 = (ActionBarLayout) iNavigationLayout;
                if (actionBarLayout3.getFragmentStack() != null) {
                    ArrayList arrayList = new ArrayList(actionBarLayout3.getFragmentStack());
                    int size = arrayList.size() - 2;
                    while (true) {
                        i = pulledDialog.stackIndex;
                        if (size <= i) {
                            break;
                        }
                        ((BaseFragment) arrayList.get(size)).removeSelfFromStack();
                        size--;
                    }
                    if (i < actionBarLayout3.getFragmentStack().size()) {
                        ((ActionBarLayout) iNavigationLayout).closeLastFragment(true, false);
                        return;
                    }
                }
            }
        }
        goToPulledDialog(baseFragment, pulledDialog);
    }

    public static ActionBarPopupWindow show(BaseFragment baseFragment, View view, long j, long j2, Theme.ResourcesProvider resourcesProvider) {
        int i;
        boolean z;
        Drawable drawable;
        String string;
        BitmapDrawable bitmapDrawable;
        Drawable drawable2;
        BitmapDrawable bitmapDrawable2;
        int i2;
        int i3;
        if (baseFragment == null) {
            return null;
        }
        INavigationLayout parentLayout = baseFragment.getParentLayout();
        Activity parentActivity = baseFragment.getParentActivity();
        View fragmentView = baseFragment.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        long j3 = 0;
        ArrayList<PulledDialog> stackedHistoryDialogs = (j2 == 0 || ChatObject.isMonoForum(baseFragment.getCurrentAccount(), j)) ? getStackedHistoryDialogs(baseFragment, j) : getStackedHistoryForTopic(baseFragment, j, j2);
        if (stackedHistoryDialogs.size() <= 0) {
            return null;
        }
        int i4 = R.drawable.popup_fixed_alert4;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity, i4, resourcesProvider, 0);
        Rect rect = new Rect();
        baseFragment.getParentActivity().getResources().getDrawable(i4).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        AtomicReference atomicReference = new AtomicReference();
        int size = stackedHistoryDialogs.size();
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            long j4 = j3;
            if (i5 >= size) {
                break;
            }
            boolean z3 = i5 == 0;
            boolean z4 = i5 == size + (-1);
            PulledDialog pulledDialog = stackedHistoryDialogs.get(i5);
            TLRPC.Chat chat = pulledDialog.chat;
            TLRPC.User user = pulledDialog.user;
            INavigationLayout iNavigationLayout = parentLayout;
            TLRPC.TL_forumTopic tL_forumTopic = pulledDialog.topic;
            boolean z5 = z4;
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            int i6 = i5;
            frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            BackupImageView backupImageView = new BackupImageView(parentActivity);
            AtomicReference atomicReference2 = atomicReference;
            if (chat == null && user == null) {
                backupImageView.setRoundRadius(0);
            } else {
                backupImageView.setRoundRadius((chat == null || !chat.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
            }
            frameLayout.addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(parentActivity);
            boolean z6 = z2;
            textView.setLines(1);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setScaleSize(0.8f);
            if (tL_forumTopic != null) {
                if (tL_forumTopic.id == 1) {
                    backupImageView.setImageDrawable(ForumUtilities.createGeneralTopicDrawable(fragmentView.getContext(), 1.0f, Theme.getColor(Theme.key_chat_inMenu, resourcesProvider), false));
                } else if (tL_forumTopic.icon_emoji_id != j4) {
                    backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(10, baseFragment.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                } else {
                    backupImageView.setImageDrawable(ForumUtilities.createTopicDrawable(tL_forumTopic));
                }
                textView.setText(tL_forumTopic.title);
            } else {
                rect = rect;
                if (chat != null) {
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), chat);
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null && (bitmapDrawable2 = chatPhoto.strippedBitmap) != null) {
                        drawable2 = avatarDrawable;
                        drawable2 = avatarDrawable;
                        drawable2 = bitmapDrawable2;
                    }
                    drawable2 = avatarDrawable;
                    drawable2 = avatarDrawable;
                    drawable2 = avatarDrawable;
                    backupImageView.setImage(ImageLocation.getForChat(baseFragment.getCurrentAccount(), chat, 1), "50_50", drawable2, chat);
                    textView.setText(chat.title);
                } else if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto == null || (bitmapDrawable = userProfilePhoto.strippedBitmap) == null) {
                        drawable = bitmapDrawable;
                        drawable = avatarDrawable;
                    }
                    drawable = bitmapDrawable;
                    if (pulledDialog.activity == ChatActivity.class && UserObject.isUserSelf(user)) {
                        string = LocaleController.getString(R.string.SavedMessages);
                        avatarDrawable.setAvatarType(1);
                        backupImageView.setImageDrawable(avatarDrawable);
                    } else {
                        if (UserObject.isReplyUser(user)) {
                            string = LocaleController.getString(R.string.RepliesTitle);
                            avatarDrawable.setAvatarType(12);
                            backupImageView.setImageDrawable(avatarDrawable);
                        } else if (UserObject.isDeleted(user)) {
                            string = LocaleController.getString(R.string.HiddenName);
                            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                            i = 1;
                            backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", avatarDrawable, user);
                        } else {
                            String userName = UserObject.getUserName(user);
                            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                            i = 1;
                            backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", drawable, user);
                            string = userName;
                        }
                        textView.setText(string);
                        z = false;
                        z6 = true;
                    }
                    i = 1;
                    textView.setText(string);
                    z = false;
                    z6 = true;
                } else {
                    tL_forumTopic = tL_forumTopic;
                    i = 1;
                    backupImageView.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                    backupImageView.setSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    textView.setText(LocaleController.getString(R.string.AllChats));
                    z = true;
                }
                frameLayout.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
                atomicReference = atomicReference2;
                frameLayout.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda70(atomicReference, pulledDialog, iNavigationLayout, tL_forumTopic, baseFragment));
                if (z3) {
                    i2 = 3;
                } else {
                    i2 = 0;
                }
                if (z5) {
                    i3 = 3;
                } else {
                    i3 = 0;
                }
                actionBarPopupWindowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, i2, 0, i3));
                if (z) {
                    View frameLayout2 = new FrameLayout(parentActivity);
                    frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                    frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(i));
                    actionBarPopupWindowLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, 8));
                }
                i5 = i6 + 1;
                j3 = j4;
                parentLayout = iNavigationLayout;
                rect = rect;
                z2 = z6;
            }
            z = false;
            i = 1;
            z6 = true;
            frameLayout.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
            atomicReference = atomicReference2;
            frameLayout.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda70(atomicReference, pulledDialog, iNavigationLayout, tL_forumTopic, baseFragment));
            if (z3) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            if (z5) {
                i3 = 3;
            } else {
                i3 = 0;
            }
            actionBarPopupWindowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, i2, 0, i3));
            if (z) {
                View frameLayout3 = new FrameLayout(parentActivity);
                frameLayout3.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                frameLayout3.setTag(R.id.fit_width_tag, Integer.valueOf(i));
                actionBarPopupWindowLayout.addView(frameLayout3, LayoutHelper.createLinear(-1, 8));
            }
            i5 = i6 + 1;
            j3 = j4;
            parentLayout = iNavigationLayout;
            rect = rect;
            z2 = z6;
        }
        Rect rect2 = rect;
        if (!z2) {
            return null;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        atomicReference.set(actionBarPopupWindow);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setFitItems(true);
        int iDp = AndroidUtilities.dp(7.0f) - rect2.left;
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            fragmentView.getLocationInWindow(iArr);
            iDp += iArr[0];
        }
        actionBarPopupWindow.showAtLocation(fragmentView, 51, iDp, (view.getBottom() - rect2.top) - AndroidUtilities.dp(1.0f));
        return actionBarPopupWindow;
    }
}

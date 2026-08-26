package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TopicsFragment;

public abstract class BackButtonMenu {

    public final class PulledDialog {
        public Class activity;
        public TLRPC.Chat chat;
        public long dialogId;
        public int filterId;
        public int folderId;
        public int stackIndex;
        public TLRPC.TL_forumTopic topic;
        public TLRPC.User user;
    }

    public static void addToPulledDialogs(ChatActivity chatActivity, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        INavigationLayout parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = chatActivity.getParentLayout()) == null) {
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

    public static ActionBarPopupWindow show(BaseFragment baseFragment, ImageView imageView, long j, long j2, Theme.ResourcesProvider resourcesProvider) {
        Class<ChatActivity> cls;
        ArrayList arrayList;
        INavigationLayout iNavigationLayout;
        TLRPC.Chat chat;
        TLRPC.User currentUser;
        long dialogId;
        Class cls2;
        int i;
        int i2;
        INavigationLayout iNavigationLayout2;
        List<BaseFragment> list;
        long j3;
        ArrayList arrayList2;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        Rect rect;
        AtomicReference atomicReference;
        int size;
        boolean z;
        int i3;
        int iDp;
        boolean z2;
        boolean z3;
        PulledDialog pulledDialog;
        TLRPC.Chat chat2;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z4;
        BackupImageView backupImageView;
        int iDp2;
        TextView textView;
        AvatarDrawable avatarDrawable;
        Class<ChatActivity> cls3;
        boolean z5;
        boolean z6;
        TLRPC.UserProfilePhoto userProfilePhoto;
        Drawable drawable;
        String string;
        BitmapDrawable bitmapDrawable;
        TLRPC.ChatPhoto chatPhoto;
        Drawable drawable2;
        BitmapDrawable bitmapDrawable2;
        int i4;
        int i5;
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2;
        int i6;
        Class<ChatActivity> cls4;
        INavigationLayout parentLayout = baseFragment.getParentLayout();
        Activity parentActivity = baseFragment.getParentActivity();
        View fragmentView = baseFragment.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        Class<ChatActivity> cls5 = ChatActivity.class;
        if (j2 == 0 || ChatObject.isMonoForum(baseFragment.getCurrentAccount(), j)) {
            cls = cls5;
            arrayList = new ArrayList();
            INavigationLayout parentLayout2 = baseFragment.getParentLayout();
            if (parentLayout2 != null) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout2;
                List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
                List<PulledDialog> pulledDialogs = actionBarLayout.getPulledDialogs();
                if (fragmentStack != null) {
                    int size2 = fragmentStack.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        BaseFragment baseFragment2 = fragmentStack.get(i7);
                        if (baseFragment2 instanceof ChatActivity) {
                            ChatActivity chatActivity = (ChatActivity) baseFragment2;
                            if (chatActivity.chatMode == 0 && !chatActivity.isReport()) {
                                chat = chatActivity.currentChat;
                                currentUser = chatActivity.getCurrentUser();
                                dialogId = chatActivity.getDialogId();
                                i2 = chatActivity.dialogFolderId;
                                i = chatActivity.dialogFilterId;
                                cls2 = cls;
                                j3 = dialogId;
                                if (j3 == j && (j != 0 || !UserObject.isUserSelf(currentUser))) {
                                    iNavigationLayout2 = parentLayout;
                                    list = fragmentStack;
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= arrayList.size()) {
                                            PulledDialog pulledDialog2 = new PulledDialog();
                                            pulledDialog2.activity = cls2;
                                            pulledDialog2.stackIndex = i7;
                                            pulledDialog2.chat = chat;
                                            pulledDialog2.user = currentUser;
                                            pulledDialog2.dialogId = j3;
                                            pulledDialog2.folderId = i2;
                                            pulledDialog2.filterId = i;
                                            if (chat != null || currentUser != null) {
                                                arrayList.add(pulledDialog2);
                                                break;
                                            }
                                            break;
                                        }
                                        int i9 = i8;
                                        if (((PulledDialog) arrayList.get(i8)).dialogId == j3) {
                                            break;
                                        }
                                        i8 = i9 + 1;
                                    }
                                }
                            }
                            i7++;
                            fragmentStack = list;
                            parentLayout = iNavigationLayout2;
                        } else {
                            if (baseFragment2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) baseFragment2;
                                chat = profileActivity.currentChat;
                                try {
                                    currentUser = profileActivity.userInfo.user;
                                } catch (Exception unused) {
                                    currentUser = null;
                                }
                                dialogId = profileActivity.getDialogId();
                                cls2 = ProfileActivity.class;
                                i = 0;
                                i2 = 0;
                                j3 = dialogId;
                                if (j3 == j) {
                                }
                            }
                            i7++;
                            fragmentStack = list;
                            parentLayout = iNavigationLayout2;
                        }
                        iNavigationLayout2 = parentLayout;
                        list = fragmentStack;
                        i7++;
                        fragmentStack = list;
                        parentLayout = iNavigationLayout2;
                    }
                }
                iNavigationLayout = parentLayout;
                if (pulledDialogs != null) {
                    for (int size3 = pulledDialogs.size() - 1; size3 >= 0; size3--) {
                        PulledDialog pulledDialog3 = pulledDialogs.get(size3);
                        if (pulledDialog3.dialogId != j) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= arrayList.size()) {
                                    arrayList.add(pulledDialog3);
                                    break;
                                }
                                if (((PulledDialog) arrayList.get(i10)).dialogId == pulledDialog3.dialogId) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(10));
            }
            arrayList2 = arrayList;
            if (arrayList2.size() <= 0) {
                return null;
            }
            int i11 = R.drawable.popup_fixed_alert4;
            actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(i11, 0, parentActivity, resourcesProvider);
            rect = new Rect();
            baseFragment.getParentActivity().getResources().getDrawable(i11).mutate().getPadding(rect);
            actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
            atomicReference = new AtomicReference();
            size = arrayList2.size();
            z = false;
            i3 = 0;
            while (i3 < size) {
                if (i3 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i3 == size - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                pulledDialog = (PulledDialog) arrayList2.get(i3);
                chat2 = pulledDialog.chat;
                user = pulledDialog.user;
                tL_forumTopic = pulledDialog.topic;
                z4 = z;
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                backupImageView = new BackupImageView(parentActivity);
                ArrayList arrayList3 = arrayList2;
                if (chat2 == null || user != null) {
                    if (chat2 == null && chat2.forum) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    backupImageView.setRoundRadius(iDp2);
                } else {
                    backupImageView.setRoundRadius(0);
                }
                frameLayout.addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                textView = new TextView(parentActivity);
                AtomicReference atomicReference2 = atomicReference;
                textView.setLines(1);
                int i12 = size;
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
                textView.setEllipsize(TextUtils.TruncateAt.END);
                frameLayout.addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                avatarDrawable.scaleSize = 0.8f;
                if (tL_forumTopic != null) {
                    if (tL_forumTopic.id == 1) {
                        backupImageView.setImageDrawable(ForumUtilities.createGeneralTopicDrawable(fragmentView.getContext(), 1.0f, Theme.getColor(Theme.key_chat_inMenu, resourcesProvider), false));
                    } else if (tL_forumTopic.icon_emoji_id != 0) {
                        backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(10, baseFragment.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                    } else {
                        backupImageView.setImageDrawable(ForumUtilities.createTopicDrawable(tL_forumTopic));
                    }
                    textView.setText(tL_forumTopic.title);
                } else {
                    i3 = i3;
                    if (chat2 != null) {
                        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), chat2);
                        chatPhoto = chat2.photo;
                        if (chatPhoto != null && (bitmapDrawable2 = chatPhoto.strippedBitmap) != null) {
                            drawable2 = avatarDrawable;
                            drawable2 = avatarDrawable;
                            drawable2 = bitmapDrawable2;
                        }
                        drawable2 = avatarDrawable;
                        drawable2 = avatarDrawable;
                        drawable2 = avatarDrawable;
                        backupImageView.setImage(ImageLocation.getForChat(baseFragment.getCurrentAccount(), chat2, 1), "50_50", drawable2, chat2);
                        textView.setText(chat2.title);
                    } else if (user != null) {
                        userProfilePhoto = user.photo;
                        if (userProfilePhoto != null || (bitmapDrawable = userProfilePhoto.strippedBitmap) == null) {
                            drawable = bitmapDrawable;
                            drawable = avatarDrawable;
                        }
                        drawable = bitmapDrawable;
                        cls3 = cls;
                        if (pulledDialog.activity == cls3 || !UserObject.isUserSelf(user)) {
                            if (UserObject.isReplyUser(user)) {
                                string = LocaleController.getString(R.string.RepliesTitle);
                                avatarDrawable.setAvatarType(12);
                                backupImageView.setImageDrawable(avatarDrawable);
                            } else if (UserObject.isDeleted(user)) {
                                string = LocaleController.getString(R.string.HiddenName);
                                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                                backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", avatarDrawable, user);
                            } else {
                                String userName = UserObject.getUserName(user);
                                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                                backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", drawable, user);
                                string = userName;
                            }
                            textView.setText(string);
                            z5 = true;
                            z6 = false;
                        } else {
                            string = LocaleController.getString(R.string.SavedMessages);
                            avatarDrawable.setAvatarType(1);
                            backupImageView.setImageDrawable(avatarDrawable);
                        }
                        textView.setText(string);
                        z5 = true;
                        z6 = false;
                    } else {
                        pulledDialog = pulledDialog;
                        z2 = z2;
                        cls3 = cls;
                        backupImageView.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                        int iDp3 = AndroidUtilities.dp(24.0f);
                        int iDp4 = AndroidUtilities.dp(24.0f);
                        backupImageView.width = iDp3;
                        backupImageView.height = iDp4;
                        backupImageView.invalidate();
                        backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        textView.setText(LocaleController.getString(R.string.AllChats));
                        z5 = z4;
                        z6 = true;
                    }
                    frameLayout.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
                    INavigationLayout iNavigationLayout3 = iNavigationLayout;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(atomicReference, pulledDialog, iNavigationLayout3, tL_forumTopic, baseFragment, 6));
                    if (z2) {
                        i4 = 3;
                    } else {
                        i4 = 0;
                    }
                    if (z3) {
                        i5 = 3;
                    } else {
                        i5 = 0;
                    }
                    ViewGroup.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, i4, 0, i5);
                    anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                    anonymousClass2.addView(frameLayout, layoutParamsCreateLinear);
                    if (z6) {
                        View frameLayout2 = new FrameLayout(parentActivity);
                        frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                        frameLayout2.setTag(R.id.fit_width_tag, 1);
                        anonymousClass2.addView(frameLayout2, LayoutHelper.createLinear(-1, 8));
                    }
                    i3++;
                    z = z5;
                    iNavigationLayout = iNavigationLayout3;
                    cls = cls3;
                    size = i12;
                    arrayList2 = arrayList3;
                }
                pulledDialog = pulledDialog;
                cls3 = cls;
                z5 = true;
                z6 = false;
                frameLayout.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
                INavigationLayout iNavigationLayout4 = iNavigationLayout;
                atomicReference = atomicReference2;
                frameLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(atomicReference, pulledDialog, iNavigationLayout4, tL_forumTopic, baseFragment, 6));
                if (z2) {
                    i4 = 3;
                } else {
                    i4 = 0;
                }
                if (z3) {
                    i5 = 3;
                } else {
                    i5 = 0;
                }
                ViewGroup.LayoutParams layoutParamsCreateLinear2 = LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, i4, 0, i5);
                anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                anonymousClass2.addView(frameLayout, layoutParamsCreateLinear2);
                if (z6) {
                    View frameLayout3 = new FrameLayout(parentActivity);
                    frameLayout3.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                    frameLayout3.setTag(R.id.fit_width_tag, 1);
                    anonymousClass2.addView(frameLayout3, LayoutHelper.createLinear(-1, 8));
                }
                i3++;
                z = z5;
                iNavigationLayout = iNavigationLayout4;
                cls = cls3;
                size = i12;
                arrayList2 = arrayList3;
            }
            if (!z) {
                return null;
            }
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
            atomicReference.set(actionBarPopupWindow);
            actionBarPopupWindow.pauseNotifications = true;
            actionBarPopupWindow.dismissAnimationDuration = 220;
            actionBarPopupWindow.setOutsideTouchable(true);
            actionBarPopupWindow.setClippingEnabled(true);
            actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            actionBarPopupWindow.setFocusable(true);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            actionBarPopupWindow.setInputMethodMode(2);
            actionBarPopupWindow.setSoftInputMode(0);
            actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindowLayout.setFitItems(true);
            iDp = AndroidUtilities.dp(7.0f) - rect.left;
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                fragmentView.getLocationInWindow(iArr);
                iDp += iArr[0];
            }
            actionBarPopupWindow.showAtLocation(fragmentView, 51, iDp, (imageView.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
            return actionBarPopupWindow;
        }
        arrayList = new ArrayList();
        INavigationLayout parentLayout3 = baseFragment.getParentLayout();
        if (parentLayout3 == null) {
            cls = cls5;
        } else {
            ActionBarLayout actionBarLayout2 = (ActionBarLayout) parentLayout3;
            List<PulledDialog> pulledDialogs2 = actionBarLayout2.getPulledDialogs();
            if (pulledDialogs2 != null) {
                int i13 = 0;
                i6 = -1;
                while (i13 < pulledDialogs2.size()) {
                    PulledDialog pulledDialog4 = pulledDialogs2.get(i13);
                    TLRPC.TL_forumTopic tL_forumTopic2 = pulledDialog4.topic;
                    if (tL_forumTopic2 != null) {
                        cls4 = cls5;
                        if (tL_forumTopic2.id != j2) {
                            int i14 = pulledDialog4.stackIndex;
                            if (i14 >= i6) {
                                i6 = i14;
                            }
                            arrayList.add(pulledDialog4);
                        }
                    } else {
                        cls4 = cls5;
                    }
                    i13++;
                    cls5 = cls4;
                }
            } else {
                i6 = -1;
            }
            cls = cls5;
            if (actionBarLayout2.getFragmentStack().size() <= 1 || !(ArticleViewer.IBlock.CC.m(actionBarLayout2, 2, actionBarLayout2.getFragmentStack()) instanceof TopicsFragment)) {
                PulledDialog pulledDialog5 = new PulledDialog();
                arrayList.add(pulledDialog5);
                pulledDialog5.stackIndex = -1;
                pulledDialog5.activity = TopicsFragment.class;
                pulledDialog5.chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
            } else {
                PulledDialog pulledDialog6 = new PulledDialog();
                arrayList.add(pulledDialog6);
                pulledDialog6.stackIndex = i6 + 1;
                pulledDialog6.activity = DialogsActivity.class;
                PulledDialog pulledDialog7 = new PulledDialog();
                arrayList.add(pulledDialog7);
                pulledDialog7.stackIndex = -1;
                pulledDialog7.activity = TopicsFragment.class;
                pulledDialog7.chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
            }
            Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(11));
        }
        iNavigationLayout = parentLayout;
        arrayList2 = arrayList;
        if (arrayList2.size() <= 0) {
            return null;
        }
        int i15 = R.drawable.popup_fixed_alert4;
        actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(i15, 0, parentActivity, resourcesProvider);
        rect = new Rect();
        baseFragment.getParentActivity().getResources().getDrawable(i15).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        atomicReference = new AtomicReference();
        size = arrayList2.size();
        z = false;
        i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 == size - 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            pulledDialog = (PulledDialog) arrayList2.get(i3);
            chat2 = pulledDialog.chat;
            user = pulledDialog.user;
            tL_forumTopic = pulledDialog.topic;
            z4 = z;
            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
            frameLayout4.setMinimumWidth(AndroidUtilities.dp(200.0f));
            backupImageView = new BackupImageView(parentActivity);
            ArrayList arrayList4 = arrayList2;
            if (chat2 == null) {
                if (chat2 == null) {
                    iDp2 = AndroidUtilities.dp(16.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                backupImageView.setRoundRadius(iDp2);
            } else {
                if (chat2 == null) {
                    iDp2 = AndroidUtilities.dp(16.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                backupImageView.setRoundRadius(iDp2);
            }
            frameLayout4.addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
            textView = new TextView(parentActivity);
            AtomicReference atomicReference3 = atomicReference;
            textView.setLines(1);
            int i16 = size;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout4.addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
            avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.scaleSize = 0.8f;
            if (tL_forumTopic != null) {
                if (tL_forumTopic.id == 1) {
                    backupImageView.setImageDrawable(ForumUtilities.createGeneralTopicDrawable(fragmentView.getContext(), 1.0f, Theme.getColor(Theme.key_chat_inMenu, resourcesProvider), false));
                } else if (tL_forumTopic.icon_emoji_id != 0) {
                    backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(10, baseFragment.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                } else {
                    backupImageView.setImageDrawable(ForumUtilities.createTopicDrawable(tL_forumTopic));
                }
                textView.setText(tL_forumTopic.title);
            } else {
                i3 = i3;
                if (chat2 != null) {
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), chat2);
                    chatPhoto = chat2.photo;
                    if (chatPhoto != null) {
                        drawable2 = avatarDrawable;
                        drawable2 = avatarDrawable;
                        drawable2 = bitmapDrawable2;
                    }
                    drawable2 = avatarDrawable;
                    drawable2 = avatarDrawable;
                    drawable2 = avatarDrawable;
                    backupImageView.setImage(ImageLocation.getForChat(baseFragment.getCurrentAccount(), chat2, 1), "50_50", drawable2, chat2);
                    textView.setText(chat2.title);
                } else if (user != null) {
                    userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        drawable = bitmapDrawable;
                        drawable = avatarDrawable;
                    } else {
                        drawable = bitmapDrawable;
                        drawable = avatarDrawable;
                    }
                    drawable = bitmapDrawable;
                    cls3 = cls;
                    if (pulledDialog.activity == cls3) {
                        if (UserObject.isReplyUser(user)) {
                            string = LocaleController.getString(R.string.RepliesTitle);
                            avatarDrawable.setAvatarType(12);
                            backupImageView.setImageDrawable(avatarDrawable);
                        } else if (UserObject.isDeleted(user)) {
                            string = LocaleController.getString(R.string.HiddenName);
                            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                            backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", avatarDrawable, user);
                        } else {
                            String userName2 = UserObject.getUserName(user);
                            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                            backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", drawable, user);
                            string = userName2;
                        }
                    } else if (UserObject.isReplyUser(user)) {
                        string = LocaleController.getString(R.string.RepliesTitle);
                        avatarDrawable.setAvatarType(12);
                        backupImageView.setImageDrawable(avatarDrawable);
                    } else if (UserObject.isDeleted(user)) {
                        string = LocaleController.getString(R.string.HiddenName);
                        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                        backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", avatarDrawable, user);
                    } else {
                        String userName3 = UserObject.getUserName(user);
                        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                        backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", drawable, user);
                        string = userName3;
                    }
                    textView.setText(string);
                    z5 = true;
                    z6 = false;
                } else {
                    pulledDialog = pulledDialog;
                    z2 = z2;
                    cls3 = cls;
                    backupImageView.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                    int iDp5 = AndroidUtilities.dp(24.0f);
                    int iDp6 = AndroidUtilities.dp(24.0f);
                    backupImageView.width = iDp5;
                    backupImageView.height = iDp6;
                    backupImageView.invalidate();
                    backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    textView.setText(LocaleController.getString(R.string.AllChats));
                    z5 = z4;
                    z6 = true;
                }
                frameLayout4.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
                INavigationLayout iNavigationLayout5 = iNavigationLayout;
                atomicReference = atomicReference3;
                frameLayout4.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(atomicReference, pulledDialog, iNavigationLayout5, tL_forumTopic, baseFragment, 6));
                if (z2) {
                    i4 = 3;
                } else {
                    i4 = 0;
                }
                if (z3) {
                    i5 = 3;
                } else {
                    i5 = 0;
                }
                ViewGroup.LayoutParams layoutParamsCreateLinear3 = LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, i4, 0, i5);
                anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                anonymousClass2.addView(frameLayout4, layoutParamsCreateLinear3);
                if (z6) {
                    View frameLayout5 = new FrameLayout(parentActivity);
                    frameLayout5.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                    frameLayout5.setTag(R.id.fit_width_tag, 1);
                    anonymousClass2.addView(frameLayout5, LayoutHelper.createLinear(-1, 8));
                }
                i3++;
                z = z5;
                iNavigationLayout = iNavigationLayout5;
                cls = cls3;
                size = i16;
                arrayList2 = arrayList4;
            }
            pulledDialog = pulledDialog;
            cls3 = cls;
            z5 = true;
            z6 = false;
            frameLayout4.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
            INavigationLayout iNavigationLayout6 = iNavigationLayout;
            atomicReference = atomicReference3;
            frameLayout4.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(atomicReference, pulledDialog, iNavigationLayout6, tL_forumTopic, baseFragment, 6));
            if (z2) {
                i4 = 3;
            } else {
                i4 = 0;
            }
            if (z3) {
                i5 = 3;
            } else {
                i5 = 0;
            }
            ViewGroup.LayoutParams layoutParamsCreateLinear4 = LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, i4, 0, i5);
            anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
            anonymousClass2.addView(frameLayout4, layoutParamsCreateLinear4);
            if (z6) {
                View frameLayout6 = new FrameLayout(parentActivity);
                frameLayout6.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                frameLayout6.setTag(R.id.fit_width_tag, 1);
                anonymousClass2.addView(frameLayout6, LayoutHelper.createLinear(-1, 8));
            }
            i3++;
            z = z5;
            iNavigationLayout = iNavigationLayout6;
            cls = cls3;
            size = i16;
            arrayList2 = arrayList4;
        }
        if (!z) {
            return null;
        }
        ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(actionBarPopupWindowLayout);
        atomicReference.set(actionBarPopupWindow2);
        actionBarPopupWindow2.pauseNotifications = true;
        actionBarPopupWindow2.dismissAnimationDuration = 220;
        actionBarPopupWindow2.setOutsideTouchable(true);
        actionBarPopupWindow2.setClippingEnabled(true);
        actionBarPopupWindow2.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow2.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow2.setInputMethodMode(2);
        actionBarPopupWindow2.setSoftInputMode(0);
        actionBarPopupWindow2.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setFitItems(true);
        iDp = AndroidUtilities.dp(7.0f) - rect.left;
        if (AndroidUtilities.isTablet()) {
            int[] iArr2 = new int[2];
            fragmentView.getLocationInWindow(iArr2);
            iDp += iArr2[0];
        }
        actionBarPopupWindow2.showAtLocation(fragmentView, 51, iDp, (imageView.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
        return actionBarPopupWindow2;
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ProfileActivity;

public class BackButtonMenu {

    public static class PulledDialog<T> {
        Class<T> activity;
        TLRPC$Chat chat;
        long dialogId;
        int filterId;
        int folderId;
        int stackIndex;
        TLRPC$User user;
    }

    public static ActionBarPopupWindow show(final BaseFragment baseFragment, View view, long j) {
        ArrayList<PulledDialog> arrayList;
        String str;
        if (baseFragment == null) {
            return null;
        }
        final ActionBarLayout parentLayout = baseFragment.getParentLayout();
        Activity parentActivity = baseFragment.getParentActivity();
        View fragmentView = baseFragment.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        ArrayList<PulledDialog> stackedHistoryDialogs = getStackedHistoryDialogs(baseFragment, j);
        if (stackedHistoryDialogs.size() <= 0) {
            return null;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity);
        Rect rect = new Rect();
        baseFragment.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
        final AtomicReference atomicReference = new AtomicReference();
        int i = 0;
        while (i < stackedHistoryDialogs.size()) {
            final PulledDialog pulledDialog = stackedHistoryDialogs.get(i);
            TLRPC$Chat tLRPC$Chat = pulledDialog.chat;
            TLRPC$User tLRPC$User = pulledDialog.user;
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            BackupImageView backupImageView = new BackupImageView(parentActivity);
            backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 13.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(parentActivity);
            textView.setLines(1);
            parentActivity = parentActivity;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 59.0f, 0.0f, 12.0f, 0.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setSmallSize(true);
            if (tLRPC$Chat != null) {
                avatarDrawable.setInfo(tLRPC$Chat);
                backupImageView.setImage(ImageLocation.getForChat(tLRPC$Chat, 1), "50_50", avatarDrawable, tLRPC$Chat);
                textView.setText(tLRPC$Chat.title);
            } else if (tLRPC$User != null) {
                arrayList = stackedHistoryDialogs;
                if (pulledDialog.activity == ChatActivity.class && UserObject.isUserSelf(tLRPC$User)) {
                    str = LocaleController.getString("SavedMessages", R.string.SavedMessages);
                    avatarDrawable.setAvatarType(1);
                    backupImageView.setImageDrawable(avatarDrawable);
                } else if (UserObject.isReplyUser(tLRPC$User)) {
                    str = LocaleController.getString("RepliesTitle", R.string.RepliesTitle);
                    avatarDrawable.setAvatarType(12);
                    backupImageView.setImageDrawable(avatarDrawable);
                } else if (UserObject.isDeleted(tLRPC$User)) {
                    str = LocaleController.getString("HiddenName", R.string.HiddenName);
                    avatarDrawable.setInfo(tLRPC$User);
                    backupImageView.setImage(ImageLocation.getForUser(tLRPC$User, 1), "50_50", avatarDrawable, tLRPC$User);
                } else {
                    str = UserObject.getUserName(tLRPC$User);
                    avatarDrawable.setInfo(tLRPC$User);
                    backupImageView.setImage(ImageLocation.getForUser(tLRPC$User, 1), "50_50", avatarDrawable, tLRPC$User);
                }
                textView.setText(str);
                frameLayout.setBackground(Theme.getSelectorDrawable(Theme.getColor("listSelectorSDK21"), false));
                frameLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        BackButtonMenu.lambda$show$0(atomicReference, pulledDialog, parentLayout, baseFragment, view2);
                    }
                });
                actionBarPopupWindowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 48));
                i++;
                stackedHistoryDialogs = arrayList;
            }
            arrayList = stackedHistoryDialogs;
            frameLayout.setBackground(Theme.getSelectorDrawable(Theme.getColor("listSelectorSDK21"), false));
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    BackButtonMenu.lambda$show$0(atomicReference, pulledDialog, parentLayout, baseFragment, view2);
                }
            });
            actionBarPopupWindowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 48));
            i++;
            stackedHistoryDialogs = arrayList;
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
        int dp = AndroidUtilities.dp(8.0f) - rect.left;
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            fragmentView.getLocationInWindow(iArr);
            dp += iArr[0];
        }
        actionBarPopupWindow.showAtLocation(fragmentView, 51, dp, (view.getBottom() - rect.top) - AndroidUtilities.dp(8.0f));
        try {
            fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return actionBarPopupWindow;
    }

    public static void lambda$show$0(AtomicReference atomicReference, PulledDialog pulledDialog, ActionBarLayout actionBarLayout, BaseFragment baseFragment, View view) {
        ArrayList<BaseFragment> arrayList;
        int i;
        ArrayList<BaseFragment> arrayList2;
        Long l = null;
        if (atomicReference.get() != null) {
            ((ActionBarPopupWindow) atomicReference.getAndSet(null)).dismiss();
        }
        int i2 = pulledDialog.stackIndex;
        if (i2 >= 0) {
            if (!(actionBarLayout == null || (arrayList2 = actionBarLayout.fragmentsStack) == null || i2 >= arrayList2.size())) {
                BaseFragment baseFragment2 = actionBarLayout.fragmentsStack.get(pulledDialog.stackIndex);
                if (baseFragment2 instanceof ChatActivity) {
                    l = Long.valueOf(((ChatActivity) baseFragment2).getDialogId());
                } else if (baseFragment2 instanceof ProfileActivity) {
                    l = Long.valueOf(((ProfileActivity) baseFragment2).getDialogId());
                }
            }
            if (l != null && l.longValue() != pulledDialog.dialogId) {
                for (int size = actionBarLayout.fragmentsStack.size() - 2; size > pulledDialog.stackIndex; size--) {
                    actionBarLayout.removeFragmentFromStack(size);
                }
            } else if (!(actionBarLayout == null || (arrayList = actionBarLayout.fragmentsStack) == null)) {
                int size2 = arrayList.size() - 2;
                while (true) {
                    i = pulledDialog.stackIndex;
                    if (size2 <= i) {
                        break;
                    }
                    if (size2 >= 0 && size2 < actionBarLayout.fragmentsStack.size()) {
                        actionBarLayout.removeFragmentFromStack(size2);
                    }
                    size2--;
                }
                if (i < actionBarLayout.fragmentsStack.size()) {
                    actionBarLayout.showFragment(pulledDialog.stackIndex);
                    actionBarLayout.closeLastFragment(true);
                    return;
                }
            }
        }
        goToPulledDialog(baseFragment, pulledDialog);
    }

    public static void goToPulledDialog(BaseFragment baseFragment, PulledDialog pulledDialog) {
        if (pulledDialog != null) {
            GenericDeclaration genericDeclaration = pulledDialog.activity;
            if (genericDeclaration == ChatActivity.class) {
                Bundle bundle = new Bundle();
                TLRPC$Chat tLRPC$Chat = pulledDialog.chat;
                if (tLRPC$Chat != null) {
                    bundle.putLong("chat_id", tLRPC$Chat.id);
                } else {
                    TLRPC$User tLRPC$User = pulledDialog.user;
                    if (tLRPC$User != null) {
                        bundle.putLong("user_id", tLRPC$User.id);
                    }
                }
                bundle.putInt("dialog_folder_id", pulledDialog.folderId);
                bundle.putInt("dialog_filter_id", pulledDialog.filterId);
                baseFragment.presentFragment(new ChatActivity(bundle), true);
            } else if (genericDeclaration == ProfileActivity.class) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("dialog_id", pulledDialog.dialogId);
                baseFragment.presentFragment(new ProfileActivity(bundle2), true);
            }
        }
    }

    public static java.util.ArrayList<org.telegram.ui.Components.BackButtonMenu.PulledDialog> getStackedHistoryDialogs(org.telegram.ui.ActionBar.BaseFragment r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BackButtonMenu.getStackedHistoryDialogs(org.telegram.ui.ActionBar.BaseFragment, long):java.util.ArrayList");
    }

    public static int lambda$getStackedHistoryDialogs$1(PulledDialog pulledDialog, PulledDialog pulledDialog2) {
        return pulledDialog2.stackIndex - pulledDialog.stackIndex;
    }

    public static void addToPulledDialogs(BaseFragment baseFragment, int i, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, long j, int i2, int i3) {
        ActionBarLayout parentLayout;
        if ((tLRPC$Chat != null || tLRPC$User != null) && baseFragment != null && (parentLayout = baseFragment.getParentLayout()) != null) {
            if (parentLayout.pulledDialogs == null) {
                parentLayout.pulledDialogs = new ArrayList<>();
            }
            boolean z = false;
            Iterator<PulledDialog> it = parentLayout.pulledDialogs.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().dialogId == j) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                PulledDialog pulledDialog = new PulledDialog();
                pulledDialog.activity = ChatActivity.class;
                pulledDialog.stackIndex = i;
                pulledDialog.dialogId = j;
                pulledDialog.filterId = i3;
                pulledDialog.folderId = i2;
                pulledDialog.chat = tLRPC$Chat;
                pulledDialog.user = tLRPC$User;
                parentLayout.pulledDialogs.add(pulledDialog);
            }
        }
    }

    public static void clearPulledDialogs(BaseFragment baseFragment, int i) {
        ActionBarLayout parentLayout;
        if (baseFragment != null && (parentLayout = baseFragment.getParentLayout()) != null && parentLayout.pulledDialogs != null) {
            int i2 = 0;
            while (i2 < parentLayout.pulledDialogs.size()) {
                if (parentLayout.pulledDialogs.get(i2).stackIndex > i) {
                    parentLayout.pulledDialogs.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
    }
}

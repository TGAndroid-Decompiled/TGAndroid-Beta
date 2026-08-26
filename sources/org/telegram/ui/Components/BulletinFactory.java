package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class BulletinFactory {
    public final FrameLayout containerLayout;
    public final BaseFragment fragment;
    public final Theme.ResourcesProvider resourcesProvider;

    public BulletinFactory(BaseFragment baseFragment) {
        if (baseFragment == null || baseFragment.getLastStoryViewer() == null || !baseFragment.getLastStoryViewer().attachedToParent()) {
            this.fragment = baseFragment;
            this.containerLayout = null;
            this.resourcesProvider = baseFragment != null ? baseFragment.getResourceProvider() : null;
        } else {
            this.fragment = null;
            PeerStoriesView currentPeerView = baseFragment.getLastStoryViewer().storiesViewPager.getCurrentPeerView();
            this.containerLayout = currentPeerView != null ? currentPeerView.storyContainer : null;
            this.resourcesProvider = baseFragment.getLastStoryViewer().resourcesProvider;
        }
    }

    public static boolean canShowBulletin(BaseFragment baseFragment) {
        return (baseFragment == null || baseFragment.getParentActivity() == null || baseFragment.getLayoutContainer() == null) ? false : true;
    }

    public static Bulletin createBanBulletin(ProfileActivity profileActivity, boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(profileActivity.getParentActivity(), profileActivity.resourcesProvider);
        if (z) {
            lottieLayout.setAnimation(R.raw.ic_ban, 32, 32, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            lottieLayout.setAnimation(R.raw.ic_unban, 32, 32, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        return Bulletin.make(profileActivity, lottieLayout, 1500);
    }

    public static Bulletin createDissableSharingBulletin(ProfileActivity profileActivity, String str, boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(profileActivity.getParentActivity(), profileActivity.resourcesProvider);
        if (str != null) {
            string = LocaleController.formatString(z ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        lottieLayout.setAnimation((z || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, 32, 32, new String[0]);
        return Bulletin.make(profileActivity, lottieLayout, 5000);
    }

    public static Bulletin createForwardedBulletin(Context context, BaseFragment baseFragment, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, boolean z, PollItemMenu$$ExternalSyntheticLambda12 pollItemMenu$$ExternalSyntheticLambda12) {
        Bulletin.LottieLayout lottieLayout;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        Bulletin bulletinMake;
        int i6 = 12;
        int i7 = 0;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || baseFragment == null || i > 1 || j != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z) {
            lottieLayout = new Bulletin.LottieLayout(context, baseFragment != null ? baseFragment.getResourceProvider() : null);
            lottieLayout.setBackground(i3);
            lottieLayout.setTextColor(i4);
        } else {
            lottieLayout = new Bulletin.LottieLayoutWithReactions(i2, baseFragment);
        }
        Bulletin.LottieLayout lottieLayout2 = lottieLayout;
        boolean z2 = pollItemMenu$$ExternalSyntheticLambda12 != null;
        ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9 = pollItemMenu$$ExternalSyntheticLambda12 != null ? new ChatLinkActivity$$ExternalSyntheticLambda9(19, new boolean[]{false}, pollItemMenu$$ExternalSyntheticLambda12) : null;
        if (i > 1) {
            spannableStringBuilderReplaceTags = i2 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i, new Object[0]));
            lottieLayout2.setAnimation(R.raw.forward, 30, 30, new String[0]);
        } else if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            if (i2 <= 1) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z ? new ChatActivity$$ExternalSyntheticLambda470(14) : new ChatActivity$$ExternalSyntheticLambda470(i6));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ChatActivity$$ExternalSyntheticLambda470(i6));
            }
            lottieLayout2.setAnimation(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            PollItemMenu$$ExternalSyntheticLambda12 pollItemMenu$$ExternalSyntheticLambda13 = new PollItemMenu$$ExternalSyntheticLambda12(chatLinkActivity$$ExternalSyntheticLambda9, baseFragment, j, 9);
            if (DialogObject.isChatDialog(j)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
                if (i2 <= 1) {
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, pollItemMenu$$ExternalSyntheticLambda13) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                } else {
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, pollItemMenu$$ExternalSyntheticLambda13) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
                if (i2 <= 1) {
                    int i8 = z2 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i8, UserObject.getFirstName(user)), -1, 2, pollItemMenu$$ExternalSyntheticLambda13) : AndroidUtilities.replaceTags(LocaleController.formatString(i8, UserObject.getFirstName(user)));
                } else {
                    int i9 = z2 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    spannableStringBuilderReplaceTags = baseFragment != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i9, UserObject.getFirstName(user)), -1, 2, pollItemMenu$$ExternalSyntheticLambda13) : AndroidUtilities.replaceTags(LocaleController.formatString(i9, UserObject.getFirstName(user)));
                }
            }
            lottieLayout2.setAnimation(R.raw.forward, 30, 30, new String[0]);
        }
        lottieLayout2.textView.setText(spannableStringBuilderReplaceTags);
        if (z2) {
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(lottieLayout2.getContext(), baseFragment != null ? baseFragment.getResourceProvider() : null, true, true);
            undoButton.undoAction = null;
            undoButton.delayedAction = chatLinkActivity$$ExternalSyntheticLambda9;
            lottieLayout2.setButton(undoButton);
        }
        lottieLayout2.postDelayed(new BulletinFactory$$ExternalSyntheticLambda9(lottieLayout2, i7), 300);
        if (frameLayout != null) {
            bulletinMake = Bulletin.make(frameLayout, lottieLayout2, i5);
        } else {
            if (baseFragment == null) {
                throw new IllegalArgumentException();
            }
            bulletinMake = Bulletin.make(baseFragment, lottieLayout2, i5);
        }
        if (lottieLayout2 instanceof Bulletin.LottieLayoutWithReactions) {
            lottieLayout2.textView.setSingleLine(false);
            lottieLayout2.textView.setMaxLines(2);
            ((Bulletin.LottieLayoutWithReactions) lottieLayout2).setBulletin(bulletinMake);
            bulletinMake.hideAfterBottomSheet = false;
        }
        return bulletinMake;
    }

    public static Bulletin createInviteSentBulletin(Activity activity, FrameLayout frameLayout, int i, long j, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(activity, null);
        lottieLayout.setBackground(i2);
        lottieLayout.setTextColor(i3);
        int i4 = 1;
        int i5 = 300;
        if (i > 1) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i, new Object[0])));
            lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
        } else if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
            lottieLayout.setAnimation(R.raw.saved_messages, 30, 30, new String[0]);
            i5 = -1;
        } else {
            if (DialogObject.isChatDialog(j)) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j)).title));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j)))));
            }
            lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
        }
        lottieLayout.textView.setText(spannableStringBuilderReplaceTags);
        if (i5 > 0) {
            lottieLayout.postDelayed(new BulletinFactory$$ExternalSyntheticLambda9(lottieLayout, i4), i5);
        }
        return Bulletin.make(frameLayout, lottieLayout, 1500);
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        String string;
        boolean z;
        boolean z2 = true;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        if (i == 0) {
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        } else if (i == 1) {
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 8, new Object[0]));
        } else {
            if (i != 2) {
                if (i == 3) {
                    string = LocaleController.getString(R.string.NotificationsMutedHint);
                } else if (i == 4) {
                    string = LocaleController.getString(R.string.NotificationsUnmutedHint);
                    z = false;
                    z2 = false;
                } else {
                    if (i != 5) {
                        throw new IllegalArgumentException();
                    }
                    string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i2));
                    z = true;
                }
                if (z2) {
                    lottieLayout.setAnimation(R.raw.mute_for, 32, 32, new String[0]);
                } else if (z) {
                    lottieLayout.setAnimation(R.raw.ic_mute, 32, 32, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    lottieLayout.setAnimation(R.raw.ic_unmute, 32, 32, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                lottieLayout.textView.setText(string);
                return Bulletin.make(baseFragment, lottieLayout, 1500);
            }
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Days", 2, new Object[0]));
        }
        z = true;
        z2 = false;
        if (z2) {
            lottieLayout.setAnimation(R.raw.mute_for, 32, 32, new String[0]);
        } else if (z) {
            lottieLayout.setAnimation(R.raw.ic_mute, 32, 32, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            lottieLayout.setAnimation(R.raw.ic_unmute, 32, 32, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        lottieLayout.textView.setText(string);
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createPinMessageBulletin(ChatActivity chatActivity, boolean z, ArticleViewer$$ExternalSyntheticLambda71 articleViewer$$ExternalSyntheticLambda71, ChatActivity$$ExternalSyntheticLambda6 chatActivity$$ExternalSyntheticLambda6, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(chatActivity.getParentActivity(), resourcesProvider);
        lottieLayout.setAnimation(z ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        lottieLayout.textView.setText(LocaleController.getString(z ? "MessagePinnedHint" : "MessageUnpinnedHint", z ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z) {
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(chatActivity.getParentActivity(), resourcesProvider, true, false);
            undoButton.undoAction = articleViewer$$ExternalSyntheticLambda71;
            undoButton.delayedAction = chatActivity$$ExternalSyntheticLambda6;
            lottieLayout.setButton(undoButton);
        }
        return Bulletin.make(chatActivity, lottieLayout, z ? 1500 : 5000);
    }

    public static Bulletin createPromoteToAdminBulletin(BaseFragment baseFragment, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(R.raw.ic_admin, 32, 32, "Shield");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createRemoveFromChatBulletin(BaseFragment baseFragment, TLRPC.User user, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        lottieLayout.setAnimation(R.raw.ic_ban, 32, 32, "Hand");
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static Bulletin createSaveToGalleryBulletin(FrameLayout frameLayout, boolean z) {
        return new BulletinFactory(frameLayout, null).createDownloadBulletin(z ? FileType.VIDEO : FileType.PHOTO, 1, -115203550, -1, null);
    }

    public static Bulletin createSoundEnabledBulletin(int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(baseFragment.getParentActivity(), resourcesProvider);
        boolean z = true;
        if (i == 0) {
            string = LocaleController.getString(R.string.SoundOnHint);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException();
            }
            string = LocaleController.getString(R.string.SoundOffHint);
            z = false;
        }
        if (z) {
            lottieLayout.setAnimation(R.raw.sound_on, 32, 32, new String[0]);
        } else {
            lottieLayout.setAnimation(R.raw.sound_off, 32, 32, new String[0]);
        }
        lottieLayout.textView.setText(string);
        return Bulletin.make(baseFragment, lottieLayout, 1500);
    }

    public static BulletinFactory global() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return new BulletinFactory(new Bulletin.BulletinWindow(ApplicationLoader.applicationContext, null).container, null);
        }
        Dialog dialog = safeLastFragment.visibleDialog;
        return dialog instanceof BottomSheet ? new BulletinFactory(((BottomSheet) dialog).container, safeLastFragment.getResourceProvider()) : of(safeLastFragment);
    }

    public static BulletinFactory of(BaseFragment baseFragment) {
        return baseFragment == null ? global() : new BulletinFactory(baseFragment);
    }

    public static void showError(TLRPC.TL_error tL_error) {
        if (LaunchActivity.isActive) {
            if (tL_error == null || tL_error.code != 406) {
                global().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).show();
            }
        }
    }

    public final Bulletin create(Bulletin.ButtonLayout buttonLayout, int i) {
        BaseFragment baseFragment = this.fragment;
        return baseFragment != null ? Bulletin.make(baseFragment, buttonLayout, i) : Bulletin.make(this.containerLayout, buttonLayout, i);
    }

    public final Bulletin createAdReportedBulletin(CharSequence charSequence) {
        if (getContext() == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(R.raw.ic_admin, 32, 32, "Shield");
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.textView.setText(charSequence);
        return create(lottieLayout, 2750);
    }

    public final Bulletin createCaptionLimitBulletin(int i, Runnable runnable) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.caption_limit, 32, 32, new String[0]);
        String pluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i, new Object[0]);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(pluralString));
        int iIndexOf = pluralString.indexOf(42);
        int i2 = iIndexOf + 1;
        int iIndexOf2 = pluralString.indexOf(42, i2);
        spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf2 + 1, (CharSequence) pluralString.substring(i2, iIndexOf2));
        spannableStringBuilderValueOf.setSpan(new TableView.AnonymousClass2(1, runnable), iIndexOf, iIndexOf2 - 1, 33);
        lottieLayout.textView.setText(spannableStringBuilderValueOf);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        return create(lottieLayout, 5000);
    }

    public final Bulletin createChatsBulletin(String str, ArrayList arrayList) {
        AvatarsImageView avatarsImageView;
        Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(getContext(), this.resourcesProvider, false);
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            avatarsImageView = usersLayout.avatarsImageView;
            if (i >= size || i2 >= 3) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i);
            if (tLObject != null) {
                int i3 = i2 + 1;
                avatarsImageView.setCount(i3);
                avatarsImageView.avatarsDrawable.setObject(i2, tLObject, UserConfig.selectedAccount);
                i2 = i3;
            }
            i++;
        }
        if (arrayList.size() == 1) {
            avatarsImageView.setTranslationX(AndroidUtilities.dp(4.0f));
            avatarsImageView.setScaleX(1.2f);
            avatarsImageView.setScaleY(1.2f);
        } else {
            avatarsImageView.setScaleX(1.0f);
            avatarsImageView.setScaleY(1.0f);
        }
        avatarsImageView.avatarsDrawable.commitTransition(false, true);
        LinkSpanDrawable.LinksTextView linksTextView = usersLayout.textView;
        linksTextView.setSingleLine(false);
        linksTextView.setMaxLines(2);
        linksTextView.setText(str);
        if (linksTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int iDp = AndroidUtilities.dp(74 - ((3 - i2) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).rightMargin = iDp;
            } else {
                ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).leftMargin = iDp;
            }
        }
        if (LocaleController.isRTL) {
            avatarsImageView.setTranslationX(AndroidUtilities.dp(32 - ((i2 - 1) * 12)));
        }
        return create(usersLayout, 5000);
    }

    public final Bulletin createContainsEmojiBulletin(TLRPC.Document document, int i, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        LoadingSpan loadingSpan;
        TLRPC.StickerSet stickerSet;
        CharSequence charSequenceReplaceTags;
        final int i2 = 0;
        final int i3 = 1;
        final TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
        if (inputStickerSet == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            if (i == 1) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
            } else {
                charSequenceReplaceTags = i == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
            }
            return createEmojiBulletin(document, charSequenceReplaceTags, LocaleController.getString(R.string.ViewAction), new Runnable() {
                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            callback.run(inputStickerSet);
                            break;
                        default:
                            callback.run(inputStickerSet);
                            break;
                    }
                }
            });
        }
        if (i == 1) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>")));
        } else {
            spannableStringBuilder = i == 2 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>"))) : new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        }
        int iIndexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (iIndexOf >= 0) {
            loadingSpan = new LoadingSpan(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), null, resourcesProvider);
            spannableStringBuilder.setSpan(loadingSpan, iIndexOf, iIndexOf + 11, 33);
            int i4 = Theme.key_undo_infoColor;
            loadingSpan.setColors(ColorUtils.setAlphaComponent(Theme.getColor(i4, resourcesProvider), 32), ColorUtils.setAlphaComponent(Theme.getColor(i4, resourcesProvider), 72));
        } else {
            loadingSpan = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        callback.run(inputStickerSet);
                        break;
                    default:
                        callback.run(inputStickerSet);
                        break;
                }
            }
        };
        Bulletin.LoadingLottieLayout loadingLottieLayout = new Bulletin.LoadingLottieLayout(getContext(), resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            loadingLottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        loadingLottieLayout.setAnimation(document, new String[0]);
        loadingLottieLayout.textView.setTextSize(1, 14.0f);
        loadingLottieLayout.textView.setSingleLine(false);
        loadingLottieLayout.textView.setMaxLines(3);
        LinkSpanDrawable.LinksTextView linksTextView = loadingLottieLayout.textLoadingView;
        linksTextView.setText(spannableStringBuilder);
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setSingleLine(false);
        linksTextView.setMaxLines(3);
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
        TextView textView = undoButton.undoTextView;
        if (textView != null) {
            textView.setText(string);
        }
        undoButton.undoAction = runnable;
        loadingLottieLayout.setButton(undoButton);
        Bulletin bulletinCreate = create(loadingLottieLayout, 2750);
        if (loadingSpan != null) {
            Bulletin.Layout layout = bulletinCreate.layout;
            if (layout instanceof Bulletin.LoadingLottieLayout) {
                loadingSpan.view = ((Bulletin.LoadingLottieLayout) layout).textLoadingView;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new BulletinFactory$$ExternalSyntheticLambda4(i, bulletinCreate, jCurrentTimeMillis));
        return bulletinCreate;
    }

    public final Bulletin createCopyBulletin(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        lottieLayout.textView.setText(str);
        return create(lottieLayout, 1500);
    }

    public final Bulletin createCopyLinkBulletin(boolean z) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new Bulletin.EmptyBulletin();
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (!z) {
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
            lottieLayout.setAnimation(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            lottieLayout.textView.setText(LocaleController.getString(R.string.LinkCopied));
            return create(lottieLayout, 1500);
        }
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), resourcesProvider);
        twoLineLottieLayout.setAnimation(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString(R.string.LinkCopied));
        twoLineLottieLayout.subtitleTextView.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return create(twoLineLottieLayout, 2750);
    }

    public final Bulletin createDownloadBulletin(FileType fileType, int i, Theme.ResourcesProvider resourcesProvider) {
        return createDownloadBulletin(fileType, i, 0, 0, resourcesProvider);
    }

    public final Bulletin createEmojiBulletin(TLRPC.Document document, String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (MessageObject.isTextColorEmoji(document)) {
            lottieLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        lottieLayout.setAnimation(document, new String[0]);
        lottieLayout.textView.setText(str);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        return create(lottieLayout, 2750);
    }

    public final Bulletin createErrorBulletin(CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        lottieLayout.setAnimation(R.raw.chats_infotip, 32, 32, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 1500);
    }

    public final Bulletin createImageBulletin(int i, CharSequence charSequence) {
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(context, resourcesProvider);
        lottieLayout.setBackground(Theme.getColor(Theme.key_undo_background, resourcesProvider), 12);
        lottieLayout.imageView.setImageResource(i);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setLines(2);
        lottieLayout.textView.setMaxLines(4);
        TextView textView = lottieLayout.textView;
        textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), lottieLayout.textView.getPaint()));
        lottieLayout.textView.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) lottieLayout.textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        lottieLayout.setWrapWidth();
        return create(lottieLayout, 5000);
    }

    public final Bulletin createMessagesTaggedBulletin(int i, TLRPC.Document document, ArticleViewer$$ExternalSyntheticLambda26 articleViewer$$ExternalSyntheticLambda26) {
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(context, resourcesProvider);
        lottieLayout.setAnimation(R.raw.tag_icon_3, 36, 36, new String[0]);
        lottieLayout.removeView(lottieLayout.textView);
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(lottieLayout.getContext());
        lottieLayout.textView = textViewEmojis;
        textViewEmojis.setTypeface(Typeface.SANS_SERIF);
        lottieLayout.textView.setTextSize(1, 15.0f);
        lottieLayout.textView.setEllipsize(TextUtils.TruncateAt.END);
        lottieLayout.textView.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, textPaint.getFontMetricsInt());
        animatedEmojiSpan.document = document;
        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
        lottieLayout.textView.setText(new SpannableStringBuilder(i > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (articleViewer$$ExternalSyntheticLambda26 != null) {
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
            String string = LocaleController.getString(R.string.ViewAction);
            TextView textView = undoButton.undoTextView;
            if (textView != null) {
                textView.setText(string);
            }
            undoButton.undoAction = articleViewer$$ExternalSyntheticLambda26;
            lottieLayout.setButton(undoButton);
        }
        lottieLayout.setTextColor(Theme.getColor(Theme.key_undo_infoColor, resourcesProvider));
        lottieLayout.addView(lottieLayout.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return create(lottieLayout, 2750);
    }

    public final Bulletin createSimpleBulletin(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true);
        BackupImageView backupImageView = twoLineLayout.imageView;
        backupImageView.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "28_28", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "28_28", null, 0L, null, null, 0);
        backupImageView.onNewImageSet();
        backupImageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = twoLineLayout.titleTextView;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = twoLineLayout.subtitleTextView;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return create(twoLineLayout, str2.length() < 20 ? 1500 : 2750);
    }

    public final Bulletin createSimpleBulletinDetail(int i, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setMaxLines(4);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final Bulletin createSimpleBulletinWithIconSize(int i, int i2, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, i2, i2, new String[0]);
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final Bulletin createSimpleMultiBulletin(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new Bulletin.EmptyBulletin();
        }
        Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true);
        BackupImageView backupImageView = twoLineLayout.imageView;
        backupImageView.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "28_28", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "28_28", null, 0L, null, null, 0);
        backupImageView.onNewImageSet();
        backupImageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = twoLineLayout.titleTextView;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        twoLineLayout.subtitleTextView.setVisibility(8);
        return create(twoLineLayout, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final Bulletin createSuccessBulletin(String str) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.contact_check, 32, 32, new String[0]);
        lottieLayout.textView.setText(str);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 1500);
    }

    public final Bulletin createUndoBulletin(String str, boolean z, Runnable runnable, Runnable runnable2) {
        Bulletin.ButtonLayout buttonLayout;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (zIsEmpty) {
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
            lottieLayout.textView.setText(str);
            lottieLayout.textView.setSingleLine(false);
            lottieLayout.textView.setMaxLines(2);
            buttonLayout = lottieLayout;
        } else {
            Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), resourcesProvider);
            twoLineLottieLayout.titleTextView.setText(str);
            twoLineLottieLayout.subtitleTextView.setText((CharSequence) null);
            buttonLayout = twoLineLottieLayout;
        }
        buttonLayout.setTimer();
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, z);
        String string = LocaleController.getString(R.string.UndoNoCaps);
        TextView textView = undoButton.undoTextView;
        if (textView != null) {
            textView.setText(string);
        }
        undoButton.undoAction = runnable;
        undoButton.delayedAction = runnable2;
        buttonLayout.setButton(undoButton);
        return create(buttonLayout, 5000);
    }

    public final Bulletin createUsersBulletin(List list, CharSequence charSequence, CharSequence charSequence2, BinaryBitmap binaryBitmap) {
        float f;
        int i;
        Context context = getContext();
        boolean z = charSequence2 != null;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(context, resourcesProvider, z);
        AvatarsImageView avatarsImageView = usersLayout.avatarsImageView;
        if (list != null) {
            int i2 = 0;
            i = 0;
            for (int i3 = 3; i2 < list.size() && i < i3; i3 = 3) {
                TLObject tLObject = (TLObject) list.get(i2);
                if (tLObject != null) {
                    int i4 = i + 1;
                    avatarsImageView.setCount(i4);
                    avatarsImageView.avatarsDrawable.setObject(i, tLObject, UserConfig.selectedAccount);
                    i = i4;
                }
                i2++;
            }
            f = 4.0f;
            if (list.size() == 1) {
                avatarsImageView.setTranslationX(AndroidUtilities.dp(4.0f));
                avatarsImageView.setScaleX(1.2f);
                avatarsImageView.setScaleY(1.2f);
            } else {
                avatarsImageView.setScaleX(1.0f);
                avatarsImageView.setScaleY(1.0f);
            }
        } else {
            f = 4.0f;
            i = 0;
        }
        avatarsImageView.avatarsDrawable.commitTransition(false, true);
        LinkSpanDrawable.LinksTextView linksTextView = usersLayout.textView;
        if (charSequence2 != null) {
            linksTextView.setSingleLine(true);
            linksTextView.setMaxLines(1);
            linksTextView.setText(charSequence);
            LinkSpanDrawable.LinksTextView linksTextView2 = usersLayout.subtitleView;
            linksTextView2.setText(charSequence2);
            linksTextView2.setSingleLine(false);
            linksTextView2.setMaxLines(3);
            LinearLayout linearLayout = usersLayout.linearLayout;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp = AndroidUtilities.dp(70 - ((3 - i) * 12));
                if (i == 1) {
                    iDp += AndroidUtilities.dp(f);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = iDp;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = iDp;
                }
            }
        } else {
            linksTextView.setSingleLine(false);
            linksTextView.setMaxLines(4);
            linksTextView.setText(charSequence);
            if (linksTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp2 = AndroidUtilities.dp(70 - ((3 - i) * 12));
                if (i == 1) {
                    linksTextView.setTranslationY(-AndroidUtilities.dp(1.0f));
                    iDp2 += AndroidUtilities.dp(f);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).rightMargin = iDp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).leftMargin = iDp2;
                }
            }
        }
        if (binaryBitmap != null) {
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
            String string = LocaleController.getString(R.string.UndoNoCaps);
            TextView textView = undoButton.undoTextView;
            if (textView != null) {
                textView.setText(string);
            }
            undoButton.undoAction = (Runnable) binaryBitmap.binarizer;
            undoButton.delayedAction = (Runnable) binaryBitmap.matrix;
            usersLayout.setButton(undoButton);
        }
        return create(usersLayout, 5000);
    }

    public final Context getContext() {
        Context context;
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            context = baseFragment.getParentActivity();
            if (context == null && this.fragment.getLayoutContainer() != null) {
                context = this.fragment.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.containerLayout;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final Bulletin makeForError(TLRPC.TL_error tL_error) {
        if (LaunchActivity.isActive) {
            return tL_error == null ? createErrorBulletin(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
        }
        return new Bulletin.EmptyBulletin();
    }

    public final void showForError(boolean z, TLRPC.TL_error tL_error) {
        if (LaunchActivity.isActive) {
            if (tL_error == null) {
                Bulletin bulletinCreateErrorBulletin = createErrorBulletin(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                bulletinCreateErrorBulletin.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin.show(z);
            } else if (tL_error.code != 406) {
                Bulletin bulletinCreateErrorBulletin2 = createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                bulletinCreateErrorBulletin2.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin2.show(z);
            }
        }
    }

    public final boolean showForwardedBulletinWithTag(int i, long j) {
        BaseFragment baseFragment;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (baseFragment = this.fragment) != null) {
            Bulletin.LottieLayoutWithReactions lottieLayoutWithReactions = new Bulletin.LottieLayoutWithReactions(i, baseFragment);
            if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = i <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ChatActivity$$ExternalSyntheticLambda470(12)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ChatActivity$$ExternalSyntheticLambda470(12));
                lottieLayoutWithReactions.setAnimation(R.raw.saved_messages, 36, 36, new String[0]);
                lottieLayoutWithReactions.textView.setText(spannableStringBuilderReplaceSingleTag);
                lottieLayoutWithReactions.textView.setSingleLine(false);
                lottieLayoutWithReactions.textView.setMaxLines(2);
                Bulletin bulletinCreate = create(lottieLayoutWithReactions, 3500);
                lottieLayoutWithReactions.setBulletin(bulletinCreate);
                bulletinCreate.hideAfterBottomSheet = false;
                bulletinCreate.show(true);
                return true;
            }
        }
        return false;
    }

    public final Bulletin createDownloadBulletin(FileType fileType, Theme.ResourcesProvider resourcesProvider) {
        return createDownloadBulletin(fileType, 1, 0, 0, resourcesProvider);
    }

    public static BulletinFactory of(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        return new BulletinFactory(frameLayout, resourcesProvider);
    }

    public final Bulletin createDownloadBulletin(FileType fileType, int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        Bulletin.LottieLayout lottieLayout;
        String string;
        if (i2 != 0 && i3 != 0) {
            lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
            lottieLayout.setBackground(i2);
            lottieLayout.setTextColor(i3);
        } else {
            lottieLayout = new Bulletin.LottieLayout(getContext(), resourcesProvider);
        }
        FileType.Icon icon = fileType.icon;
        lottieLayout.setAnimation(icon.resId, 32, 32, icon.layers);
        TextView textView = lottieLayout.textView;
        String str = fileType.localeKey;
        if (fileType.plural) {
            string = LocaleController.formatPluralString(str, i, new Object[0]);
        } else {
            string = LocaleController.getString(str, fileType.localeRes);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ChatActivity$$ExternalSyntheticLambda470(13)));
        int i4 = fileType.icon.paddingBottom;
        if (i4 != 0) {
            lottieLayout.setIconPaddingBottom(i4);
        }
        return create(lottieLayout, 1500);
    }

    public final class FileType {
        public static final FileType[] $VALUES;
        public static final FileType AUDIO;
        public static final FileType AUDIOS;
        public static final FileType GIF;
        public static final FileType GIF_TO_DOWNLOADS;
        public static final FileType LIVEPHOTO;
        public static final FileType LIVEPHOTOS;
        public static final FileType MEDIA;
        public static final FileType PHOTO;
        public static final FileType PHOTOS;
        public static final FileType PHOTO_TO_DOWNLOADS;
        public static final FileType UNKNOWN;
        public static final FileType UNKNOWNS;
        public static final FileType VIDEO;
        public static final FileType VIDEOS;
        public static final FileType VIDEO_TO_DOWNLOADS;
        public final Icon icon;
        public final String localeKey;
        public final int localeRes;
        public final boolean plural;

        public enum Icon {
            SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
            SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
            SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
            SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");

            public final String[] layers;
            public final int paddingBottom;
            public final int resId;

            Icon(int i, int i2, String... strArr) {
                this.resId = i;
                this.paddingBottom = i2;
                this.layers = strArr;
            }
        }

        static {
            int i = R.string.PhotoSavedHint;
            Icon icon = Icon.SAVED_TO_GALLERY;
            FileType fileType = new FileType("PHOTO", 0, "PhotoSavedHint", i, icon);
            PHOTO = fileType;
            FileType fileType2 = new FileType("PHOTOS", 1, "PhotosSavedHint", icon);
            PHOTOS = fileType2;
            FileType fileType3 = new FileType("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, icon);
            VIDEO = fileType3;
            FileType fileType4 = new FileType("VIDEOS", 3, "VideosSavedHint", icon);
            VIDEOS = fileType4;
            FileType fileType5 = new FileType("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, icon);
            LIVEPHOTO = fileType5;
            FileType fileType6 = new FileType("LIVEPHOTOS", 5, "LivePhotosSavedHint", icon);
            LIVEPHOTOS = fileType6;
            FileType fileType7 = new FileType("MEDIA", 6, "MediaSavedHint", icon);
            MEDIA = fileType7;
            int i2 = R.string.PhotoSavedToDownloadsHintLinked;
            Icon icon2 = Icon.SAVED_TO_DOWNLOADS;
            FileType fileType8 = new FileType("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i2, icon2);
            PHOTO_TO_DOWNLOADS = fileType8;
            FileType fileType9 = new FileType("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, icon2);
            VIDEO_TO_DOWNLOADS = fileType9;
            FileType fileType10 = new FileType("GIF", 9, "GifSavedHint", R.string.GifSavedHint, Icon.SAVED_TO_GIFS);
            GIF = fileType10;
            FileType fileType11 = new FileType("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, icon2);
            GIF_TO_DOWNLOADS = fileType11;
            int i3 = R.string.AudioSavedHint;
            Icon icon3 = Icon.SAVED_TO_MUSIC;
            FileType fileType12 = new FileType("AUDIO", 11, "AudioSavedHint", i3, icon3);
            AUDIO = fileType12;
            FileType fileType13 = new FileType("AUDIOS", 12, "AudiosSavedHint", icon3);
            AUDIOS = fileType13;
            FileType fileType14 = new FileType("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, icon2);
            UNKNOWN = fileType14;
            FileType fileType15 = new FileType("UNKNOWNS", 14, "FilesSavedHintLinked", icon2);
            UNKNOWNS = fileType15;
            $VALUES = new FileType[]{fileType, fileType2, fileType3, fileType4, fileType5, fileType6, fileType7, fileType8, fileType9, fileType10, fileType11, fileType12, fileType13, fileType14, fileType15};
        }

        public FileType(String str, int i, String str2, int i2, Icon icon) {
            super(str, i);
            this.localeKey = str2;
            this.localeRes = i2;
            this.icon = icon;
            this.plural = false;
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }

        public FileType(String str, int i, String str2, Icon icon) {
            super(str, i);
            this.localeKey = str2;
            this.icon = icon;
            this.localeRes = 0;
            this.plural = true;
        }
    }

    public final void showForError(String str, boolean z) {
        if (LaunchActivity.isActive) {
            if (TextUtils.isEmpty(str)) {
                Bulletin bulletinCreateErrorBulletin = createErrorBulletin(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                bulletinCreateErrorBulletin.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin.show(z);
            } else {
                Bulletin bulletinCreateErrorBulletin2 = createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                bulletinCreateErrorBulletin2.hideAfterBottomSheet = false;
                bulletinCreateErrorBulletin2.show(z);
            }
        }
    }

    public final Bulletin createBanBulletin(boolean z) {
        String string;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        if (z) {
            lottieLayout.setAnimation(R.raw.ic_ban, 32, 32, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            lottieLayout.setAnimation(R.raw.ic_unban, 32, 32, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        lottieLayout.textView.setText(AndroidUtilities.replaceTags(string));
        return create(lottieLayout, 1500);
    }

    public final Bulletin createEmojiBulletin(TLRPC.Document document, String str, CharSequence charSequence) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        boolean zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        RLottieImageView rLottieImageView = twoLineLottieLayout.imageView;
        if (zIsTextColorEmoji) {
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(36, 36, document);
        twoLineLottieLayout.titleTextView.setText(str);
        twoLineLottieLayout.subtitleTextView.setText(charSequence);
        return create(twoLineLottieLayout, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public BulletinFactory(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        this.containerLayout = frameLayout;
        this.fragment = null;
        this.resourcesProvider = resourcesProvider;
    }

    public static Bulletin createMuteBulletin(BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return createMuteBulletin(baseFragment, z ? 3 : 4, 0, resourcesProvider);
    }

    public final Bulletin createEmojiBulletin(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(context, resourcesProvider);
        boolean zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        RLottieImageView rLottieImageView = lottieLayout.imageView;
        if (zIsTextColorEmoji) {
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
        }
        lottieLayout.setAnimation(document, new String[0]);
        if (rLottieImageView.getImageReceiver() != null) {
            rLottieImageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
        TextView textView = undoButton.undoTextView;
        if (textView != null) {
            textView.setText(str);
        }
        undoButton.undoAction = runnable;
        lottieLayout.setButton(undoButton);
        return create(lottieLayout, 2750);
    }

    public final Bulletin createSimpleBulletin(int i, int i2, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        lottieLayout.setAnimation(i, 36, 36, new String[0]);
        if (charSequence != null) {
            String string = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i3 = 0;
            for (int iIndexOf = string.indexOf(10); iIndexOf >= 0 && iIndexOf < charSequence.length(); iIndexOf = string.indexOf(10, iIndexOf + 1)) {
                if (i3 >= i2) {
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) " ");
                }
                i3++;
            }
            charSequence = spannableStringBuilder;
        }
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(i2);
        lottieLayout.textView.setText(charSequence);
        return create(lottieLayout, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final Bulletin createSimpleBulletin(CharSequence charSequence, CharSequence charSequence2, int i) {
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(getContext(), this.resourcesProvider);
        twoLineLottieLayout.setAnimation(i, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(charSequence);
        twoLineLottieLayout.subtitleTextView.setText(charSequence2);
        return create(twoLineLottieLayout, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final Bulletin createSimpleBulletin(int i, CharSequence charSequence, Runnable runnable, String str) {
        return createSimpleBulletin(i, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final Bulletin createSimpleBulletin(int i, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(context, resourcesProvider);
        twoLineLottieLayout.setAnimation(i, 36, 36, new String[0]);
        twoLineLottieLayout.titleTextView.setText(str);
        twoLineLottieLayout.subtitleTextView.setText(charSequence);
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
        TextView textView = undoButton.undoTextView;
        if (textView != null) {
            textView.setText(str2);
        }
        undoButton.undoAction = runnable;
        twoLineLottieLayout.setButton(undoButton);
        return create(twoLineLottieLayout, 5000);
    }

    public final Bulletin createSimpleBulletin(int i, CharSequence charSequence, String str, int i2, boolean z, Runnable runnable) {
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(context, resourcesProvider);
        if (i != 0) {
            lottieLayout.setAnimation(i, 36, 36, new String[0]);
        } else {
            lottieLayout.imageView.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) lottieLayout.textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        lottieLayout.textView.setTextSize(1, 14.0f);
        lottieLayout.textView.setTextDirection(5);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(3);
        lottieLayout.textView.setText(charSequence);
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, z);
        TextView textView = undoButton.undoTextView;
        if (textView != null) {
            textView.setText(str);
        }
        undoButton.undoAction = runnable;
        lottieLayout.setButton(undoButton);
        return create(lottieLayout, i2);
    }

    public final Bulletin createSimpleBulletin(Drawable drawable, CharSequence charSequence) {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourcesProvider);
        RLottieImageView rLottieImageView = lottieLayout.imageView;
        rLottieImageView.setImageDrawable(drawable);
        if (drawable instanceof PeerColorActivity.PeerColorDrawable) {
            ((PeerColorActivity.PeerColorDrawable) drawable).setView(rLottieImageView);
        }
        lottieLayout.textView.setText(charSequence);
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        return create(lottieLayout, 2750);
    }
}

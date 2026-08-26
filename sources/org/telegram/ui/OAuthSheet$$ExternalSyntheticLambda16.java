package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.PhotoUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.IntSize;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;

    public OAuthSheet$$ExternalSyntheticLambda16(Context context, TLRPC.Chat chat, TLRPC.User user, int i, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = 7;
        this.f$2 = context;
        this.f$0 = chat;
        this.f$1 = user;
        this.f$3 = i;
        this.f$4 = booleanCallback;
        this.f$5 = resourcesProvider;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$13((TLRPC.TL_urlAuthResultRequest) this.f$0, (String[]) this.f$1, (Context) this.f$2, this.f$3, (OAuthSheet$$ExternalSyntheticLambda15) this.f$4, (BaseFragment) this.f$5);
                break;
            case 1:
                ((ChatObject.Call) this.f$0).lambda$loadUnknownParticipants$5(this.f$3, (TLObject) this.f$1, (ChatObject.Call.OnParticipantsLoad) this.f$2, (ArrayList) this.f$4, (HashSet) this.f$5);
                break;
            case 2:
                ((LocaleController) this.f$0).lambda$saveRemoteLocaleStrings$10(this.f$3, (LocaleController.LocaleInfo) this.f$1, (TLRPC.TL_langPackDifference) this.f$2, (HashMap) this.f$4, (Runnable) this.f$5);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$removeMultipleStickerSets$111((boolean[]) this.f$1, (ArrayList) this.f$4, (Context) this.f$2, (BaseFragment) this.f$5, this.f$3);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.f$0;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i = this.f$3;
                    MessagesController.getInstance(i).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && (photoSize2 = (TLRPC.PhotoSize) this.f$1) != null && photoSize2.location != null) {
                            FileLoader.getInstance(i).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize2.location.volume_id);
                            sb.append("_");
                            String strM = Fragment$$ExternalSyntheticOutline0.m(photoSize2.location.local_id, "@50_50", sb);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(closestPhotoSizeWithSize.location.volume_id);
                            sb2.append("_");
                            ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(i, user, 1), false);
                        }
                        if (closestPhotoSizeWithSize2 != null && (photoSize = (TLRPC.PhotoSize) this.f$2) != null && photoSize.location != null) {
                            FileLoader.getInstance(i).getPathToAttach(photoSize.location, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize2, true));
                        }
                        PhotoUtilities.applyPhotoToUser(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i).setCurrentUser(user);
                        UserConfig.getInstance(i).saveConfig(true);
                        ((ChatActivity$21$$ExternalSyntheticLambda4) this.f$4).run();
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle));
                        String string = LocaleController.getString(R.string.ApplyAvatarHint);
                        INavigationLayout iNavigationLayout = (INavigationLayout) this.f$5;
                        BulletinFactory.of(((ActionBarLayout) iNavigationLayout).getLastFragment()).createUsersBulletin(Collections.singletonList(user), spannableStringBuilderReplaceTags, AndroidUtilities.replaceSingleTag(string, new Theme$$ExternalSyntheticLambda19(i, iNavigationLayout, 3)), null).show();
                        break;
                    }
                }
                break;
            case 5:
                ArticleViewer.lambda$loadChannel$59((IArticleViewer) this.f$0, (ArticleViewer.WebpageAdapter) this.f$1, (TLRPC.TL_error) this.f$2, (TLObject) this.f$4, this.f$3, (ArticleViewer.BlockChannelCell) this.f$5);
                break;
            case 6:
                CallLogActivity.lambda$createCallLink$39((TLObject) this.f$0, this.f$3, (AlertDialog) this.f$1, (Context) this.f$2, (Theme.ResourcesProvider) this.f$4, (Runnable) this.f$5);
                break;
            case 7:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$75((Context) this.f$2, (TLRPC.Chat) this.f$0, (TLRPC.User) this.f$1, this.f$3, (MessagesStorage.BooleanCallback) this.f$4, (Theme.ResourcesProvider) this.f$5);
                break;
            case 8:
                ((BackgroundGradientDrawable) this.f$0).lambda$startDitheringInternal$1((Runnable[]) this.f$1, (Bitmap) this.f$2, (IntSize) this.f$4, this.f$3, (BackgroundGradientDrawable.Listener[]) this.f$5);
                break;
            case 9:
                ((PollVotesAlert) this.f$0).lambda$new$0((Integer[]) this.f$1, this.f$3, (TLObject) this.f$2, (ArrayList) this.f$4, (TLRPC.PollAnswerVoters) this.f$5);
                break;
            case 10:
                ((ContactAddActivity) this.f$0).lambda$sendPhotoChangedRequest$21((TLRPC.FileLocation) this.f$1, (TLRPC.InputFile) this.f$2, (TLObject) this.f$4, (TLRPC.FileLocation) this.f$5, this.f$3);
                break;
            case 11:
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                TLObject tLObject2 = (TLObject) this.f$1;
                boolean z = tLObject2 instanceof TLRPC.ChatInvite;
                BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$2;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$4;
                if (!z) {
                    BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.LinkHashExpired)).show(false);
                } else {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing != null) {
                        final long j = tL_starsSubscriptionPricing.amount;
                        final int i2 = this.f$3;
                        StarsController.getInstance(i2, false).subscribeTo(((TLRPC.TL_messages_checkChatInvite) this.f$5).hash, chatInvite, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                Long l = (Long) obj2;
                                if (!"paid".equals((String) obj) || l.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new ChatMessageCell$$ExternalSyntheticLambda7(l, i2, j, 7));
                            }
                        });
                    } else {
                        BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show(false);
                    }
                }
                break;
            case 12:
                ((StoryContainsEmojiButton) this.f$0).lambda$load$1((TLObject) this.f$1, this.f$2, (ArrayList) this.f$4, (boolean[]) this.f$5, this.f$3);
                break;
            default:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$20((String) this.f$1, (TLObject) this.f$2, (TLRPC.TL_error) this.f$4, this.f$3, (BotWebViewContainer.MyWebView) this.f$5);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda16(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    public OAuthSheet$$ExternalSyntheticLambda16(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$3 = i;
        this.f$5 = obj5;
    }

    public OAuthSheet$$ExternalSyntheticLambda16(Object obj, TLObject tLObject, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$2 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
        this.f$3 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda16(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, BaseFragment baseFragment, int i) {
        this.$r8$classId = 3;
        this.f$0 = mediaDataController;
        this.f$1 = zArr;
        this.f$4 = arrayList;
        this.f$2 = context;
        this.f$5 = baseFragment;
        this.f$3 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda16(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, String[] strArr, Context context, int i, OAuthSheet$$ExternalSyntheticLambda15 oAuthSheet$$ExternalSyntheticLambda15, BaseFragment baseFragment) {
        this.$r8$classId = 0;
        this.f$0 = tL_urlAuthResultRequest;
        this.f$1 = strArr;
        this.f$2 = context;
        this.f$3 = i;
        this.f$4 = oAuthSheet$$ExternalSyntheticLambda15;
        this.f$5 = baseFragment;
    }

    public OAuthSheet$$ExternalSyntheticLambda16(PollVotesAlert pollVotesAlert, Integer[] numArr, int i, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.$r8$classId = 9;
        this.f$0 = pollVotesAlert;
        this.f$1 = numArr;
        this.f$3 = i;
        this.f$2 = tLObject;
        this.f$4 = arrayList;
        this.f$5 = pollAnswerVoters;
    }
}

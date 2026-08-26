package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Splitter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;

public final class Theme$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$4;

    public Theme$$ExternalSyntheticLambda14(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = obj3;
        this.f$2 = z;
    }

    @Override
    public final void run() throws Throwable {
        String[] strArrSplit;
        int i = 27;
        int i2 = 0;
        boolean z = this.f$2;
        Object obj = this.f$1;
        Object obj2 = this.f$4;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                String[] strArr = (String[]) obj3;
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj;
                try {
                    Theme.themedWallpaperFileOffset = Theme.currentColorsNoAccent.get(Theme.key_wallpaperFileOffset, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (themeInfo.pathToWallpaper != null) {
                                new File(themeInfo.pathToWallpaper).delete();
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        themeInfo.pathToWallpaper = null;
                        Theme.themedWallpaperLink = null;
                    } else {
                        Theme.themedWallpaperLink = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(Theme.themedWallpaperLink) + ".wp").getAbsolutePath();
                        try {
                            String str = themeInfo.pathToWallpaper;
                            if (str != null && !str.equals(absolutePath)) {
                                new File(themeInfo.pathToWallpaper).delete();
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                        themeInfo.pathToWallpaper = absolutePath;
                        try {
                            Uri uri = Uri.parse(Theme.themedWallpaperLink);
                            themeInfo.slug = uri.getQueryParameter("slug");
                            String queryParameter = uri.getQueryParameter("mode");
                            if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                                    if ("blur".equals(strArrSplit[i3])) {
                                        themeInfo.isBlured = true;
                                    } else if ("motion".equals(strArrSplit[i3])) {
                                        themeInfo.isMotion = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) uri.getQueryParameter("intensity")).getClass();
                            themeInfo.patternBgGradientRotation = 45;
                            try {
                                String queryParameter2 = uri.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                                break;
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = uri.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                                break;
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    if (!z && Theme.previousTheme == null) {
                        Theme.currentDayTheme = themeInfo;
                        if (Theme.currentTheme == Theme.currentNightTheme) {
                            Theme.switchNightThemeDelay = 2000;
                            Theme.lastDelayUpdateTime = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(3), 2100L);
                        }
                    }
                    Theme.currentTheme = themeInfo;
                    Theme.refreshThemeColors(false, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (Theme.previousTheme == null && !Theme.switchingNightTheme) {
                    MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z, false);
                }
                ((Theme$$ExternalSyntheticLambda8) obj2).run();
                break;
            case 1:
                ((CameraController) obj3).lambda$initCamera$3(z, (Exception) obj, (Runnable) obj2);
                break;
            case 2:
                ((DialogsSearchAdapter) obj3).lambda$onBindViewHolder$34(z, (GraySectionCell) obj, (DialogsSearchAdapter.Filter) obj2);
                break;
            case 3:
                Painting painting = (Painting) obj3;
                painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda4(painting, (Splitter) obj, i2));
                painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda4(painting, (Splitter) obj2, i2));
                painting.hasBlur = z;
                break;
            case 4:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((BulletinFactory) obj3).createSimpleBulletin(R.raw.star_premium_2, z ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), Theme.key_undo_cancelColor, 0, new ChatbotSheet$$ExternalSyntheticLambda0(chat, 26), (Theme.ResourcesProvider) obj2)).setDuration(5000).show();
                break;
            case 5:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) obj3;
                giftsList.getClass();
                if (((int[]) obj)[0] == giftsList.currentRequestId) {
                    giftsList.loading = false;
                    giftsList.currentRequestId = -1;
                    TLObject tLObject = (TLObject) obj2;
                    boolean z2 = tLObject instanceof TL_stars.TL_payments_savedStarGifts;
                    int i4 = giftsList.currentAccount;
                    if (z2) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i4).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i4).putChats(tL_payments_savedStarGifts.chats, false);
                        ArrayList arrayList = giftsList.gifts;
                        if (z) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        giftsList.lastOffset = tL_payments_savedStarGifts.next_offset;
                        giftsList.totalCount = tL_payments_savedStarGifts.count;
                        giftsList.chat_notifications_enabled = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        giftsList.endReached = arrayList.size() > giftsList.totalCount || giftsList.lastOffset == null;
                    } else {
                        giftsList.endReached = true;
                    }
                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                    break;
                }
                break;
            case 6:
                PeerStoriesView.AnonymousClass38 anonymousClass38 = (PeerStoriesView.AnonymousClass38) obj3;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                AlertsCreator.ensurePaidMessageConfirmation(peerStoriesView.currentAccount, peerStoriesView.dialogId, 1, new PeerStoriesView$38$$ExternalSyntheticLambda1(anonymousClass38, z, (ReactionsLayoutInBubble.VisibleReaction) obj2, (View) obj));
                break;
            case 7:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) obj3;
                if (gifAdapter.requesting) {
                    TLObject tLObject2 = (TLObject) obj;
                    boolean z3 = tLObject2 instanceof TLRPC.messages_BotResults;
                    EmojiBottomSheet.GifPage gifPage = EmojiBottomSheet.GifPage.this;
                    if (z3) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        MessagesStorage.getInstance(EmojiBottomSheet.this.currentAccount).saveBotCache((String) obj2, messages_botresults);
                        gifAdapter.offset = messages_botresults.next_offset;
                        ArrayList arrayList2 = gifPage.gifs;
                        if (z) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        gifAdapter.notifyDataSetChanged();
                    }
                    gifPage.searchField.showProgress(false);
                    gifAdapter.requesting = false;
                    break;
                }
                break;
            case 8:
                Bitmap bitmap = (Bitmap) obj;
                StoryEntry storyEntry = (StoryEntry) obj3;
                storyEntry.getClass();
                try {
                    bitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(storyEntry.filterFile));
                } catch (Exception e2) {
                    FileLog.e((Throwable) e2, false);
                    if (z) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(storyEntry.filterFile));
                        } catch (Exception e3) {
                            FileLog.e((Throwable) e3, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread((Runnable) obj2);
                break;
            default:
                String strTrim = ((EditTextBoldCursor) obj3).getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    RichInlineButtonEditor.showUserPicker((BaseFragment) obj, z, new RateCallLayout$$ExternalSyntheticLambda1(i, (RichEditorListView.BlockButtonEdit) obj2, strTrim));
                    break;
                }
                break;
        }
    }

    public Theme$$ExternalSyntheticLambda14(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$4 = obj3;
    }

    public Theme$$ExternalSyntheticLambda14(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = obj2;
        this.f$4 = obj3;
    }

    public Theme$$ExternalSyntheticLambda14(PeerStoriesView.AnonymousClass38 anonymousClass38, View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        this.$r8$classId = 6;
        this.f$0 = anonymousClass38;
        this.f$1 = view;
        this.f$4 = visibleReaction;
        this.f$2 = z;
    }
}

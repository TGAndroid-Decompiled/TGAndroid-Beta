package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda14;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellHost;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda3;

public final class TodoItemMenu$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public TodoItemMenu$$ExternalSyntheticLambda2(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        TLRPC.WebDocument webDocument;
        boolean z = true;
        int i = 0;
        Object obj = this.f$0;
        Object obj2 = this.f$1;
        int i2 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                TodoItemMenu todoItemMenu = (TodoItemMenu) obj;
                ((ChatActivity$$ExternalSyntheticLambda48) obj2).run(Integer.valueOf(i2));
                if (i2 != 1 && i2 != 13) {
                    z = false;
                }
                todoItemMenu.dismiss(z);
                break;
            case 1:
                BulletinFactory.of((BaseFragment) obj).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                MessagesController.getInstance(i2).disableAds(false);
                AndroidUtilities.runOnUIThread((ShareAlert$$ExternalSyntheticLambda29) obj2);
                break;
            case 2:
                ((VideoAds$$ExternalSyntheticLambda14) obj).run();
                ((BulletinFactory) obj2).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                MessagesController.getInstance(i2).disableAds(false);
                break;
            case 3:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj;
                StarGiftSheet.CraftTopView.RaysView raysView = craftTopView.rays;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj2;
                StarGiftSheet.CraftTopView.Cube3D cube3D = craftTopView.cube;
                if (starGift != null) {
                    StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = new StarGiftSheet.CraftTopView.SelectGiftView(craftTopView.getContext());
                    selectGiftView.setGift(starGift, false);
                    selectGiftView.setRotation(180.0f);
                    cube3D.getClass();
                    int i3 = i2 == -1 ? 5 : i2;
                    AndroidUtilities.removeFromParent(selectGiftView);
                    int childCount = cube3D.getChildCount();
                    cube3D.addView(selectGiftView, LayoutHelper.createFrame(64, 64, 17));
                    cube3D.usedFaces.add(Integer.valueOf(i3));
                    cube3D.index2face.put(Integer.valueOf(childCount), Integer.valueOf(i3));
                    selectGiftView.setScaleX(0.5f);
                    selectGiftView.setScaleY(0.5f);
                    selectGiftView.setAlpha(0.0f);
                    ViewPropertyAnimator duration = selectGiftView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(cubicBezierInterpolator);
                    interpolator.setUpdateListener(new QrActivity$$ExternalSyntheticLambda18(craftTopView, 12));
                    interpolator.start();
                    cube3D.faces[i2].setVisibility(8);
                    raysView.setVisibility(0);
                    raysView.setAlpha(0.0f);
                    raysView.animate().alpha(0.5f).setDuration(820L).setInterpolator(cubicBezierInterpolator).start();
                } else {
                    FrameLayout frameLayout = new FrameLayout(craftTopView.getContext());
                    RLottieImageView rLottieImageView = new RLottieImageView(craftTopView.getContext());
                    rLottieImageView.setAnimation(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(32, 32, 17));
                    rLottieImageView.setScaleX(0.5f);
                    rLottieImageView.setScaleY(0.5f);
                    rLottieImageView.setAlpha(0.0f);
                    rLottieImageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    craftTopView.brokenGiftImage = rLottieImageView;
                    frameLayout.setBackground(new StarGiftSheet.RoundRectStrokeDrawable(AndroidUtilities.dp(12.0f), Theme.multAlpha(0.075f, -1)));
                    cube3D.faces[i2].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    if (i2 == -1) {
                        i2 = 5;
                    }
                    AndroidUtilities.removeFromParent(frameLayout);
                    int childCount2 = cube3D.getChildCount();
                    cube3D.addView(frameLayout, LayoutHelper.createFrame(64, 64, 17));
                    cube3D.usedFaces.add(Integer.valueOf(i2));
                    cube3D.index2face.put(Integer.valueOf(childCount2), Integer.valueOf(i2));
                    int[] iArr = craftTopView.COLORS;
                    craftTopView.buttonBackground.setColor(iArr[2], iArr[3]);
                    int[] iArr2 = craftTopView.BACKGROUND_COLORS;
                    craftTopView.bg.setColors(iArr2[2], iArr2[3]);
                    raysView.setColor(iArr[3], iArr[2]);
                }
                break;
            case 4:
                StarGiftSheet.TextViewRoll.TextView textView = (StarGiftSheet.TextViewRoll.TextView) obj;
                textView.getClass();
                ((StarGiftSheet$$ExternalSyntheticLambda66) obj2).run(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(i2)), textView, Boolean.FALSE);
                break;
            case 5:
                StarsController starsController = (StarsController) obj;
                starsController.loading[i2] = false;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    int i4 = starsController.currentAccount;
                    MessagesController.getInstance(i4).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i4).putChats(starsStatus.chats, false);
                    ArrayList[] arrayListArr = starsController.transactions;
                    arrayListArr[i2].addAll(starsStatus.history);
                    boolean zIsEmpty = arrayListArr[i2].isEmpty();
                    boolean[] zArr = starsController.transactionsExist;
                    zArr[i2] = !zIsEmpty || zArr[i2];
                    z = (starsStatus.flags & 1) == 0;
                    starsController.endReached[i2] = z;
                    starsController.offset[i2] = z ? null : starsStatus.next_offset;
                    starsController.updateBalance(starsStatus.balance);
                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                break;
            case 6:
                Browser.openUrl((Context) obj, "https://" + MessagesController.getInstance(i2).linkPrefix + "/nft/" + ((String) obj2));
                break;
            case 7:
                ((LivePlayer) obj).currentStreamRequestTimestamp.put((String) obj2, Integer.valueOf(i2));
                break;
            case 8:
                TLObject tLObject2 = (TLObject) obj;
                LaunchActivity$$ExternalSyntheticLambda105 launchActivity$$ExternalSyntheticLambda105 = (LaunchActivity$$ExternalSyntheticLambda105) obj2;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i);
                        i++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i2) {
                            launchActivity$$ExternalSyntheticLambda105.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                launchActivity$$ExternalSyntheticLambda105.accept(null);
                break;
            case 9:
                StoryViewer storyViewer = StoryViewer.this;
                StoryViewer.AnonymousClass4 anonymousClass4 = storyViewer.storiesViewPager;
                int i5 = storyViewer.currentAccount;
                anonymousClass4.dialogs = (ArrayList) obj2;
                anonymousClass4.currentAccount = i5;
                anonymousClass4.setAdapter(null);
                anonymousClass4.setAdapter(anonymousClass4.pagerAdapter);
                anonymousClass4.setCurrentItem(i2);
                anonymousClass4.updateDelegate = true;
                break;
            case 10:
                ((FfmpegAudioWaveformLoader) obj).lambda$new$0((String) obj2, i2);
                break;
            case 11:
                ((FfmpegAudioWaveformLoader) obj).lambda$receiveChunk$1((short[]) obj2, i2);
                break;
            case 12:
                PaintView paintView = (PaintView) obj;
                if (paintView.renderView.getCurrentBrush() instanceof Brush.Shape) {
                    paintView.ignoreToolChangeAnimationOnce = true;
                }
                paintView.onBrushSelected((Brush.Shape) obj2);
                PaintToolsView paintToolsView = paintView.paintToolsView;
                paintToolsView.animateNextIndex(paintToolsView.brushesCount + 1);
                AndroidUtilities.updateImageViewImageAnimated(paintToolsView.buttons[paintToolsView.brushesCount + 1], i2);
                paintToolsView.isShapeSelected = true;
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda9(i2, ((MessagesStorage) obj).getUsers(new ArrayList<>((HashSet) obj2))));
                break;
            case 14:
                ((TimelineView.AudioWaveformLoader) obj).receiveData((short[]) obj2, i2);
                break;
            case 15:
                WallpapersListActivity.SearchAdapter searchAdapter = (WallpapersListActivity.SearchAdapter) obj;
                if (i2 == searchAdapter.lastSearchToken) {
                    searchAdapter.imageReqId = 0;
                    ArrayList arrayList2 = searchAdapter.searchResult;
                    int size2 = arrayList2.size();
                    TLObject tLObject3 = (TLObject) obj2;
                    if (tLObject3 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        searchAdapter.nextImagesSearchOffset = messages_botresults.next_offset;
                        int size3 = messages_botresults.results.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i6);
                            if ("photo".equals(botInlineResult.type)) {
                                HashMap map = searchAdapter.searchResultKeys;
                                if (!map.containsKey(botInlineResult.id)) {
                                    MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                    TLRPC.Photo photo = botInlineResult.photo;
                                    if (photo != null) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                        if (closestPhotoSizeWithSize != null) {
                                            searchImage.width = closestPhotoSizeWithSize.w;
                                            searchImage.height = closestPhotoSizeWithSize.h;
                                            searchImage.photoSize = closestPhotoSizeWithSize;
                                            searchImage.photo = botInlineResult.photo;
                                            searchImage.size = closestPhotoSizeWithSize.size;
                                            searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                            searchImage.id = botInlineResult.id;
                                            searchImage.type = 0;
                                            arrayList2.add(searchImage);
                                            map.put(searchImage.id, searchImage);
                                        }
                                    } else if (botInlineResult.content != null) {
                                        for (int i7 = 0; i7 < botInlineResult.content.attributes.size(); i7++) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i7);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.w;
                                                searchImage.height = documentAttribute.h;
                                                webDocument = botInlineResult.thumb;
                                                if (webDocument != null) {
                                                    searchImage.thumbUrl = webDocument.url;
                                                } else {
                                                    searchImage.thumbUrl = null;
                                                }
                                                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                                searchImage.imageUrl = webDocument2.url;
                                                searchImage.size = webDocument2.size;
                                                searchImage.id = botInlineResult.id;
                                                searchImage.type = 0;
                                                arrayList2.add(searchImage);
                                                map.put(searchImage.id, searchImage);
                                            }
                                        }
                                        webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            searchImage.thumbUrl = webDocument.url;
                                        } else {
                                            searchImage.thumbUrl = null;
                                        }
                                        TLRPC.WebDocument webDocument3 = botInlineResult.content;
                                        searchImage.imageUrl = webDocument3.url;
                                        searchImage.size = webDocument3.size;
                                        searchImage.id = botInlineResult.id;
                                        searchImage.type = 0;
                                        arrayList2.add(searchImage);
                                        map.put(searchImage.id, searchImage);
                                    }
                                }
                            }
                        }
                        searchAdapter.bingSearchEndReached = size2 == arrayList2.size() || searchAdapter.nextImagesSearchOffset == null;
                    }
                    int size4 = arrayList2.size();
                    WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
                    if (size2 != size4) {
                        int i8 = wallpapersListActivity.columnsCount;
                        int i9 = size2 % i8;
                        float f = size2;
                        int iCeil = (int) Math.ceil(f / i8);
                        if (i9 != 0) {
                            searchAdapter.notifyItemChanged(((int) Math.ceil(f / wallpapersListActivity.columnsCount)) - 1);
                        }
                        wallpapersListActivity.searchAdapter.mObservable.notifyItemRangeInserted(iCeil, ((int) Math.ceil(arrayList2.size() / wallpapersListActivity.columnsCount)) - iCeil);
                    }
                    wallpapersListActivity.searchEmptyView.showTextView();
                    break;
                }
                break;
            case 16:
                int[] iArr3 = (int[]) obj;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i2).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) obj2;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i2).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                }
                break;
            case 17:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) obj;
                TLObject tLObject4 = (TLObject) obj2;
                if (tLObject4 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject4;
                    chatAttachAlertBotWebViewLayout.queryId = tL_webViewResultUrl.query_id;
                    boolean z2 = tL_webViewResultUrl.same_origin;
                    ChatAttachAlertBotWebViewLayout.AnonymousClass1 anonymousClass1 = chatAttachAlertBotWebViewLayout.webViewContainer;
                    if (z2) {
                        anonymousClass1.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    String str = tL_webViewResultUrl.url;
                    anonymousClass1.currentAccount = i2;
                    NotificationCenter.getInstance(i2).doOnIdle(new BotWebViewContainer$$ExternalSyntheticLambda3(anonymousClass1, str, 0));
                    AndroidUtilities.runOnUIThread(chatAttachAlertBotWebViewLayout.pollRunnable);
                }
                break;
            case 18:
                RichTableCellHost richTableCellHostHostForAnchor = ((RichTableCell) obj).getGrid().hostForAnchor((TL_iv.pageTableCell) obj2);
                if (richTableCellHostHostForAnchor != null) {
                    RichEditText richEditText = richTableCellHostHostForAnchor.editText;
                    richEditText.requestEditFocus();
                    richEditText.setSelection(Math.max(0, Math.min(i2, richEditText.length())));
                    break;
                }
                break;
            case 19:
                RichTextCell richTextCell = RichTextCell.this;
                if (richTextCell.delegate != null) {
                    BlockRow blockRow = (BlockRow) obj2;
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    TL_iv.textPlain textplain = new TL_iv.textPlain();
                    textplain.text = "";
                    pageBlock.text = textplain;
                    ((RichEditorListView.AnonymousClass14) richTextCell.delegate).onCommand(blockRow, i2);
                    break;
                }
                break;
            default:
                BotWebViewContainer.MyWebView myWebView = (BotWebViewContainer.MyWebView) obj2;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj;
                SendMessagesHelper.getInstance(botWebViewContainer.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(botWebViewContainer.currentAccount).getCurrentUser(), botWebViewContainer.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    BotWebViewContainer.notifyEvent(i2, myWebView, "phone_requested", jSONObject);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                break;
        }
    }

    public TodoItemMenu$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}

package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda53;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda60;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;

public final class RichTextCell$2$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public RichTextCell$2$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        int i = 0;
        Object obj = this.f$0;
        Object obj2 = this.f$1;
        int i2 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
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
            case 1:
                ((ProfileInstaller$DiagnosticsCallback) ((DeviceProfileWriter) obj).mDiagnostics).onResultReceived(i2, (Serializable) obj2);
                break;
            case 2:
                for (ListenerSet.ListenerHolder listenerHolder : (CopyOnWriteArraySet) obj) {
                    if (!listenerHolder.released) {
                        if (i2 != -1) {
                            listenerHolder.flagsBuilder.add(i2);
                        }
                        listenerHolder.needsIterationFinishedEvent = true;
                        ((ListenerSet.Event) obj2).invoke(listenerHolder.listener);
                    }
                }
                break;
            case 3:
                ((CameraView) obj).lambda$createCamera$13(i2, (SurfaceTexture) obj2);
                break;
            case 4:
                ((NativeInstance) obj).lambda$onEmitJoinPayload$3(i2, (String) obj2);
                break;
            case 5:
                ((VoIPService) obj).lambda$createGroupInstance$74((String) obj2, i2);
                break;
            case 6:
                ((DialogsSearchAdapter) obj).lambda$searchDialogs$22(i2, (String) obj2);
                break;
            case 7:
                BusinessLinksController businessLinksController = (BusinessLinksController) obj;
                businessLinksController.links.add(i2, (TL_account.TL_businessChatLink) obj2);
                NotificationCenter.getInstance(businessLinksController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 8:
                Painting painting = (Painting) obj;
                painting.commitShapeInternal((Shape) obj2, i2, painting.activeStrokeBounds);
                painting.activeStrokeBounds = null;
                break;
            case 9:
                ((LPhotoPaintView) obj).lambda$onAddButtonPressed$33((Brush.Shape) obj2, i2);
                break;
            case 10:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) obj;
                Editable text = chatCustomReactionsEditActivity.editText.getText();
                AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) obj2;
                int spanStart = text.getSpanStart(animatedEmojiSpan);
                int spanEnd = text.getSpanEnd(animatedEmojiSpan);
                int i3 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    chatCustomReactionsEditActivity.editText.getText().delete(spanStart, spanEnd);
                    ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass3 = chatCustomReactionsEditActivity.editText;
                    anonymousClass3.setSelection(Math.min(i2 - i3, anonymousClass3.getText().length()));
                    break;
                }
                break;
            case 11:
                ((FoundEmojiPacksRecyclerView) obj).lambda$scrollOnSelect$1((View) obj2, i2);
                break;
            case 12:
                ((ProfileGiftsContainer) obj).lambda$new$6(i2, (TL_stars.TL_starGiftCollection) obj2);
                break;
            case 13:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj;
                StarGiftSheet.CraftTopView.RaysView raysView = craftTopView.rays;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj2;
                StarGiftSheet.CraftTopView.Cube3D cube3D = craftTopView.cube;
                if (starGift != null) {
                    StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = new StarGiftSheet.CraftTopView.SelectGiftView(craftTopView.getContext());
                    selectGiftView.setGift(starGift, false);
                    selectGiftView.setRotation(180.0f);
                    cube3D.getClass();
                    int i4 = i2 == -1 ? 5 : i2;
                    AndroidUtilities.removeFromParent(selectGiftView);
                    int childCount = cube3D.getChildCount();
                    cube3D.addView(selectGiftView, LayoutHelper.createFrame(64, 64, 17));
                    cube3D.usedFaces.add(Integer.valueOf(i4));
                    cube3D.index2face.put(Integer.valueOf(childCount), Integer.valueOf(i4));
                    selectGiftView.setScaleX(0.5f);
                    selectGiftView.setScaleY(0.5f);
                    selectGiftView.setAlpha(0.0f);
                    ViewPropertyAnimator duration = selectGiftView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(cubicBezierInterpolator);
                    interpolator.setUpdateListener(new BotButton$$ExternalSyntheticLambda0(craftTopView, 25));
                    interpolator.start();
                    cube3D.faces[i2].setVisibility(8);
                    raysView.setVisibility(0);
                    raysView.setAlpha(0.0f);
                    raysView.animate().alpha(0.5f).setDuration(820L).setInterpolator(cubicBezierInterpolator).start();
                } else {
                    FrameLayout frameLayout = new FrameLayout(craftTopView.getContext());
                    RLottieImageView rLottieImageView = new RLottieImageView(craftTopView.getContext());
                    rLottieImageView.setAnimation(R.raw.gift_broken, 32, 32);
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
            case 14:
                StarGiftSheet.TextViewRoll.TextView textView = (StarGiftSheet.TextViewRoll.TextView) obj;
                textView.getClass();
                ((StarGiftSheet$$ExternalSyntheticLambda60) obj2).run(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(i2)), textView, Boolean.FALSE);
                break;
            case 15:
                StarsController starsController = (StarsController) obj;
                starsController.loading[i2] = false;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    int i5 = starsController.currentAccount;
                    MessagesController.getInstance(i5).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i5).putChats(starsStatus.chats, false);
                    ArrayList[] arrayListArr = starsController.transactions;
                    arrayListArr[i2].addAll(starsStatus.history);
                    boolean zIsEmpty = arrayListArr[i2].isEmpty();
                    boolean[] zArr = starsController.transactionsExist;
                    zArr[i2] = !zIsEmpty || zArr[i2];
                    boolean z = (starsStatus.flags & 1) == 0;
                    starsController.endReached[i2] = z;
                    starsController.offset[i2] = z ? null : starsStatus.next_offset;
                    starsController.updateBalance(starsStatus.balance);
                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                break;
            case 16:
                Browser.openUrl((Context) obj, "https://" + MessagesController.getInstance(i2).linkPrefix + "/nft/" + ((String) obj2));
                break;
            case 17:
                ((LivePlayer) obj).currentStreamRequestTimestamp.put((String) obj2, Integer.valueOf(i2));
                break;
            case 18:
                TLObject tLObject2 = (TLObject) obj;
                LaunchActivity$$ExternalSyntheticLambda53 launchActivity$$ExternalSyntheticLambda53 = (LaunchActivity$$ExternalSyntheticLambda53) obj2;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i);
                        i++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i2) {
                            launchActivity$$ExternalSyntheticLambda53.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                launchActivity$$ExternalSyntheticLambda53.accept(null);
                break;
            case 19:
                StoryViewer storyViewer = StoryViewer.this;
                StoryViewer.AnonymousClass4 anonymousClass4 = storyViewer.storiesViewPager;
                int i6 = storyViewer.currentAccount;
                anonymousClass4.dialogs = (ArrayList) obj2;
                anonymousClass4.currentAccount = i6;
                anonymousClass4.setAdapter(null);
                anonymousClass4.setAdapter(anonymousClass4.pagerAdapter);
                anonymousClass4.setCurrentItem(i2);
                anonymousClass4.updateDelegate = true;
                break;
            case 20:
                ((FfmpegAudioWaveformLoader) obj).lambda$new$0((String) obj2, i2);
                break;
            case 21:
                ((FfmpegAudioWaveformLoader) obj).lambda$receiveChunk$1((short[]) obj2, i2);
                break;
            case 22:
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
            case 23:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda19(i2, ((MessagesStorage) obj).getUsers(new ArrayList<>((HashSet) obj2)), 22));
                break;
            case 24:
                ((TimelineView.AudioWaveformLoader) obj).receiveData((short[]) obj2, i2);
                break;
            case 25:
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
            case 26:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) obj;
                chatAttachAlertBotWebViewLayout.getClass();
                TLObject tLObject3 = (TLObject) obj2;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    chatAttachAlertBotWebViewLayout.queryId = tL_webViewResultUrl.query_id;
                    boolean z2 = tL_webViewResultUrl.same_origin;
                    ChatAttachAlertBotWebViewLayout.AnonymousClass1 anonymousClass1 = chatAttachAlertBotWebViewLayout.webViewContainer;
                    if (z2) {
                        anonymousClass1.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    anonymousClass1.loadUrl(i2, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(chatAttachAlertBotWebViewLayout.pollRunnable);
                }
                break;
            case 27:
                RichTableCellHost richTableCellHostHostForAnchor = ((RichTableCell) obj).getGrid().hostForAnchor((TL_iv.pageTableCell) obj2);
                if (richTableCellHostHostForAnchor != null) {
                    RichEditText richEditText = richTableCellHostHostForAnchor.editText;
                    richEditText.requestEditFocus();
                    richEditText.setSelection(Math.max(0, Math.min(i2, richEditText.length())));
                    break;
                }
                break;
            default:
                ((BotWebViewContainer) obj).lambda$onEventReceived$22(i2, (BotWebViewContainer.MyWebView) obj2);
                break;
        }
    }

    public RichTextCell$2$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}

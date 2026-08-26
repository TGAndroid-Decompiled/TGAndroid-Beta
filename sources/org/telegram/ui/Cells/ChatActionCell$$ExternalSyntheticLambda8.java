package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.VelocityTracker;
import android.view.View;
import com.google.common.base.Splitter;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.RenderView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;

public final class ChatActionCell$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActionCell$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActionCell) this.f$0).lambda$openPremiumGiftChannel$4((TLRPC.TL_messageActionGiftCode) this.f$1);
                return;
            case 1:
                ((DialogsSearchAdapter) this.f$0).lambda$onBindViewHolder$32((View) this.f$1);
                return;
            case 2:
                ((DialogsSearchAdapter) this.f$0).lambda$clearRecentSearch$10((StringBuilder) this.f$1);
                return;
            case 3:
                ((DialogsSearchAdapter) this.f$0).lambda$searchDialogs$16((TLObject) this.f$1);
                return;
            case 4:
                ((SearchAdapter) this.f$0).lambda$processSearch$1((String) this.f$1);
                return;
            case 5:
                ((SearchAdapterHelper) this.f$0).lambda$putRecentHashtags$7((ArrayList) this.f$1);
                return;
            case 6:
                BusinessChatbotController businessChatbotController = (BusinessChatbotController) this.f$0;
                businessChatbotController.loading = false;
                TLObject tLObject = (TLObject) this.f$1;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                businessChatbotController.value = connectedbots;
                int i = businessChatbotController.currentAccount;
                if (connectedbots != null) {
                    MessagesController.getInstance(i).putUsers(businessChatbotController.value.users, false);
                }
                businessChatbotController.lastTime = System.currentTimeMillis();
                businessChatbotController.loaded = true;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = businessChatbotController.callbacks;
                    if (i2 >= arrayList.size()) {
                        arrayList.clear();
                        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                        return;
                    } else {
                        if (arrayList.get(i2) != null) {
                            ((Utilities.Callback) arrayList.get(i2)).run(businessChatbotController.value);
                        }
                        i2++;
                    }
                }
                break;
            case 7:
                ((ChatbotSheet) this.f$0).lambda$new$2((OAuthSheet$$ExternalSyntheticLambda6) this.f$1);
                return;
            case 8:
                ((ChatbotsActivity) this.f$0).lambda$processDone$18((TLObject) this.f$1);
                return;
            case 9:
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.f$0;
                openingHoursActivity.getClass();
                openingHoursActivity.adaptPrevDay(((UItem) this.f$1).id);
                return;
            case 10:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$0;
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$1;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    try {
                        sQLitePreparedStatementExecuteFast = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindInteger(1, quickReply.id);
                        sQLitePreparedStatementExecuteFast.bindString(2, quickReply.name);
                        sQLitePreparedStatementExecuteFast.bindInteger(3, quickReply.order);
                        sQLitePreparedStatementExecuteFast.bindInteger(4, quickReply.messagesCount);
                        sQLitePreparedStatementExecuteFast.step();
                        sQLitePreparedStatementExecuteFast.dispose();
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                    throw th;
                }
            case 11:
                QuickRepliesController quickRepliesController = (QuickRepliesController) this.f$0;
                quickRepliesController.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                boolean z = tLObject2 instanceof TLRPC.TL_messages_quickReplies;
                int i3 = quickRepliesController.currentAccount;
                ArrayList arrayList2 = null;
                if (z) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    MessagesController.getInstance(i3).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i3).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i3).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i4 = 0; i4 < tL_messages_quickReplies.quick_replies.size(); i4++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i4);
                        QuickRepliesController.QuickReply quickReply2 = new QuickRepliesController.QuickReply();
                        quickReply2.id = tL_quickReply.shortcut_id;
                        quickReply2.name = tL_quickReply.shortcut;
                        quickReply2.messagesCount = tL_quickReply.count;
                        quickReply2.topMessageId = tL_quickReply.top_message;
                        quickReply2.order = i4;
                        int i5 = 0;
                        while (true) {
                            if (i5 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i5);
                                if (message.id != tL_quickReply.top_message) {
                                    i5++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i3, message, false, true);
                            quickReply2.topMessage = messageObject;
                            messageObject.generateThumbs(false);
                            quickReply2.topMessage.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList3.add(quickReply2);
                    }
                    arrayList2 = arrayList3;
                } else {
                    boolean z2 = tLObject2 instanceof TLRPC.TL_messages_quickRepliesNotModified;
                }
                quickRepliesController.loading = false;
                if (arrayList2 != null) {
                    ArrayList arrayList4 = quickRepliesController.replies;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList2);
                }
                quickRepliesController.loaded = true;
                quickRepliesController.saveToCache();
                NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 12:
                MessagesStorage messagesStorage2 = (MessagesStorage) this.f$1;
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) this.f$0;
                quickRepliesController2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        int i6 = 0;
                        while (true) {
                            ArrayList arrayList5 = quickRepliesController2.replies;
                            if (i6 >= arrayList5.size()) {
                                if (sQLitePreparedStatementExecuteFast2 != null) {
                                    sQLitePreparedStatementExecuteFast2.dispose();
                                    return;
                                }
                                return;
                            }
                            QuickRepliesController.QuickReply quickReply3 = (QuickRepliesController.QuickReply) arrayList5.get(i6);
                            sQLitePreparedStatementExecuteFast2.requery();
                            sQLitePreparedStatementExecuteFast2.bindInteger(1, quickReply3.id);
                            sQLitePreparedStatementExecuteFast2.bindString(2, quickReply3.name);
                            sQLitePreparedStatementExecuteFast2.bindInteger(3, quickReply3.order);
                            sQLitePreparedStatementExecuteFast2.bindInteger(4, quickReply3.messagesCount);
                            sQLitePreparedStatementExecuteFast2.step();
                            i6++;
                            if (0 != 0) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        if (0 != 0) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 13:
                ChannelRecommendationsCell channelRecommendationsCell = (ChannelRecommendationsCell) this.f$0;
                ChannelRecommendationsCell.ChannelBlock channelBlock = channelRecommendationsCell.longPressedBlock;
                if (((ChannelRecommendationsCell.ChannelBlock) this.f$1) == channelBlock) {
                    channelBlock.bounce.setPressed(false);
                    ChannelRecommendationsCell.ChannelBlock channelBlock2 = channelRecommendationsCell.longPressedBlock;
                    boolean z3 = channelBlock2.isLock;
                    ChatMessageCell chatMessageCell = channelRecommendationsCell.cell;
                    if (z3) {
                        if (chatMessageCell.getDelegate() != null) {
                            chatMessageCell.getDelegate().didPressMoreChannelRecommendations(chatMessageCell);
                        }
                    } else if (chatMessageCell.getDelegate() != null) {
                        chatMessageCell.getDelegate().didPressChannelRecommendation(chatMessageCell, channelBlock2.chat, true);
                    }
                }
                channelRecommendationsCell.longPressedBlock = null;
                channelRecommendationsCell.longPressRunnable = null;
                channelRecommendationsCell.scrolling = false;
                channelRecommendationsCell.maybeScrolling = false;
                channelRecommendationsCell.closeBounce.setPressed(false);
                VelocityTracker velocityTracker = channelRecommendationsCell.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    channelRecommendationsCell.velocityTracker = null;
                    return;
                }
                return;
            case 14:
                BulletinFactory.of((BaseFragment) this.f$0).showForError((TLRPC.TL_error) this.f$1);
                return;
            case 15:
                ((ChatActionCell) this.f$0).lambda$didPressCustomBotButton$8((BaseFragment) this.f$1);
                return;
            case 16:
                ((ChatMessageCell) this.f$0).lambda$drawContent$13((Canvas) this.f$1);
                return;
            case 17:
                ((ChatMessageCell) this.f$0).lambda$checkSpoilersMotionEvent$3((ChatMessageCell) this.f$1);
                return;
            case 18:
                StickerSetCell stickerSetCell = (StickerSetCell) this.f$0;
                if (stickerSetCell.stickersSet.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetCell.stickersSet;
                    long j = tL_messages_stickerSet.set.thumb_document_id;
                    TLRPC.Document document = (TLRPC.Document) this.f$1;
                    if (j == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        stickerSetCell.setStickersSet(stickerSetCell.needDivider, stickerSetCell.stickersSet, stickerSetCell.groupSearch);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((ThemesHorizontalListCell) this.f$0).lambda$didReceivedNotification$2((Theme.ThemeInfo) this.f$1);
                return;
            case 20:
                ThemesHorizontalListCell.InnerThemeView innerThemeView = (ThemesHorizontalListCell.InnerThemeView) this.f$0;
                innerThemeView.getClass();
                TLObject tLObject3 = (TLObject) this.f$1;
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    innerThemeView.themeInfo.badWallpaper = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject3;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
                if (themesHorizontalListCell.loadingThemes.containsKey(attachFileName)) {
                    return;
                }
                themesHorizontalListCell.loadingThemes.put(attachFileName, innerThemeView.themeInfo);
                FileLoader.getInstance(innerThemeView.themeInfo.account).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 21:
                Painting painting = (Painting) this.f$0;
                painting.paused = true;
                Size size = painting.size;
                ByteBuffer byteBuffer = (ByteBuffer) painting.getPaintingData(new RectF(0.0f, 0.0f, size.width, size.height), true, false, false).defaultPublishableKey;
                RectF rectF = new RectF(0.0f, 0.0f, size.width, size.height);
                RenderView renderView = RenderView.this;
                painting.backupSlice = new Splitter(byteBuffer, 0, rectF);
                painting.cleanResources(false);
                ((RenderView$1$$ExternalSyntheticLambda0) this.f$1).run();
                return;
            case 22:
                RenderView.CanvasInternal canvasInternal = ((RenderView) this.f$0).internal;
                if (canvasInternal == null || !canvasInternal.initialized) {
                    return;
                }
                RenderView.CanvasInternal.access$1300(canvasInternal);
                ((Runnable) this.f$1).run();
                return;
            case 23:
                ((LPhotoPaintView) this.f$0).lambda$appearAnimation$23((View) this.f$1);
                return;
            case 24:
                ((PhotoView) this.f$0).segmentImage((Bitmap) this.f$1);
                return;
            case 25:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                stickerMakerView.empty = false;
                StickerMakerView.SegmentedObject[] segmentedObjectArr = (StickerMakerView.SegmentedObject[]) ((ArrayList) this.f$1).toArray(new StickerMakerView.SegmentedObject[0]);
                stickerMakerView.objects = segmentedObjectArr;
                if (segmentedObjectArr.length > 0) {
                    stickerMakerView.stickerCutOutBtn.setScaleX(0.3f);
                    stickerMakerView.stickerCutOutBtn.setScaleY(0.3f);
                    stickerMakerView.stickerCutOutBtn.setAlpha(0.0f);
                    stickerMakerView.stickerCutOutBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    return;
                }
                return;
            case 26:
                ((LimitReachedBottomSheet) this.f$0).lambda$boostChannel$18((Loadable) this.f$1);
                return;
            case 27:
                ((LimitReachedBottomSheet) this.f$0).lambda$loadAdminedChannels$22((TLObject) this.f$1);
                return;
            case 28:
                VideoScreenPreview videoScreenPreview = (VideoScreenPreview) this.f$0;
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(29, videoScreenPreview, FileLoader.getInstance(videoScreenPreview.currentAccount).getPathToAttach((TLRPC.Document) this.f$1)));
                return;
            default:
                VideoScreenPreview videoScreenPreview2 = (VideoScreenPreview) this.f$0;
                videoScreenPreview2.file = (File) this.f$1;
                videoScreenPreview2.checkVideo();
                return;
        }
    }
}

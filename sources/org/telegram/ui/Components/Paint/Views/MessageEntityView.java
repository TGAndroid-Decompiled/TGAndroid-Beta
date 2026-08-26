package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.GmsRpc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.ThemePreviewActivity;

public abstract class MessageEntityView extends EntityView {
    public boolean clipVideoMessageForBitmap;
    public final ThemePreviewActivity.AnonymousClass14 container;
    public final SparseIntArray currentColors;
    public boolean firstMeasure;
    public final MessageObject.GroupedMessages groupedMessages;
    public boolean isDark;
    public final AnonymousClass2 listView;
    public final ArrayList messageObjects;
    public MessageDrawable msgInDrawable;
    public MessageDrawable msgInDrawableSelected;
    public MessageDrawable msgMediaInDrawable;
    public MessageDrawable msgMediaInDrawableSelected;
    public MessageDrawable msgMediaOutDrawable;
    public MessageDrawable msgMediaOutDrawableSelected;
    public MessageDrawable msgOutDrawable;
    public MessageDrawable msgOutDrawableSelected;
    public final GmsRpc resourcesProvider;
    public TextureView textureView;
    public boolean textureViewActive;
    public boolean usesBackgroundPaint;
    public int videoHeight;
    public int videoWidth;

    public final class AnonymousClass6 extends RecyclerView.ItemDecoration {
        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            ChatMessageCell chatMessageCell;
            MessageObject.GroupedMessages currentMessagesGroup;
            MessageObject.GroupedMessagePosition currentPosition;
            rect.bottom = 0;
            if (!(view instanceof ChatMessageCell) || (currentMessagesGroup = (chatMessageCell = (ChatMessageCell) view).getCurrentMessagesGroup()) == null || (currentPosition = chatMessageCell.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            float fMax = Math.max(point.x, point.y) * 0.5f;
            int extraInsetHeight = chatMessageCell.getExtraInsetHeight();
            int i = 0;
            while (true) {
                float[] fArr = currentPosition.siblingHeights;
                if (i >= fArr.length) {
                    break;
                }
                extraInsetHeight += (int) Math.ceil(fArr[i] * fMax);
                i++;
            }
            int iRound = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
            int size = currentMessagesGroup.posArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i2);
                byte b = groupedMessagePosition.minY;
                byte b2 = currentPosition.minY;
                if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                    iRound = RichMessageLayout$$ExternalSyntheticOutline1.m((int) Math.ceil(fMax * groupedMessagePosition.ph), 4.0f, iRound);
                    break;
                }
            }
            rect.bottom = -iRound;
        }
    }

    public MessageEntityView(final Context context, PointF pointF, ArrayList arrayList, final BlurringShader.BlurManager blurManager, final boolean z, final PreviewView.TextureViewHolder textureViewHolder) {
        GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean boolUseForwardForRepost;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        super(context, pointF);
        this.messageObjects = new ArrayList();
        this.videoWidth = 1;
        this.videoHeight = 1;
        this.firstMeasure = true;
        this.isDark = Theme.currentTheme.isDark();
        this.currentColors = new SparseIntArray();
        final PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this;
        GmsRpc gmsRpc = new GmsRpc();
        gmsRpc.firebaseInstallations = anonymousClass26;
        TextPaint textPaint = new TextPaint();
        gmsRpc.app = textPaint;
        TextPaint textPaint2 = new TextPaint();
        gmsRpc.metadata = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        gmsRpc.rpc = textPaint3;
        new Paint(3);
        gmsRpc.userAgentPublisher = new Paint(3);
        Paint paint = new Paint(3);
        gmsRpc.heartbeatInfo = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.resourcesProvider = gmsRpc;
        setRotation(0.0f);
        setScale(1.0f);
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            TLRPC.Message message2 = messageObject.messageOwner;
            int i2 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else {
                if (message2 instanceof TLRPC.TL_messageService) {
                    tL_messageService = new TLRPC.TL_messageService();
                } else {
                    message = message2;
                }
                boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
                if (boolUseForwardForRepost == null && boolUseForwardForRepost.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i3 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i3, message, messageObject.replyMessageObject, MessagesController.getInstance(i3).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z, false);
                messageObject2.setType();
                this.messageObjects.add(messageObject2);
            }
            tL_messageService.id = message2.id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.mentioned = message2.mentioned;
            tL_messageService.media_unread = message2.media_unread;
            tL_messageService.out = message2.out;
            tL_messageService.unread = message2.unread;
            tL_messageService.entities = message2.entities;
            tL_messageService.via_bot_name = message2.via_bot_name;
            tL_messageService.reply_markup = message2.reply_markup;
            tL_messageService.views = message2.views;
            tL_messageService.forwards = message2.forwards;
            tL_messageService.replies = message2.replies;
            tL_messageService.edit_date = message2.edit_date;
            tL_messageService.silent = message2.silent;
            tL_messageService.post = message2.post;
            tL_messageService.from_scheduled = message2.from_scheduled;
            tL_messageService.legacy = message2.legacy;
            tL_messageService.edit_hide = message2.edit_hide;
            tL_messageService.pinned = message2.pinned;
            tL_messageService.fwd_from = message2.fwd_from;
            tL_messageService.via_bot_id = message2.via_bot_id;
            tL_messageService.reply_to = message2.reply_to;
            tL_messageService.post_author = message2.post_author;
            tL_messageService.grouped_id = message2.grouped_id;
            tL_messageService.reactions = message2.reactions;
            tL_messageService.restriction_reason = message2.restriction_reason;
            tL_messageService.ttl_period = message2.ttl_period;
            tL_messageService.noforwards = message2.noforwards;
            tL_messageService.invert_media = message2.invert_media;
            tL_messageService.send_state = message2.send_state;
            tL_messageService.fwd_msg_id = message2.fwd_msg_id;
            tL_messageService.attachPath = message2.attachPath;
            tL_messageService.params = message2.params;
            tL_messageService.random_id = message2.random_id;
            tL_messageService.local_id = message2.local_id;
            tL_messageService.dialog_id = message2.dialog_id;
            tL_messageService.ttl = message2.ttl;
            tL_messageService.destroyTime = message2.destroyTime;
            tL_messageService.destroyTimeMillis = message2.destroyTimeMillis;
            tL_messageService.layer = message2.layer;
            tL_messageService.seq_in = message2.seq_in;
            tL_messageService.seq_out = message2.seq_out;
            tL_messageService.with_my_score = message2.with_my_score;
            tL_messageService.replyMessage = message2.replyMessage;
            tL_messageService.reqId = message2.reqId;
            tL_messageService.realId = message2.realId;
            tL_messageService.stickerVerified = message2.stickerVerified;
            tL_messageService.isThreadMessage = message2.isThreadMessage;
            tL_messageService.voiceTranscription = message2.voiceTranscription;
            tL_messageService.voiceTranscriptionOpen = message2.voiceTranscriptionOpen;
            tL_messageService.voiceTranscriptionRated = message2.voiceTranscriptionRated;
            tL_messageService.voiceTranscriptionFinal = message2.voiceTranscriptionFinal;
            tL_messageService.voiceTranscriptionForce = message2.voiceTranscriptionForce;
            tL_messageService.voiceTranscriptionId = message2.voiceTranscriptionId;
            tL_messageService.premiumEffectWasPlayed = message2.premiumEffectWasPlayed;
            tL_messageService.originalLanguage = message2.originalLanguage;
            tL_messageService.translatedToLanguage = message2.translatedToLanguage;
            tL_messageService.translatedText = message2.translatedText;
            tL_messageService.replyStory = message2.replyStory;
            message = tL_messageService;
            boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
            if (boolUseForwardForRepost == null) {
            }
            message.voiceTranscriptionOpen = false;
            int i4 = messageObject.currentAccount;
            MessageObject messageObject3 = new MessageObject(i4, message, messageObject.replyMessageObject, MessagesController.getInstance(i4).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z, false);
            messageObject3.setType();
            this.messageObjects.add(messageObject3);
        }
        this.groupedMessages = null;
        if (this.messageObjects.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.groupedMessages = groupedMessages;
            groupedMessages.messages.addAll(this.messageObjects);
            groupedMessages.groupId = ((MessageObject) this.messageObjects.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = new ThemePreviewActivity.AnonymousClass14(anonymousClass26, context);
        this.container = anonymousClass14;
        addView(anonymousClass14, LayoutHelper.createFrame(-1.0f, -1));
        ?? r10 = new RecyclerListView(context, this.resourcesProvider) {
            public final ArrayList drawTimeAfter = new ArrayList();
            public final ArrayList drawNamesAfter = new ArrayList();
            public final ArrayList drawCaptionAfter = new ArrayList();
            public final ArrayList drawReactionsAfter = new ArrayList();
            public final ArrayList drawingGroups = new ArrayList(10);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                boolean z2;
                float f;
                int i5;
                int i6;
                float f2;
                float f3;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessages groupedMessages2;
                int measuredHeight;
                canvas.save();
                this.selectorRect.setEmpty();
                int childCount = getChildCount();
                int i7 = 0;
                MessageObject.GroupedMessages groupedMessages3 = null;
                while (true) {
                    z2 = true;
                    f = 0.0f;
                    i5 = 4;
                    i6 = 2;
                    f2 = 2.0f;
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 4) {
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages3) {
                                MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                                MessageBackgroundDrawable backgroundDrawable = chatMessageCell.getBackgroundDrawable();
                                if ((backgroundDrawable.animationInProgress || chatMessageCell.drawSelectionBackground || chatMessageCell.isHighlightedAnimated || chatMessageCell.isHighlighted) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    int y = (int) chatMessageCell.getY();
                                    canvas.save();
                                    if (currentPosition == null) {
                                        measuredHeight = chatMessageCell.getMeasuredHeight();
                                        groupedMessages2 = currentMessagesGroup2;
                                    } else {
                                        int measuredHeight2 = chatMessageCell.getMeasuredHeight() + y;
                                        long j = 0;
                                        float y2 = 0.0f;
                                        int i8 = 0;
                                        while (i8 < childCount) {
                                            View childAt2 = getChildAt(i8);
                                            if (childAt2 instanceof ChatMessageCell) {
                                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                                                if (chatMessageCell2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                    MessageBackgroundDrawable backgroundDrawable2 = chatMessageCell2.getBackgroundDrawable();
                                                    y = Math.min(y, (int) chatMessageCell2.getY());
                                                    int iMax = Math.max(measuredHeight2, chatMessageCell2.getMeasuredHeight() + ((int) chatMessageCell2.getY()));
                                                    long j2 = backgroundDrawable2.lastTouchTime;
                                                    if (j2 > j) {
                                                        float x = chatMessageCell2.getX() + backgroundDrawable2.touchX;
                                                        y2 = chatMessageCell2.getY() + backgroundDrawable2.touchY;
                                                        f = x;
                                                        j = j2;
                                                    }
                                                    measuredHeight2 = iMax;
                                                }
                                            }
                                            i8++;
                                            currentMessagesGroup2 = currentMessagesGroup2;
                                        }
                                        groupedMessages2 = currentMessagesGroup2;
                                        backgroundDrawable.touchOverrideX = f;
                                        backgroundDrawable.touchOverrideY = y2 - y;
                                        measuredHeight = measuredHeight2 - y;
                                    }
                                    int i9 = measuredHeight + y;
                                    canvas.clipRect(0, y, getMeasuredWidth(), i9);
                                    backgroundDrawable.customPaint = null;
                                    backgroundDrawable.paint.setColor(Theme.getColor(Theme.key_chat_selectedBackground, this.resourcesProvider));
                                    backgroundDrawable.setBounds(0, y, getMeasuredWidth(), i9);
                                    backgroundDrawable.draw(canvas);
                                    canvas.restore();
                                } else {
                                    groupedMessages2 = currentMessagesGroup2;
                                }
                                groupedMessages3 = groupedMessages2;
                            }
                        } else if (childAt instanceof ChatActionCell) {
                            ChatActionCell chatActionCell = (ChatActionCell) childAt;
                            if (chatActionCell.hasGradientService()) {
                                canvas.save();
                                canvas.translate(chatActionCell.getX(), chatActionCell.getY() + chatActionCell.getPaddingTop());
                                canvas.scale(chatActionCell.getScaleX(), chatActionCell.getScaleY(), chatActionCell.getMeasuredWidth() / 2.0f, chatActionCell.getMeasuredHeight() / 2.0f);
                                chatActionCell.drawBackground(canvas, true);
                                chatActionCell.drawReactions(canvas, true);
                                canvas.restore();
                            }
                        }
                    }
                    i7++;
                }
                int i10 = 0;
                while (i10 < 3) {
                    ArrayList arrayList2 = this.drawingGroups;
                    arrayList2.clear();
                    if (i10 != i6 || this.fastScrollAnimationRunning) {
                        int i11 = 0;
                        while (i11 < childCount) {
                            View childAt3 = getChildAt(i11);
                            if (childAt3 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt3;
                                if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f && chatMessageCell3.getVisibility() != i5 && chatMessageCell3.getVisibility() != 8 && (currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup()) != null && ((i10 != 0 || currentMessagesGroup.messages.size() != z2) && ((i10 != z2 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i10 != 0 || !chatMessageCell3.getMessageObject().deleted) && ((i10 != z2 || chatMessageCell3.getMessageObject().deleted) && ((i10 != i6 || chatMessageCell3.willRemoved) && (i10 == i6 || !chatMessageCell3.willRemoved))))))) {
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = 0;
                                        transitionParams.top = 0;
                                        transitionParams.right = 0;
                                        transitionParams.bottom = 0;
                                        transitionParams.pinnedBotton = false;
                                        transitionParams.pinnedTop = false;
                                        transitionParams.cell = chatMessageCell3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell3.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell3.isPinnedBottom();
                                    int backgroundDrawableLeft = chatMessageCell3.getBackgroundDrawableLeft() + chatMessageCell3.getLeft();
                                    int backgroundDrawableRight = chatMessageCell3.getBackgroundDrawableRight() + chatMessageCell3.getLeft();
                                    int backgroundDrawableTop = chatMessageCell3.getBackgroundDrawableTop() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getTop();
                                    int backgroundDrawableBottom = chatMessageCell3.getBackgroundDrawableBottom() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getTop();
                                    if ((chatMessageCell3.getCurrentPosition().flags & 4) == 0) {
                                        backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                    }
                                    int i12 = backgroundDrawableTop;
                                    if ((chatMessageCell3.getCurrentPosition().flags & 8) == 0) {
                                        backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                    }
                                    int i13 = backgroundDrawableBottom;
                                    if (chatMessageCell3.willRemoved) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell3;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i14 = transitionParams2.top;
                                    if (i14 == 0 || i12 < i14) {
                                        transitionParams2.top = i12;
                                    }
                                    int i15 = transitionParams2.bottom;
                                    if (i15 == 0 || i13 > i15) {
                                        transitionParams2.bottom = i13;
                                    }
                                    int i16 = transitionParams2.left;
                                    if (i16 == 0 || backgroundDrawableLeft < i16) {
                                        transitionParams2.left = backgroundDrawableLeft;
                                    }
                                    int i17 = transitionParams2.right;
                                    if (i17 == 0 || backgroundDrawableRight > i17) {
                                        transitionParams2.right = backgroundDrawableRight;
                                    }
                                }
                            }
                            i11++;
                            i5 = 4;
                            i6 = 2;
                        }
                        int i18 = 0;
                        while (i18 < arrayList2.size()) {
                            MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i18);
                            float nonAnimationTranslationX = groupedMessages4.transitionParams.cell.getNonAnimationTranslationX(z2);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages4.transitionParams;
                            float f4 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                            float translationY = transitionParams3.top + transitionParams3.offsetTop;
                            float f5 = transitionParams3.offsetRight + transitionParams3.right + nonAnimationTranslationX;
                            float translationY2 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (!transitionParams3.backgroundChangeBounds) {
                                translationY += transitionParams3.cell.getTranslationY();
                                translationY2 += groupedMessages4.transitionParams.cell.getTranslationY();
                            }
                            float f6 = translationY;
                            float f7 = translationY2;
                            boolean z3 = (groupedMessages4.transitionParams.cell.getScaleX() == 1.0f && groupedMessages4.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                            if (z3) {
                                canvas.save();
                                canvas.scale(groupedMessages4.transitionParams.cell.getScaleX(), groupedMessages4.transitionParams.cell.getScaleY(), ImageReceiver$$ExternalSyntheticOutline0.m(f5, f4, f2, f4), ImageReceiver$$ExternalSyntheticOutline0.m(f7, f6, f2, f6));
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages4.transitionParams;
                            ArrayList arrayList3 = arrayList2;
                            transitionParams4.cell.drawBackground(canvas, (int) f4, (int) f6, (int) f5, (int) f7, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                            MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages4.transitionParams;
                            transitionParams5.cell = null;
                            transitionParams5.drawCaptionLayout = groupedMessages4.hasCaption;
                            if (z3) {
                                canvas.restore();
                                for (int i19 = 0; i19 < childCount; i19++) {
                                    View childAt4 = getChildAt(i19);
                                    if (childAt4 instanceof ChatMessageCell) {
                                        ChatMessageCell chatMessageCell4 = (ChatMessageCell) childAt4;
                                        if (chatMessageCell4.getCurrentMessagesGroup() == groupedMessages4) {
                                            int left = chatMessageCell4.getLeft();
                                            int top = chatMessageCell4.getTop();
                                            childAt4.setPivotX(((f5 - f4) / 2.0f) + (f4 - left));
                                            childAt4.setPivotY(((f7 - f6) / 2.0f) + (f6 - top));
                                        }
                                    }
                                }
                            }
                            i18++;
                            arrayList2 = arrayList3;
                            f2 = 2.0f;
                            z2 = true;
                        }
                    }
                    i10++;
                    i5 = 4;
                    i6 = 2;
                    f2 = 2.0f;
                    z2 = true;
                    f = 0.0f;
                }
                super.dispatchDraw(canvas);
                ArrayList arrayList4 = this.drawTimeAfter;
                int size = arrayList4.size();
                if (size > 0) {
                    for (int i20 = 0; i20 < size; i20++) {
                        ChatMessageCell chatMessageCell5 = (ChatMessageCell) arrayList4.get(i20);
                        canvas.save();
                        canvas.translate(chatMessageCell5.getNonAnimationTranslationX(false) + chatMessageCell5.getLeft(), chatMessageCell5.getY());
                        chatMessageCell5.drawTime(chatMessageCell5.shouldDrawAlphaLayer() ? chatMessageCell5.getAlpha() : 1.0f, canvas, true);
                        canvas.restore();
                    }
                    arrayList4.clear();
                }
                ArrayList arrayList5 = this.drawNamesAfter;
                int size2 = arrayList5.size();
                if (size2 > 0) {
                    for (int i21 = 0; i21 < size2; i21++) {
                        ChatMessageCell chatMessageCell6 = (ChatMessageCell) arrayList5.get(i21);
                        float nonAnimationTranslationX2 = chatMessageCell6.getNonAnimationTranslationX(false) + chatMessageCell6.getLeft();
                        float y3 = chatMessageCell6.getY();
                        float alpha = chatMessageCell6.shouldDrawAlphaLayer() ? chatMessageCell6.getAlpha() : 1.0f;
                        canvas.save();
                        canvas.translate(nonAnimationTranslationX2, y3);
                        chatMessageCell6.setInvalidatesParent(true);
                        chatMessageCell6.drawNamesLayout(canvas, alpha);
                        chatMessageCell6.setInvalidatesParent(false);
                        canvas.restore();
                    }
                    arrayList5.clear();
                }
                ArrayList arrayList6 = this.drawCaptionAfter;
                int size3 = arrayList6.size();
                if (size3 > 0) {
                    for (int i22 = 0; i22 < size3; i22++) {
                        ChatMessageCell chatMessageCell7 = (ChatMessageCell) arrayList6.get(i22);
                        boolean z4 = chatMessageCell7.getCurrentPosition() != null && (chatMessageCell7.getCurrentPosition().flags & 1) == 0;
                        float alpha2 = chatMessageCell7.shouldDrawAlphaLayer() ? chatMessageCell7.getAlpha() : 1.0f;
                        float nonAnimationTranslationX3 = chatMessageCell7.getNonAnimationTranslationX(false) + chatMessageCell7.getLeft();
                        float y4 = chatMessageCell7.getY();
                        canvas.save();
                        MessageObject.GroupedMessages currentMessagesGroup3 = chatMessageCell7.getCurrentMessagesGroup();
                        if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                            float nonAnimationTranslationX4 = chatMessageCell7.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                            float f8 = transitionParams6.left + nonAnimationTranslationX4 + transitionParams6.offsetLeft;
                            float translationY3 = transitionParams6.top + transitionParams6.offsetTop;
                            float f9 = transitionParams6.right + nonAnimationTranslationX4 + transitionParams6.offsetRight;
                            float translationY4 = transitionParams6.bottom + transitionParams6.offsetBottom;
                            if (!transitionParams6.backgroundChangeBounds) {
                                translationY3 += chatMessageCell7.getTranslationY();
                                translationY4 += chatMessageCell7.getTranslationY();
                            }
                            canvas.clipRect(f8 + AndroidUtilities.dp(8.0f), translationY3 + AndroidUtilities.dp(8.0f), f9 - AndroidUtilities.dp(8.0f), translationY4 - AndroidUtilities.dp(8.0f));
                        }
                        if (chatMessageCell7.getTransitionParams().wasDraw) {
                            canvas.translate(nonAnimationTranslationX3, y4);
                            chatMessageCell7.setInvalidatesParent(true);
                            chatMessageCell7.drawCaptionLayout(alpha2, canvas, z4);
                            chatMessageCell7.setInvalidatesParent(false);
                            canvas.restore();
                        }
                    }
                    f3 = 8.0f;
                    arrayList6.clear();
                } else {
                    f3 = 8.0f;
                }
                ArrayList arrayList7 = this.drawReactionsAfter;
                int size4 = arrayList7.size();
                if (size4 > 0) {
                    for (int i23 = 0; i23 < size4; i23++) {
                        ChatMessageCell chatMessageCell8 = (ChatMessageCell) arrayList7.get(i23);
                        if (chatMessageCell8.getCurrentPosition() == null || (chatMessageCell8.getCurrentPosition().flags & 1) != 0) {
                            float alpha3 = chatMessageCell8.shouldDrawAlphaLayer() ? chatMessageCell8.getAlpha() : 1.0f;
                            float nonAnimationTranslationX5 = chatMessageCell8.getNonAnimationTranslationX(false) + chatMessageCell8.getLeft();
                            float y5 = chatMessageCell8.getY();
                            canvas.save();
                            MessageObject.GroupedMessages currentMessagesGroup4 = chatMessageCell8.getCurrentMessagesGroup();
                            if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                                float nonAnimationTranslationX6 = chatMessageCell8.getNonAnimationTranslationX(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                                float f10 = transitionParams7.left + nonAnimationTranslationX6 + transitionParams7.offsetLeft;
                                float translationY5 = transitionParams7.top + transitionParams7.offsetTop;
                                float f11 = transitionParams7.right + nonAnimationTranslationX6 + transitionParams7.offsetRight;
                                float translationY6 = transitionParams7.bottom + transitionParams7.offsetBottom;
                                if (!transitionParams7.backgroundChangeBounds) {
                                    translationY5 += chatMessageCell8.getTranslationY();
                                    translationY6 += chatMessageCell8.getTranslationY();
                                }
                                canvas.clipRect(f10 + AndroidUtilities.dp(f3), translationY5 + AndroidUtilities.dp(f3), f11 - AndroidUtilities.dp(f3), translationY6 - AndroidUtilities.dp(f3));
                            }
                            if (chatMessageCell8.getTransitionParams().wasDraw) {
                                canvas.translate(nonAnimationTranslationX5, y5);
                                chatMessageCell8.setInvalidatesParent(true);
                                chatMessageCell8.drawReactionsLayout(canvas, alpha3, null);
                                chatMessageCell8.drawCommentLayout(canvas, alpha3);
                                chatMessageCell8.setInvalidatesParent(false);
                                canvas.restore();
                            }
                        }
                    }
                    arrayList7.clear();
                }
                canvas.restore();
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                ChatActionCell chatActionCell;
                float f;
                float f2;
                int adapterPosition;
                ChatMessageCell chatMessageCell;
                int adapterPosition2;
                int i5;
                ChatMessageCell chatMessageCell2 = null;
                if (view instanceof ChatMessageCell) {
                    chatMessageCell2 = (ChatMessageCell) view;
                    chatActionCell = null;
                } else {
                    chatActionCell = view instanceof ChatActionCell ? (ChatActionCell) view : null;
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (chatMessageCell2 != null && chatMessageCell2.hasOutboundsContent()) {
                    canvas.save();
                    canvas.translate(chatMessageCell2.getX(), chatMessageCell2.getY() + chatMessageCell2.getPaddingTop());
                    chatMessageCell2.drawOutboundsContent(canvas);
                    canvas.restore();
                } else if (chatActionCell != null) {
                    canvas.save();
                    canvas.translate(chatActionCell.getX(), chatActionCell.getY());
                    chatActionCell.drawOutboundsContent(canvas);
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (chatMessageCell2 != null) {
                    chatMessageCell2.drawCheckBox(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (chatMessageCell2 != null) {
                    chatMessageCell2.getMessageObject();
                    MessageObject.GroupedMessagePosition currentPosition = chatMessageCell2.getCurrentPosition();
                    if (currentPosition != null || chatMessageCell2.getTransitionParams().animateBackgroundBoundsInner) {
                        if (currentPosition == null || currentPosition.last || (currentPosition.minX == 0 && currentPosition.minY == 0)) {
                            if (currentPosition == null || currentPosition.last) {
                                this.drawTimeAfter.add(chatMessageCell2);
                            }
                            if ((currentPosition == null || (currentPosition.minX == 0 && currentPosition.minY == 0)) && chatMessageCell2.hasNameLayout()) {
                                this.drawNamesAfter.add(chatMessageCell2);
                            }
                        }
                        if (currentPosition != null || chatMessageCell2.getTransitionParams().transformGroupToSingleMessage || chatMessageCell2.getTransitionParams().animateBackgroundBoundsInner) {
                            if (currentPosition == null || (currentPosition.flags & chatMessageCell2.captionFlag()) != 0) {
                                this.drawCaptionAfter.add(chatMessageCell2);
                            }
                            if (currentPosition != null) {
                                int i6 = currentPosition.flags;
                                if ((i6 & 8) != 0 && (i6 & 1) != 0) {
                                    this.drawReactionsAfter.add(chatMessageCell2);
                                }
                            } else {
                                this.drawReactionsAfter.add(chatMessageCell2);
                            }
                        }
                    }
                    ImageReceiver avatarImage = chatMessageCell2.getAvatarImage();
                    if (avatarImage != null) {
                        boolean z2 = this.fastScrollAnimationRunning;
                        PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                        MessageObject.GroupedMessages groupedMessages2 = anonymousClass27.groupedMessages;
                        boolean z3 = z2 || (groupedMessages2 != null && groupedMessages2.transitionParams.backgroundChangeBounds);
                        int top = z3 ? view.getTop() : (int) view.getY();
                        if (!chatMessageCell2.drawPinnedBottom() || (adapterPosition2 = anonymousClass27.listView.getChildViewHolder(view).getAdapterPosition()) < 0) {
                            f2 = 0.0f;
                        } else {
                            if (groupedMessages2 != null && currentPosition != null) {
                                int iIndexOf = groupedMessages2.posArray.indexOf(currentPosition);
                                int size = groupedMessages2.posArray.size();
                                if ((currentPosition.flags & 8) != 0) {
                                    i5 = (adapterPosition2 - size) + iIndexOf;
                                } else {
                                    i5 = adapterPosition2 - 1;
                                    int i7 = iIndexOf + 1;
                                    while (true) {
                                        if (i7 < size) {
                                            f2 = 0.0f;
                                            if (groupedMessages2.posArray.get(i7).minY > currentPosition.maxY) {
                                                break;
                                            }
                                            i5--;
                                            i7++;
                                        }
                                    }
                                }
                                f2 = 0.0f;
                                break;
                            } else {
                                f2 = 0.0f;
                                i5 = adapterPosition2 - 1;
                            }
                            if (findViewHolderForAdapterPosition(i5) != null) {
                                if (view.getTranslationY() != f2) {
                                    canvas.restore();
                                }
                                avatarImage.setVisible(false, false);
                                return zDrawChild;
                            }
                        }
                        float checkBoxTranslation = chatMessageCell2.getCheckBoxTranslation() + chatMessageCell2.getSlidingOffsetX();
                        int top2 = (int) ((z3 ? view.getTop() : view.getY()) + chatMessageCell2.getLayoutHeight() + chatMessageCell2.getTransitionParams().deltaBottom);
                        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                        boolean z4 = (chatMessageCell2.checkBoxVisible || chatMessageCell2.checkBoxAnimationInProgress) && checkBoxTranslation == f2;
                        if ((chatMessageCell2.isRoundVideo && chatMessageCell2.isPlayingRound) || chatMessageCell2.getTransitionParams().animatePlayingRound) {
                            if (chatMessageCell2.getTransitionParams().animatePlayingRound) {
                                float f3 = chatMessageCell2.getTransitionParams().animateChangeProgress;
                                if (!chatMessageCell2.isRoundVideo || !chatMessageCell2.isPlayingRound) {
                                    f3 = 1.0f - f3;
                                }
                                top2 = (int) DiffUtil.m(1.0f, f3, Math.min(top2, measuredHeight), top2 * f3);
                            }
                        } else if (top2 > measuredHeight) {
                            top2 = measuredHeight;
                        }
                        if (!z3 && view.getTranslationY() != f2) {
                            canvas.restore();
                        }
                        if (chatMessageCell2.drawPinnedTop() && (adapterPosition = getChildViewHolder(view).getAdapterPosition()) >= 0) {
                            int i8 = 0;
                            while (true) {
                                if (i8 < 20) {
                                    i8++;
                                    if (groupedMessages2 != null && currentPosition != null) {
                                        int iIndexOf2 = groupedMessages2.posArray.indexOf(currentPosition);
                                        if (iIndexOf2 >= 0) {
                                            groupedMessages2.posArray.size();
                                            if ((currentPosition.flags & 4) != 0) {
                                                adapterPosition = adapterPosition + iIndexOf2 + 1;
                                            } else {
                                                adapterPosition++;
                                                int i9 = iIndexOf2 - 1;
                                                while (true) {
                                                    if (i9 >= 0) {
                                                        chatMessageCell = chatMessageCell2;
                                                        if (groupedMessages2.posArray.get(i9).maxY < currentPosition.minY) {
                                                            break;
                                                        }
                                                        adapterPosition++;
                                                        i9--;
                                                        chatMessageCell2 = chatMessageCell;
                                                    }
                                                }
                                            }
                                            chatMessageCell = chatMessageCell2;
                                            break;
                                        }
                                    } else {
                                        chatMessageCell = chatMessageCell2;
                                        adapterPosition++;
                                    }
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(adapterPosition);
                                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                                        View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        top = view2.getTop();
                                        if (view2 instanceof ChatMessageCell) {
                                            chatMessageCell2 = (ChatMessageCell) view2;
                                            float checkBoxTranslation2 = chatMessageCell2.getCheckBoxTranslation() + chatMessageCell2.getSlidingOffsetX();
                                            if (z4 && checkBoxTranslation2 > f2) {
                                                checkBoxTranslation = checkBoxTranslation2;
                                            }
                                            if (!chatMessageCell2.drawPinnedTop()) {
                                            }
                                        }
                                    }
                                    chatMessageCell2 = chatMessageCell;
                                }
                                chatMessageCell = chatMessageCell2;
                                chatMessageCell2 = chatMessageCell;
                            }
                        }
                        if (top2 - AndroidUtilities.dp(42.0f) < top) {
                            top2 = AndroidUtilities.dp(42.0f) + top;
                        }
                        if (!chatMessageCell2.drawPinnedBottom()) {
                            int bottom = z3 ? chatMessageCell2.getBottom() : (int) (chatMessageCell2.getY() + chatMessageCell2.getMeasuredHeight() + chatMessageCell2.getTransitionParams().deltaBottom);
                            if (top2 > bottom) {
                                top2 = bottom;
                            }
                        }
                        canvas.save();
                        if (checkBoxTranslation != f2) {
                            canvas.translate(checkBoxTranslation, 0.0f);
                        }
                        if (chatMessageCell2.getCurrentMessagesGroup() != null && chatMessageCell2.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                            top2 = (int) (top2 - chatMessageCell2.getTranslationY());
                        }
                        avatarImage.setImageY(top2 - AndroidUtilities.dp(40.0f));
                        if (chatMessageCell2.shouldDrawAlphaLayer()) {
                            avatarImage.setAlpha(chatMessageCell2.getAlpha());
                            canvas.scale(chatMessageCell2.getScaleX(), chatMessageCell2.getScaleY(), chatMessageCell2.getPivotX() + chatMessageCell2.getX(), chatMessageCell2.getY() + (chatMessageCell2.getHeight() >> 1));
                        } else {
                            avatarImage.setAlpha(1.0f);
                        }
                        avatarImage.setVisible(true, false);
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (z3) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            if (view.getTranslationY() != 0.0f) {
                                canvas.save();
                            }
                        }
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                if (view.getTranslationY() != f) {
                    canvas.restore();
                }
                return zDrawChild;
            }
        };
        this.listView = r10;
        r10.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                return anonymousClass26.messageObjects.size();
            }

            @Override
            public final int getItemViewType(int i5) {
                PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                return ((MessageObject) anonymousClass27.messageObjects.get((anonymousClass27.messageObjects.size() - 1) - i5)).contentType;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i5) {
                MessageObject.GroupedMessagePosition position;
                PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                ArrayList arrayList2 = anonymousClass27.messageObjects;
                MessageObject messageObject4 = (MessageObject) arrayList2.get((arrayList2.size() - 1) - i5);
                View view = viewHolder.itemView;
                if (!(view instanceof ChatMessageCell)) {
                    if (view instanceof ChatActionCell) {
                        ((ChatActionCell) view).setMessageObject(messageObject4);
                    }
                } else {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                    MessageObject.GroupedMessages groupedMessages2 = anonymousClass27.groupedMessages;
                    boolean z2 = (groupedMessages2 == null || (position = groupedMessages2.getPosition(messageObject4)) == null || position.minY == 0) ? false : true;
                    MessageObject.GroupedMessages groupedMessages3 = anonymousClass27.groupedMessages;
                    chatMessageCell.setMessageObject(messageObject4, groupedMessages3, groupedMessages3 != null, z2, false, false);
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i5) {
                GmsRpc gmsRpc2 = anonymousClass26.resourcesProvider;
                Context context2 = context;
                if (i5 == 1) {
                    return new RecyclerListView.Holder(new ChatActionCell(context2, gmsRpc2) {
                        public final BlurringShader.StoryBlurDrawer blurDrawer;
                        public final TextPaint textPaint;

                        {
                            this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 10, false);
                            TextPaint textPaint4 = new TextPaint(1);
                            this.textPaint = textPaint4;
                            textPaint4.setTypeface(AndroidUtilities.bold());
                            textPaint4.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                            textPaint4.setColor(-1);
                        }

                        @Override
                        public final Paint getThemedPaint(String str) {
                            if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
                                return this.textPaint;
                            }
                            if ("paintChatActionBackground".equals(str)) {
                                PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                                anonymousClass27.usesBackgroundPaint = true;
                                boolean z2 = anonymousClass27.isDark;
                                BlurringShader.StoryBlurDrawer storyBlurDrawer = this.blurDrawer;
                                if (storyBlurDrawer.wasDark != z2) {
                                    storyBlurDrawer.wasDark = z2;
                                    if (storyBlurDrawer.type == 10) {
                                        ColorMatrix colorMatrix = new ColorMatrix();
                                        colorMatrix.setSaturation(1.6f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, storyBlurDrawer.wasDark ? 0.97f : 0.92f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, storyBlurDrawer.wasDark ? 0.12f : -0.06f);
                                        storyBlurDrawer.paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                        storyBlurDrawer.oldPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                    }
                                }
                                Paint paint$1 = storyBlurDrawer.getPaint$1(1.0f);
                                if (paint$1 != null) {
                                    return paint$1;
                                }
                            }
                            return super.getThemedPaint(str);
                        }
                    });
                }
                ChatMessageCell chatMessageCell = new ChatMessageCell(context2, UserConfig.selectedAccount, gmsRpc2) {
                    public final BlurringShader.StoryBlurDrawer blurDrawer;
                    public final Paint clearPaint;
                    public final RectF dst;
                    public final Rect src;
                    public final float[] radii = new float[8];
                    public final Path clipPath = new Path();

                    {
                        this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 10, false);
                        Paint paint2 = new Paint();
                        this.clearPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        this.src = new Rect();
                        this.dst = new RectF();
                    }

                    @Override
                    public final boolean drawPhotoImage(Canvas canvas) {
                        float[] fArr;
                        ImageReceiver photoImage = getPhotoImage();
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        if (z && photoImage != null) {
                            PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                            PreviewView.TextureViewHolder textureViewHolder2 = textureViewHolder;
                            if ((textureViewHolder2 != null && textureViewHolder2.active && textureViewHolder2.textureViewActive && anonymousClass27.textureViewActive) || anonymousClass27.clipVideoMessageForBitmap || (anonymousClass27.textureView != null && PaintView.this.drawForThemeToggle)) {
                                int i6 = 0;
                                while (true) {
                                    int length = photoImage.getRoundRadius().length;
                                    fArr = this.radii;
                                    if (i6 >= length) {
                                        break;
                                    }
                                    int i7 = i6 * 2;
                                    fArr[i7] = photoImage.getRoundRadius()[i6];
                                    fArr[i7 + 1] = photoImage.getRoundRadius()[i6];
                                    i6++;
                                }
                                RectF rectF = AndroidUtilities.rectTmp;
                                rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
                                Path path = this.clipPath;
                                path.rewind();
                                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                TextureView textureView = anonymousClass27.textureView;
                                if (textureView == null || !PaintView.this.drawForThemeToggle) {
                                    canvas.drawPath(path, this.clearPaint);
                                    return true;
                                }
                                Bitmap bitmap = textureView.getBitmap();
                                if (bitmap == null) {
                                    return super.drawPhotoImage(canvas);
                                }
                                canvas.save();
                                canvas.clipPath(path);
                                canvas.translate(-getX(), -getY());
                                float fMax = Math.max(photoImage.getImageWidth() / anonymousClass27.videoWidth, photoImage.getImageHeight() / anonymousClass27.videoHeight);
                                canvas.translate(photoImage.getCenterX() - ((anonymousClass27.videoWidth * fMax) / 2.0f), photoImage.getCenterY() - ((anonymousClass27.videoHeight * fMax) / 2.0f));
                                canvas.scale((anonymousClass27.videoWidth / anonymousClass27.textureView.getWidth()) * fMax, (anonymousClass27.videoHeight / anonymousClass27.textureView.getHeight()) * fMax);
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                Rect rect = this.src;
                                rect.set(0, 0, width, height);
                                RectF rectF2 = this.dst;
                                rectF2.set(0.0f, 0.0f, anonymousClass27.textureView.getWidth(), anonymousClass27.textureView.getHeight());
                                canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                                canvas.restore();
                                return true;
                            }
                        }
                        return super.drawPhotoImage(canvas);
                    }

                    @Override
                    public final Paint getThemedPaint(String str) {
                        if ("paintChatActionBackground".equals(str)) {
                            anonymousClass26.usesBackgroundPaint = true;
                            Paint paint$1 = this.blurDrawer.getPaint$1(1.0f);
                            if (paint$1 != null) {
                                return paint$1;
                            }
                        }
                        return super.getThemedPaint(str);
                    }

                    @Override
                    public final void onDraw(Canvas canvas) {
                        Canvas canvas2;
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        PreviewView.TextureViewHolder textureViewHolder2 = textureViewHolder;
                        if ((textureViewHolder2 != null && textureViewHolder2.active && textureViewHolder2.textureViewActive) || anonymousClass26.clipVideoMessageForBitmap) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        drawInternal(canvas2);
                        canvas2.restore();
                    }

                    @Override
                    public final boolean onTouchEvent(MotionEvent motionEvent) {
                        return false;
                    }
                };
                chatMessageCell.isChat = true;
                return new RecyclerListView.Holder(chatMessageCell);
            }
        });
        GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed() {
            {
                super(true);
            }

            @Override
            public final boolean hasSiblingChild(int i5) {
                byte b;
                PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                int size = (anonymousClass27.messageObjects.size() - 1) - i5;
                if (anonymousClass27.groupedMessages != null && size >= 0 && size < anonymousClass27.messageObjects.size()) {
                    MessageObject.GroupedMessagePosition position = anonymousClass27.groupedMessages.getPosition((MessageObject) anonymousClass27.messageObjects.get(size));
                    if (position != null && position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size2 = anonymousClass27.groupedMessages.posArray.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = anonymousClass27.groupedMessages.posArray.get(i6);
                            if (groupedMessagePosition != position) {
                                byte b2 = groupedMessagePosition.minY;
                                byte b3 = position.minY;
                                if (b2 <= b3 && groupedMessagePosition.maxY >= b3) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override
            public final boolean shouldLayoutChildFromOpositeSide(View view) {
                if (view instanceof ChatMessageCell) {
                    return !((ChatMessageCell) view).getMessageObject().isOutOwner();
                }
                return false;
            }

            @Override
            public final boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        gridLayoutManagerFixed.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i5) {
                PaintView.AnonymousClass26 anonymousClass27 = anonymousClass26;
                int size = (anonymousClass27.messageObjects.size() - 1) - i5;
                MessageObject.GroupedMessages groupedMessages2 = anonymousClass27.groupedMessages;
                if (groupedMessages2 == null || size < 0 || size >= groupedMessages2.messages.size()) {
                    return 1000;
                }
                MessageObject.GroupedMessagePosition position = anonymousClass27.groupedMessages.getPosition(anonymousClass27.groupedMessages.messages.get(size));
                if (position != null) {
                    return position.spanSize;
                }
                return 1000;
            }
        };
        r10.setLayoutManager(gridLayoutManagerFixed);
        r10.addItemDecoration(new AnonymousClass6());
        anonymousClass14.addView((View) r10, LayoutHelper.createFrame(-1.0f, -1));
        if (textureViewHolder != null && textureViewHolder.active) {
            PaintView.AnonymousClass26 anonymousClass27 = (PaintView.AnonymousClass26) this;
            DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(anonymousClass27, 22);
            GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda9 = new GiftSheet$$ExternalSyntheticLambda8(anonymousClass27, 6);
            textureViewHolder.whenTextureViewReceived = dialogCell$$ExternalSyntheticLambda6;
            textureViewHolder.whenTextureViewActive = giftSheet$$ExternalSyntheticLambda9;
            VideoEditTextureView videoEditTextureView = textureViewHolder.textureView;
            if (videoEditTextureView != null) {
                dialogCell$$ExternalSyntheticLambda6.run(videoEditTextureView);
            }
            if (textureViewHolder.textureViewActive && (giftSheet$$ExternalSyntheticLambda8 = textureViewHolder.whenTextureViewActive) != null) {
                giftSheet$$ExternalSyntheticLambda8.run(Integer.valueOf(textureViewHolder.videoWidth), Integer.valueOf(textureViewHolder.videoHeight));
            }
        }
        updatePosition();
    }

    public ChatMessageCell getCell() {
        AnonymousClass2 anonymousClass2 = this.listView;
        if (anonymousClass2 == null) {
            return null;
        }
        for (int i = 0; i < anonymousClass2.getChildCount(); i++) {
            if (anonymousClass2.getChildAt(i) instanceof ChatMessageCell) {
                return (ChatMessageCell) anonymousClass2.getChildAt(i);
            }
        }
        return null;
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new LinkView.TextViewSelectionView(this, getContext());
    }

    @Override
    public float getBounceScale() {
        return 0.02f;
    }

    public final float getBubbleBounds(RectF rectF) {
        float y;
        float imageX;
        float imageX2;
        float imageY;
        float fMin = 2.1474836E9f;
        float fMin2 = 2.1474836E9f;
        float fMax = -2.1474836E9f;
        float fMax2 = -2.1474836E9f;
        int i = 0;
        while (true) {
            AnonymousClass2 anonymousClass2 = this.listView;
            if (i >= anonymousClass2.getChildCount()) {
                rectF.set(fMin, fMin2, fMax, fMax2);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
            View childAt = anonymousClass2.getChildAt(i);
            boolean z = childAt instanceof ChatMessageCell;
            ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.container;
            if (z) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject() == null || !chatMessageCell.getMessageObject().isRoundVideo() || chatMessageCell.getPhotoImage() == null) {
                    float x = childAt.getX() + anonymousClass14.getX() + chatMessageCell.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                    if (this.groupedMessages == null) {
                        x += AndroidUtilities.dp(8.0f);
                    }
                    float x2 = ((childAt.getX() + anonymousClass14.getX()) + chatMessageCell.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                    float fDp = AndroidUtilities.dp(2.0f) + childAt.getY() + anonymousClass14.getY() + chatMessageCell.getBackgroundDrawableTop();
                    y = ((childAt.getY() + anonymousClass14.getY()) + chatMessageCell.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                    imageX = x;
                    imageX2 = x2;
                    imageY = fDp;
                } else {
                    imageX = chatMessageCell.getPhotoImage().getImageX() + chatMessageCell.getX() + anonymousClass14.getX();
                    imageX2 = chatMessageCell.getPhotoImage().getImageX2() + chatMessageCell.getX() + anonymousClass14.getX();
                    imageY = chatMessageCell.getPhotoImage().getImageY() + chatMessageCell.getY() + anonymousClass14.getY();
                    y = chatMessageCell.getPhotoImage().getImageY2() + chatMessageCell.getY() + anonymousClass14.getY();
                }
                fMin = Math.min(Math.min(fMin, imageX), imageX2);
                fMax = Math.max(Math.max(fMax, imageX), imageX2);
                fMin2 = Math.min(Math.min(fMin2, imageY), y);
                fMax2 = Math.max(Math.max(fMax2, imageY), y);
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                if (chatActionCell.starGiftLayout.has()) {
                    float x3 = chatActionCell.getX() + anonymousClass14.getX() + chatActionCell.getBoundsLeft();
                    float x4 = chatActionCell.getX() + anonymousClass14.getX() + chatActionCell.getBoundsRight();
                    float y2 = chatActionCell.getY() + anonymousClass14.getY();
                    float y3 = chatActionCell.getY() + anonymousClass14.getY() + chatActionCell.getMeasuredHeight();
                    fMin = Math.min(Math.min(fMin, x3), x4);
                    fMax = Math.max(Math.max(fMax, x3), x4);
                    fMin2 = Math.min(Math.min(fMin2, y2), y3);
                    fMax2 = Math.max(Math.max(fMax2, y2), y3);
                }
            }
            i++;
        }
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        return new RectOld(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    public final void invalidateAll() {
        AnonymousClass2 anonymousClass2 = this.listView;
        anonymousClass2.invalidate();
        for (int i = 0; i < anonymousClass2.getChildCount(); i++) {
            anonymousClass2.getChildAt(i).invalidate();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.container;
        anonymousClass14.measure(i, i2);
        setMeasuredDimension(anonymousClass14.getMeasuredWidth(), anonymousClass14.getMeasuredHeight());
        updatePosition();
        if (this.firstMeasure) {
            ArrayList arrayList = this.messageObjects;
            if (arrayList != null) {
                z = arrayList.size() == 1 && ((MessageObject) arrayList.get(0)).contentType == 1;
            }
            float fMin = Math.min((View.MeasureSpec.getSize(i) - AndroidUtilities.dp(z ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(z ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (fMin < 1.0f) {
                setScale(fMin);
            }
            PointF position = getPosition();
            if (!z) {
                position.x -= Math.min(1.0f, fMin) * AndroidUtilities.dp(19.0f);
            }
            setPosition(position);
            this.firstMeasure = false;
        }
    }

    public void setupTheme(StoryEntry storyEntry) {
        boolean z;
        Theme.ThemeInfo themeInfo;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] iArr;
        int i;
        Theme.ThemeAccent accent;
        int i2;
        if (storyEntry == null) {
            this.currentColors.clear();
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        HashMap map = Theme.themesDict;
        if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
            string2 = "Dark Blue";
        }
        Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
        if (string.equals(string2)) {
            if (themeInfo2.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            z = storyEntry.isDark;
            this.isDark = z;
            if (z) {
                themeInfo = (Theme.ThemeInfo) map.get(str3);
            } else {
                themeInfo = (Theme.ThemeInfo) map.get(str2);
            }
            strArr = new String[1];
            str = themeInfo.assetName;
            if (str != null) {
                themeFileValues = Theme.getThemeFileValues(null, str, strArr);
            } else {
                themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
            }
            this.currentColors.clear();
            iArr = Theme.defaultColors;
            if (iArr != null) {
                for (i2 = 0; i2 < iArr.length; i2++) {
                    this.currentColors.put(i2, iArr[i2]);
                }
            }
            for (i = 0; i < themeFileValues.size(); i++) {
                this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
            }
            accent = themeInfo.getAccent(false);
            if (accent != null) {
                accent.fillAccentColors(themeFileValues, this.currentColors);
            }
            invalidateAll();
        }
        str3 = string2;
        str2 = string;
        z = storyEntry.isDark;
        this.isDark = z;
        if (z) {
            themeInfo = (Theme.ThemeInfo) map.get(str3);
        } else {
            themeInfo = (Theme.ThemeInfo) map.get(str2);
        }
        strArr = new String[1];
        str = themeInfo.assetName;
        if (str != null) {
            themeFileValues = Theme.getThemeFileValues(null, str, strArr);
        } else {
            themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
        }
        this.currentColors.clear();
        iArr = Theme.defaultColors;
        if (iArr != null) {
            while (i2 < iArr.length) {
                this.currentColors.put(i2, iArr[i2]);
            }
        }
        while (i < themeFileValues.size()) {
            this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
        }
        accent = themeInfo.getAccent(false);
        if (accent != null) {
            accent.fillAccentColors(themeFileValues, this.currentColors);
        }
        invalidateAll();
    }

    @Override
    public final void updatePosition() {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        setX(getPositionX() - measuredWidth);
        setY(getPositionY() - measuredHeight);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
        if (this.usesBackgroundPaint) {
            invalidateAll();
        }
    }
}

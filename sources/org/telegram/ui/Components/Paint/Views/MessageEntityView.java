package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;

public abstract class MessageEntityView extends EntityView {
    private final BlurringShader.BlurManager blurManager;
    private boolean clipVideoMessageForBitmap;
    public final FrameLayout container;
    private final SparseIntArray currentColors;
    public boolean firstMeasure;
    private MessageObject.GroupedMessages groupedMessages;
    private boolean isDark;
    public final RecyclerListView listView;
    public final ArrayList messageObjects;
    private MessageDrawable msgInDrawable;
    private MessageDrawable msgInDrawableSelected;
    private MessageDrawable msgMediaInDrawable;
    private MessageDrawable msgMediaInDrawableSelected;
    private MessageDrawable msgMediaOutDrawable;
    private MessageDrawable msgMediaOutDrawableSelected;
    private MessageDrawable msgOutDrawable;
    private MessageDrawable msgOutDrawableSelected;
    public final Theme.ResourcesProvider resourcesProvider;
    private TextureView textureView;
    private boolean textureViewActive;
    private boolean usesBackgroundPaint;
    private int videoHeight;
    private int videoWidth;

    public abstract boolean drawForBitmap();

    @Override
    protected float getBounceScale() {
        return 0.02f;
    }

    public MessageEntityView(final Context context, PointF pointF, float f, float f2, ArrayList arrayList, final BlurringShader.BlurManager blurManager, final boolean z, final PreviewView.TextureViewHolder textureViewHolder) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        super(context, pointF);
        this.messageObjects = new ArrayList();
        this.videoWidth = 1;
        this.videoHeight = 1;
        this.firstMeasure = true;
        this.isDark = Theme.isCurrentThemeDark();
        this.currentColors = new SparseIntArray();
        this.resourcesProvider = new Theme.ResourcesProvider() {
            public final Paint chat_actionBackgroundGradientDarkenPaint;
            public final Paint chat_actionBackgroundPaint;
            public final Paint chat_actionBackgroundSelectedPaint;
            public final TextPaint chat_actionTextPaint;
            public final TextPaint chat_actionTextPaint2;
            public final TextPaint chat_botButtonPaint;

            @Override
            public void applyServiceShaderMatrix(int i, int i2, float f3, float f4) {
                Theme.applyServiceShaderMatrix(i, i2, f3, f4);
            }

            @Override
            public ColorFilter getAnimatedEmojiColorFilter() {
                return Theme.chat_animatedEmojiTextColorFilter;
            }

            @Override
            public int getColorOrDefault(int i) {
                return getColor(i);
            }

            @Override
            public int getCurrentColor(int i) {
                return getColor(i);
            }

            @Override
            public boolean hasGradientService() {
                return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
            }

            @Override
            public void setAnimatedColor(int i, int i2) {
                Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i, i2);
            }

            {
                TextPaint textPaint = new TextPaint();
                this.chat_actionTextPaint = textPaint;
                TextPaint textPaint2 = new TextPaint();
                this.chat_actionTextPaint2 = textPaint2;
                TextPaint textPaint3 = new TextPaint();
                this.chat_botButtonPaint = textPaint3;
                this.chat_actionBackgroundPaint = new Paint(3);
                this.chat_actionBackgroundSelectedPaint = new Paint(3);
                Paint paint = new Paint(3);
                this.chat_actionBackgroundGradientDarkenPaint = paint;
                textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
                textPaint3.setTypeface(AndroidUtilities.bold());
                paint.setColor(352321536);
            }

            @Override
            public int getColor(int i) {
                return MessageEntityView.this.currentColors.get(i, Theme.getColor(i));
            }

            @Override
            public Paint getPaint(String str) {
                str.getClass();
                switch (str) {
                    case "paintChatActionText2":
                        return this.chat_actionTextPaint2;
                    case "paintChatBotButton":
                        return this.chat_botButtonPaint;
                    case "paintChatActionBackgroundDarken":
                        return this.chat_actionBackgroundGradientDarkenPaint;
                    case "paintChatActionBackgroundSelected":
                        return this.chat_actionBackgroundSelectedPaint;
                    case "paintChatActionText":
                        return this.chat_actionTextPaint;
                    default:
                        return Theme.getThemePaint(str);
                }
            }

            @Override
            public Drawable getDrawable(String str) {
                if (str.equals("drawableMsgIn")) {
                    if (MessageEntityView.this.msgInDrawable == null) {
                        MessageEntityView.this.msgInDrawable = new MessageDrawable(0, false, false, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgInDrawable;
                }
                if (str.equals("drawableMsgInSelected")) {
                    if (MessageEntityView.this.msgInDrawableSelected == null) {
                        MessageEntityView.this.msgInDrawableSelected = new MessageDrawable(0, false, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgInDrawableSelected;
                }
                if (str.equals("drawableMsgOut")) {
                    if (MessageEntityView.this.msgOutDrawable == null) {
                        MessageEntityView.this.msgOutDrawable = new MessageDrawable(0, true, false, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgOutDrawable;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    if (MessageEntityView.this.msgOutDrawableSelected == null) {
                        MessageEntityView.this.msgOutDrawableSelected = new MessageDrawable(0, true, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgOutDrawableSelected;
                }
                if (str.equals("drawableMsgInMedia")) {
                    if (MessageEntityView.this.msgMediaInDrawable == null) {
                        MessageEntityView.this.msgMediaInDrawable = new MessageDrawable(1, false, false, MessageEntityView.this.resourcesProvider);
                    }
                    MessageEntityView.this.msgMediaInDrawable.invalidateSelf();
                    return MessageEntityView.this.msgMediaInDrawable;
                }
                if (str.equals("drawableMsgInMediaSelected")) {
                    if (MessageEntityView.this.msgMediaInDrawableSelected == null) {
                        MessageEntityView.this.msgMediaInDrawableSelected = new MessageDrawable(1, false, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgMediaInDrawableSelected;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    if (MessageEntityView.this.msgMediaOutDrawable == null) {
                        MessageEntityView.this.msgMediaOutDrawable = new MessageDrawable(1, true, false, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgMediaOutDrawable;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    if (MessageEntityView.this.msgMediaOutDrawableSelected == null) {
                        MessageEntityView.this.msgMediaOutDrawableSelected = new MessageDrawable(1, true, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgMediaOutDrawableSelected;
                }
                return Theme.getThemeDrawable(str);
            }

            @Override
            public boolean isDark() {
                return MessageEntityView.this.isDark;
            }
        };
        this.blurManager = blurManager;
        setRotation(f);
        setScale(f2);
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            TLRPC.Message message = messageObject.messageOwner;
            int i2 = message.date;
            TLRPC.Message messageCopyMessage = copyMessage(message);
            Boolean boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
            if (boolUseForwardForRepost != null && boolUseForwardForRepost.booleanValue() && (messageFwdHeader = messageCopyMessage.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                messageCopyMessage.from_id = peer;
                messageCopyMessage.peer_id = peer;
                messageCopyMessage.flags &= -5;
                messageCopyMessage.fwd_from = null;
            }
            messageCopyMessage.voiceTranscriptionOpen = false;
            int i3 = messageObject.currentAccount;
            MessageObject messageObject2 = new MessageObject(i3, messageCopyMessage, messageObject.replyMessageObject, MessagesController.getInstance(i3).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z, false);
            messageObject2.setType();
            this.messageObjects.add(messageObject2);
        }
        this.groupedMessages = null;
        if (this.messageObjects.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.groupedMessages = groupedMessages;
            groupedMessages.messages.addAll(this.messageObjects);
            this.groupedMessages.groupId = ((MessageObject) this.messageObjects.get(0)).getGroupId();
            this.groupedMessages.calculate();
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            private final Matrix videoMatrix = new Matrix();
            private final float[] radii = new float[8];
            private final Path clipPath = new Path();

            @Override
            protected void onMeasure(int i4, int i5) {
                int left;
                int boundsRight;
                MessageEntityView.this.listView.measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
                if (MessageEntityView.this.textureView != null) {
                    MessageEntityView.this.textureView.measure(View.MeasureSpec.makeMeasureSpec(MessageEntityView.this.listView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MessageEntityView.this.listView.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth = MessageEntityView.this.listView.getMeasuredWidth();
                int iMax = 0;
                for (int i6 = 0; i6 < MessageEntityView.this.listView.getChildCount(); i6++) {
                    View childAt = MessageEntityView.this.listView.getChildAt(i6);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        left2 = childAt.getLeft() + chatMessageCell.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = chatMessageCell.getBoundsRight();
                    } else {
                        if (childAt instanceof ChatActionCell) {
                            ChatActionCell chatActionCell = (ChatActionCell) childAt;
                            left2 = childAt.getLeft() + chatActionCell.getBoundsLeft();
                            left = childAt.getLeft();
                            boundsRight = chatActionCell.getBoundsRight();
                        }
                        measuredWidth = Math.min(left2, measuredWidth);
                        iMax = Math.max(right, iMax);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    iMax = Math.max(right, iMax);
                }
                setMeasuredDimension(iMax - measuredWidth, MessageEntityView.this.listView.getMeasuredHeight());
            }

            @Override
            protected void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                int left;
                int boundsRight;
                int measuredWidth = MessageEntityView.this.listView.getMeasuredWidth();
                int iMax = 0;
                for (int i8 = 0; i8 < MessageEntityView.this.listView.getChildCount(); i8++) {
                    View childAt = MessageEntityView.this.listView.getChildAt(i8);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        left2 = childAt.getLeft() + chatMessageCell.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = chatMessageCell.getBoundsRight();
                    } else {
                        if (childAt instanceof ChatActionCell) {
                            ChatActionCell chatActionCell = (ChatActionCell) childAt;
                            left2 = childAt.getLeft() + chatActionCell.getBoundsLeft();
                            left = childAt.getLeft();
                            boundsRight = chatActionCell.getBoundsRight();
                        }
                        measuredWidth = Math.min(left2, measuredWidth);
                        iMax = Math.max(right, iMax);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    iMax = Math.max(right, iMax);
                }
                RecyclerListView recyclerListView = MessageEntityView.this.listView;
                recyclerListView.layout(-measuredWidth, 0, recyclerListView.getMeasuredWidth() - measuredWidth, MessageEntityView.this.listView.getMeasuredHeight());
                if (MessageEntityView.this.textureView != null) {
                    MessageEntityView.this.textureView.layout(0, 0, getMeasuredWidth(), MessageEntityView.this.listView.getMeasuredHeight());
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                ImageReceiver photoImage;
                if (view == MessageEntityView.this.textureView) {
                    ChatMessageCell cell = MessageEntityView.this.getCell();
                    if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                        return false;
                    }
                    this.videoMatrix.reset();
                    float fMax = Math.max(photoImage.getImageWidth() / MessageEntityView.this.videoWidth, photoImage.getImageHeight() / MessageEntityView.this.videoHeight);
                    this.videoMatrix.postScale((MessageEntityView.this.videoWidth / MessageEntityView.this.textureView.getWidth()) * fMax, (MessageEntityView.this.videoHeight / MessageEntityView.this.textureView.getHeight()) * fMax);
                    this.videoMatrix.postTranslate(((MessageEntityView.this.listView.getX() + cell.getX()) + photoImage.getCenterX()) - ((MessageEntityView.this.videoWidth * fMax) / 2.0f), ((MessageEntityView.this.listView.getY() + cell.getY()) + photoImage.getCenterY()) - ((MessageEntityView.this.videoHeight * fMax) / 2.0f));
                    MessageEntityView.this.textureView.setTransform(this.videoMatrix);
                    canvas.save();
                    this.clipPath.rewind();
                    AndroidUtilities.rectTmp.set(MessageEntityView.this.listView.getX() + cell.getX() + photoImage.getImageX(), MessageEntityView.this.listView.getY() + cell.getY() + photoImage.getImageY(), MessageEntityView.this.listView.getX() + cell.getX() + photoImage.getImageX2(), MessageEntityView.this.listView.getY() + cell.getY() + photoImage.getImageY2());
                    for (int i4 = 0; i4 < photoImage.getRoundRadius().length; i4++) {
                        int i5 = i4 * 2;
                        this.radii[i5] = photoImage.getRoundRadius()[i4];
                        this.radii[i5 + 1] = photoImage.getRoundRadius()[i4];
                    }
                    this.clipPath.addRoundRect(AndroidUtilities.rectTmp, this.radii, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.container = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider) {
            private final ArrayList drawTimeAfter = new ArrayList();
            private final ArrayList drawNamesAfter = new ArrayList();
            private final ArrayList drawCaptionAfter = new ArrayList();
            private final ArrayList drawReactionsAfter = new ArrayList();
            private final ArrayList drawingGroups = new ArrayList(10);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                this.selectorRect.setEmpty();
                drawChatBackgroundElements(canvas);
                super.dispatchDraw(canvas);
                drawChatForegroundElements(canvas);
                canvas.restore();
            }

            private void drawChatForegroundElements(Canvas canvas) {
                float f3;
                int size = this.drawTimeAfter.size();
                boolean z2 = false;
                if (size > 0) {
                    for (int i4 = 0; i4 < size; i4++) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) this.drawTimeAfter.get(i4);
                        canvas.save();
                        canvas.translate(chatMessageCell.getLeft() + chatMessageCell.getNonAnimationTranslationX(false), chatMessageCell.getY());
                        chatMessageCell.drawTime(canvas, chatMessageCell.shouldDrawAlphaLayer() ? chatMessageCell.getAlpha() : 1.0f, true);
                        canvas.restore();
                    }
                    this.drawTimeAfter.clear();
                }
                int size2 = this.drawNamesAfter.size();
                if (size2 > 0) {
                    for (int i5 = 0; i5 < size2; i5++) {
                        ChatMessageCell chatMessageCell2 = (ChatMessageCell) this.drawNamesAfter.get(i5);
                        float left = chatMessageCell2.getLeft() + chatMessageCell2.getNonAnimationTranslationX(false);
                        float y = chatMessageCell2.getY();
                        float alpha = chatMessageCell2.shouldDrawAlphaLayer() ? chatMessageCell2.getAlpha() : 1.0f;
                        canvas.save();
                        canvas.translate(left, y);
                        chatMessageCell2.setInvalidatesParent(true);
                        chatMessageCell2.drawNamesLayout(canvas, alpha);
                        chatMessageCell2.setInvalidatesParent(false);
                        canvas.restore();
                    }
                    this.drawNamesAfter.clear();
                }
                int size3 = this.drawCaptionAfter.size();
                if (size3 > 0) {
                    int i6 = 0;
                    while (i6 < size3) {
                        ChatMessageCell chatMessageCell3 = (ChatMessageCell) this.drawCaptionAfter.get(i6);
                        boolean z3 = chatMessageCell3.getCurrentPosition() != null && (chatMessageCell3.getCurrentPosition().flags & 1) == 0;
                        float alpha2 = chatMessageCell3.shouldDrawAlphaLayer() ? chatMessageCell3.getAlpha() : 1.0f;
                        float left2 = chatMessageCell3.getLeft() + chatMessageCell3.getNonAnimationTranslationX(z2);
                        float y2 = chatMessageCell3.getY();
                        canvas.save();
                        MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup();
                        if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float nonAnimationTranslationX = chatMessageCell3.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f4 = transitionParams.left + nonAnimationTranslationX + transitionParams.offsetLeft;
                            float translationY = transitionParams.top + transitionParams.offsetTop;
                            float f5 = transitionParams.right + nonAnimationTranslationX + transitionParams.offsetRight;
                            float translationY2 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                translationY += chatMessageCell3.getTranslationY();
                                translationY2 += chatMessageCell3.getTranslationY();
                            }
                            canvas.clipRect(f4 + AndroidUtilities.dp(8.0f), translationY + AndroidUtilities.dp(8.0f), f5 - AndroidUtilities.dp(8.0f), translationY2 - AndroidUtilities.dp(8.0f));
                        }
                        if (chatMessageCell3.getTransitionParams().wasDraw) {
                            canvas.translate(left2, y2);
                            chatMessageCell3.setInvalidatesParent(true);
                            chatMessageCell3.drawCaptionLayout(canvas, z3, alpha2);
                            chatMessageCell3.setInvalidatesParent(false);
                            canvas.restore();
                        }
                        i6++;
                        z2 = false;
                    }
                    f3 = 8.0f;
                    this.drawCaptionAfter.clear();
                } else {
                    f3 = 8.0f;
                }
                int size4 = this.drawReactionsAfter.size();
                if (size4 > 0) {
                    for (int i7 = 0; i7 < size4; i7++) {
                        ChatMessageCell chatMessageCell4 = (ChatMessageCell) this.drawReactionsAfter.get(i7);
                        if (chatMessageCell4.getCurrentPosition() == null || (chatMessageCell4.getCurrentPosition().flags & 1) != 0) {
                            float alpha3 = chatMessageCell4.shouldDrawAlphaLayer() ? chatMessageCell4.getAlpha() : 1.0f;
                            float left3 = chatMessageCell4.getLeft() + chatMessageCell4.getNonAnimationTranslationX(false);
                            float y3 = chatMessageCell4.getY();
                            canvas.save();
                            MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell4.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                                float nonAnimationTranslationX2 = chatMessageCell4.getNonAnimationTranslationX(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                                float f6 = transitionParams2.left + nonAnimationTranslationX2 + transitionParams2.offsetLeft;
                                float translationY3 = transitionParams2.top + transitionParams2.offsetTop;
                                float f7 = transitionParams2.right + nonAnimationTranslationX2 + transitionParams2.offsetRight;
                                float translationY4 = transitionParams2.bottom + transitionParams2.offsetBottom;
                                if (!transitionParams2.backgroundChangeBounds) {
                                    translationY3 += chatMessageCell4.getTranslationY();
                                    translationY4 += chatMessageCell4.getTranslationY();
                                }
                                canvas.clipRect(f6 + AndroidUtilities.dp(f3), translationY3 + AndroidUtilities.dp(f3), f7 - AndroidUtilities.dp(f3), translationY4 - AndroidUtilities.dp(f3));
                            }
                            if (chatMessageCell4.getTransitionParams().wasDraw) {
                                canvas.translate(left3, y3);
                                chatMessageCell4.setInvalidatesParent(true);
                                chatMessageCell4.drawReactionsLayout(canvas, alpha3, null);
                                chatMessageCell4.drawCommentLayout(canvas, alpha3);
                                chatMessageCell4.setInvalidatesParent(false);
                                canvas.restore();
                            }
                        }
                    }
                    this.drawReactionsAfter.clear();
                }
            }

            private void drawChatBackgroundElements(Canvas canvas) {
                float touchX;
                int i4;
                boolean z2;
                MessageObject.GroupedMessages currentMessagesGroup;
                int measuredHeight;
                Canvas canvas2 = canvas;
                int childCount = getChildCount();
                int i5 = 0;
                MessageObject.GroupedMessages groupedMessages2 = null;
                while (true) {
                    touchX = 0.0f;
                    i4 = 2;
                    z2 = true;
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() != 4) {
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages2) {
                                MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                                MessageBackgroundDrawable backgroundDrawable = chatMessageCell.getBackgroundDrawable();
                                if ((backgroundDrawable.isAnimationInProgress() || chatMessageCell.isDrawingSelectionBackground()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    int y = (int) chatMessageCell.getY();
                                    canvas2.save();
                                    if (currentPosition == null) {
                                        measuredHeight = chatMessageCell.getMeasuredHeight();
                                    } else {
                                        int measuredHeight2 = chatMessageCell.getMeasuredHeight() + y;
                                        long j = 0;
                                        float touchY = 0.0f;
                                        for (int i6 = 0; i6 < childCount; i6++) {
                                            View childAt2 = getChildAt(i6);
                                            if (childAt2 instanceof ChatMessageCell) {
                                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                                                if (chatMessageCell2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                    MessageBackgroundDrawable backgroundDrawable2 = chatMessageCell2.getBackgroundDrawable();
                                                    y = Math.min(y, (int) chatMessageCell2.getY());
                                                    measuredHeight2 = Math.max(measuredHeight2, ((int) chatMessageCell2.getY()) + chatMessageCell2.getMeasuredHeight());
                                                    long lastTouchTime = backgroundDrawable2.getLastTouchTime();
                                                    if (lastTouchTime > j) {
                                                        touchX = backgroundDrawable2.getTouchX() + chatMessageCell2.getX();
                                                        touchY = backgroundDrawable2.getTouchY() + chatMessageCell2.getY();
                                                        j = lastTouchTime;
                                                    }
                                                }
                                            }
                                        }
                                        backgroundDrawable.setTouchCoordsOverride(touchX, touchY - y);
                                        measuredHeight = measuredHeight2 - y;
                                    }
                                    int i7 = measuredHeight + y;
                                    canvas2.clipRect(0, y, getMeasuredWidth(), i7);
                                    backgroundDrawable.setCustomPaint(null);
                                    backgroundDrawable.setColor(getThemedColor(Theme.key_chat_selectedBackground));
                                    backgroundDrawable.setBounds(0, y, getMeasuredWidth(), i7);
                                    backgroundDrawable.draw(canvas2);
                                    canvas2.restore();
                                }
                                groupedMessages2 = currentMessagesGroup2;
                            }
                        } else if (childAt instanceof ChatActionCell) {
                            ChatActionCell chatActionCell = (ChatActionCell) childAt;
                            if (chatActionCell.hasGradientService()) {
                                canvas2.save();
                                canvas2.translate(chatActionCell.getX(), chatActionCell.getY() + chatActionCell.getPaddingTop());
                                canvas2.scale(chatActionCell.getScaleX(), chatActionCell.getScaleY(), chatActionCell.getMeasuredWidth() / 2.0f, chatActionCell.getMeasuredHeight() / 2.0f);
                                chatActionCell.drawBackground(canvas2, true);
                                chatActionCell.drawReactions(canvas2, true, null);
                                canvas2.restore();
                            }
                        }
                    }
                    i5++;
                }
                int i8 = 0;
                while (i8 < 3) {
                    this.drawingGroups.clear();
                    if (i8 != i4 || isFastScrollAnimationRunning()) {
                        int i9 = 0;
                        while (i9 < childCount) {
                            View childAt3 = getChildAt(i9);
                            if (childAt3 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt3;
                                if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= touchX && chatMessageCell3.getVisibility() != 4 && chatMessageCell3.getVisibility() != 8 && (currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup()) != null && ((i8 != 0 || currentMessagesGroup.messages.size() != z2) && ((i8 != z2 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i8 != 0 || !chatMessageCell3.getMessageObject().deleted) && ((i8 != z2 || chatMessageCell3.getMessageObject().deleted) && ((i8 != i4 || chatMessageCell3.willRemovedAfterAnimation()) && (i8 == i4 || !chatMessageCell3.willRemovedAfterAnimation()))))))) {
                                    if (!this.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = 0;
                                        transitionParams.top = 0;
                                        transitionParams.right = 0;
                                        transitionParams.bottom = 0;
                                        transitionParams.pinnedBotton = false;
                                        transitionParams.pinnedTop = false;
                                        transitionParams.cell = chatMessageCell3;
                                        this.drawingGroups.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell3.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell3.isPinnedBottom();
                                    int left = chatMessageCell3.getLeft() + chatMessageCell3.getBackgroundDrawableLeft();
                                    int left2 = chatMessageCell3.getLeft() + chatMessageCell3.getBackgroundDrawableRight();
                                    int top = chatMessageCell3.getTop() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getBackgroundDrawableTop();
                                    int top2 = chatMessageCell3.getTop() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getBackgroundDrawableBottom();
                                    if ((chatMessageCell3.getCurrentPosition().flags & 4) == 0) {
                                        top -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell3.getCurrentPosition().flags & 8) == 0) {
                                        top2 += AndroidUtilities.dp(10.0f);
                                    }
                                    int i10 = top2;
                                    if (chatMessageCell3.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell3;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i11 = transitionParams2.top;
                                    if (i11 == 0 || top < i11) {
                                        transitionParams2.top = top;
                                    }
                                    int i12 = transitionParams2.bottom;
                                    if (i12 == 0 || i10 > i12) {
                                        transitionParams2.bottom = i10;
                                    }
                                    int i13 = transitionParams2.left;
                                    if (i13 == 0 || left < i13) {
                                        transitionParams2.left = left;
                                    }
                                    int i14 = transitionParams2.right;
                                    if (i14 == 0 || left2 > i14) {
                                        transitionParams2.right = left2;
                                    }
                                }
                            }
                            i9++;
                            i4 = 2;
                        }
                        int i15 = 0;
                        while (i15 < this.drawingGroups.size()) {
                            MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) this.drawingGroups.get(i15);
                            float nonAnimationTranslationX = groupedMessages3.transitionParams.cell.getNonAnimationTranslationX(z2);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
                            float f3 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                            float translationY = transitionParams3.top + transitionParams3.offsetTop;
                            float f4 = transitionParams3.offsetRight + transitionParams3.right + nonAnimationTranslationX;
                            float translationY2 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (!transitionParams3.backgroundChangeBounds) {
                                translationY += transitionParams3.cell.getTranslationY();
                                translationY2 += groupedMessages3.transitionParams.cell.getTranslationY();
                            }
                            float f5 = translationY;
                            float f6 = translationY2;
                            boolean z3 = (groupedMessages3.transitionParams.cell.getScaleX() == 1.0f && groupedMessages3.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                            if (z3) {
                                canvas2.save();
                                canvas2.scale(groupedMessages3.transitionParams.cell.getScaleX(), groupedMessages3.transitionParams.cell.getScaleY(), f3 + ((f4 - f3) / 2.0f), f5 + ((f6 - f5) / 2.0f));
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages3.transitionParams;
                            int i16 = i15;
                            transitionParams4.cell.drawBackground(canvas2, (int) f3, (int) f5, (int) f4, (int) f6, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                            MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages3.transitionParams;
                            transitionParams5.cell = null;
                            transitionParams5.drawCaptionLayout = groupedMessages3.hasCaption;
                            if (z3) {
                                canvas.restore();
                                for (int i17 = 0; i17 < childCount; i17++) {
                                    View childAt4 = getChildAt(i17);
                                    if (childAt4 instanceof ChatMessageCell) {
                                        ChatMessageCell chatMessageCell4 = (ChatMessageCell) childAt4;
                                        if (chatMessageCell4.getCurrentMessagesGroup() == groupedMessages3) {
                                            int left3 = chatMessageCell4.getLeft();
                                            int top3 = chatMessageCell4.getTop();
                                            childAt4.setPivotX((f3 - left3) + ((f4 - f3) / 2.0f));
                                            childAt4.setPivotY((f5 - top3) + ((f6 - f5) / 2.0f));
                                        }
                                    }
                                }
                            }
                            i15 = i16 + 1;
                            canvas2 = canvas;
                            z2 = true;
                        }
                    }
                    i8++;
                    canvas2 = canvas;
                    i4 = 2;
                    z2 = true;
                    touchX = 0.0f;
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                ChatActionCell chatActionCell;
                float f3;
                float f4;
                int adapterPosition;
                int adapterPosition2;
                int i4;
                ChatMessageCell chatMessageCell = null;
                if (view instanceof ChatMessageCell) {
                    chatMessageCell = (ChatMessageCell) view;
                    chatActionCell = null;
                } else {
                    chatActionCell = view instanceof ChatActionCell ? (ChatActionCell) view : null;
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (chatMessageCell != null && chatMessageCell.hasOutboundsContent()) {
                    canvas.save();
                    canvas.translate(chatMessageCell.getX(), chatMessageCell.getY() + chatMessageCell.getPaddingTop());
                    chatMessageCell.drawOutboundsContent(canvas);
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
                if (chatMessageCell != null) {
                    chatMessageCell.drawCheckBox(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (chatMessageCell != null) {
                    chatMessageCell.getMessageObject();
                    MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                    if (currentPosition != null || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                        if (currentPosition == null || currentPosition.last || (currentPosition.minX == 0 && currentPosition.minY == 0)) {
                            if (currentPosition == null || currentPosition.last) {
                                this.drawTimeAfter.add(chatMessageCell);
                            }
                            if ((currentPosition == null || (currentPosition.minX == 0 && currentPosition.minY == 0)) && chatMessageCell.hasNameLayout()) {
                                this.drawNamesAfter.add(chatMessageCell);
                            }
                        }
                        if (currentPosition != null || chatMessageCell.getTransitionParams().transformGroupToSingleMessage || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                            if (currentPosition == null || (currentPosition.flags & chatMessageCell.captionFlag()) != 0) {
                                this.drawCaptionAfter.add(chatMessageCell);
                            }
                            if (currentPosition != null) {
                                int i5 = currentPosition.flags;
                                if ((i5 & 8) != 0 && (i5 & 1) != 0) {
                                    this.drawReactionsAfter.add(chatMessageCell);
                                }
                            } else {
                                this.drawReactionsAfter.add(chatMessageCell);
                            }
                        }
                    }
                    ImageReceiver avatarImage = chatMessageCell.getAvatarImage();
                    if (avatarImage == null) {
                        f3 = 0.0f;
                    } else {
                        boolean z2 = isFastScrollAnimationRunning() || (MessageEntityView.this.groupedMessages != null && MessageEntityView.this.groupedMessages.transitionParams.backgroundChangeBounds);
                        int top = z2 ? view.getTop() : (int) view.getY();
                        if (chatMessageCell.drawPinnedBottom() && (adapterPosition2 = MessageEntityView.this.listView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                            if (MessageEntityView.this.groupedMessages != null && currentPosition != null) {
                                int iIndexOf = MessageEntityView.this.groupedMessages.posArray.indexOf(currentPosition);
                                int size = MessageEntityView.this.groupedMessages.posArray.size();
                                if ((currentPosition.flags & 8) != 0) {
                                    i4 = (adapterPosition2 - size) + iIndexOf;
                                } else {
                                    i4 = adapterPosition2 - 1;
                                    int i6 = iIndexOf + 1;
                                    while (true) {
                                        if (i6 < size) {
                                            if (MessageEntityView.this.groupedMessages.posArray.get(i6).minY > currentPosition.maxY) {
                                                break;
                                            }
                                            i4--;
                                            i6++;
                                        }
                                    }
                                }
                                break;
                            } else {
                                i4 = adapterPosition2 - 1;
                            }
                            if (findViewHolderForAdapterPosition(i4) != null) {
                                if (view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                avatarImage.setVisible(false, false);
                                return zDrawChild;
                            }
                        }
                        float slidingOffsetX = chatMessageCell.getSlidingOffsetX() + chatMessageCell.getCheckBoxTranslation();
                        int top2 = (int) ((z2 ? view.getTop() : view.getY()) + chatMessageCell.getLayoutHeight() + chatMessageCell.getTransitionParams().deltaBottom);
                        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                        boolean z3 = chatMessageCell.isCheckBoxVisible() && slidingOffsetX == 0.0f;
                        if (chatMessageCell.isPlayingRound() || chatMessageCell.getTransitionParams().animatePlayingRound) {
                            if (chatMessageCell.getTransitionParams().animatePlayingRound) {
                                float f5 = chatMessageCell.getTransitionParams().animateChangeProgress;
                                if (!chatMessageCell.isPlayingRound()) {
                                    f5 = 1.0f - f5;
                                }
                                top2 = (int) ((top2 * f5) + (Math.min(top2, measuredHeight) * (1.0f - f5)));
                            }
                        } else if (top2 > measuredHeight) {
                            top2 = measuredHeight;
                        }
                        if (!z2 && view.getTranslationY() != 0.0f) {
                            canvas.restore();
                        }
                        if (chatMessageCell.drawPinnedTop() && (adapterPosition = getChildViewHolder(view).getAdapterPosition()) >= 0) {
                            int i7 = 0;
                            do {
                                if (i7 < 20) {
                                    i7++;
                                    if (MessageEntityView.this.groupedMessages == null || currentPosition == null) {
                                        f4 = 0.0f;
                                        adapterPosition++;
                                    } else {
                                        int iIndexOf2 = MessageEntityView.this.groupedMessages.posArray.indexOf(currentPosition);
                                        if (iIndexOf2 >= 0) {
                                            f4 = 0.0f;
                                            MessageEntityView.this.groupedMessages.posArray.size();
                                            if ((currentPosition.flags & 4) != 0) {
                                                adapterPosition = adapterPosition + iIndexOf2 + 1;
                                            } else {
                                                adapterPosition++;
                                                for (int i8 = iIndexOf2 - 1; i8 >= 0 && MessageEntityView.this.groupedMessages.posArray.get(i8).maxY >= currentPosition.minY; i8--) {
                                                    adapterPosition++;
                                                }
                                            }
                                        }
                                    }
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(adapterPosition);
                                    if (viewHolderFindViewHolderForAdapterPosition == null) {
                                        break;
                                    }
                                    top = viewHolderFindViewHolderForAdapterPosition.itemView.getTop();
                                    View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                    if (!(view2 instanceof ChatMessageCell)) {
                                        break;
                                    }
                                    chatMessageCell = (ChatMessageCell) view2;
                                    float slidingOffsetX2 = chatMessageCell.getSlidingOffsetX() + chatMessageCell.getCheckBoxTranslation();
                                    if (z3 && slidingOffsetX2 > f4) {
                                        slidingOffsetX = slidingOffsetX2;
                                    }
                                }
                                f4 = 0.0f;
                                break;
                            } while (chatMessageCell.drawPinnedTop());
                        }
                        f4 = 0.0f;
                        break;
                        if (top2 - AndroidUtilities.dp(42.0f) < top) {
                            top2 = top + AndroidUtilities.dp(42.0f);
                        }
                        if (!chatMessageCell.drawPinnedBottom()) {
                            int bottom = z2 ? chatMessageCell.getBottom() : (int) (chatMessageCell.getY() + chatMessageCell.getMeasuredHeight() + chatMessageCell.getTransitionParams().deltaBottom);
                            if (top2 > bottom) {
                                top2 = bottom;
                            }
                        }
                        canvas.save();
                        if (slidingOffsetX != f4) {
                            canvas.translate(slidingOffsetX, 0.0f);
                        }
                        if (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                            top2 = (int) (top2 - chatMessageCell.getTranslationY());
                        }
                        avatarImage.setImageY(top2 - AndroidUtilities.dp(40.0f));
                        if (chatMessageCell.shouldDrawAlphaLayer()) {
                            avatarImage.setAlpha(chatMessageCell.getAlpha());
                            canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getX() + chatMessageCell.getPivotX(), chatMessageCell.getY() + (chatMessageCell.getHeight() >> 1));
                        } else {
                            avatarImage.setAlpha(1.0f);
                        }
                        avatarImage.setVisible(true, false);
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (z2) {
                            f3 = 0.0f;
                        } else {
                            f3 = 0.0f;
                            if (view.getTranslationY() != 0.0f) {
                                canvas.save();
                            }
                        }
                    }
                } else {
                    f3 = 0.0f;
                }
                if (view.getTranslationY() != f3) {
                    canvas.restore();
                }
                return zDrawChild;
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
                if (i4 == 1) {
                    return new RecyclerListView.Holder(new ChatActionCell(context, false, MessageEntityView.this.resourcesProvider) {
                        public final BlurringShader.StoryBlurDrawer blurDrawer;
                        private final TextPaint textPaint;

                        {
                            this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 10);
                            TextPaint textPaint = new TextPaint(1);
                            this.textPaint = textPaint;
                            textPaint.setTypeface(AndroidUtilities.bold());
                            textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                            textPaint.setColor(-1);
                        }

                        @Override
                        protected Paint getThemedPaint(String str) {
                            if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
                                return this.textPaint;
                            }
                            if ("paintChatActionBackground".equals(str)) {
                                MessageEntityView.this.usesBackgroundPaint = true;
                                Paint paint = this.blurDrawer.adapt(MessageEntityView.this.isDark).getPaint(1.0f);
                                if (paint != null) {
                                    return paint;
                                }
                            }
                            return super.getThemedPaint(str);
                        }
                    });
                }
                ChatMessageCell chatMessageCell = new ChatMessageCell(context, UserConfig.selectedAccount, false, null, MessageEntityView.this.resourcesProvider) {
                    public BlurringShader.StoryBlurDrawer blurDrawer;
                    private final Paint clearPaint;
                    private final RectF dst;
                    private final Rect src;
                    private final float[] radii = new float[8];
                    private final Path clipPath = new Path();

                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        return false;
                    }

                    {
                        this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 10);
                        Paint paint = new Paint();
                        this.clearPaint = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        this.src = new Rect();
                        this.dst = new RectF();
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        Canvas canvas2;
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        PreviewView.TextureViewHolder textureViewHolder2 = textureViewHolder;
                        if ((textureViewHolder2 != null && textureViewHolder2.active && textureViewHolder2.textureViewActive) || MessageEntityView.this.clipVideoMessageForBitmap) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        super.onDraw(canvas2);
                        canvas2.restore();
                    }

                    @Override
                    public Paint getThemedPaint(String str) {
                        if ("paintChatActionBackground".equals(str)) {
                            MessageEntityView.this.usesBackgroundPaint = true;
                            Paint paint = this.blurDrawer.getPaint(1.0f);
                            if (paint != null) {
                                return paint;
                            }
                        }
                        return super.getThemedPaint(str);
                    }

                    @Override
                    protected boolean drawPhotoImage(Canvas canvas) {
                        PreviewView.TextureViewHolder textureViewHolder2;
                        ImageReceiver photoImage = getPhotoImage();
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        if (z && photoImage != null && (((textureViewHolder2 = textureViewHolder) != null && textureViewHolder2.active && textureViewHolder2.textureViewActive && MessageEntityView.this.textureViewActive) || MessageEntityView.this.clipVideoMessageForBitmap || (MessageEntityView.this.textureView != null && MessageEntityView.this.drawForBitmap()))) {
                            for (int i5 = 0; i5 < photoImage.getRoundRadius().length; i5++) {
                                int i6 = i5 * 2;
                                this.radii[i6] = photoImage.getRoundRadius()[i5];
                                this.radii[i6 + 1] = photoImage.getRoundRadius()[i5];
                            }
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
                            this.clipPath.rewind();
                            this.clipPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                            if (MessageEntityView.this.textureView != null && MessageEntityView.this.drawForBitmap()) {
                                Bitmap bitmap = MessageEntityView.this.textureView.getBitmap();
                                if (bitmap != null) {
                                    canvas.save();
                                    canvas.clipPath(this.clipPath);
                                    canvas.translate(-getX(), -getY());
                                    float fMax = Math.max(photoImage.getImageWidth() / MessageEntityView.this.videoWidth, photoImage.getImageHeight() / MessageEntityView.this.videoHeight);
                                    canvas.translate(photoImage.getCenterX() - ((MessageEntityView.this.videoWidth * fMax) / 2.0f), photoImage.getCenterY() - ((MessageEntityView.this.videoHeight * fMax) / 2.0f));
                                    canvas.scale((MessageEntityView.this.videoWidth / MessageEntityView.this.textureView.getWidth()) * fMax, (MessageEntityView.this.videoHeight / MessageEntityView.this.textureView.getHeight()) * fMax);
                                    this.src.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                    this.dst.set(0.0f, 0.0f, MessageEntityView.this.textureView.getWidth(), MessageEntityView.this.textureView.getHeight());
                                    canvas.drawBitmap(bitmap, this.src, this.dst, (Paint) null);
                                    canvas.restore();
                                } else {
                                    return super.drawPhotoImage(canvas);
                                }
                            } else {
                                canvas.drawPath(this.clipPath, this.clearPaint);
                            }
                            return true;
                        }
                        return super.drawPhotoImage(canvas);
                    }
                };
                chatMessageCell.isChat = true;
                return new RecyclerListView.Holder(chatMessageCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
                MessageObject.GroupedMessagePosition position;
                MessageObject messageObject3 = (MessageObject) MessageEntityView.this.messageObjects.get((MessageEntityView.this.messageObjects.size() - 1) - i4);
                View view = viewHolder.itemView;
                if (view instanceof ChatMessageCell) {
                    ((ChatMessageCell) view).setMessageObject(messageObject3, MessageEntityView.this.groupedMessages, MessageEntityView.this.groupedMessages != null, (MessageEntityView.this.groupedMessages == null || (position = MessageEntityView.this.groupedMessages.getPosition(messageObject3)) == null || position.minY == 0) ? false : true, false);
                } else if (view instanceof ChatActionCell) {
                    ((ChatActionCell) view).setMessageObject(messageObject3);
                }
            }

            @Override
            public int getItemViewType(int i4) {
                return ((MessageObject) MessageEntityView.this.messageObjects.get((MessageEntityView.this.messageObjects.size() - 1) - i4)).contentType;
            }

            @Override
            public int getItemCount() {
                return MessageEntityView.this.messageObjects.size();
            }
        });
        GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            public boolean shouldLayoutChildFromOpositeSide(View view) {
                if (view instanceof ChatMessageCell) {
                    return !((ChatMessageCell) view).getMessageObject().isOutOwner();
                }
                return false;
            }

            @Override
            protected boolean hasSiblingChild(int i4) {
                byte b;
                int size = (MessageEntityView.this.messageObjects.size() - 1) - i4;
                if (MessageEntityView.this.groupedMessages != null && size >= 0 && size < MessageEntityView.this.messageObjects.size()) {
                    MessageObject.GroupedMessagePosition position = MessageEntityView.this.groupedMessages.getPosition((MessageObject) MessageEntityView.this.messageObjects.get(size));
                    if (position != null && position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size2 = MessageEntityView.this.groupedMessages.posArray.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = MessageEntityView.this.groupedMessages.posArray.get(i5);
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
        };
        gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i4) {
                int size = (MessageEntityView.this.messageObjects.size() - 1) - i4;
                if (MessageEntityView.this.groupedMessages == null || size < 0 || size >= MessageEntityView.this.groupedMessages.messages.size()) {
                    return 1000;
                }
                MessageObject.GroupedMessagePosition position = MessageEntityView.this.groupedMessages.getPosition(MessageEntityView.this.groupedMessages.messages.get(size));
                if (position != null) {
                    return position.spanSize;
                }
                return 1000;
            }
        });
        recyclerListView.setLayoutManager(gridLayoutManagerFixed);
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
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
                int i4 = 0;
                while (true) {
                    float[] fArr = currentPosition.siblingHeights;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    extraInsetHeight += (int) Math.ceil(fArr[i4] * fMax);
                    i4++;
                }
                int iRound = extraInsetHeight + ((currentPosition.maxY - currentPosition.minY) * Math.round(AndroidUtilities.density * 7.0f));
                int size = currentMessagesGroup.posArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i5);
                    byte b = groupedMessagePosition.minY;
                    byte b2 = currentPosition.minY;
                    if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                        iRound -= ((int) Math.ceil(fMax * groupedMessagePosition.ph)) - AndroidUtilities.dp(4.0f);
                        break;
                    }
                }
                rect.bottom = -iRound;
            }
        });
        frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        if (textureViewHolder != null && textureViewHolder.active) {
            textureViewHolder.takeTextureView(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    MessageEntityView.$r8$lambda$WJ6ZUblGCnsBkpSBJKCfxHxBqvg(this.f$0, (TextureView) obj);
                }
            }, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    MessageEntityView.m2514$r8$lambda$f1ac0PpokJUyMxQsIQ_HjZDFT0(this.f$0, (Integer) obj, (Integer) obj2);
                }
            });
        }
        updatePosition();
    }

    public static void $r8$lambda$WJ6ZUblGCnsBkpSBJKCfxHxBqvg(MessageEntityView messageEntityView, TextureView textureView) {
        messageEntityView.textureView = textureView;
        if (textureView != null) {
            messageEntityView.container.addView(textureView, 0);
        }
    }

    public static void m2514$r8$lambda$f1ac0PpokJUyMxQsIQ_HjZDFT0(final MessageEntityView messageEntityView, Integer num, Integer num2) {
        messageEntityView.getClass();
        messageEntityView.videoWidth = num.intValue();
        messageEntityView.videoHeight = num2.intValue();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageEntityView.$r8$lambda$c7MUwsOexxPq3GCXt0Yp6OjZydk(this.f$0);
            }
        }, 60L);
    }

    public static void $r8$lambda$c7MUwsOexxPq3GCXt0Yp6OjZydk(MessageEntityView messageEntityView) {
        messageEntityView.textureViewActive = true;
        messageEntityView.invalidateAll();
    }

    public ChatMessageCell getCell() {
        if (this.listView == null) {
            return null;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof ChatMessageCell) {
                return (ChatMessageCell) this.listView.getChildAt(i);
            }
        }
        return null;
    }

    public float getBubbleBounds(RectF rectF) {
        float y;
        float x;
        float x2;
        float y2;
        float fMin = 2.1474836E9f;
        float fMin2 = 2.1474836E9f;
        float fMax = -2.1474836E9f;
        float fMax2 = -2.1474836E9f;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject() != null && chatMessageCell.getMessageObject().isRoundVideo() && chatMessageCell.getPhotoImage() != null) {
                    x = this.container.getX() + chatMessageCell.getX() + chatMessageCell.getPhotoImage().getImageX();
                    x2 = this.container.getX() + chatMessageCell.getX() + chatMessageCell.getPhotoImage().getImageX2();
                    y2 = this.container.getY() + chatMessageCell.getY() + chatMessageCell.getPhotoImage().getImageY();
                    y = this.container.getY() + chatMessageCell.getY() + chatMessageCell.getPhotoImage().getImageY2();
                } else {
                    float x3 = this.container.getX() + childAt.getX() + chatMessageCell.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                    if (this.groupedMessages == null) {
                        x3 += AndroidUtilities.dp(8.0f);
                    }
                    float x4 = ((this.container.getX() + childAt.getX()) + chatMessageCell.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                    float y3 = this.container.getY() + childAt.getY() + chatMessageCell.getBackgroundDrawableTop() + AndroidUtilities.dp(2.0f);
                    y = ((this.container.getY() + childAt.getY()) + chatMessageCell.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                    x = x3;
                    x2 = x4;
                    y2 = y3;
                }
                fMin = Math.min(Math.min(fMin, x), x2);
                fMax = Math.max(Math.max(fMax, x), x2);
                fMin2 = Math.min(Math.min(fMin2, y2), y);
                fMax2 = Math.max(Math.max(fMax2, y2), y);
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                if (chatActionCell.starGiftLayout.has()) {
                    float x5 = this.container.getX() + chatActionCell.getX() + chatActionCell.getBoundsLeft();
                    float x6 = this.container.getX() + chatActionCell.getX() + chatActionCell.getBoundsRight();
                    float y4 = this.container.getY() + chatActionCell.getY();
                    float y5 = this.container.getY() + chatActionCell.getY() + chatActionCell.getMeasuredHeight();
                    fMin = Math.min(Math.min(fMin, x5), x6);
                    fMax = Math.max(Math.max(fMax, x5), x6);
                    fMin2 = Math.min(Math.min(fMin2, y4), y5);
                    fMax2 = Math.max(Math.max(fMax2, y4), y5);
                }
            }
        }
        rectF.set(fMin, fMin2, fMax, fMax2);
        return AndroidUtilities.dp(SharedConfig.bubbleRadius);
    }

    public void invalidateAll() {
        this.listView.invalidate();
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            this.listView.getChildAt(i).invalidate();
        }
    }

    public void prepareToDraw(boolean z) {
        this.clipVideoMessageForBitmap = z;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ((ChatMessageCell) childAt).drawingToBitmap = z;
            }
        }
    }

    @Override
    public void updatePosition() {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        setX(getPositionX() - measuredWidth);
        setY(getPositionY() - measuredHeight);
        updateSelectionView();
        if (this.usesBackgroundPaint) {
            invalidateAll();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        boolean z;
        this.container.measure(i, i2);
        setMeasuredDimension(this.container.getMeasuredWidth(), this.container.getMeasuredHeight());
        updatePosition();
        if (this.firstMeasure) {
            ArrayList arrayList = this.messageObjects;
            if (arrayList != null) {
                z = arrayList.size() == 1 && ((MessageObject) this.messageObjects.get(0)).contentType == 1;
            }
            float fMin = Math.min((View.MeasureSpec.getSize(i) - AndroidUtilities.dp(z ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(z ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (fMin < 1.0f) {
                setScale(fMin);
            }
            PointF position = getPosition();
            if (!z) {
                position.x -= AndroidUtilities.dp(19.0f) * Math.min(1.0f, fMin);
            }
            setPosition(position);
            this.firstMeasure = false;
        }
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        return new RectOld(((getPositionX() * scaleX) - (((getMeasuredWidth() * getScale()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getMeasuredHeight() * getScale()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getMeasuredWidth() * getScale() * scaleX) + AndroidUtilities.dp(71.0f), (getMeasuredHeight() * getScale() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    protected EntityView.SelectionView createSelectionView() {
        return new MessageEntityViewSelectionView(getContext());
    }

    public class MessageEntityViewSelectionView extends EntityView.SelectionView {
        private final Paint clearPaint;
        private Path path;

        public MessageEntityViewSelectionView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float fDp = AndroidUtilities.dp(1.0f);
            float fDp2 = AndroidUtilities.dp(19.5f);
            float f3 = fDp + fDp2;
            float f4 = f3 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f4;
            float measuredHeight = getMeasuredHeight() - f4;
            float f5 = (measuredHeight / 2.0f) + f3;
            if (f > f3 - fDp2 && f2 > f5 - fDp2 && f < f3 + fDp2 && f2 < f5 + fDp2) {
                return 1;
            }
            float f6 = f3 + measuredWidth;
            if (f <= f6 - fDp2 || f2 <= f5 - fDp2 || f >= f6 + fDp2 || f2 >= f5 + fDp2) {
                return (f <= f3 || f >= measuredWidth || f2 <= f3 || f2 >= measuredHeight) ? 0 : 3;
            }
            return 2;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            super.onDraw(canvas);
            int saveCount = canvas.getSaveCount();
            float showAlpha = getShowAlpha();
            if (showAlpha <= 0.0f) {
                return;
            }
            if (showAlpha < 1.0f) {
                int i = (int) (showAlpha * 255.0f);
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i, 31);
            } else {
                canvas2 = canvas;
            }
            float fDp = AndroidUtilities.dp(2.0f);
            float fDpf2 = AndroidUtilities.dpf2(5.66f);
            float fDp2 = fDp + fDpf2 + AndroidUtilities.dp(15.0f);
            float f = fDp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = fDp2 + measuredWidth;
            float f3 = fDp2 + measuredHeight;
            rectF.set(fDp2, fDp2, f2, f3);
            float fDp3 = AndroidUtilities.dp(12.0f);
            float fMin = Math.min(fDp3, measuredWidth / 2.0f);
            float f4 = measuredHeight / 2.0f;
            float fMin2 = Math.min(fDp3, f4);
            this.path.rewind();
            float f5 = fMin * 2.0f;
            float f6 = fDp2 + f5;
            float f7 = 2.0f * fMin2;
            float f8 = fDp2 + f7;
            rectF.set(fDp2, fDp2, f6, f8);
            this.path.arcTo(rectF, 180.0f, 90.0f);
            float f9 = f2 - f5;
            rectF.set(f9, fDp2, f2, f8);
            this.path.arcTo(rectF, 270.0f, 90.0f);
            canvas2.drawPath(this.path, this.paint);
            this.path.rewind();
            float f10 = f3 - f7;
            rectF.set(fDp2, f10, f6, f3);
            this.path.arcTo(rectF, 180.0f, -90.0f);
            rectF.set(f9, f10, f2, f3);
            this.path.arcTo(rectF, 90.0f, -90.0f);
            canvas2.drawPath(this.path, this.paint);
            float f11 = fDp2 + f4;
            canvas2.drawCircle(fDp2, f11, fDpf2, this.dotStrokePaint);
            canvas2.drawCircle(fDp2, f11, (fDpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas2.drawCircle(f2, f11, fDpf2, this.dotStrokePaint);
            canvas2.drawCircle(f2, f11, (fDpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            float f12 = fDp2 + fMin2;
            float f13 = f3 - fMin2;
            canvas.drawLine(fDp2, f12, fDp2, f13, this.paint);
            canvas.drawLine(f2, f12, f2, f13, this.paint);
            canvas.drawCircle(f2, f11, (AndroidUtilities.dp(1.0f) + fDpf2) - 1.0f, this.clearPaint);
            canvas.drawCircle(fDp2, f11, (fDpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, this.clearPaint);
            canvas.restoreToCount(saveCount);
        }
    }

    public void setupTheme(StoryEntry storyEntry) {
        boolean z;
        Theme.ThemeInfo theme;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] defaultColors;
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
        if (Theme.getTheme(string) == null || Theme.getTheme(string).isDark()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (Theme.getTheme(string2) == null || !Theme.getTheme(string2).isDark()) {
            string2 = "Dark Blue";
        }
        Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
        if (string.equals(string2)) {
            if (activeTheme.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            z = storyEntry.isDark;
            this.isDark = z;
            if (z) {
                theme = Theme.getTheme(str3);
            } else {
                theme = Theme.getTheme(str2);
            }
            strArr = new String[1];
            str = theme.assetName;
            if (str != null) {
                themeFileValues = Theme.getThemeFileValues(null, str, strArr);
            } else {
                themeFileValues = Theme.getThemeFileValues(new File(theme.pathToFile), null, strArr);
            }
            this.currentColors.clear();
            defaultColors = Theme.getDefaultColors();
            if (defaultColors != null) {
                for (i2 = 0; i2 < defaultColors.length; i2++) {
                    this.currentColors.put(i2, defaultColors[i2]);
                }
            }
            if (themeFileValues != null) {
                for (i = 0; i < themeFileValues.size(); i++) {
                    this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
                }
                accent = theme.getAccent(false);
                if (accent != null) {
                    accent.fillAccentColors(themeFileValues, this.currentColors);
                }
            }
            invalidateAll();
        }
        str3 = string2;
        str2 = string;
        z = storyEntry.isDark;
        this.isDark = z;
        if (z) {
            theme = Theme.getTheme(str3);
        } else {
            theme = Theme.getTheme(str2);
        }
        strArr = new String[1];
        str = theme.assetName;
        if (str != null) {
            themeFileValues = Theme.getThemeFileValues(null, str, strArr);
        } else {
            themeFileValues = Theme.getThemeFileValues(new File(theme.pathToFile), null, strArr);
        }
        this.currentColors.clear();
        defaultColors = Theme.getDefaultColors();
        if (defaultColors != null) {
            while (i2 < defaultColors.length) {
                this.currentColors.put(i2, defaultColors[i2]);
            }
        }
        if (themeFileValues != null) {
            while (i < themeFileValues.size()) {
                this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
            }
            accent = theme.getAccent(false);
            if (accent != null) {
                accent.fillAccentColors(themeFileValues, this.currentColors);
            }
        }
        invalidateAll();
    }

    public TLRPC.Message copyMessage(TLRPC.Message message) {
        TLRPC.Message tL_messageService;
        if (message instanceof TLRPC.TL_message) {
            tL_messageService = new TLRPC.TL_message();
        } else {
            if (!(message instanceof TLRPC.TL_messageService)) {
                return message;
            }
            tL_messageService = new TLRPC.TL_messageService();
        }
        tL_messageService.id = message.id;
        tL_messageService.from_id = message.from_id;
        tL_messageService.peer_id = message.peer_id;
        tL_messageService.date = message.date;
        tL_messageService.expire_date = message.expire_date;
        tL_messageService.action = message.action;
        tL_messageService.message = message.message;
        tL_messageService.media = message.media;
        tL_messageService.flags = message.flags;
        tL_messageService.mentioned = message.mentioned;
        tL_messageService.media_unread = message.media_unread;
        tL_messageService.out = message.out;
        tL_messageService.unread = message.unread;
        tL_messageService.entities = message.entities;
        tL_messageService.via_bot_name = message.via_bot_name;
        tL_messageService.reply_markup = message.reply_markup;
        tL_messageService.views = message.views;
        tL_messageService.forwards = message.forwards;
        tL_messageService.replies = message.replies;
        tL_messageService.edit_date = message.edit_date;
        tL_messageService.silent = message.silent;
        tL_messageService.post = message.post;
        tL_messageService.from_scheduled = message.from_scheduled;
        tL_messageService.legacy = message.legacy;
        tL_messageService.edit_hide = message.edit_hide;
        tL_messageService.pinned = message.pinned;
        tL_messageService.fwd_from = message.fwd_from;
        tL_messageService.via_bot_id = message.via_bot_id;
        tL_messageService.reply_to = message.reply_to;
        tL_messageService.post_author = message.post_author;
        tL_messageService.grouped_id = message.grouped_id;
        tL_messageService.reactions = message.reactions;
        tL_messageService.restriction_reason = message.restriction_reason;
        tL_messageService.ttl_period = message.ttl_period;
        tL_messageService.noforwards = message.noforwards;
        tL_messageService.invert_media = message.invert_media;
        tL_messageService.send_state = message.send_state;
        tL_messageService.fwd_msg_id = message.fwd_msg_id;
        tL_messageService.attachPath = message.attachPath;
        tL_messageService.params = message.params;
        tL_messageService.random_id = message.random_id;
        tL_messageService.local_id = message.local_id;
        tL_messageService.dialog_id = message.dialog_id;
        tL_messageService.ttl = message.ttl;
        tL_messageService.destroyTime = message.destroyTime;
        tL_messageService.destroyTimeMillis = message.destroyTimeMillis;
        tL_messageService.layer = message.layer;
        tL_messageService.seq_in = message.seq_in;
        tL_messageService.seq_out = message.seq_out;
        tL_messageService.with_my_score = message.with_my_score;
        tL_messageService.replyMessage = message.replyMessage;
        tL_messageService.reqId = message.reqId;
        tL_messageService.realId = message.realId;
        tL_messageService.stickerVerified = message.stickerVerified;
        tL_messageService.isThreadMessage = message.isThreadMessage;
        tL_messageService.voiceTranscription = message.voiceTranscription;
        tL_messageService.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_messageService.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_messageService.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_messageService.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_messageService.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_messageService.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_messageService.originalLanguage = message.originalLanguage;
        tL_messageService.translatedToLanguage = message.translatedToLanguage;
        tL_messageService.translatedText = message.translatedText;
        tL_messageService.replyStory = message.replyStory;
        return tL_messageService;
    }
}

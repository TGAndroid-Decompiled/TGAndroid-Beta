package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class MessageEntityView extends EntityView {
    private boolean clipVideoMessageForBitmap;
    public final FrameLayout container;
    private final SparseIntArray currentColors;
    private final ChatActionCell dateCell;
    public boolean firstMeasure;
    private MessageObject.GroupedMessages groupedMessages;
    private boolean isDark;
    public final RecyclerListView listView;
    public final ArrayList<MessageObject> messageObjects;
    private Theme.MessageDrawable msgInDrawable;
    private Theme.MessageDrawable msgInDrawableSelected;
    private Theme.MessageDrawable msgMediaInDrawable;
    private Theme.MessageDrawable msgMediaInDrawableSelected;
    private Theme.MessageDrawable msgMediaOutDrawable;
    private Theme.MessageDrawable msgMediaOutDrawableSelected;
    private Theme.MessageDrawable msgOutDrawable;
    private Theme.MessageDrawable msgOutDrawableSelected;
    public final Theme.ResourcesProvider resourcesProvider;
    private TextureView textureView;
    private boolean textureViewActive;
    private boolean usesBackgroundPaint;
    private int videoHeight;
    private int videoWidth;

    public boolean drawForBitmap() {
        return false;
    }

    @Override
    protected float getBounceScale() {
        return 0.02f;
    }

    public MessageEntityView(final Context context, Point point, float f, float f2, ArrayList<MessageObject> arrayList, final BlurringShader.BlurManager blurManager, final boolean z, final PreviewView.TextureViewHolder textureViewHolder) {
        super(context, point);
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Peer tLRPC$Peer;
        this.messageObjects = new ArrayList<>();
        this.videoWidth = 1;
        this.videoHeight = 1;
        this.firstMeasure = true;
        this.isDark = Theme.isCurrentThemeDark();
        this.currentColors = new SparseIntArray();
        this.resourcesProvider = new Theme.ResourcesProvider() {
            public final Paint chat_actionBackgroundGradientDarkenPaint;
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
                ColorFilter colorFilter;
                colorFilter = Theme.chat_animatedEmojiTextColorFilter;
                return colorFilter;
            }

            @Override
            public int getColorOrDefault(int i) {
                int color;
                color = getColor(i);
                return color;
            }

            @Override
            public int getCurrentColor(int i) {
                int color;
                color = getColor(i);
                return color;
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
                new Paint(3);
                this.chat_actionBackgroundSelectedPaint = new Paint(3);
                Paint paint = new Paint(3);
                this.chat_actionBackgroundGradientDarkenPaint = paint;
                textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
                textPaint3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                paint.setColor(352321536);
            }

            @Override
            public int getColor(int i) {
                return MessageEntityView.this.currentColors.get(i, Theme.getColor(i));
            }

            @Override
            public Paint getPaint(String str) {
                Paint themePaint;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1490966183:
                        if (str.equals("paintChatActionText2")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1712385955:
                        if (str.equals("paintChatBotButton")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1790254137:
                        if (str.equals("paintChatActionBackgroundDarken")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1897339317:
                        if (str.equals("paintChatActionBackgroundSelected")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2030114297:
                        if (str.equals("paintChatActionText")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return this.chat_actionTextPaint2;
                    case 1:
                        return this.chat_botButtonPaint;
                    case 2:
                        return this.chat_actionBackgroundGradientDarkenPaint;
                    case 3:
                        return this.chat_actionBackgroundSelectedPaint;
                    case 4:
                        return this.chat_actionTextPaint;
                    default:
                        themePaint = Theme.getThemePaint(str);
                        return themePaint;
                }
            }

            @Override
            public Drawable getDrawable(String str) {
                if (str.equals("drawableMsgIn")) {
                    if (MessageEntityView.this.msgInDrawable == null) {
                        MessageEntityView.this.msgInDrawable = new Theme.MessageDrawable(0, false, false, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgInDrawable;
                } else if (str.equals("drawableMsgInSelected")) {
                    if (MessageEntityView.this.msgInDrawableSelected == null) {
                        MessageEntityView.this.msgInDrawableSelected = new Theme.MessageDrawable(0, false, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgInDrawableSelected;
                } else if (str.equals("drawableMsgOut")) {
                    if (MessageEntityView.this.msgOutDrawable == null) {
                        MessageEntityView.this.msgOutDrawable = new Theme.MessageDrawable(0, true, false, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgOutDrawable;
                } else if (str.equals("drawableMsgOutSelected")) {
                    if (MessageEntityView.this.msgOutDrawableSelected == null) {
                        MessageEntityView.this.msgOutDrawableSelected = new Theme.MessageDrawable(0, true, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgOutDrawableSelected;
                } else if (str.equals("drawableMsgInMedia")) {
                    if (MessageEntityView.this.msgMediaInDrawable == null) {
                        MessageEntityView.this.msgMediaInDrawable = new Theme.MessageDrawable(1, false, false, MessageEntityView.this.resourcesProvider);
                    }
                    MessageEntityView.this.msgMediaInDrawable.invalidateSelf();
                    return MessageEntityView.this.msgMediaInDrawable;
                } else if (str.equals("drawableMsgInMediaSelected")) {
                    if (MessageEntityView.this.msgMediaInDrawableSelected == null) {
                        MessageEntityView.this.msgMediaInDrawableSelected = new Theme.MessageDrawable(1, false, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgMediaInDrawableSelected;
                } else if (str.equals("drawableMsgOutMedia")) {
                    if (MessageEntityView.this.msgMediaOutDrawable == null) {
                        MessageEntityView.this.msgMediaOutDrawable = new Theme.MessageDrawable(1, true, false, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgMediaOutDrawable;
                } else if (str.equals("drawableMsgOutMediaSelected")) {
                    if (MessageEntityView.this.msgMediaOutDrawableSelected == null) {
                        MessageEntityView.this.msgMediaOutDrawableSelected = new Theme.MessageDrawable(1, true, true, MessageEntityView.this.resourcesProvider);
                    }
                    return MessageEntityView.this.msgMediaOutDrawableSelected;
                } else {
                    return Theme.getThemeDrawable(str);
                }
            }

            @Override
            public boolean isDark() {
                return MessageEntityView.this.isDark;
            }
        };
        setRotation(f);
        setScale(f2);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject messageObject = arrayList.get(i2);
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            i = tLRPC$Message.date;
            TLRPC$TL_message copyMessage = copyMessage(tLRPC$Message);
            Boolean useForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
            if (useForwardForRepost != null && useForwardForRepost.booleanValue() && (tLRPC$MessageFwdHeader = copyMessage.fwd_from) != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null) {
                copyMessage.from_id = tLRPC$Peer;
                copyMessage.peer_id = tLRPC$Peer;
                copyMessage.flags &= -5;
                copyMessage.fwd_from = null;
            }
            copyMessage.voiceTranscriptionOpen = false;
            int i3 = messageObject.currentAccount;
            this.messageObjects.add(new MessageObject(i3, copyMessage, messageObject.replyMessageObject, MessagesController.getInstance(i3).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z));
        }
        ChatActionCell chatActionCell = new ChatActionCell(context, false, this.resourcesProvider, blurManager) {
            public final BlurringShader.StoryBlurDrawer blurDrawer;
            private final TextPaint textPaint;
            final BlurringShader.BlurManager val$blurManager;

            {
                this.val$blurManager = blurManager;
                this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 10);
                TextPaint textPaint = new TextPaint(1);
                this.textPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                textPaint.setColor(-1);
            }

            @Override
            public Paint getThemedPaint(String str) {
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
        };
        this.dateCell = chatActionCell;
        chatActionCell.setTranslationX(AndroidUtilities.dp(26.0f));
        chatActionCell.setCustomDate(i, false, false);
        addView(chatActionCell, LayoutHelper.createFrame(-1, -2.0f));
        this.groupedMessages = null;
        if (this.messageObjects.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.groupedMessages = groupedMessages;
            groupedMessages.messages.addAll(this.messageObjects);
            this.groupedMessages.groupId = this.messageObjects.get(0).getGroupId();
            this.groupedMessages.calculate();
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            private final Matrix videoMatrix = new Matrix();
            private final float[] radii = new float[8];
            private final Path clipPath = new Path();

            @Override
            protected void onMeasure(int i4, int i5) {
                MessageEntityView.this.listView.measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
                if (MessageEntityView.this.textureView != null) {
                    MessageEntityView.this.textureView.measure(View.MeasureSpec.makeMeasureSpec(MessageEntityView.this.listView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MessageEntityView.this.listView.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth = MessageEntityView.this.listView.getMeasuredWidth();
                int i6 = 0;
                for (int i7 = 0; i7 < MessageEntityView.this.listView.getChildCount(); i7++) {
                    View childAt = MessageEntityView.this.listView.getChildAt(i7);
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        left = childAt.getLeft() + chatMessageCell.getBoundsLeft();
                        right = chatMessageCell.getBoundsRight() + childAt.getLeft();
                    }
                    measuredWidth = Math.min(left, measuredWidth);
                    i6 = Math.max(right, i6);
                }
                setMeasuredDimension(i6 - measuredWidth, MessageEntityView.this.listView.getMeasuredHeight());
            }

            @Override
            protected void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                int measuredWidth = MessageEntityView.this.listView.getMeasuredWidth();
                int i8 = 0;
                for (int i9 = 0; i9 < MessageEntityView.this.listView.getChildCount(); i9++) {
                    View childAt = MessageEntityView.this.listView.getChildAt(i9);
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        left = childAt.getLeft() + chatMessageCell.getBoundsLeft();
                        right = chatMessageCell.getBoundsRight() + childAt.getLeft();
                    }
                    measuredWidth = Math.min(left, measuredWidth);
                    i8 = Math.max(right, i8);
                }
                RecyclerListView recyclerListView = MessageEntityView.this.listView;
                int i10 = -measuredWidth;
                recyclerListView.layout(i10, 0, recyclerListView.getMeasuredWidth() - measuredWidth, MessageEntityView.this.listView.getMeasuredHeight());
                if (MessageEntityView.this.textureView != null) {
                    MessageEntityView.this.textureView.layout(i10, 0, MessageEntityView.this.listView.getMeasuredWidth() - measuredWidth, MessageEntityView.this.listView.getMeasuredHeight());
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
                    float max = Math.max(photoImage.getImageWidth() / MessageEntityView.this.videoWidth, photoImage.getImageHeight() / MessageEntityView.this.videoHeight);
                    this.videoMatrix.postScale((MessageEntityView.this.videoWidth / MessageEntityView.this.textureView.getWidth()) * max, (MessageEntityView.this.videoHeight / MessageEntityView.this.textureView.getHeight()) * max);
                    this.videoMatrix.postTranslate((cell.getX() + photoImage.getCenterX()) - ((MessageEntityView.this.videoWidth * max) / 2.0f), (cell.getY() + photoImage.getCenterY()) - ((MessageEntityView.this.videoHeight * max) / 2.0f));
                    MessageEntityView.this.textureView.setTransform(this.videoMatrix);
                    canvas.save();
                    this.clipPath.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
                    for (int i4 = 0; i4 < photoImage.getRoundRadius().length; i4++) {
                        int i5 = i4 * 2;
                        this.radii[i5] = photoImage.getRoundRadius()[i4];
                        this.radii[i5 + 1] = photoImage.getRoundRadius()[i4];
                    }
                    this.clipPath.addRoundRect(AndroidUtilities.rectTmp, this.radii, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.container = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider) {
            private final ArrayList<ChatMessageCell> drawTimeAfter = new ArrayList<>();
            private final ArrayList<ChatMessageCell> drawNamesAfter = new ArrayList<>();
            private final ArrayList<ChatMessageCell> drawCaptionAfter = new ArrayList<>();
            private final ArrayList<MessageObject.GroupedMessages> drawingGroups = new ArrayList<>(10);

            @Override
            public void dispatchDraw(Canvas canvas) {
                canvas.save();
                this.selectorRect.setEmpty();
                drawChatBackgroundElements(canvas);
                super.dispatchDraw(canvas);
                drawChatForegroundElements(canvas);
                canvas.restore();
            }

            private void drawChatForegroundElements(Canvas canvas) {
                int size = this.drawTimeAfter.size();
                boolean z2 = false;
                if (size > 0) {
                    for (int i4 = 0; i4 < size; i4++) {
                        ChatMessageCell chatMessageCell = this.drawTimeAfter.get(i4);
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
                        ChatMessageCell chatMessageCell2 = this.drawNamesAfter.get(i5);
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
                        ChatMessageCell chatMessageCell3 = this.drawCaptionAfter.get(i6);
                        boolean z3 = chatMessageCell3.getCurrentPosition() != null && (chatMessageCell3.getCurrentPosition().flags & 1) == 0;
                        float alpha2 = chatMessageCell3.shouldDrawAlphaLayer() ? chatMessageCell3.getAlpha() : 1.0f;
                        float left2 = chatMessageCell3.getLeft() + chatMessageCell3.getNonAnimationTranslationX(z2);
                        float y2 = chatMessageCell3.getY();
                        canvas.save();
                        MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup();
                        if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float nonAnimationTranslationX = chatMessageCell3.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f3 = transitionParams.left + nonAnimationTranslationX + transitionParams.offsetLeft;
                            float f4 = transitionParams.top + transitionParams.offsetTop;
                            float f5 = transitionParams.right + nonAnimationTranslationX + transitionParams.offsetRight;
                            float f6 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f4 += chatMessageCell3.getTranslationY();
                                f6 += chatMessageCell3.getTranslationY();
                            }
                            canvas.clipRect(f3 + AndroidUtilities.dp(8.0f), f4 + AndroidUtilities.dp(8.0f), f5 - AndroidUtilities.dp(8.0f), f6 - AndroidUtilities.dp(8.0f));
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
                    this.drawCaptionAfter.clear();
                }
            }

            private void drawChatBackgroundElements(Canvas canvas) {
                float f3;
                int i4;
                int i5;
                boolean z2;
                MessageObject.GroupedMessages currentMessagesGroup;
                int i6;
                Canvas canvas2 = canvas;
                int childCount = getChildCount();
                int i7 = 0;
                MessageObject.GroupedMessages groupedMessages2 = null;
                while (true) {
                    f3 = 0.0f;
                    i4 = 4;
                    i5 = 2;
                    z2 = true;
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 4) {
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages2) {
                                MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                                MessageBackgroundDrawable backgroundDrawable = chatMessageCell.getBackgroundDrawable();
                                if ((backgroundDrawable.isAnimationInProgress() || chatMessageCell.isDrawingSelectionBackground()) && (currentPosition == null || (currentPosition.flags & 2) != 0)) {
                                    int y = (int) chatMessageCell.getY();
                                    canvas.save();
                                    if (currentPosition == null) {
                                        i6 = chatMessageCell.getMeasuredHeight();
                                    } else {
                                        int measuredHeight = chatMessageCell.getMeasuredHeight() + y;
                                        long j = 0;
                                        float f4 = 0.0f;
                                        for (int i8 = 0; i8 < childCount; i8++) {
                                            View childAt2 = getChildAt(i8);
                                            if (childAt2 instanceof ChatMessageCell) {
                                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                                                if (chatMessageCell2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                    MessageBackgroundDrawable backgroundDrawable2 = chatMessageCell2.getBackgroundDrawable();
                                                    y = Math.min(y, (int) chatMessageCell2.getY());
                                                    measuredHeight = Math.max(measuredHeight, ((int) chatMessageCell2.getY()) + chatMessageCell2.getMeasuredHeight());
                                                    long lastTouchTime = backgroundDrawable2.getLastTouchTime();
                                                    if (lastTouchTime > j) {
                                                        f3 = backgroundDrawable2.getTouchX() + chatMessageCell2.getX();
                                                        f4 = backgroundDrawable2.getTouchY() + chatMessageCell2.getY();
                                                        j = lastTouchTime;
                                                    }
                                                }
                                            }
                                        }
                                        backgroundDrawable.setTouchCoordsOverride(f3, f4 - y);
                                        i6 = measuredHeight - y;
                                    }
                                    int i9 = i6 + y;
                                    canvas2.clipRect(0, y, getMeasuredWidth(), i9);
                                    backgroundDrawable.setCustomPaint(null);
                                    backgroundDrawable.setColor(getThemedColor(Theme.key_chat_selectedBackground));
                                    backgroundDrawable.setBounds(0, y, getMeasuredWidth(), i9);
                                    backgroundDrawable.draw(canvas2);
                                    canvas.restore();
                                }
                                groupedMessages2 = currentMessagesGroup2;
                            }
                        } else if (childAt instanceof ChatActionCell) {
                            ChatActionCell chatActionCell2 = (ChatActionCell) childAt;
                            if (chatActionCell2.hasGradientService()) {
                                canvas.save();
                                canvas2.translate(chatActionCell2.getX(), chatActionCell2.getY());
                                canvas2.scale(chatActionCell2.getScaleX(), chatActionCell2.getScaleY(), chatActionCell2.getMeasuredWidth() / 2.0f, chatActionCell2.getMeasuredHeight() / 2.0f);
                                chatActionCell2.drawBackground(canvas2, true);
                                canvas.restore();
                            }
                        }
                    }
                    i7++;
                }
                int i10 = 0;
                while (i10 < 3) {
                    this.drawingGroups.clear();
                    if (i10 != i5 || isFastScrollAnimationRunning()) {
                        int i11 = 0;
                        while (i11 < childCount) {
                            View childAt3 = getChildAt(i11);
                            if (childAt3 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt3;
                                if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f3 && chatMessageCell3.getVisibility() != i4 && (currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup()) != null && ((i10 != 0 || currentMessagesGroup.messages.size() != z2) && ((i10 != z2 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i10 != 0 || !chatMessageCell3.getMessageObject().deleted) && ((i10 != z2 || chatMessageCell3.getMessageObject().deleted) && ((i10 != i5 || chatMessageCell3.willRemovedAfterAnimation()) && (i10 == i5 || !chatMessageCell3.willRemovedAfterAnimation()))))))) {
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
                                    int top = chatMessageCell3.getTop() + chatMessageCell3.getBackgroundDrawableTop();
                                    int top2 = chatMessageCell3.getTop() + chatMessageCell3.getBackgroundDrawableBottom();
                                    if ((chatMessageCell3.getCurrentPosition().flags & i4) == 0) {
                                        top -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell3.getCurrentPosition().flags & 8) == 0) {
                                        top2 += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell3.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell3;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i12 = transitionParams2.top;
                                    if (i12 == 0 || top < i12) {
                                        transitionParams2.top = top;
                                    }
                                    int i13 = transitionParams2.bottom;
                                    if (i13 == 0 || top2 > i13) {
                                        transitionParams2.bottom = top2;
                                    }
                                    int i14 = transitionParams2.left;
                                    if (i14 == 0 || left < i14) {
                                        transitionParams2.left = left;
                                    }
                                    int i15 = transitionParams2.right;
                                    if (i15 == 0 || left2 > i15) {
                                        transitionParams2.right = left2;
                                    }
                                    i11++;
                                    i5 = 2;
                                }
                            }
                            i11++;
                            i5 = 2;
                        }
                        int i16 = 0;
                        while (i16 < this.drawingGroups.size()) {
                            MessageObject.GroupedMessages groupedMessages3 = this.drawingGroups.get(i16);
                            float nonAnimationTranslationX = groupedMessages3.transitionParams.cell.getNonAnimationTranslationX(z2);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
                            float f5 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                            float f6 = transitionParams3.top + transitionParams3.offsetTop;
                            float f7 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                            float f8 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (!transitionParams3.backgroundChangeBounds) {
                                f6 += transitionParams3.cell.getTranslationY();
                                f8 += groupedMessages3.transitionParams.cell.getTranslationY();
                            }
                            float f9 = f8;
                            boolean z3 = (groupedMessages3.transitionParams.cell.getScaleX() == 1.0f && groupedMessages3.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                            if (z3) {
                                canvas.save();
                                canvas2.scale(groupedMessages3.transitionParams.cell.getScaleX(), groupedMessages3.transitionParams.cell.getScaleY(), f5 + ((f7 - f5) / 2.0f), f6 + ((f9 - f6) / 2.0f));
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages3.transitionParams;
                            float f10 = f6;
                            int i17 = i16;
                            transitionParams4.cell.drawBackground(canvas, (int) f5, (int) f6, (int) f7, (int) f9, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                            MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages3.transitionParams;
                            transitionParams5.cell = null;
                            transitionParams5.drawCaptionLayout = groupedMessages3.hasCaption;
                            if (z3) {
                                canvas.restore();
                                for (int i18 = 0; i18 < childCount; i18++) {
                                    View childAt4 = getChildAt(i18);
                                    if (childAt4 instanceof ChatMessageCell) {
                                        ChatMessageCell chatMessageCell4 = (ChatMessageCell) childAt4;
                                        if (chatMessageCell4.getCurrentMessagesGroup() == groupedMessages3) {
                                            int left3 = chatMessageCell4.getLeft();
                                            int top3 = chatMessageCell4.getTop();
                                            childAt4.setPivotX((f5 - left3) + ((f7 - f5) / 2.0f));
                                            childAt4.setPivotY((f10 - top3) + ((f9 - f10) / 2.0f));
                                        }
                                    }
                                }
                            }
                            i16 = i17 + 1;
                            canvas2 = canvas;
                            z2 = true;
                        }
                    }
                    i10++;
                    canvas2 = canvas;
                    z2 = true;
                    i5 = 2;
                    i4 = 4;
                    f3 = 0.0f;
                }
            }

            @Override
            public boolean drawChild(android.graphics.Canvas r19, android.view.View r20, long r21) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Views.MessageEntityView.AnonymousClass3.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
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
                ChatMessageCell chatMessageCell = new ChatMessageCell(context, false, null, MessageEntityView.this.resourcesProvider) {
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
                    public void onDraw(Canvas canvas) {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        PreviewView.TextureViewHolder textureViewHolder2 = textureViewHolder;
                        if ((textureViewHolder2 != null && textureViewHolder2.active && textureViewHolder2.textureViewActive) || MessageEntityView.this.clipVideoMessageForBitmap) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        } else {
                            canvas.save();
                        }
                        super.onDraw(canvas);
                        canvas.restore();
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
                    public boolean drawPhotoImage(Canvas canvas) {
                        PreviewView.TextureViewHolder textureViewHolder2;
                        ImageReceiver photoImage = getPhotoImage();
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
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
                                    float max = Math.max(photoImage.getImageWidth() / MessageEntityView.this.videoWidth, photoImage.getImageHeight() / MessageEntityView.this.videoHeight);
                                    canvas.translate(photoImage.getCenterX() - ((MessageEntityView.this.videoWidth * max) / 2.0f), photoImage.getCenterY() - ((MessageEntityView.this.videoHeight * max) / 2.0f));
                                    canvas.scale((MessageEntityView.this.videoWidth / MessageEntityView.this.textureView.getWidth()) * max, (MessageEntityView.this.videoHeight / MessageEntityView.this.textureView.getHeight()) * max);
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
                MessageObject.GroupedMessagePosition groupedMessagePosition;
                MessageObject messageObject2 = MessageEntityView.this.messageObjects.get((MessageEntityView.this.messageObjects.size() - 1) - i4);
                ((ChatMessageCell) viewHolder.itemView).setMessageObject(messageObject2, MessageEntityView.this.groupedMessages, MessageEntityView.this.groupedMessages != null, (MessageEntityView.this.groupedMessages == null || (groupedMessagePosition = MessageEntityView.this.groupedMessages.positions.get(messageObject2)) == null || groupedMessagePosition.minY == 0) ? false : true);
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
                    MessageObject.GroupedMessagePosition groupedMessagePosition = MessageEntityView.this.groupedMessages.positions.get(MessageEntityView.this.messageObjects.get(size));
                    if (groupedMessagePosition != null && groupedMessagePosition.minX != groupedMessagePosition.maxX && (b = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b != 0) {
                        int size2 = MessageEntityView.this.groupedMessages.posArray.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = MessageEntityView.this.groupedMessages.posArray.get(i5);
                            if (groupedMessagePosition2 != groupedMessagePosition) {
                                byte b2 = groupedMessagePosition2.minY;
                                byte b3 = groupedMessagePosition.minY;
                                if (b2 <= b3 && groupedMessagePosition2.maxY >= b3) {
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
                MessageObject.GroupedMessagePosition groupedMessagePosition = MessageEntityView.this.groupedMessages.positions.get(MessageEntityView.this.groupedMessages.messages.get(size));
                if (groupedMessagePosition != null) {
                    return groupedMessagePosition.spanSize;
                }
                return 1000;
            }
        });
        recyclerListView.setLayoutManager(gridLayoutManagerFixed);
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                ChatMessageCell chatMessageCell;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessagePosition currentPosition;
                int i4 = 0;
                rect.bottom = 0;
                if (!(view instanceof ChatMessageCell) || (currentMessagesGroup = (chatMessageCell = (ChatMessageCell) view).getCurrentMessagesGroup()) == null || (currentPosition = chatMessageCell.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
                    return;
                }
                android.graphics.Point point2 = AndroidUtilities.displaySize;
                float max = Math.max(point2.x, point2.y) * 0.5f;
                int extraInsetHeight = chatMessageCell.getExtraInsetHeight();
                int i5 = 0;
                while (true) {
                    float[] fArr = currentPosition.siblingHeights;
                    if (i5 >= fArr.length) {
                        break;
                    }
                    extraInsetHeight += (int) Math.ceil(fArr[i5] * max);
                    i5++;
                }
                int round = extraInsetHeight + ((currentPosition.maxY - currentPosition.minY) * Math.round(AndroidUtilities.density * 7.0f));
                int size = currentMessagesGroup.posArray.size();
                while (true) {
                    if (i4 < size) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i4);
                        byte b = groupedMessagePosition.minY;
                        byte b2 = currentPosition.minY;
                        if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                            round -= ((int) Math.ceil(max * groupedMessagePosition.ph)) - AndroidUtilities.dp(4.0f);
                            break;
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
                rect.bottom = -round;
            }
        });
        frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        if (textureViewHolder != null && textureViewHolder.active) {
            textureViewHolder.takeTextureView(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    MessageEntityView.this.lambda$new$0((TextureView) obj);
                }
            }, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    MessageEntityView.this.lambda$new$2((Integer) obj, (Integer) obj2);
                }
            });
        }
        updatePosition();
    }

    public void lambda$new$0(TextureView textureView) {
        this.textureView = textureView;
        if (textureView != null) {
            this.container.addView(textureView, 0);
        }
    }

    public void lambda$new$2(Integer num, Integer num2) {
        this.videoWidth = num.intValue();
        this.videoHeight = num2.intValue();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageEntityView.this.lambda$new$1();
            }
        }, 60L);
    }

    public void lambda$new$1() {
        this.textureViewActive = true;
        invalidateAll();
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

    public void getBubbleBounds(RectF rectF) {
        float y;
        float f;
        float f2;
        float f3;
        float f4 = -2.14748365E9f;
        float f5 = -2.14748365E9f;
        float f6 = 2.14748365E9f;
        float f7 = 2.14748365E9f;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject() != null && chatMessageCell.getMessageObject().isRoundVideo() && chatMessageCell.getPhotoImage() != null) {
                    f = this.container.getX() + chatMessageCell.getX() + chatMessageCell.getPhotoImage().getImageX();
                    f2 = this.container.getX() + chatMessageCell.getX() + chatMessageCell.getPhotoImage().getImageX2();
                    f3 = this.container.getY() + chatMessageCell.getY() + chatMessageCell.getPhotoImage().getImageY();
                    y = this.container.getY() + chatMessageCell.getY() + chatMessageCell.getPhotoImage().getImageY2();
                } else {
                    float x = this.container.getX() + childAt.getX() + chatMessageCell.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                    if (this.groupedMessages == null) {
                        x += AndroidUtilities.dp(8.0f);
                    }
                    float x2 = ((this.container.getX() + childAt.getX()) + chatMessageCell.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.0f);
                    float y2 = this.container.getY() + childAt.getY() + chatMessageCell.getBackgroundDrawableTop() + AndroidUtilities.dp(1.33f);
                    y = ((this.container.getY() + childAt.getY()) + chatMessageCell.getBackgroundDrawableBottom()) - AndroidUtilities.dp(0.66f);
                    f = x;
                    f2 = x2;
                    f3 = y2;
                }
                f6 = Math.min(Math.min(f6, f), f2);
                f4 = Math.max(Math.max(f4, f), f2);
                f7 = Math.min(Math.min(f7, f3), y);
                f5 = Math.max(Math.max(f5, f3), y);
            }
        }
        rectF.set(f6, f7, f4, f5);
    }

    public void invalidateAll() {
        this.dateCell.invalidate();
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
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        updateSelectionView();
        if (this.usesBackgroundPaint) {
            invalidateAll();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.dateCell.measure(this.container.getMeasuredWidth() > 0 ? View.MeasureSpec.makeMeasureSpec(this.container.getMeasuredWidth(), 1073741824) : i, i2);
        this.container.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - this.dateCell.getMeasuredHeight(), View.MeasureSpec.getMode(i2)));
        this.dateCell.measure(this.container.getMeasuredWidth() > 0 ? View.MeasureSpec.makeMeasureSpec(this.container.getMeasuredWidth(), 1073741824) : i, i2);
        setMeasuredDimension(this.container.getMeasuredWidth(), this.dateCell.getMeasuredHeight() + this.container.getMeasuredHeight());
        updatePosition();
        if (this.firstMeasure) {
            float min = Math.min((View.MeasureSpec.getSize(i) - AndroidUtilities.dp(32.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(192.0f)) / getMeasuredHeight());
            if (min < 1.0f) {
                setScale(min);
            }
            Point position = getPosition();
            position.x -= AndroidUtilities.dp(18.0f);
            setPosition(position);
            this.firstMeasure = false;
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ChatActionCell chatActionCell = this.dateCell;
        chatActionCell.layout(0, 0, chatActionCell.getMeasuredWidth(), this.dateCell.getMeasuredHeight());
        this.container.layout(0, this.dateCell.getMeasuredHeight(), this.container.getMeasuredWidth(), this.dateCell.getMeasuredHeight() + this.container.getMeasuredHeight());
    }

    @Override
    public org.telegram.ui.Components.Rect getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new org.telegram.ui.Components.Rect();
        }
        float scaleX = viewGroup.getScaleX();
        return new org.telegram.ui.Components.Rect(((getPositionX() * scaleX) - (((getMeasuredWidth() * getScale()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getMeasuredHeight() * getScale()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getMeasuredWidth() * getScale() * scaleX) + AndroidUtilities.dp(71.0f), (getMeasuredHeight() * getScale() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override
    protected EntityView.SelectionView createSelectionView() {
        return new MessageEntityViewSelectionView(this, getContext());
    }

    public class MessageEntityViewSelectionView extends EntityView.SelectionView {
        private final Paint clearPaint;
        private Path path;

        public MessageEntityViewSelectionView(MessageEntityView messageEntityView, Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.path = new Path();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float dp = AndroidUtilities.dp(19.5f);
            float dp2 = AndroidUtilities.dp(1.0f) + dp;
            float f3 = dp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f3;
            float measuredHeight = getMeasuredHeight() - f3;
            float f4 = (measuredHeight / 2.0f) + dp2;
            if (f <= dp2 - dp || f2 <= f4 - dp || f >= dp2 + dp || f2 >= f4 + dp) {
                float f5 = dp2 + measuredWidth;
                if (f <= f5 - dp || f2 <= f4 - dp || f >= f5 + dp || f2 >= f4 + dp) {
                    return (f <= dp2 || f >= measuredWidth || f2 <= dp2 || f2 >= measuredHeight) ? 0 : 3;
                }
                return 2;
            }
            return 1;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int saveCount = canvas.getSaveCount();
            float showAlpha = getShowAlpha();
            if (showAlpha <= 0.0f) {
                return;
            }
            if (showAlpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
            }
            float dpf2 = AndroidUtilities.dpf2(5.66f);
            float dp = AndroidUtilities.dp(2.0f) + dpf2 + AndroidUtilities.dp(15.0f);
            float f = dp * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = dp + measuredWidth;
            float f3 = dp + measuredHeight;
            rectF.set(dp, dp, f2, f3);
            float dp2 = AndroidUtilities.dp(12.0f);
            float min = Math.min(dp2, measuredWidth / 2.0f);
            float f4 = measuredHeight / 2.0f;
            float min2 = Math.min(dp2, f4);
            this.path.rewind();
            float f5 = min * 2.0f;
            float f6 = dp + f5;
            float f7 = 2.0f * min2;
            float f8 = dp + f7;
            rectF.set(dp, dp, f6, f8);
            this.path.arcTo(rectF, 180.0f, 90.0f);
            float f9 = f2 - f5;
            rectF.set(f9, dp, f2, f8);
            this.path.arcTo(rectF, 270.0f, 90.0f);
            canvas.drawPath(this.path, this.paint);
            this.path.rewind();
            float f10 = f3 - f7;
            rectF.set(dp, f10, f6, f3);
            this.path.arcTo(rectF, 180.0f, -90.0f);
            rectF.set(f9, f10, f2, f3);
            this.path.arcTo(rectF, 90.0f, -90.0f);
            canvas.drawPath(this.path, this.paint);
            float f11 = dp + f4;
            canvas.drawCircle(dp, f11, dpf2, this.dotStrokePaint);
            canvas.drawCircle(dp, f11, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas.drawCircle(f2, f11, dpf2, this.dotStrokePaint);
            canvas.drawCircle(f2, f11, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, this.dotPaint);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            float f12 = dp + min2;
            float f13 = f3 - min2;
            canvas.drawLine(dp, f12, dp, f13, this.paint);
            canvas.drawLine(f2, f12, f2, f13, this.paint);
            canvas.drawCircle(f2, f11, (AndroidUtilities.dp(1.0f) + dpf2) - 1.0f, this.clearPaint);
            canvas.drawCircle(dp, f11, (dpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, this.clearPaint);
            canvas.restoreToCount(saveCount);
        }
    }

    public void setupTheme(org.telegram.ui.Stories.recorder.StoryEntry r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Views.MessageEntityView.setupTheme(org.telegram.ui.Stories.recorder.StoryEntry):void");
    }

    public TLRPC$TL_message copyMessage(TLRPC$Message tLRPC$Message) {
        TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
        tLRPC$TL_message.id = tLRPC$Message.id;
        tLRPC$TL_message.from_id = tLRPC$Message.from_id;
        tLRPC$TL_message.peer_id = tLRPC$Message.peer_id;
        tLRPC$TL_message.date = tLRPC$Message.date;
        tLRPC$TL_message.expire_date = tLRPC$Message.expire_date;
        tLRPC$TL_message.action = tLRPC$Message.action;
        tLRPC$TL_message.message = tLRPC$Message.message;
        tLRPC$TL_message.media = tLRPC$Message.media;
        tLRPC$TL_message.flags = tLRPC$Message.flags;
        tLRPC$TL_message.mentioned = tLRPC$Message.mentioned;
        tLRPC$TL_message.media_unread = tLRPC$Message.media_unread;
        tLRPC$TL_message.out = tLRPC$Message.out;
        tLRPC$TL_message.unread = tLRPC$Message.unread;
        tLRPC$TL_message.entities = tLRPC$Message.entities;
        tLRPC$TL_message.via_bot_name = tLRPC$Message.via_bot_name;
        tLRPC$TL_message.reply_markup = tLRPC$Message.reply_markup;
        tLRPC$TL_message.views = tLRPC$Message.views;
        tLRPC$TL_message.forwards = tLRPC$Message.forwards;
        tLRPC$TL_message.replies = tLRPC$Message.replies;
        tLRPC$TL_message.edit_date = tLRPC$Message.edit_date;
        tLRPC$TL_message.silent = tLRPC$Message.silent;
        tLRPC$TL_message.post = tLRPC$Message.post;
        tLRPC$TL_message.from_scheduled = tLRPC$Message.from_scheduled;
        tLRPC$TL_message.legacy = tLRPC$Message.legacy;
        tLRPC$TL_message.edit_hide = tLRPC$Message.edit_hide;
        tLRPC$TL_message.pinned = tLRPC$Message.pinned;
        tLRPC$TL_message.fwd_from = tLRPC$Message.fwd_from;
        tLRPC$TL_message.via_bot_id = tLRPC$Message.via_bot_id;
        tLRPC$TL_message.reply_to = tLRPC$Message.reply_to;
        tLRPC$TL_message.post_author = tLRPC$Message.post_author;
        tLRPC$TL_message.grouped_id = tLRPC$Message.grouped_id;
        tLRPC$TL_message.reactions = tLRPC$Message.reactions;
        tLRPC$TL_message.restriction_reason = tLRPC$Message.restriction_reason;
        tLRPC$TL_message.ttl_period = tLRPC$Message.ttl_period;
        tLRPC$TL_message.noforwards = tLRPC$Message.noforwards;
        tLRPC$TL_message.invert_media = tLRPC$Message.invert_media;
        tLRPC$TL_message.send_state = tLRPC$Message.send_state;
        tLRPC$TL_message.fwd_msg_id = tLRPC$Message.fwd_msg_id;
        tLRPC$TL_message.attachPath = tLRPC$Message.attachPath;
        tLRPC$TL_message.params = tLRPC$Message.params;
        tLRPC$TL_message.random_id = tLRPC$Message.random_id;
        tLRPC$TL_message.local_id = tLRPC$Message.local_id;
        tLRPC$TL_message.dialog_id = tLRPC$Message.dialog_id;
        tLRPC$TL_message.ttl = tLRPC$Message.ttl;
        tLRPC$TL_message.destroyTime = tLRPC$Message.destroyTime;
        tLRPC$TL_message.destroyTimeMillis = tLRPC$Message.destroyTimeMillis;
        tLRPC$TL_message.layer = tLRPC$Message.layer;
        tLRPC$TL_message.seq_in = tLRPC$Message.seq_in;
        tLRPC$TL_message.seq_out = tLRPC$Message.seq_out;
        tLRPC$TL_message.with_my_score = tLRPC$Message.with_my_score;
        tLRPC$TL_message.replyMessage = tLRPC$Message.replyMessage;
        tLRPC$TL_message.reqId = tLRPC$Message.reqId;
        tLRPC$TL_message.realId = tLRPC$Message.realId;
        tLRPC$TL_message.stickerVerified = tLRPC$Message.stickerVerified;
        tLRPC$TL_message.isThreadMessage = tLRPC$Message.isThreadMessage;
        tLRPC$TL_message.voiceTranscription = tLRPC$Message.voiceTranscription;
        tLRPC$TL_message.voiceTranscriptionOpen = tLRPC$Message.voiceTranscriptionOpen;
        tLRPC$TL_message.voiceTranscriptionRated = tLRPC$Message.voiceTranscriptionRated;
        tLRPC$TL_message.voiceTranscriptionFinal = tLRPC$Message.voiceTranscriptionFinal;
        tLRPC$TL_message.voiceTranscriptionForce = tLRPC$Message.voiceTranscriptionForce;
        tLRPC$TL_message.voiceTranscriptionId = tLRPC$Message.voiceTranscriptionId;
        tLRPC$TL_message.premiumEffectWasPlayed = tLRPC$Message.premiumEffectWasPlayed;
        tLRPC$TL_message.originalLanguage = tLRPC$Message.originalLanguage;
        tLRPC$TL_message.translatedToLanguage = tLRPC$Message.translatedToLanguage;
        tLRPC$TL_message.translatedText = tLRPC$Message.translatedText;
        tLRPC$TL_message.replyStory = tLRPC$Message.replyStory;
        return tLRPC$TL_message;
    }
}

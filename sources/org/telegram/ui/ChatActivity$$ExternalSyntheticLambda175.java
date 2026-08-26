package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;

public final class ChatActivity$$ExternalSyntheticLambda175 implements IBlur3Capture {
    public final int $r8$classId;
    public final ChatActivity.ChatActivityFragmentView f$0;

    public ChatActivity$$ExternalSyntheticLambda175(ChatActivity.ChatActivityFragmentView chatActivityFragmentView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityFragmentView;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView = this.f$0;
                ChatActivity chatActivity = ChatActivity.this;
                ChatActivity chatActivity2 = chatActivity.parentChatActivity;
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView2 = chatActivity2 != null ? chatActivity2.contentView : chatActivity.contentView;
                float f = chatActivity.animatorSearchResultAsListVisibility.floatValue;
                int i = (int) ((1.0f - f) * 255.0f);
                int i2 = (int) (255.0f * f);
                if (f > 0.0f) {
                    canvas.drawColor(Theme.multAlpha(f * 0.85f, chatActivity.getThemedColor(Theme.key_windowBackgroundWhite)));
                }
                Blur3Utils.captureRelativeParent(new ChatActivity$$ExternalSyntheticLambda175(chatActivityFragmentView, 1), canvas, rectF, chatActivity.chatListView, chatActivityFragmentView2, i);
                ChatActivity.AnonymousClass34 anonymousClass34 = chatActivity.messagesSearchListView;
                if (anonymousClass34 != null) {
                    Blur3Utils.captureRelativeParent(anonymousClass34, canvas, rectF, anonymousClass34, chatActivityFragmentView2, i2);
                }
                PollItemMenu.AnonymousClass3 anonymousClass3 = chatActivity.searchViewPager;
                if (anonymousClass3 != null && anonymousClass3.getVisibility() == 0) {
                    int childCount = chatActivity.searchViewPager.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = chatActivity.searchViewPager.getChildAt(i3);
                        if ((childAt instanceof ChatActivityContainer) && childAt.getVisibility() == 0) {
                            ChatActivityContainer chatActivityContainer = (ChatActivityContainer) childAt;
                            ChatActivity.ChatActivityFragmentView chatActivityFragmentView3 = chatActivityContainer.chatActivity.contentView;
                            Objects.requireNonNull(chatActivityFragmentView3);
                            Blur3Utils.captureRelativeParent(new ChatActivity$$ExternalSyntheticLambda175(chatActivityFragmentView3, 0), canvas, rectF, chatActivityContainer.chatActivity.contentView, chatActivityContainer, 255);
                        }
                    }
                    break;
                }
                break;
            default:
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView4 = this.f$0;
                chatActivityFragmentView4.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                ChatActivity chatActivity3 = ChatActivity.this;
                if (chatActivity3.chatListView.hasActiveEdgeEffects()) {
                    chatActivity3.chatListView.capture(canvas, rectF);
                } else {
                    chatActivity3.chatListView.drawChatBackgroundElements(canvas, rectF);
                    for (int i4 = 0; i4 < chatActivity3.chatListView.getChildCount(); i4++) {
                        View childAt2 = chatActivity3.chatListView.getChildAt(i4);
                        if (!ChatActivity.access$21000(chatActivity3, childAt2, rectF)) {
                            if (childAt2 instanceof ChatMessageCell) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt2;
                                if (chatMessageCell.drawBackgroundInParent()) {
                                    canvas.save();
                                    canvas.translate(0.0f, chatMessageCell.starsPriceTopPadding);
                                    chatMessageCell.drawBackgroundInternal(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                chatActivity3.chatListView.drawChild(canvas, childAt2, jUptimeMillis);
                                if (chatMessageCell.hasOutboundsContent()) {
                                    canvas.save();
                                    canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                                    chatMessageCell.drawOutboundsContent(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof ChatActionCell) {
                                chatActivity3.chatListView.drawChild(canvas, childAt2, jUptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((ChatActionCell) childAt2).drawOutboundsContent(canvas);
                                canvas.restore();
                            } else {
                                chatActivity3.chatListView.drawChild(canvas, childAt2, jUptimeMillis);
                            }
                        }
                    }
                    chatActivity3.chatListView.drawChatForegroundElements(canvas, rectF);
                }
                break;
        }
    }

    @Override
    public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
        switch (this.$r8$classId) {
            case 0:
                blur3HashImpl.unsupported = true;
                break;
            default:
                blur3HashImpl.unsupported = true;
                break;
        }
    }
}

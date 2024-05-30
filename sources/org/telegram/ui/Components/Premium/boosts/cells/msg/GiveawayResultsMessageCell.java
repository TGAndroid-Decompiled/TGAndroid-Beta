package org.telegram.ui.Components.Premium.boosts.cells.msg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveawayResults;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.LaunchActivity;
public class GiveawayResultsMessageCell {
    private AvatarDrawable[] avatarDrawables;
    private ImageReceiver[] avatarImageReceivers;
    private boolean[] avatarVisible;
    private int bottomHeight;
    private StaticLayout bottomLayout;
    private Paint chatBgPaint;
    private RectF chatRect;
    private TextPaint chatTextPaint;
    private Rect[] clickRect;
    private Paint clipRectPaint;
    private Rect containerRect;
    private RectF countRect;
    private Paint counterBgPaint;
    private String counterStr;
    private Rect counterTextBounds;
    private TextPaint counterTextPaint;
    private int countriesHeight;
    private StaticLayout countriesLayout;
    private TextPaint countriesTextPaint;
    private int diffTextWidth;
    private RLottieDrawable giftDrawable;
    private ImageReceiver giftReceiver;
    private LinkSpanDrawable.LinkCollector links;
    private MessageObject messageObject;
    private boolean[] needNewRow;
    private final ChatMessageCell parentView;
    private int[] pressedState;
    private Paint saveLayerPaint;
    private int selectorColor;
    private Drawable selectorDrawable;
    private int subTitleMarginLeft;
    private int subTitleMarginTop;
    private TextPaint textDividerPaint;
    private TextPaint textPaint;
    private int titleHeight;
    private StaticLayout titleLayout;
    private int topHeight;
    private StaticLayout topLayout;
    private SpannableStringBuilder topStringBuilder;
    private float[] userTitleWidths;
    private CharSequence[] userTitles;
    private TLRPC$User[] users;
    private int measuredHeight = 0;
    private int measuredWidth = 0;
    private int pressedPos = -1;
    private boolean isButtonPressed = false;
    private boolean isContainerPressed = false;

    public GiveawayResultsMessageCell(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
    }

    private void init() {
        if (this.counterTextPaint != null) {
            return;
        }
        this.counterTextPaint = new TextPaint(1);
        this.chatTextPaint = new TextPaint(1);
        this.textPaint = new TextPaint(1);
        this.textDividerPaint = new TextPaint(1);
        this.countriesTextPaint = new TextPaint(1);
        this.counterBgPaint = new Paint(1);
        this.chatBgPaint = new Paint(1);
        this.saveLayerPaint = new Paint();
        this.clipRectPaint = new Paint();
        this.countRect = new RectF();
        this.chatRect = new RectF();
        this.counterTextBounds = new Rect();
        this.containerRect = new Rect();
        this.pressedState = new int[]{16842910, 16842919};
        this.userTitles = new CharSequence[10];
        this.users = new TLRPC$User[10];
        this.userTitleWidths = new float[10];
        this.needNewRow = new boolean[10];
        this.clickRect = new Rect[10];
        ImageReceiver imageReceiver = new ImageReceiver(this.parentView);
        this.giftReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        this.clipRectPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.counterTextPaint.setTypeface(AndroidUtilities.bold());
        this.counterTextPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.counterTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.counterTextPaint.setTextAlign(Paint.Align.CENTER);
        this.chatTextPaint.setTypeface(AndroidUtilities.bold());
        this.chatTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.countriesTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.textDividerPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.textDividerPaint.setTextAlign(Paint.Align.CENTER);
    }

    public boolean checkMotionEvent(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            if (this.links == null) {
                this.links = new LinkSpanDrawable.LinkCollector(this.parentView);
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.topStringBuilder != null && (staticLayout = this.topLayout) != null) {
                int i = this.subTitleMarginTop;
                if (y - i > 0) {
                    int offsetForHorizontal = this.topLayout.getOffsetForHorizontal(staticLayout.getLineForVertical((y - i) - AndroidUtilities.dp(10.0f)), x - this.subTitleMarginLeft);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.topStringBuilder.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0) {
                        if (action == 1) {
                            this.links.clear();
                            clickableSpanArr[0].onClick(this.parentView);
                        } else {
                            LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanArr[0], null, x, y);
                            this.links.addLink(linkSpanDrawable);
                            try {
                                int spanStart = this.topStringBuilder.getSpanStart(clickableSpanArr[0]);
                                LinkPath obtainNewPath = linkSpanDrawable.obtainNewPath();
                                obtainNewPath.setCurrentLayout(this.topLayout, spanStart, this.subTitleMarginLeft, this.subTitleMarginTop);
                                this.topLayout.getSelectionPath(spanStart, this.topStringBuilder.getSpanEnd(clickableSpanArr[0]), obtainNewPath);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        return true;
                    }
                    this.links.clear();
                    this.parentView.invalidate();
                }
            }
            if (action == 0) {
                int i2 = 0;
                while (true) {
                    Rect[] rectArr = this.clickRect;
                    if (i2 < rectArr.length) {
                        if (rectArr[i2].contains(x, y)) {
                            this.pressedPos = i2;
                            if (Build.VERSION.SDK_INT >= 21) {
                                this.selectorDrawable.setHotspot(x, y);
                            }
                            this.isButtonPressed = true;
                            setButtonPressed(true);
                            return true;
                        }
                        i2++;
                    } else if (this.containerRect.contains(x, y)) {
                        this.isContainerPressed = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.isButtonPressed) {
                    if (this.parentView.getDelegate() != null) {
                        this.parentView.getDelegate().didPressGiveawayChatButton(this.parentView, this.pressedPos);
                    }
                    this.parentView.playSoundEffect(0);
                    setButtonPressed(false);
                    this.isButtonPressed = false;
                }
                if (this.isContainerPressed) {
                    this.isContainerPressed = false;
                    BoostDialogs.showBulletinAbout(this.messageObject);
                }
            } else if (action != 2 && action == 3) {
                this.links.clear();
                if (this.isButtonPressed) {
                    setButtonPressed(false);
                }
                this.isButtonPressed = false;
                this.isContainerPressed = false;
            }
        }
        return false;
    }

    public void setButtonPressed(boolean z) {
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveawayResults() || this.selectorDrawable == null) {
            return;
        }
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            linkCollector.clear();
        }
        if (z) {
            this.selectorDrawable.setCallback(new Drawable.Callback() {
                @Override
                public void invalidateDrawable(Drawable drawable) {
                    GiveawayResultsMessageCell.this.parentView.invalidate();
                }

                @Override
                public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    GiveawayResultsMessageCell.this.parentView.invalidate();
                }

                @Override
                public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    GiveawayResultsMessageCell.this.parentView.invalidate();
                }
            });
            this.selectorDrawable.setState(this.pressedState);
            this.parentView.invalidate();
            return;
        }
        this.selectorDrawable.setState(StateSet.NOTHING);
        this.parentView.invalidate();
    }

    public void setMessageContent(final MessageObject messageObject, int i, int i2) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        this.messageObject = null;
        this.titleLayout = null;
        this.topLayout = null;
        this.bottomLayout = null;
        this.countriesLayout = null;
        this.measuredHeight = 0;
        this.measuredWidth = 0;
        if (messageObject.isGiveawayResults()) {
            this.messageObject = messageObject;
            init();
            createImages();
            setGiftImage();
            final TLRPC$TL_messageMediaGiveawayResults tLRPC$TL_messageMediaGiveawayResults = (TLRPC$TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            checkArraysLimits(tLRPC$TL_messageMediaGiveawayResults.winners.size());
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.topStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tLRPC$TL_messageMediaGiveawayResults.winners_count), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                @Override
                public final void run() {
                    GiveawayResultsMessageCell.this.lambda$setMessageContent$1(messageObject, tLRPC$TL_messageMediaGiveawayResults);
                }
            });
            this.topStringBuilder.append((CharSequence) AndroidUtilities.replaceCharSequence("%1$d", replaceSingleTag, AndroidUtilities.replaceTags("**" + tLRPC$TL_messageMediaGiveawayResults.winners_count + "**")));
            this.topStringBuilder.append((CharSequence) "\n\n");
            this.topStringBuilder.setSpan(new RelativeSizeSpan(0.4f), this.topStringBuilder.length() + (-1), this.topStringBuilder.length(), 33);
            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinners", tLRPC$TL_messageMediaGiveawayResults.winners_count));
            this.topStringBuilder.append((CharSequence) replaceTags2);
            this.topStringBuilder.setSpan(new RelativeSizeSpan(1.05f), replaceSingleTag.length() + 2, replaceSingleTag.length() + 2 + replaceTags2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tLRPC$TL_messageMediaGiveawayResults.winners_count != tLRPC$TL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayResultsMsgAllAndMoreWinners", tLRPC$TL_messageMediaGiveawayResults.winners_count - tLRPC$TL_messageMediaGiveawayResults.winners.size(), new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            spannableStringBuilder2.append((CharSequence) LocaleController.getString("BoostingGiveawayResultsMsgAllWinnersReceivedLinks", R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            this.titleLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, this.textPaint, dp2, Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, dp2, 10);
            this.topLayout = StaticLayoutEx.createStaticLayout(this.topStringBuilder, this.textPaint, dp2, Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, dp2, 10);
            this.bottomLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder2, this.textPaint, dp2, Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(3.0f), false, TextUtils.TruncateAt.END, dp2, 10);
            int max = Math.max(i2, dp2);
            this.diffTextWidth = max - dp2;
            float f = max;
            float f2 = dp;
            float f3 = f2 / 2.0f;
            this.giftReceiver.setImageCoords((f / 2.0f) - f3, AndroidUtilities.dp(70.0f) - f3, f2, f2);
            int lineBottom = this.titleLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
            this.titleHeight = lineBottom;
            this.topHeight = lineBottom + this.topLayout.getLineBottom(staticLayout2.getLineCount() - 1);
            this.bottomHeight = this.bottomLayout.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.countriesLayout;
            int lineBottom2 = staticLayout4 != null ? staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(12.0f) : 0;
            this.countriesHeight = lineBottom2;
            int i3 = this.measuredHeight + this.topHeight;
            this.measuredHeight = i3;
            int i4 = i3 + lineBottom2;
            this.measuredHeight = i4;
            int i5 = i4 + this.bottomHeight;
            this.measuredHeight = i5;
            this.measuredHeight = i5 + AndroidUtilities.dp(128.0f);
            this.measuredWidth = max;
            String str = "x" + tLRPC$TL_messageMediaGiveawayResults.winners_count;
            this.counterStr = str;
            this.counterTextPaint.getTextBounds(str, 0, str.length(), this.counterTextBounds);
            Arrays.fill(this.avatarVisible, false);
            this.measuredHeight += AndroidUtilities.dp(30.0f);
            ArrayList arrayList = new ArrayList(tLRPC$TL_messageMediaGiveawayResults.winners.size());
            Iterator<Long> it = tLRPC$TL_messageMediaGiveawayResults.winners.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                if (MessagesController.getInstance(UserConfig.selectedAccount).getUser(next) != null) {
                    arrayList.add(next);
                }
            }
            float f4 = 0.0f;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                long longValue = ((Long) arrayList.get(i6)).longValue();
                TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(longValue));
                if (user != null) {
                    this.avatarVisible[i6] = true;
                    this.users[i6] = user;
                    this.userTitles[i6] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user), this.chatTextPaint.getFontMetricsInt(), false), this.chatTextPaint, 0.8f * f, TextUtils.TruncateAt.END);
                    float[] fArr = this.userTitleWidths;
                    TextPaint textPaint = this.chatTextPaint;
                    CharSequence[] charSequenceArr = this.userTitles;
                    fArr[i6] = textPaint.measureText(charSequenceArr[i6], 0, charSequenceArr[i6].length());
                    float dp3 = this.userTitleWidths[i6] + AndroidUtilities.dp(40.0f);
                    f4 += dp3;
                    if (i6 > 0) {
                        boolean[] zArr = this.needNewRow;
                        zArr[i6] = f4 > 0.9f * f;
                        if (zArr[i6]) {
                            this.measuredHeight += AndroidUtilities.dp(30.0f);
                            f4 = dp3;
                        }
                    } else {
                        this.needNewRow[i6] = false;
                    }
                    this.avatarDrawables[i6].setInfo(user);
                    this.avatarImageReceivers[i6].setForUserOrChat(user, this.avatarDrawables[i6]);
                    this.avatarImageReceivers[i6].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.users[i6] = null;
                    this.avatarVisible[i6] = false;
                    this.userTitles[i6] = "";
                    this.needNewRow[i6] = false;
                    this.userTitleWidths[i6] = AndroidUtilities.dp(20.0f);
                    this.avatarDrawables[i6].setInfo(longValue, "", "");
                }
            }
        }
    }

    public void lambda$setMessageContent$1(final MessageObject messageObject, final TLRPC$TL_messageMediaGiveawayResults tLRPC$TL_messageMediaGiveawayResults) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiveawayResultsMessageCell.this.lambda$setMessageContent$0(messageObject, tLRPC$TL_messageMediaGiveawayResults);
            }
        });
    }

    public void lambda$setMessageContent$0(MessageObject messageObject, TLRPC$TL_messageMediaGiveawayResults tLRPC$TL_messageMediaGiveawayResults) {
        if (messageObject.getDialogId() == (-tLRPC$TL_messageMediaGiveawayResults.channel_id)) {
            this.parentView.getDelegate().didPressReplyMessage(this.parentView, tLRPC$TL_messageMediaGiveawayResults.launch_msg_id);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", tLRPC$TL_messageMediaGiveawayResults.channel_id);
        bundle.putInt("message_id", tLRPC$TL_messageMediaGiveawayResults.launch_msg_id);
        LaunchActivity.getLastFragment().presentFragment(new ChatActivity(bundle));
    }

    private int getUserColor(TLRPC$User tLRPC$User, Theme.ResourcesProvider resourcesProvider) {
        if (this.messageObject.isOutOwner()) {
            return Theme.getColor(Theme.key_chat_outPreviewInstantText, resourcesProvider);
        }
        int colorId = UserObject.getColorId(tLRPC$User);
        if (colorId < 7) {
            return Theme.getColor(Theme.keys_avatar_nameInMessage[colorId], resourcesProvider);
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(colorId);
        if (color != null) {
            return color.getColor1();
        }
        return Theme.getColor(Theme.keys_avatar_nameInMessage[0], resourcesProvider);
    }

    public void draw(Canvas canvas, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        boolean[] zArr;
        int i3;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveawayResults()) {
            return;
        }
        if (this.selectorDrawable == null) {
            int color = Theme.getColor(Theme.key_listSelector);
            this.selectorColor = color;
            this.selectorDrawable = Theme.createRadSelectorDrawable(color, 12, 12);
        }
        this.textPaint.setColor(Theme.chat_msgTextPaint.getColor());
        this.textDividerPaint.setColor(Theme.getColor(Theme.key_dialogTextGray2));
        this.countriesTextPaint.setColor(Theme.chat_msgTextPaint.getColor());
        if (this.messageObject.isOutOwner()) {
            TextPaint textPaint = this.chatTextPaint;
            int i4 = Theme.key_chat_outPreviewInstantText;
            textPaint.setColor(Theme.getColor(i4, resourcesProvider));
            this.counterBgPaint.setColor(Theme.getColor(i4, resourcesProvider));
            this.chatBgPaint.setColor(Theme.getColor(Theme.key_chat_outReplyLine, resourcesProvider));
        } else {
            TextPaint textPaint2 = this.chatTextPaint;
            int i5 = Theme.key_chat_inPreviewInstantText;
            textPaint2.setColor(Theme.getColor(i5, resourcesProvider));
            this.counterBgPaint.setColor(Theme.getColor(i5, resourcesProvider));
            this.chatBgPaint.setColor(Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider));
        }
        canvas.save();
        int dp = i2 - AndroidUtilities.dp(4.0f);
        float f = dp;
        canvas.translate(f, i);
        this.containerRect.set(dp, i, getMeasuredWidth() + dp, getMeasuredHeight() + i);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.saveLayerPaint, 31);
        this.giftReceiver.draw(canvas);
        float f2 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float dp2 = AndroidUtilities.dp(106.0f);
        int width = this.counterTextBounds.width() + AndroidUtilities.dp(12.0f);
        int height = this.counterTextBounds.height() + AndroidUtilities.dp(10.0f);
        this.countRect.set(measuredWidth - ((AndroidUtilities.dp(2.0f) + width) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + height) / 2.0f), ((width + AndroidUtilities.dp(2.0f)) / 2.0f) + measuredWidth, ((height + AndroidUtilities.dp(2.0f)) / 2.0f) + dp2);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.clipRectPaint);
        float f3 = width / 2.0f;
        float f4 = height / 2.0f;
        this.countRect.set(measuredWidth - f3, dp2 - f4, f3 + measuredWidth, dp2 + f4);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.counterBgPaint);
        canvas.drawText(this.counterStr, this.countRect.centerX(), this.countRect.centerY() + AndroidUtilities.dp(4.0f), this.counterTextPaint);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
        int dp3 = AndroidUtilities.dp(128.0f) + i;
        this.subTitleMarginTop = this.titleHeight + dp3;
        this.subTitleMarginLeft = (int) (f + (this.diffTextWidth / 2.0f));
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleHeight);
        this.topLayout.draw(canvas);
        canvas.restore();
        canvas.translate(0.0f, this.topHeight + AndroidUtilities.dp(6.0f));
        int i6 = 0;
        int dp4 = dp3 + this.topHeight + AndroidUtilities.dp(6.0f);
        int i7 = 0;
        while (true) {
            boolean[] zArr2 = this.avatarVisible;
            if (i6 >= zArr2.length) {
                break;
            }
            if (zArr2[i6]) {
                canvas.save();
                int i8 = i6;
                float f5 = 0.0f;
                do {
                    f5 += this.userTitleWidths[i8] + AndroidUtilities.dp(40.0f);
                    i8++;
                    zArr = this.avatarVisible;
                    if (i8 >= zArr.length || this.needNewRow[i8]) {
                        break;
                    }
                } while (zArr[i8]);
                float f6 = measuredWidth - (f5 / f2);
                canvas.translate(f6, 0.0f);
                int i9 = i6;
                int i10 = ((int) f6) + dp;
                while (true) {
                    int userColor = getUserColor(this.users[i9], resourcesProvider);
                    int i11 = this.pressedPos;
                    i3 = (i11 < 0 || i11 != i9) ? i7 : userColor;
                    this.chatTextPaint.setColor(userColor);
                    this.chatBgPaint.setColor(userColor);
                    this.chatBgPaint.setAlpha(25);
                    this.avatarImageReceivers[i9].draw(canvas);
                    CharSequence[] charSequenceArr = this.userTitles;
                    int i12 = i10;
                    int i13 = i9;
                    canvas.drawText(charSequenceArr[i9], 0, charSequenceArr[i9].length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.chatTextPaint);
                    this.chatRect.set(0.0f, 0.0f, this.userTitleWidths[i13] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas.drawRoundRect(this.chatRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.chatBgPaint);
                    float f7 = i12;
                    this.clickRect[i13].set(i12, dp4, (int) (this.chatRect.width() + f7), AndroidUtilities.dp(24.0f) + dp4);
                    canvas.translate(this.chatRect.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    i10 = (int) (f7 + this.chatRect.width() + AndroidUtilities.dp(6.0f));
                    i9 = i13 + 1;
                    boolean[] zArr3 = this.avatarVisible;
                    if (i9 >= zArr3.length || this.needNewRow[i9] || !zArr3[i9]) {
                        break;
                    }
                    i7 = i3;
                }
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                dp4 += AndroidUtilities.dp(30.0f);
                i6 = i9;
                i7 = i3;
            } else {
                i6++;
            }
            f2 = 2.0f;
        }
        if (this.countriesLayout != null) {
            canvas.save();
            canvas.translate((this.measuredWidth - this.countriesLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
            this.countriesLayout.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, this.countriesHeight);
        }
        canvas.translate(0.0f, AndroidUtilities.dp(6.0f));
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.bottomLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.pressedPos >= 0) {
            int multAlpha = Theme.multAlpha(i7, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            if (this.selectorColor != multAlpha) {
                Drawable drawable = this.selectorDrawable;
                this.selectorColor = multAlpha;
                Theme.setSelectorDrawableColor(drawable, multAlpha, true);
            }
            this.selectorDrawable.setBounds(this.clickRect[this.pressedPos]);
            this.selectorDrawable.draw(canvas);
        }
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector == null || !linkCollector.draw(canvas)) {
            return;
        }
        this.parentView.invalidate();
    }

    public void onDetachedFromWindow() {
        ImageReceiver imageReceiver = this.giftReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
        if (imageReceiverArr != null) {
            for (ImageReceiver imageReceiver2 : imageReceiverArr) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
    }

    public void onAttachedToWindow() {
        ImageReceiver imageReceiver = this.giftReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
        if (imageReceiverArr != null) {
            for (ImageReceiver imageReceiver2 : imageReceiverArr) {
                imageReceiver2.onAttachedToWindow();
            }
        }
    }

    public int getMeasuredHeight() {
        return this.measuredHeight;
    }

    public int getMeasuredWidth() {
        return this.measuredWidth;
    }

    private void createImages() {
        if (this.avatarImageReceivers != null) {
            return;
        }
        this.avatarImageReceivers = new ImageReceiver[10];
        this.avatarDrawables = new AvatarDrawable[10];
        this.avatarVisible = new boolean[10];
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
            if (i >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i] = new ImageReceiver(this.parentView);
            this.avatarImageReceivers[i].setAllowLoadingOnAttachedOnly(true);
            this.avatarImageReceivers[i].setRoundRadius(AndroidUtilities.dp(12.0f));
            this.avatarDrawables[i] = new AvatarDrawable();
            this.avatarDrawables[i].setTextSize(AndroidUtilities.dp(18.0f));
            this.clickRect[i] = new Rect();
            i++;
        }
    }

    private void checkArraysLimits(int i) {
        ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
        if (imageReceiverArr.length < i) {
            int length = imageReceiverArr.length;
            this.avatarImageReceivers = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr, i);
            this.avatarDrawables = (AvatarDrawable[]) Arrays.copyOf(this.avatarDrawables, i);
            this.avatarVisible = Arrays.copyOf(this.avatarVisible, i);
            this.userTitles = (CharSequence[]) Arrays.copyOf(this.userTitles, i);
            this.userTitleWidths = Arrays.copyOf(this.userTitleWidths, i);
            this.needNewRow = Arrays.copyOf(this.needNewRow, i);
            this.clickRect = (Rect[]) Arrays.copyOf(this.clickRect, i);
            this.users = (TLRPC$User[]) Arrays.copyOf(this.users, i);
            for (int i2 = length - 1; i2 < i; i2++) {
                this.avatarImageReceivers[i2] = new ImageReceiver(this.parentView);
                this.avatarImageReceivers[i2].setAllowLoadingOnAttachedOnly(true);
                this.avatarImageReceivers[i2].setRoundRadius(AndroidUtilities.dp(12.0f));
                this.avatarDrawables[i2] = new AvatarDrawable();
                this.avatarDrawables[i2].setTextSize(AndroidUtilities.dp(18.0f));
                this.clickRect[i2] = new Rect();
            }
        }
    }

    private void setGiftImage() {
        this.giftReceiver.setAllowStartLottieAnimation(false);
        if (this.giftDrawable == null) {
            int i = R.raw.giveaway_results;
            this.giftDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
        }
        this.giftReceiver.setImageBitmap(this.giftDrawable);
    }
}

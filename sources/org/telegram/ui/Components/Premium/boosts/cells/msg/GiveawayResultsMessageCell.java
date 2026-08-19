package org.telegram.ui.Components.Premium.boosts.cells.msg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
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
    private Drawable counterIcon;
    private TextPaint counterStarsTextPaint;
    private String counterStr;
    private Rect counterTextBounds;
    private TextPaint counterTextPaint;
    private int countriesHeight;
    private StaticLayout countriesLayout;
    private TextPaint countriesTextPaint;
    private int diffTextWidth;
    private RLottieDrawable giftDrawable;
    private ImageReceiver giftReceiver;
    private boolean isStars;
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
    private TLRPC.User[] users;
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
        this.counterStarsTextPaint = new TextPaint(1);
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
        this.users = new TLRPC.User[10];
        this.userTitleWidths = new float[10];
        this.needNewRow = new boolean[10];
        this.clickRect = new Rect[10];
        ImageReceiver imageReceiver = new ImageReceiver(this.parentView);
        this.giftReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        Paint paint = this.clipRectPaint;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.counterTextPaint.setTypeface(AndroidUtilities.bold());
        this.counterTextPaint.setXfermode(new PorterDuffXfermode(mode));
        this.counterTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
        TextPaint textPaint = this.counterTextPaint;
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        this.counterStarsTextPaint.setTypeface(AndroidUtilities.bold());
        this.counterStarsTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.counterStarsTextPaint.setTextAlign(align);
        this.counterStarsTextPaint.setColor(-1);
        this.chatTextPaint.setTypeface(AndroidUtilities.bold());
        this.chatTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.countriesTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.textDividerPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.textDividerPaint.setTextAlign(align);
    }

    public boolean checkMotionEvent(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            if (this.links == null) {
                this.links = new LinkSpanDrawable.LinkCollector(this.parentView);
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.topStringBuilder != null && (staticLayout = this.topLayout) != null && (i = y - this.subTitleMarginTop) > 0) {
                int offsetForHorizontal = this.topLayout.getOffsetForHorizontal(staticLayout.getLineForVertical(i - AndroidUtilities.dp(10.0f)), x - this.subTitleMarginLeft);
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
                            LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
                            linkPathObtainNewPath.setCurrentLayout(this.topLayout, spanStart, this.subTitleMarginLeft, this.subTitleMarginTop);
                            this.topLayout.getSelectionPath(spanStart, this.topStringBuilder.getSpanEnd(clickableSpanArr[0]), linkPathObtainNewPath);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    return true;
                }
                this.links.clear();
                this.parentView.invalidate();
            }
            if (action == 0) {
                int i2 = 0;
                while (true) {
                    Rect[] rectArr = this.clickRect;
                    if (i2 < rectArr.length) {
                        if (rectArr[i2].contains(x, y)) {
                            this.pressedPos = i2;
                            this.selectorDrawable.setHotspot(x, y);
                            this.isButtonPressed = true;
                            setButtonPressed(true);
                            return true;
                        }
                        i2++;
                    } else {
                        if (!this.containerRect.contains(x, y)) {
                            break;
                        }
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
        } else {
            this.selectorDrawable.setState(StateSet.NOTHING);
            this.parentView.invalidate();
        }
    }

    public void setMessageContent(final MessageObject messageObject, int i, int i2) {
        this.messageObject = null;
        this.titleLayout = null;
        this.topLayout = null;
        this.bottomLayout = null;
        this.countriesLayout = null;
        this.measuredHeight = 0;
        this.measuredWidth = 0;
        this.isStars = false;
        if (messageObject.isGiveawayResults()) {
            this.messageObject = messageObject;
            init();
            createImages();
            setGiftImage();
            final TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            checkArraysLimits(tL_messageMediaGiveawayResults.winners.size());
            int iDp = AndroidUtilities.dp(90.0f);
            int iDp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderReplaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags.length(), 33);
            this.topStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                @Override
                public final void run() {
                    GiveawayResultsMessageCell.$r8$lambda$_7RBugZXgBva8JAtpmq38RSSLCk(this.f$0, messageObject, tL_messageMediaGiveawayResults);
                }
            });
            this.topStringBuilder.append((CharSequence) AndroidUtilities.replaceCharSequence("%1$d", spannableStringBuilderReplaceSingleTag, AndroidUtilities.replaceTags("**" + tL_messageMediaGiveawayResults.winners_count + "**")));
            this.topStringBuilder.append((CharSequence) "\n\n");
            this.topStringBuilder.setSpan(new RelativeSizeSpan(0.4f), this.topStringBuilder.length() + (-1), this.topStringBuilder.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinners", tL_messageMediaGiveawayResults.winners_count));
            this.topStringBuilder.append((CharSequence) spannableStringBuilderReplaceTags2);
            this.topStringBuilder.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilderReplaceSingleTag.length() + 2, spannableStringBuilderReplaceSingleTag.length() + 2 + spannableStringBuilderReplaceTags2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayResultsMsgAllAndMoreWinners", tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            boolean z = (tL_messageMediaGiveawayResults.flags & 32) != 0;
            this.isStars = z;
            if (z) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringSpaced("BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            }
            TextPaint textPaint = this.textPaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float fDp = AndroidUtilities.dp(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.titleLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint, iDp2, alignment, 1.0f, fDp, false, truncateAt, iDp2, 10);
            this.topLayout = StaticLayoutEx.createStaticLayout(this.topStringBuilder, this.textPaint, iDp2, alignment, 1.0f, AndroidUtilities.dp(2.0f), false, truncateAt, iDp2, 10);
            this.bottomLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder2, this.textPaint, iDp2, alignment, 1.0f, AndroidUtilities.dp(3.0f), false, truncateAt, iDp2, 10);
            int iMax = Math.max(i2, iDp2);
            this.diffTextWidth = iMax - iDp2;
            float f = iMax;
            float f2 = iDp;
            float f3 = f2 / 2.0f;
            this.giftReceiver.setImageCoords((f / 2.0f) - f3, AndroidUtilities.dp(70.0f) - f3, f2, f2);
            StaticLayout staticLayout = this.titleLayout;
            int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
            this.titleHeight = lineBottom;
            StaticLayout staticLayout2 = this.topLayout;
            this.topHeight = lineBottom + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            StaticLayout staticLayout3 = this.bottomLayout;
            this.bottomHeight = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.countriesLayout;
            int lineBottom2 = staticLayout4 != null ? staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(12.0f) : 0;
            this.countriesHeight = lineBottom2;
            int i3 = this.measuredHeight + this.topHeight + lineBottom2 + this.bottomHeight;
            this.measuredHeight = i3;
            this.measuredHeight = i3 + AndroidUtilities.dp(128.0f);
            this.measuredWidth = iMax;
            if (this.isStars) {
                if (this.counterIcon == null) {
                    this.counterIcon = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.counterStr = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.counterIcon = null;
                this.counterStr = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint2 = this.counterTextPaint;
            String str = this.counterStr;
            textPaint2.getTextBounds(str, 0, str.length(), this.counterTextBounds);
            if (this.isStars) {
                this.counterTextBounds.right += AndroidUtilities.dp(20.0f);
            }
            Arrays.fill(this.avatarVisible, false);
            this.measuredHeight += AndroidUtilities.dp(30.0f);
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Long l = arrayList2.get(i4);
                i4++;
                Long l2 = l;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getUser(l2) != null) {
                    arrayList.add(l2);
                }
            }
            float f4 = 0.0f;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Long l3 = (Long) arrayList.get(i5);
                long jLongValue = l3.longValue();
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l3);
                if (user != null) {
                    this.avatarVisible[i5] = true;
                    this.users[i5] = user;
                    this.userTitles[i5] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user), this.chatTextPaint.getFontMetricsInt(), false), this.chatTextPaint, 0.8f * f, TextUtils.TruncateAt.END);
                    float[] fArr = this.userTitleWidths;
                    TextPaint textPaint3 = this.chatTextPaint;
                    CharSequence charSequence = this.userTitles[i5];
                    fArr[i5] = textPaint3.measureText(charSequence, 0, charSequence.length());
                    float fDp2 = this.userTitleWidths[i5] + AndroidUtilities.dp(40.0f);
                    f4 += fDp2;
                    if (i5 > 0) {
                        boolean[] zArr = this.needNewRow;
                        boolean z2 = f4 > 0.9f * f;
                        zArr[i5] = z2;
                        if (z2) {
                            this.measuredHeight += AndroidUtilities.dp(30.0f);
                            f4 = fDp2;
                        }
                    } else {
                        this.needNewRow[i5] = false;
                    }
                    this.avatarDrawables[i5].setInfo(user);
                    this.avatarImageReceivers[i5].setForUserOrChat(user, this.avatarDrawables[i5]);
                    this.avatarImageReceivers[i5].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.users[i5] = null;
                    this.avatarVisible[i5] = false;
                    this.userTitles[i5] = "";
                    this.needNewRow[i5] = false;
                    this.userTitleWidths[i5] = AndroidUtilities.dp(20.0f);
                    this.avatarDrawables[i5].setInfo(jLongValue, "", "");
                }
            }
        }
    }

    public static void $r8$lambda$_7RBugZXgBva8JAtpmq38RSSLCk(final GiveawayResultsMessageCell giveawayResultsMessageCell, final MessageObject messageObject, final TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults) {
        giveawayResultsMessageCell.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiveawayResultsMessageCell.m2665$r8$lambda$kTQvcxCPh48zQLLCS3hyqK1gHw(this.f$0, messageObject, tL_messageMediaGiveawayResults);
            }
        });
    }

    public static void m2665$r8$lambda$kTQvcxCPh48zQLLCS3hyqK1gHw(GiveawayResultsMessageCell giveawayResultsMessageCell, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults) {
        giveawayResultsMessageCell.getClass();
        if (messageObject.getDialogId() == (-tL_messageMediaGiveawayResults.channel_id)) {
            giveawayResultsMessageCell.parentView.getDelegate().didPressReplyMessage(giveawayResultsMessageCell.parentView, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
        bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
        LaunchActivity.getLastFragment().presentFragment(new ChatActivity(bundle));
    }

    private int getUserColor(TLRPC.User user, Theme.ResourcesProvider resourcesProvider) {
        if (this.messageObject.isOutOwner()) {
            return Theme.getColor(Theme.key_chat_outPreviewInstantText, resourcesProvider);
        }
        int colorId = UserObject.getColorId(user);
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
            Drawable drawableCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(color, 12, 12);
            this.selectorDrawable = drawableCreateRadSelectorDrawable;
            drawableCreateRadSelectorDrawable.setCallback(this.parentView);
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
        if (this.isStars) {
            this.counterBgPaint.setColor(Theme.getColor(Theme.key_starsGradient1, resourcesProvider));
        }
        canvas.save();
        int iDp = i2 - AndroidUtilities.dp(4.0f);
        float f = iDp;
        canvas.translate(f, i);
        this.containerRect.set(iDp, i, getMeasuredWidth() + iDp, getMeasuredHeight() + i);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.saveLayerPaint, 31);
        this.giftReceiver.draw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float fDp = AndroidUtilities.dp(106.0f);
        int iWidth = this.counterTextBounds.width() + AndroidUtilities.dp(12.0f);
        int iHeight = this.counterTextBounds.height() + AndroidUtilities.dp(10.0f);
        this.countRect.set(measuredWidth - ((AndroidUtilities.dp(2.0f) + iWidth) / 2.0f), fDp - ((iHeight + AndroidUtilities.dp(2.0f)) / 2.0f), ((iWidth + AndroidUtilities.dp(2.0f)) / 2.0f) + measuredWidth, ((iHeight + AndroidUtilities.dp(2.0f)) / 2.0f) + fDp);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.clipRectPaint);
        float f2 = iWidth / 2.0f;
        float f3 = iHeight / 2.0f;
        this.countRect.set(measuredWidth - f2, fDp - f3, f2 + measuredWidth, fDp + f3);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.counterBgPaint);
        Drawable drawable = this.counterIcon;
        if (drawable != null) {
            drawable.setBounds(((int) this.countRect.left) + AndroidUtilities.dp(5.0f), ((int) this.countRect.centerY()) - AndroidUtilities.dp(6.96f), ((int) this.countRect.left) + AndroidUtilities.dp(21.24f), ((int) this.countRect.centerY()) + AndroidUtilities.dp(6.96f));
            this.counterIcon.draw(canvas);
        }
        canvas.drawText(this.counterStr, this.countRect.centerX() + AndroidUtilities.dp(this.isStars ? 8.0f : 0.0f), this.countRect.centerY() + AndroidUtilities.dp(4.0f), this.isStars ? this.counterStarsTextPaint : this.counterTextPaint);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
        int iDp2 = AndroidUtilities.dp(128.0f) + i;
        this.subTitleMarginTop = this.titleHeight + iDp2;
        this.subTitleMarginLeft = (int) (f + (this.diffTextWidth / 2.0f));
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleHeight);
        this.topLayout.draw(canvas);
        canvas.restore();
        canvas.translate(0.0f, this.topHeight + AndroidUtilities.dp(6.0f));
        int i6 = 0;
        int iDp3 = iDp2 + this.topHeight + AndroidUtilities.dp(6.0f);
        int i7 = 0;
        while (true) {
            boolean[] zArr2 = this.avatarVisible;
            if (i6 >= zArr2.length) {
                break;
            }
            if (zArr2[i6]) {
                canvas.save();
                int i8 = i6;
                float fDp2 = 0.0f;
                do {
                    fDp2 += this.userTitleWidths[i8] + AndroidUtilities.dp(40.0f);
                    i8++;
                    zArr = this.avatarVisible;
                    if (i8 >= zArr.length || this.needNewRow[i8]) {
                        break;
                    }
                } while (zArr[i8]);
                float f4 = measuredWidth - (fDp2 / 2.0f);
                canvas.translate(f4, 0.0f);
                int iWidth2 = ((int) f4) + iDp;
                int i9 = i6;
                while (true) {
                    int userColor = getUserColor(this.users[i9], resourcesProvider);
                    int i10 = this.pressedPos;
                    i3 = (i10 < 0 || i10 != i9) ? i7 : userColor;
                    this.chatTextPaint.setColor(userColor);
                    this.chatBgPaint.setColor(userColor);
                    this.chatBgPaint.setAlpha(25);
                    this.avatarImageReceivers[i9].draw(canvas);
                    CharSequence charSequence = this.userTitles[i9];
                    int i11 = iWidth2;
                    canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.chatTextPaint);
                    this.chatRect.set(0.0f, 0.0f, this.userTitleWidths[i9] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas.drawRoundRect(this.chatRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.chatBgPaint);
                    float f5 = i11;
                    this.clickRect[i9].set(i11, iDp3, (int) (this.chatRect.width() + f5), AndroidUtilities.dp(24.0f) + iDp3);
                    canvas.translate(this.chatRect.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    iWidth2 = (int) (f5 + this.chatRect.width() + AndroidUtilities.dp(6.0f));
                    i9++;
                    boolean[] zArr3 = this.avatarVisible;
                    if (i9 >= zArr3.length || this.needNewRow[i9] || !zArr3[i9]) {
                        break;
                    } else {
                        i7 = i3;
                    }
                }
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                iDp3 += AndroidUtilities.dp(30.0f);
                i6 = i9;
                i7 = i3;
            } else {
                i6++;
            }
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
            int iMultAlpha = Theme.multAlpha(i7, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            if (this.selectorColor != iMultAlpha) {
                Drawable drawable2 = this.selectorDrawable;
                this.selectorColor = iMultAlpha;
                Theme.setSelectorDrawableColor(drawable2, iMultAlpha, true);
            }
            this.selectorDrawable.setBounds(this.clickRect[this.pressedPos]);
            this.selectorDrawable.setCallback(this.parentView);
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
            this.users = (TLRPC.User[]) Arrays.copyOf(this.users, i);
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

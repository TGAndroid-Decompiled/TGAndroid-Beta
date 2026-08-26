package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;

public final class TableView extends android.widget.TableLayout {
    public final Paint backgroundPaint;
    public final Paint borderPaint;
    public final float hw;
    public final Path path;
    public final float[] radii;
    public final Theme.ResourcesProvider resourcesProvider;
    public final float w;

    public final class AnonymousClass2 extends ClickableSpan {
        public final int $r8$classId;
        public final Runnable val$onClick;

        public AnonymousClass2(int i, Runnable runnable) {
            this.$r8$classId = i;
            this.val$onClick = runnable;
        }

        @Override
        public final void onClick(View view) {
            switch (this.$r8$classId) {
                case 0:
                    Runnable runnable = this.val$onClick;
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
                case 1:
                    this.val$onClick.run();
                    break;
                case 2:
                    Runnable runnable2 = this.val$onClick;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    break;
                default:
                    Runnable runnable3 = this.val$onClick;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    break;
            }
        }

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            switch (this.$r8$classId) {
                case 0:
                    textPaint.setUnderlineText(false);
                    break;
                case 1:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    break;
                case 2:
                    textPaint.setUnderlineText(false);
                    break;
                default:
                    textPaint.setUnderlineText(false);
                    break;
            }
        }
    }

    public final class TableRowContent extends FrameLayout {
        public boolean first;
        public boolean last;
        public boolean left;
        public boolean right;
        public final TableView table;

        public TableRowContent(TableView tableView, View view, boolean z) {
            super(tableView.getContext());
            this.left = false;
            this.right = true;
            this.table = tableView;
            setWillNotDraw(false);
            if (!z) {
                setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            }
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            boolean z = this.first;
            TableView tableView = this.table;
            if (z || this.last) {
                canvas2 = canvas;
                float fDp = AndroidUtilities.dp(10.0f);
                float[] fArr = tableView.radii;
                boolean z2 = this.first;
                float f = (z2 && this.left) ? fDp : 0.0f;
                fArr[1] = f;
                fArr[0] = f;
                float f2 = (z2 && this.right) ? fDp : 0.0f;
                fArr[3] = f2;
                fArr[2] = f2;
                boolean z3 = this.last;
                float f3 = (z3 && this.right) ? fDp : 0.0f;
                fArr[5] = f3;
                fArr[4] = f3;
                if (!z3 || !this.left) {
                    fDp = 0.0f;
                }
                fArr[7] = fDp;
                fArr[6] = fDp;
                tableView.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                float f4 = tableView.hw;
                rectF.set(f4, f4, getWidth() - tableView.hw, (tableView.hw * AndroidUtilities.dp(this.last ? -1.0f : 1.0f)) + getHeight());
                if (!this.right) {
                    rectF.right += tableView.w;
                }
                tableView.path.addRoundRect(rectF, tableView.radii, Path.Direction.CW);
                canvas2.drawPath(tableView.path, tableView.borderPaint);
            } else {
                float f5 = tableView.hw;
                canvas2 = canvas;
                canvas2.drawRect(f5, f5, getWidth() - tableView.hw, getHeight() + tableView.hw, tableView.borderPaint);
            }
            super.onDraw(canvas2);
        }
    }

    public final class TableRowFullContent extends FrameLayout {
        public boolean filled;
        public boolean first;
        public boolean last;
        public final TableView table;

        public TableRowFullContent(TableView tableView, View view, boolean z) {
            super(tableView.getContext());
            this.table = tableView;
            setWillNotDraw(false);
            if (!z) {
                setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            }
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            boolean z = this.first;
            TableView tableView = this.table;
            if (z || this.last) {
                canvas2 = canvas;
                float fDp = AndroidUtilities.dp(10.0f);
                float[] fArr = tableView.radii;
                boolean z2 = this.first;
                float f = z2 ? fDp : 0.0f;
                fArr[1] = f;
                fArr[0] = f;
                float f2 = z2 ? fDp : 0.0f;
                fArr[3] = f2;
                fArr[2] = f2;
                boolean z3 = this.last;
                float f3 = z3 ? fDp : 0.0f;
                fArr[5] = f3;
                fArr[4] = f3;
                if (!z3) {
                    fDp = 0.0f;
                }
                fArr[7] = fDp;
                fArr[6] = fDp;
                tableView.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                float f4 = tableView.hw;
                rectF.set(f4, f4, getWidth() - tableView.hw, (tableView.hw * AndroidUtilities.dp(this.last ? -1.0f : 1.0f)) + getHeight());
                tableView.path.addRoundRect(rectF, tableView.radii, Path.Direction.CW);
                if (this.filled) {
                    canvas2.drawPath(tableView.path, tableView.backgroundPaint);
                }
                canvas2.drawPath(tableView.path, tableView.borderPaint);
            } else {
                if (this.filled) {
                    float f5 = tableView.hw;
                    canvas2 = canvas;
                    canvas2.drawRect(f5, f5, getWidth() + tableView.hw, getHeight() + tableView.hw, tableView.backgroundPaint);
                } else {
                    canvas2 = canvas;
                }
                float f6 = tableView.hw;
                canvas2.drawRect(f6, f6, getWidth() - tableView.hw, getHeight() + tableView.hw, tableView.borderPaint);
            }
            super.onDraw(canvas2);
        }

        public void setFilled(boolean z) {
            this.filled = z;
        }
    }

    public final class TableRowTitle extends TextView {
        public boolean first;
        public boolean last;
        public final TableView table;

        public TableRowTitle(TableView tableView, String str) {
            super(tableView.getContext());
            this.table = tableView;
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, tableView.resourcesProvider));
            setTypeface(AndroidUtilities.bold());
            setTextSize(1, 14.0f);
            setText(str);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            boolean z = this.first;
            TableView tableView = this.table;
            if (z || this.last) {
                canvas2 = canvas;
                float fDp = AndroidUtilities.dp(10.0f);
                float[] fArr = tableView.radii;
                float f = this.first ? fDp : 0.0f;
                fArr[1] = f;
                fArr[0] = f;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
                if (!this.last) {
                    fDp = 0.0f;
                }
                fArr[7] = fDp;
                fArr[6] = fDp;
                tableView.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                float f2 = tableView.hw;
                rectF.set(f2, f2, getWidth() + tableView.hw, (tableView.hw * AndroidUtilities.dp(this.last ? -1.0f : 1.0f)) + getHeight());
                tableView.path.addRoundRect(rectF, tableView.radii, Path.Direction.CW);
                canvas2.drawPath(tableView.path, tableView.backgroundPaint);
                canvas2.drawPath(tableView.path, tableView.borderPaint);
            } else {
                float f3 = tableView.hw;
                canvas2 = canvas;
                canvas2.drawRect(f3, f3, getWidth() + tableView.hw, getHeight() + tableView.hw, tableView.backgroundPaint);
                float f4 = tableView.hw;
                canvas2.drawRect(f4, f4, getWidth() + tableView.hw, getHeight() + tableView.hw, tableView.borderPaint);
            }
            super.onDraw(canvas2);
        }
    }

    public TableView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.path = new Path();
        this.radii = new float[8];
        this.backgroundPaint = new Paint(1);
        this.borderPaint = new Paint(1);
        float fMax = Math.max(1, AndroidUtilities.dp(0.66f));
        this.w = fMax;
        this.hw = fMax / 2.0f;
        this.resourcesProvider = resourcesProvider;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final TableRowFullContent addFullRow(CharSequence charSequence) {
        SpoilersTextView spoilersTextView = new SpoilersTextView(getContext(), null, true);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        spoilersTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        spoilersTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        spoilersTextView.setTextSize(1, 14.0f);
        spoilersTextView.setText(Emoji.replaceEmoji(charSequence, spoilersTextView.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(spoilersTextView);
        spoilersTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        TableRowFullContent tableRowFullContent = new TableRowFullContent(this, spoilersTextView, true);
        tableRow.addView(tableRowFullContent, layoutParams);
        addView(tableRow);
        return tableRowFullContent;
    }

    public final TableRow addRow(CharSequence charSequence, String str) {
        return addRow(str, charSequence, null, null);
    }

    public final void addRowDateTime(int i, String str) {
        long j = ((long) i) * 1000;
        addRow(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j)), LocaleController.getInstance().getFormatterDay().format(new Date(j))), null, null);
    }

    public final void addRowLink(String str, String str2, Runnable runnable) {
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i = Theme.key_chat_messageLinkIn;
        linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(i, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setSingleLine(true);
        linksTextView.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new AnonymousClass2(3, runnable), 0, spannableStringBuilder.length(), 33);
        linksTextView.setText(spannableStringBuilder);
        addRowUnpadded(linksTextView, str);
    }

    public final void addRowMonospaced(int i, CharSequence charSequence, StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18, String str) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i);
        int i2 = Theme.key_dialogTextBlack;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = Theme.key_windowBackgroundWhiteBlueIcon;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(18, charSequence, stickersActivity$$ExternalSyntheticLambda18));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i3, resourcesProvider)), 7, -1));
        frameLayout.addView(imageView, LayoutHelper.createFrame(30, 30, 21));
        addRowUnpadded(frameLayout, str);
    }

    public final TableRow addRowUnpadded(View view, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new TableRowTitle(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new TableRowContent(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void addRowUser(String str, int i, long j, Runnable runnable) {
        addRowUser(str, i, j, runnable, null, null);
    }

    public final TableRow addRowUserWithEmojiStatus(String str, final int i, final long j, Runnable runnable) {
        String userName;
        boolean z;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        final LinkSpanDrawable.LinksSimpleTextView linksSimpleTextView = new LinkSpanDrawable.LinksSimpleTextView(context, resourcesProvider);
        linksSimpleTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i2 = Theme.key_featuredStickers_addButton;
        linksSimpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksSimpleTextView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        linksSimpleTextView.setTextSize(14);
        AvatarSpan avatarSpan = new AvatarSpan(linksSimpleTextView, 24.0f, i);
        ImageReceiver imageReceiver = avatarSpan.imageReceiver;
        if (j == 2666000) {
            userName = LocaleController.getString(R.string.StarsTransactionHidden);
            CombinedDrawable platformDrawable = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "anonymous");
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            platformDrawable.iconWidth = iDp;
            platformDrawable.iconHeight = iDp2;
            imageReceiver.setImageBitmap(platformDrawable);
            z = false;
        } else {
            if (UserObject.isService(j)) {
                userName = LocaleController.getString(R.string.StarsTransactionUnknown);
                CombinedDrawable platformDrawable2 = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "fragment");
                int iDp3 = AndroidUtilities.dp(16.0f);
                int iDp4 = AndroidUtilities.dp(16.0f);
                platformDrawable2.iconWidth = iDp3;
                platformDrawable2.iconHeight = iDp4;
                imageReceiver.setImageBitmap(platformDrawable2);
            } else if (j >= 0) {
                TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                userName = UserObject.getUserName(user);
                avatarSpan.setUser(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                userName = chat == null ? "" : chat.title;
                avatarSpan.setChat(chat);
            }
            z = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
        if (z) {
            linksSimpleTextView.setClickable(true);
            spannableStringBuilder.setSpan(new AnonymousClass2(0, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int color = Theme.getColor(i2, resourcesProvider);
        final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(linksSimpleTextView, false, AndroidUtilities.dp(20.0f), 7);
        swapAnimatedEmojiDrawable.setColor(Integer.valueOf(color));
        swapAnimatedEmojiDrawable.offsetX = AndroidUtilities.dp(12.0f);
        swapAnimatedEmojiDrawable.offsetY = 0;
        linksSimpleTextView.addOnAttachStateChangeListener(new ChatActivity.AnonymousClass101(swapAnimatedEmojiDrawable, 1));
        final Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z2;
                long emojiStatusDocumentId;
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2;
                LinkSpanDrawable.LinksSimpleTextView linksSimpleTextView2;
                long j2 = j;
                if (j2 == 2666000 || UserObject.isService(j2)) {
                    return;
                }
                int i3 = i;
                if (j2 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i3).getUser(Long.valueOf(j2));
                    emojiStatus = user2 != null ? user2.emoji_status : null;
                    if (user2 != null && user2.premium) {
                        z2 = true;
                    }
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                    swapAnimatedEmojiDrawable2 = swapAnimatedEmojiDrawable;
                    linksSimpleTextView2 = linksSimpleTextView;
                    if (emojiStatusDocumentId != 0) {
                        swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId, true);
                        swapAnimatedEmojiDrawable2.setParticles(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                        linksSimpleTextView2.setRightDrawable(swapAnimatedEmojiDrawable2);
                    } else if (z2) {
                        swapAnimatedEmojiDrawable2.set(drawableMutate, true);
                        swapAnimatedEmojiDrawable2.setParticles(false, true);
                        linksSimpleTextView2.setRightDrawable(swapAnimatedEmojiDrawable2);
                    } else {
                        linksSimpleTextView2.setRightDrawable((Drawable) null);
                    }
                    swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(color));
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(-j2));
                emojiStatus = chat2 != null ? chat2.emoji_status : null;
                z2 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                swapAnimatedEmojiDrawable2 = swapAnimatedEmojiDrawable;
                linksSimpleTextView2 = linksSimpleTextView;
                if (emojiStatusDocumentId != 0) {
                    swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId, true);
                    swapAnimatedEmojiDrawable2.setParticles(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                    linksSimpleTextView2.setRightDrawable(swapAnimatedEmojiDrawable2);
                } else if (z2) {
                    swapAnimatedEmojiDrawable2.set(drawableMutate, true);
                    swapAnimatedEmojiDrawable2.setParticles(false, true);
                    linksSimpleTextView2.setRightDrawable(swapAnimatedEmojiDrawable2);
                } else {
                    linksSimpleTextView2.setRightDrawable((Drawable) null);
                }
                swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(color));
            }
        };
        callback.run(null);
        linksSimpleTextView.setRightDrawable(swapAnimatedEmojiDrawable);
        NotificationCenter.getInstance(i).listen(linksSimpleTextView, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i).listen(linksSimpleTextView, NotificationCenter.userEmojiStatusUpdated, callback);
        linksSimpleTextView.setText(spannableStringBuilder, false);
        return addRowUnpadded(linksSimpleTextView, str);
    }

    public final void addWalletAddressRow(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), null);
        linksTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        linksTextView.setTextSize(1, 13.0f);
        int i = Theme.key_dialogTextBlack;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setMaxLines(1);
        linksTextView.setSingleLine();
        linksTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new AboutLinkCell.AnonymousClass5(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        linksTextView.setText(spannableStringBuilder);
        linksTextView.setDisablePaddingsOffsetY(true);
        linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(linksTextView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        addRowUnpadded(frameLayout, str);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        Paint paint = this.borderPaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.w);
        int i5 = Theme.key_table_border;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(Theme.getColor(i5, resourcesProvider));
        Paint paint2 = this.backgroundPaint;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Theme.getColor(Theme.key_table_background, resourcesProvider));
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            if (getChildAt(i6) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i6);
                int childCount2 = tableRow.getChildCount();
                int i7 = 0;
                while (i7 < childCount2) {
                    View childAt = tableRow.getChildAt(i7);
                    if (childAt instanceof TableRowTitle) {
                        TableRowTitle tableRowTitle = (TableRowTitle) childAt;
                        boolean z3 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (tableRowTitle.first != z3 || tableRowTitle.last != z2) {
                            tableRowTitle.first = z3;
                            tableRowTitle.last = z2;
                            tableRowTitle.invalidate();
                        }
                    } else if (childAt instanceof TableRowContent) {
                        TableRowContent tableRowContent = (TableRowContent) childAt;
                        boolean z4 = i6 == 0;
                        boolean z5 = i6 == childCount + (-1);
                        if (tableRowContent.first != z4 || tableRowContent.last != z5) {
                            tableRowContent.first = z4;
                            tableRowContent.last = z5;
                            tableRowContent.invalidate();
                        }
                        boolean z6 = i7 == 0;
                        z2 = i7 == childCount2 + (-1);
                        if (tableRowContent.left != z6 || tableRowContent.right != z2) {
                            tableRowContent.left = z6;
                            tableRowContent.right = z2;
                            tableRowContent.invalidate();
                        }
                    } else if (childAt instanceof TableRowFullContent) {
                        TableRowFullContent tableRowFullContent = (TableRowFullContent) childAt;
                        boolean z7 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (tableRowFullContent.first != z7 || tableRowFullContent.last != z2) {
                            tableRowFullContent.first = z7;
                            tableRowFullContent.last = z2;
                            tableRowFullContent.invalidate();
                        }
                    }
                    i7++;
                }
            }
            i6++;
        }
    }

    public final TableRow addRow(String str, CharSequence charSequence, TableRowTitle[] tableRowTitleArr, ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        ButtonSpan.TextViewButtons textViewButtons = new ButtonSpan.TextViewButtons(getContext(), null);
        textViewButtons.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        textViewButtons.setTextSize(1, 14.0f);
        textViewButtons.setText(Emoji.replaceEmoji(charSequence, textViewButtons.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(textViewButtons);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        TableRowTitle tableRowTitle = new TableRowTitle(this, str);
        if (tableRowTitleArr != null) {
            tableRowTitleArr[0] = tableRowTitle;
        }
        tableRow.addView(tableRowTitle, layoutParams);
        tableRow.addView(new TableRowContent(this, textViewButtons, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (textViewButtonsArr != null) {
            textViewButtonsArr[0] = textViewButtons;
        }
        return tableRow;
    }

    public final void addRowUser(String str, int i, long j, Runnable runnable, String str2, Runnable runnable2) {
        boolean z;
        String userName;
        String string;
        boolean z2;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        ButtonSpan.TextViewButtons textViewButtons = new ButtonSpan.TextViewButtons(context, resourcesProvider);
        textViewButtons.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        textViewButtons.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = Theme.key_chat_messageLinkIn;
        textViewButtons.setTextColor(Theme.getColor(i2, resourcesProvider));
        textViewButtons.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        textViewButtons.setTextSize(1, 14.0f);
        textViewButtons.setSingleLine(true);
        textViewButtons.setDisablePaddingsOffsetY(true);
        AvatarSpan avatarSpan = new AvatarSpan(textViewButtons, 24.0f, i);
        ImageReceiver imageReceiver = avatarSpan.imageReceiver;
        if (j == 2666000) {
            string = LocaleController.getString(R.string.StarsTransactionHidden);
            CombinedDrawable platformDrawable = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "anonymous");
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            platformDrawable.iconWidth = iDp;
            platformDrawable.iconHeight = iDp2;
            imageReceiver.setImageBitmap(platformDrawable);
            z = false;
            z2 = false;
        } else {
            if (UserObject.isService(j)) {
                string = LocaleController.getString(R.string.StarsTransactionUnknown);
                CombinedDrawable platformDrawable2 = StarsIntroActivity.StarsTransactionView.getPlatformDrawable(44, "fragment");
                int iDp3 = AndroidUtilities.dp(16.0f);
                int iDp4 = AndroidUtilities.dp(16.0f);
                platformDrawable2.iconWidth = iDp3;
                platformDrawable2.iconHeight = iDp4;
                imageReceiver.setImageBitmap(platformDrawable2);
                z = false;
            } else {
                if (j >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                    z = user == null;
                    userName = UserObject.getUserName(user);
                    avatarSpan.setUser(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                    z = chat == null;
                    userName = chat == null ? "" : chat.title;
                    avatarSpan.setChat(chat);
                }
                string = userName;
            }
            z2 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) string));
        spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
        if (z2) {
            spannableStringBuilder.setSpan(new AnonymousClass2(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str2 != null) {
            textViewButtons.buttonToBeAdded = new ButtonSpan(runnable2, str2, resourcesProvider);
        }
        textViewButtons.setText(spannableStringBuilder);
        if (z) {
            return;
        }
        addRowUnpadded(textViewButtons, str);
    }

    public final void addFullRow(CharSequence charSequence, ArrayList arrayList) {
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(getContext());
        textViewEmojis.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        textViewEmojis.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        textViewEmojis.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textViewEmojis.getPaint().getFontMetricsInt(), false), arrayList, textViewEmojis.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(textViewEmojis);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new TableRowFullContent(this, textViewEmojis, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow addRow(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        ButtonSpan.TextViewButtons textViewButtons = new ButtonSpan.TextViewButtons(getContext(), null);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        textViewButtons.setTextColor(Theme.getColor(i, resourcesProvider));
        textViewButtons.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, textViewButtons.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ButtonSpan.make(str2, runnable, resourcesProvider, num));
        }
        textViewButtons.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(textViewButtons);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new TableRowTitle(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new TableRowContent(this, textViewButtons, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }
}

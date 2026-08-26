package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesUtilities;

public abstract class StatisticPostInfoCell extends FrameLayout {
    private final AvatarDrawable avatarDrawable;
    private final TLRPC.ChatFull chat;
    private final TextView date;
    private final Paint dividerPaint;
    private final BackupImageView imageView;
    private final TextView likes;
    private final SimpleTextView message;
    private boolean needDivider;
    private StatisticActivity.RecentPostInfo postInfo;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TextView shares;
    private final StoriesUtilities.AvatarStoryParams storyAvatarParams;
    private final TextView views;

    public final class AnonymousClass2 extends SimpleTextView {
        @Override
        public final boolean setText(CharSequence charSequence) {
            return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false));
        }
    }

    public StatisticPostInfoCell(Context context, TLRPC.ChatFull chatFull, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint(1);
        this.avatarDrawable = new AvatarDrawable();
        this.storyAvatarParams = new StoriesUtilities.AvatarStoryParams(false, null);
        this.chat = chatFull;
        this.resourcesProvider = resourcesProvider;
        BackupImageView backupImageView = new BackupImageView(context) {
            @Override
            public final void onDraw(Canvas canvas) {
                StatisticPostInfoCell statisticPostInfoCell = StatisticPostInfoCell.this;
                if (statisticPostInfoCell.postInfo == null || !statisticPostInfoCell.postInfo.isStory()) {
                    super.onDraw(canvas);
                    return;
                }
                int iDp = AndroidUtilities.dp(1.0f);
                float f = iDp;
                statisticPostInfoCell.storyAvatarParams.originalAvatarRect.set(f, f, getMeasuredWidth() - iDp, getMeasuredHeight() - iDp);
                statisticPostInfoCell.storyAvatarParams.drawSegments = false;
                statisticPostInfoCell.storyAvatarParams.animate = false;
                statisticPostInfoCell.storyAvatarParams.drawInside = true;
                statisticPostInfoCell.storyAvatarParams.isArchive = false;
                statisticPostInfoCell.storyAvatarParams.forceState = 1;
                statisticPostInfoCell.storyAvatarParams.resourcesProvider = resourcesProvider;
                StoriesUtilities.drawAvatarWithStory(0L, canvas, this.imageReceiver, statisticPostInfoCell.storyAvatarParams);
            }
        };
        this.imageView = backupImageView;
        setClipChildren(false);
        boolean z = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (!z ? 8388611 : 8388613) | 16, !z ? 12.0f : 16.0f, 0.0f, !z ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.message = anonymousClass2;
        NotificationCenter.listenEmojiLoading(anonymousClass2);
        anonymousClass2.setTypeface(AndroidUtilities.bold());
        anonymousClass2.setTextSize(16);
        anonymousClass2.setMaxLines(1);
        anonymousClass2.setTextColor(-16777216);
        anonymousClass2.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.views = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 80));
            linearLayoutM.addView(anonymousClass2, LayoutHelper.createLinear(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            linearLayoutM.addView(anonymousClass2, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 16, 0));
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 80));
        }
        linearLayout.addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.date = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.shares = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.likes = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout linearLayoutM2 = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
        if (LocaleController.isRTL) {
            linearLayoutM2.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 10, 0));
            linearLayoutM2.addView(textView4, LayoutHelper.createLinear(-2, -2, 16));
            linearLayoutM2.addView(textView2, LayoutHelper.createLinear(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            linearLayoutM2.addView(textView2, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 8, 0));
            linearLayoutM2.addView(textView4, LayoutHelper.createLinear(-2, -2, 16));
            linearLayoutM2.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(linearLayoutM2, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z2 = LocaleController.isRTL;
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, !z2 ? 72.0f : 18.0f, 0.0f, !z2 ? 18.0f : 72.0f, 0.0f));
        int i = Theme.key_dialogTextBlack;
        anonymousClass2.setTextColor(Theme.getColor(null, i, false));
        textView.setTextColor(Theme.getColor(null, i, false));
        int i2 = Theme.key_windowBackgroundWhiteGrayText3;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView3.setTextColor(Theme.getColor(null, i2, false));
        textView4.setTextColor(Theme.getColor(null, i2, false));
        Drawable drawableMutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        drawableMutate.setTint(Theme.getColor(null, i2, false));
        Drawable drawableMutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        drawableMutate2.setTint(Theme.getColor(null, i2, false));
        CombinedDrawable combinedDrawable = new CombinedDrawable(null, drawableMutate, 0, AndroidUtilities.dp(1.0f));
        combinedDrawable.setCustomSize(drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
        textView4.setCompoundDrawablesWithIntrinsicBounds(combinedDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        CombinedDrawable combinedDrawable2 = new CombinedDrawable(null, drawableMutate2, 0, AndroidUtilities.dp(1.0f));
        combinedDrawable2.setCustomSize(drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
        textView3.setCompoundDrawablesWithIntrinsicBounds(combinedDrawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.needDivider) {
            this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), this.dividerPaint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), this.dividerPaint);
            }
        }
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public StatisticActivity.RecentPostInfo getPostInfo() {
        return this.postInfo;
    }

    public StoriesUtilities.AvatarStoryParams getStoryAvatarParams() {
        return this.storyAvatarParams;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.storyAvatarParams.onDetachFromWindow();
    }

    public void setData(StatisticActivity.RecentPostInfo recentPostInfo, boolean z) {
        CharSequence string;
        this.postInfo = recentPostInfo;
        this.needDivider = !z;
        MessageObject messageObject = recentPostInfo.message;
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        if (arrayList != null) {
            this.imageView.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, messageObject);
            this.imageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            this.imageView.setScaleX(0.96f);
            this.imageView.setScaleY(0.96f);
        } else if (this.chat.chat_photo.sizes.size() > 0) {
            this.imageView.setImage(ImageLocation.getForPhoto(this.chat.chat_photo.sizes.get(0), this.chat.chat_photo), "50_50", (String) null, (Drawable) null, this.chat);
            this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            this.imageView.setScaleX(0.96f);
            this.imageView.setScaleY(0.96f);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(this.chat.id));
            this.avatarDrawable.setInfo(chat);
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
        }
        if (messageObject.isStory()) {
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        }
        if (messageObject.isMusic()) {
            string = zzjx.m(messageObject.getMusicTitle().trim(), ", ", messageObject.getMusicAuthor().trim());
        } else if (messageObject.isStory()) {
            string = LocaleController.getString(R.string.Story);
        } else {
            string = messageObject.caption;
            if (string == null) {
                string = messageObject.messageText;
            }
        }
        if (string == null) {
            string = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        this.message.setText(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
        this.views.setText(String.format(LocaleController.getPluralString("Views", recentPostInfo.getViews()), AndroidUtilities.formatWholeNumber(recentPostInfo.getViews(), 0)));
        Date date = new Date(recentPostInfo.getDate() * 1000);
        this.date.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
        this.shares.setText(AndroidUtilities.formatWholeNumber(recentPostInfo.getForwards(), 0));
        this.likes.setText(AndroidUtilities.formatWholeNumber(recentPostInfo.getReactions(), 0));
        this.shares.setVisibility(recentPostInfo.getForwards() != 0 ? 0 : 8);
        this.likes.setVisibility(recentPostInfo.getReactions() == 0 ? 8 : 0);
        invalidate();
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.imageView.setOnClickListener(onClickListener);
    }

    public void setData(StatisticActivity.MemberData memberData) {
        this.avatarDrawable.setInfo(memberData.user);
        this.imageView.setForUserOrChat(memberData.user, this.avatarDrawable);
        this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.message.setText(memberData.user.first_name);
        this.date.setText(memberData.description);
        this.views.setVisibility(8);
        this.shares.setVisibility(8);
        this.likes.setVisibility(8);
    }
}

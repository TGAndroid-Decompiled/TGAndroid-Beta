package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesUtilities;

public abstract class StatisticPostInfoCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final TLRPC.ChatFull chat;
    public final TextView date;
    public final Paint dividerPaint;
    public final AnonymousClass1 imageView;
    public final TextView likes;
    public final AnonymousClass2 message;
    public boolean needDivider;
    public StatisticActivity.RecentPostInfo postInfo;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView shares;
    public final StoriesUtilities.AvatarStoryParams storyAvatarParams;
    public final TextView views;

    public final class AnonymousClass2 extends SimpleTextView {
        @Override
        public final boolean setText(CharSequence charSequence) {
            return setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
        }
    }

    public StatisticPostInfoCell(Context context, TLRPC.ChatFull chatFull, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint(1);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.storyAvatarParams = new StoriesUtilities.AvatarStoryParams(null, false);
        this.chat = chatFull;
        this.resourcesProvider = resourcesProvider;
        ?? r3 = new BackupImageView(context) {
            @Override
            public final void onDraw(Canvas canvas) {
                StatisticPostInfoCell statisticPostInfoCell = StatisticPostInfoCell.this;
                StatisticActivity.RecentPostInfo recentPostInfo = statisticPostInfoCell.postInfo;
                if (recentPostInfo == null || !(recentPostInfo.counters instanceof TL_stats.TL_postInteractionCountersStory)) {
                    super.onDraw(canvas);
                    return;
                }
                int iDp = AndroidUtilities.dp(1.0f);
                float f = iDp;
                statisticPostInfoCell.storyAvatarParams.originalAvatarRect.set(f, f, getMeasuredWidth() - iDp, getMeasuredHeight() - iDp);
                StoriesUtilities.AvatarStoryParams avatarStoryParams = statisticPostInfoCell.storyAvatarParams;
                avatarStoryParams.drawSegments = false;
                avatarStoryParams.animate = false;
                avatarStoryParams.drawInside = true;
                avatarStoryParams.isArchive = false;
                avatarStoryParams.forceState = 1;
                avatarStoryParams.resourcesProvider = resourcesProvider;
                StoriesUtilities.drawAvatarWithStory(0L, canvas, this.imageReceiver, avatarStoryParams);
            }
        };
        this.imageView = r3;
        setClipChildren(false);
        boolean z = LocaleController.isRTL;
        addView((View) r3, LayoutHelper.createFrame(46, 46.0f, (!z ? 8388611 : 8388613) | 16, !z ? 12.0f : 16.0f, 0.0f, !z ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutM = zzkf.m(context, 0);
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
        LinearLayout linearLayoutM2 = zzkf.m(context, 0);
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
        int intrinsicWidth = drawableMutate2.getIntrinsicWidth();
        int intrinsicHeight = drawableMutate2.getIntrinsicHeight();
        combinedDrawable.backWidth = intrinsicWidth;
        combinedDrawable.backHeight = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(combinedDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        CombinedDrawable combinedDrawable2 = new CombinedDrawable(null, drawableMutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = drawableMutate2.getIntrinsicWidth();
        int intrinsicHeight2 = drawableMutate2.getIntrinsicHeight();
        combinedDrawable2.backWidth = intrinsicWidth2;
        combinedDrawable2.backHeight = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(combinedDrawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.needDivider) {
            Paint paint = this.dividerPaint;
            paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
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
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.storyAvatarParams.reset();
    }

    public void setData(StatisticActivity.MemberData memberData) {
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(UserConfig.selectedAccount, memberData.user);
        TLRPC.User user = memberData.user;
        AnonymousClass1 anonymousClass1 = this.imageView;
        anonymousClass1.imageReceiver.setForUserOrChat(user, avatarDrawable);
        anonymousClass1.onNewImageSet();
        anonymousClass1.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.message.setText(memberData.user.first_name);
        this.date.setText(memberData.description);
        this.views.setVisibility(8);
        this.shares.setVisibility(8);
        this.likes.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }
}

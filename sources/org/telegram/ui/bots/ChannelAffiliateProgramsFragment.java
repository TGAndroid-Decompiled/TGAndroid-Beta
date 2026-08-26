package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda14;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.SelfStoryViewsPage$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.AddressBarList;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class ChannelAffiliateProgramsFragment extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout aboveTitleView;
    public AnonymousClass3 adapter;
    public final long dialogId;
    public AddressBarList.AnonymousClass2 emptyLayout;
    public GLIconTextureView iconTextureView;

    public final class AnonymousClass5 extends StarParticlesView {
        @Override
        public final void configure() {
            super.configure();
            StarParticlesView.Drawable drawable = this.drawable;
            drawable.useGradient = true;
            drawable.useBlur = false;
            drawable.forceMaxAlpha = true;
            drawable.checkBounds = true;
            drawable.init();
        }

        @Override
        public final int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public final class BotCell extends FrameLayout {
        public final ImageView arrowView;
        public final int currentAccount;
        public final BackupImageView imageView;
        public final View linkBgView;
        public final View linkFg2View;
        public final ImageView linkFgView;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Object obj = uItem.object;
                if (!(obj instanceof TL_payments.connectedBotStarRef)) {
                    if (obj instanceof TL_payments.starRefProgram) {
                        BotCell botCell = (BotCell) view;
                        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                        boolean z2 = uItem.red;
                        TLRPC.User user = MessagesController.getInstance(botCell.currentAccount).getUser(Long.valueOf(starrefprogram.bot_id));
                        AvatarDrawable avatarDrawable = new AvatarDrawable();
                        avatarDrawable.setInfo(user);
                        botCell.imageView.setForUserOrChat(user, avatarDrawable);
                        botCell.titleView.setText(UserObject.getUserName(user));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (starrefprogram.commission_permille > 0) {
                            spannableStringBuilder.append((CharSequence) " d");
                            FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(10.0f);
                            newSpan.setColor(Theme.getColor(null, Theme.key_color_green, false));
                            newSpan.setText(AffiliateProgramFragment.percents(starrefprogram.commission_permille));
                            spannableStringBuilder.setSpan(newSpan, 1, 2, 33);
                        }
                        int i = starrefprogram.duration_months;
                        if (i == 0) {
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                        } else if (i < 12 || i % 12 != 0) {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i, new Object[0]));
                        } else {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i / 12, new Object[0]));
                        }
                        botCell.textView.setText(spannableStringBuilder);
                        botCell.arrowView.setVisibility(z2 ? 0 : 8);
                        botCell.linkBgView.setVisibility(8);
                        botCell.linkFgView.setVisibility(8);
                        botCell.linkFg2View.setVisibility(8);
                        botCell.needDivider = z;
                        botCell.setWillNotDraw(!z);
                        return;
                    }
                    return;
                }
                BotCell botCell2 = (BotCell) view;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                boolean z3 = uItem.red;
                TLRPC.User user2 = MessagesController.getInstance(botCell2.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                avatarDrawable2.setInfo(user2);
                botCell2.imageView.setForUserOrChat(user2, avatarDrawable2);
                TextView textView = botCell2.titleView;
                textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (connectedbotstarref.commission_permille > 0) {
                    spannableStringBuilder2.append((CharSequence) " d");
                    FilterCreateActivity.NewSpan newSpan2 = new FilterCreateActivity.NewSpan(10.0f);
                    newSpan2.setColor(Theme.getColor(null, Theme.key_color_green, false));
                    newSpan2.setText(AffiliateProgramFragment.percents(connectedbotstarref.commission_permille));
                    spannableStringBuilder2.setSpan(newSpan2, 1, 2, 33);
                }
                int i2 = connectedbotstarref.duration_months;
                if (i2 == 0) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i2 < 12 || i2 % 12 != 0) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i2, new Object[0]));
                } else {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i2 / 12, new Object[0]));
                }
                botCell2.textView.setText(spannableStringBuilder2);
                botCell2.arrowView.setVisibility(z3 ? 0 : 8);
                botCell2.linkBgView.setVisibility(0);
                ImageView imageView = botCell2.linkFgView;
                imageView.setVisibility(0);
                View view2 = botCell2.linkFg2View;
                view2.setVisibility(0);
                view2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(9.665f), Theme.getColor(connectedbotstarref.revoked ? Theme.key_color_red : Theme.key_color_green, botCell2.resourcesProvider)));
                imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
                imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
                imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
                botCell2.needDivider = z;
                botCell2.setWillNotDraw(!z);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new BotCell(context, i, resourcesProvider);
            }
        }

        public BotCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
            View view = new View(context);
            this.linkBgView = view;
            view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(11.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            addView(view, LayoutHelper.createFrame(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
            View view2 = new View(context);
            this.linkFg2View = view2;
            view2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(9.665f), Theme.getColor(Theme.key_color_green, resourcesProvider)));
            addView(view2, LayoutHelper.createFrame(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.linkFgView = imageView;
            imageView.setScaleX(0.6f);
            imageView.setScaleY(0.6f);
            addView(imageView, LayoutHelper.createFrame(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            NotificationCenter.listenEmojiLoading(textView);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 6, 0, 24, 0));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(truncateAt);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 6, 1, 24, 0));
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_switchTrack, resourcesProvider), PorterDuff.Mode.SRC_IN));
            imageView2.setImageResource(R.drawable.msg_arrowright);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
        }
    }

    public final class HeaderSortCell extends HeaderCell {
        public final LinkSpanDrawable.LinksTextView subtextView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                HeaderSortCell headerSortCell = (HeaderSortCell) view;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                headerSortCell.setText(charSequence);
                headerSortCell.subtextView.setText(charSequence2);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new HeaderSortCell(context, resourcesProvider);
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public HeaderSortCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.subtextView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
        }
    }

    public ChannelAffiliateProgramsFragment(long j) {
        this.dialogId = j;
        setWhiteBackground(true);
        setMinusHeaderHeight(AndroidUtilities.dp(60.0f));
    }

    public static boolean access$000(ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment) {
        for (int i = 0; i < channelAffiliateProgramsFragment.listView.getChildCount(); i++) {
            if (channelAffiliateProgramsFragment.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    public static void showConnectAffiliateAlert(Context context, int i, final TL_payments.starRefProgram starrefprogram, long j, Theme.ResourcesProvider resourcesProvider, boolean z) {
        char c;
        String pluralString;
        TextView textView;
        LinearLayout linearLayout;
        BackupImageView backupImageView;
        GiftSheet$$ExternalSyntheticLambda15 giftSheet$$ExternalSyntheticLambda15;
        Theme.ResourcesProvider resourcesProvider2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, resourcesProvider);
        long[] jArr = {j};
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayoutM.setClipChildren(false);
        linearLayoutM.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView2 = new BackupImageView(context);
        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(user);
        backupImageView2.setForUserOrChat(user, avatarDrawable);
        ScaleStateListAnimator.apply(backupImageView2);
        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_color_green, resourcesProvider)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            textView2.setText(StarsIntroActivity.replaceStars("⭐️ " + ((Object) StarsIntroActivity.formatStarsAmountShort(starrefprogram.daily_revenue_per_user, 1.0f, ',')), 0.75f, new ColoredImageSpan[1]));
            frameLayout3.addView(textView2, LayoutHelper.createFrame(-2, 15.66f));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, LayoutHelper.createFrame(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        BackupImageView backupImageView3 = new BackupImageView(context);
        backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(backupImageView3, LayoutHelper.createFrame(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int iDp = AndroidUtilities.dp(10.0f);
        int i2 = Theme.key_dialogBackground;
        frameLayout5.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i2, resourcesProvider)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) AffiliateProgramFragment.percents(starrefprogram.commission_permille)));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_link_1);
        coloredImageSpan.setScale(0.65f, 0.65f);
        coloredImageSpan.spaceScaleX = 0.7f;
        coloredImageSpan.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, LayoutHelper.createFrame(-2, 15.66f));
        frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i3, resourcesProvider, textView4, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayoutM.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 21.0f, 0.0f, 9.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int iDp2 = AndroidUtilities.dp(28.0f);
        int i4 = Theme.key_windowBackgroundGray;
        linearLayout2.setBackground(Theme.createRoundRectDrawable(iDp2, Theme.getColor(i4, resourcesProvider)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, LayoutHelper.createLinear(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i5 = Theme.key_dialogTextGray3;
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 5, 0, 8, 0));
        linearLayoutM.addView(linearLayout2, LayoutHelper.createLinear(-2, 28, 1, 4, 0, 4, 0));
        ScaleStateListAnimator.apply(linearLayout2);
        TextView textView6 = new TextView(context);
        OKLCH.m(i3, resourcesProvider, textView6, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(StarsIntroActivity.formatStarsAmountShort(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        linearLayoutM.addView(textView6, LayoutHelper.createLinear(-1, -2, 0.0f, 10.0f, 0.0f, 20.0f));
        TextView textView7 = new TextView(context);
        OKLCH.m(i3, resourcesProvider, textView7, 14.0f);
        textView7.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView7);
        int i6 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String strPercents = AffiliateProgramFragment.percents(starrefprogram.commission_permille);
        int i7 = starrefprogram.duration_months;
        if (i7 > 0) {
            if (i7 < 12 || i7 % 12 != 0) {
                userName = userName;
                c = 0;
                pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i7, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i7 / 12, new Object[0]);
            }
            Object[] objArr = new Object[3];
            objArr[c] = userName;
            objArr[1] = strPercents;
            objArr[2] = pluralString;
            textView7.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i6, objArr)), textView7.getPaint().getFontMetricsInt(), false));
            linearLayoutM.addView(textView7, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 22.0f));
            if (j >= 0) {
                TextView textView8 = new TextView(context);
                OKLCH.m(i3, resourcesProvider, textView8, 14.0f);
                textView8.setGravity(17);
                textView8.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                linearLayoutM.addView(textView8, LayoutHelper.createLinear(-1, -2, 20.0f, 0.0f, 20.0f, 0.0f));
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(i4, resourcesProvider)));
                int iDp3 = AndroidUtilities.dp(28.0f);
                int color2 = Theme.getColor(i4, resourcesProvider);
                int iBlendOver = Theme.blendOver(Theme.getColor(i4, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider));
                linearLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, color2, iBlendOver, iBlendOver));
                BackupImageView backupImageView4 = new BackupImageView(context);
                backupImageView4.setRoundRadius(AndroidUtilities.dp(14.0f));
                linearLayout.addView(backupImageView4, LayoutHelper.createLinear(28, 28));
                TextView textView9 = new TextView(context);
                textView9.setTextSize(1, 13.0f);
                textView9.setTextColor(Theme.getColor(i3, resourcesProvider));
                linearLayout.addView(textView9, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
                ImageView imageView3 = new ImageView(context);
                imageView3.setScaleType(scaleType);
                imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
                imageView3.setImageResource(R.drawable.arrows_select);
                linearLayout.addView(imageView3, LayoutHelper.createLinear(-2, -2, 16, 2, 0, 5, 0));
                linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, 28, 1, 0, 11, 0, 20));
                backupImageView = backupImageView4;
                textView = textView9;
            } else {
                textView = null;
                linearLayout = null;
                backupImageView = null;
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false);
            linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new GiftSheet$$ExternalSyntheticLambda18(context, 12)));
            linksTextView.setGravity(17);
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 14, 14, 6));
            bottomSheetM.customView = linearLayoutM;
            final int i8 = 0;
            backupImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment != null) {
                                bottomSheetM.lambda$showGiftOfferSheet$15();
                                safeLastFragment.presentFragment(ProfileActivity.of(starrefprogram.bot_id));
                            }
                            break;
                        default:
                            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment2 != null) {
                                final BottomSheet bottomSheet = bottomSheetM;
                                bottomSheet.lambda$showGiftOfferSheet$15();
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", starrefprogram.bot_id);
                                safeLastFragment2.presentFragment(new ChatActivity(bundle) {
                                    @Override
                                    public final void onFragmentDestroy() {
                                        super.onFragmentDestroy();
                                        BottomSheet bottomSheet2 = bottomSheet;
                                        bottomSheet2.makeAttached(null);
                                        bottomSheet2.show();
                                    }
                                });
                            }
                            break;
                    }
                }
            });
            buttonWithCounterView.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda1(buttonWithCounterView, jArr, i, starrefprogram, bottomSheetM, j, z, context, resourcesProvider, user));
            bottomSheetM.setOnDismissListener(new EmojiBottomSheet$$ExternalSyntheticLambda4(2));
            giftSheet$$ExternalSyntheticLambda15 = new GiftSheet$$ExternalSyntheticLambda15(jArr, i, backupImageView3, backupImageView, textView, 18);
            giftSheet$$ExternalSyntheticLambda15.run();
            if (linearLayout != null) {
                BotStarsController.getInstance(i).loadAdminedBots();
                BotStarsController.getInstance(i).loadAdminedChannels();
                LinearLayout linearLayout3 = linearLayout;
                resourcesProvider2 = resourcesProvider;
                linearLayout3.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda14(i, bottomSheetM, resourcesProvider2, linearLayout3, jArr, giftSheet$$ExternalSyntheticLambda15));
            } else {
                resourcesProvider2 = resourcesProvider;
            }
            final int i9 = 1;
            linearLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment != null) {
                                bottomSheetM.lambda$showGiftOfferSheet$15();
                                safeLastFragment.presentFragment(ProfileActivity.of(starrefprogram.bot_id));
                            }
                            break;
                        default:
                            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment2 != null) {
                                final BottomSheet bottomSheet = bottomSheetM;
                                bottomSheet.lambda$showGiftOfferSheet$15();
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", starrefprogram.bot_id);
                                safeLastFragment2.presentFragment(new ChatActivity(bundle) {
                                    @Override
                                    public final void onFragmentDestroy() {
                                        super.onFragmentDestroy();
                                        BottomSheet bottomSheet2 = bottomSheet;
                                        bottomSheet2.makeAttached(null);
                                        bottomSheet2.show();
                                    }
                                });
                            }
                            break;
                    }
                }
            });
            bottomSheetM.fixNavigationBar(Theme.getColor(i2, resourcesProvider2));
            bottomSheetM.show();
        }
        pluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
        c = 0;
        Object[] objArr2 = new Object[3];
        objArr2[c] = userName;
        objArr2[1] = strPercents;
        objArr2[2] = pluralString;
        textView7.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i6, objArr2)), textView7.getPaint().getFontMetricsInt(), false));
        linearLayoutM.addView(textView7, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 22.0f));
        if (j >= 0) {
            TextView textView10 = new TextView(context);
            OKLCH.m(i3, resourcesProvider, textView10, 14.0f);
            textView10.setGravity(17);
            textView10.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            linearLayoutM.addView(textView10, LayoutHelper.createLinear(-1, -2, 20.0f, 0.0f, 20.0f, 0.0f));
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(i4, resourcesProvider)));
            int iDp4 = AndroidUtilities.dp(28.0f);
            int color3 = Theme.getColor(i4, resourcesProvider);
            int iBlendOver2 = Theme.blendOver(Theme.getColor(i4, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider));
            linearLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp4, iDp4, iDp4, iDp4, color3, iBlendOver2, iBlendOver2));
            BackupImageView backupImageView5 = new BackupImageView(context);
            backupImageView5.setRoundRadius(AndroidUtilities.dp(14.0f));
            linearLayout.addView(backupImageView5, LayoutHelper.createLinear(28, 28));
            TextView textView11 = new TextView(context);
            textView11.setTextSize(1, 13.0f);
            textView11.setTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout.addView(textView11, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView4 = new ImageView(context);
            imageView4.setScaleType(scaleType);
            imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
            imageView4.setImageResource(R.drawable.arrows_select);
            linearLayout.addView(imageView4, LayoutHelper.createLinear(-2, -2, 16, 2, 0, 5, 0));
            linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, 28, 1, 0, 11, 0, 20));
            backupImageView = backupImageView5;
            textView = textView11;
        } else {
            textView = null;
            linearLayout = null;
            backupImageView = null;
        }
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, resourcesProvider);
        buttonWithCounterView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false);
        linearLayoutM.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new GiftSheet$$ExternalSyntheticLambda18(context, 12)));
        linksTextView2.setGravity(17);
        linksTextView2.setTextSize(1, 12.0f);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayoutM.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 49, 14, 14, 14, 6));
        bottomSheetM.customView = linearLayoutM;
        final int i10 = 0;
        backupImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            bottomSheetM.lambda$showGiftOfferSheet$15();
                            safeLastFragment.presentFragment(ProfileActivity.of(starrefprogram.bot_id));
                        }
                        break;
                    default:
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null) {
                            final BottomSheet bottomSheet = bottomSheetM;
                            bottomSheet.lambda$showGiftOfferSheet$15();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            safeLastFragment2.presentFragment(new ChatActivity(bundle) {
                                @Override
                                public final void onFragmentDestroy() {
                                    super.onFragmentDestroy();
                                    BottomSheet bottomSheet2 = bottomSheet;
                                    bottomSheet2.makeAttached(null);
                                    bottomSheet2.show();
                                }
                            });
                        }
                        break;
                }
            }
        });
        buttonWithCounterView2.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda1(buttonWithCounterView2, jArr, i, starrefprogram, bottomSheetM, j, z, context, resourcesProvider, user));
        bottomSheetM.setOnDismissListener(new EmojiBottomSheet$$ExternalSyntheticLambda4(2));
        giftSheet$$ExternalSyntheticLambda15 = new GiftSheet$$ExternalSyntheticLambda15(jArr, i, backupImageView3, backupImageView, textView, 18);
        giftSheet$$ExternalSyntheticLambda15.run();
        if (linearLayout != null) {
            BotStarsController.getInstance(i).loadAdminedBots();
            BotStarsController.getInstance(i).loadAdminedChannels();
            LinearLayout linearLayout4 = linearLayout;
            resourcesProvider2 = resourcesProvider;
            linearLayout4.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda14(i, bottomSheetM, resourcesProvider2, linearLayout4, jArr, giftSheet$$ExternalSyntheticLambda15));
        } else {
            resourcesProvider2 = resourcesProvider;
        }
        final int i11 = 1;
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            bottomSheetM.lambda$showGiftOfferSheet$15();
                            safeLastFragment.presentFragment(ProfileActivity.of(starrefprogram.bot_id));
                        }
                        break;
                    default:
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null) {
                            final BottomSheet bottomSheet = bottomSheetM;
                            bottomSheet.lambda$showGiftOfferSheet$15();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            safeLastFragment2.presentFragment(new ChatActivity(bundle) {
                                @Override
                                public final void onFragmentDestroy() {
                                    super.onFragmentDestroy();
                                    BottomSheet bottomSheet2 = bottomSheet;
                                    bottomSheet2.makeAttached(null);
                                    bottomSheet2.show();
                                }
                            });
                        }
                        break;
                }
            }
        });
        bottomSheetM.fixNavigationBar(Theme.getColor(i2, resourcesProvider2));
        bottomSheetM.show();
    }

    public static BottomSheet showShareAffiliateAlert(Context context, int i, TL_payments.connectedBotStarRef connectedbotstarref, long j, Theme.ResourcesProvider resourcesProvider) {
        char c;
        String pluralString;
        int i2;
        char c2;
        String pluralString2;
        int i3;
        long j2;
        ?? r10;
        int i4;
        String pluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        Theme.ResourcesProvider resourcesProvider2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, resourcesProvider);
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(connectedbotstarref.bot_id));
        ?? M = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        M.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        M.setClipChildren(false);
        M.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), Theme.getColor(connectedbotstarref.revoked ? Theme.key_color_red : Theme.key_featuredStickers_addButton, resourcesProvider)));
        frameLayout.addView(view, LayoutHelper.createFrame(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, LayoutHelper.createFrame(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(50.0f), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            ?? textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.5f), Theme.getColor(connectedbotstarref.revoked ? Theme.key_color_red : Theme.key_color_green, resourcesProvider)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_reply_user);
            coloredImageSpan.setScale(0.937f, 0.937f);
            coloredImageSpan.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            coloredImageSpan.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, LayoutHelper.createFrame(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        }
        M.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i5, resourcesProvider, textView2, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        M.addView(textView2, LayoutHelper.createLinear(-1, -2, 20.0f, 16.0f, 20.0f, 9.33f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        int iDp = AndroidUtilities.dp(28.0f);
        int i6 = Theme.key_windowBackgroundGray;
        linearLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i6, resourcesProvider)));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(Theme.getColor(i5, resourcesProvider));
        textView3.setText(DialogObject.getName(i, connectedbotstarref.bot_id));
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i7 = Theme.key_dialogTextGray3;
        int color = Theme.getColor(i7, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 5, 0, 8, 0));
        M.addView(linearLayout, LayoutHelper.createLinear(-2, 28, 1, 4, 0, 4, 0));
        ScaleStateListAnimator.apply(linearLayout);
        TextView textView4 = new TextView(context);
        OKLCH.m(i5, resourcesProvider, textView4, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            linearLayout = linearLayout;
        } else if (j < 0) {
            int i8 = R.string.ChannelAffiliateProgramLinkTextChannel;
            String strPercents = AffiliateProgramFragment.percents(connectedbotstarref.commission_permille);
            String userName = UserObject.getUserName(user);
            int i9 = connectedbotstarref.duration_months;
            if (i9 <= 0) {
                pluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                i3 = 3;
                c2 = 0;
            } else {
                if (i9 < 12 || i9 % 12 != 0) {
                    c2 = 0;
                    pluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i9, new Object[0]);
                } else {
                    c2 = 0;
                    pluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i9 / 12, new Object[0]);
                }
                i3 = 3;
            }
            Object[] objArr = new Object[i3];
            objArr[c2] = strPercents;
            objArr[1] = userName;
            objArr[2] = pluralString2;
            ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(i8, objArr, textView4);
        } else {
            linearLayout = linearLayout;
            int i10 = R.string.ChannelAffiliateProgramLinkTextUser;
            String strPercents2 = AffiliateProgramFragment.percents(connectedbotstarref.commission_permille);
            String userName2 = UserObject.getUserName(user);
            int i11 = connectedbotstarref.duration_months;
            if (i11 <= 0) {
                pluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                i2 = 3;
                c = 0;
            } else {
                if (i11 < 12 || i11 % 12 != 0) {
                    c = 0;
                    pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i11, new Object[0]);
                } else {
                    c = 0;
                    pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i11 / 12, new Object[0]);
                }
                i2 = 3;
            }
            Object[] objArr2 = new Object[i2];
            objArr2[c] = strPercents2;
            objArr2[1] = userName2;
            objArr2[2] = pluralString;
            ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(i10, objArr2, textView4);
        }
        M.addView(textView4, LayoutHelper.createLinear(-1, -2, 20.0f, 19.0f, 20.0f, 18.0f));
        if (connectedbotstarref.revoked) {
            i5 = i5;
            user = user;
            j2 = j;
            r10 = 0;
        } else {
            TextView textView5 = new TextView(context);
            OKLCH.m(i5, resourcesProvider, textView5, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            M.addView(textView5, LayoutHelper.createLinear(-1, -2, 20.0f, 0.0f, 20.0f, 0.0f));
            ?? linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(i6, resourcesProvider)));
            BackupImageView backupImageView2 = new BackupImageView(context);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(14.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            linearLayout2.addView(backupImageView2, LayoutHelper.createLinear(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(Theme.getColor(i5, resourcesProvider));
            if (j >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                avatarDrawable2.setInfo(user2);
                backupImageView2.setForUserOrChat(user2, avatarDrawable2);
                textView6.setText(UserObject.getUserName(user2));
                j2 = j;
            } else {
                j2 = j;
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j2));
                avatarDrawable2.setInfo(chat);
                backupImageView2.setForUserOrChat(chat, avatarDrawable2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout2.addView(textView6, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType);
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i7, resourcesProvider), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout2.addView(imageView3, LayoutHelper.createLinear(-2, -2, 16, 2, 0, 5, 0));
            M.addView(linearLayout2, LayoutHelper.createLinear(-2, 28, 1, 0, 9, 0, 22));
            r10 = linearLayout2;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(Theme.getColor(i5, resourcesProvider));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int color2 = Theme.getColor(i6, resourcesProvider);
        int iBlendOver = Theme.blendOver(Theme.getColor(i6, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider));
        textView7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color2, iBlendOver, iBlendOver));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        M.addView(textView7, LayoutHelper.createFrame(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        if (connectedbotstarref.revoked) {
            buttonWithCounterView.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            buttonWithCounterView.setText(spannableStringBuilder2, false);
        }
        M.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        long j3 = connectedbotstarref.participants;
        if (j3 <= 0) {
            i4 = 1;
            pluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i4 = 1;
            pluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j3, UserObject.getUserName(user));
        }
        linksTextView.setText(pluralString3);
        linksTextView.setGravity(17);
        linksTextView.setTextSize(i4, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        M.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 12, 14, 2));
        bottomSheetM.customView = M;
        BotVerifySheet$$ExternalSyntheticLambda7 botVerifySheet$$ExternalSyntheticLambda7 = new BotVerifySheet$$ExternalSyntheticLambda7(connectedbotstarref, bottomSheetM, resourcesProvider, user);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(botVerifySheet$$ExternalSyntheticLambda7, 23));
        }
        buttonWithCounterView.setOnClickListener(new MessageSuggestionOfferSheet$$ExternalSyntheticLambda5(connectedbotstarref, i, bottomSheetM, context, j2, resourcesProvider, botVerifySheet$$ExternalSyntheticLambda7));
        bottomSheetM.setOnDismissListener(new EmojiBottomSheet$$ExternalSyntheticLambda4(2));
        if (r10 != 0) {
            BotStarsController.getInstance(i).loadAdminedBots();
            BotStarsController.getInstance(i).loadAdminedChannels();
            resourcesProvider2 = resourcesProvider;
            ?? r4 = r10;
            connectedbotstarref2 = connectedbotstarref;
            r4.setOnClickListener(new MessageSuggestionOfferSheet$$ExternalSyntheticLambda5(i, bottomSheetM, resourcesProvider2, (LinearLayout) r4, j, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            resourcesProvider2 = resourcesProvider;
        }
        linearLayout.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(22, bottomSheetM, connectedbotstarref2));
        bottomSheetM.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider2));
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && safeLastFragment != null && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            bottomSheetM.makeAttached(safeLastFragment);
        }
        bottomSheetM.show();
        return bottomSheetM;
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        ?? r0 = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, new BotDownloads$$ExternalSyntheticLambda0(this, 12), getResourceProvider()) {
            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = ChannelAffiliateProgramsFragment.this;
                HeaderCell headerCell = new HeaderCell(channelAffiliateProgramsFragment.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BaseFragment) channelAffiliateProgramsFragment).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = r0;
        return r0;
    }

    @Override
    public final StarParticlesView createParticlesView() {
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(getContext());
        anonymousClass5.setClipWithGradient();
        return anonymousClass5;
    }

    @Override
    public final View createView(Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        AddressBarList.AnonymousClass2 anonymousClass2 = new AddressBarList.AnonymousClass2(context, 10);
        this.emptyLayout = anonymousClass2;
        anonymousClass2.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
        super.createView(context);
        this.aboveTitleView = new FrameLayout(context);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 3);
        this.iconTextureView = gLIconTextureView;
        gLIconTextureView.setImportantForAccessibility(4);
        GLIconRenderer gLIconRenderer = this.iconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        configureHeader(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.aboveTitleView, null);
        this.listView.setOnItemClickListener(new SelfStoryViewsPage$$ExternalSyntheticLambda0(4, this, context));
        this.listView.setOnItemLongClickListener(new RateCallLayout$$ExternalSyntheticLambda1(24, this, context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setOnScrollListener(new BotCommandsMenuContainer.AnonymousClass2(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        AnonymousClass3 anonymousClass3;
        int i3 = NotificationCenter.channelConnectedBotsUpdate;
        long j = this.dialogId;
        if (i != i3) {
            if (i == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j && (anonymousClass3 = this.adapter) != null) {
                anonymousClass3.update(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j) {
            AnonymousClass3 anonymousClass4 = this.adapter;
            if (anonymousClass4 != null) {
                anonymousClass4.update(true);
            }
            BotStarsController.getInstance(this.currentAccount).getChannelConnectedBots(j).load();
        }
    }

    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        SpannableString spannableString;
        int i;
        if (getContext() == null) {
            return;
        }
        arrayList.add(UItem.asFullyCustom(getHeader(getContext())));
        arrayList.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(UItem.asShadow(1, null));
        BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
        long j = this.dialogId;
        BotStarsController.ChannelConnectedBots channelConnectedBots = botStarsController.getChannelConnectedBots(j);
        ArrayList arrayList2 = channelConnectedBots.bots;
        if (!arrayList2.isEmpty() || channelConnectedBots.count > 0) {
            zzke.m(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i2);
                int i3 = BotCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(BotCell.Factory.class);
                uItemOfFactory.object = connectedbotstarref;
                uItemOfFactory.red = true;
                arrayList.add(uItemOfFactory);
            }
            if (!channelConnectedBots.endReached || channelConnectedBots.loading) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            arrayList.add(UItem.asShadow(2, null));
        }
        BotStarsController.ChannelSuggestedBots channelSuggestedBots = BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(j);
        ArrayList arrayList3 = channelSuggestedBots.bots;
        if (!arrayList3.isEmpty() || channelSuggestedBots.count > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            final int i4 = channelSuggestedBots.sorting;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSort)).append((CharSequence) " ");
            if (i4 == 1) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability) + "v");
            } else if (i4 == 2) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue) + "v");
            } else {
                if (i4 == 3) {
                    spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate) + "v");
                }
                int i5 = HeaderSortCell.Factory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(HeaderSortCell.Factory.class);
                uItemOfFactory2.text = string;
                uItemOfFactory2.subtext = spannableStringBuilder;
                arrayList.add(uItemOfFactory2);
                for (i = 0; i < arrayList3.size(); i++) {
                    Object obj = arrayList3.get(i);
                    int i6 = BotCell.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(BotCell.Factory.class);
                    uItemOfFactory3.object = obj;
                    uItemOfFactory3.red = true;
                    arrayList.add(uItemOfFactory3);
                }
                if (channelSuggestedBots.endReached || channelSuggestedBots.loading) {
                    arrayList.add(UItem.asFlicker(29));
                    arrayList.add(UItem.asFlicker(29));
                    arrayList.add(UItem.asFlicker(29));
                }
                arrayList.add(UItem.asShadow(3, null));
            }
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrow_more);
            coloredImageSpan.useLinkPaintColor = true;
            coloredImageSpan.setScale(0.6f, 0.6f);
            spannableString.setSpan(coloredImageSpan, spannableString.length() - 1, spannableString.length(), 33);
            final BotStarsController.ChannelSuggestedBots channelSuggestedBots2 = BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(j);
            spannableString.setSpan(new ClickableSpan() {
                @Override
                public final void onClick(View view) {
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(ChannelAffiliateProgramsFragment.this, view);
                    int i7 = i4;
                    boolean z = i7 == 3;
                    String string2 = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
                    final BotStarsController.ChannelSuggestedBots channelSuggestedBots3 = channelSuggestedBots2;
                    final int i8 = 0;
                    ItemOptions itemOptionsAddChecked = itemOptionsMakeOptions.addChecked(z, string2, new Runnable() {
                        @Override
                        public final void run() {
                            switch (i8) {
                                case 0:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots4 = channelSuggestedBots3;
                                    if (channelSuggestedBots4.sorting != 3) {
                                        channelSuggestedBots4.sorting = 3;
                                        channelSuggestedBots4.count = 0;
                                        channelSuggestedBots4.endReached = false;
                                        channelSuggestedBots4.error = false;
                                        channelSuggestedBots4.lastRequestTime = 0L;
                                        channelSuggestedBots4.lastOffset = null;
                                        channelSuggestedBots4.loading = false;
                                        channelSuggestedBots4.load();
                                    }
                                    break;
                                case 1:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots5 = channelSuggestedBots3;
                                    if (channelSuggestedBots5.sorting != 2) {
                                        channelSuggestedBots5.sorting = 2;
                                        channelSuggestedBots5.count = 0;
                                        channelSuggestedBots5.endReached = false;
                                        channelSuggestedBots5.error = false;
                                        channelSuggestedBots5.lastRequestTime = 0L;
                                        channelSuggestedBots5.lastOffset = null;
                                        channelSuggestedBots5.loading = false;
                                        channelSuggestedBots5.load();
                                    }
                                    break;
                                default:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots6 = channelSuggestedBots3;
                                    if (channelSuggestedBots6.sorting != 1) {
                                        channelSuggestedBots6.sorting = 1;
                                        channelSuggestedBots6.count = 0;
                                        channelSuggestedBots6.endReached = false;
                                        channelSuggestedBots6.error = false;
                                        channelSuggestedBots6.lastRequestTime = 0L;
                                        channelSuggestedBots6.lastOffset = null;
                                        channelSuggestedBots6.loading = false;
                                        channelSuggestedBots6.load();
                                    }
                                    break;
                            }
                        }
                    });
                    final int i9 = 1;
                    final int i10 = 2;
                    itemOptionsAddChecked.addChecked(i7 == 2, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots4 = channelSuggestedBots3;
                                    if (channelSuggestedBots4.sorting != 3) {
                                        channelSuggestedBots4.sorting = 3;
                                        channelSuggestedBots4.count = 0;
                                        channelSuggestedBots4.endReached = false;
                                        channelSuggestedBots4.error = false;
                                        channelSuggestedBots4.lastRequestTime = 0L;
                                        channelSuggestedBots4.lastOffset = null;
                                        channelSuggestedBots4.loading = false;
                                        channelSuggestedBots4.load();
                                    }
                                    break;
                                case 1:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots5 = channelSuggestedBots3;
                                    if (channelSuggestedBots5.sorting != 2) {
                                        channelSuggestedBots5.sorting = 2;
                                        channelSuggestedBots5.count = 0;
                                        channelSuggestedBots5.endReached = false;
                                        channelSuggestedBots5.error = false;
                                        channelSuggestedBots5.lastRequestTime = 0L;
                                        channelSuggestedBots5.lastOffset = null;
                                        channelSuggestedBots5.loading = false;
                                        channelSuggestedBots5.load();
                                    }
                                    break;
                                default:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots6 = channelSuggestedBots3;
                                    if (channelSuggestedBots6.sorting != 1) {
                                        channelSuggestedBots6.sorting = 1;
                                        channelSuggestedBots6.count = 0;
                                        channelSuggestedBots6.endReached = false;
                                        channelSuggestedBots6.error = false;
                                        channelSuggestedBots6.lastRequestTime = 0L;
                                        channelSuggestedBots6.lastOffset = null;
                                        channelSuggestedBots6.loading = false;
                                        channelSuggestedBots6.load();
                                    }
                                    break;
                            }
                        }
                    }).addChecked(i7 == 1, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots4 = channelSuggestedBots3;
                                    if (channelSuggestedBots4.sorting != 3) {
                                        channelSuggestedBots4.sorting = 3;
                                        channelSuggestedBots4.count = 0;
                                        channelSuggestedBots4.endReached = false;
                                        channelSuggestedBots4.error = false;
                                        channelSuggestedBots4.lastRequestTime = 0L;
                                        channelSuggestedBots4.lastOffset = null;
                                        channelSuggestedBots4.loading = false;
                                        channelSuggestedBots4.load();
                                    }
                                    break;
                                case 1:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots5 = channelSuggestedBots3;
                                    if (channelSuggestedBots5.sorting != 2) {
                                        channelSuggestedBots5.sorting = 2;
                                        channelSuggestedBots5.count = 0;
                                        channelSuggestedBots5.endReached = false;
                                        channelSuggestedBots5.error = false;
                                        channelSuggestedBots5.lastRequestTime = 0L;
                                        channelSuggestedBots5.lastOffset = null;
                                        channelSuggestedBots5.loading = false;
                                        channelSuggestedBots5.load();
                                    }
                                    break;
                                default:
                                    BotStarsController.ChannelSuggestedBots channelSuggestedBots6 = channelSuggestedBots3;
                                    if (channelSuggestedBots6.sorting != 1) {
                                        channelSuggestedBots6.sorting = 1;
                                        channelSuggestedBots6.count = 0;
                                        channelSuggestedBots6.endReached = false;
                                        channelSuggestedBots6.error = false;
                                        channelSuggestedBots6.lastRequestTime = 0L;
                                        channelSuggestedBots6.lastOffset = null;
                                        channelSuggestedBots6.loading = false;
                                        channelSuggestedBots6.load();
                                    }
                                    break;
                            }
                        }
                    }).setGravity(5).setDrawScrim(false).setDimAlpha(0).translate(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f)).show();
                }

                @Override
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(textPaint.linkColor);
                }
            }, 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i7 = HeaderSortCell.Factory.$r8$clinit;
            UItem uItemOfFactory4 = UItem.ofFactory(HeaderSortCell.Factory.class);
            uItemOfFactory4.text = string;
            uItemOfFactory4.subtext = spannableStringBuilder;
            arrayList.add(uItemOfFactory4);
            while (i < arrayList3.size()) {
                Object obj2 = arrayList3.get(i);
                int i8 = BotCell.Factory.$r8$clinit;
                UItem uItemOfFactory5 = UItem.ofFactory(BotCell.Factory.class);
                uItemOfFactory5.object = obj2;
                uItemOfFactory5.red = true;
                arrayList.add(uItemOfFactory5);
            }
            if (channelSuggestedBots.endReached) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            } else {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            arrayList.add(UItem.asShadow(3, null));
        }
        arrayList.add(UItem.asCustom(this.emptyLayout));
    }

    public final void lambda$createView$0(int i, Context context) {
        AnonymousClass3 anonymousClass3 = this.adapter;
        if (anonymousClass3 == null) {
            return;
        }
        Object obj = anonymousClass3.getItem(i).object;
        if (obj instanceof TL_payments.starRefProgram) {
            showConnectAffiliateAlert(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.dialogId, this.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            showShareAffiliateAlert(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.dialogId, this.resourceProvider);
        }
    }

    public final void lambda$createView$4(AlertDialog alertDialog, TLObject tLObject) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
            long j = this.dialogId;
            BotStarsController.ChannelConnectedBots channelConnectedBots = botStarsController.getChannelConnectedBots(j);
            int i = channelConnectedBots.currentAccount;
            MessagesController.getInstance(i).putUsers(connectedstarrefbots.users, false);
            for (int i2 = 0; i2 < connectedstarrefbots.connected_bots.size(); i2++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i2);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = channelConnectedBots.bots;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    if (((TL_payments.connectedBotStarRef) arrayList.get(i3)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i3);
                            channelConnectedBots.count = Math.max(channelConnectedBots.count - 1, 0);
                            break;
                        } else {
                            arrayList.set(i3, connectedbotstarref);
                            break;
                        }
                    }
                    i3++;
                }
            }
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(channelConnectedBots.dialogId));
            channelConnectedBots.load();
            BotStarsController.ChannelSuggestedBots channelSuggestedBots = BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(j);
            channelSuggestedBots.count = 0;
            channelSuggestedBots.endReached = false;
            channelSuggestedBots.error = false;
            channelSuggestedBots.lastRequestTime = 0L;
            channelSuggestedBots.lastOffset = null;
            channelSuggestedBots.loading = false;
            channelSuggestedBots.load();
            update(true);
        }
        alertDialog.dismiss();
    }

    public final void lambda$createView$6(TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new BotVerifySheet$$ExternalSyntheticLambda6(2, this, alertDialog));
    }

    public final void lambda$createView$7(Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        new AlertDialog.Builder(context, 0, this.resourceProvider).setTitle(LocaleController.getString(R.string.LeaveAffiliateLink)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)))).setPositiveButton(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new RateCallLayout$$ExternalSyntheticLambda1(23, this, connectedbotstarref)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public final boolean lambda$createView$8(Context context, View view, int i) {
        AnonymousClass3 anonymousClass3 = this.adapter;
        if (anonymousClass3 == null) {
            return false;
        }
        Object obj = anonymousClass3.getItem(i).object;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            return false;
        }
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        boolean z = user.bot_has_main_app;
        int i2 = R.drawable.msg_bot;
        itemOptionsMakeOptions.addIf(z, i2, LocaleController.getString(R.string.ProfileBotOpenApp), new RichTableCell$$ExternalSyntheticLambda3(15, this, user)).addIf(!user.bot_has_main_app, i2, LocaleController.getString(R.string.BotWebViewOpenBot), new RichTableCell$$ExternalSyntheticLambda3(16, this, connectedbotstarref)).add(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new EglRenderer$$ExternalSyntheticLambda6(this, connectedbotstarref, user, 8)).addIf(!connectedbotstarref.revoked, R.drawable.msg_leave, (CharSequence) LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, (Runnable) new BotVerifySheet$$ExternalSyntheticLambda7(5, this, context, user, connectedbotstarref)).setGravity(5).show();
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override
    public final void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }
}

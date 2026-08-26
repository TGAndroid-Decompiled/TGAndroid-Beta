package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.iv.RichEditor;

public final class PremiumPreviewGiftSentBottomSheet extends PremiumPreviewBottomSheet {
    public final ArrayList selectedUsers;

    public final class AdditionalCounterView extends View {
        public int count;
        public final TextPaint paint;

        public AdditionalCounterView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            textPaint.setTextSize(AndroidUtilities.dp(11.5f));
            textPaint.setTypeface(AndroidUtilities.bold());
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float measuredWidth2 = getMeasuredWidth() / 2.0f;
            TextPaint textPaint = this.paint;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, textPaint);
            PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), -AndroidUtilities.dp(10.0f), 0.0f);
            canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(1.5f), PremiumGradient.getInstance().getMainGradientPaint());
            canvas.drawText("+" + this.count, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + textPaint.descent()) / 2.0f)), textPaint);
        }
    }

    public final class AvatarHolderView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final Paint bgPaint;
        public boolean drawCycle;
        public final AvatarDrawable fromAvatarDrawable;
        public final AdditionalCounterView iconView;
        public final BackupImageView imageView;

        public AvatarHolderView(Context context, float f) {
            super(context);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.drawCycle = true;
            this.fromAvatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(f));
            AdditionalCounterView additionalCounterView = new AdditionalCounterView(context);
            this.iconView = additionalCounterView;
            additionalCounterView.setAlpha(0.0f);
            addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
            addView(additionalCounterView, LayoutHelper.createFrame(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.drawCycle) {
                canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.bgPaint);
            }
            super.dispatchDraw(canvas);
        }
    }

    public PremiumPreviewGiftSentBottomSheet(BaseFragment baseFragment, ArrayList arrayList, int i, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, i, null, null, null, resourcesProvider);
        ArrayList arrayList2 = new ArrayList();
        this.selectedUsers = arrayList2;
        arrayList2.addAll(arrayList);
        updateRows();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
        actionBtnCell.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 21));
        actionBtnCell.setCloseStyle(true);
        this.containerView.addView(actionBtnCell, LayoutHelper.createFrame(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i3 = AvatarHolderView.$r8$clinit;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            AvatarHolderView avatarHolderView = new AvatarHolderView(context, 47.0f);
            avatarHolderView.drawCycle = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            AvatarDrawable avatarDrawable = avatarHolderView.fromAvatarDrawable;
            avatarDrawable.setInfo(user);
            avatarHolderView.imageView.setForUserOrChat(user, avatarDrawable);
            frameLayout2.addView(avatarHolderView, 0, LayoutHelper.createFrame(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i4 = 0;
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i5);
                AvatarHolderView avatarHolderView2 = new AvatarHolderView(context, 41.5f);
                AvatarDrawable avatarDrawable2 = avatarHolderView2.fromAvatarDrawable;
                avatarDrawable2.setInfo(user2);
                avatarHolderView2.imageView.setForUserOrChat(user2, avatarDrawable2);
                frameLayout2.addView(avatarHolderView2, 0, LayoutHelper.createFrame(83, 83, 17));
                avatarHolderView2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i5));
                if (i5 == 0 && arrayList2.size() > 3) {
                    AdditionalCounterView additionalCounterView = avatarHolderView2.iconView;
                    additionalCounterView.setAlpha(1.0f);
                    additionalCounterView.count = arrayList2.size() - 3;
                }
                i4++;
                if (i5 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i4 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.overrideTitleIcon = frameLayout;
        fixNavigationBar();
    }

    public static void show(ArrayList arrayList) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        PremiumPreviewGiftSentBottomSheet premiumPreviewGiftSentBottomSheet = new PremiumPreviewGiftSentBottomSheet(lastFragment, arrayList, UserConfig.selectedAccount, lastFragment.getResourceProvider());
        premiumPreviewGiftSentBottomSheet.animateConfetti = true;
        premiumPreviewGiftSentBottomSheet.animateConfettiWithStars = true;
        premiumPreviewGiftSentBottomSheet.show();
    }

    @Override
    public final void afterCellCreated(int i, View view) {
        if (i == 0) {
            view.setOutlineProvider(new RichEditor.AnonymousClass5(4));
            view.setClipToOutline(true);
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void attachIconContainer(RichEditor.AnonymousClass6 anonymousClass6) {
        View view = this.overrideTitleIcon;
        ArrayList arrayList = this.selectedUsers;
        anonymousClass6.addView(view, LayoutHelper.createLinear(-1, arrayList.size() == 1 ? 94 : 83, 0.0f, arrayList.size() == 1 ? 28.0f : 34.0f, 0.0f, arrayList.size() == 1 ? 9.0f : 14.0f));
    }

    @Override
    public final void setTitle(boolean z) {
        String string;
        ((PremiumPreviewBottomSheet) this).titleView[0].setTextSize(1, 20.0f);
        this.subtitleView.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        LinkSpanDrawable.LinksTextView linksTextView = ((PremiumPreviewBottomSheet) this).titleView[0];
        ArrayList arrayList = this.selectedUsers;
        linksTextView.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = arrayList.size();
        if (size == 1) {
            string = LocaleController.formatString(R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString(R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC.User) arrayList.get(0))));
        } else if (size == 2) {
            string = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1))));
        } else if (size != 3) {
            string = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", arrayList.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        } else {
            string = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        }
        this.subtitleView.setText(AndroidUtilities.replaceTags(string));
        this.subtitleView.append("\n");
        this.subtitleView.append("\n");
        if (arrayList.size() == 1) {
            this.subtitleView.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.subtitleView.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override
    public final void updateRows() {
        this.rowCount = 1;
        this.paddingRow = 0;
        this.featuresStartRow = 1;
        int size = this.premiumFeatures.size();
        int i = size + 1;
        this.featuresEndRow = i;
        this.rowCount = size + 2;
        this.termsRow = i;
    }
}

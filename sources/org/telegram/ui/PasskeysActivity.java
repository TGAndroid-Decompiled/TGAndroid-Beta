package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class PasskeysActivity extends BaseFragment {
    public int addPasskeyRow;
    private UniversalRecyclerView listView;
    private ArrayList<TL_account.Passkey> passkeys;

    public static class PasskeyCell extends FrameLayout {
        private final int currentAccount;
        public String id;
        private final FrameLayout imageBackgroundView;
        private final BackupImageView imageView;
        private boolean needDivider;
        private final ImageView optionsView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleView;
        private final TextView titleView;

        public static class Factory extends UItem.UItemFactory<PasskeyCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(TL_account.Passkey passkey, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = passkey;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((PasskeyCell) view).set((TL_account.Passkey) uItem.object, uItem.clickCallback, z);
            }

            @Override
            public PasskeyCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new PasskeyCell(context, i, resourcesProvider);
            }
        }

        public PasskeyCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            FrameLayout frameLayout = new FrameLayout(context);
            this.imageBackgroundView = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setImageResource(R.drawable.msg2_permissions);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            int iMultAlpha = Theme.multAlpha(0.3f, Theme.getColor(i2, resourcesProvider));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            backupImageView.setColorFilter(new PorterDuffColorFilter(iMultAlpha, mode));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(36, 36, 17));
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 15.0f, i2, true);
            this.titleView = textViewMakeTextView;
            textViewMakeTextView.setSingleLine();
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textViewMakeTextView.setEllipsize(truncateAt);
            addView(textViewMakeTextView, LayoutHelper.createFrame(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
            int i3 = Theme.key_windowBackgroundWhiteGrayText;
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 13.0f, i3, false);
            this.subtitleView = textViewMakeTextView2;
            textViewMakeTextView2.setSingleLine();
            textViewMakeTextView2.setEllipsize(truncateAt);
            addView(textViewMakeTextView2, LayoutHelper.createFrame(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.optionsView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, -1));
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 0.0f), getMeasuredHeight(), themePaint);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }

        public void set(TL_account.Passkey passkey, View.OnClickListener onClickListener, boolean z) {
            this.id = passkey.id;
            long j = passkey.software_emoji_id;
            if (j != 0) {
                this.imageView.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(this.currentAccount, 3, j));
                this.imageBackgroundView.setBackground(null);
                this.imageView.setColorFilter(null);
                this.imageView.setScaleX(1.0f);
                this.imageView.setScaleY(1.0f);
            } else {
                FrameLayout frameLayout = this.imageBackgroundView;
                int iDp = AndroidUtilities.dp(4.0f);
                int i = Theme.key_windowBackgroundWhiteBlackText;
                frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.04f, Theme.getColor(i, this.resourcesProvider))));
                this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.3f, Theme.getColor(i, this.resourcesProvider)), PorterDuff.Mode.SRC_IN));
                this.imageView.setImageResource(R.drawable.msg2_permissions);
                this.imageView.setScaleX(0.666f);
                this.imageView.setScaleY(0.666f);
                this.imageView.setAnimatedEmojiDrawable(null);
            }
            if (TextUtils.isEmpty(passkey.name)) {
                this.titleView.setText(LocaleController.getString(R.string.PasskeyUnknown));
            } else {
                this.titleView.setText(passkey.name);
            }
            int i2 = passkey.last_usage_date;
            if (i2 != 0) {
                this.subtitleView.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i2, false)));
            } else {
                this.subtitleView.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
            }
            this.optionsView.setOnClickListener(onClickListener);
            this.needDivider = z;
            setWillNotDraw(!z);
        }
    }

    public PasskeysActivity(ArrayList<TL_account.Passkey> arrayList) {
        super(null);
        this.passkeys = arrayList;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        this.addPasskeyRow = -1;
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.PasskeyTopInfo), R.raw.passkey));
        for (int i = 0; i < this.passkeys.size(); i++) {
            arrayList.add(PasskeyCell.Factory.of(this.passkeys.get(i), new OAuthSheet$$ExternalSyntheticLambda11(this, 26)));
        }
        if (this.passkeys.size() + 1 <= getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            this.addPasskeyRow = arrayList.size();
            arrayList.add(UItem.asButton(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd)).accent());
        }
        arrayList.add(UItem.asShadow(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new MainTabsLayout$$ExternalSyntheticLambda0(this, 7)), true)));
    }

    public void lambda$fillItems$0() {
        showLearnSheet(getContext(), this.currentAccount, this.resourceProvider, this.passkeys.size() + 1 <= getMessagesController().config.passkeysAccountPasskeysMax.get());
    }

    public void lambda$onItemClick$4(TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
                added(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            BulletinFactory.of(this).showForError(str, true);
        } else {
            ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.PasskeyNoOptionsTitle)).setMessage(LocaleController.getString(R.string.PasskeyNoOptionsText)), null);
        }
    }

    public void lambda$openMenu$1(int i, TL_account.Passkey passkey, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (bool instanceof TLRPC.TL_boolFalse) {
            BulletinFactory.of(this).showForError("FALSE");
            ArrayList<TL_account.Passkey> arrayList = this.passkeys;
            arrayList.add(Utilities.clamp(i, arrayList.size(), 0), passkey);
            this.listView.adapter.update(true);
            return;
        }
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
            ArrayList<TL_account.Passkey> arrayList2 = this.passkeys;
            arrayList2.add(Utilities.clamp(i, arrayList2.size(), 0), passkey);
            this.listView.adapter.update(true);
        }
    }

    public void lambda$openMenu$2(TL_account.Passkey passkey, String str, int i, AlertDialog alertDialog, int i2) {
        this.passkeys.remove(passkey);
        this.listView.adapter.update(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletepasskey, new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda90(this, i, passkey, 2));
    }

    public void lambda$openMenu$3(TL_account.Passkey passkey, String str, int i) {
        new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.PasskeyDeleteTitle)).setMessage(LocaleController.getString(R.string.PasskeyDeleteText)).setPositiveButton(LocaleController.getString(R.string.Delete), new VoIPFragment$$ExternalSyntheticLambda6(this, passkey, str, i)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public static void lambda$showLearnSheet$7(BottomSheet bottomSheet, TL_account.Passkey passkey, String str, TL_account.Passkeys passkeys, TLRPC.TL_error tL_error) {
        if (passkeys == null) {
            if (tL_error != null) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(str);
                return;
            }
            return;
        }
        bottomSheet.lambda$showGiftOfferSheet$15();
        int i = 0;
        while (i < passkeys.passkeys.size()) {
            if (TextUtils.equals(passkeys.passkeys.get(i).id, passkey.id)) {
                passkeys.passkeys.remove(i);
                i--;
            }
            i++;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
        safeLastFragment.presentFragment(passkeysActivity);
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(20, passkeysActivity, passkey), 150L);
    }

    public static void lambda$showLearnSheet$8(ButtonWithCounterView buttonWithCounterView, Context context, BottomSheet bottomSheet, int i, TL_account.Passkey passkey, String str) {
        buttonWithCounterView.setLoading(false);
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if ("EMPTY".equalsIgnoreCase(str)) {
            new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.PasskeyNoOptionsTitle)).setMessage(LocaleController.getString(R.string.PasskeyNoOptionsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda18(bottomSheet, 10)).show();
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (str != null) {
            BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(str);
            return;
        }
        if (passkey != null) {
            MessagesController.getInstance(i).removeSuggestion(0L, "SETUP_PASSKEY");
            if (safeLastFragment instanceof PasskeysActivity) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                ((PasskeysActivity) safeLastFragment).added(passkey);
                return;
            }
            if (!(safeLastFragment instanceof PrivacySettingsActivity)) {
                ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.getPasskeys(), new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda506(bottomSheet, passkey, str, 3));
                return;
            }
            bottomSheet.lambda$showGiftOfferSheet$15();
            PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) safeLastFragment;
            ArrayList<TL_account.Passkey> arrayList = privacySettingsActivity.currentPasskeys;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(passkey);
            privacySettingsActivity.updateRows(true);
            safeLastFragment.presentFragment(new PasskeysActivity(arrayList));
        }
    }

    public static void lambda$showLearnSheet$9(ButtonWithCounterView buttonWithCounterView, Context context, int i, BottomSheet bottomSheet, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        PasskeysController.create(context, i, new ArticleViewer$$ExternalSyntheticLambda17(i, context, bottomSheet, buttonWithCounterView));
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == -1) {
            PasskeysController.create(getContext(), this.currentAccount, new PasskeysActivity$$ExternalSyntheticLambda2(this, 1));
        } else if (uItem.object != null) {
            openMenu(view);
        }
    }

    public void openMenu(View view) {
        int i;
        boolean z = view instanceof ImageView;
        View parent = view;
        if (z) {
            parent = view.getParent();
        }
        PasskeyCell passkeyCell = (PasskeyCell) parent;
        String str = passkeyCell.id;
        int i2 = 0;
        while (true) {
            if (i2 >= this.passkeys.size()) {
                i = -1;
                break;
            } else {
                if (str.equals(this.passkeys.get(i2).id)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i < 0 || i >= this.passkeys.size()) {
            return;
        }
        ItemOptions.makeOptions(this, passkeyCell).add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, (Runnable) new OAuthSheet$$ExternalSyntheticLambda9(this, this.passkeys.get(i), str, i, 15)).setScrimViewBackground(this.listView.getClipBackground(passkeyCell)).show();
    }

    public static void showLearnSheet(Context context, int i, Theme.ResourcesProvider resourcesProvider, boolean z) {
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, resourcesProvider);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        bottomSheetM.customView = linearLayoutM;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAnimation(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f));
        rLottieImageView.playAnimation();
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(115, 115, 17, 0, 0, 0, 9));
        int i2 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 18.0f, i2, true, resourcesProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 6.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i2, false, resourcesProvider);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 24.0f));
        ExplainStarsSheet.FeatureCell featureCell = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell.set(R.drawable.msg2_permissions, LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle));
        linearLayoutM.addView(featureCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        ExplainStarsSheet.FeatureCell featureCell2 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell2.set(R.drawable.menu_face, LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle));
        linearLayoutM.addView(featureCell2, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        ExplainStarsSheet.FeatureCell featureCell3 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell3.set(R.drawable.menu_privacy, LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle));
        linearLayoutM.addView(featureCell3, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        round.setText(LocaleController.getString(R.string.PasskeyFeatureButton), false);
        round.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda1(i, context, bottomSheetM, round));
        if (z) {
            linearLayoutM.addView(round, LayoutHelper.createLinear(-1, 48, 0.0f, 16.0f, 0.0f, 8.0f));
        }
        bottomSheetM.fixNavigationBar();
        bottomSheetM.show();
    }

    public void added(TL_account.Passkey passkey) {
        UniversalAdapter universalAdapter;
        this.passkeys.add(passkey);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        BulletinFactory.of(this).createSimpleBulletin(R.raw.passcode_lock_close, LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name)).setDuration(5000).show(true);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PasskeysActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new PasskeysActivity$$ExternalSyntheticLambda2(this, 0), new TodoItemMenu$$ExternalSyntheticLambda3(this, 10), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}

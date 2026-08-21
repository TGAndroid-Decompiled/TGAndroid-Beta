package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
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
    private ArrayList passkeys;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public PasskeysActivity(ArrayList arrayList) {
        this.passkeys = arrayList;
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
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        this.addPasskeyRow = -1;
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.PasskeyTopInfo), R.raw.passkey));
        for (int i = 0; i < this.passkeys.size(); i++) {
            arrayList.add(PasskeyCell.Factory.of((TL_account.Passkey) this.passkeys.get(i), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.openMenu(view);
                }
            }));
        }
        if (this.passkeys.size() + 1 <= getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            this.addPasskeyRow = arrayList.size();
            arrayList.add(UItem.asButton(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd)).accent());
        }
        arrayList.add(UItem.asShadow(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new Runnable() {
            @Override
            public final void run() {
                PasskeysActivity passkeysActivity = this.f$0;
                PasskeysActivity.showLearnSheet(passkeysActivity.getContext(), passkeysActivity.currentAccount, passkeysActivity.resourceProvider, passkeysActivity.passkeys.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get());
            }
        }), true)));
    }

    public void openMenu(View view) {
        boolean z = view instanceof ImageView;
        View parent = view;
        if (z) {
            parent = view.getParent();
        }
        PasskeyCell passkeyCell = (PasskeyCell) parent;
        final String str = passkeyCell.id;
        final int i = 0;
        while (true) {
            if (i >= this.passkeys.size()) {
                i = -1;
                break;
            } else if (str.equals(((TL_account.Passkey) this.passkeys.get(i)).id)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= this.passkeys.size()) {
            return;
        }
        final TL_account.Passkey passkey = (TL_account.Passkey) this.passkeys.get(i);
        ItemOptions.makeOptions(this, passkeyCell).add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() {
            @Override
            public final void run() {
                PasskeysActivity passkeysActivity = this.f$0;
                new AlertDialog.Builder(passkeysActivity.getContext()).setTitle(LocaleController.getString(R.string.PasskeyDeleteTitle)).setMessage(LocaleController.getString(R.string.PasskeyDeleteText)).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        PasskeysActivity.$r8$lambda$7UMQfIVbRMETXpyVfo42MQUtCEc(this.f$0, passkey, str, i, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            }
        }).setScrimViewBackground(this.listView.getClipBackground(passkeyCell)).show();
    }

    public static void $r8$lambda$7UMQfIVbRMETXpyVfo42MQUtCEc(final PasskeysActivity passkeysActivity, final TL_account.Passkey passkey, String str, final int i, AlertDialog alertDialog, int i2) {
        passkeysActivity.passkeys.remove(passkey);
        passkeysActivity.listView.adapter.update(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysActivity.m3602$r8$lambda$xK1B8Km6VAS6_KQOOZZ6bpX61I(this.f$0, i, passkey, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void m3602$r8$lambda$xK1B8Km6VAS6_KQOOZZ6bpX61I(PasskeysActivity passkeysActivity, int i, TL_account.Passkey passkey, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        passkeysActivity.getClass();
        if (bool instanceof TLRPC.TL_boolFalse) {
            BulletinFactory.of(passkeysActivity).showForError("FALSE");
            ArrayList arrayList = passkeysActivity.passkeys;
            arrayList.add(Utilities.clamp(i, arrayList.size(), 0), passkey);
            passkeysActivity.listView.adapter.update(true);
            return;
        }
        if (tL_error != null) {
            BulletinFactory.of(passkeysActivity).showForError(tL_error);
            ArrayList arrayList2 = passkeysActivity.passkeys;
            arrayList2.add(Utilities.clamp(i, arrayList2.size(), 0), passkey);
            passkeysActivity.listView.adapter.update(true);
        }
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == -1) {
            PasskeysController.create(getContext(), this.currentAccount, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    PasskeysActivity.$r8$lambda$1PvOwjpdZiyPZDHYkIEvyy_upo0(this.f$0, (TL_account.Passkey) obj, (String) obj2);
                }
            });
        } else if (uItem.object != null) {
            openMenu(view);
        }
    }

    public static void $r8$lambda$1PvOwjpdZiyPZDHYkIEvyy_upo0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        passkeysActivity.getClass();
        if (str == null) {
            if (passkey != null) {
                MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
                passkeysActivity.added(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if ("EMPTY".equalsIgnoreCase(str)) {
            new AlertDialog.Builder(passkeysActivity.getContext()).setTitle(LocaleController.getString(R.string.PasskeyNoOptionsTitle)).setMessage(LocaleController.getString(R.string.PasskeyNoOptionsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
        } else {
            BulletinFactory.of(passkeysActivity).showForError(str, true);
        }
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
            int iMultAlpha = Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 0.3f);
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
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3), mode));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider)));
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
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
                frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.04f)));
                this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.3f), PorterDuff.Mode.SRC_IN));
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

        @Override
        protected void onDraw(Canvas canvas) {
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
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public PasskeyCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new PasskeyCell(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((PasskeyCell) view).set((TL_account.Passkey) uItem.object, uItem.clickCallback, z);
            }

            public static UItem of(TL_account.Passkey passkey, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = passkey;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }
        }
    }

    public static void showLearnSheet(final Context context, final int i, Theme.ResourcesProvider resourcesProvider, boolean z) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        builder.setCustomView(linearLayout);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAnimation(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f));
        rLottieImageView.playAnimation();
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(115, 115, 17, 0, 0, 0, 9));
        int i2 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 18.0f, i2, true, resourcesProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 6.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i2, false, resourcesProvider);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 24.0f));
        ExplainStarsSheet.FeatureCell featureCell = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell.set(R.drawable.msg2_permissions, LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle));
        linearLayout.addView(featureCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        ExplainStarsSheet.FeatureCell featureCell2 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell2.set(R.drawable.menu_face, LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle));
        linearLayout.addView(featureCell2, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        ExplainStarsSheet.FeatureCell featureCell3 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell3.set(R.drawable.menu_privacy, LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle));
        linearLayout.addView(featureCell3, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        final BottomSheet bottomSheetCreate = builder.create();
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        round.setText(LocaleController.getString(R.string.PasskeyFeatureButton), false);
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PasskeysActivity.m3600$r8$lambda$Co5KfSIWVwqLpajjmCJiQjZ_j8(round, context, i, bottomSheetCreate, view);
            }
        });
        if (z) {
            linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 0.0f, 16.0f, 0.0f, 8.0f));
        }
        bottomSheetCreate.fixNavigationBar();
        bottomSheetCreate.show();
    }

    public static void m3600$r8$lambda$Co5KfSIWVwqLpajjmCJiQjZ_j8(final ButtonWithCounterView buttonWithCounterView, final Context context, final int i, final BottomSheet bottomSheet, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        PasskeysController.create(context, i, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysActivity.$r8$lambda$B0BS15o7WTBwGAVJlk0xcRFuUzM(buttonWithCounterView, context, bottomSheet, i, (TL_account.Passkey) obj, (String) obj2);
            }
        });
    }

    public static void $r8$lambda$B0BS15o7WTBwGAVJlk0xcRFuUzM(ButtonWithCounterView buttonWithCounterView, Context context, final BottomSheet bottomSheet, int i, final TL_account.Passkey passkey, final String str) {
        buttonWithCounterView.setLoading(false);
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if ("EMPTY".equalsIgnoreCase(str)) {
            new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.PasskeyNoOptionsTitle)).setMessage(LocaleController.getString(R.string.PasskeyNoOptionsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    bottomSheet.dismiss();
                }
            }).show();
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
                bottomSheet.dismiss();
                ((PasskeysActivity) safeLastFragment).added(passkey);
                return;
            }
            if (safeLastFragment instanceof PrivacySettingsActivity) {
                bottomSheet.dismiss();
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) safeLastFragment;
                ArrayList arrayList = privacySettingsActivity.currentPasskeys;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(passkey);
                privacySettingsActivity.updateRows(true);
                safeLastFragment.presentFragment(new PasskeysActivity(arrayList));
                return;
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.getPasskeys(), new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    PasskeysActivity.$r8$lambda$jbZDA2WwAQqH8mQRACHmp7eg8Tw(bottomSheet, passkey, str, (TL_account.Passkeys) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    public static void $r8$lambda$jbZDA2WwAQqH8mQRACHmp7eg8Tw(BottomSheet bottomSheet, final TL_account.Passkey passkey, String str, TL_account.Passkeys passkeys, TLRPC.TL_error tL_error) {
        if (passkeys == null) {
            if (tL_error != null) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(str);
                return;
            }
            return;
        }
        bottomSheet.dismiss();
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
        final PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
        safeLastFragment.presentFragment(passkeysActivity);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.added(passkey);
            }
        }, 150L);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}

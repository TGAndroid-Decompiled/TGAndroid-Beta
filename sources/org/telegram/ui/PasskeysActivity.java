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
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
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

public final class PasskeysActivity extends BaseFragment {
    public UniversalRecyclerView listView;
    public final ArrayList passkeys;

    public final class PasskeyCell extends FrameLayout {
        public final int currentAccount;
        public String id;
        public final FrameLayout imageBackgroundView;
        public final BackupImageView imageView;
        public boolean needDivider;
        public final ImageView optionsView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                PasskeyCell passkeyCell = (PasskeyCell) view;
                TL_account.Passkey passkey = (TL_account.Passkey) uItem.object;
                View.OnClickListener onClickListener = uItem.clickCallback;
                passkeyCell.getClass();
                passkeyCell.id = passkey.id;
                long j = passkey.software_emoji_id;
                FrameLayout frameLayout = passkeyCell.imageBackgroundView;
                BackupImageView backupImageView = passkeyCell.imageView;
                if (j != 0) {
                    backupImageView.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(passkeyCell.currentAccount, j, null, 3));
                    frameLayout.setBackground(null);
                    backupImageView.setColorFilter(null);
                    backupImageView.setScaleX(1.0f);
                    backupImageView.setScaleY(1.0f);
                } else {
                    int iDp = AndroidUtilities.dp(4.0f);
                    int i = Theme.key_windowBackgroundWhiteBlackText;
                    Theme.ResourcesProvider resourcesProvider = passkeyCell.resourcesProvider;
                    frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.04f, Theme.getColor(i, resourcesProvider))));
                    backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.3f, Theme.getColor(i, resourcesProvider)), PorterDuff.Mode.SRC_IN));
                    backupImageView.setImageResource(R.drawable.msg2_permissions);
                    backupImageView.setScaleX(0.666f);
                    backupImageView.setScaleY(0.666f);
                    backupImageView.setAnimatedEmojiDrawable(null);
                }
                boolean zIsEmpty = TextUtils.isEmpty(passkey.name);
                TextView textView = passkeyCell.titleView;
                if (zIsEmpty) {
                    textView.setText(LocaleController.getString(R.string.PasskeyUnknown));
                } else {
                    textView.setText(passkey.name);
                }
                int i2 = passkey.last_usage_date;
                TextView textView2 = passkeyCell.subtitleView;
                if (i2 != 0) {
                    textView2.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i2, false)));
                } else {
                    textView2.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
                }
                passkeyCell.optionsView.setOnClickListener(onClickListener);
                passkeyCell.needDivider = z;
                passkeyCell.setWillNotDraw(!z);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
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
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 15.0f, i2, true, null);
            this.titleView = textViewMakeTextView;
            textViewMakeTextView.setSingleLine();
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textViewMakeTextView.setEllipsize(truncateAt);
            addView(textViewMakeTextView, LayoutHelper.createFrame(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
            int i3 = Theme.key_windowBackgroundWhiteGrayText;
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 13.0f, i3, false, null);
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
        public final void onDraw(Canvas canvas) {
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
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }
    }

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.passkeys = arrayList;
    }

    public static void showLearnSheet(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        bottomSheetM.customView = linearLayoutM;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAnimation(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        rLottieImageView.playAnimation();
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(115, 115, 17, 0, 0, 0, 9));
        int i2 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 18.0f, i2, true, resourcesProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i2, false, resourcesProvider);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        ExplainStarsSheet.FeatureCell featureCell = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell.set(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        linearLayoutM.addView(featureCell, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ExplainStarsSheet.FeatureCell featureCell2 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell2.set(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        linearLayoutM.addView(featureCell2, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ExplainStarsSheet.FeatureCell featureCell3 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell3.set(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        linearLayoutM.addView(featureCell3, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        buttonWithCounterView.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(buttonWithCounterView, context, i, bottomSheetM, 4));
        if (z) {
            linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        bottomSheetM.fixNavigationBar();
        bottomSheetM.show();
    }

    public final void added(TL_account.Passkey passkey) {
        UniversalAdapter universalAdapter;
        this.passkeys.add(passkey);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        bulletinCreateSimpleBulletin.duration = 5000;
        bulletinCreateSimpleBulletin.show(true);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new PasskeysActivity$$ExternalSyntheticLambda1(this, 0), new PhotoViewer$$ExternalSyntheticLambda115(this, 17), null, getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        universalRecyclerView2.adapter.applyBackground = false;
        frameLayout.addView(universalRecyclerView2, LayoutHelper.createFrame(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$fillItems$0$2() {
        showLearnSheet(this.currentAccount, getParentActivity(), this.resourceProvider, this.passkeys.size() + 1 <= getMessagesController().config.passkeysAccountPasskeysMax.get());
    }

    public final void lambda$onItemClick$4(TL_account.Passkey passkey, String str) {
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
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.PasskeyNoOptionsText);
        ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
    }

    public final void lambda$openMenu$2(TL_account.Passkey passkey, String str, int i) {
        this.passkeys.remove(passkey);
        this.listView.adapter.update(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletepasskey, new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda293(this, i, passkey, 2));
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void onItemClick$7(UItem uItem, View view) {
        if (uItem.id == -1) {
            PasskeysController.create(getParentActivity(), this.currentAccount, new PasskeysActivity$$ExternalSyntheticLambda1(this, 1));
        } else if (uItem.object != null) {
            openMenu(view);
        }
    }

    public final void openMenu(View view) {
        ArrayList arrayList;
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
            arrayList = this.passkeys;
            if (i2 >= arrayList.size()) {
                i = -1;
                break;
            } else {
                if (str.equals(((TL_account.Passkey) arrayList.get(i2)).id)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i);
        ItemOptions itemOptions = new ItemOptions(this, passkeyCell, false, true);
        itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new OAuthSheet$$ExternalSyntheticLambda2(this, passkey, str, i, 7), true);
        itemOptions.setScrimViewBackground(this.listView.getClipBackground(passkeyCell, false));
        itemOptions.show();
    }
}

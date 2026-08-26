package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class MessagePrivateSeenView extends FrameLayout {
    public static final int TYPE_EDIT = 1;
    public static final int TYPE_FORWARD = 2;
    public static final int TYPE_SEEN = 0;
    private final int currentAccount;
    private final long dialogId;
    private final Runnable dismiss;
    private final int edit_date;
    private final int fwd_date;
    public boolean isPremiumLocked;
    private final TextView loadingView;
    private final int messageDiff;
    private final int messageId;
    float minWidth;
    private final TextView premiumTextView;
    private final Theme.ResourcesProvider resourcesProvider;
    private final int sent_date;
    private final int type;
    private final LinearLayout valueLayout;
    private final TextView valueTextView;

    public MessagePrivateSeenView(Context context, int i, MessageObject messageObject, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        super(context);
        this.isPremiumLocked = false;
        this.minWidth = -1.0f;
        this.type = i;
        int i2 = messageObject.currentAccount;
        this.currentAccount = i2;
        this.resourcesProvider = resourcesProvider;
        this.dismiss = runnable;
        this.messageDiff = ConnectionsManager.getInstance(i2).getCurrentTime() - messageObject.messageOwner.date;
        this.dialogId = messageObject.getDialogId();
        this.messageId = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        this.sent_date = message == null ? 0 : message.date;
        this.edit_date = message == null ? 0 : message.edit_date;
        this.fwd_date = (message == null || (messageFwdHeader = message.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(i == 1 ? AppGlobalConfig.getInstance(i2).messagePrimaryEditedDate.get() ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i == 2 ? R.drawable.menu_forward_stamp : messageObject.isVoice() ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        TextView textView = new TextView(context);
        this.loadingView = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new LoadingSpan(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), resourcesProvider), 0, spannableStringBuilder.length() - 1, 17);
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.multAlpha(0.7f, Theme.getColor(i3, resourcesProvider)));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, LayoutHelper.createFrame(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.valueLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        OKLCH.m(i3, resourcesProvider, textView2, 14.0f);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView2, LayoutHelper.createLinear(-2, -2, 19, 0, -1, 0, 0), context);
        this.premiumTextView = textViewM;
        textViewM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.multAlpha(0.75f, Theme.getColor(Theme.key_divider, resourcesProvider))));
        OKLCH.m(i3, resourcesProvider, textViewM, 11.0f);
        textViewM.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 19, 4, 0, 0, 0));
        request();
    }

    public void lambda$request$0(View view) {
        showSheet(getContext(), this.currentAccount, this.dialogId, false, this.dismiss, new GroupCallPip$$ExternalSyntheticLambda2(this, 20), this.resourcesProvider);
    }

    public void lambda$request$1(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                this.valueTextView.setText(LocaleController.getString(R.string.PmReadUnknown));
                this.premiumTextView.setVisibility(8);
            } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                this.isPremiumLocked = true;
                this.valueTextView.setText(LocaleController.getString(R.string.PmRead));
                this.premiumTextView.setText(LocaleController.getString(R.string.PmReadShowWhen));
            } else {
                this.valueTextView.setText(LocaleController.getString("UnknownError"));
                this.premiumTextView.setVisibility(8);
                BulletinFactory.of(Bulletin.BulletinWindow.make(getContext()), this.resourcesProvider).showForError(tL_error);
            }
        } else if (tLObject instanceof TLRPC.TL_outboxReadDate) {
            this.valueTextView.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject).date));
            this.premiumTextView.setVisibility(8);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.valueLayout.animate().alpha(1.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        OKLCH.m(viewPropertyAnimatorAlpha, cubicBezierInterpolator, 320L);
        this.loadingView.animate().alpha(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
        if (this.isPremiumLocked) {
            setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 6, 0));
            setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 5));
        } else {
            setBackground(null);
            setOnClickListener(null);
        }
    }

    public void lambda$request$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, tL_error, tLObject, 28));
    }

    public static void lambda$showSheet$3(TLRPC.TL_error tL_error, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable) {
        if (tL_error != null) {
            BulletinFactory.global().showForError(tL_error);
            return;
        }
        buttonWithCounterView.setLoading(false);
        bottomSheet.lambda$showGiftOfferSheet$15();
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.PremiumLastSeenSet, BulletinFactory.global(), R.raw.chats_infotip);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$showSheet$4(ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(15, tL_error, buttonWithCounterView, bottomSheet, runnable));
    }

    public static void lambda$showSheet$5(TLRPC.TL_error tL_error, Context context, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable) {
        if (tL_error != null) {
            BulletinFactory.of(Bulletin.BulletinWindow.make(context), resourcesProvider).showForError(tL_error);
            return;
        }
        buttonWithCounterView.setLoading(false);
        bottomSheet.lambda$showGiftOfferSheet$15();
        FactCheckController$$ExternalSyntheticOutline0.m(R.string.PremiumReadSet, BulletinFactory.of(Bulletin.BulletinWindow.make(context), resourcesProvider), R.raw.chats_infotip);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$showSheet$6(Context context, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(tL_error, context, resourcesProvider, buttonWithCounterView, bottomSheet, runnable));
    }

    public static void lambda$showSheet$7(ButtonWithCounterView buttonWithCounterView, boolean z, int i, BottomSheet bottomSheet, Runnable runnable, Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        buttonWithCounterView.setLoading(true);
        if (z) {
            TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
            setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
            setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            ConnectionsManager.getInstance(i).sendRequest(setprivacy, new StickersAlert$$ExternalSyntheticLambda28(buttonWithCounterView, bottomSheet, runnable, 4));
            return;
        }
        TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i).getGlobalPrivacySettings();
        setglobalprivacysettings.settings = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
        }
        setglobalprivacysettings.settings.hide_read_marks = false;
        ConnectionsManager.getInstance(i).sendRequest(setglobalprivacysettings, new StickersAlert$$ExternalSyntheticLambda19(context, resourcesProvider, buttonWithCounterView, bottomSheet, runnable, 1));
    }

    public static void lambda$showSheet$8(boolean z, BottomSheet bottomSheet, Runnable runnable, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment(z ? "lastseen" : "readtime"));
            bottomSheet.lambda$showGiftOfferSheet$15();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void request() {
        int i = this.type;
        if (i == 1) {
            this.valueLayout.setAlpha(1.0f);
            this.loadingView.setAlpha(0.0f);
            this.premiumTextView.setVisibility(8);
            this.valueTextView.setText(AppGlobalConfig.getInstance(this.currentAccount).messagePrimaryEditedDate.get() ? LocaleController.formatPmSentDate(this.sent_date) : LocaleController.formatPmEditedDate(this.edit_date));
            return;
        }
        if (i == 2) {
            this.valueLayout.setAlpha(1.0f);
            this.loadingView.setAlpha(0.0f);
            this.premiumTextView.setVisibility(8);
            this.valueTextView.setText(LocaleController.formatPmFwdDate(this.fwd_date));
            return;
        }
        setOnClickListener(null);
        this.valueLayout.setAlpha(0.0f);
        this.loadingView.setAlpha(1.0f);
        this.premiumTextView.setVisibility(0);
        TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
        tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_getOutboxReadDate.msg_id = this.messageId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getOutboxReadDate, new UndoView$$ExternalSyntheticLambda0(this, 11));
    }

    public static void showSheet(final Context context, final int i, long j, final boolean z, Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        final BottomSheet bottomSheet = new BottomSheet(context, false, false, resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(i).premiumFeaturesBlocked();
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(z ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70);
        rLottieImageView.playAnimation();
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i3 = Theme.key_dialogTextBlack;
        OKLCH.m(i3, resourcesProvider, textView, 20.0f);
        textView.setText(LocaleController.getString(z ? R.string.PremiumLastSeenHeader1 : R.string.PremiumReadHeader1));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        OKLCH.m(i3, resourcesProvider, textView2, 14.0f);
        String firstName = j > 0 ? UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j))) : "";
        if (z) {
            i2 = zPremiumFeaturesBlocked ? R.string.PremiumLastSeenText1Locked : R.string.PremiumLastSeenText1;
        } else {
            i2 = zPremiumFeaturesBlocked ? R.string.PremiumReadText1Locked : R.string.PremiumReadText1;
        }
        ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(i2, new Object[]{firstName}, textView2);
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
        final ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(z ? R.string.PremiumLastSeenButton1 : R.string.PremiumReadButton1), false);
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 1));
        buttonWithCounterViewM.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Context context2 = context;
                MessagePrivateSeenView.lambda$showSheet$7(buttonWithCounterViewM, z, i, bottomSheet, runnable2, context2, resourcesProvider, view);
            }
        });
        if (!zPremiumFeaturesBlocked) {
            SimpleTextView simpleTextView = new SimpleTextView(context) {
                private final Paint paint = new Paint(1);

                @Override
                public void dispatchDraw(Canvas canvas) {
                    this.paint.setColor(Theme.getColor(Theme.key_dialogGrayLine, resourcesProvider));
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, this.paint);
                    canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                    super.dispatchDraw(canvas);
                }
            };
            simpleTextView.setGravity(17);
            simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            simpleTextView.setText(" " + LocaleController.getString(R.string.PremiumOr) + " ");
            simpleTextView.setTextSize(14);
            linearLayoutM.addView(simpleTextView, LayoutHelper.createLinear(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView3.setTextSize(1, 20.0f);
            textView3.setText(LocaleController.getString(z ? R.string.PremiumLastSeenHeader2 : R.string.PremiumReadHeader2));
            linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            OKLCH.m(i3, resourcesProvider, textView4, 14.0f);
            ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(z ? R.string.PremiumLastSeenText2 : R.string.PremiumReadText2, new Object[]{firstName}, textView4);
            linearLayoutM.addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
            PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(8.0f), true, resourcesProvider);
            premiumButtonView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda33(z, bottomSheet, runnable));
            premiumButtonView.setOverlayText(LocaleController.getString(z ? R.string.PremiumLastSeenButton2 : R.string.PremiumReadButton2), false, false);
            linearLayoutM.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 1, 0, 0, 0, 4));
        }
        bottomSheet.setCustomView(linearLayoutM);
        bottomSheet.show();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Bulletin.getVisibleBulletin() != null) {
            Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin.getLayout() == null || visibleBulletin.getLayout().getParent() == null || !(visibleBulletin.getLayout().getParent().getParent() instanceof Bulletin.BulletinWindow.BulletinWindowLayout)) {
                return;
            }
            visibleBulletin.hide();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.minWidth < 0.0f) {
            this.minWidth = 0.0f;
            if (this.type == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fMax = Math.max(this.minWidth, AndroidUtilities.dp(144.0f));
                this.minWidth = fMax;
                float fMax2 = Math.max(fMax, this.valueTextView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.minWidth = fMax2;
                float fMax3 = Math.max(fMax2, this.valueTextView.getPaint().measureText(LocaleController.getString(R.string.PmRead) + this.premiumTextView.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.minWidth = fMax3;
                float fMax4 = Math.max(fMax3, this.valueTextView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.minWidth = fMax4;
                if (this.messageDiff > 86400) {
                    this.minWidth = Math.max(fMax4, this.valueTextView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                }
                if (this.messageDiff > 172800) {
                    float f = this.minWidth;
                    float fDp = AndroidUtilities.dp(48.0f);
                    TextPaint paint = this.valueTextView.getPaint();
                    int i3 = R.string.PmReadDateTimeAt;
                    float fMax5 = Math.max(f, paint.measureText(LocaleController.formatString(i3, LocaleController.getInstance().getFormatterDayMonth().format(new Date(jCurrentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + fDp);
                    this.minWidth = fMax5;
                    this.minWidth = Math.max(fMax5, this.valueTextView.getPaint().measureText(LocaleController.formatString(i3, LocaleController.getInstance().getFormatterYear().format(new Date(jCurrentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                }
            } else {
                this.minWidth = this.valueTextView.getPaint().measureText(this.valueTextView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i4 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f2 = size;
        float f3 = this.minWidth;
        if (f2 < f3 || mode == Integer.MIN_VALUE) {
            size = (int) f3;
        } else {
            i4 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i4), i2);
    }
}

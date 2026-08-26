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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda206;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class MessagePrivateSeenView extends FrameLayout {
    public final int currentAccount;
    public final long dialogId;
    public final Runnable dismiss;
    public final int edit_date;
    public final int fwd_date;
    public boolean isPremiumLocked;
    public final TextView loadingView;
    public final int messageDiff;
    public final int messageId;
    public float minWidth;
    public final TextView premiumTextView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final int sent_date;
    public final int type;
    public final LinearLayout valueLayout;
    public final TextView valueTextView;

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
        spannableStringBuilder.setSpan(new LoadingSpan(AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), textView, resourcesProvider), 0, spannableStringBuilder.length() - 1, 17);
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
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView2, LayoutHelper.createLinear(-2, -2, 19, 0, -1, 0, 0), context);
        this.premiumTextView = textViewM;
        textViewM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.multAlpha(0.75f, Theme.getColor(Theme.key_divider, resourcesProvider))));
        OKLCH.m(i3, resourcesProvider, textViewM, 11.0f);
        textViewM.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 19, 4, 0, 0, 0));
        request();
    }

    public static void showSheet(final Context context, final int i, long j, final boolean z, Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        final BottomSheet bottomSheet = new BottomSheet(context, resourcesProvider, false, false);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(i).premiumFeaturesBlocked();
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(z ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
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
        zzko.m(i2, new Object[]{firstName}, textView2);
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
        final ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(z ? R.string.PremiumLastSeenButton1 : R.string.PremiumReadButton1), false, true);
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 1));
        buttonWithCounterViewM.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ButtonWithCounterView buttonWithCounterView = buttonWithCounterViewM;
                buttonWithCounterView.setLoading(true);
                BottomSheet bottomSheet2 = bottomSheet;
                Runnable runnable3 = runnable2;
                boolean z2 = z;
                int i4 = i;
                if (z2) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i4).sendRequest(setprivacy, new BoostsActivity$$ExternalSyntheticLambda7(buttonWithCounterView, bottomSheet2, runnable3, 17));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i4).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i4).sendRequest(setglobalprivacysettings, new ChatActivity$$ExternalSyntheticLambda206(context, resourcesProvider, buttonWithCounterView, bottomSheet2, runnable3, 4));
            }
        });
        if (!zPremiumFeaturesBlocked) {
            SimpleTextView simpleTextView = new SimpleTextView(context) {
                public final Paint paint = new Paint(1);

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    Paint paint = this.paint;
                    paint.setColor(Theme.getColor(Theme.key_dialogGrayLine, resourcesProvider));
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, paint);
                    canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                    super.dispatchDraw(canvas);
                }
            };
            simpleTextView.setGravity(17);
            simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            simpleTextView.setText(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
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
            zzko.m(z ? R.string.PremiumLastSeenText2 : R.string.PremiumReadText2, new Object[]{firstName}, textView4);
            linearLayoutM.addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
            PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), context, resourcesProvider, true);
            premiumButtonView.setOnClickListener(new ContentPreviewViewer$1$$ExternalSyntheticLambda5(z, bottomSheet, runnable));
            premiumButtonView.setOverlayText(LocaleController.getString(z ? R.string.PremiumLastSeenButton2 : R.string.PremiumReadButton2), false, false);
            linearLayoutM.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 1, 0, 0, 0, 4));
        }
        bottomSheet.setCustomView(linearLayoutM);
        bottomSheet.show();
    }

    @Override
    public final void onDetachedFromWindow() {
        Bulletin.Layout layout;
        super.onDetachedFromWindow();
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin == null || (layout = bulletin.layout) == null || layout.getParent() == null || !(layout.getParent().getParent() instanceof Bulletin.BulletinWindow.BulletinWindowLayout)) {
            return;
        }
        bulletin.hide();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.minWidth < 0.0f) {
            this.minWidth = 0.0f;
            TextView textView = this.valueTextView;
            if (this.type == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fMax = Math.max(this.minWidth, AndroidUtilities.dp(144.0f));
                this.minWidth = fMax;
                float fMax2 = Math.max(fMax, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.minWidth = fMax2;
                float fMax3 = Math.max(fMax2, textView.getPaint().measureText(LocaleController.getString(R.string.PmRead) + this.premiumTextView.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.minWidth = fMax3;
                float fMax4 = Math.max(fMax3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.minWidth = fMax4;
                int i3 = this.messageDiff;
                if (i3 > 86400) {
                    f = 48.0f;
                    this.minWidth = Math.max(fMax4, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float f2 = this.minWidth;
                    float fDp = AndroidUtilities.dp(f);
                    TextPaint paint = textView.getPaint();
                    int i4 = R.string.PmReadDateTimeAt;
                    float fMax5 = Math.max(f2, paint.measureText(LocaleController.formatString(i4, LocaleController.getInstance().getFormatterDayMonth().format(new Date(jCurrentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + fDp);
                    this.minWidth = fMax5;
                    this.minWidth = Math.max(fMax5, textView.getPaint().measureText(LocaleController.formatString(i4, LocaleController.getInstance().getFormatterYear().format(new Date(jCurrentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(f));
                }
            } else {
                this.minWidth = textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i5 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f3 = size;
        float f4 = this.minWidth;
        if (f3 < f4 || mode == Integer.MIN_VALUE) {
            size = (int) f4;
        } else {
            i5 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i5), i2);
    }

    public final void request() {
        TextView textView = this.valueTextView;
        TextView textView2 = this.premiumTextView;
        TextView textView3 = this.loadingView;
        LinearLayout linearLayout = this.valueLayout;
        int i = this.currentAccount;
        int i2 = this.type;
        if (i2 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(AppGlobalConfig.getInstance(i).messagePrimaryEditedDate.get() ? LocaleController.formatPmSentDate(this.sent_date) : LocaleController.formatPmEditedDate(this.edit_date));
            return;
        }
        if (i2 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.fwd_date));
            return;
        }
        setOnClickListener(null);
        linearLayout.setAlpha(0.0f);
        textView3.setAlpha(1.0f);
        textView2.setVisibility(0);
        TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
        tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        tL_messages_getOutboxReadDate.msg_id = this.messageId;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getOutboxReadDate, new CallLogActivity$$ExternalSyntheticLambda1(this, 24));
    }
}

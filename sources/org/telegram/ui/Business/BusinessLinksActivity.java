package org.telegram.ui.Business;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda120;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda137;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.PhotoEditToolCell$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda249;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanCopyToClipboard;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;

public final class BusinessLinksActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public static AlertDialog currentDialog;

    public final class BusinessLinkView extends FrameLayout {
        public TL_account.TL_businessChatLink businessLink;
        public final SimpleTextView clicksCountTextView;
        public final SpoilersTextView messagePreviewTextView;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final SimpleTextView titleTextView;

        public BusinessLinkView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.msg_limit_links);
            imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(36.0f), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
            imageView.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 7));
            addView(imageView, LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleTextView = simpleTextView;
            simpleTextView.setTextSize(15);
            simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(simpleTextView, LayoutHelper.createFrameRelatively(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.clicksCountTextView = simpleTextView2;
            simpleTextView2.setTextSize(14);
            int i = Theme.key_windowBackgroundWhiteGrayText2;
            simpleTextView2.setTextColor(Theme.getColor(null, i, false));
            simpleTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(simpleTextView2, LayoutHelper.createFrameRelatively(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, true, null);
            this.messagePreviewTextView = spoilersTextView;
            spoilersTextView.setTextSize(1, 13.0f);
            spoilersTextView.setMaxLines(1);
            spoilersTextView.setEllipsize(TextUtils.TruncateAt.END);
            spoilersTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            spoilersTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            spoilersTextView.allowClickSpoilers = false;
            spoilersTextView.setUseAlphaForEmoji(false);
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            addView(spoilersTextView, LayoutHelper.createFrameRelatively(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), themePaint);
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            boolean z2 = LocaleController.isRTL;
            SimpleTextView simpleTextView = this.clicksCountTextView;
            SimpleTextView simpleTextView2 = this.titleTextView;
            if (z2) {
                simpleTextView2.setPadding(simpleTextView.getTextWidth(), 0, 0, 0);
            } else {
                simpleTextView2.setPadding(0, 0, simpleTextView.getTextWidth(), 0);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    public final class BusinessLinkWrapper {
        public final TL_account.TL_businessChatLink link;

        public BusinessLinkWrapper(TL_account.TL_businessChatLink tL_businessChatLink) {
            this.link = tL_businessChatLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && BusinessLinkWrapper.class == obj.getClass()) {
                TL_account.TL_businessChatLink tL_businessChatLink = this.link;
                int i = tL_businessChatLink.views;
                TL_account.TL_businessChatLink tL_businessChatLink2 = ((BusinessLinkWrapper) obj).link;
                if (i == tL_businessChatLink2.views && TextUtils.equals(tL_businessChatLink.link, tL_businessChatLink2.link) && TextUtils.equals(tL_businessChatLink.title, tL_businessChatLink2.title) && TextUtils.equals(tL_businessChatLink.message, tL_businessChatLink2.message) && MediaDataController.entitiesEqual(tL_businessChatLink.entities, tL_businessChatLink2.entities)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static int getPrivacyType(ArrayList arrayList) {
        byte b = -1;
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    z = true;
                } else if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                    if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        z = true;
                    } else if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && b == -1) {
                        b = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (byte) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (byte) 1 : (byte) 2;
                    }
                }
            }
        }
        if (b == 0 || (b == -1 && z)) {
            return 0;
        }
        return b == 2 ? 2 : 1;
    }

    public static void openRenameAlert(Context context, int i, TL_account.TL_businessChatLink tL_businessChatLink, final Theme.ResourcesProvider resourcesProvider) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        int i2 = 0;
        boolean z = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = z ? new DarkAlertDialog.Builder(context, i2, resourcesProvider) : new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.BusinessLinksRenameTitle));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.setGravity(5);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                animatedTextDrawable.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                animatedTextDrawable.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                animatedTextDrawable.draw(canvas);
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                super.onTextChanged(charSequence, i3, i4, i5);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                if (animatedTextDrawable != null) {
                    this.limitCount = 32 - charSequence.length();
                    animatedTextDrawable.cancelAnimation();
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str);
                }
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        MediaDataController.getInstance(i).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        editTextBoldCursor.setInputType(49153);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setText(tL_businessChatLink.title);
        int i3 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i3, resourcesProvider));
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setCursorColor(Theme.getColor(null, Theme.key_chat_messagePanelCursor, false));
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        TextView textView = new TextView(context);
        OKLCH.m(i3, resourcesProvider, textView, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 24.0f, 5.0f, 24.0f, 12.0f));
        linearLayoutM.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.setView(linearLayoutM);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        editTextBoldCursor.setOnEditorActionListener(new AlertsCreator$$ExternalSyntheticLambda249(editTextBoldCursor, i, tL_businessChatLink, alertDialogArr, view, 1));
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new VoIPService$$ExternalSyntheticLambda120(editTextBoldCursor, i, tL_businessChatLink, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(16));
        if (z) {
            AlertDialog alertDialogCreate = builder.create();
            currentDialog = alertDialogCreate;
            alertDialogArr[0] = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(new QuickRepliesActivity$$ExternalSyntheticLambda9(view, 1));
            currentDialog.setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(1, editTextBoldCursor));
            currentDialog.showDelayed(250L);
        } else {
            builder.overrideDismissListener(new GiftSheet$$ExternalSyntheticLambda4(5, view, editTextBoldCursor));
            AlertDialog alertDialogCreate2 = builder.create();
            alertDialogArr[0] = alertDialogCreate2;
            int i4 = 1;
            alertDialogCreate2.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(editTextBoldCursor, i4));
            alertDialogArr[0].setOnShowListener(new VoIPService$$ExternalSyntheticLambda137(view, editTextBoldCursor, i4));
            alertDialogArr[0].show();
        }
        alertDialogArr[0].dismissDialogByButtons = false;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.listView.setSections();
        this.listView.adapter.setApplyBackground(false);
        this.actionBar.setAdaptiveBackground(this.listView, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.businessLinksUpdated || i == NotificationCenter.privacyRulesUpdated) {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
                return;
            }
            universalAdapter.update(true);
            return;
        }
        if (i != NotificationCenter.businessLinkCreated) {
            if (i == NotificationCenter.needDeleteBusinessLink) {
                BusinessLinksController.getInstance(this.currentAccount).deleteLinkUndoable(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(6, "chatMode");
            bundleM.putString("business_link", tL_businessChatLink.link);
            presentFragment(new ChatActivity(bundleM));
        }
    }

    @Override
    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        int i = 0;
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessLinks), LocaleController.getString(R.string.BusinessLinksInfo), R.raw.biz_links));
        universalAdapter.whiteSectionStart();
        BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.currentAccount);
        if (businessLinksController.links.size() < MessagesController.getInstance(businessLinksController.currentAccount).businessChatLinksLimit) {
            arrayList.add(UItem.asButton(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd)).accent());
        }
        ArrayList arrayList2 = BusinessLinksController.getInstance(this.currentAccount).links;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(UItem.asBusinessChatLink(new BusinessLinkWrapper((TL_account.TL_businessChatLink) obj)));
        }
        universalAdapter.whiteSectionEnd();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(strM + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (getPrivacyType(privacyRules) != 1 || getPrivacyType(privacyRules2) != 2)) {
            StringBuilder sbM = Log.m(strM, "+");
            sbM.append(currentUser.phone);
            arrayList3.add(sbM.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String string = arrayList3.size() == 2 ? LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1)) : LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(string);
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            String str = (String) obj2;
            int iIndexOf = string.indexOf(str);
            if (iIndexOf > -1) {
                spannableString.setSpan(new URLSpanCopyToClipboard(zzii.m("https://", str), this), iIndexOf, str.length() + iIndexOf, 33);
            }
        }
        arrayList.add(UItem.asShadow(spannableString));
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    public final void lambda$onLongClick$10(TL_account.TL_businessChatLink tL_businessChatLink) {
        openRenameAlert(getContext(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    public final void lambda$onLongClick$11(TL_account.TL_businessChatLink tL_businessChatLink) {
        BusinessLinksController.getInstance(this.currentAccount).deleteLinkUndoable(this, tL_businessChatLink.link);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        AlertDialog alertDialog = currentDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        currentDialog.dismiss();
        return false;
    }

    @Override
    public final void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == 1) {
            BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(businessLinksController.currentAccount).sendRequest(createbusinesschatlink, new BusinessLinksController$$ExternalSyntheticLambda0(businessLinksController, 0));
            return;
        }
        if (uItem.viewType == 29) {
            Object obj = uItem.object;
            if (obj instanceof BusinessLinkWrapper) {
                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(6, "chatMode");
                bundleM.putString("business_link", ((BusinessLinkWrapper) obj).link.link);
                presentFragment(new ChatActivity(bundleM));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.currentAccount);
        if (businessLinksController.loaded) {
            businessLinksController.load(false, true);
        } else {
            businessLinksController.load(true, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        Bulletin.hideVisible();
        super.onFragmentDestroy();
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.viewType != 29) {
            return false;
        }
        Object obj = uItem.object;
        if (!(obj instanceof BusinessLinkWrapper)) {
            return false;
        }
        final TL_account.TL_businessChatLink tL_businessChatLink = ((BusinessLinkWrapper) obj).link;
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ActivityCompat$$ExternalSyntheticLambda0(tL_businessChatLink, 29));
        final int i2 = 0;
        itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
            public final BusinessLinksActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        BusinessLinksActivity businessLinksActivity = this.f$0;
                        businessLinksActivity.getClass();
                        Intent intent = new Intent(businessLinksActivity.getContext(), (Class<?>) LaunchActivity.class);
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                        businessLinksActivity.startActivityForResult(intent, 500);
                        break;
                    case 1:
                        this.f$0.lambda$onLongClick$10(tL_businessChatLink);
                        break;
                    default:
                        BusinessLinksActivity businessLinksActivity2 = this.f$0;
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(businessLinksActivity2.getContext(), 0, businessLinksActivity2.getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessLinksDeleteTitle)).setMessage(LocaleController.getString(R.string.BusinessLinksDeleteMessage)).setPositiveButton(LocaleController.getString(R.string.Remove), new PhotoEditToolCell$$ExternalSyntheticLambda0(27, businessLinksActivity2, tL_businessChatLink)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                        businessLinksActivity2.showDialog(alertDialogCreate);
                        TextView textView = (TextView) alertDialogCreate.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(businessLinksActivity2.getThemedColor(Theme.key_text_RedBold));
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
            public final BusinessLinksActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        BusinessLinksActivity businessLinksActivity = this.f$0;
                        businessLinksActivity.getClass();
                        Intent intent = new Intent(businessLinksActivity.getContext(), (Class<?>) LaunchActivity.class);
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                        businessLinksActivity.startActivityForResult(intent, 500);
                        break;
                    case 1:
                        this.f$0.lambda$onLongClick$10(tL_businessChatLink);
                        break;
                    default:
                        BusinessLinksActivity businessLinksActivity2 = this.f$0;
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(businessLinksActivity2.getContext(), 0, businessLinksActivity2.getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessLinksDeleteTitle)).setMessage(LocaleController.getString(R.string.BusinessLinksDeleteMessage)).setPositiveButton(LocaleController.getString(R.string.Remove), new PhotoEditToolCell$$ExternalSyntheticLambda0(27, businessLinksActivity2, tL_businessChatLink)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                        businessLinksActivity2.showDialog(alertDialogCreate);
                        TextView textView = (TextView) alertDialogCreate.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(businessLinksActivity2.getThemedColor(Theme.key_text_RedBold));
                        }
                        break;
                }
            }
        });
        final int i4 = 2;
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable(this) {
            public final BusinessLinksActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        BusinessLinksActivity businessLinksActivity = this.f$0;
                        businessLinksActivity.getClass();
                        Intent intent = new Intent(businessLinksActivity.getContext(), (Class<?>) LaunchActivity.class);
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                        businessLinksActivity.startActivityForResult(intent, 500);
                        break;
                    case 1:
                        this.f$0.lambda$onLongClick$10(tL_businessChatLink);
                        break;
                    default:
                        BusinessLinksActivity businessLinksActivity2 = this.f$0;
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(businessLinksActivity2.getContext(), 0, businessLinksActivity2.getResourceProvider()).setTitle(LocaleController.getString(R.string.BusinessLinksDeleteTitle)).setMessage(LocaleController.getString(R.string.BusinessLinksDeleteMessage)).setPositiveButton(LocaleController.getString(R.string.Remove), new PhotoEditToolCell$$ExternalSyntheticLambda0(27, businessLinksActivity2, tL_businessChatLink)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                        businessLinksActivity2.showDialog(alertDialogCreate);
                        TextView textView = (TextView) alertDialogCreate.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(businessLinksActivity2.getThemedColor(Theme.key_text_RedBold));
                        }
                        break;
                }
            }
        });
        itemOptionsMakeOptions.setScrimViewBackground(this.listView.getClipBackground(view));
        itemOptionsMakeOptions.show();
        return true;
    }
}

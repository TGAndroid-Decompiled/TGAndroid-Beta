package org.telegram.ui.Business;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
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
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda137;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda201;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SearchTagsList$$ExternalSyntheticLambda10;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.StickersActivity;

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
            imageView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 11));
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
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
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

    public static void openRenameAlert(Activity activity, int i, TL_account.TL_businessChatLink tL_businessChatLink, final Theme.ResourcesProvider resourcesProvider) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        boolean z = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = z ? new AlertDialogDecor.Builder(activity, 0, resourcesProvider) : new AlertDialog.Builder(activity, 0, resourcesProvider);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
                this.limit = animatedTextDrawable;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                animatedTextDrawable.moveAmplitude = 0.2f;
                animatedTextDrawable.animateDuration = 160L;
                animatedTextDrawable.animateWave = 1.0f;
                animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.gravity = 5;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                int i2 = this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider), false);
                animatedTextDrawable.textPaint.setColor(i2);
                animatedTextDrawable.alpha = Color.alpha(i2);
                animatedTextDrawable.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                animatedTextDrawable.draw(canvas);
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                if (animatedTextDrawable != null) {
                    this.limitCount = 32 - charSequence.length();
                    animatedTextDrawable.cancelAnimation();
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str, true, true);
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
        int i2 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setCursorColor(Theme.getColor(null, Theme.key_chat_messagePanelCursor, false));
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        TextView textView = new TextView(activity);
        OKLCH.m(i2, resourcesProvider, textView, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        linearLayoutM.addView(editTextBoldCursor, LayoutHelper.createLinear(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        builder.setView(linearLayoutM);
        alertDialog.customWidth = AndroidUtilities.dp(292.0f);
        editTextBoldCursor.setOnEditorActionListener(new AlertsCreator$$ExternalSyntheticLambda201(editTextBoldCursor, i, tL_businessChatLink, alertDialogArr, view, 1));
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new PassportActivity$$ExternalSyntheticLambda52(editTextBoldCursor, i, tL_businessChatLink, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new CrashlyticsCore$$ExternalSyntheticLambda0(29));
        if (z) {
            currentDialog = alertDialog;
            alertDialogArr[0] = alertDialog;
            alertDialog.setOnDismissListener(new SearchTagsList$$ExternalSyntheticLambda10(1, view));
            currentDialog.setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(1, editTextBoldCursor));
            currentDialog.showDelayed(250L);
        } else {
            alertDialog.overridenDissmissListener = new ArticleViewer$$ExternalSyntheticLambda21(6, view, editTextBoldCursor);
            alertDialogArr[0] = alertDialog;
            alertDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(editTextBoldCursor, 2));
            alertDialogArr[0].setOnShowListener(new VoIPService$$ExternalSyntheticLambda137(view, editTextBoldCursor, 1));
            alertDialogArr[0].show();
        }
        alertDialogArr[0].dismissDialogByButtons = false;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.listView.setSections();
        UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.adapter.applyBackground = false;
        ActionBar actionBar = this.actionBar;
        actionBar.getClass();
        actionBar.setAdaptiveBackground(anonymousClass3, true, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.businessLinksUpdated || i == NotificationCenter.privacyRulesUpdated) {
            UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
            if (anonymousClass3 == null || (universalAdapter = anonymousClass3.adapter) == null) {
                return;
            }
            universalAdapter.update(true);
            return;
        }
        if (i != NotificationCenter.businessLinkCreated) {
            if (i == NotificationCenter.needDeleteBusinessLink) {
                BusinessLinksController.getInstance(this.currentAccount).deleteLinkUndoable(((TL_account.TL_businessChatLink) objArr[0]).link, this);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(6, "chatMode");
            bundleM.putString("business_link", tL_businessChatLink.link);
            presentFragment(new ChatActivity(bundleM));
        }
    }

    @Override
    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        int i = 0;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i2 = R.raw.biz_links;
        UItem uItem = new UItem(2);
        uItem.text = string;
        uItem.animatedText = string2;
        uItem.iconResId = i2;
        arrayList.add(uItem);
        universalAdapter.whiteSectionStart();
        BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.currentAccount);
        if (businessLinksController.links.size() < MessagesController.getInstance(businessLinksController.currentAccount).businessChatLinksLimit) {
            UItem uItemAsButton = UItem.asButton(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            uItemAsButton.accent = true;
            arrayList.add(uItemAsButton);
        }
        ArrayList arrayList2 = BusinessLinksController.getInstance(this.currentAccount).links;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            BusinessLinkWrapper businessLinkWrapper = new BusinessLinkWrapper((TL_account.TL_businessChatLink) obj);
            UItem uItem2 = new UItem(29);
            uItem2.object = businessLinkWrapper;
            arrayList.add(uItem2);
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
        String string3 = arrayList3.size() == 2 ? LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1)) : LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(string3);
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            String str = (String) obj2;
            int iIndexOf = string3.indexOf(str);
            if (iIndexOf > -1) {
                spannableString.setSpan(new StickersActivity.AnonymousClass4(zzil.m("https://", str), this), iIndexOf, str.length() + iIndexOf, 33);
            }
        }
        UItem uItem3 = new UItem(7);
        uItem3.text = spannableString;
        arrayList.add(uItem3);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    public final void lambda$onLongClick$10(TL_account.TL_businessChatLink tL_businessChatLink) {
        openRenameAlert(getParentActivity(), this.currentAccount, tL_businessChatLink, this.resourceProvider);
    }

    public final void lambda$onLongClick$11(TL_account.TL_businessChatLink tL_businessChatLink) {
        BusinessLinksController.getInstance(this.currentAccount).deleteLinkUndoable(tL_businessChatLink.link, this);
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
    public final void onClick$1(UItem uItem, View view) {
        if (uItem.id == 1) {
            BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(businessLinksController.currentAccount).sendRequest(createbusinesschatlink, new BusinessLinksController$$ExternalSyntheticLambda1(businessLinksController, 1));
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
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view) {
        if (uItem.viewType == 29) {
            Object obj = uItem.object;
            if (obj instanceof BusinessLinkWrapper) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((BusinessLinkWrapper) obj).link;
                ItemOptions itemOptions = new ItemOptions(this, view, false, true);
                itemOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ArticleViewer$$ExternalSyntheticLambda3(tL_businessChatLink, 13), false);
                final int i = 0;
                itemOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final BusinessLinksActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                BusinessLinksActivity businessLinksActivity = this.f$0;
                                businessLinksActivity.getClass();
                                Intent intent = new Intent(businessLinksActivity.getParentActivity(), (Class<?>) LaunchActivity.class);
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(businessLinksActivity2.getParentActivity(), 0, businessLinksActivity2.getResourceProvider());
                                String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string;
                                alertDialog.message = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                builder.setPositiveButton(LocaleController.getString(R.string.Remove), new ArticleViewer$$ExternalSyntheticLambda16(21, businessLinksActivity2, tL_businessChatLink));
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                businessLinksActivity2.showDialog(alertDialog);
                                TextView textView = (TextView) alertDialog.getButton(-1);
                                if (textView != null) {
                                    textView.setTextColor(businessLinksActivity2.getThemedColor(Theme.key_text_RedBold));
                                }
                                break;
                        }
                    }
                }, false);
                final int i2 = 1;
                itemOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
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
                                Intent intent = new Intent(businessLinksActivity.getParentActivity(), (Class<?>) LaunchActivity.class);
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(businessLinksActivity2.getParentActivity(), 0, businessLinksActivity2.getResourceProvider());
                                String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string;
                                alertDialog.message = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                builder.setPositiveButton(LocaleController.getString(R.string.Remove), new ArticleViewer$$ExternalSyntheticLambda16(21, businessLinksActivity2, tL_businessChatLink));
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                businessLinksActivity2.showDialog(alertDialog);
                                TextView textView = (TextView) alertDialog.getButton(-1);
                                if (textView != null) {
                                    textView.setTextColor(businessLinksActivity2.getThemedColor(Theme.key_text_RedBold));
                                }
                                break;
                        }
                    }
                }, false);
                final int i3 = 2;
                itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
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
                                Intent intent = new Intent(businessLinksActivity.getParentActivity(), (Class<?>) LaunchActivity.class);
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(businessLinksActivity2.getParentActivity(), 0, businessLinksActivity2.getResourceProvider());
                                String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string;
                                alertDialog.message = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                builder.setPositiveButton(LocaleController.getString(R.string.Remove), new ArticleViewer$$ExternalSyntheticLambda16(21, businessLinksActivity2, tL_businessChatLink));
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                businessLinksActivity2.showDialog(alertDialog);
                                TextView textView = (TextView) alertDialog.getButton(-1);
                                if (textView != null) {
                                    textView.setTextColor(businessLinksActivity2.getThemedColor(Theme.key_text_RedBold));
                                }
                                break;
                        }
                    }
                }, true);
                itemOptions.setScrimViewBackground(this.listView.getClipBackground(view, false));
                itemOptions.show();
                return true;
            }
        }
        return false;
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags;
import androidx.recyclerview.widget.ViewBoundsCheck$Callback;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.internal.mlkit_vision_label.zzcv;
import com.google.android.gms.internal.mlkit_vision_label.zzcy;
import com.google.common.base.Splitter;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.SettingsSearchCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.HintsController$Hint;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DualCameraView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.HistoryFragment;

public final class SettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate, MainTabsActivity.TabFragmentDelegate, FactorAnimator.Target {
    public final ArrayList accountNumbers;
    public ChatActivity.AnonymousClass27 actionBarBackground;
    public boolean actionBarVisible;
    public ValueAnimator actionBarVisibleAnimator;
    public int additionNavigationBarHeight;
    public final BoolAnimator animatorSearchPageVisible;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public TLRPC.FileLocation avatarBig;
    public FrameLayout avatarContainer;
    public AvatarDrawable avatarDrawable;
    public ProfileActivity.AnonymousClass22 avatarProgressView;
    public int avatarUploadingRequest;
    public BackupImageView avatarView;
    public FrameLayout cameraBackground;
    public FrameLayout cameraButton;
    public ImageView cameraImageView;
    public LoginActivity.AnonymousClass2 contentView;
    public boolean hasMainTabs;
    public ViewGroupPartRenderer iBlur3Capture;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public ImageUpdater imageUpdater;
    public UniversalRecyclerView listView;
    public View navigationBar;
    public int navigationBarHeight;
    public ActionBarMenuItem otherItem;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public AnonymousClass4 search;
    public ActionBarMenuItem searchItem;
    public TextView subtitleView;
    public TextView titleView;
    public FrameLayout topView;
    public TextView versionView;
    public int versionViewPressCount;

    public final class AnonymousClass8 extends ShareAlert {
        public AnonymousClass8(Activity activity, String str) {
            super(activity, str, null, null);
        }

        @Override
        public final void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            if (z) {
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(this, longSparseArray, i, 22), 250L);
            }
        }
    }

    public final class AccountCell extends LinearLayout implements Theme.Colorable {
        public final ImageView arrowView;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botDrawable;
        public final TextView counterView;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatusDrawable;
        public final Theme.ResourcesProvider resourcesProvider;
        public final SimpleTextView textView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((AccountCell) view).set(uItem.intValue);
            }

            @Override
            public final boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue;
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new AccountCell(context, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }
        }

        public AccountCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(15);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            this.botDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, false, AndroidUtilities.dp(24.0f), 7);
            this.emojiStatusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, false, AndroidUtilities.dp(24.0f), 7);
            simpleTextView.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 16));
            TextView textView = new TextView(context);
            this.counterView = textView;
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            textView.setTextSize(1, 11.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
            ImageView imageView = new ImageView(context);
            this.arrowView = imageView;
            imageView.setImageResource(R.drawable.msg_arrowright);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
            if (!LocaleController.isRTL) {
                simpleTextView.setGravity(19);
                addView(backupImageView, LayoutHelper.createLinear(28, 28, 19, 18, 0, 18, 0));
                addView(simpleTextView, LayoutHelper.createLinear(0, -1, 1.0f, 119, 0, 0, 18, 0));
                addView(textView, LayoutHelper.createLinear(-2, 20, 0.0f, 16, 0, 0, 0, 0));
                addView(imageView, LayoutHelper.createLinear(24, 24, 0.0f, 21, 0, 0, 12, 0));
                return;
            }
            simpleTextView.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, LayoutHelper.createLinear(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, LayoutHelper.createLinear(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(simpleTextView, LayoutHelper.createLinear(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(backupImageView, LayoutHelper.createLinear(28, 28, 21, 18, 0, 18, 0));
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void set(int i) {
            TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(i, currentUser);
            BackupImageView backupImageView = this.avatarView;
            backupImageView.getImageReceiver().setCurrentAccount(i);
            backupImageView.imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
            backupImageView.onNewImageSet();
            SimpleTextView simpleTextView = this.textView;
            simpleTextView.setText(UserObject.getUserName(currentUser), false);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botDrawable;
            swapAnimatedEmojiDrawable.account = Integer.valueOf(i);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatusDrawable;
            swapAnimatedEmojiDrawable2.account = Integer.valueOf(i);
            int i2 = Theme.key_profile_verifiedBackground;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            zzli.m(i2, resourcesProvider, swapAnimatedEmojiDrawable);
            if (currentUser != null) {
                long j = currentUser.bot_verification_icon;
                if (j != 0) {
                    swapAnimatedEmojiDrawable.set(j, false);
                } else {
                    swapAnimatedEmojiDrawable.set((Drawable) null, false);
                }
            } else {
                swapAnimatedEmojiDrawable.set((Drawable) null, false);
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
            zzli.m(i2, resourcesProvider, swapAnimatedEmojiDrawable2);
            if (emojiStatusDocumentId != null) {
                swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId.longValue(), false);
            } else if (currentUser == null || !currentUser.premium) {
                swapAnimatedEmojiDrawable2.set((Drawable) null, false);
            } else {
                swapAnimatedEmojiDrawable2.set(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
            }
            if (swapAnimatedEmojiDrawable.isEmpty()) {
                swapAnimatedEmojiDrawable = null;
            }
            simpleTextView.setLeftDrawable(swapAnimatedEmojiDrawable);
            if (swapAnimatedEmojiDrawable2.isEmpty()) {
                swapAnimatedEmojiDrawable2 = null;
            }
            simpleTextView.setRightDrawable(swapAnimatedEmojiDrawable2);
            int mainUnreadCount = MessagesStorage.getInstance(i).getMainUnreadCount();
            TextView textView = this.counterView;
            textView.setVisibility(mainUnreadCount <= 0 ? 8 : 0);
            textView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
        }

        @Override
        public final void updateColors$1() {
            SimpleTextView simpleTextView = this.textView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.counterView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
            this.arrowView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
            zzli.m(Theme.key_profile_verifiedBackground, resourcesProvider, this.emojiStatusDrawable);
        }
    }

    public final class SuggestionCell extends LinearLayout implements Theme.Colorable {
        public final ButtonWithCounterView no;
        public final Theme.ResourcesProvider resourcesProvider;
        public final LinkSpanDrawable.LinksTextView textView;
        public final LinkSpanDrawable.LinksTextView titleView;
        public final ButtonWithCounterView yes;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                SuggestionCell suggestionCell = (SuggestionCell) view;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                CharSequence charSequence3 = uItem.textValue;
                View.OnClickListener onClickListener = uItem.clickCallback;
                CharSequence charSequence4 = uItem.animatedText;
                View.OnClickListener onClickListener2 = uItem.clickCallback2;
                LinkSpanDrawable.LinksTextView linksTextView = suggestionCell.titleView;
                linksTextView.setText(Emoji.replaceEmoji(charSequence, linksTextView.getPaint().getFontMetricsInt(), false));
                LinkSpanDrawable.LinksTextView linksTextView2 = suggestionCell.textView;
                linksTextView2.setText(Emoji.replaceEmoji(charSequence2, linksTextView2.getPaint().getFontMetricsInt(), false));
                ButtonWithCounterView buttonWithCounterView = suggestionCell.no;
                buttonWithCounterView.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
                buttonWithCounterView.setText(charSequence3);
                buttonWithCounterView.setOnClickListener(onClickListener);
                ButtonWithCounterView buttonWithCounterView2 = suggestionCell.yes;
                buttonWithCounterView2.setText(charSequence4);
                buttonWithCounterView2.setOnClickListener(onClickListener2);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new SuggestionCell(context, resourcesProvider);
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public SuggestionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(1);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 15.0f, i, true, resourcesProvider);
            this.titleView = linksTextViewMakeLinkTextView;
            linksTextViewMakeLinkTextView.setGravity(17);
            addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 55, 32, 20, 32, 0));
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 13.0f, i, false, resourcesProvider);
            this.textView = linksTextViewMakeLinkTextView2;
            linksTextViewMakeLinkTextView2.setGravity(17);
            addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
            this.no = buttonWithCounterViewM;
            ButtonWithCounterView buttonWithCounterViewM2 = zzlp.m(context, resourcesProvider, true);
            this.yes = buttonWithCounterViewM2;
            linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(0, 42, 1.0f, 112, 0, 0, 12, 0));
            linearLayout.addView(buttonWithCounterViewM2, LayoutHelper.createLinear(0, 42, 1.0f, 112, 0, 0, 0, 0));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 24, 18, 24, 16));
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void updateColors$1() {
            LinkSpanDrawable.LinksTextView linksTextView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.textView.setTextColor(Theme.getColor(i, resourcesProvider));
        }
    }

    public SettingsActivity() {
        this(null);
    }

    public static void listCodecs$1(String str, StringBuilder sb) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (str2.equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i));
                            break;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb.append("\n");
            sb.append(arrayList.size());
            sb.append("+");
            sb.append(arrayList2.size());
            sb.append(" ");
            sb.append(str.substring(6));
            sb.append(" codecs:\n");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i2)).intValue());
                sb.append("{d} ");
                sb.append(codecInfoAt2.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType.getMaxSupportedInstances());
                sb.append(")");
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (i3 > 0 || !arrayList.isEmpty()) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i3)).intValue());
                sb.append("{e} ");
                sb.append(codecInfoAt3.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType2.getMaxSupportedInstances());
                sb.append(")");
            }
            sb.append("\n");
        } catch (Exception unused) {
        }
    }

    public final void blur3_InvalidateBlur$9() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        RectF rectF = this.iBlur3PositionMainTabs;
        rectF.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        downscaleScrollableNoiseSuppressor.setupRenderNodes(this.hasMainTabs ? 2 : 1, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public final boolean canFinishFragment() {
        return true;
    }

    @Override
    public final View createView(Context context) {
        int i = 0;
        this.contentView = new LoginActivity.AnonymousClass2(this, context, 6);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i2 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        ActionBar actionBar = this.actionBar;
        actionBar.useContainerForTitles = true;
        if (actionBar.titlesContainer == null) {
            PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(actionBar.getContext(), i2);
            actionBar.titlesContainer = anonymousClass19;
            actionBar.addView(anonymousClass19);
        }
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 24));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search, this.resourceProvider);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 18);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(1, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem2;
        actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.addSubItem(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        ?? r3 = new ProfileActivity.SearchAdapter(this, context) {
            @Override
            public final void notifyDataSetChanged() {
                SettingsActivity.this.listView.adapter.update(true);
            }
        };
        this.search = r3;
        r3.loadFaqWebPage();
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new LinkManager$$ExternalSyntheticLambda1(this, 13), new SettingsActivity$$ExternalSyntheticLambda2(this), new SettingsActivity$$ExternalSyntheticLambda2(this), getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.adapter.applyBackground = false;
        universalRecyclerView.setSections();
        this.listView.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.additionNavigationBarHeight);
        this.listView.setClipToPadding(false);
        this.listView.addOnScrollListener(new AnonymousClass5(this, i));
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        LoginActivity.AnonymousClass2 anonymousClass2 = this.contentView;
        Objects.requireNonNull(universalRecyclerView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView2, anonymousClass2, new TopicsFragment$$ExternalSyntheticLambda7(universalRecyclerView2, 1));
        this.listView.addEdgeEffectListener(new SettingsActivity$$ExternalSyntheticLambda4(this, i));
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context);
        this.actionBarBackground = anonymousClass27;
        this.contentView.addView(anonymousClass27, LayoutHelper.createFrame(-1, 200, 48));
        this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 55));
        ImageUpdater imageUpdater = new ImageUpdater(0, true, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.openWithFrontfaceCamera = true;
        imageUpdater.parentFragment = this;
        imageUpdater.delegate = this;
        this.topView = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.avatarContainer = frameLayout;
        this.topView.addView(frameLayout, LayoutHelper.createFrame(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.avatarContainer.setOnClickListener(new SettingsActivity$$ExternalSyntheticLambda5(this, i));
        ScaleStateListAnimator.apply(this.avatarContainer, 0.1f, 1.5f);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.avatarContainer.addView(this.avatarView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        ProfileActivity.AnonymousClass22 anonymousClass22 = new ProfileActivity.AnonymousClass22(this, context);
        this.avatarProgressView = anonymousClass22;
        anonymousClass22.setSize(AndroidUtilities.dp(26.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.avatarContainer.addView(this.avatarProgressView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        showAvatarProgress$5(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.cameraButton = frameLayout2;
        frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(32.0f), getThemedColor(Theme.key_windowBackgroundGray)));
        this.cameraButton.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.cameraBackground = frameLayout3;
        frameLayout3.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(30.0f), getThemedColor(Theme.key_featuredStickers_addButton)));
        ImageView imageView = new ImageView(context);
        this.cameraImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.cameraImageView.setImageResource(R.drawable.filled_premium_camera);
        this.cameraBackground.addView(this.cameraImageView, LayoutHelper.createFrame(22, 22, 17));
        this.cameraButton.addView(this.cameraBackground, LayoutHelper.createFrame(30.0f, 30));
        this.avatarContainer.addView(this.cameraButton, LayoutHelper.createFrame(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(this.cameraButton, 0.1f, 1.5f);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 22.0f);
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setGravity(17);
        this.titleView.setSingleLine();
        TextView textView2 = this.titleView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textViewM = zzcv.m(this.topView, this.titleView, LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.subtitleView = textViewM;
        textViewM.setTextSize(1, 13.0f);
        this.subtitleView.setGravity(17);
        this.subtitleView.setSingleLine();
        this.subtitleView.setEllipsize(truncateAt);
        TextView textViewM2 = zzcv.m(this.topView, this.subtitleView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.versionView = textViewM2;
        textViewM2.setTextSize(1, 14.0f);
        this.versionView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText4));
        this.versionView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.versionView.setGravity(17);
        this.versionView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2, -1));
        this.versionView.setOnClickListener(new SettingsActivity$$ExternalSyntheticLambda5(this, 5));
        this.navigationBar = new View(context);
        updateActionBarVisible(true, false);
        this.listView.adapter.update(false);
        setInfo(getUserConfig().getCurrentUser());
        updateColors$1();
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        BoolAnimator boolAnimator = this.animatorSearchPageVisible;
        FragmentFloatingButton.setAnimatedVisibility(actionBarMenuItem, 1.0f - boolAnimator.floatValue);
        FragmentFloatingButton.setAnimatedVisibility(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.hasMainTabs ? 0.0f : 1.0f, 1.0f, boolAnimator.floatValue));
        LoginActivity.AnonymousClass2 anonymousClass3 = this.contentView;
        SettingsActivity$$ExternalSyntheticLambda2 settingsActivity$$ExternalSyntheticLambda2 = new SettingsActivity$$ExternalSyntheticLambda2(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass3, settingsActivity$$ExternalSyntheticLambda2);
        LoginActivity.AnonymousClass2 anonymousClass4 = this.contentView;
        this.fragmentView = anonymousClass4;
        return anonymousClass4;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        if (i == NotificationCenter.starBalanceUpdated) {
            setInfo(getUserConfig().getCurrentUser());
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            if (universalRecyclerView2 != null) {
                universalRecyclerView2.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            setInfo(getUserConfig().getCurrentUser());
        } else {
            if (i != NotificationCenter.newSuggestionsAvailable || (universalRecyclerView = this.listView) == null) {
                return;
            }
            universalRecyclerView.adapter.update(true);
        }
    }

    @Override
    public final void didStartUpload(boolean z, boolean z2) {
        ProfileActivity.AnonymousClass22 anonymousClass22 = this.avatarProgressView;
        if (anonymousClass22 == null) {
            return;
        }
        anonymousClass22.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
    }

    @Override
    public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda76(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void fillItems$14(ArrayList arrayList) {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        int i = 4;
        int i2 = 1;
        ActionBarMenuItem.AnonymousClass7 anonymousClass7 = this.searchItem.searchContainer;
        int i3 = 0;
        if (anonymousClass7 != null && anonymousClass7.getTag() != null) {
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            UItem uItem = new UItem(28);
            uItem.intValue = currentActionBarHeight;
            arrayList.add(uItem);
            AnonymousClass4 anonymousClass4 = this.search;
            if (anonymousClass4.searchWas) {
                ArrayList arrayList3 = anonymousClass4.searchResults;
                int size = arrayList3.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    Object obj = arrayList3.get(i4);
                    i4++;
                    int i6 = i5 + 1;
                    CharSequence charSequence = (CharSequence) anonymousClass4.resultNames.get(i5);
                    int i7 = SettingsSearchCell.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(SettingsSearchCell.Factory.class);
                    uItemOfFactory.text = charSequence;
                    uItemOfFactory.object = (ProfileActivity.SearchAdapter.SearchResult) obj;
                    arrayList.add(uItemOfFactory);
                    i5 = i6;
                }
                if (anonymousClass4.faqSearchResults.isEmpty()) {
                    return;
                }
                String string = LocaleController.getString(R.string.SettingsFaqSearchTitle);
                UItem uItem2 = new UItem(31);
                uItem2.text = string;
                arrayList.add(uItem2);
                ArrayList arrayList4 = anonymousClass4.faqSearchResults;
                int size2 = arrayList4.size();
                while (i3 < size2) {
                    Object obj2 = arrayList4.get(i3);
                    i3++;
                    int i8 = i5 + 1;
                    CharSequence charSequence2 = (CharSequence) anonymousClass4.resultNames.get(i5);
                    int i9 = SettingsSearchCell.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(SettingsSearchCell.Factory.class);
                    uItemOfFactory2.text = charSequence2;
                    uItemOfFactory2.object = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(uItemOfFactory2);
                    i5 = i8;
                }
                return;
            }
            ArrayList arrayList5 = anonymousClass4.recentSearches;
            if (!arrayList5.isEmpty()) {
                String string2 = LocaleController.getString(R.string.SettingsRecent);
                UItem uItem3 = new UItem(31);
                uItem3.text = string2;
                arrayList.add(uItem3);
                int size3 = arrayList5.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj3 = arrayList5.get(i10);
                    i10++;
                    if (obj3 instanceof ProfileActivity.SearchAdapter.SearchResult) {
                        ProfileActivity.SearchAdapter.SearchResult searchResult = (ProfileActivity.SearchAdapter.SearchResult) obj3;
                        String str = searchResult.searchTitle;
                        int i11 = SettingsSearchCell.Factory.$r8$clinit;
                        UItem uItemOfFactory3 = UItem.ofFactory(SettingsSearchCell.Factory.class);
                        uItemOfFactory3.text = str;
                        uItemOfFactory3.object = searchResult;
                        arrayList.add(uItemOfFactory3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i12 = SettingsSearchCell.Factory.$r8$clinit;
                        UItem uItemOfFactory4 = UItem.ofFactory(SettingsSearchCell.Factory.class);
                        uItemOfFactory4.text = str2;
                        uItemOfFactory4.object = faqSearchResult;
                        arrayList.add(uItemOfFactory4);
                    }
                }
            }
            ArrayList arrayList6 = anonymousClass4.faqSearchArray;
            if (arrayList6.isEmpty()) {
                return;
            }
            String string3 = LocaleController.getString(R.string.SettingsFaqSearchTitle);
            UItem uItem4 = new UItem(31);
            uItem4.text = string3;
            arrayList.add(uItem4);
            int size4 = arrayList6.size();
            while (i3 < size4) {
                Object obj4 = arrayList6.get(i3);
                i3++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i13 = SettingsSearchCell.Factory.$r8$clinit;
                UItem uItemOfFactory5 = UItem.ofFactory(SettingsSearchCell.Factory.class);
                uItemOfFactory5.text = str3;
                uItemOfFactory5.object = faqSearchResult2;
                arrayList.add(uItemOfFactory5);
            }
            return;
        }
        FrameLayout frameLayout = this.topView;
        UItem uItem5 = new UItem(-4);
        uItem5.view = frameLayout;
        uItem5.intValue = 188;
        arrayList.add(uItem5);
        ArrayList arrayList7 = this.accountNumbers;
        arrayList7.clear();
        for (int i14 = 0; i14 < 4; i14++) {
            if (UserConfig.getInstance(i14).isClientActivated() && this.currentAccount != i14) {
                arrayList7.add(Integer.valueOf(i14));
            }
        }
        Collections.sort(arrayList7, new OAuthSheet$$ExternalSyntheticLambda3(5));
        Set<String> set = getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            String string4 = LocaleController.getString(R.string.GraceSuggestionTitle);
            String string5 = LocaleController.getString(R.string.GraceSuggestionMessage);
            String string6 = LocaleController.getString(R.string.GraceSuggestionButton);
            SettingsActivity$$ExternalSyntheticLambda5 settingsActivity$$ExternalSyntheticLambda5 = new SettingsActivity$$ExternalSyntheticLambda5(this, 6);
            int i15 = SuggestionCell.Factory.$r8$clinit;
            UItem uItemOfFactory6 = UItem.ofFactory(SuggestionCell.Factory.class);
            uItemOfFactory6.text = string4;
            uItemOfFactory6.subtext = string5;
            uItemOfFactory6.textValue = null;
            uItemOfFactory6.clickCallback = null;
            uItemOfFactory6.animatedText = string6;
            uItemOfFactory6.clickCallback2 = settingsActivity$$ExternalSyntheticLambda5;
            UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItemOfFactory6, 7);
            uItemM.text = null;
            arrayList.add(uItemM);
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && getUserConfig().getCurrentUser() != null) {
            String string7 = LocaleController.formatString(R.string.CheckPhoneNumber, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, PhoneFormat.getInstance()));
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new SettingsActivity$$ExternalSyntheticLambda4(this, i2));
            String string8 = LocaleController.getString(R.string.CheckPhoneNumberNo);
            SettingsActivity$$ExternalSyntheticLambda5 settingsActivity$$ExternalSyntheticLambda6 = new SettingsActivity$$ExternalSyntheticLambda5(this, i2);
            SpannableStringBuilder spannableStringBuilderReplaceUnderstood = StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.CheckPhoneNumberYes2));
            SettingsActivity$$ExternalSyntheticLambda5 settingsActivity$$ExternalSyntheticLambda7 = new SettingsActivity$$ExternalSyntheticLambda5(this, 2);
            int i16 = SuggestionCell.Factory.$r8$clinit;
            UItem uItemOfFactory7 = UItem.ofFactory(SuggestionCell.Factory.class);
            uItemOfFactory7.text = string7;
            uItemOfFactory7.subtext = spannableStringBuilderReplaceSingleTag;
            uItemOfFactory7.textValue = string8;
            uItemOfFactory7.clickCallback = settingsActivity$$ExternalSyntheticLambda6;
            uItemOfFactory7.animatedText = spannableStringBuilderReplaceUnderstood;
            uItemOfFactory7.clickCallback2 = settingsActivity$$ExternalSyntheticLambda7;
            UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemOfFactory7, 7);
            uItemM2.text = null;
            arrayList.add(uItemM2);
        } else if (set.contains("VALIDATE_PASSWORD")) {
            String string9 = LocaleController.getString(R.string.YourPasswordHeader);
            String string10 = LocaleController.getString(R.string.YourPasswordRemember);
            String string11 = LocaleController.getString(R.string.YourPasswordRememberNo);
            SettingsActivity$$ExternalSyntheticLambda5 settingsActivity$$ExternalSyntheticLambda8 = new SettingsActivity$$ExternalSyntheticLambda5(this, 3);
            String string12 = LocaleController.getString(R.string.YourPasswordRememberYes);
            SettingsActivity$$ExternalSyntheticLambda5 settingsActivity$$ExternalSyntheticLambda9 = new SettingsActivity$$ExternalSyntheticLambda5(this, i);
            int i17 = SuggestionCell.Factory.$r8$clinit;
            UItem uItemOfFactory8 = UItem.ofFactory(SuggestionCell.Factory.class);
            uItemOfFactory8.text = string9;
            uItemOfFactory8.subtext = string10;
            uItemOfFactory8.textValue = string11;
            uItemOfFactory8.clickCallback = settingsActivity$$ExternalSyntheticLambda8;
            uItemOfFactory8.animatedText = string12;
            uItemOfFactory8.clickCallback2 = settingsActivity$$ExternalSyntheticLambda9;
            UItem uItemM3 = ArticleViewer.IBlock.CC.m(arrayList, uItemOfFactory8, 7);
            uItemM3.text = null;
            arrayList.add(uItemM3);
        }
        if (arrayList7.size() > 0) {
            String string13 = LocaleController.getString(R.string.SettingsAccounts);
            UItem uItem6 = new UItem(0);
            uItem6.text = string13;
            arrayList.add(uItem6);
            for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                int iIntValue = ((Integer) arrayList7.get(i18)).intValue();
                int i19 = AccountCell.Factory.$r8$clinit;
                UItem uItemOfFactory9 = UItem.ofFactory(AccountCell.Factory.class);
                uItemOfFactory9.id = i18;
                uItemOfFactory9.intValue = iIntValue;
                arrayList.add(uItemOfFactory9);
            }
            UItem uItem7 = new UItem(7);
            uItem7.text = null;
            arrayList.add(uItem7);
        }
        arrayList.add(SettingCell.Factory.of(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(SettingCell.Factory.of(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(SettingCell.Factory.of(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(SettingCell.Factory.of(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(SettingCell.Factory.of(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(SettingCell.Factory.of(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(SettingCell.Factory.of(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(SettingCell.Factory.of(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        UItem uItemM4 = ArticleViewer.IBlock.CC.m(arrayList, SettingCell.Factory.of(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null), 7);
        uItemM4.text = null;
        arrayList.add(uItemM4);
        if (!getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(SettingCell.Factory.of(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence starsAmount = "";
        if (getMessagesController().starsPurchaseAvailable()) {
            StarsController starsController = StarsController.getInstance(this.currentAccount, false);
            arrayList.add(SettingCell.Factory.of(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!starsController.balanceLoaded || starsController.getBalance().amount <= 0) ? "" : StarsIntroActivity.formatStarsAmount(starsController.getBalance(), 0.85f, ' ')));
        }
        StarsController.getInstance(this.currentAccount, true).getBalance();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (StarsController.getInstance(this.currentAccount, true).balanceLoaded && (StarsController.getInstance(this.currentAccount, true).hasTransactions(0) || StarsController.getInstance(this.currentAccount, true).getBalance().positive()))) {
            StarsController starsController2 = StarsController.getInstance(this.currentAccount, true);
            long j = starsController2.getBalance().amount;
            int i20 = R.drawable.settings_gram_24;
            String string14 = LocaleController.getString(R.string.MyTON);
            if (starsController2.balanceLoaded && j > 0) {
                starsAmount = StarsIntroActivity.formatStarsAmount(starsController2.getBalance(), 0.85f, ' ');
            }
            arrayList.add(SettingCell.Factory.of(13, -14965523, -15431455, i20, string14, null, starsAmount));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            int i21 = 0;
            while (i21 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i21);
                int i22 = i21 + 1;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i23 = R.drawable.settings_wallet;
                    UItem uItemOfFactory10 = UItem.ofFactory(SettingCell.Factory.class);
                    long j2 = tL_attachMenuBot2.bot_id;
                    uItemOfFactory10.id = (int) (j2 ^ (j2 >>> 32));
                    uItemOfFactory10.iconResId = i23;
                    uItemOfFactory10.text = tL_attachMenuBot2.short_name;
                    uItemOfFactory10.longValue = (((long) (-14965523)) & 4294967295L) | (((long) (-15431455)) << 32);
                    uItemOfFactory10.object = tL_attachMenuBot2;
                    arrayList.add(uItemOfFactory10);
                }
                i21 = i22;
            }
        }
        if (!getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(SettingCell.Factory.of(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(SettingCell.Factory.of(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((UItem) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).viewType != 7) {
            UItem uItem8 = new UItem(7);
            uItem8.text = null;
            arrayList.add(uItem8);
        }
        String string15 = LocaleController.getString(R.string.SettingsHelp);
        UItem uItem9 = new UItem(0);
        uItem9.text = string15;
        arrayList.add(uItem9);
        arrayList.add(SettingCell.Factory.of(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(SettingCell.Factory.of(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(SettingCell.Factory.of(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(SettingCell.Factory.of(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            UItem uItem10 = new UItem(7);
            uItem10.text = null;
            arrayList.add(uItem10);
            String string16 = LocaleController.getString(R.string.SettingsDebug);
            UItem uItem11 = new UItem(0);
            uItem11.text = string16;
            arrayList.add(uItem11);
            arrayList.add(SettingCell.Factory.of(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(SettingCell.Factory.of(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(SettingCell.Factory.of(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(UItem.asCustomShadow(this.versionView));
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public final BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.animatorSearchPageVisible.value;
    }

    public final void lambda$createView$1$5$2() {
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(null);
    }

    public final void lambda$createView$3$8$1() {
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        imageUpdater.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new SettingsActivity$$ExternalSyntheticLambda4(this, 4), new SettingsActivity$$ExternalSyntheticLambda21(0), 0);
    }

    public final void lambda$createView$4$8$1() {
        int i;
        String str;
        String string;
        char c;
        String string2;
        char c2;
        CharSequence charSequence;
        String string3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence string4;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        String str2;
        CharSequence charSequence7;
        String str3;
        String str4;
        CharSequence string5;
        String str5;
        CharSequence charSequence8;
        String str6;
        CharSequence charSequence9;
        CharSequence charSequence10;
        int i2;
        int i3 = this.versionViewPressCount + 1;
        this.versionViewPressCount = i3;
        if (i3 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
        String string6 = LocaleController.getString(R.string.DebugMenu);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string6;
        String string7 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string8 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string9 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string10 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                i = R.string.DebugMenuDisableLogs;
                str = "DebugMenuDisableLogs";
            } else {
                i = R.string.DebugMenuEnableLogs;
                str = "DebugMenuEnableLogs";
            }
            string = LocaleController.getString(str, i);
        }
        if (SharedConfig.inappCamera) {
            c = 1;
            string2 = LocaleController.getString("DebugMenuDisableCamera", R.string.DebugMenuDisableCamera);
        } else {
            c = 1;
            string2 = LocaleController.getString("DebugMenuEnableCamera", R.string.DebugMenuEnableCamera);
        }
        String string11 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string12 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c2 = 0;
            charSequence = null;
            string3 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            string3 = null;
            c2 = 0;
            charSequence = null;
        }
        String string13 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            charSequence2 = SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects";
        } else {
            charSequence2 = charSequence;
        }
        boolean z = BuildVars.DEBUG_PRIVATE_VERSION;
        CharSequence charSequence11 = z ? "Clean app update" : charSequence;
        CharSequence charSequence12 = z ? "Reset suggestions" : charSequence;
        CharSequence string14 = z ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : charSequence;
        String string15 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string16 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        if (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) {
            charSequence3 = SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode";
        } else {
            charSequence3 = charSequence;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            string4 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            string4 = charSequence;
        }
        boolean z2 = BuildVars.DEBUG_PRIVATE_VERSION;
        CharSequence charSequence13 = z2 ? "Force remove premium suggestions" : charSequence;
        CharSequence charSequence14 = z2 ? "Share device info" : charSequence;
        CharSequence charSequence15 = z2 ? "Force performance class" : charSequence;
        if (!z2 || InstantCameraView.allowBigSizeCameraDebug()) {
            charSequence4 = charSequence;
        } else {
            charSequence4 = !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        }
        String string17 = LocaleController.getString(DualCameraView.dualAvailableStatic(getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        if (BuildVars.DEBUG_VERSION) {
            charSequence5 = SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories";
        } else {
            charSequence5 = charSequence;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            charSequence6 = SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer";
        } else {
            charSequence6 = charSequence;
        }
        String str7 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        CharSequence charSequence16 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : charSequence;
        String str8 = !SharedConfig.isUsingCamera2(this.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        CharSequence charSequence17 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : charSequence;
        CharSequence charSequence18 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : charSequence;
        if (SharedConfig.canBlurChat()) {
            str2 = string13;
            if (Build.VERSION.SDK_INT >= 31) {
                charSequence7 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
            }
            if (SharedConfig.adaptableColorInBrowser) {
                str3 = "Disabled adaptive browser colors";
            } else {
                str3 = "Enable adaptive browser colors";
            }
            if (SharedConfig.debugVideoQualities) {
                str4 = "Disable video qualities debug";
            } else {
                str4 = "Enable video qualities debug";
            }
            CharSequence charSequence19 = charSequence7;
            if (Build.VERSION.SDK_INT >= 28) {
                if (SharedConfig.useSystemBoldFont) {
                    i2 = R.string.DebugMenuDontUseSystemBoldFont;
                } else {
                    i2 = R.string.DebugMenuUseSystemBoldFont;
                }
                string5 = LocaleController.getString(i2);
            } else {
                string5 = charSequence;
            }
            if (SharedConfig.forceForumTabs) {
                str5 = "Do Not Force Forum Tabs";
            } else {
                str5 = "Force Forum Tabs";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                charSequence8 = charSequence;
            } else if (SharedConfig.fastWallpaperDisabled) {
                charSequence8 = "enable wallpaper shader";
            } else {
                charSequence8 = "disable wallpaper shader";
            }
            if (SharedConfig.frameMetricsEnabled) {
                str6 = "hide frame metrics";
            } else {
                str6 = "show frame metrics";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                charSequence9 = charSequence;
            } else if (SharedConfig.shadowsInSections) {
                charSequence9 = "disable shadows in settings";
            } else {
                charSequence9 = "enable shadows in settings";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                charSequence10 = charSequence;
            } else if (SharedConfig.debugViewMetrics) {
                charSequence10 = "disable debug view metrics";
            } else {
                charSequence10 = "enable debug view metrics";
            }
            CharSequence[] charSequenceArr = new CharSequence[42];
            charSequenceArr[c2] = string7;
            charSequenceArr[c] = string8;
            charSequenceArr[2] = string9;
            charSequenceArr[3] = string10;
            charSequenceArr[4] = string;
            charSequenceArr[5] = string2;
            charSequenceArr[6] = string11;
            charSequenceArr[7] = string12;
            charSequenceArr[8] = charSequence;
            charSequenceArr[9] = string3;
            charSequenceArr[10] = str2;
            charSequenceArr[11] = charSequence2;
            charSequenceArr[12] = charSequence11;
            charSequenceArr[13] = charSequence12;
            charSequenceArr[14] = string14;
            charSequenceArr[15] = string15;
            charSequenceArr[16] = string16;
            charSequenceArr[17] = charSequence3;
            charSequenceArr[18] = string4;
            charSequenceArr[19] = charSequence13;
            charSequenceArr[20] = charSequence14;
            charSequenceArr[21] = charSequence15;
            charSequenceArr[22] = charSequence4;
            charSequenceArr[23] = string17;
            charSequenceArr[24] = charSequence5;
            charSequenceArr[25] = charSequence6;
            charSequenceArr[26] = str7;
            charSequenceArr[27] = charSequence16;
            charSequenceArr[28] = str8;
            charSequenceArr[29] = charSequence17;
            charSequenceArr[30] = charSequence18;
            charSequenceArr[31] = charSequence19;
            charSequenceArr[32] = str3;
            charSequenceArr[33] = str4;
            charSequenceArr[34] = string5;
            charSequenceArr[35] = "Reload app config";
            charSequenceArr[36] = str5;
            charSequenceArr[37] = "Make Memory Dump";
            charSequenceArr[38] = charSequence8;
            charSequenceArr[39] = str6;
            charSequenceArr[40] = charSequence9;
            charSequenceArr[41] = charSequence10;
            builder.setItems(charSequenceArr, new DialogsActivity$$ExternalSyntheticLambda124(this, 4));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), charSequence);
            showDialog(alertDialog);
        }
        str2 = string13;
        charSequence7 = charSequence;
        if (SharedConfig.adaptableColorInBrowser) {
            str3 = "Disabled adaptive browser colors";
        } else {
            str3 = "Enable adaptive browser colors";
        }
        if (SharedConfig.debugVideoQualities) {
            str4 = "Disable video qualities debug";
        } else {
            str4 = "Enable video qualities debug";
        }
        CharSequence charSequence110 = charSequence7;
        if (Build.VERSION.SDK_INT >= 28) {
            if (SharedConfig.useSystemBoldFont) {
                i2 = R.string.DebugMenuDontUseSystemBoldFont;
            } else {
                i2 = R.string.DebugMenuUseSystemBoldFont;
            }
            string5 = LocaleController.getString(i2);
        } else {
            string5 = charSequence;
        }
        if (SharedConfig.forceForumTabs) {
            str5 = "Force Forum Tabs";
        } else {
            str5 = "Do Not Force Forum Tabs";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            charSequence8 = charSequence;
        } else if (SharedConfig.fastWallpaperDisabled) {
            charSequence8 = "enable wallpaper shader";
        } else {
            charSequence8 = "disable wallpaper shader";
        }
        if (SharedConfig.frameMetricsEnabled) {
            str6 = "hide frame metrics";
        } else {
            str6 = "show frame metrics";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            charSequence9 = charSequence;
        } else if (SharedConfig.shadowsInSections) {
            charSequence9 = "disable shadows in settings";
        } else {
            charSequence9 = "enable shadows in settings";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            charSequence10 = charSequence;
        } else if (SharedConfig.debugViewMetrics) {
            charSequence10 = "disable debug view metrics";
        } else {
            charSequence10 = "enable debug view metrics";
        }
        CharSequence[] charSequenceArr2 = new CharSequence[42];
        charSequenceArr2[c2] = string7;
        charSequenceArr2[c] = string8;
        charSequenceArr2[2] = string9;
        charSequenceArr2[3] = string10;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string2;
        charSequenceArr2[6] = string11;
        charSequenceArr2[7] = string12;
        charSequenceArr2[8] = charSequence;
        charSequenceArr2[9] = string3;
        charSequenceArr2[10] = str2;
        charSequenceArr2[11] = charSequence2;
        charSequenceArr2[12] = charSequence11;
        charSequenceArr2[13] = charSequence12;
        charSequenceArr2[14] = string14;
        charSequenceArr2[15] = string15;
        charSequenceArr2[16] = string16;
        charSequenceArr2[17] = charSequence3;
        charSequenceArr2[18] = string4;
        charSequenceArr2[19] = charSequence13;
        charSequenceArr2[20] = charSequence14;
        charSequenceArr2[21] = charSequence15;
        charSequenceArr2[22] = charSequence4;
        charSequenceArr2[23] = string17;
        charSequenceArr2[24] = charSequence5;
        charSequenceArr2[25] = charSequence6;
        charSequenceArr2[26] = str7;
        charSequenceArr2[27] = charSequence16;
        charSequenceArr2[28] = str8;
        charSequenceArr2[29] = charSequence17;
        charSequenceArr2[30] = charSequence18;
        charSequenceArr2[31] = charSequence110;
        charSequenceArr2[32] = str3;
        charSequenceArr2[33] = str4;
        charSequenceArr2[34] = string5;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str5;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = charSequence8;
        charSequenceArr2[39] = str6;
        charSequenceArr2[40] = charSequence9;
        charSequenceArr2[41] = charSequence10;
        builder.setItems(charSequenceArr2, new DialogsActivity$$ExternalSyntheticLambda124(this, 4));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), charSequence);
        showDialog(alertDialog);
    }

    public final void lambda$didUploadPhoto$22(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.avatarUploadingRequest = -1;
        if (tL_error == null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    getMessagesController().putUser(user, false);
                }
            } else {
                getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && this.avatar != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(this.avatar.volume_id);
                sb.append("_");
                String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(this.avatar.local_id, "@90_90", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(strM, SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@90_90", sb2), ImageLocation.getForUserOrChat(this.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().updateUserInfo(userFull, false);
            }
            setInfo(user);
        }
        this.avatar = null;
        this.avatarBig = null;
        showAvatarProgress$5(false, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getUserConfig().saveConfig(true);
    }

    public final void lambda$didUploadPhoto$24(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarView.setImage(ImageLocation.getForLocal(fileLocation), "90_90", this.avatarDrawable, null);
            showAvatarProgress$5(true, false);
        } else {
            if (this.avatar == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.avatarUploadingRequest = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ProfileActivity$$ExternalSyntheticLambda65(17, this, str));
        }
        this.actionBar.createMenu().requestLayout();
    }

    public final void lambda$onClick$13(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.showAttachMenuBot(LaunchActivity.instance, this.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(this.currentAccount).updateAttachMenuBotsInCache();
    }

    public final void lambda$onClick$15(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ProfileActivity$$ExternalSyntheticLambda65(18, this, tL_attachMenuBot), 66);
    }

    public final void lambda$openDebugMenu$21(int i) throws Throwable {
        int i2 = 0;
        if (i == 0) {
            getUserConfig().syncContacts = true;
            getUserConfig().saveConfig(false);
            getContactsController().forceImportContacts();
            return;
        }
        long j = 0;
        if (i == 1) {
            getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i == 2) {
            getContactsController().resetImportedContacts();
            return;
        }
        if (i == 3) {
            getMessagesController().forceResetDialogs();
            return;
        }
        if (i == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            this.listView.adapter.update(true);
            if (BuildVars.LOGS_ENABLED) {
                zzjj.m(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i == 6) {
            getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
            for (HintsController$Hint hintsController$Hint : HintsController$Hint.values()) {
                editorEdit.remove(hintsController$Hint.name);
            }
            editorEdit.apply();
            SharedPrefsHelper.cleanupAccount(this.currentAccount);
            MessagesController.getEmojiSettings(this.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            MessagesController.getGlobalNotificationsSettings().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            ChatThemeController.getInstance(this.currentAccount).clearCache();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            RestrictedLanguagesSelectActivity.gotRestrictedLanguages = false;
            MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
            RestrictedLanguagesSelectActivity.checkRestrictedLanguages(false);
            PersistColorPalette.getInstance(this.currentAccount).cleanup();
            SharedPreferences mainSettings = getMessagesController().getMainSettings();
            SharedPreferences.Editor editorEdit2 = mainSettings.edit();
            MessagesController$$ExternalSyntheticOutline0.m(editorEdit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    editorEdit2.remove(str);
                }
            }
            editorEdit2.apply();
            SharedPreferences.Editor editorEdit3 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(this.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    editorEdit3.remove(str2);
                }
            }
            editorEdit3.apply();
            return;
        }
        if (i == 7) {
            VoIPHelper.showCallDebugSettings(getParentActivity());
            return;
        }
        if (i == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i == 9) {
            ((LaunchActivity) getParentActivity()).checkAppUpdate(true);
            return;
        }
        if (i == 10) {
            getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i == 13) {
            Set<String> set = getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i == 18) {
                zzcy.setActive((LaunchActivity) getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i == 19) {
                getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new SettingsActivity$$ExternalSyntheticLambda26(this, i2));
                return;
            }
            if (i != 20) {
                if (i == 21) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
                    builder.alertDialog.title = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMeasureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    builder.setItems(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(iMeasureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(iMeasureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(iMeasureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new SettingsActivity$$ExternalSyntheticLambda27(iMeasureDevicePerformanceClass, i2));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    builder.show();
                    return;
                }
                if (i == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i == 23) {
                    boolean zDualAvailableStatic = DualCameraView.dualAvailableStatic(getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !zDualAvailableStatic).apply();
                    Toast.makeText(getParentActivity(), LocaleController.getString(!zDualAvailableStatic ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i2 < ((ActionBarLayout) getParentLayout()).getFragmentStack().size()) {
                        ((ActionBarLayout) getParentLayout()).getFragmentStack().get(i2).clearSheets();
                        i2++;
                    }
                    return;
                }
                if (i == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i == 27) {
                    getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i == 28) {
                    SharedConfig.toggleUseCamera2(this.currentAccount);
                    return;
                }
                if (i == 29) {
                    WeakHashMap weakHashMap = BotBiometry.instances;
                    Context context = ApplicationLoader.applicationContext;
                    if (context != null) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            context.getSharedPreferences("2botbiometry_" + i3, 0).edit().clear().apply();
                        }
                        BotBiometry.instances.clear();
                    }
                    HashMap map = BotLocation.instances;
                    Context context2 = ApplicationLoader.applicationContext;
                    if (context2 != null) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            context2.getSharedPreferences("botlocation_" + i4, 0).edit().clear().apply();
                        }
                        BotLocation.instances.clear();
                    }
                    HashMap map2 = BotDownloads.instances;
                    Context context3 = ApplicationLoader.applicationContext;
                    if (context3 != null) {
                        for (int i5 = 0; i5 < 4; i5++) {
                            context3.getSharedPreferences("botdownloads_" + i5, 0).edit().clear().apply();
                        }
                        BotDownloads.instances.clear();
                    }
                    Context context4 = ApplicationLoader.applicationContext;
                    if (context4 == null) {
                        return;
                    }
                    for (int i6 = 0; i6 < 4; i6++) {
                        context4.getSharedPreferences("botemojistatus_" + i6, 0).edit().clear().apply();
                    }
                    return;
                }
                if (i == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i == 35) {
                    MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
                    return;
                }
                if (i == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                }
                if (i == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                }
                if (i == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                    return;
                }
                if (i == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null) {
                        launchActivity.checkFrameMetrics();
                        return;
                    }
                    return;
                }
                if (i == 40) {
                    SharedPreferences.Editor editorEdit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z;
                    editorEdit4.putBoolean("shadowsInSections", z).apply();
                    return;
                }
                if (i == 41) {
                    SharedPreferences.Editor editorEdit5 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z2 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z2;
                    editorEdit5.putBoolean("debugViewMetrics", z2).apply();
                    return;
                }
                return;
            }
            int i7 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb = new StringBuilder();
            long j2 = 0;
            long jLongValue = 0;
            long j3 = 0;
            long jLongValue2 = 0;
            long j4 = 0;
            long jLongValue3 = 0;
            long j5 = 0;
            long jLongValue4 = 0;
            while (i2 < i7) {
                long j6 = j;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpu_capacity");
                sb.append("#");
                sb.append(i2);
                sb.append(" ");
                if (sysInfoLong != null) {
                    sb.append("min=");
                    sb.append(sysInfoLong.longValue() / 1000);
                    sb.append(" ");
                    jLongValue += sysInfoLong.longValue() / 1000;
                    j2++;
                }
                if (sysInfoLong2 != null) {
                    sb.append("cur=");
                    sb.append(sysInfoLong2.longValue() / 1000);
                    sb.append(" ");
                    jLongValue2 = (sysInfoLong2.longValue() / 1000) + jLongValue2;
                    j3++;
                }
                if (sysInfoLong3 != null) {
                    sb.append("max=");
                    sb.append(sysInfoLong3.longValue() / 1000);
                    sb.append(" ");
                    jLongValue3 = (sysInfoLong3.longValue() / 1000) + jLongValue3;
                    j4++;
                }
                if (sysInfoLong4 != null) {
                    sb.append("cpc=");
                    sb.append(sysInfoLong4);
                    sb.append(" ");
                    jLongValue4 = sysInfoLong4.longValue() + jLongValue4;
                    j5++;
                }
                sb.append("\n");
                i2++;
                j = j6;
            }
            long j7 = j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.MANUFACTURER);
            sb2.append(", ");
            sb2.append(Build.MODEL);
            sb2.append(" (");
            sb2.append(Build.PRODUCT);
            sb2.append(", ");
            sb2.append(Build.DEVICE);
            sb2.append(")  (android ");
            int i8 = Build.VERSION.SDK_INT;
            sb2.append(i8);
            sb2.append(")\n");
            if (i8 >= 31) {
                sb2.append("SoC: ");
                sb2.append(Build.SOC_MANUFACTURER);
                sb2.append(", ");
                sb2.append(Build.SOC_MODEL);
                sb2.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb2.append("GPU: ");
                sb2.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb2.append(", min=");
                    sb2.append(sysInfoLong5.longValue() / 1000);
                }
                if (sysInfoLong6 != 0) {
                    sb2.append(", mmin=");
                    sb2.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb2.append(", max=");
                    sb2.append(sysInfoLong7.longValue() / 1000);
                }
                sb2.append("\n");
            } else {
                j2 = j2;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb2.append("GLES Version: ");
            sb2.append(deviceConfigurationInfo.getGlEsVersion());
            sb2.append("\nMemory: class=");
            sb2.append(AndroidUtilities.formatFileSize(((long) memoryClass) * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb2.append(", total=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb2.append(", avail=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb2.append(", low?=");
            sb2.append(memoryInfo.lowMemory);
            sb2.append(" (threshold=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb2.append(")\nCurrent class: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb2.append(", measured: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i8 >= 31) {
                sb2.append(", suggest=");
                sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb2.append("\n");
            sb2.append(i7);
            sb2.append(" CPUs");
            if (j2 > j7) {
                sb2.append(", avgMinFreq=");
                sb2.append(jLongValue / j2);
            }
            if (j3 > j7) {
                sb2.append(", avgCurFreq=");
                sb2.append(jLongValue2 / j3);
            }
            if (j4 > j7) {
                sb2.append(", avgMaxFreq=");
                sb2.append(jLongValue3 / j4);
            }
            if (j5 > j7) {
                sb2.append(", avgCapacity=");
                sb2.append(jLongValue4 / j5);
            }
            sb2.append("\n");
            sb2.append((CharSequence) sb);
            listCodecs$1("video/avc", sb2);
            listCodecs$1("video/hevc", sb2);
            listCodecs$1("video/x-vnd.on2.vp8", sb2);
            listCodecs$1("video/x-vnd.on2.vp9", sb2);
            showDialog(new AnonymousClass8(getParentActivity(), sb2.toString()));
        } catch (Exception unused) {
        }
    }

    public final void lambda$updateActionBarVisible$5(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBar.getTitlesContainer().setAlpha(fFloatValue);
        this.actionBarBackground.setAlpha(fFloatValue);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        ActionBar actionBar = this.actionBar;
        if (!actionBar.isSearchFieldVisible) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        actionBar.closeSearchField(true);
        return false;
    }

    public final void onClick$8(UItem uItem) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                WebAppDisclaimerAlert.show(getParentActivity(), new ChatActivity$$ExternalSyntheticLambda335(7, this, tL_attachMenuBot), null);
                return;
            }
            LaunchActivity.showAttachMenuBot(LaunchActivity.instance, this.currentAccount, tL_attachMenuBot, null, true);
        }
        if (uItem.instanceOf(AccountCell.Factory.class)) {
            int i = uItem.intValue;
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.switchToAccount(i);
                return;
            }
            return;
        }
        if (uItem.instanceOf(SettingsSearchCell.Factory.class)) {
            Object obj2 = uItem.object;
            if (obj2 instanceof ProfileActivity.SearchAdapter.SearchResult) {
                ProfileActivity.SearchAdapter.SearchResult searchResult = (ProfileActivity.SearchAdapter.SearchResult) obj2;
                INavigationLayout parentLayout = getParentLayout();
                searchResult.openRunnable.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, searchResult.rowName);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, this.search.faqWebPage, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = uItem.object;
            if (obj3 != null) {
                addRecent(obj3);
                return;
            }
            return;
        }
        switch (uItem.id) {
            case 1:
                presentSettingFragment(new UserInfoActivity());
                break;
            case 2:
                presentSettingFragment(new ThemeActivity(0));
                break;
            case 3:
                presentSettingFragment(new PrivacySettingsActivity());
                break;
            case 5:
                presentSettingFragment(new NotificationsSettingsActivity());
                break;
            case 6:
                presentSettingFragment(new DataSettingsActivity());
                break;
            case 7:
                presentSettingFragment(new FiltersSetupActivity());
                break;
            case 8:
                presentSettingFragment(new SessionsActivity(0));
                break;
            case 9:
                presentSettingFragment(new LiteModeSettingsActivity());
                break;
            case 10:
                presentSettingFragment(new LanguageSelectActivity());
                break;
            case 11:
                presentSettingFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                presentSettingFragment(new StarsIntroActivity());
                break;
            case 13:
                presentSettingFragment(new TONIntroActivity());
                break;
            case 15:
                presentSettingFragment(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                UserSelectorBottomSheet.open(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                showDialog(AlertsCreator.createSupportAlert(this, this.resourceProvider));
                break;
            case 18:
                Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.sendLogs(getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.sendLogs(getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                } else {
                    AccountFrozenAlert.show(this.currentAccount);
                }
                break;
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            ActionBarMenuItem actionBarMenuItem = this.otherItem;
            BoolAnimator boolAnimator = this.animatorSearchPageVisible;
            FragmentFloatingButton.setAnimatedVisibility(actionBarMenuItem, 1.0f - boolAnimator.floatValue);
            FragmentFloatingButton.setAnimatedVisibility(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.hasMainTabs ? 0.0f : 1.0f, 1.0f, boolAnimator.floatValue));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.hasMainTabs = bundle.getBoolean("hasMainTabs", false);
        }
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    public final boolean onLongClick$3(UItem uItem, View view) {
        String str;
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            BotWebViewSheet.deleteBot(this.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new SettingsActivity$$ExternalSyntheticLambda4(this, 3));
            return true;
        }
        if (uItem.instanceOf(SettingsSearchCell.Factory.class)) {
            Object obj2 = uItem.object;
            if (obj2 instanceof ProfileActivity.SearchAdapter.SearchResult) {
                str = ((ProfileActivity.SearchAdapter.SearchResult) obj2).link;
            } else {
                str = obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            }
            if (!TextUtils.isEmpty(str)) {
                ItemOptions itemOptions = new ItemOptions(this, view, false, true);
                itemOptions.add(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new QrActivity$$ExternalSyntheticLambda17(20, this, str), false);
                itemOptions.setScrimViewBackground(this.listView.getClipBackground(view, false));
                itemOptions.show();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onParentScrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public final void onUploadProgressChanged(float f) {
        ProfileActivity.AnonymousClass22 anonymousClass22 = this.avatarProgressView;
        if (anonymousClass22 == null) {
            return;
        }
        anonymousClass22.setProgress(f);
    }

    public final void presentSettingFragment(BaseFragment baseFragment) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.instance) == null || (actionBarLayout = launchActivity.rightActionBarLayout) == null) {
            presentFragment(baseFragment);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (ArticleViewer.IBlock.CC.m(actionBarLayout, 1) > 0) {
                actionBarLayout.removeFragmentFromStack(actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.closeLastFragment(false, false);
        }
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.noAnimation = true;
        navigationParams.forceRightLayout = true;
        actionBarLayout.presentFragment(navigationParams);
    }

    public final void setInfo(TLRPC.User user) {
        String string;
        String str;
        if (this.avatarView != null && this.avatarUploadingRequest == -1) {
            this.avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            BackupImageView backupImageView = this.avatarView;
            backupImageView.imageReceiver.setForUserOrChat(user, this.avatarDrawable);
            backupImageView.onNewImageSet();
            this.titleView.setText(UserObject.getUserName(user));
            StringBuilder sb = new StringBuilder();
            if (user != null) {
                sb.append(PhoneFormat.getInstance().format("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb.append(" • @");
                sb.append(publicUsername);
            }
            this.subtitleView.setText(sb);
            TextView textView = this.versionView;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int i = packageInfo.versionCode;
                int i2 = i / 10;
                int i3 = i % 10;
                if (i3 == 1 || i3 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                int i4 = R.string.TelegramVersion;
                Locale locale = Locale.US;
                string = LocaleController.formatString(i4, "v" + packageInfo.versionName + " (" + i2 + ")\n" + str);
            } catch (Exception e) {
                FileLog.e(e);
                string = null;
            }
            textView.setText(string);
        }
    }

    public final void showAvatarProgress$5(boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                return;
            } else {
                this.avatarProgressView.setAlpha(0.0f);
                this.avatarProgressView.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, (Property<ProfileActivity.AnonymousClass22, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, (Property<ProfileActivity.AnonymousClass22, Float>) View.ALPHA, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new LoginActivity.AnonymousClass9(28, this, z));
        this.avatarAnimation.start();
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }

    public final void updateActionBarVisible(boolean z, boolean z2) {
        boolean z3;
        ActionBarMenuItem.AnonymousClass7 anonymousClass7 = this.searchItem.searchContainer;
        if (anonymousClass7 == null || anonymousClass7.getTag() == null) {
            if (this.listView.getChildCount() > 0) {
                View childAt = this.listView.getChildAt(0);
                this.listView.getClass();
                z3 = RecyclerView.getChildAdapterPosition(childAt) > 0 || childAt.getY() + ((float) childAt.getHeight()) < ((float) this.actionBar.getHeight());
            }
        }
        if (this.actionBarVisible != z3 || z) {
            this.actionBarVisible = z3;
            ValueAnimator valueAnimator = this.actionBarVisibleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.actionBarVisibleAnimator = null;
            }
            if (!z2) {
                this.actionBar.getTitlesContainer().setAlpha(z3 ? 1.0f : 0.0f);
                this.actionBarBackground.setAlpha(z3 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z3 ? 1.0f : 0.0f);
            this.actionBarVisibleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 10));
            this.actionBarVisibleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarVisibleAnimator.setDuration(420L);
            this.actionBarVisibleAnimator.start();
        }
    }

    public final void updateColors$1() {
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(getThemedColor(i));
        this.actionBar.setItemsColor(getThemedColor(i), false);
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.titleView.setTextColor(getThemedColor(i));
        this.subtitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.searchItem.updateColor();
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        this.navigationBar.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, themedColor), themedColor}));
        this.actionBarBackground.invalidate();
        this.listView.invalidate();
    }

    public SettingsActivity(Bundle bundle) {
        super(bundle);
        this.animatorSearchPageVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 350L, false);
        this.versionViewPressCount = 0;
        this.accountNumbers = new ArrayList();
        this.avatarUploadingRequest = -1;
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
        }
    }

    public final class SettingCell extends LinearLayout implements Theme.Colorable {
        public final Background iconBackground;
        public final FrameLayout iconLayout;
        public final ImageView iconView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public final TextView titleView;
        public boolean twoLines;
        public final TextView valueView;

        public final class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.iconResId = i4;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                uItemOfFactory.textValue = charSequence3;
                uItemOfFactory.longValue = (((long) i2) & 4294967295L) | (((long) i3) << 32);
                return uItemOfFactory;
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                long j = uItem.longValue;
                int i = (int) j;
                int i2 = (int) (j >>> 32);
                SettingCell settingCell = (SettingCell) view;
                int i3 = uItem.iconResId;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                CharSequence charSequence3 = uItem.textValue;
                settingCell.iconLayout.setVisibility(i3 != 0 ? 0 : 8);
                TextView textView = settingCell.titleView;
                textView.setTranslationX(i3 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
                TextView textView2 = settingCell.subtitleView;
                textView2.setTranslationX(i3 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
                settingCell.iconBackground.setColor(i, i2);
                settingCell.iconView.setImageResource(i3);
                textView.setText(charSequence);
                boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
                settingCell.twoLines = !zIsEmpty;
                textView2.setVisibility(zIsEmpty ? 8 : 0);
                textView2.setText(charSequence2);
                settingCell.setValue(charSequence3);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new SettingCell(context, resourcesProvider);
            }
        }

        public SettingCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.iconLayout = frameLayout;
            Background background = new Background();
            this.iconBackground = background;
            frameLayout.setBackground(background);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
            this.subtitleView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            TextView textViewM2 = ArticleViewer.IBlock.CC.m(linearLayoutM, textViewM, LayoutHelper.createLinear(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
            this.valueView = textViewM2;
            textViewM2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                addView(textViewM2, LayoutHelper.createLinear(-2, -2, 16, 20, 0, 0, 0));
                addView(linearLayoutM, LayoutHelper.createLinear(0, -2, 1.0f, 23, 20, 0, 18, 0));
                addView(frameLayout, LayoutHelper.createLinear(28, 28, 21, 0, 0, 18, 0));
            } else {
                addView(frameLayout, LayoutHelper.createLinear(28, 28, 19, 18, 0, 0, 0));
                addView(linearLayoutM, LayoutHelper.createLinear(0, -2, 1.0f, 23, 18, 0, 20, 0));
                addView(textViewM2, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 20, 0));
            }
            updateColors$1();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.twoLines ? 60.0f : 50.0f), 1073741824));
        }

        public void setValue(CharSequence charSequence) {
            TextView textView = this.valueView;
            textView.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
            textView.setText(charSequence);
        }

        @Override
        public final void updateColors$1() {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.titleView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
            this.valueView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            this.iconBackground.border = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        }

        public final class Background extends Drawable {
            public final int $r8$classId;
            public boolean border;
            public Object matrix;
            public final Object paint;
            public final Object strokePaint;

            public Background() {
                this.$r8$classId = 0;
                this.paint = new Paint(1);
                Paint paint = new Paint(1);
                this.strokePaint = paint;
                this.matrix = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            }

            @Override
            public final void draw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        float fDp = AndroidUtilities.dp(10.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(getBounds());
                        Matrix matrix = (Matrix) this.matrix;
                        matrix.reset();
                        matrix.postTranslate(rectF.left, rectF.top);
                        canvas.drawRoundRect(rectF, fDp, fDp, (Paint) this.paint);
                        if (this.border) {
                            float fDp2 = AndroidUtilities.dp(1.0f);
                            Paint paint = (Paint) this.strokePaint;
                            paint.setStrokeWidth(fDp2);
                            matrix.reset();
                            matrix.postTranslate(rectF.left, rectF.top);
                            float f = fDp2 / 2.0f;
                            rectF.inset(f, f);
                            canvas.drawRoundRect(rectF, fDp, fDp, paint);
                        }
                        break;
                    default:
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                        if (((RLottieDrawable) this.matrix).isLastFrame()) {
                            RLottieDrawable rLottieDrawable = (RLottieDrawable) this.matrix;
                            boolean z = this.border;
                            RLottieDrawable rLottieDrawable2 = (RLottieDrawable) this.strokePaint;
                            RLottieDrawable rLottieDrawable3 = (RLottieDrawable) this.paint;
                            if (rLottieDrawable != (z ? rLottieDrawable3 : rLottieDrawable2)) {
                                if (z) {
                                    rLottieDrawable2 = rLottieDrawable3;
                                }
                                this.matrix = rLottieDrawable2;
                                rLottieDrawable2.setCurrentFrame(rLottieDrawable2.metaData[0] - 1, true, false);
                            }
                        }
                        ((RLottieDrawable) this.matrix).setBounds(rect);
                        ((RLottieDrawable) this.matrix).draw(canvas);
                        break;
                }
            }

            @Override
            public int getIntrinsicHeight() {
                switch (this.$r8$classId) {
                    case 1:
                        return AndroidUtilities.dp(24.0f);
                    default:
                        return super.getIntrinsicHeight();
                }
            }

            @Override
            public int getIntrinsicWidth() {
                switch (this.$r8$classId) {
                    case 1:
                        return AndroidUtilities.dp(24.0f);
                    default:
                        return super.getIntrinsicWidth();
                }
            }

            @Override
            public final int getOpacity() {
                switch (this.$r8$classId) {
                }
                return -2;
            }

            @Override
            public final void setAlpha(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        break;
                    default:
                        ((RLottieDrawable) this.paint).setAlpha(i);
                        ((RLottieDrawable) this.strokePaint).setAlpha(i);
                        break;
                }
            }

            public void setColor(int i, int i2) {
                ((Paint) this.paint).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
                switch (this.$r8$classId) {
                    case 0:
                        break;
                    default:
                        ((RLottieDrawable) this.paint).setColorFilter(colorFilter);
                        ((RLottieDrawable) this.strokePaint).setColorFilter(colorFilter);
                        break;
                }
            }

            public Background(MessagePreviewView.ToggleButton toggleButton, int i, int i2) {
                this.$r8$classId = 1;
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.paint = rLottieDrawable;
                rLottieDrawable.masterParent = toggleButton;
                rLottieDrawable.decodeSingleFrame = true;
                rLottieDrawable.scheduleNextGetFrame();
                rLottieDrawable.playInDirectionOfCustomEndFrame = true;
                rLottieDrawable.setAutoRepeat(0);
                RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.strokePaint = rLottieDrawable2;
                rLottieDrawable2.masterParent = toggleButton;
                rLottieDrawable2.decodeSingleFrame = true;
                rLottieDrawable2.scheduleNextGetFrame();
                rLottieDrawable2.playInDirectionOfCustomEndFrame = true;
                rLottieDrawable2.setAutoRepeat(0);
                this.matrix = rLottieDrawable;
            }

            private final void setAlpha$org$telegram$ui$SettingsActivity$SettingCell$Background(int i) {
            }

            private final void setColorFilter$org$telegram$ui$SettingsActivity$SettingCell$Background(ColorFilter colorFilter) {
            }
        }
    }

    public final class AnonymousClass5 extends RecyclerView.OnScrollListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass5(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            switch (this.$r8$classId) {
                case 1:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.this$0).getParentActivity().getCurrentFocus());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    if (i == 0) {
                        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.this$0;
                        int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) premiumPreviewFragment).actionBar.getBottom();
                        if (premiumPreviewFragment.totalProgress > 0.5f) {
                            premiumPreviewFragment.listView.smoothScrollBy(0, premiumPreviewFragment.currentYOffset - iDp, null);
                            break;
                        } else {
                            View viewFindViewByPosition = premiumPreviewFragment.listView.getLayoutManager() != null ? premiumPreviewFragment.listView.getLayoutManager().findViewByPosition(0) : null;
                            if (viewFindViewByPosition != null && viewFindViewByPosition.getTop() < 0) {
                                premiumPreviewFragment.listView.smoothScrollBy(0, viewFindViewByPosition.getTop(), null);
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((RestrictedLanguagesSelectActivity) this.this$0).getParentActivity().getCurrentFocus());
                    }
                    break;
                case 13:
                    SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this.this$0;
                    if (i == 0) {
                        anonymousClass1.checkAutoscroll = true;
                        anonymousClass1.invalidate();
                    }
                    if (i == 1) {
                        anonymousClass1.checkAutoscroll = false;
                        Splitter splitter = anonymousClass1.scroller;
                        ValueAnimator valueAnimator = (ValueAnimator) splitter.trimmer;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            ((ValueAnimator) splitter.trimmer).cancel();
                            splitter.trimmer = null;
                        }
                        AndroidUtilities.hideKeyboard(anonymousClass1);
                    }
                    break;
                case 15:
                    if (i == 0) {
                        EmojiBottomSheet.Page page = (EmojiBottomSheet.Page) this.this$0;
                        if (page.lockTop >= 0.0f && !page.listView.canScrollVertically(-1)) {
                            page.lockTop = -1.0f;
                            break;
                        }
                    }
                    break;
                case 16:
                    if (i == 0) {
                        ((ThemePreviewActivity) this.this$0).wasScroll = false;
                    }
                    break;
                case 17:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((TooManyCommunitiesActivity) this.this$0).getParentActivity().getCurrentFocus());
                    }
                    break;
                case 19:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.this$0).editText);
                    }
                    break;
                case 20:
                    WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.this$0;
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                    }
                    wallpapersListActivity.scrolling = i != 0;
                    break;
                case 24:
                    CommunitySheet.Page page2 = (CommunitySheet.Page) this.this$0;
                    if (i == 0) {
                        page2.wasAtTop = !page2.listView.canScrollVertically(-1);
                        page2.listView.canScrollVertically(1);
                    }
                    page2.getClass();
                    break;
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
            HintView hintView;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
            float y;
            boolean z;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor3;
            float y2;
            int measuredHeight;
            EmojiBottomSheet.SearchField searchField;
            int childAdapterPosition;
            EmojiBottomSheet emojiBottomSheet;
            EmojiBottomSheet.SearchField searchField2;
            ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment;
            switch (this.$r8$classId) {
                case 0:
                    SettingsActivity settingsActivity = (SettingsActivity) this.this$0;
                    settingsActivity.updateActionBarVisible(false, true);
                    if (settingsActivity.listView.scrollingByUser) {
                        AndroidUtilities.hideKeyboard(settingsActivity.fragmentView);
                    }
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = settingsActivity.scrollableViewNoiseSuppressor) != null) {
                        downscaleScrollableNoiseSuppressor.onScrolled(i, i2);
                        settingsActivity.blur3_InvalidateBlur$9();
                        break;
                    }
                    break;
                case 2:
                    PeerColorActivity.Page.access$100((PeerColorActivity.Page) this.this$0);
                    break;
                case 3:
                    PollCreateActivity pollCreateActivity = (PollCreateActivity) this.this$0;
                    if (i2 != 0 && (hintView = pollCreateActivity.hintView) != null) {
                        hintView.hide(true);
                    }
                    SuggestEmojiView suggestEmojiView = pollCreateActivity.suggestEmojiPanel;
                    if (suggestEmojiView != null && suggestEmojiView.show) {
                        SuggestEmojiView.AnchorViewDelegate delegate = suggestEmojiView.getDelegate();
                        if (delegate instanceof PollEditTextCell) {
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = pollCreateActivity.listView.findContainingViewHolder((PollEditTextCell) delegate);
                            if (viewHolderFindContainingViewHolder != null) {
                                int direction = pollCreateActivity.suggestEmojiPanel.getDirection();
                                View view = viewHolderFindContainingViewHolder.itemView;
                                if (direction == 0) {
                                    pollCreateActivity.suggestEmojiPanel.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                                } else {
                                    pollCreateActivity.suggestEmojiPanel.setTranslationY(view.getY());
                                }
                                LinearLayoutManager linearLayoutManager = pollCreateActivity.layoutManager;
                                zzcl zzclVar = linearLayoutManager.mHorizontalBoundCheck;
                                ViewBoundsCheck$BoundFlags viewBoundsCheck$BoundFlags = (ViewBoundsCheck$BoundFlags) zzclVar.zzc;
                                ViewBoundsCheck$Callback viewBoundsCheck$Callback = (ViewBoundsCheck$Callback) zzclVar.zzb;
                                int parentStart = viewBoundsCheck$Callback.getParentStart();
                                int parentEnd = viewBoundsCheck$Callback.getParentEnd();
                                int childStart = viewBoundsCheck$Callback.getChildStart(view);
                                int childEnd = viewBoundsCheck$Callback.getChildEnd(view);
                                viewBoundsCheck$BoundFlags.mRvStart = parentStart;
                                viewBoundsCheck$BoundFlags.mRvEnd = parentEnd;
                                viewBoundsCheck$BoundFlags.mChildStart = childStart;
                                viewBoundsCheck$BoundFlags.mChildEnd = childEnd;
                                ViewBoundsCheck$BoundFlags viewBoundsCheck$BoundFlags2 = (ViewBoundsCheck$BoundFlags) zzclVar.zzc;
                                viewBoundsCheck$BoundFlags2.mBoundFlags = 24579;
                                if (viewBoundsCheck$BoundFlags2.boundsMatch()) {
                                    zzcl zzclVar2 = linearLayoutManager.mVerticalBoundCheck;
                                    ViewBoundsCheck$BoundFlags viewBoundsCheck$BoundFlags3 = (ViewBoundsCheck$BoundFlags) zzclVar2.zzc;
                                    ViewBoundsCheck$Callback viewBoundsCheck$Callback2 = (ViewBoundsCheck$Callback) zzclVar2.zzb;
                                    int parentStart2 = viewBoundsCheck$Callback2.getParentStart();
                                    int parentEnd2 = viewBoundsCheck$Callback2.getParentEnd();
                                    int childStart2 = viewBoundsCheck$Callback2.getChildStart(view);
                                    int childEnd2 = viewBoundsCheck$Callback2.getChildEnd(view);
                                    viewBoundsCheck$BoundFlags3.mRvStart = parentStart2;
                                    viewBoundsCheck$BoundFlags3.mRvEnd = parentEnd2;
                                    viewBoundsCheck$BoundFlags3.mChildStart = childStart2;
                                    viewBoundsCheck$BoundFlags3.mChildEnd = childEnd2;
                                    ViewBoundsCheck$BoundFlags viewBoundsCheck$BoundFlags4 = (ViewBoundsCheck$BoundFlags) zzclVar2.zzc;
                                    viewBoundsCheck$BoundFlags4.mBoundFlags = 24579;
                                    if (viewBoundsCheck$BoundFlags4.boundsMatch()) {
                                    }
                                }
                                pollCreateActivity.suggestEmojiPanel.forceClose();
                            } else {
                                pollCreateActivity.suggestEmojiPanel.forceClose();
                            }
                        } else {
                            pollCreateActivity.suggestEmojiPanel.forceClose();
                        }
                        break;
                    }
                    break;
                case 4:
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.this$0;
                    premiumPreviewFragment.contentView.invalidate();
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = premiumPreviewFragment.scrollableViewNoiseSuppressor) != null) {
                        downscaleScrollableNoiseSuppressor2.onScrolled(i, i2);
                        premiumPreviewFragment.blur3_InvalidateBlur$7();
                        break;
                    }
                    break;
                case 5:
                    PrivacyUsersActivity privacyUsersActivity = (PrivacyUsersActivity) this.this$0;
                    if (!privacyUsersActivity.getMessagesController().blockedEndReached) {
                        int iAbs = Math.abs(privacyUsersActivity.layoutManager.findLastVisibleItemPosition() - privacyUsersActivity.layoutManager.findFirstVisibleItemPosition()) + 1;
                        int itemCount = recyclerView.getAdapter().getItemCount();
                        if (iAbs > 0 && privacyUsersActivity.layoutManager.findLastVisibleItemPosition() >= itemCount - 10) {
                            privacyUsersActivity.getMessagesController().getBlockedPeers(false);
                            break;
                        }
                    }
                    break;
                case 6:
                    ReportBottomSheet.Page page = (ReportBottomSheet.Page) this.this$0;
                    page.contentView.invalidate();
                    ((BottomSheet) ReportBottomSheet.this).containerView.invalidate();
                    break;
                case 8:
                    BotStarsActivity botStarsActivity = (BotStarsActivity) this.this$0;
                    if (botStarsActivity.type == 1) {
                        if (botStarsActivity.listView.canScrollVertically(1)) {
                            for (int i3 = 0; i3 < botStarsActivity.listView.getChildCount(); i3++) {
                                if (!(botStarsActivity.listView.getChildAt(i3) instanceof FlickerLoadingView)) {
                                }
                            }
                        }
                        botStarsActivity.loadTonTransactions();
                    }
                    break;
                case 9:
                    StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.this$0;
                    RecyclerListView recyclerListView = starGiftPreviewSheet.recyclerListView;
                    int childCount = recyclerListView.getChildCount() - 1;
                    while (true) {
                        FrameLayout frameLayout = starGiftPreviewSheet.headerView;
                        if (childCount >= 0) {
                            View childAt = recyclerListView.getChildAt(childCount);
                            int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(childAt);
                            if (childAdapterPosition2 >= 0) {
                                if (childAdapterPosition2 == 2) {
                                    y2 = childAt.getY();
                                    measuredHeight = frameLayout.getMeasuredHeight();
                                } else {
                                    if (childAdapterPosition2 == 1) {
                                        y = childAt.getY();
                                    } else if (childAdapterPosition2 == 0) {
                                        y2 = childAt.getY();
                                        measuredHeight = frameLayout.getMeasuredHeight();
                                    }
                                    z = true;
                                }
                                y = y2 - measuredHeight;
                                z = true;
                            }
                            childCount--;
                        } else {
                            y = 0.0f;
                            z = false;
                        }
                        boolean z2 = !z || ((float) frameLayout.getHeight()) + y < 0.0f;
                        if (starGiftPreviewSheet.gradientVisible != z2) {
                            starGiftPreviewSheet.gradientVisible = z2;
                            View view2 = starGiftPreviewSheet.gradientTop;
                            if (z2) {
                                view2.setVisibility(0);
                            }
                            view2.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new TodoItemMenu$$ExternalSyntheticLambda5(7, starGiftPreviewSheet, z2)).start();
                        }
                        starGiftPreviewSheet.headerMoveTop = y <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                        frameLayout.setVisibility(z ? 0 : 8);
                        frameLayout.setTranslationY(y);
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 31 && (downscaleScrollableNoiseSuppressor3 = starGiftPreviewSheet.scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor3.onScrolled(i, i2);
                            if (i4 >= 31 && downscaleScrollableNoiseSuppressor3 != null) {
                                starGiftPreviewSheet.invalidateMergedVisibleBlurredPositionsAndSourcesImpl$2(1);
                                break;
                            }
                        }
                    }
                    break;
                case 10:
                    ((StarGiftSheet) this.this$0).container.updateTranslations();
                    break;
                case 11:
                    StarsIntroActivity.StarsTransactionsLayout.Page page2 = (StarsIntroActivity.StarsTransactionsLayout.Page) this.this$0;
                    if (page2.listView.canScrollVertically(1)) {
                        int i5 = 0;
                        while (true) {
                            UniversalRecyclerView universalRecyclerView = page2.listView;
                            if (i5 >= universalRecyclerView.getChildCount()) {
                                break;
                            } else if (!(universalRecyclerView.getChildAt(i5) instanceof FlickerLoadingView)) {
                                i5++;
                            }
                        }
                    }
                    page2.loadTransactionsRunnable.run();
                    break;
                case 12:
                    DialogsActivity.AnonymousClass25 anonymousClass25 = (DialogsActivity.AnonymousClass25) this.this$0;
                    anonymousClass25.invalidate();
                    anonymousClass25.checkLoadMore();
                    HintView2 hintView2 = anonymousClass25.premiumHint;
                    if (hintView2 != null) {
                        hintView2.hide(true);
                    }
                    break;
                case 13:
                    SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this.this$0;
                    if (anonymousClass1.currentModel != null && anonymousClass1.layoutManager.findLastVisibleItemPosition() > anonymousClass1.listAdapter.items.size() - 10) {
                        anonymousClass1.currentModel.loadNext();
                    }
                    anonymousClass1.invalidate();
                    break;
                case 14:
                    EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) this.this$0;
                    ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                    EmojiBottomSheet emojiBottomSheet2 = EmojiBottomSheet.this;
                    if (((BottomSheet) emojiBottomSheet2).keyboardVisible && gifPage.listView.scrollingByUser && (searchField = gifPage.searchField) != null && searchField.editText != null) {
                        emojiBottomSheet2.closeKeyboard();
                    }
                    int iFindLastCompletelyVisibleItemPosition = gifPage.layoutManager.findLastCompletelyVisibleItemPosition() + 7;
                    EmojiBottomSheet.GifPage.GifAdapter gifAdapter = gifPage.adapter;
                    if (iFindLastCompletelyVisibleItemPosition >= gifAdapter.getItemCount() - 1) {
                        gifAdapter.request$1();
                    }
                    break;
                case 15:
                    EmojiBottomSheet.Page page3 = (EmojiBottomSheet.Page) this.this$0;
                    ((BottomSheet) EmojiBottomSheet.this).containerView.invalidate();
                    float f = page3.lockTop;
                    EmojiBottomSheet.EmojiListView emojiListView = page3.listView;
                    int i6 = -1;
                    if (f < 0.0f) {
                        childAdapterPosition = page3.layoutManager.findFirstCompletelyVisibleItemPosition();
                    } else {
                        int i7 = 0;
                        while (true) {
                            if (i7 < emojiListView.getChildCount()) {
                                View childAt2 = emojiListView.getChildAt(i7);
                                if (childAt2.getY() + childAt2.getHeight() > page3.lockTop + emojiListView.getPaddingTop()) {
                                    emojiListView.getClass();
                                    childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt2);
                                } else {
                                    i7++;
                                }
                            } else {
                                childAdapterPosition = -1;
                            }
                        }
                        if (childAdapterPosition == -1) {
                        }
                    }
                    EmojiBottomSheet.Page.Adapter adapter = page3.adapter;
                    for (int size = adapter.positionToSection.size() - 1; size >= 0; size--) {
                        int iKeyAt = adapter.positionToSection.keyAt(size);
                        int iValueAt = adapter.positionToSection.valueAt(size);
                        if (childAdapterPosition >= iKeyAt) {
                            i6 = iValueAt;
                            if (i6 >= 0) {
                                page3.tabsStrip.select(i6, true);
                            }
                            emojiBottomSheet = EmojiBottomSheet.this;
                            if (!((BottomSheet) emojiBottomSheet).keyboardVisible && emojiListView.scrollingByUser && (searchField2 = page3.searchField) != null && searchField2.editText != null) {
                                emojiBottomSheet.closeKeyboard();
                                break;
                            }
                        }
                    }
                    if (i6 >= 0) {
                        page3.tabsStrip.select(i6, true);
                    }
                    emojiBottomSheet = EmojiBottomSheet.this;
                    if (!((BottomSheet) emojiBottomSheet).keyboardVisible) {
                    }
                    break;
                case 16:
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    themePreviewActivity.listView2.invalidateViews();
                    themePreviewActivity.wasScroll = true;
                    break;
                case 18:
                    TopicsFragment.MessagesSearchContainer messagesSearchContainer = (TopicsFragment.MessagesSearchContainer) this.this$0;
                    if (messagesSearchContainer.canLoadMore && messagesSearchContainer.layoutManager.findLastVisibleItemPosition() + 5 >= messagesSearchContainer.rowCount) {
                        messagesSearchContainer.loadMessages(messagesSearchContainer.searchString);
                    }
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    if (topicsFragment.searching) {
                        if (i != 0 || i2 != 0) {
                            AndroidUtilities.hideKeyboard(topicsFragment.searchItem.getSearchField());
                        }
                    }
                    break;
                case 20:
                    WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.this$0;
                    if (wallpapersListActivity.listView.getAdapter() == wallpapersListActivity.searchAdapter) {
                        int iFindFirstVisibleItemPosition = wallpapersListActivity.layoutManager.findFirstVisibleItemPosition();
                        int iAbs2 = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(wallpapersListActivity.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                        if (iAbs2 > 0) {
                            int itemCount2 = wallpapersListActivity.layoutManager.getItemCount();
                            if (iAbs2 != 0 && iFindFirstVisibleItemPosition + iAbs2 > itemCount2 - 2) {
                                WallpapersListActivity.SearchAdapter searchAdapter = wallpapersListActivity.searchAdapter;
                                if (!searchAdapter.bingSearchEndReached && searchAdapter.imageReqId == 0) {
                                    searchAdapter.searchImages(searchAdapter.lastSearchString, searchAdapter.nextImagesSearchOffset, true);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 21:
                    ChatActivityEnterView.AnonymousClass47 anonymousClass47 = (ChatActivityEnterView.AnonymousClass47) this.this$0;
                    View viewFindViewByPosition = anonymousClass47.listView.getLayoutManager().findViewByPosition(0);
                    float y3 = viewFindViewByPosition != null ? viewFindViewByPosition.getY() : 0.0f;
                    anonymousClass47.scrollYOffset = y3 >= 0.0f ? y3 : 0.0f;
                    anonymousClass47.checkBackgroundBounds();
                    break;
                case 22:
                    int i8 = 0;
                    while (true) {
                        channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) this.this$0;
                        if (i8 < channelAffiliateProgramsFragment.listView.getChildCount()) {
                            if (!(channelAffiliateProgramsFragment.listView.getChildAt(i8) instanceof FlickerLoadingView)) {
                                i8++;
                            }
                        } else if (recyclerView.canScrollVertically(1)) {
                        }
                    }
                    BotStarsController botStarsController = BotStarsController.getInstance(((BaseFragment) channelAffiliateProgramsFragment).currentAccount);
                    long j = channelAffiliateProgramsFragment.dialogId;
                    botStarsController.getChannelConnectedBots(j).load();
                    BotStarsController.getInstance(((BaseFragment) channelAffiliateProgramsFragment).currentAccount).getChannelSuggestedBots(j).load();
                    break;
                case 23:
                    CommunityPendingRequestsActivity communityPendingRequestsActivity = (CommunityPendingRequestsActivity) this.this$0;
                    CommunityUtils.PendingRequests pendingRequests = communityPendingRequestsActivity.pendingRequestsList;
                    UniversalRecyclerView universalRecyclerView2 = communityPendingRequestsActivity.listView;
                    if (!pendingRequests.loading && !pendingRequests.finished && universalRecyclerView2.layoutManager.findLastVisibleItemPosition() + 10 > universalRecyclerView2.adapter.items.size()) {
                        pendingRequests.loadNext();
                        break;
                    }
                    break;
                case 24:
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    break;
                case 25:
                    CommunitySheet.PendingRequestsPage pendingRequestsPage = (CommunitySheet.PendingRequestsPage) this.this$0;
                    CommunityUtils.PendingRequests pendingRequests2 = CommunitySheet.this.pendingRequestsList;
                    UniversalRecyclerView universalRecyclerView3 = pendingRequestsPage.listView;
                    if (!pendingRequests2.loading && !pendingRequests2.finished && universalRecyclerView3.layoutManager.findLastVisibleItemPosition() + 10 > universalRecyclerView3.adapter.items.size()) {
                        pendingRequests2.loadNext();
                        break;
                    }
                    break;
                case 26:
                    BookmarksFragment bookmarksFragment = (BookmarksFragment) this.this$0;
                    if (!bookmarksFragment.listView.canScrollVertically(1)) {
                        if (TextUtils.isEmpty(bookmarksFragment.query)) {
                            bookmarksFragment.list.load$1();
                        } else {
                            AddressBarList.BookmarksList bookmarksList = bookmarksFragment.searchList;
                            if (bookmarksList != null) {
                                bookmarksList.load$1();
                            }
                        }
                    }
                    if (bookmarksFragment.listView.scrollingByUser) {
                        AndroidUtilities.hideKeyboard(bookmarksFragment.fragmentView);
                    }
                    break;
                case 27:
                    HistoryFragment historyFragment = (HistoryFragment) this.this$0;
                    if (historyFragment.listView.scrollingByUser) {
                        AndroidUtilities.hideKeyboard(historyFragment.fragmentView);
                    }
                    break;
            }
        }

        private final void onScrollStateChanged$org$telegram$ui$PollCreateActivity$5(RecyclerView recyclerView, int i) {
        }

        private final void onScrolled$org$telegram$ui$NotificationsCustomSettingsActivity$5(RecyclerView recyclerView, int i, int i2) {
        }
    }
}

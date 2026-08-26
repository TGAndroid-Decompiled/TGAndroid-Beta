package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.zzcl;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EdgeToEdgeSupportMode;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.Premium.AboutPremiumView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.PremiumNotAvailableBottomSheet;
import org.telegram.ui.Components.Premium.PremiumTierCell;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.URLSpanBrowser;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.HintView2;

public class PremiumPreviewFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int FEATURES_BUSINESS = 1;
    public static final int FEATURES_PREMIUM = 0;
    public static final int FEATURE_GIFTS = 40;
    private static final boolean IS_PREMIUM_TIERS_UNAVAILABLE = false;
    public static final int PREMIUM_FEATURE_ADS = 3;
    public static final int PREMIUM_FEATURE_ADVANCED_CHAT_MANAGEMENT = 9;
    public static final int PREMIUM_FEATURE_AI_EDITOR = 42;
    public static final int PREMIUM_FEATURE_ANIMATED_AVATARS = 7;
    public static final int PREMIUM_FEATURE_ANIMATED_EMOJI = 11;
    public static final int PREMIUM_FEATURE_APPLICATION_ICONS = 10;
    public static final int PREMIUM_FEATURE_BUSINESS = 28;
    public static final int PREMIUM_FEATURE_BUSINESS_AWAY_MESSAGES = 33;
    public static final int PREMIUM_FEATURE_BUSINESS_CHATBOTS = 34;
    public static final int PREMIUM_FEATURE_BUSINESS_CHAT_LINKS = 37;
    public static final int PREMIUM_FEATURE_BUSINESS_GREETING_MESSAGES = 32;
    public static final int PREMIUM_FEATURE_BUSINESS_INTRO = 36;
    public static final int PREMIUM_FEATURE_BUSINESS_LOCATION = 29;
    public static final int PREMIUM_FEATURE_BUSINESS_OPENING_HOURS = 30;
    public static final int PREMIUM_FEATURE_BUSINESS_QUICK_REPLIES = 31;
    public static final int PREMIUM_FEATURE_DOWNLOAD_SPEED = 2;
    public static final int PREMIUM_FEATURE_EMOJI_STATUS = 12;
    public static final int PREMIUM_FEATURE_FOLDER_TAGS = 35;
    public static final int PREMIUM_FEATURE_LAST_SEEN = 26;
    public static final int PREMIUM_FEATURE_LIMITS = 0;
    public static final int PREMIUM_FEATURE_MESSAGE_EFFECTS = 38;
    public static final int PREMIUM_FEATURE_MESSAGE_PRIVACY = 27;
    public static final int PREMIUM_FEATURE_NAME_COLOR = 23;
    public static final int PREMIUM_FEATURE_PROFILE_BADGE = 6;
    public static final int PREMIUM_FEATURE_REACTIONS = 4;
    public static final int PREMIUM_FEATURE_RICH_EDITOR = 43;
    public static final int PREMIUM_FEATURE_SAVED_TAGS = 24;
    public static final int PREMIUM_FEATURE_SHARING_DISABLE = 41;
    public static final int PREMIUM_FEATURE_STICKERS = 5;
    public static final int PREMIUM_FEATURE_STORIES = 14;
    public static final int PREMIUM_FEATURE_STORIES_CAPTION = 21;
    public static final int PREMIUM_FEATURE_STORIES_EXPIRATION_DURATION = 17;
    public static final int PREMIUM_FEATURE_STORIES_LINKS_AND_FORMATTING = 19;
    public static final int PREMIUM_FEATURE_STORIES_PRIORITY_ORDER = 20;
    public static final int PREMIUM_FEATURE_STORIES_QUALITY = 25;
    public static final int PREMIUM_FEATURE_STORIES_SAVE_TO_GALLERY = 18;
    public static final int PREMIUM_FEATURE_STORIES_STEALTH_MODE = 15;
    public static final int PREMIUM_FEATURE_STORIES_VIEWS_HISTORY = 16;
    public static final int PREMIUM_FEATURE_TODO = 39;
    public static final int PREMIUM_FEATURE_TRANSLATIONS = 13;
    public static final int PREMIUM_FEATURE_UPLOAD_LIMIT = 1;
    public static final int PREMIUM_FEATURE_VOICE_TO_TEXT = 8;
    public static final int PREMIUM_FEATURE_WALLPAPER = 22;
    public static final String TRANSACTION_PATTERN = "^(.*?)(?:\\.\\.\\d*|)$";
    BackgroundView backgroundView;
    private FrameLayout buttonContainer;
    private FrameLayout buttonContainerInternal;
    private FrameLayout contentView;
    SubscriptionTier currentSubscriptionTier;
    private int currentYOffset;
    PremiumFeatureCell dummyCell;
    PremiumTierCell dummyTierCell;
    int featuresEndRow;
    int featuresStartRow;
    private int firstViewHeight;
    private boolean forcePremium;
    final Canvas gradientCanvas;
    Paint gradientPaint;
    final Bitmap gradientTextureBitmap;
    PremiumGradient.PremiumGradientTools gradientTools;
    int helpUsRow;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryBg;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList<RectF> iBlur3Positions;
    private final BlurredBackgroundSource iBlur3Source;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    boolean inc;
    private Insets insets;
    private boolean isDialogVisible;
    boolean isLandscapeMode;
    int lastPaddingRow;
    FillLastLinearLayoutManager layoutManager;
    RecyclerListView listView;
    Matrix matrix;
    int moreFeaturesEndRow;
    int moreFeaturesStartRow;
    int moreHeaderRow;
    ArrayList<PremiumFeatureData> morePremiumFeatures;
    private BlurredBackgroundWithFadeDrawable navbarProtectionDrawable;
    int paddingRow;
    StarParticlesView particlesView;
    private PremiumButtonView premiumButtonView;
    ArrayList<PremiumFeatureData> premiumFeatures;
    int privacyRow;
    float progress;
    float progressToFull;
    int rowCount;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    int sectionRow;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private boolean selectAnnualByDefault;
    int selectedTierIndex;
    FrameLayout settingsView;
    Shader shader;
    Drawable shadowDrawable;
    int showAdsHeaderRow;
    int showAdsInfoRow;
    int showAdsRow;
    private String source;
    private int statusBarHeight;
    int statusRow;
    Paint strokePaint;
    Shader strokeShader;
    final ArrayList<SubscriptionTier> subscriptionTiers;
    PremiumGradient.PremiumGradientTools tiersGradientTools;
    int totalGradientHeight;
    float totalProgress;
    int totalTiersGradientHeight;
    private final int type;
    private final boolean whiteBackground;

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private static final int TYPE_BOTTOM_PADDING = 6;
        private static final int TYPE_BUTTON = 3;
        private static final int TYPE_CHECK = 8;
        private static final int TYPE_FEATURE = 1;
        private static final int TYPE_HEADER = 7;
        private static final int TYPE_HELP_US = 4;
        private static final int TYPE_PADDING = 0;
        private static final int TYPE_SHADOW = 5;
        private static final int TYPE_SHADOW_SECTION = 2;

        private Adapter() {
        }

        public void lambda$onBindViewHolder$0() {
            PremiumPreviewFragment.this.showDialog(new RevenueSharingAdsInfoBottomSheet(PremiumPreviewFragment.this.getContext(), false, PremiumPreviewFragment.this.getResourceProvider(), null));
        }

        @Override
        public int getItemCount() {
            return PremiumPreviewFragment.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            if (i == premiumPreviewFragment.paddingRow) {
                return 0;
            }
            if (i >= premiumPreviewFragment.featuresStartRow && i < premiumPreviewFragment.featuresEndRow) {
                return 1;
            }
            if (i >= premiumPreviewFragment.moreFeaturesStartRow && i < premiumPreviewFragment.moreFeaturesEndRow) {
                return 1;
            }
            if (i == premiumPreviewFragment.helpUsRow) {
                return 4;
            }
            if (i == premiumPreviewFragment.sectionRow || i == premiumPreviewFragment.statusRow || i == premiumPreviewFragment.privacyRow || i == premiumPreviewFragment.showAdsInfoRow) {
                return 5;
            }
            if (i == premiumPreviewFragment.lastPaddingRow) {
                return 6;
            }
            if (i == premiumPreviewFragment.moreHeaderRow || i == premiumPreviewFragment.showAdsHeaderRow) {
                return 7;
            }
            return i == premiumPreviewFragment.showAdsRow ? 8 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 8;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.TL_help_premiumPromo premiumPromo;
            String strSubstring;
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            int i2 = premiumPreviewFragment.featuresStartRow;
            boolean z = false;
            boolean z2 = true;
            if (i >= i2 && i < premiumPreviewFragment.featuresEndRow) {
                ((PremiumFeatureCell) viewHolder.itemView).setData(premiumPreviewFragment.premiumFeatures.get(i - i2), i != PremiumPreviewFragment.this.featuresEndRow - 1);
                return;
            }
            int i3 = premiumPreviewFragment.moreFeaturesStartRow;
            if (i >= i3 && i < premiumPreviewFragment.moreFeaturesEndRow) {
                ((PremiumFeatureCell) viewHolder.itemView).setData(premiumPreviewFragment.morePremiumFeatures.get(i - i3), i != PremiumPreviewFragment.this.moreFeaturesEndRow - 1);
                return;
            }
            if (i == premiumPreviewFragment.sectionRow) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setText("");
                textInfoPrivacyCell.setFixedSize(12);
                return;
            }
            if (i != premiumPreviewFragment.statusRow && i != premiumPreviewFragment.privacyRow && i != premiumPreviewFragment.showAdsInfoRow) {
                if (i == premiumPreviewFragment.moreHeaderRow) {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                    return;
                }
                if (i == premiumPreviewFragment.showAdsHeaderRow) {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.ShowAdsTitle));
                    return;
                }
                if (i == premiumPreviewFragment.showAdsRow) {
                    TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(PremiumPreviewFragment.this.getUserConfig().getClientUserId());
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    String string = LocaleController.getString(R.string.ShowAds);
                    if (userFull != null && !userFull.sponsored_enabled) {
                        z2 = false;
                    }
                    textCell.setTextAndCheck(string, z2, false);
                    return;
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell2 = (TextInfoPrivacyCell) viewHolder.itemView;
            if (!premiumPreviewFragment.whiteBackground) {
                textInfoPrivacyCell2.setTextColor(Theme.multAlpha(0.75f, -1));
                textInfoPrivacyCell2.getTextView().setLinkTextColor(-1);
                textInfoPrivacyCell2.setLinkTextRippleColor(Integer.valueOf(Theme.multAlpha(0.15f, -1)));
            }
            textInfoPrivacyCell2.setFixedSize(0);
            PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
            if (i == premiumPreviewFragment2.showAdsInfoRow) {
                textInfoPrivacyCell2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new PhotoViewer$$ExternalSyntheticLambda60(this, 29)), true));
                return;
            }
            if (i == premiumPreviewFragment2.statusRow && premiumPreviewFragment2.type == 1) {
                textInfoPrivacyCell2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
                return;
            }
            PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
            if (i != premiumPreviewFragment3.statusRow || (premiumPromo = premiumPreviewFragment3.getMediaDataController().getPremiumPromo()) == null) {
                return;
            }
            SpannableString spannableString = new SpannableString(premiumPromo.status_text);
            MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
            TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spannableString.getSpans(0, spannableString.length(), TextStyleSpan.class);
            int length = textStyleSpanArr.length;
            int i4 = 0;
            while (i4 < length) {
                TextStyleSpan.TextStyleRun textStyleRun = textStyleSpanArr[i4].getTextStyleRun();
                TLRPC.MessageEntity messageEntity = textStyleRun.urlEntity;
                if (messageEntity != null) {
                    String str = premiumPromo.status_text;
                    int i5 = messageEntity.offset;
                    strSubstring = TextUtils.substring(str, i5, messageEntity.length + i5);
                } else {
                    strSubstring = null;
                }
                TLRPC.MessageEntity messageEntity2 = textStyleRun.urlEntity;
                if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                    spannableString.setSpan(new URLSpanBotCommand(strSubstring, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    spannableString.setSpan(new URLSpanNoUnderline(strSubstring, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new URLSpanReplacement(zzii.m("mailto:", strSubstring), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (strSubstring.toLowerCase().contains("://")) {
                        spannableString.setSpan(new URLSpanBrowser(strSubstring, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else {
                        spannableString.setSpan(new URLSpanBrowser("http://".concat(strSubstring), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new URLSpanNoUnderline(zzii.m("card:", strSubstring), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(strSubstring, z);
                    if (strSubstring.startsWith("+")) {
                        strStripExceptNumbers = zzii.m("+", strStripExceptNumbers);
                    }
                    spannableString.setSpan(new URLSpanBrowser(zzii.m("tel:", strStripExceptNumbers), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    URLSpanReplacement uRLSpanReplacement = new URLSpanReplacement(textStyleRun.urlEntity.url, textStyleRun);
                    uRLSpanReplacement.setNavigateToPremiumBot(z2);
                    spannableString.setSpan(uRLSpanReplacement, textStyleRun.start, textStyleRun.end, 33);
                    if (!PremiumPreviewFragment.this.whiteBackground) {
                        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), textStyleRun.start, textStyleRun.end, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new URLSpanUserMention("" + ((TLRPC.TL_messageEntityMentionName) textStyleRun.urlEntity).user_id, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new URLSpanUserMention("" + ((TLRPC.TL_inputMessageEntityMentionName) textStyleRun.urlEntity).user_id.user_id, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else {
                    if ((textStyleRun.flags & 4) != 0) {
                        spannableString.setSpan(new URLSpanMono(spannableString, textStyleRun.start, textStyleRun.end, (byte) 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else {
                        spannableString.setSpan(new TextStyleSpan(textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    }
                    i4++;
                    z = false;
                    z2 = true;
                }
                if ((textStyleRun.flags & 256) != 0) {
                    spannableString.setSpan(new TextStyleSpan(textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                }
                i4++;
                z = false;
                z2 = true;
            }
            textInfoPrivacyCell2.setText(spannableString);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    shadowSectionCell = new PremiumFeatureCell(context) {
                        @Override
                        public void dispatchDraw(Canvas canvas) {
                            float fDp = AndroidUtilities.dp(10.0f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(this.imageView.getLeft(), this.imageView.getTop(), this.imageView.getRight(), this.imageView.getBottom());
                            PremiumPreviewFragment.this.matrix.reset();
                            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                            premiumPreviewFragment.matrix.postScale(1.0f, premiumPreviewFragment.totalGradientHeight / 100.0f, 0.0f, 0.0f);
                            PremiumPreviewFragment.this.matrix.postTranslate(0.0f, -this.data.yOffset);
                            PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                            premiumPreviewFragment2.shader.setLocalMatrix(premiumPreviewFragment2.matrix);
                            canvas.drawRoundRect(rectF, fDp, fDp, PremiumPreviewFragment.this.gradientPaint);
                            if (((BaseFragment) PremiumPreviewFragment.this).resourceProvider != null ? ((BaseFragment) PremiumPreviewFragment.this).resourceProvider.isDark() : Theme.currentTheme.isDark()) {
                                float fDp2 = AndroidUtilities.dp(1.0f);
                                PremiumPreviewFragment.this.strokePaint.setStrokeWidth(fDp2);
                                canvas.save();
                                canvas.translate(rectF.left, rectF.top);
                                rectF.offset(-rectF.left, -rectF.top);
                                float f = fDp2 / 2.0f;
                                rectF.inset(f, f);
                                canvas.drawRoundRect(rectF, fDp, fDp, PremiumPreviewFragment.this.strokePaint);
                                canvas.restore();
                            }
                            super.dispatchDraw(canvas);
                        }
                    };
                    break;
                case 2:
                    shadowSectionCell = new ShadowSectionCell(context, 0);
                    break;
                case 3:
                default:
                    shadowSectionCell = new View(context) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                            if (premiumPreviewFragment.isLandscapeMode) {
                                premiumPreviewFragment.firstViewHeight = 0;
                            } else {
                                int iDp = AndroidUtilities.dp(64.0f);
                                if (AndroidUtilities.dp(8.0f) + PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() > iDp) {
                                    iDp = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                                }
                                PremiumPreviewFragment.this.firstViewHeight = iDp;
                            }
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(PremiumPreviewFragment.this.firstViewHeight, 1073741824));
                        }
                    };
                    shadowSectionCell.setTag(-33024);
                    break;
                case 4:
                    shadowSectionCell = new AboutPremiumView(context);
                    break;
                case 5:
                    shadowSectionCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 6:
                    shadowSectionCell = new View(context);
                    shadowSectionCell.setTag(-33024);
                    break;
                case 7:
                    shadowSectionCell = new HeaderCell(context);
                    break;
                case 8:
                    shadowSectionCell = new TextCell(23, context, ((BaseFragment) PremiumPreviewFragment.this).resourceProvider, false, true);
                    break;
            }
            return zzkd.m(shadowSectionCell, shadowSectionCell, -2);
        }
    }

    public class BackgroundView extends LinearLayout {
        private final FrameLayout imageFrameLayout;
        private final GLIconTextureView imageView;
        private boolean setTierListViewVisibility;
        private final TextView subtitleView;
        private RecyclerListView tierListView;
        private boolean tierListViewVisible;
        TextView titleView;

        public class AnonymousClass3 extends RecyclerListView.SelectionAdapter {
            final Context val$context;
            final PremiumPreviewFragment val$this$0;

            public AnonymousClass3(PremiumPreviewFragment premiumPreviewFragment, Context context) {
                this.val$this$0 = premiumPreviewFragment;
                this.val$context = context;
            }

            public Paint lambda$onCreateViewHolder$0(PremiumTierCell premiumTierCell, Void r9) {
                PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0, premiumTierCell.getMeasuredWidth(), PremiumPreviewFragment.this.totalTiersGradientHeight, 0.0f, -premiumTierCell.getTier().yOffset);
                return PremiumPreviewFragment.this.tiersGradientTools.paint;
            }

            @Override
            public int getItemCount() {
                return PremiumPreviewFragment.this.subscriptionTiers.size();
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return !PremiumPreviewFragment.this.subscriptionTiers.get(viewHolder.getAdapterPosition()).subscriptionOption.current;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) viewHolder.itemView;
                premiumTierCell.bind(PremiumPreviewFragment.this.subscriptionTiers.get(i), i != getItemCount() - 1);
                premiumTierCell.setChecked(PremiumPreviewFragment.this.selectedTierIndex == i, false);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                PremiumTierCell premiumTierCell = new PremiumTierCell(this.val$context) {
                    @Override
                    public void dispatchDraw(Canvas canvas) {
                        if (this.discountView.getVisibility() == 0) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(this.discountView.getLeft(), this.discountView.getTop(), this.discountView.getRight(), this.discountView.getBottom());
                            PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0, getMeasuredWidth(), PremiumPreviewFragment.this.totalTiersGradientHeight, 0.0f, -this.tier.yOffset);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), PremiumPreviewFragment.this.tiersGradientTools.paint);
                        }
                        super.dispatchDraw(canvas);
                    }
                };
                premiumTierCell.setCirclePaintProvider(new WearAuthSheet$$ExternalSyntheticLambda3(12, this, premiumTierCell));
                return new RecyclerListView.Holder(premiumTierCell);
            }
        }

        public BackgroundView(final Context context) {
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.imageFrameLayout = frameLayout;
            int i = PremiumPreviewFragment.this.type == 1 ? 175 : 190;
            addView(frameLayout, LayoutHelper.createLinear(i, i, 1));
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, PremiumPreviewFragment.this.whiteBackground ? 1 : 0, PremiumPreviewFragment.this.type == 1 ? 1 : 0) {
                @Override
                public void onLongPress() {
                    super.onLongPress();
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.settingsView == null && BuildVars.DEBUG_PRIVATE_VERSION) {
                        premiumPreviewFragment.settingsView = new FrameLayout(context);
                        ScrollView scrollView = new ScrollView(context);
                        scrollView.addView(new GLIconSettingsView(context, BackgroundView.this.imageView.mRenderer));
                        PremiumPreviewFragment.this.settingsView.addView(scrollView);
                        PremiumPreviewFragment.this.settingsView.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        PremiumPreviewFragment.this.contentView.addView(PremiumPreviewFragment.this.settingsView, LayoutHelper.createFrame(-1, -1, 80));
                        ((ViewGroup.MarginLayoutParams) PremiumPreviewFragment.this.settingsView.getLayoutParams()).topMargin = PremiumPreviewFragment.this.currentYOffset;
                        PremiumPreviewFragment.this.settingsView.setTranslationY(AndroidUtilities.dp(1000.0f));
                        PremiumPreviewFragment.this.settingsView.animate().translationY(1.0f).setDuration(300L);
                    }
                }
            };
            this.imageView = gLIconTextureView;
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(-1, -1.0f));
            frameLayout.setClipChildren(false);
            setClipChildren(false);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 22.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setGravity(1);
            addView(this.titleView, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 16, PremiumPreviewFragment.this.type == 1 ? 8 : 20, 16, 0));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(1);
            addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 1, 16, 7, 16, 0));
            RecyclerListView recyclerListView = new RecyclerListView(context) {
                Paint paint;
                private Path path;

                {
                    Paint paint = new Paint(1);
                    this.paint = paint;
                    paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                    this.path = new Path();
                }

                @Override
                public void dispatchDraw(Canvas canvas) {
                    this.path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    this.path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                    canvas.drawPath(this.path, this.paint);
                    canvas.save();
                    canvas.clipPath(this.path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (PremiumPreviewFragment.this.progressToFull >= 1.0f) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (PremiumPreviewFragment.this.progressToFull >= 1.0f) {
                        return false;
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                public void onSizeChanged(int i2, int i3, int i4, int i5) {
                    super.onSizeChanged(i2, i3, i4, i5);
                    BackgroundView.this.measureGradient(i2, i3);
                }
            };
            this.tierListView = recyclerListView;
            recyclerListView.setOverScrollMode(2);
            CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.tierListView, false);
            this.tierListView.setAdapter(new AnonymousClass3(PremiumPreviewFragment.this, context));
            this.tierListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 3));
            final Path path = new Path();
            final float[] fArr = new float[8];
            this.tierListView.setSelectorTransformer(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$new$1(path, fArr, (Canvas) obj);
                }
            });
            setClipChildren(false);
            setClipToPadding(false);
            addView(this.tierListView, LayoutHelper.createLinear(-1, -2, 12.0f, 16.0f, 12.0f, 4.0f));
            updatePremiumTiers();
            updateText();
        }

        public void lambda$new$0(View view, int i) {
            if (view.isEnabled() && (view instanceof PremiumTierCell)) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) view;
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.selectedTierIndex = premiumPreviewFragment.subscriptionTiers.indexOf(premiumTierCell.getTier());
                boolean z = true;
                PremiumPreviewFragment.this.updateButtonText(true);
                premiumTierCell.setChecked(true, true);
                for (int i2 = 0; i2 < this.tierListView.getChildCount(); i2++) {
                    View childAt = this.tierListView.getChildAt(i2);
                    if (childAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell2 = (PremiumTierCell) childAt;
                        if (premiumTierCell2.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell2.setChecked(false, true);
                        }
                    }
                }
                for (int i3 = 0; i3 < this.tierListView.getHiddenChildCount(); i3++) {
                    View hiddenChildAt = this.tierListView.getHiddenChildAt(i3);
                    if (hiddenChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell3 = (PremiumTierCell) hiddenChildAt;
                        if (premiumTierCell3.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell3.setChecked(false, true);
                        }
                    }
                }
                for (int i4 = 0; i4 < this.tierListView.getCachedChildCount(); i4++) {
                    View cachedChildAt = this.tierListView.getCachedChildAt(i4);
                    if (cachedChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell4 = (PremiumTierCell) cachedChildAt;
                        if (premiumTierCell4.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell4.setChecked(false, true);
                        }
                    }
                }
                for (int i5 = 0; i5 < this.tierListView.getAttachedScrapChildCount(); i5++) {
                    View attachedScrapChildAt = this.tierListView.getAttachedScrapChildAt(i5);
                    if (attachedScrapChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell5 = (PremiumTierCell) attachedScrapChildAt;
                        if (premiumTierCell5.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell5.setChecked(false, true);
                        }
                    }
                }
                FrameLayout frameLayout = PremiumPreviewFragment.this.buttonContainer;
                if (PremiumPreviewFragment.this.getUserConfig().isPremium()) {
                    SubscriptionTier subscriptionTier = PremiumPreviewFragment.this.currentSubscriptionTier;
                    if (subscriptionTier != null) {
                        int months = subscriptionTier.getMonths();
                        PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                        if (months >= premiumPreviewFragment2.subscriptionTiers.get(premiumPreviewFragment2.selectedTierIndex).getMonths() || PremiumPreviewFragment.this.forcePremium) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z);
            }
        }

        public void lambda$new$1(Path path, float[] fArr, Canvas canvas) {
            View pressedChildView = this.tierListView.getPressedChildView();
            int adapterPosition = pressedChildView == null ? -1 : this.tierListView.getChildViewHolder(pressedChildView).getAdapterPosition();
            path.rewind();
            Rect selectorRect = this.tierListView.getSelectorRect();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
            Arrays.fill(fArr, 0.0f);
            if (adapterPosition == 0) {
                Arrays.fill(fArr, 0, 4, AndroidUtilities.dp(12.0f));
            }
            if (adapterPosition == this.tierListView.getAdapter().getItemCount() - 1) {
                Arrays.fill(fArr, 4, 8, AndroidUtilities.dp(12.0f));
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
        }

        public void lambda$updateText$2(View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            view.setAlpha(fFloatValue);
            view.setScaleX(fFloatValue);
            view.setScaleY(fFloatValue);
            float animatedFraction = valueAnimator.getAnimatedFraction();
            for (int i = 0; i < PremiumPreviewFragment.this.backgroundView.getChildCount(); i++) {
                View childAt = PremiumPreviewFragment.this.backgroundView.getChildAt(i);
                if (childAt != this.tierListView) {
                    childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == this.imageFrameLayout ? 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction) : 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction)));
                }
            }
        }

        public void measureGradient(int i, int i2) {
            int measuredHeight = 0;
            for (int i3 = 0; i3 < PremiumPreviewFragment.this.subscriptionTiers.size(); i3++) {
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.dummyTierCell.bind(premiumPreviewFragment.subscriptionTiers.get(i3), false);
                PremiumPreviewFragment.this.dummyTierCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                PremiumPreviewFragment.this.subscriptionTiers.get(i3).yOffset = measuredHeight;
                measuredHeight += PremiumPreviewFragment.this.dummyTierCell.getMeasuredHeight();
            }
            PremiumPreviewFragment.this.totalTiersGradientHeight = measuredHeight;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public void updatePremiumTiers() {
            long pricePerYear;
            SubscriptionTier subscriptionTier;
            String str;
            PremiumPreviewFragment.this.subscriptionTiers.clear();
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            premiumPreviewFragment.selectedTierIndex = -1;
            premiumPreviewFragment.currentSubscriptionTier = null;
            long pricePerYear2 = 0;
            if (premiumPreviewFragment.getMediaDataController().getPremiumPromo() != null) {
                ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = PremiumPreviewFragment.this.getMediaDataController().getPremiumPromo().period_options;
                int size = arrayList.size();
                pricePerYear = 0;
                int i = 0;
                while (i < size) {
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList.get(i);
                    i++;
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                    if (!PremiumPreviewFragment.this.getUserConfig().isPremium() || tL_premiumSubscriptionOption2.can_purchase_upgrade || tL_premiumSubscriptionOption2.current) {
                        SubscriptionTier subscriptionTier2 = new SubscriptionTier(tL_premiumSubscriptionOption2);
                        PremiumPreviewFragment.this.subscriptionTiers.add(subscriptionTier2);
                        if (PremiumPreviewFragment.this.selectAnnualByDefault && tL_premiumSubscriptionOption2.months == 12) {
                            PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                            premiumPreviewFragment2.selectedTierIndex = premiumPreviewFragment2.subscriptionTiers.size() - 1;
                        }
                        if (tL_premiumSubscriptionOption2.current) {
                            PremiumPreviewFragment.this.currentSubscriptionTier = subscriptionTier2;
                        }
                        if (BuildVars.useInvoiceBilling() && subscriptionTier2.getPricePerYear() > pricePerYear) {
                            pricePerYear = subscriptionTier2.getPricePerYear();
                        }
                    }
                }
            } else {
                pricePerYear = 0;
            }
            if (BuildVars.useInvoiceBilling() && PremiumPreviewFragment.this.getUserConfig().isPremium()) {
                PremiumPreviewFragment.this.subscriptionTiers.clear();
                PremiumPreviewFragment.this.currentSubscriptionTier = null;
            } else if (BuildVars.useInvoiceBilling() || PremiumPreviewFragment.this.currentSubscriptionTier == null) {
                subscriptionTier = PremiumPreviewFragment.this.currentSubscriptionTier;
                if (subscriptionTier != null && subscriptionTier.getMonths() == 12) {
                    PremiumPreviewFragment.this.subscriptionTiers.clear();
                    PremiumPreviewFragment.this.currentSubscriptionTier = null;
                }
            } else {
                String lastPremiumTransaction = BillingController.getInstance().getLastPremiumTransaction();
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = PremiumPreviewFragment.this.currentSubscriptionTier.subscriptionOption;
                if (Objects.equals(lastPremiumTransaction, (tL_premiumSubscriptionOption3 == null || (str = tL_premiumSubscriptionOption3.transaction) == null) ? null : str.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"))) {
                    subscriptionTier = PremiumPreviewFragment.this.currentSubscriptionTier;
                    if (subscriptionTier != null) {
                        PremiumPreviewFragment.this.subscriptionTiers.clear();
                        PremiumPreviewFragment.this.currentSubscriptionTier = null;
                    }
                } else {
                    PremiumPreviewFragment.this.subscriptionTiers.clear();
                    PremiumPreviewFragment.this.currentSubscriptionTier = null;
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                ArrayList<SubscriptionTier> arrayList2 = PremiumPreviewFragment.this.subscriptionTiers;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    SubscriptionTier subscriptionTier3 = arrayList2.get(i2);
                    i2++;
                    subscriptionTier3.setPricePerYearRegular(pricePerYear);
                }
            } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
                ArrayList<SubscriptionTier> arrayList3 = PremiumPreviewFragment.this.subscriptionTiers;
                int size3 = arrayList3.size();
                int i3 = 0;
                boolean z = false;
                while (i3 < size3) {
                    SubscriptionTier subscriptionTier4 = arrayList3.get(i3);
                    i3++;
                    SubscriptionTier subscriptionTier5 = subscriptionTier4;
                    subscriptionTier5.setGooglePlayProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
                    if (subscriptionTier5.getPricePerYear() > pricePerYear2) {
                        pricePerYear2 = subscriptionTier5.getPricePerYear();
                    }
                    if (subscriptionTier5.getOfferDetails() != null) {
                        z = true;
                    }
                }
                if (z) {
                    int i4 = 0;
                    while (i4 < PremiumPreviewFragment.this.subscriptionTiers.size()) {
                        if (PremiumPreviewFragment.this.subscriptionTiers.get(i4).getOfferDetails() == null) {
                            PremiumPreviewFragment.this.subscriptionTiers.remove(i4);
                            i4--;
                        }
                        i4++;
                    }
                }
                ArrayList<SubscriptionTier> arrayList4 = PremiumPreviewFragment.this.subscriptionTiers;
                int size4 = arrayList4.size();
                int i5 = 0;
                while (i5 < size4) {
                    SubscriptionTier subscriptionTier6 = arrayList4.get(i5);
                    i5++;
                    subscriptionTier6.setPricePerYearRegular(pricePerYear2);
                }
            }
            if (PremiumPreviewFragment.this.selectedTierIndex == -1) {
                for (int i6 = 0; i6 < PremiumPreviewFragment.this.subscriptionTiers.size(); i6++) {
                    if (PremiumPreviewFragment.this.subscriptionTiers.get(i6).getMonths() == 12) {
                        PremiumPreviewFragment.this.selectedTierIndex = i6;
                        break;
                    }
                }
                PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
                if (premiumPreviewFragment3.selectedTierIndex == -1) {
                    premiumPreviewFragment3.selectedTierIndex = 0;
                }
            }
            PremiumPreviewFragment.this.updateButtonText(false);
            this.tierListView.getAdapter().notifyDataSetChanged();
        }

        public void updateText() {
            int i = 1;
            if (PremiumPreviewFragment.this.type == 0) {
                this.titleView.setText(LocaleController.getString(PremiumPreviewFragment.this.forcePremium ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramPremium));
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m((PremiumPreviewFragment.this.getUserConfig().isPremium() || PremiumPreviewFragment.this.forcePremium) ? R.string.TelegramPremiumSubscribedSubtitle : R.string.TelegramPremiumSubtitle, this.subtitleView);
            } else if (PremiumPreviewFragment.this.type == 1) {
                this.titleView.setText(LocaleController.getString(PremiumPreviewFragment.this.forcePremium ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramBusiness));
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m((PremiumPreviewFragment.this.getUserConfig().isPremium() || PremiumPreviewFragment.this.forcePremium) ? R.string.TelegramBusinessSubscribedSubtitleTemp : R.string.TelegramBusinessSubtitleTemp, this.subtitleView);
            }
            this.subtitleView.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), HintView2.cutInFancyHalf(this.subtitleView.getText(), this.subtitleView.getPaint()));
            boolean z = PremiumPreviewFragment.this.forcePremium || BuildVars.IS_BILLING_UNAVAILABLE || PremiumPreviewFragment.this.subscriptionTiers.size() <= 1;
            if (!this.setTierListViewVisibility || !z) {
                this.tierListView.setVisibility(z ? 8 : 0);
                this.setTierListViewVisibility = true;
            } else if (this.tierListView.getVisibility() == 0 && z && this.tierListViewVisible == z) {
                final RecyclerListView recyclerListView = this.tierListView;
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new TextMessageEnterTransition$$ExternalSyntheticLambda1(i, recyclerListView, this, duration));
                duration.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        recyclerListView.setVisibility(8);
                        for (int i2 = 0; i2 < PremiumPreviewFragment.this.backgroundView.getChildCount(); i2++) {
                            View childAt = PremiumPreviewFragment.this.backgroundView.getChildAt(i2);
                            if (childAt != BackgroundView.this.tierListView) {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    }
                });
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.start();
            }
            this.tierListViewVisible = !z;
        }
    }

    public static class PremiumFeatureData {
        public final String description;
        public final int icon;
        public final CharSequence title;
        public final int type;
        public int yOffset;

        public PremiumFeatureData(int i, int i2, CharSequence charSequence, String str) {
            this.type = i;
            this.icon = i2;
            this.title = charSequence;
            this.description = str;
        }
    }

    public static final class SubscriptionTier {
        private int discount;
        private ProductDetails googlePlayProductDetails;
        private ProductDetails.SubscriptionOfferDetails offerDetails;
        private long pricePerMonth;
        private long pricePerYear;
        private long pricePerYearRegular;
        public final TLRPC.TL_premiumSubscriptionOption subscriptionOption;
        public int yOffset;

        public SubscriptionTier(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
            this.subscriptionOption = tL_premiumSubscriptionOption;
        }

        private void checkOfferDetails() {
            ProductDetails productDetails = this.googlePlayProductDetails;
            if (productDetails != null && this.offerDetails == null) {
                ArrayList arrayList = productDetails.zzj;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) obj;
                    String str = ((ProductDetails.PricingPhase) subscriptionOfferDetails.zzd.mControlCategories.get(0)).zzd;
                    if (getMonths() != 12) {
                        Locale locale = Locale.ROOT;
                        if (str.equals("P" + getMonths() + "M")) {
                            this.offerDetails = subscriptionOfferDetails;
                            return;
                        }
                    } else if (str.equals("P1Y")) {
                        this.offerDetails = subscriptionOfferDetails;
                        return;
                    }
                }
            }
        }

        public String getCurrency() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return this.subscriptionOption.currency;
            }
            if (this.googlePlayProductDetails == null) {
                return "";
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            return subscriptionOfferDetails == null ? "" : ((ProductDetails.PricingPhase) subscriptionOfferDetails.zzd.mControlCategories.get(0)).zzc;
        }

        public int getDiscount() {
            if (this.discount == 0) {
                if (getPricePerMonth() == 0) {
                    return 0;
                }
                if (this.pricePerYearRegular != 0) {
                    int pricePerYear = (int) ((1.0d - (getPricePerYear() / this.pricePerYearRegular)) * 100.0d);
                    this.discount = pricePerYear;
                    if (pricePerYear == 0) {
                        this.discount = -1;
                    }
                }
            }
            return this.discount;
        }

        public String getFormattedPrice() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPrice(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPrice(), getCurrency(), 6);
        }

        public String getFormattedPricePerMonth() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency(), 6);
        }

        public String getFormattedPricePerYear() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerYear(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerYear(), getCurrency(), 6);
        }

        public String getFormattedPricePerYearRegular() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(this.pricePerYearRegular, getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(this.pricePerYearRegular, getCurrency(), 6);
        }

        public ProductDetails getGooglePlayProductDetails() {
            return this.googlePlayProductDetails;
        }

        public int getMonths() {
            return this.subscriptionOption.months;
        }

        public ProductDetails.SubscriptionOfferDetails getOfferDetails() {
            checkOfferDetails();
            return this.offerDetails;
        }

        public long getPrice() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return this.subscriptionOption.amount;
            }
            if (this.googlePlayProductDetails == null) {
                return 0L;
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            if (subscriptionOfferDetails == null) {
                return 0L;
            }
            return ((ProductDetails.PricingPhase) subscriptionOfferDetails.zzd.mControlCategories.get(0)).zzb;
        }

        public long getPricePerMonth() {
            if (this.pricePerMonth == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerMonth = price / ((long) this.subscriptionOption.months);
                }
            }
            return this.pricePerMonth;
        }

        public long getPricePerYear() {
            if (this.pricePerYear == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerYear = (long) ((price / ((double) this.subscriptionOption.months)) * 12.0d);
                }
            }
            return this.pricePerYear;
        }

        public void setGooglePlayProductDetails(ProductDetails productDetails) {
            this.googlePlayProductDetails = productDetails;
        }

        public void setPricePerYearRegular(long j) {
            this.pricePerYearRegular = j;
        }
    }

    public PremiumPreviewFragment(int i, String str) {
        super(null);
        this.premiumFeatures = new ArrayList<>();
        this.morePremiumFeatures = new ArrayList<>();
        this.subscriptionTiers = new ArrayList<>();
        boolean z = false;
        this.selectedTierIndex = 0;
        this.strokePaint = new Paint(1);
        this.matrix = new Matrix();
        this.gradientPaint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.gradientTextureBitmap = bitmapCreateBitmap;
        this.gradientCanvas = new Canvas(bitmapCreateBitmap);
        this.gradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, null);
        this.insets = Insets.NONE;
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
        this.tiersGradientTools = premiumGradientTools;
        premiumGradientTools.exactly = true;
        premiumGradientTools.x1 = 0.0f;
        premiumGradientTools.y1 = 0.0f;
        premiumGradientTools.x2 = 0.0f;
        premiumGradientTools.y2 = 1.0f;
        premiumGradientTools.cx = 0.0f;
        premiumGradientTools.cy = 0.0f;
        ArrayList<RectF> arrayList = new ArrayList<>();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList.add(rectF);
        this.type = i;
        if (!Theme.currentTheme.isDark() && i == 1) {
            z = true;
        }
        this.whiteBackground = z;
        this.source = str;
        BlurredBackgroundSource blurredBackgroundSource = new BlurredBackgroundSource() {
            private final Paint p = new Paint();

            @Override
            public BlurredBackgroundDrawable createDrawable() {
                return new BlurredBackgroundDrawableSource(this);
            }

            @Override
            public void dispatchOnDrawablesRelativePositionChange() {
            }

            @Override
            public void draw(Canvas canvas, float f, float f2, float f3, float f4) {
                if (PremiumPreviewFragment.this.whiteBackground) {
                    this.p.setColor(PremiumPreviewFragment.this.getThemedColor(Theme.key_windowBackgroundGray));
                    canvas.drawRect(f, f2, f3, f4, this.p);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    premiumPreviewFragment.gradientTools.gradientMatrix(0, 0, premiumPreviewFragment.contentView.getMeasuredWidth(), PremiumPreviewFragment.this.contentView.getMeasuredHeight(), (-PremiumPreviewFragment.this.contentView.getMeasuredWidth()) * 0.1f * PremiumPreviewFragment.this.progress, 0.0f);
                    canvas.drawRect(f, f2, f3, f4, PremiumPreviewFragment.this.gradientTools.paint);
                }
            }
        };
        this.iBlur3Source = blurredBackgroundSource;
        if (Build.VERSION.SDK_INT >= 31) {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(true);
            this.scrollableViewNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressorIndex = -3;
            blurredBackgroundSourceRenderNode.underSource = blurredBackgroundSource;
            this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSource);
        }
        this.iBlur3FactoryBg = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSource);
    }

    public static CharSequence applyNewSpan(String str) {
        return applyNewSpan(str, -1);
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.insets.bottom) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        this.scrollableViewNoiseSuppressor.setupRenderNodes(1, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public static void buyPremium(BaseFragment baseFragment) throws FileNotFoundException {
        buyPremium(baseFragment, "settings");
    }

    private void closeSetting() {
        this.settingsView.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PremiumPreviewFragment.this.contentView.removeView(PremiumPreviewFragment.this.settingsView);
                PremiumPreviewFragment.this.settingsView = null;
                super.onAnimationEnd(animator);
            }
        });
    }

    public static String featureTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case 30:
                return "business_hours";
            case 31:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case 39:
                return "todo";
            case 40:
                return "gifts";
            case 41:
                return "pm_noforwards";
            case 42:
                return "ai_compose";
            case 43:
                return "rich_formatting";
            default:
                return null;
        }
    }

    public static void fillBusinessFeaturesList(ArrayList<PremiumFeatureData> arrayList, int i, boolean z) {
        MessagesController messagesController = MessagesController.getInstance(i);
        if (z) {
            arrayList.add(new PremiumFeatureData(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new PremiumFeatureData(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new PremiumFeatureData(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        } else {
            arrayList.add(new PremiumFeatureData(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new PremiumFeatureData(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new PremiumFeatureData(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new PremiumFeatureData(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new PremiumFeatureData(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new PremiumFeatureData(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new PremiumFeatureData(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new PremiumFeatureData(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i2 = 0;
            while (i2 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(arrayList.get(i2).type, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new PremiumPreviewFragment$$ExternalSyntheticLambda4(messagesController, 0));
    }

    public static void fillPremiumFeaturesList(ArrayList<PremiumFeatureData> arrayList, int i, boolean z) {
        MessagesController messagesController = MessagesController.getInstance(i);
        int i2 = 0;
        int i3 = 1;
        arrayList.add(new PremiumFeatureData(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new PremiumFeatureData(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new PremiumFeatureData(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new PremiumFeatureData(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new PremiumFeatureData(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new PremiumFeatureData(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new PremiumFeatureData(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new PremiumFeatureData(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new PremiumFeatureData(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new PremiumFeatureData(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new PremiumFeatureData(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new PremiumFeatureData(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new PremiumFeatureData(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new PremiumFeatureData(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        int i4 = R.drawable.msg_premium_icons;
        arrayList.add(new PremiumFeatureData(10, i4, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new PremiumFeatureData(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new PremiumFeatureData(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new PremiumFeatureData(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new PremiumFeatureData(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new PremiumFeatureData(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new PremiumFeatureData(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new PremiumFeatureData(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new PremiumFeatureData(39, i4, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new PremiumFeatureData(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new PremiumFeatureData(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new PremiumFeatureData(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i2 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(arrayList.get(i2).type, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new PremiumPreviewFragment$$ExternalSyntheticLambda4(messagesController, i3));
    }

    public static String getPremiumButtonText(int i, SubscriptionTier subscriptionTier) {
        String currency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i2 = R.string.SubscribeToPremium;
        if (subscriptionTier != null) {
            if (!BuildVars.useInvoiceBilling() && subscriptionTier.getOfferDetails() == null) {
                return LocaleController.getString(R.string.Loading);
            }
            boolean zIsPremium = UserConfig.getInstance(i).isPremium();
            boolean z = subscriptionTier.getMonths() > 12 && subscriptionTier.getMonths() % 12 == 0;
            boolean z2 = subscriptionTier.getMonths() == 12;
            String formattedPricePerYear = z2 ? subscriptionTier.getFormattedPricePerYear() : subscriptionTier.getFormattedPricePerMonth();
            if (zIsPremium) {
                i2 = z2 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
            } else if (z2) {
                if (MessagesController.getInstance(i).showAnnualPerMonth) {
                    formattedPricePerYear = subscriptionTier.getFormattedPricePerMonth();
                } else {
                    i2 = R.string.SubscribeToPremiumPerYear;
                    formattedPricePerYear = subscriptionTier.getFormattedPrice();
                }
            } else {
                if (z && !MessagesController.getInstance(i).showAnnualPerMonth) {
                    return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, subscriptionTier.getFormattedPrice(), LocaleController.formatPluralString("Years", subscriptionTier.getMonths() / 12, new Object[0]));
                }
                formattedPricePerYear = subscriptionTier.getFormattedPricePerMonth();
            }
            return LocaleController.formatString(i2, formattedPricePerYear);
        }
        String currency2 = null;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = null;
        currency2 = null;
        currency2 = null;
        if (!BuildVars.useInvoiceBilling()) {
            ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (productDetails != null) {
                ArrayList arrayList = productDetails.zzj;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = ((ProductDetails.SubscriptionOfferDetails) arrayList.get(0)).zzd.mControlCategories;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) obj;
                        if (pricingPhase.zzd.equals("P1M")) {
                            currency2 = pricingPhase.zza;
                        } else if (pricingPhase.zzd.equals("P1Y")) {
                            boolean z3 = MessagesController.getInstance(i).showAnnualPerMonth;
                            String str = pricingPhase.zzc;
                            long j = pricingPhase.zzb;
                            if (!z3) {
                                i2 = R.string.SubscribeToPremiumPerYear;
                                currency2 = BillingController.getInstance().formatCurrency(j, str, 6);
                                break;
                            }
                            currency2 = BillingController.getInstance().formatCurrency(j / 12, str, 6);
                            break;
                        }
                    }
                }
            }
            return currency2 == null ? LocaleController.getString(R.string.Loading) : LocaleController.formatString(i2, currency2);
        }
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i).getPremiumPromo();
        if (premiumPromo == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList3 = premiumPromo.period_options;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList3.get(i4);
            i4++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
            int i5 = tL_premiumSubscriptionOption3.months;
            if (i5 == 12) {
                tL_premiumSubscriptionOption = tL_premiumSubscriptionOption3;
                break;
            }
            if (tL_premiumSubscriptionOption == null && i5 == 1) {
                tL_premiumSubscriptionOption = tL_premiumSubscriptionOption3;
            }
        }
        if (tL_premiumSubscriptionOption == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        if (tL_premiumSubscriptionOption.months != 12) {
            currency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption.amount, tL_premiumSubscriptionOption.currency);
        } else if (MessagesController.getInstance(i).showAnnualPerMonth) {
            currency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption.amount / 12, tL_premiumSubscriptionOption.currency);
        } else {
            i2 = R.string.SubscribeToPremiumPerYear;
            currency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption.amount, tL_premiumSubscriptionOption.currency);
        }
        return LocaleController.formatString(i2, currency);
    }

    public static void lambda$buyPremium$10(int i, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        AlertsCreator.processError(i, tL_error, baseFragment, tL_payments_assignPlayMarketTransaction, new Object[0]);
    }

    public static void lambda$buyPremium$11(int i, Runnable runnable, BaseFragment baseFragment, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(runnable);
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(i, tL_error, baseFragment, tL_payments_assignPlayMarketTransaction));
        }
    }

    public static void lambda$buyPremium$12(Runnable runnable, BillingResult billingResult) {
        if (billingResult.zza == 0) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public static void lambda$buyPremium$13(TLObject tLObject, BaseFragment baseFragment, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, SubscriptionTier subscriptionTier, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, int i, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            AlertsCreator.processError(i, tL_error, baseFragment, tL_payments_canPurchaseStore, new Object[0]);
            return;
        }
        Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : AndroidUtilities.getActivity();
        BillingController billingController = BillingController.getInstance();
        AccountInstance accountInstance = baseFragment.getAccountInstance();
        zzcl zzclVar = new zzcl(11, false);
        zzclVar.setProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
        String str = subscriptionTier.getOfferDetails().zzc;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("offerToken can not be empty");
        }
        zzclVar.zzc = str;
        billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(zzclVar.build()), billingFlowParams$SubscriptionUpdateParams, false);
    }

    public static void lambda$buyPremium$14(BaseFragment baseFragment, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, SubscriptionTier subscriptionTier, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, int i, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ExternalActionActivity$$ExternalSyntheticLambda3(tLObject, baseFragment, tL_inputStorePaymentPremiumSubscription, subscriptionTier, billingFlowParams$SubscriptionUpdateParams, i, tL_error, tL_payments_canPurchaseStore));
    }

    public static void lambda$buyPremium$15(BillingResult billingResult, BaseFragment baseFragment, boolean z, List list, int i, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, SubscriptionTier subscriptionTier) {
        if (billingResult.zza == 0) {
            PollItemMenu$$ExternalSyntheticLambda0 pollItemMenu$$ExternalSyntheticLambda0 = new PollItemMenu$$ExternalSyntheticLambda0(baseFragment, z, 9);
            if (list != null && !list.isEmpty() && !UserConfig.getInstance(i).isPremium()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    if (purchase.getProducts().contains("telegram_premium")) {
                        TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                        tL_dataJSON.data = purchase.zza;
                        TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                        tL_inputStorePaymentPremiumSubscription.restore = true;
                        if (billingFlowParams$SubscriptionUpdateParams != null) {
                            tL_inputStorePaymentPremiumSubscription.upgrade = true;
                        }
                        tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                        ConnectionsManager.getInstance(i).sendRequest(tL_payments_assignPlayMarketTransaction, new ArticleViewer$$ExternalSyntheticLambda39(i, pollItemMenu$$ExternalSyntheticLambda0, baseFragment, tL_payments_assignPlayMarketTransaction), 66);
                        return;
                    }
                }
            }
            BillingController.getInstance().addResultListener("telegram_premium", new ChatActivity$$ExternalSyntheticLambda353(pollItemMenu$$ExternalSyntheticLambda0, 4));
            TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
            if (billingFlowParams$SubscriptionUpdateParams != null) {
                tL_inputStorePaymentPremiumSubscription2.upgrade = true;
            }
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_canPurchaseStore, new ArticleViewer$$ExternalSyntheticLambda33(baseFragment, tL_inputStorePaymentPremiumSubscription2, subscriptionTier, billingFlowParams$SubscriptionUpdateParams, i, tL_payments_canPurchaseStore));
        }
    }

    public static void lambda$buyPremium$16(BaseFragment baseFragment, boolean z, int i, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, SubscriptionTier subscriptionTier, BillingResult billingResult, List list) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda25(billingResult, baseFragment, z, list, i, billingFlowParams$SubscriptionUpdateParams, subscriptionTier));
    }

    public static void lambda$buyPremium$9(BaseFragment baseFragment, boolean z) {
        if (baseFragment instanceof PremiumPreviewFragment) {
            PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) baseFragment;
            if (z) {
                premiumPreviewFragment.setForcePremium();
            }
            premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
            premiumPreviewFragment.listView.smoothScrollToPosition(0);
        } else {
            PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(null);
            if (z) {
                premiumPreviewFragment2.setForcePremium();
            }
            if (baseFragment != null) {
                baseFragment.presentFragment(premiumPreviewFragment2);
            } else {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(premiumPreviewFragment2);
                }
            }
        }
        if (baseFragment == null || !(baseFragment.getParentActivity() instanceof LaunchActivity)) {
            return;
        }
        try {
            baseFragment.getFragmentView().performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ((LaunchActivity) baseFragment.getParentActivity()).getFireworksOverlay().start();
    }

    public void lambda$createView$0(Canvas canvas, RectF rectF) {
        RecyclerListView recyclerListView = this.listView;
        Blur3Utils.captureRelativeParent(recyclerListView, canvas, rectF, recyclerListView, this.contentView, 255);
    }

    public void lambda$createView$1() {
        this.listView.postOnAnimation(new PremiumPreviewFragment$$ExternalSyntheticLambda13(this, 0));
    }

    public void lambda$createView$2(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                return;
            }
            UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(this), R.string.UnknownError);
        }
    }

    public void lambda$createView$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((NotificationCenter.NotificationCenterDelegate) this, (Object) tL_error, tLObject, 27));
    }

    public void lambda$createView$4(PremiumFeatureCell premiumFeatureCell, Long l, Integer num) {
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        if (l == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l.longValue();
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
            }
            tL_emojiStatusEmpty = tL_emojiStatus;
        }
        getMessagesController().updateEmojiStatus(tL_emojiStatusEmpty);
        premiumFeatureCell.setEmoji(l == null ? 0L : l.longValue(), true);
    }

    public void lambda$createView$5(View view, int i) {
        if (getUserConfig().isClientActivated()) {
            if (i == this.showAdsRow) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                if (userFull != null) {
                    TextCell textCell = (TextCell) view;
                    textCell.setChecked(!textCell.isChecked());
                    userFull.sponsored_enabled = textCell.isChecked();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                    getConnectionsManager().sendRequest(togglesponsoredmessages, new LinkManager$$ExternalSyntheticLambda10(this, 18));
                    getMessagesStorage().updateUserInfo(userFull, false);
                }
            } else if (view instanceof PremiumFeatureCell) {
                PremiumFeatureCell premiumFeatureCell = (PremiumFeatureCell) view;
                SubscriptionTier subscriptionTier = null;
                if (this.type != 1 || !getUserConfig().isPremium()) {
                    sentShowFeaturePreview(this.currentAccount, premiumFeatureCell.data.type);
                    int i2 = this.selectedTierIndex;
                    if (i2 >= 0 && i2 < this.subscriptionTiers.size()) {
                        subscriptionTier = this.subscriptionTiers.get(this.selectedTierIndex);
                    }
                    showDialog(new PremiumFeatureBottomSheet(this, getContext(), this.currentAccount, this.type == 1, premiumFeatureCell.data.type, false, subscriptionTier));
                    return;
                }
                int i3 = premiumFeatureCell.data.type;
                if (i3 == 29) {
                    presentFragment(new org.telegram.ui.Business.LocationActivity());
                    return;
                }
                if (i3 == 32) {
                    presentFragment(new GreetMessagesActivity());
                    return;
                }
                if (i3 == 33) {
                    AwayMessagesActivity awayMessagesActivity = new AwayMessagesActivity(null);
                    awayMessagesActivity.shiftDp = -4;
                    presentFragment(awayMessagesActivity);
                    return;
                }
                if (i3 == 30) {
                    presentFragment(new OpeningHoursActivity());
                    return;
                }
                if (i3 == 34) {
                    presentFragment(new ChatbotsActivity());
                    return;
                }
                if (i3 == 31) {
                    presentFragment(new QuickRepliesActivity());
                    return;
                }
                if (i3 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                    bundle.putInt("type", 1);
                    presentFragment(new MediaActivity(bundle, null));
                    return;
                }
                if (i3 == 12) {
                    showSelectStatusDialog(premiumFeatureCell, UserObject.getEmojiStatusDocumentId(getUserConfig().getCurrentUser()), new OAuthSheet$$ExternalSyntheticLambda19(11, this, premiumFeatureCell));
                    return;
                }
                if (i3 == 35) {
                    presentFragment(new FiltersSetupActivity().highlightTags());
                } else if (i3 == 36) {
                    presentFragment(new BusinessIntroActivity());
                } else if (i3 == 37) {
                    presentFragment(new BusinessLinksActivity());
                }
            }
        }
    }

    public void lambda$createView$6() {
        getMediaDataController().loadPremiumPromo(false);
    }

    public static int lambda$fillBusinessFeaturesList$8(MessagesController messagesController, PremiumFeatureData premiumFeatureData, PremiumFeatureData premiumFeatureData2) {
        return messagesController.businessFeaturesTypesToPosition.get(premiumFeatureData.type, Integer.MAX_VALUE) - messagesController.businessFeaturesTypesToPosition.get(premiumFeatureData2.type, Integer.MAX_VALUE);
    }

    public static int lambda$fillPremiumFeaturesList$7(MessagesController messagesController, PremiumFeatureData premiumFeatureData, PremiumFeatureData premiumFeatureData2) {
        return messagesController.premiumFeaturesTypesToPosition.get(premiumFeatureData.type, Integer.MAX_VALUE) - messagesController.premiumFeaturesTypesToPosition.get(premiumFeatureData2.type, Integer.MAX_VALUE);
    }

    public static void lambda$sentPremiumButtonClick$21(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$sentPremiumBuyCanceled$22(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$sentShowFeaturePreview$23(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$sentShowScreenStat$20(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$updateButtonText$17(View view) throws FileNotFoundException {
        buyPremium(this);
    }

    public static void lambda$updateButtonText$18(View view) {
    }

    public void lambda$updateButtonText$19(View view) throws FileNotFoundException {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        SubscriptionTier subscriptionTier = this.subscriptionTiers.get(this.selectedTierIndex);
        SubscriptionTier subscriptionTier2 = this.currentSubscriptionTier;
        BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams = null;
        if (subscriptionTier2 != null && (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) != null && tL_premiumSubscriptionOption.transaction != null) {
            String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
            boolean z = (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) ? false : true;
            boolean zIsEmpty = TextUtils.isEmpty(null);
            if (z && !zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!z && zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            billingFlowParams$SubscriptionUpdateParams = new BillingFlowParams$SubscriptionUpdateParams();
            billingFlowParams$SubscriptionUpdateParams.zza = lastPremiumToken;
            billingFlowParams$SubscriptionUpdateParams.zzc = 5;
        }
        buyPremium(this, subscriptionTier, "settings", true, billingFlowParams$SubscriptionUpdateParams);
    }

    public void measureGradient(int i, int i2) {
        int measuredHeight = 0;
        for (int i3 = 0; i3 < this.premiumFeatures.size(); i3++) {
            this.dummyCell.setData(this.premiumFeatures.get(i3), false);
            this.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.premiumFeatures.get(i3).yOffset = measuredHeight;
            measuredHeight += this.dummyCell.getMeasuredHeight();
        }
        for (int i4 = 0; i4 < this.morePremiumFeatures.size(); i4++) {
            this.dummyCell.setData(this.morePremiumFeatures.get(i4), false);
            this.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.morePremiumFeatures.get(i4).yOffset = measuredHeight;
            measuredHeight += this.dummyCell.getMeasuredHeight();
        }
        this.totalGradientHeight = measuredHeight;
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        this.insets = defaultWindowInsets;
        this.listView.setPadding(0, defaultWindowInsets.top, 0, AndroidUtilities.dp(48.0f) + this.insets.bottom);
        RecyclerListView recyclerListView = this.listView;
        Insets insets = this.insets;
        AndroidUtilities.setViewLayoutMargins(recyclerListView, insets.left, 0, insets.right, 0);
        BackgroundView backgroundView = this.backgroundView;
        Insets insets2 = this.insets;
        backgroundView.setPadding(insets2.left, 0, insets2.right, 0);
        FrameLayout frameLayout = this.buttonContainer;
        if (frameLayout != null) {
            int i = this.insets.left;
            int iDp = AndroidUtilities.dp(14.0f);
            Insets insets3 = this.insets;
            frameLayout.setPadding(i, iDp, insets3.right, insets3.bottom);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public static void sentPremiumButtonClick() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda3(19));
    }

    public static void sentPremiumBuyCanceled() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_fail";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda3(18));
    }

    public static void sentShowFeaturePreview(int i, int i2) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String strFeatureTypeToServerString = featureTypeToServerString(i2);
        if (strFeatureTypeToServerString != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = strFeatureTypeToServerString;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda3(16));
    }

    private void sentShowScreenStat() {
        String str = this.source;
        if (str == null) {
            return;
        }
        sentShowScreenStat(str);
        this.source = null;
    }

    public static int serverStringToFeatureType(String str) {
        int i;
        byte b;
        str.getClass();
        switch (str.hashCode()) {
            case -2145993328:
                i = 20;
                if (!str.equals("animated_userpics")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -2080028929:
                i = 20;
                if (!str.equals("infinite_reactions")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -2022719725:
                i = 20;
                if (!str.equals("stories__caption")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1975141450:
                i = 20;
                if (!str.equals("away_message")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1953490480:
                i = 20;
                if (!str.equals("business_hours")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1952597715:
                i = 20;
                if (!str.equals("business_intro")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1949982086:
                i = 20;
                if (!str.equals("business_links")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1924078036:
                i = 20;
                if (!str.equals("stories__quality")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -1919626711:
                i = 20;
                if (!str.equals("stories__save_stories_to_gallery")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1884266413:
                i = 20;
                if (!str.equals("stories")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1833928446:
                i = 20;
                if (!str.equals("effects")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1777612460:
                i = 20;
                if (!str.equals("business_location")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1761847571:
                i = 20;
                if (!str.equals("peer_colors")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -1755514268:
                i = 20;
                if (!str.equals("voice_to_text")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case -1529105743:
                i = 20;
                if (!str.equals("wallpapers")) {
                    b = -1;
                } else {
                    b = 14;
                }
                break;
            case -1516580016:
                i = 20;
                if (!str.equals("message_privacy")) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case -1425144150:
                i = 20;
                if (!str.equals("animated_emoji")) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case -1225497630:
                i = 20;
                if (!str.equals("translations")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case -1146830912:
                i = 20;
                if (!str.equals("business")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case -1040323278:
                i = 20;
                if (!str.equals("no_ads")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1023650261:
                i = 20;
                if (!str.equals("more_upload")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case -969043445:
                i = 20;
                if (!str.equals("emoji_status")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case -730864243:
                i = 20;
                if (!str.equals("profile_badge")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case -448825858:
                i = 20;
                if (!str.equals("faster_download")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case -294265343:
                i = 20;
                if (!str.equals("greeting_message")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case -165039170:
                i = 20;
                if (!str.equals("premium_stickers")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case -96210874:
                i = 20;
                if (!str.equals("double_limits")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 3565638:
                i = 20;
                if (!str.equals("todo")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 98352451:
                i = 20;
                if (!str.equals("gifts")) {
                    b = -1;
                } else {
                    b = 28;
                }
                break;
            case 110781770:
                i = 20;
                if (!str.equals("folder_tags")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 234735554:
                i = 20;
                if (!str.equals("stories__expiration_durations")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 388416338:
                i = 20;
                if (!str.equals("stories__stealth_mode")) {
                    b = -1;
                } else {
                    b = 31;
                }
                break;
            case 480338102:
                i = 20;
                if (!str.equals("quick_replies")) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case 622623867:
                i = 20;
                if (!str.equals("ai_compose")) {
                    b = -1;
                } else {
                    b = 33;
                }
                break;
            case 629542059:
                i = 20;
                if (!str.equals("business_bots")) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            case 705083174:
                i = 20;
                if (!str.equals("stories__priority_order")) {
                    b = -1;
                } else {
                    b = 35;
                }
                break;
            case 1054743185:
                i = 20;
                if (!str.equals("pm_noforwards")) {
                    b = -1;
                } else {
                    b = 36;
                }
                break;
            case 1080006662:
                i = 20;
                if (!str.equals("stories__links_and_formatting")) {
                    b = -1;
                } else {
                    b = 37;
                }
                break;
            case 1219849581:
                i = 20;
                if (!str.equals("advanced_chat_management")) {
                    b = -1;
                } else {
                    b = 38;
                }
                break;
            case 1438966047:
                i = 20;
                if (!str.equals("stories__permanent_views_history")) {
                    b = -1;
                } else {
                    b = 39;
                }
                break;
            case 1488814760:
                i = 20;
                if (!str.equals("rich_formatting")) {
                    b = -1;
                } else {
                    b = 40;
                }
                break;
            case 1537309393:
                i = 20;
                if (!str.equals("saved_tags")) {
                    b = -1;
                } else {
                    b = 41;
                }
                break;
            case 1832801148:
                i = 20;
                if (!str.equals("app_icons")) {
                    b = -1;
                } else {
                    b = 42;
                }
                break;
            case 2013274756:
                i = 20;
                if (!str.equals("last_seen")) {
                    b = -1;
                } else {
                    b = 43;
                }
                break;
            default:
                b = -1;
                i = 20;
                break;
        }
        switch (b) {
            case 0:
                return 7;
            case 1:
                return 4;
            case 2:
                return 21;
            case 3:
                return 33;
            case 4:
                return 30;
            case 5:
                return 36;
            case 6:
                return 37;
            case 7:
                return 25;
            case 8:
                return 18;
            case 9:
                return 14;
            case 10:
                return 38;
            case 11:
                return 29;
            case 12:
                return 23;
            case 13:
                return 8;
            case 14:
                return 22;
            case 15:
                return 27;
            case 16:
                return 11;
            case 17:
                return 13;
            case 18:
                return 28;
            case 19:
                return 3;
            case 20:
                return 1;
            case 21:
                return 12;
            case 22:
                return 6;
            case 23:
                return 2;
            case 24:
                return 32;
            case 25:
                return 5;
            case 26:
                return 0;
            case 27:
                return 39;
            case 28:
                return 40;
            case 29:
                return 35;
            case 30:
                return 17;
            case 31:
                return 15;
            case 32:
                return 31;
            case 33:
                return 42;
            case 34:
                return 34;
            case 35:
                return i;
            case 36:
                return 41;
            case 37:
                return 19;
            case 38:
                return 9;
            case 39:
                return 16;
            case 40:
                return 43;
            case 41:
                return 24;
            case 42:
                return 10;
            case 43:
                return 26;
            default:
                return -1;
        }
    }

    public void updateBackgroundImage() {
        BackgroundView backgroundView;
        if (this.contentView.getMeasuredWidth() == 0 || this.contentView.getMeasuredHeight() == 0 || (backgroundView = this.backgroundView) == null || backgroundView.imageView == null) {
            return;
        }
        if (this.whiteBackground) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawColor(ColorUtils.blendARGB(0.5f, getThemedColor(Theme.key_premiumGradient2), getThemedColor(Theme.key_dialogBackground)));
            this.backgroundView.imageView.setBackgroundBitmap(bitmapCreateBitmap);
        } else {
            this.gradientTools.gradientMatrix(0, 0, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), 0.0f, 0.0f);
            this.gradientCanvas.save();
            this.gradientCanvas.scale(100.0f / this.contentView.getMeasuredWidth(), 100.0f / this.contentView.getMeasuredHeight());
            this.gradientCanvas.drawRect(0.0f, 0.0f, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), this.gradientTools.paint);
            this.gradientCanvas.restore();
            this.backgroundView.imageView.setBackgroundBitmap(this.gradientTextureBitmap);
        }
    }

    public void updateButtonText(boolean z) {
        if (this.premiumButtonView == null) {
            return;
        }
        if (!getUserConfig().isPremium() || this.currentSubscriptionTier == null || this.selectedTierIndex >= this.subscriptionTiers.size() || this.subscriptionTiers.get(this.selectedTierIndex).getMonths() >= this.currentSubscriptionTier.getMonths()) {
            if (LocaleController.isRTL) {
                z = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.selectedTierIndex < this.subscriptionTiers.size()) {
                this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, this.subscriptionTiers.get(this.selectedTierIndex)), null, z);
                final int i = 0;
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener(this) {
                    public final PremiumPreviewFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws FileNotFoundException {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$updateButtonText$17(view);
                                break;
                            default:
                                this.f$0.lambda$updateButtonText$19(view);
                                break;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || this.subscriptionTiers.isEmpty() || this.selectedTierIndex >= this.subscriptionTiers.size() || this.subscriptionTiers.get(this.selectedTierIndex).googlePlayProductDetails == null)) {
                this.premiumButtonView.setButton(LocaleController.getString(R.string.Loading), null, z);
                this.buttonContainerInternal.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda464(5));
                this.premiumButtonView.setFlickerDisabled(true);
            } else {
                if (this.subscriptionTiers.isEmpty() || this.selectedTierIndex >= this.subscriptionTiers.size()) {
                    return;
                }
                this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, this.subscriptionTiers.get(this.selectedTierIndex)), null, z);
                final int i2 = 1;
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener(this) {
                    public final PremiumPreviewFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) throws FileNotFoundException {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$updateButtonText$17(view);
                                break;
                            default:
                                this.f$0.lambda$updateButtonText$19(view);
                                break;
                        }
                    }
                });
                this.premiumButtonView.setFlickerDisabled(false);
            }
        }
    }

    public void updateColors() {
        ActionBar actionBar;
        if (this.backgroundView == null || (actionBar = this.actionBar) == null) {
            return;
        }
        actionBar.setItemsColor(Theme.getColor(null, this.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay, false), true);
        this.actionBar.setItemsColor(Theme.getColor(null, this.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay, false), false);
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_premiumGradientBackgroundOverlay;
        actionBar2.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 60), false);
        this.particlesView.drawable.updateColors();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null) {
            backgroundView.titleView.setTextColor(Theme.getColor(null, this.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : i, false));
            TextView textView = this.backgroundView.subtitleView;
            if (this.whiteBackground) {
                i = Theme.key_windowBackgroundWhiteBlackText;
            }
            textView.setTextColor(Theme.getColor(null, i, false));
            if (this.backgroundView.imageView != null && this.backgroundView.imageView.mRenderer != null) {
                if (this.whiteBackground) {
                    this.backgroundView.imageView.mRenderer.colorKey1 = Theme.key_premiumCoinGradient1;
                    this.backgroundView.imageView.mRenderer.colorKey2 = Theme.key_premiumCoinGradient2;
                }
                this.backgroundView.imageView.mRenderer.updateColors();
            }
        }
        updateBackgroundImage();
    }

    private void updateDialogVisibility(boolean z) {
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            BackgroundView backgroundView = this.backgroundView;
            if (backgroundView != null && backgroundView.imageView != null) {
                this.backgroundView.imageView.setDialogVisible(z);
            }
            this.particlesView.setPaused(z);
            this.contentView.invalidate();
        }
    }

    private void updateRows() {
        SubscriptionTier subscriptionTier;
        this.sectionRow = -1;
        this.privacyRow = -1;
        this.moreHeaderRow = -1;
        this.moreFeaturesStartRow = -1;
        this.moreFeaturesEndRow = -1;
        this.showAdsHeaderRow = -1;
        this.showAdsRow = -1;
        this.showAdsInfoRow = -1;
        boolean z = true;
        this.rowCount = 1;
        this.paddingRow = 0;
        this.featuresStartRow = 1;
        int size = this.premiumFeatures.size() + 1;
        this.rowCount = size;
        this.featuresEndRow = size;
        if (this.type == 1 && getUserConfig().isPremium()) {
            int i = this.rowCount;
            int i2 = i + 1;
            this.sectionRow = i;
            int i3 = i + 2;
            this.rowCount = i3;
            this.moreHeaderRow = i2;
            this.moreFeaturesStartRow = i3;
            int size2 = this.morePremiumFeatures.size() + i3;
            this.rowCount = size2;
            this.moreFeaturesEndRow = size2;
        }
        int i4 = this.rowCount;
        this.statusRow = i4;
        this.rowCount = i4 + 2;
        this.lastPaddingRow = i4 + 1;
        if (this.type == 1 && getUserConfig().isPremium()) {
            int i5 = this.rowCount;
            this.showAdsHeaderRow = i5;
            this.showAdsRow = i5 + 1;
            this.rowCount = i5 + 3;
            this.showAdsInfoRow = i5 + 2;
        }
        FrameLayout frameLayout = this.buttonContainer;
        if (getUserConfig().isPremium() && ((subscriptionTier = this.currentSubscriptionTier) == null || subscriptionTier.getMonths() >= this.subscriptionTiers.get(this.selectedTierIndex).getMonths() || this.forcePremium)) {
            z = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, false);
        int iDp = this.buttonContainer.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        this.layoutManager.setAdditionalHeight((this.statusBarHeight + iDp) - AndroidUtilities.dp(16.0f));
        this.layoutManager.setMinimumLastViewHeight(iDp);
    }

    @Override
    public boolean canBeginSlide() {
        BackgroundView backgroundView = this.backgroundView;
        return backgroundView == null || backgroundView.imageView == null || !this.backgroundView.imageView.touched;
    }

    @Override
    public View createView(Context context) {
        int i = 28;
        int i2 = 2;
        int i3 = 0;
        this.iBlur3Capture = new PremiumPreviewFragment$$ExternalSyntheticLambda14(this, i3);
        int i4 = 1;
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        this.strokeShader = linearGradient;
        this.strokePaint.setShader(linearGradient);
        this.strokePaint.setStyle(Paint.Style.STROKE);
        int color = Theme.getColor(null, Theme.key_premiumGradient4, false);
        int color2 = Theme.getColor(null, Theme.key_premiumGradient3, false);
        int i5 = Theme.key_premiumGradient2;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{color, color2, Theme.getColor(null, i5, false), Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient0, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.shader = linearGradient2;
        linearGradient2.setLocalMatrix(this.matrix);
        this.gradientPaint.setShader(this.shader);
        this.dummyCell = new PremiumFeatureCell(context);
        this.dummyTierCell = new PremiumTierCell(context);
        this.premiumFeatures.clear();
        this.morePremiumFeatures.clear();
        if (this.type == 0) {
            fillPremiumFeaturesList(this.premiumFeatures, this.currentAccount, false);
        } else {
            fillBusinessFeaturesList(this.premiumFeatures, this.currentAccount, false);
            fillBusinessFeaturesList(this.morePremiumFeatures, this.currentAccount, true);
            QuickRepliesController.getInstance(this.currentAccount).load(true, null);
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                BusinessChatbotController.getInstance(this.currentAccount).load(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.currentAccount);
                if (!businessLinksController.loaded) {
                    businessLinksController.load(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.contentView = new FrameLayout(context) {
            private final Paint backgroundPaint = new Paint(1);
            boolean iconInterceptedTouch;
            int lastSize;
            boolean listInterceptedTouch;

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                if (Build.VERSION.SDK_INT >= 31 && PremiumPreviewFragment.this.scrollableViewNoiseSuppressor != null) {
                    PremiumPreviewFragment.this.blur3_InvalidateBlur();
                }
                if (!PremiumPreviewFragment.this.isDialogVisible) {
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.inc) {
                        float f = premiumPreviewFragment.progress + 0.016f;
                        premiumPreviewFragment.progress = f;
                        if (f > 3.0f) {
                            premiumPreviewFragment.inc = false;
                        }
                    } else {
                        float f2 = premiumPreviewFragment.progress - 0.016f;
                        premiumPreviewFragment.progress = f2;
                        if (f2 < 1.0f) {
                            premiumPreviewFragment.inc = true;
                        }
                    }
                }
                View viewFindViewByPosition = PremiumPreviewFragment.this.listView.getLayoutManager() != null ? PremiumPreviewFragment.this.listView.getLayoutManager().findViewByPosition(0) : null;
                PremiumPreviewFragment.this.currentYOffset = viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getBottom();
                int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom();
                PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                premiumPreviewFragment2.totalProgress = 1.0f - ((premiumPreviewFragment2.currentYOffset - iDp) / (PremiumPreviewFragment.this.firstViewHeight - iDp));
                PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
                premiumPreviewFragment3.totalProgress = Utilities.clamp(premiumPreviewFragment3.totalProgress, 1.0f, 0.0f);
                int iDp2 = AndroidUtilities.dp(16.0f) + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom();
                if (PremiumPreviewFragment.this.currentYOffset < iDp2) {
                    PremiumPreviewFragment.this.currentYOffset = iDp2;
                }
                PremiumPreviewFragment premiumPreviewFragment4 = PremiumPreviewFragment.this;
                float f3 = premiumPreviewFragment4.progressToFull;
                premiumPreviewFragment4.progressToFull = 0.0f;
                if (premiumPreviewFragment4.currentYOffset < AndroidUtilities.dp(30.0f) + iDp2) {
                    PremiumPreviewFragment.this.progressToFull = ((AndroidUtilities.dp(30.0f) + iDp2) - PremiumPreviewFragment.this.currentYOffset) / AndroidUtilities.dp(30.0f);
                }
                PremiumPreviewFragment premiumPreviewFragment5 = PremiumPreviewFragment.this;
                if (premiumPreviewFragment5.isLandscapeMode) {
                    premiumPreviewFragment5.progressToFull = 1.0f;
                    premiumPreviewFragment5.totalProgress = 1.0f;
                }
                if (f3 != premiumPreviewFragment5.progressToFull) {
                    premiumPreviewFragment5.listView.invalidate();
                }
                float fMax = Math.max((((((((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight() - PremiumPreviewFragment.this.statusBarHeight) - PremiumPreviewFragment.this.backgroundView.titleView.getMeasuredHeight()) / 2.0f) + PremiumPreviewFragment.this.statusBarHeight) - PremiumPreviewFragment.this.backgroundView.getTop()) - PremiumPreviewFragment.this.backgroundView.titleView.getTop(), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(PremiumPreviewFragment.this.backgroundView.tierListView.getVisibility() == 0 ? 24.0f : 16.0f) + (PremiumPreviewFragment.this.currentYOffset - ((PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight()) - PremiumPreviewFragment.this.statusBarHeight)));
                float fDp = ((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f);
                PremiumPreviewFragment.this.backgroundView.setTranslationY(fMax);
                PremiumPreviewFragment.this.backgroundView.imageView.setTranslationY(fDp + AndroidUtilities.dp(PremiumPreviewFragment.this.type == 1 ? 9.0f : 16.0f));
                PremiumPreviewFragment premiumPreviewFragment6 = PremiumPreviewFragment.this;
                float f4 = premiumPreviewFragment6.totalProgress;
                float fM = DiffUtil.m(1.0f, f4, 0.4f, 0.6f);
                float f5 = 1.0f - (f4 > 0.5f ? (f4 - 0.5f) / 0.5f : 0.0f);
                premiumPreviewFragment6.backgroundView.imageView.setScaleX(fM);
                PremiumPreviewFragment.this.backgroundView.imageView.setScaleY(fM);
                PremiumPreviewFragment.this.backgroundView.imageView.setAlpha(f5);
                PremiumPreviewFragment.this.backgroundView.subtitleView.setAlpha(f5);
                PremiumPreviewFragment.this.backgroundView.tierListView.setAlpha(f5);
                PremiumPreviewFragment premiumPreviewFragment7 = PremiumPreviewFragment.this;
                premiumPreviewFragment7.particlesView.setAlpha(1.0f - premiumPreviewFragment7.totalProgress);
                StarParticlesView starParticlesView = PremiumPreviewFragment.this.particlesView;
                starParticlesView.setTranslationY(PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getY() + PremiumPreviewFragment.this.backgroundView.getY() + ((-(starParticlesView.getMeasuredHeight() - PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth())) / 2.0f));
                float fDp2 = AndroidUtilities.dp(72.0f) - PremiumPreviewFragment.this.backgroundView.titleView.getLeft();
                PremiumPreviewFragment premiumPreviewFragment8 = PremiumPreviewFragment.this;
                float f6 = premiumPreviewFragment8.totalProgress;
                premiumPreviewFragment8.backgroundView.titleView.setTranslationX((1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (f6 > 0.3f ? (f6 - 0.3f) / 0.7f : 0.0f))) * fDp2);
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartX = (((getMeasuredWidth() * 0.1f) * PremiumPreviewFragment.this.progress) + (PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getX() + PremiumPreviewFragment.this.backgroundView.getX())) / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartY = (PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getY() + PremiumPreviewFragment.this.backgroundView.getY()) / getMeasuredHeight();
                if (!PremiumPreviewFragment.this.isDialogVisible) {
                    invalidate();
                    PremiumPreviewFragment.this.buttonContainerInternal.invalidate();
                    PremiumPreviewFragment.this.buttonContainer.invalidate();
                }
                PremiumPreviewFragment.this.gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), (-getMeasuredWidth()) * 0.1f * PremiumPreviewFragment.this.progress, 0.0f);
                if (PremiumPreviewFragment.this.whiteBackground) {
                    Paint paint = this.backgroundPaint;
                    PremiumPreviewFragment premiumPreviewFragment9 = PremiumPreviewFragment.this;
                    int i6 = Theme.key_windowBackgroundGray;
                    paint.setColor(premiumPreviewFragment9.getThemedColor(i6));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
                    PremiumPreviewFragment premiumPreviewFragment10 = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment10.progressToFull <= 0.0f || ((BaseFragment) premiumPreviewFragment10).actionBar == null) {
                        canvas2 = canvas;
                    } else {
                        this.backgroundPaint.setColor(ColorUtils.blendARGB(PremiumPreviewFragment.this.progressToFull, PremiumPreviewFragment.this.getThemedColor(i6), PremiumPreviewFragment.this.getThemedColor(Theme.key_windowBackgroundWhite)));
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) PremiumPreviewFragment.this).actionBar.getHeight(), this.backgroundPaint);
                    }
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), PremiumPreviewFragment.this.gradientTools.paint);
                }
                super.dispatchDraw(canvas);
                if (PremiumPreviewFragment.this.buttonContainer.getVisibility() != 0) {
                    PremiumPreviewFragment.this.navbarProtectionDrawable.setFadeHeight(PremiumPreviewFragment.this.insets.bottom, false);
                    PremiumPreviewFragment.this.navbarProtectionDrawable.setBounds(0, getHeight() - PremiumPreviewFragment.this.insets.bottom, getWidth(), getHeight());
                    PremiumPreviewFragment.this.navbarProtectionDrawable.draw(canvas2);
                }
                if (((BaseFragment) PremiumPreviewFragment.this).parentLayout == null || !PremiumPreviewFragment.this.whiteBackground) {
                    return;
                }
                INavigationLayout iNavigationLayout = ((BaseFragment) PremiumPreviewFragment.this).parentLayout;
                PremiumPreviewFragment premiumPreviewFragment11 = PremiumPreviewFragment.this;
                ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas2, (int) (premiumPreviewFragment11.progressToFull * 255.0f), ((BaseFragment) premiumPreviewFragment11).actionBar.getBottom());
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                float x = PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getX() + PremiumPreviewFragment.this.backgroundView.getX();
                float y = PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getY() + PremiumPreviewFragment.this.backgroundView.getY();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(x, y, (PremiumPreviewFragment.this.backgroundView.imageView == null ? 0 : PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth()) + x, (PremiumPreviewFragment.this.backgroundView.imageView == null ? 0 : PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredHeight()) + y);
                if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.iconInterceptedTouch) && !PremiumPreviewFragment.this.listView.scrollingByUser) {
                    motionEvent.offsetLocation(-x, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.iconInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.iconInterceptedTouch = false;
                    }
                    PremiumPreviewFragment.this.backgroundView.imageView.dispatchTouchEvent(motionEvent);
                    return true;
                }
                float x2 = PremiumPreviewFragment.this.backgroundView.tierListView.getX() + PremiumPreviewFragment.this.backgroundView.getX();
                float y2 = PremiumPreviewFragment.this.backgroundView.tierListView.getY() + PremiumPreviewFragment.this.backgroundView.getY();
                rectF.set(x2, y2, PremiumPreviewFragment.this.backgroundView.tierListView.getWidth() + x2, PremiumPreviewFragment.this.backgroundView.tierListView.getHeight() + y2);
                if (PremiumPreviewFragment.this.progressToFull < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.listInterceptedTouch) && !PremiumPreviewFragment.this.listView.scrollingByUser)) {
                    motionEvent.offsetLocation(-x2, -y2);
                    if (motionEvent.getAction() == 0) {
                        this.listInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.listInterceptedTouch = false;
                    }
                    PremiumPreviewFragment.this.backgroundView.tierListView.dispatchTouchEvent(motionEvent);
                    if (this.listInterceptedTouch) {
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z, int i6, int i7, int i8, int i9) {
                super.onLayout(z, i6, i7, i8, i9);
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientScaleX = PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth() / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientScaleY = PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredHeight() / getMeasuredHeight();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartX = (PremiumPreviewFragment.this.backgroundView.imageView.getX() + PremiumPreviewFragment.this.backgroundView.getX()) / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartY = (PremiumPreviewFragment.this.backgroundView.imageView.getY() + PremiumPreviewFragment.this.backgroundView.getY()) / getMeasuredHeight();
            }

            @Override
            public void onMeasure(int i6, int i7) {
                int iDp = 0;
                PremiumPreviewFragment.this.isLandscapeMode = View.MeasureSpec.getSize(i6) > View.MeasureSpec.getSize(i7);
                PremiumPreviewFragment.this.statusBarHeight = AndroidUtilities.statusBarHeight;
                PremiumPreviewFragment.this.backgroundView.measure(i6, View.MeasureSpec.makeMeasureSpec(0, 0));
                PremiumPreviewFragment.this.particlesView.getLayoutParams().height = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight();
                if (PremiumPreviewFragment.this.buttonContainer != null && PremiumPreviewFragment.this.buttonContainer.getVisibility() != 8) {
                    iDp = AndroidUtilities.dp(68.0f);
                }
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.layoutManager.setAdditionalHeight((premiumPreviewFragment.statusBarHeight + iDp) - AndroidUtilities.dp(16.0f));
                PremiumPreviewFragment.this.layoutManager.setMinimumLastViewHeight(iDp);
                super.onMeasure(i6, i7);
                if (this.lastSize != ((getMeasuredWidth() + getMeasuredHeight()) << 16)) {
                    PremiumPreviewFragment.this.updateBackgroundImage();
                }
            }

            @Override
            public void onSizeChanged(int i6, int i7, int i8, int i9) {
                super.onSizeChanged(i6, i7, i8, i9);
                PremiumPreviewFragment.this.measureGradient(i6, i7);
            }
        };
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.iBlur3Factory;
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        FrameLayout frameLayout = this.contentView;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = frameLayout;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = this.iBlur3FactoryBg;
        ViewPositionWatcher viewPositionWatcher2 = new ViewPositionWatcher(this.contentView);
        FrameLayout frameLayout2 = this.contentView;
        blurredBackgroundDrawableViewFactory2.viewPositionWatcher = viewPositionWatcher2;
        blurredBackgroundDrawableViewFactory2.parent = frameLayout2;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setClipToOutline(true);
        this.listView.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
            }
        });
        this.listView.addEdgeEffectListener(new PremiumPreviewFragment$$ExternalSyntheticLambda13(this, i4));
        this.listView.setCaptureSectionsDecoratorAllowed(true);
        this.listView.setSections(true);
        this.listView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, (AndroidUtilities.dp(68.0f) + this.statusBarHeight) - AndroidUtilities.dp(16.0f), this.listView);
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView2.setLayoutManager(fillLastLinearLayoutManager);
        this.layoutManager.setFixedLastItemHeight();
        this.listView.setAdapter(new Adapter());
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                super.onScrollStateChanged(recyclerView, i6);
                if (i6 == 0) {
                    int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom();
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.totalProgress > 0.5f) {
                        premiumPreviewFragment.listView.smoothScrollBy(0, premiumPreviewFragment.currentYOffset - iDp);
                        return;
                    }
                    View viewFindViewByPosition = premiumPreviewFragment.listView.getLayoutManager() != null ? PremiumPreviewFragment.this.listView.getLayoutManager().findViewByPosition(0) : null;
                    if (viewFindViewByPosition == null || viewFindViewByPosition.getTop() >= 0) {
                        return;
                    }
                    PremiumPreviewFragment.this.listView.smoothScrollBy(0, viewFindViewByPosition.getTop());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                super.onScrolled(recyclerView, i6, i7);
                PremiumPreviewFragment.this.contentView.invalidate();
                if (Build.VERSION.SDK_INT < 31 || PremiumPreviewFragment.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                PremiumPreviewFragment.this.scrollableViewNoiseSuppressor.onScrolled(i6, i7);
                PremiumPreviewFragment.this.blur3_InvalidateBlur();
            }
        });
        this.backgroundView = new BackgroundView(context);
        StarParticlesView starParticlesView = new StarParticlesView(context);
        this.particlesView = starParticlesView;
        starParticlesView.setClipWithGradient();
        if (this.type == 1) {
            if (this.whiteBackground) {
                StarParticlesView.Drawable drawable = this.particlesView.drawable;
                drawable.useGradient = true;
                drawable.useBlur = false;
                drawable.checkBounds = true;
                drawable.isCircle = true;
                drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                StarParticlesView.Drawable drawable2 = this.particlesView.drawable;
                drawable2.minLifeTime = 2000L;
                drawable2.randLifeTime = 3000;
                drawable2.size1 = 16;
                drawable2.useRotate = false;
                drawable2.type = 28;
                drawable2.colorKey = i5;
            } else {
                StarParticlesView.Drawable drawable3 = this.particlesView.drawable;
                drawable3.isCircle = true;
                drawable3.centerOffsetY = AndroidUtilities.dp(28.0f);
                StarParticlesView.Drawable drawable4 = this.particlesView.drawable;
                drawable4.minLifeTime = 2000L;
                drawable4.randLifeTime = 3000;
                drawable4.size1 = 16;
                drawable4.useRotate = false;
                drawable4.type = 28;
            }
        }
        this.backgroundView.imageView.setStarParticlesView(this.particlesView);
        this.contentView.addView(this.particlesView, LayoutHelper.createFrame(-1, -2.0f));
        this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-1, -2.0f));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, i));
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.buttonContainerInternal = new FrameLayout(context);
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(8.0f), false, getResourceProvider());
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.nonClickable = true;
        premiumButtonView.setClickable(false);
        premiumButtonView.buttonLayout.setClickable(false);
        premiumButtonView.setStateListAnimator(null);
        updateButtonText(false);
        this.buttonContainer = new FrameLayout(context);
        this.buttonContainerInternal.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.buttonContainerInternal.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, -1.0f));
        View view = this.buttonContainerInternal;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3Factory.create(view, null, false);
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(this.resourceProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new LivePlayer$$ExternalSyntheticLambda1(7);
        int i6 = 553648127;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i6, -1, i2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i6, i3, i2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(83886079, 805306368, i2);
        float fDpf2 = AndroidUtilities.dpf2(4.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.67f);
        float fDpf5 = AndroidUtilities.dpf2(0.67f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        view.setBackground(blurredBackgroundDrawableCreate);
        ScaleStateListAnimator.apply(this.buttonContainerInternal, 0.02f, 1.5f);
        this.buttonContainer.addView(this.buttonContainerInternal, LayoutHelper.createFrame(-1, 72.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3Factory.create(this.buttonContainer, null, false));
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(40.0f), false);
        this.navbarProtectionDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3Factory.create(this.contentView, null, false));
        this.buttonContainer.setBackground(blurredBackgroundWithFadeDrawable);
        if (getUserConfig().isClientActivated()) {
            this.contentView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
        }
        this.fragmentView = this.contentView;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || !((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i7) {
                if (i7 == -1) {
                    PremiumPreviewFragment.this.finishFragment();
                }
            }
        });
        this.actionBar.setForceSkipTouches(true);
        this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        updateColors();
        updateRows();
        this.backgroundView.imageView.startEnterAnimation(-180, 200L);
        if (this.forcePremium) {
            AndroidUtilities.runOnUIThread(new PremiumPreviewFragment$$ExternalSyntheticLambda13(this, i2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        sentShowScreenStat(this.source);
        View view2 = this.fragmentView;
        TodoItemMenu$$ExternalSyntheticLambda3 todoItemMenu$$ExternalSyntheticLambda3 = new TodoItemMenu$$ExternalSyntheticLambda3(this, 15);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view2, todoItemMenu$$ExternalSyntheticLambda3);
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            updateButtonText(false);
            this.backgroundView.updatePremiumTiers();
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged || i == NotificationCenter.premiumPromoUpdated) {
            this.backgroundView.updateText();
            this.backgroundView.updatePremiumTiers();
            updateRows();
            this.listView.getAdapter().notifyDataSetChanged();
        }
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda0(this, 28), Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, Theme.key_premiumGradientBackgroundOverlay, Theme.key_premiumStarGradient1, Theme.key_premiumStarGradient2, Theme.key_premiumStartSmallStarsColor, Theme.key_premiumStartSmallStarsColor2);
    }

    @Override
    public boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public boolean isLightStatusBar() {
        return this.whiteBackground;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.settingsView == null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        closeSetting();
        return false;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        updateDialogVisibility(false);
    }

    @Override
    public boolean onFragmentCreate() {
        if (getMessagesController().premiumFeaturesBlocked()) {
            return false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.premiumPromoUpdated);
        if (getMediaDataController().getPremiumPromo() != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().getPremiumPromo().videos;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Document document = arrayList.get(i);
                i++;
                FileLoader.getInstance(this.currentAccount).loadFile(document, getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        if (this.type == 1) {
            TimezonesController.getInstance(this.currentAccount).load();
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override
    public void onPause() {
        super.onPause();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null && backgroundView.imageView != null) {
            this.backgroundView.imageView.setDialogVisible(true);
        }
        StarParticlesView starParticlesView = this.particlesView;
        if (starParticlesView != null) {
            starParticlesView.setPaused(true);
        }
        Bulletin.removeDelegate(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null && backgroundView.imageView != null) {
            this.backgroundView.imageView.setPaused(false);
            this.backgroundView.imageView.setDialogVisible(false);
        }
        this.particlesView.setPaused(false);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getBottomOffset(int i) {
                return PremiumPreviewFragment.this.insets.bottom;
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        });
    }

    public PremiumPreviewFragment setForcePremium() {
        this.forcePremium = true;
        return this;
    }

    public PremiumPreviewFragment setSelectAnnualByDefault() {
        this.selectAnnualByDefault = true;
        return this;
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        Dialog dialogShowDialog = super.showDialog(dialog);
        updateDialogVisibility(dialogShowDialog != null);
        return dialogShowDialog;
    }

    public void showSelectStatusDialog(PremiumFeatureCell premiumFeatureCell, Long l, final Utilities.Callback2<Long, Integer> callback2) {
        PremiumFeatureCell premiumFeatureCell2;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        int iCenterX;
        int iDp;
        int i;
        boolean z;
        int i2;
        if (this.selectAnimatedEmojiDialog != null || premiumFeatureCell == null) {
            return;
        }
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        boolean z2 = ((float) (premiumFeatureCell.getHeight() + premiumFeatureCell.getTop())) > ((float) this.listView.getMeasuredHeight()) / 2.0f;
        int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
        int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = premiumFeatureCell.imageDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.removeOldDrawable();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = premiumFeatureCell.imageDrawable;
            if (swapAnimatedEmojiDrawable3 != null) {
                swapAnimatedEmojiDrawable3.play();
                premiumFeatureCell.updateImageBounds();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(premiumFeatureCell.imageDrawable.getBounds());
                if (z2) {
                    iDp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin;
                } else {
                    iDp = (-(premiumFeatureCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                }
                iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
                swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
                premiumFeatureCell2 = premiumFeatureCell;
            } else {
                swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
                premiumFeatureCell2 = premiumFeatureCell;
            }
            if (z2) {
                i = 12;
            } else {
                i = 0;
            }
            z = z2;
            Context context = getContext();
            Integer numValueOf = Integer.valueOf(iCenterX);
            Theme.ResourcesProvider resourceProvider = getResourceProvider();
            if (z) {
                i2 = 24;
            } else {
                i2 = 16;
            }
            PremiumFeatureCell premiumFeatureCell3 = premiumFeatureCell2;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, context, true, numValueOf, i, true, resourceProvider, i2) {
                @Override
                public float getScrimDrawableTranslationY() {
                    return 0.0f;
                }

                @Override
                public void onEmojiSelected(View view, Long l2, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    Utilities.Callback2 callback3 = callback2;
                    if (callback3 != null) {
                        callback3.run(l2, num);
                    }
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }
            };
            selectAnimatedEmojiDialog.useAccentForPlus = true;
            selectAnimatedEmojiDialog.setSelected(l);
            selectAnimatedEmojiDialog.setSaveState(3);
            selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, premiumFeatureCell3);
            int i3 = -2;
            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i3, i3) {
                @Override
                public void dismiss() {
                    super.dismiss();
                    PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindow.showAsDropDown(premiumFeatureCell, 0, iDp, 53);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }
        premiumFeatureCell2 = null;
        swapAnimatedEmojiDrawable = null;
        iCenterX = 0;
        iDp = 0;
        if (z2) {
            i = 12;
        } else {
            i = 0;
        }
        z = z2;
        Context context2 = getContext();
        Integer numValueOf2 = Integer.valueOf(iCenterX);
        Theme.ResourcesProvider resourceProvider2 = getResourceProvider();
        if (z) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        PremiumFeatureCell premiumFeatureCell4 = premiumFeatureCell2;
        View selectAnimatedEmojiDialog2 = new SelectAnimatedEmojiDialog(this, context2, true, numValueOf2, i, true, resourceProvider2, i2) {
            @Override
            public float getScrimDrawableTranslationY() {
                return 0.0f;
            }

            @Override
            public void onEmojiSelected(View view, Long l2, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                Utilities.Callback2 callback3 = callback2;
                if (callback3 != null) {
                    callback3.run(l2, num);
                }
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }
        };
        selectAnimatedEmojiDialog2.useAccentForPlus = true;
        selectAnimatedEmojiDialog2.setSelected(l);
        selectAnimatedEmojiDialog2.setSaveState(3);
        selectAnimatedEmojiDialog2.setScrimDrawable(swapAnimatedEmojiDrawable, premiumFeatureCell4);
        int i4 = -2;
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow2 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog2, i4, i4) {
            @Override
            public void dismiss() {
                super.dismiss();
                PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow2;
        selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow2;
        selectAnimatedEmojiDialogWindow2.showAsDropDown(premiumFeatureCell, 0, iDp, 53);
        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
    }

    public static CharSequence applyNewSpan(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(false, i);
        newSpan.setColor(Theme.getColor(null, Theme.key_premiumGradient1, false));
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void buyPremium(BaseFragment baseFragment, String str) throws FileNotFoundException {
        buyPremium(baseFragment, null, str, true);
    }

    public static void buyPremium(BaseFragment baseFragment, String str, boolean z) throws FileNotFoundException {
        buyPremium(baseFragment, null, str, z);
    }

    public static void buyPremium(BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str) throws FileNotFoundException {
        buyPremium(baseFragment, subscriptionTier, str, true);
    }

    public static void sentShowScreenStat(String str) {
        TLRPC.JSONValue tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda3(17));
    }

    public static void buyPremium(BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str, boolean z) throws FileNotFoundException {
        buyPremium(baseFragment, subscriptionTier, str, z, null);
    }

    public static void buyPremium(BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str, boolean z, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams) throws FileNotFoundException {
        SubscriptionTier subscriptionTier2;
        boolean z2;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (baseFragment == null) {
                new PremiumNotAvailableBottomSheet(baseFragment).show();
                return;
            } else {
                baseFragment.showDialog(new PremiumNotAvailableBottomSheet(baseFragment));
                return;
            }
        }
        int currentAccount = baseFragment == null ? UserConfig.selectedAccount : baseFragment.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            AccountFrozenAlert.show(currentAccount);
            return;
        }
        if (subscriptionTier == null) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo();
            if (premiumPromo != null) {
                ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i);
                    i++;
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                    int i2 = tL_premiumSubscriptionOption3.months;
                    if (i2 == 1) {
                        subscriptionTier = new SubscriptionTier(tL_premiumSubscriptionOption3);
                    } else if (i2 == 12) {
                        subscriptionTier = new SubscriptionTier(tL_premiumSubscriptionOption3);
                        break;
                    }
                }
            }
            subscriptionTier2 = subscriptionTier;
            z2 = true;
        } else {
            subscriptionTier2 = subscriptionTier;
            z2 = z;
        }
        sentPremiumButtonClick();
        if (BuildVars.useInvoiceBilling()) {
            Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : LaunchActivity.instance;
            if (parentActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) parentActivity;
                if (subscriptionTier2 != null && (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri uri = Uri.parse(str2);
                    if (uri.getHost().equals("t.me") && !uri.getPath().startsWith("/$") && !uri.getPath().startsWith("/invoice/")) {
                        launchActivity.setNavigateToPremiumBot(true);
                    }
                    Browser.openUrl(launchActivity, subscriptionTier2.subscriptionOption.bot_url);
                    return;
                }
                MessagesController messagesController = MessagesController.getInstance(currentAccount);
                if (!TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                    launchActivity.setNavigateToPremiumBot(true);
                    launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + messagesController.premiumBotUsername + "?start=" + str)), null);
                    return;
                }
                if (TextUtils.isEmpty(messagesController.premiumInvoiceSlug)) {
                    return;
                }
                launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + messagesController.premiumInvoiceSlug)), null);
                return;
            }
            return;
        }
        ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (productDetails == null || productDetails.zzj.isEmpty()) {
            return;
        }
        if (subscriptionTier2.getGooglePlayProductDetails() == null) {
            subscriptionTier2.setGooglePlayProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
        }
        if (subscriptionTier2.getOfferDetails() == null) {
            return;
        }
        BillingController.getInstance().queryPurchases("subs", new PremiumPreviewFragment$$ExternalSyntheticLambda12(baseFragment, z2, currentAccount, billingFlowParams$SubscriptionUpdateParams, subscriptionTier2));
    }

    public PremiumPreviewFragment(String str) {
        this(0, str);
    }
}

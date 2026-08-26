package org.telegram.ui;

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
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.ProductDetails;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EdgeToEdgeSupportMode;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Premium.AboutPremiumView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.GLIcon.Icon3D;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.PremiumNotAvailableBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.PremiumTierCell;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SeekBarView;
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
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12;

public final class PremiumPreviewFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public BackgroundView backgroundView;
    public FrameLayout buttonContainer;
    public FrameLayout buttonContainerInternal;
    public AnonymousClass2 contentView;
    public SubscriptionTier currentSubscriptionTier;
    public int currentYOffset;
    public PremiumFeatureCell dummyCell;
    public PremiumTierCell dummyTierCell;
    public int featuresEndRow;
    public int featuresStartRow;
    public int firstViewHeight;
    public boolean forcePremium;
    public final Canvas gradientCanvas;
    public final Paint gradientPaint;
    public final Bitmap gradientTextureBitmap;
    public final PremiumGradient.PremiumGradientTools gradientTools;
    public EmojiView$$ExternalSyntheticLambda18 iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryBg;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public boolean inc;
    public Insets insets;
    public boolean isDialogVisible;
    public boolean isLandscapeMode;
    public int lastPaddingRow;
    public FillLastLinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public final Matrix matrix;
    public int moreFeaturesEndRow;
    public int moreFeaturesStartRow;
    public int moreHeaderRow;
    public final ArrayList morePremiumFeatures;
    public BlurredBackgroundWithFadeDrawable navbarProtectionDrawable;
    public StarParticlesView particlesView;
    public PremiumButtonView premiumButtonView;
    public final ArrayList premiumFeatures;
    public int privacyRow;
    public float progress;
    public float progressToFull;
    public int rowCount;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public int sectionRow;
    public AnonymousClass9 selectAnimatedEmojiDialog;
    public boolean selectAnnualByDefault;
    public int selectedTierIndex;
    public FrameLayout settingsView;
    public LinearGradient shader;
    public Drawable shadowDrawable;
    public int showAdsHeaderRow;
    public int showAdsInfoRow;
    public int showAdsRow;
    public final String source;
    public int statusBarHeight;
    public int statusRow;
    public final Paint strokePaint;
    public final ArrayList subscriptionTiers;
    public final PremiumGradient.PremiumGradientTools tiersGradientTools;
    public int totalGradientHeight;
    public float totalProgress;
    public int totalTiersGradientHeight;
    public final int type;
    public final boolean whiteBackground;

    public final class AnonymousClass3 extends ViewOutlineProvider {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void getOutline(View view, Outline outline) {
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + ((BaseFragment) ((PremiumPreviewFragment) obj)).actionBar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), view.getMeasuredHeight() + AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    break;
                case 1:
                    float fDp = AndroidUtilities.dp(29.0f);
                    float fDp2 = AndroidUtilities.dp(12.0f);
                    Path path = (Path) obj;
                    path.rewind();
                    path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{fDp, fDp, fDp, fDp, fDp2, fDp2, fDp2, fDp2}, Path.Direction.CW);
                    if (Build.VERSION.SDK_INT < 30) {
                        outline.setConvexPath(path);
                    } else {
                        outline.setPath(path);
                    }
                    break;
                case 2:
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                    ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                    float f = chatAttachAlert.commentTextViewLocation[1];
                    ChatAttachAlert.AnonymousClass36 anonymousClass36 = chatAttachAlert.mentionContainer;
                    int iMin = (int) Math.min((chatAttachAlertPhotoLayout.parentAlert.getContainerView().getTranslationY() + ((f - (anonymousClass36 != null ? anonymousClass36.clipBottom() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.currentPanTranslationY)) - chatAttachAlertPhotoLayout.cameraView.getTranslationY(), view.getMeasuredHeight());
                    if (chatAttachAlertPhotoLayout.cameraOpened) {
                        iMin = view.getMeasuredHeight();
                    } else if (chatAttachAlertPhotoLayout.cameraAnimationInProgress) {
                        iMin = AndroidUtilities.lerp(iMin, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.cameraOpenProgress);
                    }
                    boolean z = chatAttachAlertPhotoLayout.cameraAnimationInProgress;
                    if (z) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f2 = chatAttachAlertPhotoLayout.animationClipLeft;
                        float f3 = 1.0f - chatAttachAlertPhotoLayout.cameraOpenProgress;
                        rectF.set((0.0f * f3) + f2, (f3 * chatAttachAlertPhotoLayout.cameraViewOffsetY) + chatAttachAlertPhotoLayout.animationClipTop, chatAttachAlertPhotoLayout.animationClipRight, chatAttachAlertPhotoLayout.animationClipBottom);
                        outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(iMin, (int) rectF.bottom));
                    } else if (z || chatAttachAlertPhotoLayout.cameraOpened) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(iMin, view.getMeasuredHeight()));
                    } else {
                        int iDp = AndroidUtilities.dp(16.0f);
                        outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.cameraViewOffsetY, view.getMeasuredWidth() + iDp, Math.min(iMin, view.getMeasuredHeight()) + iDp, iDp);
                    }
                    break;
                case 3:
                    int i = ((InstantCameraView) obj).textureViewSize;
                    outline.setOval(0, 0, i, i);
                    break;
                case 4:
                    outline.setRoundRect(0, ((MessagePreviewView.Page) obj).currentTopOffset + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                    break;
                case 5:
                    BlurredBackgroundDrawable.Props props = ((BlurredBackgroundDrawable) obj).boundProps;
                    BlurredBackgroundDrawable.getOutline(outline, props.boundsWithPadding, props.radii);
                    break;
                case 6:
                    VoIPFloatingLayout voIPFloatingLayout = (VoIPFloatingLayout) obj;
                    float f4 = voIPFloatingLayout.overrideCornerRadius;
                    if (f4 < 0.0f) {
                        if (!voIPFloatingLayout.floatingMode) {
                            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        } else {
                            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), voIPFloatingLayout.floatingMode ? AndroidUtilities.dp(4.0f) : 0.0f);
                        }
                    } else if (f4 >= 1.0f) {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), voIPFloatingLayout.overrideCornerRadius);
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    }
                    break;
                default:
                    VoIPTextureView voIPTextureView = (VoIPTextureView) obj;
                    if (voIPTextureView.roundRadius >= 1.0f) {
                        outline.setRoundRect((int) voIPTextureView.currentClipHorizontal, (int) voIPTextureView.currentClipVertical, (int) (view.getMeasuredWidth() - voIPTextureView.currentClipHorizontal), (int) (view.getMeasuredHeight() - voIPTextureView.currentClipVertical), voIPTextureView.roundRadius);
                    } else {
                        outline.setRect((int) voIPTextureView.currentClipHorizontal, (int) voIPTextureView.currentClipVertical, (int) (view.getMeasuredWidth() - voIPTextureView.currentClipHorizontal), (int) (view.getMeasuredHeight() - voIPTextureView.currentClipVertical));
                    }
                    break;
            }
        }

        public AnonymousClass3() {
            this.$r8$classId = 1;
            this.this$0 = new Path();
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {

        public final class AnonymousClass2 extends PremiumFeatureCell {
            public final int $r8$classId = 1;
            public final RecyclerListView.SelectionAdapter this$1;

            public AnonymousClass2(PremiumPreviewBottomSheet.Adapter adapter, Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context, resourcesProvider);
                this.this$1 = adapter;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        float fDp = AndroidUtilities.dp(10.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        ImageView imageView = this.imageView;
                        rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                        PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                        premiumPreviewFragment.matrix.reset();
                        premiumPreviewFragment.matrix.postScale(1.0f, premiumPreviewFragment.totalGradientHeight / 100.0f, 0.0f, 0.0f);
                        premiumPreviewFragment.matrix.postTranslate(0.0f, -this.data.yOffset);
                        premiumPreviewFragment.shader.setLocalMatrix(premiumPreviewFragment.matrix);
                        canvas.drawRoundRect(rectF, fDp, fDp, premiumPreviewFragment.gradientPaint);
                        if (((BaseFragment) premiumPreviewFragment).resourceProvider != null ? ((BaseFragment) premiumPreviewFragment).resourceProvider.isDark() : Theme.currentTheme.isDark()) {
                            float fDp2 = AndroidUtilities.dp(1.0f);
                            premiumPreviewFragment.strokePaint.setStrokeWidth(fDp2);
                            canvas.save();
                            canvas.translate(rectF.left, rectF.top);
                            rectF.offset(-rectF.left, -rectF.top);
                            float f = fDp2 / 2.0f;
                            rectF.inset(f, f);
                            canvas.drawRoundRect(rectF, fDp, fDp, premiumPreviewFragment.strokePaint);
                            canvas.restore();
                        }
                        super.dispatchDraw(canvas);
                        break;
                    default:
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        ImageView imageView2 = this.imageView;
                        rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                        PremiumPreviewBottomSheet.Adapter adapter = (PremiumPreviewBottomSheet.Adapter) this.this$1;
                        PremiumPreviewBottomSheet.this.gradientTools.gradientMatrix(0, 0.0f, 0, getMeasuredWidth(), -this.data.yOffset, PremiumPreviewBottomSheet.this.totalGradientHeight);
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), PremiumPreviewBottomSheet.this.gradientTools.paint);
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            public AnonymousClass2(Adapter adapter, Context context) {
                super(context, null);
                this.this$1 = adapter;
            }
        }

        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return PremiumPreviewFragment.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            if (i >= premiumPreviewFragment.featuresStartRow && i < premiumPreviewFragment.featuresEndRow) {
                return 1;
            }
            if (i >= premiumPreviewFragment.moreFeaturesStartRow && i < premiumPreviewFragment.moreFeaturesEndRow) {
                return 1;
            }
            if (i == 0) {
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
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 1 || i == 8;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.TL_help_premiumPromo premiumPromo;
            String strSubstring;
            String str;
            int i2;
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            int i3 = premiumPreviewFragment.featuresStartRow;
            View view = viewHolder.itemView;
            boolean z = true;
            boolean z2 = false;
            if (i >= i3 && i < premiumPreviewFragment.featuresEndRow) {
                ((PremiumFeatureCell) view).setData((PremiumFeatureData) premiumPreviewFragment.premiumFeatures.get(i - i3), i != premiumPreviewFragment.featuresEndRow - 1);
                return;
            }
            int i4 = premiumPreviewFragment.moreFeaturesStartRow;
            if (i >= i4 && i < premiumPreviewFragment.moreFeaturesEndRow) {
                ((PremiumFeatureCell) view).setData((PremiumFeatureData) premiumPreviewFragment.morePremiumFeatures.get(i - i4), i != premiumPreviewFragment.moreFeaturesEndRow - 1);
                return;
            }
            String str2 = "";
            if (i == premiumPreviewFragment.sectionRow) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setText("");
                textInfoPrivacyCell.setFixedSize(12);
                return;
            }
            if (i != premiumPreviewFragment.statusRow && i != premiumPreviewFragment.privacyRow && i != premiumPreviewFragment.showAdsInfoRow) {
                if (i == premiumPreviewFragment.moreHeaderRow) {
                    ((HeaderCell) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                    return;
                }
                if (i == premiumPreviewFragment.showAdsHeaderRow) {
                    ((HeaderCell) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                    return;
                }
                if (i == premiumPreviewFragment.showAdsRow) {
                    TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                    TextCell textCell = (TextCell) view;
                    String string = LocaleController.getString(R.string.ShowAds);
                    if (userFull != null && !userFull.sponsored_enabled) {
                        z = false;
                    }
                    textCell.setTextAndCheck(string, z, false);
                    return;
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell2 = (TextInfoPrivacyCell) view;
            boolean z3 = premiumPreviewFragment.whiteBackground;
            if (!z3) {
                textInfoPrivacyCell2.setTextColor(Theme.multAlpha(0.75f, -1));
                textInfoPrivacyCell2.getTextView().setLinkTextColor(-1);
                textInfoPrivacyCell2.setLinkTextRippleColor(Integer.valueOf(Theme.multAlpha(0.15f, -1)));
            }
            textInfoPrivacyCell2.setFixedSize(0);
            if (i == premiumPreviewFragment.showAdsInfoRow) {
                textInfoPrivacyCell2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new PhotoViewer$$ExternalSyntheticLambda21(this, 24)), true));
                return;
            }
            int i5 = premiumPreviewFragment.statusRow;
            if (i == i5 && premiumPreviewFragment.type == 1) {
                textInfoPrivacyCell2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
                return;
            }
            if (i != i5 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
                return;
            }
            SpannableString spannableString = new SpannableString(premiumPromo.status_text);
            MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
            TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spannableString.getSpans(0, spannableString.length(), TextStyleSpan.class);
            int length = textStyleSpanArr.length;
            int i6 = 0;
            while (i6 < length) {
                TextStyleSpan.TextStyleRun textStyleRun = textStyleSpanArr[i6].style;
                TLRPC.MessageEntity messageEntity = textStyleRun.urlEntity;
                if (messageEntity != null) {
                    String str3 = premiumPromo.status_text;
                    int i7 = messageEntity.offset;
                    strSubstring = TextUtils.substring(str3, i7, messageEntity.length + i7);
                } else {
                    strSubstring = null;
                }
                TLRPC.MessageEntity messageEntity2 = textStyleRun.urlEntity;
                if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                    spannableString.setSpan(new URLSpanBotCommand(strSubstring, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                } else {
                    if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                        str = str2;
                        i2 = 33;
                        spannableString.setSpan(new URLSpanNoUnderline(strSubstring, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                        spannableString.setSpan(new URLSpanReplacement(zzil.m("mailto:", strSubstring), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                        if (strSubstring.toLowerCase().contains("://")) {
                            spannableString.setSpan(new URLSpanBrowser(strSubstring, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else {
                            spannableString.setSpan(new URLSpanBrowser("http://".concat(strSubstring), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        }
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                        spannableString.setSpan(new URLSpanNoUnderline(zzil.m("card:", strSubstring), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(strSubstring, z2);
                        if (strSubstring.startsWith("+")) {
                            strStripExceptNumbers = zzil.m("+", strStripExceptNumbers);
                        }
                        spannableString.setSpan(new URLSpanBrowser(zzil.m("tel:", strStripExceptNumbers), textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else {
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            URLSpanReplacement uRLSpanReplacement = new URLSpanReplacement(textStyleRun.urlEntity.url, textStyleRun);
                            uRLSpanReplacement.navigateToPremiumBot = true;
                            spannableString.setSpan(uRLSpanReplacement, textStyleRun.start, textStyleRun.end, 33);
                            if (!z3) {
                                spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), textStyleRun.start, textStyleRun.end, 33);
                            }
                        } else {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                StringBuilder sb = new StringBuilder(str2);
                                str = str2;
                                sb.append(((TLRPC.TL_messageEntityMentionName) textStyleRun.urlEntity).user_id);
                                spannableString.setSpan(new URLSpanUserMention(sb.toString(), 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                            } else {
                                str = str2;
                                if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    spannableString.setSpan(new URLSpanUserMention(str + ((TLRPC.TL_inputMessageEntityMentionName) textStyleRun.urlEntity).user_id.user_id, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                                } else if ((textStyleRun.flags & 4) != 0) {
                                    str = str;
                                    i2 = 33;
                                    spannableString.setSpan(new URLSpanMono(spannableString, textStyleRun.start, textStyleRun.end, (byte) 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                                } else {
                                    str = str;
                                    spannableString.setSpan(new TextStyleSpan(textStyleRun, 0), textStyleRun.start, textStyleRun.end, 33);
                                }
                            }
                            i2 = 33;
                        }
                        i6++;
                        str2 = str;
                        z2 = false;
                    }
                    if ((textStyleRun.flags & 256) != 0) {
                        spannableString.setSpan(new TextStyleSpan(textStyleRun, 0), textStyleRun.start, textStyleRun.end, i2);
                    }
                    i6++;
                    str2 = str;
                    z2 = false;
                }
                str = str2;
                i2 = 33;
                if ((textStyleRun.flags & 256) != 0) {
                    spannableString.setSpan(new TextStyleSpan(textStyleRun, 0), textStyleRun.start, textStyleRun.end, i2);
                }
                i6++;
                str2 = str;
                z2 = false;
            }
            textInfoPrivacyCell2.setText(spannableString);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View anonymousClass2;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    anonymousClass2 = new AnonymousClass2(this, context);
                    break;
                case 2:
                    anonymousClass2 = new ShadowSectionCell(context, 0, 0);
                    break;
                case 3:
                default:
                    anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 27);
                    anonymousClass2.setTag(-33024);
                    break;
                case 4:
                    anonymousClass2 = new AboutPremiumView(context);
                    break;
                case 5:
                    anonymousClass2 = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 6:
                    anonymousClass2 = new View(context);
                    anonymousClass2.setTag(-33024);
                    break;
                case 7:
                    anonymousClass2 = new HeaderCell(context);
                    break;
                case 8:
                    anonymousClass2 = new TextCell(23, context, ((BaseFragment) PremiumPreviewFragment.this).resourceProvider, false, true);
                    break;
            }
            return zzkl.m(anonymousClass2, anonymousClass2);
        }
    }

    public final class BackgroundView extends LinearLayout {
        public final FrameLayout imageFrameLayout;
        public final AnonymousClass1 imageView;
        public boolean setTierListViewVisibility;
        public final TextView subtitleView;
        public final AnonymousClass2 tierListView;
        public boolean tierListViewVisible;
        public final TextView titleView;

        public final class AnonymousClass2 extends RecyclerListView {
            public final Paint paint;
            public final Path path;

            public AnonymousClass2(Context context) {
                super(context, null);
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                this.path = new Path();
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Path path = this.path;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.drawPath(path, this.paint);
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (PremiumPreviewFragment.this.progressToFull >= 1.0f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (PremiumPreviewFragment.this.progressToFull >= 1.0f) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                int i5 = 0;
                int measuredHeight = 0;
                while (true) {
                    BackgroundView backgroundView = BackgroundView.this;
                    int size = PremiumPreviewFragment.this.subscriptionTiers.size();
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (i5 >= size) {
                        premiumPreviewFragment.totalTiersGradientHeight = measuredHeight;
                        return;
                    }
                    premiumPreviewFragment.dummyTierCell.bind((SubscriptionTier) premiumPreviewFragment.subscriptionTiers.get(i5), false);
                    premiumPreviewFragment.dummyTierCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                    ((SubscriptionTier) premiumPreviewFragment.subscriptionTiers.get(i5)).yOffset = measuredHeight;
                    measuredHeight += premiumPreviewFragment.dummyTierCell.getMeasuredHeight();
                    i5++;
                }
            }
        }

        public final class AnonymousClass3 extends RecyclerListView.SelectionAdapter {
            public final Context val$context;

            public AnonymousClass3(Context context) {
                this.val$context = context;
            }

            @Override
            public final int getItemCount() {
                return PremiumPreviewFragment.this.subscriptionTiers.size();
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return !((SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(viewHolder.getAdapterPosition())).subscriptionOption.current;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) viewHolder.itemView;
                BackgroundView backgroundView = BackgroundView.this;
                SubscriptionTier subscriptionTier = (SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(i);
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumTierCell.bind(subscriptionTier, i != premiumPreviewFragment.subscriptionTiers.size() - 1);
                premiumTierCell.setChecked(premiumPreviewFragment.selectedTierIndex == i, false);
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                PremiumTierCell premiumTierCell = new PremiumTierCell(this.val$context) {
                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        TextView textView = this.discountView;
                        if (textView.getVisibility() == 0) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0.0f, 0, getMeasuredWidth(), -this.tier.yOffset, PremiumPreviewFragment.this.totalTiersGradientHeight);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), PremiumPreviewFragment.this.tiersGradientTools.paint);
                        }
                        super.dispatchDraw(canvas);
                    }
                };
                premiumTierCell.setCirclePaintProvider(new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(11, this, premiumTierCell));
                return new RecyclerListView.Holder(premiumTierCell);
            }
        }

        public BackgroundView(final Context context) {
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.imageFrameLayout = frameLayout;
            int i = PremiumPreviewFragment.this.type;
            int i2 = i == 1 ? 175 : 190;
            addView(frameLayout, LayoutHelper.createLinear(i2, i2, 1));
            ?? r3 = new GLIconTextureView(context, PremiumPreviewFragment.this.whiteBackground ? 1 : 0, i == 1 ? 1 : 0) {
                @Override
                public final void onLongPress() {
                    final int i3 = 0;
                    BackgroundView backgroundView = BackgroundView.this;
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.settingsView == null && BuildVars.DEBUG_PRIVATE_VERSION) {
                        Context context2 = context;
                        premiumPreviewFragment.settingsView = new FrameLayout(context2);
                        ScrollView scrollView = new ScrollView(context2);
                        final GLIconRenderer gLIconRenderer = backgroundView.imageView.mRenderer;
                        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(context2, i3);
                        gLIconSettingsView.setOrientation(1);
                        TextView textView = new TextView(context2);
                        textView.setText("Spectral top ");
                        int i4 = Theme.key_dialogTextBlue2;
                        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, i4, false), 16.0f, 1, true);
                        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                        gLIconSettingsView.addView(textView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                        SeekBarView seekBarView = new SeekBarView(context2, null, false);
                        seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                            @Override
                            public final CharSequence getContentDescription() {
                                switch (i3) {
                                }
                                return null;
                            }

                            @Override
                            public final int getStepsCount() {
                                switch (i3) {
                                }
                                return 0;
                            }

                            @Override
                            public final void onSeekBarDrag(float f, boolean z) {
                                switch (i3) {
                                    case 0:
                                        Icon3D icon3D = gLIconRenderer.model;
                                        if (icon3D != null) {
                                            icon3D.spec1 = f * 2.0f;
                                        }
                                        break;
                                    default:
                                        Icon3D icon3D2 = gLIconRenderer.model;
                                        if (icon3D2 != null) {
                                            icon3D2.normalSpec = f * 2.0f;
                                        }
                                        break;
                                }
                            }

                            @Override
                            public final void onSeekBarPressed() {
                                int i5 = i3;
                            }

                            private final void onSeekBarPressed$org$telegram$ui$GLIconSettingsView$1() {
                            }

                            private final void onSeekBarPressed$org$telegram$ui$GLIconSettingsView$5() {
                            }
                        });
                        Icon3D icon3D = gLIconRenderer.model;
                        seekBarView.setProgress(icon3D == null ? 0.0f : icon3D.spec1 / 2.0f);
                        seekBarView.setReportChanges(true);
                        gLIconSettingsView.addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                        TextView textView2 = new TextView(context2);
                        textView2.setText("Spectral bottom ");
                        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, i4, false), 16.0f, 1, true);
                        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                        gLIconSettingsView.addView(textView2, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                        SeekBarView seekBarView2 = new SeekBarView(context2, null, false);
                        seekBarView2.setDelegate(new ChatActivity.AnonymousClass1(gLIconRenderer, 27));
                        Icon3D icon3D2 = gLIconRenderer.model;
                        seekBarView2.setProgress(icon3D2 == null ? 0.0f : icon3D2.spec2 / 2.0f);
                        seekBarView2.setReportChanges(true);
                        gLIconSettingsView.addView(seekBarView2, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                        TextView textView3 = new TextView(context2);
                        textView3.setText("Setup spec color");
                        textView3.setTextSize(1, 16.0f);
                        textView3.setLines(1);
                        textView3.setGravity(17);
                        textView3.setMaxLines(1);
                        textView3.setSingleLine(true);
                        int i5 = Theme.key_featuredStickers_buttonText;
                        textView3.setTextColor(Theme.getColor(null, i5, false));
                        int i6 = Theme.key_featuredStickers_addButton;
                        int color = Theme.getColor(null, i6, false);
                        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{4.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
                        textView3.setOnClickListener(new GLIconSettingsView.AnonymousClass3(context2, gLIconRenderer, i3));
                        gLIconSettingsView.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
                        TextView textView4 = new TextView(context2);
                        textView4.setText("Diffuse ");
                        ArticleViewer.IBlock.CC.m(textView4, Theme.getColor(null, i4, false), 16.0f, 1, true);
                        textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                        gLIconSettingsView.addView(textView4, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                        SeekBarView seekBarView3 = new SeekBarView(context2, null, false);
                        seekBarView3.setDelegate(new PollItemMenu.AnonymousClass6(gLIconRenderer, 1));
                        Icon3D icon3D3 = gLIconRenderer.model;
                        seekBarView3.setProgress(icon3D3 == null ? 0.0f : icon3D3.diffuse);
                        seekBarView3.setReportChanges(true);
                        gLIconSettingsView.addView(seekBarView3, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                        TextView textView5 = new TextView(context2);
                        textView5.setText("Normal map spectral");
                        ArticleViewer.IBlock.CC.m(textView5, Theme.getColor(null, i4, false), 16.0f, 1, true);
                        textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                        gLIconSettingsView.addView(textView5, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                        SeekBarView seekBarView4 = new SeekBarView(context2, null, false);
                        final int i7 = 1;
                        seekBarView4.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                            @Override
                            public final CharSequence getContentDescription() {
                                switch (i7) {
                                }
                                return null;
                            }

                            @Override
                            public final int getStepsCount() {
                                switch (i7) {
                                }
                                return 0;
                            }

                            @Override
                            public final void onSeekBarDrag(float f, boolean z) {
                                switch (i7) {
                                    case 0:
                                        Icon3D icon3D4 = gLIconRenderer.model;
                                        if (icon3D4 != null) {
                                            icon3D4.spec1 = f * 2.0f;
                                        }
                                        break;
                                    default:
                                        Icon3D icon3D5 = gLIconRenderer.model;
                                        if (icon3D5 != null) {
                                            icon3D5.normalSpec = f * 2.0f;
                                        }
                                        break;
                                }
                            }

                            @Override
                            public final void onSeekBarPressed() {
                                int i8 = i7;
                            }

                            private final void onSeekBarPressed$org$telegram$ui$GLIconSettingsView$1() {
                            }

                            private final void onSeekBarPressed$org$telegram$ui$GLIconSettingsView$5() {
                            }
                        });
                        Icon3D icon3D4 = gLIconRenderer.model;
                        seekBarView4.setProgress(icon3D4 == null ? 0.0f : icon3D4.normalSpec / 2.0f);
                        seekBarView4.setReportChanges(true);
                        gLIconSettingsView.addView(seekBarView4, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                        TextView textView6 = new TextView(context2);
                        textView6.setText("Setup normal spec color");
                        textView6.setTextSize(1, 16.0f);
                        textView6.setLines(1);
                        textView6.setGravity(17);
                        textView6.setMaxLines(1);
                        textView6.setSingleLine(true);
                        textView6.setTextColor(Theme.getColor(null, i5, false));
                        int color2 = Theme.getColor(null, i6, false);
                        textView6.setBackground(Theme.AdaptiveRipple.createRect(new float[]{4.0f}, color2, Theme.AdaptiveRipple.calcRippleColor(color2)));
                        textView6.setOnClickListener(new GLIconSettingsView.AnonymousClass3(context2, gLIconRenderer, 1));
                        gLIconSettingsView.addView(textView6, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
                        TextView textView7 = new TextView(context2);
                        textView7.setText("Small starts size");
                        ArticleViewer.IBlock.CC.m(textView7, Theme.getColor(null, i4, false), 16.0f, 1, true);
                        textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                        gLIconSettingsView.addView(textView7, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                        SeekBarView seekBarView5 = new SeekBarView(context2, null, false);
                        seekBarView5.setDelegate(new RichEditor.AnonymousClass12(26));
                        seekBarView5.setProgress(GLIconSettingsView.smallStarsSize / 2.0f);
                        seekBarView5.setReportChanges(true);
                        gLIconSettingsView.addView(seekBarView5, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                        scrollView.addView(gLIconSettingsView);
                        PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                        premiumPreviewFragment2.settingsView.addView(scrollView);
                        premiumPreviewFragment2.settingsView.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        premiumPreviewFragment2.contentView.addView(premiumPreviewFragment2.settingsView, LayoutHelper.createFrame(-1, -1, 80));
                        ((ViewGroup.MarginLayoutParams) premiumPreviewFragment2.settingsView.getLayoutParams()).topMargin = premiumPreviewFragment2.currentYOffset;
                        premiumPreviewFragment2.settingsView.setTranslationY(AndroidUtilities.dp(1000.0f));
                        premiumPreviewFragment2.settingsView.animate().translationY(1.0f).setDuration(300L);
                    }
                }
            };
            this.imageView = r3;
            frameLayout.addView((View) r3, LayoutHelper.createFrame(-1.0f, -1));
            frameLayout.setClipChildren(false);
            setClipChildren(false);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 22.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(1);
            addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 16, i == 1 ? 8 : 20, 16, 0));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(1);
            addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 1, 16, 7, 16, 0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
            this.tierListView = anonymousClass2;
            anonymousClass2.setOverScrollMode(2);
            anonymousClass2.setLayoutManager(new LinearLayoutManager(1, false));
            anonymousClass2.setAdapter(new AnonymousClass3(context));
            anonymousClass2.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 26));
            anonymousClass2.setSelectorTransformer(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12(this, new Path(), new float[8], 2));
            setClipChildren(false);
            setClipToPadding(false);
            addView(anonymousClass2, LayoutHelper.createLinear(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
            updatePremiumTiers();
            updateText();
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public final void updatePremiumTiers() {
            long pricePerYear;
            SubscriptionTier subscriptionTier;
            String str;
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            ArrayList arrayList = premiumPreviewFragment.subscriptionTiers;
            arrayList.clear();
            premiumPreviewFragment.selectedTierIndex = -1;
            premiumPreviewFragment.currentSubscriptionTier = null;
            if (premiumPreviewFragment.getMediaDataController().getPremiumPromo() != null) {
                ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().getPremiumPromo().period_options;
                int size = arrayList2.size();
                int i = 0;
                pricePerYear = 0;
                while (i < size) {
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i);
                    i++;
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                    if (!premiumPreviewFragment.getUserConfig().isPremium() || tL_premiumSubscriptionOption2.can_purchase_upgrade || tL_premiumSubscriptionOption2.current) {
                        SubscriptionTier subscriptionTier2 = new SubscriptionTier(tL_premiumSubscriptionOption2);
                        arrayList.add(subscriptionTier2);
                        if (premiumPreviewFragment.selectAnnualByDefault && tL_premiumSubscriptionOption2.months == 12) {
                            premiumPreviewFragment.selectedTierIndex = arrayList.size() - 1;
                        }
                        if (tL_premiumSubscriptionOption2.current) {
                            premiumPreviewFragment.currentSubscriptionTier = subscriptionTier2;
                        }
                        if (BuildVars.useInvoiceBilling() && subscriptionTier2.getPricePerYear() > pricePerYear) {
                            pricePerYear = subscriptionTier2.getPricePerYear();
                        }
                    }
                }
            } else {
                pricePerYear = 0;
            }
            if (BuildVars.useInvoiceBilling() && premiumPreviewFragment.getUserConfig().isPremium()) {
                arrayList.clear();
                premiumPreviewFragment.currentSubscriptionTier = null;
            } else if (BuildVars.useInvoiceBilling() || premiumPreviewFragment.currentSubscriptionTier == null) {
                subscriptionTier = premiumPreviewFragment.currentSubscriptionTier;
                if (subscriptionTier != null && subscriptionTier.subscriptionOption.months == 12) {
                    arrayList.clear();
                    premiumPreviewFragment.currentSubscriptionTier = null;
                }
            } else {
                String lastPremiumTransaction = BillingController.getInstance().getLastPremiumTransaction();
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.currentSubscriptionTier.subscriptionOption;
                if (Objects.equals(lastPremiumTransaction, (tL_premiumSubscriptionOption3 == null || (str = tL_premiumSubscriptionOption3.transaction) == null) ? null : str.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"))) {
                    subscriptionTier = premiumPreviewFragment.currentSubscriptionTier;
                    if (subscriptionTier != null) {
                        arrayList.clear();
                        premiumPreviewFragment.currentSubscriptionTier = null;
                    }
                } else {
                    arrayList.clear();
                    premiumPreviewFragment.currentSubscriptionTier = null;
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((SubscriptionTier) obj).pricePerYearRegular = pricePerYear;
                }
            } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
                int size3 = arrayList.size();
                int i3 = 0;
                boolean z = false;
                long pricePerYear2 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    SubscriptionTier subscriptionTier3 = (SubscriptionTier) obj2;
                    subscriptionTier3.googlePlayProductDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
                    if (subscriptionTier3.getPricePerYear() > pricePerYear2) {
                        pricePerYear2 = subscriptionTier3.getPricePerYear();
                    }
                    subscriptionTier3.checkOfferDetails();
                    if (subscriptionTier3.offerDetails != null) {
                        z = true;
                    }
                }
                if (z) {
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        SubscriptionTier subscriptionTier4 = (SubscriptionTier) arrayList.get(i4);
                        subscriptionTier4.checkOfferDetails();
                        if (subscriptionTier4.offerDetails == null) {
                            arrayList.remove(i4);
                            i4--;
                        }
                        i4++;
                    }
                }
                int size4 = arrayList.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    ((SubscriptionTier) obj3).pricePerYearRegular = pricePerYear2;
                }
            }
            if (premiumPreviewFragment.selectedTierIndex == -1) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (((SubscriptionTier) arrayList.get(i6)).subscriptionOption.months == 12) {
                        premiumPreviewFragment.selectedTierIndex = i6;
                        break;
                    }
                }
                if (premiumPreviewFragment.selectedTierIndex == -1) {
                    premiumPreviewFragment.selectedTierIndex = 0;
                }
            }
            premiumPreviewFragment.updateButtonText(false);
            this.tierListView.getAdapter().notifyDataSetChanged();
        }

        public final void updateText() {
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            TextView textView = this.titleView;
            TextView textView2 = this.subtitleView;
            int i = premiumPreviewFragment.type;
            if (i == 0) {
                textView.setText(LocaleController.getString(premiumPreviewFragment.forcePremium ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramPremium));
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.forcePremium) ? R.string.TelegramPremiumSubscribedSubtitle : R.string.TelegramPremiumSubtitle, textView2);
            } else if (i == 1) {
                textView.setText(LocaleController.getString(premiumPreviewFragment.forcePremium ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramBusiness));
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.forcePremium) ? R.string.TelegramBusinessSubscribedSubtitleTemp : R.string.TelegramBusinessSubtitleTemp, textView2);
            }
            textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), HintView2.cutInFancyHalf(textView2.getText(), textView2.getPaint()));
            boolean z = premiumPreviewFragment.forcePremium || BuildVars.IS_BILLING_UNAVAILABLE || premiumPreviewFragment.subscriptionTiers.size() <= 1;
            boolean z2 = this.setTierListViewVisibility;
            AnonymousClass2 anonymousClass2 = this.tierListView;
            if (!z2 || !z) {
                anonymousClass2.setVisibility(z ? 8 : 0);
                this.setTierListViewVisibility = true;
            } else if (anonymousClass2.getVisibility() == 0 && z && this.tierListViewVisible == z) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, anonymousClass2, duration));
                duration.addListener(new QrActivity.AnonymousClass4(9, this, anonymousClass2));
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.start();
            }
            this.tierListViewVisible = !z;
        }
    }

    public final class PremiumFeatureData {
        public final String description;
        public final int icon;
        public final String title;
        public final int type;
        public int yOffset;

        public PremiumFeatureData(int i, int i2, String str, String str2) {
            this.type = i;
            this.icon = i2;
            this.title = str;
            this.description = str2;
        }
    }

    public final class SubscriptionTier {
        public int discount;
        public ProductDetails googlePlayProductDetails;
        public ProductDetails.SubscriptionOfferDetails offerDetails;
        public long pricePerMonth;
        public long pricePerYear;
        public long pricePerYearRegular;
        public final TLRPC.TL_premiumSubscriptionOption subscriptionOption;
        public int yOffset;

        public SubscriptionTier(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
            this.subscriptionOption = tL_premiumSubscriptionOption;
        }

        public final void checkOfferDetails() {
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
                    int i2 = this.subscriptionOption.months;
                    if (i2 != 12) {
                        Locale locale = Locale.ROOT;
                        if (str.equals("P" + i2 + "M")) {
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

        public final String getCurrency() {
            boolean zUseInvoiceBilling = BuildVars.useInvoiceBilling();
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.subscriptionOption;
            if (zUseInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
                return tL_premiumSubscriptionOption.currency;
            }
            if (this.googlePlayProductDetails == null) {
                return "";
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            return subscriptionOfferDetails == null ? "" : ((ProductDetails.PricingPhase) subscriptionOfferDetails.zzd.mControlCategories.get(0)).zzc;
        }

        public final int getDiscount() {
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

        public final String getFormattedPricePerMonth() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency(), 6);
        }

        public final long getPrice() {
            boolean zUseInvoiceBilling = BuildVars.useInvoiceBilling();
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.subscriptionOption;
            if (zUseInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
                return tL_premiumSubscriptionOption.amount;
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

        public final long getPricePerMonth() {
            if (this.pricePerMonth == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerMonth = price / ((long) this.subscriptionOption.months);
                }
            }
            return this.pricePerMonth;
        }

        public final long getPricePerYear() {
            if (this.pricePerYear == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerYear = (long) ((price / ((double) this.subscriptionOption.months)) * 12.0d);
                }
            }
            return this.pricePerYear;
        }
    }

    public PremiumPreviewFragment(int i, String str) {
        super(null);
        this.premiumFeatures = new ArrayList();
        this.morePremiumFeatures = new ArrayList();
        this.subscriptionTiers = new ArrayList();
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
        premiumGradientTools.y1 = 0.0f;
        premiumGradientTools.x2 = 0.0f;
        premiumGradientTools.y2 = 1.0f;
        premiumGradientTools.cx = 0.0f;
        premiumGradientTools.cy = 0.0f;
        ArrayList arrayList = new ArrayList();
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
        PhotoViewer.AnonymousClass14 anonymousClass14 = new PhotoViewer.AnonymousClass14(this);
        if (Build.VERSION.SDK_INT >= 31) {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(true);
            this.scrollableViewNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressorIndex = -3;
            blurredBackgroundSourceRenderNode.underSource = anonymousClass14;
            this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(anonymousClass14);
        }
        this.iBlur3FactoryBg = new BlurredBackgroundDrawableViewFactory(anonymousClass14);
    }

    public static void buyPremium(BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
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
        if (subscriptionTier == null && (premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo()) != null) {
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
        SubscriptionTier subscriptionTier2 = subscriptionTier;
        sentPremiumButtonClick();
        if (!BuildVars.useInvoiceBilling()) {
            ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (productDetails == null || productDetails.zzj.isEmpty()) {
                return;
            }
            if (subscriptionTier2.googlePlayProductDetails == null) {
                subscriptionTier2.googlePlayProductDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            subscriptionTier2.checkOfferDetails();
            if (subscriptionTier2.offerDetails == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new VoIPFragment$$ExternalSyntheticLambda37(baseFragment, currentAccount, billingFlowParams$SubscriptionUpdateParams, subscriptionTier2, 10));
            return;
        }
        Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : LaunchActivity.instance;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (subscriptionTier2 != null && (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri uri = Uri.parse(str2);
                if (uri.getHost().equals("t.me") && !uri.getPath().startsWith("/$") && !uri.getPath().startsWith("/invoice/")) {
                    launchActivity.navigateToPremiumBot = true;
                }
                Browser.openUrl(launchActivity, tL_premiumSubscriptionOption.bot_url);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(currentAccount);
            if (TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                if (TextUtils.isEmpty(messagesController.premiumInvoiceSlug)) {
                    return;
                }
                launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + messagesController.premiumInvoiceSlug)), null);
                return;
            }
            launchActivity.navigateToPremiumBot = true;
            launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + messagesController.premiumBotUsername + "?start=" + str)), null);
        }
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

    public static void fillBusinessFeaturesList(int i, ArrayList arrayList, boolean z) {
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
                if (messagesController.businessFeaturesTypesToPosition.get(((PremiumFeatureData) arrayList.get(i2)).type, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new PremiumPreviewFragment$$ExternalSyntheticLambda8(messagesController, 0));
    }

    public static void fillPremiumFeaturesList(int i, ArrayList arrayList) {
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
                if (messagesController.premiumFeaturesTypesToPosition.get(((PremiumFeatureData) arrayList.get(i2)).type, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new PremiumPreviewFragment$$ExternalSyntheticLambda8(messagesController, i3));
    }

    public static String getPremiumButtonText(int i, SubscriptionTier subscriptionTier) {
        String formattedPricePerMonth;
        String currency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i2 = R.string.SubscribeToPremium;
        if (subscriptionTier != null) {
            if (!BuildVars.useInvoiceBilling()) {
                subscriptionTier.checkOfferDetails();
                if (subscriptionTier.offerDetails == null) {
                    return LocaleController.getString(R.string.Loading);
                }
            }
            boolean zIsPremium = UserConfig.getInstance(i).isPremium();
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = subscriptionTier.subscriptionOption;
            int i3 = tL_premiumSubscriptionOption.months;
            boolean z = i3 > 12 && i3 % 12 == 0;
            boolean z2 = i3 == 12;
            String formattedPricePerMonth2 = "";
            if (!z2) {
                formattedPricePerMonth = subscriptionTier.getFormattedPricePerMonth();
            } else if (BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption.store_product == null) {
                formattedPricePerMonth = BillingController.getInstance().formatCurrency(subscriptionTier.getPricePerYear(), subscriptionTier.getCurrency());
            } else {
                formattedPricePerMonth = subscriptionTier.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(subscriptionTier.getPricePerYear(), subscriptionTier.getCurrency(), 6);
            }
            if (zIsPremium) {
                i2 = z2 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
                formattedPricePerMonth2 = formattedPricePerMonth;
            } else if (z2) {
                if (MessagesController.getInstance(i).showAnnualPerMonth) {
                    formattedPricePerMonth2 = subscriptionTier.getFormattedPricePerMonth();
                } else {
                    i2 = R.string.SubscribeToPremiumPerYear;
                    if (BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption.store_product == null) {
                        formattedPricePerMonth2 = BillingController.getInstance().formatCurrency(subscriptionTier.getPrice(), subscriptionTier.getCurrency());
                    } else if (subscriptionTier.googlePlayProductDetails != null) {
                        formattedPricePerMonth2 = BillingController.getInstance().formatCurrency(subscriptionTier.getPrice(), subscriptionTier.getCurrency(), 6);
                    }
                }
            } else {
                if (z && !MessagesController.getInstance(i).showAnnualPerMonth) {
                    int i4 = R.string.SubscribeToPremiumPerCustom;
                    if (BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption.store_product == null) {
                        formattedPricePerMonth2 = BillingController.getInstance().formatCurrency(subscriptionTier.getPrice(), subscriptionTier.getCurrency());
                    } else if (subscriptionTier.googlePlayProductDetails != null) {
                        formattedPricePerMonth2 = BillingController.getInstance().formatCurrency(subscriptionTier.getPrice(), subscriptionTier.getCurrency(), 6);
                    }
                    return LocaleController.formatString(i4, formattedPricePerMonth2, LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption.months / 12, new Object[0]));
                }
                formattedPricePerMonth2 = subscriptionTier.getFormattedPricePerMonth();
            }
            return LocaleController.formatString(i2, formattedPricePerMonth2);
        }
        String currency2 = null;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
        currency2 = null;
        currency2 = null;
        if (!BuildVars.useInvoiceBilling()) {
            ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (productDetails != null) {
                ArrayList arrayList = productDetails.zzj;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = ((ProductDetails.SubscriptionOfferDetails) arrayList.get(0)).zzd.mControlCategories;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList2.get(i5);
                        i5++;
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
        int i6 = 0;
        while (i6 < size2) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList3.get(i6);
            i6++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            int i7 = tL_premiumSubscriptionOption4.months;
            if (i7 == 12) {
                tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                break;
            }
            if (tL_premiumSubscriptionOption2 == null && i7 == 1) {
                tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
            }
        }
        if (tL_premiumSubscriptionOption2 == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        if (tL_premiumSubscriptionOption2.months != 12) {
            currency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
        } else if (MessagesController.getInstance(i).showAnnualPerMonth) {
            currency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount / 12, tL_premiumSubscriptionOption2.currency);
        } else {
            i2 = R.string.SubscribeToPremiumPerYear;
            currency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
        }
        return LocaleController.formatString(i2, currency);
    }

    public static void sentPremiumButtonClick() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda1(1));
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
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda1(1));
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda1(1));
    }

    public final void blur3_InvalidateBlur$7() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.insets.bottom) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        downscaleScrollableNoiseSuppressor.setupRenderNodes(1, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public final boolean canBeginSlide() {
        BackgroundView.AnonymousClass1 anonymousClass1;
        BackgroundView backgroundView = this.backgroundView;
        return backgroundView == null || (anonymousClass1 = backgroundView.imageView) == null || !anonymousClass1.touched;
    }

    @Override
    public final View createView(Context context) {
        int i = 2;
        this.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda18(this, 5);
        int i2 = 1;
        this.hasOwnBackground = true;
        int i3 = 0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.strokePaint;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int color = Theme.getColor(null, Theme.key_premiumGradient4, false);
        int color2 = Theme.getColor(null, Theme.key_premiumGradient3, false);
        int i4 = Theme.key_premiumGradient2;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{color, color2, Theme.getColor(null, i4, false), Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient0, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.shader = linearGradient2;
        linearGradient2.setLocalMatrix(this.matrix);
        this.gradientPaint.setShader(this.shader);
        this.dummyCell = new PremiumFeatureCell(context, null);
        this.dummyTierCell = new PremiumTierCell(context);
        ArrayList arrayList = this.premiumFeatures;
        arrayList.clear();
        ArrayList arrayList2 = this.morePremiumFeatures;
        arrayList2.clear();
        int i5 = this.type;
        if (i5 == 0) {
            fillPremiumFeaturesList(this.currentAccount, arrayList);
        } else {
            fillBusinessFeaturesList(this.currentAccount, arrayList, false);
            fillBusinessFeaturesList(this.currentAccount, arrayList2, true);
            QuickRepliesController.getInstance(this.currentAccount).load(null, true);
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
            public final Paint backgroundPaint = new Paint(1);
            public boolean iconInterceptedTouch;
            public boolean listInterceptedTouch;

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                int i6 = Build.VERSION.SDK_INT;
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                if (i6 >= 31 && premiumPreviewFragment.scrollableViewNoiseSuppressor != null) {
                    premiumPreviewFragment.blur3_InvalidateBlur$7();
                }
                if (!premiumPreviewFragment.isDialogVisible) {
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
                View viewFindViewByPosition = premiumPreviewFragment.listView.getLayoutManager() != null ? premiumPreviewFragment.listView.getLayoutManager().findViewByPosition(0) : null;
                premiumPreviewFragment.currentYOffset = viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getBottom();
                int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) premiumPreviewFragment).actionBar.getBottom();
                float f3 = 1.0f - ((premiumPreviewFragment.currentYOffset - iDp) / (premiumPreviewFragment.firstViewHeight - iDp));
                premiumPreviewFragment.totalProgress = f3;
                premiumPreviewFragment.totalProgress = Utilities.clamp(f3, 1.0f, 0.0f);
                int iDp2 = AndroidUtilities.dp(16.0f) + ((BaseFragment) premiumPreviewFragment).actionBar.getBottom();
                if (premiumPreviewFragment.currentYOffset < iDp2) {
                    premiumPreviewFragment.currentYOffset = iDp2;
                }
                float f4 = premiumPreviewFragment.progressToFull;
                premiumPreviewFragment.progressToFull = 0.0f;
                if (premiumPreviewFragment.currentYOffset < AndroidUtilities.dp(30.0f) + iDp2) {
                    premiumPreviewFragment.progressToFull = ((AndroidUtilities.dp(30.0f) + iDp2) - premiumPreviewFragment.currentYOffset) / AndroidUtilities.dp(30.0f);
                }
                if (premiumPreviewFragment.isLandscapeMode) {
                    premiumPreviewFragment.progressToFull = 1.0f;
                    premiumPreviewFragment.totalProgress = 1.0f;
                }
                if (f4 != premiumPreviewFragment.progressToFull) {
                    premiumPreviewFragment.listView.invalidate();
                }
                float fMax = Math.max((((((((BaseFragment) premiumPreviewFragment).actionBar.getMeasuredHeight() - premiumPreviewFragment.statusBarHeight) - premiumPreviewFragment.backgroundView.titleView.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.statusBarHeight) - premiumPreviewFragment.backgroundView.getTop()) - premiumPreviewFragment.backgroundView.titleView.getTop(), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(premiumPreviewFragment.backgroundView.tierListView.getVisibility() == 0 ? 24.0f : 16.0f) + (premiumPreviewFragment.currentYOffset - ((premiumPreviewFragment.backgroundView.getMeasuredHeight() + ((BaseFragment) premiumPreviewFragment).actionBar.getMeasuredHeight()) - premiumPreviewFragment.statusBarHeight)));
                float fDp = ((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f);
                premiumPreviewFragment.backgroundView.setTranslationY(fMax);
                premiumPreviewFragment.backgroundView.imageView.setTranslationY(fDp + AndroidUtilities.dp(premiumPreviewFragment.type == 1 ? 9.0f : 16.0f));
                float f5 = premiumPreviewFragment.totalProgress;
                float fM = DiffUtil.m(1.0f, f5, 0.4f, 0.6f);
                float f6 = 1.0f - (f5 > 0.5f ? (f5 - 0.5f) / 0.5f : 0.0f);
                premiumPreviewFragment.backgroundView.imageView.setScaleX(fM);
                premiumPreviewFragment.backgroundView.imageView.setScaleY(fM);
                premiumPreviewFragment.backgroundView.imageView.setAlpha(f6);
                premiumPreviewFragment.backgroundView.subtitleView.setAlpha(f6);
                premiumPreviewFragment.backgroundView.tierListView.setAlpha(f6);
                premiumPreviewFragment.particlesView.setAlpha(1.0f - premiumPreviewFragment.totalProgress);
                StarParticlesView starParticlesView = premiumPreviewFragment.particlesView;
                starParticlesView.setTranslationY(premiumPreviewFragment.backgroundView.imageFrameLayout.getY() + premiumPreviewFragment.backgroundView.getY() + ((-(starParticlesView.getMeasuredHeight() - premiumPreviewFragment.backgroundView.imageView.getMeasuredWidth())) / 2.0f));
                float fDp2 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.backgroundView.titleView.getLeft();
                float f7 = premiumPreviewFragment.totalProgress;
                premiumPreviewFragment.backgroundView.titleView.setTranslationX((1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (f7 > 0.3f ? (f7 - 0.3f) / 0.7f : 0.0f))) * fDp2);
                BackgroundView backgroundView = premiumPreviewFragment.backgroundView;
                backgroundView.imageView.mRenderer.gradientStartX = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.progress) + (premiumPreviewFragment.backgroundView.imageFrameLayout.getX() + backgroundView.getX())) / getMeasuredWidth();
                BackgroundView backgroundView2 = premiumPreviewFragment.backgroundView;
                backgroundView2.imageView.mRenderer.gradientStartY = (premiumPreviewFragment.backgroundView.imageFrameLayout.getY() + backgroundView2.getY()) / getMeasuredHeight();
                if (!premiumPreviewFragment.isDialogVisible) {
                    invalidate();
                    premiumPreviewFragment.buttonContainerInternal.invalidate();
                    premiumPreviewFragment.buttonContainer.invalidate();
                }
                PremiumGradient.PremiumGradientTools premiumGradientTools = premiumPreviewFragment.gradientTools;
                premiumGradientTools.gradientMatrix(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.progress, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                boolean z = premiumPreviewFragment.whiteBackground;
                if (z) {
                    Paint paint2 = this.backgroundPaint;
                    int i7 = Theme.key_windowBackgroundGray;
                    paint2.setColor(premiumPreviewFragment.getThemedColor(i7));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
                    if (premiumPreviewFragment.progressToFull <= 0.0f || ((BaseFragment) premiumPreviewFragment).actionBar == null) {
                        canvas2 = canvas;
                    } else {
                        paint2.setColor(ColorUtils.blendARGB(premiumPreviewFragment.progressToFull, premiumPreviewFragment.getThemedColor(i7), premiumPreviewFragment.getThemedColor(Theme.key_windowBackgroundWhite)));
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) premiumPreviewFragment).actionBar.getHeight(), paint2);
                    }
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), premiumGradientTools.paint);
                }
                super.dispatchDraw(canvas);
                if (premiumPreviewFragment.buttonContainer.getVisibility() != 0) {
                    premiumPreviewFragment.navbarProtectionDrawable.setFadeHeight(premiumPreviewFragment.insets.bottom, false);
                    premiumPreviewFragment.navbarProtectionDrawable.setBounds(0, getHeight() - premiumPreviewFragment.insets.bottom, getWidth(), getHeight());
                    premiumPreviewFragment.navbarProtectionDrawable.draw(canvas2);
                }
                if (((BaseFragment) premiumPreviewFragment).parentLayout == null || !z) {
                    return;
                }
                ((ActionBarLayout) ((BaseFragment) premiumPreviewFragment).parentLayout).drawHeaderShadow(canvas2, (int) (premiumPreviewFragment.progressToFull * 255.0f), ((BaseFragment) premiumPreviewFragment).actionBar.getBottom());
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                float x = premiumPreviewFragment.backgroundView.imageFrameLayout.getX() + premiumPreviewFragment.backgroundView.getX();
                float y = premiumPreviewFragment.backgroundView.imageFrameLayout.getY() + premiumPreviewFragment.backgroundView.getY();
                RectF rectF = AndroidUtilities.rectTmp;
                BackgroundView.AnonymousClass1 anonymousClass1 = premiumPreviewFragment.backgroundView.imageView;
                float measuredWidth = (anonymousClass1 == null ? 0 : anonymousClass1.getMeasuredWidth()) + x;
                BackgroundView.AnonymousClass1 anonymousClass2 = premiumPreviewFragment.backgroundView.imageView;
                rectF.set(x, y, measuredWidth, (anonymousClass2 == null ? 0 : anonymousClass2.getMeasuredHeight()) + y);
                if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.iconInterceptedTouch) && !premiumPreviewFragment.listView.scrollingByUser) {
                    motionEvent.offsetLocation(-x, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.iconInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.iconInterceptedTouch = false;
                    }
                    premiumPreviewFragment.backgroundView.imageView.dispatchTouchEvent(motionEvent);
                    return true;
                }
                float x2 = premiumPreviewFragment.backgroundView.tierListView.getX() + premiumPreviewFragment.backgroundView.getX();
                float y2 = premiumPreviewFragment.backgroundView.tierListView.getY() + premiumPreviewFragment.backgroundView.getY();
                rectF.set(x2, y2, premiumPreviewFragment.backgroundView.tierListView.getWidth() + x2, premiumPreviewFragment.backgroundView.tierListView.getHeight() + y2);
                if (premiumPreviewFragment.progressToFull < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.listInterceptedTouch) && !premiumPreviewFragment.listView.scrollingByUser)) {
                    motionEvent.offsetLocation(-x2, -y2);
                    if (motionEvent.getAction() == 0) {
                        this.listInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.listInterceptedTouch = false;
                    }
                    premiumPreviewFragment.backgroundView.tierListView.dispatchTouchEvent(motionEvent);
                    if (this.listInterceptedTouch) {
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z, int i6, int i7, int i8, int i9) {
                super.onLayout(z, i6, i7, i8, i9);
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                BackgroundView.AnonymousClass1 anonymousClass1 = premiumPreviewFragment.backgroundView.imageView;
                anonymousClass1.mRenderer.gradientScaleX = anonymousClass1.getMeasuredWidth() / getMeasuredWidth();
                BackgroundView.AnonymousClass1 anonymousClass2 = premiumPreviewFragment.backgroundView.imageView;
                anonymousClass2.mRenderer.gradientScaleY = anonymousClass2.getMeasuredHeight() / getMeasuredHeight();
                BackgroundView backgroundView = premiumPreviewFragment.backgroundView;
                backgroundView.imageView.mRenderer.gradientStartX = (premiumPreviewFragment.backgroundView.imageView.getX() + backgroundView.getX()) / getMeasuredWidth();
                BackgroundView backgroundView2 = premiumPreviewFragment.backgroundView;
                backgroundView2.imageView.mRenderer.gradientStartY = (premiumPreviewFragment.backgroundView.imageView.getY() + backgroundView2.getY()) / getMeasuredHeight();
            }

            @Override
            public final void onMeasure(int i6, int i7) {
                int iDp = 0;
                boolean z = View.MeasureSpec.getSize(i6) > View.MeasureSpec.getSize(i7);
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.isLandscapeMode = z;
                premiumPreviewFragment.statusBarHeight = AndroidUtilities.statusBarHeight;
                premiumPreviewFragment.backgroundView.measure(i6, View.MeasureSpec.makeMeasureSpec(0, 0));
                premiumPreviewFragment.particlesView.getLayoutParams().height = premiumPreviewFragment.backgroundView.getMeasuredHeight();
                FrameLayout frameLayout = premiumPreviewFragment.buttonContainer;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    iDp = AndroidUtilities.dp(68.0f);
                }
                FillLastLinearLayoutManager fillLastLinearLayoutManager = premiumPreviewFragment.layoutManager;
                fillLastLinearLayoutManager.additionalHeight = (premiumPreviewFragment.statusBarHeight + iDp) - AndroidUtilities.dp(16.0f);
                fillLastLinearLayoutManager.calcLastItemHeight$1();
                premiumPreviewFragment.layoutManager.minimumHeight = iDp;
                super.onMeasure(i6, i7);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
                    premiumPreviewFragment.updateBackgroundImage();
                }
            }

            @Override
            public final void onSizeChanged(int i6, int i7, int i8, int i9) {
                PremiumPreviewFragment premiumPreviewFragment;
                super.onSizeChanged(i6, i7, i8, i9);
                int i10 = 0;
                int measuredHeight = 0;
                while (true) {
                    premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (i10 >= premiumPreviewFragment.premiumFeatures.size()) {
                        break;
                    }
                    PremiumFeatureCell premiumFeatureCell = premiumPreviewFragment.dummyCell;
                    ArrayList arrayList3 = premiumPreviewFragment.premiumFeatures;
                    premiumFeatureCell.setData((PremiumFeatureData) arrayList3.get(i10), false);
                    premiumPreviewFragment.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                    ((PremiumFeatureData) arrayList3.get(i10)).yOffset = measuredHeight;
                    measuredHeight += premiumPreviewFragment.dummyCell.getMeasuredHeight();
                    i10++;
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList4 = premiumPreviewFragment.morePremiumFeatures;
                    if (i11 >= arrayList4.size()) {
                        premiumPreviewFragment.totalGradientHeight = measuredHeight;
                        return;
                    }
                    premiumPreviewFragment.dummyCell.setData((PremiumFeatureData) arrayList4.get(i11), false);
                    premiumPreviewFragment.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                    ((PremiumFeatureData) arrayList4.get(i11)).yOffset = measuredHeight;
                    measuredHeight += premiumPreviewFragment.dummyCell.getMeasuredHeight();
                    i11++;
                }
            }
        };
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        AnonymousClass2 anonymousClass2 = this.contentView;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.iBlur3Factory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = anonymousClass2;
        ViewPositionWatcher viewPositionWatcher2 = new ViewPositionWatcher(this.contentView);
        AnonymousClass2 anonymousClass3 = this.contentView;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = this.iBlur3FactoryBg;
        blurredBackgroundDrawableViewFactory2.viewPositionWatcher = viewPositionWatcher2;
        blurredBackgroundDrawableViewFactory2.parent = anonymousClass3;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setClipToOutline(true);
        this.listView.setOutlineProvider(new AnonymousClass3(this, i3));
        this.listView.addEdgeEffectListener(new PremiumPreviewFragment$$ExternalSyntheticLambda4(this, i3));
        this.listView.setCaptureSectionsDecoratorAllowed(true);
        this.listView.setSections(true);
        this.listView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(this.listView, (AndroidUtilities.dp(68.0f) + this.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView2.setLayoutManager(fillLastLinearLayoutManager);
        this.layoutManager.fixedLastItemHeight = true;
        this.listView.setAdapter(new Adapter());
        this.listView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 4));
        this.backgroundView = new BackgroundView(context);
        StarParticlesView starParticlesView = new StarParticlesView(context);
        this.particlesView = starParticlesView;
        starParticlesView.setClipWithGradient();
        if (i5 == 1) {
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
                drawable2.colorKey = i4;
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
        setStarParticlesView(this.particlesView);
        addView(this.particlesView, LayoutHelper.createFrame(-2.0f, -1));
        addView(this.backgroundView, LayoutHelper.createFrame(-2.0f, -1));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 25));
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.buttonContainerInternal = new FrameLayout(context);
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), context, getResourceProvider(), false);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.nonClickable = true;
        premiumButtonView.setClickable(false);
        premiumButtonView.buttonLayout.setClickable(false);
        premiumButtonView.setStateListAnimator(null);
        updateButtonText(false);
        this.buttonContainer = new FrameLayout(context);
        this.buttonContainerInternal.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.buttonContainerInternal.addView(this.premiumButtonView, LayoutHelper.createFrame(-1.0f, -1));
        View view = this.buttonContainerInternal;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(view, null, false);
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(this.resourceProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(20);
        int i6 = 553648127;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i6, -1, i);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i6, i3, i);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(83886079, 805306368, i);
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
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory.create(this.buttonContainer, null, false));
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(40.0f), false);
        this.navbarProtectionDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory.create(this.contentView, null, false));
        this.buttonContainer.setBackground(blurredBackgroundWithFadeDrawable);
        if (getUserConfig().isClientActivated()) {
            addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
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
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 13));
        this.actionBar.setForceSkipTouches(true);
        addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        updateColors$6();
        updateRows$13();
        BackgroundView.AnonymousClass1 anonymousClass1 = this.backgroundView.imageView;
        GLIconRenderer gLIconRenderer = anonymousClass1.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.angleX = -180.0f;
            AndroidUtilities.runOnUIThread(new GLIconTextureView.AnonymousClass2(anonymousClass1, i2), 200L);
        }
        if (this.forcePremium) {
            AndroidUtilities.runOnUIThread(new PremiumPreviewFragment$$ExternalSyntheticLambda4(this, i), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        sentShowScreenStat(this.source);
        View view2 = this.fragmentView;
        PhotoViewer$$ExternalSyntheticLambda115 photoViewer$$ExternalSyntheticLambda115 = new PhotoViewer$$ExternalSyntheticLambda115(this, 24);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view2, photoViewer$$ExternalSyntheticLambda115);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            updateButtonText(false);
            this.backgroundView.updatePremiumTiers();
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged || i == NotificationCenter.premiumPromoUpdated) {
            this.backgroundView.updateText();
            this.backgroundView.updatePremiumTiers();
            updateRows$13();
            this.listView.getAdapter().notifyDataSetChanged();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda9(11, this), Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, Theme.key_premiumGradientBackgroundOverlay, Theme.key_premiumStarGradient1, Theme.key_premiumStarGradient2, Theme.key_premiumStartSmallStarsColor, Theme.key_premiumStartSmallStarsColor2);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.whiteBackground;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void lambda$createView$5$1(int i, View view) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        PremiumFeatureCell premiumFeatureCell;
        int i2;
        int iCenterX;
        int i3;
        boolean z;
        int i4;
        if (getUserConfig().isClientActivated()) {
            if (i == this.showAdsRow) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                if (userFull == null) {
                    return;
                }
                TextCell textCell = (TextCell) view;
                textCell.setChecked(!textCell.isChecked());
                userFull.sponsored_enabled = textCell.isChecked();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                getConnectionsManager().sendRequest(togglesponsoredmessages, new LinkManager$$ExternalSyntheticLambda3(this, 19));
                getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof PremiumFeatureCell) {
                PremiumFeatureCell premiumFeatureCell2 = (PremiumFeatureCell) view;
                int i5 = this.type;
                SubscriptionTier subscriptionTier = null;
                if (i5 != 1 || !getUserConfig().isPremium()) {
                    sentShowFeaturePreview(this.currentAccount, premiumFeatureCell2.data.type);
                    int i6 = this.selectedTierIndex;
                    if (i6 >= 0) {
                        ArrayList arrayList = this.subscriptionTiers;
                        if (i6 < arrayList.size()) {
                            subscriptionTier = (SubscriptionTier) arrayList.get(this.selectedTierIndex);
                        }
                    }
                    showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), this.currentAccount, i5 == 1, premiumFeatureCell2.data.type, false, subscriptionTier));
                    return;
                }
                int i7 = premiumFeatureCell2.data.type;
                if (i7 == 29) {
                    presentFragment(new org.telegram.ui.Business.LocationActivity());
                    return;
                }
                if (i7 == 32) {
                    presentFragment(new GreetMessagesActivity());
                    return;
                }
                if (i7 == 33) {
                    AwayMessagesActivity awayMessagesActivity = new AwayMessagesActivity(null);
                    awayMessagesActivity.shiftDp = -4;
                    presentFragment(awayMessagesActivity);
                    return;
                }
                if (i7 == 30) {
                    presentFragment(new OpeningHoursActivity());
                    return;
                }
                if (i7 == 34) {
                    presentFragment(new ChatbotsActivity());
                    return;
                }
                if (i7 == 31) {
                    presentFragment(new QuickRepliesActivity());
                    return;
                }
                if (i7 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                    bundle.putInt("type", 1);
                    presentFragment(new MediaActivity(bundle, null));
                    return;
                }
                if (i7 != 12) {
                    if (i7 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.highlightTags = true;
                        presentFragment(filtersSetupActivity);
                        return;
                    } else if (i7 == 36) {
                        presentFragment(new BusinessIntroActivity());
                        return;
                    } else {
                        if (i7 == 37) {
                            presentFragment(new BusinessLinksActivity());
                            return;
                        }
                        return;
                    }
                }
                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(getUserConfig().getCurrentUser());
                OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = new OAuthSheet$$ExternalSyntheticLambda18(19, this, premiumFeatureCell2);
                if (this.selectAnimatedEmojiDialog == null) {
                    SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
                    boolean z2 = ((float) (premiumFeatureCell2.getHeight() + premiumFeatureCell2.getTop())) > ((float) this.listView.getMeasuredHeight()) / 2.0f;
                    int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = premiumFeatureCell2.imageDrawable;
                    if (swapAnimatedEmojiDrawable2 != null) {
                        Drawable[] drawableArr = swapAnimatedEmojiDrawable2.drawables;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof AnimatedEmojiDrawable) {
                                ((AnimatedEmojiDrawable) drawable).removeView(swapAnimatedEmojiDrawable2);
                            }
                            drawableArr[1] = null;
                        }
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = premiumFeatureCell2.imageDrawable;
                        if (swapAnimatedEmojiDrawable3 != null) {
                            swapAnimatedEmojiDrawable3.play();
                            premiumFeatureCell2.updateImageBounds();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(premiumFeatureCell2.imageDrawable.getBounds());
                            int iDp = z2 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin : (-(premiumFeatureCell2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
                            int i8 = iDp;
                            swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
                            i2 = i8;
                            premiumFeatureCell = premiumFeatureCell2;
                        } else {
                            swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
                            premiumFeatureCell = premiumFeatureCell2;
                        }
                        if (z2) {
                            i3 = 12;
                        } else {
                            i3 = 0;
                        }
                        z = z2;
                        Activity parentActivity = getParentActivity();
                        Integer numValueOf = Integer.valueOf(iCenterX);
                        Theme.ResourcesProvider resourceProvider = getResourceProvider();
                        if (z) {
                            i4 = 24;
                        } else {
                            i4 = 16;
                        }
                        int i9 = i2;
                        ?? r0 = new SelectAnimatedEmojiDialog(this, parentActivity, numValueOf, i3, resourceProvider, i4, oAuthSheet$$ExternalSyntheticLambda18, selectAnimatedEmojiDialogWindowArr) {
                            public final OAuthSheet$$ExternalSyntheticLambda18 val$onSet;
                            public final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] val$popup;

                            {
                                this.val$onSet = oAuthSheet$$ExternalSyntheticLambda18;
                                this.val$popup = selectAnimatedEmojiDialogWindowArr;
                                int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourceProvider);
                            }

                            @Override
                            public final float getScrimDrawableTranslationY() {
                                return 0.0f;
                            }

                            @Override
                            public final void onEmojiSelected(View view2, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                                this.val$onSet.run(l, num);
                                SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = this.val$popup[0];
                                if (selectAnimatedEmojiDialogWindow != null) {
                                    PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                                    selectAnimatedEmojiDialogWindow.dismiss();
                                }
                            }
                        };
                        r0.useAccentForPlus = true;
                        r0.setSelected(emojiStatusDocumentId);
                        r0.setSaveState(3);
                        r0.setScrimDrawable(swapAnimatedEmojiDrawable, premiumFeatureCell);
                        ?? r2 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r0) {
                            @Override
                            public final void dismiss() {
                                super.dismiss();
                                PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                            }
                        };
                        this.selectAnimatedEmojiDialog = r2;
                        selectAnimatedEmojiDialogWindowArr[0] = r2;
                        r2.showAsDropDown(premiumFeatureCell2, 0, i9, 53);
                        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
                    }
                    swapAnimatedEmojiDrawable = null;
                    premiumFeatureCell = null;
                    i2 = 0;
                    iCenterX = 0;
                    if (z2) {
                        i3 = 12;
                    } else {
                        i3 = 0;
                    }
                    z = z2;
                    Activity parentActivity2 = getParentActivity();
                    Integer numValueOf2 = Integer.valueOf(iCenterX);
                    Theme.ResourcesProvider resourceProvider2 = getResourceProvider();
                    if (z) {
                        i4 = 24;
                    } else {
                        i4 = 16;
                    }
                    int i10 = i2;
                    AnonymousClass8 r1 = new SelectAnimatedEmojiDialog(this, parentActivity2, numValueOf2, i3, resourceProvider2, i4, oAuthSheet$$ExternalSyntheticLambda18, selectAnimatedEmojiDialogWindowArr) {
                        public final OAuthSheet$$ExternalSyntheticLambda18 val$onSet;
                        public final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] val$popup;

                        {
                            this.val$onSet = oAuthSheet$$ExternalSyntheticLambda18;
                            this.val$popup = selectAnimatedEmojiDialogWindowArr;
                            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourceProvider2);
                        }

                        @Override
                        public final float getScrimDrawableTranslationY() {
                            return 0.0f;
                        }

                        @Override
                        public final void onEmojiSelected(View view2, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                            this.val$onSet.run(l, num);
                            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = this.val$popup[0];
                            if (selectAnimatedEmojiDialogWindow != null) {
                                PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                                selectAnimatedEmojiDialogWindow.dismiss();
                            }
                        }
                    };
                    r1.useAccentForPlus = true;
                    r1.setSelected(emojiStatusDocumentId);
                    r1.setSaveState(3);
                    r1.setScrimDrawable(swapAnimatedEmojiDrawable, premiumFeatureCell);
                    ?? r3 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r1) {
                        @Override
                        public final void dismiss() {
                            super.dismiss();
                            PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                        }
                    };
                    this.selectAnimatedEmojiDialog = r3;
                    selectAnimatedEmojiDialogWindowArr[0] = r3;
                    r3.showAsDropDown(premiumFeatureCell2, 0, i10, 53);
                    selectAnimatedEmojiDialogWindowArr[0].dimBehind();
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        FrameLayout frameLayout = this.settingsView;
        if (frameLayout == null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 5));
        return false;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        BackgroundView.AnonymousClass1 anonymousClass1;
        super.onDialogDismiss(dialog);
        if (this.isDialogVisible) {
            this.isDialogVisible = false;
            BackgroundView backgroundView = this.backgroundView;
            if (backgroundView != null && (anonymousClass1 = backgroundView.imageView) != null) {
                anonymousClass1.setDialogVisible(false);
            }
            this.particlesView.setPaused(false);
            invalidate();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override
    public final void onPause() {
        BackgroundView.AnonymousClass1 anonymousClass1;
        super.onPause();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null && (anonymousClass1 = backgroundView.imageView) != null) {
            anonymousClass1.setDialogVisible(true);
        }
        StarParticlesView starParticlesView = this.particlesView;
        if (starParticlesView != null) {
            starParticlesView.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        BackgroundView.AnonymousClass1 anonymousClass1;
        super.onResume();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null && (anonymousClass1 = backgroundView.imageView) != null) {
            anonymousClass1.setPaused(false);
            setDialogVisible(false);
        }
        this.particlesView.setPaused(false);
        setBulletinDelegate(new ChatActivity.AnonymousClass103(this, 14));
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        BackgroundView.AnonymousClass1 anonymousClass1;
        Dialog dialogShowDialog = super.showDialog(dialog);
        boolean z = dialogShowDialog != null;
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            BackgroundView backgroundView = this.backgroundView;
            if (backgroundView != null && (anonymousClass1 = backgroundView.imageView) != null) {
                anonymousClass1.setDialogVisible(z);
            }
            this.particlesView.setPaused(z);
            invalidate();
        }
        return dialogShowDialog;
    }

    public final void updateBackgroundImage() {
        BackgroundView backgroundView;
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || (backgroundView = this.backgroundView) == null || backgroundView.imageView == null) {
            return;
        }
        if (this.whiteBackground) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawColor(ColorUtils.blendARGB(0.5f, getThemedColor(Theme.key_premiumGradient2), getThemedColor(Theme.key_dialogBackground)));
            setBackgroundBitmap(bitmapCreateBitmap);
            return;
        }
        PremiumGradient.PremiumGradientTools premiumGradientTools = this.gradientTools;
        premiumGradientTools.gradientMatrix(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        Canvas canvas = this.gradientCanvas;
        canvas.save();
        canvas.scale(100.0f / getMeasuredWidth(), 100.0f / getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), premiumGradientTools.paint);
        canvas.restore();
        setBackgroundBitmap(this.gradientTextureBitmap);
    }

    public final void updateButtonText(boolean z) {
        if (this.premiumButtonView == null) {
            return;
        }
        boolean zIsPremium = getUserConfig().isPremium();
        ArrayList arrayList = this.subscriptionTiers;
        if (!zIsPremium || this.currentSubscriptionTier == null || this.selectedTierIndex >= arrayList.size() || ((SubscriptionTier) arrayList.get(this.selectedTierIndex)).subscriptionOption.months >= this.currentSubscriptionTier.subscriptionOption.months) {
            if (LocaleController.isRTL) {
                z = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.selectedTierIndex < arrayList.size()) {
                this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, (SubscriptionTier) arrayList.get(this.selectedTierIndex)), null, z);
                final int i = 0;
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener(this) {
                    public final PremiumPreviewFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i) {
                            case 0:
                                PremiumPreviewFragment premiumPreviewFragment = this.f$0;
                                premiumPreviewFragment.getClass();
                                PremiumPreviewFragment.buyPremium(premiumPreviewFragment, null, "settings", null);
                                return;
                            default:
                                PremiumPreviewFragment premiumPreviewFragment2 = this.f$0;
                                PremiumPreviewFragment.SubscriptionTier subscriptionTier = (PremiumPreviewFragment.SubscriptionTier) premiumPreviewFragment2.subscriptionTiers.get(premiumPreviewFragment2.selectedTierIndex);
                                PremiumPreviewFragment.SubscriptionTier subscriptionTier2 = premiumPreviewFragment2.currentSubscriptionTier;
                                BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams = null;
                                if (subscriptionTier2 != null && (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) != null && tL_premiumSubscriptionOption.transaction != null) {
                                    String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                    boolean z2 = true;
                                    if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                        z2 = false;
                                    }
                                    boolean zIsEmpty = TextUtils.isEmpty(null);
                                    if (z2 && !zIsEmpty) {
                                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    }
                                    if (!z2 && zIsEmpty) {
                                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    }
                                    billingFlowParams$SubscriptionUpdateParams = new BillingFlowParams$SubscriptionUpdateParams();
                                    billingFlowParams$SubscriptionUpdateParams.zza = lastPremiumToken;
                                    billingFlowParams$SubscriptionUpdateParams.zzc = 5;
                                }
                                PremiumPreviewFragment.buyPremium(premiumPreviewFragment2, subscriptionTier, "settings", billingFlowParams$SubscriptionUpdateParams);
                                return;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.selectedTierIndex >= arrayList.size() || ((SubscriptionTier) arrayList.get(this.selectedTierIndex)).googlePlayProductDetails == null)) {
                this.premiumButtonView.setButton(LocaleController.getString(R.string.Loading), null, z);
                this.buttonContainerInternal.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(19));
                this.premiumButtonView.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.selectedTierIndex >= arrayList.size()) {
                    return;
                }
                this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, (SubscriptionTier) arrayList.get(this.selectedTierIndex)), null, z);
                final int i2 = 1;
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener(this) {
                    public final PremiumPreviewFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i2) {
                            case 0:
                                PremiumPreviewFragment premiumPreviewFragment = this.f$0;
                                premiumPreviewFragment.getClass();
                                PremiumPreviewFragment.buyPremium(premiumPreviewFragment, null, "settings", null);
                                return;
                            default:
                                PremiumPreviewFragment premiumPreviewFragment2 = this.f$0;
                                PremiumPreviewFragment.SubscriptionTier subscriptionTier = (PremiumPreviewFragment.SubscriptionTier) premiumPreviewFragment2.subscriptionTiers.get(premiumPreviewFragment2.selectedTierIndex);
                                PremiumPreviewFragment.SubscriptionTier subscriptionTier2 = premiumPreviewFragment2.currentSubscriptionTier;
                                BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams = null;
                                if (subscriptionTier2 != null && (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) != null && tL_premiumSubscriptionOption.transaction != null) {
                                    String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                    boolean z2 = true;
                                    if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                        z2 = false;
                                    }
                                    boolean zIsEmpty = TextUtils.isEmpty(null);
                                    if (z2 && !zIsEmpty) {
                                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    }
                                    if (!z2 && zIsEmpty) {
                                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    }
                                    billingFlowParams$SubscriptionUpdateParams = new BillingFlowParams$SubscriptionUpdateParams();
                                    billingFlowParams$SubscriptionUpdateParams.zza = lastPremiumToken;
                                    billingFlowParams$SubscriptionUpdateParams.zzc = 5;
                                }
                                PremiumPreviewFragment.buyPremium(premiumPreviewFragment2, subscriptionTier, "settings", billingFlowParams$SubscriptionUpdateParams);
                                return;
                        }
                    }
                });
                this.premiumButtonView.setFlickerDisabled(false);
            }
        }
    }

    public final void updateColors$6() {
        ActionBar actionBar;
        GLIconRenderer gLIconRenderer;
        if (this.backgroundView == null || (actionBar = this.actionBar) == null) {
            return;
        }
        boolean z = this.whiteBackground;
        actionBar.setItemsColor(Theme.getColor(null, z ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay, false), true);
        this.actionBar.setItemsColor(Theme.getColor(null, z ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay, false), false);
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_premiumGradientBackgroundOverlay;
        actionBar2.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 60), false);
        StarParticlesView.Drawable drawable = this.particlesView.drawable;
        int color = Theme.getColor(drawable.colorKey, drawable.resourcesProvider);
        if (drawable.lastColor != color) {
            drawable.lastColor = color;
            drawable.generateBitmaps();
        }
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null) {
            backgroundView.titleView.setTextColor(Theme.getColor(null, z ? Theme.key_windowBackgroundWhiteBlackText : i, false));
            TextView textView = this.backgroundView.subtitleView;
            if (z) {
                i = Theme.key_windowBackgroundWhiteBlackText;
            }
            textView.setTextColor(Theme.getColor(null, i, false));
            BackgroundView.AnonymousClass1 anonymousClass1 = this.backgroundView.imageView;
            if (anonymousClass1 != null && (gLIconRenderer = anonymousClass1.mRenderer) != null) {
                if (z) {
                    gLIconRenderer.colorKey1 = Theme.key_premiumCoinGradient1;
                    gLIconRenderer.colorKey2 = Theme.key_premiumCoinGradient2;
                }
                gLIconRenderer.updateColors();
            }
        }
        updateBackgroundImage();
    }

    public final void updateRows$13() {
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
        this.featuresStartRow = 1;
        int size = this.premiumFeatures.size() + 1;
        this.rowCount = size;
        this.featuresEndRow = size;
        int i = this.type;
        if (i == 1 && getUserConfig().isPremium()) {
            int i2 = this.rowCount;
            int i3 = i2 + 1;
            this.sectionRow = i2;
            int i4 = i2 + 2;
            this.rowCount = i4;
            this.moreHeaderRow = i3;
            this.moreFeaturesStartRow = i4;
            int size2 = this.morePremiumFeatures.size() + i4;
            this.rowCount = size2;
            this.moreFeaturesEndRow = size2;
        }
        int i5 = this.rowCount;
        this.statusRow = i5;
        this.rowCount = i5 + 2;
        this.lastPaddingRow = i5 + 1;
        if (i == 1 && getUserConfig().isPremium()) {
            int i6 = this.rowCount;
            this.showAdsHeaderRow = i6;
            this.showAdsRow = i6 + 1;
            this.rowCount = i6 + 3;
            this.showAdsInfoRow = i6 + 2;
        }
        FrameLayout frameLayout = this.buttonContainer;
        if (getUserConfig().isPremium() && ((subscriptionTier = this.currentSubscriptionTier) == null || subscriptionTier.subscriptionOption.months >= ((SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex)).subscriptionOption.months || this.forcePremium)) {
            z = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, false);
        int iDp = this.buttonContainer.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = this.layoutManager;
        fillLastLinearLayoutManager.additionalHeight = (this.statusBarHeight + iDp) - AndroidUtilities.dp(16.0f);
        fillLastLinearLayoutManager.calcLastItemHeight$1();
        this.layoutManager.minimumHeight = iDp;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}

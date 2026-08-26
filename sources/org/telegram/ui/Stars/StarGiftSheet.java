package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.app.NotificationCompatBuilder;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.internal.mlkit_vision_label.zzcv;
import com.google.common.base.Splitter;
import com.google.zxing.common.detector.MathUtils;
import j$.util.Map;
import j$.util.Map$Entry$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda124;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda155;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda296;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda464;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline1;
import org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda65;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetLayouted;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator$TextAlphaSpan;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.PasscodeView$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda132;
import org.telegram.ui.Gifts.GiftMessageBottomSheet;
import org.telegram.ui.Gifts.GiftMessageView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda6;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.GradientClip;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda63;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda0;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda20;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda66;
import org.telegram.ui.PeerColorActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda126;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda127;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda156;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda52;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda97;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda65;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stars.StarsReactionsSheet.Particles.Particle;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda5;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.iv.RichDetailsCell;

public class StarGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final ActionView actionView;
    public MessageSeenView.AnonymousClass3 adapter;
    public final LinkSpanDrawable.LinksTextView afterTableTextView;
    public final LinkSpanDrawable.LinksTextView beforeTableTextView;
    public final FrameLayout bottomBulletinContainer;
    public BoughtGiftCallback boughtGift;
    public final ButtonWithCounterView button;
    public final FrameLayout buttonContainer;
    public final View buttonShadow;
    public final CheckBox2 checkbox;
    public final LinearLayout checkboxLayout;
    public final View checkboxSeparator;
    public final TextView checkboxTextView;
    public final ContainerView container;
    public final AnonymousClass4 craftLayout;
    public HintView2 currentHintView;
    public View currentHintViewTextView;
    public PageTransition currentPage;
    public final long dialogId;
    public final FireworksOverlay fireworksOverlay;
    public boolean firstSet;
    public StarsController.IGiftsList giftsList;
    public ResaleGiftsFragment.SelectGiftSheet.State giftsToCraft;
    public final int[] heights;
    public final AnonymousClass4 infoLayout;
    public boolean isLearnMore;
    public Float lastTop;
    public AnonymousClass9 left;
    public ColoredImageSpan lockSpan;
    public MessageObject messageObject;
    public boolean messageObjectRepolled;
    public boolean messageObjectRepolling;
    public boolean myProfile;
    public boolean nextButtonCrafting;
    public ArrayList next_prices;
    public ProfileGiftsContainer$Page$$ExternalSyntheticLambda6 onGiftUpdatedListener;
    public boolean onlyWearInfo;
    public int overrideNextIndex;
    public View ownerTextView;
    public ArrayList prices;
    public boolean requesting_upgrade_form;
    public boolean resale;
    public AnonymousClass9 right;
    public Roller roller;
    public boolean rolling;
    public ArrayList sample_attributes;
    public TL_stars.SavedStarGift savedStarGift;
    public AnonymousClass11 shareAlert;
    public boolean shownWearInfo;
    public String slug;
    public TL_stars.TL_starGiftUnique slugStarGift;
    public final ColoredImageSpan[] starCached;
    public ValueAnimator switchingPagesAnimator;
    public final TableView tableView;
    public final StarGiftSheet$$ExternalSyntheticLambda3 tickUpgradePriceRunnable;
    public String title;
    public final TopView topView;
    public final FrameLayout underButtonContainer;
    public final LinkSpanDrawable.LinksTextView underButtonLinkTextView;
    public Boolean unsavedFromSavedStarGift;
    public final AffiliateProgramFragment.FeatureCell[] upgradeFeatureCells;
    public ColoredImageSpan upgradeIconSpan;
    public final AnonymousClass4 upgradeLayout;
    public UpgradePricesSheet upgradeSheet;
    public TLRPC.PaymentForm upgrade_form;
    public boolean upgradedOnce;
    public boolean userStarGiftRepolled;
    public boolean userStarGiftRepolling;
    public final AnonymousClass2 viewPager;
    public final AnonymousClass4 wearLayout;
    public final TextView wearTitle;

    public final class AnonymousClass13 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$done;
        public final int val$page;

        public AnonymousClass13(Object obj, int i, Object obj2, int i2) {
            this.$r8$classId = i2;
            this.this$0 = obj;
            this.val$page = i;
            this.val$done = obj2;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    StarGiftSheet starGiftSheet = (StarGiftSheet) this.this$0;
                    starGiftSheet.onSwitchedPage();
                    int i = this.val$page;
                    starGiftSheet.infoLayout.setVisibility(i == 0 ? 0 : 8);
                    starGiftSheet.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
                    starGiftSheet.wearLayout.setVisibility(i == 2 ? 0 : 8);
                    starGiftSheet.craftLayout.setVisibility(i == 3 ? 0 : 8);
                    starGiftSheet.updateUnderButtonContainer();
                    starGiftSheet.switchingPagesAnimator = null;
                    TodoItemMenu$$ExternalSyntheticLambda5 todoItemMenu$$ExternalSyntheticLambda5 = (TodoItemMenu$$ExternalSyntheticLambda5) this.val$done;
                    if (todoItemMenu$$ExternalSyntheticLambda5 != null) {
                        todoItemMenu$$ExternalSyntheticLambda5.run();
                    }
                    break;
                case 1:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    chatAttachAlert.currentAttachLayout.setAlpha(0.0f);
                    chatAttachAlert.currentAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) + this.val$page);
                    ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                    ChatAttachAlert.AnonymousClass2 anonymousClass2 = chatAttachAlert.ATTACH_ALERT_LAYOUT_TRANSLATION;
                    anonymousClass2.getClass();
                    anonymousClass2.setValue(attachAlertLayout, 1.0f);
                    chatAttachAlert.actionBar.setAlpha(0.0f);
                    SpringAnimation springAnimation = new SpringAnimation(chatAttachAlert.nextAttachLayout, DynamicAnimation.TRANSLATION_Y, 0.0f);
                    springAnimation.mSpring.setDampingRatio(0.75f);
                    springAnimation.mSpring.setStiffness(500.0f);
                    springAnimation.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, 5));
                    springAnimation.addEndListener(new PasscodeView$$ExternalSyntheticLambda15(3, this, (ChatAttachAlert$$ExternalSyntheticLambda7) this.val$done));
                    chatAttachAlert.viewChangeAnimator = springAnimation;
                    springAnimation.start();
                    break;
                default:
                    Splitter splitter = (Splitter) this.this$0;
                    ((RecyclerListView) splitter.strategy).scrollBy(0, this.val$page - ((int[]) this.val$done)[0]);
                    splitter.trimmer = null;
                    break;
            }
        }
    }

    public final class AnonymousClass2 extends ViewPagerFixed {
        public AnonymousClass2(Context context) {
            super(context, null);
        }

        @Override
        public final boolean canScroll(MotionEvent motionEvent) {
            PageTransition pageTransition = StarGiftSheet.this.currentPage;
            return pageTransition == null || pageTransition.is(0);
        }

        @Override
        public final void setTranslationX(View view, float f) {
            View childAt;
            ActionView actionView;
            ActionView actionView2;
            ActionView actionView3;
            if (getMeasuredWidth() <= 0) {
                view.setTranslationX(f);
                return;
            }
            float fClamp = Utilities.clamp(f / getMeasuredWidth(), 1.0f, -1.0f);
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            view.setTranslationX(((-fClamp) * 2.0f * ((BottomSheet) starGiftSheet).backgroundPaddingLeft) + f);
            view.setPivotX(fClamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * fClamp));
            view.setRotationY(fClamp * 10.0f);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() > 0) {
                    childAt = frameLayout.getChildAt(0);
                } else {
                    childAt = null;
                }
            } else {
                childAt = null;
            }
            AnonymousClass9 anonymousClass9 = starGiftSheet.left;
            if (anonymousClass9 != null && childAt == ((StarGiftSheet) anonymousClass9).container && (actionView3 = anonymousClass9.actionView) != null) {
                actionView3.invalidate();
            }
            if (childAt == starGiftSheet.container && (actionView2 = starGiftSheet.actionView) != null) {
                actionView2.invalidate();
            }
            AnonymousClass9 anonymousClass10 = starGiftSheet.right;
            if (anonymousClass10 == null || childAt != ((StarGiftSheet) anonymousClass10).container || (actionView = anonymousClass10.actionView) == null) {
                return;
            }
            actionView.invalidate();
        }

        @Override
        public final void swapViews() {
            super.swapViews();
            int i = this.currentPosition;
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            if (i != starGiftSheet.hasNeighbour(false)) {
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda5(9, this, this.currentPosition > starGiftSheet.hasNeighbour(false)));
            }
        }
    }

    public final class AnonymousClass9 extends StarGiftSheet {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass9(ProfileGiftsContainer.Page page, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, int i2) {
            super(i, context, resourcesProvider, j, null);
            this.$r8$classId = i2;
            this.this$0 = page;
        }

        @Override
        public int getBottomInset() {
            switch (this.$r8$classId) {
                case 0:
                    return ((StarGiftSheet) this.this$0).getBottomInset();
                default:
                    return super.getBottomInset();
            }
        }

        @Override
        public BulletinFactory getBulletinFactory() {
            switch (this.$r8$classId) {
                case 1:
                    return BulletinFactory.of(((ProfileGiftsContainer.Page) this.this$0).parent.fragment);
                case 2:
                    return BulletinFactory.of(((ProfileGiftsContainer.Page) this.this$0).parent.fragment);
                case 3:
                    return BulletinFactory.of(((ProfileGiftsContainer.Page) this.this$0).parent.fragment);
                default:
                    return super.getBulletinFactory();
            }
        }

        public AnonymousClass9(StarGiftSheet starGiftSheet, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, View view) {
            super(i, context, resourcesProvider, j, view);
            this.$r8$classId = 0;
            this.this$0 = starGiftSheet;
        }
    }

    public interface BoughtGiftCallback {
        void onBoughtGift(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z);
    }

    public final class ContainerView extends FrameLayout {
        public final Paint backgroundPaint;
        public final Path path;
        public final RectF rect;

        public ContainerView(Context context) {
            super(context);
            this.rect = new RectF();
            this.backgroundPaint = new Paint(1);
            this.path = new Path();
            setWillNotDraw(false);
            setClipChildren(false);
            setClipToPadding(false);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            starGiftSheet.preDrawInternal(canvas, this);
            canvas.save();
            float pVar = top();
            float fDp = AndroidUtilities.dp(12.0f);
            RectF rectF = this.rect;
            rectF.set(((BottomSheet) starGiftSheet).backgroundPaddingLeft, pVar, getWidth() - ((BottomSheet) starGiftSheet).backgroundPaddingLeft, getHeight() + fDp);
            Paint paint = this.backgroundPaint;
            paint.setColor(starGiftSheet.getThemedColor(Theme.key_dialogBackground));
            Path path = this.path;
            path.rewind();
            path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
            canvas.drawPath(path, paint);
            super.dispatchDraw(canvas);
            updateTranslations();
            canvas.restore();
            BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = starGiftSheet.actionBar;
            if (anonymousClass4 == null || anonymousClass4.getVisibility() != 0 || anonymousClass4.getAlpha() <= 0.0f) {
                canvas2 = canvas;
            } else {
                if (anonymousClass4.getAlpha() < 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(anonymousClass4.getX(), anonymousClass4.getY(), anonymousClass4.getX() + anonymousClass4.getMeasuredWidth(), anonymousClass4.getY() + anonymousClass4.getMeasuredHeight(), (int) (anonymousClass4.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                    canvas2.save();
                    canvas2.clipRect(anonymousClass4.getX(), anonymousClass4.getY(), anonymousClass4.getX() + anonymousClass4.getMeasuredWidth(), anonymousClass4.getY() + anonymousClass4.getMeasuredHeight());
                }
                canvas2.translate(anonymousClass4.getX(), anonymousClass4.getY());
                anonymousClass4.draw(canvas2);
                canvas2.restore();
            }
            starGiftSheet.postDrawInternal(canvas2, this);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < top()) {
                StarGiftSheet starGiftSheet = StarGiftSheet.this;
                if (((BottomSheet) starGiftSheet).containerView.isAttachedToWindow()) {
                    starGiftSheet.lambda$showGiftOfferSheet$15();
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            if (view == starGiftSheet.actionBar) {
                return false;
            }
            if (view == starGiftSheet.actionView) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipPath(this.path);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }

        public final float height() {
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            return (starGiftSheet.currentPage.at(3) * starGiftSheet.craftLayout.getMeasuredHeight()) + (starGiftSheet.currentPage.at(2) * starGiftSheet.wearLayout.getMeasuredHeight()) + (starGiftSheet.currentPage.at(1) * starGiftSheet.upgradeLayout.getMeasuredHeight()) + (starGiftSheet.currentPage.at(0) * starGiftSheet.infoLayout.getMeasuredHeight()) + starGiftSheet.topView.getRealHeight() + 0.0f;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            MessageSeenView.AnonymousClass3 anonymousClass3 = starGiftSheet.adapter;
            if (anonymousClass3 != null) {
                anonymousClass3.setHeights(starGiftSheet.topView.getFinalHeight(), starGiftSheet.getBottomHeight() + ((starGiftSheet.currentPage.to(1) && starGiftSheet.underButtonContainer.getVisibility() == 0) ? starGiftSheet.underButtonContainer.getMeasuredHeight() : 0));
            }
            starGiftSheet.onSwitchedPage();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            int bottomInset = starGiftSheet.getBottomInset();
            int measuredHeight = 0;
            setPadding(0, 0, 0, bottomInset);
            starGiftSheet.topView.craftTopView.setPadding(0, 0, 0, bottomInset);
            int size = View.MeasureSpec.getSize(i2);
            starGiftSheet.contentHeight = size;
            int size2 = View.MeasureSpec.getSize(i);
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof HintView2) {
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                } else if (childAt == starGiftSheet.recyclerListView) {
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size - bottomInset, 1073741824));
                } else {
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size, Integer.MIN_VALUE));
                }
            }
            setMeasuredDimension(size2, size);
            MessageSeenView.AnonymousClass3 anonymousClass3 = starGiftSheet.adapter;
            if (anonymousClass3 != null) {
                int finalHeight = starGiftSheet.topView.getFinalHeight();
                int bottomHeight = starGiftSheet.getBottomHeight();
                if (starGiftSheet.currentPage.to(1) && starGiftSheet.underButtonContainer.getVisibility() == 0) {
                    measuredHeight = starGiftSheet.underButtonContainer.getMeasuredHeight();
                }
                anonymousClass3.setHeights(finalHeight, bottomHeight + measuredHeight);
            }
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
        }

        public final float top() {
            PageTransition pageTransition;
            float fMax = Math.max(0.0f, getHeight() - height());
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            for (int childCount = starGiftSheet.recyclerListView.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = starGiftSheet.recyclerListView.getChildAt(childCount);
                starGiftSheet.recyclerListView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    if (childAdapterPosition == 2) {
                        fMax = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                        break;
                    }
                    if (childAdapterPosition == 1) {
                        fMax = childAt.getY();
                        break;
                    }
                    if (childAdapterPosition == 0) {
                        fMax = childAt.getY() - starGiftSheet.topView.getRealHeight();
                        break;
                    }
                }
            }
            float fAt = (starGiftSheet.currentPage.at(4) * starGiftSheet.getBottomInset()) + fMax;
            Float f = starGiftSheet.lastTop;
            return (f == null || (pageTransition = starGiftSheet.currentPage) == null || pageTransition.progress >= 1.0f) ? fAt : AndroidUtilities.lerp(f.floatValue(), fAt, starGiftSheet.currentPage.progress);
        }

        public final void updateTranslations() {
            float pVar = top();
            StarGiftSheet starGiftSheet = StarGiftSheet.this;
            ActionView actionView = starGiftSheet.actionView;
            actionView.setTranslationY(pVar - actionView.getHeight());
            float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(pVar - starGiftSheet.actionView.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
            starGiftSheet.actionView.setAlpha(starGiftSheet.currentPage.at(0) * fClamp01);
            starGiftSheet.actionView.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, fClamp01));
            starGiftSheet.actionView.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, fClamp01));
            starGiftSheet.topView.setTranslationY(pVar);
            starGiftSheet.infoLayout.setTranslationY(starGiftSheet.topView.getRealHeight() + pVar);
            starGiftSheet.upgradeLayout.setTranslationY(starGiftSheet.topView.getRealHeight() + pVar);
            starGiftSheet.wearLayout.setTranslationY(starGiftSheet.topView.getRealHeight() + pVar);
            starGiftSheet.craftLayout.setTranslationY(starGiftSheet.topView.getRealHeight() + pVar);
            FrameLayout frameLayout = starGiftSheet.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
            AndroidUtilities.updateViewVisibilityAnimated(starGiftSheet.buttonShadow, starGiftSheet.recyclerListView.canScrollVertically(1));
        }
    }

    public final class GiftThemeReuseTopView extends View {
        public final Drawable drawable;
        public final StarGiftDrawableIcon giftDrawable;
        public final ImageReceiver userImageReceiver;

        public GiftThemeReuseTopView(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject) {
            super(context);
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, tL_starGiftUnique, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.patternsType = 3;
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            Drawable drawableMutate = context.getDrawable(R.drawable.chats_undo).mutate();
            this.drawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), PorterDuff.Mode.MULTIPLY));
            drawableMutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            int iDp = AndroidUtilities.dp(60.0f) + width;
            int iDp2 = AndroidUtilities.dp(60.0f) + height;
            StarGiftDrawableIcon starGiftDrawableIcon = this.giftDrawable;
            starGiftDrawableIcon.setBounds(width, height, iDp, iDp2);
            starGiftDrawableIcon.draw(canvas);
            canvas.save();
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.drawable.draw(canvas);
            canvas.restore();
            ImageReceiver imageReceiver = this.userImageReceiver;
            imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            imageReceiver.draw(canvas);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }
    }

    public final class PaymentFormState {
        public final AmountUtils$Amount amount;
        public final AmountUtils$Currency currency;
        public final TLRPC.TL_payments_paymentFormStarGift form;

        public PaymentFormState(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            this.currency = amountUtils$Currency;
            this.form = tL_payments_paymentFormStarGift;
            StarsController[][] starsControllerArr = StarsController.Instance;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i = 0;
            long j = 0;
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j += tL_labeledPrice.amount;
            }
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
            if (amountUtils$Currency == amountUtils$Currency2) {
                this.amount = AmountUtils$Amount.fromDecimal(j, amountUtils$Currency2);
                return;
            }
            AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
            if (amountUtils$Currency == amountUtils$Currency3) {
                this.amount = AmountUtils$Amount.fromNano(j, amountUtils$Currency3);
            } else {
                this.amount = AmountUtils$Amount.fromNano(0L, amountUtils$Currency2);
            }
        }
    }

    public final class ResaleBuyTransferAlert {
        public final AlertDialog alertDialog;
        public BalanceCloud balanceCloud;
        public final boolean canSwitchToTON;
        public final Context context;
        public final HorizontalRoundTabsLayout currencyTabsView;
        public final int currentAccount;
        public final long dialogId;
        public final HashMap forms;
        public final TL_stars.TL_starGiftUnique gift;
        public final String giftName;
        public Browser.Progress lastPositiveButtonProgress;
        public final HashSet loadingForms;
        public TextView positiveButton;
        public final Theme.ResourcesProvider resourcesProvider;
        public FrameLayout rootView;
        public AmountUtils$Currency selectedCurrency;
        public final TextView textInfoView;
        public HintView2 tonHint;

        public ResaleBuyTransferAlert(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.TL_starGiftUnique tL_starGiftUnique, PaymentFormState paymentFormState, int i, long j, String str, boolean z, Utilities.Callback2 callback2) {
            HashMap map = new HashMap();
            this.forms = map;
            this.loadingForms = new HashSet();
            this.context = context;
            this.gift = tL_starGiftUnique;
            this.dialogId = j;
            this.currentAccount = i;
            AmountUtils$Currency amountUtils$Currency = paymentFormState.currency;
            this.selectedCurrency = amountUtils$Currency;
            map.put(amountUtils$Currency, paymentFormState);
            this.resourcesProvider = resourcesProvider;
            this.giftName = str;
            boolean z2 = tL_starGiftUnique.resale_ton_only;
            this.canSwitchToTON = !z2;
            TLObject user = j >= 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(j)) : MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            FrameLayout frameLayout = new FrameLayout(context) {
                public final int[] c = new int[2];

                @Override
                public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                    FrameLayout frameLayout2;
                    super.onLayout(z3, i2, i3, i4, i5);
                    ResaleBuyTransferAlert resaleBuyTransferAlert = ResaleBuyTransferAlert.this;
                    HorizontalRoundTabsLayout horizontalRoundTabsLayout = resaleBuyTransferAlert.currencyTabsView;
                    if (horizontalRoundTabsLayout == null || horizontalRoundTabsLayout.linearLayout.getChildCount() < 2 || resaleBuyTransferAlert.tonHint == null || (frameLayout2 = resaleBuyTransferAlert.rootView) == null) {
                        return;
                    }
                    int[] iArr = this.c;
                    frameLayout2.getLocationInWindow(iArr);
                    float translationX = iArr[0] - resaleBuyTransferAlert.rootView.getTranslationX();
                    float translationY = iArr[1] - resaleBuyTransferAlert.rootView.getTranslationY();
                    HorizontalRoundTabsLayout horizontalRoundTabsLayout2 = resaleBuyTransferAlert.currencyTabsView;
                    View childAt = horizontalRoundTabsLayout2.linearLayout.getChildAt(1);
                    childAt.getLocationInWindow(iArr);
                    float translationX2 = iArr[0] - childAt.getTranslationX();
                    float translationY2 = iArr[1] - childAt.getTranslationY();
                    HintView2 hintView2 = resaleBuyTransferAlert.tonHint;
                    hintView2.setTranslationY(((translationY2 - translationY) - hintView2.getMeasuredHeight()) - horizontalRoundTabsLayout2.getMeasuredHeight());
                    resaleBuyTransferAlert.tonHint.setJointPx(0.0f, ((childAt.getMeasuredWidth() / 2.0f) + (translationX2 - translationX)) - AndroidUtilities.dp(12.0f));
                }
            };
            frameLayout.addView(linearLayoutM, LayoutHelper.createFrame(-2.0f, -1));
            if (z2) {
                this.currencyTabsView = null;
                TextView textView = new TextView(context);
                OKLCH.m(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider, textView, 14.0f);
                zzkg.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
                linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 17, 24, 4, 24, 4));
            } else {
                HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context, resourcesProvider);
                this.currencyTabsView = horizontalRoundTabsLayout;
                ArrayList arrayList = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
                horizontalRoundTabsLayout.setTabs(arrayList, new PhotoViewer$$ExternalSyntheticLambda156(this, 8));
                linearLayoutM.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(-2, -2, 1, 18, 0, 18, 12));
            }
            linearLayoutM.addView(new GiftTransferTopView(context, tL_starGiftUnique, user), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView2 = new TextView(context);
            this.textInfoView = textView2;
            OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView2, 16.0f);
            linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
            if (z) {
                TableView tableView = new TableView(context, resourcesProvider);
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                    tableView.addRow(LocaleController.getString(R.string.GiftValue2), zzil.m("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
                }
                linearLayoutM.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
            builder.setView(frameLayout);
            builder.setPositiveButton("_", new PassportActivity$$ExternalSyntheticLambda66(this, i, context, resourcesProvider, callback2, 6));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            this.alertDialog = builder.alertDialog;
        }

        public final void onUpdateCurrency(boolean z) {
            char c;
            String string;
            HintView2 hintView2;
            AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(amountUtils$Currency);
            TextView textView = this.textInfoView;
            textView.animate().alpha(paymentFormState != null ? 1.0f : 0.25f).start();
            textView.setEnabled(paymentFormState != null);
            this.positiveButton.setEnabled(paymentFormState != null);
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud.currency != amountUtils$Currency) {
                balanceCloud.currency = amountUtils$Currency;
                balanceCloud.updateBalance();
            }
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
            if (horizontalRoundTabsLayout != null) {
                horizontalRoundTabsLayout.setSelectedIndex(amountUtils$Currency == amountUtils$Currency2 ? 1 : 0, z);
            }
            if (amountUtils$Currency == amountUtils$Currency2 && (hintView2 = this.tonHint) != null && hintView2.shown) {
                hintView2.hide(true);
            }
            BalanceCloud balanceCloud2 = this.balanceCloud;
            AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
            if (balanceCloud2 != null) {
                if (amountUtils$Currency == amountUtils$Currency3) {
                    balanceCloud2.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 12));
                } else {
                    balanceCloud2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(19));
                }
            }
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null) {
                progress.cancel(false);
                this.lastPositiveButtonProgress = null;
            }
            int i = this.currentAccount;
            if (paymentFormState == null) {
                Browser.Progress progressMakeButtonLoading = this.alertDialog.makeButtonLoading(-1, false, false);
                this.lastPositiveButtonProgress = progressMakeButtonLoading;
                progressMakeButtonLoading.init();
                if (this.loadingForms.add(amountUtils$Currency)) {
                    StarsController.getInstance(i, amountUtils$Currency).getResellingGiftForm(this.gift, this.dialogId, null, true, new OAuthSheet$$ExternalSyntheticLambda13(28, this, amountUtils$Currency));
                    return;
                }
                return;
            }
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            long j = this.dialogId;
            boolean z2 = j == clientUserId;
            String str = this.giftName;
            AmountUtils$Currency amountUtils$Currency4 = paymentFormState.currency;
            AmountUtils$Amount amountUtils$Amount = paymentFormState.amount;
            if (amountUtils$Currency4 == amountUtils$Currency3) {
                c = 0;
                this.positiveButton.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) (amountUtils$Amount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null));
                long j2 = amountUtils$Amount.nanos;
                textView.setText(AndroidUtilities.replaceTags(z2 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) (j2 / 1000000000), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) (j2 / 1000000000), str, DialogObject.getShortName(j))));
            } else {
                c = 0;
            }
            if (amountUtils$Currency4 == amountUtils$Currency2) {
                TextView textView2 = this.positiveButton;
                int i2 = R.string.Gift2BuyDoPrice2TON;
                Object[] objArr = new Object[1];
                objArr[c] = amountUtils$Amount.asFormatString();
                textView2.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(i2, objArr), 1.13f));
                if (z2) {
                    int i3 = R.string.Gift2BuyPriceSelfTextTON;
                    Object[] objArr2 = new Object[2];
                    objArr2[c] = amountUtils$Amount.asFormatString();
                    objArr2[1] = str;
                    string = LocaleController.formatString(i3, objArr2);
                } else {
                    int i4 = R.string.Gift2BuyPriceTextTON;
                    String strAsFormatString = amountUtils$Amount.asFormatString();
                    String shortName = DialogObject.getShortName(j);
                    Object[] objArr3 = new Object[3];
                    objArr3[c] = strAsFormatString;
                    objArr3[1] = str;
                    objArr3[2] = shortName;
                    string = LocaleController.formatString(i4, objArr3);
                }
                textView.setText(AndroidUtilities.replaceTags(string));
            }
        }

        public final void show() {
            AlertDialog alertDialog = this.alertDialog;
            alertDialog.needStarsBalance = true;
            alertDialog.show();
            this.positiveButton = (TextView) alertDialog.getButton(-1);
            this.balanceCloud = alertDialog.starsBalanceCloud;
            FrameLayout frameLayout = alertDialog.fullscreenContainerView;
            this.rootView = frameLayout;
            if (frameLayout != null && this.canSwitchToTON) {
                HintView2 hintView2 = new HintView2(this.context, 3);
                hintView2.setMultilineText(true);
                hintView2.textLayoutAlignment = Layout.Alignment.ALIGN_NORMAL;
                hintView2.duration = 5000L;
                hintView2.setText(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
                hintView2.show();
                this.tonHint = hintView2;
                hintView2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                this.rootView.addView(this.tonHint, LayoutHelper.createFrame(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
            }
            onUpdateCurrency(false);
        }
    }

    public final class RoundRectStrokeDrawable extends Drawable {
        public final Paint paint;
        public final float radius;

        public RoundRectStrokeDrawable(float f, int i) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.radius = f;
            paint.setColor(i);
        }

        @Override
        public final void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            Paint paint = this.paint;
            float f = this.radius;
            canvas.drawRoundRect(rectF, f, f, paint);
            AndroidUtilities.drawStroke(canvas, rectF, f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public final class StarGiftDrawableIcon extends CompatDrawable {
        public final Paint countdownPaint;
        public AnimatedTextView.AnimatedTextDrawable countdownText;
        public CountdownTimer countdownTimer;
        public int endTime;
        public final Text giftName;
        public final Text giftStatus;
        public RadialGradient gradient;
        public final ImageReceiver imageReceiver;
        public final Matrix matrix;
        public final StarsReactionsSheet.Particles particles;
        public final Path path;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        public final float patternsScale;
        public int patternsType;
        public final RectF rect;
        public int rounding;
        public final int sizeDp;
        public int startTime;
        public final View view;

        public StarGiftDrawableIcon(View view, TL_stars.StarGift starGift, int i, float f) {
            int i2;
            PointF pointF;
            int i3;
            super(view);
            this.path = new Path();
            this.rect = new RectF();
            this.matrix = new Matrix();
            this.countdownPaint = new Paint(1);
            this.rounding = AndroidUtilities.dp(16.0f);
            this.patternsType = 0;
            this.view = view;
            this.patternsScale = f;
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.imageReceiver = imageReceiver;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(i > 180 ? 24.0f : 18.0f), 7);
            this.pattern = swapAnimatedEmojiDrawable;
            this.sizeDp = i;
            if (starGift instanceof TL_stars.TL_starGift) {
                float f2 = i;
                StarsIntroActivity.setGiftImage(imageReceiver, starGift.sticker, (int) (0.75f * f2));
                String str = starGift.title;
                Text text = new Text(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
                this.giftName = text;
                text.paint.setColor(-1);
                float f3 = i - 30;
                text.maxWidth = AndroidUtilities.dp(f3);
                text.setText(text.layout.getText());
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                text.align();
                text.maxLines = 1;
                text.setText(text.layout.getText());
                Text text2 = new Text(starGift.sold_out ? LocaleController.getString(R.string.Gift2SoldOutTitle) : LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]), 13.0f, null);
                this.giftStatus = text2;
                text2.maxWidth = AndroidUtilities.dp(f3);
                text2.setText(text2.layout.getText());
                text2.align();
                text2.maxLines = 1;
                text2.setText(text2.layout.getText());
                StarsReactionsSheet.Particles particles = new StarsReactionsSheet.Particles(1, 40);
                this.particles = particles;
                float f4 = 0.45f * f2;
                int i4 = -AndroidUtilities.dp(f4);
                int i5 = -AndroidUtilities.dp(f4);
                int iDp = AndroidUtilities.dp(f4);
                int iDp2 = AndroidUtilities.dp(f2 * 0.25f);
                RectF rectF = particles.bounds;
                rectF.set(i4, i5, iDp, iDp2);
                particles.removeParticlesOutside();
                float fDp = AndroidUtilities.dp(30.0f);
                int iWidth = (int) rectF.width();
                int iHeight = (int) rectF.height();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                PointF pointF2 = new PointF(AndroidUtilities.lerp(0, iWidth, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, iHeight, Utilities.fastRandom.nextFloat()));
                RectF rectF2 = rectF;
                float fFloor = (float) Math.floor(((double) fDp) / Math.sqrt(2));
                int iCeil = (int) Math.ceil(iWidth / fFloor);
                int i6 = iCeil + 1;
                int iCeil2 = (int) Math.ceil(iHeight / fFloor);
                int i7 = iCeil2 + 1;
                PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, i6, i7);
                for (int i8 = 0; i8 < i6; i8++) {
                    for (int i9 = 0; i9 < i7; i9++) {
                        pointFArr[i8][i9] = null;
                    }
                }
                pointFArr[(int) Math.floor(pointF2.x / fFloor)][(int) Math.floor(pointF2.y / fFloor)] = pointF2;
                arrayList.add(pointF2);
                arrayList2.add(pointF2);
                while (!arrayList2.isEmpty()) {
                    int iNextInt = arrayList2.size() > 1 ? Utilities.fastRandom.nextInt(arrayList2.size() - 1) : 0;
                    PointF pointF3 = (PointF) arrayList2.get(iNextInt);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 15) {
                            arrayList2.remove(iNextInt);
                            break;
                        }
                        float f5 = fDp;
                        float fLerp = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                        int i11 = i10;
                        int i12 = iHeight;
                        RectF rectF3 = rectF2;
                        double dLerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f5;
                        double d = fLerp;
                        PointF pointF4 = new PointF((float) ((Math.cos(Math.toRadians(d)) * dLerp) + ((double) pointF3.x)), (float) ((Math.sin(Math.toRadians(d)) * dLerp) + ((double) pointF3.y)));
                        int iDp3 = AndroidUtilities.dp(15.0f) / 2;
                        float f6 = pointF4.x;
                        float f7 = iDp3;
                        if (f6 >= f7 && f6 < iWidth - iDp3) {
                            float f8 = pointF4.y;
                            if (f8 >= f7 && f8 < i12 - iDp3) {
                                PointF pointF5 = pointF3;
                                int iFloor = (int) Math.floor(f6 / fFloor);
                                int iFloor2 = (int) Math.floor(pointF4.y / fFloor);
                                int iMax = Math.max(iFloor - 1, 0);
                                int iMin = Math.min(iFloor + 1, iCeil);
                                int iMax2 = Math.max(iFloor2 - 1, 0);
                                int iMin2 = Math.min(iFloor2 + 1, iCeil2);
                                while (true) {
                                    if (iMax > iMin) {
                                        arrayList.add(pointF4);
                                        pointFArr[(int) Math.floor(pointF4.x / fFloor)][(int) Math.floor(pointF4.y / fFloor)] = pointF4;
                                        arrayList2.add(pointF4);
                                        iHeight = i12;
                                        fDp = f5;
                                        rectF2 = rectF3;
                                        iCeil2 = iCeil2;
                                        break;
                                    }
                                    int i13 = iMax2;
                                    while (i13 <= iMin2) {
                                        PointF pointF6 = pointFArr[iMax][i13];
                                        pointF = pointF5;
                                        if (pointF6 != null) {
                                            i2 = iCeil2;
                                            float fDistance = MathUtils.distance(pointF6.x, pointF6.y, pointF4.x, pointF4.y);
                                            i3 = 1;
                                            if (fDistance < f5) {
                                                break;
                                            }
                                        } else {
                                            i2 = iCeil2;
                                            i3 = 1;
                                        }
                                        i13 += i3;
                                        pointF5 = pointF;
                                        iCeil2 = i2;
                                        iMin2 = iMin2;
                                    }
                                    iMax++;
                                }
                            } else {
                                i2 = iCeil2;
                                pointF = pointF3;
                            }
                        } else {
                            i2 = iCeil2;
                            pointF = pointF3;
                        }
                        i10 = i11 + 1;
                        iHeight = i12;
                        fDp = f5;
                        rectF2 = rectF3;
                        pointF3 = pointF;
                        iCeil2 = i2;
                    }
                }
                RectF rectF4 = rectF2;
                int size = arrayList.size();
                ArrayList arrayList3 = particles.particles;
                int size2 = size - arrayList3.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList3.add(particles.new Particle());
                }
                int size3 = arrayList.size();
                particles.visibleCount = size3;
                if (particles.batchParticlesBuffer != null) {
                    NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(size3);
                    particles.batchParticlesBuffer = notificationCompatBuilder;
                    Bitmap bitmap = particles.b;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    int i15 = 0;
                    while (i15 < notificationCompatBuilder.mGroupAlertBehavior) {
                        int i16 = i15;
                        NotificationCompatBuilder.bufferVertexSet((float[]) notificationCompatBuilder.mBuilder, i16, 0.0f, 0.0f, width, height);
                        i15 = i16 + 1;
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (int i17 = 0; i17 < particles.visibleCount; i17++) {
                    StarsReactionsSheet.Particles.Particle particle = (StarsReactionsSheet.Particles.Particle) arrayList3.get(i17);
                    PointF pointF7 = (PointF) arrayList.get(i17);
                    particles.gen(particle, jCurrentTimeMillis, true);
                    particle.x = pointF7.x + rectF4.left;
                    particle.y = pointF7.y + rectF4.top;
                    particle.la = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                    particle.s *= 1.25f;
                }
            } else if (starGift != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                if (stargiftattributepattern != null) {
                    swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, swapAnimatedEmojiDrawable.cacheType, false);
                }
                if (stargiftattributebackdrop != null) {
                    this.gradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
                }
                if (stargiftattributemodel != null) {
                    StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
                }
            }
            this.paint.setShader(this.gradient);
            if (view.isAttachedToWindow()) {
                onAttachedToWindow();
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            Text text;
            RectF rectF = this.rect;
            rectF.set(getBounds());
            canvas.save();
            Path path = this.path;
            path.rewind();
            float f = this.rounding;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
            RadialGradient radialGradient = this.gradient;
            Paint paint = this.paint;
            if (radialGradient != null) {
                Matrix matrix = this.matrix;
                matrix.reset();
                matrix.postTranslate(rectF.centerX(), rectF.centerY());
                this.gradient.setLocalMatrix(matrix);
                paint.setShader(this.gradient);
            }
            canvas.drawPaint(paint);
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            StarGiftPatterns.drawPattern(canvas, this.patternsType, this.pattern, rectF.width(), rectF.height(), 1.0f, this.patternsScale);
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles != null) {
                particles.draw(canvas, -1, 1.0f);
            }
            canvas.restore();
            ImageReceiver imageReceiver = this.imageReceiver;
            Text text2 = this.giftName;
            if (text2 == null || (text = this.giftStatus) == null) {
                float fMin = Math.min(rectF.width(), rectF.height()) * 0.75f;
                float f2 = fMin / 2.0f;
                imageReceiver.setImageCoords(rectF.centerX() - f2, rectF.centerY() - f2, fMin, fMin);
                imageReceiver.draw(canvas);
            } else {
                if (this.countdownText != null) {
                    Paint paint2 = this.countdownPaint;
                    paint2.setColor(1342177280);
                    canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.countdownText.getCurrentWidth(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                    canvas.save();
                    canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                    this.countdownText.draw(canvas);
                    canvas.restore();
                }
                float fMin2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
                imageReceiver.setImageCoords(rectF.centerX() - (fMin2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, fMin2, fMin2);
                imageReceiver.draw(canvas);
                text2.draw(canvas, rectF.centerX() - (text2.getWidth() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f), 1.0f);
                text.draw(canvas, rectF.centerX() - (text.getWidth() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f), 1.0f);
            }
            canvas.restore();
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(this.sizeDp);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(this.sizeDp);
        }

        @Override
        public final void onAttachedToWindow() {
            this.pattern.attach();
            this.imageReceiver.onAttachedToWindow();
            if (this.countdownTimer != null) {
                int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                int i = this.startTime;
                if (currentTime >= i) {
                    i = this.endTime;
                }
                this.countdownTimer.start(i - currentTime);
            }
        }

        @Override
        public final void onDetachedToWindow() {
            this.pattern.detach();
            this.imageReceiver.onDetachedFromWindow();
            CountdownTimer countdownTimer = this.countdownTimer;
            if (countdownTimer != null) {
                countdownTimer.isRunning = false;
                AndroidUtilities.cancelRunOnUIThread(countdownTimer.doUpdate);
            }
        }

        public final void setAuctionStateTextColor(int i) {
            Text text = this.giftStatus;
            if (text != null) {
                text.paint.setColor(i | (-16777216));
            }
        }

        public final void setCountdownRemainingTime(int i, int i2) {
            this.startTime = i;
            this.endTime = i2;
            if (this.countdownTimer == null) {
                this.countdownTimer = new CountdownTimer(new StoriesViewPager$$ExternalSyntheticLambda0(this, 7));
            }
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            this.countdownTimer.start(currentTime < i ? i - currentTime : i2 - currentTime);
            if (this.countdownText == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
                this.countdownText = animatedTextDrawable;
                animatedTextDrawable.textPaint.setColor(-1);
                animatedTextDrawable.alpha = Color.alpha(-1);
                this.countdownText.setTextSize(AndroidUtilities.dp(12.0f));
                this.countdownText.setCallback(new RichDetailsCell.AnonymousClass1(this, 12));
            }
            updateCountdownText();
        }

        public final void setGradient(int i, int i2) {
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.sizeDp) / 2.0f, new int[]{i | (-16777216), i2 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradient = radialGradient;
            this.paint.setShader(radialGradient);
        }

        public final void setPatternsType() {
            this.patternsType = 3;
        }

        public final void setRounding(int i) {
            this.rounding = i;
        }

        public final void updateCountdownText() {
            Text text;
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i = this.endTime;
            if (currentTime > i) {
                this.countdownText.setText(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
            } else {
                int i2 = this.startTime;
                if (currentTime < i2) {
                    this.countdownText.setText(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i2 - currentTime, true)), true, true);
                } else {
                    this.countdownText.setText(AndroidUtilities.formatDuration(i - currentTime, true), true, true);
                }
            }
            if (currentTime <= this.endTime || (text = this.giftStatus) == null) {
                return;
            }
            text.setText(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }
    }

    public final class StickersRollView extends View {
        public Roller.Sticker a;
        public boolean aIsFinish;
        public float aT;
        public Roller.Sticker b;
        public boolean bIsFinish;
        public float bT;
        public Roller.Background bgA;
        public float bgAT;
        public Roller.Background bgB;
        public float bgBT;
        public Roller.Background bgC;
        public float bgCT;
        public Roller.Sticker c;
        public boolean cIsFinish;
        public float cT;
        public final Camera camera;
        public final GradientClip clip;
        public final RectF rect;

        public StickersRollView(Context context) {
            super(context);
            this.camera = new Camera();
            this.clip = new GradientClip();
            this.rect = new RectF();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            drawSticker(canvas, this.a, this.aT, this.aIsFinish);
            drawSticker(canvas, this.b, this.bT, this.bIsFinish);
            drawSticker(canvas, this.c, this.cT, this.cIsFinish);
        }

        public final void drawBackground(Canvas canvas, Roller.Background background, float f, float f2, float f3, int[] iArr, int[] iArr2, int[] iArr3) {
            Paint paint;
            if (background == null || (paint = background.backgroundPaint) == null) {
                return;
            }
            float f4 = (f - 0.5f) / 1.5f;
            float fClamp01 = Utilities.clamp01(1.0f - Math.abs(f4));
            float fMax = Math.max(0.8f * f2, AndroidUtilities.dp(180.0f));
            float f5 = (f2 / 2.0f) - ((f4 * fMax) * 1.8f);
            float fMin = Math.min(AndroidUtilities.dp(176.0f), f3) / 2.0f;
            float f6 = f5 - fMax;
            float f7 = f5 + fMax;
            canvas.saveLayerAlpha(f6, 0.0f, f7, f3, 255, 31);
            Matrix matrix = background.backgroundMatrix;
            matrix.reset();
            matrix.postTranslate(f5, fMin);
            background.backgroundGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (fClamp01 * 255.0f));
            canvas.drawRect(f6, 0.0f, f7, f3, paint);
            canvas.save();
            float fDp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.rect;
            rectF.set(f6, 0.0f, f6 + fDp, f3);
            GradientClip gradientClip = this.clip;
            gradientClip.draw(canvas, rectF, 0, 1.0f);
            rectF.set(f7 - fDp, 0.0f, f7, f3);
            gradientClip.draw(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i = 0; i < iArr.length; i++) {
                float width = (getWidth() / (iArr.length - 1)) * i;
                iArr[i] = Theme.blendOver(iArr[i], Theme.multAlpha(fClamp01 * ((width < f6 || width > f7) ? 0.0f : Math.min(Utilities.clamp01((width - f6) / fMax), Utilities.clamp01(1.0f - ((width - (f7 - fMax)) / fMax)))), background.textColor));
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i2;
                iArr2[i2] = Theme.blendOver(iArr2[i2], Theme.multAlpha(fClamp01 * ((width2 < f6 || width2 > f7) ? 0.0f : Math.min(Utilities.clamp01((width2 - f6) / fMax), Utilities.clamp01(1.0f - ((width2 - (f7 - fMax)) / fMax)))), background.backgroundColor));
            }
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i3;
                iArr3[i3] = Theme.blendOver(iArr3[i3], Theme.multAlpha(((width3 < f6 || width3 > f7) ? 0.0f : Math.min(Utilities.clamp01((width3 - f6) / fMax), Utilities.clamp01(1.0f - ((width3 - (f7 - fMax)) / fMax)))) * fClamp01, background.patternColor));
            }
        }

        public final void drawSticker(Canvas canvas, Roller.Sticker sticker, float f, boolean z) {
            if (sticker == null) {
                return;
            }
            float fMax = z ? Math.max(0.5f, f) : f;
            ImageReceiver imageReceiver = sticker.imageReceiver;
            float imageX = imageReceiver.getImageX();
            float imageY = imageReceiver.getImageY();
            float imageWidth = imageReceiver.getImageWidth();
            float imageHeight = imageReceiver.getImageHeight();
            float alpha = imageReceiver.getAlpha();
            float f2 = (fMax - 0.5f) / 1.5f;
            float fClamp01 = Utilities.clamp01(1.0f - Math.abs(f2));
            float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f2);
            float fDp = AndroidUtilities.dp(80.0f);
            float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, fClamp01);
            float fDp2 = AndroidUtilities.dp(160.0f);
            canvas.save();
            float f3 = ((fDp2 / 2.0f) * f2) + width;
            canvas.translate(f3, fDp);
            Camera camera = this.camera;
            camera.save();
            camera.rotateY(f2 * (-30.0f));
            camera.applyToCanvas(canvas);
            camera.restore();
            canvas.translate(-f3, -fDp);
            float f4 = fDp2 * fLerp;
            float f5 = f4 / 2.0f;
            imageReceiver.setImageCoords(width - f5, fDp - f5, f4, f4);
            imageReceiver.setAlpha(fClamp01);
            imageReceiver.draw(canvas);
            imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
            imageReceiver.setAlpha(alpha);
            canvas.restore();
        }

        public final void resetDrawing() {
            boolean z = (this.a == null && this.b == null && this.c == null && this.bgA == null && this.bgB == null && this.bgC == null) ? false : true;
            this.c = null;
            this.b = null;
            this.a = null;
            this.cT = 0.0f;
            this.bT = 0.0f;
            this.aT = 0.0f;
            this.cIsFinish = false;
            this.bIsFinish = false;
            this.aIsFinish = false;
            this.bgC = null;
            this.bgB = null;
            this.bgA = null;
            this.bgCT = 0.0f;
            this.bgBT = 0.0f;
            this.bgAT = 0.0f;
            if (z) {
                invalidate();
            }
        }
    }

    public final class TextViewRoll extends FrameLayout {
        public boolean bounced;
        public final GradientClip clip;
        public final TextView current;
        public final TextView next;
        public final TextView prev;
        public final RectF rect;
        public final StarGiftSheet$$ExternalSyntheticLambda66 showHint;

        public final class TextView extends ButtonSpan.TextViewButtons {
            public String lastName;
            public int lastRarity;
            public final Theme.ResourcesProvider resourcesProvider;

            public TextView(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context, null);
                this.resourcesProvider = resourcesProvider;
                setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                setTextSize(1, 14.0f);
                setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }

            public final void set(String str, int i, StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66) {
                if (str == this.lastName && this.lastRarity == i) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ButtonSpan.make(AffiliateProgramFragment.percents(i), starGiftSheet$$ExternalSyntheticLambda66 != null ? new TodoItemMenu$$ExternalSyntheticLambda2(this, starGiftSheet$$ExternalSyntheticLambda66, i, 4) : null, this.resourcesProvider, null));
                setText(spannableStringBuilder);
                this.lastName = str;
                this.lastRarity = i;
            }
        }

        public TextViewRoll(Context context, Theme.ResourcesProvider resourcesProvider, StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66) {
            super(context);
            this.clip = new GradientClip();
            this.rect = new RectF();
            this.showHint = starGiftSheet$$ExternalSyntheticLambda66;
            TextView textView = new TextView(context, resourcesProvider);
            this.prev = textView;
            TextView textView2 = new TextView(context, resourcesProvider);
            this.current = textView2;
            TextView textView3 = new TextView(context, resourcesProvider);
            this.next = textView3;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.dispatchDraw(canvas);
            canvas.save();
            RectF rectF = this.rect;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
            GradientClip gradientClip = this.clip;
            gradientClip.draw(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
            gradientClip.draw(canvas, rectF, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
        }

        public final void update(Roller.Attr attr, float f, boolean z, Roller.Attr attr2, float f2, boolean z2, Roller.Attr attr3, float f3, boolean z3) {
            StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66 = this.showHint;
            TextView textView = this.prev;
            if (attr != null) {
                if (z) {
                    f = Math.max(0.5f, f);
                }
                textView.setVisibility(0);
                textView.set(attr.name, attr.rarity_permille, starGiftSheet$$ExternalSyntheticLambda66);
                textView.setTranslationY(AndroidUtilities.dp(36.0f) * ((f - 0.5f) / 1.5f));
            } else {
                textView.setVisibility(4);
            }
            TextView textView2 = this.current;
            if (attr2 != null) {
                float fMax = f2;
                if (z2) {
                    fMax = Math.max(0.5f, fMax);
                }
                float f4 = (fMax - 0.5f) / 1.5f;
                textView2.setVisibility(0);
                textView2.set(attr2.name, attr2.rarity_permille, starGiftSheet$$ExternalSyntheticLambda66);
                textView2.setTranslationY(AndroidUtilities.dp(36.0f) * f4);
                if (z2 && f4 <= 0.0f && !this.bounced) {
                    this.bounced = true;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(textView2, 14));
                    valueAnimatorOfFloat.setDuration(180L);
                    valueAnimatorOfFloat.start();
                }
            } else {
                textView2.setVisibility(4);
            }
            TextView textView3 = this.next;
            if (attr3 == null) {
                textView3.setVisibility(4);
                return;
            }
            float fMax2 = f3;
            if (z3) {
                fMax2 = Math.max(0.5f, fMax2);
            }
            textView3.setVisibility(0);
            textView3.set(attr3.name, attr3.rarity_permille, starGiftSheet$$ExternalSyntheticLambda66);
            textView3.setTranslationY(AndroidUtilities.dp(36.0f) * ((fMax2 - 0.5f) / 1.5f));
        }
    }

    public class TopView extends FrameLayout {
        public final BackupImageView avatarView;
        public final TL_stars.starGiftAttributeBackdrop[] backdrop;
        public BagRandomizer backdrops;
        public final int[] backgroundColors;
        public final RadialGradient[] backgroundGradient;
        public final Matrix[] backgroundMatrix;
        public final Paint[] backgroundPaint;
        public final IntroActivity.AnonymousClass1[] buttons;
        public final PhotoViewer.AnonymousClass35 buttonsLayout;
        public final ProfileActivity$9$$ExternalSyntheticLambda1 checkToRotateRunnable;
        public final ImageView closeView;
        public final TextView collectionReleasedView;
        public int collectionReleasedViewColor;
        public final CraftTopView craftTopView;
        public final ImageView craftView;
        public PageTransition currentPage;
        public boolean hasResellPrice;
        public boolean hasRibbon;
        public final FrameLayout imageLayout;
        public final BackupImageView[] imageView;
        public final TL_stars.starGiftAttributeModel[] imageViewAttributes;
        public final StickersRollView imagesRollView;
        public final LinearLayout[] layout;
        public final FrameLayout.LayoutParams[] layoutLayoutParams;
        public final TextPaint messageTextPaint;
        public final GiftMessageView[] messageTextView;
        public BagRandomizer models;
        public final View.OnClickListener onResellClick;
        public final View.OnClickListener onShareClick;
        public final View.OnClickListener onUpdatePriceClick;
        public final ImageView optionsView;
        public StarsReactionsSheet.Particles particles;
        public final RectF particlesBounds;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] pattern;
        public final TL_stars.starGiftAttributePattern[] patternAttribute;
        public final int[] patternColors;
        public BagRandomizer patterns;
        public RadialGradient profileBackgroundGradient;
        public final Matrix profileBackgroundMatrix;
        public final Paint profileBackgroundPaint;
        public final LinkSpanDrawable.LinksTextView releasedView;
        public final TextView resellPriceView;
        public boolean resellPriceViewInProgress;
        public final Theme.ResourcesProvider resourcesProvider;
        public final GiftSheet.Ribbon ribbon;
        public ValueAnimator rotationAnimator;
        public final FrameLayout subtitleContainer;
        public final LinkSpanDrawable.LinksTextView[] subtitleView;
        public final LinearLayout.LayoutParams[] subtitleViewLayoutParams;
        public ValueAnimator switchAnimator;
        public float switchScale;
        public final int[] textColors;
        public final LinkSpanDrawable.LinksTextView[] titleView;
        public float toggleBackdrop;
        public int toggled;
        public final FrameLayout userLayout;
        public float wearImageScale;
        public float wearImageTx;
        public float wearImageTy;

        public final class AnonymousClass1 extends BackupImageView {
            @Override
            public final void setAlpha(float f) {
                super.setAlpha(f);
                setVisibility(f > 0.0f ? 0 : 4);
            }
        }

        public final class AnonymousClass3 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final TopView this$0;

            public AnonymousClass3(TopView topView, int i) {
                this.$r8$classId = i;
                this.this$0 = topView;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        this.this$0.resellPriceViewInProgress = false;
                        break;
                    case 1:
                        this.this$0.resellPriceViewInProgress = false;
                        break;
                    case 2:
                        this.this$0.resellPriceView.setVisibility(4);
                        break;
                    case 3:
                        TopView topView = this.this$0;
                        topView.toggleBackdrop = topView.toggled;
                        topView.onSwitchPage(topView.currentPage);
                        break;
                    default:
                        TopView topView2 = this.this$0;
                        topView2.switchScale = 1.0f;
                        topView2.imageLayout.setScaleX(1.0f);
                        topView2.imageLayout.setScaleY(topView2.switchScale);
                        topView2.invalidate();
                        break;
                }
            }
        }

        public TopView(Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable, View.OnClickListener onClickListener, StarGiftSheet$$ExternalSyntheticLambda15 starGiftSheet$$ExternalSyntheticLambda15, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
            float f;
            super(context);
            this.imageView = new BackupImageView[5];
            this.imageViewAttributes = new TL_stars.starGiftAttributeModel[3];
            this.layout = new LinearLayout[5];
            this.layoutLayoutParams = new FrameLayout.LayoutParams[5];
            this.titleView = new LinkSpanDrawable.LinksTextView[5];
            this.subtitleView = new LinkSpanDrawable.LinksTextView[5];
            this.subtitleViewLayoutParams = new LinearLayout.LayoutParams[5];
            this.messageTextView = new GiftMessageView[5];
            this.currentPage = new PageTransition(0, 0);
            this.backdrop = new TL_stars.starGiftAttributeBackdrop[3];
            this.checkToRotateRunnable = new ProfileActivity$9$$ExternalSyntheticLambda1(this, 28);
            this.backgroundPaint = new Paint[3];
            this.backgroundGradient = new RadialGradient[3];
            this.backgroundMatrix = new Matrix[3];
            this.profileBackgroundMatrix = new Matrix();
            this.profileBackgroundPaint = new Paint(1);
            this.patternAttribute = new TL_stars.starGiftAttributePattern[2];
            this.pattern = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[2];
            int i = 0;
            while (true) {
                Paint[] paintArr = this.backgroundPaint;
                if (i >= paintArr.length) {
                    break;
                }
                paintArr[i] = new Paint(1);
                i++;
            }
            int i2 = 0;
            while (true) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
                if (i2 >= swapAnimatedEmojiDrawableArr.length) {
                    break;
                }
                swapAnimatedEmojiDrawableArr[i2] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(28.0f), 7);
                i2++;
            }
            this.switchScale = 1.0f;
            this.particlesBounds = new RectF();
            this.backgroundColors = new int[12];
            this.textColors = new int[12];
            this.patternColors = new int[12];
            this.resourcesProvider = resourcesProvider;
            this.onShareClick = onClickListener4;
            this.onResellClick = onClickListener5;
            this.onUpdatePriceClick = onClickListener6;
            setWillNotDraw(false);
            this.imageLayout = new FrameLayout(context);
            int i3 = 0;
            while (true) {
                BackupImageView[] backupImageViewArr = this.imageView;
                float f2 = 0.0f;
                if (i3 >= backupImageViewArr.length) {
                    break;
                }
                backupImageViewArr[i3] = new AnonymousClass1(context);
                this.imageView[i3].setLayerNum(6660);
                if (i3 > 0) {
                    this.imageView[i3].getImageReceiver().setCrossfadeDuration(1);
                }
                this.imageLayout.addView(this.imageView[i3], LayoutHelper.createFrame(-1, -1, 119));
                BackupImageView backupImageView = this.imageView[i3];
                if (i3 == 0) {
                    f2 = 1.0f;
                }
                backupImageView.setAlpha(f2);
                i3++;
            }
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.releasedView = linksTextView;
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            TextView textView = new TextView(context);
            this.collectionReleasedView = textView;
            textView.setOnClickListener(new StarGiftSheet$TopView$$ExternalSyntheticLambda1(this, 0));
            ScaleStateListAnimator.apply(textView, 0.05f, 1.25f);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(17);
            textView.setLinkTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
            TextView textView2 = new TextView(context);
            this.resellPriceView = textView2;
            textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.4f);
            textView2.setScaleY(0.4f);
            textView2.setVisibility(8);
            textView2.setGravity(17);
            ScaleStateListAnimator.apply(textView2, 0.1f, 1.5f);
            PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 12);
            this.buttonsLayout = anonymousClass35;
            anonymousClass35.setOrientation(0);
            this.buttons = new IntroActivity.AnonymousClass1[3];
            int i4 = 0;
            while (true) {
                IntroActivity.AnonymousClass1[] anonymousClass1Arr = this.buttons;
                if (i4 >= anonymousClass1Arr.length) {
                    break;
                }
                anonymousClass1Arr[i4] = new IntroActivity.AnonymousClass1(context, 27);
                if (i4 == 0) {
                    this.buttons[i4].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                    this.buttons[i4].setOnClickListener(onClickListener2);
                } else if (i4 == 1) {
                    this.buttons[i4].set(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                    this.buttons[i4].setOnClickListener(onClickListener3);
                } else if (i4 == 2) {
                    this.buttons[i4].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                    this.buttons[i4].setOnClickListener(onClickListener4);
                }
                this.buttons[i4].setBackground(Theme.createRadSelectorDrawable(0, 285212671, 16, 16));
                ScaleStateListAnimator.apply(this.buttons[i4], 0.075f, 1.5f);
                PhotoViewer.AnonymousClass35 anonymousClass36 = this.buttonsLayout;
                IntroActivity.AnonymousClass1[] anonymousClass1Arr2 = this.buttons;
                anonymousClass36.addView(anonymousClass1Arr2[i4], LayoutHelper.createLinear(0, 56, 1.0f, 119, 0, 0, i4 != anonymousClass1Arr2.length - 1 ? 11 : 0, 0));
                i4++;
            }
            this.subtitleContainer = new FrameLayout(context);
            int i5 = 0;
            while (true) {
                LinearLayout[] linearLayoutArr = this.layout;
                if (i5 >= linearLayoutArr.length) {
                    break;
                }
                linearLayoutArr[i5] = new LinearLayout(context);
                this.layout[i5].setOrientation(1);
                if (i5 == 2) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.userLayout = frameLayout;
                    this.layout[i5].addView(frameLayout, LayoutHelper.createLinear(-1, 144, 119));
                    BackupImageView backupImageView2 = new BackupImageView(context);
                    this.avatarView = backupImageView2;
                    backupImageView2.setRoundRadius(AndroidUtilities.dp(41.0f));
                    frameLayout.addView(backupImageView2, LayoutHelper.createFrame(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                    this.titleView[i5] = new LinkSpanDrawable.LinksTextView(context, null);
                    this.titleView[i5].setTextColor(-1);
                    this.titleView[i5].setTextSize(1, 20.0f);
                    this.titleView[i5].setTypeface(AndroidUtilities.bold());
                    this.titleView[i5].setSingleLine();
                    LinkSpanDrawable.LinksTextView linksTextView2 = this.titleView[i5];
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    linksTextView2.setEllipsize(truncateAt);
                    this.titleView[i5].setGravity(17);
                    frameLayout.addView(this.titleView[i5], LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                    this.subtitleView[i5] = new LinkSpanDrawable.LinksTextView(context, null);
                    this.subtitleView[i5].setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                    this.subtitleView[i5].setTextSize(1, 14.0f);
                    this.subtitleView[i5].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                    this.subtitleView[i5].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.subtitleView[i5].setDisablePaddingsOffsetY(true);
                    this.subtitleView[i5].setSingleLine();
                    this.subtitleView[i5].setGravity(17);
                    this.subtitleView[i5].setEllipsize(truncateAt);
                    frameLayout.addView(this.subtitleView[i5], LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
                } else {
                    if (i5 == 4) {
                        CraftTopView craftTopView = new CraftTopView(context, resourcesProvider);
                        this.craftTopView = craftTopView;
                        this.layout[i5].addView(craftTopView, LayoutHelper.createLinear(-1, -2));
                        View view = this.layout[i5];
                        FrameLayout.LayoutParams[] layoutParamsArr = this.layoutLayoutParams;
                        ViewGroup.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                        layoutParamsArr[i5] = layoutParamsCreateFrame;
                        addView(view, layoutParamsCreateFrame);
                    } else {
                        this.titleView[i5] = new LinkSpanDrawable.LinksTextView(context, null);
                        this.titleView[i5].setTextColor(i5 == 3 ? -1 : Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                        this.titleView[i5].setTextSize(1, 20.0f);
                        this.titleView[i5].setTypeface(AndroidUtilities.bold());
                        this.titleView[i5].setGravity(17);
                        this.layout[i5].addView(this.titleView[i5], LayoutHelper.createLinear(-1, -2, 17, 24, i5 == 3 ? 10 : 0, 24, 0));
                        if (i5 == 0) {
                            this.layout[i5].addView(this.releasedView, LayoutHelper.createLinear(-2, -2, 17, 0, 4, 0, 4));
                            this.layout[i5].addView(this.collectionReleasedView, LayoutHelper.createLinear(-2, 17, 0, 6, 0, 19.33f, 2));
                        }
                        if (i5 == 0) {
                            this.subtitleView[i5] = new LinkSpanDrawable.LinksTextView(context, null);
                            this.subtitleView[i5].setTextColor(i5 == 3 ? Theme.multAlpha(0.75f, -1) : Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                            this.subtitleView[i5].setTextSize(1, 14.0f);
                            this.subtitleView[i5].setGravity(17);
                            this.subtitleView[i5].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                            this.subtitleView[i5].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            this.subtitleView[i5].setDisablePaddingsOffsetY(true);
                            this.subtitleContainer.addView(this.subtitleView[i5], LayoutHelper.createFrame(-2, -2, 17));
                            this.subtitleContainer.addView(this.resellPriceView, new FrameLayout.LayoutParams(LayoutHelper.getSize(-2.0f), LayoutHelper.getSize(20.33f), 17));
                            LinearLayout linearLayout = this.layout[i5];
                            FrameLayout frameLayout2 = this.subtitleContainer;
                            LinearLayout.LayoutParams[] layoutParamsArr2 = this.subtitleViewLayoutParams;
                            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, i5 == 3 ? 6 : 0);
                            layoutParamsArr2[i5] = layoutParamsCreateLinear;
                            linearLayout.addView(frameLayout2, layoutParamsCreateLinear);
                        } else {
                            this.subtitleView[i5] = new LinkSpanDrawable.LinksTextView(context, null);
                            this.subtitleView[i5].setTextColor(i5 == 3 ? Theme.multAlpha(0.75f, -1) : Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                            this.subtitleView[i5].setTextSize(1, 14.0f);
                            this.subtitleView[i5].setGravity(17);
                            this.subtitleView[i5].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                            this.subtitleView[i5].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            this.subtitleView[i5].setDisablePaddingsOffsetY(true);
                            LinearLayout linearLayout2 = this.layout[i5];
                            LinkSpanDrawable.LinksTextView linksTextView3 = this.subtitleView[i5];
                            LinearLayout.LayoutParams[] layoutParamsArr3 = this.subtitleViewLayoutParams;
                            LinearLayout.LayoutParams layoutParamsCreateLinear2 = LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, i5 == 3 ? 6 : 0);
                            layoutParamsArr3[i5] = layoutParamsCreateLinear2;
                            linearLayout2.addView(linksTextView3, layoutParamsCreateLinear2);
                        }
                        LinearLayout.LayoutParams layoutParams = this.subtitleViewLayoutParams[i5];
                        if (i5 == 3) {
                            f = 6.0f;
                        } else {
                            f = (i5 == 1 ? 7.33f : this.backdrop[0] == null ? 9.0f : 5.66f) - 4.0f;
                        }
                        layoutParams.topMargin = AndroidUtilities.dp(f);
                        this.messageTextView[i5] = new GiftMessageView(context);
                        this.messageTextView[i5].setVisibility(8);
                        this.messageTextView[i5].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                        if (i5 == 0) {
                            this.messageTextPaint = this.messageTextView[i5].getTextPaint();
                        }
                        this.layout[i5].addView(this.messageTextView[i5], LayoutHelper.createLinear(-1, -2, 17, 24, 8, 24, 0));
                    }
                    i5++;
                }
                if (i5 == 0) {
                    this.layout[i5].addView(this.buttonsLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 15, 0, 0));
                }
                View view2 = this.layout[i5];
                FrameLayout.LayoutParams[] layoutParamsArr4 = this.layoutLayoutParams;
                ViewGroup.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, i5 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
                layoutParamsArr4[i5] = layoutParamsCreateFrame2;
                addView(view2, layoutParamsCreateFrame2);
                i5++;
            }
            addView(this.imageLayout, LayoutHelper.createFrame(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            StickersRollView stickersRollView = new StickersRollView(context);
            this.imagesRollView = stickersRollView;
            addView(stickersRollView, LayoutHelper.createFrame(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.closeView = imageView;
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(28.0f), 620756991));
            imageView.setImageResource(R.drawable.msg_close);
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            addView(imageView, LayoutHelper.createFrame(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
            imageView.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda51(9, runnable));
            imageView.setVisibility(8);
            ImageView imageView2 = new ImageView(context);
            this.craftView = imageView2;
            imageView2.setImageResource(R.drawable.filled_forge);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
            ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
            if (starGiftSheet$$ExternalSyntheticLambda15 != null) {
                addView(imageView2, LayoutHelper.createFrame(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
                imageView2.setOnClickListener(starGiftSheet$$ExternalSyntheticLambda15);
            }
            imageView2.setVisibility(8);
            ImageView imageView3 = new ImageView(context);
            this.optionsView = imageView3;
            imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
            imageView3.setImageResource(R.drawable.media_more);
            imageView3.setScaleType(scaleType);
            imageView3.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
            ScaleStateListAnimator.apply(imageView3, 0.1f, 1.5f);
            addView(imageView3, LayoutHelper.createFrame(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            imageView3.setOnClickListener(onClickListener);
            imageView3.setVisibility(8);
            GiftSheet.Ribbon ribbon = new GiftSheet.Ribbon(context);
            this.ribbon = ribbon;
            ribbon.setText(LocaleController.getString(R.string.GiftCrafted), true);
            GiftSheet.RibbonDrawable ribbonDrawable = ribbon.drawable;
            if (ribbonDrawable.particles == null) {
                StarsReactionsSheet.Particles particles = new StarsReactionsSheet.Particles(2, 12);
                ribbonDrawable.particles = particles;
                particles.speed = 5.0f;
            }
            Path path = ribbonDrawable.path;
            ribbonDrawable.left = true;
            GiftSheet.RibbonDrawable.fillRibbonPath(path, ribbonDrawable.scale, true);
            ribbon.setScaleX(1.2f);
            ribbon.setScaleY(1.2f);
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            ribbon.setVisibility(8);
        }

        public final void animateSwitch() {
            ValueAnimator valueAnimator = this.switchAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.switchAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new StarGiftSheet$TopView$$ExternalSyntheticLambda4(this, 1));
            this.switchAnimator.addListener(new AnonymousClass3(this, 4));
            this.switchAnimator.setDuration(320L);
            this.switchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.switchAnimator.start();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            int[] iArr;
            int[] iArr2;
            int[] iArr3;
            float f4;
            TopView topView;
            Canvas canvas2;
            StickersRollView stickersRollView;
            float realHeight = getRealHeight();
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
            float width = getWidth() / 2.0f;
            float fDp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.currentPage.at(1));
            PageTransition pageTransition = this.currentPage;
            float fMax = ((pageTransition.contains(0) && pageTransition.contains(2)) || (pageTransition.contains(2) && pageTransition.contains(3)) || (pageTransition.contains(3) && pageTransition.contains(0))) ? 1.0f : Math.max(pageTransition.at(0), Math.max(pageTransition.at(2), pageTransition.at(3)));
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            if (fMax <= 0.0f || stargiftattributebackdropArr[0] == null) {
                stargiftattributebackdropArr = stargiftattributebackdropArr;
            } else {
                if (this.profileBackgroundGradient == null || this.currentPage.at(2) < 1.0f) {
                    Paint[] paintArr = this.backgroundPaint;
                    paintArr[0].setAlpha((int) (fMax * 255.0f));
                    Matrix[] matrixArr = this.backgroundMatrix;
                    matrixArr[0].reset();
                    matrixArr[0].postTranslate(width, fDp);
                    this.backgroundGradient[0].setLocalMatrix(matrixArr[0]);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
                }
                if (this.profileBackgroundGradient != null && this.currentPage.at(2) > 0.0f) {
                    Paint paint = this.profileBackgroundPaint;
                    paint.setAlpha((int) (this.currentPage.at(2) * 255.0f));
                    Matrix matrix = this.profileBackgroundMatrix;
                    matrix.reset();
                    matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                    this.profileBackgroundGradient.setLocalMatrix(matrix);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
                }
            }
            if (this.currentPage.at(1) > 0.0f) {
                f = width;
                f2 = fDp;
                updateButtonsBackgrounds(drawBackground(canvas, f, f2, getWidth(), realHeight));
            } else {
                f = width;
                f2 = fDp;
            }
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
            int[] iArr4 = this.patternColors;
            int[] iArr5 = this.textColors;
            int[] iArr6 = this.backgroundColors;
            if (stargiftattributebackdrop != null) {
                for (int i = 0; i < iArr6.length; i++) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                    iArr5[i] = stargiftattributebackdrop2.text_color | (-16777216);
                    iArr6[i] = ColorUtils.blendARGB(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                    iArr4[i] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                }
            }
            StickersRollView stickersRollView2 = this.imagesRollView;
            if (stickersRollView2.bgA == null && stickersRollView2.bgB == null && stickersRollView2.bgC == null) {
                topView = this;
                f4 = f;
                f3 = f2;
                iArr3 = iArr4;
                iArr = iArr5;
                iArr2 = iArr6;
                stickersRollView = stickersRollView2;
                canvas2 = canvas;
            } else {
                float width2 = getWidth();
                float f5 = f;
                Roller.Background background = stickersRollView2.bgA;
                float f6 = f2;
                float f7 = stickersRollView2.bgAT;
                int[] iArr7 = this.textColors;
                int[] iArr8 = this.backgroundColors;
                int[] iArr9 = this.patternColors;
                f3 = f6;
                iArr = iArr5;
                iArr2 = iArr6;
                iArr3 = iArr4;
                f4 = f5;
                topView = this;
                canvas2 = canvas;
                stickersRollView2.drawBackground(canvas2, background, f7, width2, realHeight, iArr7, iArr8, iArr9);
                stickersRollView2.drawBackground(canvas2, stickersRollView2.bgB, stickersRollView2.bgBT, width2, realHeight, iArr7, iArr8, iArr9);
                stickersRollView2.drawBackground(canvas2, stickersRollView2.bgC, stickersRollView2.bgCT, width2, realHeight, iArr7, iArr8, iArr9);
                stickersRollView = stickersRollView2;
                topView.invalidate();
            }
            if (fMax > 0.0f && stargiftattributebackdropArr[0] != null) {
                int i2 = iArr3[iArr3.length / 2];
                PageTransition pageTransition2 = topView.currentPage;
                float fMax2 = (pageTransition2.contains(0) && pageTransition2.contains(3)) ? 1.0f : Math.max(pageTransition2.at(0), pageTransition2.at(3));
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = topView.pattern;
                if (fMax2 > 0.0f) {
                    canvas2.save();
                    canvas2.translate(f4, f3);
                    swapAnimatedEmojiDrawableArr[0].setColor(Integer.valueOf(i2));
                    StarGiftPatterns.drawPattern(canvas, 0, swapAnimatedEmojiDrawableArr[0], topView.getWidth(), realHeight, fMax2, 1.0f);
                    realHeight = realHeight;
                    canvas.restore();
                }
                if (topView.currentPage.at(2) > 0.0f) {
                    canvas.save();
                    swapAnimatedEmojiDrawableArr[0].setColor(Integer.valueOf(i2));
                    float f8 = realHeight;
                    RectF rectF = AndroidUtilities.rectTmp;
                    LinearLayout[] linearLayoutArr = topView.layout;
                    float x = linearLayoutArr[2].getX();
                    FrameLayout frameLayout = topView.userLayout;
                    float x2 = frameLayout.getX() + x;
                    BackupImageView backupImageView = topView.avatarView;
                    rectF.set(backupImageView.getX() + x2, backupImageView.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), backupImageView.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + backupImageView.getWidth(), backupImageView.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + backupImageView.getHeight());
                    StarGiftPatterns.drawProfileAnimatedPattern(canvas, swapAnimatedEmojiDrawableArr[0], topView.getWidth(), f8 * 0.7f, 1.0f, rectF, topView.currentPage.at(2));
                    canvas2 = canvas;
                    canvas2.restore();
                } else {
                    canvas2 = canvas;
                }
                IntroActivity.AnonymousClass1[] anonymousClass1Arr = topView.buttons;
                int length = anonymousClass1Arr.length;
                int i3 = 0;
                while (i3 < length) {
                    IntroActivity.AnonymousClass1 anonymousClass1 = anonymousClass1Arr[i3];
                    int[] iArr10 = iArr2;
                    if (Theme.setSelectorDrawableColor(anonymousClass1.getBackground(), iArr10[Utilities.clamp(Math.round((((anonymousClass1.getWidth() / 2.0f) + anonymousClass1.getX()) / topView.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                        anonymousClass1.invalidate();
                    }
                    i3++;
                    iArr2 = iArr10;
                }
                int[] iArr11 = iArr;
                int[] iArr12 = iArr2;
                int i4 = iArr11[iArr11.length / 2];
                int i5 = iArr12[iArr12.length / 2];
                TextView textView = topView.collectionReleasedView;
                if (textView != null && topView.collectionReleasedViewColor != i4) {
                    topView.collectionReleasedViewColor = i4;
                    textView.setTextColor(i4);
                    Theme.setSelectorDrawableColor(textView.getBackground(), i5, false);
                }
                if (stickersRollView.bgA != null || stickersRollView.bgB != null || stickersRollView.bgC != null) {
                    topView.subtitleView[0].setTextColor(i4);
                }
                if (topView.currentPage.at(2) > 0.0f) {
                    if (topView.particles == null) {
                        topView.particles = new StarsReactionsSheet.Particles(1, 12);
                    }
                    FrameLayout frameLayout2 = topView.imageLayout;
                    float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                    float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                    float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                    float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                    RectF rectF2 = topView.particlesBounds;
                    rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, measuredHeight + scaleY);
                    StarsReactionsSheet.Particles particles = topView.particles;
                    particles.bounds.set(rectF2);
                    particles.removeParticlesOutside();
                    topView.particles.process();
                    topView.particles.draw(canvas2, Theme.multAlpha(topView.currentPage.at(2), -1), 1.0f);
                    topView.invalidate();
                }
            }
            if (topView.currentPage.at(1) > 0.0f) {
                topView.drawPattern(canvas2, f4, f3, topView.getWidth(), topView.getRealHeight());
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public final int drawBackground(Canvas canvas, float f, float f2, float f3, float f4) {
            int i = this.toggled;
            RadialGradient[] radialGradientArr = this.backgroundGradient;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            Matrix[] matrixArr = this.backgroundMatrix;
            Paint[] paintArr = this.backgroundPaint;
            int iCompositeColors = 0;
            if (i != 0) {
                if (this.toggleBackdrop < 1.0f && stargiftattributebackdropArr[1] != null) {
                    paintArr[1].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                    matrixArr[1].reset();
                    matrixArr[1].postTranslate(f, f2);
                    radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                    canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                    iCompositeColors = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
                }
                if (this.toggleBackdrop <= 0.0f || stargiftattributebackdropArr[2] == null) {
                    return iCompositeColors;
                }
                paintArr[2].setAlpha((int) (this.currentPage.at(1) * 255.0f * this.toggleBackdrop));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f, f2);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), iCompositeColors);
            }
            if (this.toggleBackdrop > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f, f2);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                iCompositeColors = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.toggleBackdrop >= 1.0f || stargiftattributebackdropArr[1] == null) {
                return iCompositeColors;
            }
            paintArr[1].setAlpha((int) ((1.0f - this.toggleBackdrop) * this.currentPage.at(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f, f2);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
            return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), iCompositeColors);
        }

        public final void drawPattern(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.save();
            canvas.translate(f, f2);
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
            int i = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            int iBlendARGB = ColorUtils.blendARGB(this.toggleBackdrop, i, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
            swapAnimatedEmojiDrawableArr[1].setColor(Integer.valueOf(iBlendARGB));
            StarGiftPatterns.drawPattern(canvas, 0, swapAnimatedEmojiDrawableArr[1], f3, f4, this.currentPage.at(1), this.switchScale);
            canvas.restore();
        }

        public int getFinalHeight() {
            int iDp;
            int measuredHeight;
            boolean z = this.currentPage.to(0);
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            LinearLayout[] linearLayoutArr = this.layout;
            if (z) {
                return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
            }
            if (this.currentPage.to(1)) {
                return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
            }
            if (this.currentPage.to(2)) {
                iDp = AndroidUtilities.dp(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else {
                if (!this.currentPage.to(3)) {
                    if (!this.currentPage.to(4)) {
                        return 0;
                    }
                    CraftTopView craftTopView = this.craftTopView;
                    return craftTopView.getMeasuredHeight() > 0 ? craftTopView.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
                }
                iDp = AndroidUtilities.dp(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            }
            return measuredHeight + iDp;
        }

        public float getRealHeight() {
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            int iDp = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
            LinearLayout[] linearLayoutArr = this.layout;
            float fAt = (this.currentPage.at(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.currentPage.at(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.currentPage.at(1) * (linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.currentPage.at(0) * (linearLayoutArr[0].getMeasuredHeight() + iDp)) + 0.0f;
            CraftTopView craftTopView = this.craftTopView;
            return (this.currentPage.at(4) * (craftTopView.getMeasuredHeight() > 0 ? craftTopView.getMeasuredHeight() : AndroidUtilities.dp(550.0f))) + fAt;
        }

        public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
            float f = this.toggleBackdrop;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            return f > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
        }

        public BackupImageView getUpgradeImageView() {
            float f = this.toggleBackdrop;
            BackupImageView[] backupImageViewArr = this.imageView;
            return f > 0.5f ? backupImageViewArr[2] : backupImageViewArr[1];
        }

        public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
            float f = this.toggleBackdrop;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.imageViewAttributes;
            return f > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
        }

        public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
            return this.patternAttribute[1];
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
            swapAnimatedEmojiDrawableArr[0].attach();
            swapAnimatedEmojiDrawableArr[1].attach();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
            swapAnimatedEmojiDrawableArr[0].detach();
            swapAnimatedEmojiDrawableArr[1].detach();
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.currentPage.contains(2)) {
                updateWearImageTranslation();
                onSwitchPage(this.currentPage);
            }
        }

        public void onSwitchPage(PageTransition pageTransition) {
            View[] viewArr;
            LinkSpanDrawable.LinksTextView[] linksTextViewArr;
            float fAt;
            int iBlendARGB;
            boolean z;
            float f;
            this.currentPage = pageTransition;
            int i = 0;
            while (true) {
                viewArr = this.layout;
                if (i >= viewArr.length) {
                    break;
                }
                float fAt2 = pageTransition.at(i);
                viewArr[i].setAlpha(fAt2);
                viewArr[i].setVisibility(fAt2 > 0.0f ? 0 : 4);
                i++;
            }
            ImageView imageView = this.closeView;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            imageView.setAlpha(Math.max(stargiftattributebackdropArr[0] != null ? pageTransition.at(2) : 0.0f, stargiftattributebackdropArr[1] != null ? pageTransition.at(1) : 0.0f));
            imageView.setVisibility(((stargiftattributebackdropArr[0] == null || pageTransition.to != 2) && (stargiftattributebackdropArr[1] == null || pageTransition.to != 1)) ? 8 : 0);
            ImageView imageView2 = this.optionsView;
            imageView2.setAlpha(AndroidUtilities.lerp(false, stargiftattributebackdropArr[0] != null, pageTransition.at(0)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
            int i2 = pageTransition.to;
            imageView2.setVisibility((stargiftattributebackdrop == null || i2 != 0) ? 8 : 0);
            if (!this.resellPriceViewInProgress) {
                TextView textView = this.resellPriceView;
                textView.setAlpha(AndroidUtilities.lerp(false, this.hasResellPrice, pageTransition.at(0)));
                textView.setScaleX(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                textView.setScaleY(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                textView.setVisibility((this.hasResellPrice && i2 == 0) ? 0 : 4);
            }
            int color = Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider);
            int i3 = 0;
            while (true) {
                linksTextViewArr = this.subtitleView;
                if (i3 >= 2) {
                    break;
                }
                this.titleView[i3].setTextColor(stargiftattributebackdropArr[Math.min(1, i3)] == null ? color : -1);
                LinkSpanDrawable.LinksTextView linksTextView = linksTextViewArr[i3];
                if (i3 == 0 || i3 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[i3];
                    iBlendARGB = stargiftattributebackdrop2 == null ? color : stargiftattributebackdrop2.text_color | (-16777216);
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
                    int i4 = stargiftattributebackdrop3 == null ? color : stargiftattributebackdrop3.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
                    iBlendARGB = ColorUtils.blendARGB(this.toggleBackdrop, i4, stargiftattributebackdrop4 == null ? color : stargiftattributebackdrop4.text_color | (-16777216));
                }
                linksTextView.setTextColor(iBlendARGB);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[i3];
                FrameLayout.LayoutParams[] layoutParamsArr = this.layoutLayoutParams;
                if (stargiftattributebackdrop5 != null) {
                    z = (AndroidUtilities.dp(184.0f) == layoutParamsArr[i3].topMargin && viewArr[i3].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                    if (z) {
                        viewArr[i3].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                        layoutParamsArr[i3].topMargin = AndroidUtilities.dp(184.0f);
                    }
                } else {
                    z = (AndroidUtilities.dp(170.0f) == layoutParamsArr[i3].topMargin && viewArr[i3].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                    if (z) {
                        viewArr[i3].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                        layoutParamsArr[i3].topMargin = AndroidUtilities.dp(170.0f);
                    }
                }
                LinearLayout.LayoutParams[] layoutParamsArr2 = this.subtitleViewLayoutParams;
                LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i3];
                if (i3 == 1) {
                    f = 7.33f;
                } else {
                    f = stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f - 4.0f);
                if (z) {
                    viewArr[i3].setLayoutParams(layoutParamsArr[i3]);
                    if (i3 == 0) {
                        this.subtitleContainer.setLayoutParams(layoutParamsArr2[i3]);
                    } else {
                        linksTextViewArr[i3].setLayoutParams(layoutParamsArr2[i3]);
                    }
                }
                i3++;
            }
            TextView textView2 = this.collectionReleasedView;
            int iDp = AndroidUtilities.dp(24.0f);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
            textView2.setBackground(Theme.createRoundRectDrawable(iDp, stargiftattributebackdrop6 == null ? 553648127 : ColorUtils.blendARGB(0.25f, stargiftattributebackdrop6.edge_color | (-16777216), stargiftattributebackdrop6.pattern_color | (-16777216))));
            LinkSpanDrawable.LinksTextView linksTextView2 = linksTextViewArr[2];
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop7 = stargiftattributebackdropArr[0];
            if (stargiftattributebackdrop7 != null) {
                color = stargiftattributebackdrop7.text_color | (-16777216);
            }
            linksTextView2.setTextColor(color);
            BackupImageView[] backupImageViewArr = this.imageView;
            BackupImageView backupImageView = backupImageViewArr[0];
            PageTransition pageTransition2 = this.currentPage;
            backupImageView.setAlpha(Math.max((pageTransition2.contains(0) && pageTransition2.contains(2)) ? 1.0f : Math.max(pageTransition2.at(0), pageTransition2.at(2)), this.currentPage.at(3)));
            backupImageViewArr[1].setAlpha((1.0f - this.toggleBackdrop) * pageTransition.at(1));
            backupImageViewArr[2].setAlpha(pageTransition.at(1) * this.toggleBackdrop);
            FrameLayout frameLayout = this.imageLayout;
            frameLayout.setScaleX(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            frameLayout.setTranslationX(pageTransition.at(2) * this.wearImageTx);
            frameLayout.setTranslationY((pageTransition.at(2) * this.wearImageTy) + (pageTransition.at(1) * AndroidUtilities.dp(16.0f)));
            View view = viewArr[2];
            int i5 = pageTransition.from;
            if (i5 == 2 && i2 == 2) {
                fAt = 0.0f;
            } else {
                if (i5 != 2) {
                    i2 = i5;
                }
                fAt = (1.0f - pageTransition.at(2)) * (-(viewArr[i2].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
            }
            view.setTranslationY(fAt);
            int i6 = (this.hasRibbon && this.currentPage.contains(0)) ? 0 : 8;
            GiftSheet.Ribbon ribbon = this.ribbon;
            ribbon.setVisibility(i6);
            ribbon.setAlpha(this.currentPage.at(0));
            int i7 = pageTransition.at(4) <= 0.0f ? 8 : 0;
            CraftTopView craftTopView = this.craftTopView;
            craftTopView.setVisibility(i7);
            craftTopView.setAlpha(pageTransition.at(4));
            invalidate();
        }

        public final void setBackdropPaint(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (stargiftattributebackdrop == null) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            RadialGradient[] radialGradientArr = this.backgroundGradient;
            radialGradientArr[i] = radialGradient;
            if (i == 0) {
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
                this.profileBackgroundGradient = radialGradient2;
                this.profileBackgroundPaint.setShader(radialGradient2);
            }
            Matrix[] matrixArr = this.backgroundMatrix;
            if (matrixArr[i] == null) {
                matrixArr[i] = new Matrix();
            }
            this.backgroundPaint[i].setShader(radialGradientArr[i]);
        }

        public final void setGift(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3) {
            this.hasResellPrice = false;
            boolean z4 = z || z2;
            boolean z5 = starGift instanceof TL_stars.TL_starGiftUnique;
            PhotoViewer.AnonymousClass35 anonymousClass35 = this.buttonsLayout;
            LinkSpanDrawable.LinksTextView[] linksTextViewArr = this.subtitleView;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            if (z5) {
                stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                setPattern(0, (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
                linksTextViewArr[0].setTextSize(1, 13.0f);
                anonymousClass35.setVisibility(z4 ? 0 : 8);
                IntroActivity.AnonymousClass1[] anonymousClass1Arr = this.buttons;
                if (z4) {
                    anonymousClass1Arr[1].set(z3 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z3 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
                }
                float f = 1.0f;
                if (starGift.resell_amount != null) {
                    this.hasResellPrice = true;
                    boolean z6 = starGift.resale_ton_only;
                    AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.TON;
                    AmountUtils$Amount resellAmount = starGift.getResellAmount(z6 ? amountUtils$Currency : AmountUtils$Currency.STARS);
                    TextView textView = this.resellPriceView;
                    textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, StarsIntroActivity.replaceStars(resellAmount.currency == amountUtils$Currency, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(resellAmount.toTl(), 1.0f, ',')), 1.13f), Float.valueOf(0.9f)));
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                    textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                    if (StarGiftSheet.isMine(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                        textView.setOnClickListener(new StarGiftSheet$TopView$$ExternalSyntheticLambda1(this, 1));
                        ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
                    } else {
                        textView.setOnClickListener(null);
                        textView.setStateListAnimator(null);
                    }
                }
                if (z) {
                    anonymousClass1Arr[0].setAlpha(1.0f);
                    anonymousClass1Arr[0].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                } else {
                    anonymousClass1Arr[0].setAlpha(0.5f);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                    anonymousClass1Arr[0].set(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
                }
                IntroActivity.AnonymousClass1 anonymousClass1 = anonymousClass1Arr[1];
                if (!z && !z2) {
                    f = 0.5f;
                }
                anonymousClass1.setAlpha(f);
                if (z) {
                    ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                    View.OnClickListener onClickListener = this.onResellClick;
                    if (arrayList != null) {
                        anonymousClass1Arr[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                        anonymousClass1Arr[2].setOnClickListener(onClickListener);
                    } else {
                        anonymousClass1Arr[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                        anonymousClass1Arr[2].setOnClickListener(onClickListener);
                    }
                } else {
                    anonymousClass1Arr[2].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                    anonymousClass1Arr[2].setOnClickListener(this.onShareClick);
                }
                this.hasRibbon = starGift.crafted;
                this.ribbon.drawable.setBackdrop(stargiftattributebackdropArr[0], false, true);
            } else {
                stargiftattributebackdropArr[0] = null;
                linksTextViewArr[0].setTextSize(1, 14.0f);
                this.hasRibbon = false;
                anonymousClass35.setVisibility(8);
            }
            setBackdropPaint(0, stargiftattributebackdropArr[0]);
            StarsIntroActivity.setGiftImage(this.imageView[0].getImageReceiver(), starGift != null ? starGift.getDocument() : null, 160);
            this.imageViewAttributes[0] = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            onSwitchPage(this.currentPage);
        }

        public final void setPattern(int i, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z) {
            if (stargiftattributepattern != null) {
                TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.patternAttribute;
                if (stargiftattributepatternArr[i] == stargiftattributepattern) {
                    return;
                }
                stargiftattributepatternArr[i] = stargiftattributepattern;
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.pattern[i];
                swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, swapAnimatedEmojiDrawable.cacheType, z);
            }
        }

        public void setPreviewAttributes(StarGiftPreviewSheet.Attributes attributes) {
            int i = 0;
            PageTransition pageTransition = this.currentPage;
            if (pageTransition != null && pageTransition.to == 1 && isAttachedToWindow()) {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                ValueAnimator valueAnimator = this.rotationAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.rotationAnimator = null;
                }
                int i2 = 1 - this.toggled;
                this.toggled = i2;
                BackupImageView[] backupImageViewArr = this.imageView;
                RLottieDrawable lottieAnimation = backupImageViewArr[2 - i2].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = backupImageViewArr[this.toggled + 1].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                }
                int i3 = this.toggled + 1;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = attributes.backdrop;
                this.backdrop[i3] = stargiftattributebackdrop;
                setBackdropPaint(i3, stargiftattributebackdrop);
                setPattern(1, attributes.pattern, true);
                int i4 = this.toggled + 1;
                TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.imageViewAttributes;
                stargiftattributemodelArr[i4] = attributes.model;
                StarsIntroActivity.setGiftImage(backupImageViewArr[i4].getImageReceiver(), stargiftattributemodelArr[this.toggled + 1].document, 160);
                animateSwitch();
                float f = this.toggled;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - f, f);
                this.rotationAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new StarGiftSheet$TopView$$ExternalSyntheticLambda4(this, i));
                this.rotationAnimator.addListener(new AnonymousClass3(this, 3));
                this.rotationAnimator.setDuration(320L);
                this.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.rotationAnimator.start();
            }
        }

        public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
            this.models = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class));
            this.patterns = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class));
            this.backdrops = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class));
            this.subtitleView[1].setTextSize(1, 14.0f);
            this.buttonsLayout.setVisibility(8);
            this.toggleBackdrop = 0.0f;
            this.toggled = 0;
            setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.models.next();
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.imageViewAttributes;
            stargiftattributemodelArr[1] = stargiftattributemodel;
            BackupImageView[] backupImageViewArr = this.imageView;
            StarsIntroActivity.setGiftImage(backupImageViewArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
            this.backdrop[1] = stargiftattributebackdrop;
            setBackdropPaint(1, stargiftattributebackdrop);
            stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.models.next;
            StarsIntroActivity.setGiftImage(backupImageViewArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
            ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = this.checkToRotateRunnable;
            AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(profileActivity$9$$ExternalSyntheticLambda1, 2500L);
            invalidate();
        }

        public void setResellPrice(AmountUtils$Amount amountUtils$Amount) {
            int i = 2;
            boolean zIsZero = amountUtils$Amount.isZero();
            int i2 = 1;
            this.hasResellPrice = !zIsZero;
            TextView textView = this.resellPriceView;
            LinkSpanDrawable.LinksTextView[] linksTextViewArr = this.subtitleView;
            int i3 = 0;
            if (zIsZero) {
                ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration.setInterpolator(cubicBezierInterpolator).setListener(new AnonymousClass3(this, i)).setListener(new AnonymousClass3(this, i2)).start();
                linksTextViewArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(cubicBezierInterpolator).start();
            } else {
                textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, StarsIntroActivity.replaceStars(amountUtils$Amount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(amountUtils$Amount.toTl(), 1.0f, ',')), 0.9f)));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                textView.setVisibility(0);
                this.resellPriceViewInProgress = true;
                ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration2.setInterpolator(cubicBezierInterpolator2).setListener(new AnonymousClass3(this, i3)).start();
                linksTextViewArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(cubicBezierInterpolator2).start();
            }
            boolean z = this.hasResellPrice;
            IntroActivity.AnonymousClass1[] anonymousClass1Arr = this.buttons;
            if (z) {
                anonymousClass1Arr[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
            } else {
                anonymousClass1Arr[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
            }
            anonymousClass1Arr[2].setOnClickListener(this.onResellClick);
        }

        public final void setText(int i, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, TLObject tLObject, Spannable spannable) {
            this.titleView[i].setText(charSequence);
            FrameLayout frameLayout = this.subtitleContainer;
            LinkSpanDrawable.LinksTextView linksTextView = this.releasedView;
            TextView textView = this.collectionReleasedView;
            LinkSpanDrawable.LinksTextView[] linksTextViewArr = this.subtitleView;
            if (i == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
                textView.setText(spannableStringBuilder);
                textView.setVisibility(0);
                linksTextView.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    linksTextViewArr[i].setVisibility(8);
                }
            } else if (i != 0 || TextUtils.isEmpty(spannableStringBuilder2)) {
                linksTextViewArr[i].setText(charSequence2);
                if (i == 0) {
                    frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
                } else {
                    linksTextViewArr[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
                }
                linksTextView.setVisibility(8);
                textView.setVisibility(8);
            } else {
                linksTextView.setText(spannableStringBuilder2);
                linksTextView.setVisibility(0);
                textView.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    linksTextViewArr[i].setVisibility(8);
                }
            }
            GiftMessageView[] giftMessageViewArr = this.messageTextView;
            GiftMessageView giftMessageView = giftMessageViewArr[i];
            if (giftMessageView != null) {
                giftMessageView.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
                giftMessageViewArr[i].setUser(tLObject);
                giftMessageViewArr[i].setMessage(spannable);
            }
        }

        public void setWearPreview(TLObject tLObject) {
            String pluralStringComma;
            String string;
            String userName;
            if (tLObject instanceof TLRPC.User) {
                userName = UserObject.getUserName((TLRPC.User) tLObject);
                string = LocaleController.getString(R.string.Online);
            } else {
                if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String str = chat == null ? "" : chat.title;
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    int i = chat.participants_count;
                    pluralStringComma = i > 1 ? LocaleController.formatPluralStringComma("Subscribers", i) : LocaleController.getString(R.string.DiscussChannel);
                } else {
                    int i2 = chat.participants_count;
                    pluralStringComma = i2 > 1 ? LocaleController.formatPluralStringComma("Members", i2) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
                }
                String str2 = str;
                string = pluralStringComma;
                userName = str2;
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(tLObject);
            BackupImageView backupImageView = this.avatarView;
            backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            backupImageView.onNewImageSet();
            this.titleView[2].setText(userName);
            this.subtitleView[2].setText(string);
            updateWearImageTranslation();
            onSwitchPage(this.currentPage);
        }

        public void updateButtonsBackgrounds(int i) {
        }

        public final void updateWearImageTranslation() {
            this.wearImageScale = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
            FrameLayout frameLayout = this.imageLayout;
            float f = -frameLayout.getLeft();
            LinkSpanDrawable.LinksTextView[] linksTextViewArr = this.titleView;
            this.wearImageTx = ((((Math.min(linksTextViewArr[2].getPaint().measureText(linksTextViewArr[2].getText().toString()), linksTextViewArr[2].getWidth()) + linksTextViewArr[2].getWidth()) / 2.0f) + (linksTextViewArr[2].getX() + f)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
            this.wearImageTy = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
        }
    }

    public final class UpgradeIcon extends CompatDrawable {
        public float alpha;
        public final Path arrow;
        public final long start;
        public final Paint strokePaint;
        public final ButtonWithCounterView view;

        public UpgradeIcon(ButtonWithCounterView buttonWithCounterView, int i) {
            super(buttonWithCounterView);
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            Path path = new Path();
            this.arrow = path;
            this.start = System.currentTimeMillis();
            this.alpha = 1.0f;
            this.view = buttonWithCounterView;
            this.paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i);
            path.rewind();
            path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
            path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
            path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        }

        @Override
        public final void draw(Canvas canvas) {
            float f;
            Paint paint = this.paint;
            paint.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
            float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) % 400) / 400.0f;
            Paint paint2 = this.strokePaint;
            int alpha = paint2.getAlpha();
            paint2.setAlpha((int) (alpha * this.alpha));
            paint2.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(1.166f) * 2.0f) + (AndroidUtilities.dpf2(2.16f) * 3.0f)) / 2.0f));
            int i = 0;
            while (i < 4) {
                if (i == 0) {
                    f = 1.0f - fCurrentTimeMillis;
                } else {
                    f = i == 3 ? fCurrentTimeMillis : 1.0f;
                }
                paint2.setAlpha((int) (f * 255.0f * this.alpha));
                canvas.save();
                float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
                canvas.scale(fLerp, fLerp);
                canvas.drawPath(this.arrow, paint2);
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f);
                i++;
            }
            canvas.restore();
            paint2.setAlpha(alpha);
            ButtonWithCounterView buttonWithCounterView = this.view;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.invalidate();
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override
        public final void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }
    }

    public final class UpgradePricesSheet extends BottomSheetLayouted {
        public final LimitPreviewView limitPreviewView;
        public final ArrayList prices;

        public UpgradePricesSheet(Context context, long j, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider) {
            int i;
            super(context, resourcesProvider);
            this.prices = arrayList;
            float f = this.backgroundPaddingLeft / AndroidUtilities.density;
            LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, 0, 0.5f, resourcesProvider);
            this.limitPreviewView = limitPreviewView;
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            limitPreviewView.setIconScale(1.8f);
            float f2 = f;
            this.layout.addView(limitPreviewView, LayoutHelper.createLinear(-1, -2, 17, f2, 20.0f, f, 10.0f));
            setCurrentPrice(j);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i2, true, null);
            textViewMakeTextView.setGravity(17);
            int i3 = R.string.Gift2UpgradeCostsTitle;
            textViewMakeTextView.setText(LocaleController.getString(i3));
            this.actionBar.setTitle(LocaleController.getString(i3));
            this.layout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 0));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i2, false, null);
            textViewMakeTextView2.setGravity(17);
            textViewMakeTextView2.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
            this.layout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 10, 32, 10));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TableView tableView = new TableView(context, resourcesProvider);
            int i4 = 0;
            boolean z = false;
            while (i4 < arrayList.size()) {
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(i4);
                if (currentTime <= starGiftUpgradePrice.date || ((i = i4 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i)).date)) {
                    Date date = new Date(((long) starGiftUpgradePrice.date) * 1000);
                    tableView.addRow(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                    z = true;
                }
                i4++;
                f2 = f2;
            }
            float f3 = f2;
            if (!z) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                    Date date2 = new Date(((long) starGiftUpgradePrice2.date) * 1000);
                    tableView.addRow(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                }
            }
            float f4 = f3 + 14.0f;
            this.layout.addView(tableView, LayoutHelper.createLinear(-1, -2, 7, f4, 16.0f, f4, 15.0f));
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 12.0f, Theme.key_windowBackgroundWhiteGrayText, false, null);
            textViewMakeTextView3.setGravity(17);
            textViewMakeTextView3.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
            this.layout.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 15));
            float f5 = this.backgroundPaddingLeft / AndroidUtilities.density;
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.buttonContainer = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
            View view = new View(getContext());
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            this.buttonContainer.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 55));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider, true);
            this.button = buttonWithCounterView;
            float f6 = f5 + 16.0f;
            this.buttonContainer.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, f6, 16.0f, f6, 16.0f));
            this.containerView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 87));
            RecyclerListView recyclerListView = this.recyclerListView;
            recyclerListView.setPadding(recyclerListView.getPaddingLeft(), this.recyclerListView.getPaddingTop(), this.recyclerListView.getPaddingRight(), AndroidUtilities.dp(80.0f) + this.recyclerListView.getPaddingBottom());
            this.button.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false, true);
            this.button.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 13));
        }

        public final void setCurrentPrice(long j) {
            ArrayList arrayList = this.prices;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
            LimitPreviewView limitPreviewView = this.limitPreviewView;
            limitPreviewView.drawFromRight = true;
            Paint paint = limitPreviewView.ratingPaint;
            int i = Theme.key_featuredStickers_addButton;
            Theme.ResourcesProvider resourcesProvider = limitPreviewView.resourcesProvider;
            paint.setColor(Theme.getColor(i, resourcesProvider));
            limitPreviewView.percent = AndroidUtilities.ilerp(j, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
            AnimatedTextView animatedTextView = limitPreviewView.defaultText;
            animatedTextView.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            AnimatedTextView animatedTextView2 = limitPreviewView.premiumCount;
            animatedTextView2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) animatedTextView2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.defaultCount.setVisibility(8);
            limitPreviewView.premiumText.setVisibility(8);
            animatedTextView2.setTextColor(limitPreviewView.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            animatedTextView.setTextColor(-1);
            limitPreviewView.setIconValue((int) j, false);
            limitPreviewView.isBoostsStyle = true;
            limitPreviewView.isSimpleStyle = true;
            limitPreviewView.isRatingStyle = true;
        }
    }

    public StarGiftSheet(int i, Context context, Theme.ResourcesProvider resourcesProvider, long j, View view) {
        super(context, null, false, false, false, resourcesProvider);
        this.upgradedOnce = false;
        this.heights = new int[2];
        this.overrideNextIndex = -1;
        this.title = "";
        this.currentPage = new PageTransition(0, 0);
        this.firstSet = true;
        this.starCached = new ColoredImageSpan[1];
        this.tickUpgradePriceRunnable = new StarGiftSheet$$ExternalSyntheticLambda3(this, 8);
        this.currentAccount = i;
        this.dialogId = j;
        this.topPadding = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new FrameLayout(context) {
            @Override
            public final void setTranslationY(float f) {
                super.setTranslationY(f);
                StarGiftSheet starGiftSheet = StarGiftSheet.this;
                ActionView actionView = starGiftSheet.actionView;
                if (actionView == null || actionView.getVisibility() != 0) {
                    return;
                }
                starGiftSheet.actionView.invalidate();
            }
        };
        ContainerView containerView = new ContainerView(context);
        this.container = containerView;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.viewPager = anonymousClass2;
        anonymousClass2.setAdapter(new PollItemMenu.AnonymousClass4(this, context, 3));
        updateViewPager();
        View view2 = new View(context);
        int i2 = Theme.key_dialogBackground;
        view2.setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(view2, LayoutHelper.createFrame(-1, 50, 80));
        this.containerView.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1, 119));
        fixNavigationBar(getThemedColor(i2));
        AndroidUtilities.removeFromParent(this.recyclerListView);
        containerView.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        final int i3 = 0;
        ?? r4 = new LinearLayout(this, context) {
            public final StarGiftSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 0:
                        if (this.this$0.currentPage.is(0)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 1:
                        if (this.this$0.currentPage.is(1)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 2:
                        if (this.this$0.currentPage.is(2)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        if (this.this$0.currentPage.is(3)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                }
            }
        };
        this.infoLayout = r4;
        r4.setOrientation(1);
        r4.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        containerView.addView((View) r4, LayoutHelper.createFrame(-1, -1, 55));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.beforeTableTextView = linksTextView;
        int i4 = Theme.key_dialogTextGray2;
        linksTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setGravity(17);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setDisablePaddingsOffsetY(true);
        r4.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 4, -2, 4, 16));
        linksTextView.setVisibility(8);
        TableView tableView = new TableView(context, resourcesProvider);
        this.tableView = tableView;
        r4.addView(tableView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.afterTableTextView = linksTextView2;
        linksTextView2.setTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setTextSize(1, 12.0f);
        linksTextView2.setGravity(17);
        linksTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i5 = Theme.key_featuredStickers_addButton;
        linksTextView2.setLinkTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView2.setDisablePaddingsOffsetY(true);
        linksTextView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        r4.addView(linksTextView2, LayoutHelper.createLinear(-2, -2, 1, 4, 2, 4, 8));
        linksTextView2.setVisibility(8);
        final int i6 = 1;
        ?? r8 = new LinearLayout(this, context) {
            public final StarGiftSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i6) {
                    case 0:
                        if (this.this$0.currentPage.is(0)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 1:
                        if (this.this$0.currentPage.is(1)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 2:
                        if (this.this$0.currentPage.is(2)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        if (this.this$0.currentPage.is(3)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                }
            }
        };
        this.upgradeLayout = r8;
        r8.setOrientation(1);
        r8.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        containerView.addView((View) r8, LayoutHelper.createFrame(-1, -1, 55));
        AffiliateProgramFragment.FeatureCell[] featureCellArr = {featureCell, featureCell, featureCell};
        this.upgradeFeatureCells = featureCellArr;
        AffiliateProgramFragment.FeatureCell featureCell = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        int i7 = R.drawable.menu_feature_unique;
        featureCell.set(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), i7);
        r8.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell2 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        featureCell2.set(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        r8.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell3 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        featureCell3.set(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        r8.addView(featureCellArr[2], LayoutHelper.createLinear(-1, -2));
        View view3 = new View(context);
        this.checkboxSeparator = view3;
        int i8 = Theme.key_divider;
        view3.setBackgroundColor(Theme.getColor(i8, resourcesProvider));
        r8.addView(view3, LayoutHelper.createLinear(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.checkboxLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkbox = checkBox2;
        int i9 = Theme.key_radioBackgroundChecked;
        int i10 = Theme.key_checkboxDisabled;
        int i11 = Theme.key_checkboxCheck;
        CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
        checkBoxBase.setColor(i9, i10, i11);
        checkBox2.setDrawUnchecked(true);
        checkBoxBase.setChecked(-1, false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.checkboxTextView = textView;
        int i12 = Theme.key_dialogTextBlack;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        r8.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 4));
        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
        final int i13 = 2;
        ?? r0 = new LinearLayout(this, context) {
            public final StarGiftSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i13) {
                    case 0:
                        if (this.this$0.currentPage.is(0)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 1:
                        if (this.this$0.currentPage.is(1)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 2:
                        if (this.this$0.currentPage.is(2)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        if (this.this$0.currentPage.is(3)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                }
            }
        };
        this.wearLayout = r0;
        r0.setOrientation(1);
        r0.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        containerView.addView((View) r0, LayoutHelper.createFrame(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.wearTitle = textView2;
        textView2.setTextColor(Theme.getColor(i12, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        r0.addView(textView2, LayoutHelper.createLinear(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(Theme.getColor(i12, resourcesProvider));
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        r0.addView(textView3, LayoutHelper.createLinear(-1, -2, 7, 20, 6, 20, 24));
        AffiliateProgramFragment.FeatureCell featureCell4 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        featureCell4.set(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), i7);
        r0.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell5 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        featureCell5.set(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        r0.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell6 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        AffiliateProgramFragment.FeatureCell[] featureCellArr2 = {featureCell4, featureCell5, featureCell6};
        featureCell6.set(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        r0.addView(featureCellArr2[2], LayoutHelper.createLinear(-1, -2));
        final int i14 = 3;
        ?? r5 = new LinearLayout(this, context) {
            public final StarGiftSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i14) {
                    case 0:
                        if (this.this$0.currentPage.is(0)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 1:
                        if (this.this$0.currentPage.is(1)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    case 2:
                        if (this.this$0.currentPage.is(2)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                    default:
                        if (this.this$0.currentPage.is(3)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return false;
                }
            }
        };
        this.craftLayout = r5;
        r5.setOrientation(1);
        r5.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        containerView.addView((View) r5, LayoutHelper.createFrame(-1, -1, 55));
        AffiliateProgramFragment.FeatureCell featureCell7 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        featureCell7.set(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), i7);
        r5.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell8 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        featureCell8.set(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        r5.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell9 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider, false);
        AffiliateProgramFragment.FeatureCell[] featureCellArr3 = {featureCell7, featureCell8, featureCell9};
        featureCell9.set(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        r5.addView(featureCellArr3[2], LayoutHelper.createLinear(-1, -2));
        r4.setAlpha(1.0f);
        r8.setAlpha(0.0f);
        r0.setAlpha(0.0f);
        r5.setAlpha(0.0f);
        TopView topView = new TopView(context, resourcesProvider, new StarGiftSheet$$ExternalSyntheticLambda3(this, 9), new StarGiftSheet$$ExternalSyntheticLambda15(this, 13), new StarGiftSheet$$ExternalSyntheticLambda15(this, 14), new StarGiftSheet$$ExternalSyntheticLambda15(this, 15), new StarGiftSheet$$ExternalSyntheticLambda15(this, 16), new StarGiftSheet$$ExternalSyntheticLambda15(this, 17), new StarGiftSheet$$ExternalSyntheticLambda15(this, 18), new StarGiftSheet$$ExternalSyntheticLambda15(this, 19));
        this.topView = topView;
        topView.craftTopView.helpButton.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 20));
        int i15 = this.backgroundPaddingLeft;
        topView.setPadding(i15, 0, i15, 0);
        containerView.addView(topView, LayoutHelper.createFrame(-1, -2, 55));
        PhotoViewer.AnonymousClass36 anonymousClass36 = this.layoutManager;
        this.reverseLayout = true;
        anonymousClass36.setReverseLayout(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i2));
        View view4 = new View(context);
        this.buttonShadow = view4;
        view4.setBackgroundColor(getThemedColor(i8));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 55));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        this.button = buttonWithCounterViewM;
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.OK), false, true);
        buttonWithCounterViewM.setSubText(null, false);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        layoutParamsCreateFrame.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        layoutParamsCreateFrame.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(buttonWithCounterViewM, layoutParamsCreateFrame);
        containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.underButtonContainer = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i2));
        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context, null);
        this.underButtonLinkTextView = linksTextView3;
        linksTextView3.setTextSize(1, 12.0f);
        linksTextView3.setTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView3.setLinkTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView3.setGravity(17);
        frameLayout2.addView(linksTextView3, LayoutHelper.createFrame(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.recyclerListView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 10));
        linearLayout.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 12));
        FireworksOverlay fireworksOverlay = new FireworksOverlay(context);
        this.fireworksOverlay = fireworksOverlay;
        containerView.addView(fireworksOverlay, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomBulletinContainer = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.actionBar);
        containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        ActionView actionView = new ActionView(context);
        this.actionView = actionView;
        containerView.addView(actionView, LayoutHelper.createFrame(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new VoIPFragment$$ExternalSyntheticLambda7(actionView, 1), 12.0f, 12, null, arrayList);
    }

    public static void access$1200(StarGiftSheet starGiftSheet, boolean z) {
        int listPosition$1 = starGiftSheet.getListPosition$1();
        if (listPosition$1 < 0) {
            return;
        }
        int i = (z ? 1 : -1) + listPosition$1;
        int i2 = starGiftSheet.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition$1 : i2 > listPosition$1)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = starGiftSheet.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : starGiftSheet.giftsList.get(i);
        if (obj == null) {
            return;
        }
        if ((z ? starGiftSheet.right : starGiftSheet.left) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (eq((z ? starGiftSheet.right : starGiftSheet.left).savedStarGift, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (z ? starGiftSheet.right : starGiftSheet.left).slugStarGift;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj;
                if (tL_starGiftUnique == tL_starGiftUnique2) {
                    return;
                }
                if (tL_starGiftUnique != null && (tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug))) {
                    return;
                }
            }
        }
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(starGiftSheet, starGiftSheet.getContext(), starGiftSheet.currentAccount, starGiftSheet.dialogId, starGiftSheet.resourcesProvider, starGiftSheet.container.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            anonymousClass9.set((TL_stars.SavedStarGift) obj, starGiftSheet.giftsList);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) obj;
            anonymousClass9.set(tL_starGiftUnique3.slug, tL_starGiftUnique3, starGiftSheet.giftsList);
        }
        AndroidUtilities.removeFromParent(anonymousClass9.containerView);
        if (z) {
            starGiftSheet.right = anonymousClass9;
        } else {
            starGiftSheet.left = anonymousClass9;
        }
    }

    public static void addAttributeRow(TableView tableView, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        tableView.addRow(str, starGiftAttribute.name, getRarityName(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift != null && savedStarGift2 != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            TL_stars.StarGift starGift2 = savedStarGift2.gift;
            if (starGift == starGift2) {
                return true;
            }
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                return starGift.id == starGift2.id;
            }
            if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date) {
                return true;
            }
        }
        return false;
    }

    public static String getRarityName(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i <= 0 ? "<0.1%" : AffiliateProgramFragment.percents(i);
    }

    public static boolean isMine(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 5);
    }

    public static boolean isMineWithActions(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        return chat != null && chat.creator;
    }

    public static boolean isWorn(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder replaceUnderstood(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new ColoredImageSpan(R.drawable.filled_understood), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new ColoredImageSpan(R.drawable.filled_reactions), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public final void applyNewGiftFromUpdates(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(getDialogId$1());
            lambda$showGiftOfferSheet$15();
            return;
        }
        TLRPC.Update update = updates.update;
        if (!(update instanceof TL_update.TL_updateNewMessage)) {
            if (updates.updates == null) {
                message = null;
                break;
            }
            int i = 0;
            while (true) {
                if (i >= updates.updates.size()) {
                    message = null;
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    message = ((TL_update.TL_updateNewMessage) update2).message;
                    break;
                }
                i++;
            }
        } else {
            message = ((TL_update.TL_updateNewMessage) update).message;
        }
        if (message == null) {
            StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(getDialogId$1());
            lambda$showGiftOfferSheet$15();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.rolling = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i2 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i2 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                set(savedStarGift2, this.giftsList);
                this.sample_attributes = null;
                this.rolling = false;
                StarsController.IGiftsList iGiftsList = this.giftsList;
                if (iGiftsList != null) {
                    iGiftsList.notifyUpdate();
                } else {
                    StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(this.dialogId);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.giftsList == null) {
            StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(getDialogId$1());
        }
        this.rolling = true;
        this.savedStarGift = null;
        this.myProfile = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        set(messageObject, this.giftsList);
        this.sample_attributes = null;
        this.rolling = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final boolean canConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.messageObject.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.messageObject.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i = this.currentAccount;
                long j = this.dialogId;
                if (isMineWithActions(i, j)) {
                    int i2 = this.savedStarGift.flags;
                    if (((j < 0 ? 2048 : 8) & i2) != 0 && (i2 & 16) != 0 && (i2 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean canCraft() {
        int i;
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null || uniqueGift.crafted || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(uniqueGift.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i > 0 && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() >= i;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.currentPage.is(4)) {
            boolean z = this.topView.craftTopView.crafting;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    public final void cantWithBlockchainGiftAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2CantDoTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift != null && !TextUtils.isEmpty(uniqueGift.slug)) {
            builder.setPositiveButton(LocaleController.getString(R.string.OpenFragment), new StarGiftSheet$$ExternalSyntheticLambda60(this, uniqueGift, 1));
        }
        ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
    }

    public final void convert() {
        int i;
        long peerDialogId;
        long j;
        long dialogId;
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            i = messageObject.messageOwner.date;
            boolean zIsOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = this.messageObject;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            if (peer != null) {
                dialogId = DialogObject.getPeerDialogId(peer);
            } else {
                dialogId = zIsOutOwner ? messageObject2.getDialogId() : clientUserId;
            }
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            if (peer2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(peer2);
            } else {
                peerDialogId = zIsOutOwner ? clientUserId : this.messageObject.getDialogId();
            }
            j = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            i = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j = this.savedStarGift.convert_stars;
            dialogId = this.dialogId;
        }
        int iMax = Math.max(1, (MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - i)) / 86400);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", iMax, (UserObject.isService(peerDialogId) || peerDialogId == 2666000) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j)));
        final long j2 = j;
        final long j3 = dialogId;
        builder.setPositiveButton(LocaleController.getString(R.string.Gift2ConvertButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog2, int i2) {
                this.f$0.lambda$convert$105(inputStarGift, j3, clientUserId, j2);
            }
        });
        ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        MessageSeenView.AnonymousClass3 anonymousClass3 = new MessageSeenView.AnonymousClass3(this, 5);
        this.adapter = anonymousClass3;
        return anonymousClass3;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (this.giftsList == ((StarsController.GiftsList) objArr[1])) {
                CraftTopView craftTopView = this.topView.craftTopView;
                if (craftTopView == null || !craftTopView.crafting) {
                    updateViewPager();
                }
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return;
        }
        ResaleGiftsFragment.SelectGiftSheet.State state = this.giftsToCraft;
        if (state != null) {
            state.detach();
            this.giftsToCraft = null;
        }
        Roller roller = this.roller;
        if (roller != null) {
            roller.detach();
        }
        super.lambda$showGiftOfferSheet$15();
    }

    public final void doTransfer(final long j, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j2;
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j2 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j2 = savedStarGift.transfer_stars;
            peerDialogId = this.dialogId;
        }
        if (j2 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = inputStarGift;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new StarGiftSheet$$ExternalSyntheticLambda132(0, j, peerDialogId, this, callback));
            return;
        }
        final long j3 = peerDialogId;
        StarsController starsController = StarsController.getInstance(this.currentAccount, false);
        if (!starsController.balanceLoaded) {
            starsController.getBalance(true, false, new PhotoViewer$$ExternalSyntheticLambda126(this, starsController, j, callback, 2));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = inputStarGift;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final Utilities.Callback callback2 = callback;
                final long j4 = j;
                final long j5 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Utilities.Callback callback3 = callback2;
                        starGiftSheet.lambda$doTransfer$167(tLObject, tL_inputInvoiceStarGiftTransfer2, j4, j5, callback3, tL_error);
                    }
                });
            }
        });
    }

    public final void doUpgrade() {
        TL_stars.InputSavedStarGift inputStarGift;
        long j;
        String str;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (buttonWithCounterView.loading || (inputStarGift = getInputStarGift()) == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        long j2 = 0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            } else {
                str = null;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            } else {
                str = null;
            }
        }
        String str2 = str;
        if (j > 0 || this.upgrade_form != null) {
            buttonWithCounterView.setLoading(true);
            CheckBox2 checkBox2 = this.checkbox;
            if (j > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = checkBox2.checkBoxBase.isChecked;
                upgradestargift.stargift = inputStarGift;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new ProfileActivity$$ExternalSyntheticLambda65(21, this, inputStarGift));
                return;
            }
            int i = 0;
            StarsController starsController = StarsController.getInstance(this.currentAccount, false);
            if (!starsController.balanceLoaded) {
                starsController.getBalance(true, false, new QrActivity$$ExternalSyntheticLambda17(27, this, starsController));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.upgrade_form.form_id;
            if (TextUtils.isEmpty(str2)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = checkBox2.checkBoxBase.isChecked;
                tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str2;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.upgrade_form.invoice.prices;
            int size = arrayList.size();
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j2 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new StarGiftSheet$$ExternalSyntheticLambda162(this, str2, inputStarGift, j2, 0));
        }
    }

    @Override
    public final int getActionBarProgressHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    public final int getBottomHeight() {
        if (this.currentPage.to(1)) {
            return getMeasuredHeight();
        }
        if (this.currentPage.to(2)) {
            return getMeasuredHeight();
        }
        if (this.currentPage.to(3)) {
            return getMeasuredHeight();
        }
        if (this.currentPage.to(4)) {
            return 0;
        }
        return getMeasuredHeight();
    }

    @Override
    public BulletinFactory getBulletinFactory() {
        return new BulletinFactory(this.bottomBulletinContainer, this.resourcesProvider);
    }

    public final long getDialogId$1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return 0L;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                if (peer2 != null) {
                    return DialogObject.getPeerDialogId(peer2);
                }
                return messageObject.isOutOwner() ? this.messageObject.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                    return DialogObject.getPeerDialogId(peer);
                }
                TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                if (peer3 != null) {
                    return DialogObject.getPeerDialogId(peer3);
                }
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                return starGift2 instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) : this.dialogId;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
        }
        return 0L;
    }

    public final TL_stars.StarGift getGift() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String getGiftName() {
        TL_stars.StarGift gift = getGift();
        if (!(gift instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) gift;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        return BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb);
    }

    public final TL_stars.InputSavedStarGift getInputStarGift() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j = this.dialogId;
        if (j < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.slug;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & 4096) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.messageObject.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.messageObject.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.messageObject;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.slug;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String getLink$1() {
        TL_stars.StarGift gift = getGift();
        if (!(gift instanceof TL_stars.TL_starGiftUnique) || gift.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + gift.slug;
    }

    public final int getListPosition$1() {
        int iIndexOf;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.StarGift starGift;
        StarsController.IGiftsList iGiftsList = this.giftsList;
        if (iGiftsList == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
        if (savedStarGift2 == null) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.slugStarGift;
            if (tL_starGiftUnique3 != null) {
                iIndexOf = iGiftsList.indexOf(tL_starGiftUnique3);
            }
            return -1;
        }
        iIndexOf = iGiftsList.indexOf(savedStarGift2);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        TL_stars.StarGift gift = getGift();
        for (int i = 0; i < this.giftsList.getLoadedCount(); i++) {
            Object obj = this.giftsList.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift3 = this.savedStarGift;
                if ((savedStarGift3 != null && eq(savedStarGift3, (TL_stars.SavedStarGift) obj)) || (gift != null && (savedStarGift = (TL_stars.SavedStarGift) obj) != null && (gift == (starGift = savedStarGift.gift) || ((gift instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && gift.id == starGift.id)))) {
                    return i;
                }
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && ((tL_starGiftUnique = this.slugStarGift) == (tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj) || (tL_starGiftUnique != null && tL_starGiftUnique2 != null && (tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug))))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift getNeighbourSavedGift(boolean z) {
        int listPosition$1 = getListPosition$1();
        if (listPosition$1 < 0) {
            return null;
        }
        int i = (z ? 1 : -1) + listPosition$1;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition$1 : i2 > listPosition$1)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique getNeighbourSlugGift(boolean z) {
        int listPosition$1 = getListPosition$1();
        if (listPosition$1 < 0) {
            return null;
        }
        int i = (z ? 1 : -1) + listPosition$1;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition$1 : i2 > listPosition$1)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return this.title;
    }

    public final TL_stars.TL_starGiftUnique getUniqueGift() {
        TL_stars.StarGift gift = getGift();
        if (gift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) gift;
        }
        return null;
    }

    public final boolean hasNeighbour(boolean z) {
        return (getNeighbourSavedGift(z) == null && getNeighbourSlugGift(z) == null) ? false : true;
    }

    public final void initTONTransfer(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        getstargiftwithdrawalurl.stargift = inputStarGift;
        if (inputStarGift == null) {
            return;
        }
        getstargiftwithdrawalurl.password = tL_inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new StarGiftSheet$$ExternalSyntheticLambda180(this, twoStepVerificationActivity, 0));
    }

    public final void lambda$addAttributeRow$44(TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, ButtonSpan.TextViewButtons[] textViewButtonsArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new StarGiftPreviewSheet(getContext(), this.resourcesProvider, this.currentAccount, starGift.title, arrayList, false).show();
        } else {
            showHint(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(starGiftAttribute.getRarityPermille())), textViewButtonsArr[0], false);
        }
        zArr[0] = false;
    }

    public final void lambda$addAttributeRow$45(boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift gift = getGift();
        GiftAuctionController.getInstance(this.currentAccount).requestAuctionUpgrades(gift.gift_id, new ChatActivity$$ExternalSyntheticLambda155(this, gift, starGiftAttribute, textViewButtonsArr, zArr, 5));
    }

    public final void lambda$convert$103(AlertDialog alertDialog, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        alertDialog.dismissUnless(400L);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).show(false);
                return;
            } else {
                getBulletinFactory().createErrorBulletin(LocaleController.getString(R.string.UnknownError), null).show(false);
                return;
            }
        }
        lambda$showGiftOfferSheet$15();
        StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(j);
        if (j < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            bundle.putBoolean("start_from_monetization", true);
            StatisticActivity statisticActivity = new StatisticActivity(bundle);
            BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(j, true);
            BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j);
            statisticActivity.whenFullyVisible(new LinkManager$3$$ExternalSyntheticLambda0(statisticActivity, j3, 20));
            safeLastFragment.presentFragment(statisticActivity);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j2);
        if (userFull != null) {
            int iMax = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = iMax;
            if (iMax <= 0) {
                userFull.flags2 &= -257;
            }
        }
        StarsController.getInstance(this.currentAccount, false).invalidateBalance();
        StarsController.getInstance(this.currentAccount, false).invalidateTransactions(true);
        if (safeLastFragment instanceof StarsIntroActivity) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j3), R.raw.stars_topup).show(true);
            return;
        }
        StarsIntroActivity starsIntroActivity = new StarsIntroActivity();
        starsIntroActivity.whenFullyVisible(new LinkManager$3$$ExternalSyntheticLambda0(starsIntroActivity, j3, 19));
        safeLastFragment.presentFragment(starsIntroActivity);
    }

    public final void lambda$convert$105(TL_stars.InputSavedStarGift inputSavedStarGift, long j, long j2, long j3) {
        AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3, null);
        AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
        AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(convertstargift, new StarGiftSheet$$ExternalSyntheticLambda116(this, alertDialog, j, j2, j3));
    }

    public final void lambda$doTransfer$157(Utilities.Callback callback, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        callback.run(tL_error);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            j3 = j;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j3 = j;
            BulletinFactory.of(safeLastFragment).showForError(false, tL_error);
        } else if (j < 0 || j2 < 0) {
            j3 = j;
            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j3))), R.raw.forward);
            bulletinCreateSimpleBulletin.ignoreDetach = true;
            bulletinCreateSimpleBulletin.show();
        } else {
            ChatActivity chatActivityOf = ChatActivity.of(j);
            j3 = j;
            chatActivityOf.whenFullyVisible(new StarGiftSheet$$ExternalSyntheticLambda175(this, chatActivityOf, j3, 0));
            safeLastFragment.presentFragment(chatActivityOf);
        }
        StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(j3);
        StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(j2);
    }

    public final void lambda$doTransfer$158(final Utilities.Callback callback, final long j, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback callback2 = callback;
                TLRPC.TL_error tL_error2 = tL_error;
                this.f$0.lambda$doTransfer$157(callback2, j, j2, tLObject, tL_error2);
            }
        });
    }

    public final void lambda$doTransfer$161(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public final void lambda$doTransfer$164(long j, long j2, Utilities.Callback callback) {
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 11, null, new PhotoViewer$$ExternalSyntheticLambda126(this, new boolean[]{false}, j2, callback, 4), 0L);
        starsNeededSheet.setOnDismissListener(new StarGiftSheet$$ExternalSyntheticLambda5(this, 0));
        starsNeededSheet.show();
    }

    public final void lambda$doTransfer$165(TLObject tLObject, long j, long j2, Utilities.Callback callback, TLRPC.TL_error tL_error, long j3) {
        int i = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                getBulletinFactory().showForError(false, tL_error);
                return;
            } else {
                if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                    this.button.setLoading(false);
                    StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                    return;
                }
                StarsController starsController = StarsController.getInstance(this.currentAccount, false);
                LaunchActivity$$ExternalSyntheticLambda37 launchActivity$$ExternalSyntheticLambda37 = new LaunchActivity$$ExternalSyntheticLambda37(11, j3, j, this, callback);
                starsController.balanceLoaded = false;
                starsController.getBalance(false, true, launchActivity$$ExternalSyntheticLambda37);
                starsController.balanceLoaded = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        StarsController.getInstance(this.currentAccount, false).invalidateTransactions(false);
        StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(j);
        StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(j2);
        StarsController.getInstance(this.currentAccount, false).invalidateBalance();
        callback.run(null);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (j < 0 || j2 < 0) {
                Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j))), R.raw.forward);
                bulletinCreateSimpleBulletin.ignoreDetach = true;
                bulletinCreateSimpleBulletin.show();
            } else {
                ChatActivity chatActivityOf = ChatActivity.of(j);
                chatActivityOf.whenFullyVisible(new StarGiftSheet$$ExternalSyntheticLambda175(this, chatActivityOf, j, 1));
                safeLastFragment.presentFragment(chatActivityOf);
            }
        }
        Utilities.stageQueue.postRunnable(new StarGiftSheet$$ExternalSyntheticLambda186(this, tL_payments_paymentResult, i));
    }

    public final void lambda$doTransfer$167(TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j, long j2, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            Bulletin bulletinMakeForError = getBulletinFactory().makeForError(tL_error);
            bulletinMakeForError.ignoreDetach = true;
            bulletinMakeForError.show();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i = 0;
        MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j3 = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j3 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new StarGiftSheet$$ExternalSyntheticLambda116(this, j, j2, callback, j3));
    }

    public final void lambda$doUpgrade$124(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public final void lambda$doUpgrade$126(TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(this, tL_error, tLObject, inputSavedStarGift, 13));
    }

    public final void lambda$doUpgrade$128() {
        Bundle bundle = new Bundle();
        long j = this.dialogId;
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        safeLastFragment.showAsSheet(profileActivity, bottomSheetParams);
    }

    public final void lambda$doUpgrade$130(String str) {
        this.button.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            switchPage(0, true, null);
            return;
        }
        lambda$showGiftOfferSheet$15();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        boolean z = lastFragment instanceof ChatActivity;
        long j = this.dialogId;
        if (z) {
            ChatActivity chatActivity = (ChatActivity) lastFragment;
            if (chatActivity.getDialogId() == j) {
                BulletinFactory.of(chatActivity).createSimpleBulletin(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j))), R.raw.gift).show(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i = NotificationCenter.closeProfileActivity;
        Long lValueOf = Long.valueOf(j);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, lValueOf, bool);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j), bool);
        ChatActivity chatActivityOf = ChatActivity.of(j);
        chatActivityOf.whenFullyVisible(new StickersActivity$$ExternalSyntheticLambda18(4, this, chatActivityOf));
        lastFragment.presentFragment(chatActivityOf);
    }

    public final void lambda$doUpgrade$131(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public final void lambda$doUpgrade$134(long j) {
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 10, null, new StickersActivity$$ExternalSyntheticLambda18(2, this, new boolean[]{false}), 0L);
        starsNeededSheet.setOnDismissListener(new StarGiftSheet$$ExternalSyntheticLambda5(this, 1));
        starsNeededSheet.show();
    }

    public final void lambda$doUpgrade$135(TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            StarsController.getInstance(this.currentAccount, false).invalidateTransactions(false);
            StarsController.getInstance(this.currentAccount, false).invalidateBalance();
            if (!TextUtils.isEmpty(str) && (savedStarGift = this.savedStarGift) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            this.upgradedOnce = true;
            this.upgrade_form = null;
            applyNewGiftFromUpdates(inputSavedStarGift, tL_payments_paymentResult.updates, new StarGiftSheet$$ExternalSyntheticLambda19(this, str, 2));
            Utilities.stageQueue.postRunnable(new StarGiftSheet$$ExternalSyntheticLambda186(this, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            getBulletinFactory().showForError(false, tL_error);
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            this.button.setLoading(false);
            StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount, false);
        StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda12 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j, 3);
        starsController.balanceLoaded = false;
        starsController.getBalance(false, true, starGiftSheet$$ExternalSyntheticLambda12);
        starsController.balanceLoaded = true;
    }

    public final void lambda$initTONTransfer$154(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                Browser.openUrlInSystemBrowser(getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new StarGiftSheet$$ExternalSyntheticLambda180(this, twoStepVerificationActivity, 1), 8);
                return;
            }
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
            BulletinFactory.showError(tL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        String string = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        TextView textView = new TextView(getContext());
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        int i2 = R.drawable.list_circle;
        imageView.setImageResource(i2);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int color = Theme.getColor(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(null, i, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(i2);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
        TextView textView3 = new TextView(getContext());
        textView3.setTextColor(Theme.getColor(null, i, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            builder.setPositiveButton(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new StoriesViewPager$$ExternalSyntheticLambda0(this, 6));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(getContext());
            textView4.setTextColor(Theme.getColor(null, i, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog);
    }

    public final void lambda$onMenuPressed$10() {
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftCollectionsList(this.dialogId, false);
            if (profileGiftCollectionsList != null) {
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                profileGiftCollectionsList.updateGiftsUnsaved(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = getInputStarGift();
            savestargift.unsave = this.savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = this.savedStarGift;
        boolean z = savedStarGift3.pinned_to_top;
        if (((StarsController.GiftsList) this.giftsList).togglePinned(savedStarGift3, !z, false)) {
            new ProfileGiftsContainer.UnpinSheet(getContext(), this.dialogId, this.savedStarGift, this.resourcesProvider, new StarGiftSheet$$ExternalSyntheticLambda105(this, 0)).show();
            return;
        }
        if (z) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.Gift2Unpinned, getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            getBulletinFactory().createSimpleBulletin(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).show();
        }
    }

    public final void lambda$onResellPressed$33(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(this, progress, tL_starGiftUnique, 21));
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(this, progress, Long.parseLong(tL_error.text.substring(26)), 23));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(this, progress, tL_error, 22));
        }
    }

    public final void lambda$onResellPressed$34(TL_stars.TL_starGiftUnique tL_starGiftUnique, AlertDialog alertDialog) {
        Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
        progressMakeButtonLoading.init();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new LinkManager$$ExternalSyntheticLambda0(this, progressMakeButtonLoading, tL_starGiftUnique, 29));
    }

    public final void lambda$onResellPressed$39(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda142(this, tL_starGiftUnique, amountUtils$Amount, runnable, 0));
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(this, Long.parseLong(tL_error.text.substring(26)), runnable, 22));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda144(this, tL_error, runnable, 0));
        }
    }

    public final void lambda$onResellPressed$40(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new StarGiftSheet$$ExternalSyntheticLambda106(this, tL_starGiftUnique, amountUtils$Amount, runnable, 1));
    }

    public final void lambda$onUpdatePriceClick$28(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda142(this, tL_starGiftUnique, amountUtils$Amount, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda144(this, tL_error, runnable, 1));
        }
    }

    public final void lambda$onUpdatePriceClick$29(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new StarGiftSheet$$ExternalSyntheticLambda106(this, tL_starGiftUnique, amountUtils$Amount, runnable, 0));
    }

    public final void lambda$openCrafting$3(MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        this.nextButtonCrafting = true;
        set(messageObject, (StarsController.IGiftsList) null);
        switchPage(0, true, null);
        FireworksOverlay fireworksOverlay = this.fireworksOverlay;
        if (fireworksOverlay != null) {
            fireworksOverlay.start(true);
        }
        StarsController.getInstance(this.currentAccount, false).invalidateBalance();
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(UserConfig.getInstance(this.currentAccount).getClientUserId(), false);
        if (profileGiftsList != null) {
            profileGiftsList.processCrafting(arrayList, starGift);
        }
    }

    public final void lambda$openCrafting$4(Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        MessageObject messageObject;
        if (updates == null) {
            if (tL_error != null) {
                if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, new DarkThemeResourceProvider());
                    String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                    ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                } else {
                    String str = tL_error.text;
                    if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                        getBulletinFactory().showForError(false, tL_error);
                    } else {
                        long j = Long.parseLong(tL_error.text.substring(25)) + ((long) ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, new DarkThemeResourceProvider());
                        String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                        AlertDialog alertDialog2 = builder2.alertDialog;
                        alertDialog2.title = string2;
                        alertDialog2.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(j, true)));
                        ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder2);
                    }
                }
                runnable.run();
                return;
            }
            return;
        }
        ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
        int size = arrayListFindUpdates.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                messageObject = null;
                break;
            }
            Object obj = arrayListFindUpdates.get(i);
            i++;
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                messageObject = new MessageObject(this.currentAccount, message, false, false);
                break;
            }
        }
        MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        if (messageObject != null) {
            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
            callback2.run(starGift, new ProfileActivity$$ExternalSyntheticLambda149(this, messageObject, arrayList, starGift, 11));
            return;
        }
        callback2.run(null, null);
        StarsController.getInstance(this.currentAccount, false).invalidateBalance();
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(UserConfig.getInstance(this.currentAccount).getClientUserId(), false);
        if (profileGiftsList != null) {
            profileGiftsList.processCrafting(arrayList, null);
        }
    }

    public final void lambda$openCrafting$5(ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        ResaleGiftsFragment.SelectGiftSheet.State state = this.giftsToCraft;
        if (state != null) {
            state.detach();
            this.giftsToCraft = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(craftstargift, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda20(this, callback2, arrayList, runnable, 1));
    }

    public final void lambda$openCrafting$7(TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (this.giftsToCraft == null) {
            int i = this.currentAccount;
            ResaleGiftsFragment.SelectGiftSheet.State state = new ResaleGiftsFragment.SelectGiftSheet.State(i, tL_starGiftUnique.gift_id);
            this.giftsToCraft = state;
            if (!state.attached) {
                NotificationCenter.getInstance(i).addObserver(state, NotificationCenter.starUserGiftsLoaded);
                state.list.load();
                state.resaleList.load(false);
                state.attached = true;
            }
        }
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            CraftTopView.SelectGiftView[] selectGiftViewArr = this.topView.craftTopView.gifts;
            if (i2 >= selectGiftViewArr.length) {
                ResaleGiftsFragment.SelectGiftSheet selectGiftSheet = new ResaleGiftsFragment.SelectGiftSheet(getContext(), tL_starGiftUnique.title, this.giftsToCraft);
                selectGiftSheet.without.addAll(hashSet);
                selectGiftSheet.adapter.update(true);
                selectGiftSheet.willBeFirst = bool.booleanValue();
                selectGiftSheet.actionView.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                selectGiftSheet.onSelect = new StarGiftSheet$$ExternalSyntheticLambda102(0, callback);
                selectGiftSheet.show();
                return;
            }
            TL_stars.StarGift starGift = selectGiftViewArr[i2].gift;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i2++;
        }
    }

    public final void lambda$openSetAsTheme$16(long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, DialogsActivity dialogsActivity) {
        ChatThemeController.getInstance(this.currentAccount).setDialogTheme(j, new ThemeKey(null, tL_starGiftUnique.slug));
        dialogsActivity.presentFragment(ChatActivity.of(j), true);
    }

    public final boolean lambda$openSetAsTheme$17(TL_stars.TL_starGiftUnique tL_starGiftUnique, DialogsActivity dialogsActivity, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(this.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser == 0 || giftThemeUser == j) {
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(j, new ThemeKey(null, tL_starGiftUnique.slug));
            dialogsActivity.presentFragment(ChatActivity.of(j), true);
            return true;
        }
        AlertsCreator.showGiftThemeApplyConfirm(this.currentAccount, giftThemeUser, getContext(), new PhotoViewer$$ExternalSyntheticLambda126(this, j, tL_starGiftUnique, dialogsActivity, 3), tL_starGiftUnique, this.resourcesProvider);
        return true;
    }

    public final void lambda$openTransfer$145(TLObject tLObject, PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            Bulletin bulletinMakeForError = getBulletinFactory().makeForError(tL_error);
            bulletinMakeForError.ignoreDetach = true;
            bulletinMakeForError.show();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(this.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            pollItemMenu$$ExternalSyntheticLambda8.run();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
    }

    public final void lambda$openTransfer$147(TLObject tLObject, UserSelectorBottomSheet[] userSelectorBottomSheetArr, Long l, PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            Bulletin bulletinMakeForError = getBulletinFactory().makeForError(tL_error);
            bulletinMakeForError.ignoreDetach = true;
            bulletinMakeForError.show();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            pollItemMenu$$ExternalSyntheticLambda8.run();
        } else {
            new BulletinFactory(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
        }
    }

    public final void lambda$openTransfer$149(int i, int i2, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, UserSelectorBottomSheet[] userSelectorBottomSheetArr, Long l) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i4 = 19;
        if (l.longValue() == -99) {
            if (i < i2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i3), new Object[0]);
                ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new GiftTransferTopView(getContext(), tL_starGiftUnique), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            int i5 = Theme.key_dialogTextBlack;
            zzlj.m(i5, this.resourcesProvider, textView, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(getContext());
            OKLCH.m(i5, this.resourcesProvider, textView2, 16.0f);
            zzko.m(R.string.Gift2ExportTONFragmentText, new Object[]{getGiftName()}, textView2);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            builder2.setView(linearLayout);
            builder2.setPositiveButton(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(i4, this, userSelectorBottomSheetArr));
            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder2, (AlertDialog.OnButtonClickListener) null);
            return;
        }
        PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8 = new PollItemMenu$$ExternalSyntheticLambda8(this, l, userSelectorBottomSheetArr, i4);
        if (l.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-l.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-l.longValue());
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getFullChannel, new ProfileActivity$$ExternalSyntheticLambda65(20, this, pollItemMenu$$ExternalSyntheticLambda8));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog.Builder builder3 = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                AlertDialog alertDialog2 = builder3.alertDialog;
                alertDialog2.title = string2;
                alertDialog2.message = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder3);
                return;
            }
        } else if (l.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(l.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new BulletinFactory(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getFullUser, new LoginActivity$$ExternalSyntheticLambda42(this, userSelectorBottomSheetArr, l, pollItemMenu$$ExternalSyntheticLambda8, 13));
                return;
            }
        }
        pollItemMenu$$ExternalSyntheticLambda8.run();
    }

    public final void lambda$openUpgrade$117(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.requesting_upgrade_form = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            Bulletin bulletinMakeForError = getBulletinFactory().makeForError(tL_error);
            bulletinMakeForError.ignoreDetach = true;
            bulletinMakeForError.show();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            this.upgrade_form = paymentForm;
            openUpgradeAfter();
        }
    }

    public final void lambda$openValueStats$181(long j, String str) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        ResaleGiftsFragment resaleGiftsFragment = new ResaleGiftsFragment(this.dialogId, str, j, this.resourcesProvider);
        resaleGiftsFragment.closeParentSheet = new StarGiftSheet$$ExternalSyntheticLambda69(this, 1);
        lastFragment.showAsSheet(resaleGiftsFragment, bottomSheetParams);
    }

    public final void lambda$openValueStats$183(AlertDialog alertDialog, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j, TLRPC.TL_error tL_error) {
        TableView tableView;
        TableView tableView2;
        BottomSheet bottomSheet;
        ViewGroup viewGroup;
        float f;
        float f2;
        int i = 11;
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                getBulletinFactory().showForError(false, tL_error);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(getContext(), this.resourcesProvider, false, false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        BackupImageView backupImageView = new BackupImageView(getContext());
        StarsIntroActivity.setGiftImage(backupImageView.getImageReceiver(), document, 160);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(21.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            zzko.m(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            zzko.m(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            zzko.m(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464 = new ChatActivity$$ExternalSyntheticLambda464(this, new HintView2[1], frameLayout, i);
        TableView tableView3 = new TableView(getContext(), this.resourcesProvider);
        frameLayout.addView(tableView3, LayoutHelper.createFrame(-1, -1, 119));
        tableView3.addRow(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb = new StringBuilder("⭐️");
        sb.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb.append(" (~");
        tableView3.addRow(string, StarsIntroActivity.replaceStarsWithPlain(false, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            tableView3.addRow(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int iRound = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (iRound > 0) {
                tableView3.addRow(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(iRound, ' ') + "%", null, null);
                tableView = tableView3;
            } else {
                tableView = tableView3;
                tableView.addRow(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        } else {
            tableView = tableView3;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            StarGiftSheet$$ExternalSyntheticLambda169 starGiftSheet$$ExternalSyntheticLambda169 = new StarGiftSheet$$ExternalSyntheticLambda169(chatActivity$$ExternalSyntheticLambda464, new ButtonSpan.TextViewButtons[]{(ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableRowAddRow.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            TableView tableView4 = tableView;
            TableRow tableRowAddRow = tableView4.addRow(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", starGiftSheet$$ExternalSyntheticLambda169, null);
            tableView2 = tableView4;
            tableRowAddRow.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(starGiftSheet$$ExternalSyntheticLambda169, 10));
        } else {
            tableView2 = tableView;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            StarGiftSheet$$ExternalSyntheticLambda169 starGiftSheet$$ExternalSyntheticLambda1610 = new StarGiftSheet$$ExternalSyntheticLambda169(chatActivity$$ExternalSyntheticLambda464, new ButtonSpan.TextViewButtons[]{(ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableRowAddRow.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow tableRowAddRow2 = tableView2.addRow(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", starGiftSheet$$ExternalSyntheticLambda1610, null);
            tableRowAddRow2.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(starGiftSheet$$ExternalSyntheticLambda1610, 11));
        }
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            f = 1.0f;
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            f2 = 2.0f;
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.5f, buttonWithCounterView.getTextPaint().getFontMetricsInt());
            animatedEmojiSpan.document = document;
            spannableStringBuilder.setSpan(animatedEmojiSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            buttonWithCounterView.setText(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            ViewGroup viewGroup2 = linearLayout;
            bottomSheet = bottomSheetM;
            buttonWithCounterView.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda1(this, str2, j, 6));
            viewGroup2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 42, 7, 0, 0, 0, 2));
            viewGroup = viewGroup2;
        } else {
            bottomSheet = bottomSheetM;
            viewGroup = linearLayout;
            f = 1.0f;
            f2 = 2.0f;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(getContext(), this.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document.id, 1.5f, buttonWithCounterView2.getTextPaint().getFontMetricsInt());
            animatedEmojiSpan2.document = document;
            spannableStringBuilder2.setSpan(animatedEmojiSpan2, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            buttonWithCounterView2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f2), AndroidUtilities.dp(f)), false, true);
            buttonWithCounterView2.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(17, this, uniqueStarGiftValueInfo));
            viewGroup.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 42, 7, 0, 0, 0, 0));
            bottomSheet = bottomSheet;
        }
        bottomSheet.customView = viewGroup;
        bottomSheet.show();
    }

    public final void lambda$performBuyPressed$171(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, GiftMessageBottomSheet giftMessageBottomSheet, PaymentFormState paymentFormState, Browser.Progress progress) {
        progress.init();
        StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, tL_textWithEntities, z, new PeerColorActivity$$ExternalSyntheticLambda9(this, progress, tL_starGiftUnique, j, giftMessageBottomSheet, 1));
    }

    public final void lambda$performBuyPressed$172(final GiftMessageBottomSheet giftMessageBottomSheet, AmountUtils$Currency amountUtils$Currency, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        this.button.setLoading(false);
        if (giftMessageBottomSheet != null && giftMessageBottomSheet.mLoading) {
            giftMessageBottomSheet.mLoading = false;
            giftMessageBottomSheet.writeButton.setLoading(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new ResaleBuyTransferAlert(getContext(), this.resourcesProvider, tL_starGiftUnique, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift), this.currentAccount, j, getGiftName(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                boolean z2 = z;
                GiftMessageBottomSheet giftMessageBottomSheet2 = giftMessageBottomSheet;
                this.f$0.lambda$performBuyPressed$171(tL_starGiftUnique2, j, tL_textWithEntities, z2, giftMessageBottomSheet2, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
            }
        }).show();
    }

    public final void lambda$releasedByText$49(String str) {
        lambda$showGiftOfferSheet$15();
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str);
    }

    public final void lambda$repollMessage$96(TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
        this.messageObjectRepolled = true;
        this.messageObjectRepolling = false;
        Boolean bool = this.unsavedFromSavedStarGift;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        set(messageObject, (StarsController.IGiftsList) null);
    }

    public final void lambda$repollMessage$97(int i, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i2 = 0;
            while (true) {
                if (i2 < messages_messages.messages.size()) {
                    TLRPC.Message message = messages_messages.messages.get(i2);
                    if (message != null && message.id == i) {
                        TLRPC.MessageAction messageAction = message.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                            messageObject = new MessageObject(this.currentAccount, message, false, false);
                            messageObject.setType();
                        }
                    }
                    i2++;
                } else {
                    messageObject = null;
                }
            }
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(this, tLObject, messageObject, 20));
        }
    }

    public final void lambda$repostStory$41(Long l) {
        TLRPC.Chat chat;
        String str = (l.longValue() >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-l.longValue()))) == null) ? "" : chat.title;
        Bulletin bulletinCreateSimpleBulletinWithIconSize = getBulletinFactory().createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        bulletinCreateSimpleBulletinWithIconSize.ignoreDetach = true;
        bulletinCreateSimpleBulletinWithIconSize.show();
    }

    public final void lambda$set$46(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void lambda$set$47(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void lambda$set$55(TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String giftName = getGiftName();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3, null);
        AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
        AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                final AlertDialog alertDialog2 = alertDialog;
                final String str4 = giftName;
                final long j2 = j;
                final TLRPC.Document document2 = document;
                final String str5 = str;
                final String str6 = str2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        starGiftSheet.lambda$openValueStats$183(alertDialog2, tLObject, document2, str5, str6, str4, j2, tL_error);
                    }
                });
            }
        });
    }

    public final void lambda$set$75(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, null, new StarGiftSheet$$ExternalSyntheticLambda69(this, 2)).show();
    }

    public final void lambda$set$80(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void lambda$set$81(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void lambda$set$84(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, null, new StarGiftSheet$$ExternalSyntheticLambda69(this, 2)).show();
    }

    public final void lambda$set$86(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, null, new StarGiftSheet$$ExternalSyntheticLambda69(this, 2)).show();
    }

    public final void lambda$set$88(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, null, new StarGiftSheet$$ExternalSyntheticLambda69(this, 2)).show();
    }

    public final void lambda$set$94(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void lambda$set$95(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void lambda$show$109(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.slugStarGift = tL_starGiftUnique;
        set(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public final void lambda$show$111(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(6, this, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(7, alertDialog, tL_error));
    }

    public final void lambda$show$112(AlertDialog alertDialog, MessageObject messageObject) {
        alertDialog.dismiss();
        this.messageObjectRepolled = true;
        set(messageObject, (StarsController.IGiftsList) null);
        super.show();
    }

    public final void lambda$show$114(TLRPC.TL_messageActionStarGift tL_messageActionStarGift, AlertDialog alertDialog, TLObject tLObject) {
        MessageObject messageObject;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            messageObject = null;
            break;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
        int i = 0;
        while (true) {
            if (i >= messages_messages.messages.size()) {
                messageObject = null;
                break;
            }
            TLRPC.Message message = messages_messages.messages.get(i);
            if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                messageObject = new MessageObject(this.currentAccount, message, false, false);
                messageObject.setType();
                break;
            }
            i++;
        }
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(this, alertDialog, messageObject, 23));
        } else {
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda73(alertDialog, 0));
        }
    }

    public final void lambda$show$115(AlertDialog alertDialog, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            alertDialog.dismiss();
            this.userStarGiftRepolled = true;
            set(savedStarGift, (StarsController.IGiftsList) null);
            super.show();
            return;
        }
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            bulletinCreateSimpleBulletinWithIconSize.ignoreDetach = true;
            bulletinCreateSimpleBulletinWithIconSize.show();
        }
    }

    public final void lambda$showDeleteDescriptionAlert$68(Browser.Progress progress, AlertDialog alertDialog, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, CharSequence charSequence) {
        progress.end(false);
        alertDialog.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 16, null, new StickersActivity$$ExternalSyntheticLambda18(5, this, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    getBulletinFactory().showForError(false, tL_error);
                    return;
                }
                return;
            }
        }
        int i = 0;
        while (i < tL_starGiftUnique.attributes.size()) {
            if (tL_starGiftUnique.attributes.get(i) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                tL_starGiftUnique.attributes.remove(i);
                i--;
            }
            i++;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        set(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(3, this, tL_starGiftUnique));
    }

    public final void lambda$showDeleteDescriptionAlert$70(TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j, CharSequence charSequence, AlertDialog alertDialog) {
        Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
        progressMakeButtonLoading.init();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new DialogsActivity$$ExternalSyntheticLambda132(this, progressMakeButtonLoading, alertDialog, tL_starGiftUnique, j, charSequence));
    }

    public final void lambda$showDeleteDescriptionAlert$71(TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                getBulletinFactory().showForError(false, tL_error);
                return;
            }
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j += tL_labeledPrice.amount;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView textViewMakeTextView = TextHelper.makeTextView(getContext(), 16.0f, Theme.key_dialogTextBlack, false, null);
        textViewMakeTextView.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        TableView.TableRowFullContent tableRowFullContentAddFullRow = tableView.addFullRow(charSequence);
        tableRowFullContentAddFullRow.setFilled(true);
        SpoilersTextView spoilersTextView = (SpoilersTextView) tableRowFullContentAddFullRow.getChildAt(0);
        spoilersTextView.setTextSize(1, 12.0f);
        spoilersTextView.setGravity(17);
        linearLayout.addView(tableView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.alertDialog.title = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        builder.setView(linearLayout);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j)), 1.13f, (ColoredImageSpan[]) null), new StarGiftSheet$$ExternalSyntheticLambda167(this, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j, charSequence));
        builder.show();
    }

    public final void lambda$tickUpgradePrice$121(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.requesting_upgrade_form = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            Bulletin bulletinMakeForError = getBulletinFactory().makeForError(tL_error);
            bulletinMakeForError.ignoreDetach = true;
            bulletinMakeForError.show();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            this.upgrade_form = paymentForm;
            StarGiftSheet$$ExternalSyntheticLambda3 starGiftSheet$$ExternalSyntheticLambda3 = this.tickUpgradePriceRunnable;
            AndroidUtilities.cancelRunOnUIThread(starGiftSheet$$ExternalSyntheticLambda3);
            AndroidUtilities.runOnUIThread(starGiftSheet$$ExternalSyntheticLambda3);
        }
    }

    public final void lambda$toggleShow$107(TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        StarsController.GiftsCollections profileGiftCollectionsList;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z && this.savedStarGift != null && (profileGiftCollectionsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftCollectionsList(this.dialogId, false)) != null) {
                    profileGiftCollectionsList.updateGiftsUnsaved(this.savedStarGift, !savestargift.unsave);
                }
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).show(false);
                return;
            }
            return;
        }
        lambda$showGiftOfferSheet$15();
        long dialogId$1 = getDialogId$1();
        if (!z) {
            StarsController.getInstance(this.currentAccount, false).invalidateProfileGifts(dialogId$1);
        }
        if (dialogId$1 >= 0) {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z2 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z2 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), safeLastFragment instanceof ProfileActivity ? null : new StarGiftSheet$$ExternalSyntheticLambda141(dialogId$1, safeLastFragment))).show(true);
        } else {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z2 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z2 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).show();
        }
    }

    public final void lambda$toggleWear$22(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.button.setLoading(false);
        SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(this, 7);
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(26, this.currentAccount, getContext(), anonymousClass8, this.resourcesProvider);
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.dialogId = j;
        limitReachedBottomSheet.updateRows$7();
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.statisticClickRunnable = new QrActivity$$ExternalSyntheticLambda17(28, this, chat);
        }
        limitReachedBottomSheet.show();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void lambda$openCrafting$8() {
        TopView topView;
        CraftTopView craftTopView;
        if (this.currentPage.is(4) && (topView = this.topView) != null && (craftTopView = topView.craftTopView) != null) {
            if (craftTopView.crafting) {
                return;
            }
            if (craftTopView.crafted) {
                super.lambda$openCrafting$8();
                return;
            }
        }
        if (this.onlyWearInfo || this.currentPage.to <= 0 || this.button.loading || this.isLearnMore) {
            super.lambda$openCrafting$8();
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            set(messageObject, (StarsController.IGiftsList) null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                set(savedStarGift, this.giftsList);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
                if (tL_starGiftUnique != null) {
                    set(this.slug, tL_starGiftUnique, this.giftsList);
                }
            }
        }
        switchPage(0, true, null);
    }

    public final void onBuyPressed() {
        long clientUserId;
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (this.button.loading || uniqueGift == null) {
            return;
        }
        if (this.slugStarGift == null || !this.resale) {
            clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        } else {
            clientUserId = this.dialogId;
            if (clientUserId == 0) {
                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
        }
        AmountUtils$Currency amountUtils$Currency = uniqueGift.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
        if (this.slugStarGift == null || !this.resale) {
            performBuyPressed(null, uniqueGift, clientUserId, amountUtils$Currency, null, true);
            return;
        }
        GiftMessageBottomSheet giftMessageBottomSheet = new GiftMessageBottomSheet(getContext(), this.resourcesProvider, uniqueGift, clientUserId);
        giftMessageBottomSheet.mCallback = new ChatActivity$$ExternalSyntheticLambda124(this, giftMessageBottomSheet, uniqueGift, clientUserId, amountUtils$Currency, 3);
        giftMessageBottomSheet.show();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public final void onMenuPressed(View view) {
        boolean z;
        boolean zIsMineWithActions;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.StarGift starGift;
        TLRPC.Message message;
        String link$1 = getLink$1();
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        boolean z2 = (getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || !(this.giftsList instanceof StarsController.GiftsList) || this.savedStarGift == null || getInputStarGift() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
        itemOptionsMakeOptions.addIf((savedStarGift2 == null || !savedStarGift2.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift2 == null || !savedStarGift2.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new StarGiftSheet$$ExternalSyntheticLambda3(this, 10), z2);
        itemOptionsMakeOptions.addIf(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new StarGiftSheet$$ExternalSyntheticLambda3(this, 11), canCraft());
        itemOptionsMakeOptions.addIf(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new StarGiftSheet$$ExternalSyntheticLambda3(this, 12), (getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || getUniqueGift().resell_amount == null) ? false : true);
        itemOptionsMakeOptions.addIf(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new StarGiftSheet$$ExternalSyntheticLambda19(this, link$1, 8), link$1 != null);
        itemOptionsMakeOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new StarGiftSheet$$ExternalSyntheticLambda3(this, 13), link$1 != null);
        itemOptionsMakeOptions.addIf(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new StarGiftSheet$$ExternalSyntheticLambda3(this, 14), uniqueGift != null && uniqueGift.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique uniqueGift2 = getUniqueGift();
        if (uniqueGift2 == null || !uniqueGift2.theme_available) {
            z = false;
        } else {
            long peerDialogId = DialogObject.getPeerDialogId(uniqueGift2.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(uniqueGift2.host_id);
            if ((peerDialogId <= 0 || !isMineWithActions(this.currentAccount, peerDialogId)) && (peerDialogId2 <= 0 || !isMineWithActions(this.currentAccount, peerDialogId2))) {
                z = false;
            } else {
                z = true;
            }
        }
        itemOptionsMakeOptions.addIf(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new StarGiftSheet$$ExternalSyntheticLambda3(this, 15), z);
        if (getInputStarGift() != null) {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    starGift = savedStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    } else {
                        tL_starGiftUnique = this.slugStarGift;
                        if (tL_starGiftUnique != null) {
                            zIsMineWithActions = false;
                        }
                    }
                } else {
                    tL_starGiftUnique = this.slugStarGift;
                    if (tL_starGiftUnique != null) {
                        zIsMineWithActions = false;
                    }
                }
                zIsMineWithActions = isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
            } else {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            zIsMineWithActions = isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                        }
                    }
                    zIsMineWithActions = false;
                } else {
                    savedStarGift = this.savedStarGift;
                    if (savedStarGift != null) {
                        starGift = savedStarGift.gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        } else {
                            tL_starGiftUnique = this.slugStarGift;
                            if (tL_starGiftUnique != null) {
                                zIsMineWithActions = false;
                            }
                        }
                    } else {
                        tL_starGiftUnique = this.slugStarGift;
                        if (tL_starGiftUnique != null) {
                            zIsMineWithActions = false;
                        }
                    }
                    zIsMineWithActions = isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                }
            }
        } else {
            zIsMineWithActions = false;
        }
        itemOptionsMakeOptions.addIf(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new StarGiftSheet$$ExternalSyntheticLambda3(this, 16), zIsMineWithActions);
        itemOptionsMakeOptions.addIf(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new StarGiftSheet$$ExternalSyntheticLambda3(this, 17), this.savedStarGift == null && getDialogId$1() != 0);
        itemOptionsMakeOptions.drawScrim = false;
        itemOptionsMakeOptions.onTopOfScrim = true;
        itemOptionsMakeOptions.dimAlpha = 0;
        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(2.0f));
        itemOptionsMakeOptions.show();
    }

    public final void onResellPressed(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i;
        TL_stars.SavedStarGift savedStarGift2;
        TLRPC.Message message;
        TLRPC.Message message2;
        int i2 = 0;
        if (view.getAlpha() < 0.99f) {
            cantWithBlockchainGiftAlert();
            return;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (uniqueGift.resell_amount != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.formatString(R.string.Gift2UnlistTitle, getGiftName());
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.Gift2UnlistText);
            builder.setPositiveButton(LocaleController.getString(R.string.Gift2ActionUnlist), new StarGiftSheet$$ExternalSyntheticLambda60(this, uniqueGift, i2));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new PhotoViewer$$ExternalSyntheticLambda97(21));
            builder.show();
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || (message2 = messageObject.messageOwner) == null) {
            savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                i = savedStarGift.can_resell_at;
            } else {
                i = 0;
            }
        } else {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
            } else {
                savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    i = savedStarGift.can_resell_at;
                } else {
                    i = 0;
                }
            }
        }
        if (i <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, null, new StarGiftSheet$$ExternalSyntheticLambda62(this, uniqueGift, i2), this.resourcesProvider);
            return;
        }
        Context context = getContext();
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 == null || (message = messageObject2.messageOwner) == null) {
            savedStarGift2 = this.savedStarGift;
            if (savedStarGift2 != null) {
                i2 = savedStarGift2.can_resell_at;
            }
        } else {
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
            } else {
                savedStarGift2 = this.savedStarGift;
                if (savedStarGift2 != null) {
                    i2 = savedStarGift2.can_resell_at;
                }
            }
        }
        showTimeoutAlert(i2 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
    }

    public final void onSharePressed() {
        AnonymousClass11 anonymousClass11 = this.shareAlert;
        if (anonymousClass11 != null && anonymousClass11.isShown()) {
            lambda$showGiftOfferSheet$15();
        }
        String link$1 = getLink$1();
        ?? r1 = new ShareAlert(getContext(), link$1, link$1, this.resourcesProvider) {
            {
                this.includeStoryFromMessage = true;
            }

            @Override
            public final void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                BulletinFactory bulletinFactory;
                if (z && (bulletinFactory = getBulletinFactory()) != null) {
                    if (longSparseArray.size() == 1) {
                        long jKeyAt = longSparseArray.keyAt(0);
                        if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            Bulletin bulletinCreateSimpleBulletin = bulletinFactory.createSimpleBulletin(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])));
                            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin.ignoreDetach = true;
                            bulletinCreateSimpleBulletin.show();
                        } else if (jKeyAt < 0) {
                            Bulletin bulletinCreateSimpleBulletin2 = bulletinFactory.createSimpleBulletin(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)));
                            bulletinCreateSimpleBulletin2.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin2.ignoreDetach = true;
                            bulletinCreateSimpleBulletin2.show();
                        } else {
                            Bulletin bulletinCreateSimpleBulletin3 = bulletinFactory.createSimpleBulletin(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)));
                            bulletinCreateSimpleBulletin3.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin3.ignoreDetach = true;
                            bulletinCreateSimpleBulletin3.show();
                        }
                    } else {
                        Bulletin bulletinCreateSimpleBulletinWithIconSize = bulletinFactory.createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size()))));
                        bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                        bulletinCreateSimpleBulletinWithIconSize.ignoreDetach = true;
                        bulletinCreateSimpleBulletinWithIconSize.show();
                    }
                    try {
                        this.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }

            @Override
            public final void onShareStory(View view) {
                StarGiftSheet.this.repostStory(view);
            }
        };
        this.shareAlert = r1;
        r1.delegate = new PhotoViewer.AnonymousClass49(this, 11);
        r1.show();
    }

    @Override
    public final void onSwipeStarts() {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide(true);
            this.currentHintView = null;
        }
    }

    public final void onSwitchedPage() {
        int i;
        TL_stars.TL_starGiftUnique uniqueGift;
        setAlpha(this.currentPage.at(0));
        setAlpha(this.currentPage.at(1));
        setAlpha(this.currentPage.at(2));
        setAlpha(this.currentPage.at(3));
        float fAt = 1.0f - this.currentPage.at(4);
        FrameLayout frameLayout = this.buttonContainer;
        frameLayout.setAlpha(fAt);
        PageTransition pageTransition = this.currentPage;
        TopView topView = this.topView;
        topView.onSwitchPage(pageTransition);
        ImageView imageView = topView.craftView;
        if (!this.currentPage.is(0) || (uniqueGift = getUniqueGift()) == null || uniqueGift.crafted || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(uniqueGift.owner_id))) {
            i = 8;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at > 0) {
                        i = 0;
                    }
                }
                i = 8;
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) || savedStarGift.can_craft_at <= 0) {
                    i = 8;
                } else {
                    i = 0;
                }
            }
        }
        imageView.setVisibility(i);
        ContainerView containerView = this.container;
        float pVar = containerView.top();
        ActionView actionView = this.actionView;
        actionView.setAlpha(this.currentPage.at(0) * Utilities.clamp01(AndroidUtilities.ilerp(pVar - actionView.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        containerView.updateTranslations();
        containerView.invalidate();
        frameLayout.setVisibility(this.currentPage.is(4) ? 8 : 0);
        updateUnderButtonContainer();
    }

    public final void onUpdatePriceClick() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, uniqueGift, new StarGiftSheet$$ExternalSyntheticLambda62(this, uniqueGift, 2), this.resourcesProvider);
    }

    public final void onWearPressed() {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (isWorn(this.currentAccount, getUniqueGift()) || this.shownWearInfo)) {
            toggleWear(false);
            return;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        TLRPC.Peer peer = uniqueGift.owner_id;
        if (peer == null) {
            peer = uniqueGift.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(uniqueGift.title);
        sb.append(" #");
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, BillingController$$ExternalSyntheticOutline0.m(uniqueGift.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.setText(spannableStringBuilder, true, true);
        buttonWithCounterView.setSubText(null, true);
        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 25));
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, true, null);
    }

    public final void openAsLearnMore(long j, String str) {
        this.isLearnMore = true;
        StarsController.getInstance(this.currentAccount, false).getStarGiftPreview(j, new OAuthSheet$$ExternalSyntheticLambda13(25, this, str));
    }

    public final void openCrafting(boolean z) {
        int i;
        int i2 = 1;
        MessageObject messageObject = this.messageObject;
        int i3 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                i = savedStarGift.can_craft_at;
            } else {
                i = 0;
            }
        }
        if (i > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i, true));
            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
            return;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (!TextUtils.isEmpty(uniqueGift.gift_address)) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string2;
            alertDialog2.message = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder2);
            return;
        }
        TopView topView = this.topView;
        if (z) {
            topView.craftTopView.setup(this.currentAccount, uniqueGift.gift_id, uniqueGift.getDocument(), uniqueGift.title);
            if (canCraft()) {
                TL_stars.TL_starGiftUnique uniqueGift2 = getUniqueGift();
                CraftTopView craftTopView = topView.craftTopView;
                if (uniqueGift2 == null) {
                    craftTopView.getClass();
                } else {
                    int i4 = 0;
                    while (true) {
                        CraftTopView.SelectGiftView[] selectGiftViewArr = craftTopView.gifts;
                        if (i4 >= selectGiftViewArr.length) {
                            break;
                        }
                        CraftTopView.SelectGiftView selectGiftView = selectGiftViewArr[i4];
                        TL_stars.StarGift starGift = selectGiftView.gift;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            selectGiftView.setGift(uniqueGift2, true);
                            break;
                        }
                        i4++;
                    }
                    craftTopView.updateCounts(true);
                }
            }
        }
        topView.craftTopView.setOnCraft(new StarGiftSheet$$ExternalSyntheticLambda66(this, i3));
        if (this.giftsToCraft == null) {
            int i5 = this.currentAccount;
            ResaleGiftsFragment.SelectGiftSheet.State state = new ResaleGiftsFragment.SelectGiftSheet.State(i5, uniqueGift.gift_id);
            this.giftsToCraft = state;
            if (!state.attached) {
                NotificationCenter.getInstance(i5).addObserver(state, NotificationCenter.starUserGiftsLoaded);
                state.list.load();
                state.resaleList.load(false);
                state.attached = true;
            }
        }
        StarGiftSheet$$ExternalSyntheticLambda62 starGiftSheet$$ExternalSyntheticLambda62 = new StarGiftSheet$$ExternalSyntheticLambda62(this, uniqueGift, i2);
        CraftTopView craftTopView2 = topView.craftTopView;
        craftTopView2.setOnAddGift(starGiftSheet$$ExternalSyntheticLambda62);
        craftTopView2.setOnClose(new StarGiftSheet$$ExternalSyntheticLambda3(this, 18));
        switchPage(4, true, null);
    }

    public final void openProfile(long j) {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide(true);
            this.currentHintView = null;
        }
        lambda$showGiftOfferSheet$15();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || UserObject.isService(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void openTransfer() {
        TL_stars.SavedStarGift savedStarGift;
        int i;
        MessageObject messageObject;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i2;
        TL_stars.SavedStarGift savedStarGift2;
        int i3;
        TLRPC.Message message2;
        TLRPC.Message message3;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide(true);
            this.currentHintView = null;
        }
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 == null || (message3 = messageObject2.messageOwner) == null) {
            savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                i = savedStarGift.can_transfer_at;
            } else {
                i = 0;
            }
        } else {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
            } else {
                savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    i = savedStarGift.can_transfer_at;
                } else {
                    i = 0;
                }
            }
        }
        if (i > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            Context context = getContext();
            MessageObject messageObject3 = this.messageObject;
            if (messageObject3 == null || (message2 = messageObject3.messageOwner) == null) {
                savedStarGift2 = this.savedStarGift;
                if (savedStarGift2 != null) {
                    i3 = savedStarGift2.can_transfer_at;
                } else {
                    i3 = 0;
                }
            } else {
                TLRPC.MessageAction messageAction2 = message2.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                } else {
                    savedStarGift2 = this.savedStarGift;
                    if (savedStarGift2 != null) {
                        i3 = savedStarGift2.can_transfer_at;
                    } else {
                        i3 = 0;
                    }
                }
            }
            showTimeoutAlert(i3 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
            return;
        }
        TL_stars.SavedStarGift savedStarGift3 = this.savedStarGift;
        if (savedStarGift3 == null) {
            messageObject = this.messageObject;
            if (messageObject != null) {
                return;
            } else {
                return;
            }
        }
        TL_stars.StarGift starGift = savedStarGift3.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            i2 = savedStarGift3.can_export_at;
        } else {
            messageObject = this.messageObject;
            if (messageObject != null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
            TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
            if (!(starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
            i2 = tL_messageActionStarGiftUnique.can_export_at;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Context context2 = getContext();
        int i4 = this.currentAccount;
        UserSelectorBottomSheet[] userSelectorBottomSheetArr = {new UserSelectorBottomSheet(context2, i4, BirthdayController.getInstance(i4).getState(), 3, this.resourcesProvider)};
        UserSelectorBottomSheet userSelectorBottomSheet = userSelectorBottomSheetArr[0];
        userSelectorBottomSheet.customTitle = LocaleController.getString(R.string.Gift2TransferShort);
        BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = userSelectorBottomSheet.actionBar;
        if (anonymousClass4 != null) {
            anonymousClass4.setTitle(userSelectorBottomSheet.getTitle());
        }
        UserSelectorBottomSheet.AnonymousClass4 anonymousClass5 = userSelectorBottomSheet.headerView;
        if (anonymousClass5 != null) {
            anonymousClass5.setText(userSelectorBottomSheet.getTitle());
        }
        int iMax = currentTime > i2 ? 0 : Math.max(1, Math.round(Math.max(0, i2 - currentTime) / 86400.0f));
        UserSelectorBottomSheet userSelectorBottomSheet2 = userSelectorBottomSheetArr[0];
        userSelectorBottomSheet2.includeTonOption = true;
        userSelectorBottomSheet2.tonDays = iMax;
        userSelectorBottomSheet2.updateItems(false, true);
        UserSelectorBottomSheet userSelectorBottomSheet3 = userSelectorBottomSheetArr[0];
        userSelectorBottomSheet3.onUserSelectedListener = new StarGiftSheet$$ExternalSyntheticLambda81(this, currentTime, i2, iMax, tL_starGiftUnique2, userSelectorBottomSheetArr);
        userSelectorBottomSheet3.show();
    }

    public final void openTransferAlert(long j, Utilities.Callback callback) {
        TLRPC.Message message;
        long j2;
        String forcedFirstName;
        TLObject tLObject;
        int i = 0;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j2 = savedStarGift.transfer_stars;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            forcedFirstName = UserObject.getForcedFirstName(user);
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat == null) {
                forcedFirstName = "";
                tLObject = chat;
            } else {
                forcedFirstName = chat.title;
                tLObject = chat;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new GiftTransferTopView(getContext(), uniqueGift, tLObject), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        OKLCH.m(Theme.key_dialogTextBlack, this.resourcesProvider, textView, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j2 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j2, getGiftName(), DialogObject.getShortName(j)) : LocaleController.formatString(R.string.Gift2TransferText, getGiftName(), forcedFirstName)));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributeModel.class));
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(uniqueGift.slug) && (uniqueGift.flags & 256) != 0) {
            tableView.addRow(LocaleController.getString(R.string.GiftValue2), zzil.m("~", BillingController.getInstance().formatCurrency(uniqueGift.value_amount, uniqueGift.value_currency, BillingController.getInstance().getCurrencyExp(uniqueGift.value_currency), true)), null, null);
        }
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.setView(linearLayout);
        builder.setPositiveButton(j2 > 0 ? StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j2)), 1.13f, (ColoredImageSpan[]) null) : LocaleController.getString(R.string.Gift2TransferDo), new StarGiftSheet$$ExternalSyntheticLambda79(i, callback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.needStarsBalance = true;
        alertDialog.show();
    }

    public final void openUpgrade() {
        TL_stars.InputSavedStarGift inputStarGift;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide(true);
            this.currentHintView = null;
        }
        if (this.switchingPagesAnimator == null && (inputStarGift = getInputStarGift()) != null) {
            MessageObject messageObject = this.messageObject;
            long j4 = this.dialogId;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j2 = tL_messageActionStarGift.gift.id;
                j3 = tL_messageActionStarGift.upgrade_stars;
                z = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z2 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z3 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (tL_messageActionStarGift.prepaid_upgrade) {
                    z4 = DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.messageObject.getFromChatId();
                } else {
                    z4 = tL_messageActionStarGift.upgrade_separate;
                }
            } else {
                j = 0;
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j2 = starGift.id;
                j3 = savedStarGift.upgrade_stars;
                z = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z2 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z3 = j4 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                str = savedStarGift2.prepaid_upgrade_hash;
                z4 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.checkboxTextView;
            if (z) {
                textView.setText(LocaleController.getString(z3 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z2) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            CheckBox2 checkBox2 = this.checkbox;
            checkBox2.checkBoxBase.setChecked(-1, (z || j3 <= j || z4) ? false : true, false);
            ArrayList arrayList = this.sample_attributes;
            if (arrayList != null && (j3 > j || this.upgrade_form != null)) {
                openUpgradeAfter();
                return;
            }
            if (arrayList == null) {
                StarsController.getInstance(this.currentAccount, false).getStarGiftPreview(j2, new StarGiftSheet$$ExternalSyntheticLambda69(this, 0));
            }
            if (j3 > j || this.upgrade_form != null) {
                return;
            }
            this.requesting_upgrade_form = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = checkBox2.checkBoxBase.isChecked;
                tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j4);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, false);
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda70(this, 0));
        }
    }

    public final void openUpgradeAfter() {
        long j;
        boolean z;
        int i;
        char c;
        int i2;
        String string;
        String string2;
        MessageObject messageObject = this.messageObject;
        int i3 = 1;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j > 0 || TextUtils.isEmpty(tL_messageActionStarGift.prepaid_upgrade_hash)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j > 0 || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (this.sample_attributes != null) {
            if (j > 0 || this.upgrade_form != null) {
                long j2 = 0;
                if (this.upgrade_form != null) {
                    for (int i4 = 0; i4 < this.upgrade_form.invoice.prices.size(); i4++) {
                        j2 += this.upgrade_form.invoice.prices.get(i4).amount;
                    }
                }
                Roller roller = this.roller;
                TopView topView = this.topView;
                if (roller == null) {
                    this.roller = new Roller(topView);
                }
                Roller roller2 = this.roller;
                ArrayList arrayList = this.sample_attributes;
                ArrayList arrayList2 = roller2.models;
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    ((Roller.Sticker) obj).detach();
                }
                arrayList2.clear();
                ArrayList arrayList3 = roller2.backgrounds;
                arrayList3.clear();
                ArrayList arrayList4 = roller2.symbols;
                arrayList4.clear();
                ArrayList arrayListFindAttributes = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = arrayListFindAttributes.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayListFindAttributes.get(i6);
                    i6 += i3;
                    TopView topView2 = roller2.topView;
                    boolean z2 = z;
                    Roller.Sticker sticker = new Roller.Sticker(topView2.imagesRollView, (TL_stars.starGiftAttributeModel) obj2);
                    if (topView2.isAttachedToWindow() && sticker.mine) {
                        sticker.imageReceiver.onAttachedToWindow();
                    }
                    arrayList2.add(sticker);
                    z = z2;
                    i3 = 1;
                }
                boolean z3 = z;
                ArrayList arrayListFindAttributes2 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = arrayListFindAttributes2.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj3 = arrayListFindAttributes2.get(i7);
                    i7++;
                    arrayList3.add(new Roller.Background((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList arrayListFindAttributes3 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = arrayListFindAttributes3.size();
                int i8 = 0;
                while (i8 < size4) {
                    Object obj4 = arrayListFindAttributes3.get(i8);
                    i8++;
                    arrayList4.add(new Roller.Symbol((TL_stars.starGiftAttributePattern) obj4));
                }
                topView.setPreviewingAttributes(this.sample_attributes);
                long j3 = this.dialogId;
                if (z3) {
                    topView.setText(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j3)), null, null, null, null);
                } else {
                    topView.setText(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null, null, null, null);
                }
                ButtonWithCounterView buttonWithCounterView = this.button;
                buttonWithCounterView.setFilled(true);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                buttonWithCounterView.setSubText(null, true);
                if (j2 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.next_prices != null) {
                        for (int i9 = 0; i9 < this.next_prices.size(); i9++) {
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.next_prices.get(i9);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                        }
                    }
                    ArrayList arrayList5 = this.prices;
                    FrameLayout frameLayout = this.underButtonContainer;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.underButtonLinkTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new StarGiftSheet$$ExternalSyntheticLambda3(this, 1)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    updateUnderButtonContainer();
                    ColoredImageSpan[] coloredImageSpanArr = this.starCached;
                    if (z3) {
                        i = 1;
                        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j2)), 1.13f, coloredImageSpanArr), true, true);
                    } else {
                        i = 1;
                        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j2)), 1.13f, coloredImageSpanArr), true, true);
                    }
                } else {
                    i = 1;
                    buttonWithCounterView.setText(LocaleController.getString(R.string.Confirm), true, true);
                }
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, i));
                View view = this.checkboxSeparator;
                LinearLayout linearLayout = this.checkboxLayout;
                if (z3) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c = 0;
                } else {
                    c = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                AffiliateProgramFragment.FeatureCell[] featureCellArr = this.upgradeFeatureCells;
                if (z3) {
                    AffiliateProgramFragment.FeatureCell featureCell = featureCellArr[c];
                    int i10 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z3) {
                        int i11 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i2 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c] = DialogObject.getShortName(this.currentAccount, j3);
                        string = LocaleController.formatString(i11, objArr);
                    } else {
                        i2 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    featureCell.set(string3, string, i10);
                    AffiliateProgramFragment.FeatureCell featureCell2 = featureCellArr[i2];
                    int i12 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z3) {
                        int i13 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j3);
                        string2 = LocaleController.formatString(i13, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    featureCell2.set(string4, string2, i12);
                    featureCellArr[2].set(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z3 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j3)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    featureCellArr[0].set(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    featureCellArr[1].set(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    featureCellArr[2].set(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 1));
            }
        }
    }

    public final void openUpgradePrices() {
        if (this.upgrade_form == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < this.upgrade_form.invoice.prices.size(); i++) {
            j += this.upgrade_form.invoice.prices.get(i).amount;
        }
        UpgradePricesSheet upgradePricesSheet = new UpgradePricesSheet(getContext(), j, this.prices, this.resourcesProvider);
        this.upgradeSheet = upgradePricesSheet;
        upgradePricesSheet.show();
    }

    public final void performBuyPressed(final GiftMessageBottomSheet giftMessageBottomSheet, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, final AmountUtils$Currency amountUtils$Currency, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z) {
        this.button.setLoading(true);
        if (giftMessageBottomSheet != null && !giftMessageBottomSheet.mLoading) {
            giftMessageBottomSheet.mLoading = true;
            giftMessageBottomSheet.writeButton.setLoading(true);
        }
        StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(tL_starGiftUnique, j, tL_textWithEntities, z, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AmountUtils$Currency amountUtils$Currency2 = amountUtils$Currency;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j2 = j;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                this.f$0.lambda$performBuyPressed$172(giftMessageBottomSheet, amountUtils$Currency2, tL_starGiftUnique2, j2, tL_textWithEntities2, z, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    public final SpannableStringBuilder releasedByText(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return releasedByText(starGift.released_by);
    }

    public final void repostStory(View view) {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null) {
            return;
        }
        StoryRecorder.SourceView.AnonymousClass1 anonymousClass1FromShareCell = view instanceof ShareDialogCell ? StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(getGift() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) getGift();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        StoryRecorder storyRecorder = StoryRecorder.getInstance(launchActivity, this.currentAccount);
        storyRecorder.onClosePrepareListener = new StarGiftSheet$$ExternalSyntheticLambda100(this, storyRecorder, view, 0);
        storyRecorder.openRepost(anonymousClass1FromShareCell, StoryEntry.repostMessage(arrayList));
    }

    public final void set(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, StarsController.IGiftsList iGiftsList) {
        Roller roller;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.slug = str;
        this.slugStarGift = tL_starGiftUnique;
        this.giftsList = iGiftsList;
        this.resale = (tL_starGiftUnique.resell_amount == null || isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.rolling && (roller = this.roller) != null && roller.rolling && (tL_starGiftUnique2 = roller.rollingGift) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            roller.detach();
            this.roller = null;
            TopView topView = this.topView;
            topView.imageLayout.setAlpha(1.0f);
            topView.imagesRollView.setAlpha(0.0f);
        }
        this.actionView.set(this.currentAccount, this.savedStarGift);
        set(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z = tL_starGiftUnique.host_id != null;
        LinkSpanDrawable.LinksTextView linksTextView = this.beforeTableTextView;
        if (!z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            linksTextView.setVisibility(8);
        } else {
            linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new StarGiftSheet$$ExternalSyntheticLambda19(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            linksTextView.setVisibility(0);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        }
        LinkSpanDrawable.LinksTextView linksTextView2 = this.afterTableTextView;
        if (z || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            linksTextView2.setVisibility(8);
        } else {
            linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new StarGiftSheet$$ExternalSyntheticLambda19(this, str3, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            linksTextView2.setVisibility(0);
        }
        if (this.resale) {
            setButtonTextResale(tL_starGiftUnique);
            this.button.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 6));
        }
        if (this.firstSet) {
            switchPage(0, false, null);
            this.layoutManager.scrollToPosition(1);
            this.firstSet = false;
        }
        updateViewPager();
    }

    public final void setButtonTextResale(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        AmountUtils$Amount resellAmount = tL_starGiftUnique.getResellAmount(AmountUtils$Currency.STARS);
        boolean z = tL_starGiftUnique.resale_ton_only;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (!z) {
            buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) (resellAmount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null), !this.firstSet, true);
            buttonWithCounterView.setSubText(null, !this.firstSet);
        } else {
            buttonWithCounterView.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(AmountUtils$Currency.TON).asFormatString()), 1.13f), !this.firstSet, true);
            buttonWithCounterView.setSubText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) (resellAmount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null), !this.firstSet);
        }
    }

    public final void setupWearPage() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        TLRPC.Peer peer = uniqueGift.owner_id;
        if (peer == null) {
            peer = uniqueGift.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(uniqueGift.title);
        sb.append(" #");
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, BillingController$$ExternalSyntheticOutline0.m(uniqueGift.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.setText(spannableStringBuilder, true, true);
        buttonWithCounterView.setSubText(null, true);
        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 11));
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, false, null);
        this.onlyWearInfo = true;
    }

    @Override
    public final boolean shouldDrawBackground() {
        return false;
    }

    @Override
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        if (this.slug != null && this.slugStarGift == null) {
            AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new ProfileActivity$$ExternalSyntheticLambda65(22, this, alertDialog));
        } else if (this.savedStarGift == null && (messageObject = this.messageObject) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        AlertDialog alertDialog2 = new AlertDialog(getContext(), 3, null);
                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda2 = alertDialog2.showRunnable;
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda2);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda2, 500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new StarGiftSheet$$ExternalSyntheticLambda7(this, tL_messageActionStarGift, alertDialog2, 0));
                        return;
                    }
                    if (getInputStarGift() != null) {
                        AlertDialog alertDialog3 = new AlertDialog(getContext(), 3, null);
                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda3 = alertDialog3.showRunnable;
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda3);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda3, 500L);
                        StarsController.getInstance(this.currentAccount, false).getUserStarGift(getInputStarGift(), new OAuthSheet$$ExternalSyntheticLambda13(26, this, alertDialog3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void showDeleteDescriptionAlert(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null || uniqueGift == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = inputStarGift;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new LoginActivity$$ExternalSyntheticLambda42(this, charSequence, uniqueGift, tL_inputInvoiceStarGiftDropOriginalDetails, 12));
    }

    public final void showGiftOfferSheet() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        Context context = getContext();
        new GiftOfferSheet(this.currentAccount, DialogObject.getPeerDialogId(uniqueGift.owner_id), context, new StarGiftSheet$$ExternalSyntheticLambda3(this, 3), uniqueGift, this.resourcesProvider).show();
    }

    public final void showHint(CharSequence charSequence, View view, boolean z) {
        Layout layout;
        float primaryHorizontal;
        HintView2 hintView2 = this.currentHintView;
        if ((hintView2 != null && hintView2.shown && this.currentHintViewTextView == view) || view == null) {
            return;
        }
        if (!z) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof SimpleTextView)) {
                return;
            } else {
                layout = ((SimpleTextView) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, spanned.length(), ButtonSpan.class);
            if (buttonSpanArr == null || buttonSpanArr.length <= 0) {
                return;
            }
            ButtonSpan buttonSpan = buttonSpanArr[buttonSpanArr.length - 1];
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpan)) + view.getPaddingLeft() + (buttonSpan.getSize() / 2.0f);
        } else {
            if (!(view instanceof SimpleTextView)) {
                return;
            }
            SimpleTextView simpleTextView = (SimpleTextView) view;
            primaryHorizontal = (simpleTextView.getRightDrawableWidth() / 2.0f) + simpleTextView.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        ContainerView containerView = this.container;
        containerView.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        HintView2 hintView3 = this.currentHintView;
        if (hintView3 != null) {
            hintView3.hide(true);
            this.currentHintView = null;
        }
        HintView2 hintView4 = new HintView2(getContext(), 3);
        hintView4.setMultilineText(!z);
        hintView4.setText(charSequence);
        hintView4.setJointPx(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        hintView4.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z ? 18 : 0) + 4.33f));
        hintView4.duration = 3000L;
        hintView4.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        hintView4.onHidden = new PhotoViewer$$ExternalSyntheticLambda127(hintView4, 4);
        hintView4.show();
        containerView.addView(hintView4, LayoutHelper.createFrame(100.0f, -1));
        this.currentHintView = hintView4;
        this.currentHintViewTextView = view;
    }

    public final void showTimeoutAlert(int i, Context context, boolean z) {
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(64.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(64, 64, 49, 0, 6, 0, 0));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(rLottieImageView, LayoutHelper.createLinear(64, 64, 17));
        rLottieImageView.playAnimation();
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true, null);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(z ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 48, 24, 14, 24, 0));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText8, false, null);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.formatString(z ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i))));
        linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, this.resourcesProvider);
        builder.setView(linearLayoutM);
        ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
    }

    public final void switchPage(int i, boolean z, TodoItemMenu$$ExternalSyntheticLambda5 todoItemMenu$$ExternalSyntheticLambda5) {
        int measuredHeight;
        Roller roller;
        int i2 = 0;
        ValueAnimator valueAnimator = this.switchingPagesAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.switchingPagesAnimator = null;
        }
        TopView topView = this.topView;
        if (i != 1) {
            AndroidUtilities.cancelRunOnUIThread(topView.checkToRotateRunnable);
        }
        if (!this.firstSet) {
            this.lastTop = Float.valueOf(this.container.top());
        }
        PageTransition pageTransition = this.currentPage;
        this.currentPage = new PageTransition(pageTransition == null ? 0 : pageTransition.to, i);
        MessageSeenView.AnonymousClass3 anonymousClass3 = this.adapter;
        int finalHeight = topView.getFinalHeight();
        int bottomHeight = getBottomHeight();
        if (this.currentPage.to(1)) {
            FrameLayout frameLayout = this.underButtonContainer;
            if (frameLayout.getVisibility() == 0) {
                measuredHeight = frameLayout.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
        } else {
            measuredHeight = 0;
        }
        anonymousClass3.setHeights(finalHeight, bottomHeight + measuredHeight);
        if (this.currentPage.to == 0 && (roller = this.roller) != null && !roller.rolling) {
            ArrayList arrayList = roller.models;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((Roller.Sticker) obj).detach();
            }
            arrayList.clear();
            roller.backgrounds.clear();
            roller.symbols.clear();
        }
        AnonymousClass4 anonymousClass4 = this.craftLayout;
        AnonymousClass4 anonymousClass5 = this.wearLayout;
        AnonymousClass4 anonymousClass6 = this.upgradeLayout;
        AnonymousClass4 anonymousClass7 = this.infoLayout;
        if (z) {
            anonymousClass7.setVisibility(this.currentPage.contains(0) ? 0 : 8);
            anonymousClass6.setVisibility(this.currentPage.contains(1) ? 0 : 8);
            anonymousClass5.setVisibility(this.currentPage.contains(2) ? 0 : 8);
            anonymousClass4.setVisibility(this.currentPage.contains(3) ? 0 : 8);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchingPagesAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 11));
            this.switchingPagesAnimator.addListener(new AnonymousClass13(this, i, todoItemMenu$$ExternalSyntheticLambda5, i2));
            this.switchingPagesAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.switchingPagesAnimator.setDuration(320L);
            this.switchingPagesAnimator.start();
            PageTransition pageTransition2 = this.currentPage;
            int i4 = pageTransition2.from;
            int i5 = pageTransition2.to;
            if (i4 != i5) {
                BackupImageView[] backupImageViewArr = topView.imageView;
                RLottieDrawable lottieAnimation = backupImageViewArr[i4].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = backupImageViewArr[i5].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                }
            }
        } else {
            this.currentPage.progress = 1.0f;
            onSwitchedPage();
            anonymousClass7.setVisibility(i == 0 ? 0 : 8);
            anonymousClass6.setVisibility(i == 1 ? 0 : 8);
            anonymousClass5.setVisibility(i == 2 ? 0 : 8);
            anonymousClass4.setVisibility(i != 3 ? 8 : 0);
            updateUnderButtonContainer();
            if (todoItemMenu$$ExternalSyntheticLambda5 != null) {
                todoItemMenu$$ExternalSyntheticLambda5.run();
            }
        }
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide(true);
            this.currentHintView = null;
        }
    }

    public final void tickUpgradePrice() {
        String str;
        boolean z;
        int i;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i2 = 1;
        if (this.currentPage.to == 1 && !isDismissed()) {
            TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
            MessageObject messageObject = this.messageObject;
            long j = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j2 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j2 > 0 || TextUtils.isEmpty(str)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    return;
                }
                long j3 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j3 > 0 || TextUtils.isEmpty(str)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.next_prices == null) {
                i = -1;
                starGiftUpgradePrice = null;
                break;
            }
            i = 0;
            while (true) {
                if (i >= this.next_prices.size()) {
                    i = -1;
                    starGiftUpgradePrice = null;
                    break;
                } else {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.next_prices.get(i);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (this.upgrade_form != null) {
                for (int i3 = 0; i3 < this.upgrade_form.invoice.prices.size(); i3++) {
                    j += this.upgrade_form.invoice.prices.get(i3).amount;
                }
            }
            if (i > 0 && !this.requesting_upgrade_form) {
                this.requesting_upgrade_form = true;
                if (this.next_prices != null) {
                    for (int i4 = 0; i4 < i; i4++) {
                        this.next_prices.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.checkBoxBase.isChecked;
                    tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, false);
                if (jSONObjectMakeThemeParams != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda70(this, i2));
            }
            ButtonWithCounterView buttonWithCounterView = this.button;
            ColoredImageSpan[] coloredImageSpanArr = this.starCached;
            if (z) {
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j)), 1.13f, coloredImageSpanArr), true, true);
            } else {
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j)), 1.13f, coloredImageSpanArr), true, true);
            }
            UpgradePricesSheet upgradePricesSheet = this.upgradeSheet;
            if (upgradePricesSheet != null) {
                upgradePricesSheet.setCurrentPrice(j);
            }
            if (starGiftUpgradePrice == null) {
                buttonWithCounterView.setSubText(null, true);
                return;
            }
            int i5 = starGiftUpgradePrice.date - currentTime;
            String duration = i5 < 86400 ? AndroidUtilities.formatDuration(i5, false, true) : LocaleController.formatPluralString("Days", Math.round(i5 / 86400.0f), new Object[0]);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = buttonWithCounterView.subText;
            animatedTextDrawable.splitByWords = false;
            animatedTextDrawable.preserveIndex = true;
            animatedTextDrawable.startFromEnd = true;
            animatedTextDrawable.enforceByLetter = false;
            buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, duration), true);
            AndroidUtilities.runOnUIThread(this.tickUpgradePriceRunnable, 1000L);
        }
    }

    public final void toggleShow() {
        boolean z;
        TLRPC.Document document;
        boolean z2;
        StarsController.GiftsCollections profileGiftCollectionsList;
        TLRPC.Message message;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (buttonWithCounterView.loading) {
            return;
        }
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            z = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z3 = z;
        buttonWithCounterView.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z3;
        savestargift.stargift = inputStarGift;
        if (this.savedStarGift == null || (profileGiftCollectionsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftCollectionsList(this.dialogId, false)) == null) {
            z2 = false;
        } else {
            profileGiftCollectionsList.updateGiftsUnsaved(this.savedStarGift, savestargift.unsave);
            z2 = true;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, new StarGiftSheet$$ExternalSyntheticLambda77(this, z2, document2, z3, savestargift));
    }

    public final void toggleWear(boolean z) {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean zIsWorn = isWorn(this.currentAccount, getUniqueGift());
        boolean z2 = !zIsWorn;
        boolean zIsWorn2 = isWorn(this.currentAccount, getUniqueGift());
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (zIsWorn2) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId$1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long dialogId$1 = getDialogId$1();
            if (dialogId$1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    Bulletin bulletinCreateSimpleBulletinDetail = getBulletinFactory().createSimpleBulletinDetail(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new StarGiftSheet$$ExternalSyntheticLambda3(this, 24)));
                    bulletinCreateSimpleBulletinDetail.ignoreDetach = true;
                    bulletinCreateSimpleBulletinDetail.show();
                    return;
                }
            } else if (!z) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                buttonWithCounterView.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(dialogId$1, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        StarGiftSheet starGiftSheet = this.f$0;
                        if (tL_premium_boostsStatus != null) {
                            starGiftSheet.getClass();
                            int i = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j = dialogId$1;
                                boostsController.userCanBoostChannel(j, tL_premium_boostsStatus, new ChatEditActivity$$ExternalSyntheticLambda65(starGiftSheet, tL_premium_boostsStatus, j, messagesController2));
                                return;
                            }
                        }
                        starGiftSheet.button.setLoading(false);
                        starGiftSheet.toggleWear(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = uniqueGift.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId$1(), tL_inputEmojiStatusCollectible, uniqueGift);
        }
        this.topView.buttons[1].set(!zIsWorn ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!zIsWorn ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.onlyWearInfo) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        TodoItemMenu$$ExternalSyntheticLambda5 todoItemMenu$$ExternalSyntheticLambda5 = new TodoItemMenu$$ExternalSyntheticLambda5(8, this, z2);
        if (this.currentPage.is(0)) {
            todoItemMenu$$ExternalSyntheticLambda5.run();
        } else {
            switchPage(0, true, todoItemMenu$$ExternalSyntheticLambda5);
        }
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
        buttonWithCounterView.setSubText(null, !this.firstSet);
        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 26));
    }

    public final void updateUnderButtonContainer() {
        FrameLayout frameLayout = this.underButtonContainer;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.bottomBulletinContainer;
        FrameLayout frameLayout3 = this.buttonContainer;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.currentPage.at(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.currentPage.at(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.currentPage.at(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void updateViewPager() {
        boolean zHasNeighbour = hasNeighbour(false);
        AnonymousClass2 anonymousClass2 = this.viewPager;
        anonymousClass2.setPosition(zHasNeighbour ? 1 : 0);
        anonymousClass2.rebuild(false);
        if (this.giftsList == null || hasNeighbour(true) || this.giftsList.getLoadedCount() >= this.giftsList.getTotalCount()) {
            return;
        }
        this.giftsList.load();
    }

    public final SpannableStringBuilder releasedByText(TLRPC.Peer peer) {
        int i = 1;
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, zzil.m("@", publicUsername)), new StarGiftSheet$$ExternalSyntheticLambda19(this, publicUsername, i));
    }

    public final class CraftTopView extends FrameLayout {
        public final int[] BACKGROUND_COLORS;
        public final int[] COLORS;
        public final LinearLayout attributesLayoutLine1;
        public final LinearLayout attributesLayoutLine2;
        public boolean attributesTwoLines;
        public final AttributeView[] backdropAttributes;
        public final SwitchGradientDrawable bg;
        public RLottieImageView brokenGiftImage;
        public final LinearLayout button;
        public final ButtonBackground buttonBackground;
        public final AnimatedTextView buttonSubtitle;
        public final AnimatedTextView buttonTitle;
        public final FrameLayout buttonsLayout;
        public String collectionTitle;
        public boolean crafted;
        public boolean crafting;
        public final TextView craftingChanceView;
        public final RLottieImageView craftingIconView;
        public final FrameLayout craftingLayout;
        public final TextView craftingSubtitleView;
        public final Cube3D cube;
        public int currentAccount;
        public HintView2 currentHint;
        public TLRPC.Document document;
        public final Face[] faces;
        public boolean failed;
        public GiftSheet.GiftCell[] failedGifts;
        public final LinearLayout failedGiftsLayout;
        public final FrameLayout failedLayout;
        public final TextView failedSubtitle;
        public final Face frontFace;
        public long giftId;
        public final SelectGiftView[] gifts;
        public final ImageView helpButton;
        public Utilities.Callback2 onAddGift;
        public Runnable onClose;
        public Utilities.Callback3 onCraft;
        public Runnable openCraftedGift;
        public final AttributeView[] patternAttributes;
        public SpannableStringBuilder plus;
        public final FrameLayout precraftingLayout;
        public ArrayList previewAttributes;
        public final RaysView rays;
        public final Theme.ResourcesProvider resourcesProvider;
        public final SpoilersTextView textView;
        public final AnimatedEmojiSpan.TextViewEmojis variantsButton;

        public final class AttributeView extends FrameLayout {
            public TL_stars.starGiftAttributeBackdrop backdrop;
            public final BackupImageView imageView;
            public TL_stars.starGiftAttributePattern pattern;
            public float progress;
            public final ProgressView progressView;
            public final AnimatedTextView textView;

            public AttributeView(Context context) {
                super(context);
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.setRoundRadius(AndroidUtilities.dp(13.0f));
                addView(backupImageView, LayoutHelper.createFrame(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
                ProgressView progressView = new ProgressView(context);
                this.progressView = progressView;
                progressView.radius = AndroidUtilities.dp(18.0f);
                progressView.paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
                addView(progressView, LayoutHelper.createFrame(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
                AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
                this.textView = animatedTextView;
                animatedTextView.setTypeface(AndroidUtilities.bold());
                animatedTextView.setGravity(17);
                animatedTextView.setTextSize(AndroidUtilities.dp(12.0f));
                animatedTextView.setTextColor(-1);
                addView(animatedTextView, LayoutHelper.createFrame(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
                setProgress(0.0f, false);
                ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
            }

            public final void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
                this.backdrop = stargiftattributebackdrop;
                this.pattern = null;
                BackupImageView backupImageView = this.imageView;
                backupImageView.setScaleX(1.0f);
                backupImageView.setScaleY(1.0f);
                if (stargiftattributebackdrop == null) {
                    backupImageView.setAlpha(1.0f);
                    backupImageView.setImageDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(26.0f), Theme.multAlpha(0.25f, -1)));
                    return;
                }
                backupImageView.setAlpha(1.0f);
                OvalShape ovalShape = new OvalShape();
                ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
                ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
                shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
                shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
                shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                backupImageView.setImageDrawable(shapeDrawable);
            }

            public final void setIcon(TL_stars.starGiftAttributePattern stargiftattributepattern) {
                this.backdrop = null;
                this.pattern = stargiftattributepattern;
                BackupImageView backupImageView = this.imageView;
                if (stargiftattributepattern == null) {
                    backupImageView.setAlpha(0.25f);
                    backupImageView.setScaleX(0.75f);
                    backupImageView.setScaleY(0.75f);
                    backupImageView.setTranslationY(0.0f);
                    backupImageView.setAnimatedEmojiDrawable(null);
                    backupImageView.setImageResource(R.drawable.mini_roll);
                    return;
                }
                backupImageView.setAlpha(1.0f);
                backupImageView.setScaleX(0.95f);
                backupImageView.setScaleY(0.95f);
                backupImageView.setTranslationY(AndroidUtilities.dp(2.0f));
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
                animatedEmojiDrawableMake.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                backupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawableMake);
            }

            public final void setProgress(float f, boolean z) {
                this.progress = f;
                ProgressView progressView = this.progressView;
                progressView.progress = f;
                if (!z) {
                    progressView.animatedProgress.set(f, true);
                }
                progressView.invalidate();
                this.textView.setText(Math.round(f * 100.0f) + "%", z, true);
            }
        }

        public final class ButtonBackground extends Drawable {
            public final Paint backgroundPaint;
            public final Path clipPath;
            public final LinearGradient[] gradient;
            public final Matrix gradientMatrix;
            public int leftColor;
            public final StarsReactionsSheet.Particles particles;
            public int rightColor;
            public final AnimatedFloat swapGradient;

            public ButtonBackground() {
                Paint paint = new Paint(1);
                Paint paint2 = new Paint(1);
                this.backgroundPaint = new Paint(1);
                this.gradient = new LinearGradient[2];
                this.gradientMatrix = new Matrix();
                this.swapGradient = new AnimatedFloat(1.0f, new ProfileActivity$9$$ExternalSyntheticLambda1(this, 24), 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.clipPath = new Path();
                this.particles = new StarsReactionsSheet.Particles(1, 45);
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setColor(117440511);
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
                paint2.setStyle(style);
                paint2.setColor(301989887);
                paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
            }

            @Override
            public final void draw(Canvas canvas) {
                AndroidUtilities.rectTmp.set(getBounds());
                float fDp = AndroidUtilities.dp(24.0f);
                int i = 0;
                float f = this.swapGradient.set(1.0f, false);
                while (true) {
                    LinearGradient[] linearGradientArr = this.gradient;
                    if (i >= linearGradientArr.length) {
                        Path path = this.clipPath;
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(path);
                        StarsReactionsSheet.Particles particles = this.particles;
                        particles.bounds.set(rectF);
                        particles.removeParticlesOutside();
                        particles.speed = 30.0f;
                        particles.process();
                        particles.draw(canvas, Theme.multAlpha(0.6f, -1), 1.0f);
                        invalidateSelf();
                        canvas.restore();
                        AndroidUtilities.drawStroke(canvas, rectF, fDp);
                        return;
                    }
                    if (linearGradientArr[i] != null) {
                        float fPow = (float) Math.pow(1.0f - Math.abs(i - f), 0.5d);
                        if (fPow > 0.0f) {
                            Matrix matrix = this.gradientMatrix;
                            matrix.reset();
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            matrix.postScale(rectF2.width() / 100.0f, 1.0f);
                            linearGradientArr[i].setLocalMatrix(matrix);
                            Paint paint = this.backgroundPaint;
                            paint.setShader(linearGradientArr[i]);
                            paint.setAlpha((int) (fPow * 255.0f));
                            canvas.drawRoundRect(rectF2, fDp, fDp, paint);
                        }
                    }
                    i++;
                }
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i) {
            }

            public final void setColor(int i, int i2) {
                if (this.leftColor == i && this.rightColor == i2) {
                    return;
                }
                LinearGradient[] linearGradientArr = this.gradient;
                linearGradientArr[0] = linearGradientArr[1];
                this.leftColor = i;
                this.rightColor = i2;
                linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.swapGradient.set(0.0f, true);
                invalidateSelf();
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public final class Cube3D extends FrameLayout {
            public static final int $r8$clinit = 0;
            public final Matrix cameraMatrix;
            public final Integer[] drawOrder;
            public final float[] faceDepths;
            public final float[][] faceNormals;
            public final float[] faceRotations;
            public final View[] faces;
            public boolean frictionEnabled;
            public final HashMap index2Position;
            public final HashMap index2face;
            public ValueAnimator pulling;
            public int pullingIndex;
            public float pullingT;
            public final float[] rotationMatrix;
            public AnimSequence sequence;
            public final float[] transformedNormal;
            public final ProfileActivity$9$$ExternalSyntheticLambda1 updateRunnable;
            public final HashSet usedFaces;
            public float vx;
            public float vy;

            public final class AnimSequence {
                public final Cube3D cube;
                public int framesRemaining;
                public ProfileActivity$$ExternalSyntheticLambda149 onComplete;
                public float startVx;
                public float startVy;
                public int totalFrames;
                public final ArrayList commands = new ArrayList();
                public int currentIndex = 0;
                public boolean cancelled = false;
                public final float[] startMatrix = new float[16];
                public float[] targetMatrix = new float[16];
                public boolean waitingForPull = false;

                public final class Cmd {
                    public final int face;
                    public final int frames;
                    public final float rotation;
                    public final TodoItemMenu$$ExternalSyntheticLambda2 runnable;
                    public final int type;
                    public final SelectGiftView view;
                    public final float x;
                    public final float y;

                    public Cmd(int i, float f, float f2, int i2, int i3, float f3, SelectGiftView selectGiftView, TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2) {
                        this.type = i;
                        this.x = f;
                        this.y = f2;
                        this.frames = i2;
                        this.face = i3;
                        this.rotation = f3;
                        this.view = selectGiftView;
                        this.runnable = todoItemMenu$$ExternalSyntheticLambda2;
                    }
                }

                public AnimSequence(Cube3D cube3D) {
                    this.cube = cube3D;
                }

                public final void delay(int i) {
                    this.commands.add(new Cmd(3, 0.0f, 0.0f, i, -1, 0.0f, null, null));
                }

                public final void executeNext() {
                    ProfileActivity$$ExternalSyntheticLambda149 profileActivity$$ExternalSyntheticLambda149;
                    boolean z = this.cancelled;
                    Cube3D cube3D = this.cube;
                    if (!z) {
                        int i = this.currentIndex;
                        ArrayList arrayList = this.commands;
                        if (i < arrayList.size()) {
                            Cmd cmd = (Cmd) arrayList.get(this.currentIndex);
                            this.currentIndex++;
                            int iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(cmd.type);
                            if (iOrdinal == 0) {
                                TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2 = cmd.runnable;
                                if (todoItemMenu$$ExternalSyntheticLambda2 != null) {
                                    todoItemMenu$$ExternalSyntheticLambda2.run();
                                }
                                executeNext();
                                return;
                            }
                            float f = cmd.x;
                            if (iOrdinal == 1) {
                                cube3D.vx = (cmd.y * 0.01f) + cube3D.vx;
                                cube3D.vy = (f * 0.01f) + cube3D.vy;
                                this.framesRemaining = 1;
                                this.totalFrames = 1;
                                return;
                            }
                            int i2 = cmd.frames;
                            if (iOrdinal == 2) {
                                this.framesRemaining = i2;
                                this.totalFrames = i2;
                                return;
                            }
                            int i3 = cmd.face;
                            if (iOrdinal == 3) {
                                System.arraycopy(cube3D.rotationMatrix, 0, this.startMatrix, 0, 16);
                                float[] fArr = new float[16];
                                android.opengl.Matrix.setIdentityM(fArr, 0);
                                float f2 = cmd.rotation;
                                if (f2 != 0.0f) {
                                    android.opengl.Matrix.rotateM(fArr, 0, -f2, 0.0f, 0.0f, 1.0f);
                                }
                                if (i3 == 0) {
                                    android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                                } else if (i3 == 1) {
                                    android.opengl.Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                                } else if (i3 == 2) {
                                    android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                                } else if (i3 == 3) {
                                    android.opengl.Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                                } else if (i3 == 4) {
                                    android.opengl.Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                                }
                                this.targetMatrix = fArr;
                                this.totalFrames = i2;
                                this.framesRemaining = i2;
                                this.startVx = cube3D.vx;
                                this.startVy = cube3D.vy;
                                return;
                            }
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    return;
                                }
                                cube3D.frictionEnabled = f > 0.0f;
                                executeNext();
                                return;
                            }
                            this.waitingForPull = true;
                            int i4 = Cube3D.$r8$clinit;
                            ValueAnimator valueAnimator = cube3D.pulling;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                cube3D.pulling = null;
                            }
                            RectF rectF = new RectF();
                            SelectGiftView selectGiftView = cmd.view;
                            rectF.left = selectGiftView.getX() - cube3D.getX();
                            rectF.top = selectGiftView.getY() - cube3D.getY();
                            rectF.right = rectF.left + selectGiftView.getWidth();
                            rectF.bottom = rectF.top + selectGiftView.getHeight();
                            AndroidUtilities.removeFromParent(selectGiftView);
                            int childCount = cube3D.getChildCount();
                            cube3D.addView(selectGiftView, LayoutHelper.createFrame(64, 64, 17));
                            cube3D.usedFaces.add(Integer.valueOf(i3));
                            cube3D.index2face.put(Integer.valueOf(childCount), Integer.valueOf(i3));
                            cube3D.index2Position.put(Integer.valueOf(childCount), rectF);
                            cube3D.pullingIndex = childCount;
                            cube3D.pullingT = 0.0f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            cube3D.pulling = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(cube3D, 13));
                            cube3D.pulling.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(cube3D, 14));
                            cube3D.pulling.setDuration(((long) i2) * 16);
                            cube3D.pulling.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                            cube3D.pulling.start();
                            return;
                        }
                    }
                    cube3D.sequence = null;
                    if (this.cancelled || (profileActivity$$ExternalSyntheticLambda149 = this.onComplete) == null) {
                        return;
                    }
                    profileActivity$$ExternalSyntheticLambda149.run();
                }

                public final void fling(float f, float f2) {
                    this.commands.add(new Cmd(2, f, f2, 0, -1, 0.0f, null, null));
                }

                public final void friction(boolean z) {
                    this.commands.add(new Cmd(6, z ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
                }

                public final void put(SelectGiftView selectGiftView, int i, float f) {
                    this.commands.add(new Cmd(5, 0.0f, 0.0f, 32, i, f, selectGiftView, null));
                }
            }

            public Cube3D(Context context, View[] viewArr) {
                super(context);
                this.cameraMatrix = new Matrix();
                float[] fArr = new float[16];
                this.rotationMatrix = fArr;
                this.vx = 0.0f;
                this.vy = 0.0f;
                this.frictionEnabled = true;
                this.faceNormals = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
                this.transformedNormal = new float[4];
                this.faceDepths = new float[6];
                this.drawOrder = new Integer[]{0, 1, 2, 3, 4, 5};
                this.usedFaces = new HashSet();
                this.index2face = new HashMap();
                this.index2Position = new HashMap();
                this.faceRotations = new float[6];
                this.pullingIndex = -1;
                this.updateRunnable = new ProfileActivity$9$$ExternalSyntheticLambda1(this, 25);
                setClipToOutline(false);
                setClipToPadding(false);
                android.opengl.Matrix.setIdentityM(fArr, 0);
                this.faces = viewArr;
                for (View view : viewArr) {
                    addView(view, LayoutHelper.createFrame(108, 108, 17));
                }
            }

            public static void axisAngleToMatrix(float f, float f2, float f3, float[] fArr) {
                double d = f3;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                float f4 = 1.0f - fCos;
                float f5 = f4 * f;
                fArr[0] = (f5 * f) + fCos;
                float f6 = f5 * f2;
                float f7 = fSin * 0.0f;
                fArr[4] = f6 - f7;
                float f8 = f5 * 0.0f;
                float f9 = fSin * f2;
                fArr[8] = f8 + f9;
                fArr[12] = 0.0f;
                fArr[1] = f6 + f7;
                float f10 = f4 * f2;
                fArr[5] = (f2 * f10) + fCos;
                float f11 = f10 * 0.0f;
                float f12 = fSin * f;
                fArr[9] = f11 - f12;
                fArr[13] = 0.0f;
                fArr[2] = f8 - f9;
                fArr[6] = f11 + f12;
                fArr[10] = SurfaceContainer$$ExternalSyntheticOutline0.m(f4, 0.0f, 0.0f, fCos);
                fArr[14] = 0.0f;
                fArr[3] = 0.0f;
                fArr[7] = 0.0f;
                fArr[11] = 0.0f;
                fArr[15] = 1.0f;
            }

            public static void cross(float[] fArr, float[] fArr2, float[] fArr3) {
                float f = fArr[1];
                float f2 = fArr2[2];
                float f3 = fArr[2];
                fArr3[0] = (f * f2) - (fArr2[1] * f3);
                float f4 = fArr2[0];
                float f5 = fArr[0];
                fArr3[1] = (f3 * f4) - (f2 * f5);
                fArr3[2] = (f5 * fArr2[1]) - (fArr[1] * f4);
            }

            public static void multiplyMatrix(float[] fArr, float[] fArr2, float[] fArr3) {
                float[] fArr4 = new float[16];
                android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr2, 0);
                System.arraycopy(fArr4, 0, fArr3, 0, 16);
            }

            public static void normalize(float[] fArr) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f));
                if (fSqrt > 0.0f) {
                    fArr[0] = fArr[0] / fSqrt;
                    fArr[1] = fArr[1] / fSqrt;
                    fArr[2] = fArr[2] / fSqrt;
                }
            }

            public final void applyPhysics() {
                if (Math.abs(this.vx) > 1.0E-4f || Math.abs(this.vy) > 1.0E-4f) {
                    float[] fArr = new float[16];
                    axisAngleToMatrix(1.0f, 0.0f, this.vx, fArr);
                    float[] fArr2 = this.rotationMatrix;
                    multiplyMatrix(fArr, fArr2, fArr2);
                    axisAngleToMatrix(0.0f, 1.0f, this.vy, fArr);
                    multiplyMatrix(fArr, fArr2, fArr2);
                    if (this.frictionEnabled) {
                        this.vx *= 0.96f;
                        this.vy *= 0.96f;
                    }
                }
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                char c;
                char c2;
                RectF rectF;
                boolean z;
                boolean z2;
                float f;
                float f2;
                float fDp;
                char c3;
                int i = 4;
                int iIndexOfChild = indexOfChild(view);
                if (iIndexOfChild >= 6) {
                    z2 = this.pullingIndex == iIndexOfChild;
                    rectF = (RectF) this.index2Position.get(Integer.valueOf(iIndexOfChild));
                    c = 7;
                    Integer num = (Integer) this.index2face.get(Integer.valueOf(iIndexOfChild));
                    if (num != null) {
                        iIndexOfChild = num.intValue();
                    }
                    if (view instanceof SelectGiftView) {
                        SelectGiftView selectGiftView = (SelectGiftView) view;
                        c2 = 6;
                        float f3 = 1.0f - (z2 ? this.pullingT : 1.0f);
                        selectGiftView.chance.setAlpha(f3);
                        selectGiftView.closeLayout.setAlpha(f3);
                        if (!z2 || this.pullingT >= 1.0f) {
                            this.faces[iIndexOfChild].setVisibility(8);
                        }
                    } else {
                        c2 = 6;
                    }
                    z = true;
                } else {
                    c = 7;
                    c2 = 6;
                    rectF = null;
                    z = false;
                    z2 = false;
                }
                float[][] fArr = this.faceNormals;
                android.opengl.Matrix.multiplyMV(this.transformedNormal, 0, this.rotationMatrix, 0, fArr[iIndexOfChild], 0);
                float f4 = this.transformedNormal[2];
                if (f4 < 0.001f) {
                    return false;
                }
                view.setAlpha(Math.min(1.0f, f4 / 0.3f));
                float width = view.getWidth() / 2.0f;
                if (z && (view instanceof SelectGiftView)) {
                    f = 1.0f;
                    f2 = 2.0f;
                    fDp = ((z2 ? this.pullingT : 1.0f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(-6.0f);
                } else {
                    f = 1.0f;
                    f2 = 2.0f;
                    fDp = 0.0f;
                }
                float fDp2 = AndroidUtilities.dp(108.0f) / f2;
                float width2 = getWidth() / f2;
                float height = getHeight() / f2;
                float[] fArr2 = new float[4];
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                System.arraycopy(fArr[iIndexOfChild], 0, fArr2, 0, 4);
                if (iIndexOfChild == 0) {
                    fArr3[0] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = -1.0f;
                    fArr4[2] = 0.0f;
                } else if (iIndexOfChild == 1) {
                    fArr3[0] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = -1.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = -1.0f;
                    fArr4[2] = 0.0f;
                } else if (iIndexOfChild == 2) {
                    fArr3[0] = f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = f;
                } else if (iIndexOfChild == 3) {
                    fArr3[0] = f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = -1.0f;
                } else if (iIndexOfChild == 4) {
                    fArr3[0] = -1.0f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = -1.0f;
                    fArr4[2] = 0.0f;
                } else if (iIndexOfChild == 5) {
                    fArr3[0] = f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = -1.0f;
                    fArr4[2] = 0.0f;
                }
                fArr3[3] = 0.0f;
                fArr4[3] = 0.0f;
                float f5 = this.faceRotations[iIndexOfChild];
                if (f5 != 0.0f) {
                    double radians = (float) Math.toRadians(f5);
                    c3 = 0;
                    float fCos = (float) Math.cos(radians);
                    float fSin = (float) Math.sin(radians);
                    float f6 = fArr3[0];
                    float f7 = fArr4[0];
                    float f8 = fArr3[1];
                    float f9 = fArr4[1];
                    float f10 = fArr3[2];
                    float f11 = fArr4[2];
                    fArr3[0] = (f7 * fSin) + (f6 * fCos);
                    fArr3[1] = (f9 * fSin) + (f8 * fCos);
                    fArr3[2] = (f11 * fSin) + (f10 * fCos);
                    fArr4[0] = (f7 * fCos) + ((-f6) * fSin);
                    fArr4[1] = (f9 * fCos) + ((-f8) * fSin);
                    fArr4[2] = (f11 * fCos) + ((-f10) * fSin);
                    i = 4;
                } else {
                    c3 = 0;
                }
                float[] fArr5 = new float[i];
                float[] fArr6 = new float[i];
                float[] fArr7 = new float[i];
                android.opengl.Matrix.multiplyMV(fArr5, 0, this.rotationMatrix, 0, fArr2, 0);
                android.opengl.Matrix.multiplyMV(fArr6, 0, this.rotationMatrix, 0, fArr3, 0);
                android.opengl.Matrix.multiplyMV(fArr7, 0, this.rotationMatrix, 0, fArr4, 0);
                float f12 = 64.0f * fDp2;
                int i2 = 2;
                int[] iArr = new int[2];
                int i3 = 1;
                iArr[1] = 3;
                iArr[c3] = 4;
                float[][] fArr8 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, iArr);
                int i4 = 0;
                for (int i5 = 4; i4 < i5; i5 = 4) {
                    float f13 = (i4 == i3 || i4 == i2) ? 1.0f : -1.0f;
                    float f14 = (i4 == 0 || i4 == i3) ? 1.0f : -1.0f;
                    float[] fArr9 = fArr8[i4];
                    fArr9[c3] = AndroidUtilities$$ExternalSyntheticOutline0.m(fArr7[c3], f14, (fArr6[c3] * f13) + fArr5[c3], fDp2);
                    fArr9[1] = AndroidUtilities$$ExternalSyntheticOutline0.m(fArr7[1], f14, (fArr6[1] * f13) + fArr5[1], fDp2);
                    fArr9[2] = AndroidUtilities$$ExternalSyntheticOutline0.m(fArr7[2], f14, (fArr6[2] * f13) + fArr5[2], fDp2);
                    i4++;
                    height = height;
                    i2 = 2;
                    i3 = 1;
                }
                float f15 = height;
                char c4 = 2;
                float[] fArr10 = new float[8];
                int i6 = 0;
                while (i6 < 4) {
                    float[] fArr11 = fArr8[i6];
                    float f16 = f12 / (f12 - fArr11[c4]);
                    int i7 = i6 * 2;
                    fArr10[i7] = (fArr11[c3] * f16) + width2;
                    fArr10[i7 + 1] = (fArr11[1] * f16) + f15;
                    i6++;
                    c4 = 2;
                }
                float f17 = (width2 - width) - fDp;
                float f18 = (f15 - width) - fDp;
                float f19 = width2 + width + fDp;
                float f20 = f15 + width + fDp;
                float[] fArr12 = new float[8];
                fArr12[c3] = f17;
                fArr12[1] = f18;
                fArr12[2] = f19;
                fArr12[3] = f18;
                fArr12[4] = f19;
                fArr12[5] = f20;
                fArr12[c2] = f17;
                fArr12[c] = f20;
                if (z2 && rectF != null) {
                    float f21 = rectF.left;
                    float f22 = rectF.top;
                    float f23 = rectF.right;
                    float f24 = rectF.bottom;
                    float[] fArr13 = new float[8];
                    fArr13[c3] = f21;
                    fArr13[1] = f22;
                    fArr13[2] = f23;
                    fArr13[3] = f22;
                    fArr13[4] = f23;
                    fArr13[5] = f24;
                    fArr13[c2] = f21;
                    fArr13[c] = f24;
                    AndroidUtilities.lerp(fArr13, fArr10, this.pullingT, fArr10);
                }
                Matrix matrix = this.cameraMatrix;
                matrix.reset();
                matrix.setPolyToPoly(fArr12, 0, fArr10, 0, 4);
                canvas.save();
                canvas.concat(matrix);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public final int getChildDrawingOrder(int i, int i2) {
                if (i2 < 6) {
                    Integer[] numArr = this.drawOrder;
                    if (i2 < numArr.length) {
                        return numArr[i2].intValue();
                    }
                }
                return i2;
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(this.updateRunnable, 16L);
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            }
        }

        public final class Face extends FrameLayout {
            public final AnimatedTextView counter;
            public final ProgressView progress;

            public Face(Context context, boolean z) {
                super(context);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(24.0f), Theme.multAlpha(0.08f, -1)));
                addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
                BackupImageView backupImageView = new BackupImageView(context);
                backupImageView.setImageResource(R.drawable.large_forge);
                backupImageView.setAlpha(z ? 1.0f : 0.45f);
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(z ? 42 : 64, z ? 42 : 64, 17));
                if (z) {
                    backupImageView.setTranslationX(AndroidUtilities.dp(-4.0f));
                    ProgressView progressView = new ProgressView(context);
                    this.progress = progressView;
                    progressView.radius = AndroidUtilities.dp(37.0f);
                    progressView.paint.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                    frameLayout.addView(progressView, LayoutHelper.createFrame(90, 90, 17));
                    AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
                    this.counter = animatedTextView;
                    animatedTextView.getDrawable().setHacks(false, true);
                    animatedTextView.setTypeface(AndroidUtilities.bold());
                    animatedTextView.setTextColor(-1);
                    animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
                    animatedTextView.setGravity(17);
                    animatedTextView.setText("0%");
                    frameLayout.addView(animatedTextView, LayoutHelper.createFrame(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
                }
            }
        }

        public final class ProgressView extends View {
            public final AnimatedFloat animatedProgress;
            public final AnimatedFloat animatedProgressAlpha;
            public final Paint paint;
            public float progress;
            public float radius;

            public ProgressView(Context context) {
                super(context);
                Paint paint = new Paint(1);
                this.paint = paint;
                int i = 26;
                ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = new ProfileActivity$9$$ExternalSyntheticLambda1(this, i);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedProgress = new AnimatedFloat(profileActivity$9$$ExternalSyntheticLambda1, 420L, cubicBezierInterpolator, 0);
                this.animatedProgressAlpha = new AnimatedFloat(new ProfileActivity$9$$ExternalSyntheticLambda1(this, i), 420L, cubicBezierInterpolator, 0);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                float f = this.animatedProgress.set(this.progress, false);
                float f2 = this.animatedProgressAlpha.set(this.progress > 0.0f);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f3 = this.radius;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(width - f3, height - f3, width + f3, height + f3);
                Paint paint = this.paint;
                paint.setColor(Theme.multAlpha(0.25f, -1));
                canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
                if (f2 > 0.0f) {
                    paint.setColor(Theme.multAlpha(f2, -1));
                    canvas.drawArc(rectF, 135.0f, f * 270.0f, false, paint);
                }
            }
        }

        public final class RaysView extends View {
            public final Paint fillPaint;
            public final RadialGradient[] gradient;
            public final Matrix gradientMatrix;
            public int leftColor;
            public final RadialGradient maskGradient;
            public final Paint maskPaint;
            public final Path path;
            public int rightColor;
            public final Paint strokePaint;
            public final AnimatedFloat swapGradient;

            public RaysView(Context context) {
                super(context);
                this.fillPaint = new Paint(1);
                this.strokePaint = new Paint(1);
                Paint paint = new Paint(1);
                this.maskPaint = paint;
                this.gradient = new RadialGradient[2];
                this.gradientMatrix = new Matrix();
                this.swapGradient = new AnimatedFloat(1.0f, this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.maskGradient = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
                this.path = new Path();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }

            @Override
            public final void onDraw(Canvas canvas) {
                Paint paint;
                int i = 0;
                float f = this.swapGradient.set(1.0f, false);
                float fCurrentTimeMillis = ((System.currentTimeMillis() % 15000) / 15000.0f) * 360.0f;
                if (getAlpha() > 0.0f) {
                    invalidate();
                }
                Paint paint2 = this.strokePaint;
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                Path path = this.path;
                path.rewind();
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
                for (int i2 = 0; i2 < 6; i2++) {
                    float fM = OKLCH.m(i2, 60.0f, 12.5f, fCurrentTimeMillis);
                    path.moveTo(width, height);
                    double d = ((double) ((fM - 12.5f) / 180.0f)) * 3.141592653589793d;
                    path.lineTo((((float) Math.cos(d)) * fMin) + width, (((float) Math.sin(d)) * fMin) + height);
                    double d2 = ((double) ((fM + 12.5f) / 180.0f)) * 3.141592653589793d;
                    path.lineTo((((float) Math.cos(d2)) * fMin) + width, (((float) Math.sin(d2)) * fMin) + height);
                    path.lineTo(width, height);
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                while (true) {
                    RadialGradient[] radialGradientArr = this.gradient;
                    int length = radialGradientArr.length;
                    Matrix matrix = this.gradientMatrix;
                    if (i >= length) {
                        matrix.reset();
                        float f2 = fMin / 100.0f;
                        matrix.postScale(f2, f2);
                        matrix.postTranslate(width, height);
                        RadialGradient radialGradient = this.maskGradient;
                        radialGradient.setLocalMatrix(matrix);
                        Paint paint3 = this.maskPaint;
                        paint3.setShader(radialGradient);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                        canvas.restore();
                        return;
                    }
                    if (radialGradientArr[i] == null) {
                        paint = paint2;
                    } else {
                        paint = paint2;
                        float fPow = (float) Math.pow(1.0f - Math.abs(i - f), 0.5d);
                        if (fPow > 0.0f) {
                            matrix.reset();
                            float f3 = fMin / 100.0f;
                            matrix.postScale(f3, f3);
                            matrix.postTranslate(width, height);
                            radialGradientArr[i].setLocalMatrix(matrix);
                            Paint paint4 = this.fillPaint;
                            paint4.setShader(radialGradientArr[i]);
                            float f4 = fPow * 255.0f;
                            paint4.setAlpha((int) (0.3f * f4));
                            paint.setShader(radialGradientArr[i]);
                            paint.setAlpha((int) f4);
                            canvas.drawPath(path, paint4);
                            canvas.drawPath(path, paint);
                        }
                    }
                    i++;
                    paint2 = paint;
                }
            }

            public final void setColor(int i, int i2) {
                if (this.leftColor == i && this.rightColor == i2) {
                    return;
                }
                RadialGradient[] radialGradientArr = this.gradient;
                radialGradientArr[0] = radialGradientArr[1];
                this.leftColor = i;
                this.rightColor = i2;
                radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.swapGradient.set(0.0f, true);
                invalidate();
            }
        }

        public final class SelectGiftView extends FrameLayout {
            public final TextView chance;
            public final ImageView closeIcon;
            public final FrameLayout closeLayout;
            public TL_stars.StarGift gift;
            public final GiftSheet.CardBackground giftBackground;
            public final BackupImageView giftImage;
            public final FrameLayout giftLayout;
            public boolean isReplaceIcon;

            public SelectGiftView(Context context) {
                super(context);
                FrameLayout frameLayout = new FrameLayout(context);
                addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
                frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.multAlpha(0.12f, -4530177)));
                frameLayout.setForeground(new RoundRectStrokeDrawable(AndroidUtilities.dp(18.0f), 0));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.filled_add_album);
                imageView.setScaleX(1.25f);
                imageView.setScaleY(1.25f);
                frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.giftLayout = frameLayout2;
                GiftSheet.CardBackground cardBackground = new GiftSheet.CardBackground(frameLayout2, null, false);
                this.giftBackground = cardBackground;
                frameLayout2.setBackground(cardBackground);
                cardBackground.r = AndroidUtilities.dp(18.0f);
                cardBackground.withPadding = false;
                frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
                frameLayout2.setAlpha(0.0f);
                frameLayout2.setScaleX(0.6f);
                frameLayout2.setScaleY(0.6f);
                BackupImageView backupImageView = new BackupImageView(context);
                this.giftImage = backupImageView;
                frameLayout2.addView(backupImageView, LayoutHelper.createFrame(52, 52, 17));
                TextView textView = new TextView(context);
                this.chance = textView;
                textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 10.0f);
                textView.setTextColor(-1);
                textView.setAlpha(0.0f);
                addView(textView, LayoutHelper.createFrame(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.closeLayout = frameLayout3;
                frameLayout3.setAlpha(0.0f);
                addView(frameLayout3, LayoutHelper.createFrame(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                this.closeIcon = imageView2;
                imageView2.setImageResource(R.drawable.msg_close);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                frameLayout3.addView(imageView2, LayoutHelper.createFrame(12, 12, 17));
                setGiftVisible(false, false);
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
            }

            public final void setGift(TL_stars.StarGift starGift, boolean z) {
                this.gift = starGift;
                if (starGift != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                    GiftSheet.CardBackground cardBackground = this.giftBackground;
                    cardBackground.setBackdrop(stargiftattributebackdrop);
                    cardBackground.setPattern(stargiftattributepattern);
                    StarsIntroActivity.setGiftImage(this.giftImage.getImageReceiver(), stargiftattributemodel.document, 52);
                    int iAdaptHSV = Theme.adaptHSV(-0.05f, -0.15f, Theme.multAlpha(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
                    TextView textView = this.chance;
                    textView.setText(AffiliateProgramFragment.percents(starGift.craft_chance_permille));
                    textView.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(10.0f), iAdaptHSV));
                    this.closeLayout.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(10.0f), iAdaptHSV));
                }
                setGiftVisible(starGift != null, z);
            }

            public final void setGiftVisible(final boolean z, boolean z2) {
                FrameLayout frameLayout = this.giftLayout;
                frameLayout.animate().cancel();
                TextView textView = this.chance;
                textView.animate().cancel();
                FrameLayout frameLayout2 = this.closeLayout;
                frameLayout2.animate().cancel();
                if (!z2) {
                    frameLayout.setVisibility(z ? 0 : 8);
                    frameLayout.setScaleX(z ? 1.0f : 0.6f);
                    frameLayout.setScaleY(z ? 1.0f : 0.6f);
                    frameLayout.setAlpha(z ? 1.0f : 0.0f);
                    textView.setVisibility(z ? 0 : 8);
                    textView.setAlpha(z ? 1.0f : 0.0f);
                    frameLayout2.setVisibility(z ? 0 : 8);
                    frameLayout2.setAlpha(z ? 1.0f : 0.0f);
                    return;
                }
                frameLayout.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = frameLayout.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).alpha(z ? 1.0f : 0.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                final int i = 0;
                viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
                    public final StarGiftSheet.CraftTopView.SelectGiftView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = this.f$0;
                                if (!z) {
                                    selectGiftView.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView.getClass();
                                }
                                break;
                            case 1:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView2 = this.f$0;
                                if (!z) {
                                    selectGiftView2.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView2.getClass();
                                }
                                break;
                            default:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView3 = this.f$0;
                                if (!z) {
                                    selectGiftView3.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView3.getClass();
                                }
                                break;
                        }
                    }
                }).start();
                textView.setVisibility(0);
                final int i2 = 1;
                textView.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
                    public final StarGiftSheet.CraftTopView.SelectGiftView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = this.f$0;
                                if (!z) {
                                    selectGiftView.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView.getClass();
                                }
                                break;
                            case 1:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView2 = this.f$0;
                                if (!z) {
                                    selectGiftView2.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView2.getClass();
                                }
                                break;
                            default:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView3 = this.f$0;
                                if (!z) {
                                    selectGiftView3.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView3.getClass();
                                }
                                break;
                        }
                    }
                }).start();
                frameLayout2.setVisibility(0);
                final int i3 = 2;
                frameLayout2.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable(this) {
                    public final StarGiftSheet.CraftTopView.SelectGiftView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = this.f$0;
                                if (!z) {
                                    selectGiftView.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView.getClass();
                                }
                                break;
                            case 1:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView2 = this.f$0;
                                if (!z) {
                                    selectGiftView2.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView2.getClass();
                                }
                                break;
                            default:
                                StarGiftSheet.CraftTopView.SelectGiftView selectGiftView3 = this.f$0;
                                if (!z) {
                                    selectGiftView3.closeLayout.setVisibility(8);
                                } else {
                                    selectGiftView3.getClass();
                                }
                                break;
                        }
                    }
                }).start();
            }

            public final void setReplaceIcon(boolean z) {
                ImageView imageView = this.closeIcon;
                imageView.setScaleX(0.8f);
                imageView.setScaleY(0.8f);
                this.isReplaceIcon = z;
                imageView.setImageResource(z ? R.drawable.mini_replace2 : R.drawable.msg_close);
            }
        }

        public final class SwitchGradientDrawable extends Drawable {
            public int color1;
            public int color2;
            public Drawable icon;
            public final Paint paint = new Paint(1);
            public final Shader[] gradient = new Shader[2];
            public final Matrix gradientMatrix = new Matrix();
            public final AnimatedFloat swapGradient = new AnimatedFloat(1.0f, new ProfileActivity$9$$ExternalSyntheticLambda1(this, 27), 0, 420, CubicBezierInterpolator.EASE_OUT_QUINT);
            public final RectF rect = new RectF();
            public final int type = 1;

            @Override
            public final void draw(Canvas canvas) {
                RectF rectF = this.rect;
                rectF.set(getBounds());
                rectF.right = rectF.width() + rectF.left;
                int i = 0;
                float f = this.swapGradient.set(1.0f, false);
                while (true) {
                    Shader[] shaderArr = this.gradient;
                    if (i >= shaderArr.length) {
                        break;
                    }
                    if (shaderArr[i] != null) {
                        float fPow = (float) Math.pow(1.0f - Math.abs(i - f), 0.25d);
                        if (fPow > 0.0f) {
                            Matrix matrix = this.gradientMatrix;
                            matrix.reset();
                            if (this.type == 1) {
                                matrix.postTranslate(rectF.centerX(), AndroidUtilities.dp(145.0f));
                            } else {
                                matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                            }
                            shaderArr[i].setLocalMatrix(matrix);
                            Paint paint = this.paint;
                            paint.setShader(shaderArr[i]);
                            paint.setAlpha((int) (fPow * 255.0f));
                            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                        }
                    }
                    i++;
                }
                if (this.icon != null) {
                    canvas.save();
                    canvas.translate(rectF.centerX(), AndroidUtilities.dp(145.0f));
                    StarGiftPatterns.drawPattern(canvas, 0, this.icon, rectF.width(), AndroidUtilities.dp(290.0f), 2.0f, 1.0f);
                    canvas.restore();
                }
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i) {
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            public final void setColors(int i, int i2) {
                if (this.color1 == i && this.color2 == i2) {
                    return;
                }
                Shader[] shaderArr = this.gradient;
                shaderArr[0] = shaderArr[1];
                if (this.type == 0) {
                    this.color1 = i;
                    this.color2 = i2;
                    shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                } else {
                    float fDp = AndroidUtilities.dp(340.0f);
                    this.color1 = i;
                    this.color2 = i2;
                    shaderArr[1] = new RadialGradient(0.0f, 0.0f, fDp, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.swapGradient.set(0.0f, true);
                invalidateSelf();
            }
        }

        public CraftTopView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.BACKGROUND_COLORS = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
            this.COLORS = new int[]{Theme.multAlpha(0.08f, -1), Theme.multAlpha(0.08f, -1), -294362, -3914963, -13519030, -12613223};
            this.resourcesProvider = resourcesProvider;
            SwitchGradientDrawable switchGradientDrawable = new SwitchGradientDrawable();
            this.bg = switchGradientDrawable;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
            switchGradientDrawable.icon = drawableMutate;
            setBackground(switchGradientDrawable);
            FrameLayout frameLayout = new FrameLayout(context);
            this.buttonsLayout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, 60, 55));
            ImageView imageView = new ImageView(context);
            this.helpButton = imageView;
            imageView.setImageResource(R.drawable.outline_question_mark);
            imageView.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(24.0f), Theme.multAlpha(0.08f, -1)));
            frameLayout.addView(imageView, LayoutHelper.createFrame(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(this, 0));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.msg_close);
            imageView2.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(24.0f), Theme.multAlpha(0.08f, -1)));
            frameLayout.addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
            imageView2.setOnClickListener(new StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(this, 1));
            ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(-1);
            textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.precraftingLayout = frameLayout2;
            addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.craftingLayout = frameLayout3;
            frameLayout3.setAlpha(0.0f);
            addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.failedLayout = frameLayout4;
            frameLayout4.setAlpha(0.0f);
            addView(frameLayout4, LayoutHelper.createFrame(-1, -1, 119));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
            this.textView = spoilersTextView;
            spoilersTextView.setGravity(17);
            spoilersTextView.setTextSize(1, 13.0f);
            spoilersTextView.setTextColor(-1);
            frameLayout2.addView(spoilersTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.attributesLayoutLine1 = linearLayout;
            LayoutTransition layoutTransition = new LayoutTransition();
            int i = 2;
            layoutTransition.setDuration(2, 320L);
            int i2 = 3;
            layoutTransition.setDuration(3, 320L);
            layoutTransition.setDuration(0, 320L);
            layoutTransition.setDuration(1, 320L);
            int i3 = 4;
            layoutTransition.setDuration(4, 320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            layoutTransition.setInterpolator(2, cubicBezierInterpolator);
            layoutTransition.setInterpolator(3, cubicBezierInterpolator);
            layoutTransition.setInterpolator(0, cubicBezierInterpolator);
            layoutTransition.setInterpolator(1, cubicBezierInterpolator);
            layoutTransition.setInterpolator(4, cubicBezierInterpolator);
            linearLayout.setLayoutTransition(layoutTransition);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.attributesLayoutLine2 = linearLayout2;
            LayoutTransition layoutTransition2 = new LayoutTransition();
            layoutTransition2.setDuration(2, 320L);
            layoutTransition2.setDuration(3, 320L);
            layoutTransition2.setDuration(0, 320L);
            layoutTransition2.setDuration(1, 320L);
            layoutTransition2.setDuration(4, 320L);
            layoutTransition2.setInterpolator(2, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(3, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(0, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(1, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(4, cubicBezierInterpolator);
            linearLayout2.setLayoutTransition(layoutTransition2);
            linearLayout2.setOrientation(0);
            linearLayout2.setAlpha(0.0f);
            linearLayout2.setGravity(17);
            this.backdropAttributes = new AttributeView[4];
            this.patternAttributes = new AttributeView[4];
            for (int i4 = 0; i4 < 4; i4++) {
                LinearLayout linearLayout3 = this.attributesLayoutLine1;
                AttributeView[] attributeViewArr = this.backdropAttributes;
                AttributeView attributeView = new AttributeView(context);
                attributeViewArr[i4] = attributeView;
                linearLayout3.addView(attributeView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
                this.backdropAttributes[i4].setOnClickListener(new StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(this, i));
            }
            for (int i5 = 0; i5 < 4; i5++) {
                LinearLayout linearLayout4 = this.attributesLayoutLine1;
                AttributeView[] attributeViewArr2 = this.patternAttributes;
                AttributeView attributeView2 = new AttributeView(context);
                attributeViewArr2[i5] = attributeView2;
                linearLayout4.addView(attributeView2, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
                this.patternAttributes[i5].setOnClickListener(new StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(this, i2));
            }
            this.gifts = new SelectGiftView[4];
            this.faces = new Face[6];
            int i6 = 0;
            while (i6 < 6) {
                this.faces[i6] = new Face(context, i6 == 5);
                i6++;
            }
            this.frontFace = this.faces[5];
            RaysView raysView = new RaysView(context);
            this.rays = raysView;
            raysView.setVisibility(8);
            raysView.setAlpha(0.0f);
            addView(raysView, LayoutHelper.createFrame(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            Cube3D cube3D = new Cube3D(context, this.faces);
            this.cube = cube3D;
            addView(cube3D, LayoutHelper.createFrame(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.variantsButton = textViewEmojis;
            textViewEmojis.setTextSize(1, 12.0f);
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            textViewEmojis.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            textViewEmojis.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
            textViewEmojis.setGravity(17);
            textViewEmojis.setTextColor(-1);
            textViewEmojis.setAlpha(this.previewAttributes == null ? 0.25f : 1.0f);
            textViewEmojis.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(14.0f), Theme.multAlpha(0.08f, -1)));
            ScaleStateListAnimator.apply(textViewEmojis, 0.02f, 1.2f);
            this.precraftingLayout.addView(textViewEmojis, LayoutHelper.createFrame(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
            textViewEmojis.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(19, this, resourcesProvider));
            this.precraftingLayout.addView(this.attributesLayoutLine1, LayoutHelper.createFrame(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
            this.precraftingLayout.addView(this.attributesLayoutLine2, LayoutHelper.createFrame(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.button = linearLayout5;
            linearLayout5.setOrientation(1);
            ButtonBackground buttonBackground = new ButtonBackground();
            this.buttonBackground = buttonBackground;
            linearLayout5.setBackground(buttonBackground);
            buttonBackground.setColor(Theme.multAlpha(0.08f, -1), Theme.multAlpha(0.08f, -1));
            ScaleStateListAnimator.apply(linearLayout5, 0.02f, 1.2f);
            addView(linearLayout5, LayoutHelper.createFrame(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
            linearLayout5.setOnClickListener(new StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(this, i3));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
            this.buttonTitle = animatedTextView;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setGravity(17);
            animatedTextView.setTextColor(Theme.multAlpha(0.75f, -1));
            animatedTextView.setText(LocaleController.getString(R.string.GiftCraftButton));
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            linearLayout5.addView(animatedTextView, LayoutHelper.createLinear(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, false, false);
            this.buttonSubtitle = animatedTextView2;
            animatedTextView2.getDrawable().setHacks(true, false);
            animatedTextView2.setGravity(17);
            animatedTextView2.setTextColor(Theme.multAlpha(0.75f, -1));
            animatedTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
            animatedTextView2.setTextSize(AndroidUtilities.dp(12.0f));
            linearLayout5.addView(animatedTextView2, LayoutHelper.createLinear(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
            LinearLayout linearLayout6 = new LinearLayout(context);
            linearLayout6.setOrientation(0);
            linearLayout6.setGravity(17);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.craftingIconView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.gift_crafting, 30, 30, null);
            linearLayout6.addView(rLottieImageView, LayoutHelper.createLinear(30, 30, 17, 0, 0, 4, 0));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
            linearLayout6.addView(textView2, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
            this.craftingLayout.addView(linearLayout6, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.craftingSubtitleView = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(Theme.multAlpha(0.5f, -1));
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            TextView textViewM = zzcv.m(this.craftingLayout, textView3, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
            this.craftingChanceView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            textViewM.setTextColor(-1);
            textViewM.setTypeface(AndroidUtilities.bold());
            textViewM.setGravity(17);
            textViewM.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
            textViewM.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(14.0f), Theme.multAlpha(0.08f, -1)));
            TextView textViewM2 = zzcv.m(this.craftingLayout, textViewM, LayoutHelper.createFrame(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
            textViewM2.setTextSize(1, 13.0f);
            textViewM2.setTextColor(Theme.multAlpha(0.5f, -1));
            textViewM2.setGravity(17);
            textViewM2.setText(LocaleController.getString(R.string.GiftCraftProgressText));
            TextView textViewM3 = zzcv.m(this.craftingLayout, textViewM2, LayoutHelper.createFrame(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
            textViewM3.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
            textViewM3.setTextColor(-505270);
            textViewM3.setTextSize(1, 20.0f);
            textViewM3.setTypeface(AndroidUtilities.bold());
            textViewM3.setGravity(17);
            TextView textViewM4 = zzcv.m(this.failedLayout, textViewM3, LayoutHelper.createFrame(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
            this.failedSubtitle = textViewM4;
            textViewM4.setTextColor(-17253);
            textViewM4.setTextSize(1, 13.0f);
            textViewM4.setGravity(17);
            this.failedLayout.addView(textViewM4, LayoutHelper.createFrame(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
            LinearLayout linearLayout7 = new LinearLayout(context);
            this.failedGiftsLayout = linearLayout7;
            linearLayout7.setOrientation(0);
            this.failedLayout.addView(linearLayout7, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
            this.failedGifts = null;
            updateCounts(true);
        }

        public TL_stars.StarGift getFirstGift() {
            int i = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return null;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null) {
                    TL_stars.StarGift starGift = selectGiftView.gift;
                    if ((starGift != null ? starGift : null) != null) {
                        if (starGift != null) {
                            return starGift;
                        }
                        return null;
                    }
                }
                i++;
            }
        }

        public int getGiftsSelectedCount() {
            int i = 0;
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return i2;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null) {
                    TL_stars.StarGift starGift = selectGiftView.gift;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i2++;
                    }
                }
                i++;
            }
        }

        public int getGiftsSuccessChance() {
            int i = 0;
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return i2;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null) {
                    TL_stars.StarGift starGift = selectGiftView.gift;
                    if ((starGift != null ? starGift : null) != null) {
                        if (starGift == null) {
                            starGift = null;
                        }
                        i2 += starGift.craft_chance_permille;
                    }
                }
                i++;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
            this.onAddGift = callback2;
        }

        public void setOnClose(Runnable runnable) {
            this.onClose = runnable;
        }

        public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
            this.onCraft = callback3;
        }

        public final void setup(int i, long j, TLRPC.Document document, String str) {
            SelectGiftView[] selectGiftViewArr;
            this.currentAccount = i;
            this.giftId = j;
            this.document = document;
            this.collectionTitle = str;
            this.crafting = false;
            this.failed = false;
            int i2 = 0;
            while (true) {
                selectGiftViewArr = this.gifts;
                if (i2 >= selectGiftViewArr.length) {
                    break;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i2];
                if (selectGiftView != null) {
                    AndroidUtilities.removeFromParent(selectGiftView);
                }
                i2++;
            }
            Cube3D cube3D = this.cube;
            Cube3D.AnimSequence animSequence = cube3D.sequence;
            if (animSequence != null) {
                animSequence.cancelled = true;
                animSequence.waitingForPull = false;
                animSequence.cube.sequence = null;
                cube3D.sequence = null;
            }
            ValueAnimator valueAnimator = cube3D.pulling;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                cube3D.pulling = null;
            }
            cube3D.pullingIndex = -1;
            cube3D.pullingT = 0.0f;
            cube3D.usedFaces.clear();
            cube3D.index2face.clear();
            cube3D.index2Position.clear();
            for (int i3 = 0; i3 < 6; i3++) {
                cube3D.faceRotations[i3] = 0.0f;
            }
            cube3D.removeAllViews();
            int i4 = 0;
            while (true) {
                View[] viewArr = cube3D.faces;
                if (i4 >= viewArr.length) {
                    break;
                }
                viewArr[i4].setAlpha(1.0f);
                viewArr[i4].setVisibility(0);
                cube3D.addView(viewArr[i4], LayoutHelper.createFrame(108, 108, 17));
                i4++;
            }
            android.opengl.Matrix.setIdentityM(cube3D.rotationMatrix, 0);
            cube3D.vy = 0.0f;
            cube3D.vx = 0.0f;
            cube3D.frictionEnabled = true;
            SelectGiftView selectGiftView2 = new SelectGiftView(getContext());
            selectGiftViewArr[0] = selectGiftView2;
            addView(selectGiftView2, LayoutHelper.createFrame(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
            SelectGiftView selectGiftView3 = new SelectGiftView(getContext());
            selectGiftViewArr[1] = selectGiftView3;
            addView(selectGiftView3, LayoutHelper.createFrame(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
            SelectGiftView selectGiftView4 = new SelectGiftView(getContext());
            selectGiftViewArr[2] = selectGiftView4;
            addView(selectGiftView4, LayoutHelper.createFrame(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
            SelectGiftView selectGiftView5 = new SelectGiftView(getContext());
            selectGiftViewArr[3] = selectGiftView5;
            addView(selectGiftView5, LayoutHelper.createFrame(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
            for (int i5 = 0; i5 < selectGiftViewArr.length; i5++) {
                ScaleStateListAnimator.apply(selectGiftViewArr[i5], 0.1f, 1.5f);
                selectGiftViewArr[i5].setClickable(true);
                selectGiftViewArr[i5].setOnClickListener(new StarGiftSheet$CraftTopView$$ExternalSyntheticLambda0(this, 5));
            }
            updateCounts(false);
            this.crafting = false;
            FrameLayout frameLayout = this.precraftingLayout;
            frameLayout.animate().cancel();
            frameLayout.setAlpha(1.0f);
            LinearLayout linearLayout = this.button;
            linearLayout.animate().cancel();
            linearLayout.setAlpha(1.0f);
            FrameLayout frameLayout2 = this.craftingLayout;
            frameLayout2.animate().cancel();
            frameLayout2.setAlpha(0.0f);
            FrameLayout frameLayout3 = this.failedLayout;
            frameLayout3.animate().cancel();
            frameLayout3.setAlpha(0.0f);
            FrameLayout frameLayout4 = this.buttonsLayout;
            frameLayout4.animate().cancel();
            frameLayout4.setAlpha(1.0f);
            this.variantsButton.setAlpha(this.attributesTwoLines ? 0.0f : this.previewAttributes != null ? 1.0f : 0.25f);
            RaysView raysView = this.rays;
            raysView.setVisibility(8);
            raysView.setAlpha(0.0f);
            String string = LocaleController.getString(R.string.GiftCraftButton);
            AnimatedTextView animatedTextView = this.buttonTitle;
            animatedTextView.setText(string);
            animatedTextView.setTranslationY(0.0f);
            this.buttonSubtitle.setAlpha(1.0f);
            GiftAuctionController.getInstance(i).requestAuctionUpgrades(j, new ChatActivity$$ExternalSyntheticLambda296(this, j, j, 2));
        }

        public final void showHint(AttributeView attributeView) {
            if (attributeView.backdrop != null) {
                showHint(attributeView, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(attributeView.progress * 100.0f), attributeView.backdrop.name)));
            } else if (attributeView.pattern != null) {
                showHint(attributeView, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(attributeView.progress * 100.0f), attributeView.pattern.name)));
            }
        }

        public final void updateCounts(boolean z) {
            SelectGiftView[] selectGiftViewArr;
            HashMap map;
            ?? r3;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
            ArrayList arrayList;
            TL_stars.starGiftAttributePattern stargiftattributepattern;
            LinearLayout linearLayout;
            TL_stars.StarGift starGift;
            int giftsSelectedCount = getGiftsSelectedCount();
            float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
            Face face = this.frontFace;
            AnimatedTextView animatedTextView = face.counter;
            int i = 1;
            if (animatedTextView != null) {
                animatedTextView.setText(Math.round(giftsSuccessChance) + "%", z, true);
                float f = giftsSuccessChance / 100.0f;
                ProgressView progressView = face.progress;
                progressView.progress = f;
                if (!z) {
                    progressView.animatedProgress.set(f, true);
                }
                progressView.invalidate();
            }
            AnimatedTextView animatedTextView2 = this.buttonSubtitle;
            if (giftsSelectedCount <= 0) {
                if (this.plus == null) {
                    this.plus = new SpannableStringBuilder("+");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_add_album);
                    coloredImageSpan.setScale(0.65f, 0.65f);
                    SpannableStringBuilder spannableStringBuilder = this.plus;
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
                AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.plus);
                animatedTextView2.setText(spannableStringBuilder2);
            } else {
                animatedTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, AffiliateProgramFragment.percents(getGiftsSuccessChance()))));
            }
            int i2 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
            int[] iArr = this.COLORS;
            int i3 = i2 + 1;
            this.buttonBackground.setColor(iArr[i2], iArr[i3]);
            int[] iArr2 = this.BACKGROUND_COLORS;
            this.bg.setColors(iArr2[i2], iArr2[i3]);
            this.rays.setColor(iArr[i3], iArr[i2]);
            if (this.document != null) {
                TL_stars.StarGift firstGift = getFirstGift();
                SpoilersTextView spoilersTextView = this.textView;
                if (firstGift != null) {
                    SpannableString spannableString = new SpannableString("x");
                    TLRPC.Document document = this.document;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, spoilersTextView.getPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    spoilersTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.collectionTitle, LocaleController.formatNumber(firstGift.num, ',')))));
                } else {
                    SpannableString spannableString2 = new SpannableString("x");
                    TLRPC.Document document2 = this.document;
                    AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document2.id, 1.2f, spoilersTextView.getPaint().getFontMetricsInt());
                    animatedEmojiSpan2.document = document2;
                    spannableString2.setSpan(animatedEmojiSpan2, 0, spannableString2.length(), 33);
                    spoilersTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.collectionTitle))));
                }
            }
            int[][] iArr3 = MessagesController.getInstance(this.currentAccount).stargiftsCraftAttributesPermilles;
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                selectGiftViewArr = this.gifts;
                if (i4 >= selectGiftViewArr.length) {
                    break;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i4];
                if (selectGiftView != null) {
                    TL_stars.StarGift starGift2 = selectGiftView.gift;
                    if ((starGift2 != null ? starGift2 : null) != null) {
                        i5++;
                        TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                        TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        map2.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.EL.getOrDefault(map2, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                        map3.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.EL.getOrDefault(map3, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                    }
                }
                i4++;
            }
            boolean zIsEmpty = map2.isEmpty();
            AttributeView[] attributeViewArr = this.backdropAttributes;
            if (zIsEmpty) {
                AttributeView attributeView = attributeViewArr[0];
                attributeView.setBackdrop(null);
                attributeView.setProgress(0.0f, true);
                arrayList2.add(attributeView);
                for (int i6 = 1; i6 < 4; i6++) {
                    attributeViewArr[i6].setVisibility(8);
                }
                map = map3;
                r3 = 1;
            } else {
                ArrayList arrayList3 = new ArrayList(map2.entrySet());
                Collections.sort(arrayList3, Map$Entry$CC.comparingByValue());
                int size = arrayList3.size();
                int i7 = 0;
                int i8 = 0;
                while (i7 < size) {
                    Object obj = arrayList3.get(i7);
                    i7 += i;
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    int iIntValue = ((Integer) entry.getKey()).intValue();
                    int iIntValue2 = ((Integer) entry.getValue()).intValue();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= selectGiftViewArr.length) {
                            stargiftattributebackdrop = null;
                            break;
                        }
                        SelectGiftView selectGiftView2 = selectGiftViewArr[i9];
                        if (selectGiftView2 != null) {
                            TL_stars.StarGift starGift4 = selectGiftView2.gift;
                            if ((starGift4 != null ? starGift4 : null) != null) {
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                if (stargiftattributebackdrop.backdrop_id == iIntValue) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i9++;
                    }
                    if (stargiftattributebackdrop != null) {
                        AttributeView attributeView2 = attributeViewArr[i8];
                        attributeView2.setBackdrop(stargiftattributebackdrop);
                        int[] iArr4 = iArr3[Utilities.clamp(i5 - 1, iArr3.length - 1, 0)];
                        attributeView2.setProgress(iArr4[Utilities.clamp(iIntValue2 - 1, iArr4.length - 1, 0)] / 1000.0f, true);
                        arrayList2.add(attributeView2);
                        i8++;
                        map3 = map3;
                        size = size;
                    }
                    i = 1;
                }
                map = map3;
                r3 = 1;
                for (int i10 = i8; i10 < 4; i10++) {
                    attributeViewArr[i10].setVisibility(8);
                }
            }
            boolean zIsEmpty2 = map.isEmpty();
            AttributeView[] attributeViewArr2 = this.patternAttributes;
            if (zIsEmpty2) {
                AttributeView attributeView3 = attributeViewArr2[0];
                attributeView3.setIcon(null);
                attributeView3.setProgress(0.0f, r3);
                arrayList2.add(attributeView3);
                for (int i11 = 1; i11 < 4; i11 += r3) {
                    attributeViewArr2[i11].setVisibility(8);
                }
            } else {
                ArrayList arrayList4 = new ArrayList(map.entrySet());
                Collections.sort(arrayList4, Map$Entry$CC.comparingByValue());
                int size2 = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
                    long jLongValue = ((Long) entry2.getKey()).longValue();
                    int iIntValue3 = ((Integer) entry2.getValue()).intValue();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= selectGiftViewArr.length) {
                            arrayList = arrayList4;
                            stargiftattributepattern = null;
                            break;
                        }
                        SelectGiftView selectGiftView3 = selectGiftViewArr[i14];
                        if (selectGiftView3 == null) {
                            arrayList = arrayList4;
                        } else {
                            TL_stars.StarGift starGift5 = selectGiftView3.gift;
                            if ((starGift5 != null ? starGift5 : null) == null) {
                                arrayList = arrayList4;
                            } else {
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                                if (stargiftattributepattern3 != null) {
                                    arrayList = arrayList4;
                                    if (stargiftattributepattern3.document.id == jLongValue) {
                                        stargiftattributepattern = stargiftattributepattern3;
                                        break;
                                    }
                                } else {
                                    arrayList = arrayList4;
                                }
                            }
                        }
                        i14++;
                        arrayList4 = arrayList;
                    }
                    if (stargiftattributepattern != null) {
                        int i15 = i13 + 1;
                        AttributeView attributeView4 = attributeViewArr2[i13];
                        attributeView4.setIcon(stargiftattributepattern);
                        int[] iArr5 = iArr3[Utilities.clamp(i5 - 1, iArr3.length - 1, 0)];
                        attributeView4.setProgress(iArr5[Utilities.clamp(iIntValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                        arrayList2.add(attributeView4);
                        i13 = i15;
                    }
                    arrayList4 = arrayList;
                }
                while (i13 < 4) {
                    attributeViewArr2[i13].setVisibility(8);
                    i13++;
                }
            }
            this.attributesTwoLines = arrayList2.size() > 5;
            int i16 = 0;
            while (true) {
                int size3 = arrayList2.size();
                linearLayout = this.attributesLayoutLine2;
                if (i16 >= size3) {
                    break;
                }
                AttributeView attributeView5 = (AttributeView) arrayList2.get(i16);
                if (!this.attributesTwoLines || i16 < arrayList2.size() / 2.0f) {
                    linearLayout = this.attributesLayoutLine1;
                }
                if (attributeView5.getParent() != linearLayout) {
                    ViewParent parent = attributeView5.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                        boolean z2 = layoutTransition != null;
                        if (z2) {
                            layoutTransition.disableTransitionType(3);
                        }
                        viewGroup.removeView(attributeView5);
                        if (z2) {
                            layoutTransition.enableTransitionType(3);
                        }
                        attributeView5.animate().cancel();
                        attributeView5.clearAnimation();
                        attributeView5.setTranslationX(0.0f);
                        attributeView5.setTranslationY(0.0f);
                        attributeView5.setTranslationZ(0.0f);
                        attributeView5.setAlpha(0.0f);
                        attributeView5.setScaleX(1.0f);
                        attributeView5.setScaleY(1.0f);
                        attributeView5.setRotation(0.0f);
                        attributeView5.setRotationX(0.0f);
                        attributeView5.setRotationY(0.0f);
                    }
                    linearLayout.addView(attributeView5, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
                }
                attributeView5.setVisibility(0);
                i16++;
            }
            linearLayout.animate().alpha(this.attributesTwoLines ? 1.0f : 0.0f);
            this.variantsButton.animate().alpha(this.attributesTwoLines ? 0.0f : this.previewAttributes != null ? 1.0f : 0.25f);
            boolean z3 = true;
            for (int i17 = 0; i17 < selectGiftViewArr.length; i17++) {
                SelectGiftView selectGiftView4 = selectGiftViewArr[i17];
                if (selectGiftView4 != null) {
                    TL_stars.StarGift starGift6 = selectGiftView4.gift;
                    if (starGift6 == null) {
                        starGift6 = null;
                    }
                    if (starGift6 != null) {
                        if (z3) {
                            int i18 = i17 + 1;
                            while (true) {
                                if (i18 < selectGiftViewArr.length) {
                                    SelectGiftView selectGiftView5 = selectGiftViewArr[i18];
                                    if (selectGiftView5 != null) {
                                        starGift = selectGiftView5.gift;
                                        if ((starGift != null ? starGift : null) != null) {
                                            if (starGift == null) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    i18++;
                                }
                                starGift = null;
                                break;
                            }
                            selectGiftViewArr[i17].setReplaceIcon((starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : true);
                        } else {
                            selectGiftView4.setReplaceIcon(false);
                        }
                        z3 = false;
                    }
                }
            }
        }

        public final void showHint(AttributeView attributeView, SpannableStringBuilder spannableStringBuilder) {
            HintView2 hintView2 = this.currentHint;
            if (hintView2 != null) {
                hintView2.hide(true);
                this.currentHint = null;
            }
            if (this.crafting || this.failed) {
                return;
            }
            View view = attributeView.getParent() instanceof View ? (View) attributeView.getParent() : null;
            float x = attributeView.getX() + (view != null ? view.getX() : 0.0f);
            float y = attributeView.getY() + (view != null ? view.getY() : 0.0f);
            HintView2 hintView3 = new HintView2(getContext(), 3);
            this.currentHint = hintView3;
            hintView3.setMultilineText(true);
            this.currentHint.setText(spannableStringBuilder);
            HintView2 hintView4 = this.currentHint;
            hintView4.textMaxWidth = HintView2.cutInFancyHalf(hintView4.getText(), this.currentHint.getTextPaint());
            HintView2 hintView5 = this.currentHint;
            hintView5.textLayoutAlignment = Layout.Alignment.ALIGN_CENTER;
            hintView5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.currentHint, LayoutHelper.createFrame(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.currentHint.setTranslationY(y - AndroidUtilities.dp(100.0f));
            this.currentHint.setJointPx(0.0f, ((attributeView.getWidth() / 2.0f) + x) - AndroidUtilities.dp(2.0f));
            this.currentHint.show();
        }
    }

    public final class PageTransition {
        public final int from;
        public float progress;
        public final int to;

        public PageTransition(float f, int i, int i2) {
            this.progress = f;
            this.from = i;
            this.to = i2;
        }

        public float at(int i) {
            int i2 = this.from;
            int i3 = this.to;
            if (i3 == i && i2 == i) {
                return 1.0f;
            }
            if (i3 == i) {
                return this.progress;
            }
            if (i2 == i) {
                return 1.0f - this.progress;
            }
            return 0.0f;
        }

        public boolean contains(int i) {
            return this.from == i || this.to == i;
        }

        public boolean is(int i) {
            return this.to == i;
        }

        public boolean to(int i) {
            return this.to == i;
        }

        public PageTransition(int i, int i2) {
            this.from = i;
            this.to = i2;
        }
    }

    public final class Roller {
        public AttrRoller backdropRoller;
        public AttrRoller backdropRoller2;
        public TextViewRoll backdropText;
        public boolean drawing;
        public float durationT;
        public long lastFrameTime;
        public AttrRoller modelRoller;
        public TextViewRoll modelText;
        public TextViewRoll patternText;
        public boolean posted;
        public TL_stars.TL_starGiftUnique rollingGift;
        public AttrRoller symbolRoller;
        public final TopView topView;
        public StarGiftSheet$$ExternalSyntheticLambda3 whenDone;
        public StarGiftSheet$$ExternalSyntheticLambda3 whenDone2;
        public final ArrayList models = new ArrayList();
        public final ArrayList backgrounds = new ArrayList();
        public final ArrayList symbols = new ArrayList();
        public float realTime = 0.0f;
        public boolean rolling = false;
        public boolean sentDone = false;
        public boolean sentDone2 = false;

        public abstract class Attr {
            public String name;
            public int rarity_permille;

            public void detach() {
            }

            public boolean isLoaded() {
                return true;
            }
        }

        public final class AttrRoller {
            public final ArrayList attributes;
            public Attr current;
            public int currentT;
            public final AnimatedFloat fast;
            public final Attr finish;
            public final Runnable invalidate;
            public int lastNextIndex = -1;
            public Attr next;
            public Attr prev;
            public int slowing;
            public final float speedMult;
            public final Attr start;
            public float time;
            public final int totalSlowing;

            public AttrRoller(Runnable runnable, ArrayList arrayList, Attr attr, Attr attr2, float f, int i) {
                this.time = 0.0f;
                this.invalidate = runnable;
                this.attributes = arrayList;
                this.start = attr;
                this.finish = attr2;
                this.speedMult = f;
                this.totalSlowing = i;
                AnimatedFloat animatedFloat = new AnimatedFloat(runnable, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.fast = animatedFloat;
                animatedFloat.force(true);
                this.time = -0.5f;
                this.currentT = 1;
                this.slowing = i;
                this.prev = attr;
                this.current = next(false);
                this.next = next(false);
            }

            public final void detach() {
                this.start.detach();
                this.finish.detach();
            }

            public final boolean isAlmostFinished(float f) {
                return this.current == this.finish && this.time + f >= ((float) this.currentT) + 0.5f;
            }

            public final boolean isFinished() {
                return this.current == this.finish && this.time >= ((float) this.currentT) + 0.5f;
            }

            public final Attr next(boolean z) {
                ArrayList arrayList;
                if (z) {
                    Attr attr = this.finish;
                    if (attr.isLoaded()) {
                        int i = this.slowing;
                        if (i <= 0) {
                            return attr;
                        }
                        this.slowing = i - 1;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (true) {
                    arrayList = this.attributes;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (i2 != this.lastNextIndex && ((Attr) arrayList.get(i2)).isLoaded()) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
                if (arrayList2.isEmpty()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (((Attr) arrayList.get(i3)).isLoaded()) {
                            arrayList2.add(Integer.valueOf(i3));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        return this.start;
                    }
                }
                int iIntValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
                this.lastNextIndex = iIntValue;
                return (Attr) arrayList.get(iIntValue);
            }

            public final void skip() {
                this.prev = this.current;
                this.current = this.finish;
                this.next = null;
                int i = this.currentT + 1;
                this.currentT = i;
                this.time = i + 0.5f;
            }

            public final float step(float f, boolean z) {
                long j;
                Attr attr;
                int i = this.slowing;
                int i2 = this.totalSlowing;
                if (i >= i2) {
                    j = 450;
                } else {
                    j = i2 == 3 ? 4500 : 2500;
                }
                AnimatedFloat animatedFloat = this.fast;
                animatedFloat.transitionDuration = j;
                float fLerp = (f * AndroidUtilities.lerp(i2 == 3 ? 0.75f : 2.0f, 7.5f, animatedFloat.set(i >= i2)) * this.speedMult) + this.time;
                this.time = fLerp;
                Attr attr2 = this.finish;
                if (fLerp >= 0.0f) {
                    double d = fLerp;
                    if (Math.floor(d) + 1.0d > this.currentT && (attr = this.current) != attr2) {
                        this.prev = attr;
                        Attr attr3 = this.next;
                        this.current = attr3;
                        this.next = attr3 == attr2 ? null : next(z);
                        this.currentT = ((int) Math.floor(d)) + 1;
                    }
                }
                return this.current == attr2 ? Math.min(fLerp, this.currentT + 0.5f) : fLerp;
            }
        }

        public final class Background extends Attr {
            public final int backgroundColor;
            public final RadialGradient backgroundGradient;
            public final Matrix backgroundMatrix;
            public final Paint backgroundPaint;
            public final int patternColor;
            public final int textColor;

            public Background(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
                this.name = stargiftattributebackdrop.name;
                this.rarity_permille = stargiftattributebackdrop.getRarityPermille();
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.backgroundMatrix = new Matrix();
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.backgroundGradient = radialGradient;
                paint.setShader(radialGradient);
                this.textColor = stargiftattributebackdrop.text_color | (-16777216);
                int i = stargiftattributebackdrop.pattern_color | (-16777216);
                this.patternColor = i;
                this.backgroundColor = ColorUtils.blendARGB(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i);
            }
        }

        public final class Symbol extends Attr {
            public final TL_stars.starGiftAttributePattern attr;

            public Symbol(TL_stars.starGiftAttributePattern stargiftattributepattern) {
                this.name = stargiftattributepattern.name;
                this.rarity_permille = stargiftattributepattern.getRarityPermille();
                this.attr = stargiftattributepattern;
            }
        }

        public Roller(TopView topView) {
            this.topView = topView;
            topView.imagesRollView.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 17));
        }

        public final void detach() {
            int i = 0;
            this.rolling = false;
            this.topView.imagesRollView.resetDrawing();
            AttrRoller attrRoller = this.modelRoller;
            if (attrRoller != null) {
                attrRoller.detach();
            }
            AttrRoller attrRoller2 = this.symbolRoller;
            if (attrRoller2 != null) {
                attrRoller2.detach();
            }
            AttrRoller attrRoller3 = this.backdropRoller;
            if (attrRoller3 != null) {
                attrRoller3.detach();
            }
            AttrRoller attrRoller4 = this.backdropRoller2;
            if (attrRoller4 != null) {
                attrRoller4.detach();
            }
            if (this.rolling) {
                return;
            }
            ArrayList arrayList = this.models;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Sticker) obj).detach();
            }
            arrayList.clear();
            this.backgrounds.clear();
            this.symbols.clear();
        }

        public final void invalidate() {
            if (this.rolling && !this.posted) {
                this.posted = true;
                AndroidUtilities.runOnUIThread(new StarGiftSheet$Roller$$ExternalSyntheticLambda0(this, 1));
            }
        }

        public final class Sticker extends Attr {
            public final ImageReceiver imageReceiver;
            public final boolean mine;

            public Sticker(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
                this.name = stargiftattributemodel.name;
                this.rarity_permille = stargiftattributemodel.getRarityPermille();
                this.mine = true;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                this.imageReceiver = imageReceiver;
                StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, 160);
            }

            @Override
            public final void detach() {
                if (this.mine) {
                    this.imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            public final boolean isLoaded() {
                return this.imageReceiver.getLottieAnimation() != null;
            }

            public Sticker(BackupImageView backupImageView, TL_stars.starGiftAttributeModel stargiftattributemodel) {
                this.name = stargiftattributemodel.name;
                this.rarity_permille = stargiftattributemodel.getRarityPermille();
                this.mine = false;
                this.imageReceiver = backupImageView.getImageReceiver();
            }
        }
    }

    public static String getGiftName(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb);
        }
        if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        }
        return LocaleController.getString(R.string.Gift2Gift);
    }

    public final void addAttributeRow(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c;
        Roller roller;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        StarGiftSheet starGiftSheet;
        ProfileActivity$$ExternalSyntheticLambda149 profileActivity$$ExternalSyntheticLambda149;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c = 0;
        }
        if (!this.rolling && ((roller = this.roller) == null || !roller.rolling)) {
            boolean[] zArr = new boolean[1];
            ButtonSpan.TextViewButtons[] textViewButtonsArr = new ButtonSpan.TextViewButtons[1];
            Integer[] numArr = new Integer[1];
            String rarityName = getRarityName(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                profileActivity$$ExternalSyntheticLambda149 = new ProfileActivity$$ExternalSyntheticLambda149(this, zArr, starGiftAttribute2, textViewButtonsArr, 9);
                starGiftSheet = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                starGiftSheet = this;
                profileActivity$$ExternalSyntheticLambda149 = null;
            }
            textViewButtonsArr[0] = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) starGiftSheet.tableView.addRow(string, starGiftAttribute2.name, rarityName, profileActivity$$ExternalSyntheticLambda149, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        TextViewRoll textViewRoll = new TextViewRoll(getContext(), this.resourcesProvider, new StarGiftSheet$$ExternalSyntheticLambda66(this, 1));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        TableView tableView = this.tableView;
        tableRow.addView(new TableView.TableRowTitle(tableView, string), layoutParams);
        tableRow.addView(new TableView.TableRowContent(tableView, textViewRoll, true), new TableRow.LayoutParams(0, -1, 1.0f));
        tableView.addView(tableRow);
        Roller roller2 = this.roller;
        if (roller2 != null) {
            if (c == 0) {
                roller2.backdropText = textViewRoll;
            }
            if (c == 1) {
                roller2.patternText = textViewRoll;
            }
            if (c == 2) {
                roller2.modelText = textViewRoll;
            }
        }
    }

    public final class GiftTransferTopView extends View {
        public final Paint arrowPaint;
        public final Path arrowPath;
        public final StarGiftDrawableIcon giftDrawable;
        public final ImageReceiver userImageReceiver;

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.patternsType = 3;
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            int iDp = AndroidUtilities.dp(60.0f) + width;
            int iDp2 = AndroidUtilities.dp(60.0f) + height;
            StarGiftDrawableIcon starGiftDrawableIcon = this.giftDrawable;
            starGiftDrawableIcon.setBounds(width, height, iDp, iDp2);
            starGiftDrawableIcon.draw(canvas);
            canvas.save();
            canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            canvas.restore();
            float fDp = AndroidUtilities.dp(60.0f);
            float fDp2 = AndroidUtilities.dp(60.0f);
            ImageReceiver imageReceiver = this.userImageReceiver;
            imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, fDp, fDp2);
            imageReceiver.draw(canvas);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }

        public GiftTransferTopView(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, tL_starGiftUnique, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.patternsType = 3;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            int i = SessionCell.$r8$clinit;
            TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
            tL_authorization.device_model = "fragment";
            tL_authorization.platform = "fragment";
            tL_authorization.app_name = "fragment";
            imageReceiver.setImageBitmap(SessionCell.createDrawable(60, tL_authorization));
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }
    }

    public final class ActionView extends View {
        public final Paint bgDarkerPaint;
        public final Paint bgPaint;
        public BitmapShader blurBitmapShader;
        public Matrix blurInvertMatrix;
        public Matrix blurMatrix;
        public boolean fullRect;
        public StaticLayout layout;
        public final TextPaint paint;
        public final LinkPath path;
        public int px;
        public int py;
        public CharSequence textToSet;

        public ActionView(Context context) {
            super(context);
            this.px = AndroidUtilities.dp(6.0f);
            this.py = AndroidUtilities.dp(2.0f);
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
            Paint paint2 = new Paint(1);
            this.bgDarkerPaint = paint2;
            paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
            this.path = new LinkPath(0);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.layout != null) {
                canvas.save();
                canvas.translate((getWidth() - this.layout.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
                Matrix matrix = this.blurMatrix;
                if (matrix != null) {
                    matrix.reset();
                    this.blurInvertMatrix.reset();
                    View view = this;
                    while (view != null) {
                        this.blurInvertMatrix.postConcat(view.getMatrix());
                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                    }
                    this.blurInvertMatrix.invert(this.blurMatrix);
                    this.blurMatrix.preTranslate((-this.px) / 2, -AndroidUtilities.dp(16.0f));
                    this.blurMatrix.preScale(12.0f, 12.0f);
                    this.blurBitmapShader.setLocalMatrix(this.blurMatrix);
                }
                Paint paint = this.bgPaint;
                LinkPath linkPath = this.path;
                canvas.drawPath(linkPath, paint);
                Paint paint2 = this.bgDarkerPaint;
                paint2.setColor(Theme.multAlpha(0.35f, -16777216));
                canvas.drawPath(linkPath, paint2);
                this.layout.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            CharSequence charSequence = this.textToSet;
            if (charSequence != null) {
                set(size, charSequence);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            StaticLayout staticLayout = this.layout;
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + AndroidUtilities.dp(32.0f), 1073741824));
            setPivotX(getMeasuredWidth() / 2.0f);
            setPivotY(getMeasuredHeight());
        }

        public void set(MessageObject messageObject) {
            TLRPC.Message message;
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.action == null) {
                setVisibility(8);
                return;
            }
            int i = messageObject.currentAccount;
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                setVisibility(8);
                return;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                setVisibility(8);
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
            if (peer == null) {
                setVisibility(8);
                return;
            }
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            long peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.peer);
            if (clientUserId == peerDialogId) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString((tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(messageObject.messageOwner.date))));
            } else if (clientUserId == peerDialogId2) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
            } else {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i, peerDialogId), DialogObject.getShortName(i, peerDialogId2), LocaleController.formatDate(messageObject.messageOwner.date))));
            }
            setVisibility(0);
        }

        public void setFullRect(boolean z) {
            this.fullRect = z;
        }

        public void setRoundRadius(float f) {
            this.bgPaint.setPathEffect(new CornerPathEffect(f));
            this.bgDarkerPaint.setPathEffect(new CornerPathEffect(f));
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }

        public final void set(int i, TL_stars.SavedStarGift savedStarGift) {
            if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                setVisibility(0);
                long clientUserId = UserConfig.getInstance(i).getClientUserId();
                long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
                long peerDialogId2 = DialogObject.getPeerDialogId(savedStarGift.gift.owner_id);
                if (clientUserId == peerDialogId) {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(savedStarGift.gift.crafted ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(savedStarGift.date))));
                    return;
                } else if (clientUserId == peerDialogId2) {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
                    return;
                } else {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i, peerDialogId), DialogObject.getShortName(i, peerDialogId2), LocaleController.formatDate(savedStarGift.date))));
                    return;
                }
            }
            setVisibility(8);
        }

        public void set(CharSequence charSequence) {
            set(getMeasuredWidth(), charSequence);
        }

        public final void set(int i, CharSequence charSequence) {
            if (i <= 0) {
                this.textToSet = charSequence;
                return;
            }
            this.layout = new StaticLayout(charSequence, this.paint, i - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            LinkPath linkPath = this.path;
            linkPath.rewind();
            int i2 = this.px;
            int i3 = this.py;
            linkPath.paddingX = i2;
            linkPath.paddingY = i3;
            if (this.fullRect) {
                linkPath.setCurrentLayout(null, 0, 0.0f, 0.0f);
                float fMax = Float.MAX_VALUE;
                float width = this.layout.getWidth();
                float fMin = Float.MIN_VALUE;
                float fMax2 = 0.0f;
                for (int i4 = 0; i4 < this.layout.getLineCount(); i4++) {
                    width = Math.min(width, this.layout.getLineLeft(i4));
                    fMin = Math.min(fMin, this.layout.getLineTop(i4));
                    fMax2 = Math.max(fMax2, this.layout.getLineRight(i4));
                    fMax = Math.max(fMax, this.layout.getLineBottom(i4));
                }
                this.path.addRect(width, fMin, fMax2, this.layout.getHeight(), Path.Direction.CW);
            } else {
                linkPath.setCurrentLayout(this.layout, 0, 0.0f, 0.0f);
                StaticLayout staticLayout = this.layout;
                staticLayout.getSelectionPath(0, staticLayout.getText().length(), linkPath);
                linkPath.closeRects();
            }
            invalidate();
        }
    }

    public final void set(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j;
        long j2;
        CharSequence charSequence;
        CharSequence charSequenceReplaceTags;
        Spannable spannableReplaceAnimatedEmoji;
        TableView tableView;
        long j3;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        Roller roller;
        ButtonWithCounterView buttonWithCounterView;
        boolean z2;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        Roller roller2;
        boolean z3;
        StarGiftSheet$$ExternalSyntheticLambda3 starGiftSheet$$ExternalSyntheticLambda3;
        StarGiftSheet$$ExternalSyntheticLambda3 starGiftSheet$$ExternalSyntheticLambda4;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        Roller.AttrRoller attrRoller;
        Roller.Sticker sticker;
        StickersRollView stickersRollView;
        int i;
        Roller.AttrRoller attrRoller2;
        int i2;
        Roller.AttrRoller attrRoller3;
        int i3;
        Roller.AttrRoller attrRoller4;
        int i4;
        boolean z4;
        int i5;
        SpannableString spannableString;
        SpannableString spannableString2;
        Spannable spannableReplaceAnimatedEmoji2;
        String strReplaceAll;
        CharSequence spannable;
        TL_stars.SavedStarGift savedStarGift;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        MessageObject messageObject2;
        TextPaint textPaint;
        Roller roller3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique3;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.title = BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb);
        boolean z5 = this.rolling;
        TopView topView = this.topView;
        if (!z5 && (roller3 = this.roller) != null && roller3.rolling && (tL_starGiftUnique3 = roller3.rollingGift) != null) {
            j = peerDialogId;
            if (tL_starGiftUnique3.id != tL_starGiftUnique.id) {
                roller3.detach();
                this.roller = null;
                topView.imageLayout.setAlpha(1.0f);
                topView.imagesRollView.setAlpha(0.0f);
            }
            j2 = j;
            boolean zIsMineWithActions = isMineWithActions(this.currentAccount, j2);
            boolean zIsMineWithActions2 = isMineWithActions(this.currentAccount, peerDialogId2);
            boolean zIsWorn = isWorn(this.currentAccount, getUniqueGift());
            getLink$1();
            topView.setGift(tL_starGiftUnique, zIsMineWithActions, zIsMineWithActions2, zIsWorn);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new EllipsizeSpanAnimator$TextAlphaSpan(190, 0), length, spannableStringBuilder.length(), 33);
            if (tLObject != null) {
                if (tL_starGiftUnique.released_by == null || stargiftattributemodel == null) {
                    charSequence = null;
                } else {
                    charSequenceReplaceTags = stargiftattributemodel.name;
                }
                if (tL_textWithEntities != null || (textPaint = topView.messageTextPaint) == null) {
                    spannableReplaceAnimatedEmoji = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                    spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                }
                topView.setText(0, spannableStringBuilder, charSequence, releasedByText(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
                this.ownerTextView = null;
                tableView = this.tableView;
                tableView.removeAllViews();
                if (!z) {
                    if (tL_starGiftUnique.host_id != null) {
                        if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                            tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 19));
                        }
                        if (peerDialogId2 != 0) {
                            this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                        }
                    } else if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                        tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 22));
                    } else if (j2 != 0 && tL_starGiftUnique.owner_name != null) {
                        tableView.addRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                    } else if (j2 != 0) {
                        this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
                    }
                }
                addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (z) {
                    j3 = 0;
                } else {
                    if (this.messageObject != null) {
                        if (!this.messageObjectRepolled) {
                            TextView textView = (TextView) ((TableView.TableRowContent) tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(1)).getChildAt(0);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                            LoadingSpan loadingSpan = new LoadingSpan(AndroidUtilities.dp(90.0f), 0, textView, this.resourcesProvider);
                            int i6 = Theme.key_windowBackgroundWhiteBlackText;
                            j3 = 0;
                            loadingSpan.setColors(Theme.multAlpha(0.21f, Theme.getColor(i6, this.resourcesProvider)), Theme.multAlpha(0.08f, Theme.getColor(i6, this.resourcesProvider)));
                            spannableStringBuilder3.setSpan(loadingSpan, 0, 1, 33);
                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                            if (!this.messageObjectRepolling && !this.messageObjectRepolled && (messageObject2 = this.messageObject) != null) {
                                this.messageObjectRepolling = true;
                                int id = messageObject2.getId();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(id));
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new LaunchActivity$$ExternalSyntheticLambda63(this, id, 4));
                            }
                        } else {
                            j3 = 0;
                            tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                        }
                    } else {
                        j3 = 0;
                        tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                    }
                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                        this.tableView.addRow(LocaleController.getString(R.string.GiftValue2), zzil.m("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new PollItemMenu$$ExternalSyntheticLambda8(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 24), null);
                    }
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails == null) {
                    if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                        final long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                        spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                        i5 = 0;
                        spannableString.setSpan(new ClickableSpan() {
                            @Override
                            public final void onClick(View view) {
                                StarGiftSheet.this.openProfile(peerDialogId3);
                            }

                            @Override
                            public final void updateDrawState(TextPaint textPaint2) {
                                textPaint2.setColor(textPaint2.linkColor);
                            }
                        }, 0, spannableString.length(), 33);
                    } else {
                        i5 = 0;
                        spannableString = null;
                    }
                    final long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                    spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                    spannableString2.setSpan(new ClickableSpan() {
                        @Override
                        public final void onClick(View view) {
                            StarGiftSheet.this.openProfile(peerDialogId4);
                        }

                        @Override
                        public final void updateDrawState(TextPaint textPaint2) {
                            textPaint2.setColor(textPaint2.linkColor);
                        }
                    }, i5, spannableString2.length(), 33);
                    if (stargiftattributeoriginaldetails.message != null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                        MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                        spannableReplaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint2.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt());
                    } else {
                        spannableReplaceAnimatedEmoji2 = null;
                    }
                    strReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
                    if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                        if (spannableReplaceAnimatedEmoji2 == null) {
                            spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString, strReplaceAll);
                        } else {
                            spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString, strReplaceAll, spannableReplaceAnimatedEmoji2);
                        }
                    } else if (spannableString != null) {
                        if (spannableReplaceAnimatedEmoji2 == null) {
                            spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString, spannableString2, strReplaceAll);
                        } else {
                            spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                        }
                    } else if (spannableReplaceAnimatedEmoji2 == null) {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString2, strReplaceAll);
                    } else {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                    }
                    if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                        savedStarGift = this.savedStarGift;
                        if (savedStarGift != null || savedStarGift.drop_original_details_stars < j3) {
                            messageObject = this.messageObject;
                            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                                messageAction = message.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) || ((TLRPC.TL_messageActionStarGiftUnique) messageAction).drop_original_details_stars < j3) {
                                }
                            }
                            TableView.TableRowFullContent tableRowFullContentAddFullRow = tableView.addFullRow(spannable);
                            tableRowFullContentAddFullRow.setFilled(true);
                            SpoilersTextView spoilersTextView = (SpoilersTextView) tableRowFullContentAddFullRow.getChildAt(0);
                            spoilersTextView.setTextSize(1, 12.0f);
                            spoilersTextView.setGravity(17);
                        }
                        LinearLayout linearLayout = new LinearLayout(getContext());
                        linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        linearLayout.setOrientation(0);
                        SpoilersTextView spoilersTextView2 = new SpoilersTextView(getContext(), null, true);
                        spoilersTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                        spoilersTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
                        spoilersTextView2.setTextSize(1, 12.0f);
                        spoilersTextView2.setGravity(3);
                        spoilersTextView2.setText(spannable);
                        linearLayout.addView(spoilersTextView2, LayoutHelper.createLinear(-1, -2, 1.0f, 19));
                        ImageView imageView = new ImageView(getContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i7 = Theme.key_featuredStickers_addButton;
                        imageView.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i7, this.resourcesProvider)), 6, 6));
                        imageView.setImageResource(R.drawable.menu_delete_old);
                        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i7, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
                        imageView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(18, this, spannable));
                        linearLayout.addView(imageView, LayoutHelper.createLinear(32, 32, 0.0f, 21, 8, 0, 0, 0));
                        TableRow tableRow = new TableRow(getContext());
                        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                        layoutParams.span = 2;
                        tableRow.addView(new TableView.TableRowFullContent(tableView, linearLayout, true), layoutParams);
                        tableView.addView(tableRow);
                    } else {
                        TableView.TableRowFullContent tableRowFullContentAddFullRow2 = tableView.addFullRow(spannable);
                        tableRowFullContentAddFullRow2.setFilled(true);
                        SpoilersTextView spoilersTextView3 = (SpoilersTextView) tableRowFullContentAddFullRow2.getChildAt(0);
                        spoilersTextView3.setTextSize(1, 12.0f);
                        spoilersTextView3.setGravity(17);
                    }
                }
                roller = this.roller;
                buttonWithCounterView = this.button;
                if (roller != null || !roller.rolling) {
                    if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                        buttonWithCounterView.setFilled(true);
                        setButtonTextResale(tL_starGiftUnique);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 23));
                    } else if (!this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition$1() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition$1()) >= 0) {
                        buttonWithCounterView.setFilled(false);
                        int iFindGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition$1());
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.giftsList.get(iFindGiftToUpgrade);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift.getDocument()) == null) {
                            z2 = true;
                        } else {
                            spannableStringBuilder5.append((CharSequence) " e");
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, buttonWithCounterView.getTextPaint().getFontMetricsInt());
                            animatedEmojiSpan.document = document;
                            z2 = true;
                            spannableStringBuilder5.setSpan(animatedEmojiSpan, spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                        }
                        buttonWithCounterView.setText(spannableStringBuilder5, this.firstSet ^ z2, z2);
                        buttonWithCounterView.setSubText(null, this.firstSet ^ z2);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda16(this, iFindGiftToUpgrade, 3));
                    } else {
                        buttonWithCounterView.setFilled(true);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                        buttonWithCounterView.setSubText(null, !this.firstSet);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                    }
                }
                this.actionBar.setTitle(this.title);
                roller2 = this.roller;
                if (roller2 != null) {
                    z3 = this.rolling;
                    starGiftSheet$$ExternalSyntheticLambda3 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 23);
                    starGiftSheet$$ExternalSyntheticLambda4 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 20);
                    tL_starGiftUnique2 = roller2.rollingGift;
                    if (tL_starGiftUnique2 == null && tL_starGiftUnique2.id == tL_starGiftUnique.id) {
                        z4 = roller2.rolling;
                    } else if (z3) {
                        TopView topView2 = roller2.topView;
                        BackupImageView upgradeImageView = topView2.getUpgradeImageView();
                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = topView2.getUpgradeImageViewAttribute();
                        TL_stars.starGiftAttributePattern upgradePatternAttribute = topView2.getUpgradePatternAttribute();
                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = topView2.getUpgradeBackdropAttribute();
                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        roller2.rolling = true;
                        roller2.rollingGift = tL_starGiftUnique;
                        roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                        roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                        roller2.durationT = (float) Math.random();
                        roller2.lastFrameTime = System.currentTimeMillis();
                        roller2.realTime = 0.0f;
                        roller2.sentDone = false;
                        roller2.sentDone2 = false;
                        roller2.rolling = true;
                        attrRoller = roller2.modelRoller;
                        if (attrRoller != null) {
                            attrRoller.detach();
                        }
                        stickersRollView = topView2.imagesRollView;
                        sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel2);
                        if (stickersRollView.isAttachedToWindow() && sticker.mine) {
                            sticker.imageReceiver.onAttachedToWindow();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda0 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList = roller2.models;
                        Roller.Sticker sticker2 = new Roller.Sticker(upgradeImageView, upgradeImageViewAttribute);
                        if (roller2.durationT > 0.5f) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda0, arrayList, sticker2, sticker, 0.9f, i);
                        attrRoller2 = roller2.symbolRoller;
                        if (attrRoller2 != null) {
                            attrRoller2.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda1 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList2 = roller2.symbols;
                        Roller.Symbol symbol = new Roller.Symbol(upgradePatternAttribute);
                        Roller.Symbol symbol2 = new Roller.Symbol(stargiftattributepattern);
                        if (roller2.durationT > 0.5f) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda1, arrayList2, symbol, symbol2, 1.0f, i2);
                        attrRoller3 = roller2.backdropRoller;
                        if (attrRoller3 != null) {
                            attrRoller3.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda2 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList3 = roller2.backgrounds;
                        Roller.Background background = new Roller.Background(upgradeBackdropAttribute);
                        Roller.Background background2 = new Roller.Background(stargiftattributebackdrop);
                        if (roller2.durationT > 0.5f) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                        roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda2, arrayList3, background, background2, 0.5f, i3);
                        attrRoller4 = roller2.backdropRoller2;
                        if (attrRoller4 != null) {
                            attrRoller4.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda3 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        Roller.Background background3 = new Roller.Background(upgradeBackdropAttribute);
                        Roller.Background background4 = new Roller.Background(stargiftattributebackdrop);
                        if (roller2.durationT > 0.5f) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                        roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda3, arrayList3, background3, background4, 1.25f, i4);
                        roller2.invalidate();
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        topView.imageLayout.setAlpha(0.0f);
                        topView.imagesRollView.setAlpha(1.0f);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                        buttonWithCounterView.setFilled(true);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 22));
                        int length2 = ((StarGiftSheet) this.adapter.this$0).heights.length - 1;
                        RecyclerListView recyclerListView = this.recyclerListView;
                        recyclerListView.scrollToPosition(length2);
                        recyclerListView.post(new StarGiftSheet$$ExternalSyntheticLambda3(this, 21));
                    }
                }
            }
            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
            charSequence = charSequenceReplaceTags;
            if (tL_textWithEntities != null) {
                spannableReplaceAnimatedEmoji = null;
            } else {
                spannableReplaceAnimatedEmoji = null;
            }
            topView.setText(0, spannableStringBuilder, charSequence, releasedByText(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
            this.ownerTextView = null;
            tableView = this.tableView;
            tableView.removeAllViews();
            if (!z) {
                if (tL_starGiftUnique.host_id != null) {
                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                        tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 19));
                    }
                    if (peerDialogId2 != 0) {
                        this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                    }
                } else if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 22));
                } else if (j2 != 0) {
                    if (j2 != 0) {
                        this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
                    }
                } else if (j2 != 0) {
                    this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
                }
            }
            addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (z) {
                if (this.messageObject != null) {
                    if (!this.messageObjectRepolled) {
                        TextView textView2 = (TextView) ((TableView.TableRowContent) tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(1)).getChildAt(0);
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder("x ");
                        LoadingSpan loadingSpan2 = new LoadingSpan(AndroidUtilities.dp(90.0f), 0, textView2, this.resourcesProvider);
                        int i8 = Theme.key_windowBackgroundWhiteBlackText;
                        j3 = 0;
                        loadingSpan2.setColors(Theme.multAlpha(0.21f, Theme.getColor(i8, this.resourcesProvider)), Theme.multAlpha(0.08f, Theme.getColor(i8, this.resourcesProvider)));
                        spannableStringBuilder6.setSpan(loadingSpan2, 0, 1, 33);
                        textView2.setText(spannableStringBuilder6, TextView.BufferType.SPANNABLE);
                        if (!this.messageObjectRepolling) {
                            this.messageObjectRepolling = true;
                            int id2 = messageObject2.getId();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.id.add(Integer.valueOf(id2));
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages2, new LaunchActivity$$ExternalSyntheticLambda63(this, id2, 4));
                        }
                    } else {
                        j3 = 0;
                        tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                    }
                } else {
                    j3 = 0;
                    tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                }
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    this.tableView.addRow(LocaleController.getString(R.string.GiftValue2), zzil.m("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new PollItemMenu$$ExternalSyntheticLambda8(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 24), null);
                }
            } else {
                j3 = 0;
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails == null) {
                if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                    final long peerDialogId5 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                    spannableString = new SpannableString(DialogObject.getName(peerDialogId5));
                    i5 = 0;
                    spannableString.setSpan(new ClickableSpan() {
                        @Override
                        public final void onClick(View view) {
                            StarGiftSheet.this.openProfile(peerDialogId5);
                        }

                        @Override
                        public final void updateDrawState(TextPaint textPaint3) {
                            textPaint3.setColor(textPaint3.linkColor);
                        }
                    }, 0, spannableString.length(), 33);
                } else {
                    i5 = 0;
                    spannableString = null;
                }
                final long peerDialogId6 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                spannableString2 = new SpannableString(DialogObject.getName(peerDialogId6));
                spannableString2.setSpan(new ClickableSpan() {
                    @Override
                    public final void onClick(View view) {
                        StarGiftSheet.this.openProfile(peerDialogId6);
                    }

                    @Override
                    public final void updateDrawState(TextPaint textPaint3) {
                        textPaint3.setColor(textPaint3.linkColor);
                    }
                }, i5, spannableString2.length(), 33);
                if (stargiftattributeoriginaldetails.message != null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder7, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                    spannableReplaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder7, textPaint3.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                } else {
                    spannableReplaceAnimatedEmoji2 = null;
                }
                strReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
                if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                    if (spannableReplaceAnimatedEmoji2 == null) {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString, strReplaceAll);
                    } else {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString, strReplaceAll, spannableReplaceAnimatedEmoji2);
                    }
                } else if (spannableString != null) {
                    if (spannableReplaceAnimatedEmoji2 == null) {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString, spannableString2, strReplaceAll);
                    } else {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                    }
                } else if (spannableReplaceAnimatedEmoji2 == null) {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString2, strReplaceAll);
                } else {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                }
                if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    TableView.TableRowFullContent tableRowFullContentAddFullRow3 = tableView.addFullRow(spannable);
                    tableRowFullContentAddFullRow3.setFilled(true);
                    SpoilersTextView spoilersTextView4 = (SpoilersTextView) tableRowFullContentAddFullRow3.getChildAt(0);
                    spoilersTextView4.setTextSize(1, 12.0f);
                    spoilersTextView4.setGravity(17);
                } else {
                    savedStarGift = this.savedStarGift;
                    if (savedStarGift != null) {
                        messageObject = this.messageObject;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        TableView.TableRowFullContent tableRowFullContentAddFullRow4 = tableView.addFullRow(spannable);
                        tableRowFullContentAddFullRow4.setFilled(true);
                        SpoilersTextView spoilersTextView5 = (SpoilersTextView) tableRowFullContentAddFullRow4.getChildAt(0);
                        spoilersTextView5.setTextSize(1, 12.0f);
                        spoilersTextView5.setGravity(17);
                    } else {
                        messageObject = this.messageObject;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        TableView.TableRowFullContent tableRowFullContentAddFullRow5 = tableView.addFullRow(spannable);
                        tableRowFullContentAddFullRow5.setFilled(true);
                        SpoilersTextView spoilersTextView6 = (SpoilersTextView) tableRowFullContentAddFullRow5.getChildAt(0);
                        spoilersTextView6.setTextSize(1, 12.0f);
                        spoilersTextView6.setGravity(17);
                    }
                }
            }
            roller = this.roller;
            buttonWithCounterView = this.button;
            if (roller != null) {
                if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (!this.upgradedOnce) {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                } else {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                }
            } else {
                if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (!this.upgradedOnce) {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                } else {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                }
            }
            this.actionBar.setTitle(this.title);
            roller2 = this.roller;
            if (roller2 != null) {
                z3 = this.rolling;
                starGiftSheet$$ExternalSyntheticLambda3 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 23);
                starGiftSheet$$ExternalSyntheticLambda4 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 20);
                tL_starGiftUnique2 = roller2.rollingGift;
                if (tL_starGiftUnique2 == null) {
                    if (z3) {
                        z4 = false;
                    } else {
                        TopView topView3 = roller2.topView;
                        BackupImageView upgradeImageView2 = topView3.getUpgradeImageView();
                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute2 = topView3.getUpgradeImageViewAttribute();
                        TL_stars.starGiftAttributePattern upgradePatternAttribute2 = topView3.getUpgradePatternAttribute();
                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute2 = topView3.getUpgradeBackdropAttribute();
                        TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                        TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        roller2.rolling = true;
                        roller2.rollingGift = tL_starGiftUnique;
                        roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                        roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                        roller2.durationT = (float) Math.random();
                        roller2.lastFrameTime = System.currentTimeMillis();
                        roller2.realTime = 0.0f;
                        roller2.sentDone = false;
                        roller2.sentDone2 = false;
                        roller2.rolling = true;
                        attrRoller = roller2.modelRoller;
                        if (attrRoller != null) {
                            attrRoller.detach();
                        }
                        stickersRollView = topView3.imagesRollView;
                        sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel3);
                        if (stickersRollView.isAttachedToWindow()) {
                            sticker.imageReceiver.onAttachedToWindow();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda4 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList4 = roller2.models;
                        Roller.Sticker sticker3 = new Roller.Sticker(upgradeImageView2, upgradeImageViewAttribute2);
                        if (roller2.durationT > 0.5f) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda4, arrayList4, sticker3, sticker, 0.9f, i);
                        attrRoller2 = roller2.symbolRoller;
                        if (attrRoller2 != null) {
                            attrRoller2.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda5 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList5 = roller2.symbols;
                        Roller.Symbol symbol3 = new Roller.Symbol(upgradePatternAttribute2);
                        Roller.Symbol symbol4 = new Roller.Symbol(stargiftattributepattern2);
                        if (roller2.durationT > 0.5f) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda5, arrayList5, symbol3, symbol4, 1.0f, i2);
                        attrRoller3 = roller2.backdropRoller;
                        if (attrRoller3 != null) {
                            attrRoller3.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda6 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList6 = roller2.backgrounds;
                        Roller.Background background5 = new Roller.Background(upgradeBackdropAttribute2);
                        Roller.Background background6 = new Roller.Background(stargiftattributebackdrop2);
                        if (roller2.durationT > 0.5f) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                        roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda6, arrayList6, background5, background6, 0.5f, i3);
                        attrRoller4 = roller2.backdropRoller2;
                        if (attrRoller4 != null) {
                            attrRoller4.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda7 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        Roller.Background background7 = new Roller.Background(upgradeBackdropAttribute2);
                        Roller.Background background8 = new Roller.Background(stargiftattributebackdrop2);
                        if (roller2.durationT > 0.5f) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                        roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda7, arrayList6, background7, background8, 1.25f, i4);
                        roller2.invalidate();
                        z4 = true;
                    }
                } else if (z3) {
                    z4 = false;
                } else {
                    TopView topView4 = roller2.topView;
                    BackupImageView upgradeImageView3 = topView4.getUpgradeImageView();
                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute3 = topView4.getUpgradeImageViewAttribute();
                    TL_stars.starGiftAttributePattern upgradePatternAttribute3 = topView4.getUpgradePatternAttribute();
                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute3 = topView4.getUpgradeBackdropAttribute();
                    TL_stars.starGiftAttributeModel stargiftattributemodel4 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                    TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    roller2.rolling = true;
                    roller2.rollingGift = tL_starGiftUnique;
                    roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                    roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                    roller2.durationT = (float) Math.random();
                    roller2.lastFrameTime = System.currentTimeMillis();
                    roller2.realTime = 0.0f;
                    roller2.sentDone = false;
                    roller2.sentDone2 = false;
                    roller2.rolling = true;
                    attrRoller = roller2.modelRoller;
                    if (attrRoller != null) {
                        attrRoller.detach();
                    }
                    stickersRollView = topView4.imagesRollView;
                    sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel4);
                    if (stickersRollView.isAttachedToWindow()) {
                        sticker.imageReceiver.onAttachedToWindow();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda8 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList7 = roller2.models;
                    Roller.Sticker sticker4 = new Roller.Sticker(upgradeImageView3, upgradeImageViewAttribute3);
                    if (roller2.durationT > 0.5f) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda8, arrayList7, sticker4, sticker, 0.9f, i);
                    attrRoller2 = roller2.symbolRoller;
                    if (attrRoller2 != null) {
                        attrRoller2.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda9 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList8 = roller2.symbols;
                    Roller.Symbol symbol5 = new Roller.Symbol(upgradePatternAttribute3);
                    Roller.Symbol symbol6 = new Roller.Symbol(stargiftattributepattern3);
                    if (roller2.durationT > 0.5f) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda9, arrayList8, symbol5, symbol6, 1.0f, i2);
                    attrRoller3 = roller2.backdropRoller;
                    if (attrRoller3 != null) {
                        attrRoller3.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda10 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList9 = roller2.backgrounds;
                    Roller.Background background9 = new Roller.Background(upgradeBackdropAttribute3);
                    Roller.Background background10 = new Roller.Background(stargiftattributebackdrop3);
                    if (roller2.durationT > 0.5f) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda10, arrayList9, background9, background10, 0.5f, i3);
                    attrRoller4 = roller2.backdropRoller2;
                    if (attrRoller4 != null) {
                        attrRoller4.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda11 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    Roller.Background background11 = new Roller.Background(upgradeBackdropAttribute3);
                    Roller.Background background12 = new Roller.Background(stargiftattributebackdrop3);
                    if (roller2.durationT > 0.5f) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda11, arrayList9, background11, background12, 1.25f, i4);
                    roller2.invalidate();
                    z4 = true;
                }
                if (z4) {
                    topView.imageLayout.setAlpha(0.0f);
                    topView.imagesRollView.setAlpha(1.0f);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 22));
                    int length3 = ((StarGiftSheet) this.adapter.this$0).heights.length - 1;
                    RecyclerListView recyclerListView2 = this.recyclerListView;
                    recyclerListView2.scrollToPosition(length3);
                    recyclerListView2.post(new StarGiftSheet$$ExternalSyntheticLambda3(this, 21));
                }
            }
        }
        j = peerDialogId;
        if (z5 && this.roller == null) {
            this.roller = new Roller(topView);
        }
        j2 = j;
        boolean zIsMineWithActions3 = isMineWithActions(this.currentAccount, j2);
        boolean zIsMineWithActions4 = isMineWithActions(this.currentAccount, peerDialogId2);
        boolean zIsWorn2 = isWorn(this.currentAccount, getUniqueGift());
        getLink$1();
        topView.setGift(tL_starGiftUnique, zIsMineWithActions3, zIsMineWithActions4, zIsWorn2);
        TL_stars.starGiftAttributeModel stargiftattributemodel5 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
        spannableStringBuilder8.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder8.append((CharSequence) " ");
        int length4 = spannableStringBuilder8.length();
        spannableStringBuilder8.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder8.setSpan(new RelativeSizeSpan(0.85f), length4, spannableStringBuilder8.length(), 33);
        spannableStringBuilder8.setSpan(new EllipsizeSpanAnimator$TextAlphaSpan(190, 0), length4, spannableStringBuilder8.length(), 33);
        if (tLObject != null) {
            if (tL_starGiftUnique.released_by == null) {
            }
            charSequence = null;
            if (tL_textWithEntities != null) {
                spannableReplaceAnimatedEmoji = null;
            } else {
                spannableReplaceAnimatedEmoji = null;
            }
            topView.setText(0, spannableStringBuilder8, charSequence, releasedByText(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
            this.ownerTextView = null;
            tableView = this.tableView;
            tableView.removeAllViews();
            if (!z) {
                if (tL_starGiftUnique.host_id != null) {
                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                        tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 19));
                    }
                    if (peerDialogId2 != 0) {
                        this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                    }
                } else if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 22));
                } else if (j2 != 0) {
                    if (j2 != 0) {
                        this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
                    }
                } else if (j2 != 0) {
                    this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
                }
            }
            addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (z) {
                if (this.messageObject != null) {
                    if (!this.messageObjectRepolled) {
                        TextView textView3 = (TextView) ((TableView.TableRowContent) tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(1)).getChildAt(0);
                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("x ");
                        LoadingSpan loadingSpan3 = new LoadingSpan(AndroidUtilities.dp(90.0f), 0, textView3, this.resourcesProvider);
                        int i9 = Theme.key_windowBackgroundWhiteBlackText;
                        j3 = 0;
                        loadingSpan3.setColors(Theme.multAlpha(0.21f, Theme.getColor(i9, this.resourcesProvider)), Theme.multAlpha(0.08f, Theme.getColor(i9, this.resourcesProvider)));
                        spannableStringBuilder9.setSpan(loadingSpan3, 0, 1, 33);
                        textView3.setText(spannableStringBuilder9, TextView.BufferType.SPANNABLE);
                        if (!this.messageObjectRepolling) {
                            this.messageObjectRepolling = true;
                            int id3 = messageObject2.getId();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages3 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages3.id.add(Integer.valueOf(id3));
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages3, new LaunchActivity$$ExternalSyntheticLambda63(this, id3, 4));
                        }
                    } else {
                        j3 = 0;
                        tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                    }
                } else {
                    j3 = 0;
                    tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                }
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    this.tableView.addRow(LocaleController.getString(R.string.GiftValue2), zzil.m("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new PollItemMenu$$ExternalSyntheticLambda8(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 24), null);
                }
            } else {
                j3 = 0;
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails == null) {
                if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                    final long peerDialogId7 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                    spannableString = new SpannableString(DialogObject.getName(peerDialogId7));
                    i5 = 0;
                    spannableString.setSpan(new ClickableSpan() {
                        @Override
                        public final void onClick(View view) {
                            StarGiftSheet.this.openProfile(peerDialogId7);
                        }

                        @Override
                        public final void updateDrawState(TextPaint textPaint4) {
                            textPaint4.setColor(textPaint4.linkColor);
                        }
                    }, 0, spannableString.length(), 33);
                } else {
                    i5 = 0;
                    spannableString = null;
                }
                final long peerDialogId8 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                spannableString2 = new SpannableString(DialogObject.getName(peerDialogId8));
                spannableString2.setSpan(new ClickableSpan() {
                    @Override
                    public final void onClick(View view) {
                        StarGiftSheet.this.openProfile(peerDialogId8);
                    }

                    @Override
                    public final void updateDrawState(TextPaint textPaint4) {
                        textPaint4.setColor(textPaint4.linkColor);
                    }
                }, i5, spannableString2.length(), 33);
                if (stargiftattributeoriginaldetails.message != null) {
                    TextPaint textPaint4 = new TextPaint(1);
                    textPaint4.setTextSize(AndroidUtilities.dp(14.0f));
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder10, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                    spannableReplaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder10, textPaint4.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint4.getFontMetricsInt());
                } else {
                    spannableReplaceAnimatedEmoji2 = null;
                }
                strReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
                if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                    if (spannableReplaceAnimatedEmoji2 == null) {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString, strReplaceAll);
                    } else {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString, strReplaceAll, spannableReplaceAnimatedEmoji2);
                    }
                } else if (spannableString != null) {
                    if (spannableReplaceAnimatedEmoji2 == null) {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString, spannableString2, strReplaceAll);
                    } else {
                        spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                    }
                } else if (spannableReplaceAnimatedEmoji2 == null) {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString2, strReplaceAll);
                } else {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                }
                if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    TableView.TableRowFullContent tableRowFullContentAddFullRow6 = tableView.addFullRow(spannable);
                    tableRowFullContentAddFullRow6.setFilled(true);
                    SpoilersTextView spoilersTextView7 = (SpoilersTextView) tableRowFullContentAddFullRow6.getChildAt(0);
                    spoilersTextView7.setTextSize(1, 12.0f);
                    spoilersTextView7.setGravity(17);
                } else {
                    savedStarGift = this.savedStarGift;
                    if (savedStarGift != null) {
                        messageObject = this.messageObject;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        TableView.TableRowFullContent tableRowFullContentAddFullRow7 = tableView.addFullRow(spannable);
                        tableRowFullContentAddFullRow7.setFilled(true);
                        SpoilersTextView spoilersTextView8 = (SpoilersTextView) tableRowFullContentAddFullRow7.getChildAt(0);
                        spoilersTextView8.setTextSize(1, 12.0f);
                        spoilersTextView8.setGravity(17);
                    } else {
                        messageObject = this.messageObject;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        TableView.TableRowFullContent tableRowFullContentAddFullRow8 = tableView.addFullRow(spannable);
                        tableRowFullContentAddFullRow8.setFilled(true);
                        SpoilersTextView spoilersTextView9 = (SpoilersTextView) tableRowFullContentAddFullRow8.getChildAt(0);
                        spoilersTextView9.setTextSize(1, 12.0f);
                        spoilersTextView9.setGravity(17);
                    }
                }
            }
            roller = this.roller;
            buttonWithCounterView = this.button;
            if (roller != null) {
                if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (!this.upgradedOnce) {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                } else {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                }
            } else {
                if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (!this.upgradedOnce) {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                } else {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
                }
            }
            this.actionBar.setTitle(this.title);
            roller2 = this.roller;
            if (roller2 != null) {
                z3 = this.rolling;
                starGiftSheet$$ExternalSyntheticLambda3 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 23);
                starGiftSheet$$ExternalSyntheticLambda4 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 20);
                tL_starGiftUnique2 = roller2.rollingGift;
                if (tL_starGiftUnique2 == null) {
                    if (z3) {
                        z4 = false;
                    } else {
                        TopView topView5 = roller2.topView;
                        BackupImageView upgradeImageView4 = topView5.getUpgradeImageView();
                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute4 = topView5.getUpgradeImageViewAttribute();
                        TL_stars.starGiftAttributePattern upgradePatternAttribute4 = topView5.getUpgradePatternAttribute();
                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute4 = topView5.getUpgradeBackdropAttribute();
                        TL_stars.starGiftAttributeModel stargiftattributemodel6 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                        TL_stars.starGiftAttributePattern stargiftattributepattern4 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        roller2.rolling = true;
                        roller2.rollingGift = tL_starGiftUnique;
                        roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                        roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                        roller2.durationT = (float) Math.random();
                        roller2.lastFrameTime = System.currentTimeMillis();
                        roller2.realTime = 0.0f;
                        roller2.sentDone = false;
                        roller2.sentDone2 = false;
                        roller2.rolling = true;
                        attrRoller = roller2.modelRoller;
                        if (attrRoller != null) {
                            attrRoller.detach();
                        }
                        stickersRollView = topView5.imagesRollView;
                        sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel6);
                        if (stickersRollView.isAttachedToWindow()) {
                            sticker.imageReceiver.onAttachedToWindow();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda12 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList10 = roller2.models;
                        Roller.Sticker sticker5 = new Roller.Sticker(upgradeImageView4, upgradeImageViewAttribute4);
                        if (roller2.durationT > 0.5f) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda12, arrayList10, sticker5, sticker, 0.9f, i);
                        attrRoller2 = roller2.symbolRoller;
                        if (attrRoller2 != null) {
                            attrRoller2.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda13 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList11 = roller2.symbols;
                        Roller.Symbol symbol7 = new Roller.Symbol(upgradePatternAttribute4);
                        Roller.Symbol symbol8 = new Roller.Symbol(stargiftattributepattern4);
                        if (roller2.durationT > 0.5f) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda13, arrayList11, symbol7, symbol8, 1.0f, i2);
                        attrRoller3 = roller2.backdropRoller;
                        if (attrRoller3 != null) {
                            attrRoller3.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda14 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        ArrayList arrayList12 = roller2.backgrounds;
                        Roller.Background background13 = new Roller.Background(upgradeBackdropAttribute4);
                        Roller.Background background14 = new Roller.Background(stargiftattributebackdrop4);
                        if (roller2.durationT > 0.5f) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                        roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda14, arrayList12, background13, background14, 0.5f, i3);
                        attrRoller4 = roller2.backdropRoller2;
                        if (attrRoller4 != null) {
                            attrRoller4.detach();
                        }
                        StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda15 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                        Roller.Background background15 = new Roller.Background(upgradeBackdropAttribute4);
                        Roller.Background background16 = new Roller.Background(stargiftattributebackdrop4);
                        if (roller2.durationT > 0.5f) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                        roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda15, arrayList12, background15, background16, 1.25f, i4);
                        roller2.invalidate();
                        z4 = true;
                    }
                } else if (z3) {
                    z4 = false;
                } else {
                    TopView topView6 = roller2.topView;
                    BackupImageView upgradeImageView5 = topView6.getUpgradeImageView();
                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute5 = topView6.getUpgradeImageViewAttribute();
                    TL_stars.starGiftAttributePattern upgradePatternAttribute5 = topView6.getUpgradePatternAttribute();
                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute5 = topView6.getUpgradeBackdropAttribute();
                    TL_stars.starGiftAttributeModel stargiftattributemodel7 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                    TL_stars.starGiftAttributePattern stargiftattributepattern5 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    roller2.rolling = true;
                    roller2.rollingGift = tL_starGiftUnique;
                    roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                    roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                    roller2.durationT = (float) Math.random();
                    roller2.lastFrameTime = System.currentTimeMillis();
                    roller2.realTime = 0.0f;
                    roller2.sentDone = false;
                    roller2.sentDone2 = false;
                    roller2.rolling = true;
                    attrRoller = roller2.modelRoller;
                    if (attrRoller != null) {
                        attrRoller.detach();
                    }
                    stickersRollView = topView6.imagesRollView;
                    sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel7);
                    if (stickersRollView.isAttachedToWindow()) {
                        sticker.imageReceiver.onAttachedToWindow();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda16 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList13 = roller2.models;
                    Roller.Sticker sticker6 = new Roller.Sticker(upgradeImageView5, upgradeImageViewAttribute5);
                    if (roller2.durationT > 0.5f) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda16, arrayList13, sticker6, sticker, 0.9f, i);
                    attrRoller2 = roller2.symbolRoller;
                    if (attrRoller2 != null) {
                        attrRoller2.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda17 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList14 = roller2.symbols;
                    Roller.Symbol symbol9 = new Roller.Symbol(upgradePatternAttribute5);
                    Roller.Symbol symbol10 = new Roller.Symbol(stargiftattributepattern5);
                    if (roller2.durationT > 0.5f) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda17, arrayList14, symbol9, symbol10, 1.0f, i2);
                    attrRoller3 = roller2.backdropRoller;
                    if (attrRoller3 != null) {
                        attrRoller3.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda18 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList15 = roller2.backgrounds;
                    Roller.Background background17 = new Roller.Background(upgradeBackdropAttribute5);
                    Roller.Background background18 = new Roller.Background(stargiftattributebackdrop5);
                    if (roller2.durationT > 0.5f) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda18, arrayList15, background17, background18, 0.5f, i3);
                    attrRoller4 = roller2.backdropRoller2;
                    if (attrRoller4 != null) {
                        attrRoller4.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda19 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    Roller.Background background19 = new Roller.Background(upgradeBackdropAttribute5);
                    Roller.Background background110 = new Roller.Background(stargiftattributebackdrop5);
                    if (roller2.durationT > 0.5f) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda19, arrayList15, background19, background110, 1.25f, i4);
                    roller2.invalidate();
                    z4 = true;
                }
                if (z4) {
                    topView.imageLayout.setAlpha(0.0f);
                    topView.imagesRollView.setAlpha(1.0f);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 22));
                    int length5 = ((StarGiftSheet) this.adapter.this$0).heights.length - 1;
                    RecyclerListView recyclerListView3 = this.recyclerListView;
                    recyclerListView3.scrollToPosition(length5);
                    recyclerListView3.post(new StarGiftSheet$$ExternalSyntheticLambda3(this, 21));
                }
            }
        }
        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
        charSequence = charSequenceReplaceTags;
        if (tL_textWithEntities != null) {
            spannableReplaceAnimatedEmoji = null;
        } else {
            spannableReplaceAnimatedEmoji = null;
        }
        topView.setText(0, spannableStringBuilder8, charSequence, releasedByText(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
        this.ownerTextView = null;
        tableView = this.tableView;
        tableView.removeAllViews();
        if (!z) {
            if (tL_starGiftUnique.host_id != null) {
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 19));
                }
                if (peerDialogId2 != 0) {
                    this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                }
            } else if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new StarGiftSheet$$ExternalSyntheticLambda3(this, 22));
            } else if (j2 != 0) {
                if (j2 != 0) {
                    this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
                }
            } else if (j2 != 0) {
                this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j2, new StarGiftSheet$$ExternalSyntheticLambda12(this, j2, 11)).getChildAt(1)).getChildAt(0);
            }
        }
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (z) {
            if (this.messageObject != null) {
                if (!this.messageObjectRepolled) {
                    TextView textView4 = (TextView) ((TableView.TableRowContent) tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(1)).getChildAt(0);
                    SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder("x ");
                    LoadingSpan loadingSpan4 = new LoadingSpan(AndroidUtilities.dp(90.0f), 0, textView4, this.resourcesProvider);
                    int i10 = Theme.key_windowBackgroundWhiteBlackText;
                    j3 = 0;
                    loadingSpan4.setColors(Theme.multAlpha(0.21f, Theme.getColor(i10, this.resourcesProvider)), Theme.multAlpha(0.08f, Theme.getColor(i10, this.resourcesProvider)));
                    spannableStringBuilder11.setSpan(loadingSpan4, 0, 1, 33);
                    textView4.setText(spannableStringBuilder11, TextView.BufferType.SPANNABLE);
                    if (!this.messageObjectRepolling) {
                        this.messageObjectRepolling = true;
                        int id4 = messageObject2.getId();
                        TLRPC.TL_messages_getMessages tL_messages_getMessages4 = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages4.id.add(Integer.valueOf(id4));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages4, new LaunchActivity$$ExternalSyntheticLambda63(this, id4, 4));
                    }
                } else {
                    j3 = 0;
                    tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                }
            } else {
                j3 = 0;
                tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
            }
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                this.tableView.addRow(LocaleController.getString(R.string.GiftValue2), zzil.m("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new PollItemMenu$$ExternalSyntheticLambda8(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 24), null);
            }
        } else {
            j3 = 0;
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails == null) {
            if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                final long peerDialogId9 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                spannableString = new SpannableString(DialogObject.getName(peerDialogId9));
                i5 = 0;
                spannableString.setSpan(new ClickableSpan() {
                    @Override
                    public final void onClick(View view) {
                        StarGiftSheet.this.openProfile(peerDialogId9);
                    }

                    @Override
                    public final void updateDrawState(TextPaint textPaint5) {
                        textPaint5.setColor(textPaint5.linkColor);
                    }
                }, 0, spannableString.length(), 33);
            } else {
                i5 = 0;
                spannableString = null;
            }
            final long peerDialogId10 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
            spannableString2 = new SpannableString(DialogObject.getName(peerDialogId10));
            spannableString2.setSpan(new ClickableSpan() {
                @Override
                public final void onClick(View view) {
                    StarGiftSheet.this.openProfile(peerDialogId10);
                }

                @Override
                public final void updateDrawState(TextPaint textPaint5) {
                    textPaint5.setColor(textPaint5.linkColor);
                }
            }, i5, spannableString2.length(), 33);
            if (stargiftattributeoriginaldetails.message != null) {
                TextPaint textPaint5 = new TextPaint(1);
                textPaint5.setTextSize(AndroidUtilities.dp(14.0f));
                SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                MessageObject.addEntitiesToText(spannableStringBuilder12, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                spannableReplaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder12, textPaint5.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint5.getFontMetricsInt());
            } else {
                spannableReplaceAnimatedEmoji2 = null;
            }
            strReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
            if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                if (spannableReplaceAnimatedEmoji2 == null) {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString, strReplaceAll);
                } else {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString, strReplaceAll, spannableReplaceAnimatedEmoji2);
                }
            } else if (spannableString != null) {
                if (spannableReplaceAnimatedEmoji2 == null) {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString, spannableString2, strReplaceAll);
                } else {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
                }
            } else if (spannableReplaceAnimatedEmoji2 == null) {
                spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString2, strReplaceAll);
            } else {
                spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji2);
            }
            if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                TableView.TableRowFullContent tableRowFullContentAddFullRow9 = tableView.addFullRow(spannable);
                tableRowFullContentAddFullRow9.setFilled(true);
                SpoilersTextView spoilersTextView10 = (SpoilersTextView) tableRowFullContentAddFullRow9.getChildAt(0);
                spoilersTextView10.setTextSize(1, 12.0f);
                spoilersTextView10.setGravity(17);
            } else {
                savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    messageObject = this.messageObject;
                    if (messageObject != null) {
                        messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        }
                    }
                    TableView.TableRowFullContent tableRowFullContentAddFullRow10 = tableView.addFullRow(spannable);
                    tableRowFullContentAddFullRow10.setFilled(true);
                    SpoilersTextView spoilersTextView11 = (SpoilersTextView) tableRowFullContentAddFullRow10.getChildAt(0);
                    spoilersTextView11.setTextSize(1, 12.0f);
                    spoilersTextView11.setGravity(17);
                } else {
                    messageObject = this.messageObject;
                    if (messageObject != null) {
                        messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        }
                    }
                    TableView.TableRowFullContent tableRowFullContentAddFullRow11 = tableView.addFullRow(spannable);
                    tableRowFullContentAddFullRow11.setFilled(true);
                    SpoilersTextView spoilersTextView12 = (SpoilersTextView) tableRowFullContentAddFullRow11.getChildAt(0);
                    spoilersTextView12.setTextSize(1, 12.0f);
                    spoilersTextView12.setGravity(17);
                }
            }
        }
        roller = this.roller;
        buttonWithCounterView = this.button;
        if (roller != null) {
            if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            }
            if (!this.upgradedOnce) {
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
            } else {
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
            }
        } else {
            if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            }
            if (!this.upgradedOnce) {
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
            } else {
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 24));
            }
        }
        this.actionBar.setTitle(this.title);
        roller2 = this.roller;
        if (roller2 != null) {
            z3 = this.rolling;
            starGiftSheet$$ExternalSyntheticLambda3 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 23);
            starGiftSheet$$ExternalSyntheticLambda4 = new StarGiftSheet$$ExternalSyntheticLambda3(this, 20);
            tL_starGiftUnique2 = roller2.rollingGift;
            if (tL_starGiftUnique2 == null) {
                if (z3) {
                    z4 = false;
                } else {
                    TopView topView7 = roller2.topView;
                    BackupImageView upgradeImageView6 = topView7.getUpgradeImageView();
                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute6 = topView7.getUpgradeImageViewAttribute();
                    TL_stars.starGiftAttributePattern upgradePatternAttribute6 = topView7.getUpgradePatternAttribute();
                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute6 = topView7.getUpgradeBackdropAttribute();
                    TL_stars.starGiftAttributeModel stargiftattributemodel8 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                    TL_stars.starGiftAttributePattern stargiftattributepattern6 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    roller2.rolling = true;
                    roller2.rollingGift = tL_starGiftUnique;
                    roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                    roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                    roller2.durationT = (float) Math.random();
                    roller2.lastFrameTime = System.currentTimeMillis();
                    roller2.realTime = 0.0f;
                    roller2.sentDone = false;
                    roller2.sentDone2 = false;
                    roller2.rolling = true;
                    attrRoller = roller2.modelRoller;
                    if (attrRoller != null) {
                        attrRoller.detach();
                    }
                    stickersRollView = topView7.imagesRollView;
                    sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel8);
                    if (stickersRollView.isAttachedToWindow()) {
                        sticker.imageReceiver.onAttachedToWindow();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda110 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList16 = roller2.models;
                    Roller.Sticker sticker7 = new Roller.Sticker(upgradeImageView6, upgradeImageViewAttribute6);
                    if (roller2.durationT > 0.5f) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda110, arrayList16, sticker7, sticker, 0.9f, i);
                    attrRoller2 = roller2.symbolRoller;
                    if (attrRoller2 != null) {
                        attrRoller2.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda111 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList17 = roller2.symbols;
                    Roller.Symbol symbol11 = new Roller.Symbol(upgradePatternAttribute6);
                    Roller.Symbol symbol12 = new Roller.Symbol(stargiftattributepattern6);
                    if (roller2.durationT > 0.5f) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda111, arrayList17, symbol11, symbol12, 1.0f, i2);
                    attrRoller3 = roller2.backdropRoller;
                    if (attrRoller3 != null) {
                        attrRoller3.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda112 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    ArrayList arrayList18 = roller2.backgrounds;
                    Roller.Background background111 = new Roller.Background(upgradeBackdropAttribute6);
                    Roller.Background background112 = new Roller.Background(stargiftattributebackdrop6);
                    if (roller2.durationT > 0.5f) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda112, arrayList18, background111, background112, 0.5f, i3);
                    attrRoller4 = roller2.backdropRoller2;
                    if (attrRoller4 != null) {
                        attrRoller4.detach();
                    }
                    StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda113 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                    Roller.Background background113 = new Roller.Background(upgradeBackdropAttribute6);
                    Roller.Background background114 = new Roller.Background(stargiftattributebackdrop6);
                    if (roller2.durationT > 0.5f) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda113, arrayList18, background113, background114, 1.25f, i4);
                    roller2.invalidate();
                    z4 = true;
                }
            } else if (z3) {
                z4 = false;
            } else {
                TopView topView8 = roller2.topView;
                BackupImageView upgradeImageView7 = topView8.getUpgradeImageView();
                TL_stars.starGiftAttributeModel upgradeImageViewAttribute7 = topView8.getUpgradeImageViewAttribute();
                TL_stars.starGiftAttributePattern upgradePatternAttribute7 = topView8.getUpgradePatternAttribute();
                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute7 = topView8.getUpgradeBackdropAttribute();
                TL_stars.starGiftAttributeModel stargiftattributemodel9 = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern7 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop7 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                roller2.rolling = true;
                roller2.rollingGift = tL_starGiftUnique;
                roller2.whenDone = starGiftSheet$$ExternalSyntheticLambda3;
                roller2.whenDone2 = starGiftSheet$$ExternalSyntheticLambda4;
                roller2.durationT = (float) Math.random();
                roller2.lastFrameTime = System.currentTimeMillis();
                roller2.realTime = 0.0f;
                roller2.sentDone = false;
                roller2.sentDone2 = false;
                roller2.rolling = true;
                attrRoller = roller2.modelRoller;
                if (attrRoller != null) {
                    attrRoller.detach();
                }
                stickersRollView = topView8.imagesRollView;
                sticker = new Roller.Sticker(stickersRollView, stargiftattributemodel9);
                if (stickersRollView.isAttachedToWindow()) {
                    sticker.imageReceiver.onAttachedToWindow();
                }
                StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda114 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                ArrayList arrayList19 = roller2.models;
                Roller.Sticker sticker8 = new Roller.Sticker(upgradeImageView7, upgradeImageViewAttribute7);
                if (roller2.durationT > 0.5f) {
                    i = 3;
                } else {
                    i = 2;
                }
                roller2.modelRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda114, arrayList19, sticker8, sticker, 0.9f, i);
                attrRoller2 = roller2.symbolRoller;
                if (attrRoller2 != null) {
                    attrRoller2.detach();
                }
                StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda115 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                ArrayList arrayList110 = roller2.symbols;
                Roller.Symbol symbol13 = new Roller.Symbol(upgradePatternAttribute7);
                Roller.Symbol symbol14 = new Roller.Symbol(stargiftattributepattern7);
                if (roller2.durationT > 0.5f) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                roller2.symbolRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda115, arrayList110, symbol13, symbol14, 1.0f, i2);
                attrRoller3 = roller2.backdropRoller;
                if (attrRoller3 != null) {
                    attrRoller3.detach();
                }
                StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda116 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                ArrayList arrayList111 = roller2.backgrounds;
                Roller.Background background115 = new Roller.Background(upgradeBackdropAttribute7);
                Roller.Background background116 = new Roller.Background(stargiftattributebackdrop7);
                if (roller2.durationT > 0.5f) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                roller2.backdropRoller = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda116, arrayList111, background115, background116, 0.5f, i3);
                attrRoller4 = roller2.backdropRoller2;
                if (attrRoller4 != null) {
                    attrRoller4.detach();
                }
                StarGiftSheet$Roller$$ExternalSyntheticLambda0 starGiftSheet$Roller$$ExternalSyntheticLambda117 = new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller2, 0);
                Roller.Background background117 = new Roller.Background(upgradeBackdropAttribute7);
                Roller.Background background118 = new Roller.Background(stargiftattributebackdrop7);
                if (roller2.durationT > 0.5f) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                roller2.backdropRoller2 = new Roller.AttrRoller(starGiftSheet$Roller$$ExternalSyntheticLambda117, arrayList111, background117, background118, 1.25f, i4);
                roller2.invalidate();
                z4 = true;
            }
            if (z4) {
                topView.imageLayout.setAlpha(0.0f);
                topView.imagesRollView.setAlpha(1.0f);
                buttonWithCounterView.setText(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 22));
                int length6 = ((StarGiftSheet) this.adapter.this$0).heights.length - 1;
                RecyclerListView recyclerListView4 = this.recyclerListView;
                recyclerListView4.scrollToPosition(length6);
                recyclerListView4.post(new StarGiftSheet$$ExternalSyntheticLambda3(this, 21));
            }
        }
    }

    public final void set(TL_stars.SavedStarGift savedStarGift, StarsController.IGiftsList iGiftsList) {
        boolean z;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        long j;
        String string;
        CharSequence charSequenceConcat;
        String string2;
        int i;
        int i2;
        CharSequence charSequenceReplaceArrows;
        String str;
        TL_stars.StarGift starGift;
        ?? r11;
        CharSequence charSequenceMake;
        int i3;
        boolean z2;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z3;
        int i4;
        String string3;
        String string4;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        SpannableStringBuilder spannableStringBuilder;
        TL_stars.StarGift starGift3;
        ?? r13;
        Roller roller;
        if (savedStarGift == null) {
            return;
        }
        int i5 = this.currentAccount;
        long j2 = this.dialogId;
        this.myProfile = isMine(i5, j2);
        this.savedStarGift = savedStarGift;
        this.giftsList = iGiftsList;
        this.messageObject = null;
        boolean z4 = this.rolling;
        TopView topView = this.topView;
        if (!z4 && (roller = this.roller) != null && roller.rolling && roller.rollingGift != null) {
            roller.detach();
            this.roller = null;
            topView.imageLayout.setVisibility(0);
            topView.imagesRollView.setVisibility(4);
        }
        this.actionView.set(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j2);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean zIsBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        long j3 = (savedStarGift.flags & 2) != 0 ? peerDialogId : 2666000L;
        boolean z5 = j2 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z6 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift4.owner_address;
            String str4 = starGift4.gift_address;
            z3 = starGift4.host_id != null;
            set((TL_stars.TL_starGiftUnique) starGift4, z6, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
            tL_textWithEntities = tL_textWithEntities2;
            str3 = str4;
        } else {
            boolean z7 = this.myProfile && clientUserId == j3 && j2 >= 0;
            boolean zIsWorn = isWorn(this.currentAccount, getUniqueGift());
            getLink$1();
            topView.setGift(starGift4, false, false, zIsWorn);
            TableView tableView = this.tableView;
            tableView.removeAllViews();
            String str5 = " ";
            String str6 = "";
            if (z7) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(savedStarGift.gift.title);
                    sb.append(" #");
                    string4 = BillingController$$ExternalSyntheticOutline0.m(savedStarGift.gift_num, ',', sb);
                } else {
                    string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.title = string4;
                if (z6) {
                    spannableStringBuilder = null;
                } else {
                    if (savedStarGift.can_upgrade) {
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                    } else {
                        long j4 = savedStarGift.convert_stars;
                        spannableStringBuilderReplaceTags = j4 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j4)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                    }
                    spannableStringBuilder = spannableStringBuilderReplaceTags;
                }
                tL_textWithEntities = tL_textWithEntities2;
                z = z6;
                j = j3;
                topView.setText(0, string4, spannableStringBuilder, null, releasedByText(savedStarGift.gift), null, null);
            } else {
                str5 = " ";
                str6 = "";
                z = z6;
                tL_textWithEntities = tL_textWithEntities2;
                j = j3;
                if (z5 && !this.myProfile) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.title = string5;
                    topView.setText(0, string5, null, null, releasedByText(savedStarGift.gift.released_by), null, null);
                } else {
                    boolean z8 = this.myProfile;
                    if (!z8 || savedStarGift.can_upgrade) {
                        if (savedStarGift.upgrade_stars > 0) {
                            String string6 = LocaleController.getString(z8 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                            this.title = string6;
                            topView.setText(0, string6, (!z && this.myProfile) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, null, releasedByText(savedStarGift.gift), null, null);
                        } else {
                            topView = topView;
                        }
                    }
                    if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(savedStarGift.gift.title);
                        sb2.append(" #");
                        string = BillingController$$ExternalSyntheticOutline0.m(savedStarGift.gift_num, ',', sb2);
                    } else {
                        string = LocaleController.getString(z8 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                    }
                    String str7 = string;
                    this.title = str7;
                    if (z || !this.myProfile) {
                        charSequenceConcat = null;
                    } else {
                        if (!zIsBot && canConvert()) {
                            if (this.myProfile) {
                                if (currentTime <= 0) {
                                    str = z5 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired";
                                } else {
                                    str = z5 ? "Gift2Info3Channel" : "Gift2Info3";
                                }
                                string2 = LocaleController.formatPluralStringComma(str, (int) savedStarGift.convert_stars);
                            } else {
                                string2 = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                        } else if (this.myProfile) {
                            if (savedStarGift.unsaved) {
                                i = z5 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep;
                            } else {
                                i = z5 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove;
                            }
                            string2 = LocaleController.getString(i);
                        } else {
                            string2 = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                        }
                        SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(string2);
                        if (zIsBot || !canConvert()) {
                            i2 = 2;
                            charSequenceReplaceArrows = str6;
                        } else {
                            i2 = 2;
                            charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new StarGiftSheet$$ExternalSyntheticLambda3(this, i2)), true);
                        }
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = spannableStringBuilderReplaceTags2;
                        charSequenceArr[1] = str5;
                        charSequenceArr[i2] = charSequenceReplaceArrows;
                        charSequenceConcat = TextUtils.concat(charSequenceArr);
                    }
                    topView.setText(0, str7, charSequenceConcat, null, releasedByText(savedStarGift.gift), null, null);
                }
            }
            if (clientUserId != j || z5) {
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda12(this, j, 0), (j == clientUserId || j == 2666000 || zIsBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) || z5) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new StarGiftSheet$$ExternalSyntheticLambda12(this, j, 2));
            }
            tableView.addRow(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) savedStarGift.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) savedStarGift.date) * 1000))), null, null);
            String string7 = LocaleController.getString(R.string.Gift2Value);
            String strM = BillingController$$ExternalSyntheticOutline0.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!canConvert() || z) {
                r11 = 0;
                charSequenceMake = str6;
            } else {
                r11 = 0;
                charSequenceMake = ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new StarGiftSheet$$ExternalSyntheticLambda3(this, 5), this.resourcesProvider, null);
            }
            tableView.addRow(string7, StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat(strM, str5, charSequenceMake), 0.8f, r11), r11, r11);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z) {
                StarsIntroActivity.addAvailabilityRow(tableView, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
            if (tL_textWithEntities3 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z) {
                TLRPC.TL_textWithEntities tL_textWithEntities4 = savedStarGift.message;
                tableView.addFullRow(tL_textWithEntities4.text, tL_textWithEntities4.entities);
            }
            boolean z9 = this.myProfile;
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (z9 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                if (this.upgradeIconSpan == null) {
                    i4 = 0;
                    this.upgradeIconSpan = new ColoredImageSpan(0, new UpgradeIcon(buttonWithCounterView, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                } else {
                    i4 = 0;
                }
                spannableStringBuilder2.setSpan(this.upgradeIconSpan, i4, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder2.append((CharSequence) string3);
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(spannableStringBuilder2, !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 0));
            } else if (this.upgradedOnce && z9 && this.viewPager != null && this.giftsList != null && getListPosition$1() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition$1()) >= 0) {
                buttonWithCounterView.setFilled(false);
                int iFindGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition$1());
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.giftsList.get(iFindGiftToUpgrade);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    z2 = true;
                } else {
                    spannableStringBuilder3.append((CharSequence) " e");
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, buttonWithCounterView.getTextPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                    z2 = true;
                    spannableStringBuilder3.setSpan(animatedEmojiSpan, spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                }
                buttonWithCounterView.setText(spannableStringBuilder3, this.firstSet ^ z2, z2);
                buttonWithCounterView.setSubText(null, this.firstSet ^ z2);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda16(this, iFindGiftToUpgrade, 0));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                if (this.upgradeIconSpan == null) {
                    i3 = 0;
                    this.upgradeIconSpan = new ColoredImageSpan(0, new UpgradeIcon(buttonWithCounterView, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                } else {
                    i3 = 0;
                }
                spannableStringBuilder4.setSpan(this.upgradeIconSpan, i3, 1, 33);
                spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(spannableStringBuilder4, !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 4));
            } else {
                buttonWithCounterView.setFilled(true);
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                buttonWithCounterView.setSubText(null, !this.firstSet);
                buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 5));
            }
            str2 = null;
            str3 = null;
            z3 = false;
        }
        boolean z10 = savedStarGift.refunded;
        LinkSpanDrawable.LinksTextView linksTextView = this.beforeTableTextView;
        if (z10) {
            linksTextView.setVisibility(0);
            linksTextView.setText(LocaleController.getString(R.string.Gift2Refunded));
            linksTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        } else if (z3 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new StarGiftSheet$$ExternalSyntheticLambda19(this, str3, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            linksTextView.setVisibility(0);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.myProfile && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            linksTextView.setVisibility(0);
            linksTextView.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else {
            linksTextView.setVisibility(8);
        }
        LinkSpanDrawable.LinksTextView linksTextView2 = this.afterTableTextView;
        if (!z3 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new StarGiftSheet$$ExternalSyntheticLambda19(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            linksTextView2.setVisibility(0);
        } else if (this.myProfile && isMine(this.currentAccount, j2)) {
            if (j2 >= 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder5.append((CharSequence) ". ");
                    spannableStringBuilder5.setSpan(new ColoredImageSpan(R.drawable.mini_gift_hidden), 0, 1, 33);
                }
                spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new StarGiftSheet$$ExternalSyntheticLambda3(this, 4)));
                linksTextView2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder5, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new StarGiftSheet$$ExternalSyntheticLambda3(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            linksTextView2.setVisibility(0);
        } else {
            r13 = 0;
            linksTextView2.setVisibility(8);
        }
        if (this.firstSet) {
            switchPage(r13, r13, null);
            this.layoutManager.scrollToPosition(1);
            this.firstSet = r13;
        }
        this.actionBar.setTitle(this.title);
        updateViewPager();
    }

    public final void set(MessageObject messageObject, StarsController.IGiftsList iGiftsList) {
        TLRPC.Peer peer;
        boolean z;
        TLRPC.Peer peer2;
        boolean z2;
        TL_stars.StarGift starGift;
        long j;
        long j2;
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        TLRPC.Peer peer3;
        boolean z6;
        String string;
        boolean z7;
        String string2;
        String str2;
        boolean z8;
        String string3;
        char c;
        CharSequence charSequenceReplaceArrows;
        CharSequence charSequenceConcat;
        int i2;
        int i3;
        String str3;
        String str4;
        TableView tableView;
        long peerDialogId;
        long j3;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String string4;
        StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda12;
        StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda13;
        TL_stars.StarGift starGift2;
        boolean z9;
        int i4;
        boolean z10;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        TL_stars.StarGift starGift4;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z11;
        TLRPC.Peer peer4;
        boolean z12;
        boolean z13;
        int i5;
        String string5;
        ?? r9;
        long peerDialogId2;
        StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda14;
        String string6;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        SpannableStringBuilder spannableStringBuilder;
        Roller roller;
        String string7;
        boolean z14;
        long fromChatId;
        TLObject userOrChat;
        boolean z15;
        Roller roller2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift inputStarGift;
        int i6 = 3;
        boolean z16 = false;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        this.myProfile = false;
        this.savedStarGift = null;
        this.messageObject = messageObject;
        this.giftsList = iGiftsList;
        this.actionView.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z17 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z18 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        TopView topView = this.topView;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (z18 || (((z14 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.rolling && (roller = this.roller) != null && roller.rolling && roller.rollingGift != null) {
                roller.detach();
                this.roller = null;
                topView.imageLayout.setVisibility(0);
                topView.imagesRollView.setVisibility(4);
            }
            boolean zIsOutOwner = z17 ? false : messageObject.isOutOwner();
            TLRPC.Message message = messageObject.messageOwner;
            int i7 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z19 = tL_messageActionStarGift.converted;
                boolean z20 = tL_messageActionStarGift.saved;
                boolean z21 = tL_messageActionStarGift.refunded;
                boolean z22 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift5 = tL_messageActionStarGift.gift;
                boolean z23 = tL_messageActionStarGift.can_upgrade;
                long j4 = tL_messageActionStarGift.convert_stars;
                long j5 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageActionStarGift.message;
                TLRPC.Peer peer5 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer6 = tL_messageActionStarGift.peer;
                boolean z24 = tL_messageActionStarGift.prepaid_upgrade;
                String str5 = tL_messageActionStarGift.prepaid_upgrade_hash;
                peer3 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                j2 = j5;
                z2 = z21;
                z5 = z23;
                z = z20;
                peer2 = peer6;
                z6 = z24;
                i = tL_messageActionStarGift.gift_num;
                j = j4;
                z4 = z19;
                peer = peer5;
                str = str5;
                z3 = z22;
                starGift = starGift5;
                tL_textWithEntities = tL_textWithEntities4;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                boolean z25 = tL_messageActionStarGiftUnique.saved;
                boolean z26 = tL_messageActionStarGiftUnique.refunded;
                TL_stars.StarGift starGift6 = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                z = z25;
                peer2 = tL_messageActionStarGiftUnique.peer;
                z2 = z26;
                starGift = starGift6;
                j = 0;
                j2 = 0;
                str = null;
                tL_textWithEntities = null;
                z3 = false;
                z4 = false;
                i = 0;
                z5 = false;
                peer3 = null;
                z6 = false;
            }
            long peerDialogId3 = this.dialogId;
            String shortName = DialogObject.getShortName(peerDialogId3);
            String str6 = str;
            TLRPC.Peer peer7 = peer;
            boolean zIsBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId3)));
            boolean z27 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean zIsWorn = isWorn(this.currentAccount, getUniqueGift());
            getLink$1();
            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities;
            topView.setGift(starGift, false, false, zIsWorn);
            CharSequence charSequenceMake = "";
            if (z17) {
                if (i != 0 && starGift.title != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(starGift.title);
                    sb.append(" #");
                    string6 = BillingController$$ExternalSyntheticOutline0.m(i, ',', sb);
                } else {
                    string6 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.title = string6;
                if (z2) {
                    spannableStringBuilder = null;
                } else {
                    if (z5) {
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                    } else if (j > 0) {
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z4 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j));
                    } else {
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                    }
                    spannableStringBuilder = spannableStringBuilderReplaceTags;
                }
                topView.setText(0, string6, spannableStringBuilder, null, releasedByText(starGift), null, null);
            } else if (z27 && !this.myProfile) {
                topView.setText(0, LocaleController.getString(R.string.Gift2TitleProfile), null, null, releasedByText(starGift), null, null);
            } else {
                if ((zIsOutOwner || z5) && j2 > 0) {
                    String string8 = LocaleController.getString(zIsOutOwner ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.title = string8;
                    if (z2) {
                        string = null;
                    } else {
                        string = !zIsOutOwner ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                    }
                    topView.setText(0, string8, string, null, releasedByText(starGift), null, null);
                } else {
                    int i8 = i;
                    if (i8 != 0 && starGift.title != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(starGift.title);
                        sb2.append(" #");
                        z7 = zIsOutOwner;
                        string2 = BillingController$$ExternalSyntheticOutline0.m(i8, ',', sb2);
                    } else {
                        z7 = zIsOutOwner;
                        string2 = LocaleController.getString(z7 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    }
                    this.title = string2;
                    if (z2) {
                        str2 = string2;
                        z8 = z4;
                        charSequenceConcat = null;
                    } else {
                        if (zIsBot || getInputStarGift() == null) {
                            str2 = string2;
                            z8 = z4;
                            if (z7) {
                                if (z5 || j2 <= 0) {
                                    i3 = R.string.Gift2Info2OutExpired;
                                } else {
                                    i3 = R.string.Gift2Info2OutUpgrade;
                                }
                                string3 = LocaleController.formatString(i3, shortName);
                            } else {
                                if (z) {
                                    if (z27) {
                                        i2 = R.string.Gift2Info2ChannelRemove;
                                    } else {
                                        i2 = R.string.Gift2Info2BotRemove;
                                    }
                                } else if (z27) {
                                    i2 = R.string.Gift2Info2ChannelKeep;
                                } else {
                                    i2 = R.string.Gift2Info2BotKeep;
                                }
                                string3 = LocaleController.getString(i2);
                            }
                        } else {
                            MessageObject messageObject2 = this.messageObject;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z28 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.messageObject.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    str2 = string2;
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date);
                                    if (z28) {
                                        TLRPC.Peer peer8 = tL_messageActionStarGift2.peer;
                                        if (peer8 != null) {
                                            z8 = z4;
                                            if (isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer8))) {
                                            }
                                        }
                                        if (z7) {
                                            if (z5) {
                                                i3 = R.string.Gift2Info2OutExpired;
                                            } else {
                                                i3 = R.string.Gift2Info2OutExpired;
                                            }
                                            string3 = LocaleController.formatString(i3, shortName);
                                        } else {
                                            if (z) {
                                                if (z27) {
                                                    i2 = R.string.Gift2Info2ChannelKeep;
                                                } else {
                                                    i2 = R.string.Gift2Info2BotKeep;
                                                }
                                            } else if (z27) {
                                                i2 = R.string.Gift2Info2ChannelRemove;
                                            } else {
                                                i2 = R.string.Gift2Info2BotRemove;
                                            }
                                            string3 = LocaleController.getString(i2);
                                        }
                                    } else {
                                        z8 = z4;
                                    }
                                    if (tL_messageActionStarGift2.converted || tL_messageActionStarGift2.convert_stars <= 0 || currentTime <= 0) {
                                        if (z7) {
                                            if (z5) {
                                                i3 = R.string.Gift2Info2OutExpired;
                                            } else {
                                                i3 = R.string.Gift2Info2OutExpired;
                                            }
                                            string3 = LocaleController.formatString(i3, shortName);
                                        } else {
                                            if (z) {
                                                if (z27) {
                                                    i2 = R.string.Gift2Info2ChannelKeep;
                                                } else {
                                                    i2 = R.string.Gift2Info2BotKeep;
                                                }
                                            } else if (z27) {
                                                i2 = R.string.Gift2Info2ChannelRemove;
                                            } else {
                                                i2 = R.string.Gift2Info2BotRemove;
                                            }
                                            string3 = LocaleController.getString(i2);
                                        }
                                    } else if (z7) {
                                        if (z8) {
                                            if (z27) {
                                                str3 = "Gift2InfoChannelConverted";
                                            } else {
                                                str3 = "Gift2InfoConverted";
                                            }
                                        } else if (z27) {
                                            str3 = "Gift2Info3Channel";
                                        } else {
                                            str3 = "Gift2Info3";
                                        }
                                        string3 = LocaleController.formatPluralStringComma(str3, (int) j);
                                    } else if (!z5 && j2 > 0) {
                                        string3 = LocaleController.formatString(R.string.Gift2Info2OutUpgrade, shortName);
                                    } else if (z || z8) {
                                        if (z8) {
                                            str4 = "Gift2InfoOutConverted";
                                        } else {
                                            str4 = "Gift2InfoOut";
                                        }
                                        string3 = LocaleController.formatPluralStringComma(str4, (int) j, shortName);
                                    } else {
                                        string3 = LocaleController.formatString(R.string.Gift2InfoOutPinned, shortName);
                                    }
                                } else {
                                    str2 = string2;
                                }
                                z8 = z4;
                                if (z7) {
                                    if (z5) {
                                        i3 = R.string.Gift2Info2OutExpired;
                                    } else {
                                        i3 = R.string.Gift2Info2OutExpired;
                                    }
                                    string3 = LocaleController.formatString(i3, shortName);
                                } else {
                                    if (z) {
                                        if (z27) {
                                            i2 = R.string.Gift2Info2ChannelKeep;
                                        } else {
                                            i2 = R.string.Gift2Info2BotKeep;
                                        }
                                    } else if (z27) {
                                        i2 = R.string.Gift2Info2ChannelRemove;
                                    } else {
                                        i2 = R.string.Gift2Info2BotRemove;
                                    }
                                    string3 = LocaleController.getString(i2);
                                }
                            } else {
                                str2 = string2;
                                z8 = z4;
                                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (isMineWithActions(this.currentAccount, peerDialogId3)) {
                                        int i9 = this.savedStarGift.flags;
                                        if (((peerDialogId3 < 0 ? 2048 : 8) & i9) != 0 && (i9 & 16) != 0 && (i9 & 2) != 0 && currentTime2 > 0) {
                                            if (z7) {
                                                if (z8) {
                                                    if (z27) {
                                                        str3 = "Gift2InfoChannelConverted";
                                                    } else {
                                                        str3 = "Gift2InfoConverted";
                                                    }
                                                } else if (z27) {
                                                    str3 = "Gift2Info3Channel";
                                                } else {
                                                    str3 = "Gift2Info3";
                                                }
                                                string3 = LocaleController.formatPluralStringComma(str3, (int) j);
                                            } else if (!z5) {
                                                if (z) {
                                                    if (z8) {
                                                        str4 = "Gift2InfoOutConverted";
                                                    } else {
                                                        str4 = "Gift2InfoOut";
                                                    }
                                                    string3 = LocaleController.formatPluralStringComma(str4, (int) j, shortName);
                                                } else {
                                                    if (z8) {
                                                        str4 = "Gift2InfoOutConverted";
                                                    } else {
                                                        str4 = "Gift2InfoOut";
                                                    }
                                                    string3 = LocaleController.formatPluralStringComma(str4, (int) j, shortName);
                                                }
                                            } else if (z) {
                                                if (z8) {
                                                    str4 = "Gift2InfoOutConverted";
                                                } else {
                                                    str4 = "Gift2InfoOut";
                                                }
                                                string3 = LocaleController.formatPluralStringComma(str4, (int) j, shortName);
                                            } else {
                                                if (z8) {
                                                    str4 = "Gift2InfoOutConverted";
                                                } else {
                                                    str4 = "Gift2InfoOut";
                                                }
                                                string3 = LocaleController.formatPluralStringComma(str4, (int) j, shortName);
                                            }
                                        }
                                    }
                                }
                                if (z7) {
                                    if (z5) {
                                        i3 = R.string.Gift2Info2OutExpired;
                                    } else {
                                        i3 = R.string.Gift2Info2OutExpired;
                                    }
                                    string3 = LocaleController.formatString(i3, shortName);
                                } else {
                                    if (z) {
                                        if (z27) {
                                            i2 = R.string.Gift2Info2ChannelKeep;
                                        } else {
                                            i2 = R.string.Gift2Info2BotKeep;
                                        }
                                    } else if (z27) {
                                        i2 = R.string.Gift2Info2ChannelRemove;
                                    } else {
                                        i2 = R.string.Gift2Info2BotRemove;
                                    }
                                    string3 = LocaleController.getString(i2);
                                }
                            }
                        }
                        SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(string3);
                        if (zIsBot || !canConvert()) {
                            c = 1;
                            charSequenceReplaceArrows = "";
                        } else {
                            c = 1;
                            charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new StarGiftSheet$$ExternalSyntheticLambda3(this, 7)), true);
                        }
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = spannableStringBuilderReplaceTags2;
                        charSequenceArr[c] = " ";
                        charSequenceArr[2] = charSequenceReplaceArrows;
                        charSequenceConcat = TextUtils.concat(charSequenceArr);
                    }
                    topView.setText(0, str2, charSequenceConcat, null, releasedByText(starGift), null, null);
                }
                tableView = this.tableView;
                tableView.removeAllViews();
                if (peer7 != null) {
                    peerDialogId = DialogObject.getPeerDialogId(peer7);
                } else if (z7) {
                    peerDialogId = clientUserId;
                } else {
                    peerDialogId = peerDialogId3;
                }
                if (peer2 != null) {
                    peerDialogId3 = DialogObject.getPeerDialogId(peer2);
                } else if (!z7) {
                    peerDialogId3 = clientUserId;
                }
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                if (peer3 != null) {
                    peerDialogId2 = DialogObject.getPeerDialogId(peer3);
                    String string9 = LocaleController.getString(R.string.Gift2To);
                    int i10 = this.currentAccount;
                    StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda15 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 4);
                    tL_textWithEntities2 = tL_textWithEntities5;
                    if (z27) {
                        starGiftSheet$$ExternalSyntheticLambda14 = null;
                    } else {
                        starGiftSheet$$ExternalSyntheticLambda14 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 5);
                    }
                    this.tableView.addRowUser(string9, i10, peerDialogId2, starGiftSheet$$ExternalSyntheticLambda15, null, starGiftSheet$$ExternalSyntheticLambda14);
                    z3 = z3;
                } else {
                    j3 = peerDialogId;
                    tL_textWithEntities2 = tL_textWithEntities5;
                    if (j3 == clientUserId || z6 || z27) {
                        String string10 = LocaleController.getString(R.string.Gift2From);
                        int i11 = this.currentAccount;
                        StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda16 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j3, 6);
                        if (j3 != clientUserId || j3 == 2666000 || UserObject.isDeleted(user) || zIsBot || z27) {
                            string4 = null;
                        } else {
                            string4 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                        }
                        if (z27) {
                            starGiftSheet$$ExternalSyntheticLambda12 = null;
                        } else {
                            starGiftSheet$$ExternalSyntheticLambda12 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j3, 7);
                        }
                        this.tableView.addRowUser(string10, i11, j3, starGiftSheet$$ExternalSyntheticLambda16, string4, starGiftSheet$$ExternalSyntheticLambda12);
                    }
                    if (peerDialogId3 == clientUserId || z27) {
                        String string11 = LocaleController.getString(R.string.Gift2To);
                        int i12 = this.currentAccount;
                        StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda17 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId3, 8);
                        if (z27) {
                            starGiftSheet$$ExternalSyntheticLambda13 = null;
                        } else {
                            starGiftSheet$$ExternalSyntheticLambda13 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId3, 9);
                        }
                        this.tableView.addRowUser(string11, i12, peerDialogId3, starGiftSheet$$ExternalSyntheticLambda17, null, starGiftSheet$$ExternalSyntheticLambda13);
                    }
                }
                tableView.addRowDateTime(i7, LocaleController.getString(R.string.StarsTransactionDate));
                if (starGift.stars > 0) {
                    String string12 = LocaleController.getString(R.string.Gift2Value);
                    String strM = BillingController$$ExternalSyntheticOutline0.m(starGift.stars + j2, ',', new StringBuilder("⭐️ "));
                    if (canConvert() || z2) {
                        r9 = 0;
                    } else {
                        r9 = 0;
                        charSequenceMake = ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j), new StarGiftSheet$$ExternalSyntheticLambda3(this, 5), this.resourcesProvider, null);
                    }
                    tableView.addRow(string12, StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat(strM, " ", charSequenceMake), 0.8f, r9), r9, r9);
                }
                starGift2 = starGift;
                if (starGift2.limited && !z2) {
                    StarsIntroActivity.addAvailabilityRow(tableView, this.currentAccount, starGift2, this.resourcesProvider);
                }
                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z2) {
                    tableView.addFullRow(tL_textWithEntities2.text, tL_textWithEntities2.entities);
                }
                if (z7 && z5 && !z2) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                    if (this.upgradeIconSpan == null) {
                        i5 = 0;
                        this.upgradeIconSpan = new ColoredImageSpan(0, new UpgradeIcon(buttonWithCounterView, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                    } else {
                        i5 = 0;
                    }
                    spannableStringBuilder2.setSpan(this.upgradeIconSpan, i5, 1, 33);
                    if (j2 > 0) {
                        string5 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                    } else {
                        string5 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                    }
                    spannableStringBuilder2.append((CharSequence) string5);
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(spannableStringBuilder2, !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 10));
                } else {
                    if (!this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition$1() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition$1()) >= 0) {
                        buttonWithCounterView.setFilled(false);
                        int iFindGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition$1());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.giftsList.get(iFindGiftToUpgrade);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                            z10 = true;
                        } else {
                            spannableStringBuilder3.append((CharSequence) " e");
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, buttonWithCounterView.getTextPaint().getFontMetricsInt());
                            animatedEmojiSpan.document = document;
                            z10 = true;
                            spannableStringBuilder3.setSpan(animatedEmojiSpan, spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        buttonWithCounterView.setText(spannableStringBuilder3, this.firstSet ^ z10, z10);
                        buttonWithCounterView.setSubText(null, this.firstSet ^ z10);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda16(this, iFindGiftToUpgrade, 2));
                    } else if (!(starGift2 instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(str6)) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                        if (this.upgradeIconSpan == null) {
                            i4 = 0;
                            this.upgradeIconSpan = new ColoredImageSpan(0, new UpgradeIcon(buttonWithCounterView, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                        } else {
                            i4 = 0;
                        }
                        z9 = true;
                        spannableStringBuilder4.setSpan(this.upgradeIconSpan, i4, 1, 33);
                        spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                        buttonWithCounterView.setFilled(true);
                        buttonWithCounterView.setText(spannableStringBuilder4, !this.firstSet, true);
                        buttonWithCounterView.setSubText(null, !this.firstSet);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 7));
                    } else {
                        z9 = true;
                        buttonWithCounterView.setFilled(true);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                        buttonWithCounterView.setSubText(null, !this.firstSet);
                        buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 8));
                    }
                    starGift4 = starGift2;
                    tL_textWithEntities3 = tL_textWithEntities2;
                    z11 = z2;
                    peer4 = peer3;
                    z16 = z3;
                    z12 = z;
                    z13 = z7;
                }
                z9 = true;
                starGift4 = starGift2;
                tL_textWithEntities3 = tL_textWithEntities2;
                z11 = z2;
                peer4 = peer3;
                z16 = z3;
                z12 = z;
                z13 = z7;
            }
            z7 = zIsOutOwner;
            z8 = z4;
            tableView = this.tableView;
            tableView.removeAllViews();
            if (peer7 != null) {
                peerDialogId = DialogObject.getPeerDialogId(peer7);
            } else if (z7) {
                peerDialogId = clientUserId;
            } else {
                peerDialogId = peerDialogId3;
            }
            if (peer2 != null) {
                peerDialogId3 = DialogObject.getPeerDialogId(peer2);
            } else if (!z7) {
                peerDialogId3 = clientUserId;
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer3 != null) {
                peerDialogId2 = DialogObject.getPeerDialogId(peer3);
                String string13 = LocaleController.getString(R.string.Gift2To);
                int i13 = this.currentAccount;
                StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda18 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 4);
                tL_textWithEntities2 = tL_textWithEntities5;
                if (z27) {
                    starGiftSheet$$ExternalSyntheticLambda14 = null;
                } else {
                    starGiftSheet$$ExternalSyntheticLambda14 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId2, 5);
                }
                this.tableView.addRowUser(string13, i13, peerDialogId2, starGiftSheet$$ExternalSyntheticLambda18, null, starGiftSheet$$ExternalSyntheticLambda14);
                z3 = z3;
            } else {
                j3 = peerDialogId;
                tL_textWithEntities2 = tL_textWithEntities5;
                if (j3 == clientUserId) {
                    String string14 = LocaleController.getString(R.string.Gift2From);
                    int i14 = this.currentAccount;
                    StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda19 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j3, 6);
                    if (j3 != clientUserId) {
                        string4 = null;
                    } else {
                        string4 = null;
                    }
                    if (z27) {
                        starGiftSheet$$ExternalSyntheticLambda12 = null;
                    } else {
                        starGiftSheet$$ExternalSyntheticLambda12 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j3, 7);
                    }
                    this.tableView.addRowUser(string14, i14, j3, starGiftSheet$$ExternalSyntheticLambda19, string4, starGiftSheet$$ExternalSyntheticLambda12);
                } else {
                    String string15 = LocaleController.getString(R.string.Gift2From);
                    int i15 = this.currentAccount;
                    StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda110 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j3, 6);
                    if (j3 != clientUserId) {
                        string4 = null;
                    } else {
                        string4 = null;
                    }
                    if (z27) {
                        starGiftSheet$$ExternalSyntheticLambda12 = null;
                    } else {
                        starGiftSheet$$ExternalSyntheticLambda12 = new StarGiftSheet$$ExternalSyntheticLambda12(this, j3, 7);
                    }
                    this.tableView.addRowUser(string15, i15, j3, starGiftSheet$$ExternalSyntheticLambda110, string4, starGiftSheet$$ExternalSyntheticLambda12);
                }
                if (peerDialogId3 == clientUserId) {
                    String string16 = LocaleController.getString(R.string.Gift2To);
                    int i16 = this.currentAccount;
                    StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda111 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId3, 8);
                    if (z27) {
                        starGiftSheet$$ExternalSyntheticLambda13 = null;
                    } else {
                        starGiftSheet$$ExternalSyntheticLambda13 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId3, 9);
                    }
                    this.tableView.addRowUser(string16, i16, peerDialogId3, starGiftSheet$$ExternalSyntheticLambda111, null, starGiftSheet$$ExternalSyntheticLambda13);
                } else {
                    String string17 = LocaleController.getString(R.string.Gift2To);
                    int i17 = this.currentAccount;
                    StarGiftSheet$$ExternalSyntheticLambda12 starGiftSheet$$ExternalSyntheticLambda112 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId3, 8);
                    if (z27) {
                        starGiftSheet$$ExternalSyntheticLambda13 = null;
                    } else {
                        starGiftSheet$$ExternalSyntheticLambda13 = new StarGiftSheet$$ExternalSyntheticLambda12(this, peerDialogId3, 9);
                    }
                    this.tableView.addRowUser(string17, i17, peerDialogId3, starGiftSheet$$ExternalSyntheticLambda112, null, starGiftSheet$$ExternalSyntheticLambda13);
                }
            }
            tableView.addRowDateTime(i7, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift.stars > 0) {
                String string18 = LocaleController.getString(R.string.Gift2Value);
                String strM2 = BillingController$$ExternalSyntheticOutline0.m(starGift.stars + j2, ',', new StringBuilder("⭐️ "));
                if (canConvert()) {
                    r9 = 0;
                } else {
                    r9 = 0;
                }
                tableView.addRow(string18, StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat(strM2, " ", charSequenceMake), 0.8f, r9), r9, r9);
            }
            starGift2 = starGift;
            if (starGift2.limited) {
                StarsIntroActivity.addAvailabilityRow(tableView, this.currentAccount, starGift2, this.resourcesProvider);
            }
            if (tL_textWithEntities2 != null) {
                tableView.addFullRow(tL_textWithEntities2.text, tL_textWithEntities2.entities);
            }
            if (z7) {
                if (!this.upgradedOnce) {
                }
                if (!(starGift2 instanceof TL_stars.TL_starGift)) {
                    z9 = true;
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 8));
                } else {
                    z9 = true;
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 8));
                }
            } else {
                if (!this.upgradedOnce) {
                }
                if (!(starGift2 instanceof TL_stars.TL_starGift)) {
                    z9 = true;
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 8));
                } else {
                    z9 = true;
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), !this.firstSet, true);
                    buttonWithCounterView.setSubText(null, !this.firstSet);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 8));
                }
            }
            starGift4 = starGift2;
            tL_textWithEntities3 = tL_textWithEntities2;
            z11 = z2;
            peer4 = peer3;
            z16 = z3;
            z12 = z;
            z13 = z7;
        } else {
            if (!z14) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                userOrChat = null;
            } else {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique2.from_id;
                if (peer9 != null) {
                    fromChatId = DialogObject.getPeerDialogId(peer9);
                } else {
                    fromChatId = messageObject.getFromChatId();
                }
                userOrChat = messagesController.getUserOrChat(fromChatId);
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z11 = tL_messageActionStarGiftUnique2.refunded;
            set(tL_starGiftUnique2, z11, userOrChat, tL_messageActionStarGiftUnique2.message);
            z12 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            boolean z29 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z29 = false;
            }
            if (!this.userStarGiftRepolling && !this.userStarGiftRepolled && this.messageObject != null && (inputStarGift = getInputStarGift()) != null) {
                this.userStarGiftRepolling = true;
                StarsController.getInstance(this.currentAccount, false).getUserStarGift(inputStarGift, new StarGiftSheet$$ExternalSyntheticLambda69(this, i6));
            }
            if (this.rolling || (roller2 = this.roller) == null || !roller2.rolling || (tL_starGiftUnique = roller2.rollingGift) == null) {
                z15 = z29;
            } else {
                if (starGift4 != null) {
                    z15 = z29;
                    if (tL_starGiftUnique.id != starGift4.id) {
                    }
                } else {
                    z15 = z29;
                }
                roller2.detach();
                this.roller = null;
                topView.imageLayout.setAlpha(1.0f);
                topView.imagesRollView.setAlpha(0.0f);
            }
            z13 = z15;
            tL_textWithEntities3 = null;
            z9 = true;
            peer4 = null;
            z8 = false;
        }
        if (this.nextButtonCrafting) {
            buttonWithCounterView.setFilled(z9);
            buttonWithCounterView.setText(LocaleController.getString(R.string.GiftCraftButtonNext), false, z9);
            buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(this, 9));
        }
        String str7 = starGift4 == null ? null : starGift4.owner_address;
        String str8 = starGift4 == null ? null : starGift4.gift_address;
        boolean z30 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        LinkSpanDrawable.LinksTextView linksTextView = this.beforeTableTextView;
        if (z11) {
            linksTextView.setVisibility(0);
            linksTextView.setText(LocaleController.getString(R.string.Gift2Refunded));
            linksTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        } else if (z30 && !TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
            linksTextView.setVisibility(0);
            linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new StarGiftSheet$$ExternalSyntheticLambda19(this, str8, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && z16 && !z17) {
            linksTextView.setVisibility(0);
            if (z13) {
                string7 = LocaleController.formatString((tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string7 = LocaleController.getString((tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            linksTextView.setText(string7);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else {
            linksTextView.setVisibility(8);
        }
        LinkSpanDrawable.LinksTextView linksTextView2 = this.afterTableTextView;
        if (!z30 && !TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
            linksTextView2.setVisibility(0);
            linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new StarGiftSheet$$ExternalSyntheticLambda19(this, str8, 7)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (!z8 && !z11 && starGift4 != null && isMine(this.currentAccount, getDialogId$1()) && peer4 == null) {
            linksTextView2.setVisibility(0);
            if (getDialogId$1() >= 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (!z12) {
                    spannableStringBuilder5.append((CharSequence) ". ");
                    spannableStringBuilder5.setSpan(new ColoredImageSpan(R.drawable.mini_gift_hidden), 0, 1, 33);
                }
                spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z12 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new StarGiftSheet$$ExternalSyntheticLambda3(this, 4)));
                linksTextView2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder5, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z12 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new StarGiftSheet$$ExternalSyntheticLambda3(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        } else {
            linksTextView2.setVisibility(8);
        }
        if (this.firstSet) {
            switchPage(0, false, null);
            this.layoutManager.scrollToPosition(1);
            this.firstSet = false;
        }
        this.actionBar.setTitle(this.title);
        updateViewPager();
    }
}

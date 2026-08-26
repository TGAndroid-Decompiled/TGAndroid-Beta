package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView$CameraGLThread$$ExternalSyntheticOutline0;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.ContactsAdapter;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomPagesView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PagerSlidingTabStrip;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.ProfileGalleryBlurView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.IntroActivity.AnonymousClass5;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichTextCell;

public final class IntroActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public BottomPagesView bottomPages;
    public final int currentAccount;
    public long currentDate;
    public int currentViewPagerPage;
    public RLottieDrawable darkThemeDrawable;
    public boolean destroyed;
    public boolean dragging;
    public EGLThread eglThread;
    public AnonymousClass1 frameContainerView;
    public FrameLayout frameLayout2;
    public boolean isOnLogout;
    public boolean justCreated;
    public int lastPage;
    public LocaleController.LocaleInfo localeInfo;
    public Drawable logoDrawable;
    public String[] messages;
    public final Object pagerHeaderTag;
    public final Object pagerMessageTag;
    public AnonymousClass4 startMessagingButton;
    public GradientDrawable startMessagingButtonBackground;
    public boolean startPressed;
    public TextView switchLanguageTextView;
    public CharSequence[] titles;
    public ViewPager viewPager;

    public final class AnonymousClass1 extends FrameLayout {
        public final int $r8$classId;
        public final Object this$0;
        public Object val$themeFrameLayout;

        public AnonymousClass1(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            char c;
            float f;
            ?? r10;
            float f2;
            float f3;
            BaseCell.RippleDrawableSafe rippleDrawableSafe;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 4:
                    super.dispatchDraw(canvas);
                    Paint paint = (Paint) this.val$themeFrameLayout;
                    paint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, ((BaseFragment) BoostsActivity.this).resourceProvider));
                    canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                    break;
                case 5:
                    RectF rectF = (RectF) this.val$themeFrameLayout;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    ChatLoadingCell chatLoadingCell = (ChatLoadingCell) obj;
                    int measuredWidth = chatLoadingCell.getMeasuredWidth();
                    int i = chatLoadingCell.backgroundHeight;
                    float x = chatLoadingCell.getX();
                    float f4 = chatLoadingCell.viewTop;
                    Theme.ResourcesProvider resourcesProvider = chatLoadingCell.resourcesProvider;
                    if (resourcesProvider != null) {
                        resourcesProvider.applyServiceShaderMatrix(x, f4, measuredWidth, i);
                    } else {
                        Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, measuredWidth, i, x, f4);
                    }
                    float fDp = AndroidUtilities.dp(18.0f);
                    float fDp2 = AndroidUtilities.dp(18.0f);
                    Paint paint2 = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackground") : null;
                    if (paint2 == null) {
                        paint2 = Theme.getThemePaint("paintChatActionBackground");
                    }
                    canvas.drawRoundRect(rectF, fDp, fDp2, paint2);
                    if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
                        float fDp3 = AndroidUtilities.dp(18.0f);
                        float fDp4 = AndroidUtilities.dp(18.0f);
                        Paint paint3 = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackgroundDarken") : null;
                        if (paint3 == null) {
                            paint3 = Theme.getThemePaint("paintChatActionBackgroundDarken");
                        }
                        canvas.drawRoundRect(rectF, fDp3, fDp4, paint3);
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 6:
                    super.dispatchDraw(canvas);
                    Paint paint4 = (Paint) this.val$themeFrameLayout;
                    paint4.setColor(Theme.getColor(Theme.key_windowBackgroundGray, ChannelBoostLayout.this.resourcesProvider));
                    canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                    break;
                case 7:
                    float fDp5 = AndroidUtilities.dp(20.0f);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                    Path path = (Path) this.val$themeFrameLayout;
                    path.rewind();
                    path.addRoundRect(rectF2, fDp5, fDp5, Path.Direction.CW);
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                    canvas.clipPath(path);
                    canvas.saveLayerAlpha(rectF2, 255, 31);
                    super.dispatchDraw(canvas);
                    rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                    GradientClip gradientClip = (GradientClip) obj;
                    gradientClip.draw(canvas, rectF2, 1, 1.0f);
                    rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                    gradientClip.draw(canvas, rectF2, 3, 1.0f);
                    canvas.restore();
                    canvas.restore();
                    break;
                case 8:
                    super.dispatchDraw(canvas);
                    Paint paint5 = (Paint) this.val$themeFrameLayout;
                    paint5.setColor(((ChatThemeBottomSheet) obj).getThemedColor(Theme.key_divider));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                    break;
                case 9:
                    EmojiView.SearchField searchField = (EmojiView.SearchField) obj;
                    if (!EmojiView.this.shouldDrawBackground && searchField.inputBoxGradientAlpha > 0.0f) {
                        if (((Paint) this.val$themeFrameLayout) == null) {
                            Paint paint6 = new Paint();
                            this.val$themeFrameLayout = paint6;
                            paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            ((Paint) this.val$themeFrameLayout).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        }
                        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                        super.dispatchDraw(canvas);
                        ((Paint) this.val$themeFrameLayout).setAlpha((int) (searchField.inputBoxGradientAlpha * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.val$themeFrameLayout);
                        canvas.restore();
                    } else {
                        super.dispatchDraw(canvas);
                    }
                    break;
                case 10:
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.val$themeFrameLayout;
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = (AnimatedTextView.AnimatedTextDrawable) obj;
                    int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(18.83f), animatedTextDrawable2.isNotEmpty());
                    animatedTextDrawable.setBounds(getPaddingLeft(), iLerp - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + iLerp);
                    animatedTextDrawable.draw(canvas);
                    int iDp = AndroidUtilities.dp(39.5f);
                    animatedTextDrawable2.setBounds(getPaddingLeft(), iDp - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + iDp);
                    animatedTextDrawable2.draw(canvas);
                    break;
                case 11:
                case 13:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 12:
                    ((PremiumGradient.PremiumGradientTools) this.val$themeFrameLayout).gradientMatrix(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                    canvas.save();
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    PremiumGradient.PremiumGradientTools premiumGradientTools = (PremiumGradient.PremiumGradientTools) this.val$themeFrameLayout;
                    premiumGradientTools.paint.setAlpha(((PremiumFeatureBottomSheet) obj).gradientAlpha);
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, premiumGradientTools.paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    break;
                case 15:
                    ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) obj;
                    int i2 = reactionsContainerLayout.type;
                    int alphaComponent = (i2 == 1 || i2 == 2 || i2 == 4) ? ColorUtils.setAlphaComponent(-1, 30) : ColorUtils.blendARGB(0.7f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, reactionsContainerLayout.resourcesProvider), Theme.getColor(Theme.key_dialogBackground, reactionsContainerLayout.resourcesProvider));
                    Paint paint7 = (Paint) this.val$themeFrameLayout;
                    paint7.setColor(alphaComponent);
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    float measuredWidth2 = getMeasuredWidth() / 2.0f;
                    View childAt = getChildAt(0);
                    float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                    float fExpandSize = reactionsContainerLayout.expandSize();
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - fExpandSize, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + fExpandSize);
                    canvas.save();
                    canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                    canvas.drawRoundRect(rectF4, measuredWidth3, measuredWidth3, paint7);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(0.0f, fExpandSize);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                case 16:
                    GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) obj;
                    gradientProtectionDrawable.setColor(Theme.multAlpha(0.65f, Theme.getColor(Theme.key_windowBackgroundWhite, (Theme.ResourcesProvider) this.val$themeFrameLayout)));
                    gradientProtectionDrawable.draw(canvas);
                    super.dispatchDraw(canvas);
                    break;
                case 22:
                    super.dispatchDraw(canvas);
                    ProfileActivity profileActivity = (ProfileActivity) obj;
                    View view = profileActivity.transitionOnlineText;
                    SimpleTextView[] simpleTextViewArr = profileActivity.onlineTextView;
                    if (view != null) {
                        canvas.save();
                        canvas.translate(simpleTextViewArr[0].getX(), simpleTextViewArr[0].getY());
                        c = 2;
                        f = 0.0f;
                        r10 = 0;
                        f2 = 24.0f;
                        f3 = 14.0f;
                        canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.transitionOnlineText.getMeasuredWidth(), profileActivity.transitionOnlineText.getMeasuredHeight(), (int) 255.0f, 31);
                        profileActivity.transitionOnlineText.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                        invalidate();
                    } else {
                        c = 2;
                        f = 0.0f;
                        r10 = 0;
                        f2 = 24.0f;
                        f3 = 14.0f;
                    }
                    if (profileActivity.hasFallbackPhoto && profileActivity.photoDescriptionProgress != f && profileActivity.customAvatarProgress != 1.0f) {
                        float measuredHeight2 = (simpleTextViewArr[1].getMeasuredHeight() / 2.0f) + simpleTextViewArr[1].getY();
                        float fDp6 = AndroidUtilities.dp(22.0f);
                        float x2 = ((simpleTextViewArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.customPhotoOffset)) - fDp6) - profileActivity.getRatingViewTranslationXOffset();
                        profileActivity.fallbackImage.setImageCoords(x2, measuredHeight2 - (fDp6 / 2.0f), fDp6, fDp6);
                        profileActivity.fallbackImage.setAlpha(profileActivity.photoDescriptionProgress);
                        canvas.save();
                        float f5 = profileActivity.photoDescriptionProgress;
                        canvas.scale(f5, f5, profileActivity.fallbackImage.getCenterX(), profileActivity.fallbackImage.getCenterY());
                        profileActivity.fallbackImage.draw(canvas);
                        canvas.restore();
                        if (profileActivity.customAvatarProgress == f) {
                            if (((CanvasButton) this.val$themeFrameLayout) == null) {
                                CanvasButton canvasButton = new CanvasButton(this);
                                this.val$themeFrameLayout = canvasButton;
                                canvasButton.delegate = new PhotoViewer$$ExternalSyntheticLambda21(this, 28);
                            }
                            float fDp7 = (1.0f - profileActivity.customAvatarProgress) * AndroidUtilities.dp(28.0f);
                            float textWidth = simpleTextViewArr[c].getTextWidth();
                            float fMax = Math.max(textWidth, profileActivity.ratingView != null ? (AndroidUtilities.dp(f2) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.ratingView.getVisibilityFactor() : 0.0f) + fDp7;
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set(x2 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f3), x2 + fMax + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f3));
                            CanvasButton canvasButton2 = (CanvasButton) this.val$themeFrameLayout;
                            canvasButton2.pathCreated = r10;
                            canvasButton2.usingRectCount = r10;
                            canvasButton2.addRect(rectF5);
                            CanvasButton canvasButton3 = (CanvasButton) this.val$themeFrameLayout;
                            canvasButton3.rounded = true;
                            int alphaComponent2 = ColorUtils.setAlphaComponent(-1, 50);
                            canvasButton3.paint.setColor((int) r10);
                            BaseCell.RippleDrawableSafe rippleDrawableSafe2 = canvasButton3.selectorDrawable;
                            if (rippleDrawableSafe2 != null) {
                                Theme.setSelectorDrawableColor(rippleDrawableSafe2, alphaComponent2, true);
                            }
                            CanvasButton canvasButton4 = (CanvasButton) this.val$themeFrameLayout;
                            canvasButton4.drawInternal(canvas, canvasButton4.paint);
                            BaseCell.RippleDrawableSafe rippleDrawableSafe3 = canvasButton4.selectorDrawable;
                            if (rippleDrawableSafe3 != null) {
                                rippleDrawableSafe3.draw(canvas);
                            }
                            break;
                        } else {
                            CanvasButton canvasButton5 = (CanvasButton) this.val$themeFrameLayout;
                            if (canvasButton5 != null && (rippleDrawableSafe = canvasButton5.selectorDrawable) != null) {
                                rippleDrawableSafe.setState(StateSet.NOTHING);
                                rippleDrawableSafe.jumpToCurrentState();
                                break;
                            }
                        }
                    }
                    break;
                case 23:
                    QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) obj;
                    if (themeListViewController.prevIsPortrait) {
                        Rect rect = (Rect) this.val$themeFrameLayout;
                        themeListViewController.backgroundDrawable.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                        themeListViewController.backgroundDrawable.draw(canvas);
                    } else {
                        RectF rectF6 = AndroidUtilities.rectTmp;
                        rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), themeListViewController.backgroundPaint);
                    }
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 14:
                    if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.this$0;
                    if (!customEmojiReactionsWindow.enterTransitionFinished) {
                        return true;
                    }
                    customEmojiReactionsWindow.dismiss();
                    return true;
                default:
                    return super.dispatchKeyEvent(keyEvent);
            }
        }

        @Override
        public void dispatchSetPressed(boolean z) {
            switch (this.$r8$classId) {
                case 14:
                    break;
                default:
                    super.dispatchSetPressed(z);
                    break;
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 2:
                    ArticleViewer articleViewer = (ArticleViewer) this.this$0;
                    TextSelectionHelper.TextSelectionOverlay overlayView = articleViewer.textSelectionHelperBottomSheet.getOverlayView(getContext());
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    LinearLayout linearLayout = (LinearLayout) this.val$themeFrameLayout;
                    motionEventObtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                    if (articleViewer.textSelectionHelperBottomSheet.isInSelectionMode() && articleViewer.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
                        return true;
                    }
                    if (overlayView.checkOnTap(motionEvent)) {
                        motionEvent.setAction(3);
                    }
                    if (motionEvent.getAction() != 0 || !articleViewer.textSelectionHelperBottomSheet.isInSelectionMode() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (articleViewer.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                case 16:
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                case 17:
                    int action = motionEvent.getAction();
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.consumingChild != null) {
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                        motionEventObtain2.offsetLocation(rTMPStreamPipOverlay.consumingChild.getX(), rTMPStreamPipOverlay.consumingChild.getY());
                        boolean zDispatchTouchEvent = rTMPStreamPipOverlay.consumingChild.dispatchTouchEvent(motionEvent);
                        motionEventObtain2.recycle();
                        if (action == 1 || action == 3) {
                            rTMPStreamPipOverlay.consumingChild = null;
                        }
                        if (zDispatchTouchEvent) {
                            return true;
                        }
                    }
                    MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                    motionEventObtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                    boolean zOnTouchEvent = rTMPStreamPipOverlay.scaleGestureDetector.onTouchEvent(motionEventObtain3);
                    motionEventObtain3.recycle();
                    boolean z = !rTMPStreamPipOverlay.scaleGestureDetector.isInProgress() && ((GestureDetector) rTMPStreamPipOverlay.gestureDetector.zza).onTouchEvent(motionEvent);
                    if (action == 1 || action == 3) {
                        rTMPStreamPipOverlay.isScrolling = false;
                        rTMPStreamPipOverlay.isScrollDisallowed = false;
                        SpringAnimation springAnimation = rTMPStreamPipOverlay.pipXSpring;
                        if (!springAnimation.mRunning) {
                            float f = rTMPStreamPipOverlay.pipX;
                            springAnimation.mValue = f;
                            springAnimation.mStartValueIsSet = true;
                            SpringForce springForce = springAnimation.mSpring;
                            int i = rTMPStreamPipOverlay.pipWidth;
                            float f2 = (i / 2.0f) + f;
                            int i2 = AndroidUtilities.displaySize.x;
                            springForce.mFinalPosition = f2 >= ((float) i2) / 2.0f ? (i2 - i) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            rTMPStreamPipOverlay.pipXSpring.start();
                        }
                        SpringAnimation springAnimation2 = rTMPStreamPipOverlay.pipYSpring;
                        if (!springAnimation2.mRunning) {
                            float f3 = rTMPStreamPipOverlay.pipY;
                            springAnimation2.mValue = f3;
                            springAnimation2.mStartValueIsSet = true;
                            springAnimation2.mSpring.mFinalPosition = MathUtils.clamp(f3, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rTMPStreamPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                            rTMPStreamPipOverlay.pipYSpring.start();
                        }
                    }
                    return zOnTouchEvent || z;
                case 28:
                    int action2 = motionEvent.getAction();
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.consumingChild != null) {
                        MotionEvent motionEventObtain4 = MotionEvent.obtain(motionEvent);
                        motionEventObtain4.offsetLocation(liveStoryPipOverlay.consumingChild.getX(), liveStoryPipOverlay.consumingChild.getY());
                        boolean zDispatchTouchEvent2 = liveStoryPipOverlay.consumingChild.dispatchTouchEvent(motionEvent);
                        motionEventObtain4.recycle();
                        if (action2 == 1 || action2 == 3) {
                            liveStoryPipOverlay.consumingChild = null;
                        }
                        if (zDispatchTouchEvent2) {
                            return true;
                        }
                    }
                    MotionEvent motionEventObtain5 = MotionEvent.obtain(motionEvent);
                    motionEventObtain5.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                    boolean zOnTouchEvent2 = liveStoryPipOverlay.scaleGestureDetector.onTouchEvent(motionEventObtain5);
                    motionEventObtain5.recycle();
                    boolean z2 = !liveStoryPipOverlay.scaleGestureDetector.isInProgress() && ((GestureDetector) liveStoryPipOverlay.gestureDetector.zza).onTouchEvent(motionEvent);
                    if (action2 == 1 || action2 == 3) {
                        liveStoryPipOverlay.isScrolling = false;
                        liveStoryPipOverlay.isScrollDisallowed = false;
                        SpringAnimation springAnimation3 = liveStoryPipOverlay.pipXSpring;
                        if (!springAnimation3.mRunning) {
                            float f4 = liveStoryPipOverlay.pipX;
                            springAnimation3.mValue = f4;
                            springAnimation3.mStartValueIsSet = true;
                            SpringForce springForce2 = springAnimation3.mSpring;
                            int i3 = liveStoryPipOverlay.pipWidth;
                            float f5 = (i3 / 2.0f) + f4;
                            int i4 = AndroidUtilities.displaySize.x;
                            springForce2.mFinalPosition = f5 >= ((float) i4) / 2.0f ? (i4 - i3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            liveStoryPipOverlay.pipXSpring.start();
                        }
                        SpringAnimation springAnimation4 = liveStoryPipOverlay.pipYSpring;
                        if (!springAnimation4.mRunning) {
                            float f6 = liveStoryPipOverlay.pipY;
                            springAnimation4.mValue = f6;
                            springAnimation4.mStartValueIsSet = true;
                            springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(f6, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - liveStoryPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                            liveStoryPipOverlay.pipYSpring.start();
                        }
                    }
                    return zOnTouchEvent2 || z2;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            boolean z2;
            switch (this.$r8$classId) {
                case 11:
                    LPhotoPaintView.PopupButton popupButton = (LPhotoPaintView.PopupButton) this.this$0;
                    if (popupButton.imageSwitchAnimator == null || (!((z = popupButton.imageSwitchFill) && view == popupButton.image2View) && (z || view != popupButton.imageView))) {
                        return super.drawChild(canvas, view, j);
                    }
                    float measuredWidth = ((z ? popupButton.imageSwitchT : 1.0f - popupButton.imageSwitchT) * getMeasuredWidth()) / 2.0f;
                    canvas.save();
                    Path path = (Path) this.val$themeFrameLayout;
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                case 19:
                    if (view instanceof PaintingOverlay) {
                        return false;
                    }
                    return super.drawChild(canvas, view, j);
                case 24:
                    return view != ((SecretMediaViewer) this.val$themeFrameLayout).aspectRatioFrameLayout && super.drawChild(canvas, view, j);
                case 25:
                    SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) this.this$0;
                    if (view == secretVoicePlayer.myCell || view == secretVoicePlayer.hintView) {
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(secretVoicePlayer.clipTop, 0.0f, secretVoicePlayer.openProgress), getWidth(), AndroidUtilities.lerp(secretVoicePlayer.clipBottom, getHeight(), secretVoicePlayer.openProgress));
                        boolean zDrawChild2 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild2;
                    }
                    if (view != secretVoicePlayer.textureView) {
                        return super.drawChild(canvas, view, j);
                    }
                    canvas.save();
                    Path path2 = (Path) this.val$themeFrameLayout;
                    path2.rewind();
                    path2.addCircle(secretVoicePlayer.rect.centerX() + secretVoicePlayer.myCell.getX(), secretVoicePlayer.rect.centerY() + secretVoicePlayer.myCell.getY(), secretVoicePlayer.rect.width() / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path2);
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(secretVoicePlayer.clipTop, 0.0f, secretVoicePlayer.openProgress), getWidth(), AndroidUtilities.lerp(secretVoicePlayer.clipBottom, getHeight(), secretVoicePlayer.openProgress));
                    canvas.translate(-secretVoicePlayer.textureView.getX(), -secretVoicePlayer.textureView.getY());
                    canvas.translate(secretVoicePlayer.myCell.getX() + secretVoicePlayer.rect.left, secretVoicePlayer.myCell.getY() + secretVoicePlayer.rect.top);
                    canvas.scale(secretVoicePlayer.rect.width() / secretVoicePlayer.textureView.getMeasuredWidth(), secretVoicePlayer.rect.height() / secretVoicePlayer.textureView.getMeasuredHeight(), secretVoicePlayer.textureView.getX(), secretVoicePlayer.textureView.getY());
                    boolean zDrawChild3 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild3;
                case 26:
                    if (view != ((SelectAnimatedEmojiDialog) this.this$0).emojiGridView || !HwEmojis.hwEnabled || !HwEmojis.isCascade) {
                        return super.drawChild(canvas, view, j);
                    }
                    for (int i = 0; i < ((SelectAnimatedEmojiDialog) this.this$0).emojiGridView.getChildCount(); i++) {
                        View childAt = ((SelectAnimatedEmojiDialog) this.this$0).emojiGridView.getChildAt(i);
                        if (childAt instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) childAt;
                            if (imageViewEmoji.getAnimatedScale() == 1.0f) {
                                ((Rect) this.val$themeFrameLayout).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.val$themeFrameLayout);
                                super.drawChild(canvas, view, j);
                                canvas.restore();
                            } else if (imageViewEmoji.getAnimatedScale() > 0.0f) {
                                ((Rect) this.val$themeFrameLayout).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.val$themeFrameLayout;
                                rect.set((int) (rect.centerX() - (imageViewEmoji.getAnimatedScale() * (((Rect) this.val$themeFrameLayout).width() / 2.0f))), (int) (((Rect) this.val$themeFrameLayout).centerY() - (imageViewEmoji.getAnimatedScale() * (((Rect) this.val$themeFrameLayout).height() / 2.0f))), (int) ((imageViewEmoji.getAnimatedScale() * (((Rect) this.val$themeFrameLayout).width() / 2.0f)) + ((Rect) this.val$themeFrameLayout).centerX()), (int) ((imageViewEmoji.getAnimatedScale() * (((Rect) this.val$themeFrameLayout).height() / 2.0f)) + ((Rect) this.val$themeFrameLayout).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.val$themeFrameLayout);
                                canvas.scale(imageViewEmoji.getAnimatedScale(), imageViewEmoji.getAnimatedScale(), ((Rect) this.val$themeFrameLayout).centerX(), ((Rect) this.val$themeFrameLayout).centerY());
                                super.drawChild(canvas, view, j);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof SelectAnimatedEmojiDialog.EmojiPackExpand) || (childAt instanceof SelectAnimatedEmojiDialog.EmojiPackButton) || (childAt instanceof SelectAnimatedEmojiDialog.HeaderView)) {
                            ((Rect) this.val$themeFrameLayout).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.val$themeFrameLayout);
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                        }
                    }
                    return false;
                case 29:
                    PaintView.PopupButton popupButton2 = (PaintView.PopupButton) this.this$0;
                    if (popupButton2.imageSwitchAnimator == null || (!((z2 = popupButton2.imageSwitchFill) && view == popupButton2.image2View) && (z2 || view != popupButton2.imageView))) {
                        return super.drawChild(canvas, view, j);
                    }
                    float measuredWidth2 = ((z2 ? popupButton2.imageSwitchT : 1.0f - popupButton2.imageSwitchT) * getMeasuredWidth()) / 2.0f;
                    canvas.save();
                    Path path3 = (Path) this.val$themeFrameLayout;
                    path3.rewind();
                    path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth2, Path.Direction.CW);
                    canvas.clipPath(path3);
                    boolean zDrawChild4 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild4;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public boolean fitSystemWindows(Rect rect) {
            switch (this.$r8$classId) {
                case 14:
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.this$0;
                    float f = customEmojiReactionsWindow.keyboardHeight;
                    float f2 = rect.bottom;
                    if (f != f2 && customEmojiReactionsWindow.wasFocused) {
                        customEmojiReactionsWindow.keyboardHeight = f2;
                        if (!customEmojiReactionsWindow.dismissed) {
                            float measuredHeight = customEmojiReactionsWindow.yTranslation;
                            int iDp = AndroidUtilities.dp(32.0f);
                            int i = customEmojiReactionsWindow.type;
                            if (i == 1 || i == 2) {
                                iDp = AndroidUtilities.dp(24.0f);
                            }
                            CustomEmojiReactionsWindow.ContainerView containerView = customEmojiReactionsWindow.containerView;
                            float measuredHeight2 = containerView.getMeasuredHeight() + measuredHeight;
                            AnonymousClass1 anonymousClass1 = customEmojiReactionsWindow.windowView;
                            float f3 = iDp;
                            if (measuredHeight2 > (anonymousClass1.getMeasuredHeight() - customEmojiReactionsWindow.keyboardHeight) - f3) {
                                measuredHeight = ((anonymousClass1.getMeasuredHeight() - customEmojiReactionsWindow.keyboardHeight) - containerView.getMeasuredHeight()) - f3;
                            }
                            if (measuredHeight < 0.0f) {
                                measuredHeight = 0.0f;
                            }
                            containerView.animate().translationY(measuredHeight).setDuration(250L).setUpdateListener(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda0(customEmojiReactionsWindow, 1)).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                    }
                    return super.fitSystemWindows(rect);
                default:
                    return super.fitSystemWindows(rect);
            }
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 13:
                    super.onAttachedToWindow();
                    ((ChatCustomReactionsEditActivity$2$1) this.val$themeFrameLayout).onAttach();
                    break;
                case 14:
                    super.onAttachedToWindow();
                    Bulletin.addDelegate(this, (ChatActivity.AnonymousClass103) this.val$themeFrameLayout);
                    break;
                case 19:
                    super.onAttachedToWindow();
                    ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.this$0;
                    contentPreviewViewer.centerImage.onAttachedToWindow();
                    contentPreviewViewer.effectImage.onAttachedToWindow();
                    break;
                case 22:
                    super.onAttachedToWindow();
                    ((ProfileActivity) this.this$0).fallbackImage.onAttachedToWindow();
                    break;
                case 24:
                    super.onAttachedToWindow();
                    ((SecretMediaViewer) this.val$themeFrameLayout).centerImage.onAttachedToWindow();
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            switch (this.$r8$classId) {
                case 17:
                    AndroidUtilities.checkDisplaySize(getContext(), configuration);
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    AndroidUtilities.setPreferredMaxRefreshRate(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
                    rTMPStreamPipOverlay.bindTextureView(false);
                    break;
                case 28:
                    AndroidUtilities.checkDisplaySize(getContext(), configuration);
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    AndroidUtilities.setPreferredMaxRefreshRate(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                    liveStoryPipOverlay.bindTextureView$1$1();
                    break;
                default:
                    super.onConfigurationChanged(configuration);
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 13:
                    super.onDetachedFromWindow();
                    ((ChatCustomReactionsEditActivity$2$1) this.val$themeFrameLayout).onDetach();
                    break;
                case 14:
                    super.onDetachedFromWindow();
                    Bulletin.removeDelegate(this);
                    break;
                case 19:
                    super.onDetachedFromWindow();
                    ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.this$0;
                    contentPreviewViewer.centerImage.onDetachedFromWindow();
                    contentPreviewViewer.effectImage.onDetachedFromWindow();
                    break;
                case 22:
                    super.onDetachedFromWindow();
                    ((ProfileActivity) this.this$0).fallbackImage.onDetachedFromWindow();
                    break;
                case 24:
                    super.onDetachedFromWindow();
                    ((SecretMediaViewer) this.val$themeFrameLayout).centerImage.onDetachedFromWindow();
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            ColorDrawable colorDrawable;
            Drawable drawable;
            float f;
            float f2;
            float f3;
            float f4;
            int i;
            float f5;
            float f6;
            float fM;
            float fM2;
            float fM3;
            float fM4;
            float fM5;
            float fM6;
            float f7;
            boolean z;
            float f8;
            float f9;
            int i2;
            switch (this.$r8$classId) {
                case 18:
                    canvas.save();
                    VoIPPiPView voIPPiPView = (VoIPPiPView) this.this$0;
                    canvas.scale(voIPPiPView.floatingView.getScaleX(), voIPPiPView.floatingView.getScaleY(), voIPPiPView.floatingView.getPivotX() + voIPPiPView.floatingView.getLeft(), voIPPiPView.floatingView.getPivotY() + voIPPiPView.floatingView.getTop());
                    int left = voIPPiPView.floatingView.getLeft() - AndroidUtilities.dp(2.0f);
                    int top = voIPPiPView.floatingView.getTop() - AndroidUtilities.dp(2.0f);
                    int iDp = AndroidUtilities.dp(2.0f) + voIPPiPView.floatingView.getRight();
                    int iDp2 = AndroidUtilities.dp(2.0f) + voIPPiPView.floatingView.getBottom();
                    Drawable drawable2 = (Drawable) this.val$themeFrameLayout;
                    drawable2.setBounds(left, top, iDp, iDp2);
                    drawable2.draw(canvas);
                    canvas.restore();
                    super.onDraw(canvas);
                    break;
                case 19:
                    ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.val$themeFrameLayout;
                    if (contentPreviewViewer.containerView != null && (colorDrawable = contentPreviewViewer.backgroundDrawable) != null) {
                        boolean z2 = contentPreviewViewer.menuVisible;
                        ImageReceiver imageReceiver = contentPreviewViewer.centerImage;
                        if (z2 && contentPreviewViewer.blurrBitmap == null && contentPreviewViewer.parentActivity != null && !contentPreviewViewer.preparingBitmap) {
                            contentPreviewViewer.preparingBitmap = true;
                            imageReceiver.setVisible(false, false);
                            ScrimOptions.makeGlobalBlurBitmaps(new GiftSheet$$ExternalSyntheticLambda8(contentPreviewViewer, 16));
                        }
                        if (contentPreviewViewer.blurrBitmap != null) {
                            boolean z3 = contentPreviewViewer.menuVisible;
                            if (z3) {
                                float f10 = contentPreviewViewer.blurProgress;
                                if (f10 != 1.0f) {
                                    float f11 = f10 + 0.13333334f;
                                    contentPreviewViewer.blurProgress = f11;
                                    if (f11 > 1.0f) {
                                        contentPreviewViewer.blurProgress = 1.0f;
                                    }
                                    contentPreviewViewer.containerView.invalidate();
                                } else if (!z3) {
                                    f = contentPreviewViewer.blurProgress;
                                    if (f != 0.0f) {
                                        f2 = f - 0.13333334f;
                                        contentPreviewViewer.blurProgress = f2;
                                        if (f2 < 0.0f) {
                                            contentPreviewViewer.blurProgress = 0.0f;
                                        }
                                        contentPreviewViewer.containerView.invalidate();
                                    }
                                }
                            } else if (!z3) {
                                f = contentPreviewViewer.blurProgress;
                                if (f != 0.0f) {
                                    f2 = f - 0.13333334f;
                                    contentPreviewViewer.blurProgress = f2;
                                    if (f2 < 0.0f) {
                                        contentPreviewViewer.blurProgress = 0.0f;
                                    }
                                    contentPreviewViewer.containerView.invalidate();
                                }
                            }
                            float f12 = contentPreviewViewer.blurProgress;
                            if (f12 != 0.0f && contentPreviewViewer.blurrBitmap != null) {
                                Paint paint = contentPreviewViewer.paint;
                                paint.setAlpha((int) (f12 * 255.0f));
                                if (paint.getAlpha() != 255) {
                                    canvas.drawColor(Theme.multAlpha(contentPreviewViewer.blurProgress, Theme.getColor(Theme.key_windowBackgroundGray, contentPreviewViewer.resourcesProvider)));
                                }
                                canvas.drawPaint(paint);
                            }
                        }
                        colorDrawable.setAlpha((int) (contentPreviewViewer.showProgress * 180.0f));
                        colorDrawable.setBounds(0, 0, contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight());
                        colorDrawable.draw(canvas);
                        canvas.save();
                        Insets insets = contentPreviewViewer.lastInsets;
                        int i3 = insets.bottom;
                        int i4 = insets.top;
                        int i5 = i3 + i4;
                        int iMin = contentPreviewViewer.currentContentType == 1 ? Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i5) - AndroidUtilities.dp(40.0f) : (int) (contentPreviewViewer.drawEffect ? Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i5) - AndroidUtilities.dpf2(40.0f) : Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i5) / 1.8f);
                        float fMax = Math.max((iMin / 2) + i4 + (contentPreviewViewer.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((contentPreviewViewer.containerView.getHeight() - i5) - contentPreviewViewer.keyboardHeight) / 2);
                        if (contentPreviewViewer.drawEffect) {
                            fMax += AndroidUtilities.dp(40.0f);
                        }
                        canvas.translate(contentPreviewViewer.containerView.getWidth() / 2, contentPreviewViewer.moveY + fMax);
                        int i6 = (int) (iMin * ((contentPreviewViewer.showProgress * 0.8f) / 0.8f));
                        if (contentPreviewViewer.currentContentType == 3) {
                            canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                        }
                        boolean z4 = contentPreviewViewer.drawEffect;
                        ImageReceiver imageReceiver2 = contentPreviewViewer.effectImage;
                        if (z4) {
                            float f13 = i6;
                            float f14 = 0.6669f * f13;
                            imageReceiver.setAlpha(contentPreviewViewer.showProgress);
                            float f15 = f13 - f14;
                            float f16 = f13 / 2.0f;
                            imageReceiver.setImageCoords((f15 - f16) - (0.0546875f * f13), (f15 / 2.0f) - f16, f14, f14);
                            imageReceiver.draw(canvas);
                            imageReceiver2.setAlpha(contentPreviewViewer.showProgress);
                            float f17 = (-i6) / 2.0f;
                            imageReceiver2.setImageCoords(f17, f17, f13, f13);
                            imageReceiver2.draw(canvas);
                        } else {
                            imageReceiver.setAlpha(contentPreviewViewer.showProgress);
                            float f18 = (-i6) / 2.0f;
                            float f19 = i6;
                            imageReceiver.setImageCoords(f18, f18, f19, f19);
                            imageReceiver.draw(canvas);
                        }
                        if (contentPreviewViewer.paintingOverlay != null) {
                            canvas.save();
                            float f20 = (-i6) / 2.0f;
                            canvas.translate(f20, f20);
                            float f21 = i6;
                            canvas.scale(f21 / contentPreviewViewer.paintingOverlay.getWidth(), f21 / contentPreviewViewer.paintingOverlay.getHeight());
                            contentPreviewViewer.paintingOverlay.setAlpha(contentPreviewViewer.showProgress);
                            if (contentPreviewViewer.paintingOverlayClipPath == null) {
                                contentPreviewViewer.paintingOverlayClipPath = new Path();
                            }
                            contentPreviewViewer.paintingOverlayClipPath.rewind();
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, contentPreviewViewer.paintingOverlay.getWidth(), contentPreviewViewer.paintingOverlay.getHeight());
                            float f22 = f21 / 8.0f;
                            contentPreviewViewer.paintingOverlayClipPath.addRoundRect(rectF, f22, f22, Path.Direction.CW);
                            canvas.clipPath(contentPreviewViewer.paintingOverlayClipPath);
                            contentPreviewViewer.paintingOverlay.draw(canvas);
                            canvas.restore();
                        }
                        if (contentPreviewViewer.currentContentType == 1 && !contentPreviewViewer.isPhotoEditor && (drawable = contentPreviewViewer.slideUpDrawable) != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth();
                            int intrinsicHeight = contentPreviewViewer.slideUpDrawable.getIntrinsicHeight();
                            int iDp3 = (int) (imageReceiver.getDrawRegion().top - AndroidUtilities.dp(((contentPreviewViewer.currentMoveY / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                            contentPreviewViewer.slideUpDrawable.setAlpha((int) ((1.0f - contentPreviewViewer.currentMoveYProgress) * 255.0f));
                            contentPreviewViewer.slideUpDrawable.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + iDp3, intrinsicWidth / 2, iDp3);
                            contentPreviewViewer.slideUpDrawable.draw(canvas);
                        }
                        StaticLayout staticLayout = contentPreviewViewer.stickerEmojiLayout;
                        if (staticLayout != null) {
                            if (contentPreviewViewer.drawEffect) {
                                canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                            } else {
                                canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                            }
                            ContentPreviewViewer.textPaint.setAlpha((int) (contentPreviewViewer.showProgress * 255.0f));
                            contentPreviewViewer.stickerEmojiLayout.draw(canvas);
                        }
                        canvas.restore();
                        if (contentPreviewViewer.isVisible) {
                            if (contentPreviewViewer.showProgress != 1.0f) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = jCurrentTimeMillis - contentPreviewViewer.lastUpdateTime;
                                contentPreviewViewer.lastUpdateTime = jCurrentTimeMillis;
                                contentPreviewViewer.showProgress = (j / 120.0f) + contentPreviewViewer.showProgress;
                                contentPreviewViewer.containerView.invalidate();
                                if (contentPreviewViewer.showProgress > 1.0f) {
                                    contentPreviewViewer.showProgress = 1.0f;
                                }
                            }
                        } else if (contentPreviewViewer.showProgress != 0.0f) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j2 = jCurrentTimeMillis2 - contentPreviewViewer.lastUpdateTime;
                            contentPreviewViewer.lastUpdateTime = jCurrentTimeMillis2;
                            contentPreviewViewer.showProgress -= j2 / 120.0f;
                            contentPreviewViewer.containerView.invalidate();
                            if (contentPreviewViewer.showProgress < 0.0f) {
                                contentPreviewViewer.showProgress = 0.0f;
                            }
                            if (contentPreviewViewer.showProgress == 0.0f) {
                                imageReceiver.setImageBitmap((Drawable) null);
                                AndroidUtilities.unlockOrientation(contentPreviewViewer.parentActivity);
                                AndroidUtilities.runOnUIThread(new ContentPreviewViewer$$ExternalSyntheticLambda0(contentPreviewViewer, 1));
                                Bitmap bitmap = contentPreviewViewer.blurrBitmap;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    contentPreviewViewer.blurrBitmap = null;
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(contentPreviewViewer.unlockPremiumView, false, 1.0f, false);
                                contentPreviewViewer.blurProgress = 0.0f;
                                try {
                                    if (contentPreviewViewer.windowView.getParent() != null) {
                                        ((WindowManager) contentPreviewViewer.parentActivity.getSystemService("window")).removeView(contentPreviewViewer.windowView);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    }
                    break;
                case 24:
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.val$themeFrameLayout;
                    if (secretMediaViewer.isPhotoVisible) {
                        if (secretMediaViewer.imageMoveAnimation != null) {
                            Scroller scroller = secretMediaViewer.scroller;
                            if (!scroller.mFinished) {
                                scroller.abortAnimation();
                            }
                            float f23 = secretMediaViewer.scale;
                            float f24 = secretMediaViewer.animateToScale;
                            float f25 = secretMediaViewer.animationValue;
                            f5 = ((f24 - f23) * f25) + f23;
                            float f26 = secretMediaViewer.translationY;
                            float fM7 = DiffUtil.m(secretMediaViewer.animateToY, f26, f25, f26);
                            float f27 = secretMediaViewer.translationX;
                            fM = DiffUtil.m(secretMediaViewer.animateToX, f27, f25, f27);
                            float f28 = secretMediaViewer.clipTop;
                            fM2 = DiffUtil.m(secretMediaViewer.animateToClipTop, f28, f25, f28);
                            float f29 = secretMediaViewer.clipBottom;
                            f3 = -1.0f;
                            fM3 = DiffUtil.m(secretMediaViewer.animateToClipBottom, f29, f25, f29);
                            float f30 = secretMediaViewer.clipTopOrigin;
                            f4 = 1.0f;
                            fM4 = DiffUtil.m(secretMediaViewer.animateToClipTopOrigin, f30, f25, f30);
                            float f31 = secretMediaViewer.clipBottomOrigin;
                            fM5 = DiffUtil.m(secretMediaViewer.animateToClipBottomOrigin, f31, f25, f31);
                            float f32 = secretMediaViewer.clipHorizontal;
                            fM6 = DiffUtil.m(secretMediaViewer.animateToClipHorizontal, f32, f25, f32);
                            float f33 = (f24 == 1.0f && f23 == 1.0f && f27 == 0.0f) ? fM7 : -1.0f;
                            secretMediaViewer.containerView.invalidate();
                            f7 = fM7;
                            f6 = f33;
                            i = 0;
                        } else {
                            f3 = -1.0f;
                            f4 = 1.0f;
                            if (secretMediaViewer.animationStartTime != 0) {
                                secretMediaViewer.translationX = secretMediaViewer.animateToX;
                                secretMediaViewer.translationY = secretMediaViewer.animateToY;
                                secretMediaViewer.clipBottom = secretMediaViewer.animateToClipBottom;
                                secretMediaViewer.clipTop = secretMediaViewer.animateToClipTop;
                                secretMediaViewer.clipTopOrigin = secretMediaViewer.animateToClipTopOrigin;
                                secretMediaViewer.clipBottomOrigin = secretMediaViewer.animateToClipBottomOrigin;
                                secretMediaViewer.clipHorizontal = secretMediaViewer.animateToClipHorizontal;
                                float f34 = secretMediaViewer.animateToScale;
                                secretMediaViewer.scale = f34;
                                secretMediaViewer.animationStartTime = 0L;
                                secretMediaViewer.updateMinMax$1(f34);
                                i = 0;
                                secretMediaViewer.zoomAnimation = false;
                            } else {
                                i = 0;
                            }
                            Scroller scroller2 = secretMediaViewer.scroller;
                            if (!scroller2.mFinished && scroller2.computeScrollOffset()) {
                                Scroller scroller3 = secretMediaViewer.scroller;
                                float f35 = scroller3.mStartX;
                                if (f35 < secretMediaViewer.maxX && f35 > secretMediaViewer.minX) {
                                    secretMediaViewer.translationX = scroller3.mCurrX;
                                }
                                float f36 = scroller3.mStartY;
                                if (f36 < secretMediaViewer.maxY && f36 > secretMediaViewer.minY) {
                                    secretMediaViewer.translationY = scroller3.mCurrY;
                                }
                                secretMediaViewer.containerView.invalidate();
                            }
                            f5 = secretMediaViewer.scale;
                            f6 = secretMediaViewer.translationY;
                            fM = secretMediaViewer.translationX;
                            fM2 = secretMediaViewer.clipTop;
                            fM3 = secretMediaViewer.clipBottom;
                            fM4 = secretMediaViewer.clipTopOrigin;
                            fM5 = secretMediaViewer.clipBottomOrigin;
                            fM6 = secretMediaViewer.clipHorizontal;
                            if (secretMediaViewer.moving) {
                                f7 = f6;
                                f6 = -1.0f;
                            } else {
                                f7 = f6;
                            }
                        }
                        if (secretMediaViewer.animateFromRadius != null) {
                            if (secretMediaViewer.currentRadii == null) {
                                secretMediaViewer.currentRadii = new float[8];
                            }
                            float f37 = secretMediaViewer.animateToRadius ? secretMediaViewer.animationValue : f4 - secretMediaViewer.animationValue;
                            z = true;
                            for (int i7 = 8; i < i7; i7 = 8) {
                                float[] fArr = secretMediaViewer.currentRadii;
                                int i8 = i;
                                float fLerp = AndroidUtilities.lerp(secretMediaViewer.animateFromRadius[i / 2] * 2.0f, 0.0f, f37);
                                fArr[i + 1] = fLerp;
                                fArr[i8] = fLerp;
                                if (secretMediaViewer.currentRadii[i8] > 0.0f) {
                                    z = false;
                                }
                                i = i8 + 2;
                            }
                        } else {
                            z = true;
                        }
                        if (secretMediaViewer.photoAnimationInProgress != 3) {
                            float f38 = secretMediaViewer.scale;
                            SecretMediaViewer.PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.photoBackgroundDrawable;
                            if (f38 != f4 || f6 == f3 || secretMediaViewer.zoomAnimation) {
                                photoBackgroundDrawable.setAlpha(255);
                            } else {
                                float height = secretMediaViewer.containerView.getHeight() / 4.0f;
                                photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f4 - (Math.min(Math.abs(f6), height) / height)) * 255.0f));
                            }
                            if (secretMediaViewer.zoomAnimation) {
                                f8 = 0.0f;
                                f9 = 1.0f;
                            } else {
                                float f39 = secretMediaViewer.maxX;
                                if (fM > f39) {
                                    float fMin = Math.min(1.0f, (fM - f39) / canvas.getWidth());
                                    float f40 = 0.3f * fMin;
                                    f9 = 1.0f - fMin;
                                    fM = secretMediaViewer.maxX;
                                    f8 = f40;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 1.0f;
                                }
                            }
                        } else {
                            f8 = 0.0f;
                            f9 = 1.0f;
                        }
                        AspectRatioFrameLayout aspectRatioFrameLayout = secretMediaViewer.aspectRatioFrameLayout;
                        boolean z5 = aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0;
                        canvas.save();
                        float f41 = f5 - f8;
                        canvas.translate((secretMediaViewer.containerView.getWidth() / 2) + fM, (secretMediaViewer.containerView.getHeight() / 2) + f7);
                        canvas.scale(f41, f41);
                        ImageReceiver imageReceiver3 = secretMediaViewer.centerImage;
                        int bitmapWidth = imageReceiver3.getBitmapWidth();
                        int bitmapHeight = imageReceiver3.getBitmapHeight();
                        int i9 = secretMediaViewer.videoWidth;
                        if (i9 != 0 && (i2 = secretMediaViewer.videoHeight) != 0) {
                            bitmapWidth = i9;
                            bitmapHeight = i2;
                        }
                        if (z5 && secretMediaViewer.textureUploaded && Math.abs((bitmapWidth / bitmapHeight) - (secretMediaViewer.videoTextureView.getMeasuredWidth() / secretMediaViewer.videoTextureView.getMeasuredHeight())) > 0.01f) {
                            bitmapWidth = secretMediaViewer.videoTextureView.getMeasuredWidth();
                            bitmapHeight = secretMediaViewer.videoTextureView.getMeasuredHeight();
                        }
                        float f42 = bitmapHeight;
                        float f43 = bitmapWidth;
                        float fMin2 = Math.min(secretMediaViewer.containerView.getHeight() / f42, secretMediaViewer.containerView.getWidth() / f43);
                        int i10 = (int) (f43 * fMin2);
                        int i11 = (int) (f42 * fMin2);
                        float f44 = (-i10) / 2;
                        float f45 = fM6 / f41;
                        float f46 = f44 + f45;
                        float f47 = (-i11) / 2;
                        float f48 = fM3;
                        float f49 = (i10 / 2) - f45;
                        float f50 = i11 / 2;
                        canvas.clipRect(f46, (fM2 / f41) + f47, f49, f50 - (f48 / f41));
                        if (!z) {
                            Path path = secretMediaViewer.roundRectPath;
                            path.reset();
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f46, (fM4 / f41) + f47, f49, f50 - (fM5 / f41));
                            path.addRoundRect(rectF2, secretMediaViewer.currentRadii, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (!z5 || !secretMediaViewer.textureUploaded || !secretMediaViewer.videoCrossfadeStarted || secretMediaViewer.videoCrossfadeAlpha != 1.0f) {
                            imageReceiver3.setAlpha(f9);
                            imageReceiver3.setImageCoords(f44, f47, i10, i11);
                            imageReceiver3.draw(canvas);
                        }
                        if (z5) {
                            if (!secretMediaViewer.videoCrossfadeStarted && secretMediaViewer.textureUploaded) {
                                secretMediaViewer.videoCrossfadeStarted = true;
                                secretMediaViewer.videoCrossfadeAlpha = 0.0f;
                                secretMediaViewer.videoCrossfadeAlphaLastTime = System.currentTimeMillis();
                            }
                            canvas.translate(f44, f47);
                            secretMediaViewer.videoTextureView.setAlpha(f9 * secretMediaViewer.videoCrossfadeAlpha);
                            secretMediaViewer.aspectRatioFrameLayout.draw(canvas);
                            if (secretMediaViewer.videoCrossfadeStarted && secretMediaViewer.videoCrossfadeAlpha < 1.0f) {
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                long j3 = jCurrentTimeMillis3 - secretMediaViewer.videoCrossfadeAlphaLastTime;
                                secretMediaViewer.videoCrossfadeAlphaLastTime = jCurrentTimeMillis3;
                                secretMediaViewer.videoCrossfadeAlpha = (j3 / 200.0f) + secretMediaViewer.videoCrossfadeAlpha;
                                secretMediaViewer.containerView.invalidate();
                                if (secretMediaViewer.videoCrossfadeAlpha > 1.0f) {
                                    secretMediaViewer.videoCrossfadeAlpha = 1.0f;
                                }
                            }
                        }
                        canvas.restore();
                        break;
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 3:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                    accessibilityNodeInfo.setChecked(((RadioButton) this.this$0).isChecked);
                    accessibilityNodeInfo.setCheckable(true);
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            CanvasButton canvasButton;
            switch (this.$r8$classId) {
                case 22:
                    return (((ProfileActivity) this.this$0).customAvatarProgress == 0.0f && (canvasButton = (CanvasButton) this.val$themeFrameLayout) != null && canvasButton.checkTouchEvent(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
                default:
                    return super.onInterceptTouchEvent(motionEvent);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    super.onLayout(z, i, i2, i3, i4);
                    int i5 = (i4 - i2) / 4;
                    int i6 = i5 * 3;
                    int iM$2 = OKLCH.m$2(275.0f, i6, 2);
                    IntroActivity introActivity = (IntroActivity) this.this$0;
                    FrameLayout frameLayout = introActivity.frameLayout2;
                    frameLayout.layout(0, iM$2, frameLayout.getMeasuredWidth(), introActivity.frameLayout2.getMeasuredHeight() + iM$2);
                    int iDp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + iM$2;
                    int measuredWidth = (getMeasuredWidth() - introActivity.bottomPages.getMeasuredWidth()) / 2;
                    BottomPagesView bottomPagesView = introActivity.bottomPages;
                    bottomPagesView.layout(measuredWidth, iDp, bottomPagesView.getMeasuredWidth() + measuredWidth, introActivity.bottomPages.getMeasuredHeight() + iDp);
                    ViewPager viewPager = introActivity.viewPager;
                    viewPager.layout(0, 0, viewPager.getMeasuredWidth(), introActivity.viewPager.getMeasuredHeight());
                    int measuredHeight = ((i5 - introActivity.startMessagingButton.getMeasuredHeight()) / 2) + i6;
                    int measuredWidth2 = (getMeasuredWidth() - introActivity.startMessagingButton.getMeasuredWidth()) / 2;
                    AnonymousClass4 anonymousClass4 = introActivity.startMessagingButton;
                    anonymousClass4.layout(measuredWidth2, measuredHeight, anonymousClass4.getMeasuredWidth() + measuredWidth2, introActivity.startMessagingButton.getMeasuredHeight() + measuredHeight);
                    int iDp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                    int measuredWidth3 = (getMeasuredWidth() - introActivity.switchLanguageTextView.getMeasuredWidth()) / 2;
                    TextView textView = introActivity.switchLanguageTextView;
                    textView.layout(measuredWidth3, iDp2 - textView.getMeasuredHeight(), introActivity.switchLanguageTextView.getMeasuredWidth() + measuredWidth3, iDp2);
                    FrameLayout frameLayout2 = (FrameLayout) this.val$themeFrameLayout;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                    int iDp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                    if (marginLayoutParams.topMargin != iDp3) {
                        marginLayoutParams.topMargin = iDp3;
                        frameLayout2.requestLayout();
                    }
                    break;
                case 21:
                    int iDp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + OKLCH.m$2(275.0f, ((i4 - i2) / 4) * 3, 2);
                    int iDp5 = AndroidUtilities.dp(18.0f);
                    TextView textView2 = (TextView) this.val$themeFrameLayout;
                    textView2.layout(iDp5, iDp4, textView2.getMeasuredWidth() + iDp5, textView2.getMeasuredHeight() + iDp4);
                    int iDp6 = AndroidUtilities.dp(18.0f) + iDp4 + ((int) textView2.getTextSize());
                    int iDp7 = AndroidUtilities.dp(16.0f);
                    TextView textView3 = (TextView) this.this$0;
                    textView3.layout(iDp7, iDp6, textView3.getMeasuredWidth() + iDp7, textView3.getMeasuredHeight() + iDp6);
                    break;
                case 22:
                    super.onLayout(z, i, i2, i3, i4);
                    ((ProfileActivity) this.this$0).updateCollectibleHint();
                    break;
                case 24:
                    super.onLayout(z, i, i2, i3, i4);
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.this$0;
                    if (secretMediaViewer.secretDeleteTimer != null) {
                        int currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - secretMediaViewer.secretDeleteTimer.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                        SecretMediaViewer.SecretDeleteTimer secretDeleteTimer = secretMediaViewer.secretDeleteTimer;
                        secretDeleteTimer.layout(secretDeleteTimer.getLeft(), currentActionBarHeight, secretMediaViewer.secretDeleteTimer.getRight(), secretMediaViewer.secretDeleteTimer.getMeasuredHeight() + currentActionBarHeight);
                    }
                    if (secretMediaViewer.secretHint != null && secretMediaViewer.secretDeleteTimer != null) {
                        int measuredHeight2 = (secretMediaViewer.secretDeleteTimer.getMeasuredHeight() + (((ActionBar.getCurrentActionBarHeight() - secretMediaViewer.secretDeleteTimer.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                        HintView2 hintView2 = secretMediaViewer.secretHint;
                        hintView2.layout(hintView2.getLeft(), measuredHeight2, secretMediaViewer.secretHint.getRight(), secretMediaViewer.secretHint.getMeasuredHeight() + measuredHeight2);
                    }
                    if (secretMediaViewer.captionScrollView != null) {
                        int currentActionBarHeight2 = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                        PhotoViewer.AnonymousClass72 anonymousClass72 = secretMediaViewer.captionScrollView;
                        anonymousClass72.layout(anonymousClass72.getLeft(), currentActionBarHeight2, secretMediaViewer.captionScrollView.getRight(), secretMediaViewer.captionScrollView.getMeasuredHeight() + currentActionBarHeight2);
                    }
                    View view = secretMediaViewer.navigationBar;
                    if (view != null) {
                        int i7 = i4 - i2;
                        view.layout(0, i7, i3 - i, AndroidUtilities.navigationBarHeight + i7);
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            LinearLayoutManager gridLayoutManager;
            switch (this.$r8$classId) {
                case 1:
                    ContactsAdapter contactsAdapter = (ContactsAdapter) this.this$0;
                    if (contactsAdapter.isEmptyWithMainTabs && contactsAdapter.hasPhonebook) {
                        super.onMeasure(i, i2);
                    } else {
                        int size = View.MeasureSpec.getSize(i2);
                        ViewGroup viewGroup = (ViewGroup) this.val$themeFrameLayout;
                        if (size == 0) {
                            size = viewGroup.getMeasuredHeight();
                        }
                        if (size == 0) {
                            size = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                        }
                        int iDp = AndroidUtilities.dp(50.0f);
                        int iDp2 = contactsAdapter.onlyUsers != 0 ? 0 : AndroidUtilities.dp(30.0f) + iDp;
                        if (!contactsAdapter.isAdmin && !contactsAdapter.needPhonebook) {
                            iDp2 += iDp;
                        }
                        int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2 < paddingTop ? paddingTop - iDp2 : 0, 1073741824));
                    }
                    break;
                case 2:
                    super.onMeasure(i, i2);
                    super.onMeasure(i, zzkm.m(8.0f, ((LinearLayout) this.val$themeFrameLayout).getMeasuredHeight()));
                    break;
                case 3:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    break;
                case 8:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    break;
                case 10:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                    setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    break;
                case 12:
                    super.onMeasure(i, zzkm.m(2.0f, ((PremiumFeatureBottomSheet) this.this$0).contentHeight));
                    break;
                case 23:
                    QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) this.this$0;
                    boolean z = QrActivity.this.isFragmentViewPortrait;
                    int iDp3 = AndroidUtilities.dp(12.0f);
                    if (z) {
                        themeListViewController.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                        themeListViewController.recyclerView.setPadding(iDp3, 0, iDp3, 0);
                        LinearLayout linearLayout = themeListViewController.scanButtonWrap;
                        TextView textView = themeListViewController.shareButton;
                        if (linearLayout != null) {
                            textView.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                            themeListViewController.scanButtonWrap.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                        } else {
                            textView.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                        }
                    } else {
                        themeListViewController.recyclerView.setPadding(iDp3, iDp3 / 2, iDp3, iDp3);
                        LinearLayout linearLayout2 = themeListViewController.scanButtonWrap;
                        RecyclerListView recyclerListView = themeListViewController.recyclerView;
                        if (linearLayout2 != null) {
                            recyclerListView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                            themeListViewController.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                            themeListViewController.scanButtonWrap.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                        } else {
                            recyclerListView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                            themeListViewController.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                        }
                    }
                    if (z) {
                        themeListViewController.bottomShadow.setVisibility(8);
                        themeListViewController.topShadow.setVisibility(8);
                    } else {
                        int i3 = themeListViewController.shareButton != null ? 136 : 80;
                        themeListViewController.bottomShadow.setVisibility(0);
                        themeListViewController.bottomShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i3));
                        themeListViewController.topShadow.setVisibility(0);
                        themeListViewController.topShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                    }
                    if (themeListViewController.prevIsPortrait != z) {
                        RecyclerListView recyclerListView2 = themeListViewController.recyclerView;
                        QrActivity qrActivity = themeListViewController.fragment;
                        if (z) {
                            qrActivity.getParentActivity();
                            gridLayoutManager = new LinearLayoutManager(0, false);
                        } else {
                            qrActivity.getParentActivity();
                            gridLayoutManager = new GridLayoutManager(3, false);
                        }
                        themeListViewController.layoutManager = gridLayoutManager;
                        recyclerListView2.setLayoutManager(gridLayoutManager);
                        themeListViewController.recyclerView.requestLayout();
                        int i4 = themeListViewController.prevSelectedPosition;
                        if (i4 != -1) {
                            themeListViewController.prevSelectedPosition = i4;
                            ChatThemeBottomSheet.Adapter adapter = themeListViewController.adapter;
                            adapter.setSelectedItem(i4);
                            if (i4 > 0 && i4 < adapter.items.size() / 2) {
                                i4--;
                            }
                            int iMin = Math.min(i4, adapter.items.size() - 1);
                            LinearLayoutManager linearLayoutManager = themeListViewController.layoutManager;
                            linearLayoutManager.scrollToPositionWithOffset(iMin, 0, linearLayoutManager.mShouldReverseLayout);
                        }
                        themeListViewController.prevIsPortrait = z;
                    }
                    super.onMeasure(i, i2);
                    break;
                case 24:
                    super.onMeasure(i, i2);
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.this$0;
                    PhotoViewer.AnonymousClass72 anonymousClass72 = secretMediaViewer.captionScrollView;
                    if (anonymousClass72 != null) {
                        anonymousClass72.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(((measuredHeight - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.seekbarContainer.getVisibility() != 0 ? 0 : secretMediaViewer.seekbarContainer.getMeasuredHeight()), 1073741824));
                    }
                    View view = secretMediaViewer.navigationBar;
                    if (view != null) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 16:
                    super.onSizeChanged(i, i2, i3, i4);
                    GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.this$0;
                    gradientProtectionDrawable.setBounds(0, 0, i, i2);
                    gradientProtectionDrawable.setInsets(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                    break;
                case 17:
                    super.onSizeChanged(i, i2, i3, i4);
                    Path path = (Path) this.val$themeFrameLayout;
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, i, i2);
                    path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    break;
                case 28:
                    super.onSizeChanged(i, i2, i3, i4);
                    Path path2 = (Path) this.val$themeFrameLayout;
                    path2.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, i, i2);
                    path2.addRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            CanvasButton canvasButton;
            float f;
            switch (this.$r8$classId) {
                case 22:
                    return (((ProfileActivity) this.this$0).customAvatarProgress == 0.0f && (canvasButton = (CanvasButton) this.val$themeFrameLayout) != null && canvasButton.checkTouchEvent(motionEvent)) || super.onTouchEvent(motionEvent);
                case 23:
                default:
                    return super.onTouchEvent(motionEvent);
                case 24:
                    SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.val$themeFrameLayout;
                    if (secretMediaViewer.photoAnimationInProgress == 0 && secretMediaViewer.animationStartTime == 0) {
                        if (motionEvent.getPointerCount() == 1 && secretMediaViewer.gestureDetector.onTouchEvent(motionEvent) && secretMediaViewer.doubleTap) {
                            secretMediaViewer.doubleTap = false;
                            secretMediaViewer.moving = false;
                            secretMediaViewer.zooming = false;
                            secretMediaViewer.checkMinMax$1(false);
                        } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            secretMediaViewer.discardTap = false;
                            Scroller scroller = secretMediaViewer.scroller;
                            if (!scroller.mFinished) {
                                scroller.abortAnimation();
                            }
                            if (!secretMediaViewer.draggingDown) {
                                if (motionEvent.getPointerCount() == 2) {
                                    secretMediaViewer.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                    secretMediaViewer.pinchStartScale = secretMediaViewer.scale;
                                    secretMediaViewer.pinchCenterX = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                    secretMediaViewer.pinchCenterY = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                    secretMediaViewer.pinchStartX = secretMediaViewer.translationX;
                                    secretMediaViewer.pinchStartY = secretMediaViewer.translationY;
                                    secretMediaViewer.zooming = true;
                                    secretMediaViewer.moving = false;
                                } else if (motionEvent.getPointerCount() == 1) {
                                    secretMediaViewer.moveStartX = motionEvent.getX();
                                    float y = motionEvent.getY();
                                    secretMediaViewer.moveStartY = y;
                                    secretMediaViewer.dragY = y;
                                    secretMediaViewer.draggingDown = false;
                                    secretMediaViewer.canDragDown = true;
                                }
                            }
                        } else {
                            float f2 = 0.0f;
                            if (motionEvent.getActionMasked() == 2) {
                                if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.draggingDown && secretMediaViewer.zooming) {
                                    secretMediaViewer.discardTap = true;
                                    secretMediaViewer.scale = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.pinchStartDistance) * secretMediaViewer.pinchStartScale;
                                    secretMediaViewer.translationX = TextureRenderer$$ExternalSyntheticOutline0.m(secretMediaViewer.scale, secretMediaViewer.pinchStartScale, (secretMediaViewer.pinchCenterX - (secretMediaViewer.containerView.getWidth() / 2)) - secretMediaViewer.pinchStartX, secretMediaViewer.pinchCenterX - (secretMediaViewer.containerView.getWidth() / 2));
                                    float height = secretMediaViewer.pinchCenterY - (secretMediaViewer.containerView.getHeight() / 2);
                                    float height2 = (secretMediaViewer.pinchCenterY - (secretMediaViewer.containerView.getHeight() / 2)) - secretMediaViewer.pinchStartY;
                                    float f3 = secretMediaViewer.scale;
                                    secretMediaViewer.translationY = TextureRenderer$$ExternalSyntheticOutline0.m(f3, secretMediaViewer.pinchStartScale, height2, height);
                                    secretMediaViewer.updateMinMax$1(f3);
                                    secretMediaViewer.containerView.invalidate();
                                } else if (motionEvent.getPointerCount() == 1) {
                                    float fAbs = Math.abs(motionEvent.getX() - secretMediaViewer.moveStartX);
                                    float fAbs2 = Math.abs(motionEvent.getY() - secretMediaViewer.dragY);
                                    if (fAbs > AndroidUtilities.dp(3.0f) || fAbs2 > AndroidUtilities.dp(3.0f)) {
                                        secretMediaViewer.discardTap = true;
                                    }
                                    if (secretMediaViewer.canDragDown && !secretMediaViewer.draggingDown && secretMediaViewer.scale == 1.0f && fAbs2 >= AndroidUtilities.dp(30.0f) && fAbs2 / 2.0f > fAbs) {
                                        secretMediaViewer.draggingDown = true;
                                        secretMediaViewer.moving = false;
                                        secretMediaViewer.dragY = motionEvent.getY();
                                        if (secretMediaViewer.isActionBarVisible) {
                                            secretMediaViewer.toggleActionBar$1(false, true);
                                        }
                                    } else if (secretMediaViewer.draggingDown) {
                                        secretMediaViewer.translationY = motionEvent.getY() - secretMediaViewer.dragY;
                                        secretMediaViewer.containerView.invalidate();
                                    } else if (secretMediaViewer.invalidCoords || secretMediaViewer.animationStartTime != 0) {
                                        secretMediaViewer.invalidCoords = false;
                                        secretMediaViewer.moveStartX = motionEvent.getX();
                                        secretMediaViewer.moveStartY = motionEvent.getY();
                                    } else {
                                        float x = secretMediaViewer.moveStartX - motionEvent.getX();
                                        float y2 = secretMediaViewer.moveStartY - motionEvent.getY();
                                        if (secretMediaViewer.moving || ((secretMediaViewer.scale == 1.0f && Math.abs(y2) + AndroidUtilities.dp(12.0f) < Math.abs(x)) || secretMediaViewer.scale != 1.0f)) {
                                            if (!secretMediaViewer.moving) {
                                                secretMediaViewer.moving = true;
                                                secretMediaViewer.canDragDown = false;
                                                x = 0.0f;
                                                y2 = 0.0f;
                                            }
                                            secretMediaViewer.moveStartX = motionEvent.getX();
                                            secretMediaViewer.moveStartY = motionEvent.getY();
                                            secretMediaViewer.updateMinMax$1(secretMediaViewer.scale);
                                            float f4 = secretMediaViewer.translationX;
                                            if (f4 < secretMediaViewer.minX || f4 > secretMediaViewer.maxX) {
                                                x /= 3.0f;
                                            }
                                            float f5 = secretMediaViewer.maxY;
                                            if (f5 == 0.0f) {
                                                float f6 = secretMediaViewer.minY;
                                                if (f6 == 0.0f) {
                                                    float f7 = secretMediaViewer.translationY - y2;
                                                    if (f7 < f6) {
                                                        secretMediaViewer.translationY = f6;
                                                    } else if (f7 > f5) {
                                                        secretMediaViewer.translationY = f5;
                                                    } else {
                                                        f2 = y2;
                                                    }
                                                } else {
                                                    f = secretMediaViewer.translationY;
                                                    if (f >= secretMediaViewer.minY || f > f5) {
                                                        f2 = y2 / 3.0f;
                                                    } else {
                                                        f2 = y2;
                                                    }
                                                }
                                            } else {
                                                f = secretMediaViewer.translationY;
                                                if (f >= secretMediaViewer.minY) {
                                                }
                                                f2 = y2 / 3.0f;
                                            }
                                            secretMediaViewer.translationX = f4 - x;
                                            if (secretMediaViewer.scale != 1.0f) {
                                                secretMediaViewer.translationY -= f2;
                                            }
                                            secretMediaViewer.containerView.invalidate();
                                        }
                                    }
                                }
                            } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                                if (secretMediaViewer.zooming) {
                                    secretMediaViewer.invalidCoords = true;
                                    float f8 = secretMediaViewer.scale;
                                    if (f8 < 1.0f) {
                                        secretMediaViewer.updateMinMax$1(1.0f);
                                        secretMediaViewer.animateTo$1(1.0f, 0.0f, 0.0f, true);
                                    } else if (f8 > 3.0f) {
                                        float fM = TextureRenderer$$ExternalSyntheticOutline0.m(3.0f, secretMediaViewer.pinchStartScale, (secretMediaViewer.pinchCenterX - (secretMediaViewer.containerView.getWidth() / 2)) - secretMediaViewer.pinchStartX, secretMediaViewer.pinchCenterX - (secretMediaViewer.containerView.getWidth() / 2));
                                        float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(3.0f, secretMediaViewer.pinchStartScale, (secretMediaViewer.pinchCenterY - (secretMediaViewer.containerView.getHeight() / 2)) - secretMediaViewer.pinchStartY, secretMediaViewer.pinchCenterY - (secretMediaViewer.containerView.getHeight() / 2));
                                        secretMediaViewer.updateMinMax$1(3.0f);
                                        float f9 = secretMediaViewer.minX;
                                        if (fM < f9) {
                                            fM = f9;
                                        } else {
                                            f9 = secretMediaViewer.maxX;
                                            if (fM > f9) {
                                                fM = f9;
                                            }
                                        }
                                        float f10 = secretMediaViewer.minY;
                                        if (fM2 < f10) {
                                            fM2 = f10;
                                        } else {
                                            f10 = secretMediaViewer.maxY;
                                            if (fM2 > f10) {
                                                fM2 = f10;
                                            }
                                        }
                                        secretMediaViewer.animateTo$1(3.0f, fM, fM2, true);
                                    } else {
                                        secretMediaViewer.checkMinMax$1(true);
                                    }
                                    secretMediaViewer.zooming = false;
                                } else if (secretMediaViewer.draggingDown) {
                                    if (Math.abs(secretMediaViewer.dragY - motionEvent.getY()) > secretMediaViewer.containerView.getHeight() / 6.0f) {
                                        secretMediaViewer.closePhoto(true, false);
                                    } else {
                                        secretMediaViewer.animateTo$1(1.0f, 0.0f, 0.0f, false);
                                    }
                                    secretMediaViewer.draggingDown = false;
                                } else if (secretMediaViewer.moving) {
                                    float f11 = secretMediaViewer.translationX;
                                    float f12 = secretMediaViewer.translationY;
                                    secretMediaViewer.updateMinMax$1(secretMediaViewer.scale);
                                    secretMediaViewer.moving = false;
                                    secretMediaViewer.canDragDown = true;
                                    float f13 = secretMediaViewer.translationX;
                                    float f14 = secretMediaViewer.minX;
                                    if (f13 < f14) {
                                        f11 = f14;
                                    } else {
                                        f14 = secretMediaViewer.maxX;
                                        if (f13 > f14) {
                                            f11 = f14;
                                        }
                                    }
                                    float f15 = secretMediaViewer.translationY;
                                    float f16 = secretMediaViewer.minY;
                                    if (f15 < f16) {
                                        f12 = f16;
                                    } else {
                                        f16 = secretMediaViewer.maxY;
                                        if (f15 > f16) {
                                            f12 = f16;
                                        }
                                    }
                                    secretMediaViewer.animateTo$1(secretMediaViewer.scale, f11, f12, false);
                                }
                            }
                        }
                    }
                    return true;
            }
        }

        public void set(int i, CharSequence charSequence, boolean z) {
            ImageView imageView = (ImageView) this.val$themeFrameLayout;
            if (z) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i);
            } else {
                imageView.setImageResource(i);
            }
            ((TextView) this.this$0).setText(charSequence);
        }

        public void setSubtitle(String str, boolean z) {
            ((AnimatedTextView.AnimatedTextDrawable) this.this$0).setText(str, z && !LocaleController.isRTL, true);
        }

        public void setTitle(String str, boolean z) {
            ((AnimatedTextView.AnimatedTextDrawable) this.val$themeFrameLayout).setText(str, z && !LocaleController.isRTL, true);
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 10:
                    return ((AnimatedTextView.AnimatedTextDrawable) this.val$themeFrameLayout) == drawable || ((AnimatedTextView.AnimatedTextDrawable) this.this$0) == drawable || super.verifyDrawable(drawable);
                case 23:
                    return drawable == ((QrActivity.ThemeListViewController) this.this$0).backgroundDrawable || super.verifyDrawable(drawable);
                default:
                    return super.verifyDrawable(drawable);
            }
        }

        public AnonymousClass1(Object obj, Context context, Object obj2, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$themeFrameLayout = obj2;
        }

        public AnonymousClass1(Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 7:
                    super(context);
                    this.val$themeFrameLayout = new Path();
                    this.this$0 = new GradientClip();
                    break;
                case 27:
                    super(context);
                    ImageView imageView = new ImageView(context);
                    this.val$themeFrameLayout = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    addView(imageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(context);
                    this.this$0 = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 12.0f);
                    textView.setTextColor(-1);
                    textView.setGravity(17);
                    addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                    break;
                default:
                    setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                    RadioButton radioButton = new RadioButton(context);
                    this.this$0 = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    int color = Theme.getColor(null, Theme.key_dialogRadioBackground, false);
                    int color2 = Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false);
                    radioButton.color = color;
                    radioButton.checkedColor = color2;
                    radioButton.invalidate();
                    boolean z = LocaleController.isRTL;
                    addView(radioButton, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 22, 13.0f, z ? 22 : 0, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.val$themeFrameLayout = textView2;
                    ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z2 = LocaleController.isRTL;
                    addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 17 : 62, 0.0f, z2 ? 62 : 17, 0.0f));
                    break;
            }
        }

        private final void dispatchSetPressed$org$telegram$ui$Components$Reactions$CustomEmojiReactionsWindow$1(boolean z) {
        }

        public AnonymousClass1(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 16:
                    super(context);
                    this.this$0 = new GradientProtectionDrawable(8);
                    this.val$themeFrameLayout = resourcesProvider;
                    break;
                case 20:
                    super(context);
                    LinearLayout linearLayoutM = zzkf.m(context, 1);
                    AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
                    this.val$themeFrameLayout = animatedTextView;
                    int i2 = Theme.key_windowBackgroundWhiteBlackText;
                    animatedTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
                    animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
                    animatedTextView.setTypeface(AndroidUtilities.bold());
                    linearLayoutM.addView(animatedTextView, LayoutHelper.createLinear(-2, 23, 1));
                    TextView textView = new TextView(context);
                    this.this$0 = textView;
                    textView.setTextSize(1, 11.0f);
                    textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                    textView.setSingleLine();
                    textView.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
                    addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
                    break;
                default:
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
                    this.val$themeFrameLayout = animatedTextDrawable;
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    animatedTextDrawable.moveAmplitude = 0.3f;
                    animatedTextDrawable.animateDuration = 430L;
                    animatedTextDrawable.animateWave = 1.0f;
                    animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                    Typeface typefaceBold = AndroidUtilities.bold();
                    TextPaint textPaint = animatedTextDrawable.textPaint;
                    textPaint.setTypeface(typefaceBold);
                    int color = Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider);
                    textPaint.setColor(color);
                    animatedTextDrawable.alpha = Color.alpha(color);
                    animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.0f));
                    animatedTextDrawable.ellipsizeByGradient = !LocaleController.isRTL;
                    animatedTextDrawable.invalidateSelf();
                    animatedTextDrawable.setCallback(this);
                    animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
                    this.this$0 = animatedTextDrawable2;
                    animatedTextDrawable2.moveAmplitude = 0.3f;
                    animatedTextDrawable2.animateDuration = 430L;
                    animatedTextDrawable2.animateWave = 1.0f;
                    animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
                    int color2 = Theme.getColor(Theme.key_actionBarDefaultSubtitle, resourcesProvider);
                    animatedTextDrawable2.textPaint.setColor(color2);
                    animatedTextDrawable2.alpha = Color.alpha(color2);
                    animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
                    animatedTextDrawable2.ellipsizeByGradient = true ^ LocaleController.isRTL;
                    animatedTextDrawable2.invalidateSelf();
                    animatedTextDrawable2.setCallback(this);
                    animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
                    break;
            }
        }

        public AnonymousClass1(Context context, TextView textView, TextView textView2) {
            super(context);
            this.$r8$classId = 21;
            this.val$themeFrameLayout = textView;
            this.this$0 = textView2;
        }

        public AnonymousClass1(BoostsActivity.AnonymousClass1 anonymousClass1, Activity activity) {
            super(activity);
            this.$r8$classId = 4;
            this.this$0 = anonymousClass1;
            this.val$themeFrameLayout = new Paint(1);
        }

        public AnonymousClass1(ChatLoadingCell chatLoadingCell, Context context) {
            super(context);
            this.$r8$classId = 5;
            this.this$0 = chatLoadingCell;
            this.val$themeFrameLayout = new RectF();
        }

        public AnonymousClass1(ChannelBoostLayout.AnonymousClass1 anonymousClass1, Activity activity) {
            super(activity);
            this.$r8$classId = 6;
            this.this$0 = anonymousClass1;
            this.val$themeFrameLayout = new Paint(1);
        }

        public AnonymousClass1(ChatThemeBottomSheet chatThemeBottomSheet, Context context) {
            super(context);
            this.$r8$classId = 8;
            this.this$0 = chatThemeBottomSheet;
            this.val$themeFrameLayout = new Paint();
        }

        public AnonymousClass1(LPhotoPaintView.PopupButton popupButton, Context context) {
            super(context);
            this.$r8$classId = 11;
            this.this$0 = popupButton;
            this.val$themeFrameLayout = new Path();
        }

        public AnonymousClass1(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, Context context) {
            super(context);
            this.$r8$classId = 13;
            this.this$0 = chatCustomReactionsEditActivity;
            this.val$themeFrameLayout = new ChatCustomReactionsEditActivity$2$1(this, this);
        }

        public AnonymousClass1(CustomEmojiReactionsWindow customEmojiReactionsWindow, Context context) {
            super(context);
            this.$r8$classId = 14;
            this.this$0 = customEmojiReactionsWindow;
            this.val$themeFrameLayout = new ChatActivity.AnonymousClass103(this, 7);
        }

        public AnonymousClass1(ReactionsContainerLayout reactionsContainerLayout, Context context) {
            super(context);
            this.$r8$classId = 15;
            this.this$0 = reactionsContainerLayout;
            this.val$themeFrameLayout = new Paint(1);
        }

        public AnonymousClass1(RTMPStreamPipOverlay rTMPStreamPipOverlay, Context context) {
            super(context);
            this.$r8$classId = 17;
            this.this$0 = rTMPStreamPipOverlay;
            this.val$themeFrameLayout = new Path();
        }

        public AnonymousClass1(ContentPreviewViewer contentPreviewViewer, Activity activity) {
            super(activity);
            this.$r8$classId = 19;
            this.this$0 = contentPreviewViewer;
            this.val$themeFrameLayout = contentPreviewViewer;
            setWillNotDraw(false);
        }

        public AnonymousClass1(QrActivity.ThemeListViewController themeListViewController, Activity activity, QrActivity qrActivity) {
            super(activity);
            this.$r8$classId = 23;
            this.this$0 = themeListViewController;
            Rect rect = new Rect();
            this.val$themeFrameLayout = rect;
            themeListViewController.backgroundPaint.setColor(qrActivity.getThemedColor(Theme.key_windowBackgroundWhite));
            Drawable drawable = themeListViewController.backgroundDrawable;
            drawable.setCallback(this);
            drawable.getPadding(rect);
        }

        public AnonymousClass1(SecretMediaViewer secretMediaViewer, Activity activity) {
            super(activity);
            this.$r8$classId = 24;
            this.this$0 = secretMediaViewer;
            this.val$themeFrameLayout = secretMediaViewer;
            setWillNotDraw(false);
        }

        public AnonymousClass1(SecretVoicePlayer secretVoicePlayer, Activity activity) {
            super(activity);
            this.$r8$classId = 25;
            this.this$0 = secretVoicePlayer;
            this.val$themeFrameLayout = new Path();
        }

        public AnonymousClass1(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context) {
            super(context);
            this.$r8$classId = 26;
            this.this$0 = selectAnimatedEmojiDialog;
            this.val$themeFrameLayout = new Rect();
        }

        public AnonymousClass1(LiveStoryPipOverlay liveStoryPipOverlay, Context context) {
            super(context);
            this.$r8$classId = 28;
            this.this$0 = liveStoryPipOverlay;
            this.val$themeFrameLayout = new Path();
        }

        public AnonymousClass1(PaintView.PopupButton popupButton, Context context) {
            super(context);
            this.$r8$classId = 29;
            this.this$0 = popupButton;
            this.val$themeFrameLayout = new Path();
        }
    }

    public final class AnonymousClass5 implements NotificationCenter.NotificationCenterDelegate {
        public final AlertDialog val$loaderDialog;

        public AnonymousClass5(AlertDialog alertDialog) {
            this.val$loaderDialog = alertDialog;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.reloadInterface) {
                this.val$loaderDialog.dismiss();
                NotificationCenter.getGlobalInstance().removeObserver(this, i);
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 9), 100L);
            }
        }
    }

    public IntroActivity() {
        super(null);
        this.pagerHeaderTag = new Object();
        this.pagerMessageTag = new Object();
        this.currentAccount = UserConfig.selectedAccount;
        this.lastPage = 0;
        this.justCreated = false;
        this.startPressed = false;
    }

    public final void checkContinueText() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i = this.currentAccount;
        String language = MessagesController.getInstance(i).suggestedLangCode;
        if ((language == null || (language.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (language = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            language = "en";
        }
        String str = language.contains("-") ? language.split("-")[0] : language;
        String localeAlias = LocaleController.getLocaleAlias(str);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i2 = 0; i2 < LocaleController.getInstance().languages.size(); i2++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i2);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(language) || localeInfo3.shortName.equals(str) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo == null || localeInfo2 == null || localeInfo == localeInfo2) {
            return;
        }
        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
        if (localeInfo2 != currentLocaleInfo) {
            tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
            this.localeInfo = localeInfo2;
        } else {
            tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.localeInfo = localeInfo;
        }
        tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(i).sendRequest(tL_langpack_getStrings, new LinkManager$$ExternalSyntheticLambda8(21, this, language), 8);
    }

    @Override
    public final View createView(Context context) {
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.logoDrawable = drawableMutate;
        drawableMutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.logoDrawable), 0, spannableStringBuilder.length(), 33);
        this.titles[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(28, 28, 17));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context, frameLayout, 0);
        this.frameContainerView = anonymousClass1;
        scrollView.addView(anonymousClass1, LayoutHelper.createScroll(-1, -2, 51));
        int i = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.darkThemeDrawable = rLottieDrawable;
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        rLottieDrawable.applyingLayerColors = true;
        rLottieDrawable.commitApplyLayerColors();
        RLottieDrawable rLottieDrawable2 = this.darkThemeDrawable;
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        if (themeInfo == null) {
            themeInfo = Theme.defaultTheme;
        }
        rLottieDrawable2.setCustomEndFrame(themeInfo.isDark() ? this.darkThemeDrawable.metaData[0] - 1 : 0);
        RLottieDrawable rLottieDrawable3 = this.darkThemeDrawable;
        Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
        if (themeInfo2 == null) {
            themeInfo2 = Theme.defaultTheme;
        }
        rLottieDrawable3.setCurrentFrame(themeInfo2.isDark() ? this.darkThemeDrawable.metaData[0] - 1 : 0, false, false);
        Theme.ThemeInfo themeInfo3 = Theme.currentDayTheme;
        if (themeInfo3 == null) {
            themeInfo3 = Theme.defaultTheme;
        }
        rLottieImageView.setContentDescription(LocaleController.getString(themeInfo3.isDark() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        rLottieImageView.setAnimation(this.darkThemeDrawable);
        frameLayout.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(0, this, rLottieImageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.frameLayout2 = frameLayout2;
        this.frameContainerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.frameLayout2.addView(textureView, LayoutHelper.createFrame(200, 150, 17));
        textureView.setSurfaceTextureListener(new PhotoViewer.AnonymousClass8(this, 6));
        ViewPager viewPager = new ViewPager(context);
        this.viewPager = viewPager;
        viewPager.setAdapter(new ThemePreviewActivity.AnonymousClass29(this, 2));
        this.viewPager.setPageMargin(0);
        this.viewPager.setOffscreenPageLimit(1);
        this.frameContainerView.addView(this.viewPager, LayoutHelper.createFrame(-1.0f, -1));
        this.viewPager.addOnPageChangeListener(new AnonymousClass3(this, 0));
        this.startMessagingButtonBackground = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, context);
        this.startMessagingButton = anonymousClass4;
        ScaleStateListAnimator.apply(anonymousClass4, 0.02f, 1.2f);
        this.startMessagingButton.setText(LocaleController.getString(R.string.StartMessaging));
        this.startMessagingButton.setGravity(17);
        this.startMessagingButton.setTypeface(AndroidUtilities.bold());
        this.startMessagingButton.setTextSize(1, 15.0f);
        this.startMessagingButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.frameContainerView.addView(this.startMessagingButton, LayoutHelper.createFrame(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i2 = 0;
        this.startMessagingButton.setOnClickListener(new View.OnClickListener(this) {
            public final IntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        IntroActivity introActivity = this.f$0;
                        if (!introActivity.startPressed) {
                            introActivity.startPressed = true;
                            introActivity.presentFragment(new LoginActivity(), true);
                            introActivity.destroyed = true;
                            break;
                        }
                        break;
                    default:
                        IntroActivity introActivity2 = this.f$0;
                        if (!introActivity2.startPressed && introActivity2.localeInfo != null) {
                            introActivity2.startPressed = true;
                            AlertDialog alertDialog = new AlertDialog(view.getContext(), 3, null);
                            alertDialog.canCacnel = false;
                            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 1000L);
                            NotificationCenter.getGlobalInstance().addObserver(introActivity2.new AnonymousClass5(alertDialog), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(introActivity2.localeInfo, true, false, introActivity2.currentAccount);
                            break;
                        }
                        break;
                }
            }
        });
        BottomPagesView bottomPagesView = new BottomPagesView(context, this.viewPager, 6);
        this.bottomPages = bottomPagesView;
        this.frameContainerView.addView(bottomPagesView, LayoutHelper.createFrame(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.switchLanguageTextView = textView;
        textView.setGravity(17);
        this.switchLanguageTextView.setTextSize(1, 16.0f);
        this.frameContainerView.addView(this.switchLanguageTextView, LayoutHelper.createFrame(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i3 = 1;
        this.switchLanguageTextView.setOnClickListener(new View.OnClickListener(this) {
            public final IntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        IntroActivity introActivity = this.f$0;
                        if (!introActivity.startPressed) {
                            introActivity.startPressed = true;
                            introActivity.presentFragment(new LoginActivity(), true);
                            introActivity.destroyed = true;
                            break;
                        }
                        break;
                    default:
                        IntroActivity introActivity2 = this.f$0;
                        if (!introActivity2.startPressed && introActivity2.localeInfo != null) {
                            introActivity2.startPressed = true;
                            AlertDialog alertDialog = new AlertDialog(view.getContext(), 3, null);
                            alertDialog.canCacnel = false;
                            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 1000L);
                            NotificationCenter.getGlobalInstance().addObserver(introActivity2.new AnonymousClass5(alertDialog), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(introActivity2.localeInfo, true, false, introActivity2.currentAccount);
                            break;
                        }
                        break;
                }
            }
        });
        float f = 4;
        this.frameContainerView.addView(frameLayout, LayoutHelper.createFrame(64, 64.0f, 53, 0.0f, f, f, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i4 = this.currentAccount;
        NotificationCenter.getInstance(i4).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i4).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i4);
        checkContinueText();
        this.justCreated = true;
        updateColors$1(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.suggestedLangpack || i == NotificationCenter.configLoaded) {
            checkContinueText();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda9(1, this), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlueText4, Theme.key_chats_actionBackground, Theme.key_chats_actionPressedBackground, Theme.key_featuredStickers_buttonText, Theme.key_windowBackgroundWhiteBlackText);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (!this.isOnLogout) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.titles = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.messages = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.destroyed = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        AndroidUtilities.unlockOrientation(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.justCreated) {
            if (LocaleController.isRTL) {
                this.viewPager.setCurrentItem(6);
                this.lastPage = 6;
            } else {
                this.viewPager.setCurrentItem(0);
                this.lastPage = 0;
            }
            this.justCreated = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }

    public final void updateColors$1(boolean z) {
        GradientDrawable gradientDrawable = this.startMessagingButtonBackground;
        int i = Theme.key_featuredStickers_addButton;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(Theme.key_featuredStickers_addButton2)});
        this.logoDrawable.setColorFilter(Theme.multAlpha(0.9f, getThemedColor(Theme.key_actionBarDefaultTitle)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = Theme.key_windowBackgroundWhite;
        view.setBackgroundColor(Theme.getColor(null, i2, false));
        this.switchLanguageTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
        this.startMessagingButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        AnonymousClass4 anonymousClass4 = this.startMessagingButton;
        int iDp = AndroidUtilities.dp(24.0f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        anonymousClass4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
        this.bottomPages.invalidate();
        if (!z) {
            Intro.setBackgroundColor(Theme.getColor(null, i2, false));
            return;
        }
        EGLThread eGLThread = this.eglThread;
        if (eGLThread != null) {
            eGLThread.postRunnable(new IntroActivity$$ExternalSyntheticLambda6(this, 0));
        }
        for (int i3 = 0; i3 < this.viewPager.getChildCount(); i3++) {
            View childAt = this.viewPager.getChildAt(i3);
            TextView textView = (TextView) childAt.findViewWithTag(this.pagerHeaderTag);
            int i4 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i4, false));
            ((TextView) childAt.findViewWithTag(this.pagerMessageTag)).setTextColor(Theme.getColor(null, i4, false));
        }
    }

    public final class AnonymousClass4 extends TextView {
        public final int $r8$classId = 3;
        public Object cellFlickerDrawable;
        public final Object this$0;

        public AnonymousClass4(Context context) {
            super(context);
            this.this$0 = new Path();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 4:
                    Paint paint = (Paint) this.cellFlickerDrawable;
                    paint.setColor(Theme.multAlpha(0.8f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    Layout layout = getLayout();
                    int iMax = 0;
                    for (int i = 0; i < layout.getLineCount(); i++) {
                        iMax = Math.max(iMax, (int) layout.getLineWidth(i));
                    }
                    float f = iMax / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - AndroidUtilities.dp(8.0f), height, paint);
                    canvas.drawLine((getWidth() / 2.0f) + f + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                    super.dispatchDraw(canvas);
                    break;
                case 5:
                case 6:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 7:
                    int iDp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                    int iMax2 = Math.max(1, AndroidUtilities.dp(0.66f));
                    Layout layout2 = getLayout();
                    if (layout2 != null) {
                        Paint paint2 = (Paint) this.cellFlickerDrawable;
                        paint2.setColor(Theme.multAlpha(0.45f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.this$0).this$0.resourcesProvider)));
                        float f2 = iDp;
                        float f3 = iMax2 / 2.0f;
                        float f4 = f2 - f3;
                        float f5 = f2 + f3;
                        canvas.drawRect(0.0f, f4, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f5, paint2);
                        canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f4, getWidth(), f5, paint2);
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 8:
                    int iDp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                    int iMax3 = Math.max(1, AndroidUtilities.dp(0.66f));
                    Layout layout3 = getLayout();
                    if (layout3 != null) {
                        Paint paint3 = (Paint) this.cellFlickerDrawable;
                        paint3.setColor(Theme.multAlpha(0.45f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, (Theme.ResourcesProvider) this.this$0)));
                        float f6 = iDp2;
                        float f7 = iMax3 / 2.0f;
                        float f8 = f6 - f7;
                        float f9 = f6 + f7;
                        canvas.drawRect(0.0f, f8, (getWidth() - (layout3.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f9, paint3);
                        canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f8, getWidth(), f9, paint3);
                    }
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    ((IntroActivity) this.this$0).startMessagingButtonBackground.draw(canvas);
                    super.draw(canvas);
                    break;
                case 1:
                    ((ActionIntroActivity) this.this$0).startMessagingButtonBackground.draw(canvas);
                    super.draw(canvas);
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((CellFlickerDrawable) this.cellFlickerDrawable).draw(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    break;
                case 1:
                    super.onDraw(canvas);
                    if (((ActionIntroActivity) this.this$0).flickerButton) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        ((CellFlickerDrawable) this.cellFlickerDrawable).draw(getMeasuredHeight() / 2.0f, canvas, rectF2, null);
                        invalidate();
                    }
                    break;
                case 2:
                    Paint paint = (Paint) this.cellFlickerDrawable;
                    paint.setColor(((ChatAttachAlert) this.this$0).getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                    super.onDraw(canvas);
                    break;
                case 3:
                    if (((StarParticlesView.Drawable) this.cellFlickerDrawable) != null) {
                        canvas.save();
                        canvas.clipPath((Path) this.this$0);
                        ((StarParticlesView.Drawable) this.cellFlickerDrawable).onDraw(canvas, 1.0f);
                        canvas.restore();
                        invalidate();
                    }
                    super.onDraw(canvas);
                    break;
                case 4:
                case 7:
                case 8:
                default:
                    super.onDraw(canvas);
                    break;
                case 5:
                    Paint paint2 = (Paint) this.cellFlickerDrawable;
                    paint2.setColor(((CountrySelectBottomSheet) this.this$0).getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                    super.onDraw(canvas);
                    break;
                case 6:
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    GroupCallActivity.AnonymousClass47 anonymousClass47 = (GroupCallActivity.AnonymousClass47) this.this$0;
                    int i2 = anonymousClass47.currentPage;
                    Paint[] paintArr = (Paint[]) this.cellFlickerDrawable;
                    paintArr[i2].setAlpha(255);
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[anonymousClass47.currentPage]);
                    float f = anonymousClass47.pageOffset;
                    if (f > 0.0f && (i = anonymousClass47.currentPage + 1) < paintArr.length) {
                        paintArr[i].setAlpha((int) (f * 255.0f));
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[anonymousClass47.currentPage + 1]);
                    }
                    super.onDraw(canvas);
                    break;
                case 9:
                    Paint paint3 = (Paint) this.cellFlickerDrawable;
                    paint3.setColor(((CommunityEditActivity) this.this$0).getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                    super.onDraw(canvas);
                    break;
                case 10:
                    BlockRow blockRow = ((RichTextCell) this.this$0).currentRow;
                    if (blockRow != null && blockRow.level > 0 && blockRow.num == 0 && !blockRow.checkbox) {
                        Paint paint4 = (Paint) this.cellFlickerDrawable;
                        paint4.setColor(getCurrentTextColor());
                        canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), AndroidUtilities.dpf2(4.3f) / 2.0f, paint4);
                    } else {
                        super.onDraw(canvas);
                    }
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 3:
                    super.onLayout(z, i, i2, i3, i4);
                    StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(10);
                    this.cellFlickerDrawable = drawable;
                    drawable.type = 100;
                    drawable.isCircle = false;
                    drawable.roundEffect = true;
                    drawable.useRotate = false;
                    drawable.useBlur = true;
                    drawable.checkBounds = true;
                    drawable.size1 = 1;
                    drawable.k3 = 0.98f;
                    drawable.k2 = 0.98f;
                    drawable.k1 = 0.98f;
                    drawable.paused = false;
                    drawable.speedScale = 0.0f;
                    drawable.minLifeTime = 750L;
                    drawable.randLifeTime = 750;
                    drawable.init();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((StarParticlesView.Drawable) this.cellFlickerDrawable).rect.set(rectF);
                    ((StarParticlesView.Drawable) this.cellFlickerDrawable).rect2.set(rectF);
                    ((StarParticlesView.Drawable) this.cellFlickerDrawable).resetPositions();
                    Path path = (Path) this.this$0;
                    path.reset();
                    path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    if (View.MeasureSpec.getSize(i) <= AndroidUtilities.dp(260.0f)) {
                        super.onMeasure(i, i2);
                    } else {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i2);
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            LinearGradient linearGradient;
            switch (this.$r8$classId) {
                case 0:
                    super.onSizeChanged(i, i2, i3, i4);
                    IntroActivity introActivity = (IntroActivity) this.this$0;
                    introActivity.startMessagingButtonBackground.setBounds(0, 0, i, i2);
                    introActivity.startMessagingButtonBackground.setCornerRadius(Math.min(i, i2) / 2.0f);
                    ((CellFlickerDrawable) this.cellFlickerDrawable).parentWidth = i;
                    break;
                case 1:
                    super.onSizeChanged(i, i2, i3, i4);
                    ActionIntroActivity actionIntroActivity = (ActionIntroActivity) this.this$0;
                    actionIntroActivity.startMessagingButtonBackground.setBounds(0, 0, i, i2);
                    actionIntroActivity.startMessagingButtonBackground.setCornerRadius(Math.min(i, i2) / 2.0f);
                    ((CellFlickerDrawable) this.cellFlickerDrawable).parentWidth = i;
                    break;
                case 6:
                    super.onSizeChanged(i, i2, i3, i4);
                    int i8 = 0;
                    while (true) {
                        Paint[] paintArr = (Paint[]) this.cellFlickerDrawable;
                        if (i8 < paintArr.length) {
                            GroupCallActivity.AnonymousClass47 anonymousClass47 = (GroupCallActivity.AnonymousClass47) this.this$0;
                            if (i8 == 0 && anonymousClass47.needScreencast) {
                                i6 = -8919716;
                                i5 = -11089922;
                            } else {
                                i5 = -9015575;
                                if (i8 == 0 || (i8 == 1 && anonymousClass47.needScreencast)) {
                                    i6 = -11033346;
                                } else {
                                    i7 = -1792170;
                                    i6 = -9015575;
                                    i5 = -1026983;
                                }
                                if (i7 != 0) {
                                    linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i6, i5, i7}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i6, i5}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                                paintArr[i8].setShader(linearGradient);
                                i8++;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i6, i5, i7}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i6, i5}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                            paintArr[i8].setShader(linearGradient);
                            i8++;
                        }
                        break;
                    }
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        public AnonymousClass4(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.this$0 = resourcesProvider;
            this.cellFlickerDrawable = new Paint(1);
        }

        public AnonymousClass4(ActionIntroActivity actionIntroActivity, Context context) {
            super(context);
            this.this$0 = actionIntroActivity;
            CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
            this.cellFlickerDrawable = cellFlickerDrawable;
            cellFlickerDrawable.drawFrame = false;
            cellFlickerDrawable.repeatProgress = 2.0f;
        }

        public AnonymousClass4(ChatAttachAlert chatAttachAlert, Context context) {
            super(context);
            this.this$0 = chatAttachAlert;
            this.cellFlickerDrawable = new Paint(1);
        }

        public AnonymousClass4(LimitReachedBottomSheet.HeaderView headerView, Context context) {
            super(context);
            this.this$0 = headerView;
            this.cellFlickerDrawable = new Paint(1);
        }

        public AnonymousClass4(CountrySelectBottomSheet countrySelectBottomSheet, Context context) {
            super(context);
            this.this$0 = countrySelectBottomSheet;
            this.cellFlickerDrawable = new Paint(1);
        }

        public AnonymousClass4(GroupCallActivity.AnonymousClass47 anonymousClass47, Context context) {
            super(context);
            this.this$0 = anonymousClass47;
            this.cellFlickerDrawable = new Paint[anonymousClass47.titles.length];
            int i = 0;
            while (true) {
                Paint[] paintArr = (Paint[]) this.cellFlickerDrawable;
                if (i >= paintArr.length) {
                    return;
                }
                paintArr[i] = new Paint(1);
                i++;
            }
        }

        public AnonymousClass4(IntroActivity introActivity, Context context) {
            super(context);
            this.this$0 = introActivity;
            CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
            this.cellFlickerDrawable = cellFlickerDrawable;
            cellFlickerDrawable.drawFrame = false;
            cellFlickerDrawable.repeatProgress = 2.0f;
        }

        public AnonymousClass4(BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer, Context context) {
            super(context);
            this.this$0 = botPreviewsEditLangContainer;
            this.cellFlickerDrawable = new Paint(1);
        }

        public AnonymousClass4(CommunityEditActivity communityEditActivity, Context context) {
            super(context);
            this.this$0 = communityEditActivity;
            this.cellFlickerDrawable = new Paint(1);
        }

        public AnonymousClass4(RichTextCell richTextCell, Context context) {
            super(context);
            this.this$0 = richTextCell;
            this.cellFlickerDrawable = new Paint(1);
        }
    }

    public final class EGLThread extends DispatchQueue {
        public static final int $r8$clinit = 0;
        public final LaunchActivity.AnonymousClass18 drawRunnable;
        public EGL10 egl10;
        public EGLConfig eglConfig;
        public EGLContext eglContext;
        public EGLDisplay eglDisplay;
        public EGLSurface eglSurface;
        public boolean initied;
        public long lastDrawFrame;
        public float maxRefreshRate;
        public final SurfaceTexture surfaceTexture;
        public final PhotoViewer$$ExternalSyntheticLambda97 telegramMaskProvider;
        public final int[] textures;

        public EGLThread(SurfaceTexture surfaceTexture) {
            super("EGLThread");
            this.textures = new int[24];
            this.telegramMaskProvider = new PhotoViewer$$ExternalSyntheticLambda97(10);
            this.drawRunnable = new LaunchActivity.AnonymousClass18(this, 13);
            this.surfaceTexture = surfaceTexture;
        }

        public final void finish() {
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != null) {
                this.egl10.eglTerminate(eGLDisplay2);
                this.eglDisplay = null;
            }
        }

        public final void loadTexture(GenericProvider genericProvider, int i, boolean z) {
            int[] iArr = this.textures;
            if (z) {
                GLES20.glDeleteTextures(1, iArr, i);
                GLES20.glGenTextures(1, iArr, i);
            }
            Bitmap bitmap = (Bitmap) genericProvider.provide(null);
            GLES20.glBindTexture(3553, iArr[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
        }

        @Override
        public final void run() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            boolean z = false;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else if (this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                IntroActivity introActivity = IntroActivity.this;
                if (!this.egl10.eglChooseConfig(this.eglDisplay, EmuDetector.with(introActivity.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.eglConfig = eGLConfig;
                    EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.eglContext = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null) {
                        if (BuildVars.LOGS_ENABLED) {
                            CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        SurfaceTexture surfaceTexture = this.surfaceTexture;
                        if (surfaceTexture != null) {
                            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                            if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                                int[] iArr2 = this.textures;
                                GLES20.glGenTextures(23, iArr2, 0);
                                loadTexture(R.drawable.intro_fast_arrow_shadow, 0, 0, false);
                                loadTexture(R.drawable.intro_fast_arrow, 1, 0, false);
                                loadTexture(R.drawable.intro_fast_body, 2, 0, false);
                                loadTexture(R.drawable.intro_fast_spiral, 3, 0, false);
                                loadTexture(R.drawable.intro_ic_bubble_dot, 4, 0, false);
                                loadTexture(R.drawable.intro_ic_bubble, 5, 0, false);
                                loadTexture(R.drawable.intro_ic_cam_lens, 6, 0, false);
                                loadTexture(R.drawable.intro_ic_cam, 7, 0, false);
                                loadTexture(R.drawable.intro_ic_pencil, 8, 0, false);
                                loadTexture(R.drawable.intro_ic_pin, 9, 0, false);
                                loadTexture(R.drawable.intro_ic_smile_eye, 10, 0, false);
                                loadTexture(R.drawable.intro_ic_smile, 11, 0, false);
                                loadTexture(R.drawable.intro_ic_videocam, 12, 0, false);
                                loadTexture(R.drawable.intro_knot_down, 13, 0, false);
                                loadTexture(R.drawable.intro_knot_up, 14, 0, false);
                                loadTexture(R.drawable.intro_powerful_infinity_white, 15, 0, false);
                                loadTexture(R.drawable.intro_powerful_infinity, 16, 0, false);
                                loadTexture(R.drawable.intro_powerful_mask, 17, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), false);
                                loadTexture(R.drawable.intro_powerful_star, 18, 0, false);
                                loadTexture(R.drawable.intro_private_door, 19, 0, false);
                                loadTexture(R.drawable.intro_private_screw, 20, 0, false);
                                loadTexture(R.drawable.intro_tg_plane, 21, 0, false);
                                loadTexture(new PhotoViewer$$ExternalSyntheticLambda97(9), 22, false);
                                loadTexture(this.telegramMaskProvider, 23, false);
                                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                                Intro.setPowerfulTextures(iArr2[17], iArr2[18], iArr2[16], iArr2[15]);
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                introActivity.currentDate = System.currentTimeMillis() - 1000;
                                z = true;
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
            this.initied = z;
            super.run();
        }

        public final void loadTexture(int i, int i2, int i3, boolean z) {
            Drawable drawable = IntroActivity.this.getParentActivity().getResources().getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                int[] iArr = this.textures;
                if (z) {
                    GLES20.glDeleteTextures(1, iArr, i2);
                    GLES20.glGenTextures(1, iArr, i2);
                }
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                GLES20.glBindTexture(3553, iArr[i2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                if (i3 != 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(5);
                    paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
                    bitmapCreateBitmap.recycle();
                    return;
                }
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
        }
    }

    public final class AnonymousClass3 implements ViewPager.OnPageChangeListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onPageScrollStateChanged(int i) {
            switch (this.$r8$classId) {
                case 0:
                    IntroActivity introActivity = (IntroActivity) this.this$0;
                    if (i == 1) {
                        introActivity.dragging = true;
                        introActivity.viewPager.getCurrentItem();
                        introActivity.viewPager.getMeasuredWidth();
                    } else if (i == 0 || i == 2) {
                        if (introActivity.dragging) {
                            introActivity.dragging = false;
                        }
                        if (introActivity.lastPage != introActivity.viewPager.getCurrentItem()) {
                            introActivity.lastPage = introActivity.viewPager.getCurrentItem();
                        }
                    }
                    break;
                case 2:
                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) this.this$0;
                    if (i == 0) {
                        PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, pagerSlidingTabStrip.pager.getCurrentItem(), 0);
                    }
                    ViewPager.OnPageChangeListener onPageChangeListener = pagerSlidingTabStrip.delegatePageListener;
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageScrollStateChanged(i);
                    }
                    break;
                case 4:
                    SelfStoryViewsView selfStoryViewsView = (SelfStoryViewsView) this.this$0;
                    selfStoryViewsView.getClass();
                    if (i == 1) {
                        selfStoryViewsView.listenPager = true;
                    }
                    break;
            }
        }

        @Override
        public final void onPageScrolled(float f, int i, int i2) {
            float f2;
            switch (this.$r8$classId) {
                case 0:
                    IntroActivity introActivity = (IntroActivity) this.this$0;
                    BottomPagesView bottomPagesView = introActivity.bottomPages;
                    bottomPagesView.progress = f;
                    bottomPagesView.scrollPosition = i;
                    bottomPagesView.invalidate();
                    float measuredWidth = introActivity.viewPager.getMeasuredWidth();
                    if (measuredWidth != 0.0f) {
                        Intro.setScrollOffset((((i * measuredWidth) + i2) - (introActivity.currentViewPagerPage * measuredWidth)) / measuredWidth);
                        break;
                    }
                    break;
                case 1:
                    ArticleViewer.BlockSlideshowCell blockSlideshowCell = (ArticleViewer.BlockSlideshowCell) this.this$0;
                    float measuredWidth2 = blockSlideshowCell.innerListView.getMeasuredWidth();
                    if (measuredWidth2 != 0.0f) {
                        blockSlideshowCell.pageOffset = SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(blockSlideshowCell.currentPage, measuredWidth2, (i * measuredWidth2) + i2, measuredWidth2);
                        blockSlideshowCell.dotsContainer.invalidate();
                        break;
                    }
                    break;
                case 2:
                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) this.this$0;
                    pagerSlidingTabStrip.currentPosition = i;
                    pagerSlidingTabStrip.currentPositionOffset = f;
                    if (pagerSlidingTabStrip.tabsContainer.getChildAt(i) != null) {
                        PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, i, (int) (pagerSlidingTabStrip.tabsContainer.getChildAt(i).getWidth() * f));
                        pagerSlidingTabStrip.invalidate();
                        ViewPager.OnPageChangeListener onPageChangeListener = pagerSlidingTabStrip.delegatePageListener;
                        if (onPageChangeListener != null) {
                            onPageChangeListener.onPageScrolled(f, i, i2);
                        }
                    }
                    break;
                case 3:
                    ProfileGalleryBlurView profileGalleryBlurView = (ProfileGalleryBlurView) this.this$0;
                    if (!profileGalleryBlurView.usingRenderNode && Math.abs(i - profileGalleryBlurView.currentPosition) == 1) {
                        int i3 = profileGalleryBlurView.currentPosition;
                        if (i > i3) {
                            ProfileGalleryBlurView.access$200(profileGalleryBlurView, 0, 1, 1);
                        } else if (i < i3) {
                            ProfileGalleryBlurView.access$200(profileGalleryBlurView, 1, 0, 0);
                            ProfileGalleryBlurView.access$200(profileGalleryBlurView, 2, 0, -1);
                        }
                    }
                    int i4 = profileGalleryBlurView.currentPosition;
                    int i5 = profileGalleryBlurView.offset;
                    profileGalleryBlurView.currentPosition = i;
                    profileGalleryBlurView.offset = i2;
                    if (i4 != i || i5 != i2) {
                        profileGalleryBlurView.needNewFrame = true;
                        profileGalleryBlurView.postInvalidateOnAnimation();
                    }
                    break;
                case 4:
                    SelfStoryViewsView selfStoryViewsView = (SelfStoryViewsView) this.this$0;
                    if (selfStoryViewsView.listenPager) {
                        SelfStoryViewsView.AnonymousClass1 anonymousClass1 = selfStoryViewsView.selfStoriesPreviewView;
                        anonymousClass1.scroller.abortAnimation();
                        if (Math.abs(f) <= 1.0f) {
                            ValueAnimator valueAnimator = anonymousClass1.scrollAnimator;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                anonymousClass1.scrollAnimator = null;
                            }
                            float f3 = (-anonymousClass1.getMeasuredWidth()) / 2.0f;
                            int i6 = anonymousClass1.viewW;
                            float f4 = (i6 / 2.0f) + f3 + ((i6 + anonymousClass1.childPadding) * i);
                            if (f > 0.0f) {
                                float f5 = (-anonymousClass1.getMeasuredWidth()) / 2.0f;
                                int i7 = anonymousClass1.viewW;
                                f2 = (i7 / 2.0f) + f5 + ((i + 1) * (i7 + anonymousClass1.childPadding));
                            } else {
                                float f6 = (-anonymousClass1.getMeasuredWidth()) / 2.0f;
                                int i8 = anonymousClass1.viewW;
                                f2 = (i8 / 2.0f) + f6 + ((i - 1) * (i8 + anonymousClass1.childPadding));
                                f = -f;
                            }
                            if (f == 0.0f) {
                                anonymousClass1.scrollX = f4;
                            } else {
                                anonymousClass1.scrollX = AndroidUtilities.lerp(f4, f2, f);
                            }
                            anonymousClass1.checkScroll = false;
                            anonymousClass1.invalidate();
                            break;
                        }
                    }
                    break;
            }
        }

        @Override
        public final void onPageSelected(int i) {
            switch (this.$r8$classId) {
                case 0:
                    ((IntroActivity) this.this$0).currentViewPagerPage = i;
                    break;
                case 1:
                    ArticleViewer.BlockSlideshowCell blockSlideshowCell = (ArticleViewer.BlockSlideshowCell) this.this$0;
                    blockSlideshowCell.currentPage = i;
                    blockSlideshowCell.dotsContainer.invalidate();
                    break;
                case 2:
                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) this.this$0;
                    ViewPager.OnPageChangeListener onPageChangeListener = pagerSlidingTabStrip.delegatePageListener;
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageSelected(i);
                    }
                    int i2 = 0;
                    while (i2 < pagerSlidingTabStrip.tabsContainer.getChildCount()) {
                        pagerSlidingTabStrip.tabsContainer.getChildAt(i2).setSelected(i2 == i);
                        i2++;
                    }
                    break;
                case 3:
                case 4:
                    break;
                default:
                    ((ThemePreviewActivity) this.this$0).dotsContainer.invalidate();
                    break;
            }
        }

        private final void onPageScrollStateChanged$org$telegram$ui$ArticleViewer$BlockSlideshowCell$2(int i) {
        }

        private final void onPageScrollStateChanged$org$telegram$ui$Components$ProfileGalleryBlurView$1(int i) {
        }

        private final void onPageScrollStateChanged$org$telegram$ui$ThemePreviewActivity$28(int i) {
        }

        private final void onPageSelected$org$telegram$ui$Components$ProfileGalleryBlurView$1(int i) {
        }

        private final void onPageSelected$org$telegram$ui$Stories$SelfStoryViewsView$3(int i) {
        }

        private final void onPageScrolled$org$telegram$ui$ThemePreviewActivity$28(float f, int i, int i2) {
        }
    }
}

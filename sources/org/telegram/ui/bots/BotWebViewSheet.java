package org.telegram.ui.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda54;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda128;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda133;
import org.telegram.ui.SecretMediaViewer$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda73;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda24;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda25;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda28;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda3;
import org.telegram.ui.web.MHTML;

public final class BotWebViewSheet extends Dialog implements NotificationCenter.NotificationCenterDelegate, BottomSheetTabsOverlay.Sheet {
    public static final SimpleFloatPropertyCompat ACTION_BAR_TRANSITION_PROGRESS_VALUE;
    public static final HashSet activeSheets = new HashSet();
    public static int shownLockedBots;
    public final AnonymousClass5 actionBar;
    public int actionBarColor;
    public int actionBarColorKey;
    public boolean actionBarIsLight;
    public final FrameLayout.LayoutParams actionBarLayoutParams;
    public final Paint actionBarPaint;
    public final Drawable actionBarShadow;
    public float actionBarTransitionProgress;
    public boolean attached;
    public boolean backButtonShown;
    public ValueAnimator backgroundColorAnimator;
    public final Paint backgroundPaint;
    public final AnonymousClass4 botButtons;
    public long botId;
    public final BottomSheetTabs bottomTabs;
    public final MHTML bottomTabsClip;
    public final FrameLayout bulletinContainer;
    public final FrameLayout.LayoutParams bulletinContainerLayoutParams;
    public String buttonText;
    public int currentAccount;
    public boolean defaultFullsize;
    public final Paint dimPaint;
    public boolean dismissed;
    public Bulletin downloadBulletin;
    public BotDownloads.DownloadBulletin downloadBulletinLayout;
    public String errorCode;
    public ArticleViewer.ErrorContainer errorContainer;
    public boolean errorShown;
    public final HashMap fileItems;
    public boolean forceExpnaded;
    public boolean fromTab;
    public boolean fullscreen;
    public ValueAnimator fullscreenAnimator;
    public boolean fullscreenBlur;
    public final BotFullscreenButtons fullscreenButtons;
    public boolean fullscreenInProgress;
    public float fullscreenProgress;
    public float fullscreenTransitionProgress;
    public Boolean fullsize;
    public boolean hasSettings;
    public boolean ignoreLayout;
    public final Rect insets;
    public int keyboardInset;
    public BotDownloads.FileDownload lastBulletinFile;
    public BottomSheetTabs.WebTabData lastTab;
    public int lineColor;
    public final Paint linePaint;
    public long monoforumTopicId;
    public int navBarColor;
    public final Rect navInsets;
    public boolean needCloseConfirmation;
    public boolean needsContext;
    public ThemeActivity$$ExternalSyntheticLambda24 onVerifiedAge;
    public ValueAnimator openAnimator;
    public float openedProgress;
    public ItemOptions options;
    public BotFullscreenButtons.OptionsIcon optionsIcon;
    public ActionBarMenuItem optionsItem;
    public boolean orientationLocked;
    public boolean overrideActionBarColor;
    public boolean overrideBackgroundColor;
    public Activity parentActivity;
    public final PasscodeView passcodeView;
    public long peerId;
    public final BotWebViewSheet$$ExternalSyntheticLambda0 pollRunnable;
    public final AnonymousClass7 progressView;
    public long queryId;
    public int replyToMsgId;
    public WebViewRequestProps requestProps;
    public boolean resetOffsetY;
    public final Theme.ResourcesProvider resourcesProvider;
    public BotSensors sensors;
    public boolean showExpanded;
    public float showOffsetY;
    public SpringAnimation springAnimation;
    public boolean superDismissed;
    public final AnonymousClass1 swipeContainer;
    public int swipeContainerFromHeight;
    public int swipeContainerFromWidth;
    public final FrameLayout.LayoutParams swipeContainerLayoutParams;
    public Drawable verifiedDrawable;
    public Boolean wasLightStatusBar;
    public final AnonymousClass2 webViewContainer;
    public final WindowView windowView;

    public final class AnonymousClass1 extends ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer {
        public AnonymousClass1(Context context) {
            super(context);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i2);
            if (AndroidUtilities.isTablet()) {
                i3 = (size / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (size / 3.5f);
                } else {
                    i3 = (size / 5) * 2;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            float offsetY = getOffsetY();
            float f = i3;
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (offsetY != f && !botWebViewSheet.dismissed && botWebViewSheet.resetOffsetY) {
                botWebViewSheet.ignoreLayout = true;
                setOffsetY(f);
                botWebViewSheet.ignoreLayout = false;
                botWebViewSheet.resetOffsetY = false;
            }
            if (!botWebViewSheet.fullscreen && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                Point point2 = AndroidUtilities.displaySize;
                i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), 1073741824);
            }
            int size2 = View.MeasureSpec.getSize(i2);
            if (!botWebViewSheet.fullscreen) {
                size2 = (size2 - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
            }
            AnonymousClass4 anonymousClass4 = botWebViewSheet.botButtons;
            if (anonymousClass4 != null && anonymousClass4.getTotalHeight() > 0) {
                size2 -= anonymousClass4.getTotalHeight();
            }
            super.onMeasure(i, zzkm.m(24.0f, size2));
        }

        @Override
        public final void requestLayout() {
            if (BotWebViewSheet.this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            BotFullscreenButtons botFullscreenButtons = botWebViewSheet.fullscreenButtons;
            if (botFullscreenButtons != null) {
                botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f);
            }
            FrameLayout frameLayout = botWebViewSheet.bulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY(botWebViewSheet.swipeContainer.getTranslationY() + AndroidUtilities.lerp(ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + botWebViewSheet.insets.top, botWebViewSheet.fullscreenProgress));
            }
        }
    }

    public final class AnonymousClass16 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;
        public final int val$from;
        public final int val$to;

        public AnonymousClass16(KeyEvent.Callback callback, int i, int i2, int i3) {
            this.$r8$classId = i3;
            this.this$0 = callback;
            this.val$from = i;
            this.val$to = i2;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            int i;
            RecyclerView.Adapter adapter;
            switch (this.$r8$classId) {
                case 0:
                    int iBlendARGB = ColorUtils.blendARGB(1.0f, this.val$from, this.val$to);
                    BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.this$0;
                    botWebViewSheet.navBarColor = iBlendARGB;
                    botWebViewSheet.checkNavBarColor();
                    break;
                case 1:
                    int i2 = this.val$from;
                    GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.this$0;
                    groupCallUserCell.lastColor = i2;
                    groupCallUserCell.lastWavesColor = this.val$to;
                    groupCallUserCell.muteButton.setColorFilter(new PorterDuffColorFilter(groupCallUserCell.lastColor, PorterDuff.Mode.MULTIPLY));
                    groupCallUserCell.textPaint.setColor(groupCallUserCell.lastColor);
                    groupCallUserCell.selectionPaint.setColor(groupCallUserCell.lastWavesColor);
                    groupCallUserCell.avatarWavesDrawable.setColor(ColorUtils.setAlphaComponent(groupCallUserCell.lastWavesColor, 38));
                    break;
                case 2:
                    SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.this$0;
                    sharedMediaLayout.notificationsLocker.unlock();
                    sharedMediaLayout.photoVideoChangeColumnsAnimation = false;
                    int i3 = this.val$to;
                    int[] iArr = sharedMediaLayout.mediaColumnsCount;
                    int i4 = this.val$from;
                    iArr[i4] = i3;
                    int i5 = 0;
                    while (true) {
                        SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                        if (i5 >= mediaPageArr.length) {
                            sharedMediaLayout.saveScrollPosition();
                        } else {
                            SharedMediaLayout.MediaPage mediaPage = mediaPageArr[i5];
                            if (mediaPage != null && mediaPage.listView != null && (((i = mediaPage.selectedType) == 0 || SharedMediaLayout.isAnyStoryPageType(i)) && (adapter = sharedMediaLayout.mediaPages[i5].listView.getAdapter()) != null)) {
                                int itemCount = adapter.getItemCount();
                                if (i5 == 0) {
                                    sharedMediaLayout.sharedMediaData[0].setListFrozen(false);
                                }
                                sharedMediaLayout.mediaPages[i5].layoutManager.setSpanCount(sharedMediaLayout.mediaColumnsCount[i4]);
                                sharedMediaLayout.mediaPages[i5].listView.invalidateItemDecorations();
                                if (adapter.getItemCount() == itemCount) {
                                    AndroidUtilities.updateVisibleRows(sharedMediaLayout.mediaPages[i5].listView);
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                sharedMediaLayout.mediaPages[i5].animationSupportingListView.setVisibility(8);
                            }
                            i5++;
                        }
                        break;
                    }
                    break;
                default:
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.this$0;
                    int i6 = this.val$from;
                    groupCallMiniTextureView.lastIconColor = i6;
                    groupCallMiniTextureView.animateToColor = i6;
                    int i7 = this.val$to;
                    groupCallMiniTextureView.lastSpeakingFrameColor = i7;
                    groupCallMiniTextureView.speakingPaint.setColor(i7);
                    if (groupCallMiniTextureView.progressToSpeaking > 0.0f) {
                        groupCallMiniTextureView.invalidate();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass3 implements BotWebViewContainer.Delegate {
        public boolean sentWebViewData;
        public final Context val$context;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass3(Context context, Theme.ResourcesProvider resourcesProvider) {
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override
        public final BotSensors getBotSensors() {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.sensors == null) {
                BotSensors botSensors = new BotSensors(this.val$context);
                botWebViewSheet.sensors = botSensors;
                botSensors.webView = botWebViewSheet.webViewContainer.getWebView();
            }
            return botWebViewSheet.sensors;
        }

        @Override
        public final boolean isClipboardAvailable() {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            return MediaDataController.getInstance(botWebViewSheet.currentAccount).botInAttachMenu(botWebViewSheet.botId) || MessagesController.getInstance(botWebViewSheet.currentAccount).whitelistedBots.contains(Long.valueOf(botWebViewSheet.botId));
        }

        @Override
        public final void onCloseRequested() {
            BotWebViewSheet.this.dismiss$1(false);
        }

        @Override
        public final void onCloseToTabs() {
            BotWebViewSheet.this.dismiss$1(true);
        }

        @Override
        public final void onEmojiStatusGranted() {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            TLRPC.User user = MessagesController.getInstance(botWebViewSheet.currentAccount).getUser(Long.valueOf(botWebViewSheet.botId));
            BinaryBitmap binaryBitmap = new BinaryBitmap(24);
            binaryBitmap.binarizer = new BotWebViewSheet$3$$ExternalSyntheticLambda1(this, 0);
            Bulletin bulletinCreateUsersBulletin = new BulletinFactory(botWebViewSheet.bulletinContainer, botWebViewSheet.resourcesProvider).createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, binaryBitmap);
            bulletinCreateUsersBulletin.duration = 5000;
            bulletinCreateUsersBulletin.show(true);
        }

        @Override
        public final void onEmojiStatusSet(TLRPC.Document document) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            new BulletinFactory(botWebViewSheet.bulletinContainer, botWebViewSheet.resourcesProvider).createEmojiBulletin(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).show(true);
        }

        @Override
        public final String onFullscreenRequested(boolean z, boolean z2) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            boolean z3 = botWebViewSheet.fullscreen;
            if (z3 != z) {
                botWebViewSheet.setFullscreen(z, true, z2);
                return null;
            }
            if (z3) {
                return "ALREADY_FULLSCREEN";
            }
            return null;
        }

        @Override
        public final void onInstantClose() {
            onCloseRequested();
        }

        @Override
        public final void onLocationGranted(boolean z) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            TLRPC.User user = MessagesController.getInstance(botWebViewSheet.currentAccount).getUser(Long.valueOf(botWebViewSheet.botId));
            Theme.ResourcesProvider resourcesProvider = botWebViewSheet.resourcesProvider;
            FrameLayout frameLayout = botWebViewSheet.bulletinContainer;
            int i = 1;
            if (z) {
                BinaryBitmap binaryBitmap = new BinaryBitmap(24);
                LocaleController.getString(R.string.UndoNoCaps);
                binaryBitmap.binarizer = new BotWebViewSheet$3$$ExternalSyntheticLambda1(this, i);
                Bulletin bulletinCreateUsersBulletin = new BulletinFactory(frameLayout, resourcesProvider).createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, binaryBitmap);
                bulletinCreateUsersBulletin.duration = 5000;
                bulletinCreateUsersBulletin.show(true);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new BotWebViewSheet$3$$ExternalSyntheticLambda1(this, 2)), true));
            Bulletin bulletinCreateSimpleBulletinDetail = new BulletinFactory(frameLayout, resourcesProvider).createSimpleBulletinDetail(R.raw.error, spannableStringBuilder);
            bulletinCreateSimpleBulletinDetail.duration = 5000;
            bulletinCreateSimpleBulletinDetail.show(true);
        }

        @Override
        public final void onOpenBackFromTabs() {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.lastTab != null) {
                BottomSheetTabs bottomSheetTabs = LaunchActivity.instance.getBottomSheetTabs();
                if (bottomSheetTabs != null) {
                    bottomSheetTabs.openTab(botWebViewSheet.lastTab);
                }
                botWebViewSheet.lastTab = null;
            }
        }

        @Override
        public final void onOrientationLockChanged(boolean z) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.orientationLocked == z) {
                return;
            }
            botWebViewSheet.orientationLocked = z;
            if (botWebViewSheet.attached) {
                if (z) {
                    BotWebViewSheet.shownLockedBots++;
                } else {
                    BotWebViewSheet.shownLockedBots--;
                }
            }
            if (BotWebViewSheet.shownLockedBots > 0) {
                Activity ownerActivity = botWebViewSheet.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.instance;
                }
                if (ownerActivity == null) {
                    ownerActivity = AndroidUtilities.findActivity(botWebViewSheet.getContext());
                }
                AndroidUtilities.lockOrientation(ownerActivity);
                return;
            }
            Activity ownerActivity2 = botWebViewSheet.getOwnerActivity();
            if (ownerActivity2 == null) {
                ownerActivity2 = LaunchActivity.instance;
            }
            if (ownerActivity2 == null) {
                ownerActivity2 = AndroidUtilities.findActivity(botWebViewSheet.getContext());
            }
            AndroidUtilities.unlockOrientation(ownerActivity2);
        }

        @Override
        public final void onSendWebViewData(String str) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.queryId != 0 || this.sentWebViewData) {
                return;
            }
            this.sentWebViewData = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputUser(botWebViewSheet.botId);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = botWebViewSheet.buttonText;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(botWebViewSheet.currentAccount).sendRequest(tL_messages_sendWebViewData, new BotWebViewSheet$3$$ExternalSyntheticLambda2(this, 0));
        }

        @Override
        public final void onSetBackButtonVisible(boolean z) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            ImageView backButton = botWebViewSheet.actionBar.getBackButton();
            botWebViewSheet.backButtonShown = z;
            AndroidUtilities.updateImageViewImageAnimated(backButton, z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
            BotFullscreenButtons botFullscreenButtons = botWebViewSheet.fullscreenButtons;
            if (botFullscreenButtons != null) {
                botFullscreenButtons.setBack(z, true);
            }
        }

        @Override
        public final void onSetSettingsButtonVisible(boolean z) {
            BotWebViewSheet.this.hasSettings = z;
        }

        @Override
        public final void onSetupMainButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            AnonymousClass4 anonymousClass4 = botWebViewSheet.botButtons;
            BotButtons.ButtonState buttonState = new BotButtons.ButtonState();
            buttonState.visible = z;
            buttonState.active = z2;
            buttonState.progressVisible = z3;
            buttonState.shineEffect = z4;
            buttonState.text = str;
            buttonState.emojiId = j;
            buttonState.color = i;
            buttonState.textColor = i2;
            buttonState.position = null;
            int totalHeight = anonymousClass4.getTotalHeight();
            anonymousClass4.state.trimmer = buttonState;
            BotButtons.Button[] buttonArr = anonymousClass4.buttons;
            buttonArr[0].textDrawable.cancelAnimation();
            if (buttonState.emojiId != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.append((CharSequence) buttonState.text);
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(buttonState.emojiId, 1.4f, buttonArr[0].textDrawable.textPaint.getFontMetricsInt()), 0, 1, 33);
                buttonArr[0].textDrawable.setText(spannableStringBuilder, true, true);
            } else {
                buttonArr[0].textDrawable.setText(buttonState.text, true, true);
            }
            anonymousClass4.invalidate();
            if (totalHeight != anonymousClass4.getTotalHeight() && anonymousClass4.whenResized != null) {
                if (totalHeight < anonymousClass4.getTotalHeight()) {
                    AndroidUtilities.runOnUIThread(anonymousClass4.whenResized, 200L);
                } else {
                    anonymousClass4.whenResized.run();
                }
            }
            if (botWebViewSheet.fullscreen) {
                botWebViewSheet.updateFullscreenLayout();
                botWebViewSheet.updateWindowFlags();
            }
        }

        @Override
        public final void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            AnonymousClass4 anonymousClass4 = botWebViewSheet.botButtons;
            BotButtons.ButtonState buttonState = new BotButtons.ButtonState();
            buttonState.visible = z;
            buttonState.active = z2;
            buttonState.progressVisible = z3;
            buttonState.shineEffect = z4;
            buttonState.text = str;
            buttonState.emojiId = j;
            buttonState.color = i;
            buttonState.textColor = i2;
            buttonState.position = str2;
            int totalHeight = anonymousClass4.getTotalHeight();
            anonymousClass4.state.strategy = buttonState;
            BotButtons.setText(anonymousClass4.buttons[1].textDrawable, buttonState, true);
            anonymousClass4.invalidate();
            if (totalHeight != anonymousClass4.getTotalHeight() && anonymousClass4.whenResized != null) {
                if (totalHeight < anonymousClass4.getTotalHeight()) {
                    AndroidUtilities.runOnUIThread(anonymousClass4.whenResized, 200L);
                } else {
                    anonymousClass4.whenResized.run();
                }
            }
            if (botWebViewSheet.fullscreen) {
                botWebViewSheet.updateFullscreenLayout();
                botWebViewSheet.updateWindowFlags();
            }
        }

        @Override
        public final void onSharedTo(ArrayList arrayList) {
            int size = arrayList.size();
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            new BulletinFactory(botWebViewSheet.bulletinContainer, botWebViewSheet.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(botWebViewSheet.currentAccount).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).show(true);
        }

        @Override
        public final void onWebAppBackgroundChanged(int i, boolean z) {
        }

        @Override
        public final void onWebAppExpand() {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            AnonymousClass1 anonymousClass1 = botWebViewSheet.swipeContainer;
            if (anonymousClass1.isScrolling) {
                return;
            }
            anonymousClass1.stickTo(botWebViewSheet.swipeContainer.getTopActionBarOffsetY() + (-anonymousClass1.getOffsetY()), false, null);
        }

        @Override
        public final void onWebAppOpenInvoice(TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            BaseFragment lastFragment = ((ActionBarLayout) ((LaunchActivity) botWebViewSheet.parentActivity).getActionBarLayout()).getLastFragment();
            boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
            WindowView windowView = botWebViewSheet.windowView;
            if (z) {
                AndroidUtilities.hideKeyboard(windowView);
                AlertDialog alertDialog = new AlertDialog(botWebViewSheet.getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 150L);
                StarsController.getInstance(botWebViewSheet.currentAccount, false).openPaymentForm(new StarGiftSheet$$ExternalSyntheticLambda73(alertDialog, 3), null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new ThemeActivity$$ExternalSyntheticLambda19(13, this, str));
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(botWebViewSheet.currentAccount).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, null, str, lastFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                AnonymousClass1 anonymousClass1 = botWebViewSheet.swipeContainer;
                anonymousClass1.stickTo(anonymousClass1.getTopActionBarOffsetY() + (-anonymousClass1.getOffsetY()), false, null);
                AndroidUtilities.hideKeyboard(windowView);
                OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(this.val$context);
                overlayActionBarLayoutDialog.show();
                paymentFormActivity.paymentFormCallback = new VoIPFragment$$ExternalSyntheticLambda42(this, overlayActionBarLayoutDialog, str, 27);
                paymentFormActivity.resourcesProvider = this.val$resourcesProvider;
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        @Override
        public final void onWebAppSetActionBarColor(int i, int i2, boolean z) {
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            botWebViewSheet.actionBarColorKey = i;
            botWebViewSheet.setActionBarColor(i2, z, true);
        }

        @Override
        public final void onWebAppSetBackgroundColor(int i) {
            BotWebViewSheet.this.setBackgroundColor(i, true);
        }

        @Override
        public final void onWebAppSetNavigationBarColor(int i) {
            BotWebViewSheet.this.setNavigationBarColor(i, true);
        }

        @Override
        public final void onWebAppSetupClosingBehavior(boolean z) {
            BotWebViewSheet.this.needCloseConfirmation = z;
        }

        @Override
        public final void onWebAppSwipingBehavior(boolean z) {
            AnonymousClass1 anonymousClass1 = BotWebViewSheet.this.swipeContainer;
            if (anonymousClass1 != null) {
                anonymousClass1.setAllowSwipes(z);
            }
        }

        @Override
        public final void onWebAppSwitchInlineQuery(TLRPC.User user, String str, ArrayList arrayList) {
            boolean zIsEmpty = arrayList.isEmpty();
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (zIsEmpty) {
                Activity activity = botWebViewSheet.parentActivity;
                if (activity instanceof LaunchActivity) {
                    BaseFragment lastFragment = ((ActionBarLayout) ((LaunchActivity) activity).getActionBarLayout()).getLastFragment();
                    if (lastFragment instanceof ChatActivity) {
                        ((ChatActivity) lastFragment).chatActivityEnterView.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                        botWebViewSheet.dismiss$1(false);
                        return;
                    }
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialogsType", 14);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("allowGroups", arrayList.contains("groups"));
            bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
            bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
            bundle.putBoolean("allowUsers", arrayList.contains("users"));
            bundle.putBoolean("allowChannels", arrayList.contains("channels"));
            bundle.putBoolean("allowBots", arrayList.contains("bots"));
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            AndroidUtilities.hideKeyboard(botWebViewSheet.windowView);
            OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(this.val$context);
            dialogsActivity.delegate = new ArticleViewer$$ExternalSyntheticLambda54((Object) this, (Object) user, str, (Object) overlayActionBarLayoutDialog, 21);
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }
    }

    public final class AnonymousClass5 extends ActionBar {
        @Override
        public final void onMeasure(int i, int i2) {
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                Point point = AndroidUtilities.displaySize;
                i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    public final class AnonymousClass7 extends ChatAttachAlertBotWebViewLayout.WebProgressView {
        @Override
        public final void onMeasure(int i, int i2) {
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                Point point = AndroidUtilities.displaySize;
                i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    public final class WindowView extends SizeNotifierFrameLayout implements BottomSheetTabsOverlay.SheetView {
        public final Path clipPath;
        public boolean drawingFromOverlay;
        public final Paint navbarPaint;
        public final RectF rect;

        public WindowView(Context context) {
            super(context, null);
            setClipChildren(false);
            setClipToPadding(false);
            setWillNotDraw(false);
            this.navbarPaint = new Paint(1);
            this.rect = new RectF();
            this.clipPath = new Path();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            boolean z;
            Paint paint;
            if (this.drawingFromOverlay) {
                return;
            }
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            int visibility = botWebViewSheet.passcodeView.getVisibility();
            Paint paint2 = this.navbarPaint;
            if (visibility != 0) {
                float f = botWebViewSheet.fullscreenProgress;
                if (f < 1.0f && f > 0.0f) {
                    paint2.setColor(Theme.multAlpha(botWebViewSheet.openedProgress, botWebViewSheet.navBarColor));
                    int i = botWebViewSheet.navInsets.left;
                    if (i > 0) {
                        canvas.drawRect(0.0f, 0.0f, i, getHeight(), paint2);
                    }
                    if (botWebViewSheet.navInsets.top > 0) {
                        canvas.drawRect(0.0f, 0.0f, getWidth(), botWebViewSheet.navInsets.top, paint2);
                    }
                    if (botWebViewSheet.navInsets.bottom > 0) {
                        canvas.drawRect(0.0f, getHeight() - botWebViewSheet.navInsets.bottom, getWidth(), getHeight(), paint2);
                    }
                    if (botWebViewSheet.navInsets.right > 0) {
                        canvas.drawRect(getWidth() - botWebViewSheet.navInsets.right, 0.0f, getWidth(), getHeight(), paint2);
                    }
                }
            }
            if (botWebViewSheet.bottomTabsClip == null || AndroidUtilities.isTablet()) {
                z = false;
            } else {
                canvas.save();
                canvas.translate((1.0f - botWebViewSheet.fullscreenProgress) * botWebViewSheet.insets.left, 0.0f);
                MHTML mhtml = botWebViewSheet.bottomTabsClip;
                int width = getWidth();
                Rect rect = botWebViewSheet.insets;
                int iLerp = AndroidUtilities.lerp((width - rect.left) - rect.right, getWidth(), botWebViewSheet.fullscreenProgress);
                getHeight();
                mhtml.clip(canvas, true, false, iLerp, 1.0f - botWebViewSheet.fullscreenProgress);
                canvas.translate((1.0f - botWebViewSheet.fullscreenProgress) * (-botWebViewSheet.insets.left), 0.0f);
                z = true;
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
            }
            if (botWebViewSheet.passcodeView.getVisibility() != 0) {
                paint2.setColor(Theme.multAlpha(botWebViewSheet.openedProgress, botWebViewSheet.navBarColor));
                int i2 = botWebViewSheet.navInsets.left;
                if (i2 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - botWebViewSheet.fullscreenProgress) * i2, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (botWebViewSheet.navInsets.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - botWebViewSheet.fullscreenProgress) * botWebViewSheet.navInsets.top, paint);
                }
                if (botWebViewSheet.navInsets.bottom > 0) {
                    float height = getHeight();
                    float f2 = botWebViewSheet.navInsets.bottom;
                    AnonymousClass4 anonymousClass4 = botWebViewSheet.botButtons;
                    canvas.drawRect(0.0f, height - (f2 * ((anonymousClass4 == null || anonymousClass4.getTotalHeight() <= 0) ? 1.0f - botWebViewSheet.fullscreenProgress : 1.0f)), getWidth(), getHeight(), paint);
                }
                if (botWebViewSheet.navInsets.right > 0) {
                    canvas.drawRect(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, botWebViewSheet.fullscreenProgress, botWebViewSheet.navInsets.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            BottomSheetTabs bottomSheetTabs = launchActivity != null ? launchActivity.getBottomSheetTabs() : null;
            if (bottomSheetTabs != null) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (botWebViewSheet.insets != null) {
                    int i = (int) ((1.0f - botWebViewSheet.fullscreenProgress) * ((int) bottomSheetTabs.bottomTabsProgress));
                    if (motionEvent.getY() >= (getHeight() - botWebViewSheet.insets.bottom) - i && motionEvent.getY() <= getHeight() - botWebViewSheet.insets.bottom && !AndroidUtilities.isTablet()) {
                        return bottomSheetTabs.touchEvent(motionEvent.getX(), motionEvent.getY() - ((getHeight() - botWebViewSheet.insets.bottom) - i), motionEvent.getAction());
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void draw(Canvas canvas) {
            float fLerp;
            if (this.drawingFromOverlay) {
                return;
            }
            super.draw(canvas);
            boolean zIsTablet = AndroidUtilities.isTablet();
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            float f = zIsTablet ? 0.0f : botWebViewSheet.actionBarTransitionProgress;
            botWebViewSheet.linePaint.setColor(botWebViewSheet.lineColor);
            Paint paint = botWebViewSheet.linePaint;
            paint.setAlpha((int) ((1.0f - botWebViewSheet.fullscreenProgress) * (1.0f - (Math.min(0.5f, f) / 0.5f)) * paint.getAlpha()));
            canvas.save();
            float f2 = 1.0f - f;
            if (AndroidUtilities.isTablet()) {
                fLerp = AndroidUtilities.lerp(botWebViewSheet.swipeContainer.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, botWebViewSheet.actionBarTransitionProgress);
            } else {
                fLerp = AndroidUtilities.lerp(botWebViewSheet.swipeContainer.getTranslationY(), (ActionBar.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f) + AndroidUtilities.dp(12.0f);
            }
            float f3 = fLerp;
            canvas.scale(f2, f2, getWidth() / 2.0f, f3);
            canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), f3, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), f3, botWebViewSheet.linePaint);
            canvas.restore();
            botWebViewSheet.actionBarShadow.setAlpha((int) (botWebViewSheet.actionBar.getAlpha() * 255.0f));
            float translationY = botWebViewSheet.actionBar.getTranslationY() + botWebViewSheet.actionBar.getY() + botWebViewSheet.actionBar.getHeight();
            botWebViewSheet.actionBarShadow.setBounds(botWebViewSheet.insets.left, (int) translationY, getWidth() - botWebViewSheet.insets.right, (int) (translationY + botWebViewSheet.actionBarShadow.getIntrinsicHeight()));
            botWebViewSheet.actionBarShadow.draw(canvas);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (view != botWebViewSheet.swipeContainer || !botWebViewSheet.fullscreenInProgress || botWebViewSheet.swipeContainerFromHeight <= 0 || botWebViewSheet.swipeContainerFromWidth <= 0) {
                z = false;
            } else {
                canvas.save();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(botWebViewSheet.swipeContainerFromWidth, view.getWidth(), botWebViewSheet.fullscreenTransitionProgress), view.getY() + AndroidUtilities.lerp(botWebViewSheet.swipeContainerFromHeight, view.getHeight(), botWebViewSheet.fullscreenTransitionProgress));
                z = true;
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (z) {
                canvas.restore();
            }
            return zDrawChild;
        }

        @Override
        public final float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
            RectF rectF3 = this.rect;
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            float left = botWebViewSheet.swipeContainer.getLeft();
            AnonymousClass1 anonymousClass1 = botWebViewSheet.swipeContainer;
            rectF3.set(left, anonymousClass1.getTranslationY() + AndroidUtilities.dp(24.0f), anonymousClass1.getRight(), getHeight());
            AndroidUtilities.lerpCentered(rectF3, rectF, f, rectF2);
            canvas.save();
            Path path = this.clipPath;
            path.rewind();
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - botWebViewSheet.actionBarTransitionProgress), AndroidUtilities.dp(18.0f), f);
            path.addRoundRect(rectF2, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawPaint(botWebViewSheet.backgroundPaint);
            if (anonymousClass1 != null) {
                canvas.save();
                canvas.translate(rectF2.left, (f * AndroidUtilities.dp(51.0f)) + Math.max(anonymousClass1.getY(), rectF2.top));
                anonymousClass1.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            return fLerp;
        }

        @Override
        public RectF getRect() {
            RectF rectF = this.rect;
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            rectF.set(botWebViewSheet.swipeContainer.getLeft(), botWebViewSheet.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), botWebViewSheet.swipeContainer.getRight(), getHeight());
            return rectF;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            Bulletin.addDelegate(this, new LaunchActivity.AnonymousClass7(15));
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.drawingFromOverlay) {
                return;
            }
            super.onDraw(canvas);
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.passcodeView.getVisibility() != 0) {
                canvas.save();
                MHTML mhtml = botWebViewSheet.bottomTabsClip;
                if (mhtml != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    mhtml.clip(canvas2, false, false, width, 1.0f - botWebViewSheet.fullscreenProgress);
                } else {
                    canvas2 = canvas;
                }
                boolean z = botWebViewSheet.overrideBackgroundColor;
                Paint paint = botWebViewSheet.backgroundPaint;
                if (!z) {
                    int color = Theme.getColor(Theme.key_windowBackgroundWhite, botWebViewSheet.resourcesProvider);
                    paint.setColor(color);
                    botWebViewSheet.webViewContainer.setFlickerViewColor(color);
                    ArticleViewer.ErrorContainer errorContainer = botWebViewSheet.errorContainer;
                    if (errorContainer != null) {
                        errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                        botWebViewSheet.errorContainer.setBackgroundColor(paint.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, botWebViewSheet.dimPaint);
                BottomSheetTabs bottomSheetTabs = botWebViewSheet.bottomTabs;
                int i = bottomSheetTabs != null ? (int) bottomSheetTabs.bottomTabsProgress : 0;
                Paint paint2 = botWebViewSheet.actionBarPaint;
                paint2.setColor(botWebViewSheet.actionBarColor);
                float fDp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - botWebViewSheet.actionBarTransitionProgress);
                AnonymousClass1 anonymousClass1 = botWebViewSheet.swipeContainer;
                rectF.set(AndroidUtilities.lerp(anonymousClass1.getLeft(), 0, botWebViewSheet.fullscreenProgress), AndroidUtilities.lerp(anonymousClass1.getTranslationY(), 0.0f, botWebViewSheet.actionBarTransitionProgress), anonymousClass1.getRight(), anonymousClass1.getTranslationY() + AndroidUtilities.dp(24.0f) + fDp);
                canvas2.drawRoundRect(rectF, fDp, fDp, paint2);
                rectF.set(AndroidUtilities.lerp(anonymousClass1.getLeft(), 0, botWebViewSheet.fullscreenProgress), anonymousClass1.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(anonymousClass1.getRight(), getWidth(), botWebViewSheet.fullscreenProgress), getHeight() - i);
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                float y = motionEvent.getY();
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (y <= AndroidUtilities.lerp(botWebViewSheet.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, botWebViewSheet.actionBarTransitionProgress) || motionEvent.getX() > botWebViewSheet.swipeContainer.getRight() || motionEvent.getX() < botWebViewSheet.swipeContainer.getLeft()) {
                    botWebViewSheet.dismiss$1(true);
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void setDrawingFromOverlay(boolean z) {
            if (this.drawingFromOverlay != z) {
                this.drawingFromOverlay = z;
                invalidate();
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                botWebViewSheet.updateWindowFlags();
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null || !botWebViewSheet.fullscreen) {
                    return;
                }
                int i = botWebViewSheet.navBarColor;
                launchActivity.drawerLayoutContainer.setInternalNavigationBarColor(i);
                BottomSheetTabs bottomSheetTabs = launchActivity.getBottomSheetTabs();
                if (bottomSheetTabs != null) {
                    bottomSheetTabs.setNavigationBarColor(i);
                }
            }
        }
    }

    static {
        SimpleFloatPropertyCompat simpleFloatPropertyCompat = new SimpleFloatPropertyCompat(new TopicsFragment$$ExternalSyntheticLambda25(3), new TopicsFragment$$ExternalSyntheticLambda25(4));
        simpleFloatPropertyCompat.multiplier = 100.0f;
        ACTION_BAR_TRANSITION_PROGRESS_VALUE = simpleFloatPropertyCompat;
        shownLockedBots = 0;
    }

    public BotWebViewSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.actionBarTransitionProgress = 0.0f;
        this.navInsets = new Rect();
        this.insets = new Rect();
        this.keyboardInset = 0;
        Paint paint = new Paint(1);
        this.linePaint = paint;
        Paint paint2 = new Paint();
        this.dimPaint = paint2;
        this.backgroundPaint = new Paint(1);
        this.actionBarPaint = new Paint(1);
        this.pollRunnable = new BotWebViewSheet$$ExternalSyntheticLambda0(this, 1);
        this.actionBarColorKey = -1;
        this.defaultFullsize = false;
        this.fullsize = null;
        this.fileItems = new HashMap();
        this.superDismissed = false;
        this.resetOffsetY = true;
        this.attached = false;
        this.resourcesProvider = resourcesProvider;
        this.lineColor = Theme.getColor(null, Theme.key_sheet_scrollUp, false);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.swipeContainer = anonymousClass1;
        anonymousClass1.setAllowFullSizeSwipe(true);
        anonymousClass1.setShouldWaitWebViewScroll(true);
        int i = Theme.key_windowBackgroundWhite;
        ?? r11 = new BotWebViewContainer(context, resourcesProvider, Theme.getColor(i, resourcesProvider)) {
            @Override
            public final void onErrorShown(String str, boolean z) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (z) {
                    botWebViewSheet.createErrorContainer();
                    ArticleViewer.ErrorContainer errorContainer = botWebViewSheet.errorContainer;
                    String userName = UserObject.getUserName(MessagesController.getInstance(botWebViewSheet.currentAccount).getUser(Long.valueOf(botWebViewSheet.botId)));
                    errorContainer.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
                    zzko.m(R.string.WebErrorInfoBot, new Object[]{userName}, errorContainer.descriptionView);
                    errorContainer.codeView.setText(str);
                    ArticleViewer.ErrorContainer errorContainer2 = botWebViewSheet.errorContainer;
                    Paint paint3 = botWebViewSheet.backgroundPaint;
                    errorContainer2.setDark(AndroidUtilities.computePerceivedBrightness(paint3.getColor()) <= 0.721f, false);
                    botWebViewSheet.errorContainer.setBackgroundColor(paint3.getColor());
                    botWebViewSheet.errorCode = str;
                }
                ArticleViewer.ErrorContainer errorContainer3 = botWebViewSheet.errorContainer;
                botWebViewSheet.errorShown = z;
                AndroidUtilities.updateViewVisibilityAnimated(errorContainer3, z, 1.0f, false);
                invalidate();
            }

            @Override
            public final void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                botWebViewSheet.swipeContainer.setWebView(myWebView);
                BotSensors botSensors = botWebViewSheet.sensors;
                if (botSensors != null) {
                    botSensors.webView = myWebView;
                }
                botWebViewSheet.fullscreenButtons.setWebView(myWebView);
                botWebViewSheet.updateWebViewBackgroundColor();
            }

            @Override
            public final void onWebViewDestroyed(BotWebViewContainer.MyWebView myWebView) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                BotSensors botSensors = botWebViewSheet.sensors;
                if (botSensors != null && botSensors.webView == myWebView) {
                    botSensors.webView = null;
                    botSensors.pause();
                }
                botWebViewSheet.fullscreenButtons.setWebView(null);
            }
        };
        this.webViewContainer = r11;
        r11.setOnVerifiedAge(this.onVerifiedAge);
        r11.setDelegate(new AnonymousClass3(context, resourcesProvider));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.actionBarColor = Theme.getColor(i, resourcesProvider);
        int color = Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider);
        this.navBarColor = color;
        AndroidUtilities.setNavigationBarColor((Dialog) this, color, false);
        WindowView windowView = new WindowView(context);
        this.windowView = windowView;
        windowView.setDelegate(new LoginActivity$$ExternalSyntheticLambda10(this, 2));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -1, 49);
        this.swipeContainerLayoutParams = layoutParamsCreateFrame;
        windowView.addView(anonymousClass1, layoutParamsCreateFrame);
        ?? r12 = new BotButtons(getContext(), resourcesProvider) {
            @Override
            public final void onMeasure(int i2, int i3) {
                if (!BotWebViewSheet.this.fullscreen && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.botButtons = r12;
        r12.setOnButtonClickListener(new BotWebViewSheet$$ExternalSyntheticLambda4(this, 1));
        r12.setOnResizeListener(new BotWebViewSheet$$ExternalSyntheticLambda0(this, 3));
        windowView.addView((View) r12, LayoutHelper.createFrame(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.fullscreenButtons = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        boolean z = !MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        this.fullscreenBlur = z;
        botFullscreenButtons.setParentRenderNode(z ? anonymousClass1.getRenderNode() : null);
        windowView.addView(botFullscreenButtons, LayoutHelper.createFrame(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new BotWebViewSheet$$ExternalSyntheticLambda0(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new BotWebViewSheet$$ExternalSyntheticLambda0(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new BotWebViewSheet$$ExternalSyntheticLambda0(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.bulletinContainer = frameLayout;
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 200, 55);
        this.bulletinContainerLayoutParams = layoutParamsCreateFrame2;
        windowView.addView(frameLayout, layoutParamsCreateFrame2);
        this.actionBarShadow = getContext().getDrawable(R.drawable.header_shadow).mutate();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context, resourcesProvider);
        this.actionBar = anonymousClass5;
        anonymousClass5.setBackgroundColor(0);
        anonymousClass5.setBackButtonImage(R.drawable.ic_close_white);
        updateActionBarColors();
        anonymousClass5.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 5));
        anonymousClass5.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParamsCreateFrame3 = LayoutHelper.createFrame(-1, -2, 49);
        this.actionBarLayoutParams = layoutParamsCreateFrame3;
        windowView.addView(anonymousClass5, layoutParamsCreateFrame3);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, resourcesProvider);
        this.progressView = anonymousClass7;
        windowView.addView(anonymousClass7, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        r11.setWebViewProgressListener(new ChatActivity$$ExternalSyntheticLambda211(this, 15));
        anonymousClass1.addView((View) r11, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass1.setScrollListener(new BotWebViewSheet$$ExternalSyntheticLambda0(this, 7));
        anonymousClass1.setScrollEndListener(new BotWebViewSheet$$ExternalSyntheticLambda0(this, 8));
        anonymousClass1.setDelegate(new BotWebViewSheet$$ExternalSyntheticLambda15(this));
        anonymousClass1.setIsKeyboardVisible(new BotWebViewSheet$$ExternalSyntheticLambda15(this));
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        windowView.addView(passcodeView, LayoutHelper.createFrame(-1.0f, -1));
        setContentView(windowView, new ViewGroup.LayoutParams(-1, -1));
        updateFullscreenLayout();
        LaunchActivity launchActivity = LaunchActivity.instance;
        BottomSheetTabs bottomSheetTabs = launchActivity != null ? launchActivity.getBottomSheetTabs() : null;
        this.bottomTabs = bottomSheetTabs;
        if (bottomSheetTabs != null) {
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = new VoIPFragment$8$$ExternalSyntheticLambda1(windowView, 11);
            BotWebViewSheet$$ExternalSyntheticLambda0 botWebViewSheet$$ExternalSyntheticLambda0 = new BotWebViewSheet$$ExternalSyntheticLambda0(this, 2);
            bottomSheetTabs.invalidateListeners.add(voIPFragment$8$$ExternalSyntheticLambda1);
            bottomSheetTabs.relayoutListeners.add(botWebViewSheet$$ExternalSyntheticLambda0);
            this.bottomTabsClip = new MHTML(bottomSheetTabs);
        }
    }

    public static void deleteBot(int i, long j, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
            i2++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            if (tL_attachMenuBot3.bot_id == j) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String string = LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name);
        AlertDialog.Builder builder = new AlertDialog.Builder(LaunchActivity.getLastFragment().getContext(), 0, null);
        String string2 = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string2;
        alertDialog.message = AndroidUtilities.replaceTags(string);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new BotVerifySheet$$ExternalSyntheticLambda0(i, j, tL_attachMenuBot, runnable));
        ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
    }

    public static JSONObject makeThemeParams(Theme.ResourcesProvider resourcesProvider, final boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int iBlendOver = Theme.blendOver(-16777216, Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int iBlendOver2 = Theme.blendOver(iBlendOver, ((Integer) obj).intValue());
                    return z ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(iBlendOver2)), Integer.valueOf(Color.green(iBlendOver2)), Integer.valueOf(Color.blue(iBlendOver2))) : Integer.valueOf(iBlendOver2);
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(iBlendOver)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider))));
            int i = Theme.key_windowBackgroundGray;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(i, resourcesProvider))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_actionBarDefault, resourcesProvider))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_text_RedRegular, resourcesProvider))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_divider, resourcesProvider))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(i, resourcesProvider))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void applyAppBotSettings(TL_bots.botAppSettings botappsettings, boolean z) {
        if (botappsettings == null) {
            return;
        }
        boolean zIsDark = Theme.currentTheme.isDark();
        int i = botappsettings.flags;
        boolean z2 = ((zIsDark ? 4 : 2) & i) != 0;
        if ((i & (zIsDark ? 16 : 8)) != 0) {
            setActionBarColor((zIsDark ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z);
        }
        if (z2) {
            setBackgroundColor((zIsDark ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z);
            setNavigationBarColor((zIsDark ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z);
        }
    }

    public final void checkNavBarColor() {
        LaunchActivity launchActivity;
        if (!this.superDismissed && (launchActivity = LaunchActivity.instance) != null) {
            launchActivity.checkSystemBarColors(true, true, true);
        }
        WindowView windowView = this.windowView;
        if (windowView != null) {
            windowView.invalidate();
        }
    }

    public final void createErrorContainer() {
        if (this.errorContainer == null) {
            ArticleViewer.ErrorContainer errorContainer = new ArticleViewer.ErrorContainer(getContext());
            this.errorContainer = errorContainer;
            this.swipeContainer.addView(errorContainer, LayoutHelper.createFrame(-1.0f, -1));
            this.errorContainer.setTranslationY(-1.0f);
            this.errorContainer.buttonView.setOnClickListener(new BotWebViewSheet$$ExternalSyntheticLambda5(this, 1));
            this.errorContainer.setBackgroundColor(this.backgroundPaint.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.errorContainer, this.errorShown, 1.0f, false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webViewResultSent) {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                dismiss$1(false);
                return;
            }
            return;
        }
        if (i != NotificationCenter.didSetNewTheme) {
            if (i == NotificationCenter.botDownloadsUpdate) {
                updateDownloadBulletin();
            }
        } else {
            this.windowView.invalidate();
            this.webViewContainer.flickerDrawable.setColors(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), 153);
            updateActionBarColors();
            updateLightStatusBar$2();
        }
    }

    @Override
    public final void dismiss(boolean z) {
        dismiss$1(false);
    }

    public final void dismiss$1(boolean z) {
        LaunchActivity launchActivity;
        if (this.dismissed) {
            return;
        }
        if (this.onVerifiedAge != null) {
            z = false;
        }
        this.dismissed = true;
        setOpen(false);
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z && ((launchActivity = LaunchActivity.instance) == null || launchActivity.bottomSheetTabsOverlay == null)) {
            z = false;
        }
        if (z) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation != null) {
                springAnimation.mSpring.mFinalPosition = 0.0f;
                springAnimation.start();
            }
            LaunchActivity.instance.bottomSheetTabsOverlay.dismissSheet(this);
        } else {
            AnonymousClass4 anonymousClass4 = this.botButtons;
            if (anonymousClass4 != null) {
                anonymousClass4.animate().translationY(anonymousClass4.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            destroyWebView();
            AnonymousClass1 anonymousClass1 = this.swipeContainer;
            int height = anonymousClass1.getHeight() + (anonymousClass4 != null ? anonymousClass4.getTotalHeight() : 0);
            Rect rect = this.insets;
            anonymousClass1.stickTo(this.windowView.measureKeyboardHeight() + height + rect.top + rect.bottom + (isFullSize() ? AndroidUtilities.dp(200.0f) : 0), true, new BotWebViewSheet$$ExternalSyntheticLambda0(this, 0));
        }
        activeSheets.remove(this);
    }

    @Override
    public final int getNavigationBarColor(int i) {
        return ColorUtils.blendARGB(this.openedProgress, i, this.navBarColor);
    }

    @Override
    public final BottomSheetTabsOverlay.SheetView mo1066getWindowView() {
        return this.windowView;
    }

    @Override
    public final boolean hadDialog() {
        return false;
    }

    public final boolean isFullSize() {
        if (this.fullscreen) {
            return true;
        }
        Boolean bool = this.fullsize;
        if (bool == null) {
            return this.defaultFullsize;
        }
        return bool.booleanValue();
    }

    public final void lambda$dismiss$49() {
        if (this.superDismissed) {
            return;
        }
        super.dismiss();
        this.superDismissed = true;
    }

    public final void loadFromResponse() {
        boolean z;
        if (this.requestProps == null) {
            return;
        }
        long jMax = Math.max(0L, 60000 - (System.currentTimeMillis() - this.requestProps.responseTime));
        String str = null;
        this.fullsize = null;
        TLObject tLObject = this.requestProps.response;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.queryId = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z = tL_webViewResultUrl.same_origin;
            this.fullsize = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z2 = this.fromTab;
            if (!z2) {
                setFullscreen(tL_webViewResultUrl.fullscreen, !z2, this.fullscreenBlur);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.queryId = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.queryId = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            }
            z = false;
        }
        AnonymousClass2 anonymousClass2 = this.webViewContainer;
        if (z) {
            anonymousClass2.setTrustedOrigin(str);
        }
        if (str != null && !this.fromTab) {
            MediaDataController.getInstance(this.currentAccount).increaseWebappRating(this.requestProps.botId);
            int i = this.currentAccount;
            anonymousClass2.currentAccount = i;
            NotificationCenter.getInstance(i).doOnIdle(new BotWebViewContainer$$ExternalSyntheticLambda3(anonymousClass2, str, 0));
        }
        AndroidUtilities.runOnUIThread(this.pollRunnable, jMax);
        AnonymousClass1 anonymousClass1 = this.swipeContainer;
        if (anonymousClass1 != null) {
            anonymousClass1.setFullSize(isFullSize());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
        if (this.springAnimation == null) {
            SpringAnimation springAnimation = new SpringAnimation(this, ACTION_BAR_TRANSITION_PROGRESS_VALUE);
            SpringForce springForce = new SpringForce();
            springForce.setStiffness(1200.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation.mSpring = springForce;
            this.springAnimation = springAnimation;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (onBackPressed()) {
                return;
            }
            dismiss$1(true);
        }
    }

    public final boolean onCheckDismissByUser() {
        if (!this.needCloseConfirmation) {
            dismiss$1(false);
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        String name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = name;
        alertDialog.message = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        builder.setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new BotWebViewSheet$$ExternalSyntheticLambda15(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        alertDialog.show();
        ((TextView) alertDialog.getButton(-1)).setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        AnonymousClass4 anonymousClass4;
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i2 = attributes.flags;
        int i3 = i2 & (-3);
        attributes.flags = i3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.fullscreen) {
            attributes.flags = i3 | 512;
        } else {
            attributes.flags = i2 & (-515);
        }
        window.setAttributes(attributes);
        if (i >= 23) {
            window.setStatusBarColor(0);
        }
        WindowView windowView = this.windowView;
        windowView.setFitsSystemWindows(true);
        windowView.setSystemUiVisibility(1792);
        windowView.setOnApplyWindowInsetsListener(new SecretMediaViewer$$ExternalSyntheticLambda6(this, 1));
        if (!this.fullscreen || ((anonymousClass4 = this.botButtons) != null && anonymousClass4.getTotalHeight() > 0)) {
            windowView.setSystemUiVisibility(windowView.getSystemUiVisibility() & (-3));
        } else {
            windowView.setSystemUiVisibility(windowView.getSystemUiVisibility() | 2);
        }
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(this, ColorUtils.calculateLuminance(this.navBarColor) >= 0.7210000157356262d);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        SpringAnimation springAnimation = this.springAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.springAnimation = null;
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).overlayPasscodeViews.add(this.passcodeView);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).overlayPasscodeViews.remove(this.passcodeView);
        }
    }

    public final void openOptions() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i = 11;
        int i2 = 1;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        do {
            if (i4 >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i4);
                i4++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != this.botId);
        ItemOptions itemOptions = this.options;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.windowView, this.resourcesProvider, this.fullscreen ? this.fullscreenButtons : this.optionsItem, true);
        this.options = itemOptionsMakeOptions;
        Context context = getContext();
        int i5 = this.currentAccount;
        long j = this.botId;
        HashMap map = BotDownloads.instances;
        Pair pair = new Pair(Integer.valueOf(i5), Long.valueOf(j));
        HashMap map2 = BotDownloads.instances;
        BotDownloads botDownloads = (BotDownloads) map2.get(pair);
        if (botDownloads == null) {
            botDownloads = new BotDownloads(context, i5, j);
            map2.put(pair, botDownloads);
        }
        HashMap map3 = this.fileItems;
        map3.clear();
        ArrayList arrayList2 = botDownloads.files;
        if (!arrayList2.isEmpty()) {
            ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
            itemOptionsMakeSwipeback.add(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(i3, itemOptionsMakeOptions), false);
            itemOptionsMakeSwipeback.addGap();
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj = arrayList2.get(i6);
                i6 += i2;
                BotDownloads.FileDownload fileDownload = (BotDownloads.FileDownload) obj;
                String str = fileDownload.file_name;
                VoIPFragment$$ExternalSyntheticLambda31 voIPFragment$$ExternalSyntheticLambda31 = new VoIPFragment$$ExternalSyntheticLambda31(i);
                if (itemOptionsMakeSwipeback.context != null) {
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, itemOptionsMakeSwipeback.context, itemOptionsMakeSwipeback.resourcesProvider, false, false);
                    actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    actionBarMenuSubItem.setText(str);
                    actionBarMenuSubItem.setSubtext("");
                    Integer num = itemOptionsMakeSwipeback.textColor;
                    Theme.ResourcesProvider resourcesProvider = itemOptionsMakeSwipeback.resourcesProvider;
                    int iIntValue = num != null ? num.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
                    Integer num2 = itemOptionsMakeSwipeback.iconColor;
                    int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
                    actionBarMenuSubItem.setTextColor(iIntValue);
                    actionBarMenuSubItem.setIconColor(iIntValue2);
                    Integer num3 = itemOptionsMakeSwipeback.selectorColor;
                    actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider)));
                    actionBarMenuSubItem.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda128(itemOptionsMakeSwipeback, voIPFragment$$ExternalSyntheticLambda31));
                    int i7 = itemOptionsMakeSwipeback.minWidthDp;
                    if (i7 > 0) {
                        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i7));
                        itemOptionsMakeSwipeback.addView(actionBarMenuSubItem, LayoutHelper.createLinear(itemOptionsMakeSwipeback.minWidthDp, -2));
                    } else {
                        itemOptionsMakeSwipeback.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                    }
                }
                map3.put(fileDownload, itemOptionsMakeSwipeback.getLast());
                i = 11;
                i2 = 1;
            }
            updateDownloadBulletin();
            itemOptionsMakeSwipeback.minWidthDp = AndroidUtilities.dp(180.0f);
            itemOptionsMakeOptions.add(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new PhotoViewer$$ExternalSyntheticLambda133(itemOptionsMakeOptions, itemOptionsMakeSwipeback, 9), false);
            itemOptionsMakeOptions.addGap();
        }
        itemOptionsMakeOptions.addIf(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 9), this.onVerifiedAge == null);
        itemOptionsMakeOptions.addIf(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 10), this.onVerifiedAge == null && this.hasSettings);
        itemOptionsMakeOptions.add(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 11), false);
        itemOptionsMakeOptions.addIf(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 12), this.onVerifiedAge == null && user != null && user.bot_has_main_app);
        itemOptionsMakeOptions.addIf(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 13), this.onVerifiedAge == null);
        itemOptionsMakeOptions.addIf(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 14), this.onVerifiedAge == null);
        itemOptionsMakeOptions.addIf(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new BotWebViewSheet$$ExternalSyntheticLambda0(this, 15), this.onVerifiedAge == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.actionBarColor != Theme.getColor(null, Theme.key_windowBackgroundWhite, false)) {
            int i8 = AndroidUtilities.computePerceivedBrightness(this.actionBarColor) >= 0.721f ? -1 : -15198183;
            int i9 = AndroidUtilities.computePerceivedBrightness(i8) >= 0.721f ? -16777216 : -1;
            int iMultAlpha = Theme.multAlpha(0.85f, i9);
            int iMultAlpha2 = Theme.multAlpha(0.1f, i9);
            itemOptionsMakeOptions.setBackgroundColor(i8);
            for (int i10 = 0; i10 < itemOptionsMakeOptions.getItemsCount(); i10++) {
                View itemAt = itemOptionsMakeOptions.getItemAt(i10);
                if (itemAt instanceof ActionBarMenuSubItem) {
                    ActionBarMenuSubItem actionBarMenuSubItem2 = (ActionBarMenuSubItem) itemAt;
                    actionBarMenuSubItem2.setTextColor(i9);
                    actionBarMenuSubItem2.setIconColor(iMultAlpha);
                    actionBarMenuSubItem2.setSelectorColor(iMultAlpha2);
                }
            }
        }
        itemOptionsMakeOptions.setGravity(5);
        itemOptionsMakeOptions.translate(-this.insets.right, 0.0f);
        itemOptionsMakeOptions.forceTop = true;
        itemOptionsMakeOptions.drawScrim = false;
        itemOptionsMakeOptions.dimAlpha = 0;
        itemOptionsMakeOptions.show();
    }

    @Override
    public final void release() {
        if (this.superDismissed) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        setOpen(false);
    }

    public final void requestWebView(BaseFragment baseFragment, WebViewRequestProps webViewRequestProps) {
        TLRPC.User user;
        ActionBarMenu actionBarMenuCreateMenu;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        int size;
        int i;
        ActionBarMenu actionBarMenu;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ActionBarMenu actionBarMenu2;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z;
        TL_bots.botAppSettings botappsettings;
        this.requestProps = webViewRequestProps;
        int i2 = webViewRequestProps.currentAccount;
        this.currentAccount = i2;
        this.peerId = webViewRequestProps.peerId;
        this.botId = webViewRequestProps.botId;
        this.replyToMsgId = webViewRequestProps.replyToMsgId;
        this.monoforumTopicId = webViewRequestProps.monoforumTopicId;
        this.buttonText = webViewRequestProps.buttonText;
        TLRPC.User user2 = MessagesController.getInstance(i2).getUser(Long.valueOf(this.botId));
        CharSequence userName = UserObject.getUserName(user2);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
            while (true) {
                if (i >= size) {
                    actionBarMenu = actionBarMenuCreateMenu;
                    tL_attachMenuBot = null;
                    break;
                }
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                i++;
                tL_attachMenuBot = tL_attachMenuBot2;
                actionBarMenu = actionBarMenuCreateMenu;
                if (tL_attachMenuBot.bot_id == this.botId) {
                    break;
                } else {
                    actionBarMenuCreateMenu = actionBarMenu;
                }
            }
        } catch (Exception unused) {
        }
        AnonymousClass5 anonymousClass5 = this.actionBar;
        anonymousClass5.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.botId);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.verifiedDrawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.verifiedDrawable.setAlpha(255);
            anonymousClass5.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            anonymousClass5.getTitleTextView().setRightDrawable(new TextCell.AnonymousClass2(this, 7));
        }
        BotFullscreenButtons botFullscreenButtons = this.fullscreenButtons;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setName(UserObject.getUserName(user2), user2 != null && user2.verified);
        }
        actionBarMenuCreateMenu = anonymousClass5.createMenu();
        actionBarMenuCreateMenu.removeAllViews();
        arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        size = arrayList.size();
        i = 0;
        if (!this.fromTab) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    applyAppBotSettings(botappsettings, false);
                }
                z = true;
            } else {
                z = true;
                MessagesController.getInstance(this.currentAccount).loadFullUser(user2, 0, true, new BotWebViewSheet$$ExternalSyntheticLambda4(this, 0));
            }
            if (webViewRequestProps.fullscreen) {
                setFullscreen(z, false, this.fullscreenBlur);
            }
        }
        if (this.onVerifiedAge == null) {
            actionBarMenu2 = actionBarMenu;
            actionBarMenu2.addItem(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            actionBarMenu2 = actionBarMenu;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.optionsIcon = optionsIcon;
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenu2.addItem(0, optionsIcon);
        this.optionsItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setOnClickListener(new BotWebViewSheet$$ExternalSyntheticLambda5(this, 0));
        anonymousClass5.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i3) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (i3 == -1) {
                    if (botWebViewSheet.webViewContainer.onBackPressed()) {
                        return;
                    }
                    botWebViewSheet.onCheckDismissByUser();
                } else if (i3 == R.id.menu_collapse_bot) {
                    botWebViewSheet.forceExpnaded = true;
                    botWebViewSheet.dismiss$1(true);
                }
            }
        });
        JSONObject jSONObjectMakeThemeParams = makeThemeParams(resourcesProvider, false);
        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        AnonymousClass2 anonymousClass2 = this.webViewContainer;
        anonymousClass2.setBotUser(user3);
        anonymousClass2.loadFlickerAndSettingsItem(this.currentAccount, this.botId);
        TLRPC.User user4 = webViewRequestProps.botUser;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.currentAccount).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.currentAccount).preloadImage(ImageLocation.getForUser(this.currentAccount, user4, 1), 0);
            }
        }
        if (webViewRequestProps.response != null) {
            loadFromResponse();
            return;
        }
        int i3 = webViewRequestProps.type;
        if (i3 == 0) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.peerId);
            tL_messages_requestWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tL_messages_requestWebView.platform = "android";
            tL_messages_requestWebView.compact = webViewRequestProps.compact;
            tL_messages_requestWebView.fullscreen = webViewRequestProps.fullscreen;
            String str = webViewRequestProps.buttonUrl;
            if (str != null) {
                tL_messages_requestWebView.url = str;
                tL_messages_requestWebView.flags |= 2;
            }
            if (this.replyToMsgId != 0) {
                TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(this.currentAccount).createReplyInput(this.replyToMsgId);
                tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                if (this.monoforumTopicId != 0) {
                    inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(this.monoforumTopicId);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (this.monoforumTopicId != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(this.monoforumTopicId);
                tL_messages_requestWebView.flags |= 1;
            }
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestWebView, new BotWebViewSheet$$ExternalSyntheticLambda7(this, 2));
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i3 == 1) {
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            tL_messages_requestSimpleWebView.from_switch_webview = (webViewRequestProps.flags & 1) != 0;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tL_messages_requestSimpleWebView.platform = "android";
            tL_messages_requestSimpleWebView.from_side_menu = (webViewRequestProps.flags & 2) != 0;
            tL_messages_requestSimpleWebView.compact = webViewRequestProps.compact;
            tL_messages_requestSimpleWebView.fullscreen = webViewRequestProps.fullscreen;
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                tL_dataJSON2.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(webViewRequestProps.buttonUrl)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = webViewRequestProps.buttonUrl;
            }
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tL_messages_requestSimpleWebView.start_param = webViewRequestProps.startParam;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestSimpleWebView, new BotWebViewSheet$$ExternalSyntheticLambda7(this, 1));
            return;
        }
        if (i3 == 2) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView2.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tL_messages_requestWebView2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
            tL_messages_requestWebView2.platform = "android";
            tL_messages_requestWebView2.compact = webViewRequestProps.compact;
            tL_messages_requestWebView2.fullscreen = webViewRequestProps.fullscreen;
            tL_messages_requestWebView2.url = webViewRequestProps.buttonUrl;
            tL_messages_requestWebView2.flags |= 2;
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                tL_dataJSON3.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestWebView2.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestWebView2, new BotWebViewSheet$$ExternalSyntheticLambda7(this, 5));
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i3 == 3) {
            TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
            TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
            TLRPC.BotApp botApp = webViewRequestProps.app;
            tL_inputBotAppID.id = botApp.id;
            tL_inputBotAppID.access_hash = botApp.access_hash;
            tL_messages_requestAppWebView.app = tL_inputBotAppID;
            tL_messages_requestAppWebView.write_allowed = webViewRequestProps.allowWrite;
            tL_messages_requestAppWebView.platform = "android";
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                inputPeer = chatActivity.getCurrentUser() != null ? MessagesController.getInputPeer(chatActivity.getCurrentUser()) : MessagesController.getInputPeer(chatActivity.currentChat);
            } else {
                inputPeer = MessagesController.getInputPeer(webViewRequestProps.botUser);
            }
            tL_messages_requestAppWebView.peer = inputPeer;
            tL_messages_requestAppWebView.compact = webViewRequestProps.compact;
            tL_messages_requestAppWebView.fullscreen = webViewRequestProps.fullscreen;
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tL_messages_requestAppWebView.start_param = webViewRequestProps.startParam;
                tL_messages_requestAppWebView.flags |= 2;
            }
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                tL_dataJSON4.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestAppWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestAppWebView, new BotWebViewSheet$$ExternalSyntheticLambda7(this, 4), 66);
            return;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                return;
            }
            TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
            tL_messages_requestChatJoinWebView.platform = "android";
            tL_messages_requestChatJoinWebView.query_id = webViewRequestProps.queryId;
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = jSONObjectMakeThemeParams.toString();
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_requestChatJoinWebView, new AiTonesController$$ExternalSyntheticLambda0(), new TodoItemMenu$$ExternalSyntheticLambda17(this, 12), 66);
            return;
        }
        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(webViewRequestProps.botId);
        tL_messages_requestMainWebView.platform = "android";
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity2 = (ChatActivity) baseFragment;
            inputPeer2 = chatActivity2.getCurrentUser() != null ? MessagesController.getInputPeer(chatActivity2.getCurrentUser()) : MessagesController.getInputPeer(chatActivity2.currentChat);
        } else {
            inputPeer2 = MessagesController.getInstance(this.currentAccount).getInputPeer(webViewRequestProps.peerId);
        }
        tL_messages_requestMainWebView.peer = inputPeer2;
        tL_messages_requestMainWebView.compact = webViewRequestProps.compact;
        tL_messages_requestMainWebView.fullscreen = webViewRequestProps.fullscreen;
        if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
            tL_messages_requestMainWebView.start_param = webViewRequestProps.startParam;
            tL_messages_requestMainWebView.flags |= 2;
        }
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestMainWebView.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = jSONObjectMakeThemeParams.toString();
            tL_messages_requestMainWebView.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestMainWebView, new BotWebViewSheet$$ExternalSyntheticLambda7(this, 0), 66);
    }

    @Override
    public final BottomSheetTabs.WebTabData saveState() {
        BottomSheetTabs.WebTabData webTabData = new BottomSheetTabs.WebTabData();
        webTabData.actionBarColor = this.actionBarColor;
        webTabData.actionBarColorKey = this.actionBarColorKey;
        webTabData.overrideActionBarColor = this.overrideActionBarColor;
        webTabData.overrideBackgroundColor = this.overrideBackgroundColor;
        webTabData.backgroundColor = this.backgroundPaint.getColor();
        webTabData.props = this.requestProps;
        AnonymousClass2 anonymousClass2 = this.webViewContainer;
        webTabData.ready = anonymousClass2 != null && anonymousClass2.isPageLoaded;
        webTabData.themeIsDark = Theme.currentTheme.isDark();
        webTabData.lastUrl = anonymousClass2 != null ? anonymousClass2.getUrlLoaded() : null;
        AnonymousClass1 anonymousClass1 = this.swipeContainer;
        webTabData.expanded = (anonymousClass1 != null && anonymousClass1.getSwipeOffsetY() < 0.0f) || this.forceExpnaded || isFullSize() || this.fullscreen;
        webTabData.fullscreen = this.fullscreen;
        webTabData.fullscreenBlur = this.fullscreenBlur;
        Boolean bool = this.fullsize;
        webTabData.fullsize = bool == null ? this.defaultFullsize : bool.booleanValue();
        webTabData.expandedOffset = anonymousClass1 != null ? anonymousClass1.getOffsetY() : Float.MAX_VALUE;
        webTabData.needsContext = this.needsContext;
        webTabData.backButton = this.backButtonShown;
        webTabData.confirmDismiss = this.needCloseConfirmation;
        webTabData.settings = this.hasSettings;
        webTabData.allowSwipes = anonymousClass1 == null || anonymousClass1.allowSwipes;
        webTabData.buttons = this.botButtons.state;
        webTabData.navigationBarColor = this.navBarColor;
        BotSensors botSensors = this.sensors;
        if (botSensors != null) {
            botSensors.pause();
        }
        webTabData.sensors = this.sensors;
        BotWebViewContainer.MyWebView webView = anonymousClass2 != null ? anonymousClass2.getWebView() : null;
        if (webView != null) {
            anonymousClass2.d("preserveWebView");
            anonymousClass2.preserving = true;
            if (anonymousClass2.bot) {
                anonymousClass2.notifyEvent("visibility_changed", BotWebViewContainer.obj(Boolean.FALSE, "is_visible"));
            }
            webTabData.webView = webView;
            webTabData.proxy = anonymousClass2.getBotProxy();
            webTabData.viewWidth = webView.getWidth();
            webTabData.viewHeight = webView.getHeight();
            webView.onPause();
        }
        boolean z = this.errorShown;
        webTabData.error = z;
        if (z) {
            webTabData.errorDescription = this.errorCode;
        }
        webTabData.orientationLocked = this.orientationLocked;
        this.lastTab = webTabData;
        return webTabData;
    }

    public final void setActionBarColor(final int i, boolean z, boolean z2) {
        final int i2 = this.actionBarColor;
        Theme.adaptHSV(0.35f, -0.1f, i);
        final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
        int i3 = this.overrideActionBarColor ? this.actionBarColor : 0;
        SparseIntArray sparseIntArray = botWebViewMenuContainer$ActionBarColorsAnimating.fromColors;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        botWebViewMenuContainer$ActionBarColorsAnimating.updateColors(sparseIntArray, i3, resourcesProvider);
        this.overrideActionBarColor = z;
        this.actionBarIsLight = ColorUtils.calculateLuminance(i) < 0.7210000157356262d;
        botWebViewMenuContainer$ActionBarColorsAnimating.updateColors(botWebViewMenuContainer$ActionBarColorsAnimating.toColors, this.overrideActionBarColor ? i : 0, resourcesProvider);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewSheet botWebViewSheet = this.f$0;
                    botWebViewSheet.getClass();
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    botWebViewSheet.actionBarColor = ColorUtils.blendARGB(fFloatValue, i2, i);
                    botWebViewSheet.checkNavBarColor();
                    BotWebViewSheet.WindowView windowView = botWebViewSheet.windowView;
                    windowView.invalidate();
                    int i4 = botWebViewSheet.actionBarColor;
                    BotWebViewSheet.AnonymousClass5 anonymousClass5 = botWebViewSheet.actionBar;
                    anonymousClass5.setBackgroundColor(i4);
                    BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating2 = botWebViewMenuContainer$ActionBarColorsAnimating;
                    botWebViewMenuContainer$ActionBarColorsAnimating2.updateActionBar(anonymousClass5, fFloatValue);
                    botWebViewSheet.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating2.getColor(Theme.key_sheet_scrollUp);
                    windowView.invalidate();
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    int iBlendARGB = ColorUtils.blendARGB(1.0f, i2, i);
                    BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                    botWebViewSheet.actionBarColor = iBlendARGB;
                    botWebViewSheet.checkNavBarColor();
                    botWebViewSheet.windowView.invalidate();
                    botWebViewSheet.actionBar.setBackgroundColor(botWebViewSheet.actionBarColor);
                    AnonymousClass5 anonymousClass5 = botWebViewSheet.actionBar;
                    BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating2 = botWebViewMenuContainer$ActionBarColorsAnimating;
                    botWebViewMenuContainer$ActionBarColorsAnimating2.updateActionBar(anonymousClass5, 1.0f);
                    botWebViewSheet.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating2.getColor(Theme.key_sheet_scrollUp);
                    botWebViewSheet.windowView.invalidate();
                }
            });
            duration.start();
        } else {
            this.actionBarColor = i;
            checkNavBarColor();
            WindowView windowView = this.windowView;
            windowView.invalidate();
            int i4 = this.actionBarColor;
            AnonymousClass5 anonymousClass5 = this.actionBar;
            anonymousClass5.setBackgroundColor(i4);
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(anonymousClass5, 1.0f);
            this.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating.getColor(Theme.key_sheet_scrollUp);
            windowView.invalidate();
        }
        updateLightStatusBar$2();
    }

    public final void setAttached(boolean z) {
        if (this.attached == z) {
            return;
        }
        this.attached = z;
        if (z) {
            if (this.orientationLocked) {
                shownLockedBots++;
            }
        } else if (this.orientationLocked) {
            shownLockedBots--;
        }
        if (shownLockedBots > 0) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                ownerActivity = LaunchActivity.instance;
            }
            if (ownerActivity == null) {
                ownerActivity = AndroidUtilities.findActivity(getContext());
            }
            AndroidUtilities.lockOrientation(ownerActivity);
            return;
        }
        Activity ownerActivity2 = getOwnerActivity();
        if (ownerActivity2 == null) {
            ownerActivity2 = LaunchActivity.instance;
        }
        if (ownerActivity2 == null) {
            ownerActivity2 = AndroidUtilities.findActivity(getContext());
        }
        AndroidUtilities.unlockOrientation(ownerActivity2);
    }

    public final void setBackgroundColor(int i, boolean z) {
        int i2 = 0;
        Paint paint = this.backgroundPaint;
        int color = paint.getColor();
        this.overrideBackgroundColor = true;
        ValueAnimator valueAnimator = this.backgroundColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.backgroundColorAnimator = duration;
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.backgroundColorAnimator.addUpdateListener(new BotWebViewSheet$$ExternalSyntheticLambda30(this, color, i, i2));
            this.backgroundColorAnimator.addListener(new ArticleViewer.AnonymousClass3(this, i, 14));
            this.backgroundColorAnimator.start();
            return;
        }
        paint.setColor(i);
        updateActionBarColors();
        this.windowView.invalidate();
        ArticleViewer.ErrorContainer errorContainer = this.errorContainer;
        if (errorContainer != null) {
            errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            this.errorContainer.setBackgroundColor(paint.getColor());
        }
        updateWebViewBackgroundColor();
    }

    public final void setDefaultFullsize(boolean z) {
        if (this.defaultFullsize != z) {
            this.defaultFullsize = z;
            AnonymousClass1 anonymousClass1 = this.swipeContainer;
            if (anonymousClass1 != null) {
                anonymousClass1.setFullSize(isFullSize());
            }
        }
    }

    @Override
    public final boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog) {
        return false;
    }

    public final void setFullscreen(final boolean z, boolean z2, boolean z3) {
        float fMin;
        float f;
        int currentActionBarHeight;
        if (this.fullscreen == z) {
            return;
        }
        this.fullscreen = z;
        this.fullscreenBlur = z3 && !MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        ValueAnimator valueAnimator = this.fullscreenAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.fullscreenButtons;
        AnonymousClass1 anonymousClass1 = this.swipeContainer;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z, z2);
            botFullscreenButtons.setParentRenderNode(this.fullscreenBlur ? anonymousClass1.getRenderNode() : null);
        }
        this.swipeContainerFromWidth = anonymousClass1.getWidth();
        this.swipeContainerFromHeight = anonymousClass1.getHeight();
        this.resetOffsetY = false;
        AnonymousClass4 anonymousClass4 = this.botButtons;
        AnonymousClass2 anonymousClass2 = this.webViewContainer;
        AnonymousClass5 anonymousClass5 = this.actionBar;
        if (!z2) {
            this.fullscreenInProgress = false;
            this.fullscreenProgress = z ? 1.0f : 0.0f;
            this.fullscreenTransitionProgress = 0.0f;
            updateFullscreenLayout();
            updateWindowFlags();
            anonymousClass5.setVisibility(z ? 8 : 0);
            anonymousClass5.setAlpha(1.0f - this.fullscreenProgress);
            anonymousClass5.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * this.fullscreenProgress);
            anonymousClass4.setTranslationX(0.0f);
            botFullscreenButtons.setAlpha(this.fullscreenProgress);
            anonymousClass2.setViewPortHeightOffset(0.0f);
            anonymousClass2.invalidateViewPortHeight(true, true);
            updateDownloadBulletinArrow();
            return;
        }
        updateFullscreenLayout();
        updateWindowFlags();
        updateDownloadBulletinArrow();
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            fMin = 0.0f;
        } else {
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            fMin = (i - ((int) (Math.min(i, point.y) * 0.8f))) / 2.0f;
        }
        Rect rect = this.insets;
        float f2 = z ? rect.left + fMin : (-rect.left) - fMin;
        if (!z) {
            fMin = -fMin;
        }
        float translationY = z ? anonymousClass1.getTranslationY() : -AndroidUtilities.dp(24.0f);
        if (z) {
            f = 1.0f;
            currentActionBarHeight = -AndroidUtilities.dp(24.0f);
        } else {
            f = 1.0f;
            currentActionBarHeight = (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
        }
        final float f3 = currentActionBarHeight;
        final float currentActionBarHeight2 = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        SpringAnimation springAnimation = anonymousClass1.offsetYAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = anonymousClass1.scrollAnimator;
        if (springAnimation2 != null) {
            springAnimation2.cancel();
        }
        anonymousClass1.setSwipeOffsetAnimationDisallowed(true);
        anonymousClass5.setVisibility(0);
        if (z) {
            anonymousClass1.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
        } else {
            anonymousClass1.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
        }
        anonymousClass1.invalidateTranslation();
        anonymousClass1.invalidate();
        this.fullscreenTransitionProgress = 0.0f;
        float f4 = z ? 0.0f : 1.0f;
        this.fullscreenProgress = f4;
        anonymousClass5.setAlpha(f - f4);
        anonymousClass5.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * this.fullscreenProgress);
        anonymousClass1.setTranslationY(AndroidUtilities.lerp(translationY, f3, this.fullscreenTransitionProgress));
        anonymousClass1.setTranslationX(AndroidUtilities.lerp(f2, 0.0f, this.fullscreenTransitionProgress));
        anonymousClass4.setTranslationX(AndroidUtilities.lerp(fMin, 0.0f, this.fullscreenTransitionProgress));
        botFullscreenButtons.setAlpha(this.fullscreenProgress);
        this.windowView.invalidate();
        anonymousClass2.setViewPortHeightOffset(anonymousClass1.getTranslationY() - f3);
        anonymousClass2.invalidateViewPortHeight(false, false);
        this.fullscreenInProgress = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.fullscreenAnimator = valueAnimatorOfFloat;
        final float f5 = fMin;
        final float f6 = f2;
        final float f7 = translationY;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                botWebViewSheet.fullscreenTransitionProgress = fFloatValue;
                float f8 = z ? botWebViewSheet.fullscreenTransitionProgress : 1.0f - botWebViewSheet.fullscreenTransitionProgress;
                botWebViewSheet.fullscreenProgress = f8;
                botWebViewSheet.actionBar.setAlpha(1.0f - f8);
                botWebViewSheet.actionBar.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * botWebViewSheet.fullscreenProgress);
                AnonymousClass1 anonymousClass3 = botWebViewSheet.swipeContainer;
                float f9 = f7;
                float f10 = botWebViewSheet.fullscreenTransitionProgress;
                float f11 = f3;
                anonymousClass3.setTranslationY(AndroidUtilities.lerp(f9, f11, f10));
                botWebViewSheet.swipeContainer.setTranslationX(AndroidUtilities.lerp(f6, 0.0f, botWebViewSheet.fullscreenTransitionProgress));
                botWebViewSheet.botButtons.setTranslationX(AndroidUtilities.lerp(f5, 0.0f, botWebViewSheet.fullscreenTransitionProgress));
                botWebViewSheet.fullscreenButtons.setAlpha(botWebViewSheet.fullscreenProgress);
                botWebViewSheet.windowView.invalidate();
                botWebViewSheet.webViewContainer.setViewPortHeightOffset(botWebViewSheet.swipeContainer.getTranslationY() - f11);
                botWebViewSheet.webViewContainer.invalidateViewPortHeight(false, false);
                botWebViewSheet.updateDownloadBulletinArrow();
            }
        });
        this.fullscreenAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                botWebViewSheet.fullscreenInProgress = false;
                boolean z4 = z;
                if (z4) {
                    botWebViewSheet.swipeContainer.setForceOffsetY(-AndroidUtilities.dp(24.0f));
                    botWebViewSheet.swipeContainer.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
                    botWebViewSheet.swipeContainer.setSwipeOffsetY(0.0f);
                } else {
                    botWebViewSheet.updateFullscreenLayout();
                    botWebViewSheet.updateWindowFlags();
                    AnonymousClass1 anonymousClass3 = botWebViewSheet.swipeContainer;
                    float fDp = AndroidUtilities.dp(24.0f);
                    float f8 = currentActionBarHeight2;
                    anonymousClass3.setForceOffsetY(f8 - fDp);
                    botWebViewSheet.swipeContainer.setTopActionBarOffsetY(f8 - AndroidUtilities.dp(24.0f));
                    botWebViewSheet.swipeContainer.setSwipeOffsetY(0.0f);
                }
                float f9 = z4 ? botWebViewSheet.fullscreenTransitionProgress : 1.0f - botWebViewSheet.fullscreenTransitionProgress;
                botWebViewSheet.fullscreenProgress = f9;
                botWebViewSheet.actionBar.setAlpha(1.0f - f9);
                botWebViewSheet.actionBar.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * botWebViewSheet.fullscreenProgress);
                botWebViewSheet.fullscreenButtons.setAlpha(botWebViewSheet.fullscreenProgress);
                if (z4) {
                    botWebViewSheet.actionBar.setVisibility(8);
                }
                botWebViewSheet.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
                botWebViewSheet.swipeContainer.setTranslationX(AndroidUtilities.lerp(f6, 0.0f, botWebViewSheet.fullscreenTransitionProgress));
                botWebViewSheet.botButtons.setTranslationX(0.0f);
                botWebViewSheet.windowView.invalidate();
                botWebViewSheet.webViewContainer.setViewPortHeightOffset(0.0f);
                botWebViewSheet.webViewContainer.invalidateViewPortHeight(true, true);
                botWebViewSheet.updateDownloadBulletinArrow();
            }
        });
        this.fullscreenAnimator.setDuration(280L);
        this.fullscreenAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.fullscreenAnimator.start();
    }

    @Override
    public final void setLastVisible(boolean z) {
    }

    public final void setNavigationBarColor(int i, boolean z) {
        int i2 = 0;
        int i3 = 1;
        int i4 = this.navBarColor;
        AnonymousClass4 anonymousClass4 = this.botButtons;
        Paint paint = anonymousClass4.backgroundPaint;
        anonymousClass4.state.limit = i;
        paint.setColor(i);
        if (!z) {
            anonymousClass4.background.set(i, true);
        }
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new BotWebViewSheet$$ExternalSyntheticLambda30(this, i4, i, i3));
            duration.addListener(new AnonymousClass16(this, i4, i, i2));
            duration.start();
        } else {
            this.navBarColor = i;
            checkNavBarColor();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.navBarColor, false);
    }

    public final void setOpen(boolean z) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.openedProgress - (z ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openedProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new TodoItemMenu.AnonymousClass15(15, this, z));
        this.openAnimator.addUpdateListener(new BotWebViewSheet$$ExternalSyntheticLambda12(this, 0));
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(220L);
        this.openAnimator.start();
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            setOpen(true);
            WindowView windowView = this.windowView;
            windowView.setAlpha(0.0f);
            windowView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 2));
            super.show();
            this.superDismissed = false;
            activeSheets.add(this);
        }
    }

    public final void updateActionBarColors() {
        if (!this.overrideActionBarColor) {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = Theme.getColor(i, resourcesProvider);
            AnonymousClass5 anonymousClass5 = this.actionBar;
            anonymousClass5.setTitleColor(color);
            anonymousClass5.setItemsColor(Theme.getColor(i, resourcesProvider), false);
            anonymousClass5.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector, resourcesProvider), false);
            anonymousClass5.setPopupBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), false);
            anonymousClass5.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), false, false);
            anonymousClass5.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), true, false);
            int color2 = Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider);
            ActionBarMenu actionBarMenu = anonymousClass5.menu;
            if (actionBarMenu != null) {
                actionBarMenu.setPopupItemsSelectorColor(color2);
            }
        }
        setFlickerViewColor(this.backgroundPaint.getColor());
    }

    public final void updateDownloadBulletin() {
        Bulletin bulletin;
        boolean z;
        boolean z2 = true;
        Context context = getContext();
        int i = this.currentAccount;
        long j = this.botId;
        HashMap map = BotDownloads.instances;
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap map2 = BotDownloads.instances;
        BotDownloads botDownloads = (BotDownloads) map2.get(pair);
        if (botDownloads == null) {
            botDownloads = new BotDownloads(context, i, j);
            map2.put(pair, botDownloads);
        }
        BotDownloads.FileDownload fileDownload = botDownloads.currentFile;
        if (fileDownload == null) {
            Bulletin bulletin2 = this.downloadBulletin;
            if (bulletin2 != null) {
                bulletin2.hide();
                this.downloadBulletin = null;
            }
        } else if ((!fileDownload.isDownloading() || fileDownload.shown) && !fileDownload.resaved) {
            BotDownloads.DownloadBulletin downloadBulletin = this.downloadBulletinLayout;
            if (downloadBulletin != null) {
                this.lastBulletinFile = fileDownload;
                if (downloadBulletin.set(fileDownload)) {
                    this.downloadBulletin = null;
                }
            }
        } else {
            if (this.lastBulletinFile != fileDownload && (bulletin = this.downloadBulletin) != null) {
                bulletin.hide();
                this.downloadBulletin = null;
            }
            Bulletin bulletin3 = this.downloadBulletin;
            if (bulletin3 == null || !bulletin3.showing) {
                this.lastBulletinFile = fileDownload;
                BotDownloads.DownloadBulletin downloadBulletin2 = new BotDownloads.DownloadBulletin(getContext(), this.resourcesProvider);
                this.downloadBulletinLayout = downloadBulletin2;
                Bulletin bulletinMake = Bulletin.make(this.bulletinContainer, downloadBulletin2, 5000);
                this.downloadBulletin = bulletinMake;
                bulletinMake.show(true);
            }
            if (this.downloadBulletinLayout.set(fileDownload)) {
                this.downloadBulletin = null;
            }
            fileDownload.resaved = false;
            fileDownload.shown = true;
        }
        updateDownloadBulletinArrow();
        for (Map.Entry entry : this.fileItems.entrySet()) {
            ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) entry.getValue();
            BotDownloads.FileDownload fileDownload2 = (BotDownloads.FileDownload) entry.getKey();
            actionBarMenuSubItem.setText(fileDownload2.file_name);
            if (fileDownload2.isDownloading()) {
                Pair progress = fileDownload2.getProgress();
                if (((Long) progress.second).longValue() > 0) {
                    actionBarMenuSubItem.setSubtext(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) progress.second).longValue()));
                } else {
                    actionBarMenuSubItem.setSubtext(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()));
                }
            } else {
                actionBarMenuSubItem.setSubtext(AndroidUtilities.formatFileSize(fileDownload2.size));
            }
            if (fileDownload2.isDownloading()) {
                actionBarMenuSubItem.setRightIcon(R.drawable.msg_close);
                actionBarMenuSubItem.subtextView.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (fileDownload2.cancelled) {
                actionBarMenuSubItem.setVisibility(8);
            } else {
                actionBarMenuSubItem.setRightIcon(0);
                actionBarMenuSubItem.subtextView.setPadding(0, 0, 0, 0);
            }
            actionBarMenuSubItem.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(5, this, fileDownload2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.optionsIcon;
        ArrayList arrayList = botDownloads.files;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((BotDownloads.FileDownload) obj).isDownloading()) {
                z = true;
                break;
            }
        }
        optionsIcon.setDownloading(z);
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (((BotDownloads.FileDownload) obj2).isDownloading()) {
                this.fullscreenButtons.setDownloading(z2);
            }
        }
        z2 = false;
        this.fullscreenButtons.setDownloading(z2);
    }

    public final void updateDownloadBulletinArrow() {
        BotDownloads.DownloadBulletin downloadBulletin = this.downloadBulletinLayout;
        if (downloadBulletin == null) {
            return;
        }
        if (this.fullscreen) {
            downloadBulletin.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.fullscreenProgress));
        } else if (this.actionBarTransitionProgress > 0.5f) {
            downloadBulletin.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            downloadBulletin.setArrow(-1);
        }
    }

    public final void updateFullscreenLayout() {
        BotFullscreenButtons botFullscreenButtons = this.fullscreenButtons;
        Rect rect = this.insets;
        botFullscreenButtons.setInsets(rect);
        boolean z = this.fullscreen;
        AnonymousClass2 anonymousClass2 = this.webViewContainer;
        WindowView windowView = this.windowView;
        AnonymousClass4 anonymousClass4 = this.botButtons;
        if (z) {
            int i = (anonymousClass4 == null || anonymousClass4.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.keyboardInset <= i && (anonymousClass4 == null || anonymousClass4.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int iDp = AndroidUtilities.dp(46.0f);
            anonymousClass2.reportSafeInsets(rect2, false);
            anonymousClass2.reportSafeContentInsets(iDp, false);
            windowView.setPadding(0, 0, 0, Math.max(this.keyboardInset, i));
        } else {
            anonymousClass2.reportSafeInsets(new Rect(0, 0, 0, 0), false);
            anonymousClass2.reportSafeContentInsets(0, false);
            int i2 = rect.left;
            int i3 = rect.right;
            int i4 = this.keyboardInset;
            BottomSheetTabs bottomSheetTabs = this.bottomTabs;
            windowView.setPadding(i2, 0, i3, Math.max(i4, (bottomSheetTabs != null ? bottomSheetTabs.bottomTabsHeight : 0) + rect.bottom));
        }
        this.swipeContainerLayoutParams.topMargin = AndroidUtilities.dp(24.0f);
        boolean z2 = this.fullscreen;
        int i5 = !z2 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.actionBarLayoutParams;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = 0;
        int i6 = !z2 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.bulletinContainerLayoutParams;
        layoutParams2.leftMargin = i6;
        layoutParams2.rightMargin = !z2 ? 0 : rect.right;
        boolean z3 = this.fullscreenInProgress;
        AnonymousClass1 anonymousClass1 = this.swipeContainer;
        if (!z3) {
            anonymousClass1.setSwipeOffsetAnimationDisallowed(true);
            if (this.fullscreen) {
                anonymousClass1.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                anonymousClass1.setTopActionBarOffsetY((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            anonymousClass1.setSwipeOffsetAnimationDisallowed(false);
            anonymousClass1.invalidateTranslation();
            anonymousClass1.invalidate();
            anonymousClass1.requestLayout();
        }
        if (anonymousClass1 != null) {
            anonymousClass1.setFullSize(isFullSize());
        }
        anonymousClass4.requestLayout();
        windowView.requestLayout();
        botFullscreenButtons.setVisibility(this.fullscreen ? 0 : 8);
    }

    public final void updateLightStatusBar$2() {
        boolean z = true;
        if (this.overrideActionBarColor) {
            z = true ^ this.actionBarIsLight;
        } else {
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, true);
            if (AndroidUtilities.isTablet() || ColorUtils.calculateLuminance(color) < 0.7210000157356262d || this.actionBarTransitionProgress < 0.85f) {
                z = false;
            }
        }
        Boolean bool = this.wasLightStatusBar;
        if (bool == null || bool.booleanValue() != z) {
            this.wasLightStatusBar = Boolean.valueOf(z);
            if (Build.VERSION.SDK_INT >= 23) {
                WindowView windowView = this.windowView;
                int systemUiVisibility = windowView.getSystemUiVisibility();
                windowView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
    }

    public final void updateWebViewBackgroundColor() {
        BotWebViewContainer.MyWebView webView;
        AnonymousClass2 anonymousClass2 = this.webViewContainer;
        if (anonymousClass2 == null || (webView = anonymousClass2.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.backgroundPaint.getColor());
    }

    public final void updateWindowFlags() {
        AnonymousClass4 anonymousClass4;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z = this.fullscreen;
            if (z) {
                attributes.flags = i | attributes.flags;
            } else {
                attributes.flags = (~i) & attributes.flags;
            }
            WindowView windowView = this.windowView;
            if (!z || (((anonymousClass4 = this.botButtons) != null && anonymousClass4.getTotalHeight() > 0) || windowView.drawingFromOverlay)) {
                windowView.setSystemUiVisibility(windowView.getSystemUiVisibility() & (-3));
            } else {
                windowView.setSystemUiVisibility(windowView.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void dismiss() {
        dismiss$1(false);
    }
}

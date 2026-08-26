package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.poll.RecentVotersCell;

public final class ContentPreviewViewer {
    public static volatile ContentPreviewViewer Instance;
    public static TextPaint textPaint;
    public final ColorDrawable backgroundDrawable;
    public float blurProgress;
    public Bitmap blurrBitmap;
    public final ImageReceiver centerImage;
    public boolean clearsInputField;
    public boolean closeOnDismiss;
    public IntroActivity.AnonymousClass1 containerView;
    public int currentAccount;
    public int currentContentType;
    public TLRPC.Document currentDocument;
    public float currentMoveY;
    public float currentMoveYProgress;
    public View currentPreviewCell;
    public String currentQuery;
    public TLRPC.InputStickerSet currentStickerSet;
    public ContentPreviewViewerDelegate delegate;
    public boolean drawEffect;
    public final ImageReceiver effectImage;
    public SendMessagesHelper.ImportingSticker importingSticker;
    public TLRPC.BotInlineResult inlineResult;
    public boolean isPhotoEditor;
    public boolean isRecentSticker;
    public boolean isStickerEditor;
    public boolean isVisible;
    public int keyboardHeight;
    public float lastTouchY;
    public long lastUpdateTime;
    public boolean menuVisible;
    public OAuthSheet$$ExternalSyntheticLambda2 openPreviewRunnable;
    public final Paint paint;
    public PaintingOverlay paintingOverlay;
    public Path paintingOverlayClipPath;
    public Activity parentActivity;
    public Object parentObject;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    public ActionBarPopupWindow popupWindow;
    public boolean preparingBitmap;
    public AnonymousClass2 reactionsLayout;
    public FrameLayout reactionsLayoutContainer;
    public Theme.ResourcesProvider resourcesProvider;
    public final BlurredBackgroundDrawableViewFactory scrimBlur3Factory;
    public final BlurredBackgroundSourceBitmap scrimBlur3SourceBitmap;
    public ArrayList selectedEmojis;
    public float showProgress;
    public final AnonymousClass1 showSheetRunnable;
    public Drawable slideUpDrawable;
    public float startMoveY;
    public int startX;
    public int startY;
    public StaticLayout stickerEmojiLayout;
    public TLRPC.TL_messages_stickerSet stickerSetForCustomSticker;
    public UnlockPremiumView unlockPremiumView;
    public VibrationEffect vibrationEffect;
    public WindowManager.LayoutParams windowLayoutParams;
    public LoginActivity.AnonymousClass4 windowView;
    public float moveY = 0.0f;
    public Insets lastInsets = Insets.NONE;

    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override
        public final void run() {
            int i;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
            int i2;
            boolean zHasRecentGif;
            TLRPC.InputStickerSet inputStickerSet;
            int i3;
            View childAt;
            ActionBarMenuSubItem actionBarMenuSubItem;
            boolean z;
            boolean z2;
            MessageSeenView.AnonymousClass1 anonymousClass1;
            int i4;
            ItemOptions customItemOptions;
            int i5 = 6;
            final int i6 = 0;
            final int i7 = 1;
            final ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            if (contentPreviewViewer.parentActivity == null || contentPreviewViewer.isPhotoEditor) {
                return;
            }
            contentPreviewViewer.closeOnDismiss = true;
            ContentPreviewViewerDelegate contentPreviewViewerDelegate = contentPreviewViewer.delegate;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = contentPreviewViewer.scrimBlur3Factory;
            if (contentPreviewViewerDelegate != null && (customItemOptions = contentPreviewViewerDelegate.getCustomItemOptions(contentPreviewViewer.containerView)) != null) {
                customItemOptions.setBlurBackground(blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderImpl.scrimMenuBackground(contentPreviewViewer.resourcesProvider), true);
                customItemOptions.drawScrim = false;
                customItemOptions.setupSelectors();
                customItemOptions.dismissListener = new ComposeDrawable$$ExternalSyntheticLambda0(this, i5);
                ViewGroup viewGroup = customItemOptions.layout;
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(viewGroup) {
                    @Override
                    public final void dismiss() {
                        dismiss(true);
                        ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                        contentPreviewViewer2.popupWindow = null;
                        contentPreviewViewer2.menuVisible = false;
                        if (contentPreviewViewer2.closeOnDismiss) {
                            contentPreviewViewer2.close();
                        }
                    }
                };
                contentPreviewViewer.popupWindow = actionBarPopupWindow;
                actionBarPopupWindow.pauseNotifications = true;
                actionBarPopupWindow.dismissAnimationDuration = 150;
                actionBarPopupWindow.scaleOut = true;
                actionBarPopupWindow.setOutsideTouchable(true);
                contentPreviewViewer.popupWindow.setClippingEnabled(true);
                contentPreviewViewer.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                contentPreviewViewer.popupWindow.setFocusable(true);
                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                contentPreviewViewer.popupWindow.setInputMethodMode(2);
                contentPreviewViewer.popupWindow.getContentView().setFocusableInTouchMode(true);
                Insets insets = contentPreviewViewer.lastInsets;
                int i8 = insets.bottom;
                int i9 = insets.top;
                int i10 = i8 + i9;
                int iMin = (Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i10) - AndroidUtilities.dp(40.0f)) / 2;
                int iDp = (int) ((AndroidUtilities.dp(24.0f) - contentPreviewViewer.moveY) + ((int) (contentPreviewViewer.moveY + Math.max(i9 + iMin + (contentPreviewViewer.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((contentPreviewViewer.containerView.getHeight() - i10) - contentPreviewViewer.keyboardHeight) / 2) + iMin)));
                ActionBarPopupWindow actionBarPopupWindow2 = contentPreviewViewer.popupWindow;
                IntroActivity.AnonymousClass1 anonymousClass2 = contentPreviewViewer.containerView;
                actionBarPopupWindow2.showAtLocation(anonymousClass2, 0, (int) ((anonymousClass2.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), iDp);
                try {
                    contentPreviewViewer.containerView.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                float f = contentPreviewViewer.moveY;
                if (f != 0.0f) {
                    contentPreviewViewer.startMoveY = f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ContentPreviewViewer.AnonymousClass1 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i6) {
                                case 0:
                                    ContentPreviewViewer.AnonymousClass1 anonymousClass3 = this.f$0;
                                    anonymousClass3.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                                    contentPreviewViewer2.currentMoveYProgress = fFloatValue;
                                    float f2 = contentPreviewViewer2.startMoveY;
                                    contentPreviewViewer2.moveY = ((0.0f - f2) * fFloatValue) + f2;
                                    contentPreviewViewer2.containerView.invalidate();
                                    break;
                                case 1:
                                    ContentPreviewViewer.AnonymousClass1 anonymousClass4 = this.f$0;
                                    anonymousClass4.getClass();
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                                    contentPreviewViewer3.currentMoveYProgress = fFloatValue2;
                                    float f3 = contentPreviewViewer3.startMoveY;
                                    contentPreviewViewer3.moveY = ((0.0f - f3) * fFloatValue2) + f3;
                                    contentPreviewViewer3.containerView.invalidate();
                                    break;
                                default:
                                    ContentPreviewViewer.AnonymousClass1 anonymousClass5 = this.f$0;
                                    anonymousClass5.getClass();
                                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                                    contentPreviewViewer4.currentMoveYProgress = fFloatValue3;
                                    float f4 = contentPreviewViewer4.startMoveY;
                                    contentPreviewViewer4.moveY = ((0.0f - f4) * fFloatValue3) + f4;
                                    contentPreviewViewer4.containerView.invalidate();
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfFloat.setDuration(350L);
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    valueAnimatorOfFloat.start();
                }
                contentPreviewViewer.menuVisible = true;
                return;
            }
            if (contentPreviewViewer.currentContentType == 3) {
                i = 1;
            } else {
                ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = contentPreviewViewer.delegate;
                if (contentPreviewViewerDelegate2 != null) {
                    TLRPC.TL_messageMediaPoll poll = contentPreviewViewerDelegate2.getPoll();
                    TLRPC.PollAnswer pollAnswer = contentPreviewViewer.delegate.getPollAnswer();
                    if (poll != null && poll.poll != null && pollAnswer != null) {
                        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(poll, pollAnswer.option);
                        if (pollResult != null && pollResult.voters > 0) {
                            MessageObject.canShowVotersList(poll);
                        }
                        i = 1;
                    }
                }
                i = 0;
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i, contentPreviewViewer.containerView.getContext(), contentPreviewViewer.resourcesProvider);
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(actionBarPopupWindowLayout2, null, true);
            blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(contentPreviewViewer.resourcesProvider));
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
            actionBarPopupWindowLayout2.setBackground(blurredBackgroundDrawableCreate);
            int i11 = contentPreviewViewer.currentContentType;
            if (i11 == 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (contentPreviewViewer.stickerSetForCustomSticker == null) {
                    ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = contentPreviewViewer.delegate;
                    if (contentPreviewViewerDelegate3 == null || !contentPreviewViewerDelegate3.isSettingIntroSticker()) {
                        if (contentPreviewViewer.delegate.canSendSticker()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            zzlo.m(R.drawable.msg_send, 0, arrayList3, arrayList2);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        zzlo.m(R.drawable.msg_fave, 1, arrayList3, arrayList2);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        zzlo.m(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                    }
                }
                ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = contentPreviewViewer.delegate;
                if (contentPreviewViewerDelegate4 == null || !contentPreviewViewerDelegate4.isSettingIntroSticker()) {
                    ContentPreviewViewerDelegate contentPreviewViewerDelegate5 = contentPreviewViewer.delegate;
                    arrayList.add(LocaleController.getString((contentPreviewViewerDelegate5 == null || !contentPreviewViewerDelegate5.isReplacedSticker()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    ContentPreviewViewerDelegate contentPreviewViewerDelegate6 = contentPreviewViewer.delegate;
                    zzlo.m((contentPreviewViewerDelegate6 == null || !contentPreviewViewerDelegate6.isReplacedSticker()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, 2, arrayList3, arrayList2);
                }
                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, contentPreviewViewer.parentActivity, contentPreviewViewer.resourcesProvider, true, false);
                actionBarMenuSubItem2.setItemHeight(44);
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                actionBarMenuSubItem2.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(contentPreviewViewer.containerView.getContext());
                LinearLayout linearLayout = new LinearLayout(contentPreviewViewer.containerView.getContext());
                linearLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, contentPreviewViewer.resourcesProvider));
                linearLayout.setOrientation(1);
                if (contentPreviewViewer.parentActivity == null) {
                    anonymousClass1 = null;
                    i4 = 5;
                } else {
                    final ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(contentPreviewViewer.currentAccount).sendRequest(tL_messages_getMyStickers, new BoostsActivity$$ExternalSyntheticLambda7(contentPreviewViewer, arrayList4, tL_messages_getMyStickers, 25));
                    anonymousClass1 = new MessageSeenView.AnonymousClass1(contentPreviewViewer.parentActivity, 7, null);
                    anonymousClass1.setLayoutManager(new LinearLayoutManager(1, false));
                    i4 = 5;
                    anonymousClass1.addItemDecoration(new MessageSeenView.AnonymousClass2(arrayList4, i4));
                    anonymousClass1.setAdapter(new RecyclerListView.SelectionAdapter() {
                        @Override
                        public final int getItemCount() {
                            return arrayList4.size();
                        }

                        @Override
                        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                            return true;
                        }

                        @Override
                        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i12) {
                            StickerPackNameView stickerPackNameView = (StickerPackNameView) viewHolder.itemView;
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i12);
                            stickerPackNameView.cover = stickerSetCovered;
                            boolean z3 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
                            SimpleTextView simpleTextView = stickerPackNameView.textView;
                            BackupImageView backupImageView = stickerPackNameView.imageView;
                            if (z3) {
                                simpleTextView.setText(LocaleController.getString(R.string.NewStickerPack), false);
                                backupImageView.setImageResource(R.drawable.msg_addbot);
                                return;
                            }
                            simpleTextView.setText(stickerSetCovered.set.title, false);
                            TLRPC.Document document = stickerSetCovered.cover;
                            if (document == null) {
                                backupImageView.setImage(null, null, null, null, null, 0);
                                return;
                            }
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, Theme.key_windowBackgroundGray, 1.0f, 1.0f, stickerPackNameView.resourcesProvider);
                            if (svgThumb == null) {
                                backupImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, null, null, null, "webp", 0, stickerSetCovered);
                            } else if (closestPhotoSizeWithSize != null) {
                                backupImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, null, null, svgThumb, "webp", 0, stickerSetCovered);
                            } else {
                                backupImageView.setImage(ImageLocation.getForDocument(stickerSetCovered.cover), null, null, null, svgThumb, "webp", 0, stickerSetCovered);
                            }
                        }

                        @Override
                        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup2, int i12) {
                            StickerPackNameView stickerPackNameView = new StickerPackNameView(viewGroup2.getContext(), ContentPreviewViewer.this.resourcesProvider);
                            stickerPackNameView.setLayoutParams(new RecyclerView.LayoutParams(-2, AndroidUtilities.dp(48.0f)));
                            return new RecyclerListView.Holder(stickerPackNameView);
                        }
                    });
                }
                anonymousClass1.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, i4));
                frameLayout.addView(actionBarMenuSubItem2);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new ActionBarPopupWindow.GapView(contentPreviewViewer.containerView.getContext(), contentPreviewViewer.resourcesProvider), LayoutHelper.createLinear(-1, 8));
                MessageSeenView.AnonymousClass1 anonymousClass3 = anonymousClass1;
                i2 = 1;
                OAuthSheet$$ExternalSyntheticLambda6 oAuthSheet$$ExternalSyntheticLambda6 = new OAuthSheet$$ExternalSyntheticLambda6((Object) this, arrayList2, (Object) anonymousClass3, (Object) linearLayout, (Object) actionBarPopupWindowLayout2, 9);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout2, ((Integer) arrayList3.get(i12)).intValue(), (CharSequence) arrayList.get(i12), false, contentPreviewViewer.resourcesProvider);
                    actionBarMenuSubItemAddItem.setTag(Integer.valueOf(i12));
                    actionBarMenuSubItemAddItem.setOnClickListener(oAuthSheet$$ExternalSyntheticLambda6);
                }
                actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
                actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                linearLayout.addView(anonymousClass3, new LinearLayout.LayoutParams(actionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindowLayout.addViewToSwipeBack(linearLayout);
                frameLayout.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda222(actionBarPopupWindowLayout, 3));
                Insets insets2 = contentPreviewViewer.lastInsets;
                int i13 = insets2.bottom;
                int i14 = insets2.top;
                int i15 = i13 + i14;
                int iMin2 = ((int) (Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i15) / 1.8f)) / 2;
                contentPreviewViewer.containerView.addView(actionBarPopupWindowLayout, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((contentPreviewViewer.moveY + Math.max(i14 + iMin2, ((contentPreviewViewer.containerView.getHeight() - i15) - contentPreviewViewer.keyboardHeight) / 2)) + iMin2))) / AndroidUtilities.density, 0.0f, 0.0f));
                contentPreviewViewer.popupLayout = actionBarPopupWindowLayout;
                actionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                contentPreviewViewer.popupLayout.setAlpha(0.0f);
                contentPreviewViewer.popupLayout.setScaleX(0.8f);
                contentPreviewViewer.popupLayout.setScaleY(0.8f);
                contentPreviewViewer.popupLayout.setPivotY(0.0f);
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout3 = contentPreviewViewer.popupLayout;
                actionBarPopupWindowLayout3.setPivotX(actionBarPopupWindowLayout3.getMeasuredWidth() / 2.0f);
                contentPreviewViewer.popupLayout.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                if (contentPreviewViewer.reactionsLayout == null) {
                    AnonymousClass2 anonymousClass4 = new AnonymousClass2(contentPreviewViewer, contentPreviewViewer.containerView.getContext(), UserConfig.selectedAccount, contentPreviewViewer.resourcesProvider);
                    contentPreviewViewer.reactionsLayout = anonymousClass4;
                    anonymousClass4.skipEnterAnimation = true;
                    anonymousClass4.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    contentPreviewViewer.reactionsLayout.setClipChildren(false);
                    contentPreviewViewer.reactionsLayout.setClipToPadding(false);
                    contentPreviewViewer.reactionsLayout.setVisibility(0);
                    contentPreviewViewer.reactionsLayout.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    contentPreviewViewer.reactionsLayout.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    contentPreviewViewer.reactionsLayout.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(contentPreviewViewer.containerView.getContext());
                    contentPreviewViewer.reactionsLayoutContainer = frameLayout2;
                    frameLayout2.addView(contentPreviewViewer.reactionsLayout, LayoutHelper.createFrame(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    contentPreviewViewer.containerView.addView(contentPreviewViewer.reactionsLayoutContainer, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                contentPreviewViewer.reactionsLayout.setSelectedEmojis(contentPreviewViewer.selectedEmojis);
                contentPreviewViewer.reactionsLayout.setDelegate(new ContentPreviewViewer$$ExternalSyntheticLambda1(contentPreviewViewer));
                contentPreviewViewer.reactionsLayout.setMessage(null, null, false);
                contentPreviewViewer.reactionsLayoutContainer.setScaleY(0.6f);
                contentPreviewViewer.reactionsLayoutContainer.setScaleX(0.6f);
                contentPreviewViewer.reactionsLayoutContainer.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new ContentPreviewViewer$$ExternalSyntheticLambda0(contentPreviewViewer, 2), 10L);
                contentPreviewViewer.menuVisible = true;
                contentPreviewViewer.containerView.invalidate();
            } else {
                actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
                i2 = 1;
                if (i11 == 0) {
                    if (MessageObject.isPremiumSticker(contentPreviewViewer.currentDocument) && !AccountInstance.getInstance(contentPreviewViewer.currentAccount).getUserConfig().isPremium()) {
                        if (contentPreviewViewer.unlockPremiumView == null) {
                            UnlockPremiumView unlockPremiumView = new UnlockPremiumView(contentPreviewViewer.containerView.getContext(), contentPreviewViewer.resourcesProvider);
                            contentPreviewViewer.unlockPremiumView = unlockPremiumView;
                            contentPreviewViewer.containerView.addView(unlockPremiumView, LayoutHelper.createFrame(-1.0f, -1));
                            contentPreviewViewer.unlockPremiumView.setOnClickListener(new ContentPreviewViewer$$ExternalSyntheticLambda3(contentPreviewViewer, i6));
                            contentPreviewViewer.unlockPremiumView.premiumButtonView.buttonLayout.setOnClickListener(new ContentPreviewViewer$$ExternalSyntheticLambda3(contentPreviewViewer, i7));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(contentPreviewViewer.unlockPremiumView, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(contentPreviewViewer.unlockPremiumView, true);
                        contentPreviewViewer.unlockPremiumView.setTranslationY(0.0f);
                        contentPreviewViewer.menuVisible = true;
                        contentPreviewViewer.containerView.invalidate();
                        try {
                            contentPreviewViewer.containerView.performHapticFeedback(0);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    final boolean zIsStickerInFavorites = MediaDataController.getInstance(contentPreviewViewer.currentAccount).isStickerInFavorites(contentPreviewViewer.currentDocument);
                    ArrayList arrayList5 = new ArrayList();
                    final ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    if (contentPreviewViewer.delegate != null) {
                        if (contentPreviewViewer.delegate.needSend(contentPreviewViewer.currentContentType) && !contentPreviewViewer.delegate.isInScheduleMode()) {
                            arrayList5.add(LocaleController.getString(R.string.SendStickerPreview));
                            zzlo.m(R.drawable.msg_send, 0, arrayList7, arrayList6);
                        }
                        if (contentPreviewViewer.delegate.needSend(contentPreviewViewer.currentContentType) && !contentPreviewViewer.delegate.isInScheduleMode()) {
                            arrayList5.add(LocaleController.getString(R.string.SendWithoutSound));
                            zzlo.m(R.drawable.input_notify_off, 6, arrayList7, arrayList6);
                        }
                        if (contentPreviewViewer.delegate.canSchedule()) {
                            arrayList5.add(LocaleController.getString(R.string.Schedule));
                            zzlo.m(R.drawable.msg_autodelete, 3, arrayList7, arrayList6);
                        }
                        if (contentPreviewViewer.delegate.needRemove()) {
                            arrayList5.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                            zzlo.m(R.drawable.msg_delete, 5, arrayList7, arrayList6);
                        }
                    }
                    if (!MessageObject.isMaskDocument(contentPreviewViewer.currentDocument) && (zIsStickerInFavorites || (MediaDataController.getInstance(contentPreviewViewer.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(contentPreviewViewer.currentDocument)))) {
                        arrayList5.add(LocaleController.getString(zIsStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                        zzlo.m(zIsStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, 2, arrayList7, arrayList6);
                    }
                    if (contentPreviewViewer.delegate != null && (inputStickerSet = contentPreviewViewer.currentStickerSet) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && contentPreviewViewer.delegate.needOpen()) {
                        arrayList5.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        zzlo.m(R.drawable.msg_media, 1, arrayList7, arrayList6);
                    }
                    if (contentPreviewViewer.isRecentSticker) {
                        arrayList5.add(LocaleController.getString(R.string.DeleteFromRecent));
                        zzlo.m(R.drawable.msg_delete, 4, arrayList7, arrayList6);
                    }
                    if (contentPreviewViewer.currentStickerSet != null && contentPreviewViewer.currentDocument != null) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(contentPreviewViewer.currentAccount).getStickerSet(contentPreviewViewer.currentStickerSet, true);
                        if (stickerSet != null && contentPreviewViewer.delegate != null && contentPreviewViewer.delegate.canEditSticker()) {
                            TLRPC.StickerSet stickerSet2 = stickerSet.set;
                            if (!stickerSet2.emojis && !stickerSet2.masks) {
                                arrayList5.add(LocaleController.getString(R.string.EditSticker));
                                zzlo.m(R.drawable.msg_edit, 7, arrayList7, arrayList6);
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator && contentPreviewViewer.delegate != null) {
                            ContentPreviewViewerDelegate contentPreviewViewerDelegate7 = contentPreviewViewer.delegate;
                            TLRPC.Document unused3 = contentPreviewViewer.currentDocument;
                            if (contentPreviewViewerDelegate7.canDeleteSticker()) {
                                arrayList5.add(LocaleController.getString(R.string.DeleteSticker));
                                zzlo.m(R.drawable.msg_delete, 8, arrayList7, arrayList6);
                            }
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        return;
                    }
                    contentPreviewViewer.menuVisible = true;
                    contentPreviewViewer.containerView.invalidate();
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                            if (contentPreviewViewer2.parentActivity == null) {
                                return;
                            }
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            ArrayList arrayList8 = arrayList6;
                            if (((Integer) arrayList8.get(iIntValue)).intValue() == 0 || ((Integer) arrayList8.get(iIntValue)).intValue() == 6) {
                                ContentPreviewViewerDelegate contentPreviewViewerDelegate8 = contentPreviewViewer2.delegate;
                                if (contentPreviewViewerDelegate8 != null) {
                                    contentPreviewViewerDelegate8.sendSticker(contentPreviewViewer2.currentDocument, contentPreviewViewer2.currentQuery, contentPreviewViewer2.parentObject, ((Integer) arrayList8.get(iIntValue)).intValue() == 0, 0, 0);
                                }
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 1) {
                                ContentPreviewViewerDelegate contentPreviewViewerDelegate9 = contentPreviewViewer2.delegate;
                                if (contentPreviewViewerDelegate9 != null) {
                                    contentPreviewViewerDelegate9.openSet(contentPreviewViewer2.currentStickerSet, contentPreviewViewer2.clearsInputField);
                                }
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 2) {
                                MediaDataController.getInstance(contentPreviewViewer2.currentAccount).addRecentSticker(2, contentPreviewViewer2.parentObject, contentPreviewViewer2.currentDocument, (int) (System.currentTimeMillis() / 1000), zIsStickerInFavorites);
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 3) {
                                TLRPC.Document document = contentPreviewViewer2.currentDocument;
                                Object obj = contentPreviewViewer2.parentObject;
                                String str = contentPreviewViewer2.currentQuery;
                                ContentPreviewViewerDelegate contentPreviewViewerDelegate10 = contentPreviewViewer2.delegate;
                                if (contentPreviewViewerDelegate10 == null) {
                                    return;
                                } else {
                                    AlertsCreator.createScheduleDatePickerDialog(contentPreviewViewer2.parentActivity, contentPreviewViewerDelegate10.getDialogId(), new ArticleViewer$$ExternalSyntheticLambda54((Object) contentPreviewViewerDelegate10, (Object) document, str, obj, 9));
                                }
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 4) {
                                MediaDataController.getInstance(contentPreviewViewer2.currentAccount).addRecentSticker(0, contentPreviewViewer2.parentObject, contentPreviewViewer2.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 5) {
                                contentPreviewViewer2.delegate.remove(contentPreviewViewer2.importingSticker);
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 7) {
                                contentPreviewViewer2.delegate.editSticker(contentPreviewViewer2.currentDocument);
                            } else if (((Integer) arrayList8.get(iIntValue)).intValue() == 8) {
                                contentPreviewViewer2.delegate.deleteSticker(contentPreviewViewer2.currentDocument);
                            }
                            contentPreviewViewer2.dismissPopupWindow();
                        }
                    };
                    contentPreviewViewer.addVoteOptions(actionBarPopupWindowLayout);
                    for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, ((Integer) arrayList7.get(i16)).intValue(), (CharSequence) arrayList5.get(i16), false, contentPreviewViewer.resourcesProvider);
                        actionBarMenuSubItemAddItem2.setTag(Integer.valueOf(i16));
                        actionBarMenuSubItemAddItem2.setOnClickListener(onClickListener);
                        if (((Integer) arrayList6.get(i16)).intValue() == 8) {
                            int iAccess$1800 = ContentPreviewViewer.access$1800(contentPreviewViewer, Theme.key_text_RedBold);
                            actionBarMenuSubItemAddItem2.setColors(iAccess$1800, iAccess$1800);
                            actionBarMenuSubItemAddItem2.setSelectorColor(Theme.multAlpha(0.1f, iAccess$1800));
                        }
                    }
                    ActionBarPopupWindow actionBarPopupWindow3 = new ActionBarPopupWindow(actionBarPopupWindowLayout) {
                        @Override
                        public final void dismiss() {
                            dismiss(true);
                            ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                            contentPreviewViewer2.popupWindow = null;
                            contentPreviewViewer2.menuVisible = false;
                            if (contentPreviewViewer2.closeOnDismiss) {
                                contentPreviewViewer2.close();
                            }
                            View view = contentPreviewViewer2.currentPreviewCell;
                            if (view != null) {
                                if (view instanceof StickerEmojiCell) {
                                    ((StickerEmojiCell) view).setScaled(false);
                                } else if (view instanceof StickerCell) {
                                    ((StickerCell) view).setScaled(false);
                                } else if (view instanceof ContextLinkCell) {
                                    ((ContextLinkCell) view).setScaled(false);
                                }
                                contentPreviewViewer2.currentPreviewCell = null;
                            }
                        }
                    };
                    contentPreviewViewer.popupWindow = actionBarPopupWindow3;
                    actionBarPopupWindow3.pauseNotifications = true;
                    actionBarPopupWindow3.dismissAnimationDuration = 100;
                    actionBarPopupWindow3.scaleOut = true;
                    actionBarPopupWindow3.setOutsideTouchable(true);
                    contentPreviewViewer.popupWindow.setClippingEnabled(true);
                    contentPreviewViewer.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    contentPreviewViewer.popupWindow.setFocusable(true);
                    actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    contentPreviewViewer.popupWindow.setInputMethodMode(2);
                    contentPreviewViewer.popupWindow.getContentView().setFocusableInTouchMode(true);
                    int i17 = contentPreviewViewer.lastInsets.bottom + contentPreviewViewer.lastInsets.top;
                    int i18 = contentPreviewViewer.lastInsets.top;
                    int iMin3 = (contentPreviewViewer.currentContentType == 1 ? Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i17) - AndroidUtilities.dp(40.0f) : (int) (contentPreviewViewer.drawEffect ? Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i17) - AndroidUtilities.dpf2(40.0f) : Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i17) / 1.8f)) / 2;
                    int iDp2 = AndroidUtilities.dp(24.0f) + ((int) (contentPreviewViewer.moveY + Math.max(i18 + iMin3 + (contentPreviewViewer.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((contentPreviewViewer.containerView.getHeight() - i17) - contentPreviewViewer.keyboardHeight) / 2) + iMin3));
                    if (contentPreviewViewer.drawEffect) {
                        iDp2 += AndroidUtilities.dp(24.0f);
                    }
                    contentPreviewViewer.popupWindow.showAtLocation(contentPreviewViewer.containerView, 0, (int) ((contentPreviewViewer.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), iDp2);
                    try {
                        contentPreviewViewer.containerView.performHapticFeedback(0);
                    } catch (Exception unused4) {
                    }
                } else {
                    if (contentPreviewViewer.currentContentType != 2 || contentPreviewViewer.delegate == null) {
                        if (contentPreviewViewer.delegate != null) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            if (contentPreviewViewer.delegate.needSend(contentPreviewViewer.currentContentType) && !contentPreviewViewer.delegate.isInScheduleMode()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                zzlo.m(R.drawable.msg_send, 0, arrayList10, arrayList9);
                            }
                            if (contentPreviewViewer.delegate.needSend(contentPreviewViewer.currentContentType) && !contentPreviewViewer.delegate.isInScheduleMode()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                zzlo.m(R.drawable.input_notify_off, 4, arrayList10, arrayList9);
                            }
                            if (contentPreviewViewer.delegate.canSchedule()) {
                                arrayList8.add(LocaleController.getString(R.string.Schedule));
                                zzlo.m(R.drawable.msg_autodelete, 3, arrayList10, arrayList9);
                            }
                            if (contentPreviewViewer.currentDocument != null) {
                                ContentPreviewViewerDelegate contentPreviewViewerDelegate8 = contentPreviewViewer.delegate;
                                TLRPC.Document unused5 = contentPreviewViewer.currentDocument;
                                if (contentPreviewViewerDelegate8.canAddCaption()) {
                                    arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                    zzlo.m(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                                }
                            }
                            if (contentPreviewViewer.currentDocument != null) {
                                zHasRecentGif = MediaDataController.getInstance(contentPreviewViewer.currentAccount).hasRecentGif(contentPreviewViewer.currentDocument);
                                if (zHasRecentGif) {
                                    arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                    zzlo.m(R.drawable.msg_delete, 1, arrayList10, arrayList9);
                                } else {
                                    arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                    zzlo.m(R.drawable.msg_gif_add, 2, arrayList10, arrayList9);
                                }
                            } else {
                                zHasRecentGif = false;
                            }
                            if (arrayList8.isEmpty()) {
                                return;
                            }
                            contentPreviewViewer.menuVisible = true;
                            contentPreviewViewer.containerView.invalidate();
                            int[] iArr = new int[arrayList10.size()];
                            for (int i19 = 0; i19 < arrayList10.size(); i19++) {
                                iArr[i19] = ((Integer) arrayList10.get(i19)).intValue();
                            }
                            ContactAddActivity$$ExternalSyntheticLambda8 contactAddActivity$$ExternalSyntheticLambda8 = new ContactAddActivity$$ExternalSyntheticLambda8(29, this, arrayList9);
                            for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                                ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, ((Integer) arrayList10.get(i20)).intValue(), (CharSequence) arrayList8.get(i20), false, contentPreviewViewer.resourcesProvider);
                                actionBarMenuSubItemAddItem3.setTag(Integer.valueOf(i20));
                                actionBarMenuSubItemAddItem3.setOnClickListener(contactAddActivity$$ExternalSyntheticLambda8);
                                if (zHasRecentGif && i20 == arrayList8.size() - 1) {
                                    actionBarMenuSubItemAddItem3.setColors(ContentPreviewViewer.access$1800(contentPreviewViewer, Theme.key_text_RedBold), ContentPreviewViewer.access$1800(contentPreviewViewer, Theme.key_text_RedRegular));
                                }
                            }
                            ActionBarPopupWindow actionBarPopupWindow4 = new ActionBarPopupWindow(actionBarPopupWindowLayout) {
                                @Override
                                public final void dismiss() {
                                    dismiss(true);
                                    ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                                    contentPreviewViewer2.popupWindow = null;
                                    contentPreviewViewer2.menuVisible = false;
                                    if (contentPreviewViewer2.closeOnDismiss) {
                                        contentPreviewViewer2.close();
                                    }
                                }
                            };
                            contentPreviewViewer.popupWindow = actionBarPopupWindow4;
                            actionBarPopupWindow4.pauseNotifications = true;
                            actionBarPopupWindow4.dismissAnimationDuration = 150;
                            actionBarPopupWindow4.scaleOut = true;
                            actionBarPopupWindow4.setOutsideTouchable(true);
                            contentPreviewViewer.popupWindow.setClippingEnabled(true);
                            contentPreviewViewer.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                            contentPreviewViewer.popupWindow.setFocusable(true);
                            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            contentPreviewViewer.popupWindow.setInputMethodMode(2);
                            contentPreviewViewer.popupWindow.getContentView().setFocusableInTouchMode(true);
                            int i21 = contentPreviewViewer.lastInsets.bottom + contentPreviewViewer.lastInsets.top;
                            int i22 = contentPreviewViewer.lastInsets.top;
                            int iMin4 = (Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i21) - AndroidUtilities.dp(40.0f)) / 2;
                            contentPreviewViewer.popupWindow.showAtLocation(contentPreviewViewer.containerView, 0, (int) ((contentPreviewViewer.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), (int) ((AndroidUtilities.dp(24.0f) - contentPreviewViewer.moveY) + ((int) (contentPreviewViewer.moveY + Math.max(i22 + iMin4 + (contentPreviewViewer.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((contentPreviewViewer.containerView.getHeight() - i21) - contentPreviewViewer.keyboardHeight) / 2) + iMin4))));
                            try {
                                contentPreviewViewer.containerView.performHapticFeedback(0);
                            } catch (Exception unused6) {
                            }
                            if (contentPreviewViewer.moveY != 0.0f) {
                                contentPreviewViewer.startMoveY = contentPreviewViewer.moveY;
                                final int i23 = 2;
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                    public final ContentPreviewViewer.AnonymousClass1 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i23) {
                                            case 0:
                                                ContentPreviewViewer.AnonymousClass1 anonymousClass5 = this.f$0;
                                                anonymousClass5.getClass();
                                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                                                contentPreviewViewer2.currentMoveYProgress = fFloatValue;
                                                float f2 = contentPreviewViewer2.startMoveY;
                                                contentPreviewViewer2.moveY = ((0.0f - f2) * fFloatValue) + f2;
                                                contentPreviewViewer2.containerView.invalidate();
                                                break;
                                            case 1:
                                                ContentPreviewViewer.AnonymousClass1 anonymousClass6 = this.f$0;
                                                anonymousClass6.getClass();
                                                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                                                contentPreviewViewer3.currentMoveYProgress = fFloatValue2;
                                                float f3 = contentPreviewViewer3.startMoveY;
                                                contentPreviewViewer3.moveY = ((0.0f - f3) * fFloatValue2) + f3;
                                                contentPreviewViewer3.containerView.invalidate();
                                                break;
                                            default:
                                                ContentPreviewViewer.AnonymousClass1 anonymousClass7 = this.f$0;
                                                anonymousClass7.getClass();
                                                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                                                contentPreviewViewer4.currentMoveYProgress = fFloatValue3;
                                                float f4 = contentPreviewViewer4.startMoveY;
                                                contentPreviewViewer4.moveY = ((0.0f - f4) * fFloatValue3) + f4;
                                                contentPreviewViewer4.containerView.invalidate();
                                                break;
                                        }
                                    }
                                });
                                valueAnimatorOfFloat2.setDuration(350L);
                                valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                valueAnimatorOfFloat2.start();
                            }
                        }
                        for (i3 = 0; i3 < actionBarPopupWindowLayout.getItemsCount(); i3++) {
                            childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i3);
                            if (childAt instanceof ActionBarMenuSubItem) {
                                actionBarMenuSubItem = (ActionBarMenuSubItem) childAt;
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (i3 == actionBarPopupWindowLayout.getItemsCount() - i2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (actionBarMenuSubItem.top == z || actionBarMenuSubItem.bottom != z2 || actionBarMenuSubItem.selectorRad != 12) {
                                    actionBarMenuSubItem.top = z;
                                    actionBarMenuSubItem.bottom = z2;
                                    actionBarMenuSubItem.selectorRad = 12;
                                    actionBarMenuSubItem.updateBackground();
                                }
                            }
                        }
                    }
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    if (contentPreviewViewer.delegate.needSend(contentPreviewViewer.currentContentType)) {
                        arrayList11.add(LocaleController.getString(R.string.SendEmojiPreview));
                        zzlo.m(R.drawable.msg_send, 0, arrayList13, arrayList12);
                    }
                    Boolean boolCanSetAsStatus = contentPreviewViewer.delegate.canSetAsStatus(contentPreviewViewer.currentDocument);
                    if (boolCanSetAsStatus != null) {
                        if (boolCanSetAsStatus.booleanValue()) {
                            arrayList11.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                            zzlo.m(R.drawable.msg_smile_status, 1, arrayList13, arrayList12);
                        } else {
                            arrayList11.add(LocaleController.getString(R.string.RemoveStatus));
                            zzlo.m(R.drawable.msg_smile_status, 2, arrayList13, arrayList12);
                        }
                    }
                    if (contentPreviewViewer.delegate.needCopy(contentPreviewViewer.currentDocument)) {
                        arrayList11.add(LocaleController.getString(R.string.CopyEmojiPreview));
                        zzlo.m(R.drawable.msg_copy, 3, arrayList13, arrayList12);
                    }
                    if (contentPreviewViewer.delegate.needRemoveFromRecent(contentPreviewViewer.currentDocument)) {
                        arrayList11.add(LocaleController.getString(R.string.RemoveFromRecent));
                        zzlo.m(R.drawable.msg_delete, 4, arrayList13, arrayList12);
                    }
                    boolean zIsStickerInFavorites2 = MediaDataController.getInstance(contentPreviewViewer.currentAccount).isStickerInFavorites(contentPreviewViewer.currentDocument);
                    if (!MessageObject.isAnimatedEmoji(contentPreviewViewer.currentDocument) && !MessageObject.isMaskDocument(contentPreviewViewer.currentDocument) && (zIsStickerInFavorites2 || (MediaDataController.getInstance(contentPreviewViewer.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(contentPreviewViewer.currentDocument)))) {
                        arrayList11.add(LocaleController.getString(zIsStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                        zzlo.m(zIsStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, 5, arrayList13, arrayList12);
                    }
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    contentPreviewViewer.menuVisible = true;
                    contentPreviewViewer.containerView.invalidate();
                    int[] iArr2 = new int[arrayList13.size()];
                    for (int i24 = 0; i24 < arrayList13.size(); i24++) {
                        iArr2[i24] = ((Integer) arrayList13.get(i24)).intValue();
                    }
                    ContentPreviewViewer$1$$ExternalSyntheticLambda5 contentPreviewViewer$1$$ExternalSyntheticLambda5 = new ContentPreviewViewer$1$$ExternalSyntheticLambda5(this, arrayList12, zIsStickerInFavorites2);
                    boolean zAddVoteOptions = contentPreviewViewer.addVoteOptions(actionBarPopupWindowLayout);
                    int i25 = 0;
                    while (i25 < arrayList11.size()) {
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(!zAddVoteOptions && i25 == 0, i25 == arrayList11.size() - 1, actionBarPopupWindowLayout, ((Integer) arrayList13.get(i25)).intValue(), (CharSequence) arrayList11.get(i25), false, contentPreviewViewer.resourcesProvider);
                        if (((Integer) arrayList12.get(i25)).intValue() == 4) {
                            actionBarMenuSubItemAddItem4.setIconColor(ContentPreviewViewer.access$1800(contentPreviewViewer, Theme.key_text_RedRegular));
                            actionBarMenuSubItemAddItem4.setTextColor(ContentPreviewViewer.access$1800(contentPreviewViewer, Theme.key_text_RedBold));
                        }
                        actionBarMenuSubItemAddItem4.setTag(Integer.valueOf(i25));
                        actionBarMenuSubItemAddItem4.setOnClickListener(contentPreviewViewer$1$$ExternalSyntheticLambda5);
                        i25++;
                    }
                    ActionBarPopupWindow actionBarPopupWindow5 = new ActionBarPopupWindow(actionBarPopupWindowLayout) {
                        @Override
                        public final void dismiss() {
                            dismiss(true);
                            ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                            contentPreviewViewer2.popupWindow = null;
                            contentPreviewViewer2.menuVisible = false;
                            if (contentPreviewViewer2.closeOnDismiss) {
                                contentPreviewViewer2.close();
                            }
                        }
                    };
                    contentPreviewViewer.popupWindow = actionBarPopupWindow5;
                    actionBarPopupWindow5.pauseNotifications = true;
                    actionBarPopupWindow5.dismissAnimationDuration = 150;
                    actionBarPopupWindow5.scaleOut = true;
                    actionBarPopupWindow5.setOutsideTouchable(true);
                    contentPreviewViewer.popupWindow.setClippingEnabled(true);
                    contentPreviewViewer.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    contentPreviewViewer.popupWindow.setFocusable(true);
                    actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    contentPreviewViewer.popupWindow.setInputMethodMode(2);
                    contentPreviewViewer.popupWindow.getContentView().setFocusableInTouchMode(true);
                    int i26 = contentPreviewViewer.lastInsets.bottom + contentPreviewViewer.lastInsets.top;
                    int i27 = contentPreviewViewer.lastInsets.top;
                    int iMin5 = (Math.min(contentPreviewViewer.containerView.getWidth(), contentPreviewViewer.containerView.getHeight() - i26) - AndroidUtilities.dp(40.0f)) / 2;
                    contentPreviewViewer.popupWindow.showAtLocation(contentPreviewViewer.containerView, 0, (int) ((contentPreviewViewer.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), (int) ((AndroidUtilities.dp(24.0f) - contentPreviewViewer.moveY) + ((int) (contentPreviewViewer.moveY + Math.max(i27 + iMin5 + (contentPreviewViewer.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((contentPreviewViewer.containerView.getHeight() - i26) - contentPreviewViewer.keyboardHeight) / 2) + iMin5))));
                    ActionBarPopupWindow.startAnimation(actionBarPopupWindowLayout);
                    try {
                        contentPreviewViewer.containerView.performHapticFeedback(0);
                    } catch (Exception unused7) {
                    }
                    if (contentPreviewViewer.moveY != 0.0f) {
                        contentPreviewViewer.startMoveY = contentPreviewViewer.moveY;
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ContentPreviewViewer.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i7) {
                                    case 0:
                                        ContentPreviewViewer.AnonymousClass1 anonymousClass5 = this.f$0;
                                        anonymousClass5.getClass();
                                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                                        contentPreviewViewer2.currentMoveYProgress = fFloatValue;
                                        float f2 = contentPreviewViewer2.startMoveY;
                                        contentPreviewViewer2.moveY = ((0.0f - f2) * fFloatValue) + f2;
                                        contentPreviewViewer2.containerView.invalidate();
                                        break;
                                    case 1:
                                        ContentPreviewViewer.AnonymousClass1 anonymousClass6 = this.f$0;
                                        anonymousClass6.getClass();
                                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                                        contentPreviewViewer3.currentMoveYProgress = fFloatValue2;
                                        float f3 = contentPreviewViewer3.startMoveY;
                                        contentPreviewViewer3.moveY = ((0.0f - f3) * fFloatValue2) + f3;
                                        contentPreviewViewer3.containerView.invalidate();
                                        break;
                                    default:
                                        ContentPreviewViewer.AnonymousClass1 anonymousClass7 = this.f$0;
                                        anonymousClass7.getClass();
                                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                                        contentPreviewViewer4.currentMoveYProgress = fFloatValue3;
                                        float f4 = contentPreviewViewer4.startMoveY;
                                        contentPreviewViewer4.moveY = ((0.0f - f4) * fFloatValue3) + f4;
                                        contentPreviewViewer4.containerView.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat3.setDuration(350L);
                        valueAnimatorOfFloat3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        valueAnimatorOfFloat3.start();
                    }
                }
            }
            while (i3 < actionBarPopupWindowLayout.getItemsCount()) {
                childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i3);
                if (childAt instanceof ActionBarMenuSubItem) {
                    actionBarMenuSubItem = (ActionBarMenuSubItem) childAt;
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i3 == actionBarPopupWindowLayout.getItemsCount() - i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionBarMenuSubItem.top == z) {
                        actionBarMenuSubItem.top = z;
                        actionBarMenuSubItem.bottom = z2;
                        actionBarMenuSubItem.selectorRad = 12;
                        actionBarMenuSubItem.updateBackground();
                    } else {
                        actionBarMenuSubItem.top = z;
                        actionBarMenuSubItem.bottom = z2;
                        actionBarMenuSubItem.selectorRad = 12;
                        actionBarMenuSubItem.updateBackground();
                    }
                }
            }
        }
    }

    public final class AnonymousClass2 extends ReactionsContainerLayout {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass2(Bulletin.LottieLayoutWithReactions lottieLayoutWithReactions, BaseFragment baseFragment, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(3, i, context, baseFragment, resourcesProvider);
            this.this$0 = lottieLayoutWithReactions;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Bulletin bulletin;
            switch (this.$r8$classId) {
                case 1:
                    int action = motionEvent.getAction();
                    Bulletin.LottieLayoutWithReactions lottieLayoutWithReactions = (Bulletin.LottieLayoutWithReactions) this.this$0;
                    if (action == 0) {
                        Bulletin bulletin2 = lottieLayoutWithReactions.bulletin;
                        if (bulletin2 != null) {
                            bulletin2.setCanHide(false);
                        }
                    } else if (motionEvent.getAction() == 1 && (bulletin = lottieLayoutWithReactions.bulletin) != null) {
                        bulletin.setCanHide(true);
                    }
                    break;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public void invalidateLoopViews() {
            switch (this.$r8$classId) {
                case 0:
                    super.invalidateLoopViews();
                    CustomEmojiReactionsWindow reactionsWindow = getReactionsWindow();
                    ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.this$0;
                    if (reactionsWindow != null) {
                        WindowManager.LayoutParams layoutParams = contentPreviewViewer.windowLayoutParams;
                        layoutParams.flags &= -131073;
                        layoutParams.softInputMode = 16;
                    } else {
                        contentPreviewViewer.windowLayoutParams.flags |= 131072;
                    }
                    try {
                        ((WindowManager) contentPreviewViewer.parentActivity.getSystemService("window")).updateViewLayout(contentPreviewViewer.windowView, contentPreviewViewer.windowLayoutParams);
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                    break;
                default:
                    super.invalidateLoopViews();
                    break;
            }
        }

        @Override
        public void onShownCustomEmojiReactionDialog() {
            switch (this.$r8$classId) {
                case 1:
                    Bulletin bulletin = Bulletin.visibleBulletin;
                    if (bulletin != null) {
                        bulletin.setCanHide(false);
                    }
                    ((Bulletin.LottieLayoutWithReactions) this.this$0).reactionsContainerLayout.getReactionsWindow().windowView.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 8));
                    break;
            }
        }

        public AnonymousClass2(ContentPreviewViewer contentPreviewViewer, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(4, i, context, null, resourcesProvider);
            this.this$0 = contentPreviewViewer;
        }
    }

    public interface ContentPreviewViewerDelegate {
        void addCaptionToGif(TLObject tLObject, Object obj);

        void addToFavoriteSelected(String str);

        boolean can();

        boolean canAddCaption();

        boolean canDeleteSticker();

        boolean canEditSticker();

        boolean canSchedule();

        boolean canSendSticker();

        Boolean canSetAsStatus(TLRPC.Document document);

        void copyEmoji(TLRPC.Document document);

        void deleteSticker(TLRPC.Document document);

        void editSticker(TLRPC.Document document);

        ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1);

        long getDialogId();

        TLRPC.TL_messageMediaPoll getPoll();

        TLRPC.PollAnswer getPollAnswer();

        MessageObject getPollMessageObject();

        String getQuery(boolean z);

        void gifAddedOrDeleted();

        boolean isInScheduleMode();

        boolean isPhotoEditor();

        boolean isReplacedSticker();

        boolean isSettingIntroSticker();

        boolean isStickerEditor();

        boolean needCopy(TLRPC.Document document);

        boolean needOpen();

        boolean needRemove();

        boolean needRemoveFromRecent(TLRPC.Document document);

        boolean needSend(int i);

        void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13);

        void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z);

        void remove(SendMessagesHelper.ImportingSticker importingSticker);

        void removeFromRecent(TLRPC.Document document);

        void resetTouch();

        void retractVote();

        void sendEmoji(TLRPC.Document document);

        void sendGif(int i, int i2, Object obj, TLObject tLObject, boolean z);

        void sendSticker(String str);

        void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2);

        void sendVote();

        void setAsEmojiStatus(TLRPC.Document document);

        void setIntroSticker(String str);

        void stickerSetSelected(TLRPC.StickerSet stickerSet, String str);
    }

    public final class StickerPackNameView extends LinearLayout {
        public TLRPC.StickerSetCovered cover;
        public final BackupImageView imageView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final SimpleTextView textView;

        public StickerPackNameView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setTextColor(-1);
            setOrientation(0);
            addView(backupImageView, LayoutHelper.createLinear(24, 24, 17, 17, 0, 17, 0));
            addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 12, 0));
        }
    }

    public ContentPreviewViewer() {
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.scrimBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        this.scrimBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.backgroundDrawable = new ColorDrawable(1895825408);
        this.centerImage = new ImageReceiver();
        this.effectImage = new ImageReceiver();
        this.isVisible = false;
        this.keyboardHeight = AndroidUtilities.dp(200.0f);
        this.paint = new Paint(1);
        this.showSheetRunnable = new AnonymousClass1();
    }

    public static int access$1800(ContentPreviewViewer contentPreviewViewer, int i) {
        return Theme.getColor(i, contentPreviewViewer.resourcesProvider);
    }

    public static ContentPreviewViewer getInstance() {
        ContentPreviewViewer contentPreviewViewer;
        ContentPreviewViewer contentPreviewViewer2 = Instance;
        if (contentPreviewViewer2 != null) {
            return contentPreviewViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                contentPreviewViewer = Instance;
                if (contentPreviewViewer == null) {
                    contentPreviewViewer = new ContentPreviewViewer();
                    Instance = contentPreviewViewer;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return contentPreviewViewer;
    }

    public final boolean addVoteOptions(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        float f;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll poll = contentPreviewViewerDelegate.getPoll();
        TLRPC.PollAnswer pollAnswer = this.delegate.getPollAnswer();
        if (poll == null || poll.poll == null || pollAnswer == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(poll, pollAnswer.option);
        boolean z = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(poll);
        boolean z2 = (MessageObject.isVoted(poll) || poll.poll.closed || this.delegate.isInScheduleMode()) ? false : true;
        boolean z3 = !z2 && MessageObject.canUnvote(poll);
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
        if (z) {
            RecentVotersCell recentVotersCell = new RecentVotersCell(actionBarPopupWindowLayout.getContext(), this.currentAccount, this.resourcesProvider);
            ItemOptions itemOptions = new ItemOptions(actionBarPopupWindowLayout, this.resourcesProvider);
            ViewGroup viewGroup = itemOptions.linearLayout;
            int iAddViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(viewGroup);
            int i = Theme.key_actionBarDefaultSubmenuItem;
            itemOptions.setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(i, this.resourcesProvider)));
            BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilderScrimMenuBackground = BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider);
            if (viewGroup != null) {
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.scrimBlur3Factory.create(viewGroup, null, true);
                blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilderScrimMenuBackground);
                viewGroup.setBackground(blurredBackgroundDrawableCreate);
            }
            itemOptions.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ContentPreviewViewer$$ExternalSyntheticLambda5(actionBarPopupWindowLayout, 0), false);
            itemOptions.addGap();
            MessageObject pollMessageObject = this.delegate.getPollMessageObject();
            Activity activity = this.parentActivity;
            if ((activity instanceof LaunchActivity) && pollMessageObject != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                BaseFragment lastFragment = (launchActivity.getActionBarLayout() == null || ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment() == null) ? null : ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment();
                if (lastFragment != null) {
                    itemOptions.addView(recentVotersCell.createListView(lastFragment, pollMessageObject.getDialogId(), pollMessageObject.getId(), pollAnswer.option, pollResult.voters, new OAuthSheet$$ExternalSyntheticLambda13(5, this, lastFragment)));
                }
            }
            r16.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            r16.avatarsListDrawable.set(pollResult.recent_voters, false);
            r16.setLayoutParams(LayoutHelper.createLinear(-1, 48));
            r16.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), 12, 0));
            r16.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(actionBarPopupWindowLayout, iAddViewToSwipeBack, 14));
            anonymousClass2.addView(recentVotersCell);
            ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(actionBarPopupWindowLayout.getContext(), Theme.key_actionBarDefaultSubmenuSeparator, this.resourcesProvider);
            gapView.setTag(R.id.fit_width_tag, 1);
            gapView.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, this.resourcesProvider)));
            gapView.setLayoutParams(LayoutHelper.createLinear(-1, 8));
            anonymousClass2.addView(gapView);
        }
        if (z2) {
            f = 0.06f;
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, this.resourcesProvider).setOnClickListener(new ContentPreviewViewer$$ExternalSyntheticLambda3(this, 2));
        } else {
            f = 0.06f;
        }
        if (z3) {
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, this.resourcesProvider).setOnClickListener(new ContentPreviewViewer$$ExternalSyntheticLambda3(this, 3));
        }
        if (!z && (z2 || z3)) {
            ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(actionBarPopupWindowLayout.getContext(), Theme.key_actionBarDefaultSubmenuSeparator, this.resourcesProvider);
            gapView2.setTag(R.id.fit_width_tag, 1);
            gapView2.setColor(Theme.multAlpha(f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
            gapView2.setLayoutParams(LayoutHelper.createLinear(-1, 8));
            anonymousClass2.addView(gapView2);
        }
        return z || z2 || z3;
    }

    public final void close() {
        int i = 0;
        if (this.parentActivity == null || this.menuVisible) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        this.showProgress = 1.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        this.containerView.invalidate();
        this.currentDocument = null;
        this.currentStickerSet = null;
        this.currentQuery = null;
        this.delegate = null;
        this.isVisible = false;
        AndroidUtilities.runOnUIThread(new ContentPreviewViewer$$ExternalSyntheticLambda0(this, i), 200L);
        UnlockPremiumView unlockPremiumView = this.unlockPremiumView;
        if (unlockPremiumView != null) {
            unlockPremiumView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
        FrameLayout frameLayout = this.reactionsLayoutContainer;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    public final void closeWithMenu() {
        CustomEmojiReactionsWindow reactionsWindow;
        AnonymousClass2 anonymousClass2 = this.reactionsLayout;
        if (anonymousClass2 != null && (reactionsWindow = anonymousClass2.getReactionsWindow()) != null && !reactionsWindow.dismissed) {
            reactionsWindow.dismiss();
            return;
        }
        this.menuVisible = false;
        dismissPopupWindow();
        close();
    }

    public final void dismissPopupWindow() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.popupWindow = null;
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            OKLCH.m(actionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
            this.popupLayout = null;
            this.menuVisible = false;
            if (this.closeOnDismiss) {
                close();
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent, RecyclerListView recyclerListView, ContentPreviewViewerDelegate contentPreviewViewerDelegate, Theme.ResourcesProvider resourcesProvider) {
        int i;
        this.delegate = contentPreviewViewerDelegate;
        if (contentPreviewViewerDelegate != null) {
            this.isPhotoEditor = contentPreviewViewerDelegate.isPhotoEditor();
            this.isStickerEditor = this.delegate.isStickerEditor();
        }
        ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = this.delegate;
        if ((contentPreviewViewerDelegate2 == null || contentPreviewViewerDelegate2.can()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = recyclerListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerListView.getChildAt(i2);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y && bottom >= y && left <= x && right >= x) {
                    boolean z = childAt instanceof StickerEmojiCell;
                    ImageReceiver imageReceiver = this.centerImage;
                    if (z) {
                        if (((StickerEmojiCell) childAt).imageView.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i = 0;
                        } else {
                            i = -1;
                        }
                    } else if (!(childAt instanceof StickerCell)) {
                        i = 2;
                        if (childAt instanceof ContextLinkCell) {
                            ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                            if (contextLinkCell.linkImageView.getBitmap() == null) {
                                i = -1;
                            } else {
                                int i3 = contextLinkCell.documentAttachType;
                                if (i3 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i = 0;
                                } else if (i3 == 2 && contextLinkCell.canPreviewGif) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i = 1;
                                } else {
                                    i = -1;
                                }
                            }
                        } else if (childAt instanceof EmojiPacksAlert.EmojiImageView) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof EmojiView.ImageViewEmoji) && ((EmojiView.ImageViewEmoji) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof SuggestEmojiView.EmojiImageView) && (((SuggestEmojiView.EmojiImageView) childAt).drawable instanceof AnimatedEmojiDrawable)) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            i = -1;
                        }
                    } else if (((StickerCell) childAt).imageView.getImageReceiver().getBitmap() != null) {
                        imageReceiver.setRoundRadius(0);
                        i = 0;
                    } else {
                        i = -1;
                    }
                    if (i == -1) {
                        break;
                    }
                    this.startX = x;
                    this.startY = y;
                    this.currentPreviewCell = childAt;
                    OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2 = new OAuthSheet$$ExternalSyntheticLambda2(this, recyclerListView, i, resourcesProvider, 2);
                    this.openPreviewRunnable = oAuthSheet$$ExternalSyntheticLambda2;
                    AndroidUtilities.runOnUIThread(oAuthSheet$$ExternalSyntheticLambda2, 200L);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onTouch(MotionEvent motionEvent, RecyclerListView recyclerListView, Object obj, ContentPreviewViewerDelegate contentPreviewViewerDelegate, Theme.ResourcesProvider resourcesProvider) {
        int i;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate2;
        View view;
        View view2;
        int i2;
        Drawable drawable;
        TLRPC.Document document;
        AnimatedEmojiSpan span;
        TLRPC.Document document2;
        TLRPC.Document documentFindDocument;
        TLRPC.Document document3;
        ContextLinkCell contextLinkCell;
        Object parentObject;
        this.delegate = contentPreviewViewerDelegate;
        if (contentPreviewViewerDelegate != null) {
            this.isPhotoEditor = contentPreviewViewerDelegate.isPhotoEditor();
            this.isStickerEditor = this.delegate.isStickerEditor();
        }
        ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = this.delegate;
        if ((contentPreviewViewerDelegate3 == null || contentPreviewViewerDelegate3.can()) && (this.openPreviewRunnable != null || this.isVisible)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(13, recyclerListView, obj), 150L);
                OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2 = this.openPreviewRunnable;
                if (oAuthSheet$$ExternalSyntheticLambda2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(oAuthSheet$$ExternalSyntheticLambda2);
                    this.openPreviewRunnable = null;
                    return false;
                }
                if (this.isVisible) {
                    close();
                    View view3 = this.currentPreviewCell;
                    if (view3 != null) {
                        if (view3 instanceof StickerEmojiCell) {
                            ((StickerEmojiCell) view3).setScaled(false);
                        } else if (view3 instanceof StickerCell) {
                            ((StickerCell) view3).setScaled(false);
                        } else if (view3 instanceof ContextLinkCell) {
                            ((ContextLinkCell) view3).setScaled(false);
                        }
                        this.currentPreviewCell = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.isVisible) {
                    if (motionEvent.getAction() == 2) {
                        if (this.currentContentType != 1 || this.isPhotoEditor) {
                            int x = (int) motionEvent.getX();
                            int y = (int) motionEvent.getY();
                            int childCount = recyclerListView.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt = recyclerListView.getChildAt(i3);
                                if (childAt != null) {
                                    int top = childAt.getTop();
                                    int bottom = childAt.getBottom();
                                    int left = childAt.getLeft();
                                    int right = childAt.getRight();
                                    if (top <= y && bottom >= y && left <= x && right >= x) {
                                        boolean z = childAt instanceof StickerEmojiCell;
                                        ImageReceiver imageReceiver = this.centerImage;
                                        if (!z && !(childAt instanceof StickerCell)) {
                                            if (childAt instanceof ContextLinkCell) {
                                                ContextLinkCell contextLinkCell2 = (ContextLinkCell) childAt;
                                                int i4 = contextLinkCell2.documentAttachType;
                                                if (i4 == 6) {
                                                    imageReceiver.setRoundRadius(0);
                                                } else if (i4 == 2 && contextLinkCell2.canPreviewGif) {
                                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                                    i = 1;
                                                } else {
                                                    i = -1;
                                                }
                                            } else {
                                                if (childAt instanceof EmojiPacksAlert.EmojiImageView) {
                                                    imageReceiver.setRoundRadius(0);
                                                } else if (!(childAt instanceof EmojiView.ImageViewEmoji) || ((EmojiView.ImageViewEmoji) childAt).getSpan() == null) {
                                                    i = -1;
                                                } else {
                                                    imageReceiver.setRoundRadius(0);
                                                }
                                                i = 2;
                                            }
                                            if (i == -1 && childAt != this.currentPreviewCell) {
                                                contentPreviewViewerDelegate2 = this.delegate;
                                                if (contentPreviewViewerDelegate2 != null) {
                                                    contentPreviewViewerDelegate2.resetTouch();
                                                }
                                                view = this.currentPreviewCell;
                                                if (view instanceof StickerEmojiCell) {
                                                    ((StickerEmojiCell) view).setScaled(false);
                                                } else if (view instanceof StickerCell) {
                                                    ((StickerCell) view).setScaled(false);
                                                } else if (view instanceof ContextLinkCell) {
                                                    ((ContextLinkCell) view).setScaled(false);
                                                }
                                                this.currentPreviewCell = childAt;
                                                this.clearsInputField = false;
                                                this.menuVisible = false;
                                                this.closeOnDismiss = false;
                                                dismissPopupWindow();
                                                AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false);
                                                view2 = this.currentPreviewCell;
                                                if (view2 instanceof StickerEmojiCell) {
                                                    StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view2;
                                                    int i5 = i;
                                                    TLRPC.Document sticker = stickerEmojiCell.getSticker();
                                                    SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
                                                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
                                                    ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = this.delegate;
                                                    open(sticker, stickerPath, strFindAnimatedEmojiEmoticon, contentPreviewViewerDelegate4 != null ? contentPreviewViewerDelegate4.getQuery(false) : null, null, i5, stickerEmojiCell.recent, stickerEmojiCell.getParentObject(), resourcesProvider, 0);
                                                    stickerEmojiCell.setScaled(true);
                                                } else {
                                                    i2 = i;
                                                    if (view2 instanceof StickerCell) {
                                                        StickerCell stickerCell = (StickerCell) view2;
                                                        TLRPC.Document sticker2 = stickerCell.getSticker();
                                                        String strFindAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(stickerCell.getSticker(), null, Integer.valueOf(this.currentAccount));
                                                        ContentPreviewViewerDelegate contentPreviewViewerDelegate5 = this.delegate;
                                                        open(sticker2, null, strFindAnimatedEmojiEmoticon2, contentPreviewViewerDelegate5 != null ? contentPreviewViewerDelegate5.getQuery(false) : null, null, i2, false, stickerCell.getParentObject(), resourcesProvider, 0);
                                                        stickerCell.setScaled(true);
                                                        this.clearsInputField = stickerCell.clearsInputField;
                                                    } else if (view2 instanceof ContextLinkCell) {
                                                        contextLinkCell = (ContextLinkCell) view2;
                                                        TLRPC.Document document4 = contextLinkCell.getDocument();
                                                        ContentPreviewViewerDelegate contentPreviewViewerDelegate6 = this.delegate;
                                                        String query = contentPreviewViewerDelegate6 != null ? contentPreviewViewerDelegate6.getQuery(true) : null;
                                                        TLRPC.BotInlineResult botInlineResult = contextLinkCell.getBotInlineResult();
                                                        if (contextLinkCell.getBotInlineResult() != null) {
                                                            parentObject = contextLinkCell.getInlineBot();
                                                        } else {
                                                            parentObject = contextLinkCell.getParentObject();
                                                        }
                                                        open(document4, null, null, query, botInlineResult, i2, false, parentObject, resourcesProvider, 0);
                                                        if (i2 == 1 || this.isPhotoEditor) {
                                                            contextLinkCell.setScaled(true);
                                                        }
                                                    } else if (view2 instanceof EmojiPacksAlert.EmojiImageView) {
                                                        document3 = ((EmojiPacksAlert.EmojiImageView) view2).getDocument();
                                                        if (document3 != null) {
                                                            open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider, 0);
                                                        }
                                                    } else if (view2 instanceof EmojiView.ImageViewEmoji) {
                                                        span = ((EmojiView.ImageViewEmoji) view2).getSpan();
                                                        if (span != null) {
                                                            documentFindDocument = span.document;
                                                            if (documentFindDocument == null) {
                                                                documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, span.getDocumentId());
                                                            }
                                                            document2 = documentFindDocument;
                                                        } else {
                                                            document2 = null;
                                                        }
                                                        if (document2 != null) {
                                                            open(document2, null, MessageObject.findAnimatedEmojiEmoticon(document2, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider, 0);
                                                        }
                                                    } else if (view2 instanceof SuggestEmojiView.EmojiImageView) {
                                                        drawable = ((SuggestEmojiView.EmojiImageView) view2).drawable;
                                                        if (drawable instanceof AnimatedEmojiDrawable) {
                                                            document = ((AnimatedEmojiDrawable) drawable).document;
                                                        } else {
                                                            document = null;
                                                        }
                                                        if (document != null) {
                                                            open(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider, 0);
                                                        }
                                                    }
                                                }
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    break;
                                                }
                                                Vibrator vibrator = (Vibrator) this.containerView.getContext().getSystemService("vibrator");
                                                if (this.vibrationEffect == null) {
                                                    this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                                }
                                                vibrator.cancel();
                                                vibrator.vibrate(this.vibrationEffect);
                                                return true;
                                            }
                                            break;
                                            break;
                                        }
                                        imageReceiver.setRoundRadius(0);
                                        i = 0;
                                        if (i == -1) {
                                            break;
                                        }
                                        contentPreviewViewerDelegate2 = this.delegate;
                                        if (contentPreviewViewerDelegate2 != null) {
                                            contentPreviewViewerDelegate2.resetTouch();
                                        }
                                        view = this.currentPreviewCell;
                                        if (view instanceof StickerEmojiCell) {
                                            ((StickerEmojiCell) view).setScaled(false);
                                        } else if (view instanceof StickerCell) {
                                            ((StickerCell) view).setScaled(false);
                                        } else if (view instanceof ContextLinkCell) {
                                            ((ContextLinkCell) view).setScaled(false);
                                        }
                                        this.currentPreviewCell = childAt;
                                        this.clearsInputField = false;
                                        this.menuVisible = false;
                                        this.closeOnDismiss = false;
                                        dismissPopupWindow();
                                        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false);
                                        view2 = this.currentPreviewCell;
                                        if (view2 instanceof StickerEmojiCell) {
                                            StickerEmojiCell stickerEmojiCell2 = (StickerEmojiCell) view2;
                                            int i6 = i;
                                            TLRPC.Document sticker3 = stickerEmojiCell2.getSticker();
                                            SendMessagesHelper.ImportingSticker stickerPath2 = stickerEmojiCell2.getStickerPath();
                                            String strFindAnimatedEmojiEmoticon3 = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell2.getSticker(), null, Integer.valueOf(this.currentAccount));
                                            ContentPreviewViewerDelegate contentPreviewViewerDelegate7 = this.delegate;
                                            open(sticker3, stickerPath2, strFindAnimatedEmojiEmoticon3, contentPreviewViewerDelegate7 != null ? contentPreviewViewerDelegate7.getQuery(false) : null, null, i6, stickerEmojiCell2.recent, stickerEmojiCell2.getParentObject(), resourcesProvider, 0);
                                            stickerEmojiCell2.setScaled(true);
                                        } else {
                                            i2 = i;
                                            if (view2 instanceof StickerCell) {
                                                StickerCell stickerCell2 = (StickerCell) view2;
                                                TLRPC.Document sticker4 = stickerCell2.getSticker();
                                                String strFindAnimatedEmojiEmoticon4 = MessageObject.findAnimatedEmojiEmoticon(stickerCell2.getSticker(), null, Integer.valueOf(this.currentAccount));
                                                ContentPreviewViewerDelegate contentPreviewViewerDelegate8 = this.delegate;
                                                open(sticker4, null, strFindAnimatedEmojiEmoticon4, contentPreviewViewerDelegate8 != null ? contentPreviewViewerDelegate8.getQuery(false) : null, null, i2, false, stickerCell2.getParentObject(), resourcesProvider, 0);
                                                stickerCell2.setScaled(true);
                                                this.clearsInputField = stickerCell2.clearsInputField;
                                            } else if (view2 instanceof ContextLinkCell) {
                                                contextLinkCell = (ContextLinkCell) view2;
                                                TLRPC.Document document5 = contextLinkCell.getDocument();
                                                ContentPreviewViewerDelegate contentPreviewViewerDelegate9 = this.delegate;
                                                if (contentPreviewViewerDelegate9 != null) {
                                                }
                                                TLRPC.BotInlineResult botInlineResult2 = contextLinkCell.getBotInlineResult();
                                                if (contextLinkCell.getBotInlineResult() != null) {
                                                    parentObject = contextLinkCell.getInlineBot();
                                                } else {
                                                    parentObject = contextLinkCell.getParentObject();
                                                }
                                                open(document5, null, null, query, botInlineResult2, i2, false, parentObject, resourcesProvider, 0);
                                                if (i2 == 1) {
                                                    contextLinkCell.setScaled(true);
                                                } else {
                                                    contextLinkCell.setScaled(true);
                                                }
                                            } else if (view2 instanceof EmojiPacksAlert.EmojiImageView) {
                                                document3 = ((EmojiPacksAlert.EmojiImageView) view2).getDocument();
                                                if (document3 != null) {
                                                    open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider, 0);
                                                }
                                            } else if (view2 instanceof EmojiView.ImageViewEmoji) {
                                                span = ((EmojiView.ImageViewEmoji) view2).getSpan();
                                                if (span != null) {
                                                    documentFindDocument = span.document;
                                                    if (documentFindDocument == null) {
                                                        documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, span.getDocumentId());
                                                    }
                                                    document2 = documentFindDocument;
                                                } else {
                                                    document2 = null;
                                                }
                                                if (document2 != null) {
                                                    open(document2, null, MessageObject.findAnimatedEmojiEmoticon(document2, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider, 0);
                                                }
                                            } else if (view2 instanceof SuggestEmojiView.EmojiImageView) {
                                                drawable = ((SuggestEmojiView.EmojiImageView) view2).drawable;
                                                if (drawable instanceof AnimatedEmojiDrawable) {
                                                    document = ((AnimatedEmojiDrawable) drawable).document;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    open(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider, 0);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            break;
                                        }
                                        Vibrator vibrator2 = (Vibrator) this.containerView.getContext().getSystemService("vibrator");
                                        if (this.vibrationEffect == null) {
                                            this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                        }
                                        vibrator2.cancel();
                                        vibrator2.vibrate(this.vibrationEffect);
                                        return true;
                                    }
                                }
                            }
                        } else if (!this.menuVisible) {
                            if (this.showProgress == 1.0f) {
                                if (this.lastTouchY == -10000.0f) {
                                    this.lastTouchY = motionEvent.getY();
                                    this.currentMoveY = 0.0f;
                                    this.moveY = 0.0f;
                                    return true;
                                }
                                float y2 = motionEvent.getY();
                                float f = (y2 - this.lastTouchY) + this.currentMoveY;
                                this.currentMoveY = f;
                                this.lastTouchY = y2;
                                if (f > 0.0f) {
                                    this.currentMoveY = 0.0f;
                                } else if (f < (-AndroidUtilities.dp(60.0f))) {
                                    this.currentMoveY = -AndroidUtilities.dp(60.0f);
                                }
                                float f2 = this.currentMoveY;
                                float fDp = AndroidUtilities.dp(200.0f);
                                this.moveY = (-((1.0f - (1.0f / (((Math.abs(f2) * 0.55f) / fDp) + 1.0f))) * fDp)) * (f2 >= 0.0f ? -1.0f : 1.0f);
                                this.containerView.invalidate();
                                if (this.currentMoveY <= (-AndroidUtilities.dp(55.0f))) {
                                    AnonymousClass1 anonymousClass1 = this.showSheetRunnable;
                                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                                    anonymousClass1.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.openPreviewRunnable != null) {
                    if (motionEvent.getAction() != 2) {
                        AndroidUtilities.cancelRunOnUIThread(this.openPreviewRunnable);
                        this.openPreviewRunnable = null;
                        return false;
                    }
                    if (Math.hypot(this.startX - motionEvent.getX(), this.startY - motionEvent.getY()) > AndroidUtilities.dp(10.0f)) {
                        AndroidUtilities.cancelRunOnUIThread(this.openPreviewRunnable);
                        this.openPreviewRunnable = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void open(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider, int i2) {
        boolean z2;
        TLRPC.InputStickerSet inputStickerSet;
        boolean z3;
        ?? r12;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        this.isRecentSticker = z;
        this.stickerEmojiLayout = null;
        this.backgroundDrawable.setColor(AndroidUtilities.isDarkColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)) ? 1895825408 : 1692853990);
        this.drawEffect = false;
        ImageReceiver imageReceiver = this.centerImage;
        imageReceiver.setColorFilter(null);
        ImageReceiver imageReceiver2 = this.effectImage;
        AnonymousClass1 anonymousClass1 = this.showSheetRunnable;
        if (i == 0 || i == 2 || i == 3) {
            if (document == null && importingSticker == null) {
                return;
            }
            if (textPaint == null) {
                TextPaint textPaint2 = new TextPaint(1);
                textPaint = textPaint2;
                textPaint2.setTextSize(AndroidUtilities.dp(24.0f));
            }
            imageReceiver2.clearImage();
            this.drawEffect = false;
            if (document == null) {
                imageReceiver2 = imageReceiver2;
                if (importingSticker != null) {
                    imageReceiver.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                    if (importingSticker.videoEditedInfo != null) {
                        if (this.paintingOverlay == null) {
                            PaintingOverlay paintingOverlay = new PaintingOverlay(this.containerView.getContext());
                            this.paintingOverlay = paintingOverlay;
                            this.containerView.addView(paintingOverlay, new FrameLayout.LayoutParams(512, 512));
                        }
                        z2 = false;
                        this.paintingOverlay.setEntities(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                    } else {
                        imageReceiver = imageReceiver;
                        z2 = false;
                    }
                    if (str != null) {
                        this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), z2), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.delegate.getClass();
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    AndroidUtilities.runOnUIThread(anonymousClass1, i2 > 0 ? i2 : 1300L);
                }
                if (imageReceiver.getLottieAnimation() != null) {
                    z3 = true;
                    r12 = 0;
                    imageReceiver.getLottieAnimation().setCurrentFrame(0, true, false);
                } else {
                    z3 = true;
                    r12 = 0;
                }
                if (this.drawEffect && imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().setCurrentFrame(r12, z3, r12);
                }
                this.currentContentType = i;
                this.currentDocument = document;
                this.importingSticker = importingSticker;
                this.currentQuery = str2;
                this.inlineResult = botInlineResult;
                this.parentObject = obj;
                this.resourcesProvider = resourcesProvider;
                this.containerView.invalidate();
                if (this.isVisible) {
                }
                AndroidUtilities.lockOrientation(this.parentActivity);
                try {
                    if (this.windowView.getParent() != null) {
                        ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
                this.isVisible = true;
                this.showProgress = 0.0f;
                this.lastTouchY = -10000.0f;
                this.currentMoveYProgress = 0.0f;
                this.currentMoveY = 0.0f;
                this.moveY = 0.0f;
                this.lastUpdateTime = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
            int i3 = 0;
            while (true) {
                if (i3 >= document.attributes.size()) {
                    inputStickerSet = null;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                int i4 = i3;
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                } else {
                    i3 = i4 + 1;
                }
            }
            if (str != null) {
                this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), false), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            if (inputStickerSet != null || i == 2) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                AndroidUtilities.runOnUIThread(anonymousClass1, i2 > 0 ? i2 : 1300L);
            }
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(inputStickerSet, true);
            this.currentStickerSet = (stickerSet == null || !stickerSet.documents.isEmpty()) ? inputStickerSet : null;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (MessageObject.isVideoStickerDocument(document)) {
                imageReceiver = imageReceiver;
                imageReceiver.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.currentStickerSet, 1);
            } else {
                imageReceiver.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.currentStickerSet, 1);
                if (MessageObject.isPremiumSticker(document)) {
                    imageReceiver = imageReceiver;
                    this.drawEffect = true;
                    imageReceiver2.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.currentStickerSet, 1);
                }
            }
            imageReceiver = imageReceiver;
            if (MessageObject.isTextColorEmoji(document)) {
                imageReceiver.setColorFilter(resourcesProvider != null ? resourcesProvider.getAnimatedEmojiColorFilter() : Theme.chat_animatedEmojiTextColorFilter);
            }
            if (this.stickerEmojiLayout == null) {
                for (int i5 = 0; i5 < document.attributes.size(); i5++) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i5);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                        this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, textPaint.getFontMetricsInt(), false), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        break;
                    }
                }
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    imageReceiver.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            AndroidUtilities.runOnUIThread(anonymousClass1, 2000L);
            imageReceiver2 = imageReceiver2;
        }
        imageReceiver = imageReceiver;
        if (imageReceiver.getLottieAnimation() != null) {
            z3 = true;
            r12 = 0;
            imageReceiver.getLottieAnimation().setCurrentFrame(0, true, false);
        } else {
            z3 = true;
            r12 = 0;
        }
        if (this.drawEffect) {
            imageReceiver2.getLottieAnimation().setCurrentFrame(r12, z3, r12);
        }
        this.currentContentType = i;
        this.currentDocument = document;
        this.importingSticker = importingSticker;
        this.currentQuery = str2;
        this.inlineResult = botInlineResult;
        this.parentObject = obj;
        this.resourcesProvider = resourcesProvider;
        this.containerView.invalidate();
        if (this.isVisible) {
            AndroidUtilities.lockOrientation(this.parentActivity);
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
            ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
            this.isVisible = true;
            this.showProgress = 0.0f;
            this.lastTouchY = -10000.0f;
            this.currentMoveYProgress = 0.0f;
            this.currentMoveY = 0.0f;
            this.moveY = 0.0f;
            this.lastUpdateTime = System.currentTimeMillis();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
        }
    }

    public final void reset() {
        OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2 = this.openPreviewRunnable;
        if (oAuthSheet$$ExternalSyntheticLambda2 != null) {
            AndroidUtilities.cancelRunOnUIThread(oAuthSheet$$ExternalSyntheticLambda2);
            this.openPreviewRunnable = null;
        }
        View view = this.currentPreviewCell;
        if (view != null) {
            if (view instanceof StickerEmojiCell) {
                ((StickerEmojiCell) view).setScaled(false);
            } else if (view instanceof StickerCell) {
                ((StickerCell) view).setScaled(false);
            } else if (view instanceof ContextLinkCell) {
                ((ContextLinkCell) view).setScaled(false);
            }
            this.currentPreviewCell = null;
        }
    }

    public final void setParentActivity(Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        ImageReceiver imageReceiver = this.centerImage;
        imageReceiver.setCurrentAccount(i);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        ImageReceiver imageReceiver2 = this.effectImage;
        imageReceiver2.setCurrentAccount(this.currentAccount);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.parentActivity == activity) {
            return;
        }
        this.parentActivity = activity;
        this.slideUpDrawable = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.windowView = new LoginActivity.AnonymousClass4(this, activity, 2);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.windowView);
        LoginActivity.AnonymousClass4 anonymousClass4 = this.windowView;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.scrimBlur3Factory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = anonymousClass4;
        blurredBackgroundDrawableViewFactory.linkedViews = new ReferenceList(true);
        this.windowView.setFocusable(true);
        this.windowView.setFocusableInTouchMode(true);
        this.windowView.setSystemUiVisibility(1792);
        LoginActivity.AnonymousClass4 anonymousClass5 = this.windowView;
        ContentPreviewViewer$$ExternalSyntheticLambda1 contentPreviewViewer$$ExternalSyntheticLambda1 = new ContentPreviewViewer$$ExternalSyntheticLambda1(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass5, contentPreviewViewer$$ExternalSyntheticLambda1);
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, activity);
        this.containerView = anonymousClass1;
        anonymousClass1.setFocusable(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        this.containerView.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 9));
        MessagesController.getInstance(this.currentAccount);
        this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.containerView);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.containerView);
    }

    public final void setStickerSetForCustomSticker() {
        this.stickerSetForCustomSticker = null;
    }

    public final boolean showMenuFor(View view) {
        if (!(view instanceof StickerEmojiCell)) {
            return false;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(view.getContext());
        if (activityFindActivity == null) {
            return true;
        }
        setParentActivity(activityFindActivity);
        StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
        View view2 = this.currentPreviewCell;
        if (view2 instanceof StickerEmojiCell) {
            ((StickerEmojiCell) view2).setScaled(false);
        } else if (view2 instanceof StickerCell) {
            ((StickerCell) view2).setScaled(false);
        } else if (view2 instanceof ContextLinkCell) {
            ((ContextLinkCell) view2).setScaled(false);
        }
        this.currentPreviewCell = stickerEmojiCell;
        TLRPC.Document sticker = stickerEmojiCell.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        open(sticker, stickerPath, strFindAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, 0, stickerEmojiCell.recent, stickerEmojiCell.getParentObject(), this.resourcesProvider, 0);
        AnonymousClass1 anonymousClass1 = this.showSheetRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        AndroidUtilities.runOnUIThread(anonymousClass1, 16L);
        stickerEmojiCell.setScaled(true);
        return true;
    }
}

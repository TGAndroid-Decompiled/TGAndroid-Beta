package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public class ContentPreviewViewer {
    private static volatile ContentPreviewViewer Instance;
    private static TextPaint textPaint;
    private ColorDrawable backgroundDrawable;
    private float blurProgress;
    private Bitmap blurrBitmap;
    public ImageReceiver centerImage;
    private boolean clearsInputField;
    private boolean closeOnDismiss;
    private FrameLayoutDrawer containerView;
    private int currentAccount;
    private int currentContentType;
    private TLRPC.Document currentDocument;
    private float currentMoveY;
    private float currentMoveYProgress;
    private View currentPreviewCell;
    private String currentQuery;
    private TLRPC.InputStickerSet currentStickerSet;
    private ContentPreviewViewerDelegate delegate;
    private boolean drawEffect;
    private ImageReceiver effectImage;
    private float finalMoveY;
    private SendMessagesHelper.ImportingSticker importingSticker;
    private TLRPC.BotInlineResult inlineResult;
    private boolean isPhotoEditor;
    private boolean isRecentSticker;
    private boolean isStickerEditor;
    private boolean isVisible;
    private int keyboardHeight;
    private WindowInsetsCompat lastInsets;
    private float lastTouchY;
    private long lastUpdateTime;
    private boolean menuVisible;
    private float moveY = 0.0f;
    private Runnable openPreviewRunnable;
    private final Paint paint;
    public PaintingOverlay paintingOverlay;
    private Path paintingOverlayClipPath;
    private Activity parentActivity;
    private Object parentObject;
    private View popupLayout;
    ActionBarPopupWindow popupWindow;
    private boolean preparingBitmap;
    private ReactionsContainerLayout reactionsLayout;
    private FrameLayout reactionsLayoutContainer;
    private Theme.ResourcesProvider resourcesProvider;
    private final BlurredBackgroundDrawableViewFactory scrimBlur3Factory;
    private final BlurredBackgroundSourceBitmap scrimBlur3SourceBitmap;
    private ArrayList selectedEmojis;
    private float showProgress;
    private final Runnable showSheetRunnable;
    private Drawable slideUpDrawable;
    private float startMoveY;
    private int startX;
    private int startY;
    private StaticLayout stickerEmojiLayout;
    private TLRPC.TL_messages_stickerSet stickerSetForCustomSticker;
    private UnlockPremiumView unlockPremiumView;
    VibrationEffect vibrationEffect;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;

    public interface ContentPreviewViewerDelegate {

        public abstract class CC {
            public static void $default$addCaptionToGif(ContentPreviewViewerDelegate contentPreviewViewerDelegate, Object obj, Object obj2, boolean z, int i, int i2) {
            }

            public static void $default$addToFavoriteSelected(ContentPreviewViewerDelegate contentPreviewViewerDelegate, String str) {
            }

            public static boolean $default$can(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$canAddCaption(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$canDeleteSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$canEditSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$canSchedule(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$canSendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static Boolean $default$canSetAsStatus(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return null;
            }

            public static void $default$copyEmoji(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$deleteSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$editSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static ItemOptions $default$getCustomItemOptions(ContentPreviewViewerDelegate contentPreviewViewerDelegate, ViewGroup viewGroup, View view) {
                return null;
            }

            public static TLRPC.TL_messageMediaPoll $default$getPoll(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return null;
            }

            public static TLRPC.PollAnswer $default$getPollAnswer(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return null;
            }

            public static MessageObject $default$getPollMessageObject(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return null;
            }

            public static String $default$getQuery(ContentPreviewViewerDelegate contentPreviewViewerDelegate, boolean z) {
                return null;
            }

            public static void $default$gifAddedOrDeleted(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static boolean $default$isInScheduleMode(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isPhotoEditor(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isReplacedSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isSettingIntroSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isStickerEditor(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$needCopy(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$needMenu(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needOpen(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needRemove(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$needRemoveFromRecent(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$needSend(ContentPreviewViewerDelegate contentPreviewViewerDelegate, int i) {
                return false;
            }

            public static void $default$newStickerPackSelected(ContentPreviewViewerDelegate contentPreviewViewerDelegate, CharSequence charSequence, String str, Utilities.Callback callback) {
            }

            public static void $default$openSet(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            }

            public static void $default$remove(ContentPreviewViewerDelegate contentPreviewViewerDelegate, SendMessagesHelper.ImportingSticker importingSticker) {
            }

            public static void $default$removeFromRecent(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$resetTouch(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$retractVote(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$sendEmoji(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$sendGif(ContentPreviewViewerDelegate contentPreviewViewerDelegate, Object obj, Object obj2, boolean z, int i, int i2) {
            }

            public static void $default$sendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, String str) {
            }

            public static void $default$sendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            }

            public static void $default$sendVote(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$setAsEmojiStatus(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document, Integer num) {
            }

            public static void $default$setIntroSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, String str) {
            }

            public static void $default$stickerSetSelected(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.StickerSet stickerSet, String str) {
            }
        }

        void addCaptionToGif(Object obj, Object obj2, boolean z, int i, int i2);

        void addToFavoriteSelected(String str);

        boolean can();

        boolean canAddCaption(TLRPC.Document document);

        boolean canDeleteSticker(TLRPC.Document document);

        boolean canEditSticker();

        boolean canSchedule();

        boolean canSendSticker();

        Boolean canSetAsStatus(TLRPC.Document document);

        void copyEmoji(TLRPC.Document document);

        void deleteSticker(TLRPC.Document document);

        void editSticker(TLRPC.Document document);

        ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view);

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

        boolean needMenu();

        boolean needOpen();

        boolean needRemove();

        boolean needRemoveFromRecent(TLRPC.Document document);

        boolean needSend(int i);

        void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback);

        void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z);

        void remove(SendMessagesHelper.ImportingSticker importingSticker);

        void removeFromRecent(TLRPC.Document document);

        void resetTouch();

        void retractVote();

        void sendEmoji(TLRPC.Document document);

        void sendGif(Object obj, Object obj2, boolean z, int i, int i2);

        void sendSticker(String str);

        void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2);

        void sendVote();

        void setAsEmojiStatus(TLRPC.Document document, Integer num);

        void setIntroSticker(String str);

        void stickerSetSelected(TLRPC.StickerSet stickerSet, String str);
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

    private class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ContentPreviewViewer.this.onDraw(canvas);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view instanceof PaintingOverlay) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public boolean canShowFullVotersList() {
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
        if (pollResult == null || pollResult.voters <= 0) {
            return true;
        }
        MessageObject.canShowVotersList(poll);
        return true;
    }

    public boolean addVoteOptions(final org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContentPreviewViewer.addVoteOptions(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):boolean");
    }

    public static void lambda$addVoteOptions$0(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        actionBarPopupWindowLayout.getSwipeBack().closeForeground();
    }

    public void lambda$addVoteOptions$1(BaseFragment baseFragment, Long l) {
        Bundle bundle = new Bundle();
        if (l.longValue() >= 0) {
            bundle.putLong("user_id", l.longValue());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        baseFragment.presentFragment(new ProfileActivity(bundle));
        dismissPopupWindow();
    }

    public static void lambda$addVoteOptions$2(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i, View view) {
        actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
    }

    public void lambda$addVoteOptions$3(View view) {
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate != null) {
            contentPreviewViewerDelegate.sendVote();
        }
        dismissPopupWindow();
    }

    public void lambda$addVoteOptions$4(View view) {
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate != null) {
            contentPreviewViewerDelegate.retractVote();
        }
        dismissPopupWindow();
    }

    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override
        public void run() {
            boolean zHasRecentGif;
            int stableInsetTop;
            int stableInsetBottom;
            int stableInsetTop2;
            int stableInsetBottom2;
            int stableInsetTop3;
            int stableInsetBottom3;
            int stableInsetTop4;
            int stableInsetBottom4;
            ItemOptions customItemOptions;
            int stableInsetTop5;
            int stableInsetBottom5;
            if (ContentPreviewViewer.this.parentActivity == null || ContentPreviewViewer.this.isPhotoEditor) {
                return;
            }
            ContentPreviewViewer.this.closeOnDismiss = true;
            int i = -2;
            if (ContentPreviewViewer.this.delegate != null && (customItemOptions = ContentPreviewViewer.this.delegate.getCustomItemOptions(ContentPreviewViewer.this.containerView, ContentPreviewViewer.this.containerView)) != null) {
                customItemOptions.setBlurBackground(ContentPreviewViewer.this.scrimBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(ContentPreviewViewer.this.resourcesProvider), true);
                customItemOptions.setDrawScrim(false);
                customItemOptions.setupSelectors();
                customItemOptions.setOnDismiss(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$0();
                    }
                });
                ViewGroup layout = customItemOptions.getLayout();
                ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(layout, i, i) {
                    @Override
                    public void dismiss() {
                        super.dismiss();
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                        contentPreviewViewer.popupWindow = null;
                        contentPreviewViewer.menuVisible = false;
                        if (ContentPreviewViewer.this.closeOnDismiss) {
                            ContentPreviewViewer.this.close();
                        }
                    }
                };
                ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(150);
                ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                ContentPreviewViewer.this.popupWindow.setFocusable(true);
                layout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                if (ContentPreviewViewer.this.lastInsets != null) {
                    stableInsetBottom5 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    stableInsetTop5 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                } else {
                    stableInsetTop5 = AndroidUtilities.statusBarHeight;
                    stableInsetBottom5 = 0;
                }
                int iMin = (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom5) - AndroidUtilities.dp(40.0f)) / 2;
                int iMax = (int) (((int) (ContentPreviewViewer.this.moveY + Math.max(stableInsetTop5 + iMin + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom5) - ContentPreviewViewer.this.keyboardHeight) / 2) + iMin)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY));
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                contentPreviewViewer.popupWindow.showAtLocation(contentPreviewViewer.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - layout.getMeasuredWidth()) / 2.0f), iMax);
                try {
                    ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                if (ContentPreviewViewer.this.moveY != 0.0f) {
                    if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                        ContentPreviewViewer.this.finalMoveY = 0.0f;
                        ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                        contentPreviewViewer2.startMoveY = contentPreviewViewer2.moveY;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$run$1(valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.setDuration(350L);
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    valueAnimatorOfFloat.start();
                }
                ContentPreviewViewer.this.menuVisible = true;
                return;
            }
            final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(ContentPreviewViewer.this.containerView.getContext(), R.drawable.popup_fixed_alert4, ContentPreviewViewer.this.resourcesProvider, (ContentPreviewViewer.this.currentContentType == 3 || ContentPreviewViewer.this.canShowFullVotersList()) ? 1 : 0);
            actionBarPopupWindowLayout.setBackground(ContentPreviewViewer.this.scrimBlur3Factory.create((View) actionBarPopupWindowLayout, true).setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(ContentPreviewViewer.this.resourcesProvider)).setRadius(AndroidUtilities.dp(12.0f)).setPadding(AndroidUtilities.dp(8.0f)).setHasPadding(true));
            if (ContentPreviewViewer.this.currentContentType != 3) {
                if (ContentPreviewViewer.this.currentContentType == 0) {
                    if (!MessageObject.isPremiumSticker(ContentPreviewViewer.this.currentDocument) || AccountInstance.getInstance(ContentPreviewViewer.this.currentAccount).getUserConfig().isPremium()) {
                        boolean zIsStickerInFavorites = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (ContentPreviewViewer.this.delegate != null) {
                            if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                                arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_send));
                                arrayList2.add(0);
                            }
                            if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                                arrayList.add(LocaleController.getString(R.string.SendWithoutSound));
                                arrayList3.add(Integer.valueOf(R.drawable.input_notify_off));
                                arrayList2.add(6);
                            }
                            if (ContentPreviewViewer.this.delegate.canSchedule()) {
                                arrayList.add(LocaleController.getString(R.string.Schedule));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_autodelete));
                                arrayList2.add(3);
                            }
                            if (ContentPreviewViewer.this.delegate.needRemove()) {
                                arrayList.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                                arrayList2.add(5);
                            }
                        }
                        if (!MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (zIsStickerInFavorites || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                            arrayList.add(LocaleController.getString(zIsStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                            arrayList3.add(Integer.valueOf(zIsStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave));
                            arrayList2.add(2);
                        }
                        if (ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.currentStickerSet != null && !(ContentPreviewViewer.this.currentStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && ContentPreviewViewer.this.delegate.needOpen()) {
                            arrayList.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList2.add(1);
                        }
                        if (ContentPreviewViewer.this.isRecentSticker) {
                            arrayList.add(LocaleController.getString(R.string.DeleteFromRecent));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                            arrayList2.add(4);
                        }
                        if (ContentPreviewViewer.this.currentStickerSet != null && ContentPreviewViewer.this.currentDocument != null) {
                            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).getStickerSet(ContentPreviewViewer.this.currentStickerSet, true);
                            if (stickerSet != null && ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.delegate.canEditSticker()) {
                                TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                if (!stickerSet2.emojis && !stickerSet2.masks) {
                                    arrayList.add(LocaleController.getString(R.string.EditSticker));
                                    arrayList3.add(Integer.valueOf(R.drawable.msg_edit));
                                    arrayList2.add(7);
                                }
                            }
                            if (stickerSet != null && stickerSet.set.creator && ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.delegate.canDeleteSticker(ContentPreviewViewer.this.currentDocument)) {
                                arrayList.add(LocaleController.getString(R.string.DeleteSticker));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                                arrayList2.add(8);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ContentPreviewViewer.this.menuVisible = true;
                        ContentPreviewViewer.this.containerView.invalidate();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(arrayList2, zIsStickerInFavorites);
                        ContentPreviewViewer.this.addVoteOptions(actionBarPopupWindowLayout);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList3.get(i2)).intValue(), (CharSequence) arrayList.get(i2), false, ContentPreviewViewer.this.resourcesProvider);
                            actionBarMenuSubItemAddItem.setTag(Integer.valueOf(i2));
                            actionBarMenuSubItemAddItem.setOnClickListener(anonymousClass2);
                            if (((Integer) arrayList2.get(i2)).intValue() == 8) {
                                int themedColor = ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold);
                                actionBarMenuSubItemAddItem.setColors(themedColor, themedColor);
                                actionBarMenuSubItemAddItem.setSelectorColor(Theme.multAlpha(themedColor, 0.1f));
                            }
                        }
                        ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i, i) {
                            @Override
                            public void dismiss() {
                                super.dismiss();
                                ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                                contentPreviewViewer3.popupWindow = null;
                                contentPreviewViewer3.menuVisible = false;
                                if (ContentPreviewViewer.this.closeOnDismiss) {
                                    ContentPreviewViewer.this.close();
                                }
                                if (ContentPreviewViewer.this.currentPreviewCell != null) {
                                    if (ContentPreviewViewer.this.currentPreviewCell instanceof StickerEmojiCell) {
                                        ((StickerEmojiCell) ContentPreviewViewer.this.currentPreviewCell).setScaled(false);
                                    } else if (ContentPreviewViewer.this.currentPreviewCell instanceof StickerCell) {
                                        ((StickerCell) ContentPreviewViewer.this.currentPreviewCell).setScaled(false);
                                    } else if (ContentPreviewViewer.this.currentPreviewCell instanceof ContextLinkCell) {
                                        ((ContextLinkCell) ContentPreviewViewer.this.currentPreviewCell).setScaled(false);
                                    }
                                    ContentPreviewViewer.this.currentPreviewCell = null;
                                }
                            }
                        };
                        ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                        ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(100);
                        ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                        ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                        ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                        ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        ContentPreviewViewer.this.popupWindow.setFocusable(true);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                        ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                        if (ContentPreviewViewer.this.lastInsets != null) {
                            stableInsetBottom3 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                            stableInsetTop3 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        } else {
                            stableInsetTop3 = AndroidUtilities.statusBarHeight;
                            stableInsetBottom3 = 0;
                        }
                        int iMax2 = ((int) (ContentPreviewViewer.this.moveY + Math.max(stableInsetTop3 + r2 + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom3) - ContentPreviewViewer.this.keyboardHeight) / 2) + ((ContentPreviewViewer.this.currentContentType == 1 ? Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom3) - AndroidUtilities.dp(40.0f) : (int) (ContentPreviewViewer.this.drawEffect ? Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom3) - AndroidUtilities.dpf2(40.0f) : Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom3) / 1.8f)) / 2))) + AndroidUtilities.dp(24.0f);
                        if (ContentPreviewViewer.this.drawEffect) {
                            iMax2 += AndroidUtilities.dp(24.0f);
                        }
                        ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                        contentPreviewViewer3.popupWindow.showAtLocation(contentPreviewViewer3.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), iMax2);
                        try {
                            ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    } else {
                        ContentPreviewViewer.this.showUnlockPremiumView();
                        ContentPreviewViewer.this.menuVisible = true;
                        ContentPreviewViewer.this.containerView.invalidate();
                        try {
                            ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                } else if (ContentPreviewViewer.this.currentContentType != 2 || ContentPreviewViewer.this.delegate == null) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ArrayList arrayList4 = new ArrayList();
                        final ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList4.add(LocaleController.getString(R.string.SendGifPreview));
                            arrayList6.add(Integer.valueOf(R.drawable.msg_send));
                            arrayList5.add(0);
                        }
                        if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList4.add(LocaleController.getString(R.string.SendWithoutSound));
                            arrayList6.add(Integer.valueOf(R.drawable.input_notify_off));
                            arrayList5.add(4);
                        }
                        if (ContentPreviewViewer.this.delegate.canSchedule()) {
                            arrayList4.add(LocaleController.getString(R.string.Schedule));
                            arrayList6.add(Integer.valueOf(R.drawable.msg_autodelete));
                            arrayList5.add(3);
                        }
                        if (ContentPreviewViewer.this.currentDocument != null && ContentPreviewViewer.this.delegate.canAddCaption(ContentPreviewViewer.this.currentDocument)) {
                            arrayList4.add(LocaleController.getString(R.string.AddACaption));
                            arrayList6.add(Integer.valueOf(R.drawable.outline_caption_24));
                            arrayList5.add(11);
                        }
                        if (ContentPreviewViewer.this.currentDocument != null) {
                            zHasRecentGif = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).hasRecentGif(ContentPreviewViewer.this.currentDocument);
                            if (zHasRecentGif) {
                                arrayList4.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                arrayList6.add(Integer.valueOf(R.drawable.msg_delete));
                                arrayList5.add(1);
                            } else {
                                arrayList4.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                arrayList6.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList5.add(2);
                            }
                        } else {
                            zHasRecentGif = false;
                        }
                        if (arrayList4.isEmpty()) {
                            return;
                        }
                        ContentPreviewViewer.this.menuVisible = true;
                        ContentPreviewViewer.this.containerView.invalidate();
                        int[] iArr = new int[arrayList6.size()];
                        for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                            iArr[i3] = ((Integer) arrayList6.get(i3)).intValue();
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$run$10(arrayList5, view);
                            }
                        };
                        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                            ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList6.get(i4)).intValue(), (CharSequence) arrayList4.get(i4), false, ContentPreviewViewer.this.resourcesProvider);
                            actionBarMenuSubItemAddItem2.setTag(Integer.valueOf(i4));
                            actionBarMenuSubItemAddItem2.setOnClickListener(onClickListener);
                            if (zHasRecentGif && i4 == arrayList4.size() - 1) {
                                actionBarMenuSubItemAddItem2.setColors(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold), ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedRegular));
                            }
                        }
                        ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i, i) {
                            @Override
                            public void dismiss() {
                                super.dismiss();
                                ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                                contentPreviewViewer4.popupWindow = null;
                                contentPreviewViewer4.menuVisible = false;
                                if (ContentPreviewViewer.this.closeOnDismiss) {
                                    ContentPreviewViewer.this.close();
                                }
                            }
                        };
                        ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                        ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(150);
                        ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                        ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                        ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                        ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        ContentPreviewViewer.this.popupWindow.setFocusable(true);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                        ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                        if (ContentPreviewViewer.this.lastInsets != null) {
                            stableInsetBottom = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                            stableInsetTop = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        } else {
                            stableInsetTop = AndroidUtilities.statusBarHeight;
                            stableInsetBottom = 0;
                        }
                        int iMin2 = (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom) - AndroidUtilities.dp(40.0f)) / 2;
                        int iMax3 = ((int) (((int) (ContentPreviewViewer.this.moveY + Math.max(stableInsetTop + iMin2 + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom) - ContentPreviewViewer.this.keyboardHeight) / 2) + iMin2)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY))) + ContentPreviewViewer.this.getGifPreviewOffsetY();
                        ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                        contentPreviewViewer4.popupWindow.showAtLocation(contentPreviewViewer4.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), iMax3);
                        try {
                            ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        if (ContentPreviewViewer.this.moveY != 0.0f) {
                            if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                                ContentPreviewViewer.this.finalMoveY = 0.0f;
                                ContentPreviewViewer contentPreviewViewer5 = ContentPreviewViewer.this;
                                contentPreviewViewer5.startMoveY = contentPreviewViewer5.moveY;
                            }
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.lambda$run$11(valueAnimator);
                                }
                            });
                            valueAnimatorOfFloat2.setDuration(350L);
                            valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            valueAnimatorOfFloat2.start();
                        }
                    }
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    final ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType)) {
                        arrayList7.add(LocaleController.getString(R.string.SendEmojiPreview));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_send));
                        arrayList8.add(0);
                    }
                    Boolean boolCanSetAsStatus = ContentPreviewViewer.this.delegate.canSetAsStatus(ContentPreviewViewer.this.currentDocument);
                    if (boolCanSetAsStatus != null) {
                        if (boolCanSetAsStatus.booleanValue()) {
                            arrayList7.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                            arrayList9.add(Integer.valueOf(R.drawable.msg_smile_status));
                            arrayList8.add(1);
                        } else {
                            arrayList7.add(LocaleController.getString(R.string.RemoveStatus));
                            arrayList9.add(Integer.valueOf(R.drawable.msg_smile_status));
                            arrayList8.add(2);
                        }
                    }
                    if (ContentPreviewViewer.this.delegate.needCopy(ContentPreviewViewer.this.currentDocument)) {
                        arrayList7.add(LocaleController.getString(R.string.CopyEmojiPreview));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_copy));
                        arrayList8.add(3);
                    }
                    if (ContentPreviewViewer.this.delegate.needRemoveFromRecent(ContentPreviewViewer.this.currentDocument)) {
                        arrayList7.add(LocaleController.getString(R.string.RemoveFromRecent));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_delete));
                        arrayList8.add(4);
                    }
                    final boolean zIsStickerInFavorites2 = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                    if (!MessageObject.isAnimatedEmoji(ContentPreviewViewer.this.currentDocument) && !MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (zIsStickerInFavorites2 || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                        arrayList7.add(LocaleController.getString(zIsStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                        arrayList9.add(Integer.valueOf(zIsStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList8.add(5);
                    }
                    if (arrayList7.isEmpty()) {
                        return;
                    }
                    ContentPreviewViewer.this.menuVisible = true;
                    ContentPreviewViewer.this.containerView.invalidate();
                    int[] iArr2 = new int[arrayList9.size()];
                    for (int i5 = 0; i5 < arrayList9.size(); i5++) {
                        iArr2[i5] = ((Integer) arrayList9.get(i5)).intValue();
                    }
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$run$7(arrayList8, zIsStickerInFavorites2, view);
                        }
                    };
                    boolean zAddVoteOptions = ContentPreviewViewer.this.addVoteOptions(actionBarPopupWindowLayout);
                    int i6 = 0;
                    while (i6 < arrayList7.size()) {
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(!zAddVoteOptions && i6 == 0, i6 == arrayList7.size() - 1, actionBarPopupWindowLayout, ((Integer) arrayList9.get(i6)).intValue(), (CharSequence) arrayList7.get(i6), false, ContentPreviewViewer.this.resourcesProvider);
                        if (((Integer) arrayList8.get(i6)).intValue() == 4) {
                            actionBarMenuSubItemAddItem3.setIconColor(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedRegular));
                            actionBarMenuSubItemAddItem3.setTextColor(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold));
                        }
                        actionBarMenuSubItemAddItem3.setTag(Integer.valueOf(i6));
                        actionBarMenuSubItemAddItem3.setOnClickListener(onClickListener2);
                        i6++;
                    }
                    ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i, i) {
                        @Override
                        public void dismiss() {
                            super.dismiss();
                            ContentPreviewViewer contentPreviewViewer6 = ContentPreviewViewer.this;
                            contentPreviewViewer6.popupWindow = null;
                            contentPreviewViewer6.menuVisible = false;
                            if (ContentPreviewViewer.this.closeOnDismiss) {
                                ContentPreviewViewer.this.close();
                            }
                        }
                    };
                    ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                    ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(150);
                    ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                    ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                    ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                    ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    ContentPreviewViewer.this.popupWindow.setFocusable(true);
                    actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                    ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                    if (ContentPreviewViewer.this.lastInsets != null) {
                        stableInsetBottom2 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        stableInsetTop2 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    } else {
                        stableInsetTop2 = AndroidUtilities.statusBarHeight;
                        stableInsetBottom2 = 0;
                    }
                    int iMin3 = (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom2) - AndroidUtilities.dp(40.0f)) / 2;
                    int iMax4 = (int) (((int) (ContentPreviewViewer.this.moveY + Math.max(stableInsetTop2 + iMin3 + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom2) - ContentPreviewViewer.this.keyboardHeight) / 2) + iMin3)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY));
                    ContentPreviewViewer contentPreviewViewer6 = ContentPreviewViewer.this;
                    contentPreviewViewer6.popupWindow.showAtLocation(contentPreviewViewer6.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), iMax4);
                    ActionBarPopupWindow.startAnimation(actionBarPopupWindowLayout);
                    try {
                        ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                    } catch (Exception unused5) {
                    }
                    if (ContentPreviewViewer.this.moveY != 0.0f) {
                        if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                            ContentPreviewViewer.this.finalMoveY = 0.0f;
                            ContentPreviewViewer contentPreviewViewer7 = ContentPreviewViewer.this;
                            contentPreviewViewer7.startMoveY = contentPreviewViewer7.moveY;
                        }
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.lambda$run$8(valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat3.setDuration(350L);
                        valueAnimatorOfFloat3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        valueAnimatorOfFloat3.start();
                    }
                }
            } else {
                ArrayList arrayList10 = new ArrayList();
                final ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                if (ContentPreviewViewer.this.stickerSetForCustomSticker == null) {
                    if (ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isSettingIntroSticker()) {
                        if (ContentPreviewViewer.this.delegate.canSendSticker()) {
                            arrayList10.add(LocaleController.getString(R.string.SendStickerPreview));
                            arrayList12.add(Integer.valueOf(R.drawable.msg_send));
                            arrayList11.add(0);
                        }
                        arrayList10.add(LocaleController.getString(R.string.AddToFavorites));
                        arrayList12.add(Integer.valueOf(R.drawable.msg_fave));
                        arrayList11.add(1);
                    } else {
                        arrayList10.add(LocaleController.getString(R.string.SetIntroSticker));
                        arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_add));
                        arrayList11.add(0);
                    }
                }
                if (ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isSettingIntroSticker()) {
                    arrayList10.add(LocaleController.getString((ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isReplacedSticker()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    arrayList12.add(Integer.valueOf((ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isReplacedSticker()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace));
                    arrayList11.add(2);
                }
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) ContentPreviewViewer.this.parentActivity, true, false, ContentPreviewViewer.this.resourcesProvider);
                actionBarMenuSubItem.setItemHeight(44);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
                actionBarMenuSubItem.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ContentPreviewViewer.this.containerView.getContext());
                final LinearLayout linearLayout = new LinearLayout(ContentPreviewViewer.this.containerView.getContext());
                linearLayout.setBackgroundColor(ContentPreviewViewer.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                linearLayout.setOrientation(1);
                final RecyclerListView recyclerListViewCreateMyStickerPacksListView = ContentPreviewViewer.this.createMyStickerPacksListView();
                recyclerListViewCreateMyStickerPacksListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i7) {
                        this.f$0.lambda$run$4(view, i7);
                    }
                });
                frameLayout.addView(actionBarMenuSubItem);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new ActionBarPopupWindow.GapView(ContentPreviewViewer.this.containerView.getContext(), ContentPreviewViewer.this.resourcesProvider), LayoutHelper.createLinear(-1, 8));
                View.OnClickListener onClickListener3 = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$run$5(arrayList11, recyclerListViewCreateMyStickerPacksListView, linearLayout, actionBarPopupWindowLayout, view);
                    }
                };
                for (int i7 = 0; i7 < arrayList10.size(); i7++) {
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList12.get(i7)).intValue(), (CharSequence) arrayList10.get(i7), false, ContentPreviewViewer.this.resourcesProvider);
                    actionBarMenuSubItemAddItem4.setTag(Integer.valueOf(i7));
                    actionBarMenuSubItemAddItem4.setOnClickListener(onClickListener3);
                }
                actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                linearLayout.addView(recyclerListViewCreateMyStickerPacksListView, new LinearLayout.LayoutParams(actionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindowLayout.addViewToSwipeBack(linearLayout);
                frameLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ContentPreviewViewer.AnonymousClass1.lambda$run$6(actionBarPopupWindowLayout, view);
                    }
                });
                if (ContentPreviewViewer.this.lastInsets != null) {
                    stableInsetBottom4 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    stableInsetTop4 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                } else {
                    stableInsetTop4 = AndroidUtilities.statusBarHeight;
                    stableInsetBottom4 = 0;
                }
                int iMin4 = ((int) (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom4) / 1.8f)) / 2;
                ContentPreviewViewer.this.containerView.addView(actionBarPopupWindowLayout, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, (((int) ((ContentPreviewViewer.this.moveY + Math.max(stableInsetTop4 + iMin4, ((ContentPreviewViewer.this.containerView.getHeight() - stableInsetBottom4) - ContentPreviewViewer.this.keyboardHeight) / 2)) + iMin4)) + AndroidUtilities.dp(84.0f)) / AndroidUtilities.density, 0.0f, 0.0f));
                ContentPreviewViewer.this.popupLayout = actionBarPopupWindowLayout;
                ContentPreviewViewer.this.popupLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                ContentPreviewViewer.this.popupLayout.setAlpha(0.0f);
                ContentPreviewViewer.this.popupLayout.setScaleX(0.8f);
                ContentPreviewViewer.this.popupLayout.setScaleY(0.8f);
                ContentPreviewViewer.this.popupLayout.setPivotY(0.0f);
                ContentPreviewViewer.this.popupLayout.setPivotX(ContentPreviewViewer.this.popupLayout.getMeasuredWidth() / 2.0f);
                ContentPreviewViewer.this.popupLayout.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                ContentPreviewViewer.this.showEmojiSelectorForStickers();
                ContentPreviewViewer.this.menuVisible = true;
                ContentPreviewViewer.this.containerView.invalidate();
            }
            int i8 = 0;
            while (i8 < actionBarPopupWindowLayout.getItemsCount()) {
                View itemAt = actionBarPopupWindowLayout.getItemAt(i8);
                if (itemAt instanceof ActionBarMenuSubItem) {
                    ((ActionBarMenuSubItem) itemAt).updateSelectorBackground(i8 == 0, i8 == actionBarPopupWindowLayout.getItemsCount() - 1, 12);
                }
                i8++;
            }
        }

        public void lambda$run$0() {
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        public void lambda$run$1(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }

        public void lambda$run$4(View view, int i) {
            TLRPC.StickerSetCovered cover = ((StickerPackNameView) view).getCover();
            CustomEmojiReactionsWindow reactionsWindow = ContentPreviewViewer.this.reactionsLayout.getReactionsWindow();
            if (reactionsWindow != null && reactionsWindow.isShowing()) {
                reactionsWindow.dismiss();
            }
            if (cover instanceof TLRPC.TL_stickerSetNoCovered) {
                StickersDialogs.showNameEditorDialog(null, ContentPreviewViewer.this.resourcesProvider, ContentPreviewViewer.this.containerView.getContext(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        this.f$0.lambda$run$3((CharSequence) obj, (Utilities.Callback) obj2);
                    }
                });
                return;
            }
            if (ContentPreviewViewer.this.delegate != null) {
                ContentPreviewViewer.this.delegate.stickerSetSelected(cover.set, TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        public void lambda$run$3(CharSequence charSequence, final Utilities.Callback callback) {
            if (ContentPreviewViewer.this.delegate != null) {
                ContentPreviewViewer.this.delegate.newStickerPackSelected(charSequence, TextUtils.join("", ContentPreviewViewer.this.selectedEmojis), callback != null ? new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$2(callback, (Boolean) obj);
                    }
                } : null);
                if (callback == null) {
                    ContentPreviewViewer.this.dismissPopupWindow();
                }
            }
        }

        public void lambda$run$2(Utilities.Callback callback, Boolean bool) {
            callback.run(bool);
            if (bool.booleanValue()) {
                ContentPreviewViewer.this.dismissPopupWindow();
            }
        }

        public void lambda$run$5(ArrayList arrayList, RecyclerListView recyclerListView, LinearLayout linearLayout, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view) {
            if (ContentPreviewViewer.this.parentActivity == null) {
                return;
            }
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (((Integer) arrayList.get(iIntValue)).intValue() == 2) {
                if (ContentPreviewViewer.this.stickerSetForCustomSticker != null) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.stickerSetSelected(ContentPreviewViewer.this.stickerSetForCustomSticker.set, TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                    }
                    ContentPreviewViewer.this.dismissPopupWindow();
                    return;
                } else {
                    recyclerListView.requestLayout();
                    linearLayout.requestLayout();
                    recyclerListView.getAdapter().notifyDataSetChanged();
                    actionBarPopupWindowLayout.getSwipeBack().openForeground(1);
                    return;
                }
            }
            if (ContentPreviewViewer.this.delegate != null) {
                if (((Integer) arrayList.get(iIntValue)).intValue() == 1) {
                    ContentPreviewViewer.this.delegate.addToFavoriteSelected(TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                } else if (((Integer) arrayList.get(iIntValue)).intValue() == 0) {
                    if (ContentPreviewViewer.this.delegate.isSettingIntroSticker()) {
                        ContentPreviewViewer.this.delegate.setIntroSticker(TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                    } else {
                        ContentPreviewViewer.this.delegate.sendSticker(TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                    }
                }
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        public static void lambda$run$6(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view) {
            actionBarPopupWindowLayout.getSwipeBack().closeForeground();
        }

        class AnonymousClass2 implements View.OnClickListener {
            final ArrayList val$actions;
            final boolean val$inFavs;

            AnonymousClass2(ArrayList arrayList, boolean z) {
                this.val$actions = arrayList;
                this.val$inFavs = z;
            }

            @Override
            public void onClick(View view) {
                if (ContentPreviewViewer.this.parentActivity == null) {
                    return;
                }
                int iIntValue = ((Integer) view.getTag()).intValue();
                if (((Integer) this.val$actions.get(iIntValue)).intValue() == 0 || ((Integer) this.val$actions.get(iIntValue)).intValue() == 6) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.sendSticker(ContentPreviewViewer.this.currentDocument, ContentPreviewViewer.this.currentQuery, ContentPreviewViewer.this.parentObject, ((Integer) this.val$actions.get(iIntValue)).intValue() == 0, 0, 0);
                    }
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 1) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.openSet(ContentPreviewViewer.this.currentStickerSet, ContentPreviewViewer.this.clearsInputField);
                    }
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 2) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), this.val$inFavs);
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 3) {
                    final TLRPC.Document document = ContentPreviewViewer.this.currentDocument;
                    final Object obj = ContentPreviewViewer.this.parentObject;
                    final String str = ContentPreviewViewer.this.currentQuery;
                    final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                    if (contentPreviewViewerDelegate == null) {
                        return;
                    } else {
                        AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                            @Override
                            public final void didSelectDate(boolean z, int i, int i2) {
                                contentPreviewViewerDelegate.sendSticker(document, str, obj, z, i, i2);
                            }
                        });
                    }
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 4) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(0, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 5) {
                    ContentPreviewViewer.this.delegate.remove(ContentPreviewViewer.this.importingSticker);
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 7) {
                    ContentPreviewViewer.this.delegate.editSticker(ContentPreviewViewer.this.currentDocument);
                } else if (((Integer) this.val$actions.get(iIntValue)).intValue() == 8) {
                    ContentPreviewViewer.this.delegate.deleteSticker(ContentPreviewViewer.this.currentDocument);
                }
                ContentPreviewViewer.this.dismissPopupWindow();
            }
        }

        public void lambda$run$7(ArrayList arrayList, boolean z, View view) {
            if (ContentPreviewViewer.this.parentActivity == null || ContentPreviewViewer.this.delegate == null) {
                return;
            }
            int iIntValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
            if (iIntValue == 0) {
                ContentPreviewViewer.this.delegate.sendEmoji(ContentPreviewViewer.this.currentDocument);
            } else if (iIntValue == 1) {
                ContentPreviewViewer.this.delegate.setAsEmojiStatus(ContentPreviewViewer.this.currentDocument, null);
            } else if (iIntValue == 2) {
                ContentPreviewViewer.this.delegate.setAsEmojiStatus(null, null);
            } else if (iIntValue == 3) {
                ContentPreviewViewer.this.delegate.copyEmoji(ContentPreviewViewer.this.currentDocument);
            } else if (iIntValue == 4) {
                ContentPreviewViewer.this.delegate.removeFromRecent(ContentPreviewViewer.this.currentDocument);
            } else if (iIntValue == 5) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), z);
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        public void lambda$run$8(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }

        public void lambda$run$10(ArrayList arrayList, View view) {
            if (ContentPreviewViewer.this.parentActivity == null) {
                return;
            }
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (((Integer) arrayList.get(iIntValue)).intValue() == 0) {
                ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, true, 0, 0);
            } else if (((Integer) arrayList.get(iIntValue)).intValue() == 4) {
                ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, false, 0, 0);
            } else if (((Integer) arrayList.get(iIntValue)).intValue() == 1) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).removeRecentGif(ContentPreviewViewer.this.currentDocument);
                ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
            } else if (((Integer) arrayList.get(iIntValue)).intValue() == 2) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentGif(ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                MessagesController.getInstance(ContentPreviewViewer.this.currentAccount).saveGif("gif", ContentPreviewViewer.this.currentDocument);
                ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
            } else if (((Integer) arrayList.get(iIntValue)).intValue() == 3) {
                final TLRPC.Document document = ContentPreviewViewer.this.currentDocument;
                final TLRPC.BotInlineResult botInlineResult = ContentPreviewViewer.this.inlineResult;
                final Object obj = ContentPreviewViewer.this.parentObject;
                final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ContentPreviewViewer.AnonymousClass1.lambda$run$9(contentPreviewViewerDelegate, document, botInlineResult, obj, z, i, i2);
                    }
                }, ContentPreviewViewer.this.resourcesProvider);
            } else if (((Integer) arrayList.get(iIntValue)).intValue() == 11) {
                ContentPreviewViewer.this.delegate.addCaptionToGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, true, 0, 0);
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        public static void lambda$run$9(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document, TLRPC.BotInlineResult botInlineResult, Object obj, boolean z, int i, int i2) {
            contentPreviewViewerDelegate.sendGif(document != null ? document : botInlineResult, obj, z, i, i2);
        }

        public void lambda$run$11(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }
    }

    public void setStickerSetForCustomSticker(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.stickerSetForCustomSticker = tL_messages_stickerSet;
    }

    public void showEmojiSelectorForStickers() {
        if (this.reactionsLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(4, null, this.containerView.getContext(), UserConfig.selectedAccount, this.resourcesProvider) {
                @Override
                public void invalidateLoopViews() {
                    super.invalidateLoopViews();
                    ContentPreviewViewer.this.setFocusable(getReactionsWindow() != null);
                }
            };
            this.reactionsLayout = reactionsContainerLayout;
            reactionsContainerLayout.skipEnterAnimation = true;
            reactionsContainerLayout.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
            this.reactionsLayout.setClipChildren(false);
            this.reactionsLayout.setClipToPadding(false);
            this.reactionsLayout.setVisibility(0);
            this.reactionsLayout.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
            this.reactionsLayout.setBubbleOffset(-AndroidUtilities.dp(105.0f));
            this.reactionsLayout.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
            FrameLayout frameLayout = new FrameLayout(this.containerView.getContext());
            this.reactionsLayoutContainer = frameLayout;
            frameLayout.addView(this.reactionsLayout, LayoutHelper.createFrame(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
            this.containerView.addView(this.reactionsLayoutContainer, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
        }
        this.reactionsLayout.setSelectedEmojis(this.selectedEmojis);
        this.reactionsLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
            @Override
            public boolean allowLongPress() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
            }

            @Override
            public boolean drawBackground() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
            }

            @Override
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
            }

            @Override
            public boolean needEnterText() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
            }

            @Override
            public void onEmojiWindowDismissed() {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
            }

            @Override
            public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                this.f$0.lambda$showEmojiSelectorForStickers$5(view, visibleReaction, z, z2);
            }
        });
        this.reactionsLayout.setMessage(null, null, false);
        this.reactionsLayoutContainer.setScaleY(0.6f);
        this.reactionsLayoutContainer.setScaleX(0.6f);
        this.reactionsLayoutContainer.setAlpha(0.0f);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showEmojiSelectorForStickers$6();
            }
        }, 10L);
    }

    public void lambda$showEmojiSelectorForStickers$5(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        if (visibleReaction == null) {
            return;
        }
        CustomEmojiReactionsWindow reactionsWindow = this.reactionsLayout.getReactionsWindow();
        if (this.selectedEmojis.contains(visibleReaction.emojicon)) {
            if (this.selectedEmojis.size() <= 1) {
                return;
            } else {
                this.selectedEmojis.remove(visibleReaction.emojicon);
            }
        } else {
            this.selectedEmojis.add(visibleReaction.emojicon);
            if (this.selectedEmojis.size() > 7) {
                this.selectedEmojis.remove(0);
            }
        }
        this.reactionsLayout.setSelectedEmojis(this.selectedEmojis);
        if (reactionsWindow != null) {
            this.reactionsLayout.setMessage(null, null, false);
            if (reactionsWindow.getSelectAnimatedEmojiDialog() != null) {
                reactionsWindow.getSelectAnimatedEmojiDialog().setSelectedReactions(this.selectedEmojis);
                reactionsWindow.getSelectAnimatedEmojiDialog().setRecentReactions(this.reactionsLayout.allReactionsList);
            }
            reactionsWindow.dismiss();
        }
    }

    public void lambda$showEmojiSelectorForStickers$6() {
        this.reactionsLayoutContainer.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    public void showUnlockPremiumView() {
        if (this.unlockPremiumView == null) {
            UnlockPremiumView unlockPremiumView = new UnlockPremiumView(this.containerView.getContext(), 0, this.resourcesProvider);
            this.unlockPremiumView = unlockPremiumView;
            this.containerView.addView(unlockPremiumView, LayoutHelper.createFrame(-1, -1.0f));
            this.unlockPremiumView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showUnlockPremiumView$7(view);
                }
            });
            this.unlockPremiumView.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showUnlockPremiumView$8(view);
                }
            });
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, true);
        this.unlockPremiumView.setTranslationY(0.0f);
    }

    public void lambda$showUnlockPremiumView$7(View view) {
        this.menuVisible = false;
        this.containerView.invalidate();
        close();
    }

    public void lambda$showUnlockPremiumView$8(View view) {
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.getActionBarLayout() != null && launchActivity.getActionBarLayout().getLastFragment() != null) {
                launchActivity.getActionBarLayout().getLastFragment().dismissCurrentDialog();
            }
            launchActivity.lambda$runLinkRequest$99(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(5)));
        }
        this.menuVisible = false;
        this.containerView.invalidate();
        close();
    }

    public static ContentPreviewViewer getInstance() {
        ContentPreviewViewer contentPreviewViewer = Instance;
        if (contentPreviewViewer == null) {
            synchronized (PhotoViewer.class) {
                try {
                    contentPreviewViewer = Instance;
                    if (contentPreviewViewer == null) {
                        contentPreviewViewer = new ContentPreviewViewer();
                        Instance = contentPreviewViewer;
                    }
                } finally {
                }
            }
        }
        return contentPreviewViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    public void reset() {
        Runnable runnable = this.openPreviewRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
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

    public boolean onTouch(android.view.MotionEvent r16, final org.telegram.ui.Components.RecyclerListView r17, int r18, final java.lang.Object r19, org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate r20, org.telegram.ui.ActionBar.Theme.ResourcesProvider r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContentPreviewViewer.onTouch(android.view.MotionEvent, org.telegram.ui.Components.RecyclerListView, int, java.lang.Object, org.telegram.ui.ContentPreviewViewer$ContentPreviewViewerDelegate, org.telegram.ui.ActionBar.Theme$ResourcesProvider):boolean");
    }

    public static void lambda$onTouch$9(RecyclerListView recyclerListView, Object obj) {
        if (recyclerListView instanceof RecyclerListView) {
            recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) obj);
        }
    }

    protected void runSmoothHaptic() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) this.containerView.getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r8, final org.telegram.ui.Components.RecyclerListView r9, int r10, org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate r11, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContentPreviewViewer.onInterceptTouchEvent(android.view.MotionEvent, org.telegram.ui.Components.RecyclerListView, int, org.telegram.ui.ContentPreviewViewer$ContentPreviewViewerDelegate, org.telegram.ui.ActionBar.Theme$ResourcesProvider):boolean");
    }

    public void lambda$onInterceptTouchEvent$10(RecyclerListView recyclerListView, int i, Theme.ResourcesProvider resourcesProvider) {
        TLRPC.Document documentFindDocument;
        if (this.openPreviewRunnable == null) {
            return;
        }
        recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) null);
        recyclerListView.requestDisallowInterceptTouchEvent(true);
        this.openPreviewRunnable = null;
        setParentActivity(AndroidUtilities.findActivity(recyclerListView.getContext()));
        this.clearsInputField = false;
        View view = this.currentPreviewCell;
        if (view instanceof StickerEmojiCell) {
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            TLRPC.Document sticker = stickerEmojiCell.getSticker();
            SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
            String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
            ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
            open(sticker, stickerPath, strFindAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, i, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), this.resourcesProvider);
            stickerEmojiCell.setScaled(true);
        } else if (view instanceof StickerCell) {
            StickerCell stickerCell = (StickerCell) view;
            TLRPC.Document sticker2 = stickerCell.getSticker();
            ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = this.delegate;
            open(sticker2, null, null, contentPreviewViewerDelegate2 != null ? contentPreviewViewerDelegate2.getQuery(false) : null, null, i, false, stickerCell.getParentObject(), resourcesProvider);
            stickerCell.setScaled(true);
            this.clearsInputField = stickerCell.isClearsInputField();
        } else if (view instanceof ContextLinkCell) {
            ContextLinkCell contextLinkCell = (ContextLinkCell) view;
            TLRPC.Document document = contextLinkCell.getDocument();
            ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = this.delegate;
            open(document, null, null, contentPreviewViewerDelegate3 != null ? contentPreviewViewerDelegate3.getQuery(true) : null, contextLinkCell.getBotInlineResult(), i, false, contextLinkCell.getBotInlineResult() != null ? contextLinkCell.getInlineBot() : contextLinkCell.getParentObject(), resourcesProvider);
            if (i != 1 || this.isPhotoEditor) {
                contextLinkCell.setScaled(true);
            }
        } else if (view instanceof EmojiPacksAlert.EmojiImageView) {
            TLRPC.Document document2 = ((EmojiPacksAlert.EmojiImageView) view).getDocument();
            if (document2 == null) {
                return;
            } else {
                open(document2, null, MessageObject.findAnimatedEmojiEmoticon(document2, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
        } else if (view instanceof EmojiView.ImageViewEmoji) {
            AnimatedEmojiSpan span = ((EmojiView.ImageViewEmoji) view).getSpan();
            if (span != null) {
                documentFindDocument = span.document;
                if (documentFindDocument == null) {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, span.getDocumentId());
                }
            } else {
                documentFindDocument = null;
            }
            if (documentFindDocument == null) {
                return;
            } else {
                open(documentFindDocument, null, MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
        } else {
            if (!(view instanceof SuggestEmojiView.EmojiImageView)) {
                return;
            }
            Drawable drawable = ((SuggestEmojiView.EmojiImageView) view).drawable;
            TLRPC.Document document3 = drawable instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable).getDocument() : null;
            if (document3 == null) {
                return;
            } else {
                open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
        }
        try {
            this.currentPreviewCell.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = this.delegate;
        if (contentPreviewViewerDelegate4 != null) {
            contentPreviewViewerDelegate4.resetTouch();
        }
    }

    public void setDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        this.delegate = contentPreviewViewerDelegate;
        if (contentPreviewViewerDelegate != null) {
            this.isPhotoEditor = contentPreviewViewerDelegate.isPhotoEditor();
            this.isStickerEditor = this.delegate.isStickerEditor();
        }
    }

    public void setParentActivity(Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        this.centerImage.setLayerNum(Integer.MAX_VALUE);
        this.effectImage.setCurrentAccount(this.currentAccount);
        this.effectImage.setLayerNum(Integer.MAX_VALUE);
        if (this.parentActivity == activity) {
            return;
        }
        this.parentActivity = activity;
        this.slideUpDrawable = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.windowView = new FrameLayout(activity) {
            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    if (ContentPreviewViewer.this.isStickerEditor || ContentPreviewViewer.this.menuVisible) {
                        ContentPreviewViewer.this.closeWithMenu();
                    } else {
                        ContentPreviewViewer.this.close();
                    }
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }

            @Override
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                Blur3Utils.checkBitmapSourceMatrixScale(ContentPreviewViewer.this.scrimBlur3SourceBitmap, ContentPreviewViewer.this.windowView);
                ContentPreviewViewer.this.scrimBlur3Factory.invalidateAllLinkedViews();
            }
        };
        this.scrimBlur3Factory.setSourceRootView(new ViewPositionWatcher(this.windowView), this.windowView);
        this.scrimBlur3Factory.setLinkedViewsRef(new ReferenceList());
        this.windowView.setFocusable(true);
        this.windowView.setFocusableInTouchMode(true);
        this.windowView.setSystemUiVisibility(1792);
        ViewCompat.setOnApplyWindowInsetsListener(this.windowView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.lambda$setParentActivity$11(view, windowInsetsCompat);
            }
        });
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(activity) {
            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                ContentPreviewViewer.this.centerImage.onAttachedToWindow();
                ContentPreviewViewer.this.effectImage.onAttachedToWindow();
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                ContentPreviewViewer.this.centerImage.onDetachedFromWindow();
                ContentPreviewViewer.this.effectImage.onDetachedFromWindow();
            }
        };
        this.containerView = frameLayoutDrawer;
        frameLayoutDrawer.setFocusable(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        this.containerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.lambda$setParentActivity$12(view, motionEvent);
            }
        });
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
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i2 >= 30 ? 3 : 1;
        }
        this.centerImage.setAspectFit(true);
        this.centerImage.setInvalidateAll(true);
        this.centerImage.setParentView(this.containerView);
        this.effectImage.setAspectFit(true);
        this.effectImage.setInvalidateAll(true);
        this.effectImage.setParentView(this.containerView);
    }

    public WindowInsetsCompat lambda$setParentActivity$11(View view, WindowInsetsCompat windowInsetsCompat) {
        this.lastInsets = windowInsetsCompat;
        return windowInsetsCompat;
    }

    public boolean lambda$setParentActivity$12(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
            if (this.isStickerEditor) {
                closeWithMenu();
            } else {
                close();
            }
        }
        return true;
    }

    public void setFocusable(boolean z) {
        if (z) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            layoutParams.flags &= -131073;
            layoutParams.softInputMode = 16;
        } else {
            this.windowLayoutParams.flags |= 131072;
        }
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public int getGifPreviewOffsetY() {
        if (this.currentContentType != 1 || this.isPhotoEditor || this.slideUpDrawable == null) {
            return 0;
        }
        return AndroidUtilities.dp(56.0f);
    }

    public void open(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider) {
        open(document, importingSticker, str, str2, botInlineResult, i, z, obj, resourcesProvider, 0);
    }

    public void open(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider, int i2) {
        boolean z2;
        TLRPC.InputStickerSet inputStickerSet;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate;
        int i3;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        this.isRecentSticker = z;
        this.stickerEmojiLayout = null;
        this.backgroundDrawable.setColor(AndroidUtilities.isDarkColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)) ? 1895825408 : 1692853990);
        this.drawEffect = false;
        this.centerImage.setColorFilter(null);
        if (i != 0 && i != 2 && i != 3) {
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
            AndroidUtilities.runOnUIThread(this.showSheetRunnable, 2000L);
        } else {
            if (document == null && importingSticker == null) {
                return;
            }
            if (textPaint == null) {
                TextPaint textPaint2 = new TextPaint(1);
                textPaint = textPaint2;
                textPaint2.setTextSize(AndroidUtilities.dp(24.0f));
            }
            this.effectImage.clearImage();
            this.drawEffect = false;
            if (document != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= document.attributes.size()) {
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (str != null) {
                    this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), false), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if ((inputStickerSet != null || i == 2) && ((contentPreviewViewerDelegate = this.delegate) == null || contentPreviewViewerDelegate.needMenu())) {
                    AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                    AndroidUtilities.runOnUIThread(this.showSheetRunnable, i2 > 0 ? i2 : 1300L);
                }
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(inputStickerSet, true);
                this.currentStickerSet = (stickerSet == null || !stickerSet.documents.isEmpty()) ? inputStickerSet : null;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (MessageObject.isVideoStickerDocument(document)) {
                    this.centerImage.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), null, null, 0L, "webp", this.currentStickerSet, 1);
                } else {
                    this.centerImage.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), (String) null, "webp", this.currentStickerSet, 1);
                    if (MessageObject.isPremiumSticker(document)) {
                        this.drawEffect = true;
                        this.effectImage.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.currentStickerSet, 1);
                    }
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    this.centerImage.setColorFilter(Theme.getAnimatedEmojiColorFilter(resourcesProvider));
                }
                if (this.stickerEmojiLayout == null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i5);
                        if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                            this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, textPaint.getFontMetricsInt(), false), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                        i5++;
                    }
                }
            } else if (importingSticker != null) {
                this.centerImage.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                if (importingSticker.videoEditedInfo != null) {
                    if (this.paintingOverlay == null) {
                        PaintingOverlay paintingOverlay = new PaintingOverlay(this.containerView.getContext());
                        this.paintingOverlay = paintingOverlay;
                        this.containerView.addView(paintingOverlay, new FrameLayout.LayoutParams(512, 512));
                    }
                    z2 = false;
                    this.paintingOverlay.setEntities(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                } else {
                    z2 = false;
                }
                if (str != null) {
                    this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), z2), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if (this.delegate.needMenu()) {
                    AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                    AndroidUtilities.runOnUIThread(this.showSheetRunnable, i2 > 0 ? i2 : 1300L);
                }
            }
        }
        if (this.centerImage.getLottieAnimation() != null) {
            i3 = 0;
            this.centerImage.getLottieAnimation().setCurrentFrame(0);
        } else {
            i3 = 0;
        }
        if (this.drawEffect && this.effectImage.getLottieAnimation() != null) {
            this.effectImage.getLottieAnimation().setCurrentFrame(i3);
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
            return;
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
        this.finalMoveY = 0.0f;
        this.currentMoveY = 0.0f;
        this.moveY = 0.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void closeWithMenu() {
        CustomEmojiReactionsWindow reactionsWindow;
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsLayout;
        if (reactionsContainerLayout != null && (reactionsWindow = reactionsContainerLayout.getReactionsWindow()) != null && reactionsWindow.isShowing()) {
            reactionsWindow.dismiss();
            return;
        }
        this.menuVisible = false;
        dismissPopupWindow();
        close();
    }

    public void close() {
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$close$13();
            }
        }, 200L);
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

    public void lambda$close$13() {
        this.resourcesProvider = null;
    }

    public void clearDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        if (this.delegate == contentPreviewViewerDelegate) {
            this.currentDocument = null;
            this.currentStickerSet = null;
            this.currentQuery = null;
            this.delegate = null;
            this.resourcesProvider = null;
            reset();
        }
    }

    public void destroy() {
        this.isVisible = false;
        this.delegate = null;
        this.currentDocument = null;
        this.currentQuery = null;
        this.currentStickerSet = null;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        Bitmap bitmap = this.blurrBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.blurrBitmap = null;
        }
        this.blurProgress = 0.0f;
        this.menuVisible = false;
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
            }
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        Instance = null;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    private float rubberYPoisition(float f, float f2) {
        return (-((1.0f - (1.0f / (((Math.abs(f) * 0.55f) / f2) + 1.0f))) * f2)) * (f >= 0.0f ? -1.0f : 1.0f);
    }

    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContentPreviewViewer.onDraw(android.graphics.Canvas):void");
    }

    public void lambda$onDraw$14() {
        this.centerImage.setImageBitmap((Bitmap) null);
        PaintingOverlay paintingOverlay = this.paintingOverlay;
        if (paintingOverlay != null) {
            paintingOverlay.reset();
            this.containerView.removeView(this.paintingOverlay);
            this.paintingOverlay = null;
        }
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private void prepareBlurBitmap() {
        if (this.parentActivity == null || this.preparingBitmap) {
            return;
        }
        this.preparingBitmap = true;
        this.centerImage.setVisible(false, false);
        ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$prepareBlurBitmap$15((Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public void lambda$prepareBlurBitmap$15(Bitmap bitmap, Bitmap bitmap2) {
        this.centerImage.setVisible(true, false);
        this.blurrBitmap = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        this.paint.setFilterBitmap(true);
        this.paint.setShader(bitmapShader);
        this.scrimBlur3SourceBitmap.setBitmap(bitmap2);
        Blur3Utils.checkBitmapSourceMatrixScale(this.scrimBlur3SourceBitmap, this.windowView);
        this.scrimBlur3Factory.invalidateAllLinkedViews();
        this.preparingBitmap = false;
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null) {
            frameLayoutDrawer.invalidate();
        }
    }

    public boolean showMenuFor(View view) {
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
        open(sticker, stickerPath, strFindAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, 0, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), this.resourcesProvider);
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        AndroidUtilities.runOnUIThread(this.showSheetRunnable, 16L);
        stickerEmojiCell.setScaled(true);
        return true;
    }

    public void showCustomStickerActions(String str, VideoEditedInfo videoEditedInfo, View view, ArrayList arrayList, ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        Activity activityFindActivity = AndroidUtilities.findActivity(view.getContext());
        if (activityFindActivity == null) {
            return;
        }
        setParentActivity(activityFindActivity);
        setDelegate(contentPreviewViewerDelegate);
        SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
        importingSticker.path = str;
        importingSticker.videoEditedInfo = videoEditedInfo;
        this.selectedEmojis = arrayList;
        open(null, importingSticker, null, null, null, 3, false, null, new DarkThemeResourceProvider());
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        AndroidUtilities.runOnUIThread(this.showSheetRunnable, 16L);
    }

    private void getMyStickersRemote(final TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers, final List list) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMyStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getMyStickersRemote$17(list, tL_messages_getMyStickers, tLObject, tL_error);
            }
        });
    }

    public void lambda$getMyStickersRemote$17(final List list, final TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getMyStickersRemote$16(tL_error, tLObject, list, tL_messages_getMyStickers);
            }
        });
    }

    public void lambda$getMyStickersRemote$16(TLRPC.TL_error tL_error, TLObject tLObject, List list, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_myStickers)) {
            TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject;
            Iterator<TLRPC.StickerSetCovered> it = tL_messages_myStickers.sets.iterator();
            while (it.hasNext()) {
                TLRPC.StickerSetCovered next = it.next();
                TLRPC.StickerSet stickerSet = next.set;
                if (!stickerSet.emojis && !stickerSet.masks) {
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = next.set.id;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetID, true);
                    if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                        list.add(next);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_myStickers.sets;
                tL_messages_getMyStickers.offset_id = arrayList.get(arrayList.size() - 1).set.id;
                getMyStickersRemote(tL_messages_getMyStickers, list);
            }
        }
    }

    public RecyclerListView createMyStickerPacksListView() {
        if (this.parentActivity == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new TLRPC.TL_stickerSetNoCovered());
        TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
        tL_messages_getMyStickers.limit = 100;
        getMyStickersRemote(tL_messages_getMyStickers, arrayList);
        RecyclerListView recyclerListView = new RecyclerListView(this.parentActivity) {
            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i2);
                int iDp = AndroidUtilities.dp(4.0f) + (AndroidUtilities.dp(50.0f) * getAdapter().getItemCount());
                if (iDp <= size) {
                    size = iDp;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        };
        recyclerListView.setLayoutManager(new LinearLayoutManager(this.parentActivity));
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (recyclerView.getChildAdapterPosition(view) == arrayList.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                }
            }
        });
        recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                StickerPackNameView stickerPackNameView = new StickerPackNameView(viewGroup.getContext(), ContentPreviewViewer.this.resourcesProvider);
                stickerPackNameView.setLayoutParams(new RecyclerView.LayoutParams(-2, AndroidUtilities.dp(48.0f)));
                return new RecyclerListView.Holder(stickerPackNameView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ((StickerPackNameView) viewHolder.itemView).bind((TLRPC.StickerSetCovered) arrayList.get(i));
            }

            @Override
            public int getItemCount() {
                return arrayList.size();
            }
        });
        return recyclerListView;
    }

    private static class StickerPackNameView extends LinearLayout {
        private TLRPC.StickerSetCovered cover;
        private final BackupImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SimpleTextView textView;

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

        public TLRPC.StickerSetCovered getCover() {
            return this.cover;
        }

        public void bind(TLRPC.StickerSetCovered stickerSetCovered) {
            this.cover = stickerSetCovered;
            if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                this.textView.setText(LocaleController.getString(R.string.NewStickerPack));
                this.imageView.setImageResource(R.drawable.msg_addbot);
                return;
            }
            this.textView.setText(stickerSetCovered.set.title);
            TLRPC.Document document = stickerSetCovered.cover;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, Theme.key_windowBackgroundGray, 1.0f, 1.0f, this.resourcesProvider);
                if (svgThumb == null) {
                    this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), (String) null, "webp", (Drawable) null, stickerSetCovered);
                    return;
                } else if (closestPhotoSizeWithSize != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), (String) null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(stickerSetCovered.cover), (String) null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            this.imageView.setImage((ImageLocation) null, (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) 0);
        }
    }

    public void dismissPopupWindow() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.popupWindow = null;
            return;
        }
        View view = this.popupLayout;
        if (view != null) {
            view.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
            this.popupLayout = null;
            this.menuVisible = false;
            if (this.closeOnDismiss) {
                close();
            }
        }
    }
}
